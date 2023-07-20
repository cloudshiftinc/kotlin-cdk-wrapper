@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisRadarChartAreaStyleSettingsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.RadarChartAreaStyleSettingsProperty.Builder =
      CfnAnalysis.RadarChartAreaStyleSettingsProperty.builder()

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnAnalysis.RadarChartAreaStyleSettingsProperty = cdkBuilder.build()
}
