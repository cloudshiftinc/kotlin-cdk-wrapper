@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * CIDR Allocated Subnet.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * AllocatedSubnet allocatedSubnet = AllocatedSubnet.builder()
 * .cidr("cidr")
 * // the properties below are optional
 * .ipv6Cidr("ipv6Cidr")
 * .build();
 * ```
 */
public interface AllocatedSubnet {
  /**
   * IPv4 CIDR Allocations for a Subnet.
   *
   * Note this is specific to the IPv4 CIDR.
   */
  public fun cidr(): String

  /**
   * IPv6 CIDR Allocations for a Subnet.
   *
   * Note this is specific to the IPv6 CIDR.
   *
   * Default: - no IPV6 CIDR
   */
  public fun ipv6Cidr(): String? = unwrap(this).getIpv6Cidr()

  /**
   * A builder for [AllocatedSubnet]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidr IPv4 CIDR Allocations for a Subnet. 
     * Note this is specific to the IPv4 CIDR.
     */
    public fun cidr(cidr: String)

    /**
     * @param ipv6Cidr IPv6 CIDR Allocations for a Subnet.
     * Note this is specific to the IPv6 CIDR.
     */
    public fun ipv6Cidr(ipv6Cidr: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AllocatedSubnet.Builder =
        software.amazon.awscdk.services.ec2.AllocatedSubnet.builder()

    /**
     * @param cidr IPv4 CIDR Allocations for a Subnet. 
     * Note this is specific to the IPv4 CIDR.
     */
    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    /**
     * @param ipv6Cidr IPv6 CIDR Allocations for a Subnet.
     * Note this is specific to the IPv6 CIDR.
     */
    override fun ipv6Cidr(ipv6Cidr: String) {
      cdkBuilder.ipv6Cidr(ipv6Cidr)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AllocatedSubnet = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AllocatedSubnet,
  ) : CdkObject(cdkObject), AllocatedSubnet {
    /**
     * IPv4 CIDR Allocations for a Subnet.
     *
     * Note this is specific to the IPv4 CIDR.
     */
    override fun cidr(): String = unwrap(this).getCidr()

    /**
     * IPv6 CIDR Allocations for a Subnet.
     *
     * Note this is specific to the IPv6 CIDR.
     *
     * Default: - no IPV6 CIDR
     */
    override fun ipv6Cidr(): String? = unwrap(this).getIpv6Cidr()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AllocatedSubnet {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AllocatedSubnet):
        AllocatedSubnet = CdkObjectWrappers.wrap(cdkObject) as? AllocatedSubnet ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AllocatedSubnet):
        software.amazon.awscdk.services.ec2.AllocatedSubnet = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.AllocatedSubnet
  }
}
