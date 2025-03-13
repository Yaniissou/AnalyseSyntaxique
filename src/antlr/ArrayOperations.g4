grammar ArrayOperations;
/** more complex grammar on vector operations *
//**
* added : variable declaration, affectations, ouptut of variables
* need for semantic verifications
* - no redeclaration of variable * - use of undeclared variable
* - affectation to non conformant type
*/
/* GRAMMAR RULES, annotated; lowercase letters */
program         :   (instruction)+ EOF;

instruction     :   simpleop        #simpleopinstruction
                |   vardecl         #vardeclinstruction
                |   affectation     #affectationinstruction
                |   varout          #varoutinstruction
                ;

simpleop        : SUM   array   ';'     #sum
                | PROD  array   ';'     #prod
                | MAX   array   ';'     #max
                | MIN   array   ';'     #min
                | SORT  array   ';'     #sort
                | MED   array   ';'     #med
                | SECMIN array  ';'     #secmin
                | SECMAX array  ';'     #secmax
                ;

vardecl         : ARRAY_TYPE ID ';'     #vararray
                | ARRAY_TYPE ID '=' array ';' #initvararray
                | INT_TYPE ID ';'       #varint
                | INT_TYPE ID '=' INT ';' #initvarint
                ;
affectation     : ID '=' simpleop       #affectsimpleop
                | ID '=' array ';'      #affectarray
                | ID '=' INT ';'        #affectint
                ;
varout          : ID    ';'
                ;
array           : '[' INT (',' INT)* ']';

INT : '0' | [1-9][0-9]* ;
// Define token INT as 0 or [1-9] followed by digits
// KEYWORDS, before other "words" because of the top-down match
// we want to recognize them first, if not a keyword then something else
SUM             : 'sum';
PROD            : 'prod';
MAX             : 'max';
MIN             : 'min';
SORT            : 'sort';
ARRAY_TYPE      : 'array';
INT_TYPE        : 'int';// IDENTIFIERS, after the keywords
MED             : 'med';
SECMIN          : 'secmin';
SECMAX          : 'secmax';
ID              : [a-z][a-zA-Z0-9_]*;
WS              : [ \t\r\n]+ -> skip ;
// Define whitespace rule, toss it out