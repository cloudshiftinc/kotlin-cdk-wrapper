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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.SubnetAttributes

/**
 * Example:
 * ```
 * // Supply all properties
 * ISubnet subnet1 = Subnet.fromSubnetAttributes(this, "SubnetFromAttributes",
 * SubnetAttributes.builder()
 * .subnetId("s-1234")
 * .availabilityZone("pub-az-4465")
 * .routeTableId("rt-145")
 * .build());
 * // Supply only subnet id
 * ISubnet subnet2 = Subnet.fromSubnetId(this, "SubnetFromId", "s-1234");
 * ```
 */
@CdkDslMarker
public class SubnetAttributesDsl {
    private val cdkBuilder: SubnetAttributes.Builder = SubnetAttributes.builder()

    /** @param availabilityZone The Availability Zone the subnet is located in. */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /** @param ipv4CidrBlock The IPv4 CIDR block associated with the subnet. */
    public fun ipv4CidrBlock(ipv4CidrBlock: String) {
        cdkBuilder.ipv4CidrBlock(ipv4CidrBlock)
    }

    /** @param routeTableId The ID of the route table for this particular subnet. */
    public fun routeTableId(routeTableId: String) {
        cdkBuilder.routeTableId(routeTableId)
    }

    /** @param subnetId The subnetId for this particular subnet. */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): SubnetAttributes = cdkBuilder.build()
}
