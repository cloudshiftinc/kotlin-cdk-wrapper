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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.RequestCountScalingProps

/**
 * Properties for enabling scaling based on request/second.
 *
 * Example:
 * ```
 * AutoScalingGroup autoScalingGroup;
 * autoScalingGroup.scaleOnRequestCount("LimitRPS", RequestCountScalingProps.builder()
 * .targetRequestsPerSecond(1000)
 * .build());
 * ```
 */
@CdkDslMarker
public class RequestCountScalingPropsDsl {
    private val cdkBuilder: RequestCountScalingProps.Builder = RequestCountScalingProps.builder()

    /**
     * @param cooldown Period after a scaling completes before another scaling activity can start.
     */
    public fun cooldown(cooldown: Duration) {
        cdkBuilder.cooldown(cooldown)
    }

    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     *   If the value is true, scale in is disabled and the target tracking policy won't remove
     *   capacity from the autoscaling group. Otherwise, scale in is enabled and the target tracking
     *   policy can remove capacity from the group.
     */
    public fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /**
     * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send
     *   metrics to CloudWatch.
     */
    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
        cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
    }

    /** @param targetRequestsPerMinute Target average requests/minute on each instance. */
    public fun targetRequestsPerMinute(targetRequestsPerMinute: Number) {
        cdkBuilder.targetRequestsPerMinute(targetRequestsPerMinute)
    }

    public fun build(): RequestCountScalingProps = cdkBuilder.build()
}
