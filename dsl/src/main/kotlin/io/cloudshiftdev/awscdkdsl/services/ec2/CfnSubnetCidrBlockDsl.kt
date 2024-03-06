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
import software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock
import software.constructs.Construct

/**
 * Associates a CIDR block with your subnet.
 *
 * You can associate a single IPv6 CIDR block with your subnet.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnSubnetCidrBlock cfnSubnetCidrBlock = CfnSubnetCidrBlock.Builder.create(this,
 * "MyCfnSubnetCidrBlock")
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
public class CfnSubnetCidrBlockDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSubnetCidrBlock.Builder =
        CfnSubnetCidrBlock.Builder.create(scope, id)

    /**
     * The IPv6 network range for the subnet, in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6cidrblock)
     *
     * @param ipv6CidrBlock The IPv6 network range for the subnet, in CIDR notation.
     */
    public fun ipv6CidrBlock(ipv6CidrBlock: String) {
        cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    /**
     * An IPv6 IPAM pool ID for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6ipampoolid)
     *
     * @param ipv6IpamPoolId An IPv6 IPAM pool ID for the subnet.
     */
    public fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
        cdkBuilder.ipv6IpamPoolId(ipv6IpamPoolId)
    }

    /**
     * An IPv6 netmask length for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6netmasklength)
     *
     * @param ipv6NetmaskLength An IPv6 netmask length for the subnet.
     */
    public fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
        cdkBuilder.ipv6NetmaskLength(ipv6NetmaskLength)
    }

    /**
     * The ID of the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-subnetid)
     *
     * @param subnetId The ID of the subnet.
     */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnSubnetCidrBlock = cdkBuilder.build()
}
