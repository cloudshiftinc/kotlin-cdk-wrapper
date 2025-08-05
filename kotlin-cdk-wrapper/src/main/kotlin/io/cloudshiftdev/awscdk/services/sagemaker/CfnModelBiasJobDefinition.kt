@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates the definition for a model bias job.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnModelBiasJobDefinition cfnModelBiasJobDefinition =
 * CfnModelBiasJobDefinition.Builder.create(this, "MyCfnModelBiasJobDefinition")
 * .jobResources(MonitoringResourcesProperty.builder()
 * .clusterConfig(ClusterConfigProperty.builder()
 * .instanceCount(123)
 * .instanceType("instanceType")
 * .volumeSizeInGb(123)
 * // the properties below are optional
 * .volumeKmsKeyId("volumeKmsKeyId")
 * .build())
 * .build())
 * .modelBiasAppSpecification(ModelBiasAppSpecificationProperty.builder()
 * .configUri("configUri")
 * .imageUri("imageUri")
 * // the properties below are optional
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .build())
 * .modelBiasJobInput(ModelBiasJobInputProperty.builder()
 * .groundTruthS3Input(MonitoringGroundTruthS3InputProperty.builder()
 * .s3Uri("s3Uri")
 * .build())
 * // the properties below are optional
 * .batchTransformInput(BatchTransformInputProperty.builder()
 * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
 * .datasetFormat(DatasetFormatProperty.builder()
 * .csv(CsvProperty.builder()
 * .header(false)
 * .build())
 * .json(JsonProperty.builder()
 * .line(false)
 * .build())
 * .parquet(false)
 * .build())
 * .localPath("localPath")
 * // the properties below are optional
 * .endTimeOffset("endTimeOffset")
 * .featuresAttribute("featuresAttribute")
 * .inferenceAttribute("inferenceAttribute")
 * .probabilityAttribute("probabilityAttribute")
 * .probabilityThresholdAttribute(123)
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .startTimeOffset("startTimeOffset")
 * .build())
 * .endpointInput(EndpointInputProperty.builder()
 * .endpointName("endpointName")
 * .localPath("localPath")
 * // the properties below are optional
 * .endTimeOffset("endTimeOffset")
 * .featuresAttribute("featuresAttribute")
 * .inferenceAttribute("inferenceAttribute")
 * .probabilityAttribute("probabilityAttribute")
 * .probabilityThresholdAttribute(123)
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .startTimeOffset("startTimeOffset")
 * .build())
 * .build())
 * .modelBiasJobOutputConfig(MonitoringOutputConfigProperty.builder()
 * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
 * .s3Output(S3OutputProperty.builder()
 * .localPath("localPath")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .s3UploadMode("s3UploadMode")
 * .build())
 * .build()))
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .endpointName("endpointName")
 * .jobDefinitionName("jobDefinitionName")
 * .modelBiasBaselineConfig(ModelBiasBaselineConfigProperty.builder()
 * .baseliningJobName("baseliningJobName")
 * .constraintsResource(ConstraintsResourceProperty.builder()
 * .s3Uri("s3Uri")
 * .build())
 * .build())
 * .networkConfig(NetworkConfigProperty.builder()
 * .enableInterContainerTrafficEncryption(false)
 * .enableNetworkIsolation(false)
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnets(List.of("subnets"))
 * .build())
 * .build())
 * .stoppingCondition(StoppingConditionProperty.builder()
 * .maxRuntimeInSeconds(123)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html)
 */
public open class CfnModelBiasJobDefinition(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnModelBiasJobDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnModelBiasJobDefinitionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnModelBiasJobDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnModelBiasJobDefinitionProps(props)
  )

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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the bias job definition.
   */
  public open fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  /**
   * The name of the bias job definition.
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
    unwrap(this).setJobResources(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Identifies the resources to deploy for a monitoring job.
   */
  public open fun jobResources(`value`: MonitoringResourcesProperty) {
    unwrap(this).setJobResources(`value`.let(MonitoringResourcesProperty.Companion::unwrap))
  }

  /**
   * Identifies the resources to deploy for a monitoring job.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e1b732cebc6d0d542f6af6859d27ae090b7cea6f7f9c5dacc327b69bfab8759d")
  public open fun jobResources(`value`: MonitoringResourcesProperty.Builder.() -> Unit): Unit =
      jobResources(MonitoringResourcesProperty(`value`))

  /**
   * Configures the model bias job to run a specified Docker container image.
   */
  public open fun modelBiasAppSpecification(): Any = unwrap(this).getModelBiasAppSpecification()

  /**
   * Configures the model bias job to run a specified Docker container image.
   */
  public open fun modelBiasAppSpecification(`value`: IResolvable) {
    unwrap(this).setModelBiasAppSpecification(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configures the model bias job to run a specified Docker container image.
   */
  public open fun modelBiasAppSpecification(`value`: ModelBiasAppSpecificationProperty) {
    unwrap(this).setModelBiasAppSpecification(`value`.let(ModelBiasAppSpecificationProperty.Companion::unwrap))
  }

  /**
   * Configures the model bias job to run a specified Docker container image.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("985bf816bd154874821ebc9daa3ebd4d218cbbb04339d4ce5b6f4113a81ff05f")
  public open
      fun modelBiasAppSpecification(`value`: ModelBiasAppSpecificationProperty.Builder.() -> Unit):
      Unit = modelBiasAppSpecification(ModelBiasAppSpecificationProperty(`value`))

  /**
   * The baseline configuration for a model bias job.
   */
  public open fun modelBiasBaselineConfig(): Any? = unwrap(this).getModelBiasBaselineConfig()

  /**
   * The baseline configuration for a model bias job.
   */
  public open fun modelBiasBaselineConfig(`value`: IResolvable) {
    unwrap(this).setModelBiasBaselineConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The baseline configuration for a model bias job.
   */
  public open fun modelBiasBaselineConfig(`value`: ModelBiasBaselineConfigProperty) {
    unwrap(this).setModelBiasBaselineConfig(`value`.let(ModelBiasBaselineConfigProperty.Companion::unwrap))
  }

  /**
   * The baseline configuration for a model bias job.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bd0d9e14442da8784f311283f599e6dd4ea4e46ecaad64599fe71b73d9abcdbe")
  public open
      fun modelBiasBaselineConfig(`value`: ModelBiasBaselineConfigProperty.Builder.() -> Unit): Unit
      = modelBiasBaselineConfig(ModelBiasBaselineConfigProperty(`value`))

  /**
   * Inputs for the model bias job.
   */
  public open fun modelBiasJobInput(): Any = unwrap(this).getModelBiasJobInput()

  /**
   * Inputs for the model bias job.
   */
  public open fun modelBiasJobInput(`value`: IResolvable) {
    unwrap(this).setModelBiasJobInput(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Inputs for the model bias job.
   */
  public open fun modelBiasJobInput(`value`: ModelBiasJobInputProperty) {
    unwrap(this).setModelBiasJobInput(`value`.let(ModelBiasJobInputProperty.Companion::unwrap))
  }

  /**
   * Inputs for the model bias job.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3f6ddf44e0ab649a9484ddb9986bbdb7dc7f4340490b72cc9eabea025155ddf4")
  public open fun modelBiasJobInput(`value`: ModelBiasJobInputProperty.Builder.() -> Unit): Unit =
      modelBiasJobInput(ModelBiasJobInputProperty(`value`))

  /**
   * The output configuration for monitoring jobs.
   */
  public open fun modelBiasJobOutputConfig(): Any = unwrap(this).getModelBiasJobOutputConfig()

  /**
   * The output configuration for monitoring jobs.
   */
  public open fun modelBiasJobOutputConfig(`value`: IResolvable) {
    unwrap(this).setModelBiasJobOutputConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The output configuration for monitoring jobs.
   */
  public open fun modelBiasJobOutputConfig(`value`: MonitoringOutputConfigProperty) {
    unwrap(this).setModelBiasJobOutputConfig(`value`.let(MonitoringOutputConfigProperty.Companion::unwrap))
  }

  /**
   * The output configuration for monitoring jobs.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5fd536534c49251923d21f6391d251b2214fef49b5fbe1022229b25687fe8fc6")
  public open
      fun modelBiasJobOutputConfig(`value`: MonitoringOutputConfigProperty.Builder.() -> Unit): Unit
      = modelBiasJobOutputConfig(MonitoringOutputConfigProperty(`value`))

  /**
   * Networking options for a model bias job.
   */
  public open fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

  /**
   * Networking options for a model bias job.
   */
  public open fun networkConfig(`value`: IResolvable) {
    unwrap(this).setNetworkConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Networking options for a model bias job.
   */
  public open fun networkConfig(`value`: NetworkConfigProperty) {
    unwrap(this).setNetworkConfig(`value`.let(NetworkConfigProperty.Companion::unwrap))
  }

  /**
   * Networking options for a model bias job.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e4e22266cefe3d775a613ca524bc3ebbbacc552f8a7e73b36e52e92d83fc3bc4")
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
    unwrap(this).setStoppingCondition(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A time limit for how long the monitoring job is allowed to run before stopping.
   */
  public open fun stoppingCondition(`value`: StoppingConditionProperty) {
    unwrap(this).setStoppingCondition(`value`.let(StoppingConditionProperty.Companion::unwrap))
  }

  /**
   * A time limit for how long the monitoring job is allowed to run before stopping.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("12ce9536188369b911a6e18ae41be0487ade8f2d1ecd6f9eee4fe5d6ecb66782")
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
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnModelBiasJobDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the endpoint used to run the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-endpointname)
     * @param endpointName The name of the endpoint used to run the monitoring job. 
     */
    public fun endpointName(endpointName: String)

    /**
     * The name of the bias job definition.
     *
     * The name must be unique within an AWS Region in the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-jobdefinitionname)
     * @param jobDefinitionName The name of the bias job definition. 
     */
    public fun jobDefinitionName(jobDefinitionName: String)

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    public fun jobResources(jobResources: IResolvable)

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    public fun jobResources(jobResources: MonitoringResourcesProperty)

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f226ca59284de3a3ddf1a9d7f200591a4bfad828e4525b6260727a93eb1c1857")
    public fun jobResources(jobResources: MonitoringResourcesProperty.Builder.() -> Unit)

    /**
     * Configures the model bias job to run a specified Docker container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasappspecification)
     * @param modelBiasAppSpecification Configures the model bias job to run a specified Docker
     * container image. 
     */
    public fun modelBiasAppSpecification(modelBiasAppSpecification: IResolvable)

    /**
     * Configures the model bias job to run a specified Docker container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasappspecification)
     * @param modelBiasAppSpecification Configures the model bias job to run a specified Docker
     * container image. 
     */
    public
        fun modelBiasAppSpecification(modelBiasAppSpecification: ModelBiasAppSpecificationProperty)

    /**
     * Configures the model bias job to run a specified Docker container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasappspecification)
     * @param modelBiasAppSpecification Configures the model bias job to run a specified Docker
     * container image. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f78a083d8d98e5875451abd56b0b4be0ca774684927027bc3cb6a23bbf18b1bd")
    public
        fun modelBiasAppSpecification(modelBiasAppSpecification: ModelBiasAppSpecificationProperty.Builder.() -> Unit)

    /**
     * The baseline configuration for a model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig)
     * @param modelBiasBaselineConfig The baseline configuration for a model bias job. 
     */
    public fun modelBiasBaselineConfig(modelBiasBaselineConfig: IResolvable)

    /**
     * The baseline configuration for a model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig)
     * @param modelBiasBaselineConfig The baseline configuration for a model bias job. 
     */
    public fun modelBiasBaselineConfig(modelBiasBaselineConfig: ModelBiasBaselineConfigProperty)

    /**
     * The baseline configuration for a model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig)
     * @param modelBiasBaselineConfig The baseline configuration for a model bias job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe38d516e5b9856c6b171b329ae30cc6d077c987e6e17500a1e62ad0d3b1ba6a")
    public
        fun modelBiasBaselineConfig(modelBiasBaselineConfig: ModelBiasBaselineConfigProperty.Builder.() -> Unit)

    /**
     * Inputs for the model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjobinput)
     * @param modelBiasJobInput Inputs for the model bias job. 
     */
    public fun modelBiasJobInput(modelBiasJobInput: IResolvable)

    /**
     * Inputs for the model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjobinput)
     * @param modelBiasJobInput Inputs for the model bias job. 
     */
    public fun modelBiasJobInput(modelBiasJobInput: ModelBiasJobInputProperty)

    /**
     * Inputs for the model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjobinput)
     * @param modelBiasJobInput Inputs for the model bias job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f86e4242430b3813c716bc4c8cd23bd0faa5f2b5146072b66d4b7597a236bf6")
    public fun modelBiasJobInput(modelBiasJobInput: ModelBiasJobInputProperty.Builder.() -> Unit)

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjoboutputconfig)
     * @param modelBiasJobOutputConfig The output configuration for monitoring jobs. 
     */
    public fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: IResolvable)

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjoboutputconfig)
     * @param modelBiasJobOutputConfig The output configuration for monitoring jobs. 
     */
    public fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: MonitoringOutputConfigProperty)

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjoboutputconfig)
     * @param modelBiasJobOutputConfig The output configuration for monitoring jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7745870d086d1eee86de7fe656e13170b4e70362f3626b6ec8dce6c4b55b8fc")
    public
        fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit)

    /**
     * Networking options for a model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-networkconfig)
     * @param networkConfig Networking options for a model bias job. 
     */
    public fun networkConfig(networkConfig: IResolvable)

    /**
     * Networking options for a model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-networkconfig)
     * @param networkConfig Networking options for a model bias job. 
     */
    public fun networkConfig(networkConfig: NetworkConfigProperty)

    /**
     * Networking options for a model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-networkconfig)
     * @param networkConfig Networking options for a model bias job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81069f7b758fefa66a014cba64f28fe98d06a0feda43310a371f1aa7b9cd94ef")
    public fun networkConfig(networkConfig: NetworkConfigProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform
     * tasks on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume
     * to perform tasks on your behalf. 
     */
    public fun roleArn(roleArn: String)

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    public fun stoppingCondition(stoppingCondition: IResolvable)

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    public fun stoppingCondition(stoppingCondition: StoppingConditionProperty)

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e909dfafe37cad80211f36271ce2af0b4a0d7d536f188888a6227a3dcb1b680")
    public fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.Builder.create(scope,
        id)

    /**
     * The name of the endpoint used to run the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-endpointname)
     * @param endpointName The name of the endpoint used to run the monitoring job. 
     */
    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    /**
     * The name of the bias job definition.
     *
     * The name must be unique within an AWS Region in the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-jobdefinitionname)
     * @param jobDefinitionName The name of the bias job definition. 
     */
    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    override fun jobResources(jobResources: IResolvable) {
      cdkBuilder.jobResources(jobResources.let(IResolvable.Companion::unwrap))
    }

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    override fun jobResources(jobResources: MonitoringResourcesProperty) {
      cdkBuilder.jobResources(jobResources.let(MonitoringResourcesProperty.Companion::unwrap))
    }

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-jobresources)
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f226ca59284de3a3ddf1a9d7f200591a4bfad828e4525b6260727a93eb1c1857")
    override fun jobResources(jobResources: MonitoringResourcesProperty.Builder.() -> Unit): Unit =
        jobResources(MonitoringResourcesProperty(jobResources))

    /**
     * Configures the model bias job to run a specified Docker container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasappspecification)
     * @param modelBiasAppSpecification Configures the model bias job to run a specified Docker
     * container image. 
     */
    override fun modelBiasAppSpecification(modelBiasAppSpecification: IResolvable) {
      cdkBuilder.modelBiasAppSpecification(modelBiasAppSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configures the model bias job to run a specified Docker container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasappspecification)
     * @param modelBiasAppSpecification Configures the model bias job to run a specified Docker
     * container image. 
     */
    override
        fun modelBiasAppSpecification(modelBiasAppSpecification: ModelBiasAppSpecificationProperty) {
      cdkBuilder.modelBiasAppSpecification(modelBiasAppSpecification.let(ModelBiasAppSpecificationProperty.Companion::unwrap))
    }

    /**
     * Configures the model bias job to run a specified Docker container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasappspecification)
     * @param modelBiasAppSpecification Configures the model bias job to run a specified Docker
     * container image. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f78a083d8d98e5875451abd56b0b4be0ca774684927027bc3cb6a23bbf18b1bd")
    override
        fun modelBiasAppSpecification(modelBiasAppSpecification: ModelBiasAppSpecificationProperty.Builder.() -> Unit):
        Unit =
        modelBiasAppSpecification(ModelBiasAppSpecificationProperty(modelBiasAppSpecification))

    /**
     * The baseline configuration for a model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig)
     * @param modelBiasBaselineConfig The baseline configuration for a model bias job. 
     */
    override fun modelBiasBaselineConfig(modelBiasBaselineConfig: IResolvable) {
      cdkBuilder.modelBiasBaselineConfig(modelBiasBaselineConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The baseline configuration for a model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig)
     * @param modelBiasBaselineConfig The baseline configuration for a model bias job. 
     */
    override fun modelBiasBaselineConfig(modelBiasBaselineConfig: ModelBiasBaselineConfigProperty) {
      cdkBuilder.modelBiasBaselineConfig(modelBiasBaselineConfig.let(ModelBiasBaselineConfigProperty.Companion::unwrap))
    }

    /**
     * The baseline configuration for a model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig)
     * @param modelBiasBaselineConfig The baseline configuration for a model bias job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe38d516e5b9856c6b171b329ae30cc6d077c987e6e17500a1e62ad0d3b1ba6a")
    override
        fun modelBiasBaselineConfig(modelBiasBaselineConfig: ModelBiasBaselineConfigProperty.Builder.() -> Unit):
        Unit = modelBiasBaselineConfig(ModelBiasBaselineConfigProperty(modelBiasBaselineConfig))

    /**
     * Inputs for the model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjobinput)
     * @param modelBiasJobInput Inputs for the model bias job. 
     */
    override fun modelBiasJobInput(modelBiasJobInput: IResolvable) {
      cdkBuilder.modelBiasJobInput(modelBiasJobInput.let(IResolvable.Companion::unwrap))
    }

    /**
     * Inputs for the model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjobinput)
     * @param modelBiasJobInput Inputs for the model bias job. 
     */
    override fun modelBiasJobInput(modelBiasJobInput: ModelBiasJobInputProperty) {
      cdkBuilder.modelBiasJobInput(modelBiasJobInput.let(ModelBiasJobInputProperty.Companion::unwrap))
    }

    /**
     * Inputs for the model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjobinput)
     * @param modelBiasJobInput Inputs for the model bias job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f86e4242430b3813c716bc4c8cd23bd0faa5f2b5146072b66d4b7597a236bf6")
    override fun modelBiasJobInput(modelBiasJobInput: ModelBiasJobInputProperty.Builder.() -> Unit):
        Unit = modelBiasJobInput(ModelBiasJobInputProperty(modelBiasJobInput))

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjoboutputconfig)
     * @param modelBiasJobOutputConfig The output configuration for monitoring jobs. 
     */
    override fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: IResolvable) {
      cdkBuilder.modelBiasJobOutputConfig(modelBiasJobOutputConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjoboutputconfig)
     * @param modelBiasJobOutputConfig The output configuration for monitoring jobs. 
     */
    override
        fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: MonitoringOutputConfigProperty) {
      cdkBuilder.modelBiasJobOutputConfig(modelBiasJobOutputConfig.let(MonitoringOutputConfigProperty.Companion::unwrap))
    }

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjoboutputconfig)
     * @param modelBiasJobOutputConfig The output configuration for monitoring jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7745870d086d1eee86de7fe656e13170b4e70362f3626b6ec8dce6c4b55b8fc")
    override
        fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit):
        Unit = modelBiasJobOutputConfig(MonitoringOutputConfigProperty(modelBiasJobOutputConfig))

    /**
     * Networking options for a model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-networkconfig)
     * @param networkConfig Networking options for a model bias job. 
     */
    override fun networkConfig(networkConfig: IResolvable) {
      cdkBuilder.networkConfig(networkConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Networking options for a model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-networkconfig)
     * @param networkConfig Networking options for a model bias job. 
     */
    override fun networkConfig(networkConfig: NetworkConfigProperty) {
      cdkBuilder.networkConfig(networkConfig.let(NetworkConfigProperty.Companion::unwrap))
    }

    /**
     * Networking options for a model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-networkconfig)
     * @param networkConfig Networking options for a model bias job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81069f7b758fefa66a014cba64f28fe98d06a0feda43310a371f1aa7b9cd94ef")
    override fun networkConfig(networkConfig: NetworkConfigProperty.Builder.() -> Unit): Unit =
        networkConfig(NetworkConfigProperty(networkConfig))

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform
     * tasks on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume
     * to perform tasks on your behalf. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    override fun stoppingCondition(stoppingCondition: IResolvable) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(IResolvable.Companion::unwrap))
    }

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    override fun stoppingCondition(stoppingCondition: StoppingConditionProperty) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(StoppingConditionProperty.Companion::unwrap))
    }

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-stoppingcondition)
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e909dfafe37cad80211f36271ce2af0b4a0d7d536f188888a6227a3dcb1b680")
    override fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit):
        Unit = stoppingCondition(StoppingConditionProperty(stoppingCondition))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition = wrapped.cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition
  }

  /**
   * Input object for the batch transform job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * BatchTransformInputProperty batchTransformInputProperty = BatchTransformInputProperty.builder()
   * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
   * .datasetFormat(DatasetFormatProperty.builder()
   * .csv(CsvProperty.builder()
   * .header(false)
   * .build())
   * .json(JsonProperty.builder()
   * .line(false)
   * .build())
   * .parquet(false)
   * .build())
   * .localPath("localPath")
   * // the properties below are optional
   * .endTimeOffset("endTimeOffset")
   * .featuresAttribute("featuresAttribute")
   * .inferenceAttribute("inferenceAttribute")
   * .probabilityAttribute("probabilityAttribute")
   * .probabilityThresholdAttribute(123)
   * .s3DataDistributionType("s3DataDistributionType")
   * .s3InputMode("s3InputMode")
   * .startTimeOffset("startTimeOffset")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html)
   */
  public interface BatchTransformInputProperty {
    /**
     * The Amazon S3 location being used to capture the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-datacaptureddestinations3uri)
     */
    public fun dataCapturedDestinationS3Uri(): String

    /**
     * The dataset format for your batch transform job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-datasetformat)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-endtimeoffset)
     */
    public fun endTimeOffset(): String? = unwrap(this).getEndTimeOffset()

    /**
     * The attributes of the input data that are the input features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-featuresattribute)
     */
    public fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

    /**
     * The attribute of the input data that represents the ground truth label.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-inferenceattribute)
     */
    public fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

    /**
     * Path to the filesystem where the batch transform data is available to the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-localpath)
     */
    public fun localPath(): String

    /**
     * In a classification problem, the attribute that represents the class probability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-probabilityattribute)
     */
    public fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

    /**
     * The threshold for the class probability to be evaluated as a positive result.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-probabilitythresholdattribute)
     */
    public fun probabilityThresholdAttribute(): Number? =
        unwrap(this).getProbabilityThresholdAttribute()

    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key.
     *
     * Defaults to `FullyReplicated`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-s3datadistributiontype)
     */
    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    /**
     * Whether the `Pipe` or `File` is used as the input mode for transferring data for the
     * monitoring job.
     *
     * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that fit
     * in memory. Defaults to `File` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-s3inputmode)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-starttimeoffset)
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
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45a079f358b71b690e68adb1ded5b1aa47b2ef84a6255df1ed0277fa7e892c83")
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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.BatchTransformInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.BatchTransformInputProperty.builder()

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
        cdkBuilder.datasetFormat(datasetFormat.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param datasetFormat The dataset format for your batch transform job. 
       */
      override fun datasetFormat(datasetFormat: DatasetFormatProperty) {
        cdkBuilder.datasetFormat(datasetFormat.let(DatasetFormatProperty.Companion::unwrap))
      }

      /**
       * @param datasetFormat The dataset format for your batch transform job. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45a079f358b71b690e68adb1ded5b1aa47b2ef84a6255df1ed0277fa7e892c83")
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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.BatchTransformInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.BatchTransformInputProperty,
    ) : CdkObject(cdkObject),
        BatchTransformInputProperty {
      /**
       * The Amazon S3 location being used to capture the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-datacaptureddestinations3uri)
       */
      override fun dataCapturedDestinationS3Uri(): String =
          unwrap(this).getDataCapturedDestinationS3Uri()

      /**
       * The dataset format for your batch transform job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-datasetformat)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-endtimeoffset)
       */
      override fun endTimeOffset(): String? = unwrap(this).getEndTimeOffset()

      /**
       * The attributes of the input data that are the input features.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-featuresattribute)
       */
      override fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

      /**
       * The attribute of the input data that represents the ground truth label.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-inferenceattribute)
       */
      override fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

      /**
       * Path to the filesystem where the batch transform data is available to the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-localpath)
       */
      override fun localPath(): String = unwrap(this).getLocalPath()

      /**
       * In a classification problem, the attribute that represents the class probability.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-probabilityattribute)
       */
      override fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

      /**
       * The threshold for the class probability to be evaluated as a positive result.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-probabilitythresholdattribute)
       */
      override fun probabilityThresholdAttribute(): Number? =
          unwrap(this).getProbabilityThresholdAttribute()

      /**
       * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key.
       *
       * Defaults to `FullyReplicated`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-s3datadistributiontype)
       */
      override fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

      /**
       * Whether the `Pipe` or `File` is used as the input mode for transferring data for the
       * monitoring job.
       *
       * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that
       * fit in memory. Defaults to `File` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-s3inputmode)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html#cfn-sagemaker-modelbiasjobdefinition-batchtransforminput-starttimeoffset)
       */
      override fun startTimeOffset(): String? = unwrap(this).getStartTimeOffset()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchTransformInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.BatchTransformInputProperty):
          BatchTransformInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BatchTransformInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchTransformInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.BatchTransformInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.BatchTransformInputProperty
    }
  }

  /**
   * The configuration for the cluster resources used to run the processing job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ClusterConfigProperty clusterConfigProperty = ClusterConfigProperty.builder()
   * .instanceCount(123)
   * .instanceType("instanceType")
   * .volumeSizeInGb(123)
   * // the properties below are optional
   * .volumeKmsKeyId("volumeKmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-clusterconfig.html)
   */
  public interface ClusterConfigProperty {
    /**
     * The number of ML compute instances to use in the model monitoring job.
     *
     * For distributed processing jobs, specify a value greater than 1. The default value is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-clusterconfig.html#cfn-sagemaker-modelbiasjobdefinition-clusterconfig-instancecount)
     */
    public fun instanceCount(): Number

    /**
     * The ML compute instance type for the processing job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-clusterconfig.html#cfn-sagemaker-modelbiasjobdefinition-clusterconfig-instancetype)
     */
    public fun instanceType(): String

    /**
     * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt data on
     * the storage volume attached to the ML compute instance(s) that run the model monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-clusterconfig.html#cfn-sagemaker-modelbiasjobdefinition-clusterconfig-volumekmskeyid)
     */
    public fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

    /**
     * The size of the ML storage volume, in gigabytes, that you want to provision.
     *
     * You must specify sufficient ML storage for your scenario.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-clusterconfig.html#cfn-sagemaker-modelbiasjobdefinition-clusterconfig-volumesizeingb)
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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ClusterConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ClusterConfigProperty.builder()

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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ClusterConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ClusterConfigProperty,
    ) : CdkObject(cdkObject),
        ClusterConfigProperty {
      /**
       * The number of ML compute instances to use in the model monitoring job.
       *
       * For distributed processing jobs, specify a value greater than 1. The default value is 1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-clusterconfig.html#cfn-sagemaker-modelbiasjobdefinition-clusterconfig-instancecount)
       */
      override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      /**
       * The ML compute instance type for the processing job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-clusterconfig.html#cfn-sagemaker-modelbiasjobdefinition-clusterconfig-instancetype)
       */
      override fun instanceType(): String = unwrap(this).getInstanceType()

      /**
       * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt data on
       * the storage volume attached to the ML compute instance(s) that run the model monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-clusterconfig.html#cfn-sagemaker-modelbiasjobdefinition-clusterconfig-volumekmskeyid)
       */
      override fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

      /**
       * The size of the ML storage volume, in gigabytes, that you want to provision.
       *
       * You must specify sufficient ML storage for your scenario.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-clusterconfig.html#cfn-sagemaker-modelbiasjobdefinition-clusterconfig-volumesizeingb)
       */
      override fun volumeSizeInGb(): Number = unwrap(this).getVolumeSizeInGb()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ClusterConfigProperty):
          ClusterConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? ClusterConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ClusterConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ClusterConfigProperty
    }
  }

  /**
   * The constraints resource for a monitoring job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ConstraintsResourceProperty constraintsResourceProperty = ConstraintsResourceProperty.builder()
   * .s3Uri("s3Uri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-constraintsresource.html)
   */
  public interface ConstraintsResourceProperty {
    /**
     * The Amazon S3 URI for the constraints resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-constraintsresource.html#cfn-sagemaker-modelbiasjobdefinition-constraintsresource-s3uri)
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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ConstraintsResourceProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ConstraintsResourceProperty.builder()

      /**
       * @param s3Uri The Amazon S3 URI for the constraints resource.
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ConstraintsResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ConstraintsResourceProperty,
    ) : CdkObject(cdkObject),
        ConstraintsResourceProperty {
      /**
       * The Amazon S3 URI for the constraints resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-constraintsresource.html#cfn-sagemaker-modelbiasjobdefinition-constraintsresource-s3uri)
       */
      override fun s3Uri(): String? = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConstraintsResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ConstraintsResourceProperty):
          ConstraintsResourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConstraintsResourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConstraintsResourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ConstraintsResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ConstraintsResourceProperty
    }
  }

  /**
   * The CSV format.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * CsvProperty csvProperty = CsvProperty.builder()
   * .header(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-csv.html)
   */
  public interface CsvProperty {
    /**
     * A boolean flag indicating if given CSV has header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-csv.html#cfn-sagemaker-modelbiasjobdefinition-csv-header)
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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.CsvProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.CsvProperty.builder()

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
        cdkBuilder.`header`(`header`.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.CsvProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.CsvProperty,
    ) : CdkObject(cdkObject),
        CsvProperty {
      /**
       * A boolean flag indicating if given CSV has header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-csv.html#cfn-sagemaker-modelbiasjobdefinition-csv-header)
       */
      override fun `header`(): Any? = unwrap(this).getHeader()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CsvProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.CsvProperty):
          CsvProperty = CdkObjectWrappers.wrap(cdkObject) as? CsvProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.CsvProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.CsvProperty
    }
  }

  /**
   * The dataset format of the data to monitor.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DatasetFormatProperty datasetFormatProperty = DatasetFormatProperty.builder()
   * .csv(CsvProperty.builder()
   * .header(false)
   * .build())
   * .json(JsonProperty.builder()
   * .line(false)
   * .build())
   * .parquet(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-datasetformat.html)
   */
  public interface DatasetFormatProperty {
    /**
     * The CSV format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-datasetformat.html#cfn-sagemaker-modelbiasjobdefinition-datasetformat-csv)
     */
    public fun csv(): Any? = unwrap(this).getCsv()

    /**
     * The Json format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-datasetformat.html#cfn-sagemaker-modelbiasjobdefinition-datasetformat-json)
     */
    public fun json(): Any? = unwrap(this).getJson()

    /**
     * A flag indicate if the dataset format is Parquet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-datasetformat.html#cfn-sagemaker-modelbiasjobdefinition-datasetformat-parquet)
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
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("195cec24b304964968efe06f1c81405c6498e0a4b8767f58f68a42eba5148ae3")
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
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7988232fb64248506a915fec63c2a73b1fd2a9efbf21d8f6a25e703813aaf40e")
      public fun json(json: JsonProperty.Builder.() -> Unit)

      /**
       * @param parquet A flag indicate if the dataset format is Parquet.
       */
      public fun parquet(parquet: Boolean)

      /**
       * @param parquet A flag indicate if the dataset format is Parquet.
       */
      public fun parquet(parquet: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.DatasetFormatProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.DatasetFormatProperty.builder()

      /**
       * @param csv The CSV format.
       */
      override fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param csv The CSV format.
       */
      override fun csv(csv: CsvProperty) {
        cdkBuilder.csv(csv.let(CsvProperty.Companion::unwrap))
      }

      /**
       * @param csv The CSV format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("195cec24b304964968efe06f1c81405c6498e0a4b8767f58f68a42eba5148ae3")
      override fun csv(csv: CsvProperty.Builder.() -> Unit): Unit = csv(CsvProperty(csv))

      /**
       * @param json The Json format.
       */
      override fun json(json: IResolvable) {
        cdkBuilder.json(json.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param json The Json format.
       */
      override fun json(json: JsonProperty) {
        cdkBuilder.json(json.let(JsonProperty.Companion::unwrap))
      }

      /**
       * @param json The Json format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7988232fb64248506a915fec63c2a73b1fd2a9efbf21d8f6a25e703813aaf40e")
      override fun json(json: JsonProperty.Builder.() -> Unit): Unit = json(JsonProperty(json))

      /**
       * @param parquet A flag indicate if the dataset format is Parquet.
       */
      override fun parquet(parquet: Boolean) {
        cdkBuilder.parquet(parquet)
      }

      /**
       * @param parquet A flag indicate if the dataset format is Parquet.
       */
      override fun parquet(parquet: IResolvable) {
        cdkBuilder.parquet(parquet.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.DatasetFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.DatasetFormatProperty,
    ) : CdkObject(cdkObject),
        DatasetFormatProperty {
      /**
       * The CSV format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-datasetformat.html#cfn-sagemaker-modelbiasjobdefinition-datasetformat-csv)
       */
      override fun csv(): Any? = unwrap(this).getCsv()

      /**
       * The Json format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-datasetformat.html#cfn-sagemaker-modelbiasjobdefinition-datasetformat-json)
       */
      override fun json(): Any? = unwrap(this).getJson()

      /**
       * A flag indicate if the dataset format is Parquet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-datasetformat.html#cfn-sagemaker-modelbiasjobdefinition-datasetformat-parquet)
       */
      override fun parquet(): Any? = unwrap(this).getParquet()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.DatasetFormatProperty):
          DatasetFormatProperty = CdkObjectWrappers.wrap(cdkObject) as? DatasetFormatProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetFormatProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.DatasetFormatProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.DatasetFormatProperty
    }
  }

  /**
   * Input object for the endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * EndpointInputProperty endpointInputProperty = EndpointInputProperty.builder()
   * .endpointName("endpointName")
   * .localPath("localPath")
   * // the properties below are optional
   * .endTimeOffset("endTimeOffset")
   * .featuresAttribute("featuresAttribute")
   * .inferenceAttribute("inferenceAttribute")
   * .probabilityAttribute("probabilityAttribute")
   * .probabilityThresholdAttribute(123)
   * .s3DataDistributionType("s3DataDistributionType")
   * .s3InputMode("s3InputMode")
   * .startTimeOffset("startTimeOffset")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html)
   */
  public interface EndpointInputProperty {
    /**
     * If specified, monitoring jobs substract this time from the end time.
     *
     * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
     * Quality Monitoring
     * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-endtimeoffset)
     */
    public fun endTimeOffset(): String? = unwrap(this).getEndTimeOffset()

    /**
     * An endpoint in customer's account which has enabled `DataCaptureConfig` enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-endpointname)
     */
    public fun endpointName(): String

    /**
     * The attributes of the input data that are the input features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-featuresattribute)
     */
    public fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

    /**
     * The attribute of the input data that represents the ground truth label.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-inferenceattribute)
     */
    public fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

    /**
     * Path to the filesystem where the endpoint data is available to the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-localpath)
     */
    public fun localPath(): String

    /**
     * In a classification problem, the attribute that represents the class probability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-probabilityattribute)
     */
    public fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

    /**
     * The threshold for the class probability to be evaluated as a positive result.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-probabilitythresholdattribute)
     */
    public fun probabilityThresholdAttribute(): Number? =
        unwrap(this).getProbabilityThresholdAttribute()

    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an Amazon S3
     * key.
     *
     * Defaults to `FullyReplicated`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-s3datadistributiontype)
     */
    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    /**
     * Whether the `Pipe` or `File` is used as the input mode for transferring data for the
     * monitoring job.
     *
     * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that fit
     * in memory. Defaults to `File` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-s3inputmode)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-starttimeoffset)
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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.EndpointInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.EndpointInputProperty.builder()

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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.EndpointInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.EndpointInputProperty,
    ) : CdkObject(cdkObject),
        EndpointInputProperty {
      /**
       * If specified, monitoring jobs substract this time from the end time.
       *
       * For information about using offsets for scheduling monitoring jobs, see [Schedule Model
       * Quality Monitoring
       * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-endtimeoffset)
       */
      override fun endTimeOffset(): String? = unwrap(this).getEndTimeOffset()

      /**
       * An endpoint in customer's account which has enabled `DataCaptureConfig` enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-endpointname)
       */
      override fun endpointName(): String = unwrap(this).getEndpointName()

      /**
       * The attributes of the input data that are the input features.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-featuresattribute)
       */
      override fun featuresAttribute(): String? = unwrap(this).getFeaturesAttribute()

      /**
       * The attribute of the input data that represents the ground truth label.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-inferenceattribute)
       */
      override fun inferenceAttribute(): String? = unwrap(this).getInferenceAttribute()

      /**
       * Path to the filesystem where the endpoint data is available to the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-localpath)
       */
      override fun localPath(): String = unwrap(this).getLocalPath()

      /**
       * In a classification problem, the attribute that represents the class probability.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-probabilityattribute)
       */
      override fun probabilityAttribute(): String? = unwrap(this).getProbabilityAttribute()

      /**
       * The threshold for the class probability to be evaluated as a positive result.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-probabilitythresholdattribute)
       */
      override fun probabilityThresholdAttribute(): Number? =
          unwrap(this).getProbabilityThresholdAttribute()

      /**
       * Whether input data distributed in Amazon S3 is fully replicated or sharded by an Amazon S3
       * key.
       *
       * Defaults to `FullyReplicated`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-s3datadistributiontype)
       */
      override fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

      /**
       * Whether the `Pipe` or `File` is used as the input mode for transferring data for the
       * monitoring job.
       *
       * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that
       * fit in memory. Defaults to `File` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-s3inputmode)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html#cfn-sagemaker-modelbiasjobdefinition-endpointinput-starttimeoffset)
       */
      override fun startTimeOffset(): String? = unwrap(this).getStartTimeOffset()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.EndpointInputProperty):
          EndpointInputProperty = CdkObjectWrappers.wrap(cdkObject) as? EndpointInputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.EndpointInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.EndpointInputProperty
    }
  }

  /**
   * The Json format.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * JsonProperty jsonProperty = JsonProperty.builder()
   * .line(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-json.html)
   */
  public interface JsonProperty {
    /**
     * A boolean flag indicating if it is JSON line format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-json.html#cfn-sagemaker-modelbiasjobdefinition-json-line)
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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.JsonProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.JsonProperty.builder()

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
        cdkBuilder.line(line.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.JsonProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.JsonProperty,
    ) : CdkObject(cdkObject),
        JsonProperty {
      /**
       * A boolean flag indicating if it is JSON line format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-json.html#cfn-sagemaker-modelbiasjobdefinition-json-line)
       */
      override fun line(): Any? = unwrap(this).getLine()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JsonProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.JsonProperty):
          JsonProperty = CdkObjectWrappers.wrap(cdkObject) as? JsonProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.JsonProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.JsonProperty
    }
  }

  /**
   * Docker container image configuration object for the model bias job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ModelBiasAppSpecificationProperty modelBiasAppSpecificationProperty =
   * ModelBiasAppSpecificationProperty.builder()
   * .configUri("configUri")
   * .imageUri("imageUri")
   * // the properties below are optional
   * .environment(Map.of(
   * "environmentKey", "environment"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasappspecification.html)
   */
  public interface ModelBiasAppSpecificationProperty {
    /**
     * JSON formatted S3 file that defines bias parameters.
     *
     * For more information on this JSON configuration file, see [Configure bias
     * parameters](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-config-json-monitor-bias-parameters.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasappspecification.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasappspecification-configuri)
     */
    public fun configUri(): String

    /**
     * Sets the environment variables in the Docker container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasappspecification.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasappspecification-environment)
     */
    public fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * The container image to be run by the model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasappspecification.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasappspecification-imageuri)
     */
    public fun imageUri(): String

    /**
     * A builder for [ModelBiasAppSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configUri JSON formatted S3 file that defines bias parameters. 
       * For more information on this JSON configuration file, see [Configure bias
       * parameters](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-config-json-monitor-bias-parameters.html)
       * .
       */
      public fun configUri(configUri: String)

      /**
       * @param environment Sets the environment variables in the Docker container.
       */
      public fun environment(environment: Map<String, String>)

      /**
       * @param environment Sets the environment variables in the Docker container.
       */
      public fun environment(environment: IResolvable)

      /**
       * @param imageUri The container image to be run by the model bias job. 
       */
      public fun imageUri(imageUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty.builder()

      /**
       * @param configUri JSON formatted S3 file that defines bias parameters. 
       * For more information on this JSON configuration file, see [Configure bias
       * parameters](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-config-json-monitor-bias-parameters.html)
       * .
       */
      override fun configUri(configUri: String) {
        cdkBuilder.configUri(configUri)
      }

      /**
       * @param environment Sets the environment variables in the Docker container.
       */
      override fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
      }

      /**
       * @param environment Sets the environment variables in the Docker container.
       */
      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param imageUri The container image to be run by the model bias job. 
       */
      override fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty,
    ) : CdkObject(cdkObject),
        ModelBiasAppSpecificationProperty {
      /**
       * JSON formatted S3 file that defines bias parameters.
       *
       * For more information on this JSON configuration file, see [Configure bias
       * parameters](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-config-json-monitor-bias-parameters.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasappspecification.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasappspecification-configuri)
       */
      override fun configUri(): String = unwrap(this).getConfigUri()

      /**
       * Sets the environment variables in the Docker container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasappspecification.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasappspecification-environment)
       */
      override fun environment(): Any? = unwrap(this).getEnvironment()

      /**
       * The container image to be run by the model bias job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasappspecification.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasappspecification-imageuri)
       */
      override fun imageUri(): String = unwrap(this).getImageUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ModelBiasAppSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty):
          ModelBiasAppSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ModelBiasAppSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelBiasAppSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty
    }
  }

  /**
   * The configuration for a baseline model bias job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ModelBiasBaselineConfigProperty modelBiasBaselineConfigProperty =
   * ModelBiasBaselineConfigProperty.builder()
   * .baseliningJobName("baseliningJobName")
   * .constraintsResource(ConstraintsResourceProperty.builder()
   * .s3Uri("s3Uri")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig.html)
   */
  public interface ModelBiasBaselineConfigProperty {
    /**
     * The name of the baseline model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig-baseliningjobname)
     */
    public fun baseliningJobName(): String? = unwrap(this).getBaseliningJobName()

    /**
     * The constraints resource for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig-constraintsresource)
     */
    public fun constraintsResource(): Any? = unwrap(this).getConstraintsResource()

    /**
     * A builder for [ModelBiasBaselineConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param baseliningJobName The name of the baseline model bias job.
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
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7db8978b9380d98954275ce3b4515ce0398cb0a341077a54f637d5443065de4a")
      public
          fun constraintsResource(constraintsResource: ConstraintsResourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty.builder()

      /**
       * @param baseliningJobName The name of the baseline model bias job.
       */
      override fun baseliningJobName(baseliningJobName: String) {
        cdkBuilder.baseliningJobName(baseliningJobName)
      }

      /**
       * @param constraintsResource The constraints resource for a monitoring job.
       */
      override fun constraintsResource(constraintsResource: IResolvable) {
        cdkBuilder.constraintsResource(constraintsResource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param constraintsResource The constraints resource for a monitoring job.
       */
      override fun constraintsResource(constraintsResource: ConstraintsResourceProperty) {
        cdkBuilder.constraintsResource(constraintsResource.let(ConstraintsResourceProperty.Companion::unwrap))
      }

      /**
       * @param constraintsResource The constraints resource for a monitoring job.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7db8978b9380d98954275ce3b4515ce0398cb0a341077a54f637d5443065de4a")
      override
          fun constraintsResource(constraintsResource: ConstraintsResourceProperty.Builder.() -> Unit):
          Unit = constraintsResource(ConstraintsResourceProperty(constraintsResource))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty,
    ) : CdkObject(cdkObject),
        ModelBiasBaselineConfigProperty {
      /**
       * The name of the baseline model bias job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig-baseliningjobname)
       */
      override fun baseliningJobName(): String? = unwrap(this).getBaseliningJobName()

      /**
       * The constraints resource for a monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig-constraintsresource)
       */
      override fun constraintsResource(): Any? = unwrap(this).getConstraintsResource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelBiasBaselineConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty):
          ModelBiasBaselineConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ModelBiasBaselineConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelBiasBaselineConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty
    }
  }

  /**
   * Inputs for the model bias job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ModelBiasJobInputProperty modelBiasJobInputProperty = ModelBiasJobInputProperty.builder()
   * .groundTruthS3Input(MonitoringGroundTruthS3InputProperty.builder()
   * .s3Uri("s3Uri")
   * .build())
   * // the properties below are optional
   * .batchTransformInput(BatchTransformInputProperty.builder()
   * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
   * .datasetFormat(DatasetFormatProperty.builder()
   * .csv(CsvProperty.builder()
   * .header(false)
   * .build())
   * .json(JsonProperty.builder()
   * .line(false)
   * .build())
   * .parquet(false)
   * .build())
   * .localPath("localPath")
   * // the properties below are optional
   * .endTimeOffset("endTimeOffset")
   * .featuresAttribute("featuresAttribute")
   * .inferenceAttribute("inferenceAttribute")
   * .probabilityAttribute("probabilityAttribute")
   * .probabilityThresholdAttribute(123)
   * .s3DataDistributionType("s3DataDistributionType")
   * .s3InputMode("s3InputMode")
   * .startTimeOffset("startTimeOffset")
   * .build())
   * .endpointInput(EndpointInputProperty.builder()
   * .endpointName("endpointName")
   * .localPath("localPath")
   * // the properties below are optional
   * .endTimeOffset("endTimeOffset")
   * .featuresAttribute("featuresAttribute")
   * .inferenceAttribute("inferenceAttribute")
   * .probabilityAttribute("probabilityAttribute")
   * .probabilityThresholdAttribute(123)
   * .s3DataDistributionType("s3DataDistributionType")
   * .s3InputMode("s3InputMode")
   * .startTimeOffset("startTimeOffset")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasjobinput.html)
   */
  public interface ModelBiasJobInputProperty {
    /**
     * Input object for the batch transform job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasjobinput.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjobinput-batchtransforminput)
     */
    public fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

    /**
     * Input object for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasjobinput.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjobinput-endpointinput)
     */
    public fun endpointInput(): Any? = unwrap(this).getEndpointInput()

    /**
     * Location of ground truth labels to use in model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasjobinput.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjobinput-groundtruths3input)
     */
    public fun groundTruthS3Input(): Any

    /**
     * A builder for [ModelBiasJobInputProperty]
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
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d3a1667e92d80c3843ff106b6efe0b2cfbf7f34631923e8aecf8348587390d16")
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
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("34134cc5199dc7d79264f42ef249693653d094510ce22e1198212696e0d37c71")
      public fun endpointInput(endpointInput: EndpointInputProperty.Builder.() -> Unit)

      /**
       * @param groundTruthS3Input Location of ground truth labels to use in model bias job. 
       */
      public fun groundTruthS3Input(groundTruthS3Input: IResolvable)

      /**
       * @param groundTruthS3Input Location of ground truth labels to use in model bias job. 
       */
      public fun groundTruthS3Input(groundTruthS3Input: MonitoringGroundTruthS3InputProperty)

      /**
       * @param groundTruthS3Input Location of ground truth labels to use in model bias job. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24f06c742ad28842ed4af67298038e5e8ce7583a56d7b45c59ca4620e9cfed65")
      public
          fun groundTruthS3Input(groundTruthS3Input: MonitoringGroundTruthS3InputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty.builder()

      /**
       * @param batchTransformInput Input object for the batch transform job.
       */
      override fun batchTransformInput(batchTransformInput: IResolvable) {
        cdkBuilder.batchTransformInput(batchTransformInput.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param batchTransformInput Input object for the batch transform job.
       */
      override fun batchTransformInput(batchTransformInput: BatchTransformInputProperty) {
        cdkBuilder.batchTransformInput(batchTransformInput.let(BatchTransformInputProperty.Companion::unwrap))
      }

      /**
       * @param batchTransformInput Input object for the batch transform job.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d3a1667e92d80c3843ff106b6efe0b2cfbf7f34631923e8aecf8348587390d16")
      override
          fun batchTransformInput(batchTransformInput: BatchTransformInputProperty.Builder.() -> Unit):
          Unit = batchTransformInput(BatchTransformInputProperty(batchTransformInput))

      /**
       * @param endpointInput Input object for the endpoint.
       */
      override fun endpointInput(endpointInput: IResolvable) {
        cdkBuilder.endpointInput(endpointInput.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param endpointInput Input object for the endpoint.
       */
      override fun endpointInput(endpointInput: EndpointInputProperty) {
        cdkBuilder.endpointInput(endpointInput.let(EndpointInputProperty.Companion::unwrap))
      }

      /**
       * @param endpointInput Input object for the endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("34134cc5199dc7d79264f42ef249693653d094510ce22e1198212696e0d37c71")
      override fun endpointInput(endpointInput: EndpointInputProperty.Builder.() -> Unit): Unit =
          endpointInput(EndpointInputProperty(endpointInput))

      /**
       * @param groundTruthS3Input Location of ground truth labels to use in model bias job. 
       */
      override fun groundTruthS3Input(groundTruthS3Input: IResolvable) {
        cdkBuilder.groundTruthS3Input(groundTruthS3Input.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param groundTruthS3Input Location of ground truth labels to use in model bias job. 
       */
      override fun groundTruthS3Input(groundTruthS3Input: MonitoringGroundTruthS3InputProperty) {
        cdkBuilder.groundTruthS3Input(groundTruthS3Input.let(MonitoringGroundTruthS3InputProperty.Companion::unwrap))
      }

      /**
       * @param groundTruthS3Input Location of ground truth labels to use in model bias job. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24f06c742ad28842ed4af67298038e5e8ce7583a56d7b45c59ca4620e9cfed65")
      override
          fun groundTruthS3Input(groundTruthS3Input: MonitoringGroundTruthS3InputProperty.Builder.() -> Unit):
          Unit = groundTruthS3Input(MonitoringGroundTruthS3InputProperty(groundTruthS3Input))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty,
    ) : CdkObject(cdkObject),
        ModelBiasJobInputProperty {
      /**
       * Input object for the batch transform job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasjobinput.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjobinput-batchtransforminput)
       */
      override fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

      /**
       * Input object for the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasjobinput.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjobinput-endpointinput)
       */
      override fun endpointInput(): Any? = unwrap(this).getEndpointInput()

      /**
       * Location of ground truth labels to use in model bias job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasjobinput.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjobinput-groundtruths3input)
       */
      override fun groundTruthS3Input(): Any = unwrap(this).getGroundTruthS3Input()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelBiasJobInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty):
          ModelBiasJobInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ModelBiasJobInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelBiasJobInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty
    }
  }

  /**
   * The ground truth labels for the dataset used for the monitoring job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * MonitoringGroundTruthS3InputProperty monitoringGroundTruthS3InputProperty =
   * MonitoringGroundTruthS3InputProperty.builder()
   * .s3Uri("s3Uri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringgroundtruths3input.html)
   */
  public interface MonitoringGroundTruthS3InputProperty {
    /**
     * The address of the Amazon S3 location of the ground truth labels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringgroundtruths3input.html#cfn-sagemaker-modelbiasjobdefinition-monitoringgroundtruths3input-s3uri)
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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty.builder()

      /**
       * @param s3Uri The address of the Amazon S3 location of the ground truth labels. 
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty,
    ) : CdkObject(cdkObject),
        MonitoringGroundTruthS3InputProperty {
      /**
       * The address of the Amazon S3 location of the ground truth labels.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringgroundtruths3input.html#cfn-sagemaker-modelbiasjobdefinition-monitoringgroundtruths3input-s3uri)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty):
          MonitoringGroundTruthS3InputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MonitoringGroundTruthS3InputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringGroundTruthS3InputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty
    }
  }

  /**
   * The output configuration for monitoring jobs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * MonitoringOutputConfigProperty monitoringOutputConfigProperty =
   * MonitoringOutputConfigProperty.builder()
   * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
   * .s3Output(S3OutputProperty.builder()
   * .localPath("localPath")
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .s3UploadMode("s3UploadMode")
   * .build())
   * .build()))
   * // the properties below are optional
   * .kmsKeyId("kmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringoutputconfig.html)
   */
  public interface MonitoringOutputConfigProperty {
    /**
     * The AWS Key Management Service ( AWS KMS ) key that Amazon SageMaker AI uses to encrypt the
     * model artifacts at rest using Amazon S3 server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringoutputconfig.html#cfn-sagemaker-modelbiasjobdefinition-monitoringoutputconfig-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Monitoring outputs for monitoring jobs.
     *
     * This is where the output of the periodic monitoring jobs is uploaded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringoutputconfig.html#cfn-sagemaker-modelbiasjobdefinition-monitoringoutputconfig-monitoringoutputs)
     */
    public fun monitoringOutputs(): Any

    /**
     * A builder for [MonitoringOutputConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The AWS Key Management Service ( AWS KMS ) key that Amazon SageMaker AI
       * uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputConfigProperty.builder()

      /**
       * @param kmsKeyId The AWS Key Management Service ( AWS KMS ) key that Amazon SageMaker AI
       * uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
       * This is where the output of the periodic monitoring jobs is uploaded.
       */
      override fun monitoringOutputs(monitoringOutputs: IResolvable) {
        cdkBuilder.monitoringOutputs(monitoringOutputs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
       * This is where the output of the periodic monitoring jobs is uploaded.
       */
      override fun monitoringOutputs(monitoringOutputs: List<Any>) {
        cdkBuilder.monitoringOutputs(monitoringOutputs.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
       * This is where the output of the periodic monitoring jobs is uploaded.
       */
      override fun monitoringOutputs(vararg monitoringOutputs: Any): Unit =
          monitoringOutputs(monitoringOutputs.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputConfigProperty,
    ) : CdkObject(cdkObject),
        MonitoringOutputConfigProperty {
      /**
       * The AWS Key Management Service ( AWS KMS ) key that Amazon SageMaker AI uses to encrypt the
       * model artifacts at rest using Amazon S3 server-side encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringoutputconfig.html#cfn-sagemaker-modelbiasjobdefinition-monitoringoutputconfig-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * Monitoring outputs for monitoring jobs.
       *
       * This is where the output of the periodic monitoring jobs is uploaded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringoutputconfig.html#cfn-sagemaker-modelbiasjobdefinition-monitoringoutputconfig-monitoringoutputs)
       */
      override fun monitoringOutputs(): Any = unwrap(this).getMonitoringOutputs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringOutputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputConfigProperty):
          MonitoringOutputConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MonitoringOutputConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringOutputConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputConfigProperty
    }
  }

  /**
   * The output object for a monitoring job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * MonitoringOutputProperty monitoringOutputProperty = MonitoringOutputProperty.builder()
   * .s3Output(S3OutputProperty.builder()
   * .localPath("localPath")
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .s3UploadMode("s3UploadMode")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringoutput.html)
   */
  public interface MonitoringOutputProperty {
    /**
     * The Amazon S3 storage location where the results of a monitoring job are saved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringoutput.html#cfn-sagemaker-modelbiasjobdefinition-monitoringoutput-s3output)
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
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21ad1a760a61c02052d7156cf2fa71a51b198480f71ffcf878f50a3658515415")
      public fun s3Output(s3Output: S3OutputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputProperty.builder()

      /**
       * @param s3Output The Amazon S3 storage location where the results of a monitoring job are
       * saved. 
       */
      override fun s3Output(s3Output: IResolvable) {
        cdkBuilder.s3Output(s3Output.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3Output The Amazon S3 storage location where the results of a monitoring job are
       * saved. 
       */
      override fun s3Output(s3Output: S3OutputProperty) {
        cdkBuilder.s3Output(s3Output.let(S3OutputProperty.Companion::unwrap))
      }

      /**
       * @param s3Output The Amazon S3 storage location where the results of a monitoring job are
       * saved. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21ad1a760a61c02052d7156cf2fa71a51b198480f71ffcf878f50a3658515415")
      override fun s3Output(s3Output: S3OutputProperty.Builder.() -> Unit): Unit =
          s3Output(S3OutputProperty(s3Output))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputProperty,
    ) : CdkObject(cdkObject),
        MonitoringOutputProperty {
      /**
       * The Amazon S3 storage location where the results of a monitoring job are saved.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringoutput.html#cfn-sagemaker-modelbiasjobdefinition-monitoringoutput-s3output)
       */
      override fun s3Output(): Any = unwrap(this).getS3Output()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputProperty):
          MonitoringOutputProperty = CdkObjectWrappers.wrap(cdkObject) as? MonitoringOutputProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringOutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputProperty
    }
  }

  /**
   * Identifies the resources to deploy for a monitoring job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * MonitoringResourcesProperty monitoringResourcesProperty = MonitoringResourcesProperty.builder()
   * .clusterConfig(ClusterConfigProperty.builder()
   * .instanceCount(123)
   * .instanceType("instanceType")
   * .volumeSizeInGb(123)
   * // the properties below are optional
   * .volumeKmsKeyId("volumeKmsKeyId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringresources.html)
   */
  public interface MonitoringResourcesProperty {
    /**
     * The configuration for the cluster resources used to run the processing job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringresources.html#cfn-sagemaker-modelbiasjobdefinition-monitoringresources-clusterconfig)
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
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b497d67f2da4f390275cddce9dcbdf29f14e9107a24c41d17f534a600b687ad7")
      public fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringResourcesProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringResourcesProperty.builder()

      /**
       * @param clusterConfig The configuration for the cluster resources used to run the processing
       * job. 
       */
      override fun clusterConfig(clusterConfig: IResolvable) {
        cdkBuilder.clusterConfig(clusterConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param clusterConfig The configuration for the cluster resources used to run the processing
       * job. 
       */
      override fun clusterConfig(clusterConfig: ClusterConfigProperty) {
        cdkBuilder.clusterConfig(clusterConfig.let(ClusterConfigProperty.Companion::unwrap))
      }

      /**
       * @param clusterConfig The configuration for the cluster resources used to run the processing
       * job. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b497d67f2da4f390275cddce9dcbdf29f14e9107a24c41d17f534a600b687ad7")
      override fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit): Unit =
          clusterConfig(ClusterConfigProperty(clusterConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringResourcesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringResourcesProperty,
    ) : CdkObject(cdkObject),
        MonitoringResourcesProperty {
      /**
       * The configuration for the cluster resources used to run the processing job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringresources.html#cfn-sagemaker-modelbiasjobdefinition-monitoringresources-clusterconfig)
       */
      override fun clusterConfig(): Any = unwrap(this).getClusterConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringResourcesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringResourcesProperty):
          MonitoringResourcesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MonitoringResourcesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringResourcesProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringResourcesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringResourcesProperty
    }
  }

  /**
   * Networking options for a job, such as network traffic encryption between containers, whether to
   * allow inbound and outbound network calls to and from containers, and the VPC subnets and security
   * groups to use for VPC-enabled jobs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * NetworkConfigProperty networkConfigProperty = NetworkConfigProperty.builder()
   * .enableInterContainerTrafficEncryption(false)
   * .enableNetworkIsolation(false)
   * .vpcConfig(VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnets(List.of("subnets"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-networkconfig.html)
   */
  public interface NetworkConfigProperty {
    /**
     * Whether to encrypt all communications between distributed processing jobs.
     *
     * Choose `True` to encrypt communications. Encryption provides greater security for distributed
     * processing jobs, but the processing might take longer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-networkconfig.html#cfn-sagemaker-modelbiasjobdefinition-networkconfig-enableintercontainertrafficencryption)
     */
    public fun enableInterContainerTrafficEncryption(): Any? =
        unwrap(this).getEnableInterContainerTrafficEncryption()

    /**
     * Whether to allow inbound and outbound network calls to and from the containers used for the
     * processing job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-networkconfig.html#cfn-sagemaker-modelbiasjobdefinition-networkconfig-enablenetworkisolation)
     */
    public fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

    /**
     * Specifies a VPC that your training jobs and hosted models have access to.
     *
     * Control access to and from your training and model containers by configuring the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-networkconfig.html#cfn-sagemaker-modelbiasjobdefinition-networkconfig-vpcconfig)
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
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("753d272102c0882cbd4bea22635ae8f2c4348bf9fc0838c541ad1ba0d02456ec")
      public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.NetworkConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.NetworkConfigProperty.builder()

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
        cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption.let(IResolvable.Companion::unwrap))
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
        cdkBuilder.enableNetworkIsolation(enableNetworkIsolation.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
       * Control access to and from your training and model containers by configuring the VPC.
       */
      override fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
       * Control access to and from your training and model containers by configuring the VPC.
       */
      override fun vpcConfig(vpcConfig: VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty.Companion::unwrap))
      }

      /**
       * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
       * Control access to and from your training and model containers by configuring the VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("753d272102c0882cbd4bea22635ae8f2c4348bf9fc0838c541ad1ba0d02456ec")
      override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
          vpcConfig(VpcConfigProperty(vpcConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.NetworkConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.NetworkConfigProperty,
    ) : CdkObject(cdkObject),
        NetworkConfigProperty {
      /**
       * Whether to encrypt all communications between distributed processing jobs.
       *
       * Choose `True` to encrypt communications. Encryption provides greater security for
       * distributed processing jobs, but the processing might take longer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-networkconfig.html#cfn-sagemaker-modelbiasjobdefinition-networkconfig-enableintercontainertrafficencryption)
       */
      override fun enableInterContainerTrafficEncryption(): Any? =
          unwrap(this).getEnableInterContainerTrafficEncryption()

      /**
       * Whether to allow inbound and outbound network calls to and from the containers used for the
       * processing job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-networkconfig.html#cfn-sagemaker-modelbiasjobdefinition-networkconfig-enablenetworkisolation)
       */
      override fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

      /**
       * Specifies a VPC that your training jobs and hosted models have access to.
       *
       * Control access to and from your training and model containers by configuring the VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-networkconfig.html#cfn-sagemaker-modelbiasjobdefinition-networkconfig-vpcconfig)
       */
      override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.NetworkConfigProperty):
          NetworkConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? NetworkConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.NetworkConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.NetworkConfigProperty
    }
  }

  /**
   * The Amazon S3 storage location where the results of a monitoring job are saved.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * S3OutputProperty s3OutputProperty = S3OutputProperty.builder()
   * .localPath("localPath")
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .s3UploadMode("s3UploadMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-s3output.html)
   */
  public interface S3OutputProperty {
    /**
     * The local path to the Amazon S3 storage location where Amazon SageMaker saves the results of
     * a monitoring job.
     *
     * `LocalPath` is an absolute path for the output data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-s3output.html#cfn-sagemaker-modelbiasjobdefinition-s3output-localpath)
     */
    public fun localPath(): String

    /**
     * Whether to upload the results of the monitoring job continuously or after the job completes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-s3output.html#cfn-sagemaker-modelbiasjobdefinition-s3output-s3uploadmode)
     */
    public fun s3UploadMode(): String? = unwrap(this).getS3UploadMode()

    /**
     * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results
     * of a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-s3output.html#cfn-sagemaker-modelbiasjobdefinition-s3output-s3uri)
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
       * `LocalPath` is an absolute path for the output data.
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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.S3OutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.S3OutputProperty.builder()

      /**
       * @param localPath The local path to the Amazon S3 storage location where Amazon SageMaker
       * saves the results of a monitoring job. 
       * `LocalPath` is an absolute path for the output data.
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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.S3OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.S3OutputProperty,
    ) : CdkObject(cdkObject),
        S3OutputProperty {
      /**
       * The local path to the Amazon S3 storage location where Amazon SageMaker saves the results
       * of a monitoring job.
       *
       * `LocalPath` is an absolute path for the output data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-s3output.html#cfn-sagemaker-modelbiasjobdefinition-s3output-localpath)
       */
      override fun localPath(): String = unwrap(this).getLocalPath()

      /**
       * Whether to upload the results of the monitoring job continuously or after the job
       * completes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-s3output.html#cfn-sagemaker-modelbiasjobdefinition-s3output-s3uploadmode)
       */
      override fun s3UploadMode(): String? = unwrap(this).getS3UploadMode()

      /**
       * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the
       * results of a monitoring job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-s3output.html#cfn-sagemaker-modelbiasjobdefinition-s3output-s3uri)
       */
      override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.S3OutputProperty):
          S3OutputProperty = CdkObjectWrappers.wrap(cdkObject) as? S3OutputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.S3OutputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.S3OutputProperty
    }
  }

  /**
   * Specifies a limit to how long a job can run.
   *
   * When the job reaches the time limit, SageMaker ends the job. Use this API to cap costs.
   *
   * To stop a training job, SageMaker sends the algorithm the `SIGTERM` signal, which delays job
   * termination for 120 seconds. Algorithms can use this 120-second window to save the model
   * artifacts, so the results of training are not lost.
   *
   * The training algorithms provided by SageMaker automatically save the intermediate results of a
   * model training job when possible. This attempt to save artifacts is only a best effort case as
   * model might not be in a state from which it can be saved. For example, if training has just
   * started, the model might not be ready to save. When saved, this intermediate data is a valid model
   * artifact. You can use it to create a model with `CreateModel` .
   *
   *
   * The Neural Topic Model (NTM) currently does not support saving intermediate model artifacts.
   * When training NTMs, make sure that the maximum runtime is sufficient for the training job to
   * complete.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * StoppingConditionProperty stoppingConditionProperty = StoppingConditionProperty.builder()
   * .maxRuntimeInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-stoppingcondition.html)
   */
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-stoppingcondition.html#cfn-sagemaker-modelbiasjobdefinition-stoppingcondition-maxruntimeinseconds)
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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.StoppingConditionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.StoppingConditionProperty.builder()

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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.StoppingConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.StoppingConditionProperty,
    ) : CdkObject(cdkObject),
        StoppingConditionProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-stoppingcondition.html#cfn-sagemaker-modelbiasjobdefinition-stoppingcondition-maxruntimeinseconds)
       */
      override fun maxRuntimeInSeconds(): Number = unwrap(this).getMaxRuntimeInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StoppingConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.StoppingConditionProperty):
          StoppingConditionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StoppingConditionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StoppingConditionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.StoppingConditionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.StoppingConditionProperty
    }
  }

  /**
   * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
   * compute resources have access to.
   *
   * You can control access to and from your resources by configuring a VPC. For more information,
   * see [Give SageMaker Access to Resources in your Amazon
   * VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnets(List.of("subnets"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-vpcconfig.html)
   */
  public interface VpcConfigProperty {
    /**
     * The VPC security group IDs, in the form `sg-xxxxxxxx` .
     *
     * Specify the security groups for the VPC that is specified in the `Subnets` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-vpcconfig.html#cfn-sagemaker-modelbiasjobdefinition-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * The ID of the subnets in the VPC to which you want to connect your training job or model.
     *
     * For information about the availability of specific instance types, see [Supported Instance
     * Types and Availability
     * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-vpcconfig.html#cfn-sagemaker-modelbiasjobdefinition-vpcconfig-subnets)
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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.VpcConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.VpcConfigProperty.builder()

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
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.VpcConfigProperty,
    ) : CdkObject(cdkObject),
        VpcConfigProperty {
      /**
       * The VPC security group IDs, in the form `sg-xxxxxxxx` .
       *
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-vpcconfig.html#cfn-sagemaker-modelbiasjobdefinition-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * The ID of the subnets in the VPC to which you want to connect your training job or model.
       *
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-vpcconfig.html#cfn-sagemaker-modelbiasjobdefinition-vpcconfig-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.VpcConfigProperty):
          VpcConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.VpcConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.VpcConfigProperty
    }
  }
}
