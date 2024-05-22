@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

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
 * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * Metric metric;
 * ScalableTarget scalableTarget;
 * TargetTrackingScalingPolicy targetTrackingScalingPolicy =
 * TargetTrackingScalingPolicy.Builder.create(this, "MyTargetTrackingScalingPolicy")
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
public open class TargetTrackingScalingPolicy(
  cdkObject: software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TargetTrackingScalingPolicyProps,
  ) :
      this(software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
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
   * [io.cloudshiftdev.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy].
   */
  @CdkDslMarker
  public interface Builder {
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
     * won't remove capacity from the scalable resource. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * scalable resource.
     *
     * Default: false
     *
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled. 
     */
    public fun disableScaleIn(disableScaleIn: Boolean)

    /**
     * A name for the scaling policy.
     *
     * Default: - Automatically generated name.
     *
     * @param policyName A name for the scaling policy. 
     */
    public fun policyName(policyName: String)

    /**
     * A predefined metric for application autoscaling.
     *
     * The metric must track utilization. Scaling out will happen if the metric is higher than
     * the target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     *
     * Default: - No predefined metrics.
     *
     * @param predefinedMetric A predefined metric for application autoscaling. 
     */
    public fun predefinedMetric(predefinedMetric: PredefinedMetric)

    /**
     * Identify the resource associated with the metric type.
     *
     * Only used for predefined metric ALBRequestCountPerTarget.
     *
     * Example value:
     * `app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;`
     *
     * Default: - No resource label.
     *
     * @param resourceLabel Identify the resource associated with the metric type. 
     */
    public fun resourceLabel(resourceLabel: String)

    /**
     * Period after a scale in activity completes before another scale in activity can start.
     *
     * Default: Duration.seconds(300) for the following scalable targets: ECS services,
     * Spot Fleet requests, EMR clusters, AppStream 2.0 fleets, Aurora DB clusters,
     * Amazon SageMaker endpoint variants, Custom resources. For all other scalable
     * targets, the default value is Duration.seconds(0): DynamoDB tables, DynamoDB
     * global secondary indexes, Amazon Comprehend document classification endpoints,
     * Lambda provisioned concurrency
     *
     * @param scaleInCooldown Period after a scale in activity completes before another scale in
     * activity can start. 
     */
    public fun scaleInCooldown(scaleInCooldown: Duration)

    /**
     * Period after a scale out activity completes before another scale out activity can start.
     *
     * Default: Duration.seconds(300) for the following scalable targets: ECS services,
     * Spot Fleet requests, EMR clusters, AppStream 2.0 fleets, Aurora DB clusters,
     * Amazon SageMaker endpoint variants, Custom resources. For all other scalable
     * targets, the default value is Duration.seconds(0): DynamoDB tables, DynamoDB
     * global secondary indexes, Amazon Comprehend document classification endpoints,
     * Lambda provisioned concurrency
     *
     * @param scaleOutCooldown Period after a scale out activity completes before another scale out
     * activity can start. 
     */
    public fun scaleOutCooldown(scaleOutCooldown: Duration)

    /**
     * @param scalingTarget 
     */
    public fun scalingTarget(scalingTarget: IScalableTarget)

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
        software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy.Builder =
        software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy.Builder.create(scope,
        id)

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
     * won't remove capacity from the scalable resource. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * scalable resource.
     *
     * Default: false
     *
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled. 
     */
    override fun disableScaleIn(disableScaleIn: Boolean) {
      cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /**
     * A name for the scaling policy.
     *
     * Default: - Automatically generated name.
     *
     * @param policyName A name for the scaling policy. 
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * A predefined metric for application autoscaling.
     *
     * The metric must track utilization. Scaling out will happen if the metric is higher than
     * the target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     *
     * Default: - No predefined metrics.
     *
     * @param predefinedMetric A predefined metric for application autoscaling. 
     */
    override fun predefinedMetric(predefinedMetric: PredefinedMetric) {
      cdkBuilder.predefinedMetric(predefinedMetric.let(PredefinedMetric.Companion::unwrap))
    }

    /**
     * Identify the resource associated with the metric type.
     *
     * Only used for predefined metric ALBRequestCountPerTarget.
     *
     * Example value:
     * `app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;`
     *
     * Default: - No resource label.
     *
     * @param resourceLabel Identify the resource associated with the metric type. 
     */
    override fun resourceLabel(resourceLabel: String) {
      cdkBuilder.resourceLabel(resourceLabel)
    }

    /**
     * Period after a scale in activity completes before another scale in activity can start.
     *
     * Default: Duration.seconds(300) for the following scalable targets: ECS services,
     * Spot Fleet requests, EMR clusters, AppStream 2.0 fleets, Aurora DB clusters,
     * Amazon SageMaker endpoint variants, Custom resources. For all other scalable
     * targets, the default value is Duration.seconds(0): DynamoDB tables, DynamoDB
     * global secondary indexes, Amazon Comprehend document classification endpoints,
     * Lambda provisioned concurrency
     *
     * @param scaleInCooldown Period after a scale in activity completes before another scale in
     * activity can start. 
     */
    override fun scaleInCooldown(scaleInCooldown: Duration) {
      cdkBuilder.scaleInCooldown(scaleInCooldown.let(Duration.Companion::unwrap))
    }

    /**
     * Period after a scale out activity completes before another scale out activity can start.
     *
     * Default: Duration.seconds(300) for the following scalable targets: ECS services,
     * Spot Fleet requests, EMR clusters, AppStream 2.0 fleets, Aurora DB clusters,
     * Amazon SageMaker endpoint variants, Custom resources. For all other scalable
     * targets, the default value is Duration.seconds(0): DynamoDB tables, DynamoDB
     * global secondary indexes, Amazon Comprehend document classification endpoints,
     * Lambda provisioned concurrency
     *
     * @param scaleOutCooldown Period after a scale out activity completes before another scale out
     * activity can start. 
     */
    override fun scaleOutCooldown(scaleOutCooldown: Duration) {
      cdkBuilder.scaleOutCooldown(scaleOutCooldown.let(Duration.Companion::unwrap))
    }

    /**
     * @param scalingTarget 
     */
    override fun scalingTarget(scalingTarget: IScalableTarget) {
      cdkBuilder.scalingTarget(scalingTarget.let(IScalableTarget.Companion::unwrap))
    }

    /**
     * The target value for the metric.
     *
     * @param targetValue The target value for the metric. 
     */
    override fun targetValue(targetValue: Number) {
      cdkBuilder.targetValue(targetValue)
    }

    public fun build():
        software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy =
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
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy):
        TargetTrackingScalingPolicy = TargetTrackingScalingPolicy(cdkObject)

    internal fun unwrap(wrapped: TargetTrackingScalingPolicy):
        software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy =
        wrapped.cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy
  }
}
