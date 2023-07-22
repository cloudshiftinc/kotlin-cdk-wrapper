@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTableConditionalFormattingOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.TableConditionalFormattingOptionProperty.Builder =
      CfnDashboard.TableConditionalFormattingOptionProperty.builder()

  /**
   * @param cell The cell conditional formatting option for a table.
   */
  public fun cell(cell: IResolvable) {
    cdkBuilder.cell(cell)
  }

  /**
   * @param cell The cell conditional formatting option for a table.
   */
  public fun cell(cell: CfnDashboard.TableCellConditionalFormattingProperty) {
    cdkBuilder.cell(cell)
  }

  /**
   * @param row The row conditional formatting option for a table.
   */
  public fun row(row: IResolvable) {
    cdkBuilder.row(row)
  }

  /**
   * @param row The row conditional formatting option for a table.
   */
  public fun row(row: CfnDashboard.TableRowConditionalFormattingProperty) {
    cdkBuilder.row(row)
  }

  public fun build(): CfnDashboard.TableConditionalFormattingOptionProperty = cdkBuilder.build()
}
