package flow;

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

/**
 * This is the root document for the application. It defines the links and
 * grammars that are "global" for the application.<br>
 * Last generated by Orchestration Designer at: 2022-DEC-07 11:09:32 AM
 */
public class AppRoot extends com.avaya.sce.runtime.Root {
	public Connection DBconnection(SCESession mySession) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "DB Connection entry", mySession);
		FileInputStream fout = null;
		Connection con=null;
		try {
			
			fout = new FileInputStream(
					new File("C:\\Users\\User\\Desktop\\Kaleeswaran\\property files\\prop.properties"));
			Properties p = new Properties();
			p.load(fout);
			String connection = p.getProperty("connection");
			String username = p.getProperty("username");
			String password = p.getProperty("password");
			String query = p.getProperty("query");
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "DB Connection property complete", mySession);
			IVariableField DBcon = mySession.getVariableField(IProjectVariables.E_LIBRARY,
					IProjectVariables.E_LIBRARY_FIELD_DBVARIABLE);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "DBcon = "+(Connection)DBcon.getObjectValue(), mySession);
			if ( (Connection)DBcon.getObjectValue() == null ) {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con = DriverManager.getConnection(connection, username, password);
			}
			else {
				 con=(Connection) DBcon.getObjectValue();
				if (con.isClosed()) {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con = DriverManager.getConnection(connection, username, password);
				}
				else {
					TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "DB Connection object not set", mySession);
				}
			}
		} catch (IOException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
		} catch (ClassNotFoundException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
		} catch (SQLException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
		}
		return con;
	}

	// {{START:CLASS:FIELDS
	// }}END:CLASS:FIELDS

	/**
	 * Default constructor Last generated by Orchestration Designer at: 2022-DEC-07
	 * 11:09:32 AM
	 */
	public AppRoot() {
		// {{START:CLASS:CONSTRUCTOR
		super();
		// }}END:CLASS:CONSTRUCTOR
	}

	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the links for the node, override:
	 *     void updateLinks(Collection links, SCESession mySession)
	 * Last generated by Orchestration Designer at: 2022-DEC-28  11:41:46 AM
	 * @return a collection of links
	 */
	public java.util.Collection getLinks(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Link link;
		java.util.List list;
		java.util.Collection grammarInfo = null;
		java.util.Collection<com.avaya.sce.runtime.CaptureExpression> captureExpr = null;
		list = new java.util.ArrayList(2);
		String ___tempGrammarName = null;

		// build the list of grammar information objects for the link
		grammarInfo = new java.util.ArrayList();

		captureExpr = null;

		link = new com.avaya.sce.runtime.Link("callEnd", "CallEnd", null, "00", true, grammarInfo, true, captureExpr);
		list.add(link);

		// build the list of grammar information objects for the link
		grammarInfo = new java.util.ArrayList();

		captureExpr = null;

		link = new com.avaya.sce.runtime.Link("sub", "ExistUser", null, "#", true, grammarInfo, true, captureExpr);
		list.add(link);

		return(list);
	}

	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the properties for the node, override:
	 *     void updateProperties(Collection properties, SCESession mySession)
	 * Last generated by Orchestration Designer at: 2022-DEC-28  11:41:46 AM
	 * @return a collection of properties
	 */
	public java.util.Collection getProperties(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Property property;
		java.util.List list;
		// This item does not have any defined properties
		list = new java.util.ArrayList();

		return(list);
	}

	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the event handlers for the node, override:
	 *    void updateEvents(Collection events, SCESession mySession)
	 * Last generated by Orchestration Designer at: 2022-DEC-28  11:41:46 AM
	 * @return a collection of Events
	 */
	public java.util.Collection getEvents(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list;
		com.avaya.sce.runtime.Event event;
		list = new java.util.ArrayList(5);
		java.util.List eventPromptNames = null;
		String ___tempPromptName = null;

		// Item has no prompts associated
		eventPromptNames = new java.util.ArrayList();

		event = new com.avaya.sce.runtime.Event("connection.disconnect.hangup", (com.avaya.sce.runtime.PromptRefInfo[])eventPromptNames.toArray(new com.avaya.sce.runtime.PromptRefInfo[0]), new com.avaya.sce.runtime.Goto("hangupData", 1, true, ""));
		list.add(event);

		// Item has no prompts associated
		eventPromptNames = new java.util.ArrayList();

		event = new com.avaya.sce.runtime.Event("connection.disconnect", (com.avaya.sce.runtime.PromptRefInfo[])eventPromptNames.toArray(new com.avaya.sce.runtime.PromptRefInfo[0]), new com.avaya.sce.runtime.Goto("disconnectData", 1, true, ""));
		list.add(event);

		// Item has no prompts associated
		eventPromptNames = new java.util.ArrayList();

		event = new com.avaya.sce.runtime.Event("error.badfetch", (com.avaya.sce.runtime.PromptRefInfo[])eventPromptNames.toArray(new com.avaya.sce.runtime.PromptRefInfo[0]), new com.avaya.sce.runtime.Goto("badfetchData", 1, true, ""));
		list.add(event);

		// Item has no prompts associated
		eventPromptNames = new java.util.ArrayList();

		event = new com.avaya.sce.runtime.Event("error.runtime", (com.avaya.sce.runtime.PromptRefInfo[])eventPromptNames.toArray(new com.avaya.sce.runtime.PromptRefInfo[0]), new com.avaya.sce.runtime.Goto("runtimeData", 1, true, ""));
		list.add(event);

		// Item has no prompts associated
		eventPromptNames = new java.util.ArrayList();

		event = new com.avaya.sce.runtime.Event("error", (com.avaya.sce.runtime.PromptRefInfo[])eventPromptNames.toArray(new com.avaya.sce.runtime.PromptRefInfo[0]), new com.avaya.sce.runtime.Goto("errorData", 1, true, ""));
		list.add(event);
		return(list);
	}
	@Override
	public void requestBegin(SCESession mySession) {
		IVariableField DBcon = mySession.getVariableField(IProjectVariables.E_LIBRARY,
				IProjectVariables.E_LIBRARY_FIELD_DBVARIABLE);
		DBcon.setValue(null);
	}
	
	
}
