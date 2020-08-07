// This is a generated file. Not intended for manual editing.
package ru.phism.intellij.teso.documentation.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ru.phism.intellij.teso.documentation.DocumentationParserTypes.*;
import ru.phism.intellij.teso.documentation.psi.*;

public class DocumentationObjectInheritanceClauseGenImpl extends DocumentationPsiElementImpl implements DocumentationObjectInheritanceClause {

  public DocumentationObjectInheritanceClauseGenImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DocumentationVisitor visitor) {
    visitor.visitObjectInheritanceClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DocumentationVisitor) accept((DocumentationVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DocumentationDescendantTypes getDescendantTypes() {
    return findNotNullChildByClass(DocumentationDescendantTypes.class);
  }

  @Override
  @NotNull
  public DocumentationType getType() {
    return findNotNullChildByClass(DocumentationType.class);
  }

}
