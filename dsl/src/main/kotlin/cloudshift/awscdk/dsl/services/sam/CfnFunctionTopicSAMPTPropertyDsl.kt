@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

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
