package ru.phism.intellij.teso.documentation.psi

import com.intellij.lang.ASTNode
import com.intellij.psi.impl.source.tree.FileElement
import com.intellij.psi.tree.IFileElementType
import ru.phism.intellij.teso.documentation.DocumentationLanguage

class DocumentationFileElementType : IFileElementType(DocumentationLanguage) {
    override fun createNode(text: CharSequence?): ASTNode? {
        return FileElement(this, text)
    }
}

