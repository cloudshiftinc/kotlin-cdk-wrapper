package cloudshift.awscdkdsl.build.dsl.model.type

import cloudshift.awscdkdsl.build.dsl.isBuilderClass
import cloudshift.awscdkdsl.build.dsl.isCdkClass
import cloudshift.awscdkdsl.build.dsl.isJssiClass
import cloudshift.awscdkdsl.build.dsl.isOuterClass
import cloudshift.awscdkdsl.build.dsl.mapClassName
import cloudshift.awscdkdsl.build.dsl.mappedClassName
import cloudshift.awscdkdsl.build.dsl.model.CdkClass
import cloudshift.awscdkdsl.build.dsl.model.CdkModel
import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.UNIT
import org.gradle.api.logging.Logging

internal object WrapperTypeGenerator {

    private val logger = Logging.getLogger(WrapperTypeGenerator::class.java)

    fun generate(model: CdkModel): List<FileSpec> {

        val classesToGenerate =
            model.classes.filter { it.isOuterClass }.sortedBy { it.className }

        logger.lifecycle("Total classes: ${classesToGenerate.size}")

        val ctx = TypeGeneratorContext(model)
        val specs = classesToGenerate.map {
            generateWrapperTypeFile(it, ctx)
        }

        return specs + generateCdkObject() + CdkWrappersGenerator.generateCdkWrappersObject(model)
    }

    private fun generateWrapperTypeFile(
        cdkClass: CdkClass,
        ctx: TypeGeneratorContext
    ): FileSpec {
        val className = cdkClass.className.mappedClassName()
        val fileBuilder = FileSpec.builder(className)
        fileBuilder.addType(generateWrapperType(className, cdkClass, ctx))

        return fileBuilder.build()
    }

    private fun generateWrapperType(
        targetTypeName: ClassName,
        cdkClass: CdkClass,
        ctx: TypeGeneratorContext
    ): TypeSpec {

        return when {
            cdkClass.isEnum -> EnumTypeGenerator.generateEnum(
                cdkClass,
                CdkObjectName,
            )

            cdkClass.isInterface -> {
                val builder = TypeSpec.interfaceBuilder(targetTypeName)
                generateClassOrInterface(builder, cdkClass, ctx)
                builder.build()
            }

            else -> {
                val superClass = when {
                    cdkClass.superClass.isJssiClass || cdkClass.superClass == ANY -> {
                        CdkObject
                    }

                    else -> cdkClass.superClass
                }

                val classModifiers = when {
                    cdkClass.isAbstract -> listOf(KModifier.ABSTRACT)
                    !cdkClass.isFinal -> listOf(KModifier.OPEN)
                    else -> emptyList()
                }

                val builder = TypeSpec.classBuilder(targetTypeName)
                    .superclass(superClass.mappedClassName())
                    .wrappedClassConstructor(CdkObjectName, cdkClass.className)
                    .addModifiers(classModifiers)

                if (superClass != ANY) {
                    builder.addSuperclassConstructorParameter("%N", CdkObjectName)
                }
                generateClassOrInterface(builder, cdkClass, ctx)
                builder.build()
            }
        }
    }

    private fun generateMethods(
        methods: List<CdkClass.Method>,
        enclosingClass: CdkClass,
        ctx: TypeGeneratorContext,
        isStatic: Boolean = false,
        forceOverride: Boolean = false,
        isConstructor: Boolean = false,
    ): List<MethodGenerator.CdkMethod> {
        val generator = MethodGenerator(
            ctx.model,
            listOf(
                DelegateMethodFactory(
                    ctx,
                    CdkObjectName,
                    isStatic = isStatic,
                    forceOverride = forceOverride,
                    isConstructor = isConstructor,
                ),
            ),
        )
        return generator.generate(enclosingClass, methods)
    }

    private fun staticPublicFields(cdkClass: CdkClass): List<PropertySpec> {
        return cdkClass.publicStaticFields.map {
            val builder = PropertySpec.builder(it.name, it.type.mapClassName())
                .addModifiers(KModifier.PUBLIC)
            val type = it.type
            when {
                type is ParameterizedTypeName && type.typeArguments.first().isCdkClass -> {
                    builder.initializer(
                        "%T.%N.map(%T::wrap)",
                        cdkClass.className,
                        it.name,
                        type.typeArguments.first().mapClassName(),
                    )
                }

                type.isCdkClass -> {
                    builder.initializer(
                        "%T.wrap(%T.%N)",
                        it.type.mapClassName(),
                        cdkClass.className,
                        it.name,
                    )
                }

                else -> {
                    builder.initializer("%T.%N", cdkClass.className, it.name)
                }
            }
            builder.build()
        }
    }

    private fun generateClassOrInterface(
        typeBuilder: TypeSpec.Builder,
        cdkClass: CdkClass,
        ctx: TypeGeneratorContext
    ) {
        cdkClass.comment?.let { typeBuilder.addKdoc("%L", it) }
        val methods = generateMethods(
            cdkClass.publicMemberFunctions.filter { it.name != "toString" },
            cdkClass,
            ctx,
        )

        typeBuilder
            .addSuperinterfaces(
                cdkClass.interfaces.filter { !it.isJssiClass }
                    .map { it.mappedClassName() },
            )
            .addFunctions(methods.map { it.specFor(cdkClass) })

        additionalMethods[cdkClass.className]?.let {
            typeBuilder.addFunctions(it)
        }

        val companionBuilder = TypeSpec.companionObjectBuilder()
        val companionMethods = generateMethods(
            cdkClass.publicStaticFunctions.filter { it.name != "builder" },
            cdkClass,
            ctx,
            isStatic = true,
        ).map { it.specFor(cdkClass) }.map {
            val x = it.toBuilder()
            x.modifiers.remove(KModifier.OPEN)
            x.build()
        }
        companionBuilder.addFunctions(companionMethods)
        companionBuilder.addProperties(staticPublicFields(cdkClass))

        val cdkBuilder = ctx.model.builderFor(cdkClass.className)

        val usableConstructors =
            cdkClass.publicConstructors.filter { it.parameters.none { it.type.isJssiClass } }

        if (cdkClass.className.isOuterClass() && usableConstructors.isNotEmpty()) {
            val constructors = generateMethods(
                usableConstructors,
                cdkClass,
                ctx,
                isConstructor = true,
            ).map { it.specFor(cdkClass) }

            typeBuilder.addFunctions(constructors)
        }

        cdkBuilder?.let {
            val dslTypes = BuilderGenerator.generateBuilder(cdkBuilder, ctx)
            typeBuilder.addTypes(dslTypes)

            val builderImplClass =
                cdkClass.className.mappedClassName().nestedClass("BuilderImpl")
            val builderClass = cdkClass.className.mappedClassName().nestedClass("Builder")

            val parameters = cdkBuilder.builderFactoryFunction.parameters.map {
                ParameterSpec.builder(
                    it.name,
                    it.type.mapClassName(),
                ).build()
            } + ParameterSpec.builder(
                "block",
                LambdaTypeName.get(receiver = builderClass, returnType = UNIT),
            ).defaultValue("{}").build()

            val formatArgs = mutableListOf<Any>()
            val paramFormat = buildString {
                cdkBuilder.builderFactoryFunction.parameters.forEachIndexed { index, parameter ->
                    if (index > 0) append(", ")
                    if (parameter.type.isCdkClass) {
                        append("%T.unwrap(%N)")
                        formatArgs.add(parameter.type.mapClassName())
                        formatArgs.add(parameter.name)
                    } else {
                        append("%N")
                        formatArgs.add(parameter.name)
                    }
                }
            }

            val implClass = when {
                cdkClass.isInterface -> cdkClass.className.mappedClassName()
                    .nestedClass("Wrapper")

                else -> cdkClass.className.mappedClassName()
            }

            companionBuilder.addFunction(
                FunSpec.builder("invoke")
                    .addModifiers(KModifier.PUBLIC, KModifier.OPERATOR)
                    .returns(cdkClass.className.mappedClassName())
                    .addParameters(parameters)
                    .addStatement(
                        "val builderImpl = %T($paramFormat)",
                        builderImplClass,
                        *formatArgs.toTypedArray(),
                    )
                    .addStatement(
                        "return %T(builderImpl.apply(block).build())",
                        implClass,
                    )
                    .build(),
            )
        }

        if (cdkClass.isInterface || cdkClass.isAbstract) {
            typeBuilder.addType(generateInterfaceWrapper(cdkClass, ctx))
            val wrapperCallBuilder = FunSpec.builder("wrap")
                .addModifiers(KModifier.INTERNAL)
                .returns(cdkClass.className.mappedClassName())
                .addParameter(CdkObjectName, cdkClass.className)
                .addStatement(
                    "return %T.wrap(%N) as? %T ?: %T(%N)",
                    CdkWrappersGenerator.ClassName,
                    CdkObjectName,
                    cdkClass.className.mappedClassName(),
                    cdkClass.className.mappedClassName().nestedClass("Wrapper"),
                    CdkObjectName,
                )

            companionBuilder.addFunction(wrapperCallBuilder.build())
            companionBuilder.addFunction(
                FunSpec.builder("unwrap")
                    .addModifiers(KModifier.INTERNAL)
                    .returns(cdkClass.className)
                    .addParameter("wrapped", cdkClass.className.mappedClassName())
                    .addStatement(
                        "return (wrapped as %T).%N as %T",
                        CdkObject,
                        CdkObjectName,
                        cdkClass.className,
                    )
                    .build(),
            )
        } else {
            companionBuilder.addFunction(
                FunSpec.builder("wrap")
                    .addModifiers(KModifier.INTERNAL)
                    .returns(cdkClass.className.mappedClassName())
                    .addParameter(CdkObjectName, cdkClass.className)
                    .addStatement(
                        "return %T(%N)",
                        cdkClass.className.mappedClassName(),
                        CdkObjectName,
                    )
                    .build(),
            )
            companionBuilder.addFunction(
                FunSpec.builder("unwrap")
                    .addModifiers(KModifier.INTERNAL)
                    .returns(cdkClass.className)
                    .addParameter("wrapped", cdkClass.className.mappedClassName())
                    .addStatement("return wrapped.%N as %T", CdkObjectName, cdkClass.className)
                    .build(),
            )
        }


        typeBuilder.addType(companionBuilder.build())

        val innerClasses = ctx.model.innerClasses(cdkClass.className)
            .filter { it.isCdkClass && !it.isJssiClass && !it.isBuilderClass }
            .map { ctx.model.resolveClass(it) }
            .sortedBy { it.className }
            .map { innerClass ->
                generateWrapperType(innerClass.className, innerClass, ctx)
            }.toList()
        typeBuilder.addTypes(innerClasses)
    }

    private fun generateCdkObject(): FileSpec {
        val cdkObject = TypeSpec.classBuilder(CdkObject)
            .addModifiers(KModifier.PUBLIC, KModifier.ABSTRACT)
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter(CdkObjectName, ANY)
                    .build(),
            )
            .addProperty(
                PropertySpec.builder(CdkObjectName, ANY)
                    .addModifiers(KModifier.INTERNAL)
                    .initializer(CdkObjectName)
                    .build(),
            )
            .addInitializerBlock(
                CodeBlock.of(" %T.register(this)", CdkWrappersGenerator.ClassName,),
            )
            .build()

        return FileSpec.builder(CdkObject)
            .addType(cdkObject)
            .build()
    }

    private fun generateInterfaceWrapper(
        cdkClass: CdkClass,
        ctx: TypeGeneratorContext,
    ): TypeSpec {
        val wrapperClass = cdkClass.className.mappedClassName().nestedClass("Wrapper")
        val wrapperBuilder = TypeSpec.classBuilder(wrapperClass)
            .addModifiers(KModifier.PRIVATE)

        if (cdkClass.isInterface) {
            wrapperBuilder.addSuperinterface(cdkClass.className.mappedClassName())
            wrapperBuilder.superclass(CdkObject)
            wrapperBuilder.addSuperclassConstructorParameter("%N", CdkObjectName)
        } else {
            wrapperBuilder.superclass(cdkClass.className.mappedClassName())
            wrapperBuilder.addSuperclassConstructorParameter("%N", CdkObjectName)
        }

        wrapperBuilder.primaryConstructor(
            FunSpec.constructorBuilder().addParameter(CdkObjectName, cdkClass.className)
                .addModifiers().build(),
        )

        if (cdkClass.isInterface) {
            val interfaceMethods =
                (cdkClass.publicMemberFunctions + ctx.model.superInterfacesOf(cdkClass.className)
                    .flatMap { ctx.model.resolveClass(it).publicMemberFunctions })
                    .distinctBy { it.name + it.signature }

            val methods = generateMethods(
                interfaceMethods,
                cdkClass,
                ctx,
                forceOverride = true,
            )
            wrapperBuilder.addFunctions(
                methods.map {
                    val x = it.implementationMethod.toBuilder()
                    x.modifiers.remove(KModifier.PUBLIC)
                    x.build()
                },
            )
        }

        return wrapperBuilder.build()
    }

    private const val CdkObjectName = "cdkObject"
    private val CdkObject = ClassName("io.cloudshiftdev.awscdk.common", "CdkObject")
}

private fun TypeSpec.Builder.wrappedClassConstructor(
    delegatePropertyName: String,
    delegateClass: ClassName
): TypeSpec.Builder {
    primaryConstructor(
        FunSpec.constructorBuilder().addParameter(delegatePropertyName, delegateClass)
            .build(),
    )

//    addProperty(
//        PropertySpec.builder(
//            delegatePropertyName,
//            delegateClass,
//        )
//            .initializer(delegatePropertyName).build(),
//    )
    return this
}

private val additionalMethods = mapOf(
    ClassName(
        "software.amazon.awscdk.services.elasticloadbalancingv2",
        "ApplicationLoadBalancer",
    ) to listOf(
        FunSpec.builder("vpc")
            .addModifiers(KModifier.PUBLIC, KModifier.OVERRIDE)
            .returns(
                ClassName("software.amazon.awscdk.services.ec2", "IVpc").mappedClassName()
                    .copy(nullable = true),
            )
            .addStatement(
                "return %T.unwrap(this).vpc?.let(%T::wrap)",
                ClassName(
                    "software.amazon.awscdk.services.elasticloadbalancingv2",
                    "IApplicationLoadBalancer",
                ).mappedClassName(),
                ClassName("software.amazon.awscdk.services.ec2", "IVpc").mappedClassName(),
            )
            .build(),
    ),
    ClassName(
        "software.amazon.awscdk.services.elasticloadbalancingv2",
        "NetworkLoadBalancer",
    )
        to listOf(
        FunSpec.builder("vpc")
            .addModifiers(KModifier.PUBLIC, KModifier.OVERRIDE)
            .returns(
                ClassName("software.amazon.awscdk.services.ec2", "IVpc").mappedClassName()
                    .copy(nullable = true),
            )
            .addStatement(
                "return %T.unwrap(this).vpc?.let(%T::wrap)",
                ClassName(
                    "software.amazon.awscdk.services.elasticloadbalancingv2",
                    "INetworkLoadBalancer",
                ).mappedClassName(),
                ClassName("software.amazon.awscdk.services.ec2", "IVpc").mappedClassName(),
            )
            .build(),
    ),
)
