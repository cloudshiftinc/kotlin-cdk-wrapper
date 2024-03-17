package cloudshift.awscdkdsl.build.dsl.asm

import cloudshift.awscdkdsl.build.dsl.isOuterClass
import cloudshift.awscdkdsl.build.dsl.model.CdkClass
import cloudshift.awscdkdsl.build.dsl.model.source.CdkSourceClass
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName
import org.aspectj.util.GenericSignatureParser
import org.gradle.kotlin.dsl.provideDelegate
import org.objectweb.asm.Type
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode

internal class AsmStaticFieldAdapter(private val delegate: FieldNode) : CdkClass.StaticField {
    override val name: String
        get() = delegate.name
    override val type: TypeName
        get() = when (delegate.signature) {
            null -> Type.getType(delegate.desc).toTypeName()
            else ->
                GenericSignatureParser()
                    .parseAsFieldSignature(delegate.signature)
                    .toTypeName()
        }
}

internal class AsmClassAdapter(
    override val className: ClassName,
    private val delegate: ClassNode,
    private val sourceClass: CdkSourceClass?
) : CdkClass {
    override val comment: String? = sourceClass?.comment
    override val concreteClass: Boolean
        get() = !delegate.accessFlags.isAbstract()
    override val isAbstract: Boolean
        get() = delegate.accessFlags.isAbstract()
    override val isFinal: Boolean
        get() = delegate.accessFlags.isFinal()
    override val isInterface: Boolean
        get() = delegate.accessFlags.isInterface()
    override val isEnum: Boolean
        get() = delegate.accessFlags.isEnum()

    private val annotations: List<ClassName> by
    lazy(LazyThreadSafetyMode.NONE) {
        delegate.allAnnotations.map { Type.getType(it.desc).toTypeName() }
    }
    override val deprecated: Boolean = annotations.any { it.toString().contains("Deprecated") }

    override val enumFields: List<CdkClass.EnumField> by lazy {
        delegate.fields.filter {
            it.accessFlags.isPublic()
        }.map { AsmEnumFieldAdapter(it.name) }
    }
    override val isOuterClass: Boolean
        get() = className.isOuterClass()
    override val hasJsiiProxy: Boolean
        get() = delegate.innerClasses.any { it.name.endsWith("Jsii\$Proxy") }

    override val publicMemberFunctions: List<CdkClass.Method> by
    lazy(LazyThreadSafetyMode.NONE) {
        delegate.methods
            .filter {
                !it.isConstructor() &&
                    it.accessFlags.isPublic() &&
                    !it.accessFlags.isGenerated() &&
                    !it.accessFlags.isStatic()
            }
            .map {
                val method = sourceClass?.methodFor(it.name)
                AsmMethodAdapter(it, method)
            }
    }

    override val publicStaticFunctions: List<CdkClass.Method> by
    lazy(LazyThreadSafetyMode.NONE) {
        delegate.methods
            .filter {
                it.accessFlags.isPublic() &&
                    !it.accessFlags.isGenerated() &&
                    it.accessFlags.isStatic()
            }
            .map { AsmMethodAdapter(it) }
    }
    override val publicStaticFields: List<CdkClass.StaticField>
        get() = delegate.fields
            .filter {
                it.accessFlags.isPublic() &&
                    it.accessFlags.isStatic()
            }
            .map { AsmStaticFieldAdapter(it) }
    override val publicConstructors: List<CdkClass.Method>
        get() = allConstructors.filter { it.isPublic }

    private val allConstructors: List<CdkClass.Method> by
    lazy(LazyThreadSafetyMode.NONE) {
        delegate.methods
            .filter { it.isConstructor() && !it.accessFlags.isGenerated()  }
            .map { AsmMethodAdapter(it) }
    }

    override val interfaces: List<ClassName> by
    lazy(LazyThreadSafetyMode.NONE) {
        delegate.interfaces.map { ClassName.fromAsmClassName(it) }
    }

    override val superClass: ClassName by
    lazy(LazyThreadSafetyMode.NONE) {
        ClassName.fromAsmClassName(delegate.superName)
    }

    override fun canInstantiate() = allConstructors.all { it.parameters.isEmpty() }

    override fun implementsInterface(name: ClassName) = name in interfaces

    override fun toString(): String {
        return "AsmClassAdapter(className=$className)"
    }
}

private val ClassNode.allAnnotations: List<AnnotationNode>
    get() = (visibleAnnotations ?: emptyList()) + (invisibleAnnotations ?: emptyList())
