@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTableConditionalFormattingOptionPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TableConditionalFormattingOptionProperty.Builder =
      CfnAnalysis.TableConditionalFormattingOptionProperty.builder()

  public fun cell(cell: IResolvable) {
    cdkBuilder.cell(cell)
  }

  public fun cell(cell: CfnAnalysis.TableCellConditionalFormattingProperty) {
    cdkBuilder.cell(cell)
  }

  public fun row(row: IResolvable) {
    cdkBuilder.row(row)
  }

  public fun row(row: CfnAnalysis.TableRowConditionalFormattingProperty) {
    cdkBuilder.row(row)
  }

  public fun build(): CfnAnalysis.TableConditionalFormattingOptionProperty = cdkBuilder.build()
}
