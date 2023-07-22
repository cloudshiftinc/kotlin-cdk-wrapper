@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPivotTableConditionalFormattingOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.PivotTableConditionalFormattingOptionProperty.Builder =
      CfnDashboard.PivotTableConditionalFormattingOptionProperty.builder()

  /**
   * @param cell The cell conditional formatting option for a pivot table.
   */
  public fun cell(cell: IResolvable) {
    cdkBuilder.cell(cell)
  }

  /**
   * @param cell The cell conditional formatting option for a pivot table.
   */
  public fun cell(cell: CfnDashboard.PivotTableCellConditionalFormattingProperty) {
    cdkBuilder.cell(cell)
  }

  public fun build(): CfnDashboard.PivotTableConditionalFormattingOptionProperty =
      cdkBuilder.build()
}
