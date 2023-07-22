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
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition
import software.constructs.Construct

/**
 * Creates the definition for a model bias job.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
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
@CdkDslMarker
public class CfnModelBiasJobDefinitionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnModelBiasJobDefinition.Builder =
      CfnModelBiasJobDefinition.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The name of the endpoint used to run the monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-endpointname)
   * @param endpointName The name of the endpoint used to run the monitoring job. 
   */
  public fun endpointName(endpointName: String) {
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
  public fun jobDefinitionName(jobDefinitionName: String) {
    cdkBuilder.jobDefinitionName(jobDefinitionName)
  }

  /**
   * Identifies the resources to deploy for a monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-jobresources)
   * @param jobResources Identifies the resources to deploy for a monitoring job. 
   */
  public fun jobResources(jobResources: IResolvable) {
    cdkBuilder.jobResources(jobResources)
  }

  /**
   * Identifies the resources to deploy for a monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-jobresources)
   * @param jobResources Identifies the resources to deploy for a monitoring job. 
   */
  public fun jobResources(jobResources: CfnModelBiasJobDefinition.MonitoringResourcesProperty) {
    cdkBuilder.jobResources(jobResources)
  }

  /**
   * Configures the model bias job to run a specified Docker container image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasappspecification)
   * @param modelBiasAppSpecification Configures the model bias job to run a specified Docker
   * container image. 
   */
  public fun modelBiasAppSpecification(modelBiasAppSpecification: IResolvable) {
    cdkBuilder.modelBiasAppSpecification(modelBiasAppSpecification)
  }

  /**
   * Configures the model bias job to run a specified Docker container image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasappspecification)
   * @param modelBiasAppSpecification Configures the model bias job to run a specified Docker
   * container image. 
   */
  public
      fun modelBiasAppSpecification(modelBiasAppSpecification: CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty) {
    cdkBuilder.modelBiasAppSpecification(modelBiasAppSpecification)
  }

  /**
   * The baseline configuration for a model bias job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig)
   * @param modelBiasBaselineConfig The baseline configuration for a model bias job. 
   */
  public fun modelBiasBaselineConfig(modelBiasBaselineConfig: IResolvable) {
    cdkBuilder.modelBiasBaselineConfig(modelBiasBaselineConfig)
  }

  /**
   * The baseline configuration for a model bias job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig)
   * @param modelBiasBaselineConfig The baseline configuration for a model bias job. 
   */
  public
      fun modelBiasBaselineConfig(modelBiasBaselineConfig: CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty) {
    cdkBuilder.modelBiasBaselineConfig(modelBiasBaselineConfig)
  }

  /**
   * Inputs for the model bias job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjobinput)
   * @param modelBiasJobInput Inputs for the model bias job. 
   */
  public fun modelBiasJobInput(modelBiasJobInput: IResolvable) {
    cdkBuilder.modelBiasJobInput(modelBiasJobInput)
  }

  /**
   * Inputs for the model bias job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjobinput)
   * @param modelBiasJobInput Inputs for the model bias job. 
   */
  public
      fun modelBiasJobInput(modelBiasJobInput: CfnModelBiasJobDefinition.ModelBiasJobInputProperty) {
    cdkBuilder.modelBiasJobInput(modelBiasJobInput)
  }

  /**
   * The output configuration for monitoring jobs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjoboutputconfig)
   * @param modelBiasJobOutputConfig The output configuration for monitoring jobs. 
   */
  public fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: IResolvable) {
    cdkBuilder.modelBiasJobOutputConfig(modelBiasJobOutputConfig)
  }

  /**
   * The output configuration for monitoring jobs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjoboutputconfig)
   * @param modelBiasJobOutputConfig The output configuration for monitoring jobs. 
   */
  public
      fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: CfnModelBiasJobDefinition.MonitoringOutputConfigProperty) {
    cdkBuilder.modelBiasJobOutputConfig(modelBiasJobOutputConfig)
  }

  /**
   * Networking options for a model bias job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-networkconfig)
   * @param networkConfig Networking options for a model bias job. 
   */
  public fun networkConfig(networkConfig: IResolvable) {
    cdkBuilder.networkConfig(networkConfig)
  }

  /**
   * Networking options for a model bias job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-networkconfig)
   * @param networkConfig Networking options for a model bias job. 
   */
  public fun networkConfig(networkConfig: CfnModelBiasJobDefinition.NetworkConfigProperty) {
    cdkBuilder.networkConfig(networkConfig)
  }

  /**
   * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks
   * on your behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-rolearn)
   * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume
   * to perform tasks on your behalf. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * A time limit for how long the monitoring job is allowed to run before stopping.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-stoppingcondition)
   * @param stoppingCondition A time limit for how long the monitoring job is allowed to run before
   * stopping. 
   */
  public fun stoppingCondition(stoppingCondition: IResolvable) {
    cdkBuilder.stoppingCondition(stoppingCondition)
  }

  /**
   * A time limit for how long the monitoring job is allowed to run before stopping.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-stoppingcondition)
   * @param stoppingCondition A time limit for how long the monitoring job is allowed to run before
   * stopping. 
   */
  public
      fun stoppingCondition(stoppingCondition: CfnModelBiasJobDefinition.StoppingConditionProperty) {
    cdkBuilder.stoppingCondition(stoppingCondition)
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
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
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
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnModelBiasJobDefinition {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
