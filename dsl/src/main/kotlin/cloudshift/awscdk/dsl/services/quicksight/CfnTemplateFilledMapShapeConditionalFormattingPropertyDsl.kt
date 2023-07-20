@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFilledMapShapeConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnTemplate.FilledMapShapeConditionalFormattingProperty.Builder =
      CfnTemplate.FilledMapShapeConditionalFormattingProperty.builder()

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun format(format: IResolvable) {
    cdkBuilder.format(format)
  }

  public fun format(format: CfnTemplate.ShapeConditionalFormatProperty) {
    cdkBuilder.format(format)
  }

  public fun build(): CfnTemplate.FilledMapShapeConditionalFormattingProperty = cdkBuilder.build()
}
