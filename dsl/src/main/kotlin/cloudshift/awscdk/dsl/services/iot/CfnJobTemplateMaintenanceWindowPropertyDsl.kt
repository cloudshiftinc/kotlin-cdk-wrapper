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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnJobTemplate
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnJobTemplateMaintenanceWindowPropertyDsl {
    private val cdkBuilder: CfnJobTemplate.MaintenanceWindowProperty.Builder =
        CfnJobTemplate.MaintenanceWindowProperty.builder()

    public fun durationInMinutes(durationInMinutes: Number) {
        cdkBuilder.durationInMinutes(durationInMinutes)
    }

    public fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
    }

    public fun build(): CfnJobTemplate.MaintenanceWindowProperty = cdkBuilder.build()
}
