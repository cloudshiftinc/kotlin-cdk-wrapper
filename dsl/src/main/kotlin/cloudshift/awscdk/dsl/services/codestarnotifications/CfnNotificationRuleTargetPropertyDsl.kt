@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestarnotifications

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule

@CdkDslMarker
public class CfnNotificationRuleTargetPropertyDsl {
  private val cdkBuilder: CfnNotificationRule.TargetProperty.Builder =
      CfnNotificationRule.TargetProperty.builder()

  /**
   * @param targetAddress The Amazon Resource Name (ARN) of the AWS Chatbot topic or AWS Chatbot
   * client. 
   */
  public fun targetAddress(targetAddress: String) {
    cdkBuilder.targetAddress(targetAddress)
  }

  /**
   * @param targetType The target type. Can be an Amazon Simple Notification Service topic or AWS
   * Chatbot client. 
   * * Amazon Simple Notification Service topics are specified as `SNS` .
   * * AWS Chatbot clients are specified as `AWSChatbotSlack` .
   */
  public fun targetType(targetType: String) {
    cdkBuilder.targetType(targetType)
  }

  public fun build(): CfnNotificationRule.TargetProperty = cdkBuilder.build()
}
