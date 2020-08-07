// This is a generated file. Not intended for manual editing.
package ru.phism.intellij.teso.documentation;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static ru.phism.intellij.teso.documentation.DocumentationParserTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DocumentationParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return file(b, l + 1);
  }

  /* ********************************************************** */
  // L_BRACKET IDENTIFIER (OR IDENTIFIER)* R_BRACKET type_qualifier?
  public static boolean complex_type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_type_declaration")) return false;
    if (!nextTokenIs(b, L_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, L_BRACKET, IDENTIFIER);
    r = r && complex_type_declaration_2(b, l + 1);
    r = r && consumeToken(b, R_BRACKET);
    r = r && complex_type_declaration_4(b, l + 1);
    exit_section_(b, m, COMPLEX_TYPE_DECLARATION, r);
    return r;
  }

  // (OR IDENTIFIER)*
  private static boolean complex_type_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_type_declaration_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!complex_type_declaration_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "complex_type_declaration_2", c)) break;
    }
    return true;
  }

  // OR IDENTIFIER
  private static boolean complex_type_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_type_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OR, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_qualifier?
  private static boolean complex_type_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_type_declaration_4")) return false;
    type_qualifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // type_declaration (COMMA type_declaration)*
  public static boolean descendant_types(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "descendant_types")) return false;
    if (!nextTokenIs(b, "<descendant types>", IDENTIFIER, L_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DESCENDANT_TYPES, "<descendant types>");
    r = type_declaration(b, l + 1);
    r = r && descendant_types_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA type_declaration)*
  private static boolean descendant_types_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "descendant_types_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!descendant_types_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "descendant_types_1", c)) break;
    }
    return true;
  }

  // COMMA type_declaration
  private static boolean descendant_types_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "descendant_types_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type_declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ASTERISK IDENTIFIER function_parameters?
  public static boolean event_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_declaration")) return false;
    if (!nextTokenIs(b, ASTERISK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ASTERISK, IDENTIFIER);
    r = r && event_declaration_2(b, l + 1);
    exit_section_(b, m, EVENT_DECLARATION, r);
    return r;
  }

  // function_parameters?
  private static boolean event_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_declaration_2")) return false;
    function_parameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // H2 EVENTS event_declaration*
  public static boolean events_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "events_section")) return false;
    if (!nextTokenIs(b, H2)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, H2, EVENTS);
    r = r && events_section_2(b, l + 1);
    exit_section_(b, m, EVENTS_SECTION, r);
    return r;
  }

  // event_declaration*
  private static boolean events_section_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "events_section_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!event_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "events_section_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // section_declaration*
  static boolean file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file")) return false;
    while (true) {
      int c = current_position_(b);
      if (!section_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ASTERISK IDENTIFIER visibility? function_parameters function_uses_clause? function_return_clause?
  public static boolean function_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration")) return false;
    if (!nextTokenIs(b, ASTERISK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ASTERISK, IDENTIFIER);
    r = r && function_declaration_2(b, l + 1);
    r = r && function_parameters(b, l + 1);
    r = r && function_declaration_4(b, l + 1);
    r = r && function_declaration_5(b, l + 1);
    exit_section_(b, m, FUNCTION_DECLARATION, r);
    return r;
  }

  // visibility?
  private static boolean function_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_2")) return false;
    visibility(b, l + 1);
    return true;
  }

  // function_uses_clause?
  private static boolean function_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_4")) return false;
    function_uses_clause(b, l + 1);
    return true;
  }

  // function_return_clause?
  private static boolean function_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_5")) return false;
    function_return_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // parameter_with_type
  public static boolean function_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter")) return false;
    if (!nextTokenIs(b, ASTERISK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_with_type(b, l + 1);
    exit_section_(b, m, FUNCTION_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // L_PAREN function_parameters_list R_PAREN
  public static boolean function_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameters")) return false;
    if (!nextTokenIs(b, L_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_PAREN);
    r = r && function_parameters_list(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    exit_section_(b, m, FUNCTION_PARAMETERS, r);
    return r;
  }

  /* ********************************************************** */
  // function_parameter? (COMMA function_parameter)*
  public static boolean function_parameters_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameters_list")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_PARAMETERS_LIST, "<function parameters list>");
    r = function_parameters_list_0(b, l + 1);
    p = r; // pin = 1
    r = r && function_parameters_list_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // function_parameter?
  private static boolean function_parameters_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameters_list_0")) return false;
    function_parameter(b, l + 1);
    return true;
  }

  // (COMMA function_parameter)*
  private static boolean function_parameters_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameters_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_parameters_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_parameters_list_1", c)) break;
    }
    return true;
  }

  // COMMA function_parameter
  private static boolean function_parameters_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameters_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && function_parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ASTERISK_DOUBLE RETURNS function_return_list
  public static boolean function_return_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_return_clause")) return false;
    if (!nextTokenIs(b, ASTERISK_DOUBLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ASTERISK_DOUBLE, RETURNS);
    r = r && function_return_list(b, l + 1);
    exit_section_(b, m, FUNCTION_RETURN_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // parameter_with_type
  public static boolean function_return_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_return_item")) return false;
    if (!nextTokenIs(b, ASTERISK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_with_type(b, l + 1);
    exit_section_(b, m, FUNCTION_RETURN_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // function_return_item (COMMA function_return_item)*
  public static boolean function_return_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_return_list")) return false;
    if (!nextTokenIs(b, ASTERISK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_RETURN_LIST, null);
    r = function_return_item(b, l + 1);
    p = r; // pin = 1
    r = r && function_return_list_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA function_return_item)*
  private static boolean function_return_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_return_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_return_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_return_list_1", c)) break;
    }
    return true;
  }

  // COMMA function_return_item
  private static boolean function_return_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_return_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && function_return_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ASTERISK_DOUBLE USES_VARIABLE_RETURNS
  public static boolean function_uses_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_uses_clause")) return false;
    if (!nextTokenIs(b, ASTERISK_DOUBLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ASTERISK_DOUBLE, USES_VARIABLE_RETURNS);
    exit_section_(b, m, FUNCTION_USES_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // H2 GAME_API function_declaration*
  public static boolean game_api_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "game_api_section")) return false;
    if (!nextTokenIs(b, H2)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, H2, GAME_API);
    r = r && game_api_section_2(b, l + 1);
    exit_section_(b, m, GAME_API_SECTION, r);
    return r;
  }

  // function_declaration*
  private static boolean game_api_section_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "game_api_section_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "game_api_section_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // H5 H_CAPTION global_enum_item*
  public static boolean global_enum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_enum")) return false;
    if (!nextTokenIs(b, H5)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, H5, H_CAPTION);
    r = r && global_enum_2(b, l + 1);
    exit_section_(b, m, GLOBAL_ENUM, r);
    return r;
  }

  // global_enum_item*
  private static boolean global_enum_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_enum_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!global_enum_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "global_enum_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ASTERISK IDENTIFIER
  public static boolean global_enum_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_enum_item")) return false;
    if (!nextTokenIs(b, ASTERISK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ASTERISK, IDENTIFIER);
    exit_section_(b, m, GLOBAL_ENUM_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // H2 GLOBAL_VARIABLES global_enum*
  public static boolean global_variables_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_variables_section")) return false;
    if (!nextTokenIs(b, H2)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, H2, GLOBAL_VARIABLES);
    r = r && global_variables_section_2(b, l + 1);
    exit_section_(b, m, GLOBAL_VARIABLES_SECTION, r);
    return r;
  }

  // global_enum*
  private static boolean global_variables_section_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_variables_section_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!global_enum(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "global_variables_section_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // H2 OBJECT_API object_declaration*
  public static boolean object_api_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_api_section")) return false;
    if (!nextTokenIs(b, H2)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, H2, OBJECT_API);
    r = r && object_api_section_2(b, l + 1);
    exit_section_(b, m, OBJECT_API_SECTION, r);
    return r;
  }

  // object_declaration*
  private static boolean object_api_section_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_api_section_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!object_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object_api_section_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // H3 H_CAPTION object_inheritance_clause? function_declaration*
  public static boolean object_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_declaration")) return false;
    if (!nextTokenIs(b, H3)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, H3, H_CAPTION);
    r = r && object_declaration_2(b, l + 1);
    r = r && object_declaration_3(b, l + 1);
    exit_section_(b, m, OBJECT_DECLARATION, r);
    return r;
  }

  // object_inheritance_clause?
  private static boolean object_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_declaration_2")) return false;
    object_inheritance_clause(b, l + 1);
    return true;
  }

  // function_declaration*
  private static boolean object_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_declaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object_declaration_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // OBJECT_INHERITANCE type descendant_types
  public static boolean object_inheritance_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_inheritance_clause")) return false;
    if (!nextTokenIs(b, OBJECT_INHERITANCE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OBJECT_INHERITANCE);
    r = r && type(b, l + 1);
    r = r && descendant_types(b, l + 1);
    exit_section_(b, m, OBJECT_INHERITANCE_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // type parameter
  public static boolean parameter_with_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_with_type")) return false;
    if (!nextTokenIs(b, ASTERISK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && parameter(b, l + 1);
    exit_section_(b, m, PARAMETER_WITH_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // LOCAL? IDENTIFIER script_argument_default_value?
  public static boolean script_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_argument")) return false;
    if (!nextTokenIs(b, "<script argument>", IDENTIFIER, LOCAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCRIPT_ARGUMENT, "<script argument>");
    r = script_argument_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && script_argument_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LOCAL?
  private static boolean script_argument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_argument_0")) return false;
    consumeToken(b, LOCAL);
    return true;
  }

  // script_argument_default_value?
  private static boolean script_argument_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_argument_2")) return false;
    script_argument_default_value(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // EQUALS ELLIPSIS
  public static boolean script_argument_default_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_argument_default_value")) return false;
    if (!nextTokenIs(b, EQUALS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, EQUALS, ELLIPSIS);
    exit_section_(b, m, SCRIPT_ARGUMENT_DEFAULT_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // script_argument (COMMA script_argument)*
  public static boolean script_argument_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_argument_list")) return false;
    if (!nextTokenIs(b, "<script argument list>", IDENTIFIER, LOCAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCRIPT_ARGUMENT_LIST, "<script argument list>");
    r = script_argument(b, l + 1);
    r = r && script_argument_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA script_argument)*
  private static boolean script_argument_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_argument_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!script_argument_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "script_argument_list_1", c)) break;
    }
    return true;
  }

  // COMMA script_argument
  private static boolean script_argument_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_argument_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && script_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // toc_settings |
  //     version_section |
  //     vm_functions_section |
  //     global_variables_section |
  //     game_api_section |
  //     object_api_section |
  //     events_section |
  //     ui_xml_layout_section
  static boolean section_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "section_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = toc_settings(b, l + 1);
    if (!r) r = version_section(b, l + 1);
    if (!r) r = vm_functions_section(b, l + 1);
    if (!r) r = global_variables_section(b, l + 1);
    if (!r) r = game_api_section(b, l + 1);
    if (!r) r = object_api_section(b, l + 1);
    if (!r) r = events_section(b, l + 1);
    if (!r) r = ui_xml_layout_section(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER type_qualifier?
  public static boolean single_type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_type_declaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && single_type_declaration_1(b, l + 1);
    exit_section_(b, m, SINGLE_TYPE_DECLARATION, r);
    return r;
  }

  // type_qualifier?
  private static boolean single_type_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_type_declaration_1")) return false;
    type_qualifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // L_CURLY LINE R_CURLY
  public static boolean toc_settings(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "toc_settings")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TOC_SETTINGS, "<toc settings>");
    r = consumeTokens(b, 1, L_CURLY, LINE, R_CURLY);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, toc_settings_recoverer_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // R_CURLY
  static boolean toc_settings_recoverer(PsiBuilder b, int l) {
    return consumeToken(b, R_CURLY);
  }

  /* ********************************************************** */
  // IDENTIFIER (OR IDENTIFIER)*
  public static boolean trait_type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_type_declaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && trait_type_declaration_1(b, l + 1);
    exit_section_(b, m, TRAIT_TYPE_DECLARATION, r);
    return r;
  }

  // (OR IDENTIFIER)*
  private static boolean trait_type_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_type_declaration_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!trait_type_declaration_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "trait_type_declaration_1", c)) break;
    }
    return true;
  }

  // OR IDENTIFIER
  private static boolean trait_type_declaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_type_declaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OR, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ASTERISK type_declaration ASTERISK
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    if (!nextTokenIs(b, ASTERISK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASTERISK);
    r = r && type_declaration(b, l + 1);
    r = r && consumeToken(b, ASTERISK);
    exit_section_(b, m, TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // single_type_declaration | complex_type_declaration
  public static boolean type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declaration")) return false;
    if (!nextTokenIs(b, "<type declaration>", IDENTIFIER, L_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DECLARATION, "<type declaration>");
    r = single_type_declaration(b, l + 1);
    if (!r) r = complex_type_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SEMICOLON NILABLE
  public static boolean type_qualifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_qualifier")) return false;
    if (!nextTokenIs(b, SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SEMICOLON, NILABLE);
    exit_section_(b, m, TYPE_QUALIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // H4 H_CAPTION ui_xml_attribute_item*
  public static boolean ui_xml_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ui_xml_attribute")) return false;
    if (!nextTokenIs(b, H4)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, H4, H_CAPTION);
    r = r && ui_xml_attribute_2(b, l + 1);
    exit_section_(b, m, UI_XML_ATTRIBUTE, r);
    return r;
  }

  // ui_xml_attribute_item*
  private static boolean ui_xml_attribute_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ui_xml_attribute_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ui_xml_attribute_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ui_xml_attribute_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ASTERISK IDENTIFIER type
  public static boolean ui_xml_attribute_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ui_xml_attribute_item")) return false;
    if (!nextTokenIs(b, ASTERISK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ASTERISK, IDENTIFIER);
    r = r && type(b, l + 1);
    exit_section_(b, m, UI_XML_ATTRIBUTE_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // ui_xml_attribute | ui_xml_tag
  public static boolean ui_xml_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ui_xml_entry")) return false;
    if (!nextTokenIs(b, "<ui xml entry>", H4, H5)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UI_XML_ENTRY, "<ui xml entry>");
    r = ui_xml_attribute(b, l + 1);
    if (!r) r = ui_xml_tag(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // H2 UI_XML_LAYOUT ui_xml_entry*
  public static boolean ui_xml_layout_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ui_xml_layout_section")) return false;
    if (!nextTokenIs(b, H2)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, H2, UI_XML_LAYOUT);
    r = r && ui_xml_layout_section_2(b, l + 1);
    exit_section_(b, m, UI_XML_LAYOUT_SECTION, r);
    return r;
  }

  // ui_xml_entry*
  private static boolean ui_xml_layout_section_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ui_xml_layout_section_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ui_xml_entry(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ui_xml_layout_section_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // H5 H_CAPTION ui_xml_tag_item*
  public static boolean ui_xml_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ui_xml_tag")) return false;
    if (!nextTokenIs(b, H5)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, H5, H_CAPTION);
    r = r && ui_xml_tag_2(b, l + 1);
    exit_section_(b, m, UI_XML_TAG, r);
    return r;
  }

  // ui_xml_tag_item*
  private static boolean ui_xml_tag_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ui_xml_tag_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ui_xml_tag_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ui_xml_tag_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ASTERISK ATTRIBUTE type IDENTIFIER
  public static boolean ui_xml_tag_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ui_xml_tag_attribute")) return false;
    if (!nextTokenIs(b, ASTERISK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ASTERISK, ATTRIBUTE);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, UI_XML_TAG_ATTRIBUTE, r);
    return r;
  }

  /* ********************************************************** */
  // ui_xml_tag_attribute | ui_xml_tag_trait | ui_xml_tag_script_arguments
  static boolean ui_xml_tag_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ui_xml_tag_item")) return false;
    if (!nextTokenIs(b, ASTERISK)) return false;
    boolean r;
    r = ui_xml_tag_attribute(b, l + 1);
    if (!r) r = ui_xml_tag_trait(b, l + 1);
    if (!r) r = ui_xml_tag_script_arguments(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ASTERISK SCRIPT_ARGUMENTS script_argument_list
  public static boolean ui_xml_tag_script_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ui_xml_tag_script_arguments")) return false;
    if (!nextTokenIs(b, ASTERISK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ASTERISK, SCRIPT_ARGUMENTS);
    r = r && script_argument_list(b, l + 1);
    exit_section_(b, m, UI_XML_TAG_SCRIPT_ARGUMENTS, r);
    return r;
  }

  /* ********************************************************** */
  // ASTERISK L_BRACKET IDENTIFIER SEMICOLON trait_type_declaration R_BRACKET
  public static boolean ui_xml_tag_trait(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ui_xml_tag_trait")) return false;
    if (!nextTokenIs(b, ASTERISK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ASTERISK, L_BRACKET, IDENTIFIER, SEMICOLON);
    r = r && trait_type_declaration(b, l + 1);
    r = r && consumeToken(b, R_BRACKET);
    exit_section_(b, m, UI_XML_TAG_TRAIT, r);
    return r;
  }

  /* ********************************************************** */
  // H1 H_CAPTION
  public static boolean version_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "version_section")) return false;
    if (!nextTokenIs(b, H1)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, H1, H_CAPTION);
    exit_section_(b, m, VERSION_SECTION, r);
    return r;
  }

  /* ********************************************************** */
  // ASTERISK (PRIVATE | PROTECTED | PROTECTED_ATTRIBUTES | PUBLIC) ASTERISK
  public static boolean visibility(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "visibility")) return false;
    if (!nextTokenIs(b, ASTERISK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASTERISK);
    r = r && visibility_1(b, l + 1);
    r = r && consumeToken(b, ASTERISK);
    exit_section_(b, m, VISIBILITY, r);
    return r;
  }

  // PRIVATE | PROTECTED | PROTECTED_ATTRIBUTES | PUBLIC
  private static boolean visibility_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "visibility_1")) return false;
    boolean r;
    r = consumeToken(b, PRIVATE);
    if (!r) r = consumeToken(b, PROTECTED);
    if (!r) r = consumeToken(b, PROTECTED_ATTRIBUTES);
    if (!r) r = consumeToken(b, PUBLIC);
    return r;
  }

  /* ********************************************************** */
  // H2 VM_FUNCTIONS function_declaration*
  public static boolean vm_functions_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vm_functions_section")) return false;
    if (!nextTokenIs(b, H2)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, H2, VM_FUNCTIONS);
    r = r && vm_functions_section_2(b, l + 1);
    exit_section_(b, m, VM_FUNCTIONS_SECTION, r);
    return r;
  }

  // function_declaration*
  private static boolean vm_functions_section_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vm_functions_section_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "vm_functions_section_2", c)) break;
    }
    return true;
  }

  static final Parser toc_settings_recoverer_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return toc_settings_recoverer(b, l + 1);
    }
  };
}
