@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnMitigationAction

/**
 * Parameters to define a mitigation action that publishes findings to Amazon SNS.
 *
 * You can implement your own custom actions in response to the Amazon SNS messages.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * PublishFindingToSnsParamsProperty publishFindingToSnsParamsProperty =
 * PublishFindingToSnsParamsProperty.builder()
 * .topicArn("topicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-publishfindingtosnsparams.html)
 */
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
