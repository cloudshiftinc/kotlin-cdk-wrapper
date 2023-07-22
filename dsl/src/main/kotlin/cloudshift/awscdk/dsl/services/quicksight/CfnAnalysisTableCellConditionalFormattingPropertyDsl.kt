@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTableCellConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TableCellConditionalFormattingProperty.Builder =
      CfnAnalysis.TableCellConditionalFormattingProperty.builder()

  /**
   * @param fieldId The field ID of the cell for conditional formatting. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  /**
   * @param textFormat The text format of the cell for conditional formatting.
   */
  public fun textFormat(textFormat: IResolvable) {
    cdkBuilder.textFormat(textFormat)
  }

  /**
   * @param textFormat The text format of the cell for conditional formatting.
   */
  public fun textFormat(textFormat: CfnAnalysis.TextConditionalFormatProperty) {
    cdkBuilder.textFormat(textFormat)
  }

  public fun build(): CfnAnalysis.TableCellConditionalFormattingProperty = cdkBuilder.build()
}
