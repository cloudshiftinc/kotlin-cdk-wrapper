@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPivotTableConditionalFormattingOptionPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PivotTableConditionalFormattingOptionProperty.Builder =
      CfnAnalysis.PivotTableConditionalFormattingOptionProperty.builder()

  /**
   * @param cell The cell conditional formatting option for a pivot table.
   */
  public fun cell(cell: IResolvable) {
    cdkBuilder.cell(cell)
  }

  /**
   * @param cell The cell conditional formatting option for a pivot table.
   */
  public fun cell(cell: CfnAnalysis.PivotTableCellConditionalFormattingProperty) {
    cdkBuilder.cell(cell)
  }

  public fun build(): CfnAnalysis.PivotTableConditionalFormattingOptionProperty = cdkBuilder.build()
}
