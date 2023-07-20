@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisLineChartDefaultSeriesSettingsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.LineChartDefaultSeriesSettingsProperty.Builder =
      CfnAnalysis.LineChartDefaultSeriesSettingsProperty.builder()

  public fun axisBinding(axisBinding: String) {
    cdkBuilder.axisBinding(axisBinding)
  }

  public fun lineStyleSettings(lineStyleSettings: IResolvable) {
    cdkBuilder.lineStyleSettings(lineStyleSettings)
  }

  public fun lineStyleSettings(lineStyleSettings: CfnAnalysis.LineChartLineStyleSettingsProperty) {
    cdkBuilder.lineStyleSettings(lineStyleSettings)
  }

  public fun markerStyleSettings(markerStyleSettings: IResolvable) {
    cdkBuilder.markerStyleSettings(markerStyleSettings)
  }

  public
      fun markerStyleSettings(markerStyleSettings: CfnAnalysis.LineChartMarkerStyleSettingsProperty) {
    cdkBuilder.markerStyleSettings(markerStyleSettings)
  }

  public fun build(): CfnAnalysis.LineChartDefaultSeriesSettingsProperty = cdkBuilder.build()
}
