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
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask
import kotlin.String

@CdkDslMarker
public class CfnMaintenanceWindowTaskMaintenanceWindowStepFunctionsParametersPropertyDsl {
    private val cdkBuilder:
        CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty.Builder =
        CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty.builder()

    public fun input(input: String) {
        cdkBuilder.input(input)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty =
        cdkBuilder.build()
}
