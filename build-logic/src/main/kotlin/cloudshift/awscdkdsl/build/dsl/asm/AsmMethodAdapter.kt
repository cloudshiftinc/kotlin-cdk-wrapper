package cloudshift.awscdkdsl.build.dsl.asm

import cloudshift.awscdkdsl.build.dsl.model.CdkClass2
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName
import org.aspectj.util.GenericSignature.ClassTypeSignature
import org.aspectj.util.GenericSignature.TypeArgument
import org.aspectj.util.GenericSignatureParser
import org.objectweb.asm.Type
import org.objectweb.asm.tree.MethodNode

internal class AsmMethodAdapter(private val delegate: MethodNode) : CdkClass2.Method {
    override val name: String = delegate.name
    override val signature: String = delegate.signature ?: delegate.desc
    override val parameters: List<CdkClass2.Method.Parameter> by lazy(LazyThreadSafetyMode.NONE) {

        // handle generics from the method signature
        var genericParams: List<TypeName> = emptyList()

        if (delegate.signature != null) {
            genericParams = GenericSignatureParser().parseAsMethodSignature(delegate.signature)
                .parameters.filterIsInstance<ClassTypeSignature>().map { it.toTypeName() }
        }
        val argumentTypes = Type.getMethodType(delegate.desc).argumentTypes
        argumentTypes.mapIndexed { index: Int, type: Type ->
            val parameterName = when {
                delegate.parameters != null -> delegate.parameters[index].name
                delegate.localVariables != null -> delegate.localVariables[index].name
                else -> "arg${index}"
            }
            var theType: TypeName = type.toTypeName()
            if (genericParams.isNotEmpty()) {
                theType = genericParams[index]
            }

            // TODO - there don't appear to be any builder methods that use nullability annotations
            // if we find a use for these annotations we have them...
//            val annotations = (delegate.visibleParameterAnnotations?.get(index) ?: emptyList())+
//                (delegate.invisibleParameterAnnotations?.get(index) ?: emptyList())

            AsmParameterAdapter(
                _parameterName = parameterName,
                _type = theType,
            )
        }
    }
    override val returnType: TypeName by lazy(LazyThreadSafetyMode.NONE) {
        Type.getReturnType(delegate.desc).toTypeName()
    }

    override fun toString(): String {
        return "MethodNodeAdapter(name=${name}; desc=${delegate.desc})"
    }

    private fun ClassTypeSignature.toTypeName(): TypeName {
        val typeName = ClassName.fromAsmClassName(outerType.identifier.drop(1))
        val params = outerType.typeArguments.map { it.toTypeName() }
        return typeName.parameterizedBy(params)
    }

    private fun TypeArgument.toTypeName(): TypeName {
        return when (val sig = signature) {
            is ClassTypeSignature -> {
                when {
                    sig.outerType.typeArguments.isEmpty() -> ClassName.fromAsmClassName(
                        sig.outerType.identifier.drop(1).removeSuffix(";"),
                    )

                    else -> sig.toTypeName()
                }
            }

            else -> error("Unsupported type ${signature.javaClass}")
        }
    }
}

