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

package io.cloudshiftdev.awscdkdsl.services.redshiftserverless

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup

/**
 * Contains information about a network interface in an Amazon Redshift Serverless managed VPC
 * endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshiftserverless.*;
 * NetworkInterfaceProperty networkInterfaceProperty = NetworkInterfaceProperty.builder()
 * .availabilityZone("availabilityZone")
 * .networkInterfaceId("networkInterfaceId")
 * .privateIpAddress("privateIpAddress")
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-networkinterface.html)
 */
@CdkDslMarker
public class CfnWorkgroupNetworkInterfacePropertyDsl {
    private val cdkBuilder: CfnWorkgroup.NetworkInterfaceProperty.Builder =
        CfnWorkgroup.NetworkInterfaceProperty.builder()

    /** @param availabilityZone The availability Zone. */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /** @param networkInterfaceId The unique identifier of the network interface. */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /** @param privateIpAddress The IPv4 address of the network interface within the subnet. */
    public fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
    }

    /** @param subnetId The unique identifier of the subnet. */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnWorkgroup.NetworkInterfaceProperty = cdkBuilder.build()
}
