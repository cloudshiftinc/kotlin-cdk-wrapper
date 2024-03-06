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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.SubnetConfiguration
import software.amazon.awscdk.services.ec2.SubnetType

/**
 * Specify configuration parameters for a single subnet group in a VPC.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * SubnetConfiguration subnetConfiguration = SubnetConfiguration.builder()
 * .name("name")
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * // the properties below are optional
 * .cidrMask(123)
 * .ipv6AssignAddressOnCreation(false)
 * .mapPublicIpOnLaunch(false)
 * .reserved(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class SubnetConfigurationDsl {
    private val cdkBuilder: SubnetConfiguration.Builder = SubnetConfiguration.builder()

    /**
     * @param cidrMask The number of leading 1 bits in the routing mask. The number of available IP
     *   addresses in each subnet of this group will be equal to `2^(32 - cidrMask) - 2`.
     *
     * Valid values are `16--28`.
     *
     * Note this is specific to IPv4 addresses.
     */
    public fun cidrMask(cidrMask: Number) {
        cdkBuilder.cidrMask(cidrMask)
    }

    /**
     * @param ipv6AssignAddressOnCreation This property is specific to dual stack VPCs. If set to
     *   false, then an IPv6 address will not be automatically assigned.
     *
     * Note this is specific to IPv6 addresses.
     */
    public fun ipv6AssignAddressOnCreation(ipv6AssignAddressOnCreation: Boolean) {
        cdkBuilder.ipv6AssignAddressOnCreation(ipv6AssignAddressOnCreation)
    }

    /**
     * @param mapPublicIpOnLaunch Controls if a public IPv4 address is associated to an instance at
     *   launch. Note this is specific to IPv4 addresses.
     */
    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
        cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    /**
     * @param name Logical name for the subnet group. This name can be used when selecting VPC
     *   subnets to distinguish between different subnet groups of the same type.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param reserved Controls if subnet IP space needs to be reserved. When true, the IP space for
     *   the subnet is reserved but no actual resources are provisioned. This space is only
     *   dependent on the number of availability zones and on `cidrMask` - all other subnet
     *   properties are ignored.
     */
    public fun reserved(reserved: Boolean) {
        cdkBuilder.reserved(reserved)
    }

    /**
     * @param subnetType The type of Subnet to configure. The Subnet type will control the ability
     *   to route and connect to the Internet.
     */
    public fun subnetType(subnetType: SubnetType) {
        cdkBuilder.subnetType(subnetType)
    }

    public fun build(): SubnetConfiguration = cdkBuilder.build()
}
