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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.VpcIpamOptions

/**
 * CIDR Allocated Vpc.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * VpcIpamOptions vpcIpamOptions = VpcIpamOptions.builder()
 * .cidrBlock("cidrBlock")
 * .ipv4IpamPoolId("ipv4IpamPoolId")
 * .ipv4NetmaskLength(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class VpcIpamOptionsDsl {
    private val cdkBuilder: VpcIpamOptions.Builder = VpcIpamOptions.builder()

    /** @param cidrBlock CIDR Block for Vpc. */
    public fun cidrBlock(cidrBlock: String) {
        cdkBuilder.cidrBlock(cidrBlock)
    }

    /** @param ipv4IpamPoolId ipv4 IPAM Pool Id. */
    public fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
        cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    /** @param ipv4NetmaskLength CIDR Mask for Vpc. */
    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
        cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    public fun build(): VpcIpamOptions = cdkBuilder.build()
}
