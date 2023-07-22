@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datapipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datapipeline.CfnPipeline

/**
 * A list of arbitrary tags (key-value pairs) to associate with the pipeline, which you can use to
 * control permissions.
 *
 * For more information, see [Controlling Access to Pipelines and
 * Resources](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html) in
 * the *AWS Data Pipeline Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datapipeline.*;
 * PipelineTagProperty pipelineTagProperty = PipelineTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelinetag.html)
 */
@CdkDslMarker
public class CfnPipelinePipelineTagPropertyDsl {
  private val cdkBuilder: CfnPipeline.PipelineTagProperty.Builder =
      CfnPipeline.PipelineTagProperty.builder()

  /**
   * @param key The key name of a tag. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value to associate with the key name. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnPipeline.PipelineTagProperty = cdkBuilder.build()
}
