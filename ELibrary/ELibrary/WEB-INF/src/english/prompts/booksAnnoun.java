/**
 * Last generated by Orchestration Designer at: 2022-DEC-07  06:51:38 PM
 */
package english.prompts;

public class booksAnnoun extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for booksAnnoun.
	 */
	public booksAnnoun() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Orchestration Designer at: 2023-JAN-03  12:38:16 PM
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		com.avaya.sce.runtime.MediaPage mediaPage = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("booksAnnoun");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,8000);
		setBargin(1,false);

			if ( new com.avaya.sce.runtime.Condition( "condition", "authorMenu:value", com.avaya.sce.runtime.Expression.STRING_EQUAL, "1", false, null ).evaluate(getSession()) == true ) {
				add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.TEXT,"You are select Whereabouts book", null));
			}
			else if ( new com.avaya.sce.runtime.Condition( "condition", "authorMenu:value", com.avaya.sce.runtime.Expression.STRING_EQUAL, "2", false, null ).evaluate(getSession()) == true ) {
				add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.TEXT,"you are select Right Under Our Nose book", null));
			}
			else if ( new com.avaya.sce.runtime.Condition( "condition", "authorMenu:value", com.avaya.sce.runtime.Expression.STRING_EQUAL, "3", false, null ).evaluate(getSession()) == true ) {
				add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.TEXT,"you are select  Unfinished book", null));
			}
			else if ( new com.avaya.sce.runtime.Condition( "condition", "authorMenu:value", com.avaya.sce.runtime.Expression.STRING_EQUAL, "4", false, null ).evaluate(getSession()) == true ) {
				add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.TEXT,"you are select Mapping Love book", null));
			}
			else if ( new com.avaya.sce.runtime.Condition( "condition", "authorMenu:value", com.avaya.sce.runtime.Expression.STRING_EQUAL, "5", false, null ).evaluate(getSession()) == true ) {
				add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.TEXT,"you are select The Lost Soul book", null));
			}

	}
}
