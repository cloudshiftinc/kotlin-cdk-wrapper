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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnVPCConnection
import kotlin.String

@CdkDslMarker
public class CfnVPCConnectionNetworkInterfacePropertyDsl {
    private val cdkBuilder: CfnVPCConnection.NetworkInterfaceProperty.Builder =
        CfnVPCConnection.NetworkInterfaceProperty.builder()

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun errorMessage(errorMessage: String) {
        cdkBuilder.errorMessage(errorMessage)
    }

    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnVPCConnection.NetworkInterfaceProperty = cdkBuilder.build()
}
