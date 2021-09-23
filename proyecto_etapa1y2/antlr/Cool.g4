grammar Cool;           

program
    : ( klass ';' ) *
    ;

// Esta regla está mal, solo es para poder generar un parser y probar
klass
    : KLASS
    ;

feature
    : ID'(' (formal (',' formal)*)? ')' ':' TYPE '{' expression '}' # method
    |  #attribute
    ;

formal
   : ID ':' TYPE
   ;

expr
    :
    primary                                                         #base
    |  ...           #simplecall
    |  IF expression THEN expression ELSE expression FI #if
    |  WHILE expression LOOP expression POOL #while
    |  ...           #objectcall
    |  ...           #let
    |  CASE expression OF (ID ':' TYPE => expression ';')+ ESAC # case           #case
    |  NEW TYPE#new
    |  ...           #block
    |  ...           #at
    |  ~expr         #neg
    |  ISVOID expression  #isvoid
    |  expr * expr   #mult
    |  expr / expr   #div
    |  expr + expr   #plus
    |  expr - expr   #less
    |  expr < expr   #lt
    |  expr <= expr   #le
    |  expr = expr   #eq
    |  NOT expr      #not
    |  ...           #assign
    ;

/*
 * Aquí comenzaría el léxico
 */


fragment A : [aA] ;
fragment C : [cC] ;
fragment L : [lL] ;
fragment S : [sS] ;

KLASS : C L A S S ;

