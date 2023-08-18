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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps

/**
 * Properties for enabling scaling based on network utilization.
 *
 * Example:
 * ```
 * AutoScalingGroup autoScalingGroup;
 * autoScalingGroup.scaleOnIncomingBytes("LimitIngressPerInstance",
 * NetworkUtilizationScalingProps.builder()
 * .targetBytesPerSecond(10 * 1024 * 1024)
 * .build());
 * autoScalingGroup.scaleOnOutgoingBytes("LimitEgressPerInstance",
 * NetworkUtilizationScalingProps.builder()
 * .targetBytesPerSecond(10 * 1024 * 1024)
 * .build());
 * ```
 */
@CdkDslMarker
public class NetworkUtilizationScalingPropsDsl {
    private val cdkBuilder: NetworkUtilizationScalingProps.Builder =
        NetworkUtilizationScalingProps.builder()

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

    /** @param targetBytesPerSecond Target average bytes/seconds on each instance. */
    public fun targetBytesPerSecond(targetBytesPerSecond: Number) {
        cdkBuilder.targetBytesPerSecond(targetBytesPerSecond)
    }

    public fun build(): NetworkUtilizationScalingProps = cdkBuilder.build()
}
