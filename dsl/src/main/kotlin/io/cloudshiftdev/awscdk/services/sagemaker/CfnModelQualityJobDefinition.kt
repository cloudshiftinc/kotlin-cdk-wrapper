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

public open class CfnModelQualityJobDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition,
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
  @JvmName("b894c094d11ff80a26d320cce2367897a7251ae67144a3ae69ccd7b775374d22")
  public open fun jobResources(`value`: MonitoringResourcesProperty.Builder.() -> Unit): Unit =
      jobResources(MonitoringResourcesProperty(`value`))

  public open fun modelQualityAppSpecification(): Any =
      unwrap(this).getModelQualityAppSpecification()

  public open fun modelQualityAppSpecification(`value`: IResolvable) {
    unwrap(this).setModelQualityAppSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun modelQualityAppSpecification(`value`: ModelQualityAppSpecificationProperty) {
    unwrap(this).setModelQualityAppSpecification(`value`.let(ModelQualityAppSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5241d007c80f786f18e2cca55fa53db3310331217bb0329a059048b73be5743a")
  public open
      fun modelQualityAppSpecification(`value`: ModelQualityAppSpecificationProperty.Builder.() -> Unit):
      Unit = modelQualityAppSpecification(ModelQualityAppSpecificationProperty(`value`))

  public open fun modelQualityBaselineConfig(): Any? = unwrap(this).getModelQualityBaselineConfig()

  public open fun modelQualityBaselineConfig(`value`: IResolvable) {
    unwrap(this).setModelQualityBaselineConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun modelQualityBaselineConfig(`value`: ModelQualityBaselineConfigProperty) {
    unwrap(this).setModelQualityBaselineConfig(`value`.let(ModelQualityBaselineConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9585b0358b2ba7da64a4675209ee59adffe066fa778a069a986637bd083e910d")
  public open
      fun modelQualityBaselineConfig(`value`: ModelQualityBaselineConfigProperty.Builder.() -> Unit):
      Unit = modelQualityBaselineConfig(ModelQualityBaselineConfigProperty(`value`))

  public open fun modelQualityJobInput(): Any = unwrap(this).getModelQualityJobInput()

  public open fun modelQualityJobInput(`value`: IResolvable) {
    unwrap(this).setModelQualityJobInput(`value`.let(IResolvable::unwrap))
  }

  public open fun modelQualityJobInput(`value`: ModelQualityJobInputProperty) {
    unwrap(this).setModelQualityJobInput(`value`.let(ModelQualityJobInputProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("82181c2f828e7869b40eb0c0fb5d9b539de3265bc633d3c49c4641f8ec561a91")
  public open fun modelQualityJobInput(`value`: ModelQualityJobInputProperty.Builder.() -> Unit):
      Unit = modelQualityJobInput(ModelQualityJobInputProperty(`value`))

  public open fun modelQualityJobOutputConfig(): Any = unwrap(this).getModelQualityJobOutputConfig()

  public open fun modelQualityJobOutputConfig(`value`: IResolvable) {
    unwrap(this).setModelQualityJobOutputConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun modelQualityJobOutputConfig(`value`: MonitoringOutputConfigProperty) {
    unwrap(this).setModelQualityJobOutputConfig(`value`.let(MonitoringOutputConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8aa95ca2cda6f837962f1d231aa63cff158751d650becb089ea636345c659763")
  public open
      fun modelQualityJobOutputConfig(`value`: MonitoringOutputConfigProperty.Builder.() -> Unit):
      Unit = modelQualityJobOutputConfig(MonitoringOutputConfigProperty(`value`))

  public open fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

  public open fun networkConfig(`value`: IResolvable) {
    unwrap(this).setNetworkConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun networkConfig(`value`: NetworkConfigProperty) {
    unwrap(this).setNetworkConfig(`value`.let(NetworkConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a78fc6fd59e38271e027e2227fe0426fe149fd12c2b966ab05a9fa369c16bd29")
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
  @JvmName("6e7fff0640a7f858cc53212f40593a005b9e5c130cbaffae05e4207f27f65af7")
  public open fun stoppingCondition(`value`: StoppingConditionProperty.Builder.() -> Unit): Unit =
      stoppingCondition(StoppingConditionProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun endpointName(endpointName: String)

    public fun jobDefinitionName(jobDefinitionName: String)

    public fun jobResources(jobResources: IResolvable)

    public fun jobResources(jobResources: MonitoringResourcesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17d4558e04d008184853dbf26eba288cb406cc08b677c61828bb398018a1ef85")
    public fun jobResources(jobResources: MonitoringResourcesProperty.Builder.() -> Unit)

    public fun modelQualityAppSpecification(modelQualityAppSpecification: IResolvable)

    public
        fun modelQualityAppSpecification(modelQualityAppSpecification: ModelQualityAppSpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d73f31546d43f21775bf2254d7d1ffabd0be5070d6460b79106404b13bc6362")
    public
        fun modelQualityAppSpecification(modelQualityAppSpecification: ModelQualityAppSpecificationProperty.Builder.() -> Unit)

    public fun modelQualityBaselineConfig(modelQualityBaselineConfig: IResolvable)

    public
        fun modelQualityBaselineConfig(modelQualityBaselineConfig: ModelQualityBaselineConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c67bfd822f34cefb8d14eb096fcf4acab791e9005d75231d7dea0413435d61a")
    public
        fun modelQualityBaselineConfig(modelQualityBaselineConfig: ModelQualityBaselineConfigProperty.Builder.() -> Unit)

    public fun modelQualityJobInput(modelQualityJobInput: IResolvable)

    public fun modelQualityJobInput(modelQualityJobInput: ModelQualityJobInputProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a75fc308bff9dc0645d582b5c98d508de23f1bfb3e137d33357cca5d0d55a1a6")
    public
        fun modelQualityJobInput(modelQualityJobInput: ModelQualityJobInputProperty.Builder.() -> Unit)

    public fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: IResolvable)

    public
        fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: MonitoringOutputConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0745cc72873b2935e44f42771ed7c24b7276a502cfd9044a8bd494dd465faaa5")
    public
        fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit)

    public fun networkConfig(networkConfig: IResolvable)

    public fun networkConfig(networkConfig: NetworkConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bc3bfe6fdda3e81e3cd68d4c50b29e2804c7d422c039fae94304aee9556a046")
    public fun networkConfig(networkConfig: NetworkConfigProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun stoppingCondition(stoppingCondition: IResolvable)

    public fun stoppingCondition(stoppingCondition: StoppingConditionProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("492ffcf2378a1da21aa8145bc7b7fb0294482684660e93fb5341b4e6d34e8264")
    public fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.Builder.create(scope,
        id)

    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    override fun jobResources(jobResources: IResolvable) {
      cdkBuilder.jobResources(jobResources.let(IResolvable::unwrap))
    }

    override fun jobResources(jobResources: MonitoringResourcesProperty) {
      cdkBuilder.jobResources(jobResources.let(MonitoringResourcesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17d4558e04d008184853dbf26eba288cb406cc08b677c61828bb398018a1ef85")
    override fun jobResources(jobResources: MonitoringResourcesProperty.Builder.() -> Unit): Unit =
        jobResources(MonitoringResourcesProperty(jobResources))

    override fun modelQualityAppSpecification(modelQualityAppSpecification: IResolvable) {
      cdkBuilder.modelQualityAppSpecification(modelQualityAppSpecification.let(IResolvable::unwrap))
    }

    override
        fun modelQualityAppSpecification(modelQualityAppSpecification: ModelQualityAppSpecificationProperty) {
      cdkBuilder.modelQualityAppSpecification(modelQualityAppSpecification.let(ModelQualityAppSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d73f31546d43f21775bf2254d7d1ffabd0be5070d6460b79106404b13bc6362")
    override
        fun modelQualityAppSpecification(modelQualityAppSpecification: ModelQualityAppSpecificationProperty.Builder.() -> Unit):
        Unit =
        modelQualityAppSpecification(ModelQualityAppSpecificationProperty(modelQualityAppSpecification))

    override fun modelQualityBaselineConfig(modelQualityBaselineConfig: IResolvable) {
      cdkBuilder.modelQualityBaselineConfig(modelQualityBaselineConfig.let(IResolvable::unwrap))
    }

    override
        fun modelQualityBaselineConfig(modelQualityBaselineConfig: ModelQualityBaselineConfigProperty) {
      cdkBuilder.modelQualityBaselineConfig(modelQualityBaselineConfig.let(ModelQualityBaselineConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c67bfd822f34cefb8d14eb096fcf4acab791e9005d75231d7dea0413435d61a")
    override
        fun modelQualityBaselineConfig(modelQualityBaselineConfig: ModelQualityBaselineConfigProperty.Builder.() -> Unit):
        Unit =
        modelQualityBaselineConfig(ModelQualityBaselineConfigProperty(modelQualityBaselineConfig))

    override fun modelQualityJobInput(modelQualityJobInput: IResolvable) {
      cdkBuilder.modelQualityJobInput(modelQualityJobInput.let(IResolvable::unwrap))
    }

    override fun modelQualityJobInput(modelQualityJobInput: ModelQualityJobInputProperty) {
      cdkBuilder.modelQualityJobInput(modelQualityJobInput.let(ModelQualityJobInputProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a75fc308bff9dc0645d582b5c98d508de23f1bfb3e137d33357cca5d0d55a1a6")
    override
        fun modelQualityJobInput(modelQualityJobInput: ModelQualityJobInputProperty.Builder.() -> Unit):
        Unit = modelQualityJobInput(ModelQualityJobInputProperty(modelQualityJobInput))

    override fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: IResolvable) {
      cdkBuilder.modelQualityJobOutputConfig(modelQualityJobOutputConfig.let(IResolvable::unwrap))
    }

    override
        fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: MonitoringOutputConfigProperty) {
      cdkBuilder.modelQualityJobOutputConfig(modelQualityJobOutputConfig.let(MonitoringOutputConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0745cc72873b2935e44f42771ed7c24b7276a502cfd9044a8bd494dd465faaa5")
    override
        fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit):
        Unit =
        modelQualityJobOutputConfig(MonitoringOutputConfigProperty(modelQualityJobOutputConfig))

    override fun networkConfig(networkConfig: IResolvable) {
      cdkBuilder.networkConfig(networkConfig.let(IResolvable::unwrap))
    }

    override fun networkConfig(networkConfig: NetworkConfigProperty) {
      cdkBuilder.networkConfig(networkConfig.let(NetworkConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bc3bfe6fdda3e81e3cd68d4c50b29e2804c7d422c039fae94304aee9556a046")
    override fun networkConfig(networkConfig: NetworkConfigProperty.Builder.() -> Unit): Unit =
        networkConfig(NetworkConfigProperty(networkConfig))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun stoppingCondition(stoppingCondition: IResolvable) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(IResolvable::unwrap))
    }

    override fun stoppingCondition(stoppingCondition: StoppingConditionProperty) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(StoppingConditionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("492ffcf2378a1da21aa8145bc7b7fb0294482684660e93fb5341b4e6d34e8264")
    override fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit):
        Unit = stoppingCondition(StoppingConditionProperty(stoppingCondition))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnModelQualityJobDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnModelQualityJobDefinition(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition):
        CfnModelQualityJobDefinition = CfnModelQualityJobDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnModelQualityJobDefinition):
        software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition = wrapped.cdkObject
  }

  public interface EndpointInputProperty {
    public fun endTimeOffset(): String? = unwrap(this).getEndTimeOffset()

    public fun endpointName(): String

    public fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

    public fun localPath(): String

    public fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

    public fun probabilityThresholdAttribute(): Number? =
        unwrap(this).getProbabilityThresholdAttribute()

    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    public fun s3InputMode(): String? = unwrap(this).getS3InputMode()

    public fun startTimeOffset(): String? = unwrap(this).getStartTimeOffset()

    public interface Builder {
      public fun endTimeOffset(endTimeOffset: String)

      public fun endpointName(endpointName: String)

      public fun inferenceAttribute(inferenceAttribute: String)

      public fun localPath(localPath: String)

      public fun probabilityAttribute(probabilityAttribute: String)

      public fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number)

      public fun s3DataDistributionType(s3DataDistributionType: String)

      public fun s3InputMode(s3InputMode: String)

      public fun startTimeOffset(startTimeOffset: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.EndpointInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.EndpointInputProperty.builder()

      override fun endTimeOffset(endTimeOffset: String) {
        cdkBuilder.endTimeOffset(endTimeOffset)
      }

      override fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
      }

      override fun inferenceAttribute(inferenceAttribute: String) {
        cdkBuilder.inferenceAttribute(inferenceAttribute)
      }

      override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      override fun probabilityAttribute(probabilityAttribute: String) {
        cdkBuilder.probabilityAttribute(probabilityAttribute)
      }

      override fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number) {
        cdkBuilder.probabilityThresholdAttribute(probabilityThresholdAttribute)
      }

      override fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
      }

      override fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
      }

      override fun startTimeOffset(startTimeOffset: String) {
        cdkBuilder.startTimeOffset(startTimeOffset)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.EndpointInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.EndpointInputProperty,
    ) : EndpointInputProperty {
      override fun endTimeOffset(): String? = unwrap(this).getEndTimeOffset()

      override fun endpointName(): String = unwrap(this).getEndpointName()

      override fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

      override fun localPath(): String = unwrap(this).getLocalPath()

      override fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

      override fun probabilityThresholdAttribute(): Number? =
          unwrap(this).getProbabilityThresholdAttribute()

      override fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

      override fun s3InputMode(): String? = unwrap(this).getS3InputMode()

      override fun startTimeOffset(): String? = unwrap(this).getStartTimeOffset()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.EndpointInputProperty):
          EndpointInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.EndpointInputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ModelQualityAppSpecificationProperty {
    public fun containerArguments(): List<String> = unwrap(this).getContainerArguments() ?:
        emptyList()

    public fun containerEntrypoint(): List<String> = unwrap(this).getContainerEntrypoint() ?:
        emptyList()

    public fun environment(): Any? = unwrap(this).getEnvironment()

    public fun imageUri(): String

    public fun postAnalyticsProcessorSourceUri(): String? =
        unwrap(this).getPostAnalyticsProcessorSourceUri()

    public fun problemType(): String

    public fun recordPreprocessorSourceUri(): String? =
        unwrap(this).getRecordPreprocessorSourceUri()

    public interface Builder {
      public fun containerArguments(containerArguments: List<String>)

      public fun containerArguments(vararg containerArguments: String)

      public fun containerEntrypoint(containerEntrypoint: List<String>)

      public fun containerEntrypoint(vararg containerEntrypoint: String)

      public fun environment(environment: IResolvable)

      public fun environment(environment: Map<String, String>)

      public fun imageUri(imageUri: String)

      public fun postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri: String)

      public fun problemType(problemType: String)

      public fun recordPreprocessorSourceUri(recordPreprocessorSourceUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty.builder()

      override fun containerArguments(containerArguments: List<String>) {
        cdkBuilder.containerArguments(containerArguments)
      }

      override fun containerArguments(vararg containerArguments: String): Unit =
          containerArguments(containerArguments.toList())

      override fun containerEntrypoint(containerEntrypoint: List<String>) {
        cdkBuilder.containerEntrypoint(containerEntrypoint)
      }

      override fun containerEntrypoint(vararg containerEntrypoint: String): Unit =
          containerEntrypoint(containerEntrypoint.toList())

      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      override fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
      }

      override fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
      }

      override fun postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri: String) {
        cdkBuilder.postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri)
      }

      override fun problemType(problemType: String) {
        cdkBuilder.problemType(problemType)
      }

      override fun recordPreprocessorSourceUri(recordPreprocessorSourceUri: String) {
        cdkBuilder.recordPreprocessorSourceUri(recordPreprocessorSourceUri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty,
    ) : ModelQualityAppSpecificationProperty {
      override fun containerArguments(): List<String> = unwrap(this).getContainerArguments() ?:
          emptyList()

      override fun containerEntrypoint(): List<String> = unwrap(this).getContainerEntrypoint() ?:
          emptyList()

      override fun environment(): Any? = unwrap(this).getEnvironment()

      override fun imageUri(): String = unwrap(this).getImageUri()

      override fun postAnalyticsProcessorSourceUri(): String? =
          unwrap(this).getPostAnalyticsProcessorSourceUri()

      override fun problemType(): String = unwrap(this).getProblemType()

      override fun recordPreprocessorSourceUri(): String? =
          unwrap(this).getRecordPreprocessorSourceUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ModelQualityAppSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty):
          ModelQualityAppSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelQualityAppSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ClusterConfigProperty {
    public fun instanceCount(): Number

    public fun instanceType(): String

    public fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

    public fun volumeSizeInGb(): Number

    public interface Builder {
      public fun instanceCount(instanceCount: Number)

      public fun instanceType(instanceType: String)

      public fun volumeKmsKeyId(volumeKmsKeyId: String)

      public fun volumeSizeInGb(volumeSizeInGb: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ClusterConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ClusterConfigProperty.builder()

      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun volumeKmsKeyId(volumeKmsKeyId: String) {
        cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
      }

      override fun volumeSizeInGb(volumeSizeInGb: Number) {
        cdkBuilder.volumeSizeInGb(volumeSizeInGb)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ClusterConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ClusterConfigProperty,
    ) : ClusterConfigProperty {
      override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      override fun instanceType(): String = unwrap(this).getInstanceType()

      override fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

      override fun volumeSizeInGb(): Number = unwrap(this).getVolumeSizeInGb()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ClusterConfigProperty):
          ClusterConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ClusterConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ModelQualityBaselineConfigProperty {
    public fun baseliningJobName(): String? = unwrap(this).getBaseliningJobName()

    public fun constraintsResource(): Any? = unwrap(this).getConstraintsResource()

    public interface Builder {
      public fun baseliningJobName(baseliningJobName: String)

      public fun constraintsResource(constraintsResource: IResolvable)

      public fun constraintsResource(constraintsResource: ConstraintsResourceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("945a966ddf16d5853bdc6ec099011802c4023515328fefceefe815ef1fa1c110")
      public
          fun constraintsResource(constraintsResource: ConstraintsResourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty.builder()

      override fun baseliningJobName(baseliningJobName: String) {
        cdkBuilder.baseliningJobName(baseliningJobName)
      }

      override fun constraintsResource(constraintsResource: IResolvable) {
        cdkBuilder.constraintsResource(constraintsResource.let(IResolvable::unwrap))
      }

      override fun constraintsResource(constraintsResource: ConstraintsResourceProperty) {
        cdkBuilder.constraintsResource(constraintsResource.let(ConstraintsResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("945a966ddf16d5853bdc6ec099011802c4023515328fefceefe815ef1fa1c110")
      override
          fun constraintsResource(constraintsResource: ConstraintsResourceProperty.Builder.() -> Unit):
          Unit = constraintsResource(ConstraintsResourceProperty(constraintsResource))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty,
    ) : ModelQualityBaselineConfigProperty {
      override fun baseliningJobName(): String? = unwrap(this).getBaseliningJobName()

      override fun constraintsResource(): Any? = unwrap(this).getConstraintsResource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ModelQualityBaselineConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty):
          ModelQualityBaselineConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelQualityBaselineConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringGroundTruthS3InputProperty {
    public fun s3Uri(): String

    public interface Builder {
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty.builder()

      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty,
    ) : MonitoringGroundTruthS3InputProperty {
      override fun s3Uri(): String = unwrap(this).getS3Uri()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty):
          MonitoringGroundTruthS3InputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringGroundTruthS3InputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BatchTransformInputProperty {
    public fun dataCapturedDestinationS3Uri(): String

    public fun datasetFormat(): Any

    public fun endTimeOffset(): String? = unwrap(this).getEndTimeOffset()

    public fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

    public fun localPath(): String

    public fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

    public fun probabilityThresholdAttribute(): Number? =
        unwrap(this).getProbabilityThresholdAttribute()

    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    public fun s3InputMode(): String? = unwrap(this).getS3InputMode()

    public fun startTimeOffset(): String? = unwrap(this).getStartTimeOffset()

    public interface Builder {
      public fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String)

      public fun datasetFormat(datasetFormat: IResolvable)

      public fun datasetFormat(datasetFormat: DatasetFormatProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27387335d2a360eb7f2594f4d92ab11a62154e63c2687e102772fc6b98dbf674")
      public fun datasetFormat(datasetFormat: DatasetFormatProperty.Builder.() -> Unit)

      public fun endTimeOffset(endTimeOffset: String)

      public fun inferenceAttribute(inferenceAttribute: String)

      public fun localPath(localPath: String)

      public fun probabilityAttribute(probabilityAttribute: String)

      public fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number)

      public fun s3DataDistributionType(s3DataDistributionType: String)

      public fun s3InputMode(s3InputMode: String)

      public fun startTimeOffset(startTimeOffset: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.BatchTransformInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.BatchTransformInputProperty.builder()

      override fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String) {
        cdkBuilder.dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri)
      }

      override fun datasetFormat(datasetFormat: IResolvable) {
        cdkBuilder.datasetFormat(datasetFormat.let(IResolvable::unwrap))
      }

      override fun datasetFormat(datasetFormat: DatasetFormatProperty) {
        cdkBuilder.datasetFormat(datasetFormat.let(DatasetFormatProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27387335d2a360eb7f2594f4d92ab11a62154e63c2687e102772fc6b98dbf674")
      override fun datasetFormat(datasetFormat: DatasetFormatProperty.Builder.() -> Unit): Unit =
          datasetFormat(DatasetFormatProperty(datasetFormat))

      override fun endTimeOffset(endTimeOffset: String) {
        cdkBuilder.endTimeOffset(endTimeOffset)
      }

      override fun inferenceAttribute(inferenceAttribute: String) {
        cdkBuilder.inferenceAttribute(inferenceAttribute)
      }

      override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      override fun probabilityAttribute(probabilityAttribute: String) {
        cdkBuilder.probabilityAttribute(probabilityAttribute)
      }

      override fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number) {
        cdkBuilder.probabilityThresholdAttribute(probabilityThresholdAttribute)
      }

      override fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
      }

      override fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
      }

      override fun startTimeOffset(startTimeOffset: String) {
        cdkBuilder.startTimeOffset(startTimeOffset)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.BatchTransformInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.BatchTransformInputProperty,
    ) : BatchTransformInputProperty {
      override fun dataCapturedDestinationS3Uri(): String =
          unwrap(this).getDataCapturedDestinationS3Uri()

      override fun datasetFormat(): Any = unwrap(this).getDatasetFormat()

      override fun endTimeOffset(): String? = unwrap(this).getEndTimeOffset()

      override fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

      override fun localPath(): String = unwrap(this).getLocalPath()

      override fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

      override fun probabilityThresholdAttribute(): Number? =
          unwrap(this).getProbabilityThresholdAttribute()

      override fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

      override fun s3InputMode(): String? = unwrap(this).getS3InputMode()

      override fun startTimeOffset(): String? = unwrap(this).getStartTimeOffset()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BatchTransformInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.BatchTransformInputProperty):
          BatchTransformInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchTransformInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.BatchTransformInputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface JsonProperty {
    public fun line(): Any? = unwrap(this).getLine()

    public interface Builder {
      public fun line(line: Boolean)

      public fun line(line: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.JsonProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.JsonProperty.builder()

      override fun line(line: Boolean) {
        cdkBuilder.line(line)
      }

      override fun line(line: IResolvable) {
        cdkBuilder.line(line.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.JsonProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.JsonProperty,
    ) : JsonProperty {
      override fun line(): Any? = unwrap(this).getLine()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JsonProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.JsonProperty):
          JsonProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.JsonProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringResourcesProperty {
    public fun clusterConfig(): Any

    public interface Builder {
      public fun clusterConfig(clusterConfig: IResolvable)

      public fun clusterConfig(clusterConfig: ClusterConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("86a650a67c137f45478cebc14363efd0d878d4dab3ff569186e1a3a8abecc98a")
      public fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringResourcesProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringResourcesProperty.builder()

      override fun clusterConfig(clusterConfig: IResolvable) {
        cdkBuilder.clusterConfig(clusterConfig.let(IResolvable::unwrap))
      }

      override fun clusterConfig(clusterConfig: ClusterConfigProperty) {
        cdkBuilder.clusterConfig(clusterConfig.let(ClusterConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("86a650a67c137f45478cebc14363efd0d878d4dab3ff569186e1a3a8abecc98a")
      override fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit): Unit =
          clusterConfig(ClusterConfigProperty(clusterConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringResourcesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringResourcesProperty,
    ) : MonitoringResourcesProperty {
      override fun clusterConfig(): Any = unwrap(this).getClusterConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringResourcesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringResourcesProperty):
          MonitoringResourcesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringResourcesProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringResourcesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3OutputProperty {
    public fun localPath(): String

    public fun s3UploadMode(): String? = unwrap(this).getS3UploadMode()

    public fun s3Uri(): String

    public interface Builder {
      public fun localPath(localPath: String)

      public fun s3UploadMode(s3UploadMode: String)

      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.S3OutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.S3OutputProperty.builder()

      override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      override fun s3UploadMode(s3UploadMode: String) {
        cdkBuilder.s3UploadMode(s3UploadMode)
      }

      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.S3OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.S3OutputProperty,
    ) : S3OutputProperty {
      override fun localPath(): String = unwrap(this).getLocalPath()

      override fun s3UploadMode(): String? = unwrap(this).getS3UploadMode()

      override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.S3OutputProperty):
          S3OutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.S3OutputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface StoppingConditionProperty {
    public fun maxRuntimeInSeconds(): Number

    public interface Builder {
      public fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.StoppingConditionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.StoppingConditionProperty.builder()

      override fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number) {
        cdkBuilder.maxRuntimeInSeconds(maxRuntimeInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.StoppingConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.StoppingConditionProperty,
    ) : StoppingConditionProperty {
      override fun maxRuntimeInSeconds(): Number = unwrap(this).getMaxRuntimeInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StoppingConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.StoppingConditionProperty):
          StoppingConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StoppingConditionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.StoppingConditionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringOutputConfigProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun monitoringOutputs(): Any

    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String)

      public fun monitoringOutputs(monitoringOutputs: IResolvable)

      public fun monitoringOutputs(monitoringOutputs: List<Any>)

      public fun monitoringOutputs(vararg monitoringOutputs: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputConfigProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun monitoringOutputs(monitoringOutputs: IResolvable) {
        cdkBuilder.monitoringOutputs(monitoringOutputs.let(IResolvable::unwrap))
      }

      override fun monitoringOutputs(monitoringOutputs: List<Any>) {
        cdkBuilder.monitoringOutputs(monitoringOutputs)
      }

      override fun monitoringOutputs(vararg monitoringOutputs: Any): Unit =
          monitoringOutputs(monitoringOutputs.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputConfigProperty,
    ) : MonitoringOutputConfigProperty {
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      override fun monitoringOutputs(): Any = unwrap(this).getMonitoringOutputs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringOutputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputConfigProperty):
          MonitoringOutputConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringOutputConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputConfigProperty
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
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: Boolean)

      public
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: IResolvable)

      public fun enableNetworkIsolation(enableNetworkIsolation: Boolean)

      public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable)

      public fun vpcConfig(vpcConfig: IResolvable)

      public fun vpcConfig(vpcConfig: VpcConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("156c44cc55e4ab74f58e06f442ad8d9e3727e4582c4f748362220851fe3cd55e")
      public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.NetworkConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.NetworkConfigProperty.builder()

      override
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: Boolean) {
        cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption)
      }

      override
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: IResolvable) {
        cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption.let(IResolvable::unwrap))
      }

      override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
        cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
      }

      override fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
        cdkBuilder.enableNetworkIsolation(enableNetworkIsolation.let(IResolvable::unwrap))
      }

      override fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
      }

      override fun vpcConfig(vpcConfig: VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("156c44cc55e4ab74f58e06f442ad8d9e3727e4582c4f748362220851fe3cd55e")
      override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
          vpcConfig(VpcConfigProperty(vpcConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.NetworkConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.NetworkConfigProperty,
    ) : NetworkConfigProperty {
      override fun enableInterContainerTrafficEncryption(): Any? =
          unwrap(this).getEnableInterContainerTrafficEncryption()

      override fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

      override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.NetworkConfigProperty):
          NetworkConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.NetworkConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CsvProperty {
    public fun `header`(): Any? = unwrap(this).getHeader()

    public interface Builder {
      public fun `header`(`header`: Boolean)

      public fun `header`(`header`: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.CsvProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.CsvProperty.builder()

      override fun `header`(`header`: Boolean) {
        cdkBuilder.`header`(`header`)
      }

      override fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.CsvProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.CsvProperty,
    ) : CsvProperty {
      override fun `header`(): Any? = unwrap(this).getHeader()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CsvProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.CsvProperty):
          CsvProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.CsvProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VpcConfigProperty {
    public fun securityGroupIds(): List<String>

    public fun subnets(): List<String>

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun subnets(subnets: List<String>)

      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.VpcConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.VpcConfigProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.VpcConfigProperty,
    ) : VpcConfigProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.VpcConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DatasetFormatProperty {
    public fun csv(): Any? = unwrap(this).getCsv()

    public fun json(): Any? = unwrap(this).getJson()

    public fun parquet(): Any? = unwrap(this).getParquet()

    public interface Builder {
      public fun csv(csv: IResolvable)

      public fun csv(csv: CsvProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2610a4a45f311cd86c74dd1598067d2928e7010119e393ae4b16e3c1b121edde")
      public fun csv(csv: CsvProperty.Builder.() -> Unit)

      public fun json(json: IResolvable)

      public fun json(json: JsonProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0efa400048db4040dccefc62b9defa3adede02e5be2a2604a021eb6e03a99e2a")
      public fun json(json: JsonProperty.Builder.() -> Unit)

      public fun parquet(parquet: Boolean)

      public fun parquet(parquet: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.DatasetFormatProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.DatasetFormatProperty.builder()

      override fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv.let(IResolvable::unwrap))
      }

      override fun csv(csv: CsvProperty) {
        cdkBuilder.csv(csv.let(CsvProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2610a4a45f311cd86c74dd1598067d2928e7010119e393ae4b16e3c1b121edde")
      override fun csv(csv: CsvProperty.Builder.() -> Unit): Unit = csv(CsvProperty(csv))

      override fun json(json: IResolvable) {
        cdkBuilder.json(json.let(IResolvable::unwrap))
      }

      override fun json(json: JsonProperty) {
        cdkBuilder.json(json.let(JsonProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0efa400048db4040dccefc62b9defa3adede02e5be2a2604a021eb6e03a99e2a")
      override fun json(json: JsonProperty.Builder.() -> Unit): Unit = json(JsonProperty(json))

      override fun parquet(parquet: Boolean) {
        cdkBuilder.parquet(parquet)
      }

      override fun parquet(parquet: IResolvable) {
        cdkBuilder.parquet(parquet.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.DatasetFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.DatasetFormatProperty,
    ) : DatasetFormatProperty {
      override fun csv(): Any? = unwrap(this).getCsv()

      override fun json(): Any? = unwrap(this).getJson()

      override fun parquet(): Any? = unwrap(this).getParquet()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.DatasetFormatProperty):
          DatasetFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetFormatProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.DatasetFormatProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConstraintsResourceProperty {
    public fun s3Uri(): String? = unwrap(this).getS3Uri()

    public interface Builder {
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ConstraintsResourceProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ConstraintsResourceProperty.builder()

      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ConstraintsResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ConstraintsResourceProperty,
    ) : ConstraintsResourceProperty {
      override fun s3Uri(): String? = unwrap(this).getS3Uri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConstraintsResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ConstraintsResourceProperty):
          ConstraintsResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConstraintsResourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ConstraintsResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringOutputProperty {
    public fun s3Output(): Any

    public interface Builder {
      public fun s3Output(s3Output: IResolvable)

      public fun s3Output(s3Output: S3OutputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f719a3c56ef446f5138f7833a61d999571362d1049fad9b0ca7e5022cd11c6e9")
      public fun s3Output(s3Output: S3OutputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputProperty.builder()

      override fun s3Output(s3Output: IResolvable) {
        cdkBuilder.s3Output(s3Output.let(IResolvable::unwrap))
      }

      override fun s3Output(s3Output: S3OutputProperty) {
        cdkBuilder.s3Output(s3Output.let(S3OutputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f719a3c56ef446f5138f7833a61d999571362d1049fad9b0ca7e5022cd11c6e9")
      override fun s3Output(s3Output: S3OutputProperty.Builder.() -> Unit): Unit =
          s3Output(S3OutputProperty(s3Output))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputProperty,
    ) : MonitoringOutputProperty {
      override fun s3Output(): Any = unwrap(this).getS3Output()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputProperty):
          MonitoringOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringOutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ModelQualityJobInputProperty {
    public fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

    public fun endpointInput(): Any? = unwrap(this).getEndpointInput()

    public fun groundTruthS3Input(): Any

    public interface Builder {
      public fun batchTransformInput(batchTransformInput: IResolvable)

      public fun batchTransformInput(batchTransformInput: BatchTransformInputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7fc15f7cd34c8b4775b1e9592f1892fc7bfb1853d2b3eefce3631c5df341e4f3")
      public
          fun batchTransformInput(batchTransformInput: BatchTransformInputProperty.Builder.() -> Unit)

      public fun endpointInput(endpointInput: IResolvable)

      public fun endpointInput(endpointInput: EndpointInputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95fa11a76deeccfc69f1de14b4f53dc6220ff8de6b230af13af411602f50d92e")
      public fun endpointInput(endpointInput: EndpointInputProperty.Builder.() -> Unit)

      public fun groundTruthS3Input(groundTruthS3Input: IResolvable)

      public fun groundTruthS3Input(groundTruthS3Input: MonitoringGroundTruthS3InputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27209216e1724eaca068d3545875342c36d0dd2e2e10734cc5142ba4c7616f0d")
      public
          fun groundTruthS3Input(groundTruthS3Input: MonitoringGroundTruthS3InputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityJobInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityJobInputProperty.builder()

      override fun batchTransformInput(batchTransformInput: IResolvable) {
        cdkBuilder.batchTransformInput(batchTransformInput.let(IResolvable::unwrap))
      }

      override fun batchTransformInput(batchTransformInput: BatchTransformInputProperty) {
        cdkBuilder.batchTransformInput(batchTransformInput.let(BatchTransformInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7fc15f7cd34c8b4775b1e9592f1892fc7bfb1853d2b3eefce3631c5df341e4f3")
      override
          fun batchTransformInput(batchTransformInput: BatchTransformInputProperty.Builder.() -> Unit):
          Unit = batchTransformInput(BatchTransformInputProperty(batchTransformInput))

      override fun endpointInput(endpointInput: IResolvable) {
        cdkBuilder.endpointInput(endpointInput.let(IResolvable::unwrap))
      }

      override fun endpointInput(endpointInput: EndpointInputProperty) {
        cdkBuilder.endpointInput(endpointInput.let(EndpointInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95fa11a76deeccfc69f1de14b4f53dc6220ff8de6b230af13af411602f50d92e")
      override fun endpointInput(endpointInput: EndpointInputProperty.Builder.() -> Unit): Unit =
          endpointInput(EndpointInputProperty(endpointInput))

      override fun groundTruthS3Input(groundTruthS3Input: IResolvable) {
        cdkBuilder.groundTruthS3Input(groundTruthS3Input.let(IResolvable::unwrap))
      }

      override fun groundTruthS3Input(groundTruthS3Input: MonitoringGroundTruthS3InputProperty) {
        cdkBuilder.groundTruthS3Input(groundTruthS3Input.let(MonitoringGroundTruthS3InputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27209216e1724eaca068d3545875342c36d0dd2e2e10734cc5142ba4c7616f0d")
      override
          fun groundTruthS3Input(groundTruthS3Input: MonitoringGroundTruthS3InputProperty.Builder.() -> Unit):
          Unit = groundTruthS3Input(MonitoringGroundTruthS3InputProperty(groundTruthS3Input))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityJobInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityJobInputProperty,
    ) : ModelQualityJobInputProperty {
      override fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

      override fun endpointInput(): Any? = unwrap(this).getEndpointInput()

      override fun groundTruthS3Input(): Any = unwrap(this).getGroundTruthS3Input()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ModelQualityJobInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityJobInputProperty):
          ModelQualityJobInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelQualityJobInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityJobInputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
