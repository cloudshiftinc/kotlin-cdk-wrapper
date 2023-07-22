@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnPipeline

/**
 * An activity that computes an arithmetic expression using the message's attributes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * MathProperty mathProperty = MathProperty.builder()
 * .attribute("attribute")
 * .math("math")
 * .name("name")
 * // the properties below are optional
 * .next("next")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html)
 */
@CdkDslMarker
public class CfnPipelineMathPropertyDsl {
  private val cdkBuilder: CfnPipeline.MathProperty.Builder = CfnPipeline.MathProperty.builder()

  /**
   * @param attribute The name of the attribute that contains the result of the math operation. 
   */
  public fun attribute(attribute: String) {
    cdkBuilder.attribute(attribute)
  }

  /**
   * @param math An expression that uses one or more existing attributes and must return an integer
   * value. 
   */
  public fun math(math: String) {
    cdkBuilder.math(math)
  }

  /**
   * @param name The name of the 'math' activity. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param next The next activity in the pipeline.
   */
  public fun next(next: String) {
    cdkBuilder.next(next)
  }

  public fun build(): CfnPipeline.MathProperty = cdkBuilder.build()
}
