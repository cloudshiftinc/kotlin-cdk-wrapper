@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * Export to .csv option.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ExportToCSVOptionProperty exportToCSVOptionProperty = ExportToCSVOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-exporttocsvoption.html)
 */
@CdkDslMarker
public class CfnDashboardExportToCSVOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.ExportToCSVOptionProperty.Builder =
      CfnDashboard.ExportToCSVOptionProperty.builder()

  /**
   * @param availabilityStatus Availability status.
   */
  public fun availabilityStatus(availabilityStatus: String) {
    cdkBuilder.availabilityStatus(availabilityStatus)
  }

  public fun build(): CfnDashboard.ExportToCSVOptionProperty = cdkBuilder.build()
}
