@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateConditionalFormattingSolidColorPropertyDsl {
  private val cdkBuilder: CfnTemplate.ConditionalFormattingSolidColorProperty.Builder =
      CfnTemplate.ConditionalFormattingSolidColorProperty.builder()

  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun build(): CfnTemplate.ConditionalFormattingSolidColorProperty = cdkBuilder.build()
}
