// Generated from Cool.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, KLASS=22, FI=23, IF=24, IN=25, 
		INHERITS=26, ISVOID=27, LET=28, LOOP=29, POOL=30, THEN=31, ELSE=32, WHILE=33, 
		CASE=34, ESAC=35, NEW=36, OF=37, NOT=38, TRUE=39, FALSE=40, TYPE=41, ID=42, 
		INTEGER=43, STRING=44, COMMENT=45, LINE_COMENT=46, WS=47;
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
			"T__17", "T__18", "T__19", "T__20", "A", "B", "C", "D", "E", "F", "G", 
			"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
			"V", "W", "X", "Y", "Z", "KLASS", "FI", "IF", "IN", "INHERITS", "ISVOID", 
			"LET", "LOOP", "POOL", "THEN", "ELSE", "WHILE", "CASE", "ESAC", "NEW", 
			"OF", "NOT", "TRUE", "FALSE", "TYPE", "ID", "INTEGER", "STRING", "COMMENT", 
			"LINE_COMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'inherits'", "'{'", "'}'", "'('", "','", "')'", "':'", 
			"'<-'", "'=>'", "'.'", "'@'", "'\u00CB\u0153'", "'*'", "'/'", "'+'", 
			"'-'", "'<'", "'<='", "'='", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "KLASS", 
			"FI", "IF", "IN", "INHERITS", "ISVOID", "LET", "LOOP", "POOL", "THEN", 
			"ELSE", "WHILE", "CASE", "ESAC", "NEW", "OF", "NOT", "TRUE", "FALSE", 
			"TYPE", "ID", "INTEGER", "STRING", "COMMENT", "LINE_COMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0199\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<"+
		"\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3A\3A\3A"+
		"\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3D\3D\7D\u0160\nD\fD\16D\u0163\13"+
		"D\3E\3E\7E\u0167\nE\fE\16E\u016a\13E\3F\6F\u016d\nF\rF\16F\u016e\3G\3"+
		"G\7G\u0173\nG\fG\16G\u0176\13G\3G\3G\3H\3H\3H\3H\7H\u017e\nH\fH\16H\u0181"+
		"\13H\3H\3H\3H\3H\3H\3I\3I\3I\3I\7I\u018c\nI\fI\16I\u018f\13I\3I\3I\3J"+
		"\6J\u0194\nJ\rJ\16J\u0195\3J\3J\4\u0174\u017f\2K\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2"+
		"Q\2S\2U\2W\2Y\2[\2]\2_\2a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y${%"+
		"}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b-\u008d.\u008f/\u0091"+
		"\60\u0093\61\3\2\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2"+
		"IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4"+
		"\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZz"+
		"z\4\2[[{{\4\2\\\\||\3\2C\\\6\2\62;C\\aac|\3\2c|\3\2\62;\4\2\f\f\17\17"+
		"\5\2\13\f\16\17\"\"\2\u0185\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\3\u0095"+
		"\3\2\2\2\5\u0097\3\2\2\2\7\u00a0\3\2\2\2\t\u00a2\3\2\2\2\13\u00a4\3\2"+
		"\2\2\r\u00a6\3\2\2\2\17\u00a8\3\2\2\2\21\u00aa\3\2\2\2\23\u00ac\3\2\2"+
		"\2\25\u00af\3\2\2\2\27\u00b2\3\2\2\2\31\u00b4\3\2\2\2\33\u00b6\3\2\2\2"+
		"\35\u00b9\3\2\2\2\37\u00bb\3\2\2\2!\u00bd\3\2\2\2#\u00bf\3\2\2\2%\u00c1"+
		"\3\2\2\2\'\u00c3\3\2\2\2)\u00c6\3\2\2\2+\u00c8\3\2\2\2-\u00cc\3\2\2\2"+
		"/\u00ce\3\2\2\2\61\u00d0\3\2\2\2\63\u00d2\3\2\2\2\65\u00d4\3\2\2\2\67"+
		"\u00d6\3\2\2\29\u00d8\3\2\2\2;\u00da\3\2\2\2=\u00dc\3\2\2\2?\u00de\3\2"+
		"\2\2A\u00e0\3\2\2\2C\u00e2\3\2\2\2E\u00e4\3\2\2\2G\u00e6\3\2\2\2I\u00e8"+
		"\3\2\2\2K\u00ea\3\2\2\2M\u00ec\3\2\2\2O\u00ee\3\2\2\2Q\u00f0\3\2\2\2S"+
		"\u00f2\3\2\2\2U\u00f4\3\2\2\2W\u00f6\3\2\2\2Y\u00f8\3\2\2\2[\u00fa\3\2"+
		"\2\2]\u00fc\3\2\2\2_\u00fe\3\2\2\2a\u0100\3\2\2\2c\u0106\3\2\2\2e\u0109"+
		"\3\2\2\2g\u010c\3\2\2\2i\u010f\3\2\2\2k\u0118\3\2\2\2m\u011f\3\2\2\2o"+
		"\u0123\3\2\2\2q\u0128\3\2\2\2s\u012d\3\2\2\2u\u0132\3\2\2\2w\u0137\3\2"+
		"\2\2y\u013d\3\2\2\2{\u0142\3\2\2\2}\u0147\3\2\2\2\177\u014b\3\2\2\2\u0081"+
		"\u014e\3\2\2\2\u0083\u0152\3\2\2\2\u0085\u0157\3\2\2\2\u0087\u015d\3\2"+
		"\2\2\u0089\u0164\3\2\2\2\u008b\u016c\3\2\2\2\u008d\u0170\3\2\2\2\u008f"+
		"\u0179\3\2\2\2\u0091\u0187\3\2\2\2\u0093\u0193\3\2\2\2\u0095\u0096\7="+
		"\2\2\u0096\4\3\2\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a"+
		"\7j\2\2\u009a\u009b\7g\2\2\u009b\u009c\7t\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7v\2\2\u009e\u009f\7u\2\2\u009f\6\3\2\2\2\u00a0\u00a1\7}\2\2\u00a1"+
		"\b\3\2\2\2\u00a2\u00a3\7\177\2\2\u00a3\n\3\2\2\2\u00a4\u00a5\7*\2\2\u00a5"+
		"\f\3\2\2\2\u00a6\u00a7\7.\2\2\u00a7\16\3\2\2\2\u00a8\u00a9\7+\2\2\u00a9"+
		"\20\3\2\2\2\u00aa\u00ab\7<\2\2\u00ab\22\3\2\2\2\u00ac\u00ad\7>\2\2\u00ad"+
		"\u00ae\7/\2\2\u00ae\24\3\2\2\2\u00af\u00b0\7?\2\2\u00b0\u00b1\7@\2\2\u00b1"+
		"\26\3\2\2\2\u00b2\u00b3\7\60\2\2\u00b3\30\3\2\2\2\u00b4\u00b5\7B\2\2\u00b5"+
		"\32\3\2\2\2\u00b6\u00b7\7\u00cd\2\2\u00b7\u00b8\7\u0155\2\2\u00b8\34\3"+
		"\2\2\2\u00b9\u00ba\7,\2\2\u00ba\36\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc"+
		" \3\2\2\2\u00bd\u00be\7-\2\2\u00be\"\3\2\2\2\u00bf\u00c0\7/\2\2\u00c0"+
		"$\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2&\3\2\2\2\u00c3\u00c4\7>\2\2\u00c4\u00c5"+
		"\7?\2\2\u00c5(\3\2\2\2\u00c6\u00c7\7?\2\2\u00c7*\3\2\2\2\u00c8\u00c9\7"+
		"p\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7v\2\2\u00cb,\3\2\2\2\u00cc\u00cd"+
		"\t\2\2\2\u00cd.\3\2\2\2\u00ce\u00cf\t\3\2\2\u00cf\60\3\2\2\2\u00d0\u00d1"+
		"\t\4\2\2\u00d1\62\3\2\2\2\u00d2\u00d3\t\5\2\2\u00d3\64\3\2\2\2\u00d4\u00d5"+
		"\t\6\2\2\u00d5\66\3\2\2\2\u00d6\u00d7\t\7\2\2\u00d78\3\2\2\2\u00d8\u00d9"+
		"\t\b\2\2\u00d9:\3\2\2\2\u00da\u00db\t\t\2\2\u00db<\3\2\2\2\u00dc\u00dd"+
		"\t\n\2\2\u00dd>\3\2\2\2\u00de\u00df\t\13\2\2\u00df@\3\2\2\2\u00e0\u00e1"+
		"\t\f\2\2\u00e1B\3\2\2\2\u00e2\u00e3\t\r\2\2\u00e3D\3\2\2\2\u00e4\u00e5"+
		"\t\16\2\2\u00e5F\3\2\2\2\u00e6\u00e7\t\17\2\2\u00e7H\3\2\2\2\u00e8\u00e9"+
		"\t\20\2\2\u00e9J\3\2\2\2\u00ea\u00eb\t\21\2\2\u00ebL\3\2\2\2\u00ec\u00ed"+
		"\t\22\2\2\u00edN\3\2\2\2\u00ee\u00ef\t\23\2\2\u00efP\3\2\2\2\u00f0\u00f1"+
		"\t\24\2\2\u00f1R\3\2\2\2\u00f2\u00f3\t\25\2\2\u00f3T\3\2\2\2\u00f4\u00f5"+
		"\t\26\2\2\u00f5V\3\2\2\2\u00f6\u00f7\t\27\2\2\u00f7X\3\2\2\2\u00f8\u00f9"+
		"\t\30\2\2\u00f9Z\3\2\2\2\u00fa\u00fb\t\31\2\2\u00fb\\\3\2\2\2\u00fc\u00fd"+
		"\t\32\2\2\u00fd^\3\2\2\2\u00fe\u00ff\t\33\2\2\u00ff`\3\2\2\2\u0100\u0101"+
		"\5\61\31\2\u0101\u0102\5C\"\2\u0102\u0103\5-\27\2\u0103\u0104\5Q)\2\u0104"+
		"\u0105\5Q)\2\u0105b\3\2\2\2\u0106\u0107\5\67\34\2\u0107\u0108\5=\37\2"+
		"\u0108d\3\2\2\2\u0109\u010a\5=\37\2\u010a\u010b\5\67\34\2\u010bf\3\2\2"+
		"\2\u010c\u010d\5=\37\2\u010d\u010e\5G$\2\u010eh\3\2\2\2\u010f\u0110\5"+
		"=\37\2\u0110\u0111\5G$\2\u0111\u0112\5;\36\2\u0112\u0113\5\65\33\2\u0113"+
		"\u0114\5O(\2\u0114\u0115\5=\37\2\u0115\u0116\5S*\2\u0116\u0117\5Q)\2\u0117"+
		"j\3\2\2\2\u0118\u0119\5=\37\2\u0119\u011a\5Q)\2\u011a\u011b\5W,\2\u011b"+
		"\u011c\5I%\2\u011c\u011d\5=\37\2\u011d\u011e\5\63\32\2\u011el\3\2\2\2"+
		"\u011f\u0120\5C\"\2\u0120\u0121\5\65\33\2\u0121\u0122\5S*\2\u0122n\3\2"+
		"\2\2\u0123\u0124\5C\"\2\u0124\u0125\5I%\2\u0125\u0126\5I%\2\u0126\u0127"+
		"\5K&\2\u0127p\3\2\2\2\u0128\u0129\5K&\2\u0129\u012a\5I%\2\u012a\u012b"+
		"\5I%\2\u012b\u012c\5C\"\2\u012cr\3\2\2\2\u012d\u012e\5S*\2\u012e\u012f"+
		"\5;\36\2\u012f\u0130\5\65\33\2\u0130\u0131\5G$\2\u0131t\3\2\2\2\u0132"+
		"\u0133\5\65\33\2\u0133\u0134\5C\"\2\u0134\u0135\5Q)\2\u0135\u0136\5\65"+
		"\33\2\u0136v\3\2\2\2\u0137\u0138\5Y-\2\u0138\u0139\5;\36\2\u0139\u013a"+
		"\5=\37\2\u013a\u013b\5C\"\2\u013b\u013c\5\65\33\2\u013cx\3\2\2\2\u013d"+
		"\u013e\5\61\31\2\u013e\u013f\5-\27\2\u013f\u0140\5Q)\2\u0140\u0141\5\65"+
		"\33\2\u0141z\3\2\2\2\u0142\u0143\5\65\33\2\u0143\u0144\5Q)\2\u0144\u0145"+
		"\5-\27\2\u0145\u0146\5\61\31\2\u0146|\3\2\2\2\u0147\u0148\5G$\2\u0148"+
		"\u0149\5\65\33\2\u0149\u014a\5Y-\2\u014a~\3\2\2\2\u014b\u014c\5I%\2\u014c"+
		"\u014d\5\67\34\2\u014d\u0080\3\2\2\2\u014e\u014f\5G$\2\u014f\u0150\5I"+
		"%\2\u0150\u0151\5S*\2\u0151\u0082\3\2\2\2\u0152\u0153\7v\2\2\u0153\u0154"+
		"\5O(\2\u0154\u0155\5U+\2\u0155\u0156\5\65\33\2\u0156\u0084\3\2\2\2\u0157"+
		"\u0158\7h\2\2\u0158\u0159\5-\27\2\u0159\u015a\5C\"\2\u015a\u015b\5Q)\2"+
		"\u015b\u015c\5\65\33\2\u015c\u0086\3\2\2\2\u015d\u0161\t\34\2\2\u015e"+
		"\u0160\t\35\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3"+
		"\2\2\2\u0161\u0162\3\2\2\2\u0162\u0088\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0168\t\36\2\2\u0165\u0167\t\35\2\2\u0166\u0165\3\2\2\2\u0167\u016a\3"+
		"\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u008a\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016b\u016d\t\37\2\2\u016c\u016b\3\2\2\2\u016d\u016e\3"+
		"\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u008c\3\2\2\2\u0170"+
		"\u0174\7$\2\2\u0171\u0173\13\2\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0177\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0177\u0178\7$\2\2\u0178\u008e\3\2\2\2\u0179\u017a\7*\2"+
		"\2\u017a\u017b\7,\2\2\u017b\u017f\3\2\2\2\u017c\u017e\13\2\2\2\u017d\u017c"+
		"\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180"+
		"\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\7,\2\2\u0183\u0184\7+\2"+
		"\2\u0184\u0185\3\2\2\2\u0185\u0186\bH\2\2\u0186\u0090\3\2\2\2\u0187\u0188"+
		"\7/\2\2\u0188\u0189\7/\2\2\u0189\u018d\3\2\2\2\u018a\u018c\n \2\2\u018b"+
		"\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018e\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\bI\2\2\u0191"+
		"\u0092\3\2\2\2\u0192\u0194\t!\2\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\bJ\2\2\u0198\u0094\3\2\2\2\n\2\u0161\u0168\u016e\u0174\u017f\u018d"+
		"\u0195\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}