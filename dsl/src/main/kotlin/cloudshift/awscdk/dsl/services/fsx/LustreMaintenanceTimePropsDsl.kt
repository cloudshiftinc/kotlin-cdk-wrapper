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

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps
import software.amazon.awscdk.services.fsx.Weekday
import kotlin.Number

@CdkDslMarker
public class LustreMaintenanceTimePropsDsl {
    private val cdkBuilder: LustreMaintenanceTimeProps.Builder = LustreMaintenanceTimeProps.builder()

    public fun day(day: Weekday) {
        cdkBuilder.day(day)
    }

    public fun hour(hour: Number) {
        cdkBuilder.hour(hour)
    }

    public fun minute(minute: Number) {
        cdkBuilder.minute(minute)
    }

    public fun build(): LustreMaintenanceTimeProps = cdkBuilder.build()
}
