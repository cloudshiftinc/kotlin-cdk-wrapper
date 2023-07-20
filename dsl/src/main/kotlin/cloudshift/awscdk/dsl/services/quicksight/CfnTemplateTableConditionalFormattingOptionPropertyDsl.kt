@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTableConditionalFormattingOptionPropertyDsl {
  private val cdkBuilder: CfnTemplate.TableConditionalFormattingOptionProperty.Builder =
      CfnTemplate.TableConditionalFormattingOptionProperty.builder()

  public fun cell(cell: IResolvable) {
    cdkBuilder.cell(cell)
  }

  public fun cell(cell: CfnTemplate.TableCellConditionalFormattingProperty) {
    cdkBuilder.cell(cell)
  }

  public fun row(row: IResolvable) {
    cdkBuilder.row(row)
  }

  public fun row(row: CfnTemplate.TableRowConditionalFormattingProperty) {
    cdkBuilder.row(row)
  }

  public fun build(): CfnTemplate.TableConditionalFormattingOptionProperty = cdkBuilder.build()
}
