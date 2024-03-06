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
import software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps

/**
 * Properties for defining a `CfnSubnetCidrBlock`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnSubnetCidrBlockProps cfnSubnetCidrBlockProps = CfnSubnetCidrBlockProps.builder()
 * .subnetId("subnetId")
 * // the properties below are optional
 * .ipv6CidrBlock("ipv6CidrBlock")
 * .ipv6IpamPoolId("ipv6IpamPoolId")
 * .ipv6NetmaskLength(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html)
 */
@CdkDslMarker
public class CfnSubnetCidrBlockPropsDsl {
    private val cdkBuilder: CfnSubnetCidrBlockProps.Builder = CfnSubnetCidrBlockProps.builder()

    /** @param ipv6CidrBlock The IPv6 network range for the subnet, in CIDR notation. */
    public fun ipv6CidrBlock(ipv6CidrBlock: String) {
        cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    /** @param ipv6IpamPoolId An IPv6 IPAM pool ID for the subnet. */
    public fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
        cdkBuilder.ipv6IpamPoolId(ipv6IpamPoolId)
    }

    /** @param ipv6NetmaskLength An IPv6 netmask length for the subnet. */
    public fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
        cdkBuilder.ipv6NetmaskLength(ipv6NetmaskLength)
    }

    /** @param subnetId The ID of the subnet. */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnSubnetCidrBlockProps = cdkBuilder.build()
}
