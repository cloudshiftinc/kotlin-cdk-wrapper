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
import software.amazon.awscdk.services.ec2.AllocatedSubnet

/**
 * CIDR Allocated Subnet.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AllocatedSubnet allocatedSubnet = AllocatedSubnet.builder()
 * .cidr("cidr")
 * // the properties below are optional
 * .ipv6Cidr("ipv6Cidr")
 * .build();
 * ```
 */
@CdkDslMarker
public class AllocatedSubnetDsl {
    private val cdkBuilder: AllocatedSubnet.Builder = AllocatedSubnet.builder()

    /** @param cidr IPv4 CIDR Allocations for a Subnet. Note this is specific to the IPv4 CIDR. */
    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    /**
     * @param ipv6Cidr IPv6 CIDR Allocations for a Subnet. Note this is specific to the IPv6 CIDR.
     */
    public fun ipv6Cidr(ipv6Cidr: String) {
        cdkBuilder.ipv6Cidr(ipv6Cidr)
    }

    public fun build(): AllocatedSubnet = cdkBuilder.build()
}
