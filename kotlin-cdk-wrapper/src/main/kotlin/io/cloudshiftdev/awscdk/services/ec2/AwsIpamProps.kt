@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Configuration for AwsIpam.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ec2.IpAddresses;
 * CfnIPAMPool pool;
 * Vpc.Builder.create(this, "TheVPC")
 * .ipAddresses(IpAddresses.awsIpamAllocation(AwsIpamProps.builder()
 * .ipv4IpamPoolId(pool.getRef())
 * .ipv4NetmaskLength(18)
 * .defaultSubnetIpv4NetmaskLength(24)
 * .build()))
 * .build();
 * ```
 */
public interface AwsIpamProps {
  /**
   * Default length for Subnet ipv4 Network mask.
   *
   * Specify this option only if you do not specify all Subnets using SubnetConfiguration with a
   * cidrMask
   *
   * Default: - Default ipv4 Subnet Mask for subnets in Vpc
   */
  public fun defaultSubnetIpv4NetmaskLength(): Number? =
      unwrap(this).getDefaultSubnetIpv4NetmaskLength()

  /**
   * Ipam Pool Id for ipv4 allocation.
   */
  public fun ipv4IpamPoolId(): String

  /**
   * Netmask length for Vpc.
   */
  public fun ipv4NetmaskLength(): Number

  /**
   * A builder for [AwsIpamProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultSubnetIpv4NetmaskLength Default length for Subnet ipv4 Network mask.
     * Specify this option only if you do not specify all Subnets using SubnetConfiguration with a
     * cidrMask
     */
    public fun defaultSubnetIpv4NetmaskLength(defaultSubnetIpv4NetmaskLength: Number)

    /**
     * @param ipv4IpamPoolId Ipam Pool Id for ipv4 allocation. 
     */
    public fun ipv4IpamPoolId(ipv4IpamPoolId: String)

    /**
     * @param ipv4NetmaskLength Netmask length for Vpc. 
     */
    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AwsIpamProps.Builder =
        software.amazon.awscdk.services.ec2.AwsIpamProps.builder()

    /**
     * @param defaultSubnetIpv4NetmaskLength Default length for Subnet ipv4 Network mask.
     * Specify this option only if you do not specify all Subnets using SubnetConfiguration with a
     * cidrMask
     */
    override fun defaultSubnetIpv4NetmaskLength(defaultSubnetIpv4NetmaskLength: Number) {
      cdkBuilder.defaultSubnetIpv4NetmaskLength(defaultSubnetIpv4NetmaskLength)
    }

    /**
     * @param ipv4IpamPoolId Ipam Pool Id for ipv4 allocation. 
     */
    override fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
      cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    /**
     * @param ipv4NetmaskLength Netmask length for Vpc. 
     */
    override fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
      cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AwsIpamProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.AwsIpamProps,
  ) : CdkObject(cdkObject), AwsIpamProps {
    /**
     * Default length for Subnet ipv4 Network mask.
     *
     * Specify this option only if you do not specify all Subnets using SubnetConfiguration with a
     * cidrMask
     *
     * Default: - Default ipv4 Subnet Mask for subnets in Vpc
     */
    override fun defaultSubnetIpv4NetmaskLength(): Number? =
        unwrap(this).getDefaultSubnetIpv4NetmaskLength()

    /**
     * Ipam Pool Id for ipv4 allocation.
     */
    override fun ipv4IpamPoolId(): String = unwrap(this).getIpv4IpamPoolId()

    /**
     * Netmask length for Vpc.
     */
    override fun ipv4NetmaskLength(): Number = unwrap(this).getIpv4NetmaskLength()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsIpamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AwsIpamProps): AwsIpamProps =
        CdkObjectWrappers.wrap(cdkObject) as? AwsIpamProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsIpamProps): software.amazon.awscdk.services.ec2.AwsIpamProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.AwsIpamProps
  }
}
