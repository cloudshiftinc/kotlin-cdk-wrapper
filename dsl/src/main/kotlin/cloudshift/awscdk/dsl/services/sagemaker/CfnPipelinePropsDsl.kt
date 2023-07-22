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

  /**
   * @param parallelismConfiguration the value to be set.
   */
  public fun parallelismConfiguration(parallelismConfiguration: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parallelismConfiguration)
    cdkBuilder.parallelismConfiguration(builder.map)
  }

  /**
   * @param parallelismConfiguration the value to be set.
   */
  public fun parallelismConfiguration(parallelismConfiguration: Any) {
    cdkBuilder.parallelismConfiguration(parallelismConfiguration)
  }

  /**
   * @param pipelineDefinition The definition of the pipeline. 
   * This can be either a JSON string or an Amazon S3 location.
   */
  public fun pipelineDefinition(pipelineDefinition: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(pipelineDefinition)
    cdkBuilder.pipelineDefinition(builder.map)
  }

  /**
   * @param pipelineDefinition The definition of the pipeline. 
   * This can be either a JSON string or an Amazon S3 location.
   */
  public fun pipelineDefinition(pipelineDefinition: Any) {
    cdkBuilder.pipelineDefinition(pipelineDefinition)
  }

  /**
   * @param pipelineDescription The description of the pipeline.
   */
  public fun pipelineDescription(pipelineDescription: String) {
    cdkBuilder.pipelineDescription(pipelineDescription)
  }

  /**
   * @param pipelineDisplayName The display name of the pipeline.
   */
  public fun pipelineDisplayName(pipelineDisplayName: String) {
    cdkBuilder.pipelineDisplayName(pipelineDisplayName)
  }

  /**
   * @param pipelineName The name of the pipeline. 
   */
  public fun pipelineName(pipelineName: String) {
    cdkBuilder.pipelineName(pipelineName)
  }

  /**
   * @param roleArn The Amazon Resource Name (ARN) of the IAM role used to execute the pipeline. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param tags The tags of the pipeline.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags of the pipeline.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPipelineProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
