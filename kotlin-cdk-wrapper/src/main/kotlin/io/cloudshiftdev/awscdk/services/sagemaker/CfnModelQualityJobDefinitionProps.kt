@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnModelQualityJobDefinition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnModelQualityJobDefinitionProps cfnModelQualityJobDefinitionProps =
 * CfnModelQualityJobDefinitionProps.builder()
 * .jobResources(MonitoringResourcesProperty.builder()
 * .clusterConfig(ClusterConfigProperty.builder()
 * .instanceCount(123)
 * .instanceType("instanceType")
 * .volumeSizeInGb(123)
 * // the properties below are optional
 * .volumeKmsKeyId("volumeKmsKeyId")
 * .build())
 * .build())
 * .modelQualityAppSpecification(ModelQualityAppSpecificationProperty.builder()
 * .imageUri("imageUri")
 * .problemType("problemType")
 * // the properties below are optional
 * .containerArguments(List.of("containerArguments"))
 * .containerEntrypoint(List.of("containerEntrypoint"))
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .postAnalyticsProcessorSourceUri("postAnalyticsProcessorSourceUri")
 * .recordPreprocessorSourceUri("recordPreprocessorSourceUri")
 * .build())
 * .modelQualityJobInput(ModelQualityJobInputProperty.builder()
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
 * .inferenceAttribute("inferenceAttribute")
 * .probabilityAttribute("probabilityAttribute")
 * .probabilityThresholdAttribute(123)
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .startTimeOffset("startTimeOffset")
 * .build())
 * .build())
 * .modelQualityJobOutputConfig(MonitoringOutputConfigProperty.builder()
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
 * .modelQualityBaselineConfig(ModelQualityBaselineConfigProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html)
 */
public interface CfnModelQualityJobDefinitionProps {
  /**
   * The name of the endpoint used to run the monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-endpointname)
   */
  public fun endpointName(): String? = unwrap(this).getEndpointName()

  /**
   * The name of the monitoring job definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-jobdefinitionname)
   */
  public fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  /**
   * Identifies the resources to deploy for a monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-jobresources)
   */
  public fun jobResources(): Any

  /**
   * Container image configuration object for the monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification)
   */
  public fun modelQualityAppSpecification(): Any

  /**
   * Specifies the constraints and baselines for the monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualitybaselineconfig)
   */
  public fun modelQualityBaselineConfig(): Any? = unwrap(this).getModelQualityBaselineConfig()

  /**
   * A list of the inputs that are monitored.
   *
   * Currently endpoints are supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjobinput)
   */
  public fun modelQualityJobInput(): Any

  /**
   * The output configuration for monitoring jobs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjoboutputconfig)
   */
  public fun modelQualityJobOutputConfig(): Any

  /**
   * Specifies the network configuration for the monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-networkconfig)
   */
  public fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

  /**
   * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks
   * on your behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-rolearn)
   */
  public fun roleArn(): String

  /**
   * A time limit for how long the monitoring job is allowed to run before stopping.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-stoppingcondition)
   */
  public fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnModelQualityJobDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param endpointName The name of the endpoint used to run the monitoring job.
     */
    public fun endpointName(endpointName: String)

    /**
     * @param jobDefinitionName The name of the monitoring job definition.
     */
    public fun jobDefinitionName(jobDefinitionName: String)

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    public fun jobResources(jobResources: IResolvable)

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    public fun jobResources(jobResources: CfnModelQualityJobDefinition.MonitoringResourcesProperty)

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4469e396ae16782927038126b69fd4d01236373725344fa61bac4cd01e30c289")
    public
        fun jobResources(jobResources: CfnModelQualityJobDefinition.MonitoringResourcesProperty.Builder.() -> Unit)

    /**
     * @param modelQualityAppSpecification Container image configuration object for the monitoring
     * job. 
     */
    public fun modelQualityAppSpecification(modelQualityAppSpecification: IResolvable)

    /**
     * @param modelQualityAppSpecification Container image configuration object for the monitoring
     * job. 
     */
    public
        fun modelQualityAppSpecification(modelQualityAppSpecification: CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty)

    /**
     * @param modelQualityAppSpecification Container image configuration object for the monitoring
     * job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dcaf3836e6466bd1a7bf80f2d12ee3538668efc606cf934218748437216a354b")
    public
        fun modelQualityAppSpecification(modelQualityAppSpecification: CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty.Builder.() -> Unit)

    /**
     * @param modelQualityBaselineConfig Specifies the constraints and baselines for the monitoring
     * job.
     */
    public fun modelQualityBaselineConfig(modelQualityBaselineConfig: IResolvable)

    /**
     * @param modelQualityBaselineConfig Specifies the constraints and baselines for the monitoring
     * job.
     */
    public
        fun modelQualityBaselineConfig(modelQualityBaselineConfig: CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty)

    /**
     * @param modelQualityBaselineConfig Specifies the constraints and baselines for the monitoring
     * job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f9f6fb13324c719ee9955fa264697119623423327224d5055bc336084b657d4")
    public
        fun modelQualityBaselineConfig(modelQualityBaselineConfig: CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty.Builder.() -> Unit)

    /**
     * @param modelQualityJobInput A list of the inputs that are monitored. 
     * Currently endpoints are supported.
     */
    public fun modelQualityJobInput(modelQualityJobInput: IResolvable)

    /**
     * @param modelQualityJobInput A list of the inputs that are monitored. 
     * Currently endpoints are supported.
     */
    public
        fun modelQualityJobInput(modelQualityJobInput: CfnModelQualityJobDefinition.ModelQualityJobInputProperty)

    /**
     * @param modelQualityJobInput A list of the inputs that are monitored. 
     * Currently endpoints are supported.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ecd26305865124c4b92054fa71f8ad3c9fc38682b99983c33a7a8a3c5d8012f")
    public
        fun modelQualityJobInput(modelQualityJobInput: CfnModelQualityJobDefinition.ModelQualityJobInputProperty.Builder.() -> Unit)

    /**
     * @param modelQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    public fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: IResolvable)

    /**
     * @param modelQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    public
        fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: CfnModelQualityJobDefinition.MonitoringOutputConfigProperty)

    /**
     * @param modelQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69e84c795d77aa961acb15ff23181b730269b6cfe83f103923c3aeaa4bd345bc")
    public
        fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: CfnModelQualityJobDefinition.MonitoringOutputConfigProperty.Builder.() -> Unit)

    /**
     * @param networkConfig Specifies the network configuration for the monitoring job.
     */
    public fun networkConfig(networkConfig: IResolvable)

    /**
     * @param networkConfig Specifies the network configuration for the monitoring job.
     */
    public fun networkConfig(networkConfig: CfnModelQualityJobDefinition.NetworkConfigProperty)

    /**
     * @param networkConfig Specifies the network configuration for the monitoring job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff488dbfc36b03ba810ad46a87af48ebbac1550381d0308a2d35268ba18c8c56")
    public
        fun networkConfig(networkConfig: CfnModelQualityJobDefinition.NetworkConfigProperty.Builder.() -> Unit)

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
        fun stoppingCondition(stoppingCondition: CfnModelQualityJobDefinition.StoppingConditionProperty)

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("779329dee6ab5e514166eb104df196aedad1aa20865464018baea43cb8e2465f")
    public
        fun stoppingCondition(stoppingCondition: CfnModelQualityJobDefinition.StoppingConditionProperty.Builder.() -> Unit)

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
        software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps.builder()

    /**
     * @param endpointName The name of the endpoint used to run the monitoring job.
     */
    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    /**
     * @param jobDefinitionName The name of the monitoring job definition.
     */
    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    override fun jobResources(jobResources: IResolvable) {
      cdkBuilder.jobResources(jobResources.let(IResolvable::unwrap))
    }

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    override
        fun jobResources(jobResources: CfnModelQualityJobDefinition.MonitoringResourcesProperty) {
      cdkBuilder.jobResources(jobResources.let(CfnModelQualityJobDefinition.MonitoringResourcesProperty::unwrap))
    }

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4469e396ae16782927038126b69fd4d01236373725344fa61bac4cd01e30c289")
    override
        fun jobResources(jobResources: CfnModelQualityJobDefinition.MonitoringResourcesProperty.Builder.() -> Unit):
        Unit = jobResources(CfnModelQualityJobDefinition.MonitoringResourcesProperty(jobResources))

    /**
     * @param modelQualityAppSpecification Container image configuration object for the monitoring
     * job. 
     */
    override fun modelQualityAppSpecification(modelQualityAppSpecification: IResolvable) {
      cdkBuilder.modelQualityAppSpecification(modelQualityAppSpecification.let(IResolvable::unwrap))
    }

    /**
     * @param modelQualityAppSpecification Container image configuration object for the monitoring
     * job. 
     */
    override
        fun modelQualityAppSpecification(modelQualityAppSpecification: CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty) {
      cdkBuilder.modelQualityAppSpecification(modelQualityAppSpecification.let(CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty::unwrap))
    }

    /**
     * @param modelQualityAppSpecification Container image configuration object for the monitoring
     * job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dcaf3836e6466bd1a7bf80f2d12ee3538668efc606cf934218748437216a354b")
    override
        fun modelQualityAppSpecification(modelQualityAppSpecification: CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty.Builder.() -> Unit):
        Unit =
        modelQualityAppSpecification(CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty(modelQualityAppSpecification))

    /**
     * @param modelQualityBaselineConfig Specifies the constraints and baselines for the monitoring
     * job.
     */
    override fun modelQualityBaselineConfig(modelQualityBaselineConfig: IResolvable) {
      cdkBuilder.modelQualityBaselineConfig(modelQualityBaselineConfig.let(IResolvable::unwrap))
    }

    /**
     * @param modelQualityBaselineConfig Specifies the constraints and baselines for the monitoring
     * job.
     */
    override
        fun modelQualityBaselineConfig(modelQualityBaselineConfig: CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty) {
      cdkBuilder.modelQualityBaselineConfig(modelQualityBaselineConfig.let(CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty::unwrap))
    }

    /**
     * @param modelQualityBaselineConfig Specifies the constraints and baselines for the monitoring
     * job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f9f6fb13324c719ee9955fa264697119623423327224d5055bc336084b657d4")
    override
        fun modelQualityBaselineConfig(modelQualityBaselineConfig: CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty.Builder.() -> Unit):
        Unit =
        modelQualityBaselineConfig(CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty(modelQualityBaselineConfig))

    /**
     * @param modelQualityJobInput A list of the inputs that are monitored. 
     * Currently endpoints are supported.
     */
    override fun modelQualityJobInput(modelQualityJobInput: IResolvable) {
      cdkBuilder.modelQualityJobInput(modelQualityJobInput.let(IResolvable::unwrap))
    }

    /**
     * @param modelQualityJobInput A list of the inputs that are monitored. 
     * Currently endpoints are supported.
     */
    override
        fun modelQualityJobInput(modelQualityJobInput: CfnModelQualityJobDefinition.ModelQualityJobInputProperty) {
      cdkBuilder.modelQualityJobInput(modelQualityJobInput.let(CfnModelQualityJobDefinition.ModelQualityJobInputProperty::unwrap))
    }

    /**
     * @param modelQualityJobInput A list of the inputs that are monitored. 
     * Currently endpoints are supported.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ecd26305865124c4b92054fa71f8ad3c9fc38682b99983c33a7a8a3c5d8012f")
    override
        fun modelQualityJobInput(modelQualityJobInput: CfnModelQualityJobDefinition.ModelQualityJobInputProperty.Builder.() -> Unit):
        Unit =
        modelQualityJobInput(CfnModelQualityJobDefinition.ModelQualityJobInputProperty(modelQualityJobInput))

    /**
     * @param modelQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    override fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: IResolvable) {
      cdkBuilder.modelQualityJobOutputConfig(modelQualityJobOutputConfig.let(IResolvable::unwrap))
    }

    /**
     * @param modelQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    override
        fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: CfnModelQualityJobDefinition.MonitoringOutputConfigProperty) {
      cdkBuilder.modelQualityJobOutputConfig(modelQualityJobOutputConfig.let(CfnModelQualityJobDefinition.MonitoringOutputConfigProperty::unwrap))
    }

    /**
     * @param modelQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69e84c795d77aa961acb15ff23181b730269b6cfe83f103923c3aeaa4bd345bc")
    override
        fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: CfnModelQualityJobDefinition.MonitoringOutputConfigProperty.Builder.() -> Unit):
        Unit =
        modelQualityJobOutputConfig(CfnModelQualityJobDefinition.MonitoringOutputConfigProperty(modelQualityJobOutputConfig))

    /**
     * @param networkConfig Specifies the network configuration for the monitoring job.
     */
    override fun networkConfig(networkConfig: IResolvable) {
      cdkBuilder.networkConfig(networkConfig.let(IResolvable::unwrap))
    }

    /**
     * @param networkConfig Specifies the network configuration for the monitoring job.
     */
    override fun networkConfig(networkConfig: CfnModelQualityJobDefinition.NetworkConfigProperty) {
      cdkBuilder.networkConfig(networkConfig.let(CfnModelQualityJobDefinition.NetworkConfigProperty::unwrap))
    }

    /**
     * @param networkConfig Specifies the network configuration for the monitoring job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff488dbfc36b03ba810ad46a87af48ebbac1550381d0308a2d35268ba18c8c56")
    override
        fun networkConfig(networkConfig: CfnModelQualityJobDefinition.NetworkConfigProperty.Builder.() -> Unit):
        Unit = networkConfig(CfnModelQualityJobDefinition.NetworkConfigProperty(networkConfig))

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
      cdkBuilder.stoppingCondition(stoppingCondition.let(IResolvable::unwrap))
    }

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping.
     */
    override
        fun stoppingCondition(stoppingCondition: CfnModelQualityJobDefinition.StoppingConditionProperty) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(CfnModelQualityJobDefinition.StoppingConditionProperty::unwrap))
    }

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("779329dee6ab5e514166eb104df196aedad1aa20865464018baea43cb8e2465f")
    override
        fun stoppingCondition(stoppingCondition: CfnModelQualityJobDefinition.StoppingConditionProperty.Builder.() -> Unit):
        Unit =
        stoppingCondition(CfnModelQualityJobDefinition.StoppingConditionProperty(stoppingCondition))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps,
  ) : CdkObject(cdkObject), CfnModelQualityJobDefinitionProps {
    /**
     * The name of the endpoint used to run the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-endpointname)
     */
    override fun endpointName(): String? = unwrap(this).getEndpointName()

    /**
     * The name of the monitoring job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-jobdefinitionname)
     */
    override fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-jobresources)
     */
    override fun jobResources(): Any = unwrap(this).getJobResources()

    /**
     * Container image configuration object for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityappspecification)
     */
    override fun modelQualityAppSpecification(): Any =
        unwrap(this).getModelQualityAppSpecification()

    /**
     * Specifies the constraints and baselines for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualitybaselineconfig)
     */
    override fun modelQualityBaselineConfig(): Any? = unwrap(this).getModelQualityBaselineConfig()

    /**
     * A list of the inputs that are monitored.
     *
     * Currently endpoints are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjobinput)
     */
    override fun modelQualityJobInput(): Any = unwrap(this).getModelQualityJobInput()

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-modelqualityjoboutputconfig)
     */
    override fun modelQualityJobOutputConfig(): Any = unwrap(this).getModelQualityJobOutputConfig()

    /**
     * Specifies the network configuration for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-networkconfig)
     */
    override fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform
     * tasks on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-stoppingcondition)
     */
    override fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html#cfn-sagemaker-modelqualityjobdefinition-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModelQualityJobDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps):
        CfnModelQualityJobDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModelQualityJobDefinitionProps):
        software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps
  }
}
