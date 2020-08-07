package ru.phism.intellij.teso.documentation

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType

object DocumentationLanguage : Language("ESOAPIDocumentation") {
    override fun getAssociatedFileType(): LanguageFileType? = DocumentationFileType
}