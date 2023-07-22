@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisLineChartMarkerStyleSettingsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.LineChartMarkerStyleSettingsProperty.Builder =
      CfnAnalysis.LineChartMarkerStyleSettingsProperty.builder()

  /**
   * @param markerColor Color of marker in the series.
   */
  public fun markerColor(markerColor: String) {
    cdkBuilder.markerColor(markerColor)
  }

  /**
   * @param markerShape Shape option for markers in the series.
   * * `CIRCLE` : Show marker as a circle.
   * * `TRIANGLE` : Show marker as a triangle.
   * * `SQUARE` : Show marker as a square.
   * * `DIAMOND` : Show marker as a diamond.
   * * `ROUNDED_SQUARE` : Show marker as a rounded square.
   */
  public fun markerShape(markerShape: String) {
    cdkBuilder.markerShape(markerShape)
  }

  /**
   * @param markerSize Size of marker in the series.
   */
  public fun markerSize(markerSize: String) {
    cdkBuilder.markerSize(markerSize)
  }

  /**
   * @param markerVisibility Configuration option that determines whether to show the markers in the
   * series.
   */
  public fun markerVisibility(markerVisibility: String) {
    cdkBuilder.markerVisibility(markerVisibility)
  }

  public fun build(): CfnAnalysis.LineChartMarkerStyleSettingsProperty = cdkBuilder.build()
}
