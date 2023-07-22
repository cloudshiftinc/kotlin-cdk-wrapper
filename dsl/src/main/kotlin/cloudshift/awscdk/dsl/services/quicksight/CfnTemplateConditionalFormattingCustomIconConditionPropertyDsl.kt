@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateConditionalFormattingCustomIconConditionPropertyDsl {
  private val cdkBuilder: CfnTemplate.ConditionalFormattingCustomIconConditionProperty.Builder =
      CfnTemplate.ConditionalFormattingCustomIconConditionProperty.builder()

  /**
   * @param color Determines the color of the icon.
   */
  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  /**
   * @param displayConfiguration Determines the icon display configuration.
   */
  public fun displayConfiguration(displayConfiguration: IResolvable) {
    cdkBuilder.displayConfiguration(displayConfiguration)
  }

  /**
   * @param displayConfiguration Determines the icon display configuration.
   */
  public
      fun displayConfiguration(displayConfiguration: CfnTemplate.ConditionalFormattingIconDisplayConfigurationProperty) {
    cdkBuilder.displayConfiguration(displayConfiguration)
  }

  /**
   * @param expression The expression that determines the condition of the icon set. 
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  /**
   * @param iconOptions Custom icon options for an icon set. 
   */
  public fun iconOptions(iconOptions: IResolvable) {
    cdkBuilder.iconOptions(iconOptions)
  }

  /**
   * @param iconOptions Custom icon options for an icon set. 
   */
  public fun iconOptions(iconOptions: CfnTemplate.ConditionalFormattingCustomIconOptionsProperty) {
    cdkBuilder.iconOptions(iconOptions)
  }

  public fun build(): CfnTemplate.ConditionalFormattingCustomIconConditionProperty =
      cdkBuilder.build()
}
