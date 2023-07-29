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

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amazonmq.CfnBroker

/**
 * The parameters that determine the `WeeklyStartTime` to apply pending updates or patches to the
 * broker.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amazonmq.*;
 * MaintenanceWindowProperty maintenanceWindowProperty = MaintenanceWindowProperty.builder()
 * .dayOfWeek("dayOfWeek")
 * .timeOfDay("timeOfDay")
 * .timeZone("timeZone")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html)
 */
@CdkDslMarker
public class CfnBrokerMaintenanceWindowPropertyDsl {
    private val cdkBuilder: CfnBroker.MaintenanceWindowProperty.Builder =
        CfnBroker.MaintenanceWindowProperty.builder()

    /** @param dayOfWeek The day of the week. */
    public fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
    }

    /** @param timeOfDay The time, in 24-hour format. */
    public fun timeOfDay(timeOfDay: String) {
        cdkBuilder.timeOfDay(timeOfDay)
    }

    /**
     * @param timeZone The time zone, UTC by default, in either the Country/City format, or the UTC
     *   offset format.
     */
    public fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
    }

    public fun build(): CfnBroker.MaintenanceWindowProperty = cdkBuilder.build()
}
