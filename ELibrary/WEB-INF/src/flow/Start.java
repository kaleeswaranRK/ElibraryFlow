package flow;

/**
 * This is a special reserved class that is repsonsible for loading application 
 * variables as well as the forward to the actual first form of the application.<br>
 * This class should not be manually edited as changes may be overridden by the 
 * code generator.<br>
 * Last generated by Orchestration Designer at: 2022-DEC-07  11:09:32 AM
 */
public class Start extends com.avaya.sce.runtime.Entry {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2022-DEC-07  11:09:32 AM
	 */
	public Start() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * This method is generated automatically.  Any changes may be overwritten.
	 * Returns the submit object that will redirect application flow to the first
	 * form in the application.  This also adds various standard variables to the
	 * list of data to be submitted to the runtime variable table.
	 * Last generated by Orchestration Designer at: 2022-DEC-13  11:21:51 AM
	 * @return the Submit object that contains the standard variables and the first form
	 */
	public com.avaya.sce.runtime.Submit getSubmit(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Submit submit = new com.avaya.sce.runtime.Submit("Welcome");
		return ( submit );
	}
	/**
	 * This method initializes the SCE session with the variables that
	 * are defined in the application.<BR>
	 * 
	 * This method is generated automatically and should not be manually
	 * edited because changes may be overwritten by future code 
	 * generation.
	 * Last generated by Orchestration Designer at: 2022-DEC-13  11:21:51 AM
	 */
	public void initializeVariables(com.avaya.sce.runtimecommon.SCESession session) {
		com.avaya.sce.runtimecommon.IVariable variable = null;
		String[] variableFields = null;

		variableFields = new String[] {
			IProjectVariables.PASSWORD_FIELD_CONFIDENCE,
			IProjectVariables.PASSWORD_FIELD_INPUTMODE,
			IProjectVariables.PASSWORD_FIELD_INTERPRETATION,
			IProjectVariables.PASSWORD_FIELD_NOINPUTCOUNT,
			IProjectVariables.PASSWORD_FIELD_NOMATCHCOUNT,
			IProjectVariables.PASSWORD_FIELD_UTTERANCE,
			IProjectVariables.PASSWORD_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.PASSWORD, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.OLDUSER_RETURN_FIELD_CONFIDENCE,
			IProjectVariables.OLDUSER_RETURN_FIELD_INPUTMODE,
			IProjectVariables.OLDUSER_RETURN_FIELD_INTERPRETATION,
			IProjectVariables.OLDUSER_RETURN_FIELD_NOINPUTCOUNT,
			IProjectVariables.OLDUSER_RETURN_FIELD_NOMATCHCOUNT,
			IProjectVariables.OLDUSER_RETURN_FIELD_UTTERANCE,
			IProjectVariables.OLDUSER_RETURN_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.OLDUSER_RETURN, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.REDIRECTINFO_FIELD_PRESENTATIONINFO,
			IProjectVariables.REDIRECTINFO_FIELD_REASON,
			IProjectVariables.REDIRECTINFO_FIELD_SCREENINGINFO,
			IProjectVariables.REDIRECTINFO_FIELD_URI };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.REDIRECTINFO, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.BOOKSELECTION_RETURN_FIELD_CONFIDENCE,
			IProjectVariables.BOOKSELECTION_RETURN_FIELD_INPUTMODE,
			IProjectVariables.BOOKSELECTION_RETURN_FIELD_INTERPRETATION,
			IProjectVariables.BOOKSELECTION_RETURN_FIELD_NOINPUTCOUNT,
			IProjectVariables.BOOKSELECTION_RETURN_FIELD_NOMATCHCOUNT,
			IProjectVariables.BOOKSELECTION_RETURN_FIELD_UTTERANCE,
			IProjectVariables.BOOKSELECTION_RETURN_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.BOOKSELECTION_RETURN, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.SELECT_BOOK_RETURN_FIELD_CONFIDENCE,
			IProjectVariables.SELECT_BOOK_RETURN_FIELD_INPUTMODE,
			IProjectVariables.SELECT_BOOK_RETURN_FIELD_INTERPRETATION,
			IProjectVariables.SELECT_BOOK_RETURN_FIELD_NOINPUTCOUNT,
			IProjectVariables.SELECT_BOOK_RETURN_FIELD_NOMATCHCOUNT,
			IProjectVariables.SELECT_BOOK_RETURN_FIELD_UTTERANCE,
			IProjectVariables.SELECT_BOOK_RETURN_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.SELECT_BOOK_RETURN, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.E_LIBRARY_FIELD_FOUR,
			IProjectVariables.E_LIBRARY_FIELD_ONE,
			IProjectVariables.E_LIBRARY_FIELD_PASSWORD,
			IProjectVariables.E_LIBRARY_FIELD_PASSWORD_EVENT,
			IProjectVariables.E_LIBRARY_FIELD_THREE,
			IProjectVariables.E_LIBRARY_FIELD_TWO,
			IProjectVariables.E_LIBRARY_FIELD_USER,
			IProjectVariables.E_LIBRARY_FIELD_USER_EVENT,
			IProjectVariables.E_LIBRARY_FIELD_WELCOMEJOIN };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.E_LIBRARY, variableFields, new String[] {"4", "1", "1234", "0", "3", "2", "123456", "0", "We are happy to help you"}, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.NEW_USER_RETURN_FIELD_CONFIDENCE,
			IProjectVariables.NEW_USER_RETURN_FIELD_INPUTMODE,
			IProjectVariables.NEW_USER_RETURN_FIELD_INTERPRETATION,
			IProjectVariables.NEW_USER_RETURN_FIELD_NOINPUTCOUNT,
			IProjectVariables.NEW_USER_RETURN_FIELD_NOMATCHCOUNT,
			IProjectVariables.NEW_USER_RETURN_FIELD_UTTERANCE,
			IProjectVariables.NEW_USER_RETURN_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.NEW_USER_RETURN, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.SELECTION_MENU_FIELD_CONFIDENCE,
			IProjectVariables.SELECTION_MENU_FIELD_INPUTMODE,
			IProjectVariables.SELECTION_MENU_FIELD_INTERPRETATION,
			IProjectVariables.SELECTION_MENU_FIELD_NOINPUTCOUNT,
			IProjectVariables.SELECTION_MENU_FIELD_NOMATCHCOUNT,
			IProjectVariables.SELECTION_MENU_FIELD_UTTERANCE,
			IProjectVariables.SELECTION_MENU_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.SELECTION_MENU, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.DATE_FIELD_AUDIO,
			IProjectVariables.DATE_FIELD_DAYOFMONTH,
			IProjectVariables.DATE_FIELD_DAYOFWEEK,
			IProjectVariables.DATE_FIELD_DAYOFWEEKNUM,
			IProjectVariables.DATE_FIELD_DAYOFYEAR,
			IProjectVariables.DATE_FIELD_MONTH,
			IProjectVariables.DATE_FIELD_MONTHINYEAR,
			IProjectVariables.DATE_FIELD_YEAR };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.DATE, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.AUTHORSELECTION_RETURN_FIELD_CONFIDENCE,
			IProjectVariables.AUTHORSELECTION_RETURN_FIELD_INPUTMODE,
			IProjectVariables.AUTHORSELECTION_RETURN_FIELD_INTERPRETATION,
			IProjectVariables.AUTHORSELECTION_RETURN_FIELD_NOINPUTCOUNT,
			IProjectVariables.AUTHORSELECTION_RETURN_FIELD_NOMATCHCOUNT,
			IProjectVariables.AUTHORSELECTION_RETURN_FIELD_UTTERANCE,
			IProjectVariables.AUTHORSELECTION_RETURN_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.AUTHORSELECTION_RETURN, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.BOOK_MENU_FIELD_CONFIDENCE,
			IProjectVariables.BOOK_MENU_FIELD_INPUTMODE,
			IProjectVariables.BOOK_MENU_FIELD_INTERPRETATION,
			IProjectVariables.BOOK_MENU_FIELD_NOINPUTCOUNT,
			IProjectVariables.BOOK_MENU_FIELD_NOMATCHCOUNT,
			IProjectVariables.BOOK_MENU_FIELD_UTTERANCE,
			IProjectVariables.BOOK_MENU_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.BOOK_MENU, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.LANG_MENU_FIELD_CONFIDENCE,
			IProjectVariables.LANG_MENU_FIELD_INPUTMODE,
			IProjectVariables.LANG_MENU_FIELD_INTERPRETATION,
			IProjectVariables.LANG_MENU_FIELD_NOINPUTCOUNT,
			IProjectVariables.LANG_MENU_FIELD_NOMATCHCOUNT,
			IProjectVariables.LANG_MENU_FIELD_UTTERANCE,
			IProjectVariables.LANG_MENU_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.LANG_MENU, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.LANG_RETURN_FIELD_CONFIDENCE,
			IProjectVariables.LANG_RETURN_FIELD_INPUTMODE,
			IProjectVariables.LANG_RETURN_FIELD_INTERPRETATION,
			IProjectVariables.LANG_RETURN_FIELD_NOINPUTCOUNT,
			IProjectVariables.LANG_RETURN_FIELD_NOMATCHCOUNT,
			IProjectVariables.LANG_RETURN_FIELD_UTTERANCE,
			IProjectVariables.LANG_RETURN_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.LANG_RETURN, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.SESSION_FIELD_AAI,
			IProjectVariables.SESSION_FIELD_ANI,
			IProjectVariables.SESSION_FIELD_CALLTAG,
			IProjectVariables.SESSION_FIELD_CHANNEL,
			IProjectVariables.SESSION_FIELD_CHANNELTYPE,
			IProjectVariables.SESSION_FIELD_CONVERSEFIRST,
			IProjectVariables.SESSION_FIELD_CONVERSESECOND,
			IProjectVariables.SESSION_FIELD_CURRENTLANGUAGE,
			IProjectVariables.SESSION_FIELD_DNIS,
			IProjectVariables.SESSION_FIELD_EXIT_CUSTOMER_ID,
			IProjectVariables.SESSION_FIELD_EXIT_INFO_1,
			IProjectVariables.SESSION_FIELD_EXIT_INFO_2,
			IProjectVariables.SESSION_FIELD_EXIT_PARENT_ID,
			IProjectVariables.SESSION_FIELD_EXIT_PREFERRED_PATH,
			IProjectVariables.SESSION_FIELD_EXIT_REASON,
			IProjectVariables.SESSION_FIELD_EXIT_TOPIC,
			IProjectVariables.SESSION_FIELD_LASTERROR,
			IProjectVariables.SESSION_FIELD_MEDIATYPE,
			IProjectVariables.SESSION_FIELD_PROTOCOLNAME,
			IProjectVariables.SESSION_FIELD_PROTOCOLVERSION,
			IProjectVariables.SESSION_FIELD_SESSIONID,
			IProjectVariables.SESSION_FIELD_SESSIONLABEL,
			IProjectVariables.SESSION_FIELD_SHAREDMODE,
			IProjectVariables.SESSION_FIELD_UCID,
			IProjectVariables.SESSION_FIELD_UUI,
			IProjectVariables.SESSION_FIELD_VIDEOBITRATE,
			IProjectVariables.SESSION_FIELD_VIDEOCODEC,
			IProjectVariables.SESSION_FIELD_VIDEOENABLED,
			IProjectVariables.SESSION_FIELD_VIDEOFARFMTP,
			IProjectVariables.SESSION_FIELD_VIDEOFORMAT,
			IProjectVariables.SESSION_FIELD_VIDEOFPS,
			IProjectVariables.SESSION_FIELD_VIDEOHEIGHT,
			IProjectVariables.SESSION_FIELD_VIDEONEARFMTP,
			IProjectVariables.SESSION_FIELD_VIDEOWIDTH,
			IProjectVariables.SESSION_FIELD_VPCALLEDEXTENSION,
			IProjectVariables.SESSION_FIELD_VPCONVERSEONDATA,
			IProjectVariables.SESSION_FIELD_VPCOVERAGEREASON,
			IProjectVariables.SESSION_FIELD_VPCOVERAGETYPE,
			IProjectVariables.SESSION_FIELD_VPRDNIS,
			IProjectVariables.SESSION_FIELD_VPREPORTURL };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.SESSION, variableFields, null, session, false, true );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.USER_MENU_FIELD_CONFIDENCE,
			IProjectVariables.USER_MENU_FIELD_INPUTMODE,
			IProjectVariables.USER_MENU_FIELD_INTERPRETATION,
			IProjectVariables.USER_MENU_FIELD_NOINPUTCOUNT,
			IProjectVariables.USER_MENU_FIELD_NOMATCHCOUNT,
			IProjectVariables.USER_MENU_FIELD_UTTERANCE,
			IProjectVariables.USER_MENU_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.USER_MENU, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_ERRORCODE,
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_MESSAGE,
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_OBJECT,
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_STACKTRACE,
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_TYPE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.DD_LAST_EXCEPTION, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.SELECT_AUTHOR_RETURN_FIELD_CONFIDENCE,
			IProjectVariables.SELECT_AUTHOR_RETURN_FIELD_INPUTMODE,
			IProjectVariables.SELECT_AUTHOR_RETURN_FIELD_INTERPRETATION,
			IProjectVariables.SELECT_AUTHOR_RETURN_FIELD_NOINPUTCOUNT,
			IProjectVariables.SELECT_AUTHOR_RETURN_FIELD_NOMATCHCOUNT,
			IProjectVariables.SELECT_AUTHOR_RETURN_FIELD_UTTERANCE,
			IProjectVariables.SELECT_AUTHOR_RETURN_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.SELECT_AUTHOR_RETURN, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.USER_NAME_FIELD_CONFIDENCE,
			IProjectVariables.USER_NAME_FIELD_INPUTMODE,
			IProjectVariables.USER_NAME_FIELD_INTERPRETATION,
			IProjectVariables.USER_NAME_FIELD_NOINPUTCOUNT,
			IProjectVariables.USER_NAME_FIELD_NOMATCHCOUNT,
			IProjectVariables.USER_NAME_FIELD_UTTERANCE,
			IProjectVariables.USER_NAME_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.USER_NAME, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.AUTHOR_MENU_FIELD_CONFIDENCE,
			IProjectVariables.AUTHOR_MENU_FIELD_INPUTMODE,
			IProjectVariables.AUTHOR_MENU_FIELD_INTERPRETATION,
			IProjectVariables.AUTHOR_MENU_FIELD_NOINPUTCOUNT,
			IProjectVariables.AUTHOR_MENU_FIELD_NOMATCHCOUNT,
			IProjectVariables.AUTHOR_MENU_FIELD_UTTERANCE,
			IProjectVariables.AUTHOR_MENU_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.AUTHOR_MENU, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.TIME_FIELD_AUDIO,
			IProjectVariables.TIME_FIELD_HOUR,
			IProjectVariables.TIME_FIELD_MILLISECOND,
			IProjectVariables.TIME_FIELD_MINUTE,
			IProjectVariables.TIME_FIELD_SECOND,
			IProjectVariables.TIME_FIELD_TIMEZONE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.TIME, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.SHAREDUUI_FIELD_ID,
			IProjectVariables.SHAREDUUI_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.SHAREDUUI, variableFields, null, session, false, false );
		session.putVariable(variable);
	}
	/**
	 * This method returns the name of the application.
	 * Last generated by Orchestration Designer at: 2022-DEC-13  11:21:51 AM
	 */
	public String getEntryName() {
		return("ELibrary");
	}
	/**
	 * This method returns a list of life cycle classes for Pluggable Connectors.
	 * Last generated by Orchestration Designer at: 2022-DEC-13  11:21:51 AM
	 */
	public java.util.Collection getPluggableLifeCycle() {
		java.util.ArrayList result = new java.util.ArrayList();
		return(result);
	}
	/**
	 * This method returns a list of VXML contributor classes for Pluggable Connectors.
	 * Last generated by Orchestration Designer at: 2022-DEC-13  11:21:51 AM
	 */
	public java.util.Collection getPluggableVXMLContrib() {
		java.util.ArrayList result = new java.util.ArrayList();
		return(result);
	}
	/**
	 * This method returns the root document for the application.
	 * This method is generated automatically and should not be modified
	 * because changes may be overwritten by future code generation.
	 * Last generated by Orchestration Designer at: 2022-DEC-13  11:21:51 AM
	 */
	public String getRootDoc() {
		return("AppRoot");
	}
	/**
	 * This method returns a boolean to indicate if the approot node has a web page to show.
	 * This method is generated automatically and should not be modified
	 * because changes may be overwritten by future code generation.
	 * Last generated by Orchestration Designer at: 2022-DEC-13  11:21:51 AM
	 */
	public boolean hasWebPage(com.avaya.sce.runtimecommon.SCESession mySession) {
		return false;
	}
	/**
	 * Builds the list of input parameters that are defined for this application 
	 * entry.  This list is built automatically by adding Input Parameter
	 * nodes to AppRoot in the call flow editor.<BR>
	 *
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.
	 *
	 * @return a Collection of <code>java.lang.String</code> objects that
	 * are the names of parameters the application is expecting.
	 * If the AppRoot node does not have any input parameters, then 
	 * this returns an empty list
	 * Last generated by Orchestration Designer at: 2022-DEC-13  11:21:51 AM
	 */
	public java.util.Collection getInputParams(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		list = new java.util.ArrayList();

		return list;
	}
	/**
	 * Builds the list of capture expression that are defined for this application 
	 * entry.  This list is built automatically by adding Capture Expression
	 * items to AppRoot in the call flow editor.<BR>
	 *
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.
	 *
	 * @return a Collection of <code>CaptureExpression</code> objects that
	 * specify the ECMA script expression and the Orchestration Designer 
	 * session variable that will store the captured result.
	 * If the AppRoot node does not have any capture expression items, then 
	 * this returns an empty list
	 * Last generated by Orchestration Designer at: 2022-DEC-13  11:21:51 AM
	 */
	public java.util.Collection getCaptureExpressions(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		list = new java.util.ArrayList();

		return list;
	}
}
