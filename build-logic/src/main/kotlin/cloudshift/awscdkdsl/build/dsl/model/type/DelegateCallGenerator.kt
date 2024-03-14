@file:OptIn(ExperimentalContracts::class)

package cloudshift.awscdkdsl.build.dsl.model.type

import cloudshift.awscdkdsl.build.dsl.TypeGeneratorContext
import cloudshift.awscdkdsl.build.dsl.isCdkClass
import cloudshift.awscdkdsl.build.dsl.mapClassName
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.MAP
import com.squareup.kotlinpoet.ParameterizedTypeName
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.UNIT
import kotlin.contracts.ExperimentalContracts

internal class DelegateCallGenerator(
    private val context: TypeGeneratorContext,
    private val directUnwrap: Boolean,
    private val cdkObjectName: String
) {

    fun delegateMethodCall(spec: MethodSpec): CodeBlock {
        context.referencedTypes(spec.parameters.map { it.type })
        context.referencedType(spec.returnType)

        val returnType = when {
            spec.omitReturnType -> UNIT
            else -> spec.returnType
        }
        return DelegatedCall(spec.cdkName, returnType, directUnwrap).apply {
            when {
                spec.isStatic -> receiverType(spec.enclosingClass.className)
                else -> receiverName(cdkObjectName)
            }
            spec.parameters.forEach {
                parameter(it.name, it.type)
            }
        }.build()
    }
}


private class DelegatedCall(
    private val methodName: String,
    private val returnType: TypeName,
    private val directUnwrap: Boolean
) {

    private var receiverType: ClassName? = null
    private var receiverName: String? = null

    private data class Parameter(val name: String, val type: TypeName)
    private data class CallSegment(val formatStr: String, val formatArgs: List<Any>)

    private val parameters = mutableListOf<Parameter>()

    fun receiverName(name: String) {
        this.receiverName = name
    }

    fun receiverType(receiver: ClassName) {
        this.receiverType = receiver
    }

    fun parameter(name: String, type: TypeName) {
        parameters.add(Parameter(name, type))
    }

    fun build(): CodeBlock {
        require(receiverType != null || receiverName != null) { "Receiver type or receiver name must be set" }
        val formatArgs = mutableListOf<Any>()
        val formatStr = buildString(200) {
            if (returnType != UNIT) {
                append("return ")
            }

            when {
                receiverType != null -> {
                    append("%T.%N(")
                    formatArgs.add(receiverType!!)
                    formatArgs.add(methodName)
                }

                else -> {
                    if (directUnwrap) {
                        append("%N.%N(")
                        formatArgs.add(receiverName!!)
                        formatArgs.add(methodName)
                    } else {
                        append("unwrap(this).%N(")
                        formatArgs.add(methodName)
                    }
                }
            }

            parameters.forEachIndexed { index, param ->
                maybeUnwrapParameter(param).also {
                    append(it.formatStr)
                    formatArgs.addAll(it.formatArgs)
                }
                if (index != parameters.size - 1) {
                    append(", ")
                }
            }

            append(")")
            wrapValue(returnType).also {
                append(it.formatStr)
                formatArgs.addAll(it.formatArgs)
            }
        }
        return CodeBlock.builder()
            .addStatement(formatStr, *formatArgs.toTypedArray())
            .build()
    }


    private fun wrapValue(type: TypeName): CallSegment {
        when {
            type == UNIT -> return CallSegment("", emptyList())
            type is ClassName && !type.isCdkClass -> return CallSegment("", emptyList())
        }
        val nullable = if (type.isNullable) "?" else ""

        val defaultCallSegment = CallSegment(
            "$nullable.let(%T::wrap)",
            listOf(type.mapClassName().copy(nullable = false)),
        )
        return when {
            type is ParameterizedTypeName -> when {
                type.isMapWithCdkListValue() -> {
                    val listType =
                        (type as ParameterizedTypeName).typeArguments[1] as ParameterizedTypeName
                    CallSegment(
                        "$nullable.mapValues{it.value.map(%T::wrap)} ?: emptyMap()",
                        listOf(listType.typeArguments[0].mapClassName().copy(nullable = false)),
                    )
                }

                type.rawType == MAP && type.typeArguments.none { it.isCdkClass } -> CallSegment(
                    " ?: emptyMap()",
                    emptyList(),
                )

                type.isMapWithCdkValue() -> CallSegment(
                    "$nullable.mapValues{%T.wrap(it.value)} ?: emptyMap()",
                    listOf(type.typeArguments[1].mapClassName().copy(nullable = false)),
                )

                type.isListOfCdkObject() -> {
                    val nullableSuffix = if (type.isNullable) " ?: emptyList()" else ""
                    CallSegment(
                        "$nullable.map(%T::wrap)$nullableSuffix",
                        listOf(type.typeArguments[0].mapClassName().copy(nullable = false)),
                    )
                }

                type.isList -> CallSegment(
                    " ?: emptyList()",
                    emptyList(),
                )

                else -> defaultCallSegment
            }

            else -> defaultCallSegment
        }
    }

    private fun maybeUnwrapParameter(parameter: Parameter): CallSegment {
        return when {
            parameter.type.mapClassName() != parameter.type -> {
                unwrapValue(parameter.name, parameter.type)
            }

            else -> {
                CallSegment("%N", listOf(parameter.name))
            }
        }
    }

    private fun unwrapValue(name: String, type: TypeName): CallSegment {
        val nullable = if (type.isNullable) "?" else ""
        val nullableListSuffix = if (type.isNullable) " ?: emptyList()" else ""
        val defaultCallSegment = CallSegment("%N", listOf(name))
        return when {
            type is ParameterizedTypeName -> when {
                type.isMapWithCdkValue() -> CallSegment(
                    "%N$nullable.mapValues{%T.unwrap(it.value)}",
                    listOf(
                        name,
                        type.typeArguments[1].mapClassName()
                            .copy(nullable = false),
                    ),
                )

                type.isMapWithCdkListValue() -> {
                    val listType =
                        type.typeArguments[1] as ParameterizedTypeName
                    CallSegment(
                        "%N$nullable.mapValues{it.value.map(%T::unwrap) }$nullableListSuffix",
                        listOf(
                            name,
                            listType.typeArguments[0].mapClassName().copy(nullable = false),
                        ),
                    )
                }

                type.isListOfListsOfCdkObject() -> {
                    val listType =
                        type.typeArguments[0] as ParameterizedTypeName
                    CallSegment(
                        "%N$nullable.map{ it.map(%T::unwrap) }$nullableListSuffix",
                        listOf(
                            name,
                            listType.typeArguments[0].mapClassName().copy(nullable = false),
                        ),
                    )
                }

                type.isListOfCdkObject() -> CallSegment(
                    "%N$nullable.map(%T::unwrap)$nullableListSuffix",
                    listOf(
                        name,
                        type.typeArguments[0].mapClassName()
                            .copy(nullable = false),
                    ),
                )

                else -> defaultCallSegment
            }

            type.isCdkClass -> CallSegment(
                "%N$nullable.let(%T::unwrap)",
                listOf(name, type.mapClassName()),
            )

            else -> defaultCallSegment
        }
    }
}

private fun TypeName.isMapWithCdkListValue(): Boolean {
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

private fun TypeName.isListOfListsOfCdkObject(): Boolean {
    return when (this) {
        is ParameterizedTypeName -> when {
            rawType == LIST && typeArguments[0].isList && (typeArguments[0] as ParameterizedTypeName).typeArguments[0].isCdkClass -> true
            else -> false
        }

        else -> false
    }
}

private fun TypeName.isListOfCdkObject(): Boolean {
    return this is ParameterizedTypeName && rawType == LIST && typeArguments[0].isCdkClass
}

private fun TypeName.isMapWithCdkValue(): Boolean {
    return this is ParameterizedTypeName && rawType == MAP && !typeArguments[0].isCdkClass && typeArguments[1].isCdkClass
}
