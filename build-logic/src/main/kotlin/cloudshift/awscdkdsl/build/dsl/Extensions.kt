package cloudshift.awscdkdsl.build.dsl

import cloudshift.awscdkdsl.build.dsl.model.BuilderProperty
import cloudshift.awscdkdsl.build.dsl.model.type.isList
import com.google.common.hash.Hashing
import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.MAP
import com.squareup.kotlinpoet.ParameterizedTypeName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.asTypeName

internal object Annotations {
    val Deprecated =
        AnnotationSpec.builder(Deprecated::class.asTypeName())
            .addMember("message = %S", "deprecated in CDK")
            .build()
}

internal fun dslFunctionSpec(prop: BuilderProperty, block: FunSpec.Builder.() -> Unit = {}): FunSpec {
    val builder = FunSpec.builder(prop.name)
    builder.apply(block)
    if (prop.deprecated) builder.addAnnotation(Annotations.Deprecated)
    prop.comment?.let { builder.addKdoc("%L", it) }
    return builder.build()
}


internal fun ClassName.isOuterClass(): Boolean {
    return simpleNames.size == 1
}

internal fun ClassName.mappedClassName(): ClassName {
    val pkgName =
        packageName.replace("software.amazon.awscdk", "io.cloudshiftdev.awscdk")
            .replace("software.constructs", "io.cloudshiftdev.constructs")
    return (ClassName(pkgName, simpleNames).copy(nullable = this.isNullable) as ClassName)
}

internal val ClassName.isJssiClass: Boolean
    get() = toString().lowercase().contains("jsii")

internal val ClassName.isJsiiProxy: Boolean
    get() = simpleNames.last() == "Jsii\$Proxy"


internal val ClassName.isCdkClass: Boolean
    get() = packageName.startsWith("software")

internal val ClassName.isBuilderClass: Boolean
    get() = simpleNames.last().endsWith("Builder")

internal val TypeName.isCdkClass: Boolean
    get() = when (this) {
        is ClassName -> this.isCdkClass
        is ParameterizedTypeName -> this.rawType.isCdkClass || this.typeArguments.any { it.isCdkClass }
        else -> false
    }

internal val TypeName.isJssiClass: Boolean
    get() = when (this) {
        is ClassName -> this.isJssiClass
        else -> false
    }


internal fun TypeName.mapClassName(): TypeName {
    return when (this) {
        is ClassName -> mappedClassName()
        is ParameterizedTypeName -> {
            this.rawType.mappedClassName().parameterizedBy(
                *this.typeArguments.map { it.mapClassName() }.toTypedArray(),
            )
        }
        is LambdaTypeName -> this

        else -> TODO("Unknown type: ${this::class} $this")
    }
}


internal fun TypeName.isMapWithCdkListValue(): Boolean {
    fun checkTypeArgs(typeArguments: List<TypeName>): Boolean {
        if (!(typeArguments.size == 2 && !typeArguments[0].isCdkClass && typeArguments[1].isList)) return false
        val valueType = typeArguments[1] as ParameterizedTypeName
        return when {
            valueType.typeArguments[0].isCdkClass -> true
            else -> false
        }
    }
    return when (this) {
        is ParameterizedTypeName -> when {
            rawType == MAP && checkTypeArgs(typeArguments) -> true
            else -> false
        }

        else -> false
    }
}

internal fun TypeName.isListOfListsOfCdkObject(): Boolean {
    return when (this) {
        is ParameterizedTypeName -> when {
            rawType == LIST && typeArguments[0].isList && (typeArguments[0] as ParameterizedTypeName).typeArguments[0].isCdkClass -> true
            else -> false
        }

        else -> false
    }
}

internal fun TypeName.isListOfCdkObject(): Boolean {
    return this is ParameterizedTypeName && rawType == LIST && typeArguments[0].isCdkClass
}

internal fun TypeName.isListOfAny(): Boolean {
    return this is ParameterizedTypeName && rawType == LIST && typeArguments[0] == ANY
}

internal fun TypeName.isMapWithAnyValue(): Boolean {
    return this is ParameterizedTypeName && rawType == MAP && !typeArguments[0].isCdkClass && typeArguments[1] == ANY
}

internal fun TypeName.isMapWithCdkValue(): Boolean {
    return this is ParameterizedTypeName && rawType == MAP && !typeArguments[0].isCdkClass && typeArguments[1].isCdkClass
}

public fun String.sha256(): String {
    return Hashing.sha256().hashString(this, Charsets.UTF_8).toString()
}
