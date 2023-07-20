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

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
import kotlin.String

@CdkDslMarker
public class CfnConfigurationSetEventDestinationPinpointDestinationPropertyDsl {
    private val cdkBuilder: CfnConfigurationSetEventDestination.PinpointDestinationProperty.Builder =
        CfnConfigurationSetEventDestination.PinpointDestinationProperty.builder()

    public fun applicationArn(applicationArn: String) {
        cdkBuilder.applicationArn(applicationArn)
    }

    public fun build(): CfnConfigurationSetEventDestination.PinpointDestinationProperty =
        cdkBuilder.build()
}
