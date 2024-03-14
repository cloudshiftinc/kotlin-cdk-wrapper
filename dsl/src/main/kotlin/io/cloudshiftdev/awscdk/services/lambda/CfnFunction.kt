package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFunction internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.CfnFunction,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun architectures(): List<String> = unwrap(this).getArchitectures() ?: emptyList()

  public open fun architectures(`value`: List<String>) {
    unwrap(this).setArchitectures(`value`)
  }

  public open fun architectures(vararg `value`: String): Unit = architectures(`value`.toList())

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrSnapStartResponse(): IResolvable =
      unwrap(this).getAttrSnapStartResponse().let(IResolvable::wrap)

  public open fun attrSnapStartResponseApplyOn(): String =
      unwrap(this).getAttrSnapStartResponseApplyOn()

  public open fun attrSnapStartResponseOptimizationStatus(): String =
      unwrap(this).getAttrSnapStartResponseOptimizationStatus()

  public open fun code(): Any = unwrap(this).getCode()

  public open fun code(`value`: IResolvable) {
    unwrap(this).setCode(`value`.let(IResolvable::unwrap))
  }

  public open fun code(`value`: CodeProperty) {
    unwrap(this).setCode(`value`.let(CodeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("27bc03c11962a84638837c61ff105a539b3caa5340528b2ffd9166edaf307caf")
  public open fun code(`value`: CodeProperty.Builder.() -> Unit): Unit = code(CodeProperty(`value`))

  public open fun codeSigningConfigArn(): String? = unwrap(this).getCodeSigningConfigArn()

  public open fun codeSigningConfigArn(`value`: String) {
    unwrap(this).setCodeSigningConfigArn(`value`)
  }

  public open fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

  public open fun deadLetterConfig(`value`: IResolvable) {
    unwrap(this).setDeadLetterConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun deadLetterConfig(`value`: DeadLetterConfigProperty) {
    unwrap(this).setDeadLetterConfig(`value`.let(DeadLetterConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("82210f417735f1b21f06f2b9874c4d9202ac1920b45ba30cccd2d22bea5b339b")
  public open fun deadLetterConfig(`value`: DeadLetterConfigProperty.Builder.() -> Unit): Unit =
      deadLetterConfig(DeadLetterConfigProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun environment(): Any? = unwrap(this).getEnvironment()

  public open fun environment(`value`: IResolvable) {
    unwrap(this).setEnvironment(`value`.let(IResolvable::unwrap))
  }

  public open fun environment(`value`: EnvironmentProperty) {
    unwrap(this).setEnvironment(`value`.let(EnvironmentProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9fe4e1d1745bd46c7c4df960f9992721cd59f9fbb8b9b0bb9c79fd7087b565d")
  public open fun environment(`value`: EnvironmentProperty.Builder.() -> Unit): Unit =
      environment(EnvironmentProperty(`value`))

  public open fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

  public open fun ephemeralStorage(`value`: IResolvable) {
    unwrap(this).setEphemeralStorage(`value`.let(IResolvable::unwrap))
  }

  public open fun ephemeralStorage(`value`: EphemeralStorageProperty) {
    unwrap(this).setEphemeralStorage(`value`.let(EphemeralStorageProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("acc7854ae4ab271b192bd05cb811163e4ba1c027bc1dc787b933e05eb116688a")
  public open fun ephemeralStorage(`value`: EphemeralStorageProperty.Builder.() -> Unit): Unit =
      ephemeralStorage(EphemeralStorageProperty(`value`))

  public open fun fileSystemConfigs(): Any? = unwrap(this).getFileSystemConfigs()

  public open fun fileSystemConfigs(`value`: IResolvable) {
    unwrap(this).setFileSystemConfigs(`value`.let(IResolvable::unwrap))
  }

  public open fun fileSystemConfigs(__idx_ac66f0: List<Any>) {
    unwrap(this).setFileSystemConfigs(__idx_ac66f0)
  }

  public open fun fileSystemConfigs(vararg __idx_ac66f0: Any): Unit =
      fileSystemConfigs(__idx_ac66f0.toList())

  public open fun functionName(): String? = unwrap(this).getFunctionName()

  public open fun functionName(`value`: String) {
    unwrap(this).setFunctionName(`value`)
  }

  public open fun handler(): String? = unwrap(this).getHandler()

  public open fun handler(`value`: String) {
    unwrap(this).setHandler(`value`)
  }

  public open fun imageConfig(): Any? = unwrap(this).getImageConfig()

  public open fun imageConfig(`value`: IResolvable) {
    unwrap(this).setImageConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun imageConfig(`value`: ImageConfigProperty) {
    unwrap(this).setImageConfig(`value`.let(ImageConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("26f56b1f77d999470b731c5bf8d941d0223619013aea217d35f49664aad930fe")
  public open fun imageConfig(`value`: ImageConfigProperty.Builder.() -> Unit): Unit =
      imageConfig(ImageConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  public open fun layers(): List<String> = unwrap(this).getLayers() ?: emptyList()

  public open fun layers(`value`: List<String>) {
    unwrap(this).setLayers(`value`)
  }

  public open fun layers(vararg `value`: String): Unit = layers(`value`.toList())

  public open fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

  public open fun loggingConfig(`value`: IResolvable) {
    unwrap(this).setLoggingConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun loggingConfig(`value`: LoggingConfigProperty) {
    unwrap(this).setLoggingConfig(`value`.let(LoggingConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6b77c5f63505f2d280810158758ac608f76c842b8ad83359f2a2f0ec20c91736")
  public open fun loggingConfig(`value`: LoggingConfigProperty.Builder.() -> Unit): Unit =
      loggingConfig(LoggingConfigProperty(`value`))

  public open fun memorySize(): Number? = unwrap(this).getMemorySize()

  public open fun memorySize(`value`: Number) {
    unwrap(this).setMemorySize(`value`)
  }

  public open fun packageType(): String? = unwrap(this).getPackageType()

  public open fun packageType(`value`: String) {
    unwrap(this).setPackageType(`value`)
  }

  public open fun reservedConcurrentExecutions(): Number? =
      unwrap(this).getReservedConcurrentExecutions()

  public open fun reservedConcurrentExecutions(`value`: Number) {
    unwrap(this).setReservedConcurrentExecutions(`value`)
  }

  public open fun role(): String = unwrap(this).getRole()

  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  public open fun runtime(): String? = unwrap(this).getRuntime()

  public open fun runtime(`value`: String) {
    unwrap(this).setRuntime(`value`)
  }

  public open fun runtimeManagementConfig(): Any? = unwrap(this).getRuntimeManagementConfig()

  public open fun runtimeManagementConfig(`value`: IResolvable) {
    unwrap(this).setRuntimeManagementConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun runtimeManagementConfig(`value`: RuntimeManagementConfigProperty) {
    unwrap(this).setRuntimeManagementConfig(`value`.let(RuntimeManagementConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1edbee511052488d686a699ce8c30650858b925fc6fbd52d15954522d9e5e58a")
  public open
      fun runtimeManagementConfig(`value`: RuntimeManagementConfigProperty.Builder.() -> Unit): Unit
      = runtimeManagementConfig(RuntimeManagementConfigProperty(`value`))

  public open fun snapStart(): Any? = unwrap(this).getSnapStart()

  public open fun snapStart(`value`: IResolvable) {
    unwrap(this).setSnapStart(`value`.let(IResolvable::unwrap))
  }

  public open fun snapStart(`value`: SnapStartProperty) {
    unwrap(this).setSnapStart(`value`.let(SnapStartProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("81b72b2b8362d1a960276e8abfc120c20bed9e40f1708761e070ce63675b848f")
  public open fun snapStart(`value`: SnapStartProperty.Builder.() -> Unit): Unit =
      snapStart(SnapStartProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun timeout(): Number? = unwrap(this).getTimeout()

  public open fun timeout(`value`: Number) {
    unwrap(this).setTimeout(`value`)
  }

  public open fun tracingConfig(): Any? = unwrap(this).getTracingConfig()

  public open fun tracingConfig(`value`: IResolvable) {
    unwrap(this).setTracingConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun tracingConfig(`value`: TracingConfigProperty) {
    unwrap(this).setTracingConfig(`value`.let(TracingConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("26af4707ceb8d25c09985966f19fe8fc2018338e50c30202b6e3274e10effb61")
  public open fun tracingConfig(`value`: TracingConfigProperty.Builder.() -> Unit): Unit =
      tracingConfig(TracingConfigProperty(`value`))

  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("61a85c6b04d196acfcabd6044074bf46c225ba9da5df8f8acc431959fe2fdf45")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  public interface Builder {
    public fun architectures(architectures: List<String>)

    public fun architectures(vararg architectures: String)

    public fun code(code: IResolvable)

    public fun code(code: CodeProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b3964a0b102134414b694f5e98f6d476e8117850de3823fb7471a38dd26e1f9")
    public fun code(code: CodeProperty.Builder.() -> Unit)

    public fun codeSigningConfigArn(codeSigningConfigArn: String)

    public fun deadLetterConfig(deadLetterConfig: IResolvable)

    public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("752ac7117e2e0fbfe8b87e093fe0487ed1b922480901063ebbdf41963e1b11b9")
    public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun environment(environment: IResolvable)

    public fun environment(environment: EnvironmentProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6cc75bf28aacefddb8de924be12c3db391e03580ea8cdff98f770371dbd867af")
    public fun environment(environment: EnvironmentProperty.Builder.() -> Unit)

    public fun ephemeralStorage(ephemeralStorage: IResolvable)

    public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("267f185b4ef53e255fd2df4b6cf38e5767b7112a9894eb62b47a0d4071a3efd4")
    public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit)

    public fun fileSystemConfigs(fileSystemConfigs: IResolvable)

    public fun fileSystemConfigs(fileSystemConfigs: List<Any>)

    public fun fileSystemConfigs(vararg fileSystemConfigs: Any)

    public fun functionName(functionName: String)

    public fun handler(handler: String)

    public fun imageConfig(imageConfig: IResolvable)

    public fun imageConfig(imageConfig: ImageConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57bb0976d52c1fa65255eccb2f6081a35e932dc8aec9c1d9a9796e8be0d63548")
    public fun imageConfig(imageConfig: ImageConfigProperty.Builder.() -> Unit)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun layers(layers: List<String>)

    public fun layers(vararg layers: String)

    public fun loggingConfig(loggingConfig: IResolvable)

    public fun loggingConfig(loggingConfig: LoggingConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35a23952b1548ee98fba599d4723265cfca977fe42a79c55077816685417fdfa")
    public fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit)

    public fun memorySize(memorySize: Number)

    public fun packageType(packageType: String)

    public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number)

    public fun role(role: String)

    public fun runtime(runtime: String)

    public fun runtimeManagementConfig(runtimeManagementConfig: IResolvable)

    public fun runtimeManagementConfig(runtimeManagementConfig: RuntimeManagementConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95a300663ca3f8b32e2befd34380c14ac3d734fe6d5c6a108d01ade64520be7b")
    public
        fun runtimeManagementConfig(runtimeManagementConfig: RuntimeManagementConfigProperty.Builder.() -> Unit)

    public fun snapStart(snapStart: IResolvable)

    public fun snapStart(snapStart: SnapStartProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2590028845f970506309395f8bc94970e797ab159c68443cb26ca01e9e8a449")
    public fun snapStart(snapStart: SnapStartProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun timeout(timeout: Number)

    public fun tracingConfig(tracingConfig: IResolvable)

    public fun tracingConfig(tracingConfig: TracingConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e2f5a8b6072e93f227df7d16a2a889f29a7588706e4e11185c859fb17987062")
    public fun tracingConfig(tracingConfig: TracingConfigProperty.Builder.() -> Unit)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a95f83151908acd2460fc35b80b4458507ae5c0a7b04dcdf6a96ad632af5a117")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnFunction.Builder =
        software.amazon.awscdk.services.lambda.CfnFunction.Builder.create(scope, id)

    override fun architectures(architectures: List<String>) {
      cdkBuilder.architectures(architectures)
    }

    override fun architectures(vararg architectures: String): Unit =
        architectures(architectures.toList())

    override fun code(code: IResolvable) {
      cdkBuilder.code(code.let(IResolvable::unwrap))
    }

    override fun code(code: CodeProperty) {
      cdkBuilder.code(code.let(CodeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b3964a0b102134414b694f5e98f6d476e8117850de3823fb7471a38dd26e1f9")
    override fun code(code: CodeProperty.Builder.() -> Unit): Unit = code(CodeProperty(code))

    override fun codeSigningConfigArn(codeSigningConfigArn: String) {
      cdkBuilder.codeSigningConfigArn(codeSigningConfigArn)
    }

    override fun deadLetterConfig(deadLetterConfig: IResolvable) {
      cdkBuilder.deadLetterConfig(deadLetterConfig.let(IResolvable::unwrap))
    }

    override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty) {
      cdkBuilder.deadLetterConfig(deadLetterConfig.let(DeadLetterConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("752ac7117e2e0fbfe8b87e093fe0487ed1b922480901063ebbdf41963e1b11b9")
    override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit):
        Unit = deadLetterConfig(DeadLetterConfigProperty(deadLetterConfig))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun environment(environment: IResolvable) {
      cdkBuilder.environment(environment.let(IResolvable::unwrap))
    }

    override fun environment(environment: EnvironmentProperty) {
      cdkBuilder.environment(environment.let(EnvironmentProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6cc75bf28aacefddb8de924be12c3db391e03580ea8cdff98f770371dbd867af")
    override fun environment(environment: EnvironmentProperty.Builder.() -> Unit): Unit =
        environment(EnvironmentProperty(environment))

    override fun ephemeralStorage(ephemeralStorage: IResolvable) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable::unwrap))
    }

    override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(EphemeralStorageProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("267f185b4ef53e255fd2df4b6cf38e5767b7112a9894eb62b47a0d4071a3efd4")
    override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit):
        Unit = ephemeralStorage(EphemeralStorageProperty(ephemeralStorage))

    override fun fileSystemConfigs(fileSystemConfigs: IResolvable) {
      cdkBuilder.fileSystemConfigs(fileSystemConfigs.let(IResolvable::unwrap))
    }

    override fun fileSystemConfigs(fileSystemConfigs: List<Any>) {
      cdkBuilder.fileSystemConfigs(fileSystemConfigs)
    }

    override fun fileSystemConfigs(vararg fileSystemConfigs: Any): Unit =
        fileSystemConfigs(fileSystemConfigs.toList())

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun handler(handler: String) {
      cdkBuilder.handler(handler)
    }

    override fun imageConfig(imageConfig: IResolvable) {
      cdkBuilder.imageConfig(imageConfig.let(IResolvable::unwrap))
    }

    override fun imageConfig(imageConfig: ImageConfigProperty) {
      cdkBuilder.imageConfig(imageConfig.let(ImageConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57bb0976d52c1fa65255eccb2f6081a35e932dc8aec9c1d9a9796e8be0d63548")
    override fun imageConfig(imageConfig: ImageConfigProperty.Builder.() -> Unit): Unit =
        imageConfig(ImageConfigProperty(imageConfig))

    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    override fun layers(layers: List<String>) {
      cdkBuilder.layers(layers)
    }

    override fun layers(vararg layers: String): Unit = layers(layers.toList())

    override fun loggingConfig(loggingConfig: IResolvable) {
      cdkBuilder.loggingConfig(loggingConfig.let(IResolvable::unwrap))
    }

    override fun loggingConfig(loggingConfig: LoggingConfigProperty) {
      cdkBuilder.loggingConfig(loggingConfig.let(LoggingConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35a23952b1548ee98fba599d4723265cfca977fe42a79c55077816685417fdfa")
    override fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit): Unit =
        loggingConfig(LoggingConfigProperty(loggingConfig))

    override fun memorySize(memorySize: Number) {
      cdkBuilder.memorySize(memorySize)
    }

    override fun packageType(packageType: String) {
      cdkBuilder.packageType(packageType)
    }

    override fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
      cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
    }

    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    override fun runtime(runtime: String) {
      cdkBuilder.runtime(runtime)
    }

    override fun runtimeManagementConfig(runtimeManagementConfig: IResolvable) {
      cdkBuilder.runtimeManagementConfig(runtimeManagementConfig.let(IResolvable::unwrap))
    }

    override fun runtimeManagementConfig(runtimeManagementConfig: RuntimeManagementConfigProperty) {
      cdkBuilder.runtimeManagementConfig(runtimeManagementConfig.let(RuntimeManagementConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95a300663ca3f8b32e2befd34380c14ac3d734fe6d5c6a108d01ade64520be7b")
    override
        fun runtimeManagementConfig(runtimeManagementConfig: RuntimeManagementConfigProperty.Builder.() -> Unit):
        Unit = runtimeManagementConfig(RuntimeManagementConfigProperty(runtimeManagementConfig))

    override fun snapStart(snapStart: IResolvable) {
      cdkBuilder.snapStart(snapStart.let(IResolvable::unwrap))
    }

    override fun snapStart(snapStart: SnapStartProperty) {
      cdkBuilder.snapStart(snapStart.let(SnapStartProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2590028845f970506309395f8bc94970e797ab159c68443cb26ca01e9e8a449")
    override fun snapStart(snapStart: SnapStartProperty.Builder.() -> Unit): Unit =
        snapStart(SnapStartProperty(snapStart))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    override fun tracingConfig(tracingConfig: IResolvable) {
      cdkBuilder.tracingConfig(tracingConfig.let(IResolvable::unwrap))
    }

    override fun tracingConfig(tracingConfig: TracingConfigProperty) {
      cdkBuilder.tracingConfig(tracingConfig.let(TracingConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e2f5a8b6072e93f227df7d16a2a889f29a7588706e4e11185c859fb17987062")
    override fun tracingConfig(tracingConfig: TracingConfigProperty.Builder.() -> Unit): Unit =
        tracingConfig(TracingConfigProperty(tracingConfig))

    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a95f83151908acd2460fc35b80b4458507ae5c0a7b04dcdf6a96ad632af5a117")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.lambda.CfnFunction = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFunction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFunction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction): CfnFunction =
        CfnFunction(cdkObject)

    internal fun unwrap(wrapped: CfnFunction): software.amazon.awscdk.services.lambda.CfnFunction =
        wrapped.cdkObject
  }

  public interface TracingConfigProperty {
    public fun mode(): String? = unwrap(this).getMode()

    public interface Builder {
      public fun mode(mode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty.builder()

      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty,
    ) : TracingConfigProperty {
      override fun mode(): String? = unwrap(this).getMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TracingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty):
          TracingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TracingConfigProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VpcConfigProperty {
    public fun ipv6AllowedForDualStack(): Any? = unwrap(this).getIpv6AllowedForDualStack()

    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    public interface Builder {
      public fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: Boolean)

      public fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: IResolvable)

      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun subnetIds(subnetIds: List<String>)

      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty.builder()

      override fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: Boolean) {
        cdkBuilder.ipv6AllowedForDualStack(ipv6AllowedForDualStack)
      }

      override fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: IResolvable) {
        cdkBuilder.ipv6AllowedForDualStack(ipv6AllowedForDualStack.let(IResolvable::unwrap))
      }

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build(): software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty,
    ) : VpcConfigProperty {
      override fun ipv6AllowedForDualStack(): Any? = unwrap(this).getIpv6AllowedForDualStack()

      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SnapStartProperty {
    public fun applyOn(): String

    public interface Builder {
      public fun applyOn(applyOn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty.builder()

      override fun applyOn(applyOn: String) {
        cdkBuilder.applyOn(applyOn)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty,
    ) : SnapStartProperty {
      override fun applyOn(): String = unwrap(this).getApplyOn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SnapStartProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty):
          SnapStartProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnapStartProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EphemeralStorageProperty {
    public fun size(): Number

    public interface Builder {
      public fun size(size: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty.builder()

      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty,
    ) : EphemeralStorageProperty {
      override fun size(): Number = unwrap(this).getSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EphemeralStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty):
          EphemeralStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EphemeralStorageProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RuntimeManagementConfigProperty {
    public fun runtimeVersionArn(): String? = unwrap(this).getRuntimeVersionArn()

    public fun updateRuntimeOn(): String

    public interface Builder {
      public fun runtimeVersionArn(runtimeVersionArn: String)

      public fun updateRuntimeOn(updateRuntimeOn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty.builder()

      override fun runtimeVersionArn(runtimeVersionArn: String) {
        cdkBuilder.runtimeVersionArn(runtimeVersionArn)
      }

      override fun updateRuntimeOn(updateRuntimeOn: String) {
        cdkBuilder.updateRuntimeOn(updateRuntimeOn)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty,
    ) : RuntimeManagementConfigProperty {
      override fun runtimeVersionArn(): String? = unwrap(this).getRuntimeVersionArn()

      override fun updateRuntimeOn(): String = unwrap(this).getUpdateRuntimeOn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuntimeManagementConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty):
          RuntimeManagementConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuntimeManagementConfigProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LoggingConfigProperty {
    public fun applicationLogLevel(): String? = unwrap(this).getApplicationLogLevel()

    public fun logFormat(): String? = unwrap(this).getLogFormat()

    public fun logGroup(): String? = unwrap(this).getLogGroup()

    public fun systemLogLevel(): String? = unwrap(this).getSystemLogLevel()

    public interface Builder {
      public fun applicationLogLevel(applicationLogLevel: String)

      public fun logFormat(logFormat: String)

      public fun logGroup(logGroup: String)

      public fun systemLogLevel(systemLogLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty.builder()

      override fun applicationLogLevel(applicationLogLevel: String) {
        cdkBuilder.applicationLogLevel(applicationLogLevel)
      }

      override fun logFormat(logFormat: String) {
        cdkBuilder.logFormat(logFormat)
      }

      override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      override fun systemLogLevel(systemLogLevel: String) {
        cdkBuilder.systemLogLevel(systemLogLevel)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty,
    ) : LoggingConfigProperty {
      override fun applicationLogLevel(): String? = unwrap(this).getApplicationLogLevel()

      override fun logFormat(): String? = unwrap(this).getLogFormat()

      override fun logGroup(): String? = unwrap(this).getLogGroup()

      override fun systemLogLevel(): String? = unwrap(this).getSystemLogLevel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty):
          LoggingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DeadLetterConfigProperty {
    public fun targetArn(): String? = unwrap(this).getTargetArn()

    public interface Builder {
      public fun targetArn(targetArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty.builder()

      override fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty,
    ) : DeadLetterConfigProperty {
      override fun targetArn(): String? = unwrap(this).getTargetArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeadLetterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty):
          DeadLetterConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeadLetterConfigProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ImageConfigProperty {
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    public fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

    public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

    public interface Builder {
      public fun command(command: List<String>)

      public fun command(vararg command: String)

      public fun entryPoint(entryPoint: List<String>)

      public fun entryPoint(vararg entryPoint: String)

      public fun workingDirectory(workingDirectory: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty.builder()

      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      override fun command(vararg command: String): Unit = command(command.toList())

      override fun entryPoint(entryPoint: List<String>) {
        cdkBuilder.entryPoint(entryPoint)
      }

      override fun entryPoint(vararg entryPoint: String): Unit = entryPoint(entryPoint.toList())

      override fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty,
    ) : ImageConfigProperty {
      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      override fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

      override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ImageConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty):
          ImageConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageConfigProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EnvironmentProperty {
    public fun variables(): Any? = unwrap(this).getVariables()

    public interface Builder {
      public fun variables(variables: IResolvable)

      public fun variables(variables: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty.builder()

      override fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables.let(IResolvable::unwrap))
      }

      override fun variables(variables: Map<String, String>) {
        cdkBuilder.variables(variables)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty,
    ) : EnvironmentProperty {
      override fun variables(): Any? = unwrap(this).getVariables()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty):
          EnvironmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FileSystemConfigProperty {
    public fun arn(): String

    public fun localMountPath(): String

    public interface Builder {
      public fun arn(arn: String)

      public fun localMountPath(localMountPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      override fun localMountPath(localMountPath: String) {
        cdkBuilder.localMountPath(localMountPath)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty,
    ) : FileSystemConfigProperty {
      override fun arn(): String = unwrap(this).getArn()

      override fun localMountPath(): String = unwrap(this).getLocalMountPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty):
          FileSystemConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileSystemConfigProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SnapStartResponseProperty {
    public fun applyOn(): String? = unwrap(this).getApplyOn()

    public fun optimizationStatus(): String? = unwrap(this).getOptimizationStatus()

    public interface Builder {
      public fun applyOn(applyOn: String)

      public fun optimizationStatus(optimizationStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty.builder()

      override fun applyOn(applyOn: String) {
        cdkBuilder.applyOn(applyOn)
      }

      override fun optimizationStatus(optimizationStatus: String) {
        cdkBuilder.optimizationStatus(optimizationStatus)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty,
    ) : SnapStartResponseProperty {
      override fun applyOn(): String? = unwrap(this).getApplyOn()

      override fun optimizationStatus(): String? = unwrap(this).getOptimizationStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SnapStartResponseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty):
          SnapStartResponseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnapStartResponseProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CodeProperty {
    public fun imageUri(): String? = unwrap(this).getImageUri()

    public fun s3Bucket(): String? = unwrap(this).getS3Bucket()

    public fun s3Key(): String? = unwrap(this).getS3Key()

    public fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()

    public fun zipFile(): String? = unwrap(this).getZipFile()

    public interface Builder {
      public fun imageUri(imageUri: String)

      public fun s3Bucket(s3Bucket: String)

      public fun s3Key(s3Key: String)

      public fun s3ObjectVersion(s3ObjectVersion: String)

      public fun zipFile(zipFile: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.builder()

      override fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
      }

      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      override fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
      }

      override fun zipFile(zipFile: String) {
        cdkBuilder.zipFile(zipFile)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty,
    ) : CodeProperty {
      override fun imageUri(): String? = unwrap(this).getImageUri()

      override fun s3Bucket(): String? = unwrap(this).getS3Bucket()

      override fun s3Key(): String? = unwrap(this).getS3Key()

      override fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()

      override fun zipFile(): String? = unwrap(this).getZipFile()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty):
          CodeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
