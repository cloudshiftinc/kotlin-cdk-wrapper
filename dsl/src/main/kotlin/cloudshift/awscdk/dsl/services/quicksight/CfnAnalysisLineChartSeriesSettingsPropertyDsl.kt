@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisLineChartSeriesSettingsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.LineChartSeriesSettingsProperty.Builder =
      CfnAnalysis.LineChartSeriesSettingsProperty.builder()

  /**
   * @param lineStyleSettings Line styles options for a line series in `LineChartVisual` .
   */
  public fun lineStyleSettings(lineStyleSettings: IResolvable) {
    cdkBuilder.lineStyleSettings(lineStyleSettings)
  }

  /**
   * @param lineStyleSettings Line styles options for a line series in `LineChartVisual` .
   */
  public fun lineStyleSettings(lineStyleSettings: CfnAnalysis.LineChartLineStyleSettingsProperty) {
    cdkBuilder.lineStyleSettings(lineStyleSettings)
  }

  /**
   * @param markerStyleSettings Marker styles options for a line series in `LineChartVisual` .
   */
  public fun markerStyleSettings(markerStyleSettings: IResolvable) {
    cdkBuilder.markerStyleSettings(markerStyleSettings)
  }

  /**
   * @param markerStyleSettings Marker styles options for a line series in `LineChartVisual` .
   */
  public
      fun markerStyleSettings(markerStyleSettings: CfnAnalysis.LineChartMarkerStyleSettingsProperty) {
    cdkBuilder.markerStyleSettings(markerStyleSettings)
  }

  public fun build(): CfnAnalysis.LineChartSeriesSettingsProperty = cdkBuilder.build()
}
