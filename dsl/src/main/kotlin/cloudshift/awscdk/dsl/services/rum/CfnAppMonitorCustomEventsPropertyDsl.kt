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

package cloudshift.awscdk.dsl.services.rum

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rum.CfnAppMonitor
import kotlin.String

@CdkDslMarker
public class CfnAppMonitorCustomEventsPropertyDsl {
    private val cdkBuilder: CfnAppMonitor.CustomEventsProperty.Builder =
        CfnAppMonitor.CustomEventsProperty.builder()

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnAppMonitor.CustomEventsProperty = cdkBuilder.build()
}
