@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISubnet
import kotlin.String
import kotlin.Unit

/**
 * Specifies a subnet for a load balancer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * SourceNatIpv6Prefix sourceNatIpv6Prefix;
 * Subnet subnet;
 * SubnetMapping subnetMapping = SubnetMapping.builder()
 * .subnet(subnet)
 * // the properties below are optional
 * .allocationId("allocationId")
 * .ipv6Address("ipv6Address")
 * .privateIpv4Address("privateIpv4Address")
 * .sourceNatIpv6Prefix(sourceNatIpv6Prefix)
 * .build();
 * ```
 */
public interface SubnetMapping {
  /**
   * The allocation ID of the Elastic IP address for an internet-facing load balancer.
   *
   * Default: undefined - AWS default is to allocate a new IP address for internet-facing load
   * balancers
   */
  public fun allocationId(): String? = unwrap(this).getAllocationId()

  /**
   * The IPv6 address.
   *
   * Default: undefined - AWS default is to allocate an IPv6 address from the subnet's pool
   */
  public fun ipv6Address(): String? = unwrap(this).getIpv6Address()

  /**
   * The private IPv4 address for an internal load balancer.
   *
   * Default: undefined - AWS default is to allocate a private IPv4 address from the subnet's pool
   */
  public fun privateIpv4Address(): String? = unwrap(this).getPrivateIpv4Address()

  /**
   * The IPv6 prefix to use for source NAT for a dual-stack network load balancer with UDP
   * listeners.
   *
   * Specify an IPv6 prefix (/80 netmask) from the subnet CIDR block
   * or `SourceNatIpv6Prefix.autoAssigned()` to use an IPv6 prefix selected at random from the
   * subnet CIDR block.
   *
   * Default: undefined - AWS default is `SourceNatIpv6Prefix.autoAssigned()` for IPv6 load
   * balancers
   */
  public fun sourceNatIpv6Prefix(): SourceNatIpv6Prefix? =
      unwrap(this).getSourceNatIpv6Prefix()?.let(SourceNatIpv6Prefix::wrap)

  /**
   * The subnet.
   */
  public fun subnet(): ISubnet

  /**
   * A builder for [SubnetMapping]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allocationId The allocation ID of the Elastic IP address for an internet-facing load
     * balancer.
     */
    public fun allocationId(allocationId: String)

    /**
     * @param ipv6Address The IPv6 address.
     */
    public fun ipv6Address(ipv6Address: String)

    /**
     * @param privateIpv4Address The private IPv4 address for an internal load balancer.
     */
    public fun privateIpv4Address(privateIpv4Address: String)

    /**
     * @param sourceNatIpv6Prefix The IPv6 prefix to use for source NAT for a dual-stack network
     * load balancer with UDP listeners.
     * Specify an IPv6 prefix (/80 netmask) from the subnet CIDR block
     * or `SourceNatIpv6Prefix.autoAssigned()` to use an IPv6 prefix selected at random from the
     * subnet CIDR block.
     */
    public fun sourceNatIpv6Prefix(sourceNatIpv6Prefix: SourceNatIpv6Prefix)

    /**
     * @param subnet The subnet. 
     */
    public fun subnet(subnet: ISubnet)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.SubnetMapping.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.SubnetMapping.builder()

    /**
     * @param allocationId The allocation ID of the Elastic IP address for an internet-facing load
     * balancer.
     */
    override fun allocationId(allocationId: String) {
      cdkBuilder.allocationId(allocationId)
    }

    /**
     * @param ipv6Address The IPv6 address.
     */
    override fun ipv6Address(ipv6Address: String) {
      cdkBuilder.ipv6Address(ipv6Address)
    }

    /**
     * @param privateIpv4Address The private IPv4 address for an internal load balancer.
     */
    override fun privateIpv4Address(privateIpv4Address: String) {
      cdkBuilder.privateIpv4Address(privateIpv4Address)
    }

    /**
     * @param sourceNatIpv6Prefix The IPv6 prefix to use for source NAT for a dual-stack network
     * load balancer with UDP listeners.
     * Specify an IPv6 prefix (/80 netmask) from the subnet CIDR block
     * or `SourceNatIpv6Prefix.autoAssigned()` to use an IPv6 prefix selected at random from the
     * subnet CIDR block.
     */
    override fun sourceNatIpv6Prefix(sourceNatIpv6Prefix: SourceNatIpv6Prefix) {
      cdkBuilder.sourceNatIpv6Prefix(sourceNatIpv6Prefix.let(SourceNatIpv6Prefix.Companion::unwrap))
    }

    /**
     * @param subnet The subnet. 
     */
    override fun subnet(subnet: ISubnet) {
      cdkBuilder.subnet(subnet.let(ISubnet.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.SubnetMapping =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.SubnetMapping,
  ) : CdkObject(cdkObject),
      SubnetMapping {
    /**
     * The allocation ID of the Elastic IP address for an internet-facing load balancer.
     *
     * Default: undefined - AWS default is to allocate a new IP address for internet-facing load
     * balancers
     */
    override fun allocationId(): String? = unwrap(this).getAllocationId()

    /**
     * The IPv6 address.
     *
     * Default: undefined - AWS default is to allocate an IPv6 address from the subnet's pool
     */
    override fun ipv6Address(): String? = unwrap(this).getIpv6Address()

    /**
     * The private IPv4 address for an internal load balancer.
     *
     * Default: undefined - AWS default is to allocate a private IPv4 address from the subnet's pool
     */
    override fun privateIpv4Address(): String? = unwrap(this).getPrivateIpv4Address()

    /**
     * The IPv6 prefix to use for source NAT for a dual-stack network load balancer with UDP
     * listeners.
     *
     * Specify an IPv6 prefix (/80 netmask) from the subnet CIDR block
     * or `SourceNatIpv6Prefix.autoAssigned()` to use an IPv6 prefix selected at random from the
     * subnet CIDR block.
     *
     * Default: undefined - AWS default is `SourceNatIpv6Prefix.autoAssigned()` for IPv6 load
     * balancers
     */
    override fun sourceNatIpv6Prefix(): SourceNatIpv6Prefix? =
        unwrap(this).getSourceNatIpv6Prefix()?.let(SourceNatIpv6Prefix::wrap)

    /**
     * The subnet.
     */
    override fun subnet(): ISubnet = unwrap(this).getSubnet().let(ISubnet::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SubnetMapping {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.SubnetMapping):
        SubnetMapping = CdkObjectWrappers.wrap(cdkObject) as? SubnetMapping ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubnetMapping):
        software.amazon.awscdk.services.elasticloadbalancingv2.SubnetMapping = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticloadbalancingv2.SubnetMapping
  }
}
