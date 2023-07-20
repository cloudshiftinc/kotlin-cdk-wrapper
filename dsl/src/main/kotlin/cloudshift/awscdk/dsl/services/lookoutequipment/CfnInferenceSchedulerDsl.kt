@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutequipment

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler
import software.constructs.Construct

@CdkDslMarker
public class CfnInferenceSchedulerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnInferenceScheduler.Builder =
      CfnInferenceScheduler.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun dataDelayOffsetInMinutes(dataDelayOffsetInMinutes: Number) {
    cdkBuilder.dataDelayOffsetInMinutes(dataDelayOffsetInMinutes)
  }

  public fun dataInputConfiguration(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.dataInputConfiguration(builder.map)
  }

  public fun dataInputConfiguration(dataInputConfiguration: Any) {
    cdkBuilder.dataInputConfiguration(dataInputConfiguration)
  }

  public fun dataOutputConfiguration(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.dataOutputConfiguration(builder.map)
  }

  public fun dataOutputConfiguration(dataOutputConfiguration: Any) {
    cdkBuilder.dataOutputConfiguration(dataOutputConfiguration)
  }

  public fun dataUploadFrequency(dataUploadFrequency: String) {
    cdkBuilder.dataUploadFrequency(dataUploadFrequency)
  }

  public fun inferenceSchedulerName(inferenceSchedulerName: String) {
    cdkBuilder.inferenceSchedulerName(inferenceSchedulerName)
  }

  public fun modelName(modelName: String) {
    cdkBuilder.modelName(modelName)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun serverSideKmsKeyId(serverSideKmsKeyId: String) {
    cdkBuilder.serverSideKmsKeyId(serverSideKmsKeyId)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnInferenceScheduler {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
