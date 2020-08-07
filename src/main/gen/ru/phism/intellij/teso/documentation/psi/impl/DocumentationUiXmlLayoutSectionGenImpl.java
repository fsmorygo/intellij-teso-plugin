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

public class DocumentationUiXmlLayoutSectionGenImpl extends DocumentationPsiElementImpl implements DocumentationUiXmlLayoutSection {

  public DocumentationUiXmlLayoutSectionGenImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DocumentationVisitor visitor) {
    visitor.visitUiXmlLayoutSection(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DocumentationVisitor) accept((DocumentationVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DocumentationUiXmlEntry> getUiXmlEntryList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DocumentationUiXmlEntry.class);
  }

}
