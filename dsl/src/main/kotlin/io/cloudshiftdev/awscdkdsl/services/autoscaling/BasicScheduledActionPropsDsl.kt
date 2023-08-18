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
import software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps
import software.amazon.awscdk.services.autoscaling.Schedule

/**
 * Properties for a scheduled scaling action.
 *
 * Example:
 * ```
 * AutoScalingGroup autoScalingGroup;
 * autoScalingGroup.scaleOnSchedule("PrescaleInTheMorning", BasicScheduledActionProps.builder()
 * .schedule(Schedule.cron(CronOptions.builder().hour("8").minute("0").build()))
 * .minCapacity(20)
 * .build());
 * autoScalingGroup.scaleOnSchedule("AllowDownscalingAtNight", BasicScheduledActionProps.builder()
 * .schedule(Schedule.cron(CronOptions.builder().hour("20").minute("0").build()))
 * .minCapacity(1)
 * .build());
 * ```
 */
@CdkDslMarker
public class BasicScheduledActionPropsDsl {
    private val cdkBuilder: BasicScheduledActionProps.Builder = BasicScheduledActionProps.builder()

    /**
     * @param desiredCapacity The new desired capacity. At the scheduled time, set the desired
     *   capacity to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     */
    public fun desiredCapacity(desiredCapacity: Number) {
        cdkBuilder.desiredCapacity(desiredCapacity)
    }

    /** @param endTime When this scheduled action expires. */
    public fun endTime(endTime: Instant) {
        cdkBuilder.endTime(endTime)
    }

    /**
     * @param maxCapacity The new maximum capacity. At the scheduled time, set the maximum capacity
     *   to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param minCapacity The new minimum capacity. At the scheduled time, set the minimum capacity
     *   to the given capacity.
     *
     * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
     */
    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * @param schedule When to perform this action. Supports cron expressions.
     *
     * For more information about cron expressions, see https://en.wikipedia.org/wiki/Cron.
     */
    public fun schedule(schedule: Schedule) {
        cdkBuilder.schedule(schedule)
    }

    /** @param startTime When this scheduled action becomes active. */
    public fun startTime(startTime: Instant) {
        cdkBuilder.startTime(startTime)
    }

    /**
     * @param timeZone Specifies the time zone for a cron expression. If a time zone is not
     *   provided, UTC is used by default.
     *
     * Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone
     * Database (such as Etc/GMT+9 or Pacific/Tahiti).
     *
     * For more information, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones.
     */
    public fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
    }

    public fun build(): BasicScheduledActionProps = cdkBuilder.build()
}
