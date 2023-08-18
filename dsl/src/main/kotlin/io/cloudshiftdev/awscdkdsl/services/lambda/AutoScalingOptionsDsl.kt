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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.lambda.AutoScalingOptions

/**
 * Properties for enabling Lambda autoscaling.
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
public class AutoScalingOptionsDsl {
    private val cdkBuilder: AutoScalingOptions.Builder = AutoScalingOptions.builder()

    /** @param maxCapacity Maximum capacity to scale to. */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /** @param minCapacity Minimum capacity to scale to. */
    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    public fun build(): AutoScalingOptions = cdkBuilder.build()
}
