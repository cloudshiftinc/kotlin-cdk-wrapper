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

  public fun insightsEnabled(insightsEnabled: Boolean) {
    cdkBuilder.insightsEnabled(insightsEnabled)
  }

  public fun insightsEnabled(insightsEnabled: IResolvable) {
    cdkBuilder.insightsEnabled(insightsEnabled)
  }

  public fun notificationsEnabled(notificationsEnabled: Boolean) {
    cdkBuilder.notificationsEnabled(notificationsEnabled)
  }

  public fun notificationsEnabled(notificationsEnabled: IResolvable) {
    cdkBuilder.notificationsEnabled(notificationsEnabled)
  }

  public fun build(): CfnGroup.InsightsConfigurationProperty = cdkBuilder.build()
}
