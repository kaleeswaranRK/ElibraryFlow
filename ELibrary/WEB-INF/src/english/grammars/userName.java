package english.grammars;

/**
 * This class is generated automatically.
 * Only exit this class for Dynamic External grammars and override the method String getURL().
 * Last generated by Orchestration Designer at: 2022-DEC-07  02:59:48 PM
 */
public class userName extends com.avaya.sce.runtime.Grammar {

    //{{START:CLASS:FIELDS
    //}}END:CLASS:FIELDS

    /**
    * Constructor for userName.
    */
    public userName() {
		//{{START:CLASS:CONSTRUCTOR
        super();
        setRootLanguage("en-us");
        setMode("dtmf");
        setBuiltin(true);
        setBuiltinMode("dtmf");
        setType("digits");
        setOptions("length=6");
		//}}END:CLASS:CONSTRUCTOR
    }

}

