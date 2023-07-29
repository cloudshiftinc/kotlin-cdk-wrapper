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

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.fsx.LustreMaintenanceTime
import software.amazon.awscdk.services.fsx.Weekday

/**
 * Class for scheduling a weekly manitenance time.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * LustreMaintenanceTime lustreMaintenanceTime = LustreMaintenanceTime.Builder.create()
 * .day(Weekday.MONDAY)
 * .hour(123)
 * .minute(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class LustreMaintenanceTimeDsl {
    private val cdkBuilder: LustreMaintenanceTime.Builder = LustreMaintenanceTime.Builder.create()

    /**
     * The day of the week for maintenance to be performed.
     *
     * @param day The day of the week for maintenance to be performed.
     */
    public fun day(day: Weekday) {
        cdkBuilder.day(day)
    }

    /**
     * The hour of the day (from 0-24) for maintenance to be performed.
     *
     * @param hour The hour of the day (from 0-24) for maintenance to be performed.
     */
    public fun hour(hour: Number) {
        cdkBuilder.hour(hour)
    }

    /**
     * The minute of the hour (from 0-59) for maintenance to be performed.
     *
     * @param minute The minute of the hour (from 0-59) for maintenance to be performed.
     */
    public fun minute(minute: Number) {
        cdkBuilder.minute(minute)
    }

    public fun build(): LustreMaintenanceTime = cdkBuilder.build()
}
