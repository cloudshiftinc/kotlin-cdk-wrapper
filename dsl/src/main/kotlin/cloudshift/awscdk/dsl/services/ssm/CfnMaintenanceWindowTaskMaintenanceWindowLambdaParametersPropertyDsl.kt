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
public class CfnMaintenanceWindowTaskMaintenanceWindowLambdaParametersPropertyDsl {
    private val cdkBuilder: CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty.Builder =
        CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty.builder()

    public fun clientContext(clientContext: String) {
        cdkBuilder.clientContext(clientContext)
    }

    public fun payload(payload: String) {
        cdkBuilder.payload(payload)
    }

    public fun qualifier(qualifier: String) {
        cdkBuilder.qualifier(qualifier)
    }

    public fun build(): CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty =
        cdkBuilder.build()
}
