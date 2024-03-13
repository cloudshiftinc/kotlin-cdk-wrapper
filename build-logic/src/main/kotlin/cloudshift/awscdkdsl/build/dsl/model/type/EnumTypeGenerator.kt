package cloudshift.awscdkdsl.build.dsl.model.type

import cloudshift.awscdkdsl.build.dsl.mapClassName
import cloudshift.awscdkdsl.build.dsl.mappedClassName
import cloudshift.awscdkdsl.build.dsl.model.CdkClass
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec

// TODO: add comments
// TODO: review upper / mixed casing (check what TS CDK does, follow that)
internal object EnumTypeGenerator {

    fun generateEnum(
        cdkClass: CdkClass,
        cdkObjectName: String
    ): TypeSpec {
        val enumBuilder = TypeSpec.enumBuilder(cdkClass.className.mappedClassName()).primaryConstructor(
            FunSpec.constructorBuilder()
                .addParameter(cdkObjectName, cdkClass.className)
                .build(),
        )
            .addProperty(
                PropertySpec.builder(cdkObjectName, cdkClass.className, KModifier.PRIVATE)
                    .initializer(cdkObjectName).build(),
            )

        cdkClass.enumFields.forEach { field ->
            enumBuilder.addEnumConstant(
                field.name,
                TypeSpec.anonymousClassBuilder()
                    .addSuperclassConstructorParameter("%T.%N", cdkClass.className, field.name)
                    .build(),
            )
        }

        val companionBuilder = TypeSpec.companionObjectBuilder()
        val wrapperBuilder = FunSpec.builder("wrap")
            .addModifiers(KModifier.INTERNAL)
            .returns(cdkClass.className.mappedClassName())
            .addParameter(cdkObjectName, cdkClass.className)
            .beginControlFlow("return when (%N)", cdkObjectName)

        cdkClass.enumFields.forEach { field ->
            wrapperBuilder.addStatement("%T.%N -> %T.%N", cdkClass.className, field.name, cdkClass.className.mappedClassName(), field.name)
        }
        wrapperBuilder.endControlFlow()

        companionBuilder.addFunction(wrapperBuilder.build())

        val unwrapBuilder = FunSpec.builder("unwrap")
            .addModifiers(KModifier.INTERNAL)
            .returns(cdkClass.className)
            .addParameter("wrapped",cdkClass.className.mappedClassName().mapClassName())
            .addStatement("return wrapped.%N", cdkObjectName)

        companionBuilder.addFunction(unwrapBuilder.build())

        enumBuilder.addType(companionBuilder.build())
        return enumBuilder.build()
    }
}
