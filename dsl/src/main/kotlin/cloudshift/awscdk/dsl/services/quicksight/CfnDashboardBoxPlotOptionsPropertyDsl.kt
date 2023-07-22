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

  /**
   * @param allDataPointsVisibility Determines the visibility of all data points of the box plot.
   */
  public fun allDataPointsVisibility(allDataPointsVisibility: String) {
    cdkBuilder.allDataPointsVisibility(allDataPointsVisibility)
  }

  /**
   * @param outlierVisibility Determines the visibility of the outlier in a box plot.
   */
  public fun outlierVisibility(outlierVisibility: String) {
    cdkBuilder.outlierVisibility(outlierVisibility)
  }

  /**
   * @param styleOptions The style options of the box plot.
   */
  public fun styleOptions(styleOptions: IResolvable) {
    cdkBuilder.styleOptions(styleOptions)
  }

  /**
   * @param styleOptions The style options of the box plot.
   */
  public fun styleOptions(styleOptions: CfnDashboard.BoxPlotStyleOptionsProperty) {
    cdkBuilder.styleOptions(styleOptions)
  }

  public fun build(): CfnDashboard.BoxPlotOptionsProperty = cdkBuilder.build()
}
