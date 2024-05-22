@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnModelExplainabilityJobDefinition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnModelExplainabilityJobDefinitionProps cfnModelExplainabilityJobDefinitionProps =
 * CfnModelExplainabilityJobDefinitionProps.builder()
 * .jobResources(MonitoringResourcesProperty.builder()
 * .clusterConfig(ClusterConfigProperty.builder()
 * .instanceCount(123)
 * .instanceType("instanceType")
 * .volumeSizeInGb(123)
 * // the properties below are optional
 * .volumeKmsKeyId("volumeKmsKeyId")
 * .build())
 * .build())
 * .modelExplainabilityAppSpecification(ModelExplainabilityAppSpecificationProperty.builder()
 * .configUri("configUri")
 * .imageUri("imageUri")
 * // the properties below are optional
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .build())
 * .modelExplainabilityJobInput(ModelExplainabilityJobInputProperty.builder()
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
 * .featuresAttribute("featuresAttribute")
 * .inferenceAttribute("inferenceAttribute")
 * .probabilityAttribute("probabilityAttribute")
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .build())
 * .endpointInput(EndpointInputProperty.builder()
 * .endpointName("endpointName")
 * .localPath("localPath")
 * // the properties below are optional
 * .featuresAttribute("featuresAttribute")
 * .inferenceAttribute("inferenceAttribute")
 * .probabilityAttribute("probabilityAttribute")
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .build())
 * .build())
 * .modelExplainabilityJobOutputConfig(MonitoringOutputConfigProperty.builder()
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
 * .modelExplainabilityBaselineConfig(ModelExplainabilityBaselineConfigProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html)
 */
public interface CfnModelExplainabilityJobDefinitionProps {
  /**
   * The name of the endpoint used to run the monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointname)
   */
  public fun endpointName(): String? = unwrap(this).getEndpointName()

  /**
   * The name of the model explainability job definition.
   *
   * The name must be unique within an AWS Region in the AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-jobdefinitionname)
   */
  public fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  /**
   * Identifies the resources to deploy for a monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-jobresources)
   */
  public fun jobResources(): Any

  /**
   * Configures the model explainability job to run a specified Docker container image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification)
   */
  public fun modelExplainabilityAppSpecification(): Any

  /**
   * The baseline configuration for a model explainability job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig)
   */
  public fun modelExplainabilityBaselineConfig(): Any? =
      unwrap(this).getModelExplainabilityBaselineConfig()

  /**
   * Inputs for the model explainability job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput)
   */
  public fun modelExplainabilityJobInput(): Any

  /**
   * The output configuration for monitoring jobs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjoboutputconfig)
   */
  public fun modelExplainabilityJobOutputConfig(): Any

  /**
   * Networking options for a model explainability job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-networkconfig)
   */
  public fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

  /**
   * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks
   * on your behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-rolearn)
   */
  public fun roleArn(): String

  /**
   * A time limit for how long the monitoring job is allowed to run before stopping.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-stoppingcondition)
   */
  public fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnModelExplainabilityJobDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param endpointName The name of the endpoint used to run the monitoring job.
     */
    public fun endpointName(endpointName: String)

    /**
     * @param jobDefinitionName The name of the model explainability job definition.
     * The name must be unique within an AWS Region in the AWS account.
     */
    public fun jobDefinitionName(jobDefinitionName: String)

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    public fun jobResources(jobResources: IResolvable)

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    public
        fun jobResources(jobResources: CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty)

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92c8ae970b31e381dba425fa94f9ccd888dd3c8f332bd5c75c8b730452d648f5")
    public
        fun jobResources(jobResources: CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty.Builder.() -> Unit)

    /**
     * @param modelExplainabilityAppSpecification Configures the model explainability job to run a
     * specified Docker container image. 
     */
    public fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: IResolvable)

    /**
     * @param modelExplainabilityAppSpecification Configures the model explainability job to run a
     * specified Docker container image. 
     */
    public
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty)

    /**
     * @param modelExplainabilityAppSpecification Configures the model explainability job to run a
     * specified Docker container image. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c16cc762850226169ddb4a44f765c11b4fb19537e9d1088f0f0d7594a5bc152")
    public
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty.Builder.() -> Unit)

    /**
     * @param modelExplainabilityBaselineConfig The baseline configuration for a model
     * explainability job.
     */
    public fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: IResolvable)

    /**
     * @param modelExplainabilityBaselineConfig The baseline configuration for a model
     * explainability job.
     */
    public
        fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty)

    /**
     * @param modelExplainabilityBaselineConfig The baseline configuration for a model
     * explainability job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f061bae8fbfb875f703984b79ac655060fc0b29f70ebf85f2feac04c41b087cf")
    public
        fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty.Builder.() -> Unit)

    /**
     * @param modelExplainabilityJobInput Inputs for the model explainability job. 
     */
    public fun modelExplainabilityJobInput(modelExplainabilityJobInput: IResolvable)

    /**
     * @param modelExplainabilityJobInput Inputs for the model explainability job. 
     */
    public
        fun modelExplainabilityJobInput(modelExplainabilityJobInput: CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty)

    /**
     * @param modelExplainabilityJobInput Inputs for the model explainability job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7085c814f6a3d53b6daa3586fe2133a6f4110e0d3c5ce6e1dad5a53ca746e324")
    public
        fun modelExplainabilityJobInput(modelExplainabilityJobInput: CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty.Builder.() -> Unit)

    /**
     * @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs. 
     */
    public fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: IResolvable)

    /**
     * @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs. 
     */
    public
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty)

    /**
     * @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad2f472fc8f53acd2c086bf94b80fec3414ba74a420c483a7323a572185ac4f8")
    public
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty.Builder.() -> Unit)

    /**
     * @param networkConfig Networking options for a model explainability job.
     */
    public fun networkConfig(networkConfig: IResolvable)

    /**
     * @param networkConfig Networking options for a model explainability job.
     */
    public
        fun networkConfig(networkConfig: CfnModelExplainabilityJobDefinition.NetworkConfigProperty)

    /**
     * @param networkConfig Networking options for a model explainability job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2cf7cdf3ed3a733621e1162d8f3b348bdc606f8fdac04f6a5f2de9d0df453891")
    public
        fun networkConfig(networkConfig: CfnModelExplainabilityJobDefinition.NetworkConfigProperty.Builder.() -> Unit)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume
     * to perform tasks on your behalf. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping.
     */
    public fun stoppingCondition(stoppingCondition: IResolvable)

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping.
     */
    public
        fun stoppingCondition(stoppingCondition: CfnModelExplainabilityJobDefinition.StoppingConditionProperty)

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("559f91ab3ac57a3ed43b259e05a1f7d50573df632f145a9cba62751703e0d991")
    public
        fun stoppingCondition(stoppingCondition: CfnModelExplainabilityJobDefinition.StoppingConditionProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps.builder()

    /**
     * @param endpointName The name of the endpoint used to run the monitoring job.
     */
    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    /**
     * @param jobDefinitionName The name of the model explainability job definition.
     * The name must be unique within an AWS Region in the AWS account.
     */
    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    override fun jobResources(jobResources: IResolvable) {
      cdkBuilder.jobResources(jobResources.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    override
        fun jobResources(jobResources: CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty) {
      cdkBuilder.jobResources(jobResources.let(CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty.Companion::unwrap))
    }

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92c8ae970b31e381dba425fa94f9ccd888dd3c8f332bd5c75c8b730452d648f5")
    override
        fun jobResources(jobResources: CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty.Builder.() -> Unit):
        Unit =
        jobResources(CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty(jobResources))

    /**
     * @param modelExplainabilityAppSpecification Configures the model explainability job to run a
     * specified Docker container image. 
     */
    override
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: IResolvable) {
      cdkBuilder.modelExplainabilityAppSpecification(modelExplainabilityAppSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param modelExplainabilityAppSpecification Configures the model explainability job to run a
     * specified Docker container image. 
     */
    override
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty) {
      cdkBuilder.modelExplainabilityAppSpecification(modelExplainabilityAppSpecification.let(CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param modelExplainabilityAppSpecification Configures the model explainability job to run a
     * specified Docker container image. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c16cc762850226169ddb4a44f765c11b4fb19537e9d1088f0f0d7594a5bc152")
    override
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty.Builder.() -> Unit):
        Unit =
        modelExplainabilityAppSpecification(CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty(modelExplainabilityAppSpecification))

    /**
     * @param modelExplainabilityBaselineConfig The baseline configuration for a model
     * explainability job.
     */
    override fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: IResolvable) {
      cdkBuilder.modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param modelExplainabilityBaselineConfig The baseline configuration for a model
     * explainability job.
     */
    override
        fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty) {
      cdkBuilder.modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig.let(CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty.Companion::unwrap))
    }

    /**
     * @param modelExplainabilityBaselineConfig The baseline configuration for a model
     * explainability job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f061bae8fbfb875f703984b79ac655060fc0b29f70ebf85f2feac04c41b087cf")
    override
        fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty.Builder.() -> Unit):
        Unit =
        modelExplainabilityBaselineConfig(CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty(modelExplainabilityBaselineConfig))

    /**
     * @param modelExplainabilityJobInput Inputs for the model explainability job. 
     */
    override fun modelExplainabilityJobInput(modelExplainabilityJobInput: IResolvable) {
      cdkBuilder.modelExplainabilityJobInput(modelExplainabilityJobInput.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param modelExplainabilityJobInput Inputs for the model explainability job. 
     */
    override
        fun modelExplainabilityJobInput(modelExplainabilityJobInput: CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty) {
      cdkBuilder.modelExplainabilityJobInput(modelExplainabilityJobInput.let(CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty.Companion::unwrap))
    }

    /**
     * @param modelExplainabilityJobInput Inputs for the model explainability job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7085c814f6a3d53b6daa3586fe2133a6f4110e0d3c5ce6e1dad5a53ca746e324")
    override
        fun modelExplainabilityJobInput(modelExplainabilityJobInput: CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty.Builder.() -> Unit):
        Unit =
        modelExplainabilityJobInput(CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty(modelExplainabilityJobInput))

    /**
     * @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs. 
     */
    override
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: IResolvable) {
      cdkBuilder.modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs. 
     */
    override
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty) {
      cdkBuilder.modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig.let(CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty.Companion::unwrap))
    }

    /**
     * @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad2f472fc8f53acd2c086bf94b80fec3414ba74a420c483a7323a572185ac4f8")
    override
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty.Builder.() -> Unit):
        Unit =
        modelExplainabilityJobOutputConfig(CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty(modelExplainabilityJobOutputConfig))

    /**
     * @param networkConfig Networking options for a model explainability job.
     */
    override fun networkConfig(networkConfig: IResolvable) {
      cdkBuilder.networkConfig(networkConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param networkConfig Networking options for a model explainability job.
     */
    override
        fun networkConfig(networkConfig: CfnModelExplainabilityJobDefinition.NetworkConfigProperty) {
      cdkBuilder.networkConfig(networkConfig.let(CfnModelExplainabilityJobDefinition.NetworkConfigProperty.Companion::unwrap))
    }

    /**
     * @param networkConfig Networking options for a model explainability job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2cf7cdf3ed3a733621e1162d8f3b348bdc606f8fdac04f6a5f2de9d0df453891")
    override
        fun networkConfig(networkConfig: CfnModelExplainabilityJobDefinition.NetworkConfigProperty.Builder.() -> Unit):
        Unit =
        networkConfig(CfnModelExplainabilityJobDefinition.NetworkConfigProperty(networkConfig))

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume
     * to perform tasks on your behalf. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping.
     */
    override fun stoppingCondition(stoppingCondition: IResolvable) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping.
     */
    override
        fun stoppingCondition(stoppingCondition: CfnModelExplainabilityJobDefinition.StoppingConditionProperty) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(CfnModelExplainabilityJobDefinition.StoppingConditionProperty.Companion::unwrap))
    }

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("559f91ab3ac57a3ed43b259e05a1f7d50573df632f145a9cba62751703e0d991")
    override
        fun stoppingCondition(stoppingCondition: CfnModelExplainabilityJobDefinition.StoppingConditionProperty.Builder.() -> Unit):
        Unit =
        stoppingCondition(CfnModelExplainabilityJobDefinition.StoppingConditionProperty(stoppingCondition))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps,
  ) : CdkObject(cdkObject), CfnModelExplainabilityJobDefinitionProps {
    /**
     * The name of the endpoint used to run the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-endpointname)
     */
    override fun endpointName(): String? = unwrap(this).getEndpointName()

    /**
     * The name of the model explainability job definition.
     *
     * The name must be unique within an AWS Region in the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-jobdefinitionname)
     */
    override fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-jobresources)
     */
    override fun jobResources(): Any = unwrap(this).getJobResources()

    /**
     * Configures the model explainability job to run a specified Docker container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification)
     */
    override fun modelExplainabilityAppSpecification(): Any =
        unwrap(this).getModelExplainabilityAppSpecification()

    /**
     * The baseline configuration for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig)
     */
    override fun modelExplainabilityBaselineConfig(): Any? =
        unwrap(this).getModelExplainabilityBaselineConfig()

    /**
     * Inputs for the model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput)
     */
    override fun modelExplainabilityJobInput(): Any = unwrap(this).getModelExplainabilityJobInput()

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjoboutputconfig)
     */
    override fun modelExplainabilityJobOutputConfig(): Any =
        unwrap(this).getModelExplainabilityJobOutputConfig()

    /**
     * Networking options for a model explainability job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-networkconfig)
     */
    override fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform
     * tasks on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-stoppingcondition)
     */
    override fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html#cfn-sagemaker-modelexplainabilityjobdefinition-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnModelExplainabilityJobDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps):
        CfnModelExplainabilityJobDefinitionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnModelExplainabilityJobDefinitionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModelExplainabilityJobDefinitionProps):
        software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps
  }
}
