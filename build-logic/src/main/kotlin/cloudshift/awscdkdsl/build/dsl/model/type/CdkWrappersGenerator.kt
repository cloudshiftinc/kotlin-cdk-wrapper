package cloudshift.awscdkdsl.build.dsl.model.type

import cloudshift.awscdkdsl.build.dsl.isBuilderClass
import cloudshift.awscdkdsl.build.dsl.isCdkClass
import cloudshift.awscdkdsl.build.dsl.mappedClassName
import cloudshift.awscdkdsl.build.dsl.model.CdkModel
import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.MAP
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeSpec
import kotlin.reflect.KClass

internal object CdkWrappersGenerator {
    internal fun generateCdkWrappersObject(model: CdkModel): FileSpec {
        val builder = TypeSpec.objectBuilder(ClassName)
            .addModifiers(KModifier.INTERNAL)

        val resolveWrapperFunction = FunSpec.builder("resolveWrapperFunction")
            .addParameter("klass", KClass::class)
            .returns(KClass::class)
            .addStatement(
                "val qualifiedName = klass::class.qualifiedName ?: error(%P)",
                "No qualified name for \${klass::class}",
            )
            .addStatement("return typeMap[qualifiedName] ?: klass.superclasses.filterNot { it.java.isInterface || it.isAbstract || it == Any::class }.firstOrNull()?.let { resolveWrapperFunction(it) }")
            .build()

        val wrapFunction = FunSpec.builder("wrap")
            .addModifiers(KModifier.INTERNAL)
            .addParameter("cdkObject", ANY)
            .returns(ANY)
            .addCode("%L", resolveWrapperFunction)
            .addStatement(
                "return resolveWrapperFunction(cdkObject::class)?.invoke(cdkObject) ?: error(%P)",
                "No wrapper found for type \${cdkObject::class}",
            )

        builder.addFunction(wrapFunction.build())

        val mapBuilder = CodeBlock.builder()
            .addStatement("mapOf(")
        model.classes.filter {
            it.className.isCdkClass && !(it.isEnum || it.isInterface || it.isAbstract || it.className.isBuilderClass)
        }.map {
            mapBuilder.addStatement(
                "\"%L\" to { %T.wrap(it as %T) },",
                it.className,
                it.className.mappedClassName(),
                it.className,
            )
        }
        mapBuilder.addStatement(")")

        val lambdaTypeName = LambdaTypeName.get(
            receiver = ANY,
            returnType = ANY,
        )
        val typeMap = PropertySpec.builder("typeMap", MAP.parameterizedBy(STRING, lambdaTypeName))
            .addModifiers(KModifier.PRIVATE)
            .initializer(mapBuilder.build())
            .build()

        builder.addProperty(typeMap)

        return FileSpec.builder(ClassName)
            .addType(builder.build())
            .build()
    }

    val ClassName = ClassName("io.cloudshiftdev.awscdk.common", "CdkObjectWrappers")
}
