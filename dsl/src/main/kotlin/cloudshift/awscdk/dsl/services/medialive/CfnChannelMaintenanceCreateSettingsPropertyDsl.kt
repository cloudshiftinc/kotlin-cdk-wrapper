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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.String

@CdkDslMarker
public class CfnChannelMaintenanceCreateSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.MaintenanceCreateSettingsProperty.Builder =
        CfnChannel.MaintenanceCreateSettingsProperty.builder()

    public fun maintenanceDay(maintenanceDay: String) {
        cdkBuilder.maintenanceDay(maintenanceDay)
    }

    public fun maintenanceStartTime(maintenanceStartTime: String) {
        cdkBuilder.maintenanceStartTime(maintenanceStartTime)
    }

    public fun build(): CfnChannel.MaintenanceCreateSettingsProperty = cdkBuilder.build()
}
