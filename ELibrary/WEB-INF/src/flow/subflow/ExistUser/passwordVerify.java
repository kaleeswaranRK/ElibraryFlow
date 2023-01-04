package flow.subflow.ExistUser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariableField;
import com.avaya.sce.runtimecommon.SCESession;

import connectivity.db.operations.DBConnectClass;
import flow.AppRoot;
import flow.IProjectVariables;

/**
 * The Data class handles many types of server-side operations including data
 * collection (from a data sources such as a database, or web service), variable
 * assignments and operations (like copying variable values, performing mathematic
 * operations, and collection iteration), conditional evaluation to control callflow
 * execution based on variable values, and logging/tracing statements.
 * 
 * Items created in the getDataActions() method are executed/evaluated in order
 * and if a condional branch condition evaluates to "true" then the branch is
 * activated and the execution of data actions is halted.  If no "true" conditions
 * are encountered, then all data actions will be executed/evaluated and the 
 * application will proceed to the "Default" servlet.
 * Last generated by Orchestration Designer at: 2022-DEC-27  06:00:15 PM
 */
public class passwordVerify extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2022-DEC-27  06:00:15 PM
	 */
	public passwordVerify() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2023-JAN-03  02:46:36 PM
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("ExistUser-passCheck", "Default");
		next.setDebugId(900);
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2023-JAN-03  02:46:36 PM
	 */
	public java.util.Collection<VariableInfo> getLocalVariables(){
		java.util.Collection<VariableInfo> variables = new java.util.ArrayList<VariableInfo>();

		return variables;
	}
	/**
	 * Creates and conditionally executes operations that have been configured
	 * in the Callflow.  This method will build a collection of operations and
	 * have the framework execute the operations by calling evaluateActions().
	 * If the evaluation causes the framework to forward to a different servlet
	 * then execution stops.
	 * Returning true from this method means that the framework has forwarded the
	 * request to a different servlet.  Returning false means that the default
	 * Next will be invoked.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2023-JAN-03  02:46:36 PM
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(1);
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
	@Override
	public void requestBegin(SCESession mySession) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Req begin Entry", mySession);
		FileInputStream fout = null;
		DBConnectClass app = new DBConnectClass();
		Connection con = null;
		PreparedStatement preparedStmt = null;
		ResultSet userVerify=null;
		try {
			fout = new FileInputStream(
					new File("C:\\Users\\User\\Desktop\\Kaleeswaran\\property files\\prop.properties"));
			Properties p = new Properties();
			p.load(fout);
			String connection = p.getProperty("connection");
			String username = p.getProperty("username");
			String password = p.getProperty("password");
			String driver = p.getProperty("driverjdbc");
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Return to Req begin", mySession);
			IVariableField DBcon = mySession.getVariableField(IProjectVariables.E_LIBRARY,
					IProjectVariables.E_LIBRARY_FIELD_DBVARIABLE);
			IVariableField userpass = mySession.getVariableField(IProjectVariables.PASSWORD,
					IProjectVariables.PASSWORD_FIELD_VALUE);
			IVariableField userId = mySession.getVariableField(IProjectVariables.USER_ID,
					IProjectVariables.USER_ID_FIELD_VALUE);
//			Class.forName(driver);
//			con = DriverManager.getConnection(connection, username, password);
//			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "DB variable con assigned", mySession);
//			DBcon.setValue(con);
			con=app.DBconnection(mySession);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "con is assigned to DBcon", mySession);
			preparedStmt = con.prepareStatement("EXEC KALEESWARAN_FIND_PASSWORD @id='"+userId.getStringValue()+"',@pass='"+userpass.getStringValue()+"';");
			userVerify = preparedStmt.executeQuery();
			IVariableField passCheck = mySession.getVariableField(IProjectVariables.E_LIBRARY,
					IProjectVariables.E_LIBRARY_FIELD_PASSCHECK);
			if (userVerify.next()) {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR,"password verify true", mySession);
				passCheck.setValue(1);
				try {
					executeDataActions(mySession);
				} catch (Exception e) {
					TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR,e, mySession);
				}
			} 
			else {
				passCheck.setValue(0);
			}
			
		} catch (SQLException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
		} catch (IOException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
		}
		catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
		} 
		finally {
			try {
				userVerify.close();
			} catch (SQLException e) {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
			}
			try {
				preparedStmt.close();
			} catch (SQLException e) {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
			}
			
			try {
				con.close();
			} catch (SQLException e) {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
			}
			
			try {
				fout.close();
			} catch (IOException e) {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
			}
		}
	}
}
