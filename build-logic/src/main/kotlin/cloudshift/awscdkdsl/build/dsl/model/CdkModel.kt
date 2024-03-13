package cloudshift.awscdkdsl.build.dsl.model

import cloudshift.awscdkdsl.build.dsl.isJssiClass
import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName

internal data class CdkModel(
    val classes: List<CdkClass>,
    val builders: List<CdkBuilder>,
    private val buildablesToBuilders: Map<ClassName, CdkClass>
) {
    private val classMap: Map<ClassName, CdkClass> = classes.associateBy { it.className }
    private val innerClassMap = classes.asSequence().filter { it.className.simpleNames.size > 1 }
        .groupBy { it.className.enclosingClassName() }.mapValues { it.value.map { it.className } }

    private val builderMap = builders.associateBy { it.buildableClass.className }

    fun resolveClass(className: ClassName) =
        classMap[className] ?: error("Unable to find class $className")

    fun builderClassFor(type: TypeName) = buildablesToBuilders[type]

    fun builderFor(type: TypeName) = builderMap[type]

    fun superTypesOf(className: ClassName): List<ClassName> {
        val list = mutableSetOf<ClassName>()
        superTypesOf(className, list)
        return list.filter { it !in excludedClasses }.toList()
    }

    private fun superTypesOf(className: ClassName, acc: MutableSet<ClassName>) {
        if (className.toString() == "kotlin.Any") return
        val cdkClass = classMap[className] ?: return

        acc.add(cdkClass.superClass)
        acc.addAll(cdkClass.interfaces)

        superTypesOf(cdkClass.superClass, acc)
        cdkClass.interfaces.forEach { superTypesOf(it, acc) }
    }

    fun superInterfacesOf(className: ClassName): List<ClassName> {
        val list = mutableSetOf<ClassName>()
        superInterfacesOf(className, list)
        return list.filter { it !in excludedClasses }.toList()
    }

    private fun superInterfacesOf(className: ClassName, acc: MutableSet<ClassName>) {
        if (className == ANY) return
        val cdkClass = classMap[className] ?: return
        acc.addAll(cdkClass.interfaces)
        cdkClass.interfaces.forEach { superInterfacesOf(it, acc) }
    }

    fun isOverrideMethod(enclosingClass: ClassName, method: CdkClass.Method): Boolean {
        if (method.name == "toString") return true
        val superTypes =superTypesOf(enclosingClass)

        return superTypes.filter { !it.isJssiClass }.any { superType ->
            val superTypeClass = resolveClass(superType)
            superTypeClass.publicMemberFunctions.any {
                it.name == method.name && it.signature == method.signature
            }
        }
    }

    fun innerClasses(className: ClassName): List<ClassName> = innerClassMap[className] ?: emptyList()

    private val excludedClasses = setOf(
        "kotlin.Any",
        "kotlin.Enum",
        "software.amazon.jsii.JsiiObject",
        "software.amazon.jsii.JsiiSerializable",
    ).map { ClassName.bestGuess(it) }
}


