@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The optional configuration of subtotals cells.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PivotTableFieldSubtotalOptionsProperty pivotTableFieldSubtotalOptionsProperty =
 * PivotTableFieldSubtotalOptionsProperty.builder()
 * .fieldId("fieldId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-pivottablefieldsubtotaloptions.html)
 */
@CdkDslMarker
public class CfnDashboardPivotTableFieldSubtotalOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.PivotTableFieldSubtotalOptionsProperty.Builder =
      CfnDashboard.PivotTableFieldSubtotalOptionsProperty.builder()

  /**
   * @param fieldId The field ID of the subtotal options.
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun build(): CfnDashboard.PivotTableFieldSubtotalOptionsProperty = cdkBuilder.build()
}
