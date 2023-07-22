@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateLineChartDefaultSeriesSettingsPropertyDsl {
  private val cdkBuilder: CfnTemplate.LineChartDefaultSeriesSettingsProperty.Builder =
      CfnTemplate.LineChartDefaultSeriesSettingsProperty.builder()

  /**
   * @param axisBinding The axis to which you are binding all line series to.
   */
  public fun axisBinding(axisBinding: String) {
    cdkBuilder.axisBinding(axisBinding)
  }

  /**
   * @param lineStyleSettings Line styles options for all line series in the visual.
   */
  public fun lineStyleSettings(lineStyleSettings: IResolvable) {
    cdkBuilder.lineStyleSettings(lineStyleSettings)
  }

  /**
   * @param lineStyleSettings Line styles options for all line series in the visual.
   */
  public fun lineStyleSettings(lineStyleSettings: CfnTemplate.LineChartLineStyleSettingsProperty) {
    cdkBuilder.lineStyleSettings(lineStyleSettings)
  }

  /**
   * @param markerStyleSettings Marker styles options for all line series in the visual.
   */
  public fun markerStyleSettings(markerStyleSettings: IResolvable) {
    cdkBuilder.markerStyleSettings(markerStyleSettings)
  }

  /**
   * @param markerStyleSettings Marker styles options for all line series in the visual.
   */
  public
      fun markerStyleSettings(markerStyleSettings: CfnTemplate.LineChartMarkerStyleSettingsProperty) {
    cdkBuilder.markerStyleSettings(markerStyleSettings)
  }

  public fun build(): CfnTemplate.LineChartDefaultSeriesSettingsProperty = cdkBuilder.build()
}
