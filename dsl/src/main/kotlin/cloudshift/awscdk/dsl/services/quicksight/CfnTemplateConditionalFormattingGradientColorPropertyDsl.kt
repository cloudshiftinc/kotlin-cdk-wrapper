@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateConditionalFormattingGradientColorPropertyDsl {
  private val cdkBuilder: CfnTemplate.ConditionalFormattingGradientColorProperty.Builder =
      CfnTemplate.ConditionalFormattingGradientColorProperty.builder()

  public fun color(color: IResolvable) {
    cdkBuilder.color(color)
  }

  public fun color(color: CfnTemplate.GradientColorProperty) {
    cdkBuilder.color(color)
  }

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun build(): CfnTemplate.ConditionalFormattingGradientColorProperty = cdkBuilder.build()
}
