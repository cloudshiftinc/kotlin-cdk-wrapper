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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnMaintenanceWindowTaskMaintenanceWindowAutomationParametersPropertyDsl {
    private val cdkBuilder:
        CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty.Builder =
        CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty.builder()

    public fun documentVersion(documentVersion: String) {
        cdkBuilder.documentVersion(documentVersion)
    }

    public fun parameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.parameters(builder.map)
    }

    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    public fun build(): CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty =
        cdkBuilder.build()
}
