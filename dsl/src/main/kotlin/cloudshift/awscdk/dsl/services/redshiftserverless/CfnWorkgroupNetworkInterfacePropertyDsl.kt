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

package cloudshift.awscdk.dsl.services.redshiftserverless

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup
import kotlin.String

@CdkDslMarker
public class CfnWorkgroupNetworkInterfacePropertyDsl {
    private val cdkBuilder: CfnWorkgroup.NetworkInterfaceProperty.Builder =
        CfnWorkgroup.NetworkInterfaceProperty.builder()

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

    public fun build(): CfnWorkgroup.NetworkInterfaceProperty = cdkBuilder.build()
}
