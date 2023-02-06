package english.phrasesets;

/**
 * This phraseset class will be automatically populated with data from the 
 * phraseset project file.  Manual edits should only be outside of the tag 
 * areas or overridden methods. 
 * Class created on: 
 * Last generated by Orchestration Designer at: 2023-JAN-02  06:25:10 PM
 */
public class Books extends com.avaya.sce.runtime.Phraseset { 

	//{{START:CLASS:FIELDS
	private static final com.avaya.sce.runtime.Phraseset.PhraseMap PHRASE_MAP;
	//}}END:CLASS:FIELDS

	/**
	 * Static initializer
	 */
	static {
		//{{START:PHRASESET:STATIC

		// Create the phrase map, then populate with phrases
		PHRASE_MAP = new com.avaya.sce.runtime.Phraseset.PhraseMap(18);
		com.avaya.sce.runtime.Phrase phrase;

		// phrase: AHistoryofAdventureBook
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "AHistoryofAdventureBook", "AHistoryofAdventureBook.wav", "You are select A History of Adventure Book"); 

		// phrase: ATaleOfTwoCitiesBook
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ATaleOfTwoCitiesBook", "ATaleOfTwoCitiesBook.wav", "You are select A Tale Of Two Cities Book"); 

		// phrase: DreamOfTheRedChamberBook
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "DreamOfTheRedChamberBook", "DreamOfTheRedChamberBook.wav", "You are select Dream Of The Red Chamber Book"); 

		// phrase: HarryPotterandtheChamberofSecretsBook
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "HarryPotterandtheChamberofSecretsBook", "HarryPotterandtheChamberofSecretsBook.wav", "You are select Harry Potter and the Chamber of Secrets Book"); 

		// phrase: HarryPotterandthePhilosopherStoneBook
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "HarryPotterandthePhilosopherStoneBook", "HarryPotterandthePhilosopherStoneBook.wav", "You are select Harry Potter and the Philosopher\'s Stone Book"); 

		// phrase: HarryPotterandthePrisonerofAzkabanBook
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "HarryPotterandthePrisonerofAzkabanBook", "HarryPotterandthePrisonerofAzkabanBook.wav", "You are select Harry Potter and the Prisoner of Azkaban Book"); 

		// phrase: TheAlchemistBook
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "TheAlchemistBook", "TheAlchemistBook.wav", "You are select The Alchemist Book"); 

		// phrase: TheCatcherintheRyeBook
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "TheCatcherintheRyeBook", "TheCatcherintheRyeBook.wav", "You are select The Catcher in the Rye Book"); 

		// phrase: TheLittlePrinceBook
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "TheLittlePrinceBook", "TheLittlePrinceBook.wav", "You are select The Little Prince Book"); 

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
	 * Last generated by Orchestration Designer at: 2023-FEB-02  10:04:40 AM
	 * @see com.avaya.sce.runtime.Phraseset#getPhrase(String) 
	 */ 
	public com.avaya.sce.runtime.Phrase getPhrase(String phraseName) {
		return(getPhrase(Books.PHRASE_MAP, phraseName));
	}
}