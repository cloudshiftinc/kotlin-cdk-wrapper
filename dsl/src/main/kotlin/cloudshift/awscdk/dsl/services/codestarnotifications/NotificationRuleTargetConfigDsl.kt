@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestarnotifications

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig

@CdkDslMarker
public class NotificationRuleTargetConfigDsl {
  private val cdkBuilder: NotificationRuleTargetConfig.Builder =
      NotificationRuleTargetConfig.builder()

  /**
   * @param targetAddress The Amazon Resource Name (ARN) of the Amazon SNS topic or AWS Chatbot
   * client. 
   */
  public fun targetAddress(targetAddress: String) {
    cdkBuilder.targetAddress(targetAddress)
  }

  /**
   * @param targetType The target type. 
   * Can be an Amazon SNS topic or AWS Chatbot client.
   */
  public fun targetType(targetType: String) {
    cdkBuilder.targetType(targetType)
  }

  public fun build(): NotificationRuleTargetConfig = cdkBuilder.build()
}
