@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardLineChartLineStyleSettingsPropertyDsl {
  private val cdkBuilder: CfnDashboard.LineChartLineStyleSettingsProperty.Builder =
      CfnDashboard.LineChartLineStyleSettingsProperty.builder()

  /**
   * @param lineInterpolation Interpolation style for line series.
   * * `LINEAR` : Show as default, linear style.
   * * `SMOOTH` : Show as a smooth curve.
   * * `STEPPED` : Show steps in line.
   */
  public fun lineInterpolation(lineInterpolation: String) {
    cdkBuilder.lineInterpolation(lineInterpolation)
  }

  /**
   * @param lineStyle Line style for line series.
   * * `SOLID` : Show as a solid line.
   * * `DOTTED` : Show as a dotted line.
   * * `DASHED` : Show as a dashed line.
   */
  public fun lineStyle(lineStyle: String) {
    cdkBuilder.lineStyle(lineStyle)
  }

  /**
   * @param lineVisibility Configuration option that determines whether to show the line for the
   * series.
   */
  public fun lineVisibility(lineVisibility: String) {
    cdkBuilder.lineVisibility(lineVisibility)
  }

  /**
   * @param lineWidth Width that determines the line thickness.
   */
  public fun lineWidth(lineWidth: String) {
    cdkBuilder.lineWidth(lineWidth)
  }

  public fun build(): CfnDashboard.LineChartLineStyleSettingsProperty = cdkBuilder.build()
}
