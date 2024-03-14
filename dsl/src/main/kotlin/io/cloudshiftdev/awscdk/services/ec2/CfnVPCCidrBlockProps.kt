package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnVPCCidrBlockProps {
  /**
   * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC.
   *
   * You cannot specify the range of IPv6 addresses or the size of the CIDR block.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-amazonprovidedipv6cidrblock)
   */
  public fun amazonProvidedIpv6CidrBlock(): Any? = unwrap(this).getAmazonProvidedIpv6CidrBlock()

  /**
   * An IPv4 CIDR block to associate with the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-cidrblock)
   */
  public fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  /**
   * Associate a CIDR allocated from an IPv4 IPAM pool to a VPC.
   *
   * For more information about Amazon VPC IP Address Manager (IPAM), see [What is
   * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC IPAM
   * User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv4ipampoolid)
   */
  public fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

  /**
   * The netmask length of the IPv4 CIDR you would like to associate from an Amazon VPC IP Address
   * Manager (IPAM) pool.
   *
   * For more information about IPAM, see [What is
   * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC IPAM
   * User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv4netmasklength)
   */
  public fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

  /**
   * An IPv6 CIDR block from the IPv6 address pool. You must also specify `Ipv6Pool` in the request.
   *
   * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6cidrblock)
   */
  public fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

  /**
   * Associates a CIDR allocated from an IPv6 IPAM pool to a VPC.
   *
   * For more information about Amazon VPC IP Address Manager (IPAM), see [What is
   * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC IPAM
   * User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6ipampoolid)
   */
  public fun ipv6IpamPoolId(): String? = unwrap(this).getIpv6IpamPoolId()

  /**
   * The netmask length of the IPv6 CIDR you would like to associate from an Amazon VPC IP Address
   * Manager (IPAM) pool.
   *
   * For more information about IPAM, see [What is
   * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC IPAM
   * User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6netmasklength)
   */
  public fun ipv6NetmaskLength(): Number? = unwrap(this).getIpv6NetmaskLength()

  /**
   * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6pool)
   */
  public fun ipv6Pool(): String? = unwrap(this).getIpv6Pool()

  /**
   * The ID of the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnVPCCidrBlockProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param amazonProvidedIpv6CidrBlock Requests an Amazon-provided IPv6 CIDR block with a /56
     * prefix length for the VPC.
     * You cannot specify the range of IPv6 addresses or the size of the CIDR block.
     */
    public fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: Boolean)

    /**
     * @param amazonProvidedIpv6CidrBlock Requests an Amazon-provided IPv6 CIDR block with a /56
     * prefix length for the VPC.
     * You cannot specify the range of IPv6 addresses or the size of the CIDR block.
     */
    public fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: IResolvable)

    /**
     * @param cidrBlock An IPv4 CIDR block to associate with the VPC.
     */
    public fun cidrBlock(cidrBlock: String)

    /**
     * @param ipv4IpamPoolId Associate a CIDR allocated from an IPv4 IPAM pool to a VPC.
     * For more information about Amazon VPC IP Address Manager (IPAM), see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     */
    public fun ipv4IpamPoolId(ipv4IpamPoolId: String)

    /**
     * @param ipv4NetmaskLength The netmask length of the IPv4 CIDR you would like to associate from
     * an Amazon VPC IP Address Manager (IPAM) pool.
     * For more information about IPAM, see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     */
    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number)

    /**
     * @param ipv6CidrBlock An IPv6 CIDR block from the IPv6 address pool. You must also specify
     * `Ipv6Pool` in the request.
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     */
    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    /**
     * @param ipv6IpamPoolId Associates a CIDR allocated from an IPv6 IPAM pool to a VPC.
     * For more information about Amazon VPC IP Address Manager (IPAM), see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     */
    public fun ipv6IpamPoolId(ipv6IpamPoolId: String)

    /**
     * @param ipv6NetmaskLength The netmask length of the IPv6 CIDR you would like to associate from
     * an Amazon VPC IP Address Manager (IPAM) pool.
     * For more information about IPAM, see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     */
    public fun ipv6NetmaskLength(ipv6NetmaskLength: Number)

    /**
     * @param ipv6Pool The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
     */
    public fun ipv6Pool(ipv6Pool: String)

    /**
     * @param vpcId The ID of the VPC. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps.builder()

    /**
     * @param amazonProvidedIpv6CidrBlock Requests an Amazon-provided IPv6 CIDR block with a /56
     * prefix length for the VPC.
     * You cannot specify the range of IPv6 addresses or the size of the CIDR block.
     */
    override fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: Boolean) {
      cdkBuilder.amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock)
    }

    /**
     * @param amazonProvidedIpv6CidrBlock Requests an Amazon-provided IPv6 CIDR block with a /56
     * prefix length for the VPC.
     * You cannot specify the range of IPv6 addresses or the size of the CIDR block.
     */
    override fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: IResolvable) {
      cdkBuilder.amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock.let(IResolvable::unwrap))
    }

    /**
     * @param cidrBlock An IPv4 CIDR block to associate with the VPC.
     */
    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    /**
     * @param ipv4IpamPoolId Associate a CIDR allocated from an IPv4 IPAM pool to a VPC.
     * For more information about Amazon VPC IP Address Manager (IPAM), see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     */
    override fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
      cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    /**
     * @param ipv4NetmaskLength The netmask length of the IPv4 CIDR you would like to associate from
     * an Amazon VPC IP Address Manager (IPAM) pool.
     * For more information about IPAM, see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     */
    override fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
      cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    /**
     * @param ipv6CidrBlock An IPv6 CIDR block from the IPv6 address pool. You must also specify
     * `Ipv6Pool` in the request.
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     */
    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    /**
     * @param ipv6IpamPoolId Associates a CIDR allocated from an IPv6 IPAM pool to a VPC.
     * For more information about Amazon VPC IP Address Manager (IPAM), see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     */
    override fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
      cdkBuilder.ipv6IpamPoolId(ipv6IpamPoolId)
    }

    /**
     * @param ipv6NetmaskLength The netmask length of the IPv6 CIDR you would like to associate from
     * an Amazon VPC IP Address Manager (IPAM) pool.
     * For more information about IPAM, see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     */
    override fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
      cdkBuilder.ipv6NetmaskLength(ipv6NetmaskLength)
    }

    /**
     * @param ipv6Pool The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
     */
    override fun ipv6Pool(ipv6Pool: String) {
      cdkBuilder.ipv6Pool(ipv6Pool)
    }

    /**
     * @param vpcId The ID of the VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps,
  ) : CdkObject(cdkObject), CfnVPCCidrBlockProps {
    /**
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC.
     *
     * You cannot specify the range of IPv6 addresses or the size of the CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-amazonprovidedipv6cidrblock)
     */
    override fun amazonProvidedIpv6CidrBlock(): Any? = unwrap(this).getAmazonProvidedIpv6CidrBlock()

    /**
     * An IPv4 CIDR block to associate with the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-cidrblock)
     */
    override fun cidrBlock(): String? = unwrap(this).getCidrBlock()

    /**
     * Associate a CIDR allocated from an IPv4 IPAM pool to a VPC.
     *
     * For more information about Amazon VPC IP Address Manager (IPAM), see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv4ipampoolid)
     */
    override fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

    /**
     * The netmask length of the IPv4 CIDR you would like to associate from an Amazon VPC IP Address
     * Manager (IPAM) pool.
     *
     * For more information about IPAM, see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv4netmasklength)
     */
    override fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

    /**
     * An IPv6 CIDR block from the IPv6 address pool. You must also specify `Ipv6Pool` in the
     * request.
     *
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6cidrblock)
     */
    override fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

    /**
     * Associates a CIDR allocated from an IPv6 IPAM pool to a VPC.
     *
     * For more information about Amazon VPC IP Address Manager (IPAM), see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6ipampoolid)
     */
    override fun ipv6IpamPoolId(): String? = unwrap(this).getIpv6IpamPoolId()

    /**
     * The netmask length of the IPv6 CIDR you would like to associate from an Amazon VPC IP Address
     * Manager (IPAM) pool.
     *
     * For more information about IPAM, see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6netmasklength)
     */
    override fun ipv6NetmaskLength(): Number? = unwrap(this).getIpv6NetmaskLength()

    /**
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6pool)
     */
    override fun ipv6Pool(): String? = unwrap(this).getIpv6Pool()

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCCidrBlockProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps):
        CfnVPCCidrBlockProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCCidrBlockProps):
        software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps
  }
}
