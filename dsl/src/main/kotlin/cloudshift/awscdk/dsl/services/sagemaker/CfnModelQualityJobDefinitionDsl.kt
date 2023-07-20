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
import software.constructs.Construct

@CdkDslMarker
public class CfnModelQualityJobDefinitionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnModelQualityJobDefinition.Builder =
      CfnModelQualityJobDefinition.Builder.create(scope, id)

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

  public fun jobResources(jobResources: CfnModelQualityJobDefinition.MonitoringResourcesProperty) {
    cdkBuilder.jobResources(jobResources)
  }

  public fun modelQualityAppSpecification(modelQualityAppSpecification: IResolvable) {
    cdkBuilder.modelQualityAppSpecification(modelQualityAppSpecification)
  }

  public
      fun modelQualityAppSpecification(modelQualityAppSpecification: CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty) {
    cdkBuilder.modelQualityAppSpecification(modelQualityAppSpecification)
  }

  public fun modelQualityBaselineConfig(modelQualityBaselineConfig: IResolvable) {
    cdkBuilder.modelQualityBaselineConfig(modelQualityBaselineConfig)
  }

  public
      fun modelQualityBaselineConfig(modelQualityBaselineConfig: CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty) {
    cdkBuilder.modelQualityBaselineConfig(modelQualityBaselineConfig)
  }

  public fun modelQualityJobInput(modelQualityJobInput: IResolvable) {
    cdkBuilder.modelQualityJobInput(modelQualityJobInput)
  }

  public
      fun modelQualityJobInput(modelQualityJobInput: CfnModelQualityJobDefinition.ModelQualityJobInputProperty) {
    cdkBuilder.modelQualityJobInput(modelQualityJobInput)
  }

  public fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: IResolvable) {
    cdkBuilder.modelQualityJobOutputConfig(modelQualityJobOutputConfig)
  }

  public
      fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: CfnModelQualityJobDefinition.MonitoringOutputConfigProperty) {
    cdkBuilder.modelQualityJobOutputConfig(modelQualityJobOutputConfig)
  }

  public fun networkConfig(networkConfig: IResolvable) {
    cdkBuilder.networkConfig(networkConfig)
  }

  public fun networkConfig(networkConfig: CfnModelQualityJobDefinition.NetworkConfigProperty) {
    cdkBuilder.networkConfig(networkConfig)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun stoppingCondition(stoppingCondition: IResolvable) {
    cdkBuilder.stoppingCondition(stoppingCondition)
  }

  public
      fun stoppingCondition(stoppingCondition: CfnModelQualityJobDefinition.StoppingConditionProperty) {
    cdkBuilder.stoppingCondition(stoppingCondition)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnModelQualityJobDefinition {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
