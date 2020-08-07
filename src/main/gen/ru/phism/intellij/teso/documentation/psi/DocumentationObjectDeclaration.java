// This is a generated file. Not intended for manual editing.
package ru.phism.intellij.teso.documentation.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DocumentationObjectDeclaration extends DocumentationPsiElement {

  @NotNull
  List<DocumentationFunctionDeclaration> getFunctionDeclarationList();

  @Nullable
  DocumentationObjectInheritanceClause getObjectInheritanceClause();

}
