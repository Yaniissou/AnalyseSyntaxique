// Generated from D:/Projets/AnalyseSyntaxique/src/antlr/ArrayOperations.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArrayOperationsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT=6, BOOL_TYPE=7, BOOL=8, SUM=9, 
		PROD=10, MAX=11, MIN=12, SORT=13, ARRAY_TYPE=14, INT_TYPE=15, MED=16, 
		SECMIN=17, SECMAX=18, ID=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "INT", "BOOL_TYPE", "BOOL", "SUM", 
			"PROD", "MAX", "MIN", "SORT", "ARRAY_TYPE", "INT_TYPE", "MED", "SECMIN", 
			"SECMAX", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'['", "','", "']'", null, "'bool'", null, "'sum'", 
			"'prod'", "'max'", "'min'", "'sort'", "'array'", "'int'", "'med'", "'secmin'", 
			"'secmax'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "INT", "BOOL_TYPE", "BOOL", "SUM", 
			"PROD", "MAX", "MIN", "SORT", "ARRAY_TYPE", "INT_TYPE", "MED", "SECMIN", 
			"SECMAX", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ArrayOperationsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArrayOperations.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0014\u008d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"7\b\u0005\n\u0005\f\u0005:\t\u0005\u0003\u0005<\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007L\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u0082\b\u0012"+
		"\n\u0012\f\u0012\u0085\t\u0012\u0001\u0013\u0004\u0013\u0088\b\u0013\u000b"+
		"\u0013\f\u0013\u0089\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0005\u0001\u0000"+
		"19\u0001\u000009\u0001\u0000az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r"+
		"  \u0091\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001\u0000"+
		"\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000"+
		"\u0007/\u0001\u0000\u0000\u0000\t1\u0001\u0000\u0000\u0000\u000b;\u0001"+
		"\u0000\u0000\u0000\r=\u0001\u0000\u0000\u0000\u000fK\u0001\u0000\u0000"+
		"\u0000\u0011M\u0001\u0000\u0000\u0000\u0013Q\u0001\u0000\u0000\u0000\u0015"+
		"V\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019^\u0001"+
		"\u0000\u0000\u0000\u001bc\u0001\u0000\u0000\u0000\u001di\u0001\u0000\u0000"+
		"\u0000\u001fm\u0001\u0000\u0000\u0000!q\u0001\u0000\u0000\u0000#x\u0001"+
		"\u0000\u0000\u0000%\u007f\u0001\u0000\u0000\u0000\'\u0087\u0001\u0000"+
		"\u0000\u0000)*\u0005;\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005"+
		"=\u0000\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005[\u0000\u0000.\u0006"+
		"\u0001\u0000\u0000\u0000/0\u0005,\u0000\u00000\b\u0001\u0000\u0000\u0000"+
		"12\u0005]\u0000\u00002\n\u0001\u0000\u0000\u00003<\u00050\u0000\u0000"+
		"48\u0007\u0000\u0000\u000057\u0007\u0001\u0000\u000065\u0001\u0000\u0000"+
		"\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;3\u0001"+
		"\u0000\u0000\u0000;4\u0001\u0000\u0000\u0000<\f\u0001\u0000\u0000\u0000"+
		"=>\u0005b\u0000\u0000>?\u0005o\u0000\u0000?@\u0005o\u0000\u0000@A\u0005"+
		"l\u0000\u0000A\u000e\u0001\u0000\u0000\u0000BC\u0005t\u0000\u0000CD\u0005"+
		"r\u0000\u0000DE\u0005u\u0000\u0000EL\u0005e\u0000\u0000FG\u0005f\u0000"+
		"\u0000GH\u0005a\u0000\u0000HI\u0005l\u0000\u0000IJ\u0005s\u0000\u0000"+
		"JL\u0005e\u0000\u0000KB\u0001\u0000\u0000\u0000KF\u0001\u0000\u0000\u0000"+
		"L\u0010\u0001\u0000\u0000\u0000MN\u0005s\u0000\u0000NO\u0005u\u0000\u0000"+
		"OP\u0005m\u0000\u0000P\u0012\u0001\u0000\u0000\u0000QR\u0005p\u0000\u0000"+
		"RS\u0005r\u0000\u0000ST\u0005o\u0000\u0000TU\u0005d\u0000\u0000U\u0014"+
		"\u0001\u0000\u0000\u0000VW\u0005m\u0000\u0000WX\u0005a\u0000\u0000XY\u0005"+
		"x\u0000\u0000Y\u0016\u0001\u0000\u0000\u0000Z[\u0005m\u0000\u0000[\\\u0005"+
		"i\u0000\u0000\\]\u0005n\u0000\u0000]\u0018\u0001\u0000\u0000\u0000^_\u0005"+
		"s\u0000\u0000_`\u0005o\u0000\u0000`a\u0005r\u0000\u0000ab\u0005t\u0000"+
		"\u0000b\u001a\u0001\u0000\u0000\u0000cd\u0005a\u0000\u0000de\u0005r\u0000"+
		"\u0000ef\u0005r\u0000\u0000fg\u0005a\u0000\u0000gh\u0005y\u0000\u0000"+
		"h\u001c\u0001\u0000\u0000\u0000ij\u0005i\u0000\u0000jk\u0005n\u0000\u0000"+
		"kl\u0005t\u0000\u0000l\u001e\u0001\u0000\u0000\u0000mn\u0005m\u0000\u0000"+
		"no\u0005e\u0000\u0000op\u0005d\u0000\u0000p \u0001\u0000\u0000\u0000q"+
		"r\u0005s\u0000\u0000rs\u0005e\u0000\u0000st\u0005c\u0000\u0000tu\u0005"+
		"m\u0000\u0000uv\u0005i\u0000\u0000vw\u0005n\u0000\u0000w\"\u0001\u0000"+
		"\u0000\u0000xy\u0005s\u0000\u0000yz\u0005e\u0000\u0000z{\u0005c\u0000"+
		"\u0000{|\u0005m\u0000\u0000|}\u0005a\u0000\u0000}~\u0005x\u0000\u0000"+
		"~$\u0001\u0000\u0000\u0000\u007f\u0083\u0007\u0002\u0000\u0000\u0080\u0082"+
		"\u0007\u0003\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084&\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0086\u0088\u0007\u0004\u0000\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0006\u0013\u0000\u0000\u008c(\u0001\u0000"+
		"\u0000\u0000\u0006\u00008;K\u0083\u0089\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}