@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.applicationautoscaling.BaseTargetTrackingProps
import io.cloudshiftdev.awscdk.services.cloudwatch.IMetric
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * The properties for enabling target tracking scaling based on a custom CloudWatch metric.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * Metric metric;
 * TrackCustomMetricProps trackCustomMetricProps = TrackCustomMetricProps.builder()
 * .metric(metric)
 * .targetValue(123)
 * // the properties below are optional
 * .disableScaleIn(false)
 * .policyName("policyName")
 * .scaleInCooldown(Duration.minutes(30))
 * .scaleOutCooldown(Duration.minutes(30))
 * .build();
 * ```
 */
public interface TrackCustomMetricProps : BaseTargetTrackingProps {
  /**
   * The custom CloudWatch metric to track.
   *
   * The metric must represent utilization; that is, you will always get the following behavior:
   *
   * * metric &gt; targetValue =&gt; scale out
   * * metric &lt; targetValue =&gt; scale in
   */
  public fun metric(): IMetric

  /**
   * The target value for the custom CloudWatch metric.
   */
  public fun targetValue(): Number

  /**
   * A builder for [TrackCustomMetricProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the scalable resource. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * scalable resource.
     */
    public fun disableScaleIn(disableScaleIn: Boolean)

    /**
     * @param metric The custom CloudWatch metric to track. 
     * The metric must represent utilization; that is, you will always get the following behavior:
     *
     * * metric &gt; targetValue =&gt; scale out
     * * metric &lt; targetValue =&gt; scale in
     */
    public fun metric(metric: IMetric)

    /**
     * @param policyName A name for the scaling policy.
     */
    public fun policyName(policyName: String)

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
     * @param targetValue The target value for the custom CloudWatch metric. 
     */
    public fun targetValue(targetValue: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder =
        software.amazon.awscdk.services.ecs.TrackCustomMetricProps.builder()

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
     * @param metric The custom CloudWatch metric to track. 
     * The metric must represent utilization; that is, you will always get the following behavior:
     *
     * * metric &gt; targetValue =&gt; scale out
     * * metric &lt; targetValue =&gt; scale in
     */
    override fun metric(metric: IMetric) {
      cdkBuilder.metric(metric.let(IMetric::unwrap))
    }

    /**
     * @param policyName A name for the scaling policy.
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
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
     * @param targetValue The target value for the custom CloudWatch metric. 
     */
    override fun targetValue(targetValue: Number) {
      cdkBuilder.targetValue(targetValue)
    }

    public fun build(): software.amazon.awscdk.services.ecs.TrackCustomMetricProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.TrackCustomMetricProps,
  ) : CdkObject(cdkObject), TrackCustomMetricProps {
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
     * The custom CloudWatch metric to track.
     *
     * The metric must represent utilization; that is, you will always get the following behavior:
     *
     * * metric &gt; targetValue =&gt; scale out
     * * metric &lt; targetValue =&gt; scale in
     */
    override fun metric(): IMetric = unwrap(this).getMetric().let(IMetric::wrap)

    /**
     * A name for the scaling policy.
     *
     * Default: - Automatically generated name.
     */
    override fun policyName(): String? = unwrap(this).getPolicyName()

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
     * The target value for the custom CloudWatch metric.
     */
    override fun targetValue(): Number = unwrap(this).getTargetValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TrackCustomMetricProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.TrackCustomMetricProps):
        TrackCustomMetricProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TrackCustomMetricProps):
        software.amazon.awscdk.services.ecs.TrackCustomMetricProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.TrackCustomMetricProps
  }
}
