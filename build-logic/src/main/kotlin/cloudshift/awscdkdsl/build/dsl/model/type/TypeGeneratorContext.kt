package cloudshift.awscdkdsl.build.dsl.model.type

import cloudshift.awscdkdsl.build.dsl.isCdkClass
import cloudshift.awscdkdsl.build.dsl.isJssiClass
import cloudshift.awscdkdsl.build.dsl.model.CdkModel
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName
import com.squareup.kotlinpoet.TypeName

internal class TypeGeneratorContext(val model: CdkModel) {

    val referencedClasses = mutableSetOf<ClassName>()
    val generatedClasses = mutableSetOf<ClassName>()

    fun generatedClass(className: ClassName) {
        generatedClasses.addAll(normalizeType(className))
    }

    fun referencedTypes(types: List<TypeName>) {
        types.forEach { referencedType(it) }
    }

    fun referencedType(typeName: TypeName) {
        referencedClasses.addAll(normalizeType(typeName).filter { !it.isJssiClass && it.isCdkClass })
    }

    private fun normalizeType(typeName: TypeName): List<ClassName> {
        return when (typeName) {
            is ClassName -> {
                val x = typeName.copy(nullable = false) as ClassName
                listOf(ClassName(x.packageName, x.simpleNames.first()))
            }
            is ParameterizedTypeName -> {
                buildList {
                    addAll(normalizeType(typeName.rawType))
                    typeName.typeArguments.forEach { addAll(normalizeType(it)) }
                }
            }

            else -> TODO("Unhandled type: $typeName")
        }
    }
}
