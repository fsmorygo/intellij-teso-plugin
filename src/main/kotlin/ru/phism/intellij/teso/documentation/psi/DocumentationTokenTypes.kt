package ru.phism.intellij.teso.documentation.psi

import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

interface DocumentationTokenTypes {
    companion object {
        var DOCUMENTATION_FILE: IFileElementType = DocumentationFileElementType()

        val STRINGS: TokenSet = TokenSet.EMPTY
        val COMMENTS: TokenSet = TokenSet.EMPTY
        val WHITESPACES: TokenSet = TokenSet.WHITE_SPACE
    }
}