package ru.phism.intellij.teso.documentation.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.containers.Stack;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static ru.phism.intellij.teso.documentation.DocumentationParserTypes.*;

%%

%{
public _DocumentationLexer() {
    this((java.io.Reader)null);
}

private void yy_push_state(int state) { myStack.push(yystate()); yybegin(state);}
private void yy_pop_state() { yybegin(myStack.pop());}
private void yy_switch_state(int state) { yy_pop_state(); yy_push_state(state); }
private Stack<Integer> myStack = new Stack<>();

private int myScanStart;
private int restoreCurrentPosition() { return zzStartRead = myScanStart; }
private int startComplexToken() { return myScanStart = zzStartRead; }

private IElementType finishComplexToken(IElementType type) { yy_pop_state(); restoreCurrentPosition(); return type; }
private IElementType finishComplexToken(IElementType type, int state) { yy_push_state(state); restoreCurrentPosition(); return type; }

%}

%public
%class _DocumentationLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=[\n\r]
SPACE=[\u0009\u000B\u000C\u0000]
WHITE_SPACE={EOL}|{SPACE}

DIGIT=[0-9]
NUMBER={DIGIT}{DIGIT}*

UNDERSCORE="_"
LETTER=[a-z] | [A-Z]
LETTER_OR_DIGIT={LETTER}|{DIGIT}
IDENTIFIER={HASH}?{UNDERSCORE}?{LETTER}({LETTER_OR_DIGIT}|{UNDERSCORE})*

L_CURLY="{"
R_CURLY="}"
L_PAREN="("
R_PAREN=")"
L_BRACKET="["
R_BRACKET="]"

H1="h1."
H2="h2."
H3="h3."
H4="h4."
H5="h5."
H6="h6."
COMMA=","
OR="|"
HASH="#"
SEMICOLON=":"
ELLIPSIS="..."
EQUALS="="
ASTERISK="*"
ASTERISK_DOUBLE="**"

RETURNS="_Returns:_"
ATTRIBUTE="_attribute:_"
SCRIPT_ARGUMENTS="ScriptArguments:"
USES_VARIABLE_RETURNS="_Uses variable returns..._"
OBJECT_INHERITANCE="Objects that inherit behavior from"

LOCAL="local"
NILABLE="nilable"
PRIVATE="private"
PROTECTED="protected"
PROTECTED_ATTRIBUTES="protected-attributes"
PUBLIC="public"

VM_FUNCTIONS="VM Functions"
GLOBAL_VARIABLES="Global Variables"
GAME_API="Game API"
OBJECT_API="Object API"
EVENTS="Events"
UI_XML_LAYOUT="UI XML Layout"

%state IN_CURLY_OPERATOR
%state IN_H_CAPTION
%state IN_H2_CAPTION

%%

<IN_CURLY_OPERATOR> {
    {R_CURLY}  { yypushback(1); return finishComplexToken(LINE); }
    [^]        {}
    <<EOF>>    { return finishComplexToken(LINE); }
}

<IN_H2_CAPTION> {
    {EOL}               { yy_pop_state(); return WHITE_SPACE; }
    {WHITE_SPACE}       { return WHITE_SPACE; }
    {VM_FUNCTIONS}      { return VM_FUNCTIONS; }
    {GLOBAL_VARIABLES}  { return GLOBAL_VARIABLES; }
    {GAME_API}          { return GAME_API; }
    {OBJECT_API}        { return OBJECT_API; }
    {EVENTS}            { return EVENTS; }
    {UI_XML_LAYOUT}     { return UI_XML_LAYOUT; }
}

<IN_H_CAPTION> {
    {EOL}   { yypushback(1); return finishComplexToken(H_CAPTION); }
    [^]     {}
    <<EOF>>    { return finishComplexToken(H_CAPTION); }
}

<YYINITIAL> {
    {WHITE_SPACE}           { return WHITE_SPACE; }
    {L_CURLY}               { yy_push_state(IN_CURLY_OPERATOR); startComplexToken(); return L_CURLY; }
    {R_CURLY}               { return R_CURLY; }
    {L_PAREN}               { return L_PAREN; }
    {R_PAREN}               { return R_PAREN; }
    {L_BRACKET}             { return L_BRACKET; }
    {R_BRACKET}             { return R_BRACKET; }
    {COMMA}                 { return COMMA; }
    {OR}                    { return OR; }
    {HASH}                  { return HASH; }
    {SEMICOLON}             { return SEMICOLON; }
    {ELLIPSIS}              { return ELLIPSIS; }
    {EQUALS}                { return EQUALS; }
    {ASTERISK_DOUBLE}       { return ASTERISK_DOUBLE; }
    {ASTERISK}              { return ASTERISK; }
    {H1}                    { yy_push_state(IN_H_CAPTION); startComplexToken(); return H1; }
    {H2}                    { yy_push_state(IN_H2_CAPTION); return H2; }
    {H3}                    { yy_push_state(IN_H_CAPTION); startComplexToken(); return H3; }
    {H4}                    { yy_push_state(IN_H_CAPTION); startComplexToken(); return H4; }
    {H5}                    { yy_push_state(IN_H_CAPTION); startComplexToken(); return H5; }
    {H6}                    { yy_push_state(IN_H_CAPTION); startComplexToken(); return H6; }
    {RETURNS}               { return RETURNS; }
    {SCRIPT_ARGUMENTS}      { return SCRIPT_ARGUMENTS; }
    {USES_VARIABLE_RETURNS} { return USES_VARIABLE_RETURNS; }
    {ATTRIBUTE}             { return ATTRIBUTE; }
    {OBJECT_INHERITANCE}    { return OBJECT_INHERITANCE; }
    {LOCAL}                 { return LOCAL; }
    {PRIVATE}               { return PRIVATE; }
    {PROTECTED}             { return PROTECTED; }
    {PROTECTED_ATTRIBUTES}  { return PROTECTED_ATTRIBUTES; }
    {PUBLIC}                { return PUBLIC; }
    {NILABLE}               { return NILABLE; }
    {IDENTIFIER}            { return IDENTIFIER; }
    {NUMBER}                { return NUMBER; }
}

[^] { return BAD_CHARACTER; }
