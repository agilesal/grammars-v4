// Generated from com/khubla/bnf/bnf.g4 by ANTLR 4.2.2
package com.khubla.bnf;

import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class bnfParser extends Parser {
   public static class AlternativeContext extends ParserRuleContext {
      public AlternativeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<ElementContext> element() {
         return getRuleContexts(ElementContext.class);
      }

      public ElementContext element(int i) {
         return getRuleContext(ElementContext.class, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).enterAlternative(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).exitAlternative(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_alternative;
      }
   }

   public static class AlternativesContext extends ParserRuleContext {
      public AlternativesContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<AlternativeContext> alternative() {
         return getRuleContexts(AlternativeContext.class);
      }

      public AlternativeContext alternative(int i) {
         return getRuleContext(AlternativeContext.class, i);
      }

      public List<TerminalNode> BAR() {
         return getTokens(bnfParser.BAR);
      }

      public TerminalNode BAR(int i) {
         return getToken(bnfParser.BAR, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).enterAlternatives(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).exitAlternatives(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_alternatives;
      }
   }

   public static class ElementContext extends ParserRuleContext {
      public ElementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).enterElement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).exitElement(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_element;
      }

      public IdContext id() {
         return getRuleContext(IdContext.class, 0);
      }

      public OneormoreContext oneormore() {
         return getRuleContext(OneormoreContext.class, 0);
      }

      public OptionalContext optional() {
         return getRuleContext(OptionalContext.class, 0);
      }

      public TextContext text() {
         return getRuleContext(TextContext.class, 0);
      }

      public ZeroormoreContext zeroormore() {
         return getRuleContext(ZeroormoreContext.class, 0);
      }
   }

   public static class IdContext extends ParserRuleContext {
      public IdContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).enterId(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).exitId(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_id;
      }

      public TerminalNode ID() {
         return getToken(bnfParser.ID, 0);
      }
   }

   public static class LhsContext extends ParserRuleContext {
      public LhsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).enterLhs(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).exitLhs(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_lhs;
      }

      public IdContext id() {
         return getRuleContext(IdContext.class, 0);
      }
   }

   public static class OneormoreContext extends ParserRuleContext {
      public OneormoreContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public AlternativesContext alternatives() {
         return getRuleContext(AlternativesContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).enterOneormore(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).exitOneormore(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_oneormore;
      }

      public TerminalNode LPAREN() {
         return getToken(bnfParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(bnfParser.RPAREN, 0);
      }
   }

   public static class OptionalContext extends ParserRuleContext {
      public OptionalContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public AlternativesContext alternatives() {
         return getRuleContext(AlternativesContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).enterOptional(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).exitOptional(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_optional;
      }

      public TerminalNode LEND() {
         return getToken(bnfParser.LEND, 0);
      }

      public TerminalNode REND() {
         return getToken(bnfParser.REND, 0);
      }
   }

   public static class RhsContext extends ParserRuleContext {
      public RhsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public AlternativesContext alternatives() {
         return getRuleContext(AlternativesContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).enterRhs(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).exitRhs(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_rhs;
      }
   }

   public static class Rule_Context extends ParserRuleContext {
      public Rule_Context(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode ASSIGN() {
         return getToken(bnfParser.ASSIGN, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).enterRule_(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).exitRule_(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_rule_;
      }

      public LhsContext lhs() {
         return getRuleContext(LhsContext.class, 0);
      }

      public RhsContext rhs() {
         return getRuleContext(RhsContext.class, 0);
      }
   }

   public static class RulelistContext extends ParserRuleContext {
      public RulelistContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).enterRulelist(this);
         }
      }

      public TerminalNode EOF() {
         return getToken(Recognizer.EOF, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).exitRulelist(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_rulelist;
      }

      public List<Rule_Context> rule_() {
         return getRuleContexts(Rule_Context.class);
      }

      public Rule_Context rule_(int i) {
         return getRuleContext(Rule_Context.class, i);
      }
   }

   public static class TextContext extends ParserRuleContext {
      public TextContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).enterText(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).exitText(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_text;
      }

      public TerminalNode STRINGLITERAL() {
         return getToken(bnfParser.STRINGLITERAL, 0);
      }

      public TerminalNode TEXT() {
         return getToken(bnfParser.TEXT, 0);
      }
   }

   public static class ZeroormoreContext extends ParserRuleContext {
      public ZeroormoreContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public AlternativesContext alternatives() {
         return getRuleContext(AlternativesContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).enterZeroormore(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof bnfListener) {
            ((bnfListener) listener).exitZeroormore(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_zeroormore;
      }

      public TerminalNode LBRACE() {
         return getToken(bnfParser.LBRACE, 0);
      }

      public TerminalNode RBRACE() {
         return getToken(bnfParser.RBRACE, 0);
      }
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int ID = 1, ASSIGN = 2, LPAREN = 3, RPAREN = 4, LBRACE = 5, RBRACE = 6, LEND = 7, REND = 8, BAR = 9, TEXT = 10, STRINGLITERAL = 11, WS = 12;
   public static final String[] tokenNames = { "<INVALID>", "ID", "'::='", "')'", "'('", "'}'", "'{'", "']'", "'['", "'|'", "TEXT", "STRINGLITERAL", "WS" };
   public static final int RULE_rulelist = 0, RULE_rule_ = 1, RULE_lhs = 2, RULE_rhs = 3, RULE_alternatives = 4, RULE_alternative = 5, RULE_element = 6, RULE_optional = 7, RULE_zeroormore = 8,
         RULE_oneormore = 9, RULE_text = 10, RULE_id = 11;
   public static final String[] ruleNames = { "rulelist", "rule_", "lhs", "rhs", "alternatives", "alternative", "element", "optional", "zeroormore", "oneormore", "text", "id" };
   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16P\4\2\t\2\4\3\t" + "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"
         + "\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\3\3\3\3\3\3\3" + "\3\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6.\n\6\f\6\16\6\61\13\6\3\7\7\7\64\n\7"
         + "\f\7\16\7\67\13\7\3\b\3\b\3\b\3\b\3\b\5\b>\n\b\3\t\3\t\3\t\3\t\3\n\3\n" + "\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16"
         + "\20\22\24\26\30\2\3\3\2\f\rJ\2\35\3\2\2\2\4\"\3\2\2\2\6&\3\2\2\2\b(\3" + "\2\2\2\n*\3\2\2\2\f\65\3\2\2\2\16=\3\2\2\2\20?\3\2\2\2\22C\3\2\2\2\24"
         + "G\3\2\2\2\26K\3\2\2\2\30M\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\37\3" + "\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7\2\2\3"
         + "!\3\3\2\2\2\"#\5\6\4\2#$\7\4\2\2$%\5\b\5\2%\5\3\2\2\2&\'\5\30\r\2\'\7" + "\3\2\2\2()\5\n\6\2)\t\3\2\2\2*/\5\f\7\2+,\7\13\2\2,.\5\f\7\2-+\3\2\2\2"
         + ".\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\13\3\2\2\2\61/\3\2\2\2\62\64\5\16" + "\b\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\r\3\2"
         + "\2\2\67\65\3\2\2\28>\5\20\t\29>\5\22\n\2:>\5\24\13\2;>\5\26\f\2<>\5\30" + "\r\2=8\3\2\2\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\17\3\2\2\2?@\7"
         + "\n\2\2@A\5\n\6\2AB\7\t\2\2B\21\3\2\2\2CD\7\b\2\2DE\5\n\6\2EF\7\7\2\2F" + "\23\3\2\2\2GH\7\6\2\2HI\5\n\6\2IJ\7\5\2\2J\25\3\2\2\2KL\t\2\2\2L\27\3" + "\2\2\2MN\7\3\2\2N\31\3\2\2\2\6\35/\65=";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }

   public bnfParser(TokenStream input) {
      super(input);
      _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   public final AlternativeContext alternative() throws RecognitionException {
      final AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
      enterRule(_localctx, 10, RULE_alternative);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(51);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
            while ((_alt != 2) && (_alt != ATN.INVALID_ALT_NUMBER)) {
               if (_alt == 1) {
                  {
                     {
                        setState(48);
                        element();
                     }
                  }
               }
               setState(53);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final AlternativesContext alternatives() throws RecognitionException {
      final AlternativesContext _localctx = new AlternativesContext(_ctx, getState());
      enterRule(_localctx, 8, RULE_alternatives);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(40);
            alternative();
            setState(45);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == BAR) {
               {
                  {
                     setState(41);
                     match(BAR);
                     setState(42);
                     alternative();
                  }
               }
               setState(47);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ElementContext element() throws RecognitionException {
      final ElementContext _localctx = new ElementContext(_ctx, getState());
      enterRule(_localctx, 12, RULE_element);
      try {
         setState(59);
         switch (_input.LA(1)) {
            case REND:
               enterOuterAlt(_localctx, 1);
               {
                  setState(54);
                  optional();
               }
               break;
            case RBRACE:
               enterOuterAlt(_localctx, 2);
               {
                  setState(55);
                  zeroormore();
               }
               break;
            case RPAREN:
               enterOuterAlt(_localctx, 3);
               {
                  setState(56);
                  oneormore();
               }
               break;
            case TEXT:
            case STRINGLITERAL:
               enterOuterAlt(_localctx, 4);
               {
                  setState(57);
                  text();
               }
               break;
            case ID:
               enterOuterAlt(_localctx, 5);
               {
                  setState(58);
                  id();
               }
               break;
            default:
               throw new NoViableAltException(this);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   @Override
   public ATN getATN() {
      return _ATN;
   }

   @Override
   public String getGrammarFileName() {
      return "bnf.g4";
   }

   @Override
   public String[] getRuleNames() {
      return ruleNames;
   }

   @Override
   public String getSerializedATN() {
      return _serializedATN;
   }

   @Override
   public String[] getTokenNames() {
      return tokenNames;
   }

   public final IdContext id() throws RecognitionException {
      final IdContext _localctx = new IdContext(_ctx, getState());
      enterRule(_localctx, 22, RULE_id);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(75);
            match(ID);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final LhsContext lhs() throws RecognitionException {
      final LhsContext _localctx = new LhsContext(_ctx, getState());
      enterRule(_localctx, 4, RULE_lhs);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(36);
            id();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final OneormoreContext oneormore() throws RecognitionException {
      final OneormoreContext _localctx = new OneormoreContext(_ctx, getState());
      enterRule(_localctx, 18, RULE_oneormore);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(69);
            match(RPAREN);
            setState(70);
            alternatives();
            setState(71);
            match(LPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final OptionalContext optional() throws RecognitionException {
      final OptionalContext _localctx = new OptionalContext(_ctx, getState());
      enterRule(_localctx, 14, RULE_optional);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(61);
            match(REND);
            setState(62);
            alternatives();
            setState(63);
            match(LEND);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final RhsContext rhs() throws RecognitionException {
      final RhsContext _localctx = new RhsContext(_ctx, getState());
      enterRule(_localctx, 6, RULE_rhs);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(38);
            alternatives();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final Rule_Context rule_() throws RecognitionException {
      final Rule_Context _localctx = new Rule_Context(_ctx, getState());
      enterRule(_localctx, 2, RULE_rule_);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(32);
            lhs();
            setState(33);
            match(ASSIGN);
            setState(34);
            rhs();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final RulelistContext rulelist() throws RecognitionException {
      final RulelistContext _localctx = new RulelistContext(_ctx, getState());
      enterRule(_localctx, 0, RULE_rulelist);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(27);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == ID) {
               {
                  {
                     setState(24);
                     rule_();
                  }
               }
               setState(29);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(30);
            match(EOF);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final TextContext text() throws RecognitionException {
      final TextContext _localctx = new TextContext(_ctx, getState());
      enterRule(_localctx, 20, RULE_text);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(73);
            _la = _input.LA(1);
            if (!((_la == TEXT) || (_la == STRINGLITERAL))) {
               _errHandler.recoverInline(this);
            }
            consume();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ZeroormoreContext zeroormore() throws RecognitionException {
      final ZeroormoreContext _localctx = new ZeroormoreContext(_ctx, getState());
      enterRule(_localctx, 16, RULE_zeroormore);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(65);
            match(RBRACE);
            setState(66);
            alternatives();
            setState(67);
            match(LBRACE);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }
}