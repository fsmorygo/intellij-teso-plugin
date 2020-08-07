// This is a generated file. Not intended for manual editing.
package ru.phism.intellij.teso.documentation;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import ru.phism.intellij.teso.documentation.psi.DocumentationElementType;
import ru.phism.intellij.teso.documentation.psi.DocumentationTokenType;
import ru.phism.intellij.teso.documentation.psi.impl.*;

public interface DocumentationParserTypes {

  IElementType COMPLEX_TYPE_DECLARATION = new DocumentationElementType("COMPLEX_TYPE_DECLARATION");
  IElementType DESCENDANT_TYPES = new DocumentationElementType("DESCENDANT_TYPES");
  IElementType EVENTS_SECTION = new DocumentationElementType("EVENTS_SECTION");
  IElementType EVENT_DECLARATION = new DocumentationElementType("EVENT_DECLARATION");
  IElementType FUNCTION_DECLARATION = new DocumentationElementType("FUNCTION_DECLARATION");
  IElementType FUNCTION_PARAMETER = new DocumentationElementType("FUNCTION_PARAMETER");
  IElementType FUNCTION_PARAMETERS = new DocumentationElementType("FUNCTION_PARAMETERS");
  IElementType FUNCTION_PARAMETERS_LIST = new DocumentationElementType("FUNCTION_PARAMETERS_LIST");
  IElementType FUNCTION_RETURN_CLAUSE = new DocumentationElementType("FUNCTION_RETURN_CLAUSE");
  IElementType FUNCTION_RETURN_ITEM = new DocumentationElementType("FUNCTION_RETURN_ITEM");
  IElementType FUNCTION_RETURN_LIST = new DocumentationElementType("FUNCTION_RETURN_LIST");
  IElementType FUNCTION_USES_CLAUSE = new DocumentationElementType("FUNCTION_USES_CLAUSE");
  IElementType GAME_API_SECTION = new DocumentationElementType("GAME_API_SECTION");
  IElementType GLOBAL_ENUM = new DocumentationElementType("GLOBAL_ENUM");
  IElementType GLOBAL_ENUM_ITEM = new DocumentationElementType("GLOBAL_ENUM_ITEM");
  IElementType GLOBAL_VARIABLES_SECTION = new DocumentationElementType("GLOBAL_VARIABLES_SECTION");
  IElementType OBJECT_API_SECTION = new DocumentationElementType("OBJECT_API_SECTION");
  IElementType OBJECT_DECLARATION = new DocumentationElementType("OBJECT_DECLARATION");
  IElementType OBJECT_INHERITANCE_CLAUSE = new DocumentationElementType("OBJECT_INHERITANCE_CLAUSE");
  IElementType PARAMETER = new DocumentationElementType("PARAMETER");
  IElementType PARAMETER_WITH_TYPE = new DocumentationElementType("PARAMETER_WITH_TYPE");
  IElementType SCRIPT_ARGUMENT = new DocumentationElementType("SCRIPT_ARGUMENT");
  IElementType SCRIPT_ARGUMENT_DEFAULT_VALUE = new DocumentationElementType("SCRIPT_ARGUMENT_DEFAULT_VALUE");
  IElementType SCRIPT_ARGUMENT_LIST = new DocumentationElementType("SCRIPT_ARGUMENT_LIST");
  IElementType SINGLE_TYPE_DECLARATION = new DocumentationElementType("SINGLE_TYPE_DECLARATION");
  IElementType TOC_SETTINGS = new DocumentationElementType("TOC_SETTINGS");
  IElementType TRAIT_TYPE_DECLARATION = new DocumentationElementType("TRAIT_TYPE_DECLARATION");
  IElementType TYPE = new DocumentationElementType("TYPE");
  IElementType TYPE_DECLARATION = new DocumentationElementType("TYPE_DECLARATION");
  IElementType TYPE_QUALIFIER = new DocumentationElementType("TYPE_QUALIFIER");
  IElementType UI_XML_ATTRIBUTE = new DocumentationElementType("UI_XML_ATTRIBUTE");
  IElementType UI_XML_ATTRIBUTE_ITEM = new DocumentationElementType("UI_XML_ATTRIBUTE_ITEM");
  IElementType UI_XML_ENTRY = new DocumentationElementType("UI_XML_ENTRY");
  IElementType UI_XML_LAYOUT_SECTION = new DocumentationElementType("UI_XML_LAYOUT_SECTION");
  IElementType UI_XML_TAG = new DocumentationElementType("UI_XML_TAG");
  IElementType UI_XML_TAG_ATTRIBUTE = new DocumentationElementType("UI_XML_TAG_ATTRIBUTE");
  IElementType UI_XML_TAG_SCRIPT_ARGUMENTS = new DocumentationElementType("UI_XML_TAG_SCRIPT_ARGUMENTS");
  IElementType UI_XML_TAG_TRAIT = new DocumentationElementType("UI_XML_TAG_TRAIT");
  IElementType VERSION_SECTION = new DocumentationElementType("VERSION_SECTION");
  IElementType VISIBILITY = new DocumentationElementType("VISIBILITY");
  IElementType VM_FUNCTIONS_SECTION = new DocumentationElementType("VM_FUNCTIONS_SECTION");

  IElementType ASTERISK = new DocumentationTokenType("*");
  IElementType ASTERISK_DOUBLE = new DocumentationTokenType("**");
  IElementType ATTRIBUTE = new DocumentationTokenType("ATTRIBUTE");
  IElementType COMMA = new DocumentationTokenType(",");
  IElementType ELLIPSIS = new DocumentationTokenType("...");
  IElementType EQUALS = new DocumentationTokenType("=");
  IElementType EVENTS = new DocumentationTokenType("EVENTS");
  IElementType GAME_API = new DocumentationTokenType("GAME_API");
  IElementType GLOBAL_VARIABLES = new DocumentationTokenType("GLOBAL_VARIABLES");
  IElementType H1 = new DocumentationTokenType("h1.");
  IElementType H2 = new DocumentationTokenType("h2.");
  IElementType H3 = new DocumentationTokenType("h3.");
  IElementType H4 = new DocumentationTokenType("h4.");
  IElementType H5 = new DocumentationTokenType("h5.");
  IElementType H6 = new DocumentationTokenType("h6.");
  IElementType HASH = new DocumentationTokenType("#");
  IElementType H_CAPTION = new DocumentationTokenType("H_CAPTION");
  IElementType IDENTIFIER = new DocumentationTokenType("IDENTIFIER");
  IElementType LINE = new DocumentationTokenType("LINE");
  IElementType LOCAL = new DocumentationTokenType("local");
  IElementType L_BRACKET = new DocumentationTokenType("[");
  IElementType L_CURLY = new DocumentationTokenType("{");
  IElementType L_PAREN = new DocumentationTokenType("(");
  IElementType NILABLE = new DocumentationTokenType("nilable");
  IElementType NUMBER = new DocumentationTokenType("NUMBER");
  IElementType OBJECT_API = new DocumentationTokenType("OBJECT_API");
  IElementType OBJECT_INHERITANCE = new DocumentationTokenType("OBJECT_INHERITANCE");
  IElementType OR = new DocumentationTokenType("|");
  IElementType PRIVATE = new DocumentationTokenType("private");
  IElementType PROTECTED = new DocumentationTokenType("protected");
  IElementType PROTECTED_ATTRIBUTES = new DocumentationTokenType("protected-attributes");
  IElementType PUBLIC = new DocumentationTokenType("public");
  IElementType RETURNS = new DocumentationTokenType("RETURNS");
  IElementType R_BRACKET = new DocumentationTokenType("]");
  IElementType R_CURLY = new DocumentationTokenType("}");
  IElementType R_PAREN = new DocumentationTokenType(")");
  IElementType SCRIPT_ARGUMENTS = new DocumentationTokenType("SCRIPT_ARGUMENTS");
  IElementType SEMICOLON = new DocumentationTokenType(":");
  IElementType UI_XML_LAYOUT = new DocumentationTokenType("UI_XML_LAYOUT");
  IElementType USES_VARIABLE_RETURNS = new DocumentationTokenType("USES_VARIABLE_RETURNS");
  IElementType VM_FUNCTIONS = new DocumentationTokenType("VM_FUNCTIONS");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == COMPLEX_TYPE_DECLARATION) {
        return new DocumentationComplexTypeDeclarationGenImpl(node);
      }
      else if (type == DESCENDANT_TYPES) {
        return new DocumentationDescendantTypesGenImpl(node);
      }
      else if (type == EVENTS_SECTION) {
        return new DocumentationEventsSectionGenImpl(node);
      }
      else if (type == EVENT_DECLARATION) {
        return new DocumentationEventDeclarationGenImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new DocumentationFunctionDeclarationGenImpl(node);
      }
      else if (type == FUNCTION_PARAMETER) {
        return new DocumentationFunctionParameterGenImpl(node);
      }
      else if (type == FUNCTION_PARAMETERS) {
        return new DocumentationFunctionParametersGenImpl(node);
      }
      else if (type == FUNCTION_PARAMETERS_LIST) {
        return new DocumentationFunctionParametersListGenImpl(node);
      }
      else if (type == FUNCTION_RETURN_CLAUSE) {
        return new DocumentationFunctionReturnClauseGenImpl(node);
      }
      else if (type == FUNCTION_RETURN_ITEM) {
        return new DocumentationFunctionReturnItemGenImpl(node);
      }
      else if (type == FUNCTION_RETURN_LIST) {
        return new DocumentationFunctionReturnListGenImpl(node);
      }
      else if (type == FUNCTION_USES_CLAUSE) {
        return new DocumentationFunctionUsesClauseGenImpl(node);
      }
      else if (type == GAME_API_SECTION) {
        return new DocumentationGameApiSectionGenImpl(node);
      }
      else if (type == GLOBAL_ENUM) {
        return new DocumentationGlobalEnumGenImpl(node);
      }
      else if (type == GLOBAL_ENUM_ITEM) {
        return new DocumentationGlobalEnumItemGenImpl(node);
      }
      else if (type == GLOBAL_VARIABLES_SECTION) {
        return new DocumentationGlobalVariablesSectionGenImpl(node);
      }
      else if (type == OBJECT_API_SECTION) {
        return new DocumentationObjectApiSectionGenImpl(node);
      }
      else if (type == OBJECT_DECLARATION) {
        return new DocumentationObjectDeclarationGenImpl(node);
      }
      else if (type == OBJECT_INHERITANCE_CLAUSE) {
        return new DocumentationObjectInheritanceClauseGenImpl(node);
      }
      else if (type == PARAMETER) {
        return new DocumentationParameterGenImpl(node);
      }
      else if (type == PARAMETER_WITH_TYPE) {
        return new DocumentationParameterWithTypeGenImpl(node);
      }
      else if (type == SCRIPT_ARGUMENT) {
        return new DocumentationScriptArgumentGenImpl(node);
      }
      else if (type == SCRIPT_ARGUMENT_DEFAULT_VALUE) {
        return new DocumentationScriptArgumentDefaultValueGenImpl(node);
      }
      else if (type == SCRIPT_ARGUMENT_LIST) {
        return new DocumentationScriptArgumentListGenImpl(node);
      }
      else if (type == SINGLE_TYPE_DECLARATION) {
        return new DocumentationSingleTypeDeclarationGenImpl(node);
      }
      else if (type == TOC_SETTINGS) {
        return new DocumentationTocSettingsGenImpl(node);
      }
      else if (type == TRAIT_TYPE_DECLARATION) {
        return new DocumentationTraitTypeDeclarationGenImpl(node);
      }
      else if (type == TYPE) {
        return new DocumentationTypeGenImpl(node);
      }
      else if (type == TYPE_DECLARATION) {
        return new DocumentationTypeDeclarationGenImpl(node);
      }
      else if (type == TYPE_QUALIFIER) {
        return new DocumentationTypeQualifierGenImpl(node);
      }
      else if (type == UI_XML_ATTRIBUTE) {
        return new DocumentationUiXmlAttributeGenImpl(node);
      }
      else if (type == UI_XML_ATTRIBUTE_ITEM) {
        return new DocumentationUiXmlAttributeItemGenImpl(node);
      }
      else if (type == UI_XML_ENTRY) {
        return new DocumentationUiXmlEntryGenImpl(node);
      }
      else if (type == UI_XML_LAYOUT_SECTION) {
        return new DocumentationUiXmlLayoutSectionGenImpl(node);
      }
      else if (type == UI_XML_TAG) {
        return new DocumentationUiXmlTagGenImpl(node);
      }
      else if (type == UI_XML_TAG_ATTRIBUTE) {
        return new DocumentationUiXmlTagAttributeGenImpl(node);
      }
      else if (type == UI_XML_TAG_SCRIPT_ARGUMENTS) {
        return new DocumentationUiXmlTagScriptArgumentsGenImpl(node);
      }
      else if (type == UI_XML_TAG_TRAIT) {
        return new DocumentationUiXmlTagTraitGenImpl(node);
      }
      else if (type == VERSION_SECTION) {
        return new DocumentationVersionSectionGenImpl(node);
      }
      else if (type == VISIBILITY) {
        return new DocumentationVisibilityGenImpl(node);
      }
      else if (type == VM_FUNCTIONS_SECTION) {
        return new DocumentationVmFunctionsSectionGenImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
