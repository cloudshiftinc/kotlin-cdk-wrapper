package cloudshift.awscdkdsl.build.dsl.model.type

import cloudshift.awscdkdsl.build.dsl.isCdkClass
import cloudshift.awscdkdsl.build.dsl.isListOfAny
import cloudshift.awscdkdsl.build.dsl.isListOfCdkObject
import cloudshift.awscdkdsl.build.dsl.isListOfListsOfCdkObject
import cloudshift.awscdkdsl.build.dsl.isMapWithAnyValue
import cloudshift.awscdkdsl.build.dsl.isMapWithCdkListValue
import cloudshift.awscdkdsl.build.dsl.isMapWithCdkValue
import cloudshift.awscdkdsl.build.dsl.mapClassName
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.MAP
import com.squareup.kotlinpoet.ParameterizedTypeName
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.UNIT

internal class DelegateCallGenerator(
    private val directUnwrap: Boolean,
    private val cdkObjectName: String
) {

    fun delegateMethodCall(spec: MethodSpec): CodeBlock {

        val returnType = when {
            spec.omitReturnType || spec.isConstructor -> UNIT
            else -> spec.returnType
        }

        return DelegatedCall(
            spec.cdkName,
            returnType,
            spec.enclosingClass.className,
            directUnwrap,
            spec.isConstructor,
        ).apply {
            when {
                spec.isStatic -> receiverType(spec.enclosingClass.className)
                else -> receiverName(cdkObjectName)
            }
            spec.parameters.forEach {
                parameter(it.name, it.type, it.varargs)
            }
        }.build()
    }
}


private class DelegatedCall(
    private val methodName: String,
    private val returnType: TypeName,
    private val enclosingClass: ClassName,
    private val directUnwrap: Boolean,
    private val isCallThisConstructor: Boolean
) {

    private var receiverType: ClassName? = null
    private var receiverName: String? = null

    private data class Parameter(val name: String, val type: TypeName, val vararg: Boolean)
    private data class CallSegment(val formatStr: String, val formatArgs: List<Any>)

    private val parameters = mutableListOf<Parameter>()

    fun receiverName(name: String) {
        this.receiverName = name
    }

    fun receiverType(receiver: ClassName) {
        this.receiverType = receiver
    }

    fun parameter(name: String, type: TypeName, vararg: Boolean) {
        parameters.add(Parameter(name, type, vararg))
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

                else -> when {
                    isCallThisConstructor -> {
                        append("%T(")
                        formatArgs.add(enclosingClass)
                    }

                    directUnwrap -> {
                        append("%N.%N(")
                        formatArgs.add(receiverName!!)
                        formatArgs.add(methodName)
                    }

                    else -> {
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
        val nullableListSuffix = if (type.isNullable) " ?: emptyList()" else ""
        return when {
            type is ParameterizedTypeName -> when {
                type.isMapWithCdkListValue() -> {
                    val listType =
                        type.typeArguments[1] as ParameterizedTypeName
                    val nullableMapSuffix = if (type.isNullable) " ?: emptyMap()" else ""
                    CallSegment(
                        "$nullable.mapValues{it.value.map(%T::wrap)}$nullableMapSuffix",
                        listOf(listType.typeArguments[0].mapClassName().copy(nullable = false)),
                    )
                }

                type.rawType == MAP && type.typeArguments.none { it.isCdkClass } -> CallSegment(
                    " ?: emptyMap()",
                    emptyList(),
                )

                type.isMapWithCdkValue() -> {
                    val nullableMapSuffix = if (type.isNullable) " ?: emptyMap()" else ""
                    CallSegment(
                        "$nullable.mapValues{%T.wrap(it.value)}$nullableMapSuffix",
                        listOf(type.typeArguments[1].mapClassName().copy(nullable = false)),
                    )
                }

                type.isListOfListsOfCdkObject() -> {
                    val listType =
                        type.typeArguments[0] as ParameterizedTypeName
                    CallSegment(
                        "$nullable.map{ it.map(%T::wrap) }$nullableListSuffix",
                        listOf(
                            listType.typeArguments[0].mapClassName().copy(nullable = false),
                        ),
                    )
                }

                type.isListOfCdkObject() -> {
                    val nullableSuffix = if (type.isNullable) " ?: emptyList()" else ""
                    CallSegment(
                        "$nullable.map(%T::wrap)$nullableSuffix",
                        listOf(type.typeArguments[0].mapClassName().copy(nullable = false)),
                    )
                }

                type.isList -> {
                    val nullableSuffix = if (type.isNullable) " ?: emptyList()" else ""
                    CallSegment(
                        nullableSuffix,
                        emptyList(),
                    )
                }

                else -> defaultCallSegment
            }

            else -> defaultCallSegment
        }
    }

    private fun maybeUnwrapParameter(parameter: Parameter): CallSegment {
        return unwrapValue(parameter.name, parameter.type, parameter.vararg)
    }

    private fun unwrapValue(name: String, type: TypeName, vararg: Boolean): CallSegment {
        val nullable = if (type.isNullable) "?" else ""
        val nullableListSuffix = if (type.isNullable) " ?: emptyList()" else ""
        val defaultCallSegment = CallSegment("%N", listOf(name))

        return when {
            type is ParameterizedTypeName -> when {
                type.isMapWithCdkListValue() -> {
                    val listType =
                        type.typeArguments[1] as ParameterizedTypeName
                    CallSegment(
                        "%N$nullable.mapValues{it.value.map(%T.Companion::unwrap) }$nullableListSuffix",
                        listOf(
                            name,
                            listType.typeArguments[0].mapClassName().copy(nullable = false),
                        ),
                    )
                }

                type.isMapWithCdkValue() -> CallSegment(
                    "%N$nullable.mapValues{%T.unwrap(it.value)}",
                    listOf(
                        name,
                        type.typeArguments[1].mapClassName()
                            .copy(nullable = false),
                    ),
                )

                type.isListOfListsOfCdkObject() -> {
                    val listType =
                        type.typeArguments[0] as ParameterizedTypeName
                    CallSegment(
                        "%N$nullable.map{ it.map(%T.Companion::unwrap) }$nullableListSuffix",
                        listOf(
                            name,
                            listType.typeArguments[0].mapClassName().copy(nullable = false),
                        ),
                    )
                }

                type.isListOfCdkObject() -> CallSegment(
                    "%N$nullable.map(%T.Companion::unwrap)$nullableListSuffix",
                    listOf(
                        name,
                        type.typeArguments[0].mapClassName()
                            .copy(nullable = false),
                    ),
                )

                type.isListOfAny() -> CallSegment(
                    "%N$nullable.map{%T.unwrap(it)}$nullableListSuffix",
                    listOf(
                        name,
                        CdkWrappersGenerator.ClassName,
                    ),
                )

                vararg && type.isMapWithAnyValue() -> CallSegment(
                    "*%N$nullable.map{it.mapValues{%T.unwrap(it.value)}}.toTypedArray()",
                    listOf(
                        name,
                        CdkWrappersGenerator.ClassName,
                    ),
                )

                type.isMapWithAnyValue() -> CallSegment(
                    "%N$nullable.mapValues{%T.unwrap(it.value)}",
                    listOf(
                        name,
                        CdkWrappersGenerator.ClassName,
                    ),
                )

                else -> defaultCallSegment
            }

            vararg -> CallSegment(
                "*%N$nullable.map{%T.unwrap(it) as %T}.toTypedArray()",
                listOf(name, CdkWrappersGenerator.ClassName, type),
            )

            type.isCdkClass -> CallSegment(
                "%N$nullable.let(%T.Companion::unwrap)",
                listOf(name, type.mapClassName()),
            )

            else -> defaultCallSegment
        }
    }
}

