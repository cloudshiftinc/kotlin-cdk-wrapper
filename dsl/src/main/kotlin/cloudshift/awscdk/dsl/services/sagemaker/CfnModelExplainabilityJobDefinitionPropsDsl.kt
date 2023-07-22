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
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps

@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionPropsDsl {
  private val cdkBuilder: CfnModelExplainabilityJobDefinitionProps.Builder =
      CfnModelExplainabilityJobDefinitionProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param endpointName The name of the endpoint used to run the monitoring job.
   */
  public fun endpointName(endpointName: String) {
    cdkBuilder.endpointName(endpointName)
  }

  /**
   * @param jobDefinitionName The name of the model explainability job definition.
   * The name must be unique within an AWS Region in the AWS account.
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
  public
      fun jobResources(jobResources: CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty) {
    cdkBuilder.jobResources(jobResources)
  }

  /**
   * @param modelExplainabilityAppSpecification Configures the model explainability job to run a
   * specified Docker container image. 
   */
  public fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: IResolvable) {
    cdkBuilder.modelExplainabilityAppSpecification(modelExplainabilityAppSpecification)
  }

  /**
   * @param modelExplainabilityAppSpecification Configures the model explainability job to run a
   * specified Docker container image. 
   */
  public
      fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty) {
    cdkBuilder.modelExplainabilityAppSpecification(modelExplainabilityAppSpecification)
  }

  /**
   * @param modelExplainabilityBaselineConfig The baseline configuration for a model explainability
   * job.
   */
  public fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: IResolvable) {
    cdkBuilder.modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig)
  }

  /**
   * @param modelExplainabilityBaselineConfig The baseline configuration for a model explainability
   * job.
   */
  public
      fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty) {
    cdkBuilder.modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig)
  }

  /**
   * @param modelExplainabilityJobInput Inputs for the model explainability job. 
   */
  public fun modelExplainabilityJobInput(modelExplainabilityJobInput: IResolvable) {
    cdkBuilder.modelExplainabilityJobInput(modelExplainabilityJobInput)
  }

  /**
   * @param modelExplainabilityJobInput Inputs for the model explainability job. 
   */
  public
      fun modelExplainabilityJobInput(modelExplainabilityJobInput: CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty) {
    cdkBuilder.modelExplainabilityJobInput(modelExplainabilityJobInput)
  }

  /**
   * @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs. 
   */
  public fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: IResolvable) {
    cdkBuilder.modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig)
  }

  /**
   * @param modelExplainabilityJobOutputConfig The output configuration for monitoring jobs. 
   */
  public
      fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty) {
    cdkBuilder.modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig)
  }

  /**
   * @param networkConfig Networking options for a model explainability job.
   */
  public fun networkConfig(networkConfig: IResolvable) {
    cdkBuilder.networkConfig(networkConfig)
  }

  /**
   * @param networkConfig Networking options for a model explainability job.
   */
  public
      fun networkConfig(networkConfig: CfnModelExplainabilityJobDefinition.NetworkConfigProperty) {
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
      fun stoppingCondition(stoppingCondition: CfnModelExplainabilityJobDefinition.StoppingConditionProperty) {
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

  public fun build(): CfnModelExplainabilityJobDefinitionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
