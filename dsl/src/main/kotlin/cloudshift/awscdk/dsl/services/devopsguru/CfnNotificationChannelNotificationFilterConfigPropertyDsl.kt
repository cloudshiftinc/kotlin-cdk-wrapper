@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel

@CdkDslMarker
public class CfnNotificationChannelNotificationFilterConfigPropertyDsl {
  private val cdkBuilder: CfnNotificationChannel.NotificationFilterConfigProperty.Builder =
      CfnNotificationChannel.NotificationFilterConfigProperty.builder()

  private val _messageTypes: MutableList<String> = mutableListOf()

  private val _severities: MutableList<String> = mutableListOf()

  /**
   * @param messageTypes The events that you want to receive notifications for.
   * For example, you can choose to receive notifications only when the severity level is upgraded
   * or a new insight is created.
   */
  public fun messageTypes(vararg messageTypes: String) {
    _messageTypes.addAll(listOf(*messageTypes))
  }

  /**
   * @param messageTypes The events that you want to receive notifications for.
   * For example, you can choose to receive notifications only when the severity level is upgraded
   * or a new insight is created.
   */
  public fun messageTypes(messageTypes: Collection<String>) {
    _messageTypes.addAll(messageTypes)
  }

  /**
   * @param severities The severity levels that you want to receive notifications for.
   * For example, you can choose to receive notifications only for insights with `HIGH` and `MEDIUM`
   * severity levels. For more information, see [Understanding insight
   * severities](https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities)
   * .
   */
  public fun severities(vararg severities: String) {
    _severities.addAll(listOf(*severities))
  }

  /**
   * @param severities The severity levels that you want to receive notifications for.
   * For example, you can choose to receive notifications only for insights with `HIGH` and `MEDIUM`
   * severity levels. For more information, see [Understanding insight
   * severities](https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities)
   * .
   */
  public fun severities(severities: Collection<String>) {
    _severities.addAll(severities)
  }

  public fun build(): CfnNotificationChannel.NotificationFilterConfigProperty {
    if(_messageTypes.isNotEmpty()) cdkBuilder.messageTypes(_messageTypes)
    if(_severities.isNotEmpty()) cdkBuilder.severities(_severities)
    return cdkBuilder.build()
  }
}
