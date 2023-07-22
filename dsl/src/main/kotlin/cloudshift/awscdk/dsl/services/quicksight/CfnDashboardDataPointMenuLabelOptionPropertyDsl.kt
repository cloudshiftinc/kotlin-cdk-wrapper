@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The data point menu options of a dashboard.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataPointMenuLabelOptionProperty dataPointMenuLabelOptionProperty =
 * DataPointMenuLabelOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-datapointmenulabeloption.html)
 */
@CdkDslMarker
public class CfnDashboardDataPointMenuLabelOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.DataPointMenuLabelOptionProperty.Builder =
      CfnDashboard.DataPointMenuLabelOptionProperty.builder()

  /**
   * @param availabilityStatus The status of the data point menu options.
   */
  public fun availabilityStatus(availabilityStatus: String) {
    cdkBuilder.availabilityStatus(availabilityStatus)
  }

  public fun build(): CfnDashboard.DataPointMenuLabelOptionProperty = cdkBuilder.build()
}
