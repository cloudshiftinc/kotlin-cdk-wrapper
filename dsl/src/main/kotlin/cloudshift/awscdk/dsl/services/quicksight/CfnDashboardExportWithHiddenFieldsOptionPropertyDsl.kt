@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * Determines whether or not hidden fields are visible on exported dashbaords.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ExportWithHiddenFieldsOptionProperty exportWithHiddenFieldsOptionProperty =
 * ExportWithHiddenFieldsOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-exportwithhiddenfieldsoption.html)
 */
@CdkDslMarker
public class CfnDashboardExportWithHiddenFieldsOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.ExportWithHiddenFieldsOptionProperty.Builder =
      CfnDashboard.ExportWithHiddenFieldsOptionProperty.builder()

  /**
   * @param availabilityStatus The status of the export with hidden fields options.
   */
  public fun availabilityStatus(availabilityStatus: String) {
    cdkBuilder.availabilityStatus(availabilityStatus)
  }

  public fun build(): CfnDashboard.ExportWithHiddenFieldsOptionProperty = cdkBuilder.build()
}
