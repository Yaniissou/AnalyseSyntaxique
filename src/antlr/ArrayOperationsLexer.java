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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT=6, SUM=7, PROD=8, MAX=9, MIN=10, 
		SORT=11, ARRAY_TYPE=12, INT_TYPE=13, MED=14, SECMIN=15, SECMAX=16, ID=17, 
		WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "INT", "SUM", "PROD", "MAX", 
			"MIN", "SORT", "ARRAY_TYPE", "INT_TYPE", "MED", "SECMIN", "SECMAX", "ID", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'['", "','", "']'", null, "'sum'", "'prod'", "'max'", 
			"'min'", "'sort'", "'array'", "'int'", "'med'", "'secmin'", "'secmax'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "INT", "SUM", "PROD", "MAX", "MIN", 
			"SORT", "ARRAY_TYPE", "INT_TYPE", "MED", "SECMIN", "SECMAX", "ID", "WS"
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
		"\u0004\u0000\u0012y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u00053\b\u0005\n\u0005\f\u00056\t\u0005\u0003\u00058\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0005\u0010n\b\u0010\n\u0010\f\u0010"+
		"q\t\u0010\u0001\u0011\u0004\u0011t\b\u0011\u000b\u0011\f\u0011u\u0001"+
		"\u0011\u0001\u0011\u0000\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"\u0001\u0000\u0005\u0001\u000019\u0001\u000009\u0001\u0000az\u0004\u0000"+
		"09AZ__az\u0003\u0000\t\n\r\r  |\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0001%\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000"+
		"\u0005)\u0001\u0000\u0000\u0000\u0007+\u0001\u0000\u0000\u0000\t-\u0001"+
		"\u0000\u0000\u0000\u000b7\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000"+
		"\u0000\u000f=\u0001\u0000\u0000\u0000\u0011B\u0001\u0000\u0000\u0000\u0013"+
		"F\u0001\u0000\u0000\u0000\u0015J\u0001\u0000\u0000\u0000\u0017O\u0001"+
		"\u0000\u0000\u0000\u0019U\u0001\u0000\u0000\u0000\u001bY\u0001\u0000\u0000"+
		"\u0000\u001d]\u0001\u0000\u0000\u0000\u001fd\u0001\u0000\u0000\u0000!"+
		"k\u0001\u0000\u0000\u0000#s\u0001\u0000\u0000\u0000%&\u0005;\u0000\u0000"+
		"&\u0002\u0001\u0000\u0000\u0000\'(\u0005=\u0000\u0000(\u0004\u0001\u0000"+
		"\u0000\u0000)*\u0005[\u0000\u0000*\u0006\u0001\u0000\u0000\u0000+,\u0005"+
		",\u0000\u0000,\b\u0001\u0000\u0000\u0000-.\u0005]\u0000\u0000.\n\u0001"+
		"\u0000\u0000\u0000/8\u00050\u0000\u000004\u0007\u0000\u0000\u000013\u0007"+
		"\u0001\u0000\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000058\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u00007/\u0001\u0000\u0000\u000070\u0001\u0000"+
		"\u0000\u00008\f\u0001\u0000\u0000\u00009:\u0005s\u0000\u0000:;\u0005u"+
		"\u0000\u0000;<\u0005m\u0000\u0000<\u000e\u0001\u0000\u0000\u0000=>\u0005"+
		"p\u0000\u0000>?\u0005r\u0000\u0000?@\u0005o\u0000\u0000@A\u0005d\u0000"+
		"\u0000A\u0010\u0001\u0000\u0000\u0000BC\u0005m\u0000\u0000CD\u0005a\u0000"+
		"\u0000DE\u0005x\u0000\u0000E\u0012\u0001\u0000\u0000\u0000FG\u0005m\u0000"+
		"\u0000GH\u0005i\u0000\u0000HI\u0005n\u0000\u0000I\u0014\u0001\u0000\u0000"+
		"\u0000JK\u0005s\u0000\u0000KL\u0005o\u0000\u0000LM\u0005r\u0000\u0000"+
		"MN\u0005t\u0000\u0000N\u0016\u0001\u0000\u0000\u0000OP\u0005a\u0000\u0000"+
		"PQ\u0005r\u0000\u0000QR\u0005r\u0000\u0000RS\u0005a\u0000\u0000ST\u0005"+
		"y\u0000\u0000T\u0018\u0001\u0000\u0000\u0000UV\u0005i\u0000\u0000VW\u0005"+
		"n\u0000\u0000WX\u0005t\u0000\u0000X\u001a\u0001\u0000\u0000\u0000YZ\u0005"+
		"m\u0000\u0000Z[\u0005e\u0000\u0000[\\\u0005d\u0000\u0000\\\u001c\u0001"+
		"\u0000\u0000\u0000]^\u0005s\u0000\u0000^_\u0005e\u0000\u0000_`\u0005c"+
		"\u0000\u0000`a\u0005m\u0000\u0000ab\u0005i\u0000\u0000bc\u0005n\u0000"+
		"\u0000c\u001e\u0001\u0000\u0000\u0000de\u0005s\u0000\u0000ef\u0005e\u0000"+
		"\u0000fg\u0005c\u0000\u0000gh\u0005m\u0000\u0000hi\u0005a\u0000\u0000"+
		"ij\u0005x\u0000\u0000j \u0001\u0000\u0000\u0000ko\u0007\u0002\u0000\u0000"+
		"ln\u0007\u0003\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\"\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000rt\u0007\u0004\u0000\u0000sr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0006\u0011\u0000"+
		"\u0000x$\u0001\u0000\u0000\u0000\u0005\u000047ou\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}