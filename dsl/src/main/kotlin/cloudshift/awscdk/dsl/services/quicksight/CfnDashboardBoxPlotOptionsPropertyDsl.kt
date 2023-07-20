@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardBoxPlotOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.BoxPlotOptionsProperty.Builder =
      CfnDashboard.BoxPlotOptionsProperty.builder()

  public fun allDataPointsVisibility(allDataPointsVisibility: String) {
    cdkBuilder.allDataPointsVisibility(allDataPointsVisibility)
  }

  public fun outlierVisibility(outlierVisibility: String) {
    cdkBuilder.outlierVisibility(outlierVisibility)
  }

  public fun styleOptions(styleOptions: IResolvable) {
    cdkBuilder.styleOptions(styleOptions)
  }

  public fun styleOptions(styleOptions: CfnDashboard.BoxPlotStyleOptionsProperty) {
    cdkBuilder.styleOptions(styleOptions)
  }

  public fun build(): CfnDashboard.BoxPlotOptionsProperty = cdkBuilder.build()
}
