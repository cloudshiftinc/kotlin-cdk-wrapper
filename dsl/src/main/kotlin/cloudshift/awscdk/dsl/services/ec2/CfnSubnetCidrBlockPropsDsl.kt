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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
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
 * .ipv6CidrBlock("ipv6CidrBlock")
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html)
 */
@CdkDslMarker
public class CfnSubnetCidrBlockPropsDsl {
    private val cdkBuilder: CfnSubnetCidrBlockProps.Builder = CfnSubnetCidrBlockProps.builder()

    /**
     * @param ipv6CidrBlock The IPv6 network range for the subnet, in CIDR notation. The subnet size
     *   must use a /64 prefix length. This parameter is required for an IPv6 only subnet.
     */
    public fun ipv6CidrBlock(ipv6CidrBlock: String) {
        cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    /** @param subnetId The ID of the subnet. */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnSubnetCidrBlockProps = cdkBuilder.build()
}
