@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The prefix to use for source NAT for a dual-stack network load balancer with UDP listeners.
 *
 * Example:
 *
 * ```
 * IVpc vpc;
 * IVpc dualstackVpc;
 * ISubnet subnet;
 * ISubnet dualstackSubnet;
 * CfnEIP cfnEip;
 * // Internet facing Network Load Balancer with an Elastic IPv4 address
 * // Internet facing Network Load Balancer with an Elastic IPv4 address
 * NetworkLoadBalancer.Builder.create(this, "InternetFacingLb")
 * .vpc(vpc)
 * .internetFacing(true)
 * .subnetMappings(List.of(SubnetMapping.builder()
 * .subnet(subnet)
 * // The allocation ID of the Elastic IP address
 * .allocationId(cfnEip.getAttrAllocationId())
 * .build()))
 * .build();
 * // Internal Network Load Balancer with a private IPv4 address
 * // Internal Network Load Balancer with a private IPv4 address
 * NetworkLoadBalancer.Builder.create(this, "InternalLb")
 * .vpc(vpc)
 * .internetFacing(false)
 * .subnetMappings(List.of(SubnetMapping.builder()
 * .subnet(subnet)
 * // The private IPv4 address from the subnet
 * // The address must be in the subnet's CIDR range and
 * // can not be configured for a internet facing Network Load Balancer.
 * .privateIpv4Address("10.0.12.29")
 * .build()))
 * .build();
 * // Dualstack Network Load Balancer with an IPv6 address and prefix for source NAT
 * // Dualstack Network Load Balancer with an IPv6 address and prefix for source NAT
 * NetworkLoadBalancer.Builder.create(this, "DualstackLb")
 * .vpc(dualstackVpc)
 * // Configure the dualstack Network Load Balancer
 * .ipAddressType(IpAddressType.DUAL_STACK)
 * .enablePrefixForIpv6SourceNat(true)
 * .subnetMappings(List.of(SubnetMapping.builder()
 * .subnet(dualstackSubnet)
 * // The IPv6 address from the subnet
 * // `ipAddresstype` must be `DUAL_STACK` or `DUAL_STACK_WITHOUT_PUBLIC_IPV4` to set the IPv6
 * address.
 * .ipv6Address("2001:db8:1234:1a00::10")
 * // The IPv6 prefix to use for source NAT
 * // `enablePrefixForIpv6SourceNat` must be `true` to set `sourceNatIpv6Prefix`.
 * .sourceNatIpv6Prefix(SourceNatIpv6Prefix.autoAssigned())
 * .build()))
 * .build();
 * ```
 */
public open class SourceNatIpv6Prefix(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.SourceNatIpv6Prefix,
) : CdkObject(cdkObject) {
  public constructor(prefix: String) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.SourceNatIpv6Prefix(prefix)
  )

  /**
   * The IPv6 prefix.
   */
  public open fun prefix(): String = unwrap(this).getPrefix()

  public companion object {
    public fun autoAssigned(): SourceNatIpv6Prefix =
        software.amazon.awscdk.services.elasticloadbalancingv2.SourceNatIpv6Prefix.autoAssigned().let(SourceNatIpv6Prefix::wrap)

    public fun fromIpv6Prefix(prefix: String): SourceNatIpv6Prefix =
        software.amazon.awscdk.services.elasticloadbalancingv2.SourceNatIpv6Prefix.fromIpv6Prefix(prefix).let(SourceNatIpv6Prefix::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.SourceNatIpv6Prefix):
        SourceNatIpv6Prefix = SourceNatIpv6Prefix(cdkObject)

    internal fun unwrap(wrapped: SourceNatIpv6Prefix):
        software.amazon.awscdk.services.elasticloadbalancingv2.SourceNatIpv6Prefix =
        wrapped.cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.SourceNatIpv6Prefix
  }
}
