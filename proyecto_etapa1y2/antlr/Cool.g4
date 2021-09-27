grammar Cool;

program: ( klass ';')*;

// Esta regla está mal, solo es para poder generar un parser y probar
klass: CLASS TYPE (INHERITS TYPE)? '{' (feature ';')* '}';

// Ignorar:
COMMENT: '/*' .*? '*/' -> skip;

LINE_COMMENT: '//' ~[\r\n]* -> skip;

WS: [ \t\r\n]+ -> skip;

feature
	: ID '(' (formal (',' formal)*)? ')' ':' TYPE '{' expression '}'
	| ID ':' TYPE'(''<-' expression ')' 
	;

formal: ID ':' TYPE;

expression: expression '(' '@' TYPE ')' '.' ID '(' (expression (',' expression)*) ')'								
			| IF expression THEN expression ELSE expression FI										
			| WHILE expression LOOP expression POOL													
			| '{' (expression ';')+ '}'																		
			| LET ID ':' TYPE '(' '<-' expression ')' '(' ',' ID ':' TYPE '(' '<-' expression ')' ')'* IN expression	
			| CASE expression OF (ID ':' TYPE '=>' expression ';') + ESAC								
			| NEW TYPE																				
			| (expression ';')																			
			| '~'expression																					
			| ISVOID expression																		
			| expression '*' expression																			
			| expression '-' expression																				
			| expression '+' expression																			
			| expression '/' expression																				
			| expression '<' expression																			
			| expression '<=' expression																			
			| expression '=' expression																			
			| NOT expression																				
			| ID '<-' expression
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
