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
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "DB Connection method entry", mySession);
		FileInputStream fout = null;
		Connection con = null;
		try {

			fout = new FileInputStream(
					new File("C:\\Users\\User\\Desktop\\Kaleeswaran\\property files\\prop.properties"));
			Properties p = new Properties();
			p.load(fout);
			String connectionUrl = p.getProperty("connection");
			String username = p.getProperty("username");
			String password = p.getProperty("password");
			String query = p.getProperty("query");
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Connection url = " + connectionUrl + " Username = " + username
					+ " Password = " + password + " Query = " + query, mySession);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "DB Connection property complete", mySession);
			IVariableField DBcon = mySession.getVariableField(IProjectVariables.E_LIBRARY,
					IProjectVariables.E_LIBRARY_FIELD_DBVARIABLE);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "DBcon = " + (Connection) DBcon.getObjectValue(), mySession);
			con = (Connection) DBcon.getObjectValue();
			if (con == null) {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con = DriverManager.getConnection(connectionUrl, username, password);
			} else {

				if (con.isClosed()) {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con = DriverManager.getConnection(connectionUrl, username, password);
				} else {
					TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "DB Connection object has problem", mySession);
				}
			}
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "DB Connection method exit", mySession);
			return con;
		} catch (IOException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);
		} catch (ClassNotFoundException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);
		} catch (SQLException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);
		} catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e.getLocalizedMessage(), mySession);

			}
		}
		return null;
		
	}
}
