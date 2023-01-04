package english.phrasesets;

/**
 * This phraseset class will be automatically populated with data from the 
 * phraseset project file.  Manual edits should only be outside of the tag 
 * areas or overridden methods. 
 * Class created on: 
 * Last generated by Orchestration Designer at: 2023-JAN-03  10:26:44 AM
 */
public class authorMenu extends com.avaya.sce.runtime.Phraseset { 

	//{{START:CLASS:FIELDS
	private static final com.avaya.sce.runtime.Phraseset.PhraseMap PHRASE_MAP;
	//}}END:CLASS:FIELDS

	/**
	 * Static initializer
	 */
	static {
		//{{START:PHRASESET:STATIC

		// Create the phrase map, then populate with phrases
		PHRASE_MAP = new com.avaya.sce.runtime.Phraseset.PhraseMap(20);
		com.avaya.sce.runtime.Phrase phrase;

		// phrase: menuAuthor
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "menuAuthor", "menuAuthor.wav", "Welcome to author menu"); 

		// phrase: AuthorsList
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "AuthorsList", "AuthorsList.wav", "press 1 for select JK Rowling\r\n\r\npress 2 for select Rider Haggard\r\n\r\npress 3 for select Paulo Coelho\r\n\r\npress 4 for select Charles Dickens\r\n\r\npress 5 for select Chao Xueqin\r\n\r\npress 6 for select JD Salinger"); 

		// phrase: ChaoXueqin
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ChaoXueqin", "ChaoXueqin.wav", "You are select Chao Xueqin books"); 

		// phrase: CharlesDickens
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "CharlesDickens", "CharlesDickens.wav", "You are select Charles Dickens books"); 

		// phrase: JDSalinger
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "JDSalinger", "JDSalinger.wav", "You are select JD Salinger books"); 

		// phrase: JKRowling
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "JKRowling", "JKRowling.wav", "You are select JK Rowling books"); 

		// phrase: PauloCoelho
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "PauloCoelho", "PauloCoelho.wav", "You are select Paulo Coelho books"); 

		// phrase: RiderHaggard
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "RiderHaggard", "RiderHaggard.wav", "You are select Rider Haggard books"); 

		// phrase: authorMenuReturn
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "authorMenuReturn", "authorMenuReturn.wav", "if you want to continue press 1\r\nif you want to go back to author menu press 2"); 

		// phrase: JKRowlingBooks
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "JKRowlingBooks", "JKRowlingBooks.wav", "press 1 for select Harry Potter and the Philosophers Stone book\r\n\r\npress 2 for select Harry Potter and the Chamber of Secrets book\r\n\r\npress 3 for select Harry Potter and the Prisoner of Azkaban book\r\n\r\npress 4 for select The Little Prince  book"); 

		//}}END:PHRASESET:STATIC
	}
	/**
	 * Returns the Phrase with the given name.  To override the
	 * behavior and dynamically return a different Phrase object,
	 * override the method "hookGetPhrase(...)".
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2023-JAN-03  12:42:21 PM
	 * @see com.avaya.sce.runtime.Phraseset#getPhrase(String) 
	 */ 
	public com.avaya.sce.runtime.Phrase getPhrase(String phraseName) {
		return(getPhrase(authorMenu.PHRASE_MAP, phraseName));
	}
}
