@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTableCellConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnTemplate.TableCellConditionalFormattingProperty.Builder =
      CfnTemplate.TableCellConditionalFormattingProperty.builder()

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun textFormat(textFormat: IResolvable) {
    cdkBuilder.textFormat(textFormat)
  }

  public fun textFormat(textFormat: CfnTemplate.TextConditionalFormatProperty) {
    cdkBuilder.textFormat(textFormat)
  }

  public fun build(): CfnTemplate.TableCellConditionalFormattingProperty = cdkBuilder.build()
}
