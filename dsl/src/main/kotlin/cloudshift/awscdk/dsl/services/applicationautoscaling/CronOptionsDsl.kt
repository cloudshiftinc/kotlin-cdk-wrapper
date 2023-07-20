@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.applicationautoscaling.CronOptions
import kotlin.String

@CdkDslMarker
public class CronOptionsDsl {
    private val cdkBuilder: CronOptions.Builder = CronOptions.builder()

    public fun day(day: String) {
        cdkBuilder.day(day)
    }

    public fun hour(hour: String) {
        cdkBuilder.hour(hour)
    }

    public fun minute(minute: String) {
        cdkBuilder.minute(minute)
    }

    public fun month(month: String) {
        cdkBuilder.month(month)
    }

    public fun weekDay(weekDay: String) {
        cdkBuilder.weekDay(weekDay)
    }

    public fun year(year: String) {
        cdkBuilder.year(year)
    }

    public fun build(): CronOptions = cdkBuilder.build()
}
