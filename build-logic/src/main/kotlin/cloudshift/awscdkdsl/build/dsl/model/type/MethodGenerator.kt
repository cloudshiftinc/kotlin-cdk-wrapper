package cloudshift.awscdkdsl.build.dsl.model.type

import cloudshift.awscdkdsl.build.dsl.Annotations
import cloudshift.awscdkdsl.build.dsl.mapClassName
import cloudshift.awscdkdsl.build.dsl.model.CdkClass
import cloudshift.awscdkdsl.build.dsl.model.CdkModel
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.UNIT
import net.pearx.kasechange.toCamelCase

internal class MethodGenerator(
    model: CdkModel,
    private val factories: List<MethodSpecFactory>
) {

    private val dslEnhancer = DslEnhancer(model)

    data class CdkMethod(
        val interfaceMethod: FunSpec,
        val implementationMethod: FunSpec
    ) {
        fun specFor(cdkClass: CdkClass): FunSpec {
            return if (cdkClass.isInterface) interfaceMethod else implementationMethod
        }
    }

    fun generate(enclosingClass: CdkClass, methods: List<CdkClass.Method>): List<CdkMethod> {
        return methods.flatMap { method ->
            val specs = factories.flatMap { it.create(enclosingClass, method) }

            val dslSpecs = specs.flatMap { dslEnhancer.enhance(it) }

            (specs + dslSpecs).map { buildMethod(it) }
        }.sortedWith(compareBy({ it.interfaceMethod.name }, { it.interfaceMethod.parameters.size }))
    }

    private fun buildMethod(spec: MethodSpec): CdkMethod {
        val interfaceBuilder = functionBuilder(spec)
        val implementationBuilder = functionBuilder(spec)

        if (spec.isOverride) {
            implementationBuilder.addModifiers(KModifier.OVERRIDE)
            interfaceBuilder.addModifiers(KModifier.OVERRIDE)
        }

        if (spec.isOpen && !spec.isOverride) {
            implementationBuilder.addModifiers(KModifier.OPEN)
        }

        spec.body?.let { implementationBuilder.addCode(it) }

        if (spec.enclosingClass.isInterface) {
            if (spec.isAbstract) {
                interfaceBuilder.addModifiers(KModifier.ABSTRACT)
            } else {
                spec.body?.let { interfaceBuilder.addCode(it) }
            }
        }

        return CdkMethod(
            interfaceMethod = interfaceBuilder.build(),
            implementationMethod = implementationBuilder.build(),
        )
    }

    private fun functionBuilder(spec: MethodSpec): FunSpec.Builder {
        val builder = FunSpec.builder(spec.name)
            .addParameters(spec.parameters.map { it.toParameterSpec() })
            .addModifiers(KModifier.PUBLIC)

        if (!spec.omitReturnType) builder.returns(spec.returnType.mapClassName())
        if (spec.isDeprecated) builder.addAnnotation(Annotations.Deprecated)
        spec.comment?.let { builder.addKdoc("%L", it) }

        builder.addAnnotations(spec.annotations)

        return builder
    }
}


internal data class MethodSpec(
    val signature: String,
    val comment: String?,
    val isDeprecated: Boolean,
    val cdkName: String,
    val parameters: List<Parameter>,
    val returnType: TypeName = UNIT,
    val enclosingClass: CdkClass,
    val isOverride: Boolean = false,
    val isStatic: Boolean = false,
    val omitReturnType: Boolean = false,
    val body: CodeBlock? = null,
    val isOpen: Boolean = false,
    val isAbstract: Boolean = false,
    val annotations: List<AnnotationSpec> = emptyList()
) {

    val name: String
        get() = when (cdkName) {
            "set", "get" -> cdkName
            else -> cdkName.removePrefix("set").removePrefix("get").toCamelCase()
        }

    data class Parameter(
        val name: String,
        val type: TypeName
    ) {
        fun toParameterSpec(): ParameterSpec {
            val builder = ParameterSpec.builder(
                name,
                type.mapClassName(),
            )
            return builder.build()
        }
    }

    companion object {
        fun fromCdkMethod(
            method: CdkClass.Method,
            enclosingClass: CdkClass,
            model: CdkModel
        ): MethodSpec {
            val parameters = method.parameters.map {
                Parameter(it.name, it.type)
            }
            val isOverride = model.isOverrideMethod(enclosingClass.className, method)
            if(enclosingClass.className.simpleName == "EbsDeviceProps" && method.name.contains("deleteOnTermination")) {
                println("MethodSpec: EbsDeviceProps: ${method.name} ${method.signature} ${isOverride}")
            }
            return MethodSpec(
                signature = method.signature,
                cdkName = method.name,
                parameters = parameters,
                returnType = method.returnType,
                enclosingClass = enclosingClass,
                isOverride = isOverride,
                isDeprecated = method.deprecated,
                comment = method.comment,
                isOpen = !enclosingClass.isInterface,
                isAbstract = method.isAbstract,
            )
        }
    }
}



val TypeName.isList: Boolean
    get() = when (this) {
        is ParameterizedTypeName -> rawType == LIST
        is ClassName -> this == LIST
        else -> false
    }

internal fun interface MethodSpecFactory {
    fun create(enclosingClass: CdkClass, method: CdkClass.Method): List<MethodSpec>
}

