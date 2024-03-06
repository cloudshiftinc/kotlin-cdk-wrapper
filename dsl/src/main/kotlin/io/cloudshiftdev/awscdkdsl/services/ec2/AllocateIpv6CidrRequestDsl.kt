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
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.AllocateIpv6CidrRequest
import software.amazon.awscdk.services.ec2.AllocatedSubnet

/**
 * Request for subnet IPv6 CIDRs to be allocated for a VPC.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AllocateIpv6CidrRequest allocateIpv6CidrRequest = AllocateIpv6CidrRequest.builder()
 * .allocatedSubnets(List.of(AllocatedSubnet.builder()
 * .cidr("cidr")
 * // the properties below are optional
 * .ipv6Cidr("ipv6Cidr")
 * .build()))
 * .ipv6Cidrs(List.of("ipv6Cidrs"))
 * .build();
 * ```
 */
@CdkDslMarker
public class AllocateIpv6CidrRequestDsl {
    private val cdkBuilder: AllocateIpv6CidrRequest.Builder = AllocateIpv6CidrRequest.builder()

    private val _allocatedSubnets: MutableList<AllocatedSubnet> = mutableListOf()

    private val _ipv6Cidrs: MutableList<String> = mutableListOf()

    /** @param allocatedSubnets List of subnets allocated with IPv4 CIDRs. */
    public fun allocatedSubnets(allocatedSubnets: AllocatedSubnetDsl.() -> Unit) {
        _allocatedSubnets.add(AllocatedSubnetDsl().apply(allocatedSubnets).build())
    }

    /** @param allocatedSubnets List of subnets allocated with IPv4 CIDRs. */
    public fun allocatedSubnets(allocatedSubnets: Collection<AllocatedSubnet>) {
        _allocatedSubnets.addAll(allocatedSubnets)
    }

    /** @param ipv6Cidrs The IPv6 CIDRs to be allocated to the subnets. */
    public fun ipv6Cidrs(vararg ipv6Cidrs: String) {
        _ipv6Cidrs.addAll(listOf(*ipv6Cidrs))
    }

    /** @param ipv6Cidrs The IPv6 CIDRs to be allocated to the subnets. */
    public fun ipv6Cidrs(ipv6Cidrs: Collection<String>) {
        _ipv6Cidrs.addAll(ipv6Cidrs)
    }

    public fun build(): AllocateIpv6CidrRequest {
        if (_allocatedSubnets.isNotEmpty()) cdkBuilder.allocatedSubnets(_allocatedSubnets)
        if (_ipv6Cidrs.isNotEmpty()) cdkBuilder.ipv6Cidrs(_ipv6Cidrs)
        return cdkBuilder.build()
    }
}
