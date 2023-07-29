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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CronOptions

/**
 * Options to configure a cron expression.
 *
 * All fields are strings so you can use complex expressions. Absence of a field implies '*' or '?',
 * whichever one is appropriate.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.events.*;
 * import software.amazon.awscdk.services.events.targets.*;
 * Function fn;
 * Rule rule = Rule.Builder.create(this, "Schedule Rule")
 * .schedule(Schedule.cron(CronOptions.builder().minute("0").hour("4").build()))
 * .build();
 * rule.addTarget(new LambdaFunction(fn));
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/scheduled-events.html#cron-expressions)
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

    /** @param year The year to run this rule at. */
    public fun year(year: String) {
        cdkBuilder.year(year)
    }

    public fun build(): CronOptions = cdkBuilder.build()
}
