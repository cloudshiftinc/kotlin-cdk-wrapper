@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateLineChartSeriesSettingsPropertyDsl {
  private val cdkBuilder: CfnTemplate.LineChartSeriesSettingsProperty.Builder =
      CfnTemplate.LineChartSeriesSettingsProperty.builder()

  /**
   * @param lineStyleSettings Line styles options for a line series in `LineChartVisual` .
   */
  public fun lineStyleSettings(lineStyleSettings: IResolvable) {
    cdkBuilder.lineStyleSettings(lineStyleSettings)
  }

  /**
   * @param lineStyleSettings Line styles options for a line series in `LineChartVisual` .
   */
  public fun lineStyleSettings(lineStyleSettings: CfnTemplate.LineChartLineStyleSettingsProperty) {
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
      fun markerStyleSettings(markerStyleSettings: CfnTemplate.LineChartMarkerStyleSettingsProperty) {
    cdkBuilder.markerStyleSettings(markerStyleSettings)
  }

  public fun build(): CfnTemplate.LineChartSeriesSettingsProperty = cdkBuilder.build()
}
