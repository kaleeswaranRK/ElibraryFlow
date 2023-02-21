package flow.subflow.ExistUser;

import java.util.LinkedList;
import java.util.List;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariableField;
import com.avaya.sce.runtimecommon.SCESession;

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
 * Orchestration Designer at: 2023-JAN-03 05:45:51 PM
 */
public class bookAddData extends com.avaya.sce.runtime.Data {

	// {{START:CLASS:FIELDS
	// }}END:CLASS:FIELDS

	/**
	 * Default constructor Last generated by Orchestration Designer at: 2023-JAN-03
	 * 05:45:51 PM
	 */
	public bookAddData() {
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
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("ExistUser-BookAddedAnnouncement", "Default");
		next.setDebugId(1015);
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
			super.requestBegin(mySession);
			
			mySession.getVariableField(IProjectVariables.DATA_ELIBRARY,
					IProjectVariables.DATA_ELIBRARY_FIELD_EXIT_LOCATION).setValue("book add data node");
			int booksMenuValue = mySession.getVariableField(IProjectVariables.BOOK_SELECTION_MENU,
					IProjectVariables.BOOK_SELECTION_MENU_FIELD_VALUE).getIntValue();
			int PageNumber = mySession
					.getVariableField(IProjectVariables.MENU_COMMON, IProjectVariables.MENU_COMMON_FIELD_MENU_PAGE)
					.getIntValue();
			IVariableField booksList = mySession.getVariableField(IProjectVariables.MENU_COMMON,
					IProjectVariables.MENU_COMMON_FIELD_BOOK_MENU_LIST);
			List<String> priceList = (LinkedList<String>) mySession
					.getVariableField(IProjectVariables.MENU_COMMON, IProjectVariables.MENU_COMMON_FIELD_PRICE_LIST)
					.getObjectValue();
			List<String> quantityList = (LinkedList<String>) mySession
					.getVariableField(IProjectVariables.MENU_COMMON, IProjectVariables.MENU_COMMON_FIELD_QUANTITY_LIST)
					.getObjectValue();
			int userId = mySession.getVariableField(IProjectVariables.USER_ID, IProjectVariables.USER_ID_FIELD_VALUE)
					.getIntValue();
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO,
					"bookMenuValue : " + booksMenuValue + "bookMenuPageNumber : " + PageNumber, mySession);
			List<String> objectValue = (LinkedList<String>) booksList.getObjectValue();
			mySession.getVariableField(IProjectVariables.MENU_COMMON, IProjectVariables.MENU_COMMON_FIELD_CATEGORY_NAME)
					.setValue(objectValue.get(((PageNumber * 6) + booksMenuValue) - 1));
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO,
					objectValue.get(((PageNumber * 6) + booksMenuValue) - 1) + "price : "
							+ priceList.get(((PageNumber * 6) + booksMenuValue) - 1) + "quantity : "
							+ quantityList.get(((PageNumber * 6) + booksMenuValue) - 1),
					mySession);
			IntegrationClass apiIntegration = new IntegrationClass();
			String json = "{" + "  \"book\":\"" + objectValue.get(((PageNumber * 6) + booksMenuValue) - 1) + "\","
					+ "   \"price\": \"" + priceList.get(((PageNumber * 6) + booksMenuValue) - 1) + "\","
					+ "   \"quantity\": \"" + 1 + "\"," + "   \"user\" : \"" + userId + "\" " + "}";
			String apiPost = apiIntegration.apiPost("http://172.16.11.43:8082/cart/addtocart", json,mySession);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Post Return " + apiPost, mySession);
			if (apiPost==null) {
				mySession.getVariableField(IProjectVariables.MENU_COMMON,
						IProjectVariables.MENU_COMMON_FIELD_API_POST).setValue(1);	
			}
			else {
				mySession.getVariableField(IProjectVariables.MENU_COMMON,
						IProjectVariables.MENU_COMMON_FIELD_API_POST).setValue(0);	
			}
				
		} catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
		}

	}
}
