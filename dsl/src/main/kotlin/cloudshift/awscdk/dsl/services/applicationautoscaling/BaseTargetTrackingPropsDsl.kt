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

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps

/**
 * Base interface for target tracking props.
 *
 * Contains the attributes that are common to target tracking policies, except the ones relating to
 * the metric and to the scalable target.
 *
 * This interface is reused by more specific target tracking props objects in other services.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.applicationautoscaling.*;
 * BaseTargetTrackingProps baseTargetTrackingProps = BaseTargetTrackingProps.builder()
 * .disableScaleIn(false)
 * .policyName("policyName")
 * .scaleInCooldown(Duration.minutes(30))
 * .scaleOutCooldown(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class BaseTargetTrackingPropsDsl {
    private val cdkBuilder: BaseTargetTrackingProps.Builder = BaseTargetTrackingProps.builder()

    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     *   If the value is true, scale in is disabled and the target tracking policy won't remove
     *   capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking
     *   policy can remove capacity from the scalable resource.
     */
    public fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
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

    public fun build(): BaseTargetTrackingProps = cdkBuilder.build()
}
