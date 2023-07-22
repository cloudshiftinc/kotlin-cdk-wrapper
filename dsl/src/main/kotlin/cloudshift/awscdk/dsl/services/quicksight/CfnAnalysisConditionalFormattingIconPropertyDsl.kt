@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisConditionalFormattingIconPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ConditionalFormattingIconProperty.Builder =
      CfnAnalysis.ConditionalFormattingIconProperty.builder()

  /**
   * @param customCondition Determines the custom condition for an icon set.
   */
  public fun customCondition(customCondition: IResolvable) {
    cdkBuilder.customCondition(customCondition)
  }

  /**
   * @param customCondition Determines the custom condition for an icon set.
   */
  public
      fun customCondition(customCondition: CfnAnalysis.ConditionalFormattingCustomIconConditionProperty) {
    cdkBuilder.customCondition(customCondition)
  }

  /**
   * @param iconSet Formatting configuration for icon set.
   */
  public fun iconSet(iconSet: IResolvable) {
    cdkBuilder.iconSet(iconSet)
  }

  /**
   * @param iconSet Formatting configuration for icon set.
   */
  public fun iconSet(iconSet: CfnAnalysis.ConditionalFormattingIconSetProperty) {
    cdkBuilder.iconSet(iconSet)
  }

  public fun build(): CfnAnalysis.ConditionalFormattingIconProperty = cdkBuilder.build()
}
