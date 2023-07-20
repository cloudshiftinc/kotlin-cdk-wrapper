@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePivotTableConditionalFormattingOptionPropertyDsl {
  private val cdkBuilder: CfnTemplate.PivotTableConditionalFormattingOptionProperty.Builder =
      CfnTemplate.PivotTableConditionalFormattingOptionProperty.builder()

  public fun cell(cell: IResolvable) {
    cdkBuilder.cell(cell)
  }

  public fun cell(cell: CfnTemplate.PivotTableCellConditionalFormattingProperty) {
    cdkBuilder.cell(cell)
  }

  public fun build(): CfnTemplate.PivotTableConditionalFormattingOptionProperty = cdkBuilder.build()
}
