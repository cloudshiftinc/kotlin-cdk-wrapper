@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnIPAMPoolCidr`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnIPAMPoolCidrProps cfnIPAMPoolCidrProps = CfnIPAMPoolCidrProps.builder()
 * .ipamPoolId("ipamPoolId")
 * // the properties below are optional
 * .cidr("cidr")
 * .netmaskLength(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html)
 */
public interface CfnIPAMPoolCidrProps {
  /**
   * The CIDR provisioned to the IPAM pool.
   *
   * A CIDR is a representation of an IP address and its associated network mask (or netmask) and
   * refers to a range of IP addresses. An IPv4 CIDR example is `10.24.34.0/23` . An IPv6 CIDR example
   * is `2001:DB8::/32` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html#cfn-ec2-ipampoolcidr-cidr)
   */
  public fun cidr(): String? = unwrap(this).getCidr()

  /**
   * The ID of the IPAM pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html#cfn-ec2-ipampoolcidr-ipampoolid)
   */
  public fun ipamPoolId(): String

  /**
   * The netmask length of the CIDR you'd like to provision to a pool.
   *
   * Can be used for provisioning Amazon-provided IPv6 CIDRs to top-level pools and for provisioning
   * CIDRs to pools with source pools. Cannot be used to provision BYOIP CIDRs to top-level pools.
   * "NetmaskLength" or "Cidr" is required.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html#cfn-ec2-ipampoolcidr-netmasklength)
   */
  public fun netmaskLength(): Number? = unwrap(this).getNetmaskLength()

  /**
   * A builder for [CfnIPAMPoolCidrProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidr The CIDR provisioned to the IPAM pool.
     * A CIDR is a representation of an IP address and its associated network mask (or netmask) and
     * refers to a range of IP addresses. An IPv4 CIDR example is `10.24.34.0/23` . An IPv6 CIDR
     * example is `2001:DB8::/32` .
     */
    public fun cidr(cidr: String)

    /**
     * @param ipamPoolId The ID of the IPAM pool. 
     */
    public fun ipamPoolId(ipamPoolId: String)

    /**
     * @param netmaskLength The netmask length of the CIDR you'd like to provision to a pool.
     * Can be used for provisioning Amazon-provided IPv6 CIDRs to top-level pools and for
     * provisioning CIDRs to pools with source pools. Cannot be used to provision BYOIP CIDRs to
     * top-level pools. "NetmaskLength" or "Cidr" is required.
     */
    public fun netmaskLength(netmaskLength: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps.builder()

    /**
     * @param cidr The CIDR provisioned to the IPAM pool.
     * A CIDR is a representation of an IP address and its associated network mask (or netmask) and
     * refers to a range of IP addresses. An IPv4 CIDR example is `10.24.34.0/23` . An IPv6 CIDR
     * example is `2001:DB8::/32` .
     */
    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    /**
     * @param ipamPoolId The ID of the IPAM pool. 
     */
    override fun ipamPoolId(ipamPoolId: String) {
      cdkBuilder.ipamPoolId(ipamPoolId)
    }

    /**
     * @param netmaskLength The netmask length of the CIDR you'd like to provision to a pool.
     * Can be used for provisioning Amazon-provided IPv6 CIDRs to top-level pools and for
     * provisioning CIDRs to pools with source pools. Cannot be used to provision BYOIP CIDRs to
     * top-level pools. "NetmaskLength" or "Cidr" is required.
     */
    override fun netmaskLength(netmaskLength: Number) {
      cdkBuilder.netmaskLength(netmaskLength)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps,
  ) : CdkObject(cdkObject), CfnIPAMPoolCidrProps {
    /**
     * The CIDR provisioned to the IPAM pool.
     *
     * A CIDR is a representation of an IP address and its associated network mask (or netmask) and
     * refers to a range of IP addresses. An IPv4 CIDR example is `10.24.34.0/23` . An IPv6 CIDR
     * example is `2001:DB8::/32` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html#cfn-ec2-ipampoolcidr-cidr)
     */
    override fun cidr(): String? = unwrap(this).getCidr()

    /**
     * The ID of the IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html#cfn-ec2-ipampoolcidr-ipampoolid)
     */
    override fun ipamPoolId(): String = unwrap(this).getIpamPoolId()

    /**
     * The netmask length of the CIDR you'd like to provision to a pool.
     *
     * Can be used for provisioning Amazon-provided IPv6 CIDRs to top-level pools and for
     * provisioning CIDRs to pools with source pools. Cannot be used to provision BYOIP CIDRs to
     * top-level pools. "NetmaskLength" or "Cidr" is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html#cfn-ec2-ipampoolcidr-netmasklength)
     */
    override fun netmaskLength(): Number? = unwrap(this).getNetmaskLength()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIPAMPoolCidrProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps):
        CfnIPAMPoolCidrProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMPoolCidrProps):
        software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps
  }
}
