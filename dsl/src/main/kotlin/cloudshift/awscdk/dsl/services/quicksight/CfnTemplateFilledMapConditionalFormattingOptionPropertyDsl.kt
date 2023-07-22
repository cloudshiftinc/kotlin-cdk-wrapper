@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFilledMapConditionalFormattingOptionPropertyDsl {
  private val cdkBuilder: CfnTemplate.FilledMapConditionalFormattingOptionProperty.Builder =
      CfnTemplate.FilledMapConditionalFormattingOptionProperty.builder()

  /**
   * @param shape The conditional formatting that determines the shape of the filled map. 
   */
  public fun shape(shape: IResolvable) {
    cdkBuilder.shape(shape)
  }

  /**
   * @param shape The conditional formatting that determines the shape of the filled map. 
   */
  public fun shape(shape: CfnTemplate.FilledMapShapeConditionalFormattingProperty) {
    cdkBuilder.shape(shape)
  }

  public fun build(): CfnTemplate.FilledMapConditionalFormattingOptionProperty = cdkBuilder.build()
}
