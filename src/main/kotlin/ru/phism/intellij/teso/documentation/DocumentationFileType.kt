package ru.phism.intellij.teso.documentation

import com.intellij.icons.AllIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.CharsetToolkit
import com.intellij.openapi.vfs.VirtualFile
import javax.swing.Icon

object DocumentationFileType : LanguageFileType(DocumentationLanguage) {
    override fun getName(): String {
        return "ESO API Documentation"
    }

    override fun getDescription(): String {
        return "ESO API Documentation"
    }

    override fun getDefaultExtension(): String {
        return "txt"
    }

    override fun getIcon(): Icon? {
        return AllIcons.FileTypes.Text
    }

    override fun getCharset(file: VirtualFile, content: ByteArray): String? {
        return CharsetToolkit.UTF8
    }
}
