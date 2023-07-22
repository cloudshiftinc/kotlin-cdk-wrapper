@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * TopicSAMPTProperty topicSAMPTProperty = TopicSAMPTProperty.builder()
 * .topicName("topicName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-topicsampt.html)
 */
@CdkDslMarker
public class CfnFunctionTopicSAMPTPropertyDsl {
  private val cdkBuilder: CfnFunction.TopicSAMPTProperty.Builder =
      CfnFunction.TopicSAMPTProperty.builder()

  /**
   * @param topicName the value to be set. 
   */
  public fun topicName(topicName: String) {
    cdkBuilder.topicName(topicName)
  }

  public fun build(): CfnFunction.TopicSAMPTProperty = cdkBuilder.build()
}
