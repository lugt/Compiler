/* The following code was generated by JFlex 1.4.3 on 04/12/13 15:19 */

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 04/12/13 15:19 from the specification file
 * <tt>/autofs/netapp/account/cremi/jaupetit/FAC/Sem7/Compilation/Projet_Compilation/ProjetCompilation2013/lexer/calculette.jflex</tt>
 */
class CalculetteLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\2\2\0\1\1\22\0\1\51\1\30\1\56\2\0\1\31"+
    "\1\12\1\55\1\20\1\21\1\11\1\24\1\23\1\6\1\4\1\10"+
    "\12\3\1\0\1\22\1\26\1\13\1\27\2\0\4\7\1\5\25\7"+
    "\1\14\1\0\1\15\1\0\1\7\1\0\1\52\1\54\1\53\1\43"+
    "\1\34\1\33\1\50\1\42\1\32\2\7\1\35\1\7\1\45\1\37"+
    "\1\44\1\7\1\40\1\36\1\46\1\47\1\7\1\41\3\7\1\16"+
    "\1\25\1\17\u05e2\0\12\3\206\0\12\3\u026c\0\12\3\166\0\12\3"+
    "\166\0\12\3\166\0\12\3\166\0\12\3\167\0\11\3\166\0\12\3"+
    "\166\0\12\3\166\0\12\3\340\0\12\3\166\0\12\3\106\0\12\3"+
    "\u0116\0\12\3\u031f\0\11\3\u046e\0\12\3\46\0\12\3\u012c\0\12\3"+
    "\ue5c0\0\12\3\346\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\1"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\1\1\21\1\22\1\23\1\24\14\3"+
    "\2\1\4\0\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\10\3\1\35\5\3\2\0\2\36\1\0"+
    "\1\1\2\0\1\37\1\40\13\3\1\41\1\42\1\0"+
    "\1\3\1\43\2\3\1\44\2\3\1\45\1\3\1\46"+
    "\1\47\1\50\1\51\1\3\1\52\2\3\1\53\2\3"+
    "\1\54\2\3\7\0\1\55\3\0\1\56\1\57";

  private static int [] zzUnpackAction() {
    int [] result = new int[123];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\57\0\274\0\57\0\353"+
    "\0\u011a\0\57\0\57\0\57\0\57\0\57\0\57\0\57"+
    "\0\57\0\57\0\u0149\0\u0178\0\u01a7\0\u01d6\0\57\0\u0205"+
    "\0\u0234\0\u0263\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d"+
    "\0\u03ac\0\u03db\0\u040a\0\u0439\0\u0468\0\u0497\0\u04c6\0\u04f5"+
    "\0\u0524\0\u0553\0\57\0\57\0\57\0\57\0\57\0\57"+
    "\0\215\0\u0582\0\u05b1\0\u05e0\0\u060f\0\u063e\0\u066d\0\u069c"+
    "\0\u06cb\0\215\0\u06fa\0\u0729\0\u0758\0\u0787\0\u07b6\0\u07e5"+
    "\0\u0814\0\u0843\0\u0872\0\u0872\0\u08a1\0\u08d0\0\u08ff\0\215"+
    "\0\215\0\u092e\0\u095d\0\u098c\0\u09bb\0\u09ea\0\u0a19\0\u0a48"+
    "\0\u0a77\0\u0aa6\0\u0ad5\0\u0b04\0\57\0\57\0\u0b33\0\u0b62"+
    "\0\215\0\u0b91\0\u0bc0\0\215\0\u0bef\0\u0c1e\0\215\0\u0c4d"+
    "\0\215\0\215\0\215\0\215\0\u0c7c\0\215\0\u0cab\0\u0cda"+
    "\0\215\0\u0d09\0\u0d38\0\215\0\u0d67\0\u0d96\0\u0dc5\0\u0df4"+
    "\0\u0e23\0\u0e52\0\u0e81\0\u0eb0\0\u0edf\0\57\0\u0f0e\0\u0f3d"+
    "\0\u0f6c\0\57\0\57";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[123];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\3\2\1\3\1\2\1\4\1\5\1\4\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\4\1\33\1\4\1\34\1\35"+
    "\1\4\1\36\1\37\1\4\1\40\1\41\1\4\1\2"+
    "\1\4\1\42\1\43\1\44\1\45\62\0\1\3\1\46"+
    "\1\47\26\0\1\47\25\0\1\4\1\0\1\4\1\0"+
    "\1\4\22\0\17\4\1\0\3\4\12\0\1\50\1\51"+
    "\52\0\1\52\1\0\1\52\2\0\1\53\17\0\17\52"+
    "\1\0\3\52\15\0\1\54\70\0\1\55\44\0\1\56"+
    "\56\0\1\57\56\0\1\60\46\0\1\4\1\0\1\4"+
    "\1\0\1\4\22\0\1\4\1\61\11\4\1\62\3\4"+
    "\1\0\3\4\5\0\1\4\1\0\1\4\1\0\1\4"+
    "\22\0\5\4\1\63\11\4\1\0\1\64\2\4\5\0"+
    "\1\4\1\0\1\4\1\0\1\4\22\0\3\4\1\65"+
    "\13\4\1\0\3\4\5\0\1\4\1\0\1\4\1\0"+
    "\1\4\22\0\10\4\1\66\3\4\1\67\2\4\1\0"+
    "\3\4\5\0\1\4\1\0\1\4\1\0\1\4\22\0"+
    "\2\4\1\70\14\4\1\0\3\4\5\0\1\4\1\0"+
    "\1\4\1\0\1\4\22\0\10\4\1\71\6\4\1\0"+
    "\3\4\5\0\1\4\1\0\1\4\1\0\1\4\22\0"+
    "\5\4\1\72\11\4\1\0\3\4\5\0\1\4\1\0"+
    "\1\4\1\0\1\4\22\0\5\4\1\73\11\4\1\0"+
    "\3\4\5\0\1\4\1\0\1\4\1\0\1\4\22\0"+
    "\6\4\1\74\10\4\1\0\3\4\5\0\1\4\1\0"+
    "\1\4\1\0\1\4\22\0\13\4\1\75\3\4\1\0"+
    "\3\4\5\0\1\4\1\0\1\4\1\0\1\4\22\0"+
    "\10\4\1\76\6\4\1\0\3\4\5\0\1\4\1\0"+
    "\1\4\1\0\1\4\22\0\5\4\1\77\11\4\1\0"+
    "\3\4\7\0\1\100\1\0\1\100\22\0\17\100\1\0"+
    "\3\100\7\0\1\101\1\0\1\101\22\0\17\101\1\0"+
    "\3\101\5\0\1\102\56\0\1\103\2\0\1\104\15\0"+
    "\1\104\32\0\1\50\1\105\1\2\54\50\11\106\1\107"+
    "\45\106\3\0\1\52\1\0\1\52\1\0\1\52\22\0"+
    "\17\52\1\0\3\52\5\0\1\4\1\0\1\4\1\0"+
    "\1\4\22\0\14\4\1\110\2\4\1\0\3\4\5\0"+
    "\1\4\1\0\1\4\1\0\1\4\22\0\6\4\1\111"+
    "\10\4\1\0\3\4\5\0\1\4\1\0\1\4\1\0"+
    "\1\4\22\0\3\4\1\112\13\4\1\0\3\4\5\0"+
    "\1\4\1\0\1\4\1\0\1\4\22\0\4\4\1\113"+
    "\12\4\1\0\3\4\5\0\1\4\1\0\1\4\1\0"+
    "\1\4\22\0\5\4\1\114\11\4\1\0\3\4\5\0"+
    "\1\4\1\0\1\4\1\0\1\4\22\0\6\4\1\115"+
    "\10\4\1\0\3\4\5\0\1\4\1\0\1\4\1\0"+
    "\1\4\22\0\17\4\1\0\1\116\2\4\5\0\1\4"+
    "\1\0\1\4\1\0\1\4\22\0\1\117\16\4\1\0"+
    "\3\4\5\0\1\4\1\0\1\4\1\0\1\4\22\0"+
    "\1\120\16\4\1\0\3\4\5\0\1\4\1\0\1\4"+
    "\1\0\1\4\22\0\15\4\1\121\1\4\1\0\3\4"+
    "\5\0\1\4\1\0\1\4\1\0\1\4\22\0\4\4"+
    "\1\122\12\4\1\0\3\4\5\0\1\4\1\0\1\4"+
    "\1\0\1\4\22\0\17\4\1\0\1\123\2\4\5\0"+
    "\1\4\1\0\1\4\1\0\1\4\22\0\5\4\1\124"+
    "\11\4\1\0\3\4\5\0\1\100\1\0\1\100\1\0"+
    "\1\100\22\0\17\100\1\0\3\100\1\125\4\0\1\101"+
    "\1\0\1\101\1\0\1\101\22\0\17\101\1\0\3\101"+
    "\1\0\1\126\3\0\1\102\1\0\1\47\26\0\1\47"+
    "\25\0\1\103\55\0\1\2\54\0\11\106\1\127\45\106"+
    "\10\0\1\2\1\107\50\0\1\4\1\0\1\4\1\0"+
    "\1\4\22\0\4\4\1\130\12\4\1\0\3\4\5\0"+
    "\1\4\1\0\1\4\1\0\1\4\22\0\2\4\1\131"+
    "\14\4\1\0\3\4\5\0\1\4\1\0\1\4\1\0"+
    "\1\4\22\0\6\4\1\132\10\4\1\0\3\4\5\0"+
    "\1\4\1\0\1\4\1\0\1\4\22\0\1\133\16\4"+
    "\1\0\3\4\5\0\1\4\1\0\1\4\1\0\1\4"+
    "\22\0\3\4\1\134\13\4\1\0\3\4\5\0\1\4"+
    "\1\0\1\4\1\0\1\4\22\0\3\4\1\135\13\4"+
    "\1\0\3\4\5\0\1\4\1\0\1\4\1\0\1\4"+
    "\22\0\13\4\1\136\3\4\1\0\3\4\5\0\1\4"+
    "\1\0\1\4\1\0\1\4\22\0\2\4\1\137\14\4"+
    "\1\0\3\4\5\0\1\4\1\0\1\4\1\0\1\4"+
    "\22\0\1\140\16\4\1\0\3\4\5\0\1\4\1\0"+
    "\1\4\1\0\1\4\22\0\6\4\1\141\10\4\1\0"+
    "\3\4\5\0\1\4\1\0\1\4\1\0\1\4\22\0"+
    "\3\4\1\142\13\4\1\0\3\4\2\0\10\106\1\2"+
    "\1\127\45\106\3\0\1\4\1\0\1\4\1\0\1\4"+
    "\22\0\2\4\1\143\14\4\1\0\3\4\5\0\1\4"+
    "\1\0\1\4\1\0\1\4\22\0\14\4\1\144\2\4"+
    "\1\0\3\4\5\0\1\4\1\0\1\4\1\0\1\4"+
    "\22\0\13\4\1\145\3\4\1\0\3\4\5\0\1\4"+
    "\1\0\1\4\1\0\1\4\22\0\2\4\1\146\14\4"+
    "\1\0\3\4\5\0\1\4\1\0\1\4\1\0\1\4"+
    "\22\0\14\4\1\147\2\4\1\0\3\4\5\0\1\4"+
    "\1\0\1\4\1\0\1\4\22\0\16\4\1\150\1\0"+
    "\3\4\5\0\1\4\1\0\1\4\1\0\1\4\22\0"+
    "\16\4\1\151\1\0\3\4\5\0\1\4\1\0\1\4"+
    "\1\0\1\4\22\0\2\4\1\152\14\4\1\0\3\4"+
    "\5\0\1\4\1\0\1\4\1\0\1\4\22\0\13\4"+
    "\1\153\3\4\1\0\3\4\5\0\1\4\1\0\1\4"+
    "\1\0\1\4\22\0\6\4\1\154\10\4\1\0\3\4"+
    "\5\0\1\4\1\0\1\4\1\0\1\4\22\0\2\4"+
    "\1\155\14\4\1\0\3\4\5\0\1\4\1\0\1\4"+
    "\1\0\1\4\22\0\11\4\1\156\5\4\1\0\3\4"+
    "\5\0\1\4\1\0\1\4\1\0\1\4\22\0\17\4"+
    "\1\157\3\4\34\0\1\160\3\0\1\161\1\0\1\162"+
    "\10\0\1\157\52\0\1\163\53\0\1\164\50\0\1\165"+
    "\70\0\1\166\47\0\1\167\71\0\1\170\44\0\1\171"+
    "\53\0\1\172\67\0\1\173\10\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3995];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\1\1\1\11\2\1\11\11"+
    "\4\1\1\11\16\1\4\0\1\1\6\11\17\1\2\0"+
    "\2\1\1\0\1\1\2\0\15\1\2\11\1\0\27\1"+
    "\7\0\1\11\3\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[123];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  CalculetteLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  CalculetteLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 206) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 37: 
          { return new Symbol(CalculetteSymbol.BOOL,  yyline, yycolumn, yytext());
          }
        case 48: break;
        case 27: 
          { return new Symbol(CalculetteSymbol.DIFF,  yyline, yycolumn);
          }
        case 49: break;
        case 36: 
          { return new Symbol(CalculetteSymbol.ENUM_TYPE, yyline, yycolumn,
           EnumType.REAL);
          }
        case 50: break;
        case 9: 
          { return new Symbol(CalculetteSymbol.RSBRA, yyline, yycolumn);
          }
        case 51: break;
        case 19: 
          { return new Symbol(CalculetteSymbol.NOT,   yyline, yycolumn);
          }
        case 52: break;
        case 28: 
          { return new Symbol(CalculetteSymbol.IF, yyline, yycolumn);
          }
        case 53: break;
        case 24: 
          { return new Symbol(CalculetteSymbol.OR,    yyline, yycolumn);
          }
        case 54: break;
        case 21: 
          { return new Symbol(CalculetteSymbol.ID, yyline, yycolumn,
           yytext());
          }
        case 55: break;
        case 23: 
          { return new Symbol(CalculetteSymbol.EQ,    yyline, yycolumn);
          }
        case 56: break;
        case 8: 
          { return new Symbol(CalculetteSymbol.LSBRA, yyline, yycolumn);
          }
        case 57: break;
        case 17: 
          { return new Symbol(CalculetteSymbol.LT,    yyline, yycolumn);
          }
        case 58: break;
        case 12: 
          { return new Symbol(CalculetteSymbol.LRBRA,  yyline, yycolumn);
          }
        case 59: break;
        case 11: 
          { return new Symbol(CalculetteSymbol.RBRACE, yyline, yycolumn);
          }
        case 60: break;
        case 26: 
          { return new Symbol(CalculetteSymbol.GE,    yyline, yycolumn);
          }
        case 61: break;
        case 7: 
          { return new Symbol(CalculetteSymbol.AFFECT, yyline, yycolumn);
          }
        case 62: break;
        case 38: 
          { return new Symbol(CalculetteSymbol.ENUM_TYPE, yyline, yycolumn, EnumType.CHARACTER);
          }
        case 63: break;
        case 5: 
          { return new Symbol(CalculetteSymbol.DIVIDE,yyline, yycolumn);
          }
        case 64: break;
        case 44: 
          { return new Symbol(CalculetteSymbol.POINTER, yyline, yycolumn);
          }
        case 65: break;
        case 33: 
          { return new Symbol(CalculetteSymbol.CHARACTER, yyline, yycolumn, yytext());
          }
        case 66: break;
        case 41: 
          { return new Symbol(CalculetteSymbol.ENUM_TYPE, yyline, yycolumn,
           EnumType.SHORT);
          }
        case 67: break;
        case 16: 
          { return new Symbol(CalculetteSymbol.PLUS,  yyline, yycolumn);
          }
        case 68: break;
        case 20: 
          { return new Symbol(CalculetteSymbol.MOD,   yyline, yycolumn);
          }
        case 69: break;
        case 4: 
          { return new Symbol(CalculetteSymbol.MINUS, yyline, yycolumn);
          }
        case 70: break;
        case 30: 
          { return new Symbol(CalculetteSymbol.REAL, yyline, yycolumn,
				   new Float(yytext()));
          }
        case 71: break;
        case 22: 
          { return new Symbol(CalculetteSymbol.AND,   yyline, yycolumn);
          }
        case 72: break;
        case 13: 
          { return new Symbol(CalculetteSymbol.RRBRA,  yyline, yycolumn);
          }
        case 73: break;
        case 25: 
          { return new Symbol(CalculetteSymbol.LE,    yyline, yycolumn);
          }
        case 74: break;
        case 40: 
          { return new Symbol(CalculetteSymbol.BOOL, yyline, yycolumn, yytext());
          }
        case 75: break;
        case 31: 
          { return new Symbol(CalculetteSymbol.ENUM_TYPE, yyline, yycolumn,
           EnumType.INTEGER);
          }
        case 76: break;
        case 42: 
          { return new Symbol(CalculetteSymbol.WHILE, yyline, yycolumn);
          }
        case 77: break;
        case 32: 
          { return new Symbol(CalculetteSymbol.FOR, yyline, yycolumn);
          }
        case 78: break;
        case 34: 
          { return new Symbol(CalculetteSymbol.CHARACTERS, yyline, yycolumn, yytext());
          }
        case 79: break;
        case 35: 
          { return new Symbol(CalculetteSymbol.ELSE, yyline, yycolumn);
          }
        case 80: break;
        case 15: 
          { return new Symbol(CalculetteSymbol.COMMA, yyline, yycolumn);
          }
        case 81: break;
        case 29: 
          { return new Symbol(CalculetteSymbol.DO, yyline, yycolumn);
          }
        case 82: break;
        case 43: 
          { return new Symbol(CalculetteSymbol.ENUM_TYPE, yyline, yycolumn, EnumType.STRING);
          }
        case 83: break;
        case 6: 
          { return new Symbol(CalculetteSymbol.TIMES, yyline, yycolumn);
          }
        case 84: break;
        case 14: 
          { return new Symbol(CalculetteSymbol.SEMIC, yyline, yycolumn);
          }
        case 85: break;
        case 47: 
          { return new Symbol(CalculetteSymbol.ENUM_TYPE, yyline, yycolumn,
           EnumType.UNSIGNED_SHORT);
          }
        case 86: break;
        case 46: 
          { return new Symbol(CalculetteSymbol.ENUM_TYPE, yyline, yycolumn,
           EnumType.UNSIGNED_REAL);
          }
        case 87: break;
        case 3: 
          { return new Symbol(CalculetteSymbol.ID, yyline, yycolumn, yytext());
          }
        case 88: break;
        case 45: 
          { return new Symbol(CalculetteSymbol.ENUM_TYPE, yyline, yycolumn,
           EnumType.UNSIGNED_INTEGER);
          }
        case 89: break;
        case 18: 
          { return new Symbol(CalculetteSymbol.GT,    yyline, yycolumn);
          }
        case 90: break;
        case 10: 
          { return new Symbol(CalculetteSymbol.LBRACE, yyline, yycolumn);
          }
        case 91: break;
        case 2: 
          { return new Symbol(CalculetteSymbol.INT, yyline, yycolumn,
				   new Integer(yytext()));
          }
        case 92: break;
        case 39: 
          { return new Symbol(CalculetteSymbol.ENUM_TYPE, yyline, yycolumn, EnumType.BOOLEAN);
          }
        case 93: break;
        case 1: 
          { 
          }
        case 94: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(CalculetteSymbol.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
