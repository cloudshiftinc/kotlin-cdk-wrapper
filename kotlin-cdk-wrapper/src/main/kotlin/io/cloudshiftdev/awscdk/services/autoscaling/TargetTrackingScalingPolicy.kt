@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.IMetric
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * AutoScalingGroup autoScalingGroup;
 * Metric metric;
 * TargetTrackingScalingPolicy targetTrackingScalingPolicy =
 * TargetTrackingScalingPolicy.Builder.create(this, "MyTargetTrackingScalingPolicy")
 * .autoScalingGroup(autoScalingGroup)
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
public open class TargetTrackingScalingPolicy(
  cdkObject: software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TargetTrackingScalingPolicyProps,
  ) :
      this(software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(TargetTrackingScalingPolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TargetTrackingScalingPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, TargetTrackingScalingPolicyProps(props)
  )

  /**
   * ARN of the scaling policy.
   */
  public open fun scalingPolicyArn(): String = unwrap(this).getScalingPolicyArn()

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.autoscaling.TargetTrackingScalingPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoScalingGroup 
     */
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup)

    /**
     * Period after a scaling completes before another scaling activity can start.
     *
     * Default: - The default cooldown configured on the AutoScalingGroup.
     *
     * @param cooldown Period after a scaling completes before another scaling activity can start. 
     */
    public fun cooldown(cooldown: Duration)

    /**
     * A custom metric for application autoscaling.
     *
     * The metric must track utilization. Scaling out will happen if the metric is higher than
     * the target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     *
     * Default: - No custom metric.
     *
     * @param customMetric A custom metric for application autoscaling. 
     */
    public fun customMetric(customMetric: IMetric)

    /**
     * Indicates whether scale in by the target tracking policy is disabled.
     *
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the autoscaling group. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * group.
     *
     * Default: false
     *
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled. 
     */
    public fun disableScaleIn(disableScaleIn: Boolean)

    /**
     * Estimated time until a newly launched instance can send metrics to CloudWatch.
     *
     * Default: - Same as the cooldown.
     *
     * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send
     * metrics to CloudWatch. 
     */
    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration)

    /**
     * A predefined metric for application autoscaling.
     *
     * The metric must track utilization. Scaling out will happen if the metric is higher than
     * the target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     *
     * Default: - No predefined metric.
     *
     * @param predefinedMetric A predefined metric for application autoscaling. 
     */
    public fun predefinedMetric(predefinedMetric: PredefinedMetric)

    /**
     * The resource label associated with the predefined metric.
     *
     * Should be supplied if the predefined metric is ALBRequestCountPerTarget, and the
     * format should be:
     *
     * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>
     *
     * Default: - No resource label.
     *
     * @param resourceLabel The resource label associated with the predefined metric. 
     */
    public fun resourceLabel(resourceLabel: String)

    /**
     * The target value for the metric.
     *
     * @param targetValue The target value for the metric. 
     */
    public fun targetValue(targetValue: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy.Builder =
        software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy.Builder.create(scope,
        id)

    /**
     * @param autoScalingGroup 
     */
    override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup.Companion::unwrap))
    }

    /**
     * Period after a scaling completes before another scaling activity can start.
     *
     * Default: - The default cooldown configured on the AutoScalingGroup.
     *
     * @param cooldown Period after a scaling completes before another scaling activity can start. 
     */
    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration.Companion::unwrap))
    }

    /**
     * A custom metric for application autoscaling.
     *
     * The metric must track utilization. Scaling out will happen if the metric is higher than
     * the target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     *
     * Default: - No custom metric.
     *
     * @param customMetric A custom metric for application autoscaling. 
     */
    override fun customMetric(customMetric: IMetric) {
      cdkBuilder.customMetric(customMetric.let(IMetric.Companion::unwrap))
    }

    /**
     * Indicates whether scale in by the target tracking policy is disabled.
     *
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the autoscaling group. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * group.
     *
     * Default: false
     *
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled. 
     */
    override fun disableScaleIn(disableScaleIn: Boolean) {
      cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /**
     * Estimated time until a newly launched instance can send metrics to CloudWatch.
     *
     * Default: - Same as the cooldown.
     *
     * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send
     * metrics to CloudWatch. 
     */
    override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
      cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup.let(Duration.Companion::unwrap))
    }

    /**
     * A predefined metric for application autoscaling.
     *
     * The metric must track utilization. Scaling out will happen if the metric is higher than
     * the target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     *
     * Default: - No predefined metric.
     *
     * @param predefinedMetric A predefined metric for application autoscaling. 
     */
    override fun predefinedMetric(predefinedMetric: PredefinedMetric) {
      cdkBuilder.predefinedMetric(predefinedMetric.let(PredefinedMetric.Companion::unwrap))
    }

    /**
     * The resource label associated with the predefined metric.
     *
     * Should be supplied if the predefined metric is ALBRequestCountPerTarget, and the
     * format should be:
     *
     * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>
     *
     * Default: - No resource label.
     *
     * @param resourceLabel The resource label associated with the predefined metric. 
     */
    override fun resourceLabel(resourceLabel: String) {
      cdkBuilder.resourceLabel(resourceLabel)
    }

    /**
     * The target value for the metric.
     *
     * @param targetValue The target value for the metric. 
     */
    override fun targetValue(targetValue: Number) {
      cdkBuilder.targetValue(targetValue)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): TargetTrackingScalingPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return TargetTrackingScalingPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy):
        TargetTrackingScalingPolicy = TargetTrackingScalingPolicy(cdkObject)

    internal fun unwrap(wrapped: TargetTrackingScalingPolicy):
        software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy = wrapped.cdkObject
        as software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy
  }
}
