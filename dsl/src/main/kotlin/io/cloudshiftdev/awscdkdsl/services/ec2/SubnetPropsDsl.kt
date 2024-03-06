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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.SubnetProps

/**
 * Specify configuration parameters for a VPC subnet.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * SubnetProps subnetProps = SubnetProps.builder()
 * .availabilityZone("availabilityZone")
 * .cidrBlock("cidrBlock")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .assignIpv6AddressOnCreation(false)
 * .ipv6CidrBlock("ipv6CidrBlock")
 * .mapPublicIpOnLaunch(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class SubnetPropsDsl {
    private val cdkBuilder: SubnetProps.Builder = SubnetProps.builder()

    /**
     * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this
     *   subnet receives an IPv6 address. If you specify AssignIpv6AddressOnCreation, you must also
     *   specify Ipv6CidrBlock.
     */
    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean) {
        cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation)
    }

    /** @param availabilityZone The availability zone for the subnet. */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /** @param cidrBlock The CIDR notation for this subnet. */
    public fun cidrBlock(cidrBlock: String) {
        cdkBuilder.cidrBlock(cidrBlock)
    }

    /**
     * @param ipv6CidrBlock The IPv6 CIDR block. If you specify AssignIpv6AddressOnCreation, you
     *   must also specify Ipv6CidrBlock.
     */
    public fun ipv6CidrBlock(ipv6CidrBlock: String) {
        cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    /**
     * @param mapPublicIpOnLaunch Controls if a public IP is associated to an instance at launch.
     */
    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
        cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    /** @param vpcId The VPC which this subnet is part of. */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): SubnetProps = cdkBuilder.build()
}
