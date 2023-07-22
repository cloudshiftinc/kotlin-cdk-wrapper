@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardRadarChartAreaStyleSettingsPropertyDsl {
  private val cdkBuilder: CfnDashboard.RadarChartAreaStyleSettingsProperty.Builder =
      CfnDashboard.RadarChartAreaStyleSettingsProperty.builder()

  /**
   * @param visibility The visibility settings of a radar chart.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.RadarChartAreaStyleSettingsProperty = cdkBuilder.build()
}
