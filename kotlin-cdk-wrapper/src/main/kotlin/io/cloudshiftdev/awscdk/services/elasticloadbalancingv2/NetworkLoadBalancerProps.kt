@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for a network load balancer.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * NetworkLoadBalancer lb = NetworkLoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .ipAddressType(IpAddressType.DUAL_STACK)
 * .enablePrefixForIpv6SourceNat(true)
 * .build();
 * NetworkListener listener = lb.addListener("Listener", BaseNetworkListenerProps.builder()
 * .port(1229)
 * .protocol(Protocol.UDP)
 * .build());
 * ```
 */
public interface NetworkLoadBalancerProps : BaseLoadBalancerProps {
  /**
   * The AZ affinity routing policy.
   *
   * Default: - AZ affinity is disabled.
   *
   * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/network-load-balancers.html#zonal-dns-affinity)
   */
  public fun clientRoutingPolicy(): ClientRoutingPolicy? =
      unwrap(this).getClientRoutingPolicy()?.let(ClientRoutingPolicy::wrap)

  /**
   * Indicates whether to use an IPv6 prefix from each subnet for source NAT.
   *
   * The IP address type must be IpAddressType.DUALSTACK.
   *
   * Default: undefined - NLB default behavior is false
   */
  public fun enablePrefixForIpv6SourceNat(): Boolean? =
      unwrap(this).getEnablePrefixForIpv6SourceNat()

  /**
   * Indicates whether to evaluate inbound security group rules for traffic sent to a Network Load
   * Balancer through AWS PrivateLink.
   *
   * Default: true
   */
  public fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(): Boolean? =
      unwrap(this).getEnforceSecurityGroupInboundRulesOnPrivateLinkTraffic()

  /**
   * The type of IP addresses to use.
   *
   * If you want to add a UDP or TCP_UDP listener to the load balancer,
   * you must choose IPv4.
   *
   * Default: IpAddressType.IPV4
   */
  public fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  /**
   * Security groups to associate with this load balancer.
   *
   * Default: - No security groups associated with the load balancer.
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * Subnet information for the load balancer.
   *
   * Default: undefined - The VPC default strategy for subnets is used
   */
  public fun subnetMappings(): List<SubnetMapping> =
      unwrap(this).getSubnetMappings()?.map(SubnetMapping::wrap) ?: emptyList()

  /**
   * Indicates whether zonal shift is enabled.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/zonal-shift.html)
   */
  public fun zonalShift(): Boolean? = unwrap(this).getZonalShift()

  /**
   * A builder for [NetworkLoadBalancerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientRoutingPolicy The AZ affinity routing policy.
     */
    public fun clientRoutingPolicy(clientRoutingPolicy: ClientRoutingPolicy)

    /**
     * @param crossZoneEnabled Indicates whether cross-zone load balancing is enabled.
     */
    public fun crossZoneEnabled(crossZoneEnabled: Boolean)

    /**
     * @param deletionProtection Indicates whether deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param denyAllIgwTraffic Indicates whether the load balancer blocks traffic through the
     * Internet Gateway (IGW).
     */
    public fun denyAllIgwTraffic(denyAllIgwTraffic: Boolean)

    /**
     * @param enablePrefixForIpv6SourceNat Indicates whether to use an IPv6 prefix from each subnet
     * for source NAT.
     * The IP address type must be IpAddressType.DUALSTACK.
     */
    public fun enablePrefixForIpv6SourceNat(enablePrefixForIpv6SourceNat: Boolean)

    /**
     * @param enforceSecurityGroupInboundRulesOnPrivateLinkTraffic Indicates whether to evaluate
     * inbound security group rules for traffic sent to a Network Load Balancer through AWS
     * PrivateLink.
     */
    public
        fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(enforceSecurityGroupInboundRulesOnPrivateLinkTraffic: Boolean)

    /**
     * @param internetFacing Whether the load balancer has an internet-routable address.
     */
    public fun internetFacing(internetFacing: Boolean)

    /**
     * @param ipAddressType The type of IP addresses to use.
     * If you want to add a UDP or TCP_UDP listener to the load balancer,
     * you must choose IPv4.
     */
    public fun ipAddressType(ipAddressType: IpAddressType)

    /**
     * @param loadBalancerName Name of the load balancer.
     */
    public fun loadBalancerName(loadBalancerName: String)

    /**
     * @param minimumCapacityUnit The minimum capacity (LCU) for a load balancer.
     */
    public fun minimumCapacityUnit(minimumCapacityUnit: Number)

    /**
     * @param securityGroups Security groups to associate with this load balancer.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups Security groups to associate with this load balancer.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param subnetMappings Subnet information for the load balancer.
     */
    public fun subnetMappings(subnetMappings: List<SubnetMapping>)

    /**
     * @param subnetMappings Subnet information for the load balancer.
     */
    public fun subnetMappings(vararg subnetMappings: SubnetMapping)

    /**
     * @param vpc The VPC network to place the load balancer in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Which subnets place the load balancer in.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Which subnets place the load balancer in.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84071131b3d32d9469187793d2323326b37a81a7b38d802bfd92477a3777997d")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)

    /**
     * @param zonalShift Indicates whether zonal shift is enabled.
     */
    public fun zonalShift(zonalShift: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerProps.builder()

    /**
     * @param clientRoutingPolicy The AZ affinity routing policy.
     */
    override fun clientRoutingPolicy(clientRoutingPolicy: ClientRoutingPolicy) {
      cdkBuilder.clientRoutingPolicy(clientRoutingPolicy.let(ClientRoutingPolicy.Companion::unwrap))
    }

    /**
     * @param crossZoneEnabled Indicates whether cross-zone load balancing is enabled.
     */
    override fun crossZoneEnabled(crossZoneEnabled: Boolean) {
      cdkBuilder.crossZoneEnabled(crossZoneEnabled)
    }

    /**
     * @param deletionProtection Indicates whether deletion protection is enabled.
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param denyAllIgwTraffic Indicates whether the load balancer blocks traffic through the
     * Internet Gateway (IGW).
     */
    override fun denyAllIgwTraffic(denyAllIgwTraffic: Boolean) {
      cdkBuilder.denyAllIgwTraffic(denyAllIgwTraffic)
    }

    /**
     * @param enablePrefixForIpv6SourceNat Indicates whether to use an IPv6 prefix from each subnet
     * for source NAT.
     * The IP address type must be IpAddressType.DUALSTACK.
     */
    override fun enablePrefixForIpv6SourceNat(enablePrefixForIpv6SourceNat: Boolean) {
      cdkBuilder.enablePrefixForIpv6SourceNat(enablePrefixForIpv6SourceNat)
    }

    /**
     * @param enforceSecurityGroupInboundRulesOnPrivateLinkTraffic Indicates whether to evaluate
     * inbound security group rules for traffic sent to a Network Load Balancer through AWS
     * PrivateLink.
     */
    override
        fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(enforceSecurityGroupInboundRulesOnPrivateLinkTraffic: Boolean) {
      cdkBuilder.enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(enforceSecurityGroupInboundRulesOnPrivateLinkTraffic)
    }

    /**
     * @param internetFacing Whether the load balancer has an internet-routable address.
     */
    override fun internetFacing(internetFacing: Boolean) {
      cdkBuilder.internetFacing(internetFacing)
    }

    /**
     * @param ipAddressType The type of IP addresses to use.
     * If you want to add a UDP or TCP_UDP listener to the load balancer,
     * you must choose IPv4.
     */
    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType.Companion::unwrap))
    }

    /**
     * @param loadBalancerName Name of the load balancer.
     */
    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    /**
     * @param minimumCapacityUnit The minimum capacity (LCU) for a load balancer.
     */
    override fun minimumCapacityUnit(minimumCapacityUnit: Number) {
      cdkBuilder.minimumCapacityUnit(minimumCapacityUnit)
    }

    /**
     * @param securityGroups Security groups to associate with this load balancer.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param securityGroups Security groups to associate with this load balancer.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param subnetMappings Subnet information for the load balancer.
     */
    override fun subnetMappings(subnetMappings: List<SubnetMapping>) {
      cdkBuilder.subnetMappings(subnetMappings.map(SubnetMapping.Companion::unwrap))
    }

    /**
     * @param subnetMappings Subnet information for the load balancer.
     */
    override fun subnetMappings(vararg subnetMappings: SubnetMapping): Unit =
        subnetMappings(subnetMappings.toList())

    /**
     * @param vpc The VPC network to place the load balancer in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets place the load balancer in.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets place the load balancer in.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84071131b3d32d9469187793d2323326b37a81a7b38d802bfd92477a3777997d")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    /**
     * @param zonalShift Indicates whether zonal shift is enabled.
     */
    override fun zonalShift(zonalShift: Boolean) {
      cdkBuilder.zonalShift(zonalShift)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerProps,
  ) : CdkObject(cdkObject),
      NetworkLoadBalancerProps {
    /**
     * The AZ affinity routing policy.
     *
     * Default: - AZ affinity is disabled.
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/network-load-balancers.html#zonal-dns-affinity)
     */
    override fun clientRoutingPolicy(): ClientRoutingPolicy? =
        unwrap(this).getClientRoutingPolicy()?.let(ClientRoutingPolicy::wrap)

    /**
     * Indicates whether cross-zone load balancing is enabled.
     *
     * Default: - false for Network Load Balancers and true for Application Load Balancers.
     * This can not be `false` for Application Load Balancers.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-loadbalancerattribute.html)
     */
    override fun crossZoneEnabled(): Boolean? = unwrap(this).getCrossZoneEnabled()

    /**
     * Indicates whether deletion protection is enabled.
     *
     * Default: false
     */
    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    /**
     * Indicates whether the load balancer blocks traffic through the Internet Gateway (IGW).
     *
     * Default: - false for internet-facing load balancers and true for internal load balancers
     */
    override fun denyAllIgwTraffic(): Boolean? = unwrap(this).getDenyAllIgwTraffic()

    /**
     * Indicates whether to use an IPv6 prefix from each subnet for source NAT.
     *
     * The IP address type must be IpAddressType.DUALSTACK.
     *
     * Default: undefined - NLB default behavior is false
     */
    override fun enablePrefixForIpv6SourceNat(): Boolean? =
        unwrap(this).getEnablePrefixForIpv6SourceNat()

    /**
     * Indicates whether to evaluate inbound security group rules for traffic sent to a Network Load
     * Balancer through AWS PrivateLink.
     *
     * Default: true
     */
    override fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(): Boolean? =
        unwrap(this).getEnforceSecurityGroupInboundRulesOnPrivateLinkTraffic()

    /**
     * Whether the load balancer has an internet-routable address.
     *
     * Default: false
     */
    override fun internetFacing(): Boolean? = unwrap(this).getInternetFacing()

    /**
     * The type of IP addresses to use.
     *
     * If you want to add a UDP or TCP_UDP listener to the load balancer,
     * you must choose IPv4.
     *
     * Default: IpAddressType.IPV4
     */
    override fun ipAddressType(): IpAddressType? =
        unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

    /**
     * Name of the load balancer.
     *
     * Default: - Automatically generated name.
     */
    override fun loadBalancerName(): String? = unwrap(this).getLoadBalancerName()

    /**
     * The minimum capacity (LCU) for a load balancer.
     *
     * Default: undefined - ELB default is 0 LCU
     *
     * [Documentation](https://exampleloadbalancer.com/ondemand_capacity_reservation_calculator.html)
     */
    override fun minimumCapacityUnit(): Number? = unwrap(this).getMinimumCapacityUnit()

    /**
     * Security groups to associate with this load balancer.
     *
     * Default: - No security groups associated with the load balancer.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * Subnet information for the load balancer.
     *
     * Default: undefined - The VPC default strategy for subnets is used
     */
    override fun subnetMappings(): List<SubnetMapping> =
        unwrap(this).getSubnetMappings()?.map(SubnetMapping::wrap) ?: emptyList()

    /**
     * The VPC network to place the load balancer in.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * Which subnets place the load balancer in.
     *
     * Default: - the Vpc default strategy.
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

    /**
     * Indicates whether zonal shift is enabled.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/zonal-shift.html)
     */
    override fun zonalShift(): Boolean? = unwrap(this).getZonalShift()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkLoadBalancerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerProps):
        NetworkLoadBalancerProps = CdkObjectWrappers.wrap(cdkObject) as? NetworkLoadBalancerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkLoadBalancerProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerProps
  }
}
