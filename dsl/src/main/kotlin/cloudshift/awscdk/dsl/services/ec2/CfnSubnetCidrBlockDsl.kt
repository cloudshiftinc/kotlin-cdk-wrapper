@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock
import software.constructs.Construct

/**
 * Associates a CIDR block with your subnet.
 *
 * You can associate a single IPv6 CIDR block with your subnet. An IPv6 CIDR block must have a
 * prefix length of /64.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnSubnetCidrBlock cfnSubnetCidrBlock = CfnSubnetCidrBlock.Builder.create(this,
 * "MyCfnSubnetCidrBlock")
 * .ipv6CidrBlock("ipv6CidrBlock")
 * .subnetId("subnetId")
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
  private val cdkBuilder: CfnSubnetCidrBlock.Builder = CfnSubnetCidrBlock.Builder.create(scope, id)

  /**
   * The IPv6 network range for the subnet, in CIDR notation. The subnet size must use a /64 prefix
   * length.
   *
   * This parameter is required for an IPv6 only subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6cidrblock)
   * @param ipv6CidrBlock The IPv6 network range for the subnet, in CIDR notation. The subnet size
   * must use a /64 prefix length. 
   */
  public fun ipv6CidrBlock(ipv6CidrBlock: String) {
    cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
  }

  /**
   * The ID of the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-subnetid)
   * @param subnetId The ID of the subnet. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnSubnetCidrBlock = cdkBuilder.build()
}
