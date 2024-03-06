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

package io.cloudshiftdev.awscdkdsl.services.synthetics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.synthetics.CronOptions

/**
 * Options to configure a cron expression.
 *
 * All fields are strings so you can use complex expressions. Absence of a field implies '*' or '?',
 * whichever one is appropriate.
 *
 * Example:
 * ```
 * Schedule schedule = Schedule.cron(CronOptions.builder()
 * .hour("0,8,16")
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_cron.html)
 */
@CdkDslMarker
public class CronOptionsDsl {
    private val cdkBuilder: CronOptions.Builder = CronOptions.builder()

    /** @param day The day of the month to run this rule at. */
    public fun day(day: String) {
        cdkBuilder.day(day)
    }

    /** @param hour The hour to run this rule at. */
    public fun hour(hour: String) {
        cdkBuilder.hour(hour)
    }

    /** @param minute The minute to run this rule at. */
    public fun minute(minute: String) {
        cdkBuilder.minute(minute)
    }

    /** @param month The month to run this rule at. */
    public fun month(month: String) {
        cdkBuilder.month(month)
    }

    /** @param weekDay The day of the week to run this rule at. */
    public fun weekDay(weekDay: String) {
        cdkBuilder.weekDay(weekDay)
    }

    public fun build(): CronOptions = cdkBuilder.build()
}
