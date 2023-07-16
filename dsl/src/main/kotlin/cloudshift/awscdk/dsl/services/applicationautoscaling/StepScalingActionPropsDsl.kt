@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.applicationautoscaling.AdjustmentType
import software.amazon.awscdk.services.applicationautoscaling.IScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType
import software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps

@CdkDslMarker
public class StepScalingActionPropsDsl {
  private val cdkBuilder: StepScalingActionProps.Builder = StepScalingActionProps.builder()

  public fun adjustmentType(adjustmentType: AdjustmentType) {
    cdkBuilder.adjustmentType(adjustmentType)
  }

  public fun cooldown(cooldown: Duration) {
    cdkBuilder.cooldown(cooldown)
  }

  public fun metricAggregationType(metricAggregationType: MetricAggregationType) {
    cdkBuilder.metricAggregationType(metricAggregationType)
  }

  public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
    cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
  }

  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  public fun scalingTarget(scalingTarget: IScalableTarget) {
    cdkBuilder.scalingTarget(scalingTarget)
  }

  public fun build(): StepScalingActionProps = cdkBuilder.build()
}
