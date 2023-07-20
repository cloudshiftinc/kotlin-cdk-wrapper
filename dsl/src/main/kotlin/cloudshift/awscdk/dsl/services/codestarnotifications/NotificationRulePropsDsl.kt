@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestarnotifications

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codestarnotifications.DetailType
import software.amazon.awscdk.services.codestarnotifications.INotificationRuleSource
import software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps

@CdkDslMarker
public class NotificationRulePropsDsl {
  private val cdkBuilder: NotificationRuleProps.Builder = NotificationRuleProps.builder()

  private val _events: MutableList<String> = mutableListOf()

  private val _targets: MutableList<INotificationRuleTarget> = mutableListOf()

  public fun detailType(detailType: DetailType) {
    cdkBuilder.detailType(detailType)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun events(vararg events: String) {
    _events.addAll(listOf(*events))
  }

  public fun events(events: Collection<String>) {
    _events.addAll(events)
  }

  public fun notificationRuleName(notificationRuleName: String) {
    cdkBuilder.notificationRuleName(notificationRuleName)
  }

  public fun source(source: INotificationRuleSource) {
    cdkBuilder.source(source)
  }

  public fun targets(vararg targets: INotificationRuleTarget) {
    _targets.addAll(listOf(*targets))
  }

  public fun targets(targets: Collection<INotificationRuleTarget>) {
    _targets.addAll(targets)
  }

  public fun build(): NotificationRuleProps {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
