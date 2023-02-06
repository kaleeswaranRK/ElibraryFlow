package connectivity.db.operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariableField;
import com.avaya.sce.runtimecommon.SCESession;

import flow.IProjectVariables;

public class DBCBConnect {

	public BasicDataSource DBConnect(SCESession mysession) {
		BasicDataSource dataSource = new BasicDataSource();
		FileInputStream fout = null;
		try {
			fout = new FileInputStream(new File("F:\\ELibrary\\propertyFiles\\prop.properties"));
			Properties p = new Properties();
			p.load(fout);
			String connectionUrl = p.getProperty("connectionUrl");
			String username = p.getProperty("username");
			String password = p.getProperty("password");
			String driverjdbc = p.getProperty("driverjdbc");
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "connectionUrl = " + connectionUrl + ",username = " + username
					+ ",password = " + password + ",driverjdbc = " + driverjdbc, mysession);
			Class.forName(driverjdbc);
			dataSource.setUrl(connectionUrl);
			dataSource.setUsername(username);
			dataSource.setPassword(password);
			dataSource.setMinIdle(5);
			dataSource.setMaxIdle(10);
			dataSource.setMaxTotal(25);
		} catch (ClassNotFoundException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mysession);
		} catch (FileNotFoundException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mysession);
		} catch (IOException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mysession);
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mysession);
			}
		}
		return dataSource;
	}

	public boolean executeQuery(String query, SCESession mysession) {
		try {
			IVariableField DBcon = mysession.getVariableField(IProjectVariables.E_LIBRARY,
					IProjectVariables.E_LIBRARY_FIELD_DATASOURCE);
			BasicDataSource data = (BasicDataSource) DBcon.getObjectValue();
			Connection con = data.getConnection();
			Statement createStatement = con.createStatement();
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "createStatement" +createStatement, mysession);
			ResultSet result = createStatement.executeQuery(query);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "ResultSet = " +result, mysession);
			boolean execute=false;
			if (result.next()) {
				execute = true;
			} else {
				execute = false;
			}
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "SQL result" + execute, mysession);
			return execute;	
		} catch (SQLException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mysession);
		}
		catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mysession);
		}
		return false;
		
	}

}
