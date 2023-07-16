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

  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun displayConfiguration(displayConfiguration: IResolvable) {
    cdkBuilder.displayConfiguration(displayConfiguration)
  }

  public
      fun displayConfiguration(displayConfiguration: CfnTemplate.ConditionalFormattingIconDisplayConfigurationProperty) {
    cdkBuilder.displayConfiguration(displayConfiguration)
  }

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun iconOptions(iconOptions: IResolvable) {
    cdkBuilder.iconOptions(iconOptions)
  }

  public fun iconOptions(iconOptions: CfnTemplate.ConditionalFormattingCustomIconOptionsProperty) {
    cdkBuilder.iconOptions(iconOptions)
  }

  public fun build(): CfnTemplate.ConditionalFormattingCustomIconConditionProperty =
      cdkBuilder.build()
}
