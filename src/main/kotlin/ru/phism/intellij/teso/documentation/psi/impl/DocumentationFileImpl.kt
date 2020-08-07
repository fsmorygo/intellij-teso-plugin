package ru.phism.intellij.teso.documentation.psi.impl

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiManager
import com.intellij.psi.SingleRootFileViewProvider
import com.intellij.testFramework.LightVirtualFile
import ru.phism.intellij.teso.documentation.DocumentationFileType
import ru.phism.intellij.teso.documentation.DocumentationLanguage

class DocumentationFileImpl(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, DocumentationLanguage) {
    override fun getFileType(): FileType {
        return DocumentationFileType
    }

    private class DocumentationFileViewProvider internal constructor(
        manager: PsiManager,
        virtualFile: VirtualFile,
        eventSystemEnabled: Boolean
    ) :
        SingleRootFileViewProvider(manager, virtualFile, eventSystemEnabled, DocumentationLanguage)

    companion object {
        fun createFromText(text: CharSequence, manager: PsiManager): DocumentationFileImpl {
            val virtualFile = LightVirtualFile("documentation.txt", DocumentationFileType, text)
            val viewProvider = DocumentationFileViewProvider(manager, virtualFile, false)
            return viewProvider.getPsi(DocumentationLanguage) as DocumentationFileImpl
        }
    }
}
