grammar SQLQuery;

ABORT               : A B O R T;
ACTION              : A C T I O N;
ADD                 : A D D;
ALL                 : A L L;
ALTER               : A L T E R;
AND                 : A N D;
AS                  : A S;
ASC                 : A S C;
AUTOINCREMENT       : A U T O I N C R E M E N T;
AVG                 : A V G;
BETWEEN             : B E T W E E N;
BY                  : B Y ;
CASCADE             : C A S C A D E;
CHAR                : C H A R;
CHECK               : C H E C K;
COALESCE            : C O A L E S C E;
COLLATE             : C O L L A T E;
COLUMN              : C O L U M N;
COMMENT             : C O M M E N T;
CONFLICT            : C O N F L I C T;
CONSTRAINT          : C O N S T R A I N T;
COUNT               : C O U N T;
CREATE              : C R E A T E;
CROSS               : C R O S S;
DEFAULT             : D E F A U L T;
DEFERRABLE          : D E F E R R A B L E;
DEFERRED            : D E F E R R E D;
DELETE              : D E L E T E;
DESC                : D E S C;
DISTINCT            : D I S T I N C T;
DROP                : D R O P;
ENABLE              : E N A B L E;
EXISTS              : E X I S T S;
EXIT                : E X I T;
FAIL                : F A I L;
FALSE               : F A L S E;
FOREIGN             : F O R E I G N;
FROM                : F R O M;
GROUP               : G R O U P;
HAVING              : H A V I N G;
IF                  : I F;
IGNORE              : I G N O R E;
IMMEDIATE           : I M M E D I A T E;
IN                  : I N;
INDEXED             : I N D E X E D;
INITIALLY           : I N I T I A L L Y;
INNER               : I N N E R;
INSERT              : I N S E R T;
INTO                : I N T O;
IS                  : I S ;
JOIN                : J O I N;
KEY                 : K E Y;
LEFT                : L E F T;
LIMIT               : L I M I T ;
LIKE                : L I K E;
MATCH               : M A T C H;
MAX                 : M A X;
MIN                 : M I N;
NATURAL             : N A T U R A L;
NEXTVAL             : N E X T V A L;
NO                  : N O;
NOT                 : N O T;
NULL                : N U L L;
OF                  : O F;
OFFSET              : O F F S E T;
ON                  : O N;
ONLY                : O N L Y;
OR                  : O R ;
ORDER               : O R D E R;
OUTER               : O U T E R;
PRIMARY             : P R I M A R Y;
RECURSIVE           : R E C U R S I V E;
REFERENCES          : R E F E R E N C E S;
RENAME              : R E N A M E;
REPLACE             : R E P L A C E;
RESTRICT            : R E S T R I C T;
ROLLBACK            : R O L L B A C K;
SELECT              : S E L E C T;
SET                 : S E T;
SUM                 : S U M;
TABLE               : T A B L E;
TO                  : T O;
TRUE                : T R U E;
UNIQUE              : U N I Q U E;
UNKNOWN             : U N K N O W N;
UPDATE              : U P D A T E;
USING               : U S I N G;
VALUES              : V A L U E S;
WHERE               : W H E R E;
WITH                : W I T H;


fragment A      : [aA];
fragment B      : [bB];
fragment C      : [cC];
fragment D      : [dD];
fragment E      : [eE];
fragment F      : [fF];
fragment G      : [gG];
fragment H      : [hH];
fragment I      : [iI];
fragment J      : [jJ];
fragment K      : [kK];
fragment L      : [lL];
fragment M      : [mM];
fragment N      : [nN];
fragment O      : [oO];
fragment P      : [pP];
fragment Q      : [qQ];
fragment R      : [rR];
fragment S      : [sS];
fragment T      : [tT];
fragment U      : [uU];
fragment V      : [vV];
fragment W      : [wW];
fragment X      : [xX];
fragment Y      : [yY];
fragment Z      : [zZ];
fragment HEX_DIGIT      :[0-9A-F];
fragment DEC_DIGIT      :[0-9];
fragment LETTER         :[a-zA-Z];



ID:    ( 'A'..'Z' | 'a'..'z' | '_' | '$') ( 'A'..'Z' | 'a'..'z' | '_' | '$' | '0'..'9' )*;
TEXT_STRING :    (  '\'' ( ('\\' '\\') | ('\'' '\'') | ('\\' '\'') | ~('\'') )* '\''  );
ID_LITERAL:   '*'|('@'|'_'|LETTER)(LETTER|DEC_DIGIT|'_')*;
REVERSE_QUOTE_ID :   '`' ~'`'+ '`';
DECIMAL_LITERAL:     DEC_DIGIT+;
NUMERIC_LITERAL
 : DEC_DIGIT+ ( '.' DEC_DIGIT* )? ( E [-+]? DEC_DIGIT+ )?
 | '.' DEC_DIGIT+ ( E [-+]? DEC_DIGIT+ )?
;


table_name            : ID;
column_name           : ID;
function_name         : ID ;
type_name             : ID;
name                  : ID;
foreign_table_name    : ID;
target_column_name    : ID;
collation_name        : ID;
index_name            : ID;
database_name         : ID;
source_table_name     : ID;
new_table_name        : ID;
source_column_name    : ID;

sql_statement:
    select_statement
    | insert_statement
    | update_statement
    | delete_statement
    | create_table_statement
    | drop_table_statement
    | alter_table_statement
;

create_table_statement:
    CREATE TABLE (IF NOT EXISTS)?
    (database_name '.')? table_name
    ( '(' column_def ( ',' table_constraint | ',' column_def)* ')'
    | AS select_statement
    )
;

column_def:
    column_name ( column_constaint | data_type )*
 ;

data_type:
    type_name ( '(' signed_number (name)? ')'
    | '(' signed_number (name)? ',' signed_number (name)? ')' )?
;


update_statement:
    UPDATE
    (
        OR ROLLBACK
        | OR ABORT
        | OR REPLACE
        | OR FAIL
        | OR IGNORE
    )? (database_name '.')? table_name (INDEXED BY index_name | NOT INDEXED)?
   SET column_name '=' logic_expression ( ',' column_name '=' logic_expression )*
   where_clause ?
;

drop_table_statement:
    DROP TABLE ( IF EXISTS )? (database_name '.')? table_name
;

delete_statement:
    DELETE
    ( FROM ) ?
    (database_name '.')? table_name (INDEXED BY index_name
                | NOT INDEXED)?
    ( where_clause ) ?
;

select_statement:
    SELECT DISTINCT?
    select_elements
    (
        FROM table_sources
        ( where_clause )?
        ( groupby_clause )?
        ( having_clause )?
    ) ?
    ( orderby_clause )?
    ( limit_clause )?
;

insert_statement:
    with_clause?
    (
        INSERT
        | REPLACE
        | INSERT OR REPLACE
        | INSERT OR ROLLBACK
        | INSERT OR ABORT
        | INSERT OR FAIL
        | INSERT OR IGNORE
    ) INTO (TABLE)?
   (database_name '.')? table_name ( '(' column_name ( ',' column_name )* ')' )?
   ( VALUES '(' logic_expression ( ',' logic_expression )* ')' ( ',' '(' logic_expression ( ',' logic_expression )* ')' )*
   | select_statement
   | DEFAULT VALUES
   )
;

alter_table_statement:
    ALTER TABLE ONLY? ( database_name '.' )? source_table_name
   ( RENAME TO new_table_name
   | alter_table_add_constraint
   | ADD COLUMN? column_def
   )
   ENABLE?
;

select_elements:
    (select_element ) (',' select_element)*
;

alter_table_add:
    ADD table_constraint
;

alter_table_add_constraint:
    ADD CONSTRAINT name table_constraint
;

table_constraint:
    ( CONSTRAINT name ) ?
   ( table_constraint_primary_key
   | table_constraint_key
   | table_constraint_unique
   | CHECK '(' logic_expression ')'
   | table_constraint_foreign_key
   )
;

column_constaint:
    ( CONSTRAINT name ) ?
    (
        column_constraint_primary_key
       | column_constraint_foreign_key
       | column_constraint_not_null
       | column_constraint_null
       | UNIQUE conflict_clause
       | CHECK '(' logic_expression ')'
       | column_default
       | COLLATE collation_name
    )
;

table_constraint_primary_key:
   PRIMARY KEY '(' target_column ( ',' target_column )* ')' conflict_clause
;

table_constraint_key:
    KEY name? '(' target_column ( ',' target_column )* ')' conflict_clause
;

table_constraint_unique:
    UNIQUE KEY? name? '(' target_column ( ',' target_column )* ')' conflict_clause
;

table_constraint_foreign_key:
    FOREIGN KEY '(' source_column_name ( ',' source_column_name )* ')' foreign_key_clause
;

target_column:
    column_name ( COLLATE collation_name )? ( ASC | DESC )?
;

column_constraint_primary_key:
    PRIMARY KEY ( ASC | DESC )? conflict_clause AUTOINCREMENT?
 ;

column_constraint_foreign_key:
    foreign_key_clause
;

column_constraint_not_null:
    NOT NULL conflict_clause
;

column_constraint_null:
    NULL conflict_clause
;

column_default:
    DEFAULT (column_default_value | '(' logic_expression ')' | NEXTVAL '(' logic_expression ')' | name )  ( '::' name+ )?
;

column_default_value:
    ( signed_number | value )
;

table_sources
: ( table_reference (',' table_reference)* | join_clause )
;

table_reference:
    ( database_name '.' )? table_name ( AS? uid)? (INDEXED BY index_name | NOT INDEXED )?
    | '(' ( table_reference ( ',' table_reference)* | join_clause ) ')' ( AS? uid)?
    | '(' select_statement ')' ( AS? uid )?
;

join_clause:
    table_reference ( join_operator table_reference ( ON logic_expression | USING '(' column_name ( ',' column_name )* ')' )?)*
;

join_operator:
 ',' | NATURAL? ( LEFT OUTER? | INNER | CROSS )? JOIN
;

foreign_key_clause:
   REFERENCES foreign_table_name ( '(' target_column_name ( ',' target_column_name )* ')' )?
   ( ( ON ( DELETE | UPDATE ) ( SET NULL
                                | SET DEFAULT
                                | CASCADE
                                | RESTRICT
                                | NO ACTION )
     | MATCH name
     )
   )*
   ( NOT? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? ENABLE? )?
;

where_clause
: WHERE    logic_expression
;

logic_expression
: logic_expression logical_operator logic_expression
 | ( ( database_name '.' )? table_name '.' )? column_name
 | value
 | logic_expression comparison_operator logic_expression
 | logic_expression binary_calculate_operator logic_expression
 | unary_operator logic_expression
 | fullColumnName BETWEEN value AND value
 | fullColumnName NOT? IN '(' value (',' value)*  ')'
 | '(' select_statement ')'
 | '(' logic_expression ')'
 ;

with_clause:
    WITH RECURSIVE? cte_table_name AS '(' select_statement ')' ( ',' cte_table_name AS '(' select_statement ')' )*
;

groupby_clause
:   GROUP BY   groupby_item (',' groupby_item)*
;
having_clause
:    HAVING  logic_expression
;

orderby_clause
: ORDER BY orderby_expression (',' orderby_expression)*
;

limit_clause
: LIMIT
(
  (offset=decimalLiteral ',')? limit=decimalLiteral
  | limit=decimalLiteral OFFSET offset=decimalLiteral
)
;

conflict_clause
: ( ON CONFLICT ( ROLLBACK
                 | ABORT
                 | FAIL
                 | IGNORE
                 | REPLACE
                 )
   )?
 ;

orderby_expression
: fullColumnName order=(ASC | DESC)?
;

groupby_item
: fullColumnName order=(ASC | DESC)?
;

logical_operator
: AND | '&' '&'  | OR | '|' '|'
;

comparison_operator
: '=' | '>' | '<' | '<' '=' | '>' '='
| '<' '>' | '!' '=' | '<' '=' '>'
;

binary_calculate_operator:
'+' | '-' | '*' | '/' | '%';

unary_operator:
'~' | '-' | '+' | NOT;

value
: uid
| textLiteral
| decimalLiteral
;

decimalLiteral
: DECIMAL_LITERAL
;
textLiteral
: TEXT_STRING
;

select_element:
    '*'
    | ( ( database_name '.' )? table_name '.' )? column_name
    | logic_expression (AS? uid)?
    | functionCall (AS? uid)?
;

cte_table_name:
    (database_name '.')? table_name ( '(' column_name ( ',' column_name )* ')' )?
;

fullColumnName
: column_name
;

functionCall
:  aggregateWindowedFunction
;

aggregateWindowedFunction
: (AVG | MAX | MIN | SUM) '(' functionArg ')'
| COUNT '(' (starArg='*' |  functionArg?) ')'
| COUNT '(' aggregator=DISTINCT functionArgs ')'
| COALESCE '(' functionArgs ')'
;

functionArg
:  column_name | DECIMAL_LITERAL | aggregateWindowedFunction
;

functionArgs:
    functionArg (',' functionArg)*
;

signed_number:
    ( ( '+' | '-' )? NUMERIC_LITERAL | '*' )
;
uid
: ID
;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines