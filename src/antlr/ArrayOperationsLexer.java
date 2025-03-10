// Generated from /home/yanissou/r6a08/harkatiy-projet/src/antlr/ArrayOperations.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArrayOperationsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT=6, SUM=7, PROD=8, MAX=9, MIN=10, 
		SORT=11, ARRAY_TYPE=12, INT_TYPE=13, ID=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "INT", "SUM", "PROD", "MAX", 
			"MIN", "SORT", "ARRAY_TYPE", "INT_TYPE", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'['", "','", "']'", null, "'sum'", "'prod'", "'max'", 
			"'min'", "'sort'", "'array'", "'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "INT", "SUM", "PROD", "MAX", "MIN", 
			"SORT", "ARRAY_TYPE", "INT_TYPE", "ID", "WS"
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
		"\u0004\u0000\u000fa\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005-\b\u0005\n\u0005\f\u00050\t\u0005\u0003\u00052\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\rV\b\r\n\r\f\rY\t\r\u0001"+
		"\u000e\u0004\u000e\\\b\u000e\u000b\u000e\f\u000e]\u0001\u000e\u0001\u000e"+
		"\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u0001\u0000\u0005\u0001\u000019\u0001\u0000"+
		"09\u0001\u0000az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  d\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003!\u0001\u0000\u0000"+
		"\u0000\u0005#\u0001\u0000\u0000\u0000\u0007%\u0001\u0000\u0000\u0000\t"+
		"\'\u0001\u0000\u0000\u0000\u000b1\u0001\u0000\u0000\u0000\r3\u0001\u0000"+
		"\u0000\u0000\u000f7\u0001\u0000\u0000\u0000\u0011<\u0001\u0000\u0000\u0000"+
		"\u0013@\u0001\u0000\u0000\u0000\u0015D\u0001\u0000\u0000\u0000\u0017I"+
		"\u0001\u0000\u0000\u0000\u0019O\u0001\u0000\u0000\u0000\u001bS\u0001\u0000"+
		"\u0000\u0000\u001d[\u0001\u0000\u0000\u0000\u001f \u0005;\u0000\u0000"+
		" \u0002\u0001\u0000\u0000\u0000!\"\u0005=\u0000\u0000\"\u0004\u0001\u0000"+
		"\u0000\u0000#$\u0005[\u0000\u0000$\u0006\u0001\u0000\u0000\u0000%&\u0005"+
		",\u0000\u0000&\b\u0001\u0000\u0000\u0000\'(\u0005]\u0000\u0000(\n\u0001"+
		"\u0000\u0000\u0000)2\u00050\u0000\u0000*.\u0007\u0000\u0000\u0000+-\u0007"+
		"\u0001\u0000\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u00001)\u0001\u0000\u0000\u00001*\u0001\u0000"+
		"\u0000\u00002\f\u0001\u0000\u0000\u000034\u0005s\u0000\u000045\u0005u"+
		"\u0000\u000056\u0005m\u0000\u00006\u000e\u0001\u0000\u0000\u000078\u0005"+
		"p\u0000\u000089\u0005r\u0000\u00009:\u0005o\u0000\u0000:;\u0005d\u0000"+
		"\u0000;\u0010\u0001\u0000\u0000\u0000<=\u0005m\u0000\u0000=>\u0005a\u0000"+
		"\u0000>?\u0005x\u0000\u0000?\u0012\u0001\u0000\u0000\u0000@A\u0005m\u0000"+
		"\u0000AB\u0005i\u0000\u0000BC\u0005n\u0000\u0000C\u0014\u0001\u0000\u0000"+
		"\u0000DE\u0005s\u0000\u0000EF\u0005o\u0000\u0000FG\u0005r\u0000\u0000"+
		"GH\u0005t\u0000\u0000H\u0016\u0001\u0000\u0000\u0000IJ\u0005a\u0000\u0000"+
		"JK\u0005r\u0000\u0000KL\u0005r\u0000\u0000LM\u0005a\u0000\u0000MN\u0005"+
		"y\u0000\u0000N\u0018\u0001\u0000\u0000\u0000OP\u0005i\u0000\u0000PQ\u0005"+
		"n\u0000\u0000QR\u0005t\u0000\u0000R\u001a\u0001\u0000\u0000\u0000SW\u0007"+
		"\u0002\u0000\u0000TV\u0007\u0003\u0000\u0000UT\u0001\u0000\u0000\u0000"+
		"VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000X\u001c\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z\\\u0007"+
		"\u0004\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_`\u0006\u000e\u0000\u0000`\u001e\u0001\u0000\u0000\u0000\u0005"+
		"\u0000.1W]\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}