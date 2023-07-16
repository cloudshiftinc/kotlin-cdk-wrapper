@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFilledMapConditionalFormattingOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.FilledMapConditionalFormattingOptionProperty.Builder =
      CfnDashboard.FilledMapConditionalFormattingOptionProperty.builder()

  public fun shape(shape: IResolvable) {
    cdkBuilder.shape(shape)
  }

  public fun shape(shape: CfnDashboard.FilledMapShapeConditionalFormattingProperty) {
    cdkBuilder.shape(shape)
  }

  public fun build(): CfnDashboard.FilledMapConditionalFormattingOptionProperty = cdkBuilder.build()
}
