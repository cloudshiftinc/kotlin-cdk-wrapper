@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnVPCConnection

/**
 * The structure that contains information about a network interface.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * NetworkInterfaceProperty networkInterfaceProperty = NetworkInterfaceProperty.builder()
 * .availabilityZone("availabilityZone")
 * .errorMessage("errorMessage")
 * .networkInterfaceId("networkInterfaceId")
 * .status("status")
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-vpcconnection-networkinterface.html)
 */
@CdkDslMarker
public class CfnVPCConnectionNetworkInterfacePropertyDsl {
    private val cdkBuilder: CfnVPCConnection.NetworkInterfaceProperty.Builder =
        CfnVPCConnection.NetworkInterfaceProperty.builder()

    /** @param availabilityZone The availability zone that the network interface resides in. */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /** @param errorMessage An error message. */
    public fun errorMessage(errorMessage: String) {
        cdkBuilder.errorMessage(errorMessage)
    }

    /** @param networkInterfaceId The network interface ID. */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /** @param status The status of the network interface. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /** @param subnetId The subnet ID associated with the network interface. */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnVPCConnection.NetworkInterfaceProperty = cdkBuilder.build()
}
