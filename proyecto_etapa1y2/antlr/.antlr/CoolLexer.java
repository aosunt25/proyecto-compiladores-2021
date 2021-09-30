// Generated from /Users/raulglez/Documents/Tec/8. Octavo Semestre/Diseño de Compiladores/proyecto-compiladores-2021/proyecto_etapa1y2/antlr/Cool.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, KLASS=20, FI=21, IF=22, IN=23, INHERITS=24, ISVOID=25, 
		LET=26, LOOP=27, POOL=28, THEN=29, ELSE=30, WHILE=31, CASE=32, ESAC=33, 
		NEW=34, OF=35, NOT=36, TRUE=37, FALSE=38, TYPE=39, ID=40, INT=41, STRING=42, 
		COMMENT=43, LINE_COMMENT=44, WS=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "A", "C", "D", "E", "F", "H", "I", "L", "N", "O", "P", 
			"R", "S", "T", "U", "V", "W", "HEX", "UNICODE", "ESC", "KLASS", "FI", 
			"IF", "IN", "INHERITS", "ISVOID", "LET", "LOOP", "POOL", "THEN", "ELSE", 
			"WHILE", "CASE", "ESAC", "NEW", "OF", "NOT", "TRUE", "FALSE", "TYPE", 
			"ID", "INT", "STRING", "COMMENT", "LINE_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "','", "')'", "':'", "'<-'", "'@'", 
			"'.'", "'~'", "'*'", "'-'", "'+'", "'/'", "'<'", "'<='", "'='", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "KLASS", "FI", "IF", 
			"IN", "INHERITS", "ISVOID", "LET", "LOOP", "POOL", "THEN", "ELSE", "WHILE", 
			"CASE", "ESAC", "NEW", "OF", "NOT", "TRUE", "FALSE", "TYPE", "ID", "INT", 
			"STRING", "COMMENT", "LINE_COMMENT", "WS"
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


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cool.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\5(\u00dc\n(\3)\3)"+
		"\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3."+
		"\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\38\38\38\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3"+
		";\3;\3<\3<\7<\u013d\n<\f<\16<\u0140\13<\3=\3=\7=\u0144\n=\f=\16=\u0147"+
		"\13=\3>\6>\u014a\n>\r>\16>\u014b\3?\3?\3?\7?\u0151\n?\f?\16?\u0154\13"+
		"?\3?\3?\3@\3@\3@\3@\7@\u015c\n@\f@\16@\u015f\13@\3@\3@\3@\3@\3@\3A\3A"+
		"\3A\3A\7A\u016a\nA\fA\16A\u016d\13A\3A\3A\3B\6B\u0172\nB\rB\16B\u0173"+
		"\3B\3B\3\u015d\2C\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\2-\2/\2\61\2\63\2\65\2\67\2"+
		"9\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\26S\27U\30W\31Y\32[\33]\34_\35a"+
		"\36c\37e g!i\"k#m$o%q&s\'u(w)y*{+},\177-\u0081.\u0083/\3\2\34\4\2CCcc"+
		"\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2JJjj\4\2KKkk\4\2NNnn\4\2PPpp\4\2Q"+
		"Qqq\4\2RRrr\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\5\2\62;CH"+
		"ch\n\2$$\61\61^^ddhhppttvv\3\2C\\\6\2\62;C\\aac|\3\2c|\3\2\62;\4\2$$^"+
		"^\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u016b\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2\5\u0087\3\2\2\2\7\u0089\3\2\2\2\t"+
		"\u008b\3\2\2\2\13\u008d\3\2\2\2\r\u008f\3\2\2\2\17\u0091\3\2\2\2\21\u0093"+
		"\3\2\2\2\23\u0096\3\2\2\2\25\u0098\3\2\2\2\27\u009a\3\2\2\2\31\u009c\3"+
		"\2\2\2\33\u009e\3\2\2\2\35\u00a0\3\2\2\2\37\u00a2\3\2\2\2!\u00a4\3\2\2"+
		"\2#\u00a6\3\2\2\2%\u00a9\3\2\2\2\'\u00ab\3\2\2\2)\u00ae\3\2\2\2+\u00b0"+
		"\3\2\2\2-\u00b2\3\2\2\2/\u00b4\3\2\2\2\61\u00b6\3\2\2\2\63\u00b8\3\2\2"+
		"\2\65\u00ba\3\2\2\2\67\u00bc\3\2\2\29\u00be\3\2\2\2;\u00c0\3\2\2\2=\u00c2"+
		"\3\2\2\2?\u00c4\3\2\2\2A\u00c6\3\2\2\2C\u00c8\3\2\2\2E\u00ca\3\2\2\2G"+
		"\u00cc\3\2\2\2I\u00ce\3\2\2\2K\u00d0\3\2\2\2M\u00d2\3\2\2\2O\u00d8\3\2"+
		"\2\2Q\u00dd\3\2\2\2S\u00e3\3\2\2\2U\u00e6\3\2\2\2W\u00e9\3\2\2\2Y\u00ec"+
		"\3\2\2\2[\u00f5\3\2\2\2]\u00fc\3\2\2\2_\u0100\3\2\2\2a\u0105\3\2\2\2c"+
		"\u010a\3\2\2\2e\u010f\3\2\2\2g\u0114\3\2\2\2i\u011a\3\2\2\2k\u011f\3\2"+
		"\2\2m\u0124\3\2\2\2o\u0128\3\2\2\2q\u012b\3\2\2\2s\u012f\3\2\2\2u\u0134"+
		"\3\2\2\2w\u013a\3\2\2\2y\u0141\3\2\2\2{\u0149\3\2\2\2}\u014d\3\2\2\2\177"+
		"\u0157\3\2\2\2\u0081\u0165\3\2\2\2\u0083\u0171\3\2\2\2\u0085\u0086\7="+
		"\2\2\u0086\4\3\2\2\2\u0087\u0088\7}\2\2\u0088\6\3\2\2\2\u0089\u008a\7"+
		"\177\2\2\u008a\b\3\2\2\2\u008b\u008c\7*\2\2\u008c\n\3\2\2\2\u008d\u008e"+
		"\7.\2\2\u008e\f\3\2\2\2\u008f\u0090\7+\2\2\u0090\16\3\2\2\2\u0091\u0092"+
		"\7<\2\2\u0092\20\3\2\2\2\u0093\u0094\7>\2\2\u0094\u0095\7/\2\2\u0095\22"+
		"\3\2\2\2\u0096\u0097\7B\2\2\u0097\24\3\2\2\2\u0098\u0099\7\60\2\2\u0099"+
		"\26\3\2\2\2\u009a\u009b\7\u0080\2\2\u009b\30\3\2\2\2\u009c\u009d\7,\2"+
		"\2\u009d\32\3\2\2\2\u009e\u009f\7/\2\2\u009f\34\3\2\2\2\u00a0\u00a1\7"+
		"-\2\2\u00a1\36\3\2\2\2\u00a2\u00a3\7\61\2\2\u00a3 \3\2\2\2\u00a4\u00a5"+
		"\7>\2\2\u00a5\"\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\u00a8\7?\2\2\u00a8$\3"+
		"\2\2\2\u00a9\u00aa\7?\2\2\u00aa&\3\2\2\2\u00ab\u00ac\7?\2\2\u00ac\u00ad"+
		"\7@\2\2\u00ad(\3\2\2\2\u00ae\u00af\t\2\2\2\u00af*\3\2\2\2\u00b0\u00b1"+
		"\t\3\2\2\u00b1,\3\2\2\2\u00b2\u00b3\t\4\2\2\u00b3.\3\2\2\2\u00b4\u00b5"+
		"\t\5\2\2\u00b5\60\3\2\2\2\u00b6\u00b7\t\6\2\2\u00b7\62\3\2\2\2\u00b8\u00b9"+
		"\t\7\2\2\u00b9\64\3\2\2\2\u00ba\u00bb\t\b\2\2\u00bb\66\3\2\2\2\u00bc\u00bd"+
		"\t\t\2\2\u00bd8\3\2\2\2\u00be\u00bf\t\n\2\2\u00bf:\3\2\2\2\u00c0\u00c1"+
		"\t\13\2\2\u00c1<\3\2\2\2\u00c2\u00c3\t\f\2\2\u00c3>\3\2\2\2\u00c4\u00c5"+
		"\t\r\2\2\u00c5@\3\2\2\2\u00c6\u00c7\t\16\2\2\u00c7B\3\2\2\2\u00c8\u00c9"+
		"\t\17\2\2\u00c9D\3\2\2\2\u00ca\u00cb\t\20\2\2\u00cbF\3\2\2\2\u00cc\u00cd"+
		"\t\21\2\2\u00cdH\3\2\2\2\u00ce\u00cf\t\22\2\2\u00cfJ\3\2\2\2\u00d0\u00d1"+
		"\t\23\2\2\u00d1L\3\2\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\5K&\2\u00d4\u00d5"+
		"\5K&\2\u00d5\u00d6\5K&\2\u00d6\u00d7\5K&\2\u00d7N\3\2\2\2\u00d8\u00db"+
		"\7^\2\2\u00d9\u00dc\t\24\2\2\u00da\u00dc\5M\'\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00da\3\2\2\2\u00dcP\3\2\2\2\u00dd\u00de\5+\26\2\u00de\u00df\5\67\34"+
		"\2\u00df\u00e0\5)\25\2\u00e0\u00e1\5A!\2\u00e1\u00e2\5A!\2\u00e2R\3\2"+
		"\2\2\u00e3\u00e4\5\61\31\2\u00e4\u00e5\5\65\33\2\u00e5T\3\2\2\2\u00e6"+
		"\u00e7\5\65\33\2\u00e7\u00e8\5\61\31\2\u00e8V\3\2\2\2\u00e9\u00ea\5\65"+
		"\33\2\u00ea\u00eb\59\35\2\u00ebX\3\2\2\2\u00ec\u00ed\5\65\33\2\u00ed\u00ee"+
		"\59\35\2\u00ee\u00ef\5\63\32\2\u00ef\u00f0\5/\30\2\u00f0\u00f1\5? \2\u00f1"+
		"\u00f2\5\65\33\2\u00f2\u00f3\5C\"\2\u00f3\u00f4\5A!\2\u00f4Z\3\2\2\2\u00f5"+
		"\u00f6\5\65\33\2\u00f6\u00f7\5A!\2\u00f7\u00f8\5G$\2\u00f8\u00f9\5;\36"+
		"\2\u00f9\u00fa\5\65\33\2\u00fa\u00fb\5-\27\2\u00fb\\\3\2\2\2\u00fc\u00fd"+
		"\5\67\34\2\u00fd\u00fe\5/\30\2\u00fe\u00ff\5C\"\2\u00ff^\3\2\2\2\u0100"+
		"\u0101\5\67\34\2\u0101\u0102\5;\36\2\u0102\u0103\5;\36\2\u0103\u0104\5"+
		"=\37\2\u0104`\3\2\2\2\u0105\u0106\5=\37\2\u0106\u0107\5;\36\2\u0107\u0108"+
		"\5;\36\2\u0108\u0109\5\67\34\2\u0109b\3\2\2\2\u010a\u010b\5C\"\2\u010b"+
		"\u010c\5\63\32\2\u010c\u010d\5/\30\2\u010d\u010e\59\35\2\u010ed\3\2\2"+
		"\2\u010f\u0110\5/\30\2\u0110\u0111\5\67\34\2\u0111\u0112\5A!\2\u0112\u0113"+
		"\5/\30\2\u0113f\3\2\2\2\u0114\u0115\5I%\2\u0115\u0116\5\63\32\2\u0116"+
		"\u0117\5\65\33\2\u0117\u0118\5\67\34\2\u0118\u0119\5/\30\2\u0119h\3\2"+
		"\2\2\u011a\u011b\5+\26\2\u011b\u011c\5)\25\2\u011c\u011d\5A!\2\u011d\u011e"+
		"\5/\30\2\u011ej\3\2\2\2\u011f\u0120\5/\30\2\u0120\u0121\5A!\2\u0121\u0122"+
		"\5)\25\2\u0122\u0123\5+\26\2\u0123l\3\2\2\2\u0124\u0125\59\35\2\u0125"+
		"\u0126\5/\30\2\u0126\u0127\5I%\2\u0127n\3\2\2\2\u0128\u0129\5;\36\2\u0129"+
		"\u012a\5\61\31\2\u012ap\3\2\2\2\u012b\u012c\59\35\2\u012c\u012d\5;\36"+
		"\2\u012d\u012e\5C\"\2\u012er\3\2\2\2\u012f\u0130\5C\"\2\u0130\u0131\5"+
		"? \2\u0131\u0132\5E#\2\u0132\u0133\5/\30\2\u0133t\3\2\2\2\u0134\u0135"+
		"\5\61\31\2\u0135\u0136\5)\25\2\u0136\u0137\5\67\34\2\u0137\u0138\5A!\2"+
		"\u0138\u0139\5/\30\2\u0139v\3\2\2\2\u013a\u013e\t\25\2\2\u013b\u013d\t"+
		"\26\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013fx\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0145\t\27\2\2"+
		"\u0142\u0144\t\26\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146z\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"\u014a\t\30\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3"+
		"\2\2\2\u014b\u014c\3\2\2\2\u014c|\3\2\2\2\u014d\u0152\7$\2\2\u014e\u0151"+
		"\5O(\2\u014f\u0151\n\31\2\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7$\2\2\u0156~\3\2\2\2\u0157\u0158"+
		"\7\61\2\2\u0158\u0159\7,\2\2\u0159\u015d\3\2\2\2\u015a\u015c\13\2\2\2"+
		"\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015e\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7,\2\2\u0161"+
		"\u0162\7\61\2\2\u0162\u0163\3\2\2\2\u0163\u0164\b@\2\2\u0164\u0080\3\2"+
		"\2\2\u0165\u0166\7\61\2\2\u0166\u0167\7\61\2\2\u0167\u016b\3\2\2\2\u0168"+
		"\u016a\n\32\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3"+
		"\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u016f\bA\2\2\u016f\u0082\3\2\2\2\u0170\u0172\t\33\2\2\u0171\u0170\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\bB\2\2\u0176\u0084\3\2\2\2\f\2\u00db\u013e"+
		"\u0145\u014b\u0150\u0152\u015d\u016b\u0173\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}