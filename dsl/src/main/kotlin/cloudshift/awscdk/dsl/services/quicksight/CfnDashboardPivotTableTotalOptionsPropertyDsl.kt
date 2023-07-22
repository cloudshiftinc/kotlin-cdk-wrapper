@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The total options for a pivot table visual.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-pivottabletotaloptions.html)
 */
@CdkDslMarker
public class CfnDashboardPivotTableTotalOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.PivotTableTotalOptionsProperty.Builder =
      CfnDashboard.PivotTableTotalOptionsProperty.builder()

  /**
   * @param columnSubtotalOptions The column subtotal options.
   */
  public fun columnSubtotalOptions(columnSubtotalOptions: IResolvable) {
    cdkBuilder.columnSubtotalOptions(columnSubtotalOptions)
  }

  /**
   * @param columnSubtotalOptions The column subtotal options.
   */
  public fun columnSubtotalOptions(columnSubtotalOptions: CfnDashboard.SubtotalOptionsProperty) {
    cdkBuilder.columnSubtotalOptions(columnSubtotalOptions)
  }

  /**
   * @param columnTotalOptions The column total options.
   */
  public fun columnTotalOptions(columnTotalOptions: IResolvable) {
    cdkBuilder.columnTotalOptions(columnTotalOptions)
  }

  /**
   * @param columnTotalOptions The column total options.
   */
  public fun columnTotalOptions(columnTotalOptions: CfnDashboard.PivotTotalOptionsProperty) {
    cdkBuilder.columnTotalOptions(columnTotalOptions)
  }

  /**
   * @param rowSubtotalOptions The row subtotal options.
   */
  public fun rowSubtotalOptions(rowSubtotalOptions: IResolvable) {
    cdkBuilder.rowSubtotalOptions(rowSubtotalOptions)
  }

  /**
   * @param rowSubtotalOptions The row subtotal options.
   */
  public fun rowSubtotalOptions(rowSubtotalOptions: CfnDashboard.SubtotalOptionsProperty) {
    cdkBuilder.rowSubtotalOptions(rowSubtotalOptions)
  }

  /**
   * @param rowTotalOptions The row total options.
   */
  public fun rowTotalOptions(rowTotalOptions: IResolvable) {
    cdkBuilder.rowTotalOptions(rowTotalOptions)
  }

  /**
   * @param rowTotalOptions The row total options.
   */
  public fun rowTotalOptions(rowTotalOptions: CfnDashboard.PivotTotalOptionsProperty) {
    cdkBuilder.rowTotalOptions(rowTotalOptions)
  }

  public fun build(): CfnDashboard.PivotTableTotalOptionsProperty = cdkBuilder.build()
}
