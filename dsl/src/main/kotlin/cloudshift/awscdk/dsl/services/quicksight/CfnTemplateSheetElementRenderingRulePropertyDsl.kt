@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSheetElementRenderingRulePropertyDsl {
  private val cdkBuilder: CfnTemplate.SheetElementRenderingRuleProperty.Builder =
      CfnTemplate.SheetElementRenderingRuleProperty.builder()

  public fun configurationOverrides(configurationOverrides: IResolvable) {
    cdkBuilder.configurationOverrides(configurationOverrides)
  }

  public
      fun configurationOverrides(configurationOverrides: CfnTemplate.SheetElementConfigurationOverridesProperty) {
    cdkBuilder.configurationOverrides(configurationOverrides)
  }

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun build(): CfnTemplate.SheetElementRenderingRuleProperty = cdkBuilder.build()
}
