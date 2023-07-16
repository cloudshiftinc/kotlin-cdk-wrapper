@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardConditionalFormattingIconPropertyDsl {
  private val cdkBuilder: CfnDashboard.ConditionalFormattingIconProperty.Builder =
      CfnDashboard.ConditionalFormattingIconProperty.builder()

  public fun customCondition(customCondition: IResolvable) {
    cdkBuilder.customCondition(customCondition)
  }

  public
      fun customCondition(customCondition: CfnDashboard.ConditionalFormattingCustomIconConditionProperty) {
    cdkBuilder.customCondition(customCondition)
  }

  public fun iconSet(iconSet: IResolvable) {
    cdkBuilder.iconSet(iconSet)
  }

  public fun iconSet(iconSet: CfnDashboard.ConditionalFormattingIconSetProperty) {
    cdkBuilder.iconSet(iconSet)
  }

  public fun build(): CfnDashboard.ConditionalFormattingIconProperty = cdkBuilder.build()
}
