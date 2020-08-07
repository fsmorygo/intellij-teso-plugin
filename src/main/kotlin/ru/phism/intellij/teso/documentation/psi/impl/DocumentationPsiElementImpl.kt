package ru.phism.intellij.teso.documentation.psi.impl

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode

abstract class DocumentationPsiElementImpl(node: ASTNode) : ASTWrapperPsiElement(node)