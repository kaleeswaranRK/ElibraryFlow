package connectivity.db.operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariableField;
import com.avaya.sce.runtimecommon.SCESession;

import flow.IProjectVariables;

public class DBConnectClass {
	public Connection DBconnection(SCESession mySession) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "DB Connection method entry", mySession);
		FileInputStream fout = null;
		Connection con = null;
		try {

			fout = new FileInputStream(
					new File("C:\\Users\\User\\Desktop\\Kaleeswaran\\property files\\prop.properties"));
			Properties p = new Properties();
			p.load(fout);
			String connection = p.getProperty("connection");
			String username = p.getProperty("username");
			String password = p.getProperty("password");
			String query = p.getProperty("query");
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Connection url = " + connection + " Username = " + username
					+ " Password = " + password + " Query = " + query, mySession);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "DB Connection property complete", mySession);
			IVariableField DBcon = mySession.getVariableField(IProjectVariables.E_LIBRARY,
					IProjectVariables.E_LIBRARY_FIELD_DBVARIABLE);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "DBcon = " + (Connection) DBcon.getObjectValue(), mySession);
			con = (Connection) DBcon.getObjectValue();
			if (con == null) {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con = DriverManager.getConnection(connection, username, password);
			} else {

				if (con.isClosed()) {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con = DriverManager.getConnection(connection, username, password);
				} else {
					TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "DB Connection object has problem", mySession);
				}
			}
		} catch (IOException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
		} catch (ClassNotFoundException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
		} catch (SQLException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
		} catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
			}
		}
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "DB Connection method exit", mySession);
		return con;
	}
}
