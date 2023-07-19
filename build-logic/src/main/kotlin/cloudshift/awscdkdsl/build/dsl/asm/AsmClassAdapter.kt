package cloudshift.awscdkdsl.build.dsl.asm

import cloudshift.awscdkdsl.build.dsl.model.CdkClass2
import com.squareup.kotlinpoet.ClassName
import org.gradle.kotlin.dsl.provideDelegate
import org.objectweb.asm.Opcodes.ACC_BRIDGE
import org.objectweb.asm.Opcodes.ACC_PUBLIC
import org.objectweb.asm.Opcodes.ACC_STATIC
import org.objectweb.asm.Opcodes.ACC_SYNTHETIC
import org.objectweb.asm.tree.ClassNode

internal class AsmClassAdapter(private val delegate: ClassNode) : CdkClass2 {
    override val className: ClassName by lazy(LazyThreadSafetyMode.NONE) { ClassName.fromAsmClassName(delegate.name) }

    override val publicMemberFunctions: List<CdkClass2.Method> by lazy(LazyThreadSafetyMode.NONE) {
        delegate.methods.filter {
            it.name != "<init>" &&
                it.access and ACC_PUBLIC != 0 &&
                it.access and ACC_SYNTHETIC == 0 &&
                it.access and ACC_BRIDGE == 0 &&
                it.access and ACC_STATIC == 0
        }.map { AsmMethodAdapter(it) }
    }

    override val publicStaticFunctions: List<CdkClass2.Method> by lazy(LazyThreadSafetyMode.NONE) {
        delegate.methods.filter {
            it.access and ACC_PUBLIC != 0 &&
                it.access and ACC_SYNTHETIC == 0 &&
                it.access and ACC_BRIDGE == 0 &&
                it.access and ACC_STATIC != 0
        }.map { AsmMethodAdapter(it) }
    }

    private val allConstructors: List<CdkClass2.Method> by lazy(LazyThreadSafetyMode.NONE) {
        delegate.methods.filter {
            it.name == "<init>" &&
                it.access and ACC_SYNTHETIC == 0 &&
                it.access and ACC_BRIDGE == 0
        }.map { AsmMethodAdapter(it) }
    }

    private val interfaces: List<ClassName> by lazy(LazyThreadSafetyMode.NONE) {
        delegate.interfaces.map { ClassName.fromAsmClassName(it) }
    }

    override fun canInstantiate()= allConstructors.all { it.parameters.isEmpty() }

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
