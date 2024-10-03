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
 * Properties for defining a `CfnDataQualityJobDefinition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnDataQualityJobDefinitionProps cfnDataQualityJobDefinitionProps =
 * CfnDataQualityJobDefinitionProps.builder()
 * .dataQualityAppSpecification(DataQualityAppSpecificationProperty.builder()
 * .imageUri("imageUri")
 * // the properties below are optional
 * .containerArguments(List.of("containerArguments"))
 * .containerEntrypoint(List.of("containerEntrypoint"))
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .postAnalyticsProcessorSourceUri("postAnalyticsProcessorSourceUri")
 * .recordPreprocessorSourceUri("recordPreprocessorSourceUri")
 * .build())
 * .dataQualityJobInput(DataQualityJobInputProperty.builder()
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
 * .excludeFeaturesAttribute("excludeFeaturesAttribute")
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .build())
 * .endpointInput(EndpointInputProperty.builder()
 * .endpointName("endpointName")
 * .localPath("localPath")
 * // the properties below are optional
 * .excludeFeaturesAttribute("excludeFeaturesAttribute")
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .build())
 * .build())
 * .dataQualityJobOutputConfig(MonitoringOutputConfigProperty.builder()
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
 * .jobResources(MonitoringResourcesProperty.builder()
 * .clusterConfig(ClusterConfigProperty.builder()
 * .instanceCount(123)
 * .instanceType("instanceType")
 * .volumeSizeInGb(123)
 * // the properties below are optional
 * .volumeKmsKeyId("volumeKmsKeyId")
 * .build())
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .dataQualityBaselineConfig(DataQualityBaselineConfigProperty.builder()
 * .baseliningJobName("baseliningJobName")
 * .constraintsResource(ConstraintsResourceProperty.builder()
 * .s3Uri("s3Uri")
 * .build())
 * .statisticsResource(StatisticsResourceProperty.builder()
 * .s3Uri("s3Uri")
 * .build())
 * .build())
 * .endpointName("endpointName")
 * .jobDefinitionName("jobDefinitionName")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html)
 */
public interface CfnDataQualityJobDefinitionProps {
  /**
   * Specifies the container that runs the monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-dataqualityappspecification)
   */
  public fun dataQualityAppSpecification(): Any

  /**
   * Configures the constraints and baselines for the monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-dataqualitybaselineconfig)
   */
  public fun dataQualityBaselineConfig(): Any? = unwrap(this).getDataQualityBaselineConfig()

  /**
   * A list of inputs for the monitoring job.
   *
   * Currently endpoints are supported as monitoring inputs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-dataqualityjobinput)
   */
  public fun dataQualityJobInput(): Any

  /**
   * The output configuration for monitoring jobs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-dataqualityjoboutputconfig)
   */
  public fun dataQualityJobOutputConfig(): Any

  /**
   * The name of the endpoint used to run the monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-endpointname)
   */
  public fun endpointName(): String? = unwrap(this).getEndpointName()

  /**
   * The name for the monitoring job definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-jobdefinitionname)
   */
  public fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  /**
   * Identifies the resources to deploy for a monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-jobresources)
   */
  public fun jobResources(): Any

  /**
   * Specifies networking configuration for the monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-networkconfig)
   */
  public fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

  /**
   * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks
   * on your behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-rolearn)
   */
  public fun roleArn(): String

  /**
   * A time limit for how long the monitoring job is allowed to run before stopping.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-stoppingcondition)
   */
  public fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDataQualityJobDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataQualityAppSpecification Specifies the container that runs the monitoring job. 
     */
    public fun dataQualityAppSpecification(dataQualityAppSpecification: IResolvable)

    /**
     * @param dataQualityAppSpecification Specifies the container that runs the monitoring job. 
     */
    public
        fun dataQualityAppSpecification(dataQualityAppSpecification: CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty)

    /**
     * @param dataQualityAppSpecification Specifies the container that runs the monitoring job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f4abc724e1fe117a55882714939e3ffc8da49603e52854c162051e42a27d863")
    public
        fun dataQualityAppSpecification(dataQualityAppSpecification: CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty.Builder.() -> Unit)

    /**
     * @param dataQualityBaselineConfig Configures the constraints and baselines for the monitoring
     * job.
     */
    public fun dataQualityBaselineConfig(dataQualityBaselineConfig: IResolvable)

    /**
     * @param dataQualityBaselineConfig Configures the constraints and baselines for the monitoring
     * job.
     */
    public
        fun dataQualityBaselineConfig(dataQualityBaselineConfig: CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty)

    /**
     * @param dataQualityBaselineConfig Configures the constraints and baselines for the monitoring
     * job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42c492b24ef12546fe8040aac046abd5a6ed318a282e4c838c4af269774246c7")
    public
        fun dataQualityBaselineConfig(dataQualityBaselineConfig: CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty.Builder.() -> Unit)

    /**
     * @param dataQualityJobInput A list of inputs for the monitoring job. 
     * Currently endpoints are supported as monitoring inputs.
     */
    public fun dataQualityJobInput(dataQualityJobInput: IResolvable)

    /**
     * @param dataQualityJobInput A list of inputs for the monitoring job. 
     * Currently endpoints are supported as monitoring inputs.
     */
    public
        fun dataQualityJobInput(dataQualityJobInput: CfnDataQualityJobDefinition.DataQualityJobInputProperty)

    /**
     * @param dataQualityJobInput A list of inputs for the monitoring job. 
     * Currently endpoints are supported as monitoring inputs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c9e4fc2b1e0fd7add9964fbb003d68d0eb25f422532e38d96a127512f7923ca")
    public
        fun dataQualityJobInput(dataQualityJobInput: CfnDataQualityJobDefinition.DataQualityJobInputProperty.Builder.() -> Unit)

    /**
     * @param dataQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    public fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: IResolvable)

    /**
     * @param dataQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    public
        fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: CfnDataQualityJobDefinition.MonitoringOutputConfigProperty)

    /**
     * @param dataQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8784558b2640200913d38941fd8869de01d60b9b021220e7bd943de34b11eda5")
    public
        fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: CfnDataQualityJobDefinition.MonitoringOutputConfigProperty.Builder.() -> Unit)

    /**
     * @param endpointName The name of the endpoint used to run the monitoring job.
     */
    public fun endpointName(endpointName: String)

    /**
     * @param jobDefinitionName The name for the monitoring job definition.
     */
    public fun jobDefinitionName(jobDefinitionName: String)

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    public fun jobResources(jobResources: IResolvable)

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    public fun jobResources(jobResources: CfnDataQualityJobDefinition.MonitoringResourcesProperty)

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6309b4c61e50acd19f5dc6a57a37dbb0d8f984b7583d7712b4958e3d5d8d41c5")
    public
        fun jobResources(jobResources: CfnDataQualityJobDefinition.MonitoringResourcesProperty.Builder.() -> Unit)

    /**
     * @param networkConfig Specifies networking configuration for the monitoring job.
     */
    public fun networkConfig(networkConfig: IResolvable)

    /**
     * @param networkConfig Specifies networking configuration for the monitoring job.
     */
    public fun networkConfig(networkConfig: CfnDataQualityJobDefinition.NetworkConfigProperty)

    /**
     * @param networkConfig Specifies networking configuration for the monitoring job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf4c8ca2f7ead6305ef6e31d4a4dd1d7e64ec0285d096a7446b23c7159a1da9d")
    public
        fun networkConfig(networkConfig: CfnDataQualityJobDefinition.NetworkConfigProperty.Builder.() -> Unit)

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
        fun stoppingCondition(stoppingCondition: CfnDataQualityJobDefinition.StoppingConditionProperty)

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("226d37f05446f7edd77ca8bdba63599a52a16c0cb95dc05cadddf1cfb35d0a15")
    public
        fun stoppingCondition(stoppingCondition: CfnDataQualityJobDefinition.StoppingConditionProperty.Builder.() -> Unit)

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
        software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps.builder()

    /**
     * @param dataQualityAppSpecification Specifies the container that runs the monitoring job. 
     */
    override fun dataQualityAppSpecification(dataQualityAppSpecification: IResolvable) {
      cdkBuilder.dataQualityAppSpecification(dataQualityAppSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataQualityAppSpecification Specifies the container that runs the monitoring job. 
     */
    override
        fun dataQualityAppSpecification(dataQualityAppSpecification: CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty) {
      cdkBuilder.dataQualityAppSpecification(dataQualityAppSpecification.let(CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param dataQualityAppSpecification Specifies the container that runs the monitoring job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f4abc724e1fe117a55882714939e3ffc8da49603e52854c162051e42a27d863")
    override
        fun dataQualityAppSpecification(dataQualityAppSpecification: CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty.Builder.() -> Unit):
        Unit =
        dataQualityAppSpecification(CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty(dataQualityAppSpecification))

    /**
     * @param dataQualityBaselineConfig Configures the constraints and baselines for the monitoring
     * job.
     */
    override fun dataQualityBaselineConfig(dataQualityBaselineConfig: IResolvable) {
      cdkBuilder.dataQualityBaselineConfig(dataQualityBaselineConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataQualityBaselineConfig Configures the constraints and baselines for the monitoring
     * job.
     */
    override
        fun dataQualityBaselineConfig(dataQualityBaselineConfig: CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty) {
      cdkBuilder.dataQualityBaselineConfig(dataQualityBaselineConfig.let(CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty.Companion::unwrap))
    }

    /**
     * @param dataQualityBaselineConfig Configures the constraints and baselines for the monitoring
     * job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42c492b24ef12546fe8040aac046abd5a6ed318a282e4c838c4af269774246c7")
    override
        fun dataQualityBaselineConfig(dataQualityBaselineConfig: CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty.Builder.() -> Unit):
        Unit =
        dataQualityBaselineConfig(CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty(dataQualityBaselineConfig))

    /**
     * @param dataQualityJobInput A list of inputs for the monitoring job. 
     * Currently endpoints are supported as monitoring inputs.
     */
    override fun dataQualityJobInput(dataQualityJobInput: IResolvable) {
      cdkBuilder.dataQualityJobInput(dataQualityJobInput.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataQualityJobInput A list of inputs for the monitoring job. 
     * Currently endpoints are supported as monitoring inputs.
     */
    override
        fun dataQualityJobInput(dataQualityJobInput: CfnDataQualityJobDefinition.DataQualityJobInputProperty) {
      cdkBuilder.dataQualityJobInput(dataQualityJobInput.let(CfnDataQualityJobDefinition.DataQualityJobInputProperty.Companion::unwrap))
    }

    /**
     * @param dataQualityJobInput A list of inputs for the monitoring job. 
     * Currently endpoints are supported as monitoring inputs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c9e4fc2b1e0fd7add9964fbb003d68d0eb25f422532e38d96a127512f7923ca")
    override
        fun dataQualityJobInput(dataQualityJobInput: CfnDataQualityJobDefinition.DataQualityJobInputProperty.Builder.() -> Unit):
        Unit =
        dataQualityJobInput(CfnDataQualityJobDefinition.DataQualityJobInputProperty(dataQualityJobInput))

    /**
     * @param dataQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    override fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: IResolvable) {
      cdkBuilder.dataQualityJobOutputConfig(dataQualityJobOutputConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    override
        fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: CfnDataQualityJobDefinition.MonitoringOutputConfigProperty) {
      cdkBuilder.dataQualityJobOutputConfig(dataQualityJobOutputConfig.let(CfnDataQualityJobDefinition.MonitoringOutputConfigProperty.Companion::unwrap))
    }

    /**
     * @param dataQualityJobOutputConfig The output configuration for monitoring jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8784558b2640200913d38941fd8869de01d60b9b021220e7bd943de34b11eda5")
    override
        fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: CfnDataQualityJobDefinition.MonitoringOutputConfigProperty.Builder.() -> Unit):
        Unit =
        dataQualityJobOutputConfig(CfnDataQualityJobDefinition.MonitoringOutputConfigProperty(dataQualityJobOutputConfig))

    /**
     * @param endpointName The name of the endpoint used to run the monitoring job.
     */
    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    /**
     * @param jobDefinitionName The name for the monitoring job definition.
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
        fun jobResources(jobResources: CfnDataQualityJobDefinition.MonitoringResourcesProperty) {
      cdkBuilder.jobResources(jobResources.let(CfnDataQualityJobDefinition.MonitoringResourcesProperty.Companion::unwrap))
    }

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6309b4c61e50acd19f5dc6a57a37dbb0d8f984b7583d7712b4958e3d5d8d41c5")
    override
        fun jobResources(jobResources: CfnDataQualityJobDefinition.MonitoringResourcesProperty.Builder.() -> Unit):
        Unit = jobResources(CfnDataQualityJobDefinition.MonitoringResourcesProperty(jobResources))

    /**
     * @param networkConfig Specifies networking configuration for the monitoring job.
     */
    override fun networkConfig(networkConfig: IResolvable) {
      cdkBuilder.networkConfig(networkConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param networkConfig Specifies networking configuration for the monitoring job.
     */
    override fun networkConfig(networkConfig: CfnDataQualityJobDefinition.NetworkConfigProperty) {
      cdkBuilder.networkConfig(networkConfig.let(CfnDataQualityJobDefinition.NetworkConfigProperty.Companion::unwrap))
    }

    /**
     * @param networkConfig Specifies networking configuration for the monitoring job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf4c8ca2f7ead6305ef6e31d4a4dd1d7e64ec0285d096a7446b23c7159a1da9d")
    override
        fun networkConfig(networkConfig: CfnDataQualityJobDefinition.NetworkConfigProperty.Builder.() -> Unit):
        Unit = networkConfig(CfnDataQualityJobDefinition.NetworkConfigProperty(networkConfig))

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
        fun stoppingCondition(stoppingCondition: CfnDataQualityJobDefinition.StoppingConditionProperty) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(CfnDataQualityJobDefinition.StoppingConditionProperty.Companion::unwrap))
    }

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("226d37f05446f7edd77ca8bdba63599a52a16c0cb95dc05cadddf1cfb35d0a15")
    override
        fun stoppingCondition(stoppingCondition: CfnDataQualityJobDefinition.StoppingConditionProperty.Builder.() -> Unit):
        Unit =
        stoppingCondition(CfnDataQualityJobDefinition.StoppingConditionProperty(stoppingCondition))

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

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps,
  ) : CdkObject(cdkObject),
      CfnDataQualityJobDefinitionProps {
    /**
     * Specifies the container that runs the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-dataqualityappspecification)
     */
    override fun dataQualityAppSpecification(): Any = unwrap(this).getDataQualityAppSpecification()

    /**
     * Configures the constraints and baselines for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-dataqualitybaselineconfig)
     */
    override fun dataQualityBaselineConfig(): Any? = unwrap(this).getDataQualityBaselineConfig()

    /**
     * A list of inputs for the monitoring job.
     *
     * Currently endpoints are supported as monitoring inputs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-dataqualityjobinput)
     */
    override fun dataQualityJobInput(): Any = unwrap(this).getDataQualityJobInput()

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-dataqualityjoboutputconfig)
     */
    override fun dataQualityJobOutputConfig(): Any = unwrap(this).getDataQualityJobOutputConfig()

    /**
     * The name of the endpoint used to run the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-endpointname)
     */
    override fun endpointName(): String? = unwrap(this).getEndpointName()

    /**
     * The name for the monitoring job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-jobdefinitionname)
     */
    override fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-jobresources)
     */
    override fun jobResources(): Any = unwrap(this).getJobResources()

    /**
     * Specifies networking configuration for the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-networkconfig)
     */
    override fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform
     * tasks on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-stoppingcondition)
     */
    override fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html#cfn-sagemaker-dataqualityjobdefinition-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataQualityJobDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps):
        CfnDataQualityJobDefinitionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnDataQualityJobDefinitionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataQualityJobDefinitionProps):
        software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps
  }
}
