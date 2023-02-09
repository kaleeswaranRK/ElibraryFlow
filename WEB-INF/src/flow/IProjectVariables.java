package flow;

/**
 * This interface is used to define the name of variables that are 
 * declared in the call flow.  All variables are defined as 
 * <code>public static final String</code>, which allows user-defined
 * code to reference variable names by the Java variable name.
 * Last generated by Orchestration Designer at: 2022-DEC-07  11:09:32 AM
 */
public interface IProjectVariables {





	//{{START:PROJECT:VARIABLES
	/**
	 * This is a reserved block of variable name definitions.
	 * The variable names defined here can be used as the key
	 * to get the <code>com.avaya.sce.runtime.Variable</code>
	 * from the <code>SCESession</code> at runtime.<br>
	 * 
	 * For example, given a variable name <code>phoneNum</code>,
	 * user-defined code should access the variable in this format:<PRE>
	 *   Variable phNum = mySession.getVariable(IProjectVariables.PHONE_NUM);
	 *   if ( phNum != null ) {
	 *        // do something with the variable
	 *   }</PRE>
	 * 
	 * This block of code is generated automatically by Orchestration Designer and should not
	 * be manually edited as changes may be overwritten by future code generation.
	 * Last generated by Orchestration Designer at: 2023-FEB-09  02:52:41 PM
	 */
	public static final String DATA_ELIBRARY = "DataElibrary";
	public static final String CART_ITEMS_MENU = "cartItemsMenu";
	public static final String CART_OPTIONS_MENU = "cartOptionsMenu";
	public static final String PASSWORD = "password";
	public static final String REDIRECTINFO = "redirectinfo";
	public static final String UNTITLED_INPUT_1 = "untitledInput1";
	public static final String AUDIO_PATH = "AudioPath";
	public static final String E_LIBRARY = "eLibrary";
	public static final String USER_ID = "userId";
	public static final String DATE = "date";
	public static final String CART_MENU = "CartMenu";
	public static final String BOOKS_MENU = "booksMenu";
	public static final String USER_DETAILS = "UserDetails";
	public static final String ADVENTURE_MENU = "AdventureMenu";
	public static final String CLASSICS_MENU = "classicsMenu";
	public static final String CART_EDIT_MENU = "cartEditMenu";
	public static final String LANG_MENU = "langMenu";
	public static final String CATEGORY_MENU = "CategoryMenu";
	public static final String YOUNGADULTFICTION_MENU = "YoungadultfictionMenu";
	public static final String CART_PRODUCT_COUNT = "cartProductCount";
	public static final String SESSION = "session";
	public static final String MENU_COMMON = "menuCommon";
	public static final String USER_MENU = "userMenu";
	public static final String DD_LAST_EXCEPTION = "ddLastException";
	public static final String TIME = "time";
	public static final String SHAREDUUI = "shareduui";
	//}}END:PROJECT:VARIABLES
	//{{START:PROJECT:VARIABLEFIELDS
	public static final String DATA_ELIBRARY_FIELD_APP_IP = "AppIP";
	public static final String DATA_ELIBRARY_FIELD_CLID = "clid";
	public static final String DATA_ELIBRARY_FIELD_DNIS = "dnis";
	public static final String DATA_ELIBRARY_FIELD_DURATION = "duration";
	public static final String DATA_ELIBRARY_FIELD_END_DATE = "endDate";
	public static final String DATA_ELIBRARY_FIELD_END_REASON = "EndReason";
	public static final String DATA_ELIBRARY_FIELD_EXIT_LOCATION = "exitLocation";
	public static final String DATA_ELIBRARY_FIELD_FLOW_NAME = "flowName";
	public static final String DATA_ELIBRARY_FIELD_START_DATE = "startDate";
	public static final String CART_ITEMS_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String CART_ITEMS_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String CART_ITEMS_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String CART_ITEMS_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String CART_ITEMS_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String CART_ITEMS_MENU_FIELD_UTTERANCE = "utterance";
	public static final String CART_ITEMS_MENU_FIELD_VALUE = "value";
	public static final String CART_OPTIONS_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String CART_OPTIONS_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String CART_OPTIONS_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String CART_OPTIONS_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String CART_OPTIONS_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String CART_OPTIONS_MENU_FIELD_UTTERANCE = "utterance";
	public static final String CART_OPTIONS_MENU_FIELD_VALUE = "value";
	public static final String PASSWORD_FIELD_CONFIDENCE = "confidence";
	public static final String PASSWORD_FIELD_INPUTMODE = "inputmode";
	public static final String PASSWORD_FIELD_INTERPRETATION = "interpretation";
	public static final String PASSWORD_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String PASSWORD_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String PASSWORD_FIELD_UTTERANCE = "utterance";
	public static final String PASSWORD_FIELD_VALUE = "value";
	public static final String REDIRECTINFO_FIELD_PRESENTATIONINFO = "presentationinfo";
	public static final String REDIRECTINFO_FIELD_REASON = "reason";
	public static final String REDIRECTINFO_FIELD_SCREENINGINFO = "screeninginfo";
	public static final String REDIRECTINFO_FIELD_URI = "uri";
	public static final String AUDIO_PATH_FIELD_ADVENTURE_MENU = "AdventureMenu";
	public static final String AUDIO_PATH_FIELD_ADVENTURE_SELECT = "AdventureSelect";
	public static final String AUDIO_PATH_FIELD_ADVENTURESTORIES = "Adventurestories";
	public static final String AUDIO_PATH_FIELD_AGENT_CONNECT = "AgentConnect";
	public static final String AUDIO_PATH_FIELD_AGENT_MUSIC = "AgentMusic";
	public static final String AUDIO_PATH_FIELD_AHISTORYOF_ADVENTURE_BOOK = "AHistoryofAdventureBook";
	public static final String AUDIO_PATH_FIELD_CART_EDIT_MENU = "CartEditMenu";
	public static final String AUDIO_PATH_FIELD_CART_MENU = "CartMenu";
	public static final String AUDIO_PATH_FIELD_CART_OPTIONS_MENU = "CartOptionsMenu";
	public static final String AUDIO_PATH_FIELD_CATEGORY_MENU = "CategoryMenu";
	public static final String AUDIO_PATH_FIELD_ENGLISH_SELECTION = "EnglishSelection";
	public static final String AUDIO_PATH_FIELD_EXIST_USER_ANNOUNCE = "existUserAnnounce";
	public static final String AUDIO_PATH_FIELD_HARRY_POTTERANDTHE_CHAMBEROF_SECRETS_BOOK = "HarryPotterandtheChamberofSecretsBook";
	public static final String AUDIO_PATH_FIELD_HARRY_POTTERANDTHE_PHILOSOPHER_STONE_BOOK = "HarryPotterandthePhilosopherStoneBook";
	public static final String AUDIO_PATH_FIELD_HARRY_POTTERANDTHE_PRISONEROF_AZKABAN_BOOK = "HarryPotterandthePrisonerofAzkabanBook";
	public static final String AUDIO_PATH_FIELD_LANGUAGE_MENU_ENGLISH = "languageMenuEnglish";
	public static final String AUDIO_PATH_FIELD_LANGUAGE_MENU_TAMIL = "languageMenuTamil";
	public static final String AUDIO_PATH_FIELD_LANGUAGE_MENU_WELCOME = "languageMenuWelcome";
	public static final String AUDIO_PATH_FIELD_NO_INPUT = "NoInput";
	public static final String AUDIO_PATH_FIELD_NO_MATCH = "NoMatch";
	public static final String AUDIO_PATH_FIELD_PASSWORD = "Password";
	public static final String AUDIO_PATH_FIELD_PRODUCT_ADDED_FAILIURE = "ProductAddedFailiure";
	public static final String AUDIO_PATH_FIELD_PRODUCT_ADDED_SUCCESS = "productAddedSuccess";
	public static final String AUDIO_PATH_FIELD_PRODUCT_COUNT = "productCount";
	public static final String AUDIO_PATH_FIELD_PRODUCT_REDUCED_FAILIURE = "productReducedFailiure";
	public static final String AUDIO_PATH_FIELD_PRODUCT_REDUCED_SUCCESS = "productReducedSuccess";
	public static final String AUDIO_PATH_FIELD_PRODUCT_REMOVED_FAILIURE = "productRemovedFailiure";
	public static final String AUDIO_PATH_FIELD_PRODUCT_REMOVED_SUCCESS = "productRemovedSuccess";
	public static final String AUDIO_PATH_FIELD_TAMIL_SELECTION = "TamilSelection";
	public static final String AUDIO_PATH_FIELD_THE_LITTLE_PRINCE_BOOK = "TheLittlePrinceBook";
	public static final String AUDIO_PATH_FIELD_USER_ID = "userId";
	public static final String AUDIO_PATH_FIELD_USER_MENU_WELCOME = "userMenuWelcome";
	public static final String AUDIO_PATH_FIELD_USER_NEW = "userNew";
	public static final String AUDIO_PATH_FIELD_WELCOME = "welcome";
	public static final String AUDIO_PATH_FIELD_YOUNGADULTFICTION = "Youngadultfiction";
	public static final String AUDIO_PATH_FIELD_YOUNG_ADULTFICTION_MENU = "YoungAdultfictionMenu";
	public static final String AUDIO_PATH_FIELD_YOUNGADULTFICTION_SELECT = "YoungadultfictionSelect";
	public static final String E_LIBRARY_FIELD_DATASOURCE = "datasource";
	public static final String E_LIBRARY_FIELD_DBVARIABLE = "DBVariable";
	public static final String E_LIBRARY_FIELD_FOUR = "four";
	public static final String E_LIBRARY_FIELD_ONE = "one";
	public static final String E_LIBRARY_FIELD_PASSCHECK = "passcheck";
	public static final String E_LIBRARY_FIELD_PASSWORD_EVENT = "passwordEvent";
	public static final String E_LIBRARY_FIELD_THREE = "three";
	public static final String E_LIBRARY_FIELD_TWO = "two";
	public static final String E_LIBRARY_FIELD_USER = "user";
	public static final String E_LIBRARY_FIELD_USERCHECK = "usercheck";
	public static final String E_LIBRARY_FIELD_USER_EVENT = "userEvent";
	public static final String E_LIBRARY_FIELD_WELCOMEJOIN = "welcomejoin";
	public static final String E_LIBRARY_FIELD_ZERO = "zero";
	public static final String USER_ID_FIELD_CONFIDENCE = "confidence";
	public static final String USER_ID_FIELD_INPUTMODE = "inputmode";
	public static final String USER_ID_FIELD_INTERPRETATION = "interpretation";
	public static final String USER_ID_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String USER_ID_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String USER_ID_FIELD_UTTERANCE = "utterance";
	public static final String USER_ID_FIELD_VALUE = "value";
	public static final String DATE_FIELD_AUDIO = "audio";
	public static final String DATE_FIELD_DAYOFMONTH = "dayofmonth";
	public static final String DATE_FIELD_DAYOFWEEK = "dayofweek";
	public static final String DATE_FIELD_DAYOFWEEKNUM = "dayofweeknum";
	public static final String DATE_FIELD_DAYOFYEAR = "dayofyear";
	public static final String DATE_FIELD_MONTH = "month";
	public static final String DATE_FIELD_MONTHINYEAR = "monthinyear";
	public static final String DATE_FIELD_YEAR = "year";
	public static final String CART_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String CART_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String CART_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String CART_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String CART_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String CART_MENU_FIELD_UTTERANCE = "utterance";
	public static final String CART_MENU_FIELD_VALUE = "value";
	public static final String BOOKS_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String BOOKS_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String BOOKS_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String BOOKS_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String BOOKS_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String BOOKS_MENU_FIELD_UTTERANCE = "utterance";
	public static final String BOOKS_MENU_FIELD_VALUE = "value";
	public static final String USER_DETAILS_FIELD_USER_ID_NUMBER = "userIdNumber";
	public static final String ADVENTURE_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String ADVENTURE_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String ADVENTURE_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String ADVENTURE_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String ADVENTURE_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String ADVENTURE_MENU_FIELD_UTTERANCE = "utterance";
	public static final String ADVENTURE_MENU_FIELD_VALUE = "value";
	public static final String CLASSICS_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String CLASSICS_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String CLASSICS_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String CLASSICS_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String CLASSICS_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String CLASSICS_MENU_FIELD_UTTERANCE = "utterance";
	public static final String CLASSICS_MENU_FIELD_VALUE = "value";
	public static final String CART_EDIT_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String CART_EDIT_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String CART_EDIT_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String CART_EDIT_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String CART_EDIT_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String CART_EDIT_MENU_FIELD_UTTERANCE = "utterance";
	public static final String CART_EDIT_MENU_FIELD_VALUE = "value";
	public static final String LANG_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String LANG_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String LANG_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String LANG_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String LANG_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String LANG_MENU_FIELD_UTTERANCE = "utterance";
	public static final String LANG_MENU_FIELD_VALUE = "value";
	public static final String CATEGORY_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String CATEGORY_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String CATEGORY_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String CATEGORY_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String CATEGORY_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String CATEGORY_MENU_FIELD_UTTERANCE = "utterance";
	public static final String CATEGORY_MENU_FIELD_VALUE = "value";
	public static final String YOUNGADULTFICTION_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String YOUNGADULTFICTION_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String YOUNGADULTFICTION_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String YOUNGADULTFICTION_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String YOUNGADULTFICTION_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String YOUNGADULTFICTION_MENU_FIELD_UTTERANCE = "utterance";
	public static final String YOUNGADULTFICTION_MENU_FIELD_VALUE = "value";
	public static final String CART_PRODUCT_COUNT_FIELD_CONFIDENCE = "confidence";
	public static final String CART_PRODUCT_COUNT_FIELD_INPUTMODE = "inputmode";
	public static final String CART_PRODUCT_COUNT_FIELD_INTERPRETATION = "interpretation";
	public static final String CART_PRODUCT_COUNT_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String CART_PRODUCT_COUNT_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String CART_PRODUCT_COUNT_FIELD_UTTERANCE = "utterance";
	public static final String CART_PRODUCT_COUNT_FIELD_VALUE = "value";
	public static final String SESSION_FIELD_AAI = "aai";
	public static final String SESSION_FIELD_ANI = "ani";
	public static final String SESSION_FIELD_CALLTAG = "calltag";
	public static final String SESSION_FIELD_CHANNEL = "channel";
	public static final String SESSION_FIELD_CHANNELTYPE = "channeltype";
	public static final String SESSION_FIELD_CONVERSEFIRST = "conversefirst";
	public static final String SESSION_FIELD_CONVERSESECOND = "conversesecond";
	public static final String SESSION_FIELD_CURRENTLANGUAGE = "currentlanguage";
	public static final String SESSION_FIELD_DNIS = "dnis";
	public static final String SESSION_FIELD_EXIT_CUSTOMER_ID = "exitCustomerId";
	public static final String SESSION_FIELD_EXIT_INFO_1 = "exitInfo1";
	public static final String SESSION_FIELD_EXIT_INFO_2 = "exitInfo2";
	public static final String SESSION_FIELD_EXIT_PARENT_ID = "exitParentId";
	public static final String SESSION_FIELD_EXIT_PREFERRED_PATH = "exitPreferredPath";
	public static final String SESSION_FIELD_EXIT_REASON = "exitReason";
	public static final String SESSION_FIELD_EXIT_TOPIC = "exitTopic";
	public static final String SESSION_FIELD_LASTERROR = "lasterror";
	public static final String SESSION_FIELD_MEDIATYPE = "mediatype";
	public static final String SESSION_FIELD_PROTOCOLNAME = "protocolname";
	public static final String SESSION_FIELD_PROTOCOLVERSION = "protocolversion";
	public static final String SESSION_FIELD_SESSIONID = "sessionid";
	public static final String SESSION_FIELD_SESSIONLABEL = "sessionlabel";
	public static final String SESSION_FIELD_SHAREDMODE = "sharedmode";
	public static final String SESSION_FIELD_UCID = "ucid";
	public static final String SESSION_FIELD_UUI = "uui";
	public static final String SESSION_FIELD_VIDEOBITRATE = "videobitrate";
	public static final String SESSION_FIELD_VIDEOCODEC = "videocodec";
	public static final String SESSION_FIELD_VIDEOENABLED = "videoenabled";
	public static final String SESSION_FIELD_VIDEOFARFMTP = "videofarfmtp";
	public static final String SESSION_FIELD_VIDEOFORMAT = "videoformat";
	public static final String SESSION_FIELD_VIDEOFPS = "videofps";
	public static final String SESSION_FIELD_VIDEOHEIGHT = "videoheight";
	public static final String SESSION_FIELD_VIDEONEARFMTP = "videonearfmtp";
	public static final String SESSION_FIELD_VIDEOWIDTH = "videowidth";
	public static final String SESSION_FIELD_VPCALLEDEXTENSION = "vpcalledextension";
	public static final String SESSION_FIELD_VPCONVERSEONDATA = "vpconverseondata";
	public static final String SESSION_FIELD_VPCOVERAGEREASON = "vpcoveragereason";
	public static final String SESSION_FIELD_VPCOVERAGETYPE = "vpcoveragetype";
	public static final String SESSION_FIELD_VPRDNIS = "vprdnis";
	public static final String SESSION_FIELD_VPREPORTURL = "vpreporturl";
	public static final String MENU_COMMON_FIELD_BOOK_MENU_LIST = "bookMenuList";
	public static final String MENU_COMMON_FIELD_CATEGORY_MENU_LIST = "categoryMenuList";
	public static final String MENU_COMMON_FIELD_MENU_OPTION_1 = "menuOption1";
	public static final String MENU_COMMON_FIELD_MENU_OPTION_2 = "menuOption2";
	public static final String MENU_COMMON_FIELD_MENU_OPTION_3 = "menuOption3";
	public static final String MENU_COMMON_FIELD_MENU_OPTION_4 = "menuOption4";
	public static final String MENU_COMMON_FIELD_MENU_OPTION_5 = "menuOption5";
	public static final String MENU_COMMON_FIELD_MENU_OPTION_6 = "menuOption6";
	public static final String MENU_COMMON_FIELD_MENU_OPTION_7 = "menuOption7";
	public static final String MENU_COMMON_FIELD_MENU_OPTION_8 = "menuOption8";
	public static final String MENU_COMMON_FIELD_MENU_OPTION_9 = "menuOption9";
	public static final String MENU_COMMON_FIELD_MENU_OPTION_VALUE_1 = "menuOptionValue1";
	public static final String MENU_COMMON_FIELD_MENU_OPTION_VALUE_2 = "menuOptionValue2";
	public static final String MENU_COMMON_FIELD_MENU_OPTION_VALUE_3 = "menuOptionValue3";
	public static final String MENU_COMMON_FIELD_MENU_OPTION_VALUE_4 = "menuOptionValue4";
	public static final String MENU_COMMON_FIELD_MENU_OPTION_VALUE_5 = "menuOptionValue5";
	public static final String MENU_COMMON_FIELD_MENU_OPTION_VALUE_6 = "menuOptionValue6";
	public static final String MENU_COMMON_FIELD_MENU_PAGE = "menuPage";
	public static final String MENU_COMMON_FIELD_NEW_AUDIO_PATH = "newAudioPath";
	public static final String USER_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String USER_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String USER_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String USER_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String USER_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String USER_MENU_FIELD_UTTERANCE = "utterance";
	public static final String USER_MENU_FIELD_VALUE = "value";
	public static final String DD_LAST_EXCEPTION_FIELD_ERRORCODE = "errorcode";
	public static final String DD_LAST_EXCEPTION_FIELD_MESSAGE = "message";
	public static final String DD_LAST_EXCEPTION_FIELD_OBJECT = "object";
	public static final String DD_LAST_EXCEPTION_FIELD_STACKTRACE = "stacktrace";
	public static final String DD_LAST_EXCEPTION_FIELD_TYPE = "type";
	public static final String TIME_FIELD_AUDIO = "audio";
	public static final String TIME_FIELD_HOUR = "hour";
	public static final String TIME_FIELD_MILLISECOND = "millisecond";
	public static final String TIME_FIELD_MINUTE = "minute";
	public static final String TIME_FIELD_SECOND = "second";
	public static final String TIME_FIELD_TIMEZONE = "timezone";
	public static final String SHAREDUUI_FIELD_ID = "id";
	public static final String SHAREDUUI_FIELD_VALUE = "value";
	//}}END:PROJECT:VARIABLEFIELDS
}
