package ru.phism.intellij.teso.documentation.psi

import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import ru.phism.intellij.teso.documentation.DocumentationLanguage

class DocumentationElementType(@NonNls debugName: String) : IElementType(debugName, DocumentationLanguage)