@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps

/**
 * Properties for defining a `CfnDataQualityJobDefinition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
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
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .build())
 * .endpointInput(EndpointInputProperty.builder()
 * .endpointName("endpointName")
 * .localPath("localPath")
 * // the properties below are optional
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
@CdkDslMarker
public class CfnDataQualityJobDefinitionPropsDsl {
  private val cdkBuilder: CfnDataQualityJobDefinitionProps.Builder =
      CfnDataQualityJobDefinitionProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param dataQualityAppSpecification Specifies the container that runs the monitoring job. 
   */
  public fun dataQualityAppSpecification(dataQualityAppSpecification: IResolvable) {
    cdkBuilder.dataQualityAppSpecification(dataQualityAppSpecification)
  }

  /**
   * @param dataQualityAppSpecification Specifies the container that runs the monitoring job. 
   */
  public
      fun dataQualityAppSpecification(dataQualityAppSpecification: CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty) {
    cdkBuilder.dataQualityAppSpecification(dataQualityAppSpecification)
  }

  /**
   * @param dataQualityBaselineConfig Configures the constraints and baselines for the monitoring
   * job.
   */
  public fun dataQualityBaselineConfig(dataQualityBaselineConfig: IResolvable) {
    cdkBuilder.dataQualityBaselineConfig(dataQualityBaselineConfig)
  }

  /**
   * @param dataQualityBaselineConfig Configures the constraints and baselines for the monitoring
   * job.
   */
  public
      fun dataQualityBaselineConfig(dataQualityBaselineConfig: CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty) {
    cdkBuilder.dataQualityBaselineConfig(dataQualityBaselineConfig)
  }

  /**
   * @param dataQualityJobInput A list of inputs for the monitoring job. 
   * Currently endpoints are supported as monitoring inputs.
   */
  public fun dataQualityJobInput(dataQualityJobInput: IResolvable) {
    cdkBuilder.dataQualityJobInput(dataQualityJobInput)
  }

  /**
   * @param dataQualityJobInput A list of inputs for the monitoring job. 
   * Currently endpoints are supported as monitoring inputs.
   */
  public
      fun dataQualityJobInput(dataQualityJobInput: CfnDataQualityJobDefinition.DataQualityJobInputProperty) {
    cdkBuilder.dataQualityJobInput(dataQualityJobInput)
  }

  /**
   * @param dataQualityJobOutputConfig The output configuration for monitoring jobs. 
   */
  public fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: IResolvable) {
    cdkBuilder.dataQualityJobOutputConfig(dataQualityJobOutputConfig)
  }

  /**
   * @param dataQualityJobOutputConfig The output configuration for monitoring jobs. 
   */
  public
      fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: CfnDataQualityJobDefinition.MonitoringOutputConfigProperty) {
    cdkBuilder.dataQualityJobOutputConfig(dataQualityJobOutputConfig)
  }

  /**
   * @param endpointName The name of the endpoint used to run the monitoring job.
   */
  public fun endpointName(endpointName: String) {
    cdkBuilder.endpointName(endpointName)
  }

  /**
   * @param jobDefinitionName The name for the monitoring job definition.
   */
  public fun jobDefinitionName(jobDefinitionName: String) {
    cdkBuilder.jobDefinitionName(jobDefinitionName)
  }

  /**
   * @param jobResources Identifies the resources to deploy for a monitoring job. 
   */
  public fun jobResources(jobResources: IResolvable) {
    cdkBuilder.jobResources(jobResources)
  }

  /**
   * @param jobResources Identifies the resources to deploy for a monitoring job. 
   */
  public fun jobResources(jobResources: CfnDataQualityJobDefinition.MonitoringResourcesProperty) {
    cdkBuilder.jobResources(jobResources)
  }

  /**
   * @param networkConfig Specifies networking configuration for the monitoring job.
   */
  public fun networkConfig(networkConfig: IResolvable) {
    cdkBuilder.networkConfig(networkConfig)
  }

  /**
   * @param networkConfig Specifies networking configuration for the monitoring job.
   */
  public fun networkConfig(networkConfig: CfnDataQualityJobDefinition.NetworkConfigProperty) {
    cdkBuilder.networkConfig(networkConfig)
  }

  /**
   * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume
   * to perform tasks on your behalf. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param stoppingCondition A time limit for how long the monitoring job is allowed to run before
   * stopping.
   */
  public fun stoppingCondition(stoppingCondition: IResolvable) {
    cdkBuilder.stoppingCondition(stoppingCondition)
  }

  /**
   * @param stoppingCondition A time limit for how long the monitoring job is allowed to run before
   * stopping.
   */
  public
      fun stoppingCondition(stoppingCondition: CfnDataQualityJobDefinition.StoppingConditionProperty) {
    cdkBuilder.stoppingCondition(stoppingCondition)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDataQualityJobDefinitionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
