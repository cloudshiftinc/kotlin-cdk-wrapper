@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateConditionalFormattingIconSetPropertyDsl {
  private val cdkBuilder: CfnTemplate.ConditionalFormattingIconSetProperty.Builder =
      CfnTemplate.ConditionalFormattingIconSetProperty.builder()

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun iconSetType(iconSetType: String) {
    cdkBuilder.iconSetType(iconSetType)
  }

  public fun build(): CfnTemplate.ConditionalFormattingIconSetProperty = cdkBuilder.build()
}
