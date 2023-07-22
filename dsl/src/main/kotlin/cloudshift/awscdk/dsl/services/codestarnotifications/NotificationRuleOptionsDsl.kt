@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestarnotifications

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.codestarnotifications.DetailType
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions

@CdkDslMarker
public class NotificationRuleOptionsDsl {
  private val cdkBuilder: NotificationRuleOptions.Builder = NotificationRuleOptions.builder()

  /**
   * @param detailType The level of detail to include in the notifications for this resource.
   * BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
   * FULL will include any supplemental information provided by AWS CodeStar Notifications and/or
   * the service for the resource for which the notification is created.
   */
  public fun detailType(detailType: DetailType) {
    cdkBuilder.detailType(detailType)
  }

  /**
   * @param enabled The status of the notification rule.
   * If the enabled is set to DISABLED, notifications aren't sent for the notification rule.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param notificationRuleName The name for the notification rule.
   * Notification rule names must be unique in your AWS account.
   */
  public fun notificationRuleName(notificationRuleName: String) {
    cdkBuilder.notificationRuleName(notificationRuleName)
  }

  public fun build(): NotificationRuleOptions = cdkBuilder.build()
}
