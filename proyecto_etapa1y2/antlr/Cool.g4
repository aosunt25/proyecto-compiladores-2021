grammar Cool;

program: ( klass ';')*;

// Esta regla está mal, solo es para poder generar un parser y probar
klass: KLASS;

feature:
	ID '(' (formal (',' formal)*)? ')' ':' TYPE '{' expression '}' # method
	| ID: TYPE[ <- expr ] # attribute;

	formal: ID ':' TYPE;

	expr:
		primary																					# base
		| expr '(' '@' TYPE ')' '.' ID '(' (expr (',' expr)*) ')'								# simplecall
		| IF expression THEN expression ELSE expression FI										# if
		| WHILE expression LOOP expression POOL													# while
		| ...																					# objectcall
		| LET ID ':' TYPE '(' '<-' expr ')' '(' ',' ID ':' TYPE '(' '<-' expr ')' ')'* in expr	# let
		| CASE expression OF (ID ':' TYPE => expression ';')+ ESAC								# case
		| NEW TYPE																				# new
		| (expr ';')																			# block
		| ...																					# at
		| ~expr																					# neg
		| ISVOID expression																		# isvoid
		| expr* expr																			# mult
		| expr xpr																				# div
		| expr+ expr																			# plus
		| expr expr																				# less
		| expr < expr																			# lt
		| expr < = expr																			# le
		| expr = expr																			# eq
		| NOT expr																				# not
		| ID '<-' expr																			# assign;

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
	IN: I N: INHERITS: I N H E R I T S;
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