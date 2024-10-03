@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSubnetCidrBlock`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
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
public interface CfnSubnetCidrBlockProps {
  /**
   * The IPv6 network range for the subnet, in CIDR notation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6cidrblock)
   */
  public fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

  /**
   * An IPv6 IPAM pool ID for the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6ipampoolid)
   */
  public fun ipv6IpamPoolId(): String? = unwrap(this).getIpv6IpamPoolId()

  /**
   * An IPv6 netmask length for the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6netmasklength)
   */
  public fun ipv6NetmaskLength(): Number? = unwrap(this).getIpv6NetmaskLength()

  /**
   * The ID of the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-subnetid)
   */
  public fun subnetId(): String

  /**
   * A builder for [CfnSubnetCidrBlockProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ipv6CidrBlock The IPv6 network range for the subnet, in CIDR notation.
     */
    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    /**
     * @param ipv6IpamPoolId An IPv6 IPAM pool ID for the subnet.
     */
    public fun ipv6IpamPoolId(ipv6IpamPoolId: String)

    /**
     * @param ipv6NetmaskLength An IPv6 netmask length for the subnet.
     */
    public fun ipv6NetmaskLength(ipv6NetmaskLength: Number)

    /**
     * @param subnetId The ID of the subnet. 
     */
    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps.Builder =
        software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps.builder()

    /**
     * @param ipv6CidrBlock The IPv6 network range for the subnet, in CIDR notation.
     */
    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    /**
     * @param ipv6IpamPoolId An IPv6 IPAM pool ID for the subnet.
     */
    override fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
      cdkBuilder.ipv6IpamPoolId(ipv6IpamPoolId)
    }

    /**
     * @param ipv6NetmaskLength An IPv6 netmask length for the subnet.
     */
    override fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
      cdkBuilder.ipv6NetmaskLength(ipv6NetmaskLength)
    }

    /**
     * @param subnetId The ID of the subnet. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps,
  ) : CdkObject(cdkObject),
      CfnSubnetCidrBlockProps {
    /**
     * The IPv6 network range for the subnet, in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6cidrblock)
     */
    override fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

    /**
     * An IPv6 IPAM pool ID for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6ipampoolid)
     */
    override fun ipv6IpamPoolId(): String? = unwrap(this).getIpv6IpamPoolId()

    /**
     * An IPv6 netmask length for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6netmasklength)
     */
    override fun ipv6NetmaskLength(): Number? = unwrap(this).getIpv6NetmaskLength()

    /**
     * The ID of the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-subnetid)
     */
    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSubnetCidrBlockProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps):
        CfnSubnetCidrBlockProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSubnetCidrBlockProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetCidrBlockProps):
        software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps
  }
}
