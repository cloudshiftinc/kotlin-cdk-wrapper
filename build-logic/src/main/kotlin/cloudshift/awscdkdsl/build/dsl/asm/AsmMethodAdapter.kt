package cloudshift.awscdkdsl.build.dsl.asm

import cloudshift.awscdkdsl.build.dsl.model.CdkClass
import cloudshift.awscdkdsl.build.dsl.model.source.CdkSourceMethod
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.UNIT
import org.aspectj.util.GenericSignature.ArrayTypeSignature
import org.aspectj.util.GenericSignature.BaseTypeSignature
import org.aspectj.util.GenericSignature.ClassTypeSignature
import org.aspectj.util.GenericSignature.TypeArgument
import org.aspectj.util.GenericSignature.TypeSignature
import org.aspectj.util.GenericSignatureParser
import org.gradle.kotlin.dsl.provideDelegate
import org.objectweb.asm.Type
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.MethodNode

internal class AsmEnumFieldAdapter(override val name : String) : CdkClass.EnumField {
}

internal class AsmMethodAdapter(
    private val delegate: MethodNode,
    private val sourceMethod: CdkSourceMethod? = null
) : CdkClass.Method {
    override val isPublic: Boolean
        get() = delegate.accessFlags.isPublic()
    override val name: String = delegate.name
    override val signature: String = delegate.signature ?: delegate.desc
    private val annotations: List<ClassName> by
        lazy(LazyThreadSafetyMode.NONE) {
            delegate.allAnnotations.map { Type.getType(it.desc).toTypeName() }
        }

    override val deprecated: Boolean = annotations.any { it.toString().contains("Deprecated") }

    override val parameters: List<CdkClass.Method.Parameter> by
        lazy(LazyThreadSafetyMode.NONE) {

            // handle generics from the method signature
            var genericParams: List<TypeName> = emptyList()
            val argumentTypes = Type.getMethodType(delegate.desc).argumentTypes

            if (delegate.signature != null) {
                val params =
                    GenericSignatureParser()
                        .parseAsMethodSignature(delegate.signature)
                        .parameters
                        .asList()
                genericParams = params.map { it.toTypeName() }
                check(genericParams.size == argumentTypes.size) {
                    "Mismatch generic params size <> argument types size; method = ${delegate.name} " +
                        "arg types = ${argumentTypes.map { it.toTypeName() }}; params = ${params.map { it.javaClass }}; " +
                        "generic params = $genericParams}; desc = ${delegate.desc}; signature = ${delegate.signature}"
                }
            }

            argumentTypes.mapIndexed { index: Int, type: Type ->
                val parameterName =
                    when {
                        delegate.parameters != null -> delegate.parameters[index].name
                        sourceMethod?.parameterNames?.get(index) != null -> sourceMethod.parameterNames[index]
                        delegate.localVariables != null ->
                            when {
                                delegate.accessFlags.isStatic() ->
                                    delegate.localVariables[index].name

                                // first index is 'this' for instance methods, skip it
                                else -> delegate.localVariables[index + 1].name
                            }
                        else -> "arg$index"

                    }.removePrefix("_")

                var theType: TypeName = type.toTypeName()
                if (genericParams.isNotEmpty()) {
                    theType = genericParams[index]
                }

                val visibleAnnotations =
                    delegate.visibleParameterAnnotations?.get(index) ?: emptyList()
                val invisibleAnnotations =
                    delegate.invisibleParameterAnnotations?.get(index) ?: emptyList()
                val allAnnotations =
                    (visibleAnnotations + invisibleAnnotations).map {
                        Type.getType(it.desc).toTypeName()
                    }

                val nullable = allAnnotations.any { it.toString().lowercase().contains("nullable") }

                AsmParameterAdapter(name = parameterName, type = theType, nullable = nullable)
            }
        }

    override val returnType: TypeName by
        lazy(LazyThreadSafetyMode.NONE) {
//            println("${delegate.name} ${delegate.signature} ${annotations} ${delegate.allAnnotations.map { it.desc }}")
            when (delegate.signature) {
                null -> Type.getReturnType(delegate.desc).toTypeName()
                else ->
                    GenericSignatureParser()
                        .parseAsMethodSignature(delegate.signature)
                        .returnType
                        .toTypeName()
            }.copy(nullable = annotations.any { it.toString().lowercase().contains("nullable") })
        }
    override val isStatic: Boolean
        get() = delegate.accessFlags.isStatic()
    override val isFinal: Boolean
        get() = delegate.accessFlags.isFinal()
    override val isAbstract: Boolean
        get() = delegate.accessFlags.isAbstract()

    override val comment: String?
        get() = sourceMethod?.comment

    override fun toString(): String {
        return "AsmMethodAdapter(name=$name; desc=${delegate.desc})"
    }


    private val MethodNode.allAnnotations: List<AnnotationNode>
        get() = (visibleAnnotations ?: emptyList()) + (invisibleAnnotations ?: emptyList())
}


private fun ClassTypeSignature.toTypeName(): TypeName {
    val typeName = ClassName.fromAsmClassName(outerType.identifier.drop(1))
    if (outerType.typeArguments.isEmpty()) return typeName
    val params = outerType.typeArguments.map { it.toTypeName() }
    return typeName.parameterizedBy(params)
}

private fun TypeArgument.toTypeName(): TypeName = signature.toTypeName()



internal fun TypeSignature.toTypeName(): TypeName {
    return when (val sig = this) {
        is ClassTypeSignature -> sig.toTypeName()
        is ArrayTypeSignature -> sig.typeSig.toTypeName()
        is BaseTypeSignature ->
            when (sig.toString()) {
                "V" -> UNIT
                else -> error("Unsupported BaseTypeSignature: $this")
            }
        else -> error("Unsupported type $javaClass $this")
    }
}
