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
import java.time.Instant
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.Schedule
import software.amazon.awscdk.services.autoscaling.ScheduledAction
import software.constructs.Construct

/**
 * Define a scheduled scaling action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * AutoScalingGroup autoScalingGroup;
 * Schedule schedule;
 * ScheduledAction scheduledAction = ScheduledAction.Builder.create(this, "MyScheduledAction")
 * .autoScalingGroup(autoScalingGroup)
 * .schedule(schedule)
 * // the properties below are optional
 * .desiredCapacity(123)
 * .endTime(new Date())
 * .maxCapacity(123)
 * .minCapacity(123)
 * .startTime(new Date())
 * .timeZone("timeZone")
 * .build();
 * ```
 */
@CdkDslMarker
public class ScheduledActionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ScheduledAction.Builder = ScheduledAction.Builder.create(scope, id)

    /**
     * The AutoScalingGroup to apply the scheduled actions to.
     *
     * @param autoScalingGroup The AutoScalingGroup to apply the scheduled actions to.
     */
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
        cdkBuilder.autoScalingGroup(autoScalingGroup)
    }

    /**
     * The new desired capacity.
     *
     * At the scheduled time, set the desired capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     *
     * Default: - No new desired capacity.
     *
     * @param desiredCapacity The new desired capacity.
     */
    public fun desiredCapacity(desiredCapacity: Number) {
        cdkBuilder.desiredCapacity(desiredCapacity)
    }

    /**
     * When this scheduled action expires.
     *
     * Default: - The rule never expires.
     *
     * @param endTime When this scheduled action expires.
     */
    public fun endTime(endTime: Instant) {
        cdkBuilder.endTime(endTime)
    }

    /**
     * The new maximum capacity.
     *
     * At the scheduled time, set the maximum capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     *
     * Default: - No new maximum capacity.
     *
     * @param maxCapacity The new maximum capacity.
     */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * The new minimum capacity.
     *
     * At the scheduled time, set the minimum capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     *
     * Default: - No new minimum capacity.
     *
     * @param minCapacity The new minimum capacity.
     */
    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * When to perform this action.
     *
     * Supports cron expressions.
     *
     * For more information about cron expressions, see https://en.wikipedia.org/wiki/Cron.
     *
     * @param schedule When to perform this action.
     */
    public fun schedule(schedule: Schedule) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * When this scheduled action becomes active.
     *
     * Default: - The rule is activate immediately.
     *
     * @param startTime When this scheduled action becomes active.
     */
    public fun startTime(startTime: Instant) {
        cdkBuilder.startTime(startTime)
    }

    /**
     * Specifies the time zone for a cron expression.
     *
     * If a time zone is not provided, UTC is used by default.
     *
     * Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone
     * Database (such as Etc/GMT+9 or Pacific/Tahiti).
     *
     * For more information, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones.
     *
     * Default: - UTC
     *
     * @param timeZone Specifies the time zone for a cron expression.
     */
    public fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
    }

    public fun build(): ScheduledAction = cdkBuilder.build()
}
