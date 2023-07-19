package cloudshift.awscdkdsl.build.dsl.asm

import com.github.benmanes.caffeine.cache.Caffeine
import com.squareup.kotlinpoet.ClassName
import org.objectweb.asm.Type
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap

internal fun Type.toTypeName(): ClassName {
    return ClassName.fromAsmClassName(internalName)
}

internal fun ClassName.Companion.fromAsmClassName(name: String): ClassName {
    return classNameCache.get(name) {
        val fqClassName = normalizeBinaryClassName(name)

        val fqName = kotlin.reflect.jvm.internal.impl.name.FqName(fqClassName.toString())
        when (val classId = JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(fqName)) {
            null -> normalizeBinaryClassName(name)
            else -> normalizeBinaryClassName(classId.asString())
        }
    }
}

private val classNameCache = Caffeine.newBuilder().build<String, ClassName>()

private fun normalizeBinaryClassName(binaryClassName: String): ClassName {
    val className = binaryClassName.substringAfterLast("/")
    val packageName = binaryClassName.removeSuffix(className).dropLast(1)
    return ClassName(packageName.replace('/', '.'), className.split("$"))
}
