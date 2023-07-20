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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import kotlin.String

@CdkDslMarker
public class CfnApplicationApplicationMaintenanceConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.ApplicationMaintenanceConfigurationProperty.Builder =
        CfnApplication.ApplicationMaintenanceConfigurationProperty.builder()

    public fun applicationMaintenanceWindowStartTime(applicationMaintenanceWindowStartTime: String) {
        cdkBuilder.applicationMaintenanceWindowStartTime(applicationMaintenanceWindowStartTime)
    }

    public fun build(): CfnApplication.ApplicationMaintenanceConfigurationProperty =
        cdkBuilder.build()
}
