@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateConditionalFormattingIconSetPropertyDsl {
  private val cdkBuilder: CfnTemplate.ConditionalFormattingIconSetProperty.Builder =
      CfnTemplate.ConditionalFormattingIconSetProperty.builder()

  /**
   * @param expression The expression that determines the formatting configuration for the icon set.
   * 
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  /**
   * @param iconSetType Determines the icon set type.
   */
  public fun iconSetType(iconSetType: String) {
    cdkBuilder.iconSetType(iconSetType)
  }

  public fun build(): CfnTemplate.ConditionalFormattingIconSetProperty = cdkBuilder.build()
}
