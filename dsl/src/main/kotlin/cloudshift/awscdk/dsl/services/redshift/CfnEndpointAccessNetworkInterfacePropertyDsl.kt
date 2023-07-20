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

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.redshift.CfnEndpointAccess
import kotlin.String

@CdkDslMarker
public class CfnEndpointAccessNetworkInterfacePropertyDsl {
    private val cdkBuilder: CfnEndpointAccess.NetworkInterfaceProperty.Builder =
        CfnEndpointAccess.NetworkInterfaceProperty.builder()

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
    }

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnEndpointAccess.NetworkInterfaceProperty = cdkBuilder.build()
}
