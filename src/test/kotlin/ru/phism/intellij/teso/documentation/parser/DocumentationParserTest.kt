package ru.phism.intellij.teso.documentation.parser

import com.intellij.testFramework.ParsingTestCase
import ru.phism.intellij.teso.documentation.DocumentationParserDefinition

class DocumentationParserTest : ParsingTestCase("parsing", "apidoc", true, DocumentationParserDefinition()) {

    override fun getTestDataPath(): String? {
        return "src/testData"
    }

    fun testHeader() { doTest(true) }
    fun testVmFunctions() { doTest(true) }
    fun testGlobalEnums() { doTest(true) }
    fun testEvents() { doTest(true) }
    fun testFunctions() { doTest(true) }
    fun testFunctionsOnSublevel() { doTest(true) }
    fun testUixml() { doTest(true) }

}