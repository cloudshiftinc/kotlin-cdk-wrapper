@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateConditionalFormattingColorPropertyDsl {
  private val cdkBuilder: CfnTemplate.ConditionalFormattingColorProperty.Builder =
      CfnTemplate.ConditionalFormattingColorProperty.builder()

  /**
   * @param gradient Formatting configuration for gradient color.
   */
  public fun gradient(gradient: IResolvable) {
    cdkBuilder.gradient(gradient)
  }

  /**
   * @param gradient Formatting configuration for gradient color.
   */
  public fun gradient(gradient: CfnTemplate.ConditionalFormattingGradientColorProperty) {
    cdkBuilder.gradient(gradient)
  }

  /**
   * @param solid Formatting configuration for solid color.
   */
  public fun solid(solid: IResolvable) {
    cdkBuilder.solid(solid)
  }

  /**
   * @param solid Formatting configuration for solid color.
   */
  public fun solid(solid: CfnTemplate.ConditionalFormattingSolidColorProperty) {
    cdkBuilder.solid(solid)
  }

  public fun build(): CfnTemplate.ConditionalFormattingColorProperty = cdkBuilder.build()
}
