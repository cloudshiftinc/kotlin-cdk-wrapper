@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The options for configuring a donut chart or pie chart.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DonutOptionsProperty donutOptionsProperty = DonutOptionsProperty.builder()
 * .arcOptions(ArcOptionsProperty.builder()
 * .arcThickness("arcThickness")
 * .build())
 * .donutCenterOptions(DonutCenterOptionsProperty.builder()
 * .labelVisibility("labelVisibility")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-donutoptions.html)
 */
@CdkDslMarker
public class CfnDashboardDonutOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.DonutOptionsProperty.Builder =
      CfnDashboard.DonutOptionsProperty.builder()

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
  public fun arcOptions(arcOptions: CfnDashboard.ArcOptionsProperty) {
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
  public fun donutCenterOptions(donutCenterOptions: CfnDashboard.DonutCenterOptionsProperty) {
    cdkBuilder.donutCenterOptions(donutCenterOptions)
  }

  public fun build(): CfnDashboard.DonutOptionsProperty = cdkBuilder.build()
}
