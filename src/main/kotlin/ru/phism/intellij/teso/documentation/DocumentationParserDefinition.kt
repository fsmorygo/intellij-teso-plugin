package ru.phism.intellij.teso.documentation

import com.intellij.lang.ASTNode
import com.intellij.lang.LanguageUtil
import com.intellij.lang.ParserDefinition
import com.intellij.lang.ParserDefinition.SpaceRequirements
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import ru.phism.intellij.teso.documentation.psi.DocumentationTokenType
import ru.phism.intellij.teso.documentation.psi.DocumentationTokenTypes
import ru.phism.intellij.teso.documentation.psi.impl.DocumentationFileImpl

class DocumentationParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer {
        return DocumentationLexer()
    }

    override fun createParser(project: Project): PsiParser {
        return DocumentationParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return DocumentationTokenTypes.DOCUMENTATION_FILE
    }

    override fun getWhitespaceTokens(): TokenSet {
        return DocumentationTokenTypes.WHITESPACES
    }

    override fun getCommentTokens(): TokenSet {
        return DocumentationTokenTypes.COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return DocumentationTokenTypes.STRINGS
    }

    override fun createElement(node: ASTNode): PsiElement {
        return DocumentationParserTypes.Factory.createElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return DocumentationFileImpl(viewProvider)
    }

    override fun spaceExistenceTypeBetweenTokens(
        left: ASTNode,
        right: ASTNode
    ): SpaceRequirements {
        return LanguageUtil.canStickTokensTogetherByLexer(left, right, DocumentationLexer())
    }
}