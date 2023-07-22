@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDonutOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DonutOptionsProperty.Builder =
      CfnAnalysis.DonutOptionsProperty.builder()

  /**
   * @param arcOptions The option for define the arc of the chart shape. Valid values are as
   * follows:.
   * * `WHOLE` - A pie chart
   * * `SMALL` - A small-sized donut chart
   * * `MEDIUM` - A medium-sized donut chart
   * * `LARGE` - A large-sized donut chart
   */
  public fun arcOptions(arcOptions: IResolvable) {
    cdkBuilder.arcOptions(arcOptions)
  }

  /**
   * @param arcOptions The option for define the arc of the chart shape. Valid values are as
   * follows:.
   * * `WHOLE` - A pie chart
   * * `SMALL` - A small-sized donut chart
   * * `MEDIUM` - A medium-sized donut chart
   * * `LARGE` - A large-sized donut chart
   */
  public fun arcOptions(arcOptions: CfnAnalysis.ArcOptionsProperty) {
    cdkBuilder.arcOptions(arcOptions)
  }

  /**
   * @param donutCenterOptions The label options of the label that is displayed in the center of a
   * donut chart.
   * This option isn't available for pie charts.
   */
  public fun donutCenterOptions(donutCenterOptions: IResolvable) {
    cdkBuilder.donutCenterOptions(donutCenterOptions)
  }

  /**
   * @param donutCenterOptions The label options of the label that is displayed in the center of a
   * donut chart.
   * This option isn't available for pie charts.
   */
  public fun donutCenterOptions(donutCenterOptions: CfnAnalysis.DonutCenterOptionsProperty) {
    cdkBuilder.donutCenterOptions(donutCenterOptions)
  }

  public fun build(): CfnAnalysis.DonutOptionsProperty = cdkBuilder.build()
}
