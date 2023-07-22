@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps

@CdkDslMarker
public class CfnVPCCidrBlockPropsDsl {
  private val cdkBuilder: CfnVPCCidrBlockProps.Builder = CfnVPCCidrBlockProps.builder()

  /**
   * @param amazonProvidedIpv6CidrBlock Requests an Amazon-provided IPv6 CIDR block with a /56
   * prefix length for the VPC.
   * You cannot specify the range of IPv6 addresses, or the size of the CIDR block.
   */
  public fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: Boolean) {
    cdkBuilder.amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock)
  }

  /**
   * @param amazonProvidedIpv6CidrBlock Requests an Amazon-provided IPv6 CIDR block with a /56
   * prefix length for the VPC.
   * You cannot specify the range of IPv6 addresses, or the size of the CIDR block.
   */
  public fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: IResolvable) {
    cdkBuilder.amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock)
  }

  /**
   * @param cidrBlock An IPv4 CIDR block to associate with the VPC.
   */
  public fun cidrBlock(cidrBlock: String) {
    cdkBuilder.cidrBlock(cidrBlock)
  }

  /**
   * @param ipv4IpamPoolId Associate a CIDR allocated from an IPv4 IPAM pool to a VPC.
   * For more information about Amazon VPC IP Address Manager (IPAM), see [What is
   * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC IPAM
   * User Guide* .
   */
  public fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
    cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
  }

  /**
   * @param ipv4NetmaskLength The netmask length of the IPv4 CIDR you would like to associate from
   * an Amazon VPC IP Address Manager (IPAM) pool.
   * For more information about IPAM, see [What is
   * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC IPAM
   * User Guide* .
   */
  public fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
    cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
  }

  /**
   * @param ipv6CidrBlock An IPv6 CIDR block from the IPv6 address pool. You must also specify
   * `Ipv6Pool` in the request.
   * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
   */
  public fun ipv6CidrBlock(ipv6CidrBlock: String) {
    cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
  }

  /**
   * @param ipv6IpamPoolId Associates a CIDR allocated from an IPv6 IPAM pool to a VPC.
   * For more information about Amazon VPC IP Address Manager (IPAM), see [What is
   * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC IPAM
   * User Guide* .
   */
  public fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
    cdkBuilder.ipv6IpamPoolId(ipv6IpamPoolId)
  }

  /**
   * @param ipv6NetmaskLength The netmask length of the IPv6 CIDR you would like to associate from
   * an Amazon VPC IP Address Manager (IPAM) pool.
   * For more information about IPAM, see [What is
   * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC IPAM
   * User Guide* .
   */
  public fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
    cdkBuilder.ipv6NetmaskLength(ipv6NetmaskLength)
  }

  /**
   * @param ipv6Pool The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
   */
  public fun ipv6Pool(ipv6Pool: String) {
    cdkBuilder.ipv6Pool(ipv6Pool)
  }

  /**
   * @param vpcId The ID of the VPC. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnVPCCidrBlockProps = cdkBuilder.build()
}
