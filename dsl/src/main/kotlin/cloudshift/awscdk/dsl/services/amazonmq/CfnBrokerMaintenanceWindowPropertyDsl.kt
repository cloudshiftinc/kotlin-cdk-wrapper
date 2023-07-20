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

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.amazonmq.CfnBroker
import kotlin.String

@CdkDslMarker
public class CfnBrokerMaintenanceWindowPropertyDsl {
    private val cdkBuilder: CfnBroker.MaintenanceWindowProperty.Builder =
        CfnBroker.MaintenanceWindowProperty.builder()

    public fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
    }

    public fun timeOfDay(timeOfDay: String) {
        cdkBuilder.timeOfDay(timeOfDay)
    }

    public fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
    }

    public fun build(): CfnBroker.MaintenanceWindowProperty = cdkBuilder.build()
}
