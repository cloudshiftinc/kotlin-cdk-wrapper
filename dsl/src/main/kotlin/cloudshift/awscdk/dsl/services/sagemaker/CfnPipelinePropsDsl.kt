@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.sagemaker.CfnPipelineProps

@CdkDslMarker
public class CfnPipelinePropsDsl {
  private val cdkBuilder: CfnPipelineProps.Builder = CfnPipelineProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun parallelismConfiguration(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.parallelismConfiguration(builder.map)
  }

  public fun parallelismConfiguration(parallelismConfiguration: Any) {
    cdkBuilder.parallelismConfiguration(parallelismConfiguration)
  }

  public fun pipelineDefinition(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.pipelineDefinition(builder.map)
  }

  public fun pipelineDefinition(pipelineDefinition: Any) {
    cdkBuilder.pipelineDefinition(pipelineDefinition)
  }

  public fun pipelineDescription(pipelineDescription: String) {
    cdkBuilder.pipelineDescription(pipelineDescription)
  }

  public fun pipelineDisplayName(pipelineDisplayName: String) {
    cdkBuilder.pipelineDisplayName(pipelineDisplayName)
  }

  public fun pipelineName(pipelineName: String) {
    cdkBuilder.pipelineName(pipelineName)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPipelineProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
