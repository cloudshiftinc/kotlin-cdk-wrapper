package cloudshift.awscdkdsl.build.dsl.model.type

import cloudshift.awscdkdsl.build.dsl.model.CdkModel
import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.STAR
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asTypeName
import kotlin.reflect.KClass
import kotlin.reflect.KFunction

internal object CdkWrappersGenerator {
    internal fun generateCdkWrappersObject(model: CdkModel): FileSpec {
        val builder = TypeSpec.objectBuilder(ClassName)
            .addModifiers(KModifier.INTERNAL)

        val wrapFunction = FunSpec.builder("wrap")
            .addModifiers(KModifier.INTERNAL)
            .addParameter("cdkObject", ANY)
            .returns(ANY.copy(nullable = true))
            .addStatement("val kTwin = resolveKTwin(cdkObject::class)")
            .addStatement("return kTwin?.let{resolveWrapperFunction(kTwin)}?.call(kTwin.%M, cdkObject)",
                MemberName("kotlin.reflect.full", "companionObjectInstance"),
            )
            .build()

        builder.addFunction(wrapFunction)

        val resolveWrapperFunction = FunSpec.builder("resolveWrapperFunction")
            .addModifiers(KModifier.PRIVATE)
            .addParameter("klass", KClass::class.asTypeName().parameterizedBy(STAR))
            .returns(KFunction::class.asTypeName().parameterizedBy(STAR).copy(nullable = true))

            .addStatement(
                "return klass.%M?.%M?.firstOrNull {\nit.name == %S && it.parameters.size == 2 }",
                MemberName("kotlin.reflect.full", "companionObject"),
                MemberName("kotlin.reflect.full", "memberFunctions"),
                "wrap",
            )
            .build()
        builder.addFunction(resolveWrapperFunction)

        val resolveKTwinFunction = FunSpec.builder("resolveKTwin")
            .addModifiers(KModifier.PRIVATE)
            .addParameter("klass", KClass::class.asTypeName().parameterizedBy(STAR))
            .returns(KClass::class.asTypeName().parameterizedBy(STAR).copy(nullable = true))
            .addStatement("if (klass.isAbstract || klass.java.isInterface || klass == Any::class) return null")
            .addStatement(
                """
               return klass.qualifiedName?.replace("software.amazon.awscdk", "io.cloudshiftdev.awscdk")
            ?.replace("software.constructs", "io.cloudshiftdev.constructs")
            ?.let { try{Class.forName(it).kotlin}catch(e:ClassNotFoundException){null} }
                """.trimIndent(),
            )
            .build()
        builder.addFunction(resolveKTwinFunction)

        return FileSpec.builder(ClassName)
            .addType(builder.build())
            .build()
    }

    val ClassName = ClassName("io.cloudshiftdev.awscdk.common", "CdkObjectWrappers")
}
