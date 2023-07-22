@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnPipelineProps

@CdkDslMarker
public class CfnPipelinePropsDsl {
  private val cdkBuilder: CfnPipelineProps.Builder = CfnPipelineProps.builder()

  private val _pipelineActivities: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param pipelineActivities A list of "PipelineActivity" objects. 
   * Activities perform transformations on your messages, such as removing, renaming or adding
   * message attributes; filtering messages based on attribute values; invoking your Lambda functions
   * on messages for advanced processing; or performing mathematical transformations to normalize
   * device data.
   *
   * The list can be 2-25 *PipelineActivity* objects and must contain both a `channel` and a
   * `datastore` activity. Each entry in the list must contain only one activity, for example:
   *
   * `pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]`
   */
  public fun pipelineActivities(vararg pipelineActivities: Any) {
    _pipelineActivities.addAll(listOf(*pipelineActivities))
  }

  /**
   * @param pipelineActivities A list of "PipelineActivity" objects. 
   * Activities perform transformations on your messages, such as removing, renaming or adding
   * message attributes; filtering messages based on attribute values; invoking your Lambda functions
   * on messages for advanced processing; or performing mathematical transformations to normalize
   * device data.
   *
   * The list can be 2-25 *PipelineActivity* objects and must contain both a `channel` and a
   * `datastore` activity. Each entry in the list must contain only one activity, for example:
   *
   * `pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]`
   */
  public fun pipelineActivities(pipelineActivities: Collection<Any>) {
    _pipelineActivities.addAll(pipelineActivities)
  }

  /**
   * @param pipelineActivities A list of "PipelineActivity" objects. 
   * Activities perform transformations on your messages, such as removing, renaming or adding
   * message attributes; filtering messages based on attribute values; invoking your Lambda functions
   * on messages for advanced processing; or performing mathematical transformations to normalize
   * device data.
   *
   * The list can be 2-25 *PipelineActivity* objects and must contain both a `channel` and a
   * `datastore` activity. Each entry in the list must contain only one activity, for example:
   *
   * `pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]`
   */
  public fun pipelineActivities(pipelineActivities: IResolvable) {
    cdkBuilder.pipelineActivities(pipelineActivities)
  }

  /**
   * @param pipelineName The name of the pipeline.
   */
  public fun pipelineName(pipelineName: String) {
    cdkBuilder.pipelineName(pipelineName)
  }

  /**
   * @param tags Metadata which can be used to manage the pipeline.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Metadata which can be used to manage the pipeline.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPipelineProps {
    if(_pipelineActivities.isNotEmpty()) cdkBuilder.pipelineActivities(_pipelineActivities)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
