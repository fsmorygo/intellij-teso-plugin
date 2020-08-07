package ru.phism.intellij.teso.documentation

import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.LookAheadLexer
import com.intellij.lexer.MergingLexerAdapter
import com.intellij.psi.TokenType
import com.intellij.psi.tree.TokenSet
import ru.phism.intellij.teso.documentation.lexer._DocumentationLexer

class DocumentationLexer : LookAheadLexer(
    MergingLexerAdapter(
        FlexAdapter(object : _DocumentationLexer() {
            override fun reset(
                buffer: CharSequence?,
                start: Int,
                end: Int,
                initialState: Int
            ) {
//                onReset()
                super.reset(buffer, start, end, initialState)
            }
        }),
        TokenSet.create(
            TokenType.WHITE_SPACE
        )
    )
)