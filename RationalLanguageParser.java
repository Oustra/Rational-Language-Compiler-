// Generated from RationalLanguage.g4 by ANTLR 4.13.1

    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RationalLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, WS=35, SEMICOLON=36, AS=37, MD=38, NEWLINE=39, 
		TYPE=40, ID=41, BOOL=42, INT=43, UNMATCH=44;
	public static final int
		RULE_calcul = 0, RULE_finInstruction = 1, RULE_declaration = 2, RULE_instruction = 3, 
		RULE_expression = 4, RULE_integer = 5, RULE_rationnel = 6, RULE_booleen = 7, 
		RULE_variable = 8, RULE_exprC = 9, RULE_condition = 10, RULE_expT = 11, 
		RULE_terinary = 12, RULE_boucle = 13, RULE_blocInstructions = 14, RULE_finboucle = 15, 
		RULE_operations = 16, RULE_expI = 17, RULE_function = 18, RULE_affectation = 19, 
		RULE_exprA = 20, RULE_afficher = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"calcul", "finInstruction", "declaration", "instruction", "expression", 
			"integer", "rationnel", "booleen", "variable", "exprC", "condition", 
			"expT", "terinary", "boucle", "blocInstructions", "finboucle", "operations", 
			"expI", "function", "affectation", "exprA", "afficher"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'not'", "' and '", "' or '", "'true'", "'false'", "'('", 
			"')'", "'?'", "':'", "'repeter'", "'jusque'", "'{\\n'", "'\\n}'", "'*'", 
			"'['", "']'", "'**'", "'[+'", "'+]'", "'[-'", "'-]'", "'%'", "'=='", 
			"'>'", "'<'", "'<>'", "'<='", "'>='", "'pgcd('", "','", "'ppcm('", "'='", 
			"'afficher('", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "WS", 
			"SEMICOLON", "AS", "MD", "NEWLINE", "TYPE", "ID", "BOOL", "INT", "UNMATCH"
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
	public String getGrammarFileName() { return "RationalLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    HashMap<String, Info> t = new HashMap<>();
	    int sp = 0;
	    int label = 0;
	    int opCounter = 0;

	class Info {
	    Integer add;
	    String type;
	    Integer adds;

	    public Info(Integer add, Integer adds, String type) {
	        this.add = add;
	        this.type = type;
	        this.adds = adds;
	    }
	}

	    public String P;

	public RationalLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalculContext extends ParserRuleContext {
		public String code;
		public DeclarationContext declaration;
		public InstructionContext instruction;
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(RationalLanguageParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(RationalLanguageParser.SEMICOLON, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RationalLanguageParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RationalLanguageParser.NEWLINE, i);
		}
		public CalculContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterCalcul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitCalcul(this);
		}
	}

	public final CalculContext calcul() throws RecognitionException {
		CalculContext _localctx = new CalculContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calcul);
		 ((CalculContext)_localctx).code =  new String(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(44);
				((CalculContext)_localctx).declaration = declaration();
				 _localctx.code += ((CalculContext)_localctx).declaration.code; 
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON || _la==NEWLINE) {
				{
				{
				setState(52);
				_la = _input.LA(1);
				if ( !(_la==SEMICOLON || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11017667545316L) != 0)) {
				{
				{
				setState(58);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code;
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += " HALT\n"; 
			}
			_ctx.stop = _input.LT(-1);
			 System.out.println(_localctx.code); 
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
	public static class FinInstructionContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(RationalLanguageParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(RationalLanguageParser.SEMICOLON, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RationalLanguageParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RationalLanguageParser.NEWLINE, i);
		}
		public FinInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterFinInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitFinInstruction(this);
		}
	}

	public final FinInstructionContext finInstruction() throws RecognitionException {
		FinInstructionContext _localctx = new FinInstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_finInstruction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(68);
					match(SEMICOLON);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(71); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(73);
					match(NEWLINE);
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
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
	public static class DeclarationContext extends ParserRuleContext {
		public String code;
		public Token a;
		public Token b;
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(RationalLanguageParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(RationalLanguageParser.ID, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((DeclarationContext)_localctx).a = match(TYPE);
			setState(80);
			((DeclarationContext)_localctx).b = match(ID);
			setState(81);
			finInstruction();

			        ((DeclarationContext)_localctx).code =  "PUSHI 0\n"; // Default initialization
			        if ((((DeclarationContext)_localctx).a!=null?((DeclarationContext)_localctx).a.getText():null).equals("float"))
			        {
			            _localctx.code += "PUSHI 0\n";
			            Info obj = new Info(sp++,sp++,(((DeclarationContext)_localctx).a!=null?((DeclarationContext)_localctx).a.getText():null));
			            t.put((((DeclarationContext)_localctx).b!=null?((DeclarationContext)_localctx).b.getText():null), obj);
			        }
			        else 
			        {
			            Info obj = new Info(sp++,-1, (((DeclarationContext)_localctx).a!=null?((DeclarationContext)_localctx).a.getText():null));
			            t.put((((DeclarationContext)_localctx).b!=null?((DeclarationContext)_localctx).b.getText():null), obj);    
			        }
			        opCounter = sp;
			    
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
		public String code;
		public AffectationContext affectation;
		public OperationsContext operations;
		public AfficherContext afficher;
		public TerinaryContext terinary;
		public BoucleContext boucle;
		public ExprCContext exprC;
		public FunctionContext function;
		public AffectationContext affectation() {
			return getRuleContext(AffectationContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public AfficherContext afficher() {
			return getRuleContext(AfficherContext.class,0);
		}
		public TerinaryContext terinary() {
			return getRuleContext(TerinaryContext.class,0);
		}
		public BoucleContext boucle() {
			return getRuleContext(BoucleContext.class,0);
		}
		public ExprCContext exprC() {
			return getRuleContext(ExprCContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((InstructionContext)_localctx).affectation = affectation();
				setState(85);
				finInstruction();
				 ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).affectation.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				((InstructionContext)_localctx).operations = operations(0);
				setState(89);
				finInstruction();
				 ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).operations.code; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				((InstructionContext)_localctx).afficher = afficher();
				setState(93);
				finInstruction();
				 ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).afficher.code;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				((InstructionContext)_localctx).terinary = terinary();
				setState(97);
				finInstruction();
				 ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).terinary.code; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				((InstructionContext)_localctx).boucle = boucle();
				setState(101);
				finInstruction();
				 ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).boucle.code; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				((InstructionContext)_localctx).exprC = exprC();
				 ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).exprC.code; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				((InstructionContext)_localctx).function = function();
				setState(108);
				finInstruction();
				 ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).function.code; 
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
	public static class ExpressionContext extends ParserRuleContext {
		public Integer num;
		public Integer denum;
		public String type;
		public Boolean declared;
		public RationnelContext a;
		public IntegerContext b;
		public VariableContext c;
		public RationnelContext rationnel() {
			return getRuleContext(RationnelContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((ExpressionContext)_localctx).a = rationnel();
				 ((ExpressionContext)_localctx).num =  ((ExpressionContext)_localctx).a.num; ((ExpressionContext)_localctx).denum =  ((ExpressionContext)_localctx).a.denum; ((ExpressionContext)_localctx).type =  ((ExpressionContext)_localctx).a.type; ((ExpressionContext)_localctx).declared =  ((ExpressionContext)_localctx).a.declared;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				((ExpressionContext)_localctx).b = integer();
				 ((ExpressionContext)_localctx).num =  ((ExpressionContext)_localctx).b.num; ((ExpressionContext)_localctx).denum =  ((ExpressionContext)_localctx).b.denum; ((ExpressionContext)_localctx).type =  ((ExpressionContext)_localctx).b.type; ((ExpressionContext)_localctx).declared =  ((ExpressionContext)_localctx).b.declared;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				((ExpressionContext)_localctx).c = variable();
				 ((ExpressionContext)_localctx).num =  ((ExpressionContext)_localctx).c.num; ((ExpressionContext)_localctx).denum =  ((ExpressionContext)_localctx).c.denum; ((ExpressionContext)_localctx).type =  ((ExpressionContext)_localctx).c.type; ((ExpressionContext)_localctx).declared =  ((ExpressionContext)_localctx).c.declared;
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
	public static class IntegerContext extends ParserRuleContext {
		public Integer num;
		public Integer denum;
		public String type;
		public Boolean declared;
		public Token a;
		public TerminalNode INT() { return getToken(RationalLanguageParser.INT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			((IntegerContext)_localctx).a = match(INT);

			        ((IntegerContext)_localctx).num =  (((IntegerContext)_localctx).a!=null?Integer.valueOf(((IntegerContext)_localctx).a.getText()):0);
			        ((IntegerContext)_localctx).denum =  1;
			        ((IntegerContext)_localctx).type =  "int";
			        ((IntegerContext)_localctx).declared =  false;
			    
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
	public static class RationnelContext extends ParserRuleContext {
		public Integer num;
		public Integer denum;
		public String type;
		public Boolean declared;
		public IntegerContext a;
		public IntegerContext b;
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public RationnelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rationnel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterRationnel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitRationnel(this);
		}
	}

	public final RationnelContext rationnel() throws RecognitionException {
		RationnelContext _localctx = new RationnelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rationnel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			((RationnelContext)_localctx).a = integer();
			setState(128);
			match(T__0);
			setState(129);
			((RationnelContext)_localctx).b = integer();

			        ((RationnelContext)_localctx).num =  ((RationnelContext)_localctx).a.num;
			        ((RationnelContext)_localctx).denum =  ((RationnelContext)_localctx).b.num;
			        ((RationnelContext)_localctx).type =  "float";
			        ((RationnelContext)_localctx).declared =  false;
			    
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
	public static class BooleenContext extends ParserRuleContext {
		public String code;
		public Token a;
		public TerminalNode BOOL() { return getToken(RationalLanguageParser.BOOL, 0); }
		public BooleenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterBooleen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitBooleen(this);
		}
	}

	public final BooleenContext booleen() throws RecognitionException {
		BooleenContext _localctx = new BooleenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_booleen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			((BooleenContext)_localctx).a = match(BOOL);

			        ((BooleenContext)_localctx).code =  ((((BooleenContext)_localctx).a!=null?((BooleenContext)_localctx).a.getText():null).equals("1")) ?"PUSHI 1\n" : "PUSHI 0\n";
			    
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
	public static class VariableContext extends ParserRuleContext {
		public Integer num;
		public Integer denum;
		public String type;
		public Boolean declared;
		public Token a;
		public TerminalNode ID() { return getToken(RationalLanguageParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((VariableContext)_localctx).a = match(ID);

			        if (t.containsKey((((VariableContext)_localctx).a!=null?((VariableContext)_localctx).a.getText():null))){
			            if (t.get((((VariableContext)_localctx).a!=null?((VariableContext)_localctx).a.getText():null)).type.equals("float"))
			            {
			                ((VariableContext)_localctx).num =  t.get((((VariableContext)_localctx).a!=null?((VariableContext)_localctx).a.getText():null)).adds;
			                ((VariableContext)_localctx).denum =  t.get((((VariableContext)_localctx).a!=null?((VariableContext)_localctx).a.getText():null)).add;
			                ((VariableContext)_localctx).type =  "float";
			                ((VariableContext)_localctx).declared =  true;
			            }
			            else
			            { 
			                ((VariableContext)_localctx).num =  t.get((((VariableContext)_localctx).a!=null?((VariableContext)_localctx).a.getText():null)).add;
			                ((VariableContext)_localctx).denum =  1;
			                ((VariableContext)_localctx).type =  "int";
			                ((VariableContext)_localctx).declared =  true;
			            }
			        }
			        else
			            System.out.println("Variable non declares");
			    
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
	public static class ExprCContext extends ParserRuleContext {
		public String code;
		public ConditionContext a;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExprCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterExprC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitExprC(this);
		}
	}

	public final ExprCContext exprC() throws RecognitionException {
		ExprCContext _localctx = new ExprCContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((ExprCContext)_localctx).a = condition(0);

			        ((ExprCContext)_localctx).code =  ((ExprCContext)_localctx).a.value == 1 ? "PUSHI 1\n" : "PUSHI 0\n"; 
			    
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
	public static class ConditionContext extends ParserRuleContext {
		public Integer value;
		public ConditionContext a;
		public ConditionContext b;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(142);
				match(T__1);
				setState(143);
				((ConditionContext)_localctx).a = condition(6);
				((ConditionContext)_localctx).value =  ((ConditionContext)_localctx).a.value == 0 ? 1 : 0;
				}
				break;
			case T__4:
				{
				setState(146);
				match(T__4);
				((ConditionContext)_localctx).value =  1;
				}
				break;
			case T__5:
				{
				setState(148);
				match(T__5);
				((ConditionContext)_localctx).value =  0;
				}
				break;
			case T__6:
				{
				setState(150);
				match(T__6);
				setState(151);
				((ConditionContext)_localctx).a = condition(0);
				setState(152);
				match(T__7);
				((ConditionContext)_localctx).value =  ((ConditionContext)_localctx).a.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(157);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(158);
						match(T__2);
						setState(159);
						((ConditionContext)_localctx).b = condition(6);
						((ConditionContext)_localctx).value =  ((ConditionContext)_localctx).a.value != 0 && ((ConditionContext)_localctx).b.value != 0 ? 1 : 0;
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(162);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(163);
						match(T__3);
						setState(164);
						((ConditionContext)_localctx).b = condition(5);
						((ConditionContext)_localctx).value =  ((ConditionContext)_localctx).a.value != 0 || ((ConditionContext)_localctx).b.value != 0 ? 1 : 0;
						}
						break;
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpTContext extends ParserRuleContext {
		public String code;
		public AffectationContext b;
		public OperationsContext c;
		public AfficherContext d;
		public TerinaryContext e;
		public BoucleContext f;
		public AffectationContext affectation() {
			return getRuleContext(AffectationContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public AfficherContext afficher() {
			return getRuleContext(AfficherContext.class,0);
		}
		public TerinaryContext terinary() {
			return getRuleContext(TerinaryContext.class,0);
		}
		public BoucleContext boucle() {
			return getRuleContext(BoucleContext.class,0);
		}
		public ExpTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterExpT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitExpT(this);
		}
	}

	public final ExpTContext expT() throws RecognitionException {
		ExpTContext _localctx = new ExpTContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expT);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				((ExpTContext)_localctx).b = affectation();
				 ((ExpTContext)_localctx).code =  ((ExpTContext)_localctx).b.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				((ExpTContext)_localctx).c = operations(0);
				 ((ExpTContext)_localctx).code =  ((ExpTContext)_localctx).c.code; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				((ExpTContext)_localctx).d = afficher();
				((ExpTContext)_localctx).code =  ((ExpTContext)_localctx).d.code; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				((ExpTContext)_localctx).e = terinary();
				 ((ExpTContext)_localctx).code =  ((ExpTContext)_localctx).e.code; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				((ExpTContext)_localctx).f = boucle();
				 ((ExpTContext)_localctx).code =  ((ExpTContext)_localctx).f.code; 
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
	public static class TerinaryContext extends ParserRuleContext {
		public String code;
		public ExprCContext a;
		public ExpTContext b;
		public ExpTContext c;
		public ExprCContext exprC() {
			return getRuleContext(ExprCContext.class,0);
		}
		public List<ExpTContext> expT() {
			return getRuleContexts(ExpTContext.class);
		}
		public ExpTContext expT(int i) {
			return getRuleContext(ExpTContext.class,i);
		}
		public TerinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terinary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterTerinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitTerinary(this);
		}
	}

	public final TerinaryContext terinary() throws RecognitionException {
		TerinaryContext _localctx = new TerinaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_terinary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			((TerinaryContext)_localctx).a = exprC();
			setState(190);
			match(T__8);
			setState(191);
			((TerinaryContext)_localctx).b = expT();
			setState(192);
			match(T__9);
			setState(193);
			((TerinaryContext)_localctx).c = expT();

			        ((TerinaryContext)_localctx).code =  ((TerinaryContext)_localctx).a.code;
			        _localctx.code += "JUMPF " + (label + 1) + "\n";
			        _localctx.code += "LABEL " + label++ + "\n";
			        _localctx.code += ((TerinaryContext)_localctx).b.code;
			        _localctx.code += "JUMP " + (label + 1) + "\n";
			        _localctx.code += "LABEL " + label++ + "\n";
			        _localctx.code += ((TerinaryContext)_localctx).c.code;
			        _localctx.code += "LABEL " + label++ + "\n";
			    
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
	public static class BoucleContext extends ParserRuleContext {
		public String code;
		public BlocInstructionsContext a;
		public FinboucleContext b;
		public BlocInstructionsContext blocInstructions() {
			return getRuleContext(BlocInstructionsContext.class,0);
		}
		public FinboucleContext finboucle() {
			return getRuleContext(FinboucleContext.class,0);
		}
		public BoucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterBoucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitBoucle(this);
		}
	}

	public final BoucleContext boucle() throws RecognitionException {
		BoucleContext _localctx = new BoucleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boucle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__10);
			setState(197);
			((BoucleContext)_localctx).a = blocInstructions();
			setState(198);
			match(T__11);
			setState(199);
			((BoucleContext)_localctx).b = finboucle();

			        ((BoucleContext)_localctx).code =  "LABEL " + label++ + "\n";
			        _localctx.code += ((BoucleContext)_localctx).a.code;    
			        _localctx.code += ((BoucleContext)_localctx).b.code;
			        _localctx.code += "JUMPF " + (label) + "\n";
			        _localctx.code += "JUMP " + (label - 1) + "\n";
			        _localctx.code += "LABEL " + (label++) + "\n";
			    
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
	public static class BlocInstructionsContext extends ParserRuleContext {
		public String code;
		public InstructionContext a;
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlocInstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocInstructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterBlocInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitBlocInstructions(this);
		}
	}

	public final BlocInstructionsContext blocInstructions() throws RecognitionException {
		BlocInstructionsContext _localctx = new BlocInstructionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blocInstructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__12);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11017667545316L) != 0)) {
				{
				{
				setState(203);
				((BlocInstructionsContext)_localctx).a = instruction();
				 _localctx.code += "# haaadi lbdya dl instruction \n" + ((BlocInstructionsContext)_localctx).a.code + "# haaadi lmsalia instruction \n"; 
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(T__13);

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
	public static class FinboucleContext extends ParserRuleContext {
		public String code;
		public ExprCContext exprC;
		public OperationsContext operations;
		public ExprCContext exprC() {
			return getRuleContext(ExprCContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public FinboucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finboucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterFinboucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitFinboucle(this);
		}
	}

	public final FinboucleContext finboucle() throws RecognitionException {
		FinboucleContext _localctx = new FinboucleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_finboucle);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				((FinboucleContext)_localctx).exprC = exprC();

				        ((FinboucleContext)_localctx).code =  ((FinboucleContext)_localctx).exprC.code;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(T__5);
				 ((FinboucleContext)_localctx).code =  "PUSHI 0\n";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				((FinboucleContext)_localctx).operations = operations(0);
				 ((FinboucleContext)_localctx).code =  ((FinboucleContext)_localctx).operations.code; 
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
	public static class OperationsContext extends ParserRuleContext {
		public String code;
		public Integer num;
		public Integer denum;
		public Boolean declared;
		public String type;
		public OperationsContext a;
		public ExpressionContext c;
		public Token MD;
		public OperationsContext b;
		public Token AS;
		public Token OP;
		public List<OperationsContext> operations() {
			return getRuleContexts(OperationsContext.class);
		}
		public OperationsContext operations(int i) {
			return getRuleContext(OperationsContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(RationalLanguageParser.AS, 0); }
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitOperations(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		return operations(0);
	}

	private OperationsContext operations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationsContext _localctx = new OperationsContext(_ctx, _parentState);
		OperationsContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_operations, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(225);
				match(T__6);
				setState(226);
				((OperationsContext)_localctx).a = operations(0);
				setState(227);
				match(T__7);

				        ((OperationsContext)_localctx).code =  ((OperationsContext)_localctx).a.code;
				        ((OperationsContext)_localctx).denum =  ((OperationsContext)_localctx).a.denum;
				        ((OperationsContext)_localctx).num =  ((OperationsContext)_localctx).a.num;
				        ((OperationsContext)_localctx).type =  ((OperationsContext)_localctx).a.type;
				        ((OperationsContext)_localctx).declared =  ((OperationsContext)_localctx).a.declared;
				    
				}
				break;
			case ID:
			case INT:
				{
				setState(230);
				((OperationsContext)_localctx).c = expression();

				        ((OperationsContext)_localctx).code =  "";
				        ((OperationsContext)_localctx).denum =  ((OperationsContext)_localctx).c.denum;
				        ((OperationsContext)_localctx).num =  ((OperationsContext)_localctx).c.num;
				        ((OperationsContext)_localctx).type =  ((OperationsContext)_localctx).c.type;
				        ((OperationsContext)_localctx).declared =  ((OperationsContext)_localctx).c.declared;    
				    
				}
				break;
			case T__15:
				{
				setState(233);
				match(T__15);
				setState(234);
				((OperationsContext)_localctx).a = operations(0);
				setState(235);
				match(T__16);

				        ((OperationsContext)_localctx).code =  "";
				        if (!((OperationsContext)_localctx).a.code.isEmpty())
				            _localctx.code += ((OperationsContext)_localctx).a.code;
				        P = !((OperationsContext)_localctx).a.declared ? "I" : "G";
				        _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).a.num + "\n";
				        _localctx.code += "PUSHI 100\n";
				        _localctx.code += "MUL\n";
				        _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).a.denum + "\n";
				        _localctx.code += "DIV\n";
				        _localctx.code += "PUSHI 50\n";
				        _localctx.code += "ADD\n";
				        _localctx.code += "PUSHI 100\n";
				        _localctx.code += "DIV\n";
				        ((OperationsContext)_localctx).denum =  ((OperationsContext)_localctx).a.denum; 
				        ((OperationsContext)_localctx).num =  ((OperationsContext)_localctx).a.num;
				        ((OperationsContext)_localctx).type =  ((OperationsContext)_localctx).a.type;
				        ((OperationsContext)_localctx).declared =  ((OperationsContext)_localctx).a.declared;
				    
				}
				break;
			case T__18:
				{
				setState(238);
				match(T__18);
				setState(239);
				((OperationsContext)_localctx).a = operations(0);
				setState(240);
				match(T__19);

				        ((OperationsContext)_localctx).code =  "";
				        if (!((OperationsContext)_localctx).a.code.isEmpty())
				            _localctx.code += ((OperationsContext)_localctx).a.code;
				        P = !((OperationsContext)_localctx).a.declared ? "I" : "G";
				        _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).a.num + "\n";
				        _localctx.code += "PUSHI 100\n";
				        _localctx.code += "MUL\n";
				        _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).a.denum + "\n";
				        _localctx.code += "DIV\n";
				        _localctx.code += "PUSHI 99\n";
				        _localctx.code += "ADD\n";
				        _localctx.code += "PUSHI 100\n";
				        _localctx.code += "DIV\n";
				        ((OperationsContext)_localctx).denum =  ((OperationsContext)_localctx).a.denum; 
				        ((OperationsContext)_localctx).num =  ((OperationsContext)_localctx).a.num;
				        ((OperationsContext)_localctx).type =  ((OperationsContext)_localctx).a.type;
				        ((OperationsContext)_localctx).declared =  ((OperationsContext)_localctx).a.declared;
				    
				}
				break;
			case T__20:
				{
				setState(243);
				match(T__20);
				setState(244);
				((OperationsContext)_localctx).a = operations(0);
				setState(245);
				match(T__21);

				        ((OperationsContext)_localctx).code =  "";
				        if (!((OperationsContext)_localctx).a.code.isEmpty())
				            _localctx.code += ((OperationsContext)_localctx).a.code;
				        P = !((OperationsContext)_localctx).a.declared ? "I" : "G";
				        _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).a.num + "\n";
				        _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).a.denum + "\n";
				        _localctx.code += "DIV\n";
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new OperationsContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operations);
						setState(250);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(251);
						((OperationsContext)_localctx).MD = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__14) ) {
							((OperationsContext)_localctx).MD = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(252);
						((OperationsContext)_localctx).b = operations(11);

						                      ((OperationsContext)_localctx).code =  "";
						                      if (!((OperationsContext)_localctx).a.code.isEmpty())
						                          _localctx.code += ((OperationsContext)_localctx).a.code;
						                      if (!((OperationsContext)_localctx).b.code.isEmpty())
						                          _localctx.code += ((OperationsContext)_localctx).b.code;
						                      
						                      P =  (!((OperationsContext)_localctx).a.declared || ((OperationsContext)_localctx).a.type.equals("int")) ? "I" : "G" ;
						                      _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).a.num + "\n";
						                      if ((((OperationsContext)_localctx).MD!=null?((OperationsContext)_localctx).MD.getText():null).equals("*")){
						                          P = !((OperationsContext)_localctx).b.declared || ((OperationsContext)_localctx).b.type.equals("int") ? "I" : "G";
						                          _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).b.num + "\n";
						                      }
						                      else{
						                          P = !((OperationsContext)_localctx).b.declared ? "I" : "G";
						                          _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).b.denum + "\n";
						                      }
						                      _localctx.code += "MUL\n";
						                      
						                      P = !((OperationsContext)_localctx).a.declared ? "I" : "G";
						                      _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).a.denum + "\n";
						                      if ((((OperationsContext)_localctx).MD!=null?((OperationsContext)_localctx).MD.getText():null).equals("*")){
						                          P = !((OperationsContext)_localctx).b.declared ? "I" : "G";
						                          _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).b.denum + "\n";
						                      }
						                      else{
						                          P = !((OperationsContext)_localctx).b.declared || ((OperationsContext)_localctx).b.type.equals("int") ? "I" : "G";
						                          _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).b.num + "\n";
						                      }
						                      _localctx.code += "MUL\n";
						                      

						                      ((OperationsContext)_localctx).denum =  opCounter++;
						                      ((OperationsContext)_localctx).num =  opCounter++;
						                      ((OperationsContext)_localctx).type =  "float";
						                      ((OperationsContext)_localctx).declared =  true;
						                      if (opCounter > sp + 3)
						                          opCounter = sp + 1;
						              
						}
						break;
					case 2:
						{
						_localctx = new OperationsContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operations);
						setState(255);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(256);
						((OperationsContext)_localctx).AS = match(AS);
						setState(257);
						((OperationsContext)_localctx).b = operations(10);

						                      ((OperationsContext)_localctx).code =  "";
						                      if (!((OperationsContext)_localctx).a.code.isEmpty())
						                          _localctx.code += ((OperationsContext)_localctx).a.code;
						                      if (!((OperationsContext)_localctx).b.code.isEmpty())
						                          _localctx.code += ((OperationsContext)_localctx).b.code;
						              
						                      P = (!((OperationsContext)_localctx).b.declared || ((OperationsContext)_localctx).b.type.equals("int")) ? "I" : "G";
						                      _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).b.denum + "\n";
						                      P = !((OperationsContext)_localctx).a.declared ? "I" : "G";
						                      _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).a.num + "\n";
						                      _localctx.code += "MUL\n";
						                      P = !((OperationsContext)_localctx).b.declared ? "I" : "G";
						                      _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).b.num + "\n";
						                      P = (!((OperationsContext)_localctx).a.declared || ((OperationsContext)_localctx).a.type.equals("int")) ? "I" : "G";
						                      _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).a.denum + "\n";
						                      _localctx.code += "MUL\n";
						                      if ((((OperationsContext)_localctx).AS!=null?((OperationsContext)_localctx).AS.getText():null).equals("+"))
						                          _localctx.code += "ADD\n";
						                      else
						                          _localctx.code += "SUB\n";

						                      P = (!((OperationsContext)_localctx).a.declared || ((OperationsContext)_localctx).a.type.equals("int")) ? "I" : "G";
						                      _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).a.denum + "\n";
						                      P = (!((OperationsContext)_localctx).b.declared || ((OperationsContext)_localctx).b.type.equals("int")) ? "I" : "G";
						                      _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).b.denum + "\n";
						                      _localctx.code += "MUL\n";
						                      
						                      ((OperationsContext)_localctx).denum =  opCounter++;
						                      ((OperationsContext)_localctx).num =  opCounter++;
						                      ((OperationsContext)_localctx).type =  "float";
						                      ((OperationsContext)_localctx).declared =  true;
						                      if (opCounter > sp + 3)
						                          opCounter = sp + 1;
						              
						}
						break;
					case 3:
						{
						_localctx = new OperationsContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operations);
						setState(260);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(261);
						match(T__17);
						setState(262);
						((OperationsContext)_localctx).b = operations(6);

						                  ((OperationsContext)_localctx).code =  "";
						                  if (((OperationsContext)_localctx).b.type.equals("int")){
						                      if (!((OperationsContext)_localctx).a.code.isEmpty())
						                          _localctx.code += ((OperationsContext)_localctx).a.code;
						                      P = !((OperationsContext)_localctx).b.declared ? "I" : "G";
						                      _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).b.num + "\n";
						                      P = !((OperationsContext)_localctx).a.declared ? "I" : "G";
						                      _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).a.num + "\n";
						                      _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).a.denum + "\n";
						                      _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).b.num + "\n";
						                      _localctx.code += "PUSHI 0\n";
						                      _localctx.code += "NEQ\n";
						                      _localctx.code += "JUMPF " + (label + 1) + "\n"; 
						                      _localctx.code += "JUMP " + ( label ) + "\n";
						                      _localctx.code += "LABEL " + label++ + "\n";
						                      _localctx.code += "PUSHG " + (sp + 1) + "\n" ;
						                      _localctx.code += "PUSHG " + (sp + 1) + "\n" ;
						                      _localctx.code += "MUL\n";
						                      _localctx.code += "STOREG " + (sp + 1) + "\n" ;
						                      _localctx.code += "PUSHG" +" "+ (sp + 2) + "\n" ;
						                      _localctx.code += "PUSHG"+" "+ (sp + 2) + "\n" ;
						                      _localctx.code += "MUL\n";
						                      _localctx.code += "STOREG " + (sp + 2) + "\n" ;
						                      _localctx.code += "PUSHG " + (sp) + "\n" ;
						                      _localctx.code += "PUSHI 1\n";
						                      _localctx.code += "SUB\n";
						                      _localctx.code += "STOREG " + (sp) + "\n" ;
						                      _localctx.code += "PUSHG " + (sp) + "\n" ;
						                      _localctx.code += "PUSHI 1\n";
						                      _localctx.code += "INFEQ\n";
						                      _localctx.code += "JUMPF " + (label - 1) + "\n"; 
						                      _localctx.code += "LABEL " + label++ + "\n";
						                      _localctx.code += "STOREG " + (sp) + "\n";
						                      ((OperationsContext)_localctx).denum =  ((OperationsContext)_localctx).a.denum; 
						                      ((OperationsContext)_localctx).num =  ((OperationsContext)_localctx).a.num;
						                      ((OperationsContext)_localctx).type =  ((OperationsContext)_localctx).a.type;
						                      ((OperationsContext)_localctx).declared =  ((OperationsContext)_localctx).a.declared;
						                  }
						                  else 
						                  {
						                      System.out.println("Invalid Type!!!");
						                  }
						              
						}
						break;
					case 4:
						{
						_localctx = new OperationsContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operations);
						setState(265);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(266);
						((OperationsContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) ) {
							((OperationsContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(267);
						((OperationsContext)_localctx).b = operations(2);

						                  ((OperationsContext)_localctx).code =  "";
						                      if (!((OperationsContext)_localctx).a.code.isEmpty())
						                          _localctx.code += ((OperationsContext)_localctx).a.code;
						                      if (!((OperationsContext)_localctx).b.code.isEmpty())
						                          _localctx.code += ((OperationsContext)_localctx).b.code;
						              
						                      P = (!((OperationsContext)_localctx).b.declared || ((OperationsContext)_localctx).b.type.equals("int")) ? "I" : "G";
						                      _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).b.denum + "\n";
						                      P = !((OperationsContext)_localctx).a.declared ? "I" : "G";
						                      _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).a.num + "\n";
						                      _localctx.code += "MUL\n";
						                      P = !((OperationsContext)_localctx).b.declared ? "I" : "G";
						                      _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).b.num + "\n";
						                      P = (!((OperationsContext)_localctx).a.declared || ((OperationsContext)_localctx).a.type.equals("int")) ? "I" : "G";
						                      _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).a.denum + "\n";
						                      _localctx.code += "MUL\n";
						                      if((((OperationsContext)_localctx).OP!=null?((OperationsContext)_localctx).OP.getText():null).equals("=="))
						                      _localctx.code += "EQUAL\n";
						                      if((((OperationsContext)_localctx).OP!=null?((OperationsContext)_localctx).OP.getText():null).equals("<>"))
						                      _localctx.code += "NEQ\n";
						                      if((((OperationsContext)_localctx).OP!=null?((OperationsContext)_localctx).OP.getText():null).equals("<"))
						                      _localctx.code += "INF\n";
						                      if((((OperationsContext)_localctx).OP!=null?((OperationsContext)_localctx).OP.getText():null).equals(">"))
						                      _localctx.code += "SUP\n";
						                      if((((OperationsContext)_localctx).OP!=null?((OperationsContext)_localctx).OP.getText():null).equals("<="))
						                      _localctx.code += "INFEQ\n";
						                      if((((OperationsContext)_localctx).OP!=null?((OperationsContext)_localctx).OP.getText():null).equals(">="))
						                      _localctx.code += "SUPEQ\n";
						                      ((OperationsContext)_localctx).denum =  opCounter++;
						                      ((OperationsContext)_localctx).num =  opCounter++;
						                      ((OperationsContext)_localctx).type =  "float";
						                      ((OperationsContext)_localctx).declared =  true;
						                      if (opCounter > sp + 3)
						                          opCounter = sp + 1;
						              
						}
						break;
					case 5:
						{
						_localctx = new OperationsContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operations);
						setState(270);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(271);
						match(T__22);

						                  ((OperationsContext)_localctx).code =  "";
						                  if (!((OperationsContext)_localctx).a.code.isEmpty())
						                      _localctx.code += ((OperationsContext)_localctx).a.code;
						                  P = !((OperationsContext)_localctx).a.declared ? "I" : "G";
						                  _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).a.num + "\n";
						                  _localctx.code += "PUSHI 10000\n";
						                  _localctx.code += "MUL\n";
						                  _localctx.code += "PUSH"+ P +" "+ ((OperationsContext)_localctx).a.denum + "\n";
						                  _localctx.code += "DIV\n";
						                  _localctx.code += "PUSHI 99\n";
						                  _localctx.code += "ADD\n";
						                  _localctx.code += "PUSHI 100\n";
						                  _localctx.code += "DIV\n";
						                  ((OperationsContext)_localctx).denum =  ((OperationsContext)_localctx).a.denum; 
						                  ((OperationsContext)_localctx).num =  ((OperationsContext)_localctx).a.num;
						                  ((OperationsContext)_localctx).type =  ((OperationsContext)_localctx).a.type;
						                  ((OperationsContext)_localctx).declared =  ((OperationsContext)_localctx).a.declared;
						              
						}
						break;
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpIContext extends ParserRuleContext {
		public String code;
		public IntegerContext integer;
		public VariableContext variable;
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterExpI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitExpI(this);
		}
	}

	public final ExpIContext expI() throws RecognitionException {
		ExpIContext _localctx = new ExpIContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expI);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				((ExpIContext)_localctx).integer = integer();
				((ExpIContext)_localctx).code =  "PUSHI " + ((ExpIContext)_localctx).integer.num + "\n";
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				((ExpIContext)_localctx).variable = variable();
				   
				        if(((ExpIContext)_localctx).variable.type.equals("int"))
				            ((ExpIContext)_localctx).code =  "PUSHG " + ((ExpIContext)_localctx).variable.num + "\n";
				        else 
				            System.out.println("Invalid Type!!!");
				    
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
	public static class FunctionContext extends ParserRuleContext {
		public String code;
		public ExpIContext a;
		public ExpIContext b;
		public List<ExpIContext> expI() {
			return getRuleContexts(ExpIContext.class);
		}
		public ExpIContext expI(int i) {
			return getRuleContext(ExpIContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(T__29);
				setState(287);
				((FunctionContext)_localctx).a = expI();
				setState(288);
				match(T__30);
				setState(289);
				((FunctionContext)_localctx).b = expI();
				setState(290);
				match(T__7);

				        ((FunctionContext)_localctx).code =  ((FunctionContext)_localctx).a.code + ((FunctionContext)_localctx).b.code;
				        _localctx.code += "LABEL " + label++ + "\n";
				        _localctx.code += "PUSHG "+ (sp) +"\n";
				        _localctx.code += "PUSHG "+ (sp + 1) +"\n";
				        _localctx.code += "SUP\n";

				        _localctx.code += "JUMPF "+ (label + 1) +"\n";
				        
				        _localctx.code += "LABEL " + (label++) +"\n";
				        _localctx.code += "PUSHG "+ (sp) +"\n";
				        _localctx.code += "PUSHG "+ (sp + 1) +"\n";
				        _localctx.code += "SUB\n";
				        _localctx.code += "STOREG " + (sp) +"\n";
				        _localctx.code += "JUMP " + (label + 1) +"\n";

				        
				        _localctx.code += "LABEL " + (label++) +"\n";
				        _localctx.code += "PUSHG "+ (sp + 1) +"\n";
				        _localctx.code += "PUSHG "+ (sp) +"\n";
				        _localctx.code += "SUB\n";
				        _localctx.code += "STOREG " + (sp + 1) +"\n";
				        
				        _localctx.code += "LABEL " + (label++) +"\n";
				        _localctx.code += "PUSHG "+ (sp) +"\n";
				        _localctx.code += "PUSHG "+ (sp + 1) +"\n";
				        _localctx.code += "NEQ\n";
				        _localctx.code += "JUMPF " + (label) +"\n";
				        _localctx.code += "JUMP " + (label - 4) + "\n";
				        _localctx.code += "LABEL " + (label++) + "\n";
				    
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(T__31);
				setState(294);
				((FunctionContext)_localctx).a = expI();
				setState(295);
				match(T__30);
				setState(296);
				((FunctionContext)_localctx).b = expI();
				setState(297);
				match(T__7);

				        ((FunctionContext)_localctx).code =  ((FunctionContext)_localctx).a.code + ((FunctionContext)_localctx).b.code;
				        _localctx.code += "LABEL " + label++ + "\n";
				        _localctx.code += "PUSHG "+ (sp) +"\n";
				        _localctx.code += "PUSHG "+ (sp + 1) +"\n";
				        _localctx.code += "SUP\n";

				        _localctx.code += "JUMPF "+ (label + 1) +"\n";
				        
				        _localctx.code += "LABEL " + (label++) +"\n";
				        _localctx.code += "PUSHG "+ (sp) +"\n";
				        _localctx.code += "PUSHG "+ (sp + 1) +"\n";
				        _localctx.code += "SUB\n";
				        _localctx.code += "STOREG " + (sp) +"\n";
				        _localctx.code += "JUMP " + (label + 1) +"\n";

				        
				        _localctx.code += "LABEL " + (label++) +"\n";
				        _localctx.code += "PUSHG "+ (sp + 1) +"\n";
				        _localctx.code += "PUSHG "+ (sp) +"\n";
				        _localctx.code += "SUB\n";
				        _localctx.code += "STOREG " + (sp + 1) +"\n";
				        
				        _localctx.code += "LABEL " + (label++) +"\n";
				        _localctx.code += "PUSHG "+ (sp) +"\n";
				        _localctx.code += "PUSHG "+ (sp + 1) +"\n";
				        _localctx.code += "NEQ\n";
				        _localctx.code += "JUMPF " + (label) +"\n";
				        _localctx.code += "JUMP " + (label - 4) + "\n";
				        _localctx.code += "LABEL " + (label++) + "\n";
				        _localctx.code += "POP\n";
				        _localctx.code += ((FunctionContext)_localctx).a.code;
				        _localctx.code += "PUSHG "+ (sp) +"\n";
				        _localctx.code +="DIV\n";
				        _localctx.code += ((FunctionContext)_localctx).b.code;
				        _localctx.code += "MUL\n";
				        _localctx.code += "DUP\n";
				        _localctx.code += "PUSHI 0\n";
				        _localctx.code += "INF\n";
				        _localctx.code += "JUMPF "+ (label + 1) +"\n";
				        _localctx.code += "LABEL " + label++ + "\n";
				        _localctx.code += "POP\n";
				        _localctx.code += "PUSHI -1\n";
				        _localctx.code += "MUL\n";
				        _localctx.code += "LABEL " + label++ + "\n";
				    
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
	public static class AffectationContext extends ParserRuleContext {
		public String code;
		public ExpressionContext a;
		public ExpressionContext b;
		public OperationsContext e;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public AffectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterAffectation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitAffectation(this);
		}
	}

	public final AffectationContext affectation() throws RecognitionException {
		AffectationContext _localctx = new AffectationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_affectation);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				((AffectationContext)_localctx).a = expression();
				setState(303);
				match(T__32);
				setState(304);
				((AffectationContext)_localctx).b = expression();

				        if (((AffectationContext)_localctx).a.type.equals(((AffectationContext)_localctx).b.type)){
				            if (((AffectationContext)_localctx).a.type.equals("float"))
				            {
				                P = ((AffectationContext)_localctx).b.declared ? "G" : "I";
				                ((AffectationContext)_localctx).code =  "PUSH"+ P +" "+ ((AffectationContext)_localctx).b.denum + "\n";
				                P = ((AffectationContext)_localctx).b.declared ? "G" : "I";
				                _localctx.code += "PUSH"+ P +" "+ ((AffectationContext)_localctx).b.num + "\n";
				                _localctx.code += "STOREG " + ((AffectationContext)_localctx).a.num + "\n";
				                _localctx.code += "STOREG " + ((AffectationContext)_localctx).a.denum + "\n";
				            }
				            else
				            {
				                P = ((AffectationContext)_localctx).b.declared ? "G" : "I";
				                ((AffectationContext)_localctx).code =  "PUSH"+ P +" "+ ((AffectationContext)_localctx).b.num + "\n";
				                _localctx.code += "STOREG " + ((AffectationContext)_localctx).a.num + "\n";
				            }
				        }
				        else 
				        {
				            System.out.println("Invalid Type!");
				        }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				((AffectationContext)_localctx).a = expression();
				setState(308);
				match(T__32);
				setState(309);
				((AffectationContext)_localctx).e = operations(0);

				        ((AffectationContext)_localctx).code =  ((AffectationContext)_localctx).e.code;
				        _localctx.code += "STOREG " + ((AffectationContext)_localctx).a.denum + "\n";
				        _localctx.code += "STOREG " + ((AffectationContext)_localctx).a.num + "\n";
				    
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
	public static class ExprAContext extends ParserRuleContext {
		public String code;
		public ExpressionContext a;
		public OperationsContext b;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public ExprAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterExprA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitExprA(this);
		}
	}

	public final ExprAContext exprA() throws RecognitionException {
		ExprAContext _localctx = new ExprAContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprA);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				((ExprAContext)_localctx).a = expression();

				        P = ((ExprAContext)_localctx).a.declared ? "G" : "I";
				        ((ExprAContext)_localctx).code =  "PUSH"+ P +" "+ ((ExprAContext)_localctx).a.num + "\n";
				        P = ((ExprAContext)_localctx).a.declared ? "G" : "I";
				        _localctx.code += "PUSH"+ P +" "+ ((ExprAContext)_localctx).a.denum + "\n";
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				((ExprAContext)_localctx).b = operations(0);
				 ((ExprAContext)_localctx).code =  ((ExprAContext)_localctx).b.code; 
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
	public static class AfficherContext extends ParserRuleContext {
		public String code;
		public ExprAContext a;
		public ExprAContext exprA() {
			return getRuleContext(ExprAContext.class,0);
		}
		public AfficherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_afficher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).enterAfficher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalLanguageListener ) ((RationalLanguageListener)listener).exitAfficher(this);
		}
	}

	public final AfficherContext afficher() throws RecognitionException {
		AfficherContext _localctx = new AfficherContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_afficher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__33);
			setState(323);
			((AfficherContext)_localctx).a = exprA();
			setState(324);
			match(T__7);

			        ((AfficherContext)_localctx).code =  ((AfficherContext)_localctx).a.code;
			        _localctx.code += "WRITE \n";
			        _localctx.code += "POP\n";
			        _localctx.code += "WRITE \n";
			        _localctx.code += "POP\n";
			    
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 16:
			return operations_sempred((OperationsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean operations_sempred(OperationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 1);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u0148\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u00000\b\u0000\n\u0000\f\u0000"+
		"3\t\u0000\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u00009\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000>\b\u0000\n\u0000\f\u0000A\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001F\b\u0001\u000b"+
		"\u0001\f\u0001G\u0001\u0001\u0005\u0001K\b\u0001\n\u0001\f\u0001N\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003p\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004{\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009c\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00a8\b\n\n\n\f\n\u00ab\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00bc\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00cf\b\u000e\n\u000e\f\u000e\u00d2"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00df\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00f9\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0112\b\u0010\n\u0010\f\u0010"+
		"\u0115\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u011d\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u012d\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0139\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0141\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0002\u0014 \u0016\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*\u0000\u0003\u0002\u0000$$\'\'\u0002\u0000\n\n\u000f\u000f\u0001"+
		"\u0000\u0018\u001d\u0157\u00001\u0001\u0000\u0000\u0000\u0002E\u0001\u0000"+
		"\u0000\u0000\u0004O\u0001\u0000\u0000\u0000\u0006o\u0001\u0000\u0000\u0000"+
		"\bz\u0001\u0000\u0000\u0000\n|\u0001\u0000\u0000\u0000\f\u007f\u0001\u0000"+
		"\u0000\u0000\u000e\u0084\u0001\u0000\u0000\u0000\u0010\u0087\u0001\u0000"+
		"\u0000\u0000\u0012\u008a\u0001\u0000\u0000\u0000\u0014\u009b\u0001\u0000"+
		"\u0000\u0000\u0016\u00bb\u0001\u0000\u0000\u0000\u0018\u00bd\u0001\u0000"+
		"\u0000\u0000\u001a\u00c4\u0001\u0000\u0000\u0000\u001c\u00ca\u0001\u0000"+
		"\u0000\u0000\u001e\u00de\u0001\u0000\u0000\u0000 \u00f8\u0001\u0000\u0000"+
		"\u0000\"\u011c\u0001\u0000\u0000\u0000$\u012c\u0001\u0000\u0000\u0000"+
		"&\u0138\u0001\u0000\u0000\u0000(\u0140\u0001\u0000\u0000\u0000*\u0142"+
		"\u0001\u0000\u0000\u0000,-\u0003\u0004\u0002\u0000-.\u0006\u0000\uffff"+
		"\uffff\u0000.0\u0001\u0000\u0000\u0000/,\u0001\u0000\u0000\u000003\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"27\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000046\u0007\u0000\u0000"+
		"\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u00008?\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u0000:;\u0003\u0006\u0003\u0000;<\u0006\u0000\uffff\uffff"+
		"\u0000<>\u0001\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000>A\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0006\u0000\uffff\uffff"+
		"\u0000C\u0001\u0001\u0000\u0000\u0000DF\u0005$\u0000\u0000ED\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000HL\u0001\u0000\u0000\u0000IK\u0005\'\u0000\u0000JI\u0001"+
		"\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000M\u0003\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000OP\u0005(\u0000\u0000PQ\u0005)\u0000\u0000QR\u0003\u0002\u0001"+
		"\u0000RS\u0006\u0002\uffff\uffff\u0000S\u0005\u0001\u0000\u0000\u0000"+
		"TU\u0003&\u0013\u0000UV\u0003\u0002\u0001\u0000VW\u0006\u0003\uffff\uffff"+
		"\u0000Wp\u0001\u0000\u0000\u0000XY\u0003 \u0010\u0000YZ\u0003\u0002\u0001"+
		"\u0000Z[\u0006\u0003\uffff\uffff\u0000[p\u0001\u0000\u0000\u0000\\]\u0003"+
		"*\u0015\u0000]^\u0003\u0002\u0001\u0000^_\u0006\u0003\uffff\uffff\u0000"+
		"_p\u0001\u0000\u0000\u0000`a\u0003\u0018\f\u0000ab\u0003\u0002\u0001\u0000"+
		"bc\u0006\u0003\uffff\uffff\u0000cp\u0001\u0000\u0000\u0000de\u0003\u001a"+
		"\r\u0000ef\u0003\u0002\u0001\u0000fg\u0006\u0003\uffff\uffff\u0000gp\u0001"+
		"\u0000\u0000\u0000hi\u0003\u0012\t\u0000ij\u0006\u0003\uffff\uffff\u0000"+
		"jp\u0001\u0000\u0000\u0000kl\u0003$\u0012\u0000lm\u0003\u0002\u0001\u0000"+
		"mn\u0006\u0003\uffff\uffff\u0000np\u0001\u0000\u0000\u0000oT\u0001\u0000"+
		"\u0000\u0000oX\u0001\u0000\u0000\u0000o\\\u0001\u0000\u0000\u0000o`\u0001"+
		"\u0000\u0000\u0000od\u0001\u0000\u0000\u0000oh\u0001\u0000\u0000\u0000"+
		"ok\u0001\u0000\u0000\u0000p\u0007\u0001\u0000\u0000\u0000qr\u0003\f\u0006"+
		"\u0000rs\u0006\u0004\uffff\uffff\u0000s{\u0001\u0000\u0000\u0000tu\u0003"+
		"\n\u0005\u0000uv\u0006\u0004\uffff\uffff\u0000v{\u0001\u0000\u0000\u0000"+
		"wx\u0003\u0010\b\u0000xy\u0006\u0004\uffff\uffff\u0000y{\u0001\u0000\u0000"+
		"\u0000zq\u0001\u0000\u0000\u0000zt\u0001\u0000\u0000\u0000zw\u0001\u0000"+
		"\u0000\u0000{\t\u0001\u0000\u0000\u0000|}\u0005+\u0000\u0000}~\u0006\u0005"+
		"\uffff\uffff\u0000~\u000b\u0001\u0000\u0000\u0000\u007f\u0080\u0003\n"+
		"\u0005\u0000\u0080\u0081\u0005\u0001\u0000\u0000\u0081\u0082\u0003\n\u0005"+
		"\u0000\u0082\u0083\u0006\u0006\uffff\uffff\u0000\u0083\r\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005*\u0000\u0000\u0085\u0086\u0006\u0007\uffff\uffff"+
		"\u0000\u0086\u000f\u0001\u0000\u0000\u0000\u0087\u0088\u0005)\u0000\u0000"+
		"\u0088\u0089\u0006\b\uffff\uffff\u0000\u0089\u0011\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0003\u0014\n\u0000\u008b\u008c\u0006\t\uffff\uffff\u0000"+
		"\u008c\u0013\u0001\u0000\u0000\u0000\u008d\u008e\u0006\n\uffff\uffff\u0000"+
		"\u008e\u008f\u0005\u0002\u0000\u0000\u008f\u0090\u0003\u0014\n\u0006\u0090"+
		"\u0091\u0006\n\uffff\uffff\u0000\u0091\u009c\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0005\u0005\u0000\u0000\u0093\u009c\u0006\n\uffff\uffff\u0000\u0094"+
		"\u0095\u0005\u0006\u0000\u0000\u0095\u009c\u0006\n\uffff\uffff\u0000\u0096"+
		"\u0097\u0005\u0007\u0000\u0000\u0097\u0098\u0003\u0014\n\u0000\u0098\u0099"+
		"\u0005\b\u0000\u0000\u0099\u009a\u0006\n\uffff\uffff\u0000\u009a\u009c"+
		"\u0001\u0000\u0000\u0000\u009b\u008d\u0001\u0000\u0000\u0000\u009b\u0092"+
		"\u0001\u0000\u0000\u0000\u009b\u0094\u0001\u0000\u0000\u0000\u009b\u0096"+
		"\u0001\u0000\u0000\u0000\u009c\u00a9\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\n\u0005\u0000\u0000\u009e\u009f\u0005\u0003\u0000\u0000\u009f\u00a0\u0003"+
		"\u0014\n\u0006\u00a0\u00a1\u0006\n\uffff\uffff\u0000\u00a1\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\n\u0004\u0000\u0000\u00a3\u00a4\u0005\u0004"+
		"\u0000\u0000\u00a4\u00a5\u0003\u0014\n\u0005\u00a5\u00a6\u0006\n\uffff"+
		"\uffff\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u009d\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a2\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u0015\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0003&\u0013\u0000\u00ad\u00ae\u0006\u000b\uffff"+
		"\uffff\u0000\u00ae\u00bc\u0001\u0000\u0000\u0000\u00af\u00b0\u0003 \u0010"+
		"\u0000\u00b0\u00b1\u0006\u000b\uffff\uffff\u0000\u00b1\u00bc\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0003*\u0015\u0000\u00b3\u00b4\u0006\u000b\uffff"+
		"\uffff\u0000\u00b4\u00bc\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003\u0018"+
		"\f\u0000\u00b6\u00b7\u0006\u000b\uffff\uffff\u0000\u00b7\u00bc\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0003\u001a\r\u0000\u00b9\u00ba\u0006\u000b\uffff"+
		"\uffff\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00ac\u0001\u0000"+
		"\u0000\u0000\u00bb\u00af\u0001\u0000\u0000\u0000\u00bb\u00b2\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b5\u0001\u0000\u0000\u0000\u00bb\u00b8\u0001\u0000"+
		"\u0000\u0000\u00bc\u0017\u0001\u0000\u0000\u0000\u00bd\u00be\u0003\u0012"+
		"\t\u0000\u00be\u00bf\u0005\t\u0000\u0000\u00bf\u00c0\u0003\u0016\u000b"+
		"\u0000\u00c0\u00c1\u0005\n\u0000\u0000\u00c1\u00c2\u0003\u0016\u000b\u0000"+
		"\u00c2\u00c3\u0006\f\uffff\uffff\u0000\u00c3\u0019\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0005\u000b\u0000\u0000\u00c5\u00c6\u0003\u001c\u000e\u0000"+
		"\u00c6\u00c7\u0005\f\u0000\u0000\u00c7\u00c8\u0003\u001e\u000f\u0000\u00c8"+
		"\u00c9\u0006\r\uffff\uffff\u0000\u00c9\u001b\u0001\u0000\u0000\u0000\u00ca"+
		"\u00d0\u0005\r\u0000\u0000\u00cb\u00cc\u0003\u0006\u0003\u0000\u00cc\u00cd"+
		"\u0006\u000e\uffff\uffff\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0005\u000e\u0000\u0000\u00d4\u00d5\u0006\u000e\uffff\uffff\u0000"+
		"\u00d5\u001d\u0001\u0000\u0000\u0000\u00d6\u00d7\u0003\u0012\t\u0000\u00d7"+
		"\u00d8\u0006\u000f\uffff\uffff\u0000\u00d8\u00df\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0005\u0006\u0000\u0000\u00da\u00df\u0006\u000f\uffff\uffff"+
		"\u0000\u00db\u00dc\u0003 \u0010\u0000\u00dc\u00dd\u0006\u000f\uffff\uffff"+
		"\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00d6\u0001\u0000\u0000"+
		"\u0000\u00de\u00d9\u0001\u0000\u0000\u0000\u00de\u00db\u0001\u0000\u0000"+
		"\u0000\u00df\u001f\u0001\u0000\u0000\u0000\u00e0\u00e1\u0006\u0010\uffff"+
		"\uffff\u0000\u00e1\u00e2\u0005\u0007\u0000\u0000\u00e2\u00e3\u0003 \u0010"+
		"\u0000\u00e3\u00e4\u0005\b\u0000\u0000\u00e4\u00e5\u0006\u0010\uffff\uffff"+
		"\u0000\u00e5\u00f9\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003\b\u0004\u0000"+
		"\u00e7\u00e8\u0006\u0010\uffff\uffff\u0000\u00e8\u00f9\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005\u0010\u0000\u0000\u00ea\u00eb\u0003 \u0010\u0000"+
		"\u00eb\u00ec\u0005\u0011\u0000\u0000\u00ec\u00ed\u0006\u0010\uffff\uffff"+
		"\u0000\u00ed\u00f9\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u0013\u0000"+
		"\u0000\u00ef\u00f0\u0003 \u0010\u0000\u00f0\u00f1\u0005\u0014\u0000\u0000"+
		"\u00f1\u00f2\u0006\u0010\uffff\uffff\u0000\u00f2\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0005\u0015\u0000\u0000\u00f4\u00f5\u0003 \u0010\u0000"+
		"\u00f5\u00f6\u0005\u0016\u0000\u0000\u00f6\u00f7\u0006\u0010\uffff\uffff"+
		"\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00e0\u0001\u0000\u0000"+
		"\u0000\u00f8\u00e6\u0001\u0000\u0000\u0000\u00f8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00f8\u00ee\u0001\u0000\u0000\u0000\u00f8\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f9\u0113\u0001\u0000\u0000\u0000\u00fa\u00fb\n\n\u0000\u0000"+
		"\u00fb\u00fc\u0007\u0001\u0000\u0000\u00fc\u00fd\u0003 \u0010\u000b\u00fd"+
		"\u00fe\u0006\u0010\uffff\uffff\u0000\u00fe\u0112\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\n\t\u0000\u0000\u0100\u0101\u0005%\u0000\u0000\u0101\u0102"+
		"\u0003 \u0010\n\u0102\u0103\u0006\u0010\uffff\uffff\u0000\u0103\u0112"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\n\u0005\u0000\u0000\u0105\u0106\u0005"+
		"\u0012\u0000\u0000\u0106\u0107\u0003 \u0010\u0006\u0107\u0108\u0006\u0010"+
		"\uffff\uffff\u0000\u0108\u0112\u0001\u0000\u0000\u0000\u0109\u010a\n\u0001"+
		"\u0000\u0000\u010a\u010b\u0007\u0002\u0000\u0000\u010b\u010c\u0003 \u0010"+
		"\u0002\u010c\u010d\u0006\u0010\uffff\uffff\u0000\u010d\u0112\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\n\u0002\u0000\u0000\u010f\u0110\u0005\u0017\u0000"+
		"\u0000\u0110\u0112\u0006\u0010\uffff\uffff\u0000\u0111\u00fa\u0001\u0000"+
		"\u0000\u0000\u0111\u00ff\u0001\u0000\u0000\u0000\u0111\u0104\u0001\u0000"+
		"\u0000\u0000\u0111\u0109\u0001\u0000\u0000\u0000\u0111\u010e\u0001\u0000"+
		"\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114!\u0001\u0000\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0117\u0003\n\u0005\u0000"+
		"\u0117\u0118\u0006\u0011\uffff\uffff\u0000\u0118\u011d\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0003\u0010\b\u0000\u011a\u011b\u0006\u0011\uffff\uffff"+
		"\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u0116\u0001\u0000\u0000"+
		"\u0000\u011c\u0119\u0001\u0000\u0000\u0000\u011d#\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0005\u001e\u0000\u0000\u011f\u0120\u0003\"\u0011\u0000\u0120"+
		"\u0121\u0005\u001f\u0000\u0000\u0121\u0122\u0003\"\u0011\u0000\u0122\u0123"+
		"\u0005\b\u0000\u0000\u0123\u0124\u0006\u0012\uffff\uffff\u0000\u0124\u012d"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0005 \u0000\u0000\u0126\u0127\u0003"+
		"\"\u0011\u0000\u0127\u0128\u0005\u001f\u0000\u0000\u0128\u0129\u0003\""+
		"\u0011\u0000\u0129\u012a\u0005\b\u0000\u0000\u012a\u012b\u0006\u0012\uffff"+
		"\uffff\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u011e\u0001\u0000"+
		"\u0000\u0000\u012c\u0125\u0001\u0000\u0000\u0000\u012d%\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0003\b\u0004\u0000\u012f\u0130\u0005!\u0000\u0000"+
		"\u0130\u0131\u0003\b\u0004\u0000\u0131\u0132\u0006\u0013\uffff\uffff\u0000"+
		"\u0132\u0139\u0001\u0000\u0000\u0000\u0133\u0134\u0003\b\u0004\u0000\u0134"+
		"\u0135\u0005!\u0000\u0000\u0135\u0136\u0003 \u0010\u0000\u0136\u0137\u0006"+
		"\u0013\uffff\uffff\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u012e"+
		"\u0001\u0000\u0000\u0000\u0138\u0133\u0001\u0000\u0000\u0000\u0139\'\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0003\b\u0004\u0000\u013b\u013c\u0006\u0014"+
		"\uffff\uffff\u0000\u013c\u0141\u0001\u0000\u0000\u0000\u013d\u013e\u0003"+
		" \u0010\u0000\u013e\u013f\u0006\u0014\uffff\uffff\u0000\u013f\u0141\u0001"+
		"\u0000\u0000\u0000\u0140\u013a\u0001\u0000\u0000\u0000\u0140\u013d\u0001"+
		"\u0000\u0000\u0000\u0141)\u0001\u0000\u0000\u0000\u0142\u0143\u0005\""+
		"\u0000\u0000\u0143\u0144\u0003(\u0014\u0000\u0144\u0145\u0005\b\u0000"+
		"\u0000\u0145\u0146\u0006\u0015\uffff\uffff\u0000\u0146+\u0001\u0000\u0000"+
		"\u0000\u001417?GLoz\u009b\u00a7\u00a9\u00bb\u00d0\u00de\u00f8\u0111\u0113"+
		"\u011c\u012c\u0138\u0140";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}