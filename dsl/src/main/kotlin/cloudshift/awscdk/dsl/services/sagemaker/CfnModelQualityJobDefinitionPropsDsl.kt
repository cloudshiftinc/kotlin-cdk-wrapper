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
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps

@CdkDslMarker
public class CfnModelQualityJobDefinitionPropsDsl {
  private val cdkBuilder: CfnModelQualityJobDefinitionProps.Builder =
      CfnModelQualityJobDefinitionProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param endpointName The name of the endpoint used to run the monitoring job.
   */
  public fun endpointName(endpointName: String) {
    cdkBuilder.endpointName(endpointName)
  }

  /**
   * @param jobDefinitionName The name of the monitoring job definition.
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
  public fun jobResources(jobResources: CfnModelQualityJobDefinition.MonitoringResourcesProperty) {
    cdkBuilder.jobResources(jobResources)
  }

  /**
   * @param modelQualityAppSpecification Container image configuration object for the monitoring
   * job. 
   */
  public fun modelQualityAppSpecification(modelQualityAppSpecification: IResolvable) {
    cdkBuilder.modelQualityAppSpecification(modelQualityAppSpecification)
  }

  /**
   * @param modelQualityAppSpecification Container image configuration object for the monitoring
   * job. 
   */
  public
      fun modelQualityAppSpecification(modelQualityAppSpecification: CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty) {
    cdkBuilder.modelQualityAppSpecification(modelQualityAppSpecification)
  }

  /**
   * @param modelQualityBaselineConfig Specifies the constraints and baselines for the monitoring
   * job.
   */
  public fun modelQualityBaselineConfig(modelQualityBaselineConfig: IResolvable) {
    cdkBuilder.modelQualityBaselineConfig(modelQualityBaselineConfig)
  }

  /**
   * @param modelQualityBaselineConfig Specifies the constraints and baselines for the monitoring
   * job.
   */
  public
      fun modelQualityBaselineConfig(modelQualityBaselineConfig: CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty) {
    cdkBuilder.modelQualityBaselineConfig(modelQualityBaselineConfig)
  }

  /**
   * @param modelQualityJobInput A list of the inputs that are monitored. 
   * Currently endpoints are supported.
   */
  public fun modelQualityJobInput(modelQualityJobInput: IResolvable) {
    cdkBuilder.modelQualityJobInput(modelQualityJobInput)
  }

  /**
   * @param modelQualityJobInput A list of the inputs that are monitored. 
   * Currently endpoints are supported.
   */
  public
      fun modelQualityJobInput(modelQualityJobInput: CfnModelQualityJobDefinition.ModelQualityJobInputProperty) {
    cdkBuilder.modelQualityJobInput(modelQualityJobInput)
  }

  /**
   * @param modelQualityJobOutputConfig The output configuration for monitoring jobs. 
   */
  public fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: IResolvable) {
    cdkBuilder.modelQualityJobOutputConfig(modelQualityJobOutputConfig)
  }

  /**
   * @param modelQualityJobOutputConfig The output configuration for monitoring jobs. 
   */
  public
      fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: CfnModelQualityJobDefinition.MonitoringOutputConfigProperty) {
    cdkBuilder.modelQualityJobOutputConfig(modelQualityJobOutputConfig)
  }

  /**
   * @param networkConfig Specifies the network configuration for the monitoring job.
   */
  public fun networkConfig(networkConfig: IResolvable) {
    cdkBuilder.networkConfig(networkConfig)
  }

  /**
   * @param networkConfig Specifies the network configuration for the monitoring job.
   */
  public fun networkConfig(networkConfig: CfnModelQualityJobDefinition.NetworkConfigProperty) {
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
      fun stoppingCondition(stoppingCondition: CfnModelQualityJobDefinition.StoppingConditionProperty) {
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

  public fun build(): CfnModelQualityJobDefinitionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
