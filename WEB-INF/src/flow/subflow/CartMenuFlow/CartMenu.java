package flow.subflow.CartMenuFlow;

import java.util.Collection;

import com.avaya.sce.runtime.Prompt;
import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

/**
 * Class that represents a menu.  A menu can contain prompts, choices and links
 * as well as handlers for various events that may occur while the menu is executing
 * Last generated by Orchestration Designer at: 2023-JAN-05  10:57:28 AM
 */
public class CartMenu extends com.avaya.sce.runtime.Menu {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2023-JAN-05  10:57:28 AM
	 */
	public CartMenu() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		setNeedsDefaultDisconnectHandler(false);
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the links for the node, override:
	 *     void updateLinks(Collection links, SCESession mySession)
	 * Last generated by Orchestration Designer at: 2023-FEB-09  02:52:40 PM
	 * @return a collection of links
	 */
	public java.util.Collection getLinks(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Link link;
		java.util.List list;
		java.util.Collection grammarInfo = null;
		java.util.Collection<com.avaya.sce.runtime.CaptureExpression> captureExpr = null;
		// This item does not have any defined links
		list = new java.util.ArrayList();
		String ___tempGrammarName = null;

		return(list);
	}
	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the properties for the node, override:
	 *     void updateProperties(Collection properties, SCESession mySession)
	 * Last generated by Orchestration Designer at: 2023-FEB-09  02:52:40 PM
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
	 * Last generated by Orchestration Designer at: 2023-FEB-09  02:52:40 PM
	 * @return a collection of Events
	 */
	public java.util.Collection getEvents(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list;
		com.avaya.sce.runtime.Event event;
		list = new java.util.ArrayList(2);
		java.util.List eventPromptNames = null;
		String ___tempPromptName = null;

		// build the list of prompt names
		eventPromptNames = new java.util.ArrayList(1);
		
		eventPromptNames.add(new com.avaya.sce.runtime.PromptRefInfo("noInputEntry", ""));

		event = new com.avaya.sce.runtime.Event(com.avaya.sce.runtimecommon.SCERT.EVENT_NOINPUT, (com.avaya.sce.runtime.PromptRefInfo[])eventPromptNames.toArray(new com.avaya.sce.runtime.PromptRefInfo[0]), new com.avaya.sce.runtime.Goto("CartMenuFlow-NoInputDataPassword", 2, true, ""));
		list.add(event);

		// build the list of prompt names
		eventPromptNames = new java.util.ArrayList(1);
		
		eventPromptNames.add(new com.avaya.sce.runtime.PromptRefInfo("noMatchEntry", ""));

		event = new com.avaya.sce.runtime.Event(com.avaya.sce.runtimecommon.SCERT.EVENT_NOMATCH, (com.avaya.sce.runtime.PromptRefInfo[])eventPromptNames.toArray(new com.avaya.sce.runtime.PromptRefInfo[0]), new com.avaya.sce.runtime.Goto("CartMenuFlow-NoMatchDataPassword", 2, true, ""));
		list.add(event);
		return(list);
	}
	/**
	 * Builds the list of choices for the menu.  This list is built
	 * automatically by the code generator and should not be edited
	 * manually.  Future code generation may overwrite any changes
	 * to this method.<br>
	 * To modify the list of choices, override:<br>
	 *    updateChoices(Collection choices, SCESession mySession)
	 * Last generated by Orchestration Designer at: 2023-FEB-09  02:52:40 PM
	 */
	public java.util.Collection getChoices(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Choice choice = null;
		java.util.Collection grammarInfo = null;
		list = new java.util.ArrayList(1);
		String ___tempGrammarName = null;

		// build the list of grammar information objects for the choice
		grammarInfo = new java.util.ArrayList();


		choice = new com.avaya.sce.runtime.Choice("Exit", "0", true, "exact", "CartMenuFlow-returnToSelection", grammarInfo, true);
		list.add(choice);

		return(list);
	}
	/**
	 * Builds the list of prompts that are used by this flow item<br>
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.  To modify the list
	 * of prompts for the flow item, override:
	 *     updatePrompts(Collection prompts, SCESession mySession)
	 * @return list of prompts for the menu
	 * Last generated by Orchestration Designer at: 2023-FEB-09  02:52:40 PM
	 */
	public java.util.Collection getPrompts(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		String ___tempPromptName = null;
		// Item has no prompts associated
		list = new java.util.ArrayList();

		return(list);
	}
	/**
	 * Builds the list of tracking items that are generated by this flow item<br>
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.
	 * @return list of tracking items for the item
	 * Last generated by Orchestration Designer at: 2023-FEB-09  02:52:40 PM
	 */
	public java.util.Collection getTrackingActions(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;

		// Item has no tracking items.
		list = new java.util.ArrayList();
		return(list);
	}
	@Override
	public void updatePrompts(Collection prompts, SCESession mySession) {
		super.updatePrompts(prompts, mySession);
		try {
			super.updatePrompts(prompts, mySession);
			Prompt p = new Prompt() {
				@Override
				public void buildPrompt() {

				}

			};
			p.setSession(mySession);
			p.setOrder(com.avaya.sce.runtime.Prompt.STANDARD);
			p.setTimeout(1, 8000);
			p.setBargin(1, true);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "update promt Entry", mySession);
			p.add(1, new com.avaya.sce.runtime.PhraseVariableElement("AudioPath:CartMenu",
					com.avaya.sce.runtime.PhraseVariableElement.Type.AUDIO_URL, false));
			prompts.add(p);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "update promt Exit", mySession);
		} catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
		}
	}
	@Override
	public void updateChoices(Collection choices, SCESession mySession) {
		super.updateChoices(choices, mySession);
		try {
			super.updateChoices(choices, mySession);
			com.avaya.sce.runtime.Choice choice = null;
			java.util.Collection grammarInfo = null;
			grammarInfo = new java.util.ArrayList();
				choice = new com.avaya.sce.runtime.Choice("ExistCart", "1", true, "exact", "cartData", grammarInfo, true);
				choices.add(choice);
				choice = new com.avaya.sce.runtime.Choice("AddtoCart", "2", true, "exact", "CartMenuFlow-returnToSelection", grammarInfo, true);
				choices.add(choice);
			}
			catch (Exception e) {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mySession);
			}
	}
}
