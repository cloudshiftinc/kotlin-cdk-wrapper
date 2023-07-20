@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps

@CdkDslMarker
public class CfnInferenceExperimentPropsDsl {
  private val cdkBuilder: CfnInferenceExperimentProps.Builder =
      CfnInferenceExperimentProps.builder()

  private val _modelVariants: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun dataStorageConfig(dataStorageConfig: IResolvable) {
    cdkBuilder.dataStorageConfig(dataStorageConfig)
  }

  public
      fun dataStorageConfig(dataStorageConfig: CfnInferenceExperiment.DataStorageConfigProperty) {
    cdkBuilder.dataStorageConfig(dataStorageConfig)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun desiredState(desiredState: String) {
    cdkBuilder.desiredState(desiredState)
  }

  public fun endpointName(endpointName: String) {
    cdkBuilder.endpointName(endpointName)
  }

  public fun kmsKey(kmsKey: String) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun modelVariants(vararg modelVariants: Any) {
    _modelVariants.addAll(listOf(*modelVariants))
  }

  public fun modelVariants(modelVariants: Collection<Any>) {
    _modelVariants.addAll(modelVariants)
  }

  public fun modelVariants(modelVariants: IResolvable) {
    cdkBuilder.modelVariants(modelVariants)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun schedule(schedule: IResolvable) {
    cdkBuilder.schedule(schedule)
  }

  public fun schedule(schedule: CfnInferenceExperiment.InferenceExperimentScheduleProperty) {
    cdkBuilder.schedule(schedule)
  }

  public fun shadowModeConfig(shadowModeConfig: IResolvable) {
    cdkBuilder.shadowModeConfig(shadowModeConfig)
  }

  public fun shadowModeConfig(shadowModeConfig: CfnInferenceExperiment.ShadowModeConfigProperty) {
    cdkBuilder.shadowModeConfig(shadowModeConfig)
  }

  public fun statusReason(statusReason: String) {
    cdkBuilder.statusReason(statusReason)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnInferenceExperimentProps {
    if(_modelVariants.isNotEmpty()) cdkBuilder.modelVariants(_modelVariants)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
