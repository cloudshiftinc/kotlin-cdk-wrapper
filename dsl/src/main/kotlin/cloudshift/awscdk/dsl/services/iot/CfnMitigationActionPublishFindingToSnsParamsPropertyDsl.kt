@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnMitigationAction

@CdkDslMarker
public class CfnMitigationActionPublishFindingToSnsParamsPropertyDsl {
  private val cdkBuilder: CfnMitigationAction.PublishFindingToSnsParamsProperty.Builder =
      CfnMitigationAction.PublishFindingToSnsParamsProperty.builder()

  /**
   * @param topicArn The ARN of the topic to which you want to publish the findings. 
   */
  public fun topicArn(topicArn: String) {
    cdkBuilder.topicArn(topicArn)
  }

  public fun build(): CfnMitigationAction.PublishFindingToSnsParamsProperty = cdkBuilder.build()
}
