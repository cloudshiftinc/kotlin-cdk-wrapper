package cloudshift.awscdkdsl.build.dsl.model.type

import cloudshift.awscdkdsl.build.dsl.model.CdkModel
import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.STAR
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asTypeName
import java.util.*
import kotlin.reflect.KClass
import kotlin.reflect.KFunction

internal object CdkWrappersGenerator {
    private val CdkObject = ClassName("io.cloudshiftdev.awscdk.common", "CdkObject")
    internal fun generateCdkWrappersObject(model: CdkModel): FileSpec {
        val builder = TypeSpec.objectBuilder(ClassName)
            .addModifiers(KModifier.INTERNAL)

        PropertySpec.builder("instanceMap", IdentityHashMap::class.asTypeName().parameterizedBy(ANY, CdkObject)
        )
            .initializer("%T()", IdentityHashMap::class)
            .addModifiers(KModifier.PRIVATE)
            .build()
            .let { builder.addProperty(it) }

        FunSpec.builder("register")
            .addModifiers(KModifier.INTERNAL)
            .addParameter("cdkObject", CdkObject)
            .addStatement("requireNotNull(cdkObject.cdkObject) { %S }", "cdkObject cannot be null")
            .addStatement("instanceMap[cdkObject.cdkObject] = cdkObject")
            .build()
            .let { builder.addFunction(it) }

        FunSpec.builder("wrap")
            .addModifiers(KModifier.INTERNAL)
            .addParameter("cdkObject", ANY)
            .returns(ANY.copy(nullable = true))
            .addStatement("return instanceMap[cdkObject] ?: resolveKTwin(cdkObject::class)?.let{resolveWrapperFunction(it)?.call(it.%M, cdkObject)}",
                MemberName("kotlin.reflect.full", "companionObjectInstance"),
            )
            .build().let { builder.addFunction(it) }

        FunSpec.builder("unwrap")
            .addModifiers(KModifier.INTERNAL)
            .addParameter("anyObject", ANY)
            .returns(ANY)
            .addStatement("return (anyObject as? %T)?.cdkObject ?: anyObject", CdkObject)
            .build().let { builder.addFunction(it) }

        FunSpec.builder("resolveWrapperFunction")
            .addModifiers(KModifier.PRIVATE)
            .addParameter("klass", KClass::class.asTypeName().parameterizedBy(STAR))
            .returns(KFunction::class.asTypeName().parameterizedBy(STAR).copy(nullable = true))

            .addStatement(
                "return klass.%M?.%M?.firstOrNull {\nit.name == %S && it.parameters.size == 2 }",
                MemberName("kotlin.reflect.full", "companionObject"),
                MemberName("kotlin.reflect.full", "memberFunctions"),
                "wrap",
            )
            .build().let { builder.addFunction(it) }


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
