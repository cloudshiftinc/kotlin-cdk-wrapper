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
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.PoolState
import software.amazon.awscdk.services.autoscaling.WarmPoolProps

/**
 * Properties for a warm pool.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * AutoScalingGroup autoScalingGroup;
 * WarmPoolProps warmPoolProps = WarmPoolProps.builder()
 * .autoScalingGroup(autoScalingGroup)
 * // the properties below are optional
 * .maxGroupPreparedCapacity(123)
 * .minSize(123)
 * .poolState(PoolState.HIBERNATED)
 * .reuseOnScaleIn(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class WarmPoolPropsDsl {
    private val cdkBuilder: WarmPoolProps.Builder = WarmPoolProps.builder()

    /** @param autoScalingGroup The Auto Scaling group to add the warm pool to. */
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
        cdkBuilder.autoScalingGroup(autoScalingGroup)
    }

    /**
     * @param maxGroupPreparedCapacity The maximum number of instances that are allowed to be in the
     *   warm pool or in any state except Terminated for the Auto Scaling group. If the value is not
     *   specified, Amazon EC2 Auto Scaling launches and maintains the difference between the
     *   group's maximum capacity and its desired capacity.
     */
    public fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number) {
        cdkBuilder.maxGroupPreparedCapacity(maxGroupPreparedCapacity)
    }

    /** @param minSize The minimum number of instances to maintain in the warm pool. */
    public fun minSize(minSize: Number) {
        cdkBuilder.minSize(minSize)
    }

    /**
     * @param poolState The instance state to transition to after the lifecycle actions are
     *   complete.
     */
    public fun poolState(poolState: PoolState) {
        cdkBuilder.poolState(poolState)
    }

    /**
     * @param reuseOnScaleIn Indicates whether instances in the Auto Scaling group can be returned
     *   to the warm pool on scale in. If the value is not specified, instances in the Auto Scaling
     *   group will be terminated when the group scales in.
     */
    public fun reuseOnScaleIn(reuseOnScaleIn: Boolean) {
        cdkBuilder.reuseOnScaleIn(reuseOnScaleIn)
    }

    public fun build(): WarmPoolProps = cdkBuilder.build()
}
