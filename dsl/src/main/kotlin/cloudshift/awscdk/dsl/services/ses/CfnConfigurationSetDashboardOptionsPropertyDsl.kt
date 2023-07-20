@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnConfigurationSet

@CdkDslMarker
public class CfnConfigurationSetDashboardOptionsPropertyDsl {
  private val cdkBuilder: CfnConfigurationSet.DashboardOptionsProperty.Builder =
      CfnConfigurationSet.DashboardOptionsProperty.builder()

  public fun engagementMetrics(engagementMetrics: String) {
    cdkBuilder.engagementMetrics(engagementMetrics)
  }

  public fun build(): CfnConfigurationSet.DashboardOptionsProperty = cdkBuilder.build()
}
