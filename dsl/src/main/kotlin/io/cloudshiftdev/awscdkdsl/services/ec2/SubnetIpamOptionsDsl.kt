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
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.AllocatedSubnet
import software.amazon.awscdk.services.ec2.SubnetIpamOptions

/**
 * CIDR Allocated Subnets.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * SubnetIpamOptions subnetIpamOptions = SubnetIpamOptions.builder()
 * .allocatedSubnets(List.of(AllocatedSubnet.builder()
 * .cidr("cidr")
 * // the properties below are optional
 * .ipv6Cidr("ipv6Cidr")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class SubnetIpamOptionsDsl {
    private val cdkBuilder: SubnetIpamOptions.Builder = SubnetIpamOptions.builder()

    private val _allocatedSubnets: MutableList<AllocatedSubnet> = mutableListOf()

    /** @param allocatedSubnets CIDR Allocations for Subnets. */
    public fun allocatedSubnets(allocatedSubnets: AllocatedSubnetDsl.() -> Unit) {
        _allocatedSubnets.add(AllocatedSubnetDsl().apply(allocatedSubnets).build())
    }

    /** @param allocatedSubnets CIDR Allocations for Subnets. */
    public fun allocatedSubnets(allocatedSubnets: Collection<AllocatedSubnet>) {
        _allocatedSubnets.addAll(allocatedSubnets)
    }

    public fun build(): SubnetIpamOptions {
        if (_allocatedSubnets.isNotEmpty()) cdkBuilder.allocatedSubnets(_allocatedSubnets)
        return cdkBuilder.build()
    }
}
