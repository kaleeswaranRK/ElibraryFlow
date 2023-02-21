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

import flow.IProjectVariables;

public class DBCBConnect<SCESession> {

	public BasicDataSource DBConnect(com.avaya.sce.runtimecommon.SCESession mySession) {
		BasicDataSource dataSource = new BasicDataSource();
		FileInputStream fout = null;
		try {
			fout = new FileInputStream(new File("D:\\New folder\\Kaleeswaran\\property files\\prop.properties"));
			Properties p = new Properties();
			p.load(fout);
			String connectionUrl = p.getProperty("connectionUrl");
			String username = p.getProperty("username");
			String password = p.getProperty("password");
			String driverjdbc = p.getProperty("driverjdbc");
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "connectionUrl = " + connectionUrl + ",username = " + username
					+ ",password = " + password + ",driverjdbc = " + driverjdbc, mySession);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "property file readed successfully", mySession);
			Class.forName(driverjdbc);
			dataSource.setUrl(connectionUrl);
			dataSource.setUsername(username);
			dataSource.setPassword(password);
			dataSource.setMinIdle(5);
			dataSource.setMaxIdle(10);
			dataSource.setMaxTotal(25);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "data source assigned successfully", mySession);
			return dataSource;
		} catch (ClassNotFoundException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);
		} catch (FileNotFoundException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);
		} catch (IOException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);
			}
		}
		return dataSource;
		
	}

}
