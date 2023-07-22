@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnConfigurationSet

@CdkDslMarker
public class CfnConfigurationSetDashboardOptionsPropertyDsl {
  private val cdkBuilder: CfnConfigurationSet.DashboardOptionsProperty.Builder =
      CfnConfigurationSet.DashboardOptionsProperty.builder()

  /**
   * @param engagementMetrics Specifies the status of your VDM engagement metrics collection. Can be
   * one of the following:. 
   * * `ENABLED` – Amazon SES enables engagement metrics for the configuration set.
   * * `DISABLED` – Amazon SES disables engagement metrics for the configuration set.
   */
  public fun engagementMetrics(engagementMetrics: String) {
    cdkBuilder.engagementMetrics(engagementMetrics)
  }

  public fun build(): CfnConfigurationSet.DashboardOptionsProperty = cdkBuilder.build()
}
