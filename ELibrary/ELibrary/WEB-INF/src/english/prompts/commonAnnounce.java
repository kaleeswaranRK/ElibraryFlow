/**
 * Last generated by Orchestration Designer at: 2022-DEC-07  02:21:09 PM
 */
package english.prompts;

public class commonAnnounce extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for commonAnnounce.
	 */
	public commonAnnounce() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Orchestration Designer at: 2022-DEC-28  10:22:17 AM
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		com.avaya.sce.runtime.MediaPage mediaPage = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("commonAnnounce");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,8000);
		setBargin(1,true);

			if ( new com.avaya.sce.runtime.Condition( "condition", "eLibrary:password", com.avaya.sce.runtime.Expression.STRING_EQUAL, "1", false, null ).evaluate(getSession()) == true ) {
				add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"eLibrary:tam",false));
			}
			else if ( new com.avaya.sce.runtime.Condition( "condition", "eLibrary:password", com.avaya.sce.runtime.Expression.STRING_EQUAL, "2", false, null ).evaluate(getSession()) == true ) {
				add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"eLibrary:eng",false));
			}
			else if ( new com.avaya.sce.runtime.Condition( "condition", "eLibrary:password", com.avaya.sce.runtime.Expression.STRING_EQUAL, "3", false, null ).evaluate(getSession()) == true ) {
				add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"eLibrary:hin",false));
			}

	}
}
