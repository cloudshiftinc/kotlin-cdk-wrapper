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

  public fun detailType(detailType: DetailType) {
    cdkBuilder.detailType(detailType)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun notificationRuleName(notificationRuleName: String) {
    cdkBuilder.notificationRuleName(notificationRuleName)
  }

  public fun build(): NotificationRuleOptions = cdkBuilder.build()
}
