package cloudshift.awscdkdsl.build.dsl.asm

import com.github.benmanes.caffeine.cache.Caffeine
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.UNIT
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap
import kotlin.reflect.jvm.internal.impl.name.FqName
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Opcodes.ACC_PUBLIC
import org.objectweb.asm.Type
import org.objectweb.asm.tree.MethodNode

internal object Asm {
    const val ConstructorMethodName = "<init>"
}

internal fun MethodNode.isConstructor() = name == Asm.ConstructorMethodName

internal val MethodNode.accessFlags: AccessFlags
    get() = AccessFlags(access)

@JvmInline
internal value class AccessFlags(private val value: Int) {
    fun isPublic() = flagSet(ACC_PUBLIC)

    fun isSynthetic() = flagSet(Opcodes.ACC_SYNTHETIC)

    fun isBridge() = flagSet(Opcodes.ACC_BRIDGE)

    fun isStatic() = flagSet(Opcodes.ACC_STATIC)

    fun isGenerated() = isSynthetic() || isBridge()

    private fun flagSet(flag: Int): Boolean = (value and flag) != 0
}

internal fun Type.toTypeName(): ClassName {
    return ClassName.fromAsmClassName(internalName)
}

internal fun ClassName.Companion.fromAsmClassName(name: String): ClassName {
    return classNameCache.get(name) {
        when (name) {
            "V" -> UNIT
            else -> {
                val fqClassName = normalizeBinaryClassName(name)
                val fqName = FqName(fqClassName.toString())
                when (val classId = JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(fqName)) {
                    null -> normalizeBinaryClassName(name)
                    else -> normalizeBinaryClassName(classId.asString())
                }
            }
        }
    }
}

private val classNameCache = Caffeine.newBuilder().build<String, ClassName>()

private fun normalizeBinaryClassName(binaryClassName: String): ClassName {
    val className = binaryClassName.substringAfterLast("/")
    val packageName = binaryClassName.removeSuffix(className).dropLast(1).removePrefix("[L")
    check(!packageName.startsWith("[") && !packageName.startsWith("L")) {
        "Unable to normalize classname: $binaryClassName (package: $packageName; class: $className"
    }
    return ClassName(packageName.replace('/', '.'), className.removeSuffix(";").split("$"))
}
