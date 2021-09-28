grammar Cool;

program: (klass ';')*;

// Esta regla está mal, solo es para poder generar un parser y probar
klass: KLASS TYPE (INHERITS TYPE)? '{' (feature ';')* '}';

feature
	: ID '(' (formal (',' formal)*)? ')' ':' TYPE '{' expression '}'# method
	| ID ':' TYPE ('<-' expression)?  #attribute
	;

formal: ID ':' TYPE;


expression: 
			primary #base
			|expression ('@' TYPE)? '.' ID '(' (expression (',' expression)*)* ')'  #at    								
			| IF expression THEN expression ELSE expression FI	#if									
			| WHILE expression LOOP expression POOL #while
			| expression (TYPE)? '.' ID '(' (expression (',' expression)*)* ')' #objectcall	
			| ID '(' (expression (',' expression)*)* ')'  #simplecall												
			| '{' (expression ';')+ '}'	 #block																	
			| LET let_decl (',' let_decl)* IN expression #let
			| CASE OF case_stat + ESAC #case								
			| NEW TYPE	#new																																					
			| '~'expression	# negative																				
			| ISVOID expression	# isvoid																	
			| expression '*' expression # multiply																			
			| expression '-' expression # minus																		
			| expression '+' expression	# add																		
			| expression '/' expression	# division																			
			| expression '<' expression	# lessThan																		
			| expression '<=' expression # lessEqual																			
			| expression '=' expression	# equal																		
			| NOT expression # boolNot																				
			| ID '<-' expression # assignment
			;	

case_stat:(ID ':' TYPE '=>' expression ';');

let_decl: ID ':' TYPE ( '<-' expression )? ;

primary:
	'(' expression ')' # parentheses
   | ID # id
   | INT # int
   | STRING # string
   | TRUE # true
   | FALSE # false
    ;
    																	

/*
* Aquí comenzaría el léxico
*/

fragment A: [aA];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment H: [hH];
fragment I: [iI];
fragment L: [lL];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];

//Fragments para declarar el string
fragment HEX: [0-9a-fA-F];
fragment UNICODE: 'u' HEX HEX HEX HEX;
fragment ESC: '\\' (["\\/bfnrt] | UNICODE);

KLASS: C L A S S;
FI: F I;
IF: I F;
IN: I N; 
INHERITS: I N H E R I T S;
ISVOID: I S V O I D;
LET: L E T;
LOOP: L O O P;
POOL: P O O L;
THEN: T H E N;
ELSE: E L S E;
WHILE: W H I L E;
CASE: C A S E;
ESAC: E S A C;
NEW: N E W;
OF: O F;
NOT: N O T;
TRUE: T R U E;
FALSE: F A L S E;

TYPE: [A-Z] [_0-9A-Za-z]*;
ID: [a-z] [_0-9A-Za-z]*;
INT: [0-9]+;
STRING: '"' (ESC | ~ ["\\])* '"';

// Ignorar:
COMMENT: '/*' .*? '*/' -> skip;

LINE_COMMENT: '//' ~[\r\n]* -> skip;

WS: [ \t\r\n]+ -> skip;