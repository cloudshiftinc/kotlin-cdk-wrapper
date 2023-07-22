@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps
import software.amazon.awscdk.services.autoscaling.PredefinedMetric
import software.amazon.awscdk.services.cloudwatch.IMetric

@CdkDslMarker
public class BasicTargetTrackingScalingPolicyPropsDsl {
  private val cdkBuilder: BasicTargetTrackingScalingPolicyProps.Builder =
      BasicTargetTrackingScalingPolicyProps.builder()

  /**
   * @param cooldown Period after a scaling completes before another scaling activity can start.
   */
  public fun cooldown(cooldown: Duration) {
    cdkBuilder.cooldown(cooldown)
  }

  /**
   * @param customMetric A custom metric for application autoscaling.
   * The metric must track utilization. Scaling out will happen if the metric is higher than
   * the target value, scaling in will happen in the metric is lower than the target value.
   *
   * Exactly one of customMetric or predefinedMetric must be specified.
   */
  public fun customMetric(customMetric: IMetric) {
    cdkBuilder.customMetric(customMetric)
  }

  /**
   * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
   * If the value is true, scale in is disabled and the target tracking policy
   * won't remove capacity from the autoscaling group. Otherwise, scale in is
   * enabled and the target tracking policy can remove capacity from the
   * group.
   */
  public fun disableScaleIn(disableScaleIn: Boolean) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  /**
   * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send metrics
   * to CloudWatch.
   */
  public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
    cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
  }

  /**
   * @param predefinedMetric A predefined metric for application autoscaling.
   * The metric must track utilization. Scaling out will happen if the metric is higher than
   * the target value, scaling in will happen in the metric is lower than the target value.
   *
   * Exactly one of customMetric or predefinedMetric must be specified.
   */
  public fun predefinedMetric(predefinedMetric: PredefinedMetric) {
    cdkBuilder.predefinedMetric(predefinedMetric)
  }

  /**
   * @param resourceLabel The resource label associated with the predefined metric.
   * Should be supplied if the predefined metric is ALBRequestCountPerTarget, and the
   * format should be:
   *
   * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>
   */
  public fun resourceLabel(resourceLabel: String) {
    cdkBuilder.resourceLabel(resourceLabel)
  }

  /**
   * @param targetValue The target value for the metric. 
   */
  public fun targetValue(targetValue: Number) {
    cdkBuilder.targetValue(targetValue)
  }

  public fun build(): BasicTargetTrackingScalingPolicyProps = cdkBuilder.build()
}
