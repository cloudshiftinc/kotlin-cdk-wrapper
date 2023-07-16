package cloudshift.awscdkdsl.build.dsl

import com.google.common.reflect.ClassPath
import com.squareup.kotlinpoet.ClassName
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KParameter
import kotlin.reflect.KVisibility
import kotlin.reflect.full.allSupertypes
import kotlin.reflect.full.isSubclassOf
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.staticFunctions
import kotlin.reflect.full.valueParameters

internal data class CdkClass(
    val packageName: String,
    val name: String,
    val kClass: KClass<*>,
    val className: ClassName,
    val builder: Boolean
) {
    val qualifiedName: String = "${packageName}.$name"

    companion object {
        fun from(classInfo: ClassPath.ClassInfo, builderSuperClass: KClass<out Any>): CdkClass {
            val kClass = classInfo.load().kotlin

            val unqualifiedClassName =
                kClass.qualifiedName!!.removePrefix(classInfo.packageName).substring(1)
            val simpleNames = unqualifiedClassName.split('.')
            val className = ClassName(classInfo.packageName, simpleNames)

            return CdkClass(
                classInfo.packageName,
                unqualifiedClassName,
                kClass,
                className,
                kClass.isSubclassOf(builderSuperClass)
            )
        }
    }

    fun dslClassName(): ClassName {
        val newName = "${className.simpleNames.filterNot { it == "Builder" }.joinToString("")}Dsl"

        return ClassName(packageName.replace(CdkDsl.cdkPackageName, CdkDsl.packageName), newName)
    }

    // a simple builder implements software.amazon.jsii.Builder and has a no-arg constructor
    fun simpleBuilder(): Boolean {
        return builder && kClass.constructors.any { ctr -> ctr.valueParameters.isEmpty() }
    }

    fun builderType(): KClass<*> {
        check(builder) { "Not a builder $this" }
        return kClass.memberFunctions
            .filter { fn ->
                fn.visibility == KVisibility.PUBLIC &&
                    fn.name == "build" && fn.valueParameters.isEmpty()
            }
            .map { fn -> fn.returnType }.first().classifier as KClass<*>
    }

    // find member functions that have buildable types as their last parameter
    fun functionsWithBuildableLastArgument(registry: CdkClassRegistry): List<KFunction<*>> {
        if (kClass.isAbstract) {
            return emptyList()
        }
        return kClass.memberFunctions.filter { fn ->
            fn.visibility == KVisibility.PUBLIC &&
                fn.valueParameters.isNotEmpty() &&
                registry.isBuildable(fn.valueParameters.last().type)
        }
    }
}

