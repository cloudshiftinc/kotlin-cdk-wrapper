@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Configuration for Vpc.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * Vpc vpc = Vpc.Builder.create(this, "Vpc")
 * .ipAddresses(IpAddresses.cidr("10.0.0.0/16"))
 * .build();
 * VpcConnector vpcConnector = VpcConnector.Builder.create(this, "VpcConnector")
 * .vpc(vpc)
 * .vpcSubnets(vpc.selectSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build()))
 * .vpcConnectorName("MyVpcConnector")
 * .build();
 * Service.Builder.create(this, "Service")
 * .source(Source.fromEcrPublic(EcrPublicProps.builder()
 * .imageConfiguration(ImageConfiguration.builder().port(8000).build())
 * .imageIdentifier("public.ecr.aws/aws-containers/hello-app-runner:latest")
 * .build()))
 * .vpcConnector(vpcConnector)
 * .build();
 * ```
 */
public interface VpcProps {
  /**
   * Availability zones this VPC spans.
   *
   * Specify this option only if you do not specify `maxAzs`.
   *
   * Default: - a subset of AZs of the stack
   */
  public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?: emptyList()

  /**
   * (deprecated) The CIDR range to use for the VPC, e.g. '10.0.0.0/16'.
   *
   * Should be a minimum of /28 and maximum size of /16. The range will be
   * split across all subnets per Availability Zone.
   *
   * Default: Vpc.DEFAULT_CIDR_RANGE
   *
   * @deprecated Use ipAddresses instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun cidr(): String? = unwrap(this).getCidr()

  /**
   * If set to false then disable the creation of the default internet gateway.
   *
   * Default: true
   */
  public fun createInternetGateway(): Boolean? = unwrap(this).getCreateInternetGateway()

  /**
   * The default tenancy of instances launched into the VPC.
   *
   * By setting this to dedicated tenancy, instances will be launched on
   * hardware dedicated to a single AWS customer, unless specifically specified
   * at instance launch time. Please note, not all instance types are usable
   * with Dedicated tenancy.
   *
   * Default: DefaultInstanceTenancy.Default (shared) tenancy
   */
  public fun defaultInstanceTenancy(): DefaultInstanceTenancy? =
      unwrap(this).getDefaultInstanceTenancy()?.let(DefaultInstanceTenancy::wrap)

  /**
   * Indicates whether the instances launched in the VPC get public DNS hostnames.
   *
   * If this attribute is true, instances in the VPC get public DNS hostnames,
   * but only if the enableDnsSupport attribute is also set to true.
   *
   * Default: true
   */
  public fun enableDnsHostnames(): Boolean? = unwrap(this).getEnableDnsHostnames()

  /**
   * Indicates whether the DNS resolution is supported for the VPC.
   *
   * If this attribute is false, the Amazon-provided DNS server in the VPC that
   * resolves public DNS hostnames to IP addresses is not enabled. If this
   * attribute is true, queries to the Amazon provided DNS server at the
   * 169.254.169.253 IP address, or the reserved IP address at the base of the
   * VPC IPv4 network range plus two will succeed.
   *
   * Default: true
   */
  public fun enableDnsSupport(): Boolean? = unwrap(this).getEnableDnsSupport()

  /**
   * Flow logs to add to this VPC.
   *
   * Default: - No flow logs.
   */
  public fun flowLogs(): Map<String, FlowLogOptions> =
      unwrap(this).getFlowLogs()?.mapValues{FlowLogOptions.wrap(it.value)} ?: emptyMap()

  /**
   * Gateway endpoints to add to this VPC.
   *
   * Default: - None.
   */
  public fun gatewayEndpoints(): Map<String, GatewayVpcEndpointOptions> =
      unwrap(this).getGatewayEndpoints()?.mapValues{GatewayVpcEndpointOptions.wrap(it.value)} ?:
      emptyMap()

  /**
   * The Provider to use to allocate IPv4 Space to your VPC.
   *
   * Options include static allocation or from a pool.
   *
   * Note this is specific to IPv4 addresses.
   *
   * Default: ec2.IpAddresses.cidr
   */
  public fun ipAddresses(): IIpAddresses? = unwrap(this).getIpAddresses()?.let(IIpAddresses::wrap)

  /**
   * The protocol of the vpc.
   *
   * Options are IPv4 only or dual stack.
   *
   * Default: IpProtocol.IPV4_ONLY
   */
  public fun ipProtocol(): IpProtocol? = unwrap(this).getIpProtocol()?.let(IpProtocol::wrap)

  /**
   * The Provider to use to allocate IPv6 Space to your VPC.
   *
   * Options include amazon provided CIDR block.
   *
   * Note this is specific to IPv6 addresses.
   *
   * Default: Ipv6Addresses.amazonProvided
   */
  public fun ipv6Addresses(): IIpv6Addresses? =
      unwrap(this).getIpv6Addresses()?.let(IIpv6Addresses::wrap)

  /**
   * Define the maximum number of AZs to use in this region.
   *
   * If the region has more AZs than you want to use (for example, because of
   * EIP limits), pick a lower number here. The AZs will be sorted and picked
   * from the start of the list.
   *
   * If you pick a higher number than the number of AZs in the region, all AZs
   * in the region will be selected. To use "all AZs" available to your
   * account, use a high number (such as 99).
   *
   * Be aware that environment-agnostic stacks will be created with access to
   * only 2 AZs, so to use more than 2 AZs, be sure to specify the account and
   * region on your stack.
   *
   * Specify this option only if you do not specify `availabilityZones`.
   *
   * Default: 3
   */
  public fun maxAzs(): Number? = unwrap(this).getMaxAzs()

  /**
   * What type of NAT provider to use.
   *
   * Select between NAT gateways or NAT instances. NAT gateways
   * may not be available in all AWS regions.
   *
   * Default: NatProvider.gateway()
   */
  public fun natGatewayProvider(): NatProvider? =
      unwrap(this).getNatGatewayProvider()?.let(NatProvider::wrap)

  /**
   * Configures the subnets which will have NAT Gateways/Instances.
   *
   * You can pick a specific group of subnets by specifying the group name;
   * the picked subnets must be public subnets.
   *
   * Only necessary if you have more than one public subnet group.
   *
   * Default: - All public subnets.
   */
  public fun natGatewaySubnets(): SubnetSelection? =
      unwrap(this).getNatGatewaySubnets()?.let(SubnetSelection::wrap)

  /**
   * The number of NAT Gateways/Instances to create.
   *
   * The type of NAT gateway or instance will be determined by the
   * `natGatewayProvider` parameter.
   *
   * You can set this number lower than the number of Availability Zones in your
   * VPC in order to save on NAT cost. Be aware you may be charged for
   * cross-AZ data traffic instead.
   *
   * Default: - One NAT gateway/instance per Availability Zone
   */
  public fun natGateways(): Number? = unwrap(this).getNatGateways()

  /**
   * Define the number of AZs to reserve.
   *
   * When specified, the IP space is reserved for the azs but no actual
   * resources are provisioned.
   *
   * Default: 0
   */
  public fun reservedAzs(): Number? = unwrap(this).getReservedAzs()

  /**
   * If set to true then the default inbound &amp; outbound rules will be removed from the default
   * security group.
   *
   * Default: true if '@aws-cdk/aws-ec2:restrictDefaultSecurityGroup' is enabled, false otherwise
   */
  public fun restrictDefaultSecurityGroup(): Boolean? =
      unwrap(this).getRestrictDefaultSecurityGroup()

  /**
   * Configure the subnets to build for each AZ.
   *
   * Each entry in this list configures a Subnet Group; each group will contain a
   * subnet for each Availability Zone.
   *
   * For example, if you want 1 public subnet, 1 private subnet, and 1 isolated
   * subnet in each AZ provide the following:
   *
   * ```
   * Vpc.Builder.create(this, "VPC")
   * .subnetConfiguration(List.of(SubnetConfiguration.builder()
   * .cidrMask(24)
   * .name("ingress")
   * .subnetType(SubnetType.PUBLIC)
   * .build(), SubnetConfiguration.builder()
   * .cidrMask(24)
   * .name("application")
   * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
   * .build(), SubnetConfiguration.builder()
   * .cidrMask(28)
   * .name("rds")
   * .subnetType(SubnetType.PRIVATE_ISOLATED)
   * .build()))
   * .build();
   * ```
   *
   * Default: - The VPC CIDR will be evenly divided between 1 public and 1
   * private subnet per AZ.
   */
  public fun subnetConfiguration(): List<SubnetConfiguration> =
      unwrap(this).getSubnetConfiguration()?.map(SubnetConfiguration::wrap) ?: emptyList()

  /**
   * The VPC name.
   *
   * Since the VPC resource doesn't support providing a physical name, the value provided here will
   * be recorded in the `Name` tag
   *
   * Default: this.node.path
   */
  public fun vpcName(): String? = unwrap(this).getVpcName()

  /**
   * VPN connections to this VPC.
   *
   * Default: - No connections.
   */
  public fun vpnConnections(): Map<String, VpnConnectionOptions> =
      unwrap(this).getVpnConnections()?.mapValues{VpnConnectionOptions.wrap(it.value)} ?: emptyMap()

  /**
   * Indicates whether a VPN gateway should be created and attached to this VPC.
   *
   * Default: - true when vpnGatewayAsn or vpnConnections is specified
   */
  public fun vpnGateway(): Boolean? = unwrap(this).getVpnGateway()

  /**
   * The private Autonomous System Number (ASN) for the VPN gateway.
   *
   * Default: - Amazon default ASN.
   */
  public fun vpnGatewayAsn(): Number? = unwrap(this).getVpnGatewayAsn()

  /**
   * Where to propagate VPN routes.
   *
   * Default: - On the route tables associated with private subnets. If no
   * private subnets exists, isolated subnets are used. If no isolated subnets
   * exists, public subnets are used.
   */
  public fun vpnRoutePropagation(): List<SubnetSelection> =
      unwrap(this).getVpnRoutePropagation()?.map(SubnetSelection::wrap) ?: emptyList()

  /**
   * A builder for [VpcProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZones Availability zones this VPC spans.
     * Specify this option only if you do not specify `maxAzs`.
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * @param availabilityZones Availability zones this VPC spans.
     * Specify this option only if you do not specify `maxAzs`.
     */
    public fun availabilityZones(vararg availabilityZones: String)

    /**
     * @param cidr The CIDR range to use for the VPC, e.g. '10.0.0.0/16'.
     * Should be a minimum of /28 and maximum size of /16. The range will be
     * split across all subnets per Availability Zone.
     * @deprecated Use ipAddresses instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun cidr(cidr: String)

    /**
     * @param createInternetGateway If set to false then disable the creation of the default
     * internet gateway.
     */
    public fun createInternetGateway(createInternetGateway: Boolean)

    /**
     * @param defaultInstanceTenancy The default tenancy of instances launched into the VPC.
     * By setting this to dedicated tenancy, instances will be launched on
     * hardware dedicated to a single AWS customer, unless specifically specified
     * at instance launch time. Please note, not all instance types are usable
     * with Dedicated tenancy.
     */
    public fun defaultInstanceTenancy(defaultInstanceTenancy: DefaultInstanceTenancy)

    /**
     * @param enableDnsHostnames Indicates whether the instances launched in the VPC get public DNS
     * hostnames.
     * If this attribute is true, instances in the VPC get public DNS hostnames,
     * but only if the enableDnsSupport attribute is also set to true.
     */
    public fun enableDnsHostnames(enableDnsHostnames: Boolean)

    /**
     * @param enableDnsSupport Indicates whether the DNS resolution is supported for the VPC.
     * If this attribute is false, the Amazon-provided DNS server in the VPC that
     * resolves public DNS hostnames to IP addresses is not enabled. If this
     * attribute is true, queries to the Amazon provided DNS server at the
     * 169.254.169.253 IP address, or the reserved IP address at the base of the
     * VPC IPv4 network range plus two will succeed.
     */
    public fun enableDnsSupport(enableDnsSupport: Boolean)

    /**
     * @param flowLogs Flow logs to add to this VPC.
     */
    public fun flowLogs(flowLogs: Map<String, FlowLogOptions>)

    /**
     * @param gatewayEndpoints Gateway endpoints to add to this VPC.
     */
    public fun gatewayEndpoints(gatewayEndpoints: Map<String, GatewayVpcEndpointOptions>)

    /**
     * @param ipAddresses The Provider to use to allocate IPv4 Space to your VPC.
     * Options include static allocation or from a pool.
     *
     * Note this is specific to IPv4 addresses.
     */
    public fun ipAddresses(ipAddresses: IIpAddresses)

    /**
     * @param ipProtocol The protocol of the vpc.
     * Options are IPv4 only or dual stack.
     */
    public fun ipProtocol(ipProtocol: IpProtocol)

    /**
     * @param ipv6Addresses The Provider to use to allocate IPv6 Space to your VPC.
     * Options include amazon provided CIDR block.
     *
     * Note this is specific to IPv6 addresses.
     */
    public fun ipv6Addresses(ipv6Addresses: IIpv6Addresses)

    /**
     * @param maxAzs Define the maximum number of AZs to use in this region.
     * If the region has more AZs than you want to use (for example, because of
     * EIP limits), pick a lower number here. The AZs will be sorted and picked
     * from the start of the list.
     *
     * If you pick a higher number than the number of AZs in the region, all AZs
     * in the region will be selected. To use "all AZs" available to your
     * account, use a high number (such as 99).
     *
     * Be aware that environment-agnostic stacks will be created with access to
     * only 2 AZs, so to use more than 2 AZs, be sure to specify the account and
     * region on your stack.
     *
     * Specify this option only if you do not specify `availabilityZones`.
     */
    public fun maxAzs(maxAzs: Number)

    /**
     * @param natGatewayProvider What type of NAT provider to use.
     * Select between NAT gateways or NAT instances. NAT gateways
     * may not be available in all AWS regions.
     */
    public fun natGatewayProvider(natGatewayProvider: NatProvider)

    /**
     * @param natGatewaySubnets Configures the subnets which will have NAT Gateways/Instances.
     * You can pick a specific group of subnets by specifying the group name;
     * the picked subnets must be public subnets.
     *
     * Only necessary if you have more than one public subnet group.
     */
    public fun natGatewaySubnets(natGatewaySubnets: SubnetSelection)

    /**
     * @param natGatewaySubnets Configures the subnets which will have NAT Gateways/Instances.
     * You can pick a specific group of subnets by specifying the group name;
     * the picked subnets must be public subnets.
     *
     * Only necessary if you have more than one public subnet group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d6bc3f8802c1909ef64b5a8f784e8454c781d7681640d39fd3f50af04103f5a")
    public fun natGatewaySubnets(natGatewaySubnets: SubnetSelection.Builder.() -> Unit)

    /**
     * @param natGateways The number of NAT Gateways/Instances to create.
     * The type of NAT gateway or instance will be determined by the
     * `natGatewayProvider` parameter.
     *
     * You can set this number lower than the number of Availability Zones in your
     * VPC in order to save on NAT cost. Be aware you may be charged for
     * cross-AZ data traffic instead.
     */
    public fun natGateways(natGateways: Number)

    /**
     * @param reservedAzs Define the number of AZs to reserve.
     * When specified, the IP space is reserved for the azs but no actual
     * resources are provisioned.
     */
    public fun reservedAzs(reservedAzs: Number)

    /**
     * @param restrictDefaultSecurityGroup If set to true then the default inbound &amp; outbound
     * rules will be removed from the default security group.
     */
    public fun restrictDefaultSecurityGroup(restrictDefaultSecurityGroup: Boolean)

    /**
     * @param subnetConfiguration Configure the subnets to build for each AZ.
     * Each entry in this list configures a Subnet Group; each group will contain a
     * subnet for each Availability Zone.
     *
     * For example, if you want 1 public subnet, 1 private subnet, and 1 isolated
     * subnet in each AZ provide the following:
     *
     * ```
     * Vpc.Builder.create(this, "VPC")
     * .subnetConfiguration(List.of(SubnetConfiguration.builder()
     * .cidrMask(24)
     * .name("ingress")
     * .subnetType(SubnetType.PUBLIC)
     * .build(), SubnetConfiguration.builder()
     * .cidrMask(24)
     * .name("application")
     * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
     * .build(), SubnetConfiguration.builder()
     * .cidrMask(28)
     * .name("rds")
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build()))
     * .build();
     * ```
     */
    public fun subnetConfiguration(subnetConfiguration: List<SubnetConfiguration>)

    /**
     * @param subnetConfiguration Configure the subnets to build for each AZ.
     * Each entry in this list configures a Subnet Group; each group will contain a
     * subnet for each Availability Zone.
     *
     * For example, if you want 1 public subnet, 1 private subnet, and 1 isolated
     * subnet in each AZ provide the following:
     *
     * ```
     * Vpc.Builder.create(this, "VPC")
     * .subnetConfiguration(List.of(SubnetConfiguration.builder()
     * .cidrMask(24)
     * .name("ingress")
     * .subnetType(SubnetType.PUBLIC)
     * .build(), SubnetConfiguration.builder()
     * .cidrMask(24)
     * .name("application")
     * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
     * .build(), SubnetConfiguration.builder()
     * .cidrMask(28)
     * .name("rds")
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build()))
     * .build();
     * ```
     */
    public fun subnetConfiguration(vararg subnetConfiguration: SubnetConfiguration)

    /**
     * @param vpcName The VPC name.
     * Since the VPC resource doesn't support providing a physical name, the value provided here
     * will be recorded in the `Name` tag
     */
    public fun vpcName(vpcName: String)

    /**
     * @param vpnConnections VPN connections to this VPC.
     */
    public fun vpnConnections(vpnConnections: Map<String, VpnConnectionOptions>)

    /**
     * @param vpnGateway Indicates whether a VPN gateway should be created and attached to this VPC.
     */
    public fun vpnGateway(vpnGateway: Boolean)

    /**
     * @param vpnGatewayAsn The private Autonomous System Number (ASN) for the VPN gateway.
     */
    public fun vpnGatewayAsn(vpnGatewayAsn: Number)

    /**
     * @param vpnRoutePropagation Where to propagate VPN routes.
     */
    public fun vpnRoutePropagation(vpnRoutePropagation: List<SubnetSelection>)

    /**
     * @param vpnRoutePropagation Where to propagate VPN routes.
     */
    public fun vpnRoutePropagation(vararg vpnRoutePropagation: SubnetSelection)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpcProps.Builder =
        software.amazon.awscdk.services.ec2.VpcProps.builder()

    /**
     * @param availabilityZones Availability zones this VPC spans.
     * Specify this option only if you do not specify `maxAzs`.
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * @param availabilityZones Availability zones this VPC spans.
     * Specify this option only if you do not specify `maxAzs`.
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    /**
     * @param cidr The CIDR range to use for the VPC, e.g. '10.0.0.0/16'.
     * Should be a minimum of /28 and maximum size of /16. The range will be
     * split across all subnets per Availability Zone.
     * @deprecated Use ipAddresses instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    /**
     * @param createInternetGateway If set to false then disable the creation of the default
     * internet gateway.
     */
    override fun createInternetGateway(createInternetGateway: Boolean) {
      cdkBuilder.createInternetGateway(createInternetGateway)
    }

    /**
     * @param defaultInstanceTenancy The default tenancy of instances launched into the VPC.
     * By setting this to dedicated tenancy, instances will be launched on
     * hardware dedicated to a single AWS customer, unless specifically specified
     * at instance launch time. Please note, not all instance types are usable
     * with Dedicated tenancy.
     */
    override fun defaultInstanceTenancy(defaultInstanceTenancy: DefaultInstanceTenancy) {
      cdkBuilder.defaultInstanceTenancy(defaultInstanceTenancy.let(DefaultInstanceTenancy.Companion::unwrap))
    }

    /**
     * @param enableDnsHostnames Indicates whether the instances launched in the VPC get public DNS
     * hostnames.
     * If this attribute is true, instances in the VPC get public DNS hostnames,
     * but only if the enableDnsSupport attribute is also set to true.
     */
    override fun enableDnsHostnames(enableDnsHostnames: Boolean) {
      cdkBuilder.enableDnsHostnames(enableDnsHostnames)
    }

    /**
     * @param enableDnsSupport Indicates whether the DNS resolution is supported for the VPC.
     * If this attribute is false, the Amazon-provided DNS server in the VPC that
     * resolves public DNS hostnames to IP addresses is not enabled. If this
     * attribute is true, queries to the Amazon provided DNS server at the
     * 169.254.169.253 IP address, or the reserved IP address at the base of the
     * VPC IPv4 network range plus two will succeed.
     */
    override fun enableDnsSupport(enableDnsSupport: Boolean) {
      cdkBuilder.enableDnsSupport(enableDnsSupport)
    }

    /**
     * @param flowLogs Flow logs to add to this VPC.
     */
    override fun flowLogs(flowLogs: Map<String, FlowLogOptions>) {
      cdkBuilder.flowLogs(flowLogs.mapValues{FlowLogOptions.unwrap(it.value)})
    }

    /**
     * @param gatewayEndpoints Gateway endpoints to add to this VPC.
     */
    override fun gatewayEndpoints(gatewayEndpoints: Map<String, GatewayVpcEndpointOptions>) {
      cdkBuilder.gatewayEndpoints(gatewayEndpoints.mapValues{GatewayVpcEndpointOptions.unwrap(it.value)})
    }

    /**
     * @param ipAddresses The Provider to use to allocate IPv4 Space to your VPC.
     * Options include static allocation or from a pool.
     *
     * Note this is specific to IPv4 addresses.
     */
    override fun ipAddresses(ipAddresses: IIpAddresses) {
      cdkBuilder.ipAddresses(ipAddresses.let(IIpAddresses.Companion::unwrap))
    }

    /**
     * @param ipProtocol The protocol of the vpc.
     * Options are IPv4 only or dual stack.
     */
    override fun ipProtocol(ipProtocol: IpProtocol) {
      cdkBuilder.ipProtocol(ipProtocol.let(IpProtocol.Companion::unwrap))
    }

    /**
     * @param ipv6Addresses The Provider to use to allocate IPv6 Space to your VPC.
     * Options include amazon provided CIDR block.
     *
     * Note this is specific to IPv6 addresses.
     */
    override fun ipv6Addresses(ipv6Addresses: IIpv6Addresses) {
      cdkBuilder.ipv6Addresses(ipv6Addresses.let(IIpv6Addresses.Companion::unwrap))
    }

    /**
     * @param maxAzs Define the maximum number of AZs to use in this region.
     * If the region has more AZs than you want to use (for example, because of
     * EIP limits), pick a lower number here. The AZs will be sorted and picked
     * from the start of the list.
     *
     * If you pick a higher number than the number of AZs in the region, all AZs
     * in the region will be selected. To use "all AZs" available to your
     * account, use a high number (such as 99).
     *
     * Be aware that environment-agnostic stacks will be created with access to
     * only 2 AZs, so to use more than 2 AZs, be sure to specify the account and
     * region on your stack.
     *
     * Specify this option only if you do not specify `availabilityZones`.
     */
    override fun maxAzs(maxAzs: Number) {
      cdkBuilder.maxAzs(maxAzs)
    }

    /**
     * @param natGatewayProvider What type of NAT provider to use.
     * Select between NAT gateways or NAT instances. NAT gateways
     * may not be available in all AWS regions.
     */
    override fun natGatewayProvider(natGatewayProvider: NatProvider) {
      cdkBuilder.natGatewayProvider(natGatewayProvider.let(NatProvider.Companion::unwrap))
    }

    /**
     * @param natGatewaySubnets Configures the subnets which will have NAT Gateways/Instances.
     * You can pick a specific group of subnets by specifying the group name;
     * the picked subnets must be public subnets.
     *
     * Only necessary if you have more than one public subnet group.
     */
    override fun natGatewaySubnets(natGatewaySubnets: SubnetSelection) {
      cdkBuilder.natGatewaySubnets(natGatewaySubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param natGatewaySubnets Configures the subnets which will have NAT Gateways/Instances.
     * You can pick a specific group of subnets by specifying the group name;
     * the picked subnets must be public subnets.
     *
     * Only necessary if you have more than one public subnet group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d6bc3f8802c1909ef64b5a8f784e8454c781d7681640d39fd3f50af04103f5a")
    override fun natGatewaySubnets(natGatewaySubnets: SubnetSelection.Builder.() -> Unit): Unit =
        natGatewaySubnets(SubnetSelection(natGatewaySubnets))

    /**
     * @param natGateways The number of NAT Gateways/Instances to create.
     * The type of NAT gateway or instance will be determined by the
     * `natGatewayProvider` parameter.
     *
     * You can set this number lower than the number of Availability Zones in your
     * VPC in order to save on NAT cost. Be aware you may be charged for
     * cross-AZ data traffic instead.
     */
    override fun natGateways(natGateways: Number) {
      cdkBuilder.natGateways(natGateways)
    }

    /**
     * @param reservedAzs Define the number of AZs to reserve.
     * When specified, the IP space is reserved for the azs but no actual
     * resources are provisioned.
     */
    override fun reservedAzs(reservedAzs: Number) {
      cdkBuilder.reservedAzs(reservedAzs)
    }

    /**
     * @param restrictDefaultSecurityGroup If set to true then the default inbound &amp; outbound
     * rules will be removed from the default security group.
     */
    override fun restrictDefaultSecurityGroup(restrictDefaultSecurityGroup: Boolean) {
      cdkBuilder.restrictDefaultSecurityGroup(restrictDefaultSecurityGroup)
    }

    /**
     * @param subnetConfiguration Configure the subnets to build for each AZ.
     * Each entry in this list configures a Subnet Group; each group will contain a
     * subnet for each Availability Zone.
     *
     * For example, if you want 1 public subnet, 1 private subnet, and 1 isolated
     * subnet in each AZ provide the following:
     *
     * ```
     * Vpc.Builder.create(this, "VPC")
     * .subnetConfiguration(List.of(SubnetConfiguration.builder()
     * .cidrMask(24)
     * .name("ingress")
     * .subnetType(SubnetType.PUBLIC)
     * .build(), SubnetConfiguration.builder()
     * .cidrMask(24)
     * .name("application")
     * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
     * .build(), SubnetConfiguration.builder()
     * .cidrMask(28)
     * .name("rds")
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build()))
     * .build();
     * ```
     */
    override fun subnetConfiguration(subnetConfiguration: List<SubnetConfiguration>) {
      cdkBuilder.subnetConfiguration(subnetConfiguration.map(SubnetConfiguration.Companion::unwrap))
    }

    /**
     * @param subnetConfiguration Configure the subnets to build for each AZ.
     * Each entry in this list configures a Subnet Group; each group will contain a
     * subnet for each Availability Zone.
     *
     * For example, if you want 1 public subnet, 1 private subnet, and 1 isolated
     * subnet in each AZ provide the following:
     *
     * ```
     * Vpc.Builder.create(this, "VPC")
     * .subnetConfiguration(List.of(SubnetConfiguration.builder()
     * .cidrMask(24)
     * .name("ingress")
     * .subnetType(SubnetType.PUBLIC)
     * .build(), SubnetConfiguration.builder()
     * .cidrMask(24)
     * .name("application")
     * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
     * .build(), SubnetConfiguration.builder()
     * .cidrMask(28)
     * .name("rds")
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build()))
     * .build();
     * ```
     */
    override fun subnetConfiguration(vararg subnetConfiguration: SubnetConfiguration): Unit =
        subnetConfiguration(subnetConfiguration.toList())

    /**
     * @param vpcName The VPC name.
     * Since the VPC resource doesn't support providing a physical name, the value provided here
     * will be recorded in the `Name` tag
     */
    override fun vpcName(vpcName: String) {
      cdkBuilder.vpcName(vpcName)
    }

    /**
     * @param vpnConnections VPN connections to this VPC.
     */
    override fun vpnConnections(vpnConnections: Map<String, VpnConnectionOptions>) {
      cdkBuilder.vpnConnections(vpnConnections.mapValues{VpnConnectionOptions.unwrap(it.value)})
    }

    /**
     * @param vpnGateway Indicates whether a VPN gateway should be created and attached to this VPC.
     */
    override fun vpnGateway(vpnGateway: Boolean) {
      cdkBuilder.vpnGateway(vpnGateway)
    }

    /**
     * @param vpnGatewayAsn The private Autonomous System Number (ASN) for the VPN gateway.
     */
    override fun vpnGatewayAsn(vpnGatewayAsn: Number) {
      cdkBuilder.vpnGatewayAsn(vpnGatewayAsn)
    }

    /**
     * @param vpnRoutePropagation Where to propagate VPN routes.
     */
    override fun vpnRoutePropagation(vpnRoutePropagation: List<SubnetSelection>) {
      cdkBuilder.vpnRoutePropagation(vpnRoutePropagation.map(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param vpnRoutePropagation Where to propagate VPN routes.
     */
    override fun vpnRoutePropagation(vararg vpnRoutePropagation: SubnetSelection): Unit =
        vpnRoutePropagation(vpnRoutePropagation.toList())

    public fun build(): software.amazon.awscdk.services.ec2.VpcProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.VpcProps,
  ) : CdkObject(cdkObject),
      VpcProps {
    /**
     * Availability zones this VPC spans.
     *
     * Specify this option only if you do not specify `maxAzs`.
     *
     * Default: - a subset of AZs of the stack
     */
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    /**
     * (deprecated) The CIDR range to use for the VPC, e.g. '10.0.0.0/16'.
     *
     * Should be a minimum of /28 and maximum size of /16. The range will be
     * split across all subnets per Availability Zone.
     *
     * Default: Vpc.DEFAULT_CIDR_RANGE
     *
     * @deprecated Use ipAddresses instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun cidr(): String? = unwrap(this).getCidr()

    /**
     * If set to false then disable the creation of the default internet gateway.
     *
     * Default: true
     */
    override fun createInternetGateway(): Boolean? = unwrap(this).getCreateInternetGateway()

    /**
     * The default tenancy of instances launched into the VPC.
     *
     * By setting this to dedicated tenancy, instances will be launched on
     * hardware dedicated to a single AWS customer, unless specifically specified
     * at instance launch time. Please note, not all instance types are usable
     * with Dedicated tenancy.
     *
     * Default: DefaultInstanceTenancy.Default (shared) tenancy
     */
    override fun defaultInstanceTenancy(): DefaultInstanceTenancy? =
        unwrap(this).getDefaultInstanceTenancy()?.let(DefaultInstanceTenancy::wrap)

    /**
     * Indicates whether the instances launched in the VPC get public DNS hostnames.
     *
     * If this attribute is true, instances in the VPC get public DNS hostnames,
     * but only if the enableDnsSupport attribute is also set to true.
     *
     * Default: true
     */
    override fun enableDnsHostnames(): Boolean? = unwrap(this).getEnableDnsHostnames()

    /**
     * Indicates whether the DNS resolution is supported for the VPC.
     *
     * If this attribute is false, the Amazon-provided DNS server in the VPC that
     * resolves public DNS hostnames to IP addresses is not enabled. If this
     * attribute is true, queries to the Amazon provided DNS server at the
     * 169.254.169.253 IP address, or the reserved IP address at the base of the
     * VPC IPv4 network range plus two will succeed.
     *
     * Default: true
     */
    override fun enableDnsSupport(): Boolean? = unwrap(this).getEnableDnsSupport()

    /**
     * Flow logs to add to this VPC.
     *
     * Default: - No flow logs.
     */
    override fun flowLogs(): Map<String, FlowLogOptions> =
        unwrap(this).getFlowLogs()?.mapValues{FlowLogOptions.wrap(it.value)} ?: emptyMap()

    /**
     * Gateway endpoints to add to this VPC.
     *
     * Default: - None.
     */
    override fun gatewayEndpoints(): Map<String, GatewayVpcEndpointOptions> =
        unwrap(this).getGatewayEndpoints()?.mapValues{GatewayVpcEndpointOptions.wrap(it.value)} ?:
        emptyMap()

    /**
     * The Provider to use to allocate IPv4 Space to your VPC.
     *
     * Options include static allocation or from a pool.
     *
     * Note this is specific to IPv4 addresses.
     *
     * Default: ec2.IpAddresses.cidr
     */
    override fun ipAddresses(): IIpAddresses? =
        unwrap(this).getIpAddresses()?.let(IIpAddresses::wrap)

    /**
     * The protocol of the vpc.
     *
     * Options are IPv4 only or dual stack.
     *
     * Default: IpProtocol.IPV4_ONLY
     */
    override fun ipProtocol(): IpProtocol? = unwrap(this).getIpProtocol()?.let(IpProtocol::wrap)

    /**
     * The Provider to use to allocate IPv6 Space to your VPC.
     *
     * Options include amazon provided CIDR block.
     *
     * Note this is specific to IPv6 addresses.
     *
     * Default: Ipv6Addresses.amazonProvided
     */
    override fun ipv6Addresses(): IIpv6Addresses? =
        unwrap(this).getIpv6Addresses()?.let(IIpv6Addresses::wrap)

    /**
     * Define the maximum number of AZs to use in this region.
     *
     * If the region has more AZs than you want to use (for example, because of
     * EIP limits), pick a lower number here. The AZs will be sorted and picked
     * from the start of the list.
     *
     * If you pick a higher number than the number of AZs in the region, all AZs
     * in the region will be selected. To use "all AZs" available to your
     * account, use a high number (such as 99).
     *
     * Be aware that environment-agnostic stacks will be created with access to
     * only 2 AZs, so to use more than 2 AZs, be sure to specify the account and
     * region on your stack.
     *
     * Specify this option only if you do not specify `availabilityZones`.
     *
     * Default: 3
     */
    override fun maxAzs(): Number? = unwrap(this).getMaxAzs()

    /**
     * What type of NAT provider to use.
     *
     * Select between NAT gateways or NAT instances. NAT gateways
     * may not be available in all AWS regions.
     *
     * Default: NatProvider.gateway()
     */
    override fun natGatewayProvider(): NatProvider? =
        unwrap(this).getNatGatewayProvider()?.let(NatProvider::wrap)

    /**
     * Configures the subnets which will have NAT Gateways/Instances.
     *
     * You can pick a specific group of subnets by specifying the group name;
     * the picked subnets must be public subnets.
     *
     * Only necessary if you have more than one public subnet group.
     *
     * Default: - All public subnets.
     */
    override fun natGatewaySubnets(): SubnetSelection? =
        unwrap(this).getNatGatewaySubnets()?.let(SubnetSelection::wrap)

    /**
     * The number of NAT Gateways/Instances to create.
     *
     * The type of NAT gateway or instance will be determined by the
     * `natGatewayProvider` parameter.
     *
     * You can set this number lower than the number of Availability Zones in your
     * VPC in order to save on NAT cost. Be aware you may be charged for
     * cross-AZ data traffic instead.
     *
     * Default: - One NAT gateway/instance per Availability Zone
     */
    override fun natGateways(): Number? = unwrap(this).getNatGateways()

    /**
     * Define the number of AZs to reserve.
     *
     * When specified, the IP space is reserved for the azs but no actual
     * resources are provisioned.
     *
     * Default: 0
     */
    override fun reservedAzs(): Number? = unwrap(this).getReservedAzs()

    /**
     * If set to true then the default inbound &amp; outbound rules will be removed from the default
     * security group.
     *
     * Default: true if '@aws-cdk/aws-ec2:restrictDefaultSecurityGroup' is enabled, false otherwise
     */
    override fun restrictDefaultSecurityGroup(): Boolean? =
        unwrap(this).getRestrictDefaultSecurityGroup()

    /**
     * Configure the subnets to build for each AZ.
     *
     * Each entry in this list configures a Subnet Group; each group will contain a
     * subnet for each Availability Zone.
     *
     * For example, if you want 1 public subnet, 1 private subnet, and 1 isolated
     * subnet in each AZ provide the following:
     *
     * ```
     * Vpc.Builder.create(this, "VPC")
     * .subnetConfiguration(List.of(SubnetConfiguration.builder()
     * .cidrMask(24)
     * .name("ingress")
     * .subnetType(SubnetType.PUBLIC)
     * .build(), SubnetConfiguration.builder()
     * .cidrMask(24)
     * .name("application")
     * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
     * .build(), SubnetConfiguration.builder()
     * .cidrMask(28)
     * .name("rds")
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build()))
     * .build();
     * ```
     *
     * Default: - The VPC CIDR will be evenly divided between 1 public and 1
     * private subnet per AZ.
     */
    override fun subnetConfiguration(): List<SubnetConfiguration> =
        unwrap(this).getSubnetConfiguration()?.map(SubnetConfiguration::wrap) ?: emptyList()

    /**
     * The VPC name.
     *
     * Since the VPC resource doesn't support providing a physical name, the value provided here
     * will be recorded in the `Name` tag
     *
     * Default: this.node.path
     */
    override fun vpcName(): String? = unwrap(this).getVpcName()

    /**
     * VPN connections to this VPC.
     *
     * Default: - No connections.
     */
    override fun vpnConnections(): Map<String, VpnConnectionOptions> =
        unwrap(this).getVpnConnections()?.mapValues{VpnConnectionOptions.wrap(it.value)} ?:
        emptyMap()

    /**
     * Indicates whether a VPN gateway should be created and attached to this VPC.
     *
     * Default: - true when vpnGatewayAsn or vpnConnections is specified
     */
    override fun vpnGateway(): Boolean? = unwrap(this).getVpnGateway()

    /**
     * The private Autonomous System Number (ASN) for the VPN gateway.
     *
     * Default: - Amazon default ASN.
     */
    override fun vpnGatewayAsn(): Number? = unwrap(this).getVpnGatewayAsn()

    /**
     * Where to propagate VPN routes.
     *
     * Default: - On the route tables associated with private subnets. If no
     * private subnets exists, isolated subnets are used. If no isolated subnets
     * exists, public subnets are used.
     */
    override fun vpnRoutePropagation(): List<SubnetSelection> =
        unwrap(this).getVpnRoutePropagation()?.map(SubnetSelection::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpcProps): VpcProps =
        CdkObjectWrappers.wrap(cdkObject) as? VpcProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcProps): software.amazon.awscdk.services.ec2.VpcProps = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.VpcProps
  }
}
