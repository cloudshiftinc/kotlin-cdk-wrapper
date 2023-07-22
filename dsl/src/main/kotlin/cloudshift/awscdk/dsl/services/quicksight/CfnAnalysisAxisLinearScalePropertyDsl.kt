@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisAxisLinearScalePropertyDsl {
  private val cdkBuilder: CfnAnalysis.AxisLinearScaleProperty.Builder =
      CfnAnalysis.AxisLinearScaleProperty.builder()

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

  public fun build(): CfnAnalysis.AxisLinearScaleProperty = cdkBuilder.build()
}
