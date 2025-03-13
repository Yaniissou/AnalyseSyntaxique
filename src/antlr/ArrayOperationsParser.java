// Generated from D:/Projets/AnalyseSyntaxique/src/antlr/ArrayOperations.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArrayOperationsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT=6, SUM=7, PROD=8, MAX=9, MIN=10, 
		SORT=11, ARRAY_TYPE=12, INT_TYPE=13, MED=14, SECMIN=15, SECMAX=16, ID=17, 
		WS=18;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_simpleop = 2, RULE_vardecl = 3, 
		RULE_affectation = 4, RULE_varout = 5, RULE_array = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "simpleop", "vardecl", "affectation", "varout", 
			"array"
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

	@Override
	public String getGrammarFileName() { return "ArrayOperations.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArrayOperationsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ArrayOperationsParser.EOF, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				instruction();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 262016L) != 0) );
			setState(19);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VardeclinstructionContext extends InstructionContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public VardeclinstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterVardeclinstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitVardeclinstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitVardeclinstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AffectationinstructionContext extends InstructionContext {
		public AffectationContext affectation() {
			return getRuleContext(AffectationContext.class,0);
		}
		public AffectationinstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterAffectationinstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitAffectationinstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitAffectationinstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleopinstructionContext extends InstructionContext {
		public SimpleopContext simpleop() {
			return getRuleContext(SimpleopContext.class,0);
		}
		public SimpleopinstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterSimpleopinstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitSimpleopinstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitSimpleopinstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VaroutinstructionContext extends InstructionContext {
		public VaroutContext varout() {
			return getRuleContext(VaroutContext.class,0);
		}
		public VaroutinstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterVaroutinstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitVaroutinstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitVaroutinstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new SimpleopinstructionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				simpleop();
				}
				break;
			case 2:
				_localctx = new VardeclinstructionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				vardecl();
				}
				break;
			case 3:
				_localctx = new AffectationinstructionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				affectation();
				}
				break;
			case 4:
				_localctx = new VaroutinstructionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(24);
				varout();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleopContext extends ParserRuleContext {
		public SimpleopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleop; }
	 
		public SimpleopContext() { }
		public void copyFrom(SimpleopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProdContext extends SimpleopContext {
		public TerminalNode PROD() { return getToken(ArrayOperationsParser.PROD, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ProdContext(SimpleopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterProd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitProd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitProd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinContext extends SimpleopContext {
		public TerminalNode MIN() { return getToken(ArrayOperationsParser.MIN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MinContext(SimpleopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitMin(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaxContext extends SimpleopContext {
		public TerminalNode MAX() { return getToken(ArrayOperationsParser.MAX, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MaxContext(SimpleopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitMax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitMax(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SecmaxContext extends SimpleopContext {
		public TerminalNode SECMAX() { return getToken(ArrayOperationsParser.SECMAX, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public SecmaxContext(SimpleopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterSecmax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitSecmax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitSecmax(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumContext extends SimpleopContext {
		public TerminalNode SUM() { return getToken(ArrayOperationsParser.SUM, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public SumContext(SimpleopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SecminContext extends SimpleopContext {
		public TerminalNode SECMIN() { return getToken(ArrayOperationsParser.SECMIN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public SecminContext(SimpleopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterSecmin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitSecmin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitSecmin(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SortContext extends SimpleopContext {
		public TerminalNode SORT() { return getToken(ArrayOperationsParser.SORT, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public SortContext(SimpleopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitSort(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MedContext extends SimpleopContext {
		public TerminalNode MED() { return getToken(ArrayOperationsParser.MED, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MedContext(SimpleopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterMed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitMed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitMed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleopContext simpleop() throws RecognitionException {
		SimpleopContext _localctx = new SimpleopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleop);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
				_localctx = new SumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(SUM);
				setState(28);
				array();
				setState(29);
				match(T__0);
				}
				break;
			case PROD:
				_localctx = new ProdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(PROD);
				setState(32);
				array();
				setState(33);
				match(T__0);
				}
				break;
			case MAX:
				_localctx = new MaxContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				match(MAX);
				setState(36);
				array();
				setState(37);
				match(T__0);
				}
				break;
			case MIN:
				_localctx = new MinContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				match(MIN);
				setState(40);
				array();
				setState(41);
				match(T__0);
				}
				break;
			case SORT:
				_localctx = new SortContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				match(SORT);
				setState(44);
				array();
				setState(45);
				match(T__0);
				}
				break;
			case MED:
				_localctx = new MedContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				match(MED);
				setState(48);
				array();
				setState(49);
				match(T__0);
				}
				break;
			case SECMIN:
				_localctx = new SecminContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				match(SECMIN);
				setState(52);
				array();
				setState(53);
				match(T__0);
				}
				break;
			case SECMAX:
				_localctx = new SecmaxContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(55);
				match(SECMAX);
				setState(56);
				array();
				setState(57);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VardeclContext extends ParserRuleContext {
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
	 
		public VardeclContext() { }
		public void copyFrom(VardeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarintContext extends VardeclContext {
		public TerminalNode INT_TYPE() { return getToken(ArrayOperationsParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public VarintContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterVarint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitVarint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitVarint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InitvarintContext extends VardeclContext {
		public TerminalNode INT_TYPE() { return getToken(ArrayOperationsParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public TerminalNode INT() { return getToken(ArrayOperationsParser.INT, 0); }
		public InitvarintContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterInitvarint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitInitvarint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitInitvarint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InitvararrayContext extends VardeclContext {
		public TerminalNode ARRAY_TYPE() { return getToken(ArrayOperationsParser.ARRAY_TYPE, 0); }
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public InitvararrayContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterInitvararray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitInitvararray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitInitvararray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VararrayContext extends VardeclContext {
		public TerminalNode ARRAY_TYPE() { return getToken(ArrayOperationsParser.ARRAY_TYPE, 0); }
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public VararrayContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterVararray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitVararray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitVararray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardecl);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new VararrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(ARRAY_TYPE);
				setState(62);
				match(ID);
				setState(63);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new InitvararrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(ARRAY_TYPE);
				setState(65);
				match(ID);
				setState(66);
				match(T__1);
				setState(67);
				array();
				setState(68);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new VarintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(INT_TYPE);
				setState(71);
				match(ID);
				setState(72);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new InitvarintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(INT_TYPE);
				setState(74);
				match(ID);
				setState(75);
				match(T__1);
				setState(76);
				match(INT);
				setState(77);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AffectationContext extends ParserRuleContext {
		public AffectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectation; }
	 
		public AffectationContext() { }
		public void copyFrom(AffectationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AffectsimpleopContext extends AffectationContext {
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public SimpleopContext simpleop() {
			return getRuleContext(SimpleopContext.class,0);
		}
		public AffectsimpleopContext(AffectationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterAffectsimpleop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitAffectsimpleop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitAffectsimpleop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AffectarrayContext extends AffectationContext {
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public AffectarrayContext(AffectationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterAffectarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitAffectarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitAffectarray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AffectintContext extends AffectationContext {
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public TerminalNode INT() { return getToken(ArrayOperationsParser.INT, 0); }
		public AffectintContext(AffectationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterAffectint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitAffectint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitAffectint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffectationContext affectation() throws RecognitionException {
		AffectationContext _localctx = new AffectationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_affectation);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AffectsimpleopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(ID);
				setState(81);
				match(T__1);
				setState(82);
				simpleop();
				}
				break;
			case 2:
				_localctx = new AffectarrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(ID);
				setState(84);
				match(T__1);
				setState(85);
				array();
				setState(86);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new AffectintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(ID);
				setState(89);
				match(T__1);
				setState(90);
				match(INT);
				setState(91);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VaroutContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public VaroutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterVarout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitVarout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitVarout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VaroutContext varout() throws RecognitionException {
		VaroutContext _localctx = new VaroutContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(ID);
			setState(95);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(ArrayOperationsParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ArrayOperationsParser.INT, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayOperationsListener ) ((ArrayOperationsListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__2);
			setState(98);
			match(INT);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(99);
				match(T__3);
				setState(100);
				match(INT);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012m\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0004\u0000\u0010"+
		"\b\u0000\u000b\u0000\f\u0000\u0011\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004]\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006f\b\u0006\n\u0006\f\u0006i\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n"+
		"\f\u0000\u0000v\u0000\u000f\u0001\u0000\u0000\u0000\u0002\u0019\u0001"+
		"\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000\u0006N\u0001\u0000\u0000"+
		"\u0000\b\\\u0001\u0000\u0000\u0000\n^\u0001\u0000\u0000\u0000\fa\u0001"+
		"\u0000\u0000\u0000\u000e\u0010\u0003\u0002\u0001\u0000\u000f\u000e\u0001"+
		"\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u000f\u0001"+
		"\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0013\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0005\u0000\u0000\u0001\u0014\u0001\u0001"+
		"\u0000\u0000\u0000\u0015\u001a\u0003\u0004\u0002\u0000\u0016\u001a\u0003"+
		"\u0006\u0003\u0000\u0017\u001a\u0003\b\u0004\u0000\u0018\u001a\u0003\n"+
		"\u0005\u0000\u0019\u0015\u0001\u0000\u0000\u0000\u0019\u0016\u0001\u0000"+
		"\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u0018\u0001\u0000"+
		"\u0000\u0000\u001a\u0003\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0007"+
		"\u0000\u0000\u001c\u001d\u0003\f\u0006\u0000\u001d\u001e\u0005\u0001\u0000"+
		"\u0000\u001e<\u0001\u0000\u0000\u0000\u001f \u0005\b\u0000\u0000 !\u0003"+
		"\f\u0006\u0000!\"\u0005\u0001\u0000\u0000\"<\u0001\u0000\u0000\u0000#"+
		"$\u0005\t\u0000\u0000$%\u0003\f\u0006\u0000%&\u0005\u0001\u0000\u0000"+
		"&<\u0001\u0000\u0000\u0000\'(\u0005\n\u0000\u0000()\u0003\f\u0006\u0000"+
		")*\u0005\u0001\u0000\u0000*<\u0001\u0000\u0000\u0000+,\u0005\u000b\u0000"+
		"\u0000,-\u0003\f\u0006\u0000-.\u0005\u0001\u0000\u0000.<\u0001\u0000\u0000"+
		"\u0000/0\u0005\u000e\u0000\u000001\u0003\f\u0006\u000012\u0005\u0001\u0000"+
		"\u00002<\u0001\u0000\u0000\u000034\u0005\u000f\u0000\u000045\u0003\f\u0006"+
		"\u000056\u0005\u0001\u0000\u00006<\u0001\u0000\u0000\u000078\u0005\u0010"+
		"\u0000\u000089\u0003\f\u0006\u00009:\u0005\u0001\u0000\u0000:<\u0001\u0000"+
		"\u0000\u0000;\u001b\u0001\u0000\u0000\u0000;\u001f\u0001\u0000\u0000\u0000"+
		";#\u0001\u0000\u0000\u0000;\'\u0001\u0000\u0000\u0000;+\u0001\u0000\u0000"+
		"\u0000;/\u0001\u0000\u0000\u0000;3\u0001\u0000\u0000\u0000;7\u0001\u0000"+
		"\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=>\u0005\f\u0000\u0000>?\u0005"+
		"\u0011\u0000\u0000?O\u0005\u0001\u0000\u0000@A\u0005\f\u0000\u0000AB\u0005"+
		"\u0011\u0000\u0000BC\u0005\u0002\u0000\u0000CD\u0003\f\u0006\u0000DE\u0005"+
		"\u0001\u0000\u0000EO\u0001\u0000\u0000\u0000FG\u0005\r\u0000\u0000GH\u0005"+
		"\u0011\u0000\u0000HO\u0005\u0001\u0000\u0000IJ\u0005\r\u0000\u0000JK\u0005"+
		"\u0011\u0000\u0000KL\u0005\u0002\u0000\u0000LM\u0005\u0006\u0000\u0000"+
		"MO\u0005\u0001\u0000\u0000N=\u0001\u0000\u0000\u0000N@\u0001\u0000\u0000"+
		"\u0000NF\u0001\u0000\u0000\u0000NI\u0001\u0000\u0000\u0000O\u0007\u0001"+
		"\u0000\u0000\u0000PQ\u0005\u0011\u0000\u0000QR\u0005\u0002\u0000\u0000"+
		"R]\u0003\u0004\u0002\u0000ST\u0005\u0011\u0000\u0000TU\u0005\u0002\u0000"+
		"\u0000UV\u0003\f\u0006\u0000VW\u0005\u0001\u0000\u0000W]\u0001\u0000\u0000"+
		"\u0000XY\u0005\u0011\u0000\u0000YZ\u0005\u0002\u0000\u0000Z[\u0005\u0006"+
		"\u0000\u0000[]\u0005\u0001\u0000\u0000\\P\u0001\u0000\u0000\u0000\\S\u0001"+
		"\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000]\t\u0001\u0000\u0000\u0000"+
		"^_\u0005\u0011\u0000\u0000_`\u0005\u0001\u0000\u0000`\u000b\u0001\u0000"+
		"\u0000\u0000ab\u0005\u0003\u0000\u0000bg\u0005\u0006\u0000\u0000cd\u0005"+
		"\u0004\u0000\u0000df\u0005\u0006\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005\u0005"+
		"\u0000\u0000k\r\u0001\u0000\u0000\u0000\u0006\u0011\u0019;N\\g";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}