@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.ecs.TrackCustomMetricProps

/**
 * The properties for enabling target tracking scaling based on a custom CloudWatch metric.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.cloudwatch.*;
 * import software.amazon.awscdk.services.ecs.*;
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
@CdkDslMarker
public class TrackCustomMetricPropsDsl {
    private val cdkBuilder: TrackCustomMetricProps.Builder = TrackCustomMetricProps.builder()

    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     *   If the value is true, scale in is disabled and the target tracking policy won't remove
     *   capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking
     *   policy can remove capacity from the scalable resource.
     */
    public fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /**
     * @param metric The custom CloudWatch metric to track. The metric must represent utilization;
     *   that is, you will always get the following behavior:
     * * metric &gt; targetValue =&gt; scale out
     * * metric &lt; targetValue =&gt; scale in
     */
    public fun metric(metric: IMetric) {
        cdkBuilder.metric(metric)
    }

    /** @param policyName A name for the scaling policy. */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    /**
     * @param scaleInCooldown Period after a scale in activity completes before another scale in
     *   activity can start.
     */
    public fun scaleInCooldown(scaleInCooldown: Duration) {
        cdkBuilder.scaleInCooldown(scaleInCooldown)
    }

    /**
     * @param scaleOutCooldown Period after a scale out activity completes before another scale out
     *   activity can start.
     */
    public fun scaleOutCooldown(scaleOutCooldown: Duration) {
        cdkBuilder.scaleOutCooldown(scaleOutCooldown)
    }

    /** @param targetValue The target value for the custom CloudWatch metric. */
    public fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun build(): TrackCustomMetricProps = cdkBuilder.build()
}
