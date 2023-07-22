@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardAxisLinearScalePropertyDsl {
  private val cdkBuilder: CfnDashboard.AxisLinearScaleProperty.Builder =
      CfnDashboard.AxisLinearScaleProperty.builder()

  /**
   * @param stepCount The step count setup of a linear axis.
   */
  public fun stepCount(stepCount: Number) {
    cdkBuilder.stepCount(stepCount)
  }

  /**
   * @param stepSize The step size setup of a linear axis.
   */
  public fun stepSize(stepSize: Number) {
    cdkBuilder.stepSize(stepSize)
  }

  public fun build(): CfnDashboard.AxisLinearScaleProperty = cdkBuilder.build()
}
