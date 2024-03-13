package cloudshift.awscdkdsl.build.dsl

import cloudshift.awscdkdsl.build.dsl.model.CdkClass
import cloudshift.awscdkdsl.build.dsl.model.CdkModel
import cloudshift.awscdkdsl.build.dsl.model.type.BuilderGenerator
import cloudshift.awscdkdsl.build.dsl.model.type.DelegateMethodFactory
import cloudshift.awscdkdsl.build.dsl.model.type.EnumTypeGenerator
import cloudshift.awscdkdsl.build.dsl.model.type.MethodGenerator
import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.UNIT
import org.gradle.api.logging.Logging

internal object WrapperTypeGenerator {

    private val logger = Logging.getLogger(WrapperTypeGenerator::class.java)

    fun generate(model: CdkModel): List<FileSpec> {
        val constructs =
            model.classes.filter { it.concreteClass && IConstruct in model.superTypesOf(it.className) }
                .filter { it.className.packageName.startsWith("software.amazon.awscdk.services.elasticloadbalancingv2") }

        logger.lifecycle("Generating ${constructs.size} construct classes")

        val ctx = TypeGeneratorContext(model)
        val constructSpecs = constructs.map {
            generateWrapperTypeFile(it, ctx)
        }

        val specs = mutableListOf<FileSpec>()
        specs.addAll(constructSpecs)
        var pass = 1
        var remaining = ctx.referencedClasses.filter { it !in ctx.generatedClasses }

        while (remaining.isNotEmpty()) {
            logger.lifecycle("Pass $pass; generating ${remaining.size} classes")
            specs.addAll(
                remaining.map { model.resolveClass(it) }
                    .map { generateWrapperTypeFile(it, ctx) },
            )
            remaining = ctx.referencedClasses.filter { it !in ctx.generatedClasses }
            pass++
        }

        return specs
    }

    private fun generateWrapperTypeFile(cdkClass: CdkClass, ctx: TypeGeneratorContext): FileSpec {
        val className = cdkClass.className.mappedClassName()
        val fileBuilder = FileSpec.builder(className)
        ctx.generatedClass(cdkClass.className)
        fileBuilder.addType(generateWrapperType(className, cdkClass, ctx))

        return fileBuilder.build()
    }

    private fun generateWrapperType(
        targetTypeName: ClassName,
        cdkClass: CdkClass,
        ctx: TypeGeneratorContext
    ): TypeSpec {
        ctx.referencedType(cdkClass.superClass)
        ctx.referencedTypes(cdkClass.interfaces)

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
                    cdkClass.superClass.isJssiClass -> ANY
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
    ): List<MethodGenerator.CdkMethod> {
        val generator = MethodGenerator(ctx.model,
            listOf(
                DelegateMethodFactory(
                    ctx,
                    CdkObjectName,
                    isStatic = isStatic,
                    forceOverride = forceOverride,
                ),
            ),
        )
        return generator.generate(enclosingClass, methods)
    }

    private fun generateClassOrInterface(
        typeBuilder: TypeSpec.Builder,
        cdkClass: CdkClass,
        ctx: TypeGeneratorContext
    ) {
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

        val companionBuilder = TypeSpec.companionObjectBuilder()
        val companionMethods = generateMethods(
            cdkClass.publicStaticFunctions.filter { it.name != "builder" },
            cdkClass,
            ctx,
            isStatic = true,
        ).map { it.specFor(cdkClass) }
        when {
            companionMethods.isNotEmpty() -> companionBuilder.addFunctions(companionMethods)
            else -> companionBuilder.addInitializerBlock(
                CodeBlock.builder().addStatement("").build(),
            )
        }

        val cdkBuilder = ctx.model.builderFor(cdkClass.className)

        cdkBuilder?.let {
            val dslTypes = BuilderGenerator.generateBuilder(cdkBuilder, ctx)
            typeBuilder.addTypes(dslTypes)

            val builderImplClass = cdkClass.className.mappedClassName().nestedClass("BuilderImpl")
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

            ctx.referencedTypes(cdkBuilder.builderFactoryFunction.parameters.map { it.type })

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
                cdkClass.isInterface -> cdkClass.className.mappedClassName().nestedClass("Wrapper")
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
            val wrapperClass = cdkClass.className.mappedClassName().nestedClass("Wrapper")
            val wrapper = generateInterfaceWrapper(wrapperClass, cdkClass, ctx)
            typeBuilder.addType(wrapper)
            companionBuilder.addFunction(
                FunSpec.builder("wrap")
                    .addModifiers(KModifier.INTERNAL)
                    .returns(cdkClass.className.mappedClassName())
                    .addParameter(CdkObjectName, cdkClass.className)
                    .addStatement("return %T(%N)", wrapperClass, CdkObjectName)
                    .build(),
            )
            companionBuilder.addFunction(
                FunSpec.builder("unwrap")
                    .addModifiers(KModifier.INTERNAL)
                    .returns(cdkClass.className)
                    .addParameter("wrapped", cdkClass.className.mappedClassName())
                    .addStatement("return (wrapped as %T).%N", wrapperClass, CdkObjectName)
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
                    .addStatement("return wrapped.%N", CdkObjectName)
                    .build(),
            )
        }


        typeBuilder.addType(companionBuilder.build())

        val innerClasses = ctx.model.innerClasses(cdkClass.className)
            .filter { it.isCdkClass && !it.isJssiClass && !it.isBuilderClass }
            .map { ctx.model.resolveClass(it) }
            .map { innerClass ->
                generateWrapperType(innerClass.className, innerClass, ctx)
            }.toList()
        typeBuilder.addTypes(innerClasses)
    }

    private fun generateInterfaceWrapper(
        wrapperClass: ClassName,
        cdkClass: CdkClass,
        ctx: TypeGeneratorContext,
    ): TypeSpec {

        val wrapperBuilder = TypeSpec.classBuilder(wrapperClass)
            .addModifiers(KModifier.PRIVATE)

        if (cdkClass.isInterface) {
            wrapperBuilder.addSuperinterface(cdkClass.className.mappedClassName())
        } else {
            wrapperBuilder.superclass(cdkClass.className.mappedClassName())
            wrapperBuilder.addSuperclassConstructorParameter("%N", CdkObjectName)
        }

        wrapperBuilder.primaryConstructor(
            FunSpec.constructorBuilder().addParameter(CdkObjectName, cdkClass.className)
                .addModifiers(KModifier.INTERNAL).build(),
        )

        wrapperBuilder.addProperty(
            PropertySpec.builder(CdkObjectName, cdkClass.className)
                .addModifiers(KModifier.INTERNAL)
                .initializer(CdkObjectName).build(),
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
            wrapperBuilder.addFunctions(methods.map { it.implementationMethod })
        }

        return wrapperBuilder.build()
    }

    private const val CdkObjectName = "cdkObject"
    private val IConstruct = ClassName("software.constructs", "IConstruct")
}

private fun TypeSpec.Builder.wrappedClassConstructor(
    delegatePropertyName: String,
    delegateClass: ClassName
): TypeSpec.Builder {
    primaryConstructor(
        FunSpec.constructorBuilder().addParameter(delegatePropertyName, delegateClass)
            .addModifiers(KModifier.INTERNAL).build(),
    )

    addProperty(
        PropertySpec.builder(delegatePropertyName, delegateClass, KModifier.PRIVATE)
            .initializer(delegatePropertyName).build(),
    )
    return this
}
