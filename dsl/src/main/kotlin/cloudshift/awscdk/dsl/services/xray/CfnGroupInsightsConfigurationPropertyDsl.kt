@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.xray

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.xray.CfnGroup

@CdkDslMarker
public class CfnGroupInsightsConfigurationPropertyDsl {
  private val cdkBuilder: CfnGroup.InsightsConfigurationProperty.Builder =
      CfnGroup.InsightsConfigurationProperty.builder()

  /**
   * @param insightsEnabled Set the InsightsEnabled value to true to enable insights or false to
   * disable insights.
   */
  public fun insightsEnabled(insightsEnabled: Boolean) {
    cdkBuilder.insightsEnabled(insightsEnabled)
  }

  /**
   * @param insightsEnabled Set the InsightsEnabled value to true to enable insights or false to
   * disable insights.
   */
  public fun insightsEnabled(insightsEnabled: IResolvable) {
    cdkBuilder.insightsEnabled(insightsEnabled)
  }

  /**
   * @param notificationsEnabled Set the NotificationsEnabled value to true to enable insights
   * notifications.
   * Notifications can only be enabled on a group with InsightsEnabled set to true.
   */
  public fun notificationsEnabled(notificationsEnabled: Boolean) {
    cdkBuilder.notificationsEnabled(notificationsEnabled)
  }

  /**
   * @param notificationsEnabled Set the NotificationsEnabled value to true to enable insights
   * notifications.
   * Notifications can only be enabled on a group with InsightsEnabled set to true.
   */
  public fun notificationsEnabled(notificationsEnabled: IResolvable) {
    cdkBuilder.notificationsEnabled(notificationsEnabled)
  }

  public fun build(): CfnGroup.InsightsConfigurationProperty = cdkBuilder.build()
}
