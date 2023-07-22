@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The options that determine the presentation of a line series in the visual.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * LineChartSeriesSettingsProperty lineChartSeriesSettingsProperty =
 * LineChartSeriesSettingsProperty.builder()
 * .lineStyleSettings(LineChartLineStyleSettingsProperty.builder()
 * .lineInterpolation("lineInterpolation")
 * .lineStyle("lineStyle")
 * .lineVisibility("lineVisibility")
 * .lineWidth("lineWidth")
 * .build())
 * .markerStyleSettings(LineChartMarkerStyleSettingsProperty.builder()
 * .markerColor("markerColor")
 * .markerShape("markerShape")
 * .markerSize("markerSize")
 * .markerVisibility("markerVisibility")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-linechartseriessettings.html)
 */
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
