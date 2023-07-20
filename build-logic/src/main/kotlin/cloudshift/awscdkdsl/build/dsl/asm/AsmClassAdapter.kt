package cloudshift.awscdkdsl.build.dsl.asm

import cloudshift.awscdkdsl.build.dsl.model.CdkClass
import com.squareup.kotlinpoet.ClassName
import org.gradle.kotlin.dsl.provideDelegate
import org.objectweb.asm.Opcodes.ACC_BRIDGE
import org.objectweb.asm.Opcodes.ACC_SYNTHETIC
import org.objectweb.asm.Type
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode

internal class AsmClassAdapter(private val delegate: ClassNode) : CdkClass {
    override val className: ClassName by lazy(LazyThreadSafetyMode.NONE) { ClassName.fromAsmClassName(delegate.name) }

    private val annotations: List<ClassName> by lazy(LazyThreadSafetyMode.NONE) {
        delegate.allAnnotations.map { Type.getType(it.desc).toTypeName() }
    }
    override val deprecated: Boolean = annotations.any { it.toString().contains("Deprecated") }

    override val publicMemberFunctions: List<CdkClass.Method> by lazy(LazyThreadSafetyMode.NONE) {
        delegate.methods.filter {
            !it.isConstructor() &&
                it.accessFlags.isPublic() &&
                !it.accessFlags.isGenerated() &&
                !it.accessFlags.isStatic()
        }.map { AsmMethodAdapter(it) }
    }

    override val publicStaticFunctions: List<CdkClass.Method> by lazy(LazyThreadSafetyMode.NONE) {
        delegate.methods.filter {
            it.accessFlags.isPublic() &&
                !it.accessFlags.isGenerated() &&
                it.accessFlags.isStatic()
        }.map { AsmMethodAdapter(it) }
    }

    private val allConstructors: List<CdkClass.Method> by lazy(LazyThreadSafetyMode.NONE) {
        delegate.methods.filter {
            it.isConstructor() && !it.accessFlags.isGenerated()
        }.map { AsmMethodAdapter(it) }
    }

    private val interfaces: List<ClassName> by lazy(LazyThreadSafetyMode.NONE) {
        delegate.interfaces.map { ClassName.fromAsmClassName(it) }
    }

    override fun canInstantiate() = allConstructors.all { it.parameters.isEmpty() }

    override fun implementsInterface(name: ClassName) = name in interfaces

    override fun toString(): String {
        return "ClassNodeAdapter(className=$className)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AsmClassAdapter

        return className == other.className
    }

    override fun hashCode(): Int {
        return className.hashCode()
    }
}

private val ClassNode.allAnnotations: List<AnnotationNode>
    get() = (visibleAnnotations ?: emptyList()) + (invisibleAnnotations ?: emptyList())
