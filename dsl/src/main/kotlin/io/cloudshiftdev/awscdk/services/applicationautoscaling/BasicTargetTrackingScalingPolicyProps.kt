package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.IMetric
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

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
   * Default: - No predefined metrics.
   */
  public fun predefinedMetric(): PredefinedMetric? =
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
     * @param targetValue The target value for the metric. 
     */
    public fun targetValue(targetValue: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder
        =
        software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.builder()

    /**
     * @param customMetric A custom metric for application autoscaling.
     * The metric must track utilization. Scaling out will happen if the metric is higher than
     * the target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     */
    override fun customMetric(customMetric: IMetric) {
      cdkBuilder.customMetric(customMetric.let(IMetric::unwrap))
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
      cdkBuilder.predefinedMetric(predefinedMetric.let(PredefinedMetric::unwrap))
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
      cdkBuilder.scaleInCooldown(scaleInCooldown.let(Duration::unwrap))
    }

    /**
     * @param scaleOutCooldown Period after a scale out activity completes before another scale out
     * activity can start.
     */
    override fun scaleOutCooldown(scaleOutCooldown: Duration) {
      cdkBuilder.scaleOutCooldown(scaleOutCooldown.let(Duration::unwrap))
    }

    /**
     * @param targetValue The target value for the metric. 
     */
    override fun targetValue(targetValue: Number) {
      cdkBuilder.targetValue(targetValue)
    }

    public fun build():
        software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps,
  ) : BasicTargetTrackingScalingPolicyProps {
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
     * The target value for the metric.
     */
    override fun targetValue(): Number = unwrap(this).getTargetValue()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        BasicTargetTrackingScalingPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps):
        BasicTargetTrackingScalingPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BasicTargetTrackingScalingPolicyProps):
        software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps
        = (wrapped as Wrapper).cdkObject
  }
}
