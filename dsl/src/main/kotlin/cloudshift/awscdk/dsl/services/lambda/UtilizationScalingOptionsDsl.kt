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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.UtilizationScalingOptions

/**
 * Options for enabling Lambda utilization tracking.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.autoscaling.*;
 * Function fn;
 * Alias alias = fn.addAlias("prod");
 * // Create AutoScaling target
 * IScalableFunctionAttribute as =
 * alias.addAutoScaling(AutoScalingOptions.builder().maxCapacity(50).build());
 * // Configure Target Tracking
 * as.scaleOnUtilization(UtilizationScalingOptions.builder()
 * .utilizationTarget(0.5)
 * .build());
 * // Configure Scheduled Scaling
 * as.scaleOnSchedule("ScaleUpInTheMorning", ScalingSchedule.builder()
 * .schedule(Schedule.cron(CronOptions.builder().hour("8").minute("0").build()))
 * .minCapacity(20)
 * .build());
 * ```
 */
@CdkDslMarker
public class UtilizationScalingOptionsDsl {
    private val cdkBuilder: UtilizationScalingOptions.Builder = UtilizationScalingOptions.builder()

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

    /**
     * @param utilizationTarget Utilization target for the attribute. For example, .5 indicates that
     *   50 percent of allocated provisioned concurrency is in use.
     */
    public fun utilizationTarget(utilizationTarget: Number) {
        cdkBuilder.utilizationTarget(utilizationTarget)
    }

    public fun build(): UtilizationScalingOptions = cdkBuilder.build()
}
