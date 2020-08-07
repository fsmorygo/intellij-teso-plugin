package ru.phism.intellij.teso.documentation

class DocumentationModel(
    val version: String,
    val enums: List<ConstantEnum>,
    val methods: List<Method>
) {
    class ConstantEnum(
        val name: String,
        val items: List<String>
    )

    class Method(
        val name: String,
        val arguments: List<String>,
        val returnType: String?
    )
}