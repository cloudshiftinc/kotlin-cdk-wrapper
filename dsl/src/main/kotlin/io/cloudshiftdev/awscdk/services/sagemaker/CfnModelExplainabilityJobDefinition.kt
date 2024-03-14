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

public open class CfnModelExplainabilityJobDefinition internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition,
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
  @JvmName("d699b3e9b8165c827d74fd636252696eb57b683e05868766d668a61149212c70")
  public open fun jobResources(`value`: MonitoringResourcesProperty.Builder.() -> Unit): Unit =
      jobResources(MonitoringResourcesProperty(`value`))

  public open fun modelExplainabilityAppSpecification(): Any =
      unwrap(this).getModelExplainabilityAppSpecification()

  public open fun modelExplainabilityAppSpecification(`value`: IResolvable) {
    unwrap(this).setModelExplainabilityAppSpecification(`value`.let(IResolvable::unwrap))
  }

  public open
      fun modelExplainabilityAppSpecification(`value`: ModelExplainabilityAppSpecificationProperty) {
    unwrap(this).setModelExplainabilityAppSpecification(`value`.let(ModelExplainabilityAppSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("07d7dc1824f32c27d58c6231845fd678f79702426bb7c946c82c48c2a7782d45")
  public open
      fun modelExplainabilityAppSpecification(`value`: ModelExplainabilityAppSpecificationProperty.Builder.() -> Unit):
      Unit =
      modelExplainabilityAppSpecification(ModelExplainabilityAppSpecificationProperty(`value`))

  public open fun modelExplainabilityBaselineConfig(): Any? =
      unwrap(this).getModelExplainabilityBaselineConfig()

  public open fun modelExplainabilityBaselineConfig(`value`: IResolvable) {
    unwrap(this).setModelExplainabilityBaselineConfig(`value`.let(IResolvable::unwrap))
  }

  public open
      fun modelExplainabilityBaselineConfig(`value`: ModelExplainabilityBaselineConfigProperty) {
    unwrap(this).setModelExplainabilityBaselineConfig(`value`.let(ModelExplainabilityBaselineConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6d0628f132b97ca2f7b8be4aac73e10c2df8221f15f9e10a8635b5f7aab371b9")
  public open
      fun modelExplainabilityBaselineConfig(`value`: ModelExplainabilityBaselineConfigProperty.Builder.() -> Unit):
      Unit = modelExplainabilityBaselineConfig(ModelExplainabilityBaselineConfigProperty(`value`))

  public open fun modelExplainabilityJobInput(): Any = unwrap(this).getModelExplainabilityJobInput()

  public open fun modelExplainabilityJobInput(`value`: IResolvable) {
    unwrap(this).setModelExplainabilityJobInput(`value`.let(IResolvable::unwrap))
  }

  public open fun modelExplainabilityJobInput(`value`: ModelExplainabilityJobInputProperty) {
    unwrap(this).setModelExplainabilityJobInput(`value`.let(ModelExplainabilityJobInputProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("10483b1cabac96f3be0e9b41c0279081273689dce27110a4d9fd69bb00368eb4")
  public open
      fun modelExplainabilityJobInput(`value`: ModelExplainabilityJobInputProperty.Builder.() -> Unit):
      Unit = modelExplainabilityJobInput(ModelExplainabilityJobInputProperty(`value`))

  public open fun modelExplainabilityJobOutputConfig(): Any =
      unwrap(this).getModelExplainabilityJobOutputConfig()

  public open fun modelExplainabilityJobOutputConfig(`value`: IResolvable) {
    unwrap(this).setModelExplainabilityJobOutputConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun modelExplainabilityJobOutputConfig(`value`: MonitoringOutputConfigProperty) {
    unwrap(this).setModelExplainabilityJobOutputConfig(`value`.let(MonitoringOutputConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("04f353bffab106793a10fb9779f0c52802a558e007548cf45bc7d42388d65559")
  public open
      fun modelExplainabilityJobOutputConfig(`value`: MonitoringOutputConfigProperty.Builder.() -> Unit):
      Unit = modelExplainabilityJobOutputConfig(MonitoringOutputConfigProperty(`value`))

  public open fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

  public open fun networkConfig(`value`: IResolvable) {
    unwrap(this).setNetworkConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun networkConfig(`value`: NetworkConfigProperty) {
    unwrap(this).setNetworkConfig(`value`.let(NetworkConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("26b6d401267fbfb130c1ade98504f1d0ae88903b7f38b773b6e82c5ce8d18b2f")
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
  @JvmName("f869b61b0ce3009c5c232110b734a56eba4e4d2a5983da0820cb1f158b92bc5b")
  public open fun stoppingCondition(`value`: StoppingConditionProperty.Builder.() -> Unit): Unit =
      stoppingCondition(StoppingConditionProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun endpointName(endpointName: String)

    public fun jobDefinitionName(jobDefinitionName: String)

    public fun jobResources(jobResources: IResolvable)

    public fun jobResources(jobResources: MonitoringResourcesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35aa052808fd359dc2ac115c1a8e940c98bd7e5db9be48955d108062e866eb6b")
    public fun jobResources(jobResources: MonitoringResourcesProperty.Builder.() -> Unit)

    public fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: IResolvable)

    public
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: ModelExplainabilityAppSpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a042f2cbb37d2abca2b01ef176c06009999a3ad573c6779b9cdab08eb49d899")
    public
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: ModelExplainabilityAppSpecificationProperty.Builder.() -> Unit)

    public fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: IResolvable)

    public
        fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: ModelExplainabilityBaselineConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8aa636e64ee025f2d066bf043fdd9762b28000f3d16f7f220eeaf1172365c200")
    public
        fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: ModelExplainabilityBaselineConfigProperty.Builder.() -> Unit)

    public fun modelExplainabilityJobInput(modelExplainabilityJobInput: IResolvable)

    public
        fun modelExplainabilityJobInput(modelExplainabilityJobInput: ModelExplainabilityJobInputProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23838340771863374c773729c119473081749d63d70302b8097c02eaa05cbc13")
    public
        fun modelExplainabilityJobInput(modelExplainabilityJobInput: ModelExplainabilityJobInputProperty.Builder.() -> Unit)

    public fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: IResolvable)

    public
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: MonitoringOutputConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7eee2946bf577aa5bcfdbce0af50c347ed511550b1b2f93896cf9ac657eb15d9")
    public
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit)

    public fun networkConfig(networkConfig: IResolvable)

    public fun networkConfig(networkConfig: NetworkConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("231bc58acd44d2d408904e9422554322013ad7b3c9a0379ceafef6f76400c641")
    public fun networkConfig(networkConfig: NetworkConfigProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun stoppingCondition(stoppingCondition: IResolvable)

    public fun stoppingCondition(stoppingCondition: StoppingConditionProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f1367a361167ca21f83e152612ba1f2316f22fb384454c7269bde2adc63126a")
    public fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.Builder.create(scope,
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
    @JvmName("35aa052808fd359dc2ac115c1a8e940c98bd7e5db9be48955d108062e866eb6b")
    override fun jobResources(jobResources: MonitoringResourcesProperty.Builder.() -> Unit): Unit =
        jobResources(MonitoringResourcesProperty(jobResources))

    override
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: IResolvable) {
      cdkBuilder.modelExplainabilityAppSpecification(modelExplainabilityAppSpecification.let(IResolvable::unwrap))
    }

    override
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: ModelExplainabilityAppSpecificationProperty) {
      cdkBuilder.modelExplainabilityAppSpecification(modelExplainabilityAppSpecification.let(ModelExplainabilityAppSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a042f2cbb37d2abca2b01ef176c06009999a3ad573c6779b9cdab08eb49d899")
    override
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: ModelExplainabilityAppSpecificationProperty.Builder.() -> Unit):
        Unit =
        modelExplainabilityAppSpecification(ModelExplainabilityAppSpecificationProperty(modelExplainabilityAppSpecification))

    override fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: IResolvable) {
      cdkBuilder.modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig.let(IResolvable::unwrap))
    }

    override
        fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: ModelExplainabilityBaselineConfigProperty) {
      cdkBuilder.modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig.let(ModelExplainabilityBaselineConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8aa636e64ee025f2d066bf043fdd9762b28000f3d16f7f220eeaf1172365c200")
    override
        fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: ModelExplainabilityBaselineConfigProperty.Builder.() -> Unit):
        Unit =
        modelExplainabilityBaselineConfig(ModelExplainabilityBaselineConfigProperty(modelExplainabilityBaselineConfig))

    override fun modelExplainabilityJobInput(modelExplainabilityJobInput: IResolvable) {
      cdkBuilder.modelExplainabilityJobInput(modelExplainabilityJobInput.let(IResolvable::unwrap))
    }

    override
        fun modelExplainabilityJobInput(modelExplainabilityJobInput: ModelExplainabilityJobInputProperty) {
      cdkBuilder.modelExplainabilityJobInput(modelExplainabilityJobInput.let(ModelExplainabilityJobInputProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23838340771863374c773729c119473081749d63d70302b8097c02eaa05cbc13")
    override
        fun modelExplainabilityJobInput(modelExplainabilityJobInput: ModelExplainabilityJobInputProperty.Builder.() -> Unit):
        Unit =
        modelExplainabilityJobInput(ModelExplainabilityJobInputProperty(modelExplainabilityJobInput))

    override
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: IResolvable) {
      cdkBuilder.modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig.let(IResolvable::unwrap))
    }

    override
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: MonitoringOutputConfigProperty) {
      cdkBuilder.modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig.let(MonitoringOutputConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7eee2946bf577aa5bcfdbce0af50c347ed511550b1b2f93896cf9ac657eb15d9")
    override
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit):
        Unit =
        modelExplainabilityJobOutputConfig(MonitoringOutputConfigProperty(modelExplainabilityJobOutputConfig))

    override fun networkConfig(networkConfig: IResolvable) {
      cdkBuilder.networkConfig(networkConfig.let(IResolvable::unwrap))
    }

    override fun networkConfig(networkConfig: NetworkConfigProperty) {
      cdkBuilder.networkConfig(networkConfig.let(NetworkConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("231bc58acd44d2d408904e9422554322013ad7b3c9a0379ceafef6f76400c641")
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
    @JvmName("7f1367a361167ca21f83e152612ba1f2316f22fb384454c7269bde2adc63126a")
    override fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit):
        Unit = stoppingCondition(StoppingConditionProperty(stoppingCondition))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnModelExplainabilityJobDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnModelExplainabilityJobDefinition(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition):
        CfnModelExplainabilityJobDefinition = CfnModelExplainabilityJobDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnModelExplainabilityJobDefinition):
        software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition =
        wrapped.cdkObject
  }

  public interface ConstraintsResourceProperty {
    public fun s3Uri(): String? = unwrap(this).getS3Uri()

    public interface Builder {
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty.builder()

      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty):
          ConstraintsResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConstraintsResourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface StoppingConditionProperty {
    public fun maxRuntimeInSeconds(): Number

    public interface Builder {
      public fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.StoppingConditionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.StoppingConditionProperty.builder()

      override fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number) {
        cdkBuilder.maxRuntimeInSeconds(maxRuntimeInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.StoppingConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.StoppingConditionProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.StoppingConditionProperty):
          StoppingConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StoppingConditionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.StoppingConditionProperty
          = (wrapped as Wrapper).cdkObject
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
      @JvmName("41a5bd61be4596db46392a76986cb24b85863bd1327e316e275e75a3247d6266")
      public fun csv(csv: CsvProperty.Builder.() -> Unit)

      public fun json(json: IResolvable)

      public fun json(json: JsonProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ad6a40fc074598b4171e4e184e26c58faba839d06f61b41ced2e3eb867860d6")
      public fun json(json: JsonProperty.Builder.() -> Unit)

      public fun parquet(parquet: Boolean)

      public fun parquet(parquet: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.DatasetFormatProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.DatasetFormatProperty.builder()

      override fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv.let(IResolvable::unwrap))
      }

      override fun csv(csv: CsvProperty) {
        cdkBuilder.csv(csv.let(CsvProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41a5bd61be4596db46392a76986cb24b85863bd1327e316e275e75a3247d6266")
      override fun csv(csv: CsvProperty.Builder.() -> Unit): Unit = csv(CsvProperty(csv))

      override fun json(json: IResolvable) {
        cdkBuilder.json(json.let(IResolvable::unwrap))
      }

      override fun json(json: JsonProperty) {
        cdkBuilder.json(json.let(JsonProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ad6a40fc074598b4171e4e184e26c58faba839d06f61b41ced2e3eb867860d6")
      override fun json(json: JsonProperty.Builder.() -> Unit): Unit = json(JsonProperty(json))

      override fun parquet(parquet: Boolean) {
        cdkBuilder.parquet(parquet)
      }

      override fun parquet(parquet: IResolvable) {
        cdkBuilder.parquet(parquet.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.DatasetFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.DatasetFormatProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.DatasetFormatProperty):
          DatasetFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetFormatProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.DatasetFormatProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringResourcesProperty {
    public fun clusterConfig(): Any

    public interface Builder {
      public fun clusterConfig(clusterConfig: IResolvable)

      public fun clusterConfig(clusterConfig: ClusterConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42f8aec8def9eb81f8c1f81a564f7bc914c277b8a594cdc422237bbc3d9a8d65")
      public fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty.builder()

      override fun clusterConfig(clusterConfig: IResolvable) {
        cdkBuilder.clusterConfig(clusterConfig.let(IResolvable::unwrap))
      }

      override fun clusterConfig(clusterConfig: ClusterConfigProperty) {
        cdkBuilder.clusterConfig(clusterConfig.let(ClusterConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42f8aec8def9eb81f8c1f81a564f7bc914c277b8a594cdc422237bbc3d9a8d65")
      override fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit): Unit =
          clusterConfig(ClusterConfigProperty(clusterConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty):
          MonitoringResourcesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringResourcesProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty
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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ClusterConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ClusterConfigProperty.builder()

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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ClusterConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ClusterConfigProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ClusterConfigProperty):
          ClusterConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ClusterConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringOutputProperty {
    public fun s3Output(): Any

    public interface Builder {
      public fun s3Output(s3Output: IResolvable)

      public fun s3Output(s3Output: S3OutputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0ee30764bb6561fa1de467ef6293013f2eb9c0f4a3ff018a8824a01ef2bc271")
      public fun s3Output(s3Output: S3OutputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputProperty.builder()

      override fun s3Output(s3Output: IResolvable) {
        cdkBuilder.s3Output(s3Output.let(IResolvable::unwrap))
      }

      override fun s3Output(s3Output: S3OutputProperty) {
        cdkBuilder.s3Output(s3Output.let(S3OutputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0ee30764bb6561fa1de467ef6293013f2eb9c0f4a3ff018a8824a01ef2bc271")
      override fun s3Output(s3Output: S3OutputProperty.Builder.() -> Unit): Unit =
          s3Output(S3OutputProperty(s3Output))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputProperty):
          MonitoringOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringOutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ModelExplainabilityBaselineConfigProperty {
    public fun baseliningJobName(): String? = unwrap(this).getBaseliningJobName()

    public fun constraintsResource(): Any? = unwrap(this).getConstraintsResource()

    public interface Builder {
      public fun baseliningJobName(baseliningJobName: String)

      public fun constraintsResource(constraintsResource: IResolvable)

      public fun constraintsResource(constraintsResource: ConstraintsResourceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4749cda3b9d66f2a51d839a2288629f763434d773463df92adafe98ecc14435f")
      public
          fun constraintsResource(constraintsResource: ConstraintsResourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty.builder()

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
      @JvmName("4749cda3b9d66f2a51d839a2288629f763434d773463df92adafe98ecc14435f")
      override
          fun constraintsResource(constraintsResource: ConstraintsResourceProperty.Builder.() -> Unit):
          Unit = constraintsResource(ConstraintsResourceProperty(constraintsResource))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty,
    ) : ModelExplainabilityBaselineConfigProperty {
      override fun baseliningJobName(): String? = unwrap(this).getBaseliningJobName()

      override fun constraintsResource(): Any? = unwrap(this).getConstraintsResource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ModelExplainabilityBaselineConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty):
          ModelExplainabilityBaselineConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelExplainabilityBaselineConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ModelExplainabilityJobInputProperty {
    public fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

    public fun endpointInput(): Any? = unwrap(this).getEndpointInput()

    public interface Builder {
      public fun batchTransformInput(batchTransformInput: IResolvable)

      public fun batchTransformInput(batchTransformInput: BatchTransformInputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fd5d7bf37162d632baf9b9cf4770092aaef7a936fce5efd40e10cc745c155d4c")
      public
          fun batchTransformInput(batchTransformInput: BatchTransformInputProperty.Builder.() -> Unit)

      public fun endpointInput(endpointInput: IResolvable)

      public fun endpointInput(endpointInput: EndpointInputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ffaf54e2ec0ee4b5f62e460428227e28bdc9cfd6088cc4812e4381f3cffd1e6a")
      public fun endpointInput(endpointInput: EndpointInputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty.builder()

      override fun batchTransformInput(batchTransformInput: IResolvable) {
        cdkBuilder.batchTransformInput(batchTransformInput.let(IResolvable::unwrap))
      }

      override fun batchTransformInput(batchTransformInput: BatchTransformInputProperty) {
        cdkBuilder.batchTransformInput(batchTransformInput.let(BatchTransformInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fd5d7bf37162d632baf9b9cf4770092aaef7a936fce5efd40e10cc745c155d4c")
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
      @JvmName("ffaf54e2ec0ee4b5f62e460428227e28bdc9cfd6088cc4812e4381f3cffd1e6a")
      override fun endpointInput(endpointInput: EndpointInputProperty.Builder.() -> Unit): Unit =
          endpointInput(EndpointInputProperty(endpointInput))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty,
    ) : ModelExplainabilityJobInputProperty {
      override fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

      override fun endpointInput(): Any? = unwrap(this).getEndpointInput()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ModelExplainabilityJobInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty):
          ModelExplainabilityJobInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelExplainabilityJobInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty
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
      @JvmName("9f47ca8527062454ec8f4c8a37359abe59cb96974807cfd5f3aea750ea924245")
      public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.NetworkConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.NetworkConfigProperty.builder()

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
      @JvmName("9f47ca8527062454ec8f4c8a37359abe59cb96974807cfd5f3aea750ea924245")
      override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
          vpcConfig(VpcConfigProperty(vpcConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.NetworkConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.NetworkConfigProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.NetworkConfigProperty):
          NetworkConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.NetworkConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BatchTransformInputProperty {
    public fun dataCapturedDestinationS3Uri(): String

    public fun datasetFormat(): Any

    public fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

    public fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

    public fun localPath(): String

    public fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    public fun s3InputMode(): String? = unwrap(this).getS3InputMode()

    public interface Builder {
      public fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String)

      public fun datasetFormat(datasetFormat: IResolvable)

      public fun datasetFormat(datasetFormat: DatasetFormatProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7b8a9932aec8edb38d066ed1cc14d7a6ba6798736d5f0ed23e3d9368071741f8")
      public fun datasetFormat(datasetFormat: DatasetFormatProperty.Builder.() -> Unit)

      public fun featuresAttribute(featuresAttribute: String)

      public fun inferenceAttribute(inferenceAttribute: String)

      public fun localPath(localPath: String)

      public fun probabilityAttribute(probabilityAttribute: String)

      public fun s3DataDistributionType(s3DataDistributionType: String)

      public fun s3InputMode(s3InputMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.BatchTransformInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.BatchTransformInputProperty.builder()

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
      @JvmName("7b8a9932aec8edb38d066ed1cc14d7a6ba6798736d5f0ed23e3d9368071741f8")
      override fun datasetFormat(datasetFormat: DatasetFormatProperty.Builder.() -> Unit): Unit =
          datasetFormat(DatasetFormatProperty(datasetFormat))

      override fun featuresAttribute(featuresAttribute: String) {
        cdkBuilder.featuresAttribute(featuresAttribute)
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

      override fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
      }

      override fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.BatchTransformInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.BatchTransformInputProperty,
    ) : BatchTransformInputProperty {
      override fun dataCapturedDestinationS3Uri(): String =
          unwrap(this).getDataCapturedDestinationS3Uri()

      override fun datasetFormat(): Any = unwrap(this).getDatasetFormat()

      override fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

      override fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

      override fun localPath(): String = unwrap(this).getLocalPath()

      override fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

      override fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

      override fun s3InputMode(): String? = unwrap(this).getS3InputMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BatchTransformInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.BatchTransformInputProperty):
          BatchTransformInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchTransformInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.BatchTransformInputProperty
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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.JsonProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.JsonProperty.builder()

      override fun line(line: Boolean) {
        cdkBuilder.line(line)
      }

      override fun line(line: IResolvable) {
        cdkBuilder.line(line.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.JsonProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.JsonProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.JsonProperty):
          JsonProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.JsonProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ModelExplainabilityAppSpecificationProperty {
    public fun configUri(): String

    public fun environment(): Any? = unwrap(this).getEnvironment()

    public fun imageUri(): String

    public interface Builder {
      public fun configUri(configUri: String)

      public fun environment(environment: IResolvable)

      public fun environment(environment: Map<String, String>)

      public fun imageUri(imageUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty.builder()

      override fun configUri(configUri: String) {
        cdkBuilder.configUri(configUri)
      }

      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      override fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
      }

      override fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty,
    ) : ModelExplainabilityAppSpecificationProperty {
      override fun configUri(): String = unwrap(this).getConfigUri()

      override fun environment(): Any? = unwrap(this).getEnvironment()

      override fun imageUri(): String = unwrap(this).getImageUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ModelExplainabilityAppSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty):
          ModelExplainabilityAppSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelExplainabilityAppSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty
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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.S3OutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.S3OutputProperty.builder()

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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.S3OutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.S3OutputProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.S3OutputProperty):
          S3OutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.S3OutputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VpcConfigProperty {
    public fun securityGroupIds(): List<String>

    public fun subnets(): List<String>

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun subnets(subnets: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.VpcConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.VpcConfigProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.VpcConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.VpcConfigProperty,
    ) : VpcConfigProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.VpcConfigProperty
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
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun monitoringOutputs(monitoringOutputs: IResolvable) {
        cdkBuilder.monitoringOutputs(monitoringOutputs.let(IResolvable::unwrap))
      }

      override fun monitoringOutputs(monitoringOutputs: List<Any>) {
        cdkBuilder.monitoringOutputs(monitoringOutputs)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty):
          MonitoringOutputConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringOutputConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EndpointInputProperty {
    public fun endpointName(): String

    public fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

    public fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

    public fun localPath(): String

    public fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    public fun s3InputMode(): String? = unwrap(this).getS3InputMode()

    public interface Builder {
      public fun endpointName(endpointName: String)

      public fun featuresAttribute(featuresAttribute: String)

      public fun inferenceAttribute(inferenceAttribute: String)

      public fun localPath(localPath: String)

      public fun probabilityAttribute(probabilityAttribute: String)

      public fun s3DataDistributionType(s3DataDistributionType: String)

      public fun s3InputMode(s3InputMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.EndpointInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.EndpointInputProperty.builder()

      override fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
      }

      override fun featuresAttribute(featuresAttribute: String) {
        cdkBuilder.featuresAttribute(featuresAttribute)
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

      override fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
      }

      override fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.EndpointInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.EndpointInputProperty,
    ) : EndpointInputProperty {
      override fun endpointName(): String = unwrap(this).getEndpointName()

      override fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

      override fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

      override fun localPath(): String = unwrap(this).getLocalPath()

      override fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

      override fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

      override fun s3InputMode(): String? = unwrap(this).getS3InputMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.EndpointInputProperty):
          EndpointInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.EndpointInputProperty
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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.CsvProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.CsvProperty.builder()

      override fun `header`(`header`: Boolean) {
        cdkBuilder.`header`(`header`)
      }

      override fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.CsvProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.CsvProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.CsvProperty):
          CsvProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.CsvProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
