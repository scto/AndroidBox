// Generated from /home/darkengine/AndroidStudioProjects/AndroidBox/app/src/main/java/com/dark/androidbox/Managers/JavaClassExtractor.g4 by ANTLR 4.12.0
package com.dark.androidbox.Managers;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavaClassExtractorParser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, Identifier = 15, BlockComment = 16,
            LineComment = 17, WhiteSpace = 18;
    public static final int
            RULE_classDeclaration = 0, RULE_className = 1, RULE_classBody = 2, RULE_classMember = 3,
            RULE_fieldDeclaration = 4, RULE_methodDeclaration = 5, RULE_variableDeclarators = 6,
            RULE_variableDeclarator = 7, RULE_parameterList = 8, RULE_formalParameter = 9,
            RULE_type = 10, RULE_modifiers = 11, RULE_modifier = 12, RULE_block = 13,
            RULE_expression = 14, RULE_statement = 15;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\u0004\u0001\u0012q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
                    "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
                    "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
                    "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001" +
                    "\u0001\u0002\u0001\u0002\u0005\u0002)\b\u0002\n\u0002\f\u0002,\t\u0002" +
                    "\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u00032\b\u0003" +
                    "\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005" +
                    "\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005=\b\u0005\u0001\u0005" +
                    "\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006" +
                    "E\b\u0006\n\u0006\f\u0006H\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007" +
                    "\u0003\u0007M\b\u0007\u0001\b\u0001\b\u0001\b\u0005\bR\b\b\n\b\f\bU\t" +
                    "\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0004\u000b]\b" +
                    "\u000b\u000b\u000b\f\u000b^\u0001\f\u0001\f\u0001\r\u0001\r\u0005\re\b" +
                    "\r\n\r\f\rh\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001" +
                    "\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006" +
                    "\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0001" +
                    "\u0001\u0000\t\u000eh\u0000 \u0001\u0000\u0000\u0000\u0002$\u0001\u0000" +
                    "\u0000\u0000\u0004&\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000" +
                    "\b3\u0001\u0000\u0000\u0000\n7\u0001\u0000\u0000\u0000\fA\u0001\u0000" +
                    "\u0000\u0000\u000eI\u0001\u0000\u0000\u0000\u0010N\u0001\u0000\u0000\u0000" +
                    "\u0012V\u0001\u0000\u0000\u0000\u0014Y\u0001\u0000\u0000\u0000\u0016\\" +
                    "\u0001\u0000\u0000\u0000\u0018`\u0001\u0000\u0000\u0000\u001ab\u0001\u0000" +
                    "\u0000\u0000\u001ck\u0001\u0000\u0000\u0000\u001em\u0001\u0000\u0000\u0000" +
                    " !\u0005\u0001\u0000\u0000!\"\u0003\u0002\u0001\u0000\"#\u0003\u0004\u0002" +
                    "\u0000#\u0001\u0001\u0000\u0000\u0000$%\u0005\u000f\u0000\u0000%\u0003" +
                    "\u0001\u0000\u0000\u0000&*\u0005\u0002\u0000\u0000\')\u0003\u0006\u0003" +
                    "\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000" +
                    "\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001" +
                    "\u0000\u0000\u0000-.\u0005\u0003\u0000\u0000.\u0005\u0001\u0000\u0000" +
                    "\u0000/2\u0003\b\u0004\u000002\u0003\n\u0005\u00001/\u0001\u0000\u0000" +
                    "\u000010\u0001\u0000\u0000\u00002\u0007\u0001\u0000\u0000\u000034\u0003" +
                    "\u0016\u000b\u000045\u0003\f\u0006\u000056\u0005\u0004\u0000\u00006\t" +
                    "\u0001\u0000\u0000\u000078\u0003\u0016\u000b\u000089\u0003\u0014\n\u0000" +
                    "9:\u0005\u000f\u0000\u0000:<\u0005\u0005\u0000\u0000;=\u0003\u0010\b\u0000" +
                    "<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000" +
                    "\u0000>?\u0005\u0006\u0000\u0000?@\u0003\u001a\r\u0000@\u000b\u0001\u0000" +
                    "\u0000\u0000AF\u0003\u000e\u0007\u0000BC\u0005\u0007\u0000\u0000CE\u0003" +
                    "\u000e\u0007\u0000DB\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000" +
                    "FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\r\u0001\u0000\u0000" +
                    "\u0000HF\u0001\u0000\u0000\u0000IL\u0005\u000f\u0000\u0000JK\u0005\b\u0000" +
                    "\u0000KM\u0003\u001c\u000e\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000" +
                    "\u0000\u0000M\u000f\u0001\u0000\u0000\u0000NS\u0003\u0012\t\u0000OP\u0005" +
                    "\u0007\u0000\u0000PR\u0003\u0012\t\u0000QO\u0001\u0000\u0000\u0000RU\u0001" +
                    "\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000" +
                    "T\u0011\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0003\u0014" +
                    "\n\u0000WX\u0005\u000f\u0000\u0000X\u0013\u0001\u0000\u0000\u0000YZ\u0005" +
                    "\u000f\u0000\u0000Z\u0015\u0001\u0000\u0000\u0000[]\u0003\u0018\f\u0000" +
                    "\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000" +
                    "\u0000^_\u0001\u0000\u0000\u0000_\u0017\u0001\u0000\u0000\u0000`a\u0007" +
                    "\u0000\u0000\u0000a\u0019\u0001\u0000\u0000\u0000bf\u0005\u0002\u0000" +
                    "\u0000ce\u0003\u001e\u000f\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000" +
                    "\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001" +
                    "\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005\u0003\u0000\u0000" +
                    "j\u001b\u0001\u0000\u0000\u0000kl\u0005\u000f\u0000\u0000l\u001d\u0001" +
                    "\u0000\u0000\u0000mn\u0003\u001c\u000e\u0000no\u0005\u0004\u0000\u0000" +
                    "o\u001f\u0001\u0000\u0000\u0000\b*1<FLS^f";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public JavaClassExtractorParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "classDeclaration", "className", "classBody", "classMember", "fieldDeclaration",
                "methodDeclaration", "variableDeclarators", "variableDeclarator", "parameterList",
                "formalParameter", "type", "modifiers", "modifier", "block", "expression",
                "statement"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'class'", "'{'", "'}'", "';'", "'('", "')'", "','", "'='", "'public'",
                "'private'", "'protected'", "'static'", "'final'", "'abstract'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, "Identifier", "BlockComment", "LineComment", "WhiteSpace"
        };
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
    public String getGrammarFileName() {
        return "JavaClassExtractor.g4";
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
    public ATN getATN() {
        return _ATN;
    }

    public final ClassDeclarationContext classDeclaration() throws RecognitionException {
        ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_classDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(32);
                match(T__0);
                setState(33);
                className();
                setState(34);
                classBody();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClassNameContext className() throws RecognitionException {
        ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_className);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(36);
                match(Identifier);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClassBodyContext classBody() throws RecognitionException {
        ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_classBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(38);
                match(T__1);
                setState(42);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0)) {
                    {
                        {
                            setState(39);
                            classMember();
                        }
                    }
                    setState(44);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(45);
                match(T__2);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClassMemberContext classMember() throws RecognitionException {
        ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_classMember);
        try {
            setState(49);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(47);
                    fieldDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(48);
                    methodDeclaration();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
        FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_fieldDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(51);
                modifiers();
                setState(52);
                variableDeclarators();
                setState(53);
                match(T__3);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
        MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_methodDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(55);
                modifiers();
                setState(56);
                type();
                setState(57);
                match(Identifier);
                setState(58);
                match(T__4);
                setState(60);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Identifier) {
                    {
                        setState(59);
                        parameterList();
                    }
                }

                setState(62);
                match(T__5);
                setState(63);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
        VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_variableDeclarators);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(65);
                variableDeclarator();
                setState(70);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__6) {
                    {
                        {
                            setState(66);
                            match(T__6);
                            setState(67);
                            variableDeclarator();
                        }
                    }
                    setState(72);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
        VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_variableDeclarator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(73);
                match(Identifier);
                setState(76);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__7) {
                    {
                        setState(74);
                        match(T__7);
                        setState(75);
                        expression();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ParameterListContext parameterList() throws RecognitionException {
        ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_parameterList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(78);
                formalParameter();
                setState(83);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__6) {
                    {
                        {
                            setState(79);
                            match(T__6);
                            setState(80);
                            formalParameter();
                        }
                    }
                    setState(85);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FormalParameterContext formalParameter() throws RecognitionException {
        FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_formalParameter);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(86);
                type();
                setState(87);
                match(Identifier);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeContext type() throws RecognitionException {
        TypeContext _localctx = new TypeContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_type);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(89);
                match(Identifier);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ModifiersContext modifiers() throws RecognitionException {
        ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_modifiers);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(92);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(91);
                            modifier();
                        }
                    }
                    setState(94);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ModifierContext modifier() throws RecognitionException {
        ModifierContext _localctx = new ModifierContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_modifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(96);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(98);
                match(T__1);
                setState(102);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Identifier) {
                    {
                        {
                            setState(99);
                            statement();
                        }
                    }
                    setState(104);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(105);
                match(T__2);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(107);
                match(Identifier);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(109);
                expression();
                setState(110);
                match(T__3);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ClassDeclarationContext extends ParserRuleContext {
        public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ClassNameContext className() {
            return getRuleContext(ClassNameContext.class, 0);
        }

        public ClassBodyContext classBody() {
            return getRuleContext(ClassBodyContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).enterClassDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).exitClassDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaClassExtractorVisitor)
                return ((JavaClassExtractorVisitor<? extends T>) visitor).visitClassDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ClassNameContext extends ParserRuleContext {
        public ClassNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(JavaClassExtractorParser.Identifier, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_className;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).enterClassName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).exitClassName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaClassExtractorVisitor)
                return ((JavaClassExtractorVisitor<? extends T>) visitor).visitClassName(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ClassBodyContext extends ParserRuleContext {
        public ClassBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ClassMemberContext> classMember() {
            return getRuleContexts(ClassMemberContext.class);
        }

        public ClassMemberContext classMember(int i) {
            return getRuleContext(ClassMemberContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).enterClassBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).exitClassBody(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaClassExtractorVisitor)
                return ((JavaClassExtractorVisitor<? extends T>) visitor).visitClassBody(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ClassMemberContext extends ParserRuleContext {
        public ClassMemberContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FieldDeclarationContext fieldDeclaration() {
            return getRuleContext(FieldDeclarationContext.class, 0);
        }

        public MethodDeclarationContext methodDeclaration() {
            return getRuleContext(MethodDeclarationContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classMember;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).enterClassMember(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).exitClassMember(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaClassExtractorVisitor)
                return ((JavaClassExtractorVisitor<? extends T>) visitor).visitClassMember(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FieldDeclarationContext extends ParserRuleContext {
        public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ModifiersContext modifiers() {
            return getRuleContext(ModifiersContext.class, 0);
        }

        public VariableDeclaratorsContext variableDeclarators() {
            return getRuleContext(VariableDeclaratorsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fieldDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).enterFieldDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).exitFieldDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaClassExtractorVisitor)
                return ((JavaClassExtractorVisitor<? extends T>) visitor).visitFieldDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MethodDeclarationContext extends ParserRuleContext {
        public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ModifiersContext modifiers() {
            return getRuleContext(ModifiersContext.class, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(JavaClassExtractorParser.Identifier, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public ParameterListContext parameterList() {
            return getRuleContext(ParameterListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).enterMethodDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).exitMethodDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaClassExtractorVisitor)
                return ((JavaClassExtractorVisitor<? extends T>) visitor).visitMethodDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class VariableDeclaratorsContext extends ParserRuleContext {
        public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<VariableDeclaratorContext> variableDeclarator() {
            return getRuleContexts(VariableDeclaratorContext.class);
        }

        public VariableDeclaratorContext variableDeclarator(int i) {
            return getRuleContext(VariableDeclaratorContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclarators;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).enterVariableDeclarators(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).exitVariableDeclarators(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaClassExtractorVisitor)
                return ((JavaClassExtractorVisitor<? extends T>) visitor).visitVariableDeclarators(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class VariableDeclaratorContext extends ParserRuleContext {
        public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(JavaClassExtractorParser.Identifier, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).enterVariableDeclarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).exitVariableDeclarator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaClassExtractorVisitor)
                return ((JavaClassExtractorVisitor<? extends T>) visitor).visitVariableDeclarator(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ParameterListContext extends ParserRuleContext {
        public ParameterListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<FormalParameterContext> formalParameter() {
            return getRuleContexts(FormalParameterContext.class);
        }

        public FormalParameterContext formalParameter(int i) {
            return getRuleContext(FormalParameterContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameterList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).enterParameterList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).exitParameterList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaClassExtractorVisitor)
                return ((JavaClassExtractorVisitor<? extends T>) visitor).visitParameterList(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FormalParameterContext extends ParserRuleContext {
        public FormalParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(JavaClassExtractorParser.Identifier, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_formalParameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).enterFormalParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).exitFormalParameter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaClassExtractorVisitor)
                return ((JavaClassExtractorVisitor<? extends T>) visitor).visitFormalParameter(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TypeContext extends ParserRuleContext {
        public TypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(JavaClassExtractorParser.Identifier, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).enterType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).exitType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaClassExtractorVisitor)
                return ((JavaClassExtractorVisitor<? extends T>) visitor).visitType(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ModifiersContext extends ParserRuleContext {
        public ModifiersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ModifierContext> modifier() {
            return getRuleContexts(ModifierContext.class);
        }

        public ModifierContext modifier(int i) {
            return getRuleContext(ModifierContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_modifiers;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).enterModifiers(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).exitModifiers(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaClassExtractorVisitor)
                return ((JavaClassExtractorVisitor<? extends T>) visitor).visitModifiers(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ModifierContext extends ParserRuleContext {
        public ModifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_modifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).enterModifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).exitModifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaClassExtractorVisitor)
                return ((JavaClassExtractorVisitor<? extends T>) visitor).visitModifier(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BlockContext extends ParserRuleContext {
        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).exitBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaClassExtractorVisitor)
                return ((JavaClassExtractorVisitor<? extends T>) visitor).visitBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExpressionContext extends ParserRuleContext {
        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(JavaClassExtractorParser.Identifier, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).exitExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaClassExtractorVisitor)
                return ((JavaClassExtractorVisitor<? extends T>) visitor).visitExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StatementContext extends ParserRuleContext {
        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaClassExtractorListener)
                ((JavaClassExtractorListener) listener).exitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaClassExtractorVisitor)
                return ((JavaClassExtractorVisitor<? extends T>) visitor).visitStatement(this);
            else return visitor.visitChildren(this);
        }
    }
}