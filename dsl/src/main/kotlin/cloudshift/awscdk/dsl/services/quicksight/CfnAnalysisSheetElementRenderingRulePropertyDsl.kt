@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisSheetElementRenderingRulePropertyDsl {
  private val cdkBuilder: CfnAnalysis.SheetElementRenderingRuleProperty.Builder =
      CfnAnalysis.SheetElementRenderingRuleProperty.builder()

  /**
   * @param configurationOverrides The override configuration of the rendering rules of a sheet. 
   */
  public fun configurationOverrides(configurationOverrides: IResolvable) {
    cdkBuilder.configurationOverrides(configurationOverrides)
  }

  /**
   * @param configurationOverrides The override configuration of the rendering rules of a sheet. 
   */
  public
      fun configurationOverrides(configurationOverrides: CfnAnalysis.SheetElementConfigurationOverridesProperty) {
    cdkBuilder.configurationOverrides(configurationOverrides)
  }

  /**
   * @param expression The expression of the rendering rules of a sheet. 
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun build(): CfnAnalysis.SheetElementRenderingRuleProperty = cdkBuilder.build()
}
