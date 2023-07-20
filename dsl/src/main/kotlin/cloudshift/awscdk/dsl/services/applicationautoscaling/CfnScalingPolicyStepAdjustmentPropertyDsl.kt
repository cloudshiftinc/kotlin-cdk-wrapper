@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

@CdkDslMarker
public class CfnScalingPolicyStepAdjustmentPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.StepAdjustmentProperty.Builder =
      CfnScalingPolicy.StepAdjustmentProperty.builder()

  public fun metricIntervalLowerBound(metricIntervalLowerBound: Number) {
    cdkBuilder.metricIntervalLowerBound(metricIntervalLowerBound)
  }

  public fun metricIntervalUpperBound(metricIntervalUpperBound: Number) {
    cdkBuilder.metricIntervalUpperBound(metricIntervalUpperBound)
  }

  public fun scalingAdjustment(scalingAdjustment: Number) {
    cdkBuilder.scalingAdjustment(scalingAdjustment)
  }

  public fun build(): CfnScalingPolicy.StepAdjustmentProperty = cdkBuilder.build()
}
