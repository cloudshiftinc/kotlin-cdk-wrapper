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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps

/**
 * Base interface for target tracking props.
 *
 * Contains the attributes that are common to target tracking policies, except the ones relating to
 * the metric and to the scalable target.
 *
 * This interface is reused by more specific target tracking props objects.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.autoscaling.*;
 * BaseTargetTrackingProps baseTargetTrackingProps = BaseTargetTrackingProps.builder()
 * .cooldown(Duration.minutes(30))
 * .disableScaleIn(false)
 * .estimatedInstanceWarmup(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class BaseTargetTrackingPropsDsl {
    private val cdkBuilder: BaseTargetTrackingProps.Builder = BaseTargetTrackingProps.builder()

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

    public fun build(): BaseTargetTrackingProps = cdkBuilder.build()
}
