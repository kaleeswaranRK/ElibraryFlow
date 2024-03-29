package flow.subflow.ExistUser;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariableField;
import com.avaya.sce.runtimecommon.SCESession;

import connectivity.ws.operations.HashingClass;
import connectivity.ws.operations.IntegrationClass;
import flow.IProjectVariables;

/**
 * The Data class handles many types of server-side operations including data
 * collection (from a data sources such as a database, or web service), variable
 * assignments and operations (like copying variable values, performing
 * mathematic operations, and collection iteration), conditional evaluation to
 * control callflow execution based on variable values, and logging/tracing
 * statements.
 * 
 * Items created in the getDataActions() method are executed/evaluated in order
 * and if a condional branch condition evaluates to "true" then the branch is
 * activated and the execution of data actions is halted. If no "true"
 * conditions are encountered, then all data actions will be executed/evaluated
 * and the application will proceed to the "Default" servlet. Last generated by
 * Orchestration Designer at: 2022-DEC-27 06:00:15 PM
 */
public class passwordVerify extends com.avaya.sce.runtime.Data {

	// {{START:CLASS:FIELDS
	// }}END:CLASS:FIELDS

	/**
	 * Default constructor Last generated by Orchestration Designer at: 2022-DEC-27
	 * 06:00:15 PM
	 */
	public passwordVerify() {
		// {{START:CLASS:CONSTRUCTOR
		super();
		// }}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2023-FEB-17  02:27:32 PM
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
	 * Last generated by Orchestration Designer at: 2023-FEB-17  02:27:32 PM
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
	 * Last generated by Orchestration Designer at: 2023-FEB-17  02:27:32 PM
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
		try {
			mySession.getVariableField(IProjectVariables.DATA_ELIBRARY,
					IProjectVariables.DATA_ELIBRARY_FIELD_EXIT_LOCATION).setValue("password verify data node");
			IVariableField userId = mySession.getVariableField(IProjectVariables.USER_ID,
					IProjectVariables.USER_ID_FIELD_VALUE);
			IVariableField userpass = mySession.getVariableField(IProjectVariables.PASSWORD,
					IProjectVariables.PASSWORD_FIELD_VALUE);

			IntegrationClass integration = new IntegrationClass();
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "http://172.16.11.43:8082/user/verify/" + userId.getIntValue(), mySession);
			String apiGet = integration.apiGetPassword("http://172.16.11.43:8082/user/verify/" + userId.getIntValue(),mySession);
			if (apiGet!=null&&apiGet.equalsIgnoreCase("APIERROR")) {
				mySession.getVariableField(IProjectVariables.E_LIBRARY,
						IProjectVariables.E_LIBRARY_FIELD_USER_DETAILSCHECK).setValue(1);
			}
			else if (apiGet!=null&&apiGet.equalsIgnoreCase("BADREQUEST")) {
				mySession.getVariableField(IProjectVariables.E_LIBRARY,
						IProjectVariables.E_LIBRARY_FIELD_USER_DETAILSCHECK).setValue(2);
			}
			else {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, apiGet, mySession);
			IVariableField passCheck = mySession.getVariableField(IProjectVariables.E_LIBRARY,
					IProjectVariables.E_LIBRARY_FIELD_PASSCHECK);
			String sha256 = HashingClass.getSha256(userpass.getStringValue(), mySession);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, sha256, mySession);
			if (sha256.equalsIgnoreCase(apiGet)) {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "password verify true", mySession);
				passCheck.setValue(1);
			} else {
				passCheck.setValue(0);
			}
			}
		} catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
		}

	}
}
