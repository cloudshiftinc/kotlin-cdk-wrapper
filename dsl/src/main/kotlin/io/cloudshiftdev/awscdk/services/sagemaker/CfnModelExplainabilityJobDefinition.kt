package io.cloudshiftdev.awscdk.services.sagemaker

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

public open class CfnModelExplainabilityJobDefinition internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition,
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
   * The name of the model explainability job definition.
   */
  public open fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  /**
   * The name of the model explainability job definition.
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
  @JvmName("d699b3e9b8165c827d74fd636252696eb57b683e05868766d668a61149212c70")
  public open fun jobResources(`value`: MonitoringResourcesProperty.Builder.() -> Unit): Unit =
      jobResources(MonitoringResourcesProperty(`value`))

  /**
   * Configures the model explainability job to run a specified Docker container image.
   */
  public open fun modelExplainabilityAppSpecification(): Any =
      unwrap(this).getModelExplainabilityAppSpecification()

  /**
   * Configures the model explainability job to run a specified Docker container image.
   */
  public open fun modelExplainabilityAppSpecification(`value`: IResolvable) {
    unwrap(this).setModelExplainabilityAppSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configures the model explainability job to run a specified Docker container image.
   */
  public open
      fun modelExplainabilityAppSpecification(`value`: ModelExplainabilityAppSpecificationProperty) {
    unwrap(this).setModelExplainabilityAppSpecification(`value`.let(ModelExplainabilityAppSpecificationProperty::unwrap))
  }

  /**
   * Configures the model explainability job to run a specified Docker container image.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("07d7dc1824f32c27d58c6231845fd678f79702426bb7c946c82c48c2a7782d45")
  public open
      fun modelExplainabilityAppSpecification(`value`: ModelExplainabilityAppSpecificationProperty.Builder.() -> Unit):
      Unit =
      modelExplainabilityAppSpecification(ModelExplainabilityAppSpecificationProperty(`value`))

  /**
   * The baseline configuration for a model explainability job.
   */
  public open fun modelExplainabilityBaselineConfig(): Any? =
      unwrap(this).getModelExplainabilityBaselineConfig()

  /**
   * The baseline configuration for a model explainability job.
   */
  public open fun modelExplainabilityBaselineConfig(`value`: IResolvable) {
    unwrap(this).setModelExplainabilityBaselineConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The baseline configuration for a model explainability job.
   */
  public open
      fun modelExplainabilityBaselineConfig(`value`: ModelExplainabilityBaselineConfigProperty) {
    unwrap(this).setModelExplainabilityBaselineConfig(`value`.let(ModelExplainabilityBaselineConfigProperty::unwrap))
  }

  /**
   * The baseline configuration for a model explainability job.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6d0628f132b97ca2f7b8be4aac73e10c2df8221f15f9e10a8635b5f7aab371b9")
  public open
      fun modelExplainabilityBaselineConfig(`value`: ModelExplainabilityBaselineConfigProperty.Builder.() -> Unit):
      Unit = modelExplainabilityBaselineConfig(ModelExplainabilityBaselineConfigProperty(`value`))

  /**
   * Inputs for the model explainability job.
   */
  public open fun modelExplainabilityJobInput(): Any = unwrap(this).getModelExplainabilityJobInput()

  /**
   * Inputs for the model explainability job.
   */
  public open fun modelExplainabilityJobInput(`value`: IResolvable) {
    unwrap(this).setModelExplainabilityJobInput(`value`.let(IResolvable::unwrap))
  }

  /**
   * Inputs for the model explainability job.
   */
  public open fun modelExplainabilityJobInput(`value`: ModelExplainabilityJobInputProperty) {
    unwrap(this).setModelExplainabilityJobInput(`value`.let(ModelExplainabilityJobInputProperty::unwrap))
  }

  /**
   * Inputs for the model explainability job.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("10483b1cabac96f3be0e9b41c0279081273689dce27110a4d9fd69bb00368eb4")
  public open
      fun modelExplainabilityJobInput(`value`: ModelExplainabilityJobInputProperty.Builder.() -> Unit):
      Unit = modelExplainabilityJobInput(ModelExplainabilityJobInputProperty(`value`))

  /**
   * The output configuration for monitoring jobs.
   */
  public open fun modelExplainabilityJobOutputConfig(): Any =
      unwrap(this).getModelExplainabilityJobOutputConfig()

  /**
   * The output configuration for monitoring jobs.
   */
  public open fun modelExplainabilityJobOutputConfig(`value`: IResolvable) {
    unwrap(this).setModelExplainabilityJobOutputConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The output configuration for monitoring jobs.
   */
  public open fun modelExplainabilityJobOutputConfig(`value`: MonitoringOutputConfigProperty) {
    unwrap(this).setModelExplainabilityJobOutputConfig(`value`.let(MonitoringOutputConfigProperty::unwrap))
  }

  /**
   * The output configuration for monitoring jobs.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("04f353bffab106793a10fb9779f0c52802a558e007548cf45bc7d42388d65559")
  public open
      fun modelExplainabilityJobOutputConfig(`value`: MonitoringOutputConfigProperty.Builder.() -> Unit):
      Unit = modelExplainabilityJobOutputConfig(MonitoringOutputConfigProperty(`value`))

  /**
   * Networking options for a model explainability job.
   */
  public open fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

  /**
   * Networking options for a model explainability job.
   */
  public open fun networkConfig(`value`: IResolvable) {
    unwrap(this).setNetworkConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Networking options for a model explainability job.
   */
  public open fun networkConfig(`value`: NetworkConfigProperty) {
    unwrap(this).setNetworkConfig(`value`.let(NetworkConfigProperty::unwrap))
  }

  /**
   * Networking options for a model explainability job.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("26b6d401267fbfb130c1ade98504f1d0ae88903b7f38b773b6e82c5ce8d18b2f")
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
  @JvmName("f869b61b0ce3009c5c232110b734a56eba4e4d2a5983da0820cb1f158b92bc5b")
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
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the endpoint used to run the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointname)
     * @param endpointName The name of the endpoint used to run the monitoring job. 
     */
    public fun endpointName(endpointName: String)

    /**
     * The name of the model explainability job definition.
     *
     * The name must be unique within an AWS Region in the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-jobdefinitionname)
     * @param jobDefinitionName The name of the model explainability job definition. 
     */
    public fun jobDefinitionName(jobDefinitionName: String)

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    public fun jobResources(jobResources: IResolvable)

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    public fun jobResources(jobResources: MonitoringResourcesProperty)

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35aa052808fd359dc2ac115c1a8e940c98bd7e5db9be48955d108062e866eb6b")
    public fun jobResources(jobResources: MonitoringResourcesProperty.Builder.() -> Unit)

    /**
     * Configures the model explainability job to run a specified Docker container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification)
     * @param modelExplainabilityAppSpecification Configures the model explainability job to run a
     * specified Docker container image. 
     */
    public fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: IResolvable)

    /**
     * Configures the model explainability job to run a specified Docker container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification)
     * @param modelExplainabilityAppSpecification Configures the model explainability job to run a
     * specified Docker container image. 
     */
    public
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: ModelExplainabilityAppSpecificationProperty)

    /**
     * Configures the model explainability job to run a specified Docker container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification)
     * @param modelExplainabilityAppSpecification Configures the model explainability job to run a
     * specified Docker container image. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a042f2cbb37d2abca2b01ef176c06009999a3ad573c6779b9cdab08eb49d899")
    public
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: ModelExplainabilityAppSpecificationProperty.Builder.() -> Unit)

    /**
     * The baseline configuration for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig)
     * @param modelExplainabilityBaselineConfig The baseline configuration for a model
     * explainability job. 
     */
    public fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: IResolvable)

    /**
     * The baseline configuration for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig)
     * @param modelExplainabilityBaselineConfig The baseline configuration for a model
     * explainability job. 
     */
    public
        fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: ModelExplainabilityBaselineConfigProperty)

    /**
     * The baseline configuration for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig)
     * @param modelExplainabilityBaselineConfig The baseline configuration for a model
     * explainability job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8aa636e64ee025f2d066bf043fdd9762b28000f3d16f7f220eeaf1172365c200")
    public
        fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: ModelExplainabilityBaselineConfigProperty.Builder.() -> Unit)

    /**
     * Inputs for the model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput)
     * @param modelExplainabilityJobInput Inputs for the model explainability job. 
     */
    public fun modelExplainabilityJobInput(modelExplainabilityJobInput: IResolvable)

    /**
     * Inputs for the model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput)
     * @param modelExplainabilityJobInput Inputs for the model explainability job. 
     */
    public
        fun modelExplainabilityJobInput(modelExplainabilityJobInput: ModelExplainabilityJobInputProperty)

    /**
     * Inputs for the model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput)
     * @param modelExplainabilityJobInput Inputs for the model explainability job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23838340771863374c773729c119473081749d63d70302b8097c02eaa05cbc13")
    public
        fun modelExplainabilityJobInput(modelExplainabilityJobInput: ModelExplainabilityJobInputProperty.Builder.() -> Unit)

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjoboutputconfig)
     * @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs. 
     */
    public fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: IResolvable)

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjoboutputconfig)
     * @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs. 
     */
    public
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: MonitoringOutputConfigProperty)

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjoboutputconfig)
     * @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7eee2946bf577aa5bcfdbce0af50c347ed511550b1b2f93896cf9ac657eb15d9")
    public
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit)

    /**
     * Networking options for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-networkconfig)
     * @param networkConfig Networking options for a model explainability job. 
     */
    public fun networkConfig(networkConfig: IResolvable)

    /**
     * Networking options for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-networkconfig)
     * @param networkConfig Networking options for a model explainability job. 
     */
    public fun networkConfig(networkConfig: NetworkConfigProperty)

    /**
     * Networking options for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-networkconfig)
     * @param networkConfig Networking options for a model explainability job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("231bc58acd44d2d408904e9422554322013ad7b3c9a0379ceafef6f76400c641")
    public fun networkConfig(networkConfig: NetworkConfigProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform
     * tasks on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume
     * to perform tasks on your behalf. 
     */
    public fun roleArn(roleArn: String)

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    public fun stoppingCondition(stoppingCondition: IResolvable)

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    public fun stoppingCondition(stoppingCondition: StoppingConditionProperty)

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f1367a361167ca21f83e152612ba1f2316f22fb384454c7269bde2adc63126a")
    public fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.Builder.create(scope,
        id)

    /**
     * The name of the endpoint used to run the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointname)
     * @param endpointName The name of the endpoint used to run the monitoring job. 
     */
    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    /**
     * The name of the model explainability job definition.
     *
     * The name must be unique within an AWS Region in the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-jobdefinitionname)
     * @param jobDefinitionName The name of the model explainability job definition. 
     */
    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    override fun jobResources(jobResources: IResolvable) {
      cdkBuilder.jobResources(jobResources.let(IResolvable::unwrap))
    }

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    override fun jobResources(jobResources: MonitoringResourcesProperty) {
      cdkBuilder.jobResources(jobResources.let(MonitoringResourcesProperty::unwrap))
    }

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35aa052808fd359dc2ac115c1a8e940c98bd7e5db9be48955d108062e866eb6b")
    override fun jobResources(jobResources: MonitoringResourcesProperty.Builder.() -> Unit): Unit =
        jobResources(MonitoringResourcesProperty(jobResources))

    /**
     * Configures the model explainability job to run a specified Docker container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification)
     * @param modelExplainabilityAppSpecification Configures the model explainability job to run a
     * specified Docker container image. 
     */
    override
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: IResolvable) {
      cdkBuilder.modelExplainabilityAppSpecification(modelExplainabilityAppSpecification.let(IResolvable::unwrap))
    }

    /**
     * Configures the model explainability job to run a specified Docker container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification)
     * @param modelExplainabilityAppSpecification Configures the model explainability job to run a
     * specified Docker container image. 
     */
    override
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: ModelExplainabilityAppSpecificationProperty) {
      cdkBuilder.modelExplainabilityAppSpecification(modelExplainabilityAppSpecification.let(ModelExplainabilityAppSpecificationProperty::unwrap))
    }

    /**
     * Configures the model explainability job to run a specified Docker container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification)
     * @param modelExplainabilityAppSpecification Configures the model explainability job to run a
     * specified Docker container image. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a042f2cbb37d2abca2b01ef176c06009999a3ad573c6779b9cdab08eb49d899")
    override
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: ModelExplainabilityAppSpecificationProperty.Builder.() -> Unit):
        Unit =
        modelExplainabilityAppSpecification(ModelExplainabilityAppSpecificationProperty(modelExplainabilityAppSpecification))

    /**
     * The baseline configuration for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig)
     * @param modelExplainabilityBaselineConfig The baseline configuration for a model
     * explainability job. 
     */
    override fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: IResolvable) {
      cdkBuilder.modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig.let(IResolvable::unwrap))
    }

    /**
     * The baseline configuration for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig)
     * @param modelExplainabilityBaselineConfig The baseline configuration for a model
     * explainability job. 
     */
    override
        fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: ModelExplainabilityBaselineConfigProperty) {
      cdkBuilder.modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig.let(ModelExplainabilityBaselineConfigProperty::unwrap))
    }

    /**
     * The baseline configuration for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig)
     * @param modelExplainabilityBaselineConfig The baseline configuration for a model
     * explainability job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8aa636e64ee025f2d066bf043fdd9762b28000f3d16f7f220eeaf1172365c200")
    override
        fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: ModelExplainabilityBaselineConfigProperty.Builder.() -> Unit):
        Unit =
        modelExplainabilityBaselineConfig(ModelExplainabilityBaselineConfigProperty(modelExplainabilityBaselineConfig))

    /**
     * Inputs for the model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput)
     * @param modelExplainabilityJobInput Inputs for the model explainability job. 
     */
    override fun modelExplainabilityJobInput(modelExplainabilityJobInput: IResolvable) {
      cdkBuilder.modelExplainabilityJobInput(modelExplainabilityJobInput.let(IResolvable::unwrap))
    }

    /**
     * Inputs for the model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput)
     * @param modelExplainabilityJobInput Inputs for the model explainability job. 
     */
    override
        fun modelExplainabilityJobInput(modelExplainabilityJobInput: ModelExplainabilityJobInputProperty) {
      cdkBuilder.modelExplainabilityJobInput(modelExplainabilityJobInput.let(ModelExplainabilityJobInputProperty::unwrap))
    }

    /**
     * Inputs for the model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput)
     * @param modelExplainabilityJobInput Inputs for the model explainability job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23838340771863374c773729c119473081749d63d70302b8097c02eaa05cbc13")
    override
        fun modelExplainabilityJobInput(modelExplainabilityJobInput: ModelExplainabilityJobInputProperty.Builder.() -> Unit):
        Unit =
        modelExplainabilityJobInput(ModelExplainabilityJobInputProperty(modelExplainabilityJobInput))

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjoboutputconfig)
     * @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs. 
     */
    override
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: IResolvable) {
      cdkBuilder.modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig.let(IResolvable::unwrap))
    }

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjoboutputconfig)
     * @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs. 
     */
    override
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: MonitoringOutputConfigProperty) {
      cdkBuilder.modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig.let(MonitoringOutputConfigProperty::unwrap))
    }

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjoboutputconfig)
     * @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7eee2946bf577aa5bcfdbce0af50c347ed511550b1b2f93896cf9ac657eb15d9")
    override
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit):
        Unit =
        modelExplainabilityJobOutputConfig(MonitoringOutputConfigProperty(modelExplainabilityJobOutputConfig))

    /**
     * Networking options for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-networkconfig)
     * @param networkConfig Networking options for a model explainability job. 
     */
    override fun networkConfig(networkConfig: IResolvable) {
      cdkBuilder.networkConfig(networkConfig.let(IResolvable::unwrap))
    }

    /**
     * Networking options for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-networkconfig)
     * @param networkConfig Networking options for a model explainability job. 
     */
    override fun networkConfig(networkConfig: NetworkConfigProperty) {
      cdkBuilder.networkConfig(networkConfig.let(NetworkConfigProperty::unwrap))
    }

    /**
     * Networking options for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-networkconfig)
     * @param networkConfig Networking options for a model explainability job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("231bc58acd44d2d408904e9422554322013ad7b3c9a0379ceafef6f76400c641")
    override fun networkConfig(networkConfig: NetworkConfigProperty.Builder.() -> Unit): Unit =
        networkConfig(NetworkConfigProperty(networkConfig))

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform
     * tasks on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume
     * to perform tasks on your behalf. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    override fun stoppingCondition(stoppingCondition: IResolvable) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(IResolvable::unwrap))
    }

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    override fun stoppingCondition(stoppingCondition: StoppingConditionProperty) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(StoppingConditionProperty::unwrap))
    }

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f1367a361167ca21f83e152612ba1f2316f22fb384454c7269bde2adc63126a")
    override fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit):
        Unit = stoppingCondition(StoppingConditionProperty(stoppingCondition))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
    /**
     * The Amazon S3 URI for the constraints resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-constraintsresource.html#cfn-sagemaker-modelexplainabilityjobdefinition-constraintsresource-s3uri)
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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty.builder()

      /**
       * @param s3Uri The Amazon S3 URI for the constraints resource.
       */
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
      /**
       * The Amazon S3 URI for the constraints resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-constraintsresource.html#cfn-sagemaker-modelexplainabilityjobdefinition-constraintsresource-s3uri)
       */
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-stoppingcondition.html#cfn-sagemaker-modelexplainabilityjobdefinition-stoppingcondition-maxruntimeinseconds)
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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.StoppingConditionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.StoppingConditionProperty.builder()

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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.StoppingConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.StoppingConditionProperty,
    ) : StoppingConditionProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-stoppingcondition.html#cfn-sagemaker-modelexplainabilityjobdefinition-stoppingcondition-maxruntimeinseconds)
       */
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
    /**
     * The CSV format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-datasetformat.html#cfn-sagemaker-modelexplainabilityjobdefinition-datasetformat-csv)
     */
    public fun csv(): Any? = unwrap(this).getCsv()

    /**
     * The Json format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-datasetformat.html#cfn-sagemaker-modelexplainabilityjobdefinition-datasetformat-json)
     */
    public fun json(): Any? = unwrap(this).getJson()

    /**
     * A flag indicating if the dataset format is Parquet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-datasetformat.html#cfn-sagemaker-modelexplainabilityjobdefinition-datasetformat-parquet)
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
      @JvmName("41a5bd61be4596db46392a76986cb24b85863bd1327e316e275e75a3247d6266")
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
      @JvmName("7ad6a40fc074598b4171e4e184e26c58faba839d06f61b41ced2e3eb867860d6")
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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.DatasetFormatProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.DatasetFormatProperty.builder()

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
      @JvmName("41a5bd61be4596db46392a76986cb24b85863bd1327e316e275e75a3247d6266")
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
      @JvmName("7ad6a40fc074598b4171e4e184e26c58faba839d06f61b41ced2e3eb867860d6")
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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.DatasetFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.DatasetFormatProperty,
    ) : DatasetFormatProperty {
      /**
       * The CSV format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-datasetformat.html#cfn-sagemaker-modelexplainabilityjobdefinition-datasetformat-csv)
       */
      override fun csv(): Any? = unwrap(this).getCsv()

      /**
       * The Json format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-datasetformat.html#cfn-sagemaker-modelexplainabilityjobdefinition-datasetformat-json)
       */
      override fun json(): Any? = unwrap(this).getJson()

      /**
       * A flag indicating if the dataset format is Parquet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-datasetformat.html#cfn-sagemaker-modelexplainabilityjobdefinition-datasetformat-parquet)
       */
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
    /**
     * The configuration for the cluster resources used to run the processing job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-monitoringresources.html#cfn-sagemaker-modelexplainabilityjobdefinition-monitoringresources-clusterconfig)
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
      @JvmName("42f8aec8def9eb81f8c1f81a564f7bc914c277b8a594cdc422237bbc3d9a8d65")
      public fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty.builder()

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
      /**
       * The configuration for the cluster resources used to run the processing job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-monitoringresources.html#cfn-sagemaker-modelexplainabilityjobdefinition-monitoringresources-clusterconfig)
       */
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
    /**
     * The number of ML compute instances to use in the model monitoring job.
     *
     * For distributed processing jobs, specify a value greater than 1. The default value is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-clusterconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-clusterconfig-instancecount)
     */
    public fun instanceCount(): Number

    /**
     * The ML compute instance type for the processing job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-clusterconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-clusterconfig-instancetype)
     */
    public fun instanceType(): String

    /**
     * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt data on
     * the storage volume attached to the ML compute instance(s) that run the model monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-clusterconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-clusterconfig-volumekmskeyid)
     */
    public fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

    /**
     * The size of the ML storage volume, in gigabytes, that you want to provision.
     *
     * You must specify sufficient ML storage for your scenario.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-clusterconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-clusterconfig-volumesizeingb)
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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ClusterConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ClusterConfigProperty.builder()

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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ClusterConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ClusterConfigProperty,
    ) : ClusterConfigProperty {
      /**
       * The number of ML compute instances to use in the model monitoring job.
       *
       * For distributed processing jobs, specify a value greater than 1. The default value is 1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-clusterconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-clusterconfig-instancecount)
       */
      override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      /**
       * The ML compute instance type for the processing job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-clusterconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-clusterconfig-instancetype)
       */
      override fun instanceType(): String = unwrap(this).getInstanceType()

      /**
       * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt data on
       * the storage volume attached to the ML compute instance(s) that run the model monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-clusterconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-clusterconfig-volumekmskeyid)
       */
      override fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

      /**
       * The size of the ML storage volume, in gigabytes, that you want to provision.
       *
       * You must specify sufficient ML storage for your scenario.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-clusterconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-clusterconfig-volumesizeingb)
       */
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
    /**
     * The Amazon S3 storage location where the results of a monitoring job are saved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-monitoringoutput.html#cfn-sagemaker-modelexplainabilityjobdefinition-monitoringoutput-s3output)
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
      @JvmName("b0ee30764bb6561fa1de467ef6293013f2eb9c0f4a3ff018a8824a01ef2bc271")
      public fun s3Output(s3Output: S3OutputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputProperty.builder()

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
      /**
       * The Amazon S3 storage location where the results of a monitoring job are saved.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-monitoringoutput.html#cfn-sagemaker-modelexplainabilityjobdefinition-monitoringoutput-s3output)
       */
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
    /**
     * The name of the baseline model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig-baseliningjobname)
     */
    public fun baseliningJobName(): String? = unwrap(this).getBaseliningJobName()

    /**
     * The constraints resource for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig-constraintsresource)
     */
    public fun constraintsResource(): Any? = unwrap(this).getConstraintsResource()

    /**
     * A builder for [ModelExplainabilityBaselineConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param baseliningJobName The name of the baseline model explainability job.
       */
      public fun baseliningJobName(baseliningJobName: String)

      /**
       * @param constraintsResource The constraints resource for a model explainability job.
       */
      public fun constraintsResource(constraintsResource: IResolvable)

      /**
       * @param constraintsResource The constraints resource for a model explainability job.
       */
      public fun constraintsResource(constraintsResource: ConstraintsResourceProperty)

      /**
       * @param constraintsResource The constraints resource for a model explainability job.
       */
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

      /**
       * @param baseliningJobName The name of the baseline model explainability job.
       */
      override fun baseliningJobName(baseliningJobName: String) {
        cdkBuilder.baseliningJobName(baseliningJobName)
      }

      /**
       * @param constraintsResource The constraints resource for a model explainability job.
       */
      override fun constraintsResource(constraintsResource: IResolvable) {
        cdkBuilder.constraintsResource(constraintsResource.let(IResolvable::unwrap))
      }

      /**
       * @param constraintsResource The constraints resource for a model explainability job.
       */
      override fun constraintsResource(constraintsResource: ConstraintsResourceProperty) {
        cdkBuilder.constraintsResource(constraintsResource.let(ConstraintsResourceProperty::unwrap))
      }

      /**
       * @param constraintsResource The constraints resource for a model explainability job.
       */
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
      /**
       * The name of the baseline model explainability job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig-baseliningjobname)
       */
      override fun baseliningJobName(): String? = unwrap(this).getBaseliningJobName()

      /**
       * The constraints resource for a model explainability job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig-constraintsresource)
       */
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
    /**
     * Input object for the batch transform job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput-batchtransforminput)
     */
    public fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

    /**
     * Input object for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput-endpointinput)
     */
    public fun endpointInput(): Any? = unwrap(this).getEndpointInput()

    /**
     * A builder for [ModelExplainabilityJobInputProperty]
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
      @JvmName("fd5d7bf37162d632baf9b9cf4770092aaef7a936fce5efd40e10cc745c155d4c")
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
      @JvmName("ffaf54e2ec0ee4b5f62e460428227e28bdc9cfd6088cc4812e4381f3cffd1e6a")
      public fun endpointInput(endpointInput: EndpointInputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty.builder()

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
      @JvmName("fd5d7bf37162d632baf9b9cf4770092aaef7a936fce5efd40e10cc745c155d4c")
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
      /**
       * Input object for the batch transform job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput-batchtransforminput)
       */
      override fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

      /**
       * Input object for the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput-endpointinput)
       */
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
    /**
     * Whether to encrypt all communications between distributed processing jobs.
     *
     * Choose `True` to encrypt communications. Encryption provides greater security for distributed
     * processing jobs, but the processing might take longer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-networkconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-networkconfig-enableintercontainertrafficencryption)
     */
    public fun enableInterContainerTrafficEncryption(): Any? =
        unwrap(this).getEnableInterContainerTrafficEncryption()

    /**
     * Whether to allow inbound and outbound network calls to and from the containers used for the
     * processing job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-networkconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-networkconfig-enablenetworkisolation)
     */
    public fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

    /**
     * Specifies a VPC that your training jobs and hosted models have access to.
     *
     * Control access to and from your training and model containers by configuring the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-networkconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-networkconfig-vpcconfig)
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
      @JvmName("9f47ca8527062454ec8f4c8a37359abe59cb96974807cfd5f3aea750ea924245")
      public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.NetworkConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.NetworkConfigProperty.builder()

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
      /**
       * Whether to encrypt all communications between distributed processing jobs.
       *
       * Choose `True` to encrypt communications. Encryption provides greater security for
       * distributed processing jobs, but the processing might take longer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-networkconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-networkconfig-enableintercontainertrafficencryption)
       */
      override fun enableInterContainerTrafficEncryption(): Any? =
          unwrap(this).getEnableInterContainerTrafficEncryption()

      /**
       * Whether to allow inbound and outbound network calls to and from the containers used for the
       * processing job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-networkconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-networkconfig-enablenetworkisolation)
       */
      override fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

      /**
       * Specifies a VPC that your training jobs and hosted models have access to.
       *
       * Control access to and from your training and model containers by configuring the VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-networkconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-networkconfig-vpcconfig)
       */
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
    /**
     * The Amazon S3 location being used to capture the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelexplainabilityjobdefinition-batchtransforminput-datacaptureddestinations3uri)
     */
    public fun dataCapturedDestinationS3Uri(): String

    /**
     * The dataset format for your batch transform job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelexplainabilityjobdefinition-batchtransforminput-datasetformat)
     */
    public fun datasetFormat(): Any

    /**
     * The attributes of the input data that are the input features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelexplainabilityjobdefinition-batchtransforminput-featuresattribute)
     */
    public fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

    /**
     * The attribute of the input data that represents the ground truth label.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelexplainabilityjobdefinition-batchtransforminput-inferenceattribute)
     */
    public fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

    /**
     * Path to the filesystem where the batch transform data is available to the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelexplainabilityjobdefinition-batchtransforminput-localpath)
     */
    public fun localPath(): String

    /**
     * In a classification problem, the attribute that represents the class probability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelexplainabilityjobdefinition-batchtransforminput-probabilityattribute)
     */
    public fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key.
     *
     * Defaults to `FullyReplicated`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelexplainabilityjobdefinition-batchtransforminput-s3datadistributiontype)
     */
    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    /**
     * Whether the `Pipe` or `File` is used as the input mode for transferring data for the
     * monitoring job.
     *
     * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that fit
     * in memory. Defaults to `File` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelexplainabilityjobdefinition-batchtransforminput-s3inputmode)
     */
    public fun s3InputMode(): String? = unwrap(this).getS3InputMode()

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
      @JvmName("7b8a9932aec8edb38d066ed1cc14d7a6ba6798736d5f0ed23e3d9368071741f8")
      public fun datasetFormat(datasetFormat: DatasetFormatProperty.Builder.() -> Unit)

      /**
       * @param featuresAttribute The attributes of the input data that are the input features.
       */
      public fun featuresAttribute(featuresAttribute: String)

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
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.BatchTransformInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.BatchTransformInputProperty.builder()

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
      @JvmName("7b8a9932aec8edb38d066ed1cc14d7a6ba6798736d5f0ed23e3d9368071741f8")
      override fun datasetFormat(datasetFormat: DatasetFormatProperty.Builder.() -> Unit): Unit =
          datasetFormat(DatasetFormatProperty(datasetFormat))

      /**
       * @param featuresAttribute The attributes of the input data that are the input features.
       */
      override fun featuresAttribute(featuresAttribute: String) {
        cdkBuilder.featuresAttribute(featuresAttribute)
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

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.BatchTransformInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.BatchTransformInputProperty,
    ) : BatchTransformInputProperty {
      /**
       * The Amazon S3 location being used to capture the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelexplainabilityjobdefinition-batchtransforminput-datacaptureddestinations3uri)
       */
      override fun dataCapturedDestinationS3Uri(): String =
          unwrap(this).getDataCapturedDestinationS3Uri()

      /**
       * The dataset format for your batch transform job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelexplainabilityjobdefinition-batchtransforminput-datasetformat)
       */
      override fun datasetFormat(): Any = unwrap(this).getDatasetFormat()

      /**
       * The attributes of the input data that are the input features.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelexplainabilityjobdefinition-batchtransforminput-featuresattribute)
       */
      override fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

      /**
       * The attribute of the input data that represents the ground truth label.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelexplainabilityjobdefinition-batchtransforminput-inferenceattribute)
       */
      override fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

      /**
       * Path to the filesystem where the batch transform data is available to the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelexplainabilityjobdefinition-batchtransforminput-localpath)
       */
      override fun localPath(): String = unwrap(this).getLocalPath()

      /**
       * In a classification problem, the attribute that represents the class probability.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelexplainabilityjobdefinition-batchtransforminput-probabilityattribute)
       */
      override fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

      /**
       * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key.
       *
       * Defaults to `FullyReplicated`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelexplainabilityjobdefinition-batchtransforminput-s3datadistributiontype)
       */
      override fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

      /**
       * Whether the `Pipe` or `File` is used as the input mode for transferring data for the
       * monitoring job.
       *
       * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that
       * fit in memory. Defaults to `File` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html#cfn-sagemaker-modelexplainabilityjobdefinition-batchtransforminput-s3inputmode)
       */
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
    /**
     * A boolean flag indicating if it is JSON line format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-json.html#cfn-sagemaker-modelexplainabilityjobdefinition-json-line)
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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.JsonProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.JsonProperty.builder()

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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.JsonProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.JsonProperty,
    ) : JsonProperty {
      /**
       * A boolean flag indicating if it is JSON line format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-json.html#cfn-sagemaker-modelexplainabilityjobdefinition-json-line)
       */
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
    /**
     * JSON formatted Amazon S3 file that defines explainability parameters.
     *
     * For more information on this JSON configuration file, see [Configure model explainability
     * parameters](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-config-json-monitor-model-explainability-parameters.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification-configuri)
     */
    public fun configUri(): String

    /**
     * Sets the environment variables in the Docker container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification-environment)
     */
    public fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * The container image to be run by the model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification-imageuri)
     */
    public fun imageUri(): String

    /**
     * A builder for [ModelExplainabilityAppSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configUri JSON formatted Amazon S3 file that defines explainability parameters. 
       * For more information on this JSON configuration file, see [Configure model explainability
       * parameters](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-config-json-monitor-model-explainability-parameters.html)
       * .
       */
      public fun configUri(configUri: String)

      /**
       * @param environment Sets the environment variables in the Docker container.
       */
      public fun environment(environment: IResolvable)

      /**
       * @param environment Sets the environment variables in the Docker container.
       */
      public fun environment(environment: Map<String, String>)

      /**
       * @param imageUri The container image to be run by the model explainability job. 
       */
      public fun imageUri(imageUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty.builder()

      /**
       * @param configUri JSON formatted Amazon S3 file that defines explainability parameters. 
       * For more information on this JSON configuration file, see [Configure model explainability
       * parameters](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-config-json-monitor-model-explainability-parameters.html)
       * .
       */
      override fun configUri(configUri: String) {
        cdkBuilder.configUri(configUri)
      }

      /**
       * @param environment Sets the environment variables in the Docker container.
       */
      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      /**
       * @param environment Sets the environment variables in the Docker container.
       */
      override fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
      }

      /**
       * @param imageUri The container image to be run by the model explainability job. 
       */
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
      /**
       * JSON formatted Amazon S3 file that defines explainability parameters.
       *
       * For more information on this JSON configuration file, see [Configure model explainability
       * parameters](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-config-json-monitor-model-explainability-parameters.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification-configuri)
       */
      override fun configUri(): String = unwrap(this).getConfigUri()

      /**
       * Sets the environment variables in the Docker container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification-environment)
       */
      override fun environment(): Any? = unwrap(this).getEnvironment()

      /**
       * The container image to be run by the model explainability job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification-imageuri)
       */
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
    /**
     * The local path to the Amazon S3 storage location where Amazon SageMaker saves the results of
     * a monitoring job.
     *
     * LocalPath is an absolute path for the output data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-s3output.html#cfn-sagemaker-modelexplainabilityjobdefinition-s3output-localpath)
     */
    public fun localPath(): String

    /**
     * Whether to upload the results of the monitoring job continuously or after the job completes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-s3output.html#cfn-sagemaker-modelexplainabilityjobdefinition-s3output-s3uploadmode)
     */
    public fun s3UploadMode(): String? = unwrap(this).getS3UploadMode()

    /**
     * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results
     * of a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-s3output.html#cfn-sagemaker-modelexplainabilityjobdefinition-s3output-s3uri)
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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.S3OutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.S3OutputProperty.builder()

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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.S3OutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.S3OutputProperty,
    ) : S3OutputProperty {
      /**
       * The local path to the Amazon S3 storage location where Amazon SageMaker saves the results
       * of a monitoring job.
       *
       * LocalPath is an absolute path for the output data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-s3output.html#cfn-sagemaker-modelexplainabilityjobdefinition-s3output-localpath)
       */
      override fun localPath(): String = unwrap(this).getLocalPath()

      /**
       * Whether to upload the results of the monitoring job continuously or after the job
       * completes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-s3output.html#cfn-sagemaker-modelexplainabilityjobdefinition-s3output-s3uploadmode)
       */
      override fun s3UploadMode(): String? = unwrap(this).getS3UploadMode()

      /**
       * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the
       * results of a monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-s3output.html#cfn-sagemaker-modelexplainabilityjobdefinition-s3output-s3uri)
       */
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
    /**
     * The VPC security group IDs, in the form `sg-xxxxxxxx` .
     *
     * Specify the security groups for the VPC that is specified in the `Subnets` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-vpcconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * The ID of the subnets in the VPC to which you want to connect your training job or model.
     *
     * For information about the availability of specific instance types, see [Supported Instance
     * Types and Availability
     * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-vpcconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-vpcconfig-subnets)
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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.VpcConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.VpcConfigProperty.builder()

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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.VpcConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.VpcConfigProperty,
    ) : VpcConfigProperty {
      /**
       * The VPC security group IDs, in the form `sg-xxxxxxxx` .
       *
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-vpcconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * The ID of the subnets in the VPC to which you want to connect your training job or model.
       *
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-vpcconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-vpcconfig-subnets)
       */
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.VpcConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringOutputConfigProperty {
    /**
     * The AWS Key Management Service ( AWS KMS ) key that Amazon SageMaker uses to encrypt the
     * model artifacts at rest using Amazon S3 server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-monitoringoutputconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-monitoringoutputconfig-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Monitoring outputs for monitoring jobs.
     *
     * This is where the output of the periodic monitoring jobs is uploaded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-monitoringoutputconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-monitoringoutputconfig-monitoringoutputs)
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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty.builder()

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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty,
    ) : MonitoringOutputConfigProperty {
      /**
       * The AWS Key Management Service ( AWS KMS ) key that Amazon SageMaker uses to encrypt the
       * model artifacts at rest using Amazon S3 server-side encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-monitoringoutputconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-monitoringoutputconfig-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * Monitoring outputs for monitoring jobs.
       *
       * This is where the output of the periodic monitoring jobs is uploaded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-monitoringoutputconfig.html#cfn-sagemaker-modelexplainabilityjobdefinition-monitoringoutputconfig-monitoringoutputs)
       */
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
    /**
     * An endpoint in customer's account which has enabled `DataCaptureConfig` enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-endpointinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointinput-endpointname)
     */
    public fun endpointName(): String

    /**
     * The attributes of the input data that are the input features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-endpointinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointinput-featuresattribute)
     */
    public fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

    /**
     * The attribute of the input data that represents the ground truth label.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-endpointinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointinput-inferenceattribute)
     */
    public fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

    /**
     * Path to the filesystem where the endpoint data is available to the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-endpointinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointinput-localpath)
     */
    public fun localPath(): String

    /**
     * In a classification problem, the attribute that represents the class probability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-endpointinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointinput-probabilityattribute)
     */
    public fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an Amazon S3
     * key.
     *
     * Defaults to `FullyReplicated`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-endpointinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointinput-s3datadistributiontype)
     */
    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    /**
     * Whether the `Pipe` or `File` is used as the input mode for transferring data for the
     * monitoring job.
     *
     * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that fit
     * in memory. Defaults to `File` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-endpointinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointinput-s3inputmode)
     */
    public fun s3InputMode(): String? = unwrap(this).getS3InputMode()

    /**
     * A builder for [EndpointInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpointName An endpoint in customer's account which has enabled `DataCaptureConfig`
       * enabled. 
       */
      public fun endpointName(endpointName: String)

      /**
       * @param featuresAttribute The attributes of the input data that are the input features.
       */
      public fun featuresAttribute(featuresAttribute: String)

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
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.EndpointInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.EndpointInputProperty.builder()

      /**
       * @param endpointName An endpoint in customer's account which has enabled `DataCaptureConfig`
       * enabled. 
       */
      override fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
      }

      /**
       * @param featuresAttribute The attributes of the input data that are the input features.
       */
      override fun featuresAttribute(featuresAttribute: String) {
        cdkBuilder.featuresAttribute(featuresAttribute)
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

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.EndpointInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.EndpointInputProperty,
    ) : EndpointInputProperty {
      /**
       * An endpoint in customer's account which has enabled `DataCaptureConfig` enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-endpointinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointinput-endpointname)
       */
      override fun endpointName(): String = unwrap(this).getEndpointName()

      /**
       * The attributes of the input data that are the input features.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-endpointinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointinput-featuresattribute)
       */
      override fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

      /**
       * The attribute of the input data that represents the ground truth label.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-endpointinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointinput-inferenceattribute)
       */
      override fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

      /**
       * Path to the filesystem where the endpoint data is available to the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-endpointinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointinput-localpath)
       */
      override fun localPath(): String = unwrap(this).getLocalPath()

      /**
       * In a classification problem, the attribute that represents the class probability.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-endpointinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointinput-probabilityattribute)
       */
      override fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

      /**
       * Whether input data distributed in Amazon S3 is fully replicated or sharded by an Amazon S3
       * key.
       *
       * Defaults to `FullyReplicated`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-endpointinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointinput-s3datadistributiontype)
       */
      override fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

      /**
       * Whether the `Pipe` or `File` is used as the input mode for transferring data for the
       * monitoring job.
       *
       * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that
       * fit in memory. Defaults to `File` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-endpointinput.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointinput-s3inputmode)
       */
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
    /**
     * A boolean flag indicating if given CSV has header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-csv.html#cfn-sagemaker-modelexplainabilityjobdefinition-csv-header)
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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.CsvProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.CsvProperty.builder()

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
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.CsvProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.CsvProperty,
    ) : CsvProperty {
      /**
       * A boolean flag indicating if given CSV has header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-csv.html#cfn-sagemaker-modelexplainabilityjobdefinition-csv-header)
       */
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
