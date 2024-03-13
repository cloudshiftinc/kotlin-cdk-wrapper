package cloudshift.awscdkdsl.build.dsl.model.type

import cloudshift.awscdkdsl.build.dsl.isCdkClass
import cloudshift.awscdkdsl.build.dsl.mapClassName
import cloudshift.awscdkdsl.build.dsl.mappedClassName
import cloudshift.awscdkdsl.build.dsl.model.CdkModel
import com.google.common.hash.Hashing
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.UNIT

internal class DslEnhancer(private val model: CdkModel) {

    fun enhance(spec: MethodSpec): List<MethodSpec> {

        return when {
            spec.parameters.isEmpty() -> emptyList()
            spec.parameters.last().type.isCdkClass -> handleCdkClass(spec)
            else -> return emptyList()
        }
    }

    private fun handleCdkClass(spec: MethodSpec): List<MethodSpec> {
        val lastParam = spec.parameters.last()
        val lastParamType = lastParam.type as ClassName
        val builder = model.builderFor(lastParam.type) ?: return emptyList()
        if(!builder.cdkBuilderClass.canInstantiate()) return emptyList()

        val baseParams = spec.parameters.dropLast(1)

        val lambdaTypeName = LambdaTypeName.get(
            receiver = lastParamType.mappedClassName().nestedClass("Builder"),
            returnType = UNIT,
        )

        val buildableLastParam = MethodSpec.Parameter(
            name = lastParam.name,
            type = lambdaTypeName,
           // defaultValue = CodeBlock.of("{}")
        )

        val formatSpecs = FormatSpecifiers()
        baseParams.forEach { formatSpecs.add("%N", it.name) }

        val formatStr = "return %N(${formatSpecs.formatString(true)}%T(%N))"

        val body = CodeBlock.builder()
            .addStatement(formatStr, spec.name, *formatSpecs.formatArgs(), lastParam.type.mapClassName(), lastParam.name,)
            .build()

        val suppressJvmAnnotation = AnnotationSpec.builder(Suppress::class)
            .addMember("%S", "INAPPLICABLE_JVM_NAME")
            .build()

        val jvmNameAnnotation = AnnotationSpec.builder(JvmName::class)
            .addMember("%S", "${spec.name}${spec.signature}".sha256())
            .build()

        val annotations = listOf(suppressJvmAnnotation, jvmNameAnnotation)

        return listOf(spec.copy(parameters = baseParams + buildableLastParam, body = body, annotations = spec.annotations + annotations))
    }
}

private fun String.sha256() : String {
    return Hashing.sha256().hashString(this, Charsets.UTF_8).toString()
}

internal class FormatSpecifiers {
    private val formatValues = mutableListOf<Any>()
    private val formatSpecifiers = mutableListOf<String>()

    fun add(formatString : String, vararg values: Any) {
        require(values.isNotEmpty()) { "values must not be empty" }
        formatSpecifiers.add(formatString)
        this.formatValues.addAll(values)
    }

    fun formatString(trailingComma : Boolean = false): String {
        val str = formatSpecifiers.joinToString(", ")
        if(str.isNotEmpty() && trailingComma) {
            return "$str, "
        }
        return str
    }

    fun formatArgs(): Array<Any> = formatValues.toTypedArray()
}
