/**
 * Last generated by Orchestration Designer at: 2023-JAN-03  12:22:37 PM
 */
package english.prompts;

public class YoungadultfictionSelectedBook extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for YoungadultfictionSelectedBook.
	 */
	public YoungadultfictionSelectedBook() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Orchestration Designer at: 2023-FEB-09  01:03:22 PM
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		com.avaya.sce.runtime.MediaPage mediaPage = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("YoungadultfictionSelectedBook");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,8000);
		setBargin(1,false);

			if ( new com.avaya.sce.runtime.Condition( "condition", "YoungadultfictionMenu:value", com.avaya.sce.runtime.Expression.STRING_EQUAL, "1", false, null ).evaluate(getSession()) == true ) {
				add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"Books:HarryPotterandthePhilosopherStoneBook",false));
			}
			else if ( new com.avaya.sce.runtime.Condition( "condition", "YoungadultfictionMenu:value", com.avaya.sce.runtime.Expression.STRING_EQUAL, "2", false, null ).evaluate(getSession()) == true ) {
				add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"Books:HarryPotterandtheChamberofSecretsBook",false));
			}
			else if ( new com.avaya.sce.runtime.Condition( "condition", "YoungadultfictionMenu:value", com.avaya.sce.runtime.Expression.STRING_EQUAL, "3", false, null ).evaluate(getSession()) == true ) {
				add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"Books:HarryPotterandthePrisonerofAzkabanBook",false));
			}

	}
}
