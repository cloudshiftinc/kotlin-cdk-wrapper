package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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
  internal override val cdkObject:
      software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The time when the job definition was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The Amazon Resource Name (ARN) of the job definition.
   */
  public open fun attrJobDefinitionArn(): String = unwrap(this).getAttrJobDefinitionArn()

  /**
   * The name of the endpoint used to run the monitoring job.
   */
  public open fun endpointName(): String? = unwrap(this).getEndpointName()

  /**
   * The name of the endpoint used to run the monitoring job.
   */
  public open fun endpointName(`value`: String) {
    unwrap(this).setEndpointName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the monitoring job definition.
   */
  public open fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  /**
   * The name of the monitoring job definition.
   */
  public open fun jobDefinitionName(`value`: String) {
    unwrap(this).setJobDefinitionName(`value`)
  }

  /**
   * Identifies the resources to deploy for a monitoring job.
   */
  public open fun jobResources(): Any = unwrap(this).getJobResources()

  /**
   * Identifies the resources to deploy for a monitoring job.
   */
  public open fun jobResources(`value`: IResolvable) {
    unwrap(this).setJobResources(`value`.let(IResolvable::unwrap))
  }

  /**
   * Identifies the resources to deploy for a monitoring job.
   */
  public open fun jobResources(`value`: MonitoringResourcesProperty) {
    unwrap(this).setJobResources(`value`.let(MonitoringResourcesProperty::unwrap))
  }

  /**
   * Identifies the resources to deploy for a monitoring job.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b894c094d11ff80a26d320cce2367897a7251ae67144a3ae69ccd7b775374d22")
  public open fun jobResources(`value`: MonitoringResourcesProperty.Builder.() -> Unit): Unit =
      jobResources(MonitoringResourcesProperty(`value`))

  /**
   * Container image configuration object for the monitoring job.
   */
  public open fun modelQualityAppSpecification(): Any =
      unwrap(this).getModelQualityAppSpecification()

  /**
   * Container image configuration object for the monitoring job.
   */
  public open fun modelQualityAppSpecification(`value`: IResolvable) {
    unwrap(this).setModelQualityAppSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * Container image configuration object for the monitoring job.
   */
  public open fun modelQualityAppSpecification(`value`: ModelQualityAppSpecificationProperty) {
    unwrap(this).setModelQualityAppSpecification(`value`.let(ModelQualityAppSpecificationProperty::unwrap))
  }

  /**
   * Container image configuration object for the monitoring job.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5241d007c80f786f18e2cca55fa53db3310331217bb0329a059048b73be5743a")
  public open
      fun modelQualityAppSpecification(`value`: ModelQualityAppSpecificationProperty.Builder.() -> Unit):
      Unit = modelQualityAppSpecification(ModelQualityAppSpecificationProperty(`value`))

  /**
   * Specifies the constraints and baselines for the monitoring job.
   */
  public open fun modelQualityBaselineConfig(): Any? = unwrap(this).getModelQualityBaselineConfig()

  /**
   * Specifies the constraints and baselines for the monitoring job.
   */
  public open fun modelQualityBaselineConfig(`value`: IResolvable) {
    unwrap(this).setModelQualityBaselineConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the constraints and baselines for the monitoring job.
   */
  public open fun modelQualityBaselineConfig(`value`: ModelQualityBaselineConfigProperty) {
    unwrap(this).setModelQualityBaselineConfig(`value`.let(ModelQualityBaselineConfigProperty::unwrap))
  }

  /**
   * Specifies the constraints and baselines for the monitoring job.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9585b0358b2ba7da64a4675209ee59adffe066fa778a069a986637bd083e910d")
  public open
      fun modelQualityBaselineConfig(`value`: ModelQualityBaselineConfigProperty.Builder.() -> Unit):
      Unit = modelQualityBaselineConfig(ModelQualityBaselineConfigProperty(`value`))

  /**
   * A list of the inputs that are monitored.
   */
  public open fun modelQualityJobInput(): Any = unwrap(this).getModelQualityJobInput()

  /**
   * A list of the inputs that are monitored.
   */
  public open fun modelQualityJobInput(`value`: IResolvable) {
    unwrap(this).setModelQualityJobInput(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of the inputs that are monitored.
   */
  public open fun modelQualityJobInput(`value`: ModelQualityJobInputProperty) {
    unwrap(this).setModelQualityJobInput(`value`.let(ModelQualityJobInputProperty::unwrap))
  }

  /**
   * A list of the inputs that are monitored.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("82181c2f828e7869b40eb0c0fb5d9b539de3265bc633d3c49c4641f8ec561a91")
  public open fun modelQualityJobInput(`value`: ModelQualityJobInputProperty.Builder.() -> Unit):
      Unit = modelQualityJobInput(ModelQualityJobInputProperty(`value`))

  /**
   * The output configuration for monitoring jobs.
   */
  public open fun modelQualityJobOutputConfig(): Any = unwrap(this).getModelQualityJobOutputConfig()

  /**
   * The output configuration for monitoring jobs.
   */
  public open fun modelQualityJobOutputConfig(`value`: IResolvable) {
    unwrap(this).setModelQualityJobOutputConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The output configuration for monitoring jobs.
   */
  public open fun modelQualityJobOutputConfig(`value`: MonitoringOutputConfigProperty) {
    unwrap(this).setModelQualityJobOutputConfig(`value`.let(MonitoringOutputConfigProperty::unwrap))
  }

  /**
   * The output configuration for monitoring jobs.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8aa95ca2cda6f837962f1d231aa63cff158751d650becb089ea636345c659763")
  public open
      fun modelQualityJobOutputConfig(`value`: MonitoringOutputConfigProperty.Builder.() -> Unit):
      Unit = modelQualityJobOutputConfig(MonitoringOutputConfigProperty(`value`))

  /**
   * Specifies the network configuration for the monitoring job.
   */
  public open fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

  /**
   * Specifies the network configuration for the monitoring job.
   */
  public open fun networkConfig(`value`: IResolvable) {
    unwrap(this).setNetworkConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the network configuration for the monitoring job.
   */
  public open fun networkConfig(`value`: NetworkConfigProperty) {
    unwrap(this).setNetworkConfig(`value`.let(NetworkConfigProperty::unwrap))
  }

  /**
   * Specifies the network configuration for the monitoring job.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a78fc6fd59e38271e027e2227fe0426fe149fd12c2b966ab05a9fa369c16bd29")
  public open fun networkConfig(`value`: NetworkConfigProperty.Builder.() -> Unit): Unit =
      networkConfig(NetworkConfigProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks
   * on your behalf.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks
   * on your behalf.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * A time limit for how long the monitoring job is allowed to run before stopping.
   */
  public open fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

  /**
   * A time limit for how long the monitoring job is allowed to run before stopping.
   */
  public open fun stoppingCondition(`value`: IResolvable) {
    unwrap(this).setStoppingCondition(`value`.let(IResolvable::unwrap))
  }

  /**
   * A time limit for how long the monitoring job is allowed to run before stopping.
   */
  public open fun stoppingCondition(`value`: StoppingConditionProperty) {
    unwrap(this).setStoppingCondition(`value`.let(StoppingConditionProperty::unwrap))
  }

  /**
   * A time limit for how long the monitoring job is allowed to run before stopping.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6e7fff0640a7f858cc53212f40593a005b9e5c130cbaffae05e4207f27f65af7")
  public open fun stoppingCondition(`value`: StoppingConditionProperty.Builder.() -> Unit): Unit =
      stoppingCondition(StoppingConditionProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnModelQualityJobDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the endpoint used to run the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-endpointname)
     * @param endpointName The name of the endpoint used to run the monitoring job. 
     */
    public fun endpointName(endpointName: String)

    /**
     * The name of the monitoring job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-jobdefinitionname)
     * @param jobDefinitionName The name of the monitoring job definition. 
     */
    public fun jobDefinitionName(jobDefinitionName: String)

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    public fun jobResources(jobResources: IResolvable)

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    public fun jobResources(jobResources: MonitoringResourcesProperty)

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17d4558e04d008184853dbf26eba288cb406cc08b677c61828bb398018a1ef85")
    public fun jobResources(jobResources: MonitoringResourcesProperty.Builder.() -> Unit)

    /**
     * Container image configuration object for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification)
     * @param modelQualityAppSpecification Container image configuration object for the monitoring
     * job. 
     */
    public fun modelQualityAppSpecification(modelQualityAppSpecification: IResolvable)

    /**
     * Container image configuration object for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification)
     * @param modelQualityAppSpecification Container image configuration object for the monitoring
     * job. 
     */
    public
        fun modelQualityAppSpecification(modelQualityAppSpecification: ModelQualityAppSpecificationProperty)

    /**
     * Container image configuration object for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification)
     * @param modelQualityAppSpecification Container image configuration object for the monitoring
     * job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d73f31546d43f21775bf2254d7d1ffabd0be5070d6460b79106404b13bc6362")
    public
        fun modelQualityAppSpecification(modelQualityAppSpecification: ModelQualityAppSpecificationProperty.Builder.() -> Unit)

    /**
     * Specifies the constraints and baselines for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualitybaselineconfig)
     * @param modelQualityBaselineConfig Specifies the constraints and baselines for the monitoring
     * job. 
     */
    public fun modelQualityBaselineConfig(modelQualityBaselineConfig: IResolvable)

    /**
     * Specifies the constraints and baselines for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualitybaselineconfig)
     * @param modelQualityBaselineConfig Specifies the constraints and baselines for the monitoring
     * job. 
     */
    public
        fun modelQualityBaselineConfig(modelQualityBaselineConfig: ModelQualityBaselineConfigProperty)

    /**
     * Specifies the constraints and baselines for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualitybaselineconfig)
     * @param modelQualityBaselineConfig Specifies the constraints and baselines for the monitoring
     * job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c67bfd822f34cefb8d14eb096fcf4acab791e9005d75231d7dea0413435d61a")
    public
        fun modelQualityBaselineConfig(modelQualityBaselineConfig: ModelQualityBaselineConfigProperty.Builder.() -> Unit)

    /**
     * A list of the inputs that are monitored.
     *
     * Currently endpoints are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjobinput)
     * @param modelQualityJobInput A list of the inputs that are monitored. 
     */
    public fun modelQualityJobInput(modelQualityJobInput: IResolvable)

    /**
     * A list of the inputs that are monitored.
     *
     * Currently endpoints are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjobinput)
     * @param modelQualityJobInput A list of the inputs that are monitored. 
     */
    public fun modelQualityJobInput(modelQualityJobInput: ModelQualityJobInputProperty)

    /**
     * A list of the inputs that are monitored.
     *
     * Currently endpoints are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjobinput)
     * @param modelQualityJobInput A list of the inputs that are monitored. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a75fc308bff9dc0645d582b5c98d508de23f1bfb3e137d33357cca5d0d55a1a6")
    public
        fun modelQualityJobInput(modelQualityJobInput: ModelQualityJobInputProperty.Builder.() -> Unit)

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjoboutputconfig)
     * @param modelQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    public fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: IResolvable)

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjoboutputconfig)
     * @param modelQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    public
        fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: MonitoringOutputConfigProperty)

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjoboutputconfig)
     * @param modelQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0745cc72873b2935e44f42771ed7c24b7276a502cfd9044a8bd494dd465faaa5")
    public
        fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit)

    /**
     * Specifies the network configuration for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-networkconfig)
     * @param networkConfig Specifies the network configuration for the monitoring job. 
     */
    public fun networkConfig(networkConfig: IResolvable)

    /**
     * Specifies the network configuration for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-networkconfig)
     * @param networkConfig Specifies the network configuration for the monitoring job. 
     */
    public fun networkConfig(networkConfig: NetworkConfigProperty)

    /**
     * Specifies the network configuration for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-networkconfig)
     * @param networkConfig Specifies the network configuration for the monitoring job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bc3bfe6fdda3e81e3cd68d4c50b29e2804c7d422c039fae94304aee9556a046")
    public fun networkConfig(networkConfig: NetworkConfigProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform
     * tasks on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume
     * to perform tasks on your behalf. 
     */
    public fun roleArn(roleArn: String)

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    public fun stoppingCondition(stoppingCondition: IResolvable)

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    public fun stoppingCondition(stoppingCondition: StoppingConditionProperty)

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("492ffcf2378a1da21aa8145bc7b7fb0294482684660e93fb5341b4e6d34e8264")
    public fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
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

    /**
     * The name of the endpoint used to run the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-endpointname)
     * @param endpointName The name of the endpoint used to run the monitoring job. 
     */
    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    /**
     * The name of the monitoring job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-jobdefinitionname)
     * @param jobDefinitionName The name of the monitoring job definition. 
     */
    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    override fun jobResources(jobResources: IResolvable) {
      cdkBuilder.jobResources(jobResources.let(IResolvable::unwrap))
    }

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    override fun jobResources(jobResources: MonitoringResourcesProperty) {
      cdkBuilder.jobResources(jobResources.let(MonitoringResourcesProperty::unwrap))
    }

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17d4558e04d008184853dbf26eba288cb406cc08b677c61828bb398018a1ef85")
    override fun jobResources(jobResources: MonitoringResourcesProperty.Builder.() -> Unit): Unit =
        jobResources(MonitoringResourcesProperty(jobResources))

    /**
     * Container image configuration object for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification)
     * @param modelQualityAppSpecification Container image configuration object for the monitoring
     * job. 
     */
    override fun modelQualityAppSpecification(modelQualityAppSpecification: IResolvable) {
      cdkBuilder.modelQualityAppSpecification(modelQualityAppSpecification.let(IResolvable::unwrap))
    }

    /**
     * Container image configuration object for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification)
     * @param modelQualityAppSpecification Container image configuration object for the monitoring
     * job. 
     */
    override
        fun modelQualityAppSpecification(modelQualityAppSpecification: ModelQualityAppSpecificationProperty) {
      cdkBuilder.modelQualityAppSpecification(modelQualityAppSpecification.let(ModelQualityAppSpecificationProperty::unwrap))
    }

    /**
     * Container image configuration object for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification)
     * @param modelQualityAppSpecification Container image configuration object for the monitoring
     * job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d73f31546d43f21775bf2254d7d1ffabd0be5070d6460b79106404b13bc6362")
    override
        fun modelQualityAppSpecification(modelQualityAppSpecification: ModelQualityAppSpecificationProperty.Builder.() -> Unit):
        Unit =
        modelQualityAppSpecification(ModelQualityAppSpecificationProperty(modelQualityAppSpecification))

    /**
     * Specifies the constraints and baselines for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualitybaselineconfig)
     * @param modelQualityBaselineConfig Specifies the constraints and baselines for the monitoring
     * job. 
     */
    override fun modelQualityBaselineConfig(modelQualityBaselineConfig: IResolvable) {
      cdkBuilder.modelQualityBaselineConfig(modelQualityBaselineConfig.let(IResolvable::unwrap))
    }

    /**
     * Specifies the constraints and baselines for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualitybaselineconfig)
     * @param modelQualityBaselineConfig Specifies the constraints and baselines for the monitoring
     * job. 
     */
    override
        fun modelQualityBaselineConfig(modelQualityBaselineConfig: ModelQualityBaselineConfigProperty) {
      cdkBuilder.modelQualityBaselineConfig(modelQualityBaselineConfig.let(ModelQualityBaselineConfigProperty::unwrap))
    }

    /**
     * Specifies the constraints and baselines for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualitybaselineconfig)
     * @param modelQualityBaselineConfig Specifies the constraints and baselines for the monitoring
     * job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c67bfd822f34cefb8d14eb096fcf4acab791e9005d75231d7dea0413435d61a")
    override
        fun modelQualityBaselineConfig(modelQualityBaselineConfig: ModelQualityBaselineConfigProperty.Builder.() -> Unit):
        Unit =
        modelQualityBaselineConfig(ModelQualityBaselineConfigProperty(modelQualityBaselineConfig))

    /**
     * A list of the inputs that are monitored.
     *
     * Currently endpoints are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjobinput)
     * @param modelQualityJobInput A list of the inputs that are monitored. 
     */
    override fun modelQualityJobInput(modelQualityJobInput: IResolvable) {
      cdkBuilder.modelQualityJobInput(modelQualityJobInput.let(IResolvable::unwrap))
    }

    /**
     * A list of the inputs that are monitored.
     *
     * Currently endpoints are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjobinput)
     * @param modelQualityJobInput A list of the inputs that are monitored. 
     */
    override fun modelQualityJobInput(modelQualityJobInput: ModelQualityJobInputProperty) {
      cdkBuilder.modelQualityJobInput(modelQualityJobInput.let(ModelQualityJobInputProperty::unwrap))
    }

    /**
     * A list of the inputs that are monitored.
     *
     * Currently endpoints are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjobinput)
     * @param modelQualityJobInput A list of the inputs that are monitored. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a75fc308bff9dc0645d582b5c98d508de23f1bfb3e137d33357cca5d0d55a1a6")
    override
        fun modelQualityJobInput(modelQualityJobInput: ModelQualityJobInputProperty.Builder.() -> Unit):
        Unit = modelQualityJobInput(ModelQualityJobInputProperty(modelQualityJobInput))

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjoboutputconfig)
     * @param modelQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    override fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: IResolvable) {
      cdkBuilder.modelQualityJobOutputConfig(modelQualityJobOutputConfig.let(IResolvable::unwrap))
    }

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjoboutputconfig)
     * @param modelQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    override
        fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: MonitoringOutputConfigProperty) {
      cdkBuilder.modelQualityJobOutputConfig(modelQualityJobOutputConfig.let(MonitoringOutputConfigProperty::unwrap))
    }

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjoboutputconfig)
     * @param modelQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0745cc72873b2935e44f42771ed7c24b7276a502cfd9044a8bd494dd465faaa5")
    override
        fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit):
        Unit =
        modelQualityJobOutputConfig(MonitoringOutputConfigProperty(modelQualityJobOutputConfig))

    /**
     * Specifies the network configuration for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-networkconfig)
     * @param networkConfig Specifies the network configuration for the monitoring job. 
     */
    override fun networkConfig(networkConfig: IResolvable) {
      cdkBuilder.networkConfig(networkConfig.let(IResolvable::unwrap))
    }

    /**
     * Specifies the network configuration for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-networkconfig)
     * @param networkConfig Specifies the network configuration for the monitoring job. 
     */
    override fun networkConfig(networkConfig: NetworkConfigProperty) {
      cdkBuilder.networkConfig(networkConfig.let(NetworkConfigProperty::unwrap))
    }

    /**
     * Specifies the network configuration for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-networkconfig)
     * @param networkConfig Specifies the network configuration for the monitoring job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bc3bfe6fdda3e81e3cd68d4c50b29e2804c7d422c039fae94304aee9556a046")
    override fun networkConfig(networkConfig: NetworkConfigProperty.Builder.() -> Unit): Unit =
        networkConfig(NetworkConfigProperty(networkConfig))

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform
     * tasks on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume
     * to perform tasks on your behalf. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    override fun stoppingCondition(stoppingCondition: IResolvable) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(IResolvable::unwrap))
    }

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    override fun stoppingCondition(stoppingCondition: StoppingConditionProperty) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(StoppingConditionProperty::unwrap))
    }

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("492ffcf2378a1da21aa8145bc7b7fb0294482684660e93fb5341b4e6d34e8264")
    override fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit):
        Unit = stoppingCondition(StoppingConditionProperty(stoppingCondition))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.CFN_RESOURCE_TYPE_NAME

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
    /**
     * If specified, monitoring jobs substract this time from the end time.
     *
     * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
     * Quality Monitoring
     * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-endtimeoffset)
     */
    public fun endTimeOffset(): String? = unwrap(this).getEndTimeOffset()

    /**
     * An endpoint in customer's account which has enabled `DataCaptureConfig` enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-endpointname)
     */
    public fun endpointName(): String

    /**
     * The attribute of the input data that represents the ground truth label.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-inferenceattribute)
     */
    public fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

    /**
     * Path to the filesystem where the endpoint data is available to the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-localpath)
     */
    public fun localPath(): String

    /**
     * In a classification problem, the attribute that represents the class probability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-probabilityattribute)
     */
    public fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

    /**
     * The threshold for the class probability to be evaluated as a positive result.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-probabilitythresholdattribute)
     */
    public fun probabilityThresholdAttribute(): Number? =
        unwrap(this).getProbabilityThresholdAttribute()

    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an Amazon S3
     * key.
     *
     * Defaults to `FullyReplicated`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-s3datadistributiontype)
     */
    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    /**
     * Whether the `Pipe` or `File` is used as the input mode for transferring data for the
     * monitoring job.
     *
     * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that fit
     * in memory. Defaults to `File` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-s3inputmode)
     */
    public fun s3InputMode(): String? = unwrap(this).getS3InputMode()

    /**
     * If specified, monitoring jobs substract this time from the start time.
     *
     * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
     * Quality Monitoring
     * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-starttimeoffset)
     */
    public fun startTimeOffset(): String? = unwrap(this).getStartTimeOffset()

    /**
     * A builder for [EndpointInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endTimeOffset If specified, monitoring jobs substract this time from the end time.
       * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
       * Quality Monitoring
       * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
       * .
       */
      public fun endTimeOffset(endTimeOffset: String)

      /**
       * @param endpointName An endpoint in customer's account which has enabled `DataCaptureConfig`
       * enabled. 
       */
      public fun endpointName(endpointName: String)

      /**
       * @param inferenceAttribute The attribute of the input data that represents the ground truth
       * label.
       */
      public fun inferenceAttribute(inferenceAttribute: String)

      /**
       * @param localPath Path to the filesystem where the endpoint data is available to the
       * container. 
       */
      public fun localPath(localPath: String)

      /**
       * @param probabilityAttribute In a classification problem, the attribute that represents the
       * class probability.
       */
      public fun probabilityAttribute(probabilityAttribute: String)

      /**
       * @param probabilityThresholdAttribute The threshold for the class probability to be
       * evaluated as a positive result.
       */
      public fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number)

      /**
       * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully
       * replicated or sharded by an Amazon S3 key.
       * Defaults to `FullyReplicated`
       */
      public fun s3DataDistributionType(s3DataDistributionType: String)

      /**
       * @param s3InputMode Whether the `Pipe` or `File` is used as the input mode for transferring
       * data for the monitoring job.
       * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that
       * fit in memory. Defaults to `File` .
       */
      public fun s3InputMode(s3InputMode: String)

      /**
       * @param startTimeOffset If specified, monitoring jobs substract this time from the start
       * time.
       * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
       * Quality Monitoring
       * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
       * .
       */
      public fun startTimeOffset(startTimeOffset: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.EndpointInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.EndpointInputProperty.builder()

      /**
       * @param endTimeOffset If specified, monitoring jobs substract this time from the end time.
       * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
       * Quality Monitoring
       * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
       * .
       */
      override fun endTimeOffset(endTimeOffset: String) {
        cdkBuilder.endTimeOffset(endTimeOffset)
      }

      /**
       * @param endpointName An endpoint in customer's account which has enabled `DataCaptureConfig`
       * enabled. 
       */
      override fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
      }

      /**
       * @param inferenceAttribute The attribute of the input data that represents the ground truth
       * label.
       */
      override fun inferenceAttribute(inferenceAttribute: String) {
        cdkBuilder.inferenceAttribute(inferenceAttribute)
      }

      /**
       * @param localPath Path to the filesystem where the endpoint data is available to the
       * container. 
       */
      override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      /**
       * @param probabilityAttribute In a classification problem, the attribute that represents the
       * class probability.
       */
      override fun probabilityAttribute(probabilityAttribute: String) {
        cdkBuilder.probabilityAttribute(probabilityAttribute)
      }

      /**
       * @param probabilityThresholdAttribute The threshold for the class probability to be
       * evaluated as a positive result.
       */
      override fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number) {
        cdkBuilder.probabilityThresholdAttribute(probabilityThresholdAttribute)
      }

      /**
       * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully
       * replicated or sharded by an Amazon S3 key.
       * Defaults to `FullyReplicated`
       */
      override fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
      }

      /**
       * @param s3InputMode Whether the `Pipe` or `File` is used as the input mode for transferring
       * data for the monitoring job.
       * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that
       * fit in memory. Defaults to `File` .
       */
      override fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
      }

      /**
       * @param startTimeOffset If specified, monitoring jobs substract this time from the start
       * time.
       * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
       * Quality Monitoring
       * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
       * .
       */
      override fun startTimeOffset(startTimeOffset: String) {
        cdkBuilder.startTimeOffset(startTimeOffset)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.EndpointInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.EndpointInputProperty,
    ) : CdkObject(cdkObject), EndpointInputProperty {
      /**
       * If specified, monitoring jobs substract this time from the end time.
       *
       * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
       * Quality Monitoring
       * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-endtimeoffset)
       */
      override fun endTimeOffset(): String? = unwrap(this).getEndTimeOffset()

      /**
       * An endpoint in customer's account which has enabled `DataCaptureConfig` enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-endpointname)
       */
      override fun endpointName(): String = unwrap(this).getEndpointName()

      /**
       * The attribute of the input data that represents the ground truth label.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-inferenceattribute)
       */
      override fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

      /**
       * Path to the filesystem where the endpoint data is available to the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-localpath)
       */
      override fun localPath(): String = unwrap(this).getLocalPath()

      /**
       * In a classification problem, the attribute that represents the class probability.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-probabilityattribute)
       */
      override fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

      /**
       * The threshold for the class probability to be evaluated as a positive result.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-probabilitythresholdattribute)
       */
      override fun probabilityThresholdAttribute(): Number? =
          unwrap(this).getProbabilityThresholdAttribute()

      /**
       * Whether input data distributed in Amazon S3 is fully replicated or sharded by an Amazon S3
       * key.
       *
       * Defaults to `FullyReplicated`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-s3datadistributiontype)
       */
      override fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

      /**
       * Whether the `Pipe` or `File` is used as the input mode for transferring data for the
       * monitoring job.
       *
       * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that
       * fit in memory. Defaults to `File` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-s3inputmode)
       */
      override fun s3InputMode(): String? = unwrap(this).getS3InputMode()

      /**
       * If specified, monitoring jobs substract this time from the start time.
       *
       * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
       * Quality Monitoring
       * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html#cfn-sagemaker-modelqualityjobdefinition-endpointinput-starttimeoffset)
       */
      override fun startTimeOffset(): String? = unwrap(this).getStartTimeOffset()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.EndpointInputProperty):
          EndpointInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.EndpointInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.EndpointInputProperty
    }
  }

  public interface ModelQualityAppSpecificationProperty {
    /**
     * An array of arguments for the container used to run the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityappspecification.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification-containerarguments)
     */
    public fun containerArguments(): List<String> = unwrap(this).getContainerArguments() ?:
        emptyList()

    /**
     * Specifies the entrypoint for a container that the monitoring job runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityappspecification.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification-containerentrypoint)
     */
    public fun containerEntrypoint(): List<String> = unwrap(this).getContainerEntrypoint() ?:
        emptyList()

    /**
     * Sets the environment variables in the container that the monitoring job runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityappspecification.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification-environment)
     */
    public fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * The address of the container image that the monitoring job runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityappspecification.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification-imageuri)
     */
    public fun imageUri(): String

    /**
     * An Amazon S3 URI to a script that is called after analysis has been performed.
     *
     * Applicable only for the built-in (first party) containers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityappspecification.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification-postanalyticsprocessorsourceuri)
     */
    public fun postAnalyticsProcessorSourceUri(): String? =
        unwrap(this).getPostAnalyticsProcessorSourceUri()

    /**
     * The machine learning problem type of the model that the monitoring job monitors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityappspecification.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification-problemtype)
     */
    public fun problemType(): String

    /**
     * An Amazon S3 URI to a script that is called per row prior to running analysis.
     *
     * It can base64 decode the payload and convert it into a flattened JSON so that the built-in
     * container can use the converted data. Applicable only for the built-in (first party) containers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityappspecification.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification-recordpreprocessorsourceuri)
     */
    public fun recordPreprocessorSourceUri(): String? =
        unwrap(this).getRecordPreprocessorSourceUri()

    /**
     * A builder for [ModelQualityAppSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerArguments An array of arguments for the container used to run the
       * monitoring job.
       */
      public fun containerArguments(containerArguments: List<String>)

      /**
       * @param containerArguments An array of arguments for the container used to run the
       * monitoring job.
       */
      public fun containerArguments(vararg containerArguments: String)

      /**
       * @param containerEntrypoint Specifies the entrypoint for a container that the monitoring job
       * runs.
       */
      public fun containerEntrypoint(containerEntrypoint: List<String>)

      /**
       * @param containerEntrypoint Specifies the entrypoint for a container that the monitoring job
       * runs.
       */
      public fun containerEntrypoint(vararg containerEntrypoint: String)

      /**
       * @param environment Sets the environment variables in the container that the monitoring job
       * runs.
       */
      public fun environment(environment: IResolvable)

      /**
       * @param environment Sets the environment variables in the container that the monitoring job
       * runs.
       */
      public fun environment(environment: Map<String, String>)

      /**
       * @param imageUri The address of the container image that the monitoring job runs. 
       */
      public fun imageUri(imageUri: String)

      /**
       * @param postAnalyticsProcessorSourceUri An Amazon S3 URI to a script that is called after
       * analysis has been performed.
       * Applicable only for the built-in (first party) containers.
       */
      public fun postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri: String)

      /**
       * @param problemType The machine learning problem type of the model that the monitoring job
       * monitors. 
       */
      public fun problemType(problemType: String)

      /**
       * @param recordPreprocessorSourceUri An Amazon S3 URI to a script that is called per row
       * prior to running analysis.
       * It can base64 decode the payload and convert it into a flattened JSON so that the built-in
       * container can use the converted data. Applicable only for the built-in (first party)
       * containers.
       */
      public fun recordPreprocessorSourceUri(recordPreprocessorSourceUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty.builder()

      /**
       * @param containerArguments An array of arguments for the container used to run the
       * monitoring job.
       */
      override fun containerArguments(containerArguments: List<String>) {
        cdkBuilder.containerArguments(containerArguments)
      }

      /**
       * @param containerArguments An array of arguments for the container used to run the
       * monitoring job.
       */
      override fun containerArguments(vararg containerArguments: String): Unit =
          containerArguments(containerArguments.toList())

      /**
       * @param containerEntrypoint Specifies the entrypoint for a container that the monitoring job
       * runs.
       */
      override fun containerEntrypoint(containerEntrypoint: List<String>) {
        cdkBuilder.containerEntrypoint(containerEntrypoint)
      }

      /**
       * @param containerEntrypoint Specifies the entrypoint for a container that the monitoring job
       * runs.
       */
      override fun containerEntrypoint(vararg containerEntrypoint: String): Unit =
          containerEntrypoint(containerEntrypoint.toList())

      /**
       * @param environment Sets the environment variables in the container that the monitoring job
       * runs.
       */
      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      /**
       * @param environment Sets the environment variables in the container that the monitoring job
       * runs.
       */
      override fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
      }

      /**
       * @param imageUri The address of the container image that the monitoring job runs. 
       */
      override fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
      }

      /**
       * @param postAnalyticsProcessorSourceUri An Amazon S3 URI to a script that is called after
       * analysis has been performed.
       * Applicable only for the built-in (first party) containers.
       */
      override fun postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri: String) {
        cdkBuilder.postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri)
      }

      /**
       * @param problemType The machine learning problem type of the model that the monitoring job
       * monitors. 
       */
      override fun problemType(problemType: String) {
        cdkBuilder.problemType(problemType)
      }

      /**
       * @param recordPreprocessorSourceUri An Amazon S3 URI to a script that is called per row
       * prior to running analysis.
       * It can base64 decode the payload and convert it into a flattened JSON so that the built-in
       * container can use the converted data. Applicable only for the built-in (first party)
       * containers.
       */
      override fun recordPreprocessorSourceUri(recordPreprocessorSourceUri: String) {
        cdkBuilder.recordPreprocessorSourceUri(recordPreprocessorSourceUri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty,
    ) : CdkObject(cdkObject), ModelQualityAppSpecificationProperty {
      /**
       * An array of arguments for the container used to run the monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityappspecification.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification-containerarguments)
       */
      override fun containerArguments(): List<String> = unwrap(this).getContainerArguments() ?:
          emptyList()

      /**
       * Specifies the entrypoint for a container that the monitoring job runs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityappspecification.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification-containerentrypoint)
       */
      override fun containerEntrypoint(): List<String> = unwrap(this).getContainerEntrypoint() ?:
          emptyList()

      /**
       * Sets the environment variables in the container that the monitoring job runs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityappspecification.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification-environment)
       */
      override fun environment(): Any? = unwrap(this).getEnvironment()

      /**
       * The address of the container image that the monitoring job runs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityappspecification.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification-imageuri)
       */
      override fun imageUri(): String = unwrap(this).getImageUri()

      /**
       * An Amazon S3 URI to a script that is called after analysis has been performed.
       *
       * Applicable only for the built-in (first party) containers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityappspecification.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification-postanalyticsprocessorsourceuri)
       */
      override fun postAnalyticsProcessorSourceUri(): String? =
          unwrap(this).getPostAnalyticsProcessorSourceUri()

      /**
       * The machine learning problem type of the model that the monitoring job monitors.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityappspecification.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification-problemtype)
       */
      override fun problemType(): String = unwrap(this).getProblemType()

      /**
       * An Amazon S3 URI to a script that is called per row prior to running analysis.
       *
       * It can base64 decode the payload and convert it into a flattened JSON so that the built-in
       * container can use the converted data. Applicable only for the built-in (first party)
       * containers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityappspecification.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification-recordpreprocessorsourceuri)
       */
      override fun recordPreprocessorSourceUri(): String? =
          unwrap(this).getRecordPreprocessorSourceUri()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty
    }
  }

  public interface ClusterConfigProperty {
    /**
     * The number of ML compute instances to use in the model monitoring job.
     *
     * For distributed processing jobs, specify a value greater than 1. The default value is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-clusterconfig.html#cfn-sagemaker-modelqualityjobdefinition-clusterconfig-instancecount)
     */
    public fun instanceCount(): Number

    /**
     * The ML compute instance type for the processing job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-clusterconfig.html#cfn-sagemaker-modelqualityjobdefinition-clusterconfig-instancetype)
     */
    public fun instanceType(): String

    /**
     * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt data on
     * the storage volume attached to the ML compute instance(s) that run the model monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-clusterconfig.html#cfn-sagemaker-modelqualityjobdefinition-clusterconfig-volumekmskeyid)
     */
    public fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

    /**
     * The size of the ML storage volume, in gigabytes, that you want to provision.
     *
     * You must specify sufficient ML storage for your scenario.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-clusterconfig.html#cfn-sagemaker-modelqualityjobdefinition-clusterconfig-volumesizeingb)
     */
    public fun volumeSizeInGb(): Number

    /**
     * A builder for [ClusterConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceCount The number of ML compute instances to use in the model monitoring job.
       * 
       * For distributed processing jobs, specify a value greater than 1. The default value is 1.
       */
      public fun instanceCount(instanceCount: Number)

      /**
       * @param instanceType The ML compute instance type for the processing job. 
       */
      public fun instanceType(instanceType: String)

      /**
       * @param volumeKmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker
       * uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the
       * model monitoring job.
       */
      public fun volumeKmsKeyId(volumeKmsKeyId: String)

      /**
       * @param volumeSizeInGb The size of the ML storage volume, in gigabytes, that you want to
       * provision. 
       * You must specify sufficient ML storage for your scenario.
       */
      public fun volumeSizeInGb(volumeSizeInGb: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ClusterConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ClusterConfigProperty.builder()

      /**
       * @param instanceCount The number of ML compute instances to use in the model monitoring job.
       * 
       * For distributed processing jobs, specify a value greater than 1. The default value is 1.
       */
      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      /**
       * @param instanceType The ML compute instance type for the processing job. 
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param volumeKmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker
       * uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the
       * model monitoring job.
       */
      override fun volumeKmsKeyId(volumeKmsKeyId: String) {
        cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
      }

      /**
       * @param volumeSizeInGb The size of the ML storage volume, in gigabytes, that you want to
       * provision. 
       * You must specify sufficient ML storage for your scenario.
       */
      override fun volumeSizeInGb(volumeSizeInGb: Number) {
        cdkBuilder.volumeSizeInGb(volumeSizeInGb)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ClusterConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ClusterConfigProperty,
    ) : CdkObject(cdkObject), ClusterConfigProperty {
      /**
       * The number of ML compute instances to use in the model monitoring job.
       *
       * For distributed processing jobs, specify a value greater than 1. The default value is 1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-clusterconfig.html#cfn-sagemaker-modelqualityjobdefinition-clusterconfig-instancecount)
       */
      override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      /**
       * The ML compute instance type for the processing job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-clusterconfig.html#cfn-sagemaker-modelqualityjobdefinition-clusterconfig-instancetype)
       */
      override fun instanceType(): String = unwrap(this).getInstanceType()

      /**
       * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt data on
       * the storage volume attached to the ML compute instance(s) that run the model monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-clusterconfig.html#cfn-sagemaker-modelqualityjobdefinition-clusterconfig-volumekmskeyid)
       */
      override fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

      /**
       * The size of the ML storage volume, in gigabytes, that you want to provision.
       *
       * You must specify sufficient ML storage for your scenario.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-clusterconfig.html#cfn-sagemaker-modelqualityjobdefinition-clusterconfig-volumesizeingb)
       */
      override fun volumeSizeInGb(): Number = unwrap(this).getVolumeSizeInGb()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ClusterConfigProperty):
          ClusterConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ClusterConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ClusterConfigProperty
    }
  }

  public interface ModelQualityBaselineConfigProperty {
    /**
     * The name of the job that performs baselining for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualitybaselineconfig.html#cfn-sagemaker-modelqualityjobdefinition-modelqualitybaselineconfig-baseliningjobname)
     */
    public fun baseliningJobName(): String? = unwrap(this).getBaseliningJobName()

    /**
     * The constraints resource for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualitybaselineconfig.html#cfn-sagemaker-modelqualityjobdefinition-modelqualitybaselineconfig-constraintsresource)
     */
    public fun constraintsResource(): Any? = unwrap(this).getConstraintsResource()

    /**
     * A builder for [ModelQualityBaselineConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param baseliningJobName The name of the job that performs baselining for the monitoring
       * job.
       */
      public fun baseliningJobName(baseliningJobName: String)

      /**
       * @param constraintsResource The constraints resource for a monitoring job.
       */
      public fun constraintsResource(constraintsResource: IResolvable)

      /**
       * @param constraintsResource The constraints resource for a monitoring job.
       */
      public fun constraintsResource(constraintsResource: ConstraintsResourceProperty)

      /**
       * @param constraintsResource The constraints resource for a monitoring job.
       */
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

      /**
       * @param baseliningJobName The name of the job that performs baselining for the monitoring
       * job.
       */
      override fun baseliningJobName(baseliningJobName: String) {
        cdkBuilder.baseliningJobName(baseliningJobName)
      }

      /**
       * @param constraintsResource The constraints resource for a monitoring job.
       */
      override fun constraintsResource(constraintsResource: IResolvable) {
        cdkBuilder.constraintsResource(constraintsResource.let(IResolvable::unwrap))
      }

      /**
       * @param constraintsResource The constraints resource for a monitoring job.
       */
      override fun constraintsResource(constraintsResource: ConstraintsResourceProperty) {
        cdkBuilder.constraintsResource(constraintsResource.let(ConstraintsResourceProperty::unwrap))
      }

      /**
       * @param constraintsResource The constraints resource for a monitoring job.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("945a966ddf16d5853bdc6ec099011802c4023515328fefceefe815ef1fa1c110")
      override
          fun constraintsResource(constraintsResource: ConstraintsResourceProperty.Builder.() -> Unit):
          Unit = constraintsResource(ConstraintsResourceProperty(constraintsResource))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty,
    ) : CdkObject(cdkObject), ModelQualityBaselineConfigProperty {
      /**
       * The name of the job that performs baselining for the monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualitybaselineconfig.html#cfn-sagemaker-modelqualityjobdefinition-modelqualitybaselineconfig-baseliningjobname)
       */
      override fun baseliningJobName(): String? = unwrap(this).getBaseliningJobName()

      /**
       * The constraints resource for a monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualitybaselineconfig.html#cfn-sagemaker-modelqualityjobdefinition-modelqualitybaselineconfig-constraintsresource)
       */
      override fun constraintsResource(): Any? = unwrap(this).getConstraintsResource()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty
    }
  }

  public interface MonitoringGroundTruthS3InputProperty {
    /**
     * The address of the Amazon S3 location of the ground truth labels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-monitoringgroundtruths3input.html#cfn-sagemaker-modelqualityjobdefinition-monitoringgroundtruths3input-s3uri)
     */
    public fun s3Uri(): String

    /**
     * A builder for [MonitoringGroundTruthS3InputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Uri The address of the Amazon S3 location of the ground truth labels. 
       */
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty.builder()

      /**
       * @param s3Uri The address of the Amazon S3 location of the ground truth labels. 
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty,
    ) : CdkObject(cdkObject), MonitoringGroundTruthS3InputProperty {
      /**
       * The address of the Amazon S3 location of the ground truth labels.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-monitoringgroundtruths3input.html#cfn-sagemaker-modelqualityjobdefinition-monitoringgroundtruths3input-s3uri)
       */
      override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty
    }
  }

  public interface BatchTransformInputProperty {
    /**
     * The Amazon S3 location being used to capture the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-datacaptureddestinations3uri)
     */
    public fun dataCapturedDestinationS3Uri(): String

    /**
     * The dataset format for your batch transform job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-datasetformat)
     */
    public fun datasetFormat(): Any

    /**
     * If specified, monitoring jobs subtract this time from the end time.
     *
     * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
     * Quality Monitoring
     * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-endtimeoffset)
     */
    public fun endTimeOffset(): String? = unwrap(this).getEndTimeOffset()

    /**
     * The attribute of the input data that represents the ground truth label.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-inferenceattribute)
     */
    public fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

    /**
     * Path to the filesystem where the batch transform data is available to the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-localpath)
     */
    public fun localPath(): String

    /**
     * In a classification problem, the attribute that represents the class probability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-probabilityattribute)
     */
    public fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

    /**
     * The threshold for the class probability to be evaluated as a positive result.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-probabilitythresholdattribute)
     */
    public fun probabilityThresholdAttribute(): Number? =
        unwrap(this).getProbabilityThresholdAttribute()

    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key.
     *
     * Defaults to `FullyReplicated`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-s3datadistributiontype)
     */
    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    /**
     * Whether the `Pipe` or `File` is used as the input mode for transferring data for the
     * monitoring job.
     *
     * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that fit
     * in memory. Defaults to `File` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-s3inputmode)
     */
    public fun s3InputMode(): String? = unwrap(this).getS3InputMode()

    /**
     * If specified, monitoring jobs substract this time from the start time.
     *
     * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
     * Quality Monitoring
     * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-starttimeoffset)
     */
    public fun startTimeOffset(): String? = unwrap(this).getStartTimeOffset()

    /**
     * A builder for [BatchTransformInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataCapturedDestinationS3Uri The Amazon S3 location being used to capture the data. 
       */
      public fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String)

      /**
       * @param datasetFormat The dataset format for your batch transform job. 
       */
      public fun datasetFormat(datasetFormat: IResolvable)

      /**
       * @param datasetFormat The dataset format for your batch transform job. 
       */
      public fun datasetFormat(datasetFormat: DatasetFormatProperty)

      /**
       * @param datasetFormat The dataset format for your batch transform job. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27387335d2a360eb7f2594f4d92ab11a62154e63c2687e102772fc6b98dbf674")
      public fun datasetFormat(datasetFormat: DatasetFormatProperty.Builder.() -> Unit)

      /**
       * @param endTimeOffset If specified, monitoring jobs subtract this time from the end time.
       * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
       * Quality Monitoring
       * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
       * .
       */
      public fun endTimeOffset(endTimeOffset: String)

      /**
       * @param inferenceAttribute The attribute of the input data that represents the ground truth
       * label.
       */
      public fun inferenceAttribute(inferenceAttribute: String)

      /**
       * @param localPath Path to the filesystem where the batch transform data is available to the
       * container. 
       */
      public fun localPath(localPath: String)

      /**
       * @param probabilityAttribute In a classification problem, the attribute that represents the
       * class probability.
       */
      public fun probabilityAttribute(probabilityAttribute: String)

      /**
       * @param probabilityThresholdAttribute The threshold for the class probability to be
       * evaluated as a positive result.
       */
      public fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number)

      /**
       * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully
       * replicated or sharded by an S3 key.
       * Defaults to `FullyReplicated`
       */
      public fun s3DataDistributionType(s3DataDistributionType: String)

      /**
       * @param s3InputMode Whether the `Pipe` or `File` is used as the input mode for transferring
       * data for the monitoring job.
       * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that
       * fit in memory. Defaults to `File` .
       */
      public fun s3InputMode(s3InputMode: String)

      /**
       * @param startTimeOffset If specified, monitoring jobs substract this time from the start
       * time.
       * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
       * Quality Monitoring
       * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
       * .
       */
      public fun startTimeOffset(startTimeOffset: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.BatchTransformInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.BatchTransformInputProperty.builder()

      /**
       * @param dataCapturedDestinationS3Uri The Amazon S3 location being used to capture the data. 
       */
      override fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String) {
        cdkBuilder.dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri)
      }

      /**
       * @param datasetFormat The dataset format for your batch transform job. 
       */
      override fun datasetFormat(datasetFormat: IResolvable) {
        cdkBuilder.datasetFormat(datasetFormat.let(IResolvable::unwrap))
      }

      /**
       * @param datasetFormat The dataset format for your batch transform job. 
       */
      override fun datasetFormat(datasetFormat: DatasetFormatProperty) {
        cdkBuilder.datasetFormat(datasetFormat.let(DatasetFormatProperty::unwrap))
      }

      /**
       * @param datasetFormat The dataset format for your batch transform job. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27387335d2a360eb7f2594f4d92ab11a62154e63c2687e102772fc6b98dbf674")
      override fun datasetFormat(datasetFormat: DatasetFormatProperty.Builder.() -> Unit): Unit =
          datasetFormat(DatasetFormatProperty(datasetFormat))

      /**
       * @param endTimeOffset If specified, monitoring jobs subtract this time from the end time.
       * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
       * Quality Monitoring
       * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
       * .
       */
      override fun endTimeOffset(endTimeOffset: String) {
        cdkBuilder.endTimeOffset(endTimeOffset)
      }

      /**
       * @param inferenceAttribute The attribute of the input data that represents the ground truth
       * label.
       */
      override fun inferenceAttribute(inferenceAttribute: String) {
        cdkBuilder.inferenceAttribute(inferenceAttribute)
      }

      /**
       * @param localPath Path to the filesystem where the batch transform data is available to the
       * container. 
       */
      override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      /**
       * @param probabilityAttribute In a classification problem, the attribute that represents the
       * class probability.
       */
      override fun probabilityAttribute(probabilityAttribute: String) {
        cdkBuilder.probabilityAttribute(probabilityAttribute)
      }

      /**
       * @param probabilityThresholdAttribute The threshold for the class probability to be
       * evaluated as a positive result.
       */
      override fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number) {
        cdkBuilder.probabilityThresholdAttribute(probabilityThresholdAttribute)
      }

      /**
       * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully
       * replicated or sharded by an S3 key.
       * Defaults to `FullyReplicated`
       */
      override fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
      }

      /**
       * @param s3InputMode Whether the `Pipe` or `File` is used as the input mode for transferring
       * data for the monitoring job.
       * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that
       * fit in memory. Defaults to `File` .
       */
      override fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
      }

      /**
       * @param startTimeOffset If specified, monitoring jobs substract this time from the start
       * time.
       * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
       * Quality Monitoring
       * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
       * .
       */
      override fun startTimeOffset(startTimeOffset: String) {
        cdkBuilder.startTimeOffset(startTimeOffset)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.BatchTransformInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.BatchTransformInputProperty,
    ) : CdkObject(cdkObject), BatchTransformInputProperty {
      /**
       * The Amazon S3 location being used to capture the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-datacaptureddestinations3uri)
       */
      override fun dataCapturedDestinationS3Uri(): String =
          unwrap(this).getDataCapturedDestinationS3Uri()

      /**
       * The dataset format for your batch transform job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-datasetformat)
       */
      override fun datasetFormat(): Any = unwrap(this).getDatasetFormat()

      /**
       * If specified, monitoring jobs subtract this time from the end time.
       *
       * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
       * Quality Monitoring
       * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-endtimeoffset)
       */
      override fun endTimeOffset(): String? = unwrap(this).getEndTimeOffset()

      /**
       * The attribute of the input data that represents the ground truth label.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-inferenceattribute)
       */
      override fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

      /**
       * Path to the filesystem where the batch transform data is available to the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-localpath)
       */
      override fun localPath(): String = unwrap(this).getLocalPath()

      /**
       * In a classification problem, the attribute that represents the class probability.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-probabilityattribute)
       */
      override fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

      /**
       * The threshold for the class probability to be evaluated as a positive result.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-probabilitythresholdattribute)
       */
      override fun probabilityThresholdAttribute(): Number? =
          unwrap(this).getProbabilityThresholdAttribute()

      /**
       * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key.
       *
       * Defaults to `FullyReplicated`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-s3datadistributiontype)
       */
      override fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

      /**
       * Whether the `Pipe` or `File` is used as the input mode for transferring data for the
       * monitoring job.
       *
       * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that
       * fit in memory. Defaults to `File` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-s3inputmode)
       */
      override fun s3InputMode(): String? = unwrap(this).getS3InputMode()

      /**
       * If specified, monitoring jobs substract this time from the start time.
       *
       * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
       * Quality Monitoring
       * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelqualityjobdefinition-batchtransforminput-starttimeoffset)
       */
      override fun startTimeOffset(): String? = unwrap(this).getStartTimeOffset()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchTransformInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.BatchTransformInputProperty):
          BatchTransformInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchTransformInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.BatchTransformInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.BatchTransformInputProperty
    }
  }

  public interface JsonProperty {
    /**
     * A boolean flag indicating if it is JSON line format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-json.html#cfn-sagemaker-modelqualityjobdefinition-json-line)
     */
    public fun line(): Any? = unwrap(this).getLine()

    /**
     * A builder for [JsonProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param line A boolean flag indicating if it is JSON line format.
       */
      public fun line(line: Boolean)

      /**
       * @param line A boolean flag indicating if it is JSON line format.
       */
      public fun line(line: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.JsonProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.JsonProperty.builder()

      /**
       * @param line A boolean flag indicating if it is JSON line format.
       */
      override fun line(line: Boolean) {
        cdkBuilder.line(line)
      }

      /**
       * @param line A boolean flag indicating if it is JSON line format.
       */
      override fun line(line: IResolvable) {
        cdkBuilder.line(line.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.JsonProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.JsonProperty,
    ) : CdkObject(cdkObject), JsonProperty {
      /**
       * A boolean flag indicating if it is JSON line format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-json.html#cfn-sagemaker-modelqualityjobdefinition-json-line)
       */
      override fun line(): Any? = unwrap(this).getLine()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JsonProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.JsonProperty):
          JsonProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.JsonProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.JsonProperty
    }
  }

  public interface MonitoringResourcesProperty {
    /**
     * The configuration for the cluster resources used to run the processing job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-monitoringresources.html#cfn-sagemaker-modelqualityjobdefinition-monitoringresources-clusterconfig)
     */
    public fun clusterConfig(): Any

    /**
     * A builder for [MonitoringResourcesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clusterConfig The configuration for the cluster resources used to run the processing
       * job. 
       */
      public fun clusterConfig(clusterConfig: IResolvable)

      /**
       * @param clusterConfig The configuration for the cluster resources used to run the processing
       * job. 
       */
      public fun clusterConfig(clusterConfig: ClusterConfigProperty)

      /**
       * @param clusterConfig The configuration for the cluster resources used to run the processing
       * job. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("86a650a67c137f45478cebc14363efd0d878d4dab3ff569186e1a3a8abecc98a")
      public fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringResourcesProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringResourcesProperty.builder()

      /**
       * @param clusterConfig The configuration for the cluster resources used to run the processing
       * job. 
       */
      override fun clusterConfig(clusterConfig: IResolvable) {
        cdkBuilder.clusterConfig(clusterConfig.let(IResolvable::unwrap))
      }

      /**
       * @param clusterConfig The configuration for the cluster resources used to run the processing
       * job. 
       */
      override fun clusterConfig(clusterConfig: ClusterConfigProperty) {
        cdkBuilder.clusterConfig(clusterConfig.let(ClusterConfigProperty::unwrap))
      }

      /**
       * @param clusterConfig The configuration for the cluster resources used to run the processing
       * job. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("86a650a67c137f45478cebc14363efd0d878d4dab3ff569186e1a3a8abecc98a")
      override fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit): Unit =
          clusterConfig(ClusterConfigProperty(clusterConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringResourcesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringResourcesProperty,
    ) : CdkObject(cdkObject), MonitoringResourcesProperty {
      /**
       * The configuration for the cluster resources used to run the processing job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-monitoringresources.html#cfn-sagemaker-modelqualityjobdefinition-monitoringresources-clusterconfig)
       */
      override fun clusterConfig(): Any = unwrap(this).getClusterConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringResourcesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringResourcesProperty):
          MonitoringResourcesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringResourcesProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringResourcesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringResourcesProperty
    }
  }

  public interface S3OutputProperty {
    /**
     * The local path to the Amazon S3 storage location where Amazon SageMaker saves the results of
     * a monitoring job.
     *
     * LocalPath is an absolute path for the output data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-s3output.html#cfn-sagemaker-modelqualityjobdefinition-s3output-localpath)
     */
    public fun localPath(): String

    /**
     * Whether to upload the results of the monitoring job continuously or after the job completes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-s3output.html#cfn-sagemaker-modelqualityjobdefinition-s3output-s3uploadmode)
     */
    public fun s3UploadMode(): String? = unwrap(this).getS3UploadMode()

    /**
     * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results
     * of a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-s3output.html#cfn-sagemaker-modelqualityjobdefinition-s3output-s3uri)
     */
    public fun s3Uri(): String

    /**
     * A builder for [S3OutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param localPath The local path to the Amazon S3 storage location where Amazon SageMaker
       * saves the results of a monitoring job. 
       * LocalPath is an absolute path for the output data.
       */
      public fun localPath(localPath: String)

      /**
       * @param s3UploadMode Whether to upload the results of the monitoring job continuously or
       * after the job completes.
       */
      public fun s3UploadMode(s3UploadMode: String)

      /**
       * @param s3Uri A URI that identifies the Amazon S3 storage location where Amazon SageMaker
       * saves the results of a monitoring job. 
       */
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.S3OutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.S3OutputProperty.builder()

      /**
       * @param localPath The local path to the Amazon S3 storage location where Amazon SageMaker
       * saves the results of a monitoring job. 
       * LocalPath is an absolute path for the output data.
       */
      override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      /**
       * @param s3UploadMode Whether to upload the results of the monitoring job continuously or
       * after the job completes.
       */
      override fun s3UploadMode(s3UploadMode: String) {
        cdkBuilder.s3UploadMode(s3UploadMode)
      }

      /**
       * @param s3Uri A URI that identifies the Amazon S3 storage location where Amazon SageMaker
       * saves the results of a monitoring job. 
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.S3OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.S3OutputProperty,
    ) : CdkObject(cdkObject), S3OutputProperty {
      /**
       * The local path to the Amazon S3 storage location where Amazon SageMaker saves the results
       * of a monitoring job.
       *
       * LocalPath is an absolute path for the output data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-s3output.html#cfn-sagemaker-modelqualityjobdefinition-s3output-localpath)
       */
      override fun localPath(): String = unwrap(this).getLocalPath()

      /**
       * Whether to upload the results of the monitoring job continuously or after the job
       * completes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-s3output.html#cfn-sagemaker-modelqualityjobdefinition-s3output-s3uploadmode)
       */
      override fun s3UploadMode(): String? = unwrap(this).getS3UploadMode()

      /**
       * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the
       * results of a monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-s3output.html#cfn-sagemaker-modelqualityjobdefinition-s3output-s3uri)
       */
      override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.S3OutputProperty):
          S3OutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.S3OutputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.S3OutputProperty
    }
  }

  public interface StoppingConditionProperty {
    /**
     * The maximum length of time, in seconds, that a training or compilation job can run before it
     * is stopped.
     *
     * For compilation jobs, if the job does not complete during this time, a `TimeOut` error is
     * generated. We recommend starting with 900 seconds and increasing as necessary based on your
     * model.
     *
     * For all other jobs, if the job does not complete during this time, SageMaker ends the job.
     * When `RetryStrategy` is specified in the job request, `MaxRuntimeInSeconds` specifies the
     * maximum time for all of the attempts in total, not each individual attempt. The default value is
     * 1 day. The maximum value is 28 days.
     *
     * The maximum time that a `TrainingJob` can run in total, including any time spent publishing
     * metrics or archiving and uploading models after it has been stopped, is 30 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-stoppingcondition.html#cfn-sagemaker-modelqualityjobdefinition-stoppingcondition-maxruntimeinseconds)
     */
    public fun maxRuntimeInSeconds(): Number

    /**
     * A builder for [StoppingConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxRuntimeInSeconds The maximum length of time, in seconds, that a training or
       * compilation job can run before it is stopped. 
       * For compilation jobs, if the job does not complete during this time, a `TimeOut` error is
       * generated. We recommend starting with 900 seconds and increasing as necessary based on your
       * model.
       *
       * For all other jobs, if the job does not complete during this time, SageMaker ends the job.
       * When `RetryStrategy` is specified in the job request, `MaxRuntimeInSeconds` specifies the
       * maximum time for all of the attempts in total, not each individual attempt. The default value
       * is 1 day. The maximum value is 28 days.
       *
       * The maximum time that a `TrainingJob` can run in total, including any time spent publishing
       * metrics or archiving and uploading models after it has been stopped, is 30 days.
       */
      public fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.StoppingConditionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.StoppingConditionProperty.builder()

      /**
       * @param maxRuntimeInSeconds The maximum length of time, in seconds, that a training or
       * compilation job can run before it is stopped. 
       * For compilation jobs, if the job does not complete during this time, a `TimeOut` error is
       * generated. We recommend starting with 900 seconds and increasing as necessary based on your
       * model.
       *
       * For all other jobs, if the job does not complete during this time, SageMaker ends the job.
       * When `RetryStrategy` is specified in the job request, `MaxRuntimeInSeconds` specifies the
       * maximum time for all of the attempts in total, not each individual attempt. The default value
       * is 1 day. The maximum value is 28 days.
       *
       * The maximum time that a `TrainingJob` can run in total, including any time spent publishing
       * metrics or archiving and uploading models after it has been stopped, is 30 days.
       */
      override fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number) {
        cdkBuilder.maxRuntimeInSeconds(maxRuntimeInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.StoppingConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.StoppingConditionProperty,
    ) : CdkObject(cdkObject), StoppingConditionProperty {
      /**
       * The maximum length of time, in seconds, that a training or compilation job can run before
       * it is stopped.
       *
       * For compilation jobs, if the job does not complete during this time, a `TimeOut` error is
       * generated. We recommend starting with 900 seconds and increasing as necessary based on your
       * model.
       *
       * For all other jobs, if the job does not complete during this time, SageMaker ends the job.
       * When `RetryStrategy` is specified in the job request, `MaxRuntimeInSeconds` specifies the
       * maximum time for all of the attempts in total, not each individual attempt. The default value
       * is 1 day. The maximum value is 28 days.
       *
       * The maximum time that a `TrainingJob` can run in total, including any time spent publishing
       * metrics or archiving and uploading models after it has been stopped, is 30 days.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-stoppingcondition.html#cfn-sagemaker-modelqualityjobdefinition-stoppingcondition-maxruntimeinseconds)
       */
      override fun maxRuntimeInSeconds(): Number = unwrap(this).getMaxRuntimeInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StoppingConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.StoppingConditionProperty):
          StoppingConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StoppingConditionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.StoppingConditionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.StoppingConditionProperty
    }
  }

  public interface MonitoringOutputConfigProperty {
    /**
     * The AWS Key Management Service ( AWS KMS ) key that Amazon SageMaker uses to encrypt the
     * model artifacts at rest using Amazon S3 server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-monitoringoutputconfig.html#cfn-sagemaker-modelqualityjobdefinition-monitoringoutputconfig-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Monitoring outputs for monitoring jobs.
     *
     * This is where the output of the periodic monitoring jobs is uploaded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-monitoringoutputconfig.html#cfn-sagemaker-modelqualityjobdefinition-monitoringoutputconfig-monitoringoutputs)
     */
    public fun monitoringOutputs(): Any

    /**
     * A builder for [MonitoringOutputConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The AWS Key Management Service ( AWS KMS ) key that Amazon SageMaker uses
       * to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
       * This is where the output of the periodic monitoring jobs is uploaded.
       */
      public fun monitoringOutputs(monitoringOutputs: IResolvable)

      /**
       * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
       * This is where the output of the periodic monitoring jobs is uploaded.
       */
      public fun monitoringOutputs(monitoringOutputs: List<Any>)

      /**
       * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
       * This is where the output of the periodic monitoring jobs is uploaded.
       */
      public fun monitoringOutputs(vararg monitoringOutputs: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputConfigProperty.builder()

      /**
       * @param kmsKeyId The AWS Key Management Service ( AWS KMS ) key that Amazon SageMaker uses
       * to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
       * This is where the output of the periodic monitoring jobs is uploaded.
       */
      override fun monitoringOutputs(monitoringOutputs: IResolvable) {
        cdkBuilder.monitoringOutputs(monitoringOutputs.let(IResolvable::unwrap))
      }

      /**
       * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
       * This is where the output of the periodic monitoring jobs is uploaded.
       */
      override fun monitoringOutputs(monitoringOutputs: List<Any>) {
        cdkBuilder.monitoringOutputs(monitoringOutputs)
      }

      /**
       * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
       * This is where the output of the periodic monitoring jobs is uploaded.
       */
      override fun monitoringOutputs(vararg monitoringOutputs: Any): Unit =
          monitoringOutputs(monitoringOutputs.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputConfigProperty,
    ) : CdkObject(cdkObject), MonitoringOutputConfigProperty {
      /**
       * The AWS Key Management Service ( AWS KMS ) key that Amazon SageMaker uses to encrypt the
       * model artifacts at rest using Amazon S3 server-side encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-monitoringoutputconfig.html#cfn-sagemaker-modelqualityjobdefinition-monitoringoutputconfig-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * Monitoring outputs for monitoring jobs.
       *
       * This is where the output of the periodic monitoring jobs is uploaded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-monitoringoutputconfig.html#cfn-sagemaker-modelqualityjobdefinition-monitoringoutputconfig-monitoringoutputs)
       */
      override fun monitoringOutputs(): Any = unwrap(this).getMonitoringOutputs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringOutputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputConfigProperty):
          MonitoringOutputConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringOutputConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputConfigProperty
    }
  }

  public interface NetworkConfigProperty {
    /**
     * Whether to encrypt all communications between distributed processing jobs.
     *
     * Choose `True` to encrypt communications. Encryption provides greater security for distributed
     * processing jobs, but the processing might take longer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-networkconfig.html#cfn-sagemaker-modelqualityjobdefinition-networkconfig-enableintercontainertrafficencryption)
     */
    public fun enableInterContainerTrafficEncryption(): Any? =
        unwrap(this).getEnableInterContainerTrafficEncryption()

    /**
     * Whether to allow inbound and outbound network calls to and from the containers used for the
     * processing job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-networkconfig.html#cfn-sagemaker-modelqualityjobdefinition-networkconfig-enablenetworkisolation)
     */
    public fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

    /**
     * Specifies a VPC that your training jobs and hosted models have access to.
     *
     * Control access to and from your training and model containers by configuring the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-networkconfig.html#cfn-sagemaker-modelqualityjobdefinition-networkconfig-vpcconfig)
     */
    public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

    /**
     * A builder for [NetworkConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableInterContainerTrafficEncryption Whether to encrypt all communications between
       * distributed processing jobs.
       * Choose `True` to encrypt communications. Encryption provides greater security for
       * distributed processing jobs, but the processing might take longer.
       */
      public
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: Boolean)

      /**
       * @param enableInterContainerTrafficEncryption Whether to encrypt all communications between
       * distributed processing jobs.
       * Choose `True` to encrypt communications. Encryption provides greater security for
       * distributed processing jobs, but the processing might take longer.
       */
      public
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: IResolvable)

      /**
       * @param enableNetworkIsolation Whether to allow inbound and outbound network calls to and
       * from the containers used for the processing job.
       */
      public fun enableNetworkIsolation(enableNetworkIsolation: Boolean)

      /**
       * @param enableNetworkIsolation Whether to allow inbound and outbound network calls to and
       * from the containers used for the processing job.
       */
      public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable)

      /**
       * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
       * Control access to and from your training and model containers by configuring the VPC.
       */
      public fun vpcConfig(vpcConfig: IResolvable)

      /**
       * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
       * Control access to and from your training and model containers by configuring the VPC.
       */
      public fun vpcConfig(vpcConfig: VpcConfigProperty)

      /**
       * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
       * Control access to and from your training and model containers by configuring the VPC.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("156c44cc55e4ab74f58e06f442ad8d9e3727e4582c4f748362220851fe3cd55e")
      public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.NetworkConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.NetworkConfigProperty.builder()

      /**
       * @param enableInterContainerTrafficEncryption Whether to encrypt all communications between
       * distributed processing jobs.
       * Choose `True` to encrypt communications. Encryption provides greater security for
       * distributed processing jobs, but the processing might take longer.
       */
      override
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: Boolean) {
        cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption)
      }

      /**
       * @param enableInterContainerTrafficEncryption Whether to encrypt all communications between
       * distributed processing jobs.
       * Choose `True` to encrypt communications. Encryption provides greater security for
       * distributed processing jobs, but the processing might take longer.
       */
      override
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: IResolvable) {
        cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption.let(IResolvable::unwrap))
      }

      /**
       * @param enableNetworkIsolation Whether to allow inbound and outbound network calls to and
       * from the containers used for the processing job.
       */
      override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
        cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
      }

      /**
       * @param enableNetworkIsolation Whether to allow inbound and outbound network calls to and
       * from the containers used for the processing job.
       */
      override fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
        cdkBuilder.enableNetworkIsolation(enableNetworkIsolation.let(IResolvable::unwrap))
      }

      /**
       * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
       * Control access to and from your training and model containers by configuring the VPC.
       */
      override fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
      }

      /**
       * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
       * Control access to and from your training and model containers by configuring the VPC.
       */
      override fun vpcConfig(vpcConfig: VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
      }

      /**
       * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
       * Control access to and from your training and model containers by configuring the VPC.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("156c44cc55e4ab74f58e06f442ad8d9e3727e4582c4f748362220851fe3cd55e")
      override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
          vpcConfig(VpcConfigProperty(vpcConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.NetworkConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.NetworkConfigProperty,
    ) : CdkObject(cdkObject), NetworkConfigProperty {
      /**
       * Whether to encrypt all communications between distributed processing jobs.
       *
       * Choose `True` to encrypt communications. Encryption provides greater security for
       * distributed processing jobs, but the processing might take longer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-networkconfig.html#cfn-sagemaker-modelqualityjobdefinition-networkconfig-enableintercontainertrafficencryption)
       */
      override fun enableInterContainerTrafficEncryption(): Any? =
          unwrap(this).getEnableInterContainerTrafficEncryption()

      /**
       * Whether to allow inbound and outbound network calls to and from the containers used for the
       * processing job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-networkconfig.html#cfn-sagemaker-modelqualityjobdefinition-networkconfig-enablenetworkisolation)
       */
      override fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

      /**
       * Specifies a VPC that your training jobs and hosted models have access to.
       *
       * Control access to and from your training and model containers by configuring the VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-networkconfig.html#cfn-sagemaker-modelqualityjobdefinition-networkconfig-vpcconfig)
       */
      override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.NetworkConfigProperty):
          NetworkConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.NetworkConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.NetworkConfigProperty
    }
  }

  public interface CsvProperty {
    /**
     * A boolean flag indicating if given CSV has header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-csv.html#cfn-sagemaker-modelqualityjobdefinition-csv-header)
     */
    public fun `header`(): Any? = unwrap(this).getHeader()

    /**
     * A builder for [CsvProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param header A boolean flag indicating if given CSV has header.
       */
      public fun `header`(`header`: Boolean)

      /**
       * @param header A boolean flag indicating if given CSV has header.
       */
      public fun `header`(`header`: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.CsvProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.CsvProperty.builder()

      /**
       * @param header A boolean flag indicating if given CSV has header.
       */
      override fun `header`(`header`: Boolean) {
        cdkBuilder.`header`(`header`)
      }

      /**
       * @param header A boolean flag indicating if given CSV has header.
       */
      override fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.CsvProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.CsvProperty,
    ) : CdkObject(cdkObject), CsvProperty {
      /**
       * A boolean flag indicating if given CSV has header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-csv.html#cfn-sagemaker-modelqualityjobdefinition-csv-header)
       */
      override fun `header`(): Any? = unwrap(this).getHeader()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CsvProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.CsvProperty):
          CsvProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.CsvProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.CsvProperty
    }
  }

  public interface VpcConfigProperty {
    /**
     * The VPC security group IDs, in the form `sg-xxxxxxxx` .
     *
     * Specify the security groups for the VPC that is specified in the `Subnets` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-vpcconfig.html#cfn-sagemaker-modelqualityjobdefinition-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * The ID of the subnets in the VPC to which you want to connect your training job or model.
     *
     * For information about the availability of specific instance types, see [Supported Instance
     * Types and Availability
     * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-vpcconfig.html#cfn-sagemaker-modelqualityjobdefinition-vpcconfig-subnets)
     */
    public fun subnets(): List<String>

    /**
     * A builder for [VpcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The VPC security group IDs, in the form `sg-xxxxxxxx` . 
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The VPC security group IDs, in the form `sg-xxxxxxxx` . 
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnets The ID of the subnets in the VPC to which you want to connect your training
       * job or model. 
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets The ID of the subnets in the VPC to which you want to connect your training
       * job or model. 
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       */
      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.VpcConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.VpcConfigProperty.builder()

      /**
       * @param securityGroupIds The VPC security group IDs, in the form `sg-xxxxxxxx` . 
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The VPC security group IDs, in the form `sg-xxxxxxxx` . 
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnets The ID of the subnets in the VPC to which you want to connect your training
       * job or model. 
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets The ID of the subnets in the VPC to which you want to connect your training
       * job or model. 
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.VpcConfigProperty,
    ) : CdkObject(cdkObject), VpcConfigProperty {
      /**
       * The VPC security group IDs, in the form `sg-xxxxxxxx` .
       *
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-vpcconfig.html#cfn-sagemaker-modelqualityjobdefinition-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * The ID of the subnets in the VPC to which you want to connect your training job or model.
       *
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-vpcconfig.html#cfn-sagemaker-modelqualityjobdefinition-vpcconfig-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.VpcConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.VpcConfigProperty
    }
  }

  public interface DatasetFormatProperty {
    /**
     * The CSV format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-datasetformat.html#cfn-sagemaker-modelqualityjobdefinition-datasetformat-csv)
     */
    public fun csv(): Any? = unwrap(this).getCsv()

    /**
     * The Json format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-datasetformat.html#cfn-sagemaker-modelqualityjobdefinition-datasetformat-json)
     */
    public fun json(): Any? = unwrap(this).getJson()

    /**
     * A flag indicating if the dataset format is Parquet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-datasetformat.html#cfn-sagemaker-modelqualityjobdefinition-datasetformat-parquet)
     */
    public fun parquet(): Any? = unwrap(this).getParquet()

    /**
     * A builder for [DatasetFormatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param csv The CSV format.
       */
      public fun csv(csv: IResolvable)

      /**
       * @param csv The CSV format.
       */
      public fun csv(csv: CsvProperty)

      /**
       * @param csv The CSV format.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2610a4a45f311cd86c74dd1598067d2928e7010119e393ae4b16e3c1b121edde")
      public fun csv(csv: CsvProperty.Builder.() -> Unit)

      /**
       * @param json The Json format.
       */
      public fun json(json: IResolvable)

      /**
       * @param json The Json format.
       */
      public fun json(json: JsonProperty)

      /**
       * @param json The Json format.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0efa400048db4040dccefc62b9defa3adede02e5be2a2604a021eb6e03a99e2a")
      public fun json(json: JsonProperty.Builder.() -> Unit)

      /**
       * @param parquet A flag indicating if the dataset format is Parquet.
       */
      public fun parquet(parquet: Boolean)

      /**
       * @param parquet A flag indicating if the dataset format is Parquet.
       */
      public fun parquet(parquet: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.DatasetFormatProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.DatasetFormatProperty.builder()

      /**
       * @param csv The CSV format.
       */
      override fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv.let(IResolvable::unwrap))
      }

      /**
       * @param csv The CSV format.
       */
      override fun csv(csv: CsvProperty) {
        cdkBuilder.csv(csv.let(CsvProperty::unwrap))
      }

      /**
       * @param csv The CSV format.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2610a4a45f311cd86c74dd1598067d2928e7010119e393ae4b16e3c1b121edde")
      override fun csv(csv: CsvProperty.Builder.() -> Unit): Unit = csv(CsvProperty(csv))

      /**
       * @param json The Json format.
       */
      override fun json(json: IResolvable) {
        cdkBuilder.json(json.let(IResolvable::unwrap))
      }

      /**
       * @param json The Json format.
       */
      override fun json(json: JsonProperty) {
        cdkBuilder.json(json.let(JsonProperty::unwrap))
      }

      /**
       * @param json The Json format.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0efa400048db4040dccefc62b9defa3adede02e5be2a2604a021eb6e03a99e2a")
      override fun json(json: JsonProperty.Builder.() -> Unit): Unit = json(JsonProperty(json))

      /**
       * @param parquet A flag indicating if the dataset format is Parquet.
       */
      override fun parquet(parquet: Boolean) {
        cdkBuilder.parquet(parquet)
      }

      /**
       * @param parquet A flag indicating if the dataset format is Parquet.
       */
      override fun parquet(parquet: IResolvable) {
        cdkBuilder.parquet(parquet.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.DatasetFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.DatasetFormatProperty,
    ) : CdkObject(cdkObject), DatasetFormatProperty {
      /**
       * The CSV format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-datasetformat.html#cfn-sagemaker-modelqualityjobdefinition-datasetformat-csv)
       */
      override fun csv(): Any? = unwrap(this).getCsv()

      /**
       * The Json format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-datasetformat.html#cfn-sagemaker-modelqualityjobdefinition-datasetformat-json)
       */
      override fun json(): Any? = unwrap(this).getJson()

      /**
       * A flag indicating if the dataset format is Parquet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-datasetformat.html#cfn-sagemaker-modelqualityjobdefinition-datasetformat-parquet)
       */
      override fun parquet(): Any? = unwrap(this).getParquet()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.DatasetFormatProperty):
          DatasetFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetFormatProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.DatasetFormatProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.DatasetFormatProperty
    }
  }

  public interface ConstraintsResourceProperty {
    /**
     * The Amazon S3 URI for the constraints resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-constraintsresource.html#cfn-sagemaker-modelqualityjobdefinition-constraintsresource-s3uri)
     */
    public fun s3Uri(): String? = unwrap(this).getS3Uri()

    /**
     * A builder for [ConstraintsResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Uri The Amazon S3 URI for the constraints resource.
       */
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ConstraintsResourceProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ConstraintsResourceProperty.builder()

      /**
       * @param s3Uri The Amazon S3 URI for the constraints resource.
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ConstraintsResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ConstraintsResourceProperty,
    ) : CdkObject(cdkObject), ConstraintsResourceProperty {
      /**
       * The Amazon S3 URI for the constraints resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-constraintsresource.html#cfn-sagemaker-modelqualityjobdefinition-constraintsresource-s3uri)
       */
      override fun s3Uri(): String? = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConstraintsResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ConstraintsResourceProperty):
          ConstraintsResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConstraintsResourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ConstraintsResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ConstraintsResourceProperty
    }
  }

  public interface MonitoringOutputProperty {
    /**
     * The Amazon S3 storage location where the results of a monitoring job are saved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-monitoringoutput.html#cfn-sagemaker-modelqualityjobdefinition-monitoringoutput-s3output)
     */
    public fun s3Output(): Any

    /**
     * A builder for [MonitoringOutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Output The Amazon S3 storage location where the results of a monitoring job are
       * saved. 
       */
      public fun s3Output(s3Output: IResolvable)

      /**
       * @param s3Output The Amazon S3 storage location where the results of a monitoring job are
       * saved. 
       */
      public fun s3Output(s3Output: S3OutputProperty)

      /**
       * @param s3Output The Amazon S3 storage location where the results of a monitoring job are
       * saved. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f719a3c56ef446f5138f7833a61d999571362d1049fad9b0ca7e5022cd11c6e9")
      public fun s3Output(s3Output: S3OutputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputProperty.builder()

      /**
       * @param s3Output The Amazon S3 storage location where the results of a monitoring job are
       * saved. 
       */
      override fun s3Output(s3Output: IResolvable) {
        cdkBuilder.s3Output(s3Output.let(IResolvable::unwrap))
      }

      /**
       * @param s3Output The Amazon S3 storage location where the results of a monitoring job are
       * saved. 
       */
      override fun s3Output(s3Output: S3OutputProperty) {
        cdkBuilder.s3Output(s3Output.let(S3OutputProperty::unwrap))
      }

      /**
       * @param s3Output The Amazon S3 storage location where the results of a monitoring job are
       * saved. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f719a3c56ef446f5138f7833a61d999571362d1049fad9b0ca7e5022cd11c6e9")
      override fun s3Output(s3Output: S3OutputProperty.Builder.() -> Unit): Unit =
          s3Output(S3OutputProperty(s3Output))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputProperty,
    ) : CdkObject(cdkObject), MonitoringOutputProperty {
      /**
       * The Amazon S3 storage location where the results of a monitoring job are saved.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-monitoringoutput.html#cfn-sagemaker-modelqualityjobdefinition-monitoringoutput-s3output)
       */
      override fun s3Output(): Any = unwrap(this).getS3Output()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputProperty):
          MonitoringOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringOutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputProperty
    }
  }

  public interface ModelQualityJobInputProperty {
    /**
     * Input object for the batch transform job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityjobinput.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjobinput-batchtransforminput)
     */
    public fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

    /**
     * Input object for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityjobinput.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjobinput-endpointinput)
     */
    public fun endpointInput(): Any? = unwrap(this).getEndpointInput()

    /**
     * The ground truth label provided for the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityjobinput.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjobinput-groundtruths3input)
     */
    public fun groundTruthS3Input(): Any

    /**
     * A builder for [ModelQualityJobInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchTransformInput Input object for the batch transform job.
       */
      public fun batchTransformInput(batchTransformInput: IResolvable)

      /**
       * @param batchTransformInput Input object for the batch transform job.
       */
      public fun batchTransformInput(batchTransformInput: BatchTransformInputProperty)

      /**
       * @param batchTransformInput Input object for the batch transform job.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7fc15f7cd34c8b4775b1e9592f1892fc7bfb1853d2b3eefce3631c5df341e4f3")
      public
          fun batchTransformInput(batchTransformInput: BatchTransformInputProperty.Builder.() -> Unit)

      /**
       * @param endpointInput Input object for the endpoint.
       */
      public fun endpointInput(endpointInput: IResolvable)

      /**
       * @param endpointInput Input object for the endpoint.
       */
      public fun endpointInput(endpointInput: EndpointInputProperty)

      /**
       * @param endpointInput Input object for the endpoint.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95fa11a76deeccfc69f1de14b4f53dc6220ff8de6b230af13af411602f50d92e")
      public fun endpointInput(endpointInput: EndpointInputProperty.Builder.() -> Unit)

      /**
       * @param groundTruthS3Input The ground truth label provided for the model. 
       */
      public fun groundTruthS3Input(groundTruthS3Input: IResolvable)

      /**
       * @param groundTruthS3Input The ground truth label provided for the model. 
       */
      public fun groundTruthS3Input(groundTruthS3Input: MonitoringGroundTruthS3InputProperty)

      /**
       * @param groundTruthS3Input The ground truth label provided for the model. 
       */
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

      /**
       * @param batchTransformInput Input object for the batch transform job.
       */
      override fun batchTransformInput(batchTransformInput: IResolvable) {
        cdkBuilder.batchTransformInput(batchTransformInput.let(IResolvable::unwrap))
      }

      /**
       * @param batchTransformInput Input object for the batch transform job.
       */
      override fun batchTransformInput(batchTransformInput: BatchTransformInputProperty) {
        cdkBuilder.batchTransformInput(batchTransformInput.let(BatchTransformInputProperty::unwrap))
      }

      /**
       * @param batchTransformInput Input object for the batch transform job.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7fc15f7cd34c8b4775b1e9592f1892fc7bfb1853d2b3eefce3631c5df341e4f3")
      override
          fun batchTransformInput(batchTransformInput: BatchTransformInputProperty.Builder.() -> Unit):
          Unit = batchTransformInput(BatchTransformInputProperty(batchTransformInput))

      /**
       * @param endpointInput Input object for the endpoint.
       */
      override fun endpointInput(endpointInput: IResolvable) {
        cdkBuilder.endpointInput(endpointInput.let(IResolvable::unwrap))
      }

      /**
       * @param endpointInput Input object for the endpoint.
       */
      override fun endpointInput(endpointInput: EndpointInputProperty) {
        cdkBuilder.endpointInput(endpointInput.let(EndpointInputProperty::unwrap))
      }

      /**
       * @param endpointInput Input object for the endpoint.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95fa11a76deeccfc69f1de14b4f53dc6220ff8de6b230af13af411602f50d92e")
      override fun endpointInput(endpointInput: EndpointInputProperty.Builder.() -> Unit): Unit =
          endpointInput(EndpointInputProperty(endpointInput))

      /**
       * @param groundTruthS3Input The ground truth label provided for the model. 
       */
      override fun groundTruthS3Input(groundTruthS3Input: IResolvable) {
        cdkBuilder.groundTruthS3Input(groundTruthS3Input.let(IResolvable::unwrap))
      }

      /**
       * @param groundTruthS3Input The ground truth label provided for the model. 
       */
      override fun groundTruthS3Input(groundTruthS3Input: MonitoringGroundTruthS3InputProperty) {
        cdkBuilder.groundTruthS3Input(groundTruthS3Input.let(MonitoringGroundTruthS3InputProperty::unwrap))
      }

      /**
       * @param groundTruthS3Input The ground truth label provided for the model. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27209216e1724eaca068d3545875342c36d0dd2e2e10734cc5142ba4c7616f0d")
      override
          fun groundTruthS3Input(groundTruthS3Input: MonitoringGroundTruthS3InputProperty.Builder.() -> Unit):
          Unit = groundTruthS3Input(MonitoringGroundTruthS3InputProperty(groundTruthS3Input))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityJobInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityJobInputProperty,
    ) : CdkObject(cdkObject), ModelQualityJobInputProperty {
      /**
       * Input object for the batch transform job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityjobinput.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjobinput-batchtransforminput)
       */
      override fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

      /**
       * Input object for the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityjobinput.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjobinput-endpointinput)
       */
      override fun endpointInput(): Any? = unwrap(this).getEndpointInput()

      /**
       * The ground truth label provided for the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityjobinput.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjobinput-groundtruths3input)
       */
      override fun groundTruthS3Input(): Any = unwrap(this).getGroundTruthS3Input()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelQualityJobInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityJobInputProperty):
          ModelQualityJobInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelQualityJobInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityJobInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityJobInputProperty
    }
  }
}
