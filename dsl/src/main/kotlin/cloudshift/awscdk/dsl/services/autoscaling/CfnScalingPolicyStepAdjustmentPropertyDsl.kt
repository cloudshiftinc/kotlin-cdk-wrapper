@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@CdkDslMarker
public class CfnScalingPolicyStepAdjustmentPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.StepAdjustmentProperty.Builder =
      CfnScalingPolicy.StepAdjustmentProperty.builder()

  /**
   * @param metricIntervalLowerBound The lower bound for the difference between the alarm threshold
   * and the CloudWatch metric.
   * If the metric value is above the breach threshold, the lower bound is inclusive (the metric
   * must be greater than or equal to the threshold plus the lower bound). Otherwise, it is exclusive
   * (the metric must be greater than the threshold plus the lower bound). A null value indicates
   * negative infinity.
   */
  public fun metricIntervalLowerBound(metricIntervalLowerBound: Number) {
    cdkBuilder.metricIntervalLowerBound(metricIntervalLowerBound)
  }

  /**
   * @param metricIntervalUpperBound The upper bound for the difference between the alarm threshold
   * and the CloudWatch metric.
   * If the metric value is above the breach threshold, the upper bound is exclusive (the metric
   * must be less than the threshold plus the upper bound). Otherwise, it is inclusive (the metric must
   * be less than or equal to the threshold plus the upper bound). A null value indicates positive
   * infinity.
   *
   * The upper bound must be greater than the lower bound.
   */
  public fun metricIntervalUpperBound(metricIntervalUpperBound: Number) {
    cdkBuilder.metricIntervalUpperBound(metricIntervalUpperBound)
  }

  /**
   * @param scalingAdjustment The amount by which to scale, based on the specified adjustment type. 
   * A positive value adds to the current capacity while a negative number removes from the current
   * capacity. For exact capacity, you must specify a non-negative value.
   */
  public fun scalingAdjustment(scalingAdjustment: Number) {
    cdkBuilder.scalingAdjustment(scalingAdjustment)
  }

  public fun build(): CfnScalingPolicy.StepAdjustmentProperty = cdkBuilder.build()
}
