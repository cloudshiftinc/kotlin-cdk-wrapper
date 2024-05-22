@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.IMetric
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for a Target Tracking policy that include the metric but exclude the target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * Metric metric;
 * BasicTargetTrackingScalingPolicyProps basicTargetTrackingScalingPolicyProps =
 * BasicTargetTrackingScalingPolicyProps.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .cooldown(Duration.minutes(30))
 * .customMetric(metric)
 * .disableScaleIn(false)
 * .estimatedInstanceWarmup(Duration.minutes(30))
 * .predefinedMetric(PredefinedMetric.ASG_AVERAGE_CPU_UTILIZATION)
 * .resourceLabel("resourceLabel")
 * .build();
 * ```
 */
public interface BasicTargetTrackingScalingPolicyProps : BaseTargetTrackingProps {
  /**
   * A custom metric for application autoscaling.
   *
   * The metric must track utilization. Scaling out will happen if the metric is higher than
   * the target value, scaling in will happen in the metric is lower than the target value.
   *
   * Exactly one of customMetric or predefinedMetric must be specified.
   *
   * Default: - No custom metric.
   */
  public fun customMetric(): IMetric? = unwrap(this).getCustomMetric()?.let(IMetric::wrap)

  /**
   * A predefined metric for application autoscaling.
   *
   * The metric must track utilization. Scaling out will happen if the metric is higher than
   * the target value, scaling in will happen in the metric is lower than the target value.
   *
   * Exactly one of customMetric or predefinedMetric must be specified.
   *
   * Default: - No predefined metric.
   */
  public fun predefinedMetric(): PredefinedMetric? =
      unwrap(this).getPredefinedMetric()?.let(PredefinedMetric::wrap)

  /**
   * The resource label associated with the predefined metric.
   *
   * Should be supplied if the predefined metric is ALBRequestCountPerTarget, and the
   * format should be:
   *
   * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>
   *
   * Default: - No resource label.
   */
  public fun resourceLabel(): String? = unwrap(this).getResourceLabel()

  /**
   * The target value for the metric.
   */
  public fun targetValue(): Number

  /**
   * A builder for [BasicTargetTrackingScalingPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cooldown Period after a scaling completes before another scaling activity can start.
     */
    public fun cooldown(cooldown: Duration)

    /**
     * @param customMetric A custom metric for application autoscaling.
     * The metric must track utilization. Scaling out will happen if the metric is higher than
     * the target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     */
    public fun customMetric(customMetric: IMetric)

    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the autoscaling group. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * group.
     */
    public fun disableScaleIn(disableScaleIn: Boolean)

    /**
     * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send
     * metrics to CloudWatch.
     */
    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration)

    /**
     * @param predefinedMetric A predefined metric for application autoscaling.
     * The metric must track utilization. Scaling out will happen if the metric is higher than
     * the target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     */
    public fun predefinedMetric(predefinedMetric: PredefinedMetric)

    /**
     * @param resourceLabel The resource label associated with the predefined metric.
     * Should be supplied if the predefined metric is ALBRequestCountPerTarget, and the
     * format should be:
     *
     * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>
     */
    public fun resourceLabel(resourceLabel: String)

    /**
     * @param targetValue The target value for the metric. 
     */
    public fun targetValue(targetValue: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder =
        software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.builder()

    /**
     * @param cooldown Period after a scaling completes before another scaling activity can start.
     */
    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration.Companion::unwrap))
    }

    /**
     * @param customMetric A custom metric for application autoscaling.
     * The metric must track utilization. Scaling out will happen if the metric is higher than
     * the target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     */
    override fun customMetric(customMetric: IMetric) {
      cdkBuilder.customMetric(customMetric.let(IMetric.Companion::unwrap))
    }

    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the autoscaling group. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * group.
     */
    override fun disableScaleIn(disableScaleIn: Boolean) {
      cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /**
     * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send
     * metrics to CloudWatch.
     */
    override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
      cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup.let(Duration.Companion::unwrap))
    }

    /**
     * @param predefinedMetric A predefined metric for application autoscaling.
     * The metric must track utilization. Scaling out will happen if the metric is higher than
     * the target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     */
    override fun predefinedMetric(predefinedMetric: PredefinedMetric) {
      cdkBuilder.predefinedMetric(predefinedMetric.let(PredefinedMetric.Companion::unwrap))
    }

    /**
     * @param resourceLabel The resource label associated with the predefined metric.
     * Should be supplied if the predefined metric is ALBRequestCountPerTarget, and the
     * format should be:
     *
     * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>
     */
    override fun resourceLabel(resourceLabel: String) {
      cdkBuilder.resourceLabel(resourceLabel)
    }

    /**
     * @param targetValue The target value for the metric. 
     */
    override fun targetValue(targetValue: Number) {
      cdkBuilder.targetValue(targetValue)
    }

    public fun build():
        software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps,
  ) : CdkObject(cdkObject), BasicTargetTrackingScalingPolicyProps {
    /**
     * Period after a scaling completes before another scaling activity can start.
     *
     * Default: - The default cooldown configured on the AutoScalingGroup.
     */
    override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    /**
     * A custom metric for application autoscaling.
     *
     * The metric must track utilization. Scaling out will happen if the metric is higher than
     * the target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     *
     * Default: - No custom metric.
     */
    override fun customMetric(): IMetric? = unwrap(this).getCustomMetric()?.let(IMetric::wrap)

    /**
     * Indicates whether scale in by the target tracking policy is disabled.
     *
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the autoscaling group. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * group.
     *
     * Default: false
     */
    override fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

    /**
     * Estimated time until a newly launched instance can send metrics to CloudWatch.
     *
     * Default: - Same as the cooldown.
     */
    override fun estimatedInstanceWarmup(): Duration? =
        unwrap(this).getEstimatedInstanceWarmup()?.let(Duration::wrap)

    /**
     * A predefined metric for application autoscaling.
     *
     * The metric must track utilization. Scaling out will happen if the metric is higher than
     * the target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     *
     * Default: - No predefined metric.
     */
    override fun predefinedMetric(): PredefinedMetric? =
        unwrap(this).getPredefinedMetric()?.let(PredefinedMetric::wrap)

    /**
     * The resource label associated with the predefined metric.
     *
     * Should be supplied if the predefined metric is ALBRequestCountPerTarget, and the
     * format should be:
     *
     * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>
     *
     * Default: - No resource label.
     */
    override fun resourceLabel(): String? = unwrap(this).getResourceLabel()

    /**
     * The target value for the metric.
     */
    override fun targetValue(): Number = unwrap(this).getTargetValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        BasicTargetTrackingScalingPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps):
        BasicTargetTrackingScalingPolicyProps = CdkObjectWrappers.wrap(cdkObject) as?
        BasicTargetTrackingScalingPolicyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BasicTargetTrackingScalingPolicyProps):
        software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps
  }
}
