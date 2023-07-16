@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardConditionalFormattingColorPropertyDsl {
  private val cdkBuilder: CfnDashboard.ConditionalFormattingColorProperty.Builder =
      CfnDashboard.ConditionalFormattingColorProperty.builder()

  public fun gradient(gradient: IResolvable) {
    cdkBuilder.gradient(gradient)
  }

  public fun gradient(gradient: CfnDashboard.ConditionalFormattingGradientColorProperty) {
    cdkBuilder.gradient(gradient)
  }

  public fun solid(solid: IResolvable) {
    cdkBuilder.solid(solid)
  }

  public fun solid(solid: CfnDashboard.ConditionalFormattingSolidColorProperty) {
    cdkBuilder.solid(solid)
  }

  public fun build(): CfnDashboard.ConditionalFormattingColorProperty = cdkBuilder.build()
}
