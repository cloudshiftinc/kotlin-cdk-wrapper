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
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnModelBiasJobDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrJobDefinitionArn(): String = unwrap(this).getAttrJobDefinitionArn()

  public open fun endpointName(): String? = unwrap(this).getEndpointName()

  public open fun endpointName(`value`: String) {
    unwrap(this).setEndpointName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  public open fun jobDefinitionName(`value`: String) {
    unwrap(this).setJobDefinitionName(`value`)
  }

  public open fun jobResources(): Any = unwrap(this).getJobResources()

  public open fun jobResources(`value`: IResolvable) {
    unwrap(this).setJobResources(`value`.let(IResolvable::unwrap))
  }

  public open fun jobResources(`value`: MonitoringResourcesProperty) {
    unwrap(this).setJobResources(`value`.let(MonitoringResourcesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e1b732cebc6d0d542f6af6859d27ae090b7cea6f7f9c5dacc327b69bfab8759d")
  public open fun jobResources(`value`: MonitoringResourcesProperty.Builder.() -> Unit): Unit =
      jobResources(MonitoringResourcesProperty(`value`))

  public open fun modelBiasAppSpecification(): Any = unwrap(this).getModelBiasAppSpecification()

  public open fun modelBiasAppSpecification(`value`: IResolvable) {
    unwrap(this).setModelBiasAppSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun modelBiasAppSpecification(`value`: ModelBiasAppSpecificationProperty) {
    unwrap(this).setModelBiasAppSpecification(`value`.let(ModelBiasAppSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("985bf816bd154874821ebc9daa3ebd4d218cbbb04339d4ce5b6f4113a81ff05f")
  public open
      fun modelBiasAppSpecification(`value`: ModelBiasAppSpecificationProperty.Builder.() -> Unit):
      Unit = modelBiasAppSpecification(ModelBiasAppSpecificationProperty(`value`))

  public open fun modelBiasBaselineConfig(): Any? = unwrap(this).getModelBiasBaselineConfig()

  public open fun modelBiasBaselineConfig(`value`: IResolvable) {
    unwrap(this).setModelBiasBaselineConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun modelBiasBaselineConfig(`value`: ModelBiasBaselineConfigProperty) {
    unwrap(this).setModelBiasBaselineConfig(`value`.let(ModelBiasBaselineConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bd0d9e14442da8784f311283f599e6dd4ea4e46ecaad64599fe71b73d9abcdbe")
  public open
      fun modelBiasBaselineConfig(`value`: ModelBiasBaselineConfigProperty.Builder.() -> Unit): Unit
      = modelBiasBaselineConfig(ModelBiasBaselineConfigProperty(`value`))

  public open fun modelBiasJobInput(): Any = unwrap(this).getModelBiasJobInput()

  public open fun modelBiasJobInput(`value`: IResolvable) {
    unwrap(this).setModelBiasJobInput(`value`.let(IResolvable::unwrap))
  }

  public open fun modelBiasJobInput(`value`: ModelBiasJobInputProperty) {
    unwrap(this).setModelBiasJobInput(`value`.let(ModelBiasJobInputProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3f6ddf44e0ab649a9484ddb9986bbdb7dc7f4340490b72cc9eabea025155ddf4")
  public open fun modelBiasJobInput(`value`: ModelBiasJobInputProperty.Builder.() -> Unit): Unit =
      modelBiasJobInput(ModelBiasJobInputProperty(`value`))

  public open fun modelBiasJobOutputConfig(): Any = unwrap(this).getModelBiasJobOutputConfig()

  public open fun modelBiasJobOutputConfig(`value`: IResolvable) {
    unwrap(this).setModelBiasJobOutputConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun modelBiasJobOutputConfig(`value`: MonitoringOutputConfigProperty) {
    unwrap(this).setModelBiasJobOutputConfig(`value`.let(MonitoringOutputConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5fd536534c49251923d21f6391d251b2214fef49b5fbe1022229b25687fe8fc6")
  public open
      fun modelBiasJobOutputConfig(`value`: MonitoringOutputConfigProperty.Builder.() -> Unit): Unit
      = modelBiasJobOutputConfig(MonitoringOutputConfigProperty(`value`))

  public open fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

  public open fun networkConfig(`value`: IResolvable) {
    unwrap(this).setNetworkConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun networkConfig(`value`: NetworkConfigProperty) {
    unwrap(this).setNetworkConfig(`value`.let(NetworkConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e4e22266cefe3d775a613ca524bc3ebbbacc552f8a7e73b36e52e92d83fc3bc4")
  public open fun networkConfig(`value`: NetworkConfigProperty.Builder.() -> Unit): Unit =
      networkConfig(NetworkConfigProperty(`value`))

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

  public open fun stoppingCondition(`value`: IResolvable) {
    unwrap(this).setStoppingCondition(`value`.let(IResolvable::unwrap))
  }

  public open fun stoppingCondition(`value`: StoppingConditionProperty) {
    unwrap(this).setStoppingCondition(`value`.let(StoppingConditionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("12ce9536188369b911a6e18ae41be0487ade8f2d1ecd6f9eee4fe5d6ecb66782")
  public open fun stoppingCondition(`value`: StoppingConditionProperty.Builder.() -> Unit): Unit =
      stoppingCondition(StoppingConditionProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun endpointName(endpointName: String) {
    }

    public fun jobDefinitionName(jobDefinitionName: String) {
    }

    public fun jobResources(jobResources: IResolvable) {
    }

    public fun jobResources(jobResources: MonitoringResourcesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f226ca59284de3a3ddf1a9d7f200591a4bfad828e4525b6260727a93eb1c1857")
    public fun jobResources(jobResources: MonitoringResourcesProperty.Builder.() -> Unit) {
    }

    public fun modelBiasAppSpecification(modelBiasAppSpecification: IResolvable) {
    }

    public
        fun modelBiasAppSpecification(modelBiasAppSpecification: ModelBiasAppSpecificationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f78a083d8d98e5875451abd56b0b4be0ca774684927027bc3cb6a23bbf18b1bd")
    public
        fun modelBiasAppSpecification(modelBiasAppSpecification: ModelBiasAppSpecificationProperty.Builder.() -> Unit) {
    }

    public fun modelBiasBaselineConfig(modelBiasBaselineConfig: IResolvable) {
    }

    public fun modelBiasBaselineConfig(modelBiasBaselineConfig: ModelBiasBaselineConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe38d516e5b9856c6b171b329ae30cc6d077c987e6e17500a1e62ad0d3b1ba6a")
    public
        fun modelBiasBaselineConfig(modelBiasBaselineConfig: ModelBiasBaselineConfigProperty.Builder.() -> Unit) {
    }

    public fun modelBiasJobInput(modelBiasJobInput: IResolvable) {
    }

    public fun modelBiasJobInput(modelBiasJobInput: ModelBiasJobInputProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f86e4242430b3813c716bc4c8cd23bd0faa5f2b5146072b66d4b7597a236bf6")
    public fun modelBiasJobInput(modelBiasJobInput: ModelBiasJobInputProperty.Builder.() -> Unit) {
    }

    public fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: IResolvable) {
    }

    public fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: MonitoringOutputConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7745870d086d1eee86de7fe656e13170b4e70362f3626b6ec8dce6c4b55b8fc")
    public
        fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit) {
    }

    public fun networkConfig(networkConfig: IResolvable) {
    }

    public fun networkConfig(networkConfig: NetworkConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81069f7b758fefa66a014cba64f28fe98d06a0feda43310a371f1aa7b9cd94ef")
    public fun networkConfig(networkConfig: NetworkConfigProperty.Builder.() -> Unit) {
    }

    public fun roleArn(roleArn: String) {
    }

    public fun stoppingCondition(stoppingCondition: IResolvable) {
    }

    public fun stoppingCondition(stoppingCondition: StoppingConditionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e909dfafe37cad80211f36271ce2af0b4a0d7d536f188888a6227a3dcb1b680")
    public fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.Builder.create(scope,
        id)

    public override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    public override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    public override fun jobResources(jobResources: IResolvable) {
      cdkBuilder.jobResources(jobResources.let(IResolvable::unwrap))
    }

    public override fun jobResources(jobResources: MonitoringResourcesProperty) {
      cdkBuilder.jobResources(jobResources.let(MonitoringResourcesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f226ca59284de3a3ddf1a9d7f200591a4bfad828e4525b6260727a93eb1c1857")
    public override fun jobResources(jobResources: MonitoringResourcesProperty.Builder.() -> Unit):
        Unit = jobResources(MonitoringResourcesProperty(jobResources))

    public override fun modelBiasAppSpecification(modelBiasAppSpecification: IResolvable) {
      cdkBuilder.modelBiasAppSpecification(modelBiasAppSpecification.let(IResolvable::unwrap))
    }

    public override
        fun modelBiasAppSpecification(modelBiasAppSpecification: ModelBiasAppSpecificationProperty) {
      cdkBuilder.modelBiasAppSpecification(modelBiasAppSpecification.let(ModelBiasAppSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f78a083d8d98e5875451abd56b0b4be0ca774684927027bc3cb6a23bbf18b1bd")
    public override
        fun modelBiasAppSpecification(modelBiasAppSpecification: ModelBiasAppSpecificationProperty.Builder.() -> Unit):
        Unit =
        modelBiasAppSpecification(ModelBiasAppSpecificationProperty(modelBiasAppSpecification))

    public override fun modelBiasBaselineConfig(modelBiasBaselineConfig: IResolvable) {
      cdkBuilder.modelBiasBaselineConfig(modelBiasBaselineConfig.let(IResolvable::unwrap))
    }

    public override
        fun modelBiasBaselineConfig(modelBiasBaselineConfig: ModelBiasBaselineConfigProperty) {
      cdkBuilder.modelBiasBaselineConfig(modelBiasBaselineConfig.let(ModelBiasBaselineConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe38d516e5b9856c6b171b329ae30cc6d077c987e6e17500a1e62ad0d3b1ba6a")
    public override
        fun modelBiasBaselineConfig(modelBiasBaselineConfig: ModelBiasBaselineConfigProperty.Builder.() -> Unit):
        Unit = modelBiasBaselineConfig(ModelBiasBaselineConfigProperty(modelBiasBaselineConfig))

    public override fun modelBiasJobInput(modelBiasJobInput: IResolvable) {
      cdkBuilder.modelBiasJobInput(modelBiasJobInput.let(IResolvable::unwrap))
    }

    public override fun modelBiasJobInput(modelBiasJobInput: ModelBiasJobInputProperty) {
      cdkBuilder.modelBiasJobInput(modelBiasJobInput.let(ModelBiasJobInputProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f86e4242430b3813c716bc4c8cd23bd0faa5f2b5146072b66d4b7597a236bf6")
    public override
        fun modelBiasJobInput(modelBiasJobInput: ModelBiasJobInputProperty.Builder.() -> Unit): Unit
        = modelBiasJobInput(ModelBiasJobInputProperty(modelBiasJobInput))

    public override fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: IResolvable) {
      cdkBuilder.modelBiasJobOutputConfig(modelBiasJobOutputConfig.let(IResolvable::unwrap))
    }

    public override
        fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: MonitoringOutputConfigProperty) {
      cdkBuilder.modelBiasJobOutputConfig(modelBiasJobOutputConfig.let(MonitoringOutputConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7745870d086d1eee86de7fe656e13170b4e70362f3626b6ec8dce6c4b55b8fc")
    public override
        fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit):
        Unit = modelBiasJobOutputConfig(MonitoringOutputConfigProperty(modelBiasJobOutputConfig))

    public override fun networkConfig(networkConfig: IResolvable) {
      cdkBuilder.networkConfig(networkConfig.let(IResolvable::unwrap))
    }

    public override fun networkConfig(networkConfig: NetworkConfigProperty) {
      cdkBuilder.networkConfig(networkConfig.let(NetworkConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81069f7b758fefa66a014cba64f28fe98d06a0feda43310a371f1aa7b9cd94ef")
    public override fun networkConfig(networkConfig: NetworkConfigProperty.Builder.() -> Unit): Unit
        = networkConfig(NetworkConfigProperty(networkConfig))

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public override fun stoppingCondition(stoppingCondition: IResolvable) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(IResolvable::unwrap))
    }

    public override fun stoppingCondition(stoppingCondition: StoppingConditionProperty) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(StoppingConditionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e909dfafe37cad80211f36271ce2af0b4a0d7d536f188888a6227a3dcb1b680")
    public override
        fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit): Unit
        = stoppingCondition(StoppingConditionProperty(stoppingCondition))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnModelBiasJobDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnModelBiasJobDefinition(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition):
        CfnModelBiasJobDefinition = CfnModelBiasJobDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnModelBiasJobDefinition):
        software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition = wrapped.cdkObject
  }

  public interface MonitoringResourcesProperty {
    public fun clusterConfig(): Any

    public interface Builder {
      public fun clusterConfig(clusterConfig: IResolvable) {
      }

      public fun clusterConfig(clusterConfig: ClusterConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b497d67f2da4f390275cddce9dcbdf29f14e9107a24c41d17f534a600b687ad7")
      public fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringResourcesProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringResourcesProperty.builder()

      public override fun clusterConfig(clusterConfig: IResolvable) {
        cdkBuilder.clusterConfig(clusterConfig.let(IResolvable::unwrap))
      }

      public override fun clusterConfig(clusterConfig: ClusterConfigProperty) {
        cdkBuilder.clusterConfig(clusterConfig.let(ClusterConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b497d67f2da4f390275cddce9dcbdf29f14e9107a24c41d17f534a600b687ad7")
      public override fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit):
          Unit = clusterConfig(ClusterConfigProperty(clusterConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringResourcesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringResourcesProperty,
    ) : MonitoringResourcesProperty {
      public override fun clusterConfig(): Any = unwrap(this).getClusterConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringResourcesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringResourcesProperty):
          MonitoringResourcesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringResourcesProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringResourcesProperty
          = (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.VpcConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.VpcConfigProperty.builder()

      public override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      public override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.VpcConfigProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.VpcConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface BatchTransformInputProperty {
    public fun dataCapturedDestinationS3Uri(): String

    public fun datasetFormat(): Any

    public fun endTimeOffset(): String? = unwrap(this).getEndTimeOffset()

    public fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

    public fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

    public fun localPath(): String

    public fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

    public fun probabilityThresholdAttribute(): Number? =
        unwrap(this).getProbabilityThresholdAttribute()

    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    public fun s3InputMode(): String? = unwrap(this).getS3InputMode()

    public fun startTimeOffset(): String? = unwrap(this).getStartTimeOffset()

    public interface Builder {
      public fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String) {
      }

      public fun datasetFormat(datasetFormat: IResolvable) {
      }

      public fun datasetFormat(datasetFormat: DatasetFormatProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45a079f358b71b690e68adb1ded5b1aa47b2ef84a6255df1ed0277fa7e892c83")
      public fun datasetFormat(datasetFormat: DatasetFormatProperty.Builder.() -> Unit) {
      }

      public fun endTimeOffset(endTimeOffset: String) {
      }

      public fun featuresAttribute(featuresAttribute: String) {
      }

      public fun inferenceAttribute(inferenceAttribute: String) {
      }

      public fun localPath(localPath: String) {
      }

      public fun probabilityAttribute(probabilityAttribute: String) {
      }

      public fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number) {
      }

      public fun s3DataDistributionType(s3DataDistributionType: String) {
      }

      public fun s3InputMode(s3InputMode: String) {
      }

      public fun startTimeOffset(startTimeOffset: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.BatchTransformInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.BatchTransformInputProperty.builder()

      public override fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String) {
        cdkBuilder.dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri)
      }

      public override fun datasetFormat(datasetFormat: IResolvable) {
        cdkBuilder.datasetFormat(datasetFormat.let(IResolvable::unwrap))
      }

      public override fun datasetFormat(datasetFormat: DatasetFormatProperty) {
        cdkBuilder.datasetFormat(datasetFormat.let(DatasetFormatProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45a079f358b71b690e68adb1ded5b1aa47b2ef84a6255df1ed0277fa7e892c83")
      public override fun datasetFormat(datasetFormat: DatasetFormatProperty.Builder.() -> Unit):
          Unit = datasetFormat(DatasetFormatProperty(datasetFormat))

      public override fun endTimeOffset(endTimeOffset: String) {
        cdkBuilder.endTimeOffset(endTimeOffset)
      }

      public override fun featuresAttribute(featuresAttribute: String) {
        cdkBuilder.featuresAttribute(featuresAttribute)
      }

      public override fun inferenceAttribute(inferenceAttribute: String) {
        cdkBuilder.inferenceAttribute(inferenceAttribute)
      }

      public override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      public override fun probabilityAttribute(probabilityAttribute: String) {
        cdkBuilder.probabilityAttribute(probabilityAttribute)
      }

      public override fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number) {
        cdkBuilder.probabilityThresholdAttribute(probabilityThresholdAttribute)
      }

      public override fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
      }

      public override fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
      }

      public override fun startTimeOffset(startTimeOffset: String) {
        cdkBuilder.startTimeOffset(startTimeOffset)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.BatchTransformInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.BatchTransformInputProperty,
    ) : BatchTransformInputProperty {
      public override fun dataCapturedDestinationS3Uri(): String =
          unwrap(this).getDataCapturedDestinationS3Uri()

      public override fun datasetFormat(): Any = unwrap(this).getDatasetFormat()

      public override fun endTimeOffset(): String? = unwrap(this).getEndTimeOffset()

      public override fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

      public override fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

      public override fun localPath(): String = unwrap(this).getLocalPath()

      public override fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

      public override fun probabilityThresholdAttribute(): Number? =
          unwrap(this).getProbabilityThresholdAttribute()

      public override fun s3DataDistributionType(): String? =
          unwrap(this).getS3DataDistributionType()

      public override fun s3InputMode(): String? = unwrap(this).getS3InputMode()

      public override fun startTimeOffset(): String? = unwrap(this).getStartTimeOffset()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BatchTransformInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.BatchTransformInputProperty):
          BatchTransformInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchTransformInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.BatchTransformInputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3OutputProperty {
    public fun localPath(): String

    public fun s3UploadMode(): String? = unwrap(this).getS3UploadMode()

    public fun s3Uri(): String

    public interface Builder {
      public fun localPath(localPath: String) {
      }

      public fun s3UploadMode(s3UploadMode: String) {
      }

      public fun s3Uri(s3Uri: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.S3OutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.S3OutputProperty.builder()

      public override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      public override fun s3UploadMode(s3UploadMode: String) {
        cdkBuilder.s3UploadMode(s3UploadMode)
      }

      public override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.S3OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.S3OutputProperty,
    ) : S3OutputProperty {
      public override fun localPath(): String = unwrap(this).getLocalPath()

      public override fun s3UploadMode(): String? = unwrap(this).getS3UploadMode()

      public override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.S3OutputProperty):
          S3OutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.S3OutputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DatasetFormatProperty {
    public fun csv(): Any? = unwrap(this).getCsv()

    public fun json(): Any? = unwrap(this).getJson()

    public fun parquet(): Any? = unwrap(this).getParquet()

    public interface Builder {
      public fun csv(csv: IResolvable) {
      }

      public fun csv(csv: CsvProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("195cec24b304964968efe06f1c81405c6498e0a4b8767f58f68a42eba5148ae3")
      public fun csv(csv: CsvProperty.Builder.() -> Unit) {
      }

      public fun json(json: IResolvable) {
      }

      public fun json(json: JsonProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7988232fb64248506a915fec63c2a73b1fd2a9efbf21d8f6a25e703813aaf40e")
      public fun json(json: JsonProperty.Builder.() -> Unit) {
      }

      public fun parquet(parquet: Boolean) {
      }

      public fun parquet(parquet: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.DatasetFormatProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.DatasetFormatProperty.builder()

      public override fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv.let(IResolvable::unwrap))
      }

      public override fun csv(csv: CsvProperty) {
        cdkBuilder.csv(csv.let(CsvProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("195cec24b304964968efe06f1c81405c6498e0a4b8767f58f68a42eba5148ae3")
      public override fun csv(csv: CsvProperty.Builder.() -> Unit): Unit = csv(CsvProperty(csv))

      public override fun json(json: IResolvable) {
        cdkBuilder.json(json.let(IResolvable::unwrap))
      }

      public override fun json(json: JsonProperty) {
        cdkBuilder.json(json.let(JsonProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7988232fb64248506a915fec63c2a73b1fd2a9efbf21d8f6a25e703813aaf40e")
      public override fun json(json: JsonProperty.Builder.() -> Unit): Unit =
          json(JsonProperty(json))

      public override fun parquet(parquet: Boolean) {
        cdkBuilder.parquet(parquet)
      }

      public override fun parquet(parquet: IResolvable) {
        cdkBuilder.parquet(parquet.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.DatasetFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.DatasetFormatProperty,
    ) : DatasetFormatProperty {
      public override fun csv(): Any? = unwrap(this).getCsv()

      public override fun json(): Any? = unwrap(this).getJson()

      public override fun parquet(): Any? = unwrap(this).getParquet()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.DatasetFormatProperty):
          DatasetFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetFormatProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.DatasetFormatProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringOutputProperty {
    public fun s3Output(): Any

    public interface Builder {
      public fun s3Output(s3Output: IResolvable) {
      }

      public fun s3Output(s3Output: S3OutputProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21ad1a760a61c02052d7156cf2fa71a51b198480f71ffcf878f50a3658515415")
      public fun s3Output(s3Output: S3OutputProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputProperty.builder()

      public override fun s3Output(s3Output: IResolvable) {
        cdkBuilder.s3Output(s3Output.let(IResolvable::unwrap))
      }

      public override fun s3Output(s3Output: S3OutputProperty) {
        cdkBuilder.s3Output(s3Output.let(S3OutputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21ad1a760a61c02052d7156cf2fa71a51b198480f71ffcf878f50a3658515415")
      public override fun s3Output(s3Output: S3OutputProperty.Builder.() -> Unit): Unit =
          s3Output(S3OutputProperty(s3Output))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputProperty,
    ) : MonitoringOutputProperty {
      public override fun s3Output(): Any = unwrap(this).getS3Output()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputProperty):
          MonitoringOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringOutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ModelBiasAppSpecificationProperty {
    public fun configUri(): String

    public fun environment(): Any? = unwrap(this).getEnvironment()

    public fun imageUri(): String

    public interface Builder {
      public fun configUri(configUri: String) {
      }

      public fun environment(environment: IResolvable) {
      }

      public fun environment(environment: Map<String, String>) {
      }

      public fun imageUri(imageUri: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty.builder()

      public override fun configUri(configUri: String) {
        cdkBuilder.configUri(configUri)
      }

      public override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      public override fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
      }

      public override fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty,
    ) : ModelBiasAppSpecificationProperty {
      public override fun configUri(): String = unwrap(this).getConfigUri()

      public override fun environment(): Any? = unwrap(this).getEnvironment()

      public override fun imageUri(): String = unwrap(this).getImageUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ModelBiasAppSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty):
          ModelBiasAppSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelBiasAppSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CsvProperty {
    public fun `header`(): Any? = unwrap(this).getHeader()

    public interface Builder {
      public fun `header`(`header`: Boolean) {
      }

      public fun `header`(`header`: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.CsvProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.CsvProperty.builder()

      public override fun `header`(`header`: Boolean) {
        cdkBuilder.`header`(`header`)
      }

      public override fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.CsvProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.CsvProperty,
    ) : CsvProperty {
      public override fun `header`(): Any? = unwrap(this).getHeader()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CsvProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.CsvProperty):
          CsvProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.CsvProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface StoppingConditionProperty {
    public fun maxRuntimeInSeconds(): Number

    public interface Builder {
      public fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.StoppingConditionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.StoppingConditionProperty.builder()

      public override fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number) {
        cdkBuilder.maxRuntimeInSeconds(maxRuntimeInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.StoppingConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.StoppingConditionProperty,
    ) : StoppingConditionProperty {
      public override fun maxRuntimeInSeconds(): Number = unwrap(this).getMaxRuntimeInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StoppingConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.StoppingConditionProperty):
          StoppingConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StoppingConditionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.StoppingConditionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ModelBiasBaselineConfigProperty {
    public fun baseliningJobName(): String? = unwrap(this).getBaseliningJobName()

    public fun constraintsResource(): Any? = unwrap(this).getConstraintsResource()

    public interface Builder {
      public fun baseliningJobName(baseliningJobName: String) {
      }

      public fun constraintsResource(constraintsResource: IResolvable) {
      }

      public fun constraintsResource(constraintsResource: ConstraintsResourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7db8978b9380d98954275ce3b4515ce0398cb0a341077a54f637d5443065de4a")
      public
          fun constraintsResource(constraintsResource: ConstraintsResourceProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty.builder()

      public override fun baseliningJobName(baseliningJobName: String) {
        cdkBuilder.baseliningJobName(baseliningJobName)
      }

      public override fun constraintsResource(constraintsResource: IResolvable) {
        cdkBuilder.constraintsResource(constraintsResource.let(IResolvable::unwrap))
      }

      public override fun constraintsResource(constraintsResource: ConstraintsResourceProperty) {
        cdkBuilder.constraintsResource(constraintsResource.let(ConstraintsResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7db8978b9380d98954275ce3b4515ce0398cb0a341077a54f637d5443065de4a")
      public override
          fun constraintsResource(constraintsResource: ConstraintsResourceProperty.Builder.() -> Unit):
          Unit = constraintsResource(ConstraintsResourceProperty(constraintsResource))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty,
    ) : ModelBiasBaselineConfigProperty {
      public override fun baseliningJobName(): String? = unwrap(this).getBaseliningJobName()

      public override fun constraintsResource(): Any? = unwrap(this).getConstraintsResource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ModelBiasBaselineConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty):
          ModelBiasBaselineConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelBiasBaselineConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ClusterConfigProperty {
    public fun instanceCount(): Number

    public fun instanceType(): String

    public fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

    public fun volumeSizeInGb(): Number

    public interface Builder {
      public fun instanceCount(instanceCount: Number) {
      }

      public fun instanceType(instanceType: String) {
      }

      public fun volumeKmsKeyId(volumeKmsKeyId: String) {
      }

      public fun volumeSizeInGb(volumeSizeInGb: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ClusterConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ClusterConfigProperty.builder()

      public override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      public override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      public override fun volumeKmsKeyId(volumeKmsKeyId: String) {
        cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
      }

      public override fun volumeSizeInGb(volumeSizeInGb: Number) {
        cdkBuilder.volumeSizeInGb(volumeSizeInGb)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ClusterConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ClusterConfigProperty,
    ) : ClusterConfigProperty {
      public override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      public override fun instanceType(): String = unwrap(this).getInstanceType()

      public override fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

      public override fun volumeSizeInGb(): Number = unwrap(this).getVolumeSizeInGb()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ClusterConfigProperty):
          ClusterConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ClusterConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringGroundTruthS3InputProperty {
    public fun s3Uri(): String

    public interface Builder {
      public fun s3Uri(s3Uri: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty.builder()

      public override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty,
    ) : MonitoringGroundTruthS3InputProperty {
      public override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MonitoringGroundTruthS3InputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty):
          MonitoringGroundTruthS3InputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringGroundTruthS3InputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface JsonProperty {
    public fun line(): Any? = unwrap(this).getLine()

    public interface Builder {
      public fun line(line: Boolean) {
      }

      public fun line(line: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.JsonProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.JsonProperty.builder()

      public override fun line(line: Boolean) {
        cdkBuilder.line(line)
      }

      public override fun line(line: IResolvable) {
        cdkBuilder.line(line.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.JsonProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.JsonProperty,
    ) : JsonProperty {
      public override fun line(): Any? = unwrap(this).getLine()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JsonProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.JsonProperty):
          JsonProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.JsonProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringOutputConfigProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun monitoringOutputs(): Any

    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String) {
      }

      public fun monitoringOutputs(monitoringOutputs: IResolvable) {
      }

      public fun monitoringOutputs(monitoringOutputs: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputConfigProperty.builder()

      public override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public override fun monitoringOutputs(monitoringOutputs: IResolvable) {
        cdkBuilder.monitoringOutputs(monitoringOutputs.let(IResolvable::unwrap))
      }

      public override fun monitoringOutputs(monitoringOutputs: List<Any>) {
        cdkBuilder.monitoringOutputs(monitoringOutputs)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputConfigProperty,
    ) : MonitoringOutputConfigProperty {
      public override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      public override fun monitoringOutputs(): Any = unwrap(this).getMonitoringOutputs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringOutputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputConfigProperty):
          MonitoringOutputConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringOutputConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ModelBiasJobInputProperty {
    public fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

    public fun endpointInput(): Any? = unwrap(this).getEndpointInput()

    public fun groundTruthS3Input(): Any

    public interface Builder {
      public fun batchTransformInput(batchTransformInput: IResolvable) {
      }

      public fun batchTransformInput(batchTransformInput: BatchTransformInputProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d3a1667e92d80c3843ff106b6efe0b2cfbf7f34631923e8aecf8348587390d16")
      public
          fun batchTransformInput(batchTransformInput: BatchTransformInputProperty.Builder.() -> Unit) {
      }

      public fun endpointInput(endpointInput: IResolvable) {
      }

      public fun endpointInput(endpointInput: EndpointInputProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("34134cc5199dc7d79264f42ef249693653d094510ce22e1198212696e0d37c71")
      public fun endpointInput(endpointInput: EndpointInputProperty.Builder.() -> Unit) {
      }

      public fun groundTruthS3Input(groundTruthS3Input: IResolvable) {
      }

      public fun groundTruthS3Input(groundTruthS3Input: MonitoringGroundTruthS3InputProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24f06c742ad28842ed4af67298038e5e8ce7583a56d7b45c59ca4620e9cfed65")
      public
          fun groundTruthS3Input(groundTruthS3Input: MonitoringGroundTruthS3InputProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty.builder()

      public override fun batchTransformInput(batchTransformInput: IResolvable) {
        cdkBuilder.batchTransformInput(batchTransformInput.let(IResolvable::unwrap))
      }

      public override fun batchTransformInput(batchTransformInput: BatchTransformInputProperty) {
        cdkBuilder.batchTransformInput(batchTransformInput.let(BatchTransformInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d3a1667e92d80c3843ff106b6efe0b2cfbf7f34631923e8aecf8348587390d16")
      public override
          fun batchTransformInput(batchTransformInput: BatchTransformInputProperty.Builder.() -> Unit):
          Unit = batchTransformInput(BatchTransformInputProperty(batchTransformInput))

      public override fun endpointInput(endpointInput: IResolvable) {
        cdkBuilder.endpointInput(endpointInput.let(IResolvable::unwrap))
      }

      public override fun endpointInput(endpointInput: EndpointInputProperty) {
        cdkBuilder.endpointInput(endpointInput.let(EndpointInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("34134cc5199dc7d79264f42ef249693653d094510ce22e1198212696e0d37c71")
      public override fun endpointInput(endpointInput: EndpointInputProperty.Builder.() -> Unit):
          Unit = endpointInput(EndpointInputProperty(endpointInput))

      public override fun groundTruthS3Input(groundTruthS3Input: IResolvable) {
        cdkBuilder.groundTruthS3Input(groundTruthS3Input.let(IResolvable::unwrap))
      }

      public override
          fun groundTruthS3Input(groundTruthS3Input: MonitoringGroundTruthS3InputProperty) {
        cdkBuilder.groundTruthS3Input(groundTruthS3Input.let(MonitoringGroundTruthS3InputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24f06c742ad28842ed4af67298038e5e8ce7583a56d7b45c59ca4620e9cfed65")
      public override
          fun groundTruthS3Input(groundTruthS3Input: MonitoringGroundTruthS3InputProperty.Builder.() -> Unit):
          Unit = groundTruthS3Input(MonitoringGroundTruthS3InputProperty(groundTruthS3Input))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty,
    ) : ModelBiasJobInputProperty {
      public override fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

      public override fun endpointInput(): Any? = unwrap(this).getEndpointInput()

      public override fun groundTruthS3Input(): Any = unwrap(this).getGroundTruthS3Input()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ModelBiasJobInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty):
          ModelBiasJobInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelBiasJobInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EndpointInputProperty {
    public fun endTimeOffset(): String? = unwrap(this).getEndTimeOffset()

    public fun endpointName(): String

    public fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

    public fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

    public fun localPath(): String

    public fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

    public fun probabilityThresholdAttribute(): Number? =
        unwrap(this).getProbabilityThresholdAttribute()

    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    public fun s3InputMode(): String? = unwrap(this).getS3InputMode()

    public fun startTimeOffset(): String? = unwrap(this).getStartTimeOffset()

    public interface Builder {
      public fun endTimeOffset(endTimeOffset: String) {
      }

      public fun endpointName(endpointName: String) {
      }

      public fun featuresAttribute(featuresAttribute: String) {
      }

      public fun inferenceAttribute(inferenceAttribute: String) {
      }

      public fun localPath(localPath: String) {
      }

      public fun probabilityAttribute(probabilityAttribute: String) {
      }

      public fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number) {
      }

      public fun s3DataDistributionType(s3DataDistributionType: String) {
      }

      public fun s3InputMode(s3InputMode: String) {
      }

      public fun startTimeOffset(startTimeOffset: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.EndpointInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.EndpointInputProperty.builder()

      public override fun endTimeOffset(endTimeOffset: String) {
        cdkBuilder.endTimeOffset(endTimeOffset)
      }

      public override fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
      }

      public override fun featuresAttribute(featuresAttribute: String) {
        cdkBuilder.featuresAttribute(featuresAttribute)
      }

      public override fun inferenceAttribute(inferenceAttribute: String) {
        cdkBuilder.inferenceAttribute(inferenceAttribute)
      }

      public override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      public override fun probabilityAttribute(probabilityAttribute: String) {
        cdkBuilder.probabilityAttribute(probabilityAttribute)
      }

      public override fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number) {
        cdkBuilder.probabilityThresholdAttribute(probabilityThresholdAttribute)
      }

      public override fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
      }

      public override fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
      }

      public override fun startTimeOffset(startTimeOffset: String) {
        cdkBuilder.startTimeOffset(startTimeOffset)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.EndpointInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.EndpointInputProperty,
    ) : EndpointInputProperty {
      public override fun endTimeOffset(): String? = unwrap(this).getEndTimeOffset()

      public override fun endpointName(): String = unwrap(this).getEndpointName()

      public override fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

      public override fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

      public override fun localPath(): String = unwrap(this).getLocalPath()

      public override fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

      public override fun probabilityThresholdAttribute(): Number? =
          unwrap(this).getProbabilityThresholdAttribute()

      public override fun s3DataDistributionType(): String? =
          unwrap(this).getS3DataDistributionType()

      public override fun s3InputMode(): String? = unwrap(this).getS3InputMode()

      public override fun startTimeOffset(): String? = unwrap(this).getStartTimeOffset()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.EndpointInputProperty):
          EndpointInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.EndpointInputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface NetworkConfigProperty {
    public fun enableInterContainerTrafficEncryption(): Any? =
        unwrap(this).getEnableInterContainerTrafficEncryption()

    public fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

    public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

    public interface Builder {
      public
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: Boolean) {
      }

      public
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: IResolvable) {
      }

      public fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
      }

      public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
      }

      public fun vpcConfig(vpcConfig: IResolvable) {
      }

      public fun vpcConfig(vpcConfig: VpcConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("753d272102c0882cbd4bea22635ae8f2c4348bf9fc0838c541ad1ba0d02456ec")
      public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.NetworkConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.NetworkConfigProperty.builder()

      public override
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: Boolean) {
        cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption)
      }

      public override
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: IResolvable) {
        cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption.let(IResolvable::unwrap))
      }

      public override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
        cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
      }

      public override fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
        cdkBuilder.enableNetworkIsolation(enableNetworkIsolation.let(IResolvable::unwrap))
      }

      public override fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
      }

      public override fun vpcConfig(vpcConfig: VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("753d272102c0882cbd4bea22635ae8f2c4348bf9fc0838c541ad1ba0d02456ec")
      public override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
          vpcConfig(VpcConfigProperty(vpcConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.NetworkConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.NetworkConfigProperty,
    ) : NetworkConfigProperty {
      public override fun enableInterContainerTrafficEncryption(): Any? =
          unwrap(this).getEnableInterContainerTrafficEncryption()

      public override fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

      public override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.NetworkConfigProperty):
          NetworkConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.NetworkConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConstraintsResourceProperty {
    public fun s3Uri(): String? = unwrap(this).getS3Uri()

    public interface Builder {
      public fun s3Uri(s3Uri: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ConstraintsResourceProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ConstraintsResourceProperty.builder()

      public override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ConstraintsResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ConstraintsResourceProperty,
    ) : ConstraintsResourceProperty {
      public override fun s3Uri(): String? = unwrap(this).getS3Uri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConstraintsResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ConstraintsResourceProperty):
          ConstraintsResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConstraintsResourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ConstraintsResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
