@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestarnotifications

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig

/**
 * Information about the SNS topic or AWS Chatbot client associated with a notification target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codestarnotifications.*;
 * NotificationRuleTargetConfig notificationRuleTargetConfig =
 * NotificationRuleTargetConfig.builder()
 * .targetAddress("targetAddress")
 * .targetType("targetType")
 * .build();
 * ```
 */
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
