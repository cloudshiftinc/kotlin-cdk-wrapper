@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardShapeConditionalFormatPropertyDsl {
  private val cdkBuilder: CfnDashboard.ShapeConditionalFormatProperty.Builder =
      CfnDashboard.ShapeConditionalFormatProperty.builder()

  public fun backgroundColor(backgroundColor: IResolvable) {
    cdkBuilder.backgroundColor(backgroundColor)
  }

  public fun backgroundColor(backgroundColor: CfnDashboard.ConditionalFormattingColorProperty) {
    cdkBuilder.backgroundColor(backgroundColor)
  }

  public fun build(): CfnDashboard.ShapeConditionalFormatProperty = cdkBuilder.build()
}
