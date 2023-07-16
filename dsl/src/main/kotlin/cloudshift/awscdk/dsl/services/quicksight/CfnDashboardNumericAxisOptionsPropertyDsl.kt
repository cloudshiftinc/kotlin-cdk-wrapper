@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardNumericAxisOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.NumericAxisOptionsProperty.Builder =
      CfnDashboard.NumericAxisOptionsProperty.builder()

  public fun range(range: IResolvable) {
    cdkBuilder.range(range)
  }

  public fun range(range: CfnDashboard.AxisDisplayRangeProperty) {
    cdkBuilder.range(range)
  }

  public fun scale(scale: IResolvable) {
    cdkBuilder.scale(scale)
  }

  public fun scale(scale: CfnDashboard.AxisScaleProperty) {
    cdkBuilder.scale(scale)
  }

  public fun build(): CfnDashboard.NumericAxisOptionsProperty = cdkBuilder.build()
}
