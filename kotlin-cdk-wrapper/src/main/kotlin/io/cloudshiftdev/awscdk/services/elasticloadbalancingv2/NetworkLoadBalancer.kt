@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a new network load balancer.
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
public open class NetworkLoadBalancer(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer,
) : BaseLoadBalancer(cdkObject),
    INetworkLoadBalancer {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NetworkLoadBalancerProps,
  ) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(NetworkLoadBalancerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NetworkLoadBalancerProps.Builder.() -> Unit,
  ) : this(scope, id, NetworkLoadBalancerProps(props)
  )

  /**
   * Add a listener to this load balancer.
   *
   * @return The newly created listener
   * @param id 
   * @param props 
   */
  public override fun addListener(id: String, props: BaseNetworkListenerProps): NetworkListener =
      unwrap(this).addListener(id,
      props.let(BaseNetworkListenerProps.Companion::unwrap)).let(NetworkListener::wrap)

  /**
   * Add a listener to this load balancer.
   *
   * @return The newly created listener
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a41b0d86a8d4886847b1c4ec80b30640a2d7a8098f577ff54f0dca337543d349")
  public override fun addListener(id: String, props: BaseNetworkListenerProps.Builder.() -> Unit):
      NetworkListener = addListener(id, BaseNetworkListenerProps(props))

  /**
   * Add a security group to this load balancer.
   *
   * @param securityGroup 
   */
  public open fun addSecurityGroup(securityGroup: ISecurityGroup) {
    unwrap(this).addSecurityGroup(securityGroup.let(ISecurityGroup.Companion::unwrap))
  }

  /**
   * The network connections associated with this resource.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * Indicates whether to evaluate inbound security group rules for traffic sent to a Network Load
   * Balancer through AWS PrivateLink.
   */
  public override fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(): String? =
      unwrap(this).getEnforceSecurityGroupInboundRulesOnPrivateLinkTraffic()

  /**
   * The type of IP addresses to use.
   */
  public override fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  /**
   * (deprecated) Return the given named metric for this Network Load Balancer.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.custom` instead
   * @param metricName 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * (deprecated) Return the given named metric for this Network Load Balancer.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.custom` instead
   * @param metricName 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Return the given named metric for this Network Load Balancer.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.custom` instead
   * @param metricName 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public open fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * (deprecated) The total number of concurrent TCP flows (or connections) from clients to targets.
   *
   * This metric includes connections in the SYN_SENT and ESTABLISHED states.
   * TCP connections are not terminated at the load balancer, so a client
   * opening a TCP connection to a target counts as a single flow.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.activeFlowCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricActiveFlowCount(): Metric =
      unwrap(this).metricActiveFlowCount().let(Metric::wrap)

  /**
   * (deprecated) The total number of concurrent TCP flows (or connections) from clients to targets.
   *
   * This metric includes connections in the SYN_SENT and ESTABLISHED states.
   * TCP connections are not terminated at the load balancer, so a client
   * opening a TCP connection to a target counts as a single flow.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.activeFlowCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricActiveFlowCount(props: MetricOptions): Metric =
      unwrap(this).metricActiveFlowCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The total number of concurrent TCP flows (or connections) from clients to targets.
   *
   * This metric includes connections in the SYN_SENT and ESTABLISHED states.
   * TCP connections are not terminated at the load balancer, so a client
   * opening a TCP connection to a target counts as a single flow.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.activeFlowCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("15c7bd19a5fd454ade85668f8904798210d28945f611163b69d85301bbe6836d")
  public open fun metricActiveFlowCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricActiveFlowCount(MetricOptions(props))

  /**
   * (deprecated) The number of load balancer capacity units (LCU) used by your load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.activeFlowCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricConsumedLCUs(): Metric = unwrap(this).metricConsumedLCUs().let(Metric::wrap)

  /**
   * (deprecated) The number of load balancer capacity units (LCU) used by your load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.activeFlowCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricConsumedLCUs(props: MetricOptions): Metric =
      unwrap(this).metricConsumedLCUs(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of load balancer capacity units (LCU) used by your load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.activeFlowCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3e6de8e93f42ba897d92007009735fcc06aede8f8d1f7a9b5b0846ad0b5c213")
  public open fun metricConsumedLCUs(props: MetricOptions.Builder.() -> Unit): Metric =
      metricConsumedLCUs(MetricOptions(props))

  /**
   * (deprecated) The total number of new TCP flows (or connections) established from clients to
   * targets in the time period.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.newFlowCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricNewFlowCount(): Metric = unwrap(this).metricNewFlowCount().let(Metric::wrap)

  /**
   * (deprecated) The total number of new TCP flows (or connections) established from clients to
   * targets in the time period.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.newFlowCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricNewFlowCount(props: MetricOptions): Metric =
      unwrap(this).metricNewFlowCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The total number of new TCP flows (or connections) established from clients to
   * targets in the time period.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.newFlowCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51754b4329677647f3be42bdba5ca17fc8853d3469c8a6a41a9f2a07a0c6c478")
  public open fun metricNewFlowCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricNewFlowCount(MetricOptions(props))

  /**
   * (deprecated) The total number of bytes processed by the load balancer, including TCP/IP
   * headers.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.processedBytes` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricProcessedBytes(): Metric =
      unwrap(this).metricProcessedBytes().let(Metric::wrap)

  /**
   * (deprecated) The total number of bytes processed by the load balancer, including TCP/IP
   * headers.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.processedBytes` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricProcessedBytes(props: MetricOptions): Metric =
      unwrap(this).metricProcessedBytes(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The total number of bytes processed by the load balancer, including TCP/IP
   * headers.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.processedBytes` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5508437533a512ae29d20a7b9481b4dc589656903396c8e04e3af24fd5173cac")
  public open fun metricProcessedBytes(props: MetricOptions.Builder.() -> Unit): Metric =
      metricProcessedBytes(MetricOptions(props))

  /**
   * (deprecated) The total number of reset (RST) packets sent from a client to a target.
   *
   * These resets are generated by the client and forwarded by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.tcpClientResetCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTcpClientResetCount(): Metric =
      unwrap(this).metricTcpClientResetCount().let(Metric::wrap)

  /**
   * (deprecated) The total number of reset (RST) packets sent from a client to a target.
   *
   * These resets are generated by the client and forwarded by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.tcpClientResetCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTcpClientResetCount(props: MetricOptions): Metric =
      unwrap(this).metricTcpClientResetCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The total number of reset (RST) packets sent from a client to a target.
   *
   * These resets are generated by the client and forwarded by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.tcpClientResetCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a4bf30eaaef3faec726cbd0b99edd99f78ce6b5859650f3f509c3531167e31c8")
  public open fun metricTcpClientResetCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTcpClientResetCount(MetricOptions(props))

  /**
   * (deprecated) The total number of reset (RST) packets generated by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.tcpElbResetCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTcpElbResetCount(): Metric =
      unwrap(this).metricTcpElbResetCount().let(Metric::wrap)

  /**
   * (deprecated) The total number of reset (RST) packets generated by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.tcpElbResetCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTcpElbResetCount(props: MetricOptions): Metric =
      unwrap(this).metricTcpElbResetCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The total number of reset (RST) packets generated by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.tcpElbResetCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b6918aa1a269aebaec13cc34a9fb4b1d7c450b553f5d690a161a3aaaac51294c")
  public open fun metricTcpElbResetCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTcpElbResetCount(MetricOptions(props))

  /**
   * (deprecated) The total number of reset (RST) packets sent from a target to a client.
   *
   * These resets are generated by the target and forwarded by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.tcpTargetResetCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTcpTargetResetCount(): Metric =
      unwrap(this).metricTcpTargetResetCount().let(Metric::wrap)

  /**
   * (deprecated) The total number of reset (RST) packets sent from a target to a client.
   *
   * These resets are generated by the target and forwarded by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.tcpTargetResetCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTcpTargetResetCount(props: MetricOptions): Metric =
      unwrap(this).metricTcpTargetResetCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The total number of reset (RST) packets sent from a target to a client.
   *
   * These resets are generated by the target and forwarded by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `NetworkLoadBalancer.metrics.tcpTargetResetCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e133cdd46986cfe6466609ea03b81c9387a7b09291c3ce057561ff36746aa733")
  public open fun metricTcpTargetResetCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTcpTargetResetCount(MetricOptions(props))

  /**
   * All metrics available for this load balancer.
   */
  public override fun metrics(): INetworkLoadBalancerMetrics =
      unwrap(this).getMetrics().let(INetworkLoadBalancerMetrics::wrap)

  /**
   * After the implementation of `IConnectable` (see https://github.com/aws/aws-cdk/pull/28494), the
   * default value for `securityGroups` is set by the `ec2.Connections` constructor to an empty array.
   * To keep backward compatibility (`securityGroups` is `undefined` if the related property is not
   * specified) a getter has been added.
   */
  public override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?:
      emptyList()

  public override fun vpc(): IVpc? = INetworkLoadBalancer.unwrap(this).vpc?.let(IVpc::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AZ affinity routing policy.
     *
     * Default: - AZ affinity is disabled.
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/network-load-balancers.html#zonal-dns-affinity)
     * @param clientRoutingPolicy The AZ affinity routing policy. 
     */
    public fun clientRoutingPolicy(clientRoutingPolicy: ClientRoutingPolicy)

    /**
     * Indicates whether cross-zone load balancing is enabled.
     *
     * Default: - false for Network Load Balancers and true for Application Load Balancers.
     * This can not be `false` for Application Load Balancers.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-loadbalancerattribute.html)
     * @param crossZoneEnabled Indicates whether cross-zone load balancing is enabled. 
     */
    public fun crossZoneEnabled(crossZoneEnabled: Boolean)

    /**
     * Indicates whether deletion protection is enabled.
     *
     * Default: false
     *
     * @param deletionProtection Indicates whether deletion protection is enabled. 
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * Indicates whether the load balancer blocks traffic through the Internet Gateway (IGW).
     *
     * Default: - false for internet-facing load balancers and true for internal load balancers
     *
     * @param denyAllIgwTraffic Indicates whether the load balancer blocks traffic through the
     * Internet Gateway (IGW). 
     */
    public fun denyAllIgwTraffic(denyAllIgwTraffic: Boolean)

    /**
     * Indicates whether to use an IPv6 prefix from each subnet for source NAT.
     *
     * The IP address type must be IpAddressType.DUALSTACK.
     *
     * Default: undefined - NLB default behavior is false
     *
     * @param enablePrefixForIpv6SourceNat Indicates whether to use an IPv6 prefix from each subnet
     * for source NAT. 
     */
    public fun enablePrefixForIpv6SourceNat(enablePrefixForIpv6SourceNat: Boolean)

    /**
     * Indicates whether to evaluate inbound security group rules for traffic sent to a Network Load
     * Balancer through AWS PrivateLink.
     *
     * Default: true
     *
     * @param enforceSecurityGroupInboundRulesOnPrivateLinkTraffic Indicates whether to evaluate
     * inbound security group rules for traffic sent to a Network Load Balancer through AWS
     * PrivateLink. 
     */
    public
        fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(enforceSecurityGroupInboundRulesOnPrivateLinkTraffic: Boolean)

    /**
     * Whether the load balancer has an internet-routable address.
     *
     * Default: false
     *
     * @param internetFacing Whether the load balancer has an internet-routable address. 
     */
    public fun internetFacing(internetFacing: Boolean)

    /**
     * The type of IP addresses to use.
     *
     * If you want to add a UDP or TCP_UDP listener to the load balancer,
     * you must choose IPv4.
     *
     * Default: IpAddressType.IPV4
     *
     * @param ipAddressType The type of IP addresses to use. 
     */
    public fun ipAddressType(ipAddressType: IpAddressType)

    /**
     * Name of the load balancer.
     *
     * Default: - Automatically generated name.
     *
     * @param loadBalancerName Name of the load balancer. 
     */
    public fun loadBalancerName(loadBalancerName: String)

    /**
     * The minimum capacity (LCU) for a load balancer.
     *
     * Default: undefined - ELB default is 0 LCU
     *
     * [Documentation](https://exampleloadbalancer.com/ondemand_capacity_reservation_calculator.html)
     * @param minimumCapacityUnit The minimum capacity (LCU) for a load balancer. 
     */
    public fun minimumCapacityUnit(minimumCapacityUnit: Number)

    /**
     * Security groups to associate with this load balancer.
     *
     * Default: - No security groups associated with the load balancer.
     *
     * @param securityGroups Security groups to associate with this load balancer. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * Security groups to associate with this load balancer.
     *
     * Default: - No security groups associated with the load balancer.
     *
     * @param securityGroups Security groups to associate with this load balancer. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * Subnet information for the load balancer.
     *
     * Default: undefined - The VPC default strategy for subnets is used
     *
     * @param subnetMappings Subnet information for the load balancer. 
     */
    public fun subnetMappings(subnetMappings: List<SubnetMapping>)

    /**
     * Subnet information for the load balancer.
     *
     * Default: undefined - The VPC default strategy for subnets is used
     *
     * @param subnetMappings Subnet information for the load balancer. 
     */
    public fun subnetMappings(vararg subnetMappings: SubnetMapping)

    /**
     * The VPC network to place the load balancer in.
     *
     * @param vpc The VPC network to place the load balancer in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * Which subnets place the load balancer in.
     *
     * Default: - the Vpc default strategy.
     *
     * @param vpcSubnets Which subnets place the load balancer in. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * Which subnets place the load balancer in.
     *
     * Default: - the Vpc default strategy.
     *
     * @param vpcSubnets Which subnets place the load balancer in. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76b4d38b2541f097e5e9a086970529ede085f84e55e0e84f8d77525b2e7f8bb5")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)

    /**
     * Indicates whether zonal shift is enabled.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/zonal-shift.html)
     * @param zonalShift Indicates whether zonal shift is enabled. 
     */
    public fun zonalShift(zonalShift: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer.Builder.create(scope,
        id)

    /**
     * The AZ affinity routing policy.
     *
     * Default: - AZ affinity is disabled.
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/network-load-balancers.html#zonal-dns-affinity)
     * @param clientRoutingPolicy The AZ affinity routing policy. 
     */
    override fun clientRoutingPolicy(clientRoutingPolicy: ClientRoutingPolicy) {
      cdkBuilder.clientRoutingPolicy(clientRoutingPolicy.let(ClientRoutingPolicy.Companion::unwrap))
    }

    /**
     * Indicates whether cross-zone load balancing is enabled.
     *
     * Default: - false for Network Load Balancers and true for Application Load Balancers.
     * This can not be `false` for Application Load Balancers.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-loadbalancerattribute.html)
     * @param crossZoneEnabled Indicates whether cross-zone load balancing is enabled. 
     */
    override fun crossZoneEnabled(crossZoneEnabled: Boolean) {
      cdkBuilder.crossZoneEnabled(crossZoneEnabled)
    }

    /**
     * Indicates whether deletion protection is enabled.
     *
     * Default: false
     *
     * @param deletionProtection Indicates whether deletion protection is enabled. 
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * Indicates whether the load balancer blocks traffic through the Internet Gateway (IGW).
     *
     * Default: - false for internet-facing load balancers and true for internal load balancers
     *
     * @param denyAllIgwTraffic Indicates whether the load balancer blocks traffic through the
     * Internet Gateway (IGW). 
     */
    override fun denyAllIgwTraffic(denyAllIgwTraffic: Boolean) {
      cdkBuilder.denyAllIgwTraffic(denyAllIgwTraffic)
    }

    /**
     * Indicates whether to use an IPv6 prefix from each subnet for source NAT.
     *
     * The IP address type must be IpAddressType.DUALSTACK.
     *
     * Default: undefined - NLB default behavior is false
     *
     * @param enablePrefixForIpv6SourceNat Indicates whether to use an IPv6 prefix from each subnet
     * for source NAT. 
     */
    override fun enablePrefixForIpv6SourceNat(enablePrefixForIpv6SourceNat: Boolean) {
      cdkBuilder.enablePrefixForIpv6SourceNat(enablePrefixForIpv6SourceNat)
    }

    /**
     * Indicates whether to evaluate inbound security group rules for traffic sent to a Network Load
     * Balancer through AWS PrivateLink.
     *
     * Default: true
     *
     * @param enforceSecurityGroupInboundRulesOnPrivateLinkTraffic Indicates whether to evaluate
     * inbound security group rules for traffic sent to a Network Load Balancer through AWS
     * PrivateLink. 
     */
    override
        fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(enforceSecurityGroupInboundRulesOnPrivateLinkTraffic: Boolean) {
      cdkBuilder.enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(enforceSecurityGroupInboundRulesOnPrivateLinkTraffic)
    }

    /**
     * Whether the load balancer has an internet-routable address.
     *
     * Default: false
     *
     * @param internetFacing Whether the load balancer has an internet-routable address. 
     */
    override fun internetFacing(internetFacing: Boolean) {
      cdkBuilder.internetFacing(internetFacing)
    }

    /**
     * The type of IP addresses to use.
     *
     * If you want to add a UDP or TCP_UDP listener to the load balancer,
     * you must choose IPv4.
     *
     * Default: IpAddressType.IPV4
     *
     * @param ipAddressType The type of IP addresses to use. 
     */
    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType.Companion::unwrap))
    }

    /**
     * Name of the load balancer.
     *
     * Default: - Automatically generated name.
     *
     * @param loadBalancerName Name of the load balancer. 
     */
    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    /**
     * The minimum capacity (LCU) for a load balancer.
     *
     * Default: undefined - ELB default is 0 LCU
     *
     * [Documentation](https://exampleloadbalancer.com/ondemand_capacity_reservation_calculator.html)
     * @param minimumCapacityUnit The minimum capacity (LCU) for a load balancer. 
     */
    override fun minimumCapacityUnit(minimumCapacityUnit: Number) {
      cdkBuilder.minimumCapacityUnit(minimumCapacityUnit)
    }

    /**
     * Security groups to associate with this load balancer.
     *
     * Default: - No security groups associated with the load balancer.
     *
     * @param securityGroups Security groups to associate with this load balancer. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * Security groups to associate with this load balancer.
     *
     * Default: - No security groups associated with the load balancer.
     *
     * @param securityGroups Security groups to associate with this load balancer. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * Subnet information for the load balancer.
     *
     * Default: undefined - The VPC default strategy for subnets is used
     *
     * @param subnetMappings Subnet information for the load balancer. 
     */
    override fun subnetMappings(subnetMappings: List<SubnetMapping>) {
      cdkBuilder.subnetMappings(subnetMappings.map(SubnetMapping.Companion::unwrap))
    }

    /**
     * Subnet information for the load balancer.
     *
     * Default: undefined - The VPC default strategy for subnets is used
     *
     * @param subnetMappings Subnet information for the load balancer. 
     */
    override fun subnetMappings(vararg subnetMappings: SubnetMapping): Unit =
        subnetMappings(subnetMappings.toList())

    /**
     * The VPC network to place the load balancer in.
     *
     * @param vpc The VPC network to place the load balancer in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    /**
     * Which subnets place the load balancer in.
     *
     * Default: - the Vpc default strategy.
     *
     * @param vpcSubnets Which subnets place the load balancer in. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * Which subnets place the load balancer in.
     *
     * Default: - the Vpc default strategy.
     *
     * @param vpcSubnets Which subnets place the load balancer in. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76b4d38b2541f097e5e9a086970529ede085f84e55e0e84f8d77525b2e7f8bb5")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    /**
     * Indicates whether zonal shift is enabled.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/zonal-shift.html)
     * @param zonalShift Indicates whether zonal shift is enabled. 
     */
    override fun zonalShift(zonalShift: Boolean) {
      cdkBuilder.zonalShift(zonalShift)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer.PROPERTY_INJECTION_ID

    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: NetworkLoadBalancerLookupOptions,
    ): INetworkLoadBalancer =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer.fromLookup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id,
        options.let(NetworkLoadBalancerLookupOptions.Companion::unwrap)).let(INetworkLoadBalancer::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bcd51206aa6d66c8e1035cfa09dc81795e7186ac9e256f9be8d2c805945399b1")
    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: NetworkLoadBalancerLookupOptions.Builder.() -> Unit,
    ): INetworkLoadBalancer = fromLookup(scope, id, NetworkLoadBalancerLookupOptions(options))

    public fun fromNetworkLoadBalancerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: NetworkLoadBalancerAttributes,
    ): INetworkLoadBalancer =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer.fromNetworkLoadBalancerAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id,
        attrs.let(NetworkLoadBalancerAttributes.Companion::unwrap)).let(INetworkLoadBalancer::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("068a2579d6c7917a88937fb61ae4cf40af5dd1d14d86741fca3de48637d669bb")
    public fun fromNetworkLoadBalancerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: NetworkLoadBalancerAttributes.Builder.() -> Unit,
    ): INetworkLoadBalancer = fromNetworkLoadBalancerAttributes(scope, id,
        NetworkLoadBalancerAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NetworkLoadBalancer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NetworkLoadBalancer(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer):
        NetworkLoadBalancer = NetworkLoadBalancer(cdkObject)

    internal fun unwrap(wrapped: NetworkLoadBalancer):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer =
        wrapped.cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer
  }
}
