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

  public fun endpointName(endpointName: String) {
    cdkBuilder.endpointName(endpointName)
  }

  public fun jobDefinitionName(jobDefinitionName: String) {
    cdkBuilder.jobDefinitionName(jobDefinitionName)
  }

  public fun jobResources(jobResources: IResolvable) {
    cdkBuilder.jobResources(jobResources)
  }

  public
      fun jobResources(jobResources: CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty) {
    cdkBuilder.jobResources(jobResources)
  }

  public fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: IResolvable) {
    cdkBuilder.modelExplainabilityAppSpecification(modelExplainabilityAppSpecification)
  }

  public
      fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty) {
    cdkBuilder.modelExplainabilityAppSpecification(modelExplainabilityAppSpecification)
  }

  public fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: IResolvable) {
    cdkBuilder.modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig)
  }

  public
      fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty) {
    cdkBuilder.modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig)
  }

  public fun modelExplainabilityJobInput(modelExplainabilityJobInput: IResolvable) {
    cdkBuilder.modelExplainabilityJobInput(modelExplainabilityJobInput)
  }

  public
      fun modelExplainabilityJobInput(modelExplainabilityJobInput: CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty) {
    cdkBuilder.modelExplainabilityJobInput(modelExplainabilityJobInput)
  }

  public fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: IResolvable) {
    cdkBuilder.modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig)
  }

  public
      fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty) {
    cdkBuilder.modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig)
  }

  public fun networkConfig(networkConfig: IResolvable) {
    cdkBuilder.networkConfig(networkConfig)
  }

  public
      fun networkConfig(networkConfig: CfnModelExplainabilityJobDefinition.NetworkConfigProperty) {
    cdkBuilder.networkConfig(networkConfig)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun stoppingCondition(stoppingCondition: IResolvable) {
    cdkBuilder.stoppingCondition(stoppingCondition)
  }

  public
      fun stoppingCondition(stoppingCondition: CfnModelExplainabilityJobDefinition.StoppingConditionProperty) {
    cdkBuilder.stoppingCondition(stoppingCondition)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnModelExplainabilityJobDefinitionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
