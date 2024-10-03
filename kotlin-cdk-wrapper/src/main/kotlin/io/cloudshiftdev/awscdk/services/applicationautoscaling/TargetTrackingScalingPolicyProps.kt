@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

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
 * Properties for a concrete TargetTrackingPolicy.
 *
 * Adds the scalingTarget.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * Metric metric;
 * ScalableTarget scalableTarget;
 * TargetTrackingScalingPolicyProps targetTrackingScalingPolicyProps =
 * TargetTrackingScalingPolicyProps.builder()
 * .scalingTarget(scalableTarget)
 * .targetValue(123)
 * // the properties below are optional
 * .customMetric(metric)
 * .disableScaleIn(false)
 * .policyName("policyName")
 * .predefinedMetric(PredefinedMetric.APPSTREAM_AVERAGE_CAPACITY_UTILIZATION)
 * .resourceLabel("resourceLabel")
 * .scaleInCooldown(Duration.minutes(30))
 * .scaleOutCooldown(Duration.minutes(30))
 * .build();
 * ```
 */
public interface TargetTrackingScalingPolicyProps : BasicTargetTrackingScalingPolicyProps {
  /**
   *
   */
  public fun scalingTarget(): IScalableTarget

  /**
   * A builder for [TargetTrackingScalingPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
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
     * won't remove capacity from the scalable resource. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * scalable resource.
     */
    public fun disableScaleIn(disableScaleIn: Boolean)

    /**
     * @param policyName A name for the scaling policy.
     */
    public fun policyName(policyName: String)

    /**
     * @param predefinedMetric A predefined metric for application autoscaling.
     * The metric must track utilization. Scaling out will happen if the metric is higher than
     * the target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     */
    public fun predefinedMetric(predefinedMetric: PredefinedMetric)

    /**
     * @param resourceLabel Identify the resource associated with the metric type.
     * Only used for predefined metric ALBRequestCountPerTarget.
     *
     * Example value:
     * `app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;`
     */
    public fun resourceLabel(resourceLabel: String)

    /**
     * @param scaleInCooldown Period after a scale in activity completes before another scale in
     * activity can start.
     */
    public fun scaleInCooldown(scaleInCooldown: Duration)

    /**
     * @param scaleOutCooldown Period after a scale out activity completes before another scale out
     * activity can start.
     */
    public fun scaleOutCooldown(scaleOutCooldown: Duration)

    /**
     * @param scalingTarget the value to be set. 
     */
    public fun scalingTarget(scalingTarget: IScalableTarget)

    /**
     * @param targetValue The target value for the metric. 
     */
    public fun targetValue(targetValue: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder
        =
        software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.builder()

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
     * won't remove capacity from the scalable resource. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * scalable resource.
     */
    override fun disableScaleIn(disableScaleIn: Boolean) {
      cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /**
     * @param policyName A name for the scaling policy.
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
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
     * @param resourceLabel Identify the resource associated with the metric type.
     * Only used for predefined metric ALBRequestCountPerTarget.
     *
     * Example value:
     * `app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;`
     */
    override fun resourceLabel(resourceLabel: String) {
      cdkBuilder.resourceLabel(resourceLabel)
    }

    /**
     * @param scaleInCooldown Period after a scale in activity completes before another scale in
     * activity can start.
     */
    override fun scaleInCooldown(scaleInCooldown: Duration) {
      cdkBuilder.scaleInCooldown(scaleInCooldown.let(Duration.Companion::unwrap))
    }

    /**
     * @param scaleOutCooldown Period after a scale out activity completes before another scale out
     * activity can start.
     */
    override fun scaleOutCooldown(scaleOutCooldown: Duration) {
      cdkBuilder.scaleOutCooldown(scaleOutCooldown.let(Duration.Companion::unwrap))
    }

    /**
     * @param scalingTarget the value to be set. 
     */
    override fun scalingTarget(scalingTarget: IScalableTarget) {
      cdkBuilder.scalingTarget(scalingTarget.let(IScalableTarget.Companion::unwrap))
    }

    /**
     * @param targetValue The target value for the metric. 
     */
    override fun targetValue(targetValue: Number) {
      cdkBuilder.targetValue(targetValue)
    }

    public fun build():
        software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps,
  ) : CdkObject(cdkObject),
      TargetTrackingScalingPolicyProps {
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
     * won't remove capacity from the scalable resource. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * scalable resource.
     *
     * Default: false
     */
    override fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

    /**
     * A name for the scaling policy.
     *
     * Default: - Automatically generated name.
     */
    override fun policyName(): String? = unwrap(this).getPolicyName()

    /**
     * A predefined metric for application autoscaling.
     *
     * The metric must track utilization. Scaling out will happen if the metric is higher than
     * the target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     *
     * Default: - No predefined metrics.
     */
    override fun predefinedMetric(): PredefinedMetric? =
        unwrap(this).getPredefinedMetric()?.let(PredefinedMetric::wrap)

    /**
     * Identify the resource associated with the metric type.
     *
     * Only used for predefined metric ALBRequestCountPerTarget.
     *
     * Example value:
     * `app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;`
     *
     * Default: - No resource label.
     */
    override fun resourceLabel(): String? = unwrap(this).getResourceLabel()

    /**
     * Period after a scale in activity completes before another scale in activity can start.
     *
     * Default: Duration.seconds(300) for the following scalable targets: ECS services,
     * Spot Fleet requests, EMR clusters, AppStream 2.0 fleets, Aurora DB clusters,
     * Amazon SageMaker endpoint variants, Custom resources. For all other scalable
     * targets, the default value is Duration.seconds(0): DynamoDB tables, DynamoDB
     * global secondary indexes, Amazon Comprehend document classification endpoints,
     * Lambda provisioned concurrency
     */
    override fun scaleInCooldown(): Duration? =
        unwrap(this).getScaleInCooldown()?.let(Duration::wrap)

    /**
     * Period after a scale out activity completes before another scale out activity can start.
     *
     * Default: Duration.seconds(300) for the following scalable targets: ECS services,
     * Spot Fleet requests, EMR clusters, AppStream 2.0 fleets, Aurora DB clusters,
     * Amazon SageMaker endpoint variants, Custom resources. For all other scalable
     * targets, the default value is Duration.seconds(0): DynamoDB tables, DynamoDB
     * global secondary indexes, Amazon Comprehend document classification endpoints,
     * Lambda provisioned concurrency
     */
    override fun scaleOutCooldown(): Duration? =
        unwrap(this).getScaleOutCooldown()?.let(Duration::wrap)

    /**
     *
     */
    override fun scalingTarget(): IScalableTarget =
        unwrap(this).getScalingTarget().let(IScalableTarget::wrap)

    /**
     * The target value for the metric.
     */
    override fun targetValue(): Number = unwrap(this).getTargetValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TargetTrackingScalingPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps):
        TargetTrackingScalingPolicyProps = CdkObjectWrappers.wrap(cdkObject) as?
        TargetTrackingScalingPolicyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: TargetTrackingScalingPolicyProps):
        software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps
  }
}
