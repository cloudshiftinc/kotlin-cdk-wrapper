package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnModel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrModelName(): String = unwrap(this).getAttrModelName()

  public open fun containers(): Any? = unwrap(this).getContainers()

  public open fun containers(`value`: IResolvable) {
    unwrap(this).setContainers(`value`.let(IResolvable::unwrap))
  }

  public open fun containers(__idx_ac66f0: List<Any>) {
    unwrap(this).setContainers(__idx_ac66f0)
  }

  public open fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

  public open fun enableNetworkIsolation(`value`: Boolean) {
    unwrap(this).setEnableNetworkIsolation(`value`)
  }

  public open fun enableNetworkIsolation(`value`: IResolvable) {
    unwrap(this).setEnableNetworkIsolation(`value`.let(IResolvable::unwrap))
  }

  public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
  }

  public open fun inferenceExecutionConfig(): Any? = unwrap(this).getInferenceExecutionConfig()

  public open fun inferenceExecutionConfig(`value`: IResolvable) {
    unwrap(this).setInferenceExecutionConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun inferenceExecutionConfig(`value`: InferenceExecutionConfigProperty) {
    unwrap(this).setInferenceExecutionConfig(`value`.let(InferenceExecutionConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("042e2b86599f1d355d28bdfd247011736350d0e51481df8a3b6f011942f585a5")
  public open
      fun inferenceExecutionConfig(`value`: InferenceExecutionConfigProperty.Builder.() -> Unit):
      Unit = inferenceExecutionConfig(InferenceExecutionConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun modelName(): String? = unwrap(this).getModelName()

  public open fun modelName(`value`: String) {
    unwrap(this).setModelName(`value`)
  }

  public open fun primaryContainer(): Any? = unwrap(this).getPrimaryContainer()

  public open fun primaryContainer(`value`: IResolvable) {
    unwrap(this).setPrimaryContainer(`value`.let(IResolvable::unwrap))
  }

  public open fun primaryContainer(`value`: ContainerDefinitionProperty) {
    unwrap(this).setPrimaryContainer(`value`.let(ContainerDefinitionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("aecd9511227e1b88aa691097d77e9859d86e80ee76b58749c7bd715ab4b0f894")
  public open fun primaryContainer(`value`: ContainerDefinitionProperty.Builder.() -> Unit): Unit =
      primaryContainer(ContainerDefinitionProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("41166d7299798ff3924d684244192824d7e763ac95e4332cf6a122fd088051f7")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  public interface Builder {
    public fun containers(containers: IResolvable) {
    }

    public fun containers(containers: List<Any>) {
    }

    public fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
    }

    public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
    }

    public fun executionRoleArn(executionRoleArn: String) {
    }

    public fun inferenceExecutionConfig(inferenceExecutionConfig: IResolvable) {
    }

    public
        fun inferenceExecutionConfig(inferenceExecutionConfig: InferenceExecutionConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3683a6f9aa830bd3cc1a5f0101ba0088df894d6feaa302a5aec2476be4652bfe")
    public
        fun inferenceExecutionConfig(inferenceExecutionConfig: InferenceExecutionConfigProperty.Builder.() -> Unit) {
    }

    public fun modelName(modelName: String) {
    }

    public fun primaryContainer(primaryContainer: IResolvable) {
    }

    public fun primaryContainer(primaryContainer: ContainerDefinitionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc7087f1466baca961f3a66699c419ba9f23f39d16c606af0ac185eb96b667a4")
    public fun primaryContainer(primaryContainer: ContainerDefinitionProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun vpcConfig(vpcConfig: IResolvable) {
    }

    public fun vpcConfig(vpcConfig: VpcConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15ef9cae36b2546cd5e7da29187bccb6baf4a3433ddd65ab8196145903b74881")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnModel.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModel.Builder.create(scope, id)

    public override fun containers(containers: IResolvable) {
      cdkBuilder.containers(containers.let(IResolvable::unwrap))
    }

    public override fun containers(containers: List<Any>) {
      cdkBuilder.containers(containers)
    }

    public override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
    }

    public override fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation.let(IResolvable::unwrap))
    }

    public override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    public override fun inferenceExecutionConfig(inferenceExecutionConfig: IResolvable) {
      cdkBuilder.inferenceExecutionConfig(inferenceExecutionConfig.let(IResolvable::unwrap))
    }

    public override
        fun inferenceExecutionConfig(inferenceExecutionConfig: InferenceExecutionConfigProperty) {
      cdkBuilder.inferenceExecutionConfig(inferenceExecutionConfig.let(InferenceExecutionConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3683a6f9aa830bd3cc1a5f0101ba0088df894d6feaa302a5aec2476be4652bfe")
    public override
        fun inferenceExecutionConfig(inferenceExecutionConfig: InferenceExecutionConfigProperty.Builder.() -> Unit):
        Unit = inferenceExecutionConfig(InferenceExecutionConfigProperty(inferenceExecutionConfig))

    public override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
    }

    public override fun primaryContainer(primaryContainer: IResolvable) {
      cdkBuilder.primaryContainer(primaryContainer.let(IResolvable::unwrap))
    }

    public override fun primaryContainer(primaryContainer: ContainerDefinitionProperty) {
      cdkBuilder.primaryContainer(primaryContainer.let(ContainerDefinitionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc7087f1466baca961f3a66699c419ba9f23f39d16c606af0ac185eb96b667a4")
    public override
        fun primaryContainer(primaryContainer: ContainerDefinitionProperty.Builder.() -> Unit): Unit
        = primaryContainer(ContainerDefinitionProperty(primaryContainer))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    public override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15ef9cae36b2546cd5e7da29187bccb6baf4a3433ddd65ab8196145903b74881")
    public override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModel = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnModel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnModel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel): CfnModel =
        CfnModel(cdkObject)

    internal fun unwrap(wrapped: CfnModel): software.amazon.awscdk.services.sagemaker.CfnModel =
        wrapped.cdkObject
  }

  public interface MultiModelConfigProperty {
    public fun modelCacheSetting(): String? = unwrap(this).getModelCacheSetting()

    public interface Builder {
      public fun modelCacheSetting(modelCacheSetting: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.MultiModelConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModel.MultiModelConfigProperty.builder()

      public override fun modelCacheSetting(modelCacheSetting: String) {
        cdkBuilder.modelCacheSetting(modelCacheSetting)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModel.MultiModelConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModel.MultiModelConfigProperty,
    ) : MultiModelConfigProperty {
      public override fun modelCacheSetting(): String? = unwrap(this).getModelCacheSetting()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MultiModelConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.MultiModelConfigProperty):
          MultiModelConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiModelConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.MultiModelConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ModelDataSourceProperty {
    public fun s3DataSource(): Any

    public interface Builder {
      public fun s3DataSource(s3DataSource: IResolvable) {
      }

      public fun s3DataSource(s3DataSource: S3DataSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9666c7b9ff26a4a412d5a4183267d59e440c3892268204f9dcced0caf0067e1f")
      public fun s3DataSource(s3DataSource: S3DataSourceProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelDataSourceProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelDataSourceProperty.builder()

      public override fun s3DataSource(s3DataSource: IResolvable) {
        cdkBuilder.s3DataSource(s3DataSource.let(IResolvable::unwrap))
      }

      public override fun s3DataSource(s3DataSource: S3DataSourceProperty) {
        cdkBuilder.s3DataSource(s3DataSource.let(S3DataSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9666c7b9ff26a4a412d5a4183267d59e440c3892268204f9dcced0caf0067e1f")
      public override fun s3DataSource(s3DataSource: S3DataSourceProperty.Builder.() -> Unit): Unit
          = s3DataSource(S3DataSourceProperty(s3DataSource))

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModel.ModelDataSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelDataSourceProperty,
    ) : ModelDataSourceProperty {
      public override fun s3DataSource(): Any = unwrap(this).getS3DataSource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ModelDataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.ModelDataSourceProperty):
          ModelDataSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelDataSourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelDataSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VpcConfigProperty {
    public fun securityGroupIds(): List<String>

    public fun subnets(): List<String>

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>) {
      }

      public fun subnets(subnets: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty.builder()

      public override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      public override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty,
    ) : VpcConfigProperty {
      public override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      public override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3DataSourceProperty {
    public fun compressionType(): String

    public fun modelAccessConfig(): Any? = unwrap(this).getModelAccessConfig()

    public fun s3DataType(): String

    public fun s3Uri(): String

    public interface Builder {
      public fun compressionType(compressionType: String) {
      }

      public fun modelAccessConfig(modelAccessConfig: IResolvable) {
      }

      public fun modelAccessConfig(modelAccessConfig: ModelAccessConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d89505c81977147be9ffaf680ecf6e6297222407045d3477357064c885b2e7f")
      public
          fun modelAccessConfig(modelAccessConfig: ModelAccessConfigProperty.Builder.() -> Unit) {
      }

      public fun s3DataType(s3DataType: String) {
      }

      public fun s3Uri(s3Uri: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.S3DataSourceProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModel.S3DataSourceProperty.builder()

      public override fun compressionType(compressionType: String) {
        cdkBuilder.compressionType(compressionType)
      }

      public override fun modelAccessConfig(modelAccessConfig: IResolvable) {
        cdkBuilder.modelAccessConfig(modelAccessConfig.let(IResolvable::unwrap))
      }

      public override fun modelAccessConfig(modelAccessConfig: ModelAccessConfigProperty) {
        cdkBuilder.modelAccessConfig(modelAccessConfig.let(ModelAccessConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d89505c81977147be9ffaf680ecf6e6297222407045d3477357064c885b2e7f")
      public override
          fun modelAccessConfig(modelAccessConfig: ModelAccessConfigProperty.Builder.() -> Unit):
          Unit = modelAccessConfig(ModelAccessConfigProperty(modelAccessConfig))

      public override fun s3DataType(s3DataType: String) {
        cdkBuilder.s3DataType(s3DataType)
      }

      public override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModel.S3DataSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModel.S3DataSourceProperty,
    ) : S3DataSourceProperty {
      public override fun compressionType(): String = unwrap(this).getCompressionType()

      public override fun modelAccessConfig(): Any? = unwrap(this).getModelAccessConfig()

      public override fun s3DataType(): String = unwrap(this).getS3DataType()

      public override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3DataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.S3DataSourceProperty):
          S3DataSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DataSourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.S3DataSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ContainerDefinitionProperty {
    public fun containerHostname(): String? = unwrap(this).getContainerHostname()

    public fun environment(): Any? = unwrap(this).getEnvironment()

    public fun image(): String? = unwrap(this).getImage()

    public fun imageConfig(): Any? = unwrap(this).getImageConfig()

    public fun inferenceSpecificationName(): String? = unwrap(this).getInferenceSpecificationName()

    public fun mode(): String? = unwrap(this).getMode()

    public fun modelDataSource(): Any? = unwrap(this).getModelDataSource()

    public fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

    public fun modelPackageName(): String? = unwrap(this).getModelPackageName()

    public fun multiModelConfig(): Any? = unwrap(this).getMultiModelConfig()

    public interface Builder {
      public fun containerHostname(containerHostname: String) {
      }

      public fun environment(environment: Any) {
      }

      public fun image(image: String) {
      }

      public fun imageConfig(imageConfig: IResolvable) {
      }

      public fun imageConfig(imageConfig: ImageConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a019b9b9cb0667f94d2660ce306e655ad37088d5831a6cf57be5ab3a087088d9")
      public fun imageConfig(imageConfig: ImageConfigProperty.Builder.() -> Unit) {
      }

      public fun inferenceSpecificationName(inferenceSpecificationName: String) {
      }

      public fun mode(mode: String) {
      }

      public fun modelDataSource(modelDataSource: IResolvable) {
      }

      public fun modelDataSource(modelDataSource: ModelDataSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a11986e307cbd4a71922aeecec723d99a0a6975ce902004868c9f96ced93dbe7")
      public fun modelDataSource(modelDataSource: ModelDataSourceProperty.Builder.() -> Unit) {
      }

      public fun modelDataUrl(modelDataUrl: String) {
      }

      public fun modelPackageName(modelPackageName: String) {
      }

      public fun multiModelConfig(multiModelConfig: IResolvable) {
      }

      public fun multiModelConfig(multiModelConfig: MultiModelConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12b6e96f54abd5fd57cad1f48fd46f1f9cd6c8ee315852f233e2edd926f4b2f1")
      public fun multiModelConfig(multiModelConfig: MultiModelConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty.builder()

      public override fun containerHostname(containerHostname: String) {
        cdkBuilder.containerHostname(containerHostname)
      }

      public override fun environment(environment: Any) {
        cdkBuilder.environment(environment)
      }

      public override fun image(image: String) {
        cdkBuilder.image(image)
      }

      public override fun imageConfig(imageConfig: IResolvable) {
        cdkBuilder.imageConfig(imageConfig.let(IResolvable::unwrap))
      }

      public override fun imageConfig(imageConfig: ImageConfigProperty) {
        cdkBuilder.imageConfig(imageConfig.let(ImageConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a019b9b9cb0667f94d2660ce306e655ad37088d5831a6cf57be5ab3a087088d9")
      public override fun imageConfig(imageConfig: ImageConfigProperty.Builder.() -> Unit): Unit =
          imageConfig(ImageConfigProperty(imageConfig))

      public override fun inferenceSpecificationName(inferenceSpecificationName: String) {
        cdkBuilder.inferenceSpecificationName(inferenceSpecificationName)
      }

      public override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public override fun modelDataSource(modelDataSource: IResolvable) {
        cdkBuilder.modelDataSource(modelDataSource.let(IResolvable::unwrap))
      }

      public override fun modelDataSource(modelDataSource: ModelDataSourceProperty) {
        cdkBuilder.modelDataSource(modelDataSource.let(ModelDataSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a11986e307cbd4a71922aeecec723d99a0a6975ce902004868c9f96ced93dbe7")
      public override
          fun modelDataSource(modelDataSource: ModelDataSourceProperty.Builder.() -> Unit): Unit =
          modelDataSource(ModelDataSourceProperty(modelDataSource))

      public override fun modelDataUrl(modelDataUrl: String) {
        cdkBuilder.modelDataUrl(modelDataUrl)
      }

      public override fun modelPackageName(modelPackageName: String) {
        cdkBuilder.modelPackageName(modelPackageName)
      }

      public override fun multiModelConfig(multiModelConfig: IResolvable) {
        cdkBuilder.multiModelConfig(multiModelConfig.let(IResolvable::unwrap))
      }

      public override fun multiModelConfig(multiModelConfig: MultiModelConfigProperty) {
        cdkBuilder.multiModelConfig(multiModelConfig.let(MultiModelConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12b6e96f54abd5fd57cad1f48fd46f1f9cd6c8ee315852f233e2edd926f4b2f1")
      public override
          fun multiModelConfig(multiModelConfig: MultiModelConfigProperty.Builder.() -> Unit): Unit
          = multiModelConfig(MultiModelConfigProperty(multiModelConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty,
    ) : ContainerDefinitionProperty {
      public override fun containerHostname(): String? = unwrap(this).getContainerHostname()

      public override fun environment(): Any? = unwrap(this).getEnvironment()

      public override fun image(): String? = unwrap(this).getImage()

      public override fun imageConfig(): Any? = unwrap(this).getImageConfig()

      public override fun inferenceSpecificationName(): String? =
          unwrap(this).getInferenceSpecificationName()

      public override fun mode(): String? = unwrap(this).getMode()

      public override fun modelDataSource(): Any? = unwrap(this).getModelDataSource()

      public override fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

      public override fun modelPackageName(): String? = unwrap(this).getModelPackageName()

      public override fun multiModelConfig(): Any? = unwrap(this).getMultiModelConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty):
          ContainerDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ImageConfigProperty {
    public fun repositoryAccessMode(): String

    public fun repositoryAuthConfig(): Any? = unwrap(this).getRepositoryAuthConfig()

    public interface Builder {
      public fun repositoryAccessMode(repositoryAccessMode: String) {
      }

      public fun repositoryAuthConfig(repositoryAuthConfig: IResolvable) {
      }

      public fun repositoryAuthConfig(repositoryAuthConfig: RepositoryAuthConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b6556dde91f4c6adedaecaa4eec4b70580f0a032691abc2c6456874da281405")
      public
          fun repositoryAuthConfig(repositoryAuthConfig: RepositoryAuthConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.ImageConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModel.ImageConfigProperty.builder()

      public override fun repositoryAccessMode(repositoryAccessMode: String) {
        cdkBuilder.repositoryAccessMode(repositoryAccessMode)
      }

      public override fun repositoryAuthConfig(repositoryAuthConfig: IResolvable) {
        cdkBuilder.repositoryAuthConfig(repositoryAuthConfig.let(IResolvable::unwrap))
      }

      public override fun repositoryAuthConfig(repositoryAuthConfig: RepositoryAuthConfigProperty) {
        cdkBuilder.repositoryAuthConfig(repositoryAuthConfig.let(RepositoryAuthConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b6556dde91f4c6adedaecaa4eec4b70580f0a032691abc2c6456874da281405")
      public override
          fun repositoryAuthConfig(repositoryAuthConfig: RepositoryAuthConfigProperty.Builder.() -> Unit):
          Unit = repositoryAuthConfig(RepositoryAuthConfigProperty(repositoryAuthConfig))

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModel.ImageConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModel.ImageConfigProperty,
    ) : ImageConfigProperty {
      public override fun repositoryAccessMode(): String = unwrap(this).getRepositoryAccessMode()

      public override fun repositoryAuthConfig(): Any? = unwrap(this).getRepositoryAuthConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ImageConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.ImageConfigProperty):
          ImageConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.ImageConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface InferenceExecutionConfigProperty {
    public fun mode(): String

    public interface Builder {
      public fun mode(mode: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.InferenceExecutionConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModel.InferenceExecutionConfigProperty.builder()

      public override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModel.InferenceExecutionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModel.InferenceExecutionConfigProperty,
    ) : InferenceExecutionConfigProperty {
      public override fun mode(): String = unwrap(this).getMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InferenceExecutionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.InferenceExecutionConfigProperty):
          InferenceExecutionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceExecutionConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.InferenceExecutionConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RepositoryAuthConfigProperty {
    public fun repositoryCredentialsProviderArn(): String

    public interface Builder {
      public fun repositoryCredentialsProviderArn(repositoryCredentialsProviderArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty.builder()

      public override
          fun repositoryCredentialsProviderArn(repositoryCredentialsProviderArn: String) {
        cdkBuilder.repositoryCredentialsProviderArn(repositoryCredentialsProviderArn)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty,
    ) : RepositoryAuthConfigProperty {
      public override fun repositoryCredentialsProviderArn(): String =
          unwrap(this).getRepositoryCredentialsProviderArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryAuthConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty):
          RepositoryAuthConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepositoryAuthConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ModelAccessConfigProperty {
    public fun acceptEula(): Any

    public interface Builder {
      public fun acceptEula(acceptEula: Boolean) {
      }

      public fun acceptEula(acceptEula: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelAccessConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelAccessConfigProperty.builder()

      public override fun acceptEula(acceptEula: Boolean) {
        cdkBuilder.acceptEula(acceptEula)
      }

      public override fun acceptEula(acceptEula: IResolvable) {
        cdkBuilder.acceptEula(acceptEula.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelAccessConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelAccessConfigProperty,
    ) : ModelAccessConfigProperty {
      public override fun acceptEula(): Any = unwrap(this).getAcceptEula()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ModelAccessConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.ModelAccessConfigProperty):
          ModelAccessConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelAccessConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelAccessConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
