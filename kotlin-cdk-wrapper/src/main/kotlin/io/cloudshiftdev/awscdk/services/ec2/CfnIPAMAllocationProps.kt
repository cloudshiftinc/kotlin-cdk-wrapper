@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnIPAMAllocation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnIPAMAllocationProps cfnIPAMAllocationProps = CfnIPAMAllocationProps.builder()
 * .ipamPoolId("ipamPoolId")
 * // the properties below are optional
 * .cidr("cidr")
 * .description("description")
 * .netmaskLength(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html)
 */
public interface CfnIPAMAllocationProps {
  /**
   * The CIDR you would like to allocate from the IPAM pool. Note the following:.
   *
   * * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either
   * the NetmaskLength or the CIDR.
   * * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the
   * NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
   *
   * Possible values: Any available IPv4 or IPv6 CIDR.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html#cfn-ec2-ipamallocation-cidr)
   */
  public fun cidr(): String? = unwrap(this).getCidr()

  /**
   * A description for the allocation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html#cfn-ec2-ipamallocation-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the IPAM pool from which you would like to allocate a CIDR.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html#cfn-ec2-ipamallocation-ipampoolid)
   */
  public fun ipamPoolId(): String

  /**
   * The netmask length of the CIDR you would like to allocate from the IPAM pool. Note the
   * following:.
   *
   * * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either
   * the NetmaskLength or the CIDR.
   * * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the
   * NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
   *
   * Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6
   * addresses are 0 - 128.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html#cfn-ec2-ipamallocation-netmasklength)
   */
  public fun netmaskLength(): Number? = unwrap(this).getNetmaskLength()

  /**
   * A builder for [CfnIPAMAllocationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidr The CIDR you would like to allocate from the IPAM pool. Note the following:.
     * * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify
     * either the NetmaskLength or the CIDR.
     * * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the
     * NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *
     * Possible values: Any available IPv4 or IPv6 CIDR.
     */
    public fun cidr(cidr: String)

    /**
     * @param description A description for the allocation.
     */
    public fun description(description: String)

    /**
     * @param ipamPoolId The ID of the IPAM pool from which you would like to allocate a CIDR. 
     */
    public fun ipamPoolId(ipamPoolId: String)

    /**
     * @param netmaskLength The netmask length of the CIDR you would like to allocate from the IPAM
     * pool. Note the following:.
     * * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify
     * either the NetmaskLength or the CIDR.
     * * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the
     * NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *
     * Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6
     * addresses are 0 - 128.
     */
    public fun netmaskLength(netmaskLength: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAMAllocationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMAllocationProps.builder()

    /**
     * @param cidr The CIDR you would like to allocate from the IPAM pool. Note the following:.
     * * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify
     * either the NetmaskLength or the CIDR.
     * * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the
     * NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *
     * Possible values: Any available IPv4 or IPv6 CIDR.
     */
    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    /**
     * @param description A description for the allocation.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param ipamPoolId The ID of the IPAM pool from which you would like to allocate a CIDR. 
     */
    override fun ipamPoolId(ipamPoolId: String) {
      cdkBuilder.ipamPoolId(ipamPoolId)
    }

    /**
     * @param netmaskLength The netmask length of the CIDR you would like to allocate from the IPAM
     * pool. Note the following:.
     * * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify
     * either the NetmaskLength or the CIDR.
     * * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the
     * NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *
     * Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6
     * addresses are 0 - 128.
     */
    override fun netmaskLength(netmaskLength: Number) {
      cdkBuilder.netmaskLength(netmaskLength)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMAllocationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMAllocationProps,
  ) : CdkObject(cdkObject), CfnIPAMAllocationProps {
    /**
     * The CIDR you would like to allocate from the IPAM pool. Note the following:.
     *
     * * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify
     * either the NetmaskLength or the CIDR.
     * * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the
     * NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *
     * Possible values: Any available IPv4 or IPv6 CIDR.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html#cfn-ec2-ipamallocation-cidr)
     */
    override fun cidr(): String? = unwrap(this).getCidr()

    /**
     * A description for the allocation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html#cfn-ec2-ipamallocation-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the IPAM pool from which you would like to allocate a CIDR.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html#cfn-ec2-ipamallocation-ipampoolid)
     */
    override fun ipamPoolId(): String = unwrap(this).getIpamPoolId()

    /**
     * The netmask length of the CIDR you would like to allocate from the IPAM pool. Note the
     * following:.
     *
     * * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify
     * either the NetmaskLength or the CIDR.
     * * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the
     * NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *
     * Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6
     * addresses are 0 - 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html#cfn-ec2-ipamallocation-netmasklength)
     */
    override fun netmaskLength(): Number? = unwrap(this).getNetmaskLength()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIPAMAllocationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMAllocationProps):
        CfnIPAMAllocationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMAllocationProps):
        software.amazon.awscdk.services.ec2.CfnIPAMAllocationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnIPAMAllocationProps
  }
}
