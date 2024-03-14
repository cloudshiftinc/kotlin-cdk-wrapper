package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.IDependable
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Vpc internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.Vpc,
) : Resource(cdkObject), IVpc {
  /**
   * Adds a new client VPN endpoint to this VPC.
   *
   * @param id 
   * @param options 
   */
  public override fun addClientVpnEndpoint(id: String, options: ClientVpnEndpointOptions):
      ClientVpnEndpoint = unwrap(this).addClientVpnEndpoint(id,
      options.let(ClientVpnEndpointOptions::unwrap)).let(ClientVpnEndpoint::wrap)

  /**
   * Adds a new client VPN endpoint to this VPC.
   *
   * @param id 
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9867bb96829934449edc260a28ad25313b9e46415f161716411c1dc3f8a0777")
  public override fun addClientVpnEndpoint(id: String,
      options: ClientVpnEndpointOptions.Builder.() -> Unit): ClientVpnEndpoint =
      addClientVpnEndpoint(id, ClientVpnEndpointOptions(options))

  /**
   * Adds a new flow log to this VPC.
   *
   * @param id 
   * @param options
   */
  public override fun addFlowLog(id: String): FlowLog =
      unwrap(this).addFlowLog(id).let(FlowLog::wrap)

  /**
   * Adds a new flow log to this VPC.
   *
   * @param id 
   * @param options
   */
  public override fun addFlowLog(id: String, options: FlowLogOptions): FlowLog =
      unwrap(this).addFlowLog(id, options.let(FlowLogOptions::unwrap)).let(FlowLog::wrap)

  /**
   * Adds a new flow log to this VPC.
   *
   * @param id 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9694d439eff0a0b7410bef2929300223bfcd80e853da6012ab893a1556726e61")
  public override fun addFlowLog(id: String, options: FlowLogOptions.Builder.() -> Unit): FlowLog =
      addFlowLog(id, FlowLogOptions(options))

  /**
   * Adds a new gateway endpoint to this VPC.
   *
   * @param id 
   * @param options 
   */
  public override fun addGatewayEndpoint(id: String, options: GatewayVpcEndpointOptions):
      GatewayVpcEndpoint = unwrap(this).addGatewayEndpoint(id,
      options.let(GatewayVpcEndpointOptions::unwrap)).let(GatewayVpcEndpoint::wrap)

  /**
   * Adds a new gateway endpoint to this VPC.
   *
   * @param id 
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0358f597f2d85d52f474246428a7d6b6a783f8b6e281584ba207e87da87ecfc9")
  public override fun addGatewayEndpoint(id: String,
      options: GatewayVpcEndpointOptions.Builder.() -> Unit): GatewayVpcEndpoint =
      addGatewayEndpoint(id, GatewayVpcEndpointOptions(options))

  /**
   * Adds a new interface endpoint to this VPC.
   *
   * @param id 
   * @param options 
   */
  public override fun addInterfaceEndpoint(id: String, options: InterfaceVpcEndpointOptions):
      InterfaceVpcEndpoint = unwrap(this).addInterfaceEndpoint(id,
      options.let(InterfaceVpcEndpointOptions::unwrap)).let(InterfaceVpcEndpoint::wrap)

  /**
   * Adds a new interface endpoint to this VPC.
   *
   * @param id 
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5687c2ffc6f0ea79a369efbf6653613fa2d37983f1ceea66663564e5abbb9d87")
  public override fun addInterfaceEndpoint(id: String,
      options: InterfaceVpcEndpointOptions.Builder.() -> Unit): InterfaceVpcEndpoint =
      addInterfaceEndpoint(id, InterfaceVpcEndpointOptions(options))

  /**
   * Adds a new VPN connection to this VPC.
   *
   * @param id 
   * @param options 
   */
  public override fun addVpnConnection(id: String, options: VpnConnectionOptions): VpnConnection =
      unwrap(this).addVpnConnection(id,
      options.let(VpnConnectionOptions::unwrap)).let(VpnConnection::wrap)

  /**
   * Adds a new VPN connection to this VPC.
   *
   * @param id 
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9494479c72b80059e9912c1942267f6410024b87e77370ac10ee3b1e7201163")
  public override fun addVpnConnection(id: String,
      options: VpnConnectionOptions.Builder.() -> Unit): VpnConnection = addVpnConnection(id,
      VpnConnectionOptions(options))

  /**
   * AZs for this VPC.
   */
  public override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones()

  /**
   * Indicates if instances launched in this VPC will have public DNS hostnames.
   */
  public open fun dnsHostnamesEnabled(): Boolean = unwrap(this).getDnsHostnamesEnabled()

  /**
   * Indicates if DNS support is enabled for this VPC.
   */
  public open fun dnsSupportEnabled(): Boolean = unwrap(this).getDnsSupportEnabled()

  /**
   * Adds a VPN Gateway to this VPC.
   *
   * @param options 
   */
  public override fun enableVpnGateway(options: EnableVpnGatewayOptions) {
    unwrap(this).enableVpnGateway(options.let(EnableVpnGatewayOptions::unwrap))
  }

  /**
   * Adds a VPN Gateway to this VPC.
   *
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0419d315196f5544d7f849797f4d6ab898040391ac4500e80dbee4e7772c698c")
  public override fun enableVpnGateway(options: EnableVpnGatewayOptions.Builder.() -> Unit): Unit =
      enableVpnGateway(EnableVpnGatewayOptions(options))

  /**
   * Dependencies for internet connectivity.
   */
  public override fun internetConnectivityEstablished(): IDependable =
      unwrap(this).getInternetConnectivityEstablished().let(IDependable::wrap)

  /**
   * Internet Gateway for the VPC.
   *
   * Note that in case the VPC is configured only
   * with ISOLATED subnets, this attribute will be `undefined`.
   */
  public open fun internetGatewayId(): String? = unwrap(this).getInternetGatewayId()

  /**
   * List of isolated subnets in this VPC.
   */
  public override fun isolatedSubnets(): List<ISubnet> =
      unwrap(this).getIsolatedSubnets().map(ISubnet::wrap)

  /**
   * List of private subnets in this VPC.
   */
  public override fun privateSubnets(): List<ISubnet> =
      unwrap(this).getPrivateSubnets().map(ISubnet::wrap)

  /**
   * List of public subnets in this VPC.
   */
  public override fun publicSubnets(): List<ISubnet> =
      unwrap(this).getPublicSubnets().map(ISubnet::wrap)

  /**
   * Returns IDs of selected subnets.
   *
   * @param selection
   */
  public override fun selectSubnets(): SelectedSubnets =
      unwrap(this).selectSubnets().let(SelectedSubnets::wrap)

  /**
   * Returns IDs of selected subnets.
   *
   * @param selection
   */
  public override fun selectSubnets(selection: SubnetSelection): SelectedSubnets =
      unwrap(this).selectSubnets(selection.let(SubnetSelection::unwrap)).let(SelectedSubnets::wrap)

  /**
   * Returns IDs of selected subnets.
   *
   * @param selection
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3ff24695b1c0049f856a227bcf1aebd4677ac82763e86022909a5eedb23a1da4")
  public override fun selectSubnets(selection: SubnetSelection.Builder.() -> Unit): SelectedSubnets
      = selectSubnets(SubnetSelection(selection))

  /**
   * Arn of this VPC.
   */
  public override fun vpcArn(): String = unwrap(this).getVpcArn()

  /**
   * CIDR range for this VPC.
   */
  public override fun vpcCidrBlock(): String = unwrap(this).getVpcCidrBlock()

  /**
   *
   */
  public open fun vpcCidrBlockAssociations(): List<String> =
      unwrap(this).getVpcCidrBlockAssociations()

  /**
   *
   */
  public open fun vpcDefaultNetworkAcl(): String = unwrap(this).getVpcDefaultNetworkAcl()

  /**
   *
   */
  public open fun vpcDefaultSecurityGroup(): String = unwrap(this).getVpcDefaultSecurityGroup()

  /**
   * Identifier for this VPC.
   */
  public override fun vpcId(): String = unwrap(this).getVpcId()

  /**
   *
   */
  public open fun vpcIpv6CidrBlocks(): List<String> = unwrap(this).getVpcIpv6CidrBlocks()

  /**
   * Returns the id of the VPN Gateway (if enabled).
   */
  public override fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.Vpc].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Availability zones this VPC spans.
     *
     * Specify this option only if you do not specify `maxAzs`.
     *
     * Default: - a subset of AZs of the stack
     *
     * @param availabilityZones Availability zones this VPC spans. 
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * Availability zones this VPC spans.
     *
     * Specify this option only if you do not specify `maxAzs`.
     *
     * Default: - a subset of AZs of the stack
     *
     * @param availabilityZones Availability zones this VPC spans. 
     */
    public fun availabilityZones(vararg availabilityZones: String)

    /**
     * (deprecated) The CIDR range to use for the VPC, e.g. '10.0.0.0/16'.
     *
     * Should be a minimum of /28 and maximum size of /16. The range will be
     * split across all subnets per Availability Zone.
     *
     * Default: Vpc.DEFAULT_CIDR_RANGE
     *
     * @deprecated Use ipAddresses instead
     * @param cidr The CIDR range to use for the VPC, e.g. '10.0.0.0/16'. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun cidr(cidr: String)

    /**
     * If set to false then disable the creation of the default internet gateway.
     *
     * Default: true
     *
     * @param createInternetGateway If set to false then disable the creation of the default
     * internet gateway. 
     */
    public fun createInternetGateway(createInternetGateway: Boolean)

    /**
     * The default tenancy of instances launched into the VPC.
     *
     * By setting this to dedicated tenancy, instances will be launched on
     * hardware dedicated to a single AWS customer, unless specifically specified
     * at instance launch time. Please note, not all instance types are usable
     * with Dedicated tenancy.
     *
     * Default: DefaultInstanceTenancy.Default (shared) tenancy
     *
     * @param defaultInstanceTenancy The default tenancy of instances launched into the VPC. 
     */
    public fun defaultInstanceTenancy(defaultInstanceTenancy: DefaultInstanceTenancy)

    /**
     * Indicates whether the instances launched in the VPC get public DNS hostnames.
     *
     * If this attribute is true, instances in the VPC get public DNS hostnames,
     * but only if the enableDnsSupport attribute is also set to true.
     *
     * Default: true
     *
     * @param enableDnsHostnames Indicates whether the instances launched in the VPC get public DNS
     * hostnames. 
     */
    public fun enableDnsHostnames(enableDnsHostnames: Boolean)

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
     *
     * @param enableDnsSupport Indicates whether the DNS resolution is supported for the VPC. 
     */
    public fun enableDnsSupport(enableDnsSupport: Boolean)

    /**
     * Flow logs to add to this VPC.
     *
     * Default: - No flow logs.
     *
     * @param flowLogs Flow logs to add to this VPC. 
     */
    public fun flowLogs(flowLogs: Map<String, FlowLogOptions>)

    /**
     * Gateway endpoints to add to this VPC.
     *
     * Default: - None.
     *
     * @param gatewayEndpoints Gateway endpoints to add to this VPC. 
     */
    public fun gatewayEndpoints(gatewayEndpoints: Map<String, GatewayVpcEndpointOptions>)

    /**
     * The Provider to use to allocate IPv4 Space to your VPC.
     *
     * Options include static allocation or from a pool.
     *
     * Note this is specific to IPv4 addresses.
     *
     * Default: ec2.IpAddresses.cidr
     *
     * @param ipAddresses The Provider to use to allocate IPv4 Space to your VPC. 
     */
    public fun ipAddresses(ipAddresses: IIpAddresses)

    /**
     * The protocol of the vpc.
     *
     * Options are IPv4 only or dual stack.
     *
     * Default: IpProtocol.IPV4_ONLY
     *
     * @param ipProtocol The protocol of the vpc. 
     */
    public fun ipProtocol(ipProtocol: IpProtocol)

    /**
     * The Provider to use to allocate IPv6 Space to your VPC.
     *
     * Options include amazon provided CIDR block.
     *
     * Note this is specific to IPv6 addresses.
     *
     * Default: Ipv6Addresses.amazonProvided
     *
     * @param ipv6Addresses The Provider to use to allocate IPv6 Space to your VPC. 
     */
    public fun ipv6Addresses(ipv6Addresses: IIpv6Addresses)

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
     *
     * @param maxAzs Define the maximum number of AZs to use in this region. 
     */
    public fun maxAzs(maxAzs: Number)

    /**
     * What type of NAT provider to use.
     *
     * Select between NAT gateways or NAT instances. NAT gateways
     * may not be available in all AWS regions.
     *
     * Default: NatProvider.gateway()
     *
     * @param natGatewayProvider What type of NAT provider to use. 
     */
    public fun natGatewayProvider(natGatewayProvider: NatProvider)

    /**
     * Configures the subnets which will have NAT Gateways/Instances.
     *
     * You can pick a specific group of subnets by specifying the group name;
     * the picked subnets must be public subnets.
     *
     * Only necessary if you have more than one public subnet group.
     *
     * Default: - All public subnets.
     *
     * @param natGatewaySubnets Configures the subnets which will have NAT Gateways/Instances. 
     */
    public fun natGatewaySubnets(natGatewaySubnets: SubnetSelection)

    /**
     * Configures the subnets which will have NAT Gateways/Instances.
     *
     * You can pick a specific group of subnets by specifying the group name;
     * the picked subnets must be public subnets.
     *
     * Only necessary if you have more than one public subnet group.
     *
     * Default: - All public subnets.
     *
     * @param natGatewaySubnets Configures the subnets which will have NAT Gateways/Instances. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd126bbf35ef771f13980b947b33075c4f461eb29e9008839010fa6db310f4b5")
    public fun natGatewaySubnets(natGatewaySubnets: SubnetSelection.Builder.() -> Unit)

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
     *
     * @param natGateways The number of NAT Gateways/Instances to create. 
     */
    public fun natGateways(natGateways: Number)

    /**
     * Define the number of AZs to reserve.
     *
     * When specified, the IP space is reserved for the azs but no actual
     * resources are provisioned.
     *
     * Default: 0
     *
     * @param reservedAzs Define the number of AZs to reserve. 
     */
    public fun reservedAzs(reservedAzs: Number)

    /**
     * If set to true then the default inbound &amp; outbound rules will be removed from the default
     * security group.
     *
     * Default: true if '@aws-cdk/aws-ec2:restrictDefaultSecurityGroup' is enabled, false otherwise
     *
     * @param restrictDefaultSecurityGroup If set to true then the default inbound &amp; outbound
     * rules will be removed from the default security group. 
     */
    public fun restrictDefaultSecurityGroup(restrictDefaultSecurityGroup: Boolean)

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
     *
     * @param subnetConfiguration Configure the subnets to build for each AZ. 
     */
    public fun subnetConfiguration(subnetConfiguration: List<SubnetConfiguration>)

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
     *
     * @param subnetConfiguration Configure the subnets to build for each AZ. 
     */
    public fun subnetConfiguration(vararg subnetConfiguration: SubnetConfiguration)

    /**
     * The VPC name.
     *
     * Since the VPC resource doesn't support providing a physical name, the value provided here
     * will be recorded in the `Name` tag
     *
     * Default: this.node.path
     *
     * @param vpcName The VPC name. 
     */
    public fun vpcName(vpcName: String)

    /**
     * VPN connections to this VPC.
     *
     * Default: - No connections.
     *
     * @param vpnConnections VPN connections to this VPC. 
     */
    public fun vpnConnections(vpnConnections: Map<String, VpnConnectionOptions>)

    /**
     * Indicates whether a VPN gateway should be created and attached to this VPC.
     *
     * Default: - true when vpnGatewayAsn or vpnConnections is specified
     *
     * @param vpnGateway Indicates whether a VPN gateway should be created and attached to this VPC.
     * 
     */
    public fun vpnGateway(vpnGateway: Boolean)

    /**
     * The private Autonomous System Number (ASN) for the VPN gateway.
     *
     * Default: - Amazon default ASN.
     *
     * @param vpnGatewayAsn The private Autonomous System Number (ASN) for the VPN gateway. 
     */
    public fun vpnGatewayAsn(vpnGatewayAsn: Number)

    /**
     * Where to propagate VPN routes.
     *
     * Default: - On the route tables associated with private subnets. If no
     * private subnets exists, isolated subnets are used. If no isolated subnets
     * exists, public subnets are used.
     *
     * @param vpnRoutePropagation Where to propagate VPN routes. 
     */
    public fun vpnRoutePropagation(vpnRoutePropagation: List<SubnetSelection>)

    /**
     * Where to propagate VPN routes.
     *
     * Default: - On the route tables associated with private subnets. If no
     * private subnets exists, isolated subnets are used. If no isolated subnets
     * exists, public subnets are used.
     *
     * @param vpnRoutePropagation Where to propagate VPN routes. 
     */
    public fun vpnRoutePropagation(vararg vpnRoutePropagation: SubnetSelection)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.Vpc.Builder =
        software.amazon.awscdk.services.ec2.Vpc.Builder.create(scope, id)

    /**
     * Availability zones this VPC spans.
     *
     * Specify this option only if you do not specify `maxAzs`.
     *
     * Default: - a subset of AZs of the stack
     *
     * @param availabilityZones Availability zones this VPC spans. 
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * Availability zones this VPC spans.
     *
     * Specify this option only if you do not specify `maxAzs`.
     *
     * Default: - a subset of AZs of the stack
     *
     * @param availabilityZones Availability zones this VPC spans. 
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    /**
     * (deprecated) The CIDR range to use for the VPC, e.g. '10.0.0.0/16'.
     *
     * Should be a minimum of /28 and maximum size of /16. The range will be
     * split across all subnets per Availability Zone.
     *
     * Default: Vpc.DEFAULT_CIDR_RANGE
     *
     * @deprecated Use ipAddresses instead
     * @param cidr The CIDR range to use for the VPC, e.g. '10.0.0.0/16'. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    /**
     * If set to false then disable the creation of the default internet gateway.
     *
     * Default: true
     *
     * @param createInternetGateway If set to false then disable the creation of the default
     * internet gateway. 
     */
    override fun createInternetGateway(createInternetGateway: Boolean) {
      cdkBuilder.createInternetGateway(createInternetGateway)
    }

    /**
     * The default tenancy of instances launched into the VPC.
     *
     * By setting this to dedicated tenancy, instances will be launched on
     * hardware dedicated to a single AWS customer, unless specifically specified
     * at instance launch time. Please note, not all instance types are usable
     * with Dedicated tenancy.
     *
     * Default: DefaultInstanceTenancy.Default (shared) tenancy
     *
     * @param defaultInstanceTenancy The default tenancy of instances launched into the VPC. 
     */
    override fun defaultInstanceTenancy(defaultInstanceTenancy: DefaultInstanceTenancy) {
      cdkBuilder.defaultInstanceTenancy(defaultInstanceTenancy.let(DefaultInstanceTenancy::unwrap))
    }

    /**
     * Indicates whether the instances launched in the VPC get public DNS hostnames.
     *
     * If this attribute is true, instances in the VPC get public DNS hostnames,
     * but only if the enableDnsSupport attribute is also set to true.
     *
     * Default: true
     *
     * @param enableDnsHostnames Indicates whether the instances launched in the VPC get public DNS
     * hostnames. 
     */
    override fun enableDnsHostnames(enableDnsHostnames: Boolean) {
      cdkBuilder.enableDnsHostnames(enableDnsHostnames)
    }

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
     *
     * @param enableDnsSupport Indicates whether the DNS resolution is supported for the VPC. 
     */
    override fun enableDnsSupport(enableDnsSupport: Boolean) {
      cdkBuilder.enableDnsSupport(enableDnsSupport)
    }

    /**
     * Flow logs to add to this VPC.
     *
     * Default: - No flow logs.
     *
     * @param flowLogs Flow logs to add to this VPC. 
     */
    override fun flowLogs(flowLogs: Map<String, FlowLogOptions>) {
      cdkBuilder.flowLogs(flowLogs.mapValues{FlowLogOptions.unwrap(it.value)})
    }

    /**
     * Gateway endpoints to add to this VPC.
     *
     * Default: - None.
     *
     * @param gatewayEndpoints Gateway endpoints to add to this VPC. 
     */
    override fun gatewayEndpoints(gatewayEndpoints: Map<String, GatewayVpcEndpointOptions>) {
      cdkBuilder.gatewayEndpoints(gatewayEndpoints.mapValues{GatewayVpcEndpointOptions.unwrap(it.value)})
    }

    /**
     * The Provider to use to allocate IPv4 Space to your VPC.
     *
     * Options include static allocation or from a pool.
     *
     * Note this is specific to IPv4 addresses.
     *
     * Default: ec2.IpAddresses.cidr
     *
     * @param ipAddresses The Provider to use to allocate IPv4 Space to your VPC. 
     */
    override fun ipAddresses(ipAddresses: IIpAddresses) {
      cdkBuilder.ipAddresses(ipAddresses.let(IIpAddresses::unwrap))
    }

    /**
     * The protocol of the vpc.
     *
     * Options are IPv4 only or dual stack.
     *
     * Default: IpProtocol.IPV4_ONLY
     *
     * @param ipProtocol The protocol of the vpc. 
     */
    override fun ipProtocol(ipProtocol: IpProtocol) {
      cdkBuilder.ipProtocol(ipProtocol.let(IpProtocol::unwrap))
    }

    /**
     * The Provider to use to allocate IPv6 Space to your VPC.
     *
     * Options include amazon provided CIDR block.
     *
     * Note this is specific to IPv6 addresses.
     *
     * Default: Ipv6Addresses.amazonProvided
     *
     * @param ipv6Addresses The Provider to use to allocate IPv6 Space to your VPC. 
     */
    override fun ipv6Addresses(ipv6Addresses: IIpv6Addresses) {
      cdkBuilder.ipv6Addresses(ipv6Addresses.let(IIpv6Addresses::unwrap))
    }

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
     *
     * @param maxAzs Define the maximum number of AZs to use in this region. 
     */
    override fun maxAzs(maxAzs: Number) {
      cdkBuilder.maxAzs(maxAzs)
    }

    /**
     * What type of NAT provider to use.
     *
     * Select between NAT gateways or NAT instances. NAT gateways
     * may not be available in all AWS regions.
     *
     * Default: NatProvider.gateway()
     *
     * @param natGatewayProvider What type of NAT provider to use. 
     */
    override fun natGatewayProvider(natGatewayProvider: NatProvider) {
      cdkBuilder.natGatewayProvider(natGatewayProvider.let(NatProvider::unwrap))
    }

    /**
     * Configures the subnets which will have NAT Gateways/Instances.
     *
     * You can pick a specific group of subnets by specifying the group name;
     * the picked subnets must be public subnets.
     *
     * Only necessary if you have more than one public subnet group.
     *
     * Default: - All public subnets.
     *
     * @param natGatewaySubnets Configures the subnets which will have NAT Gateways/Instances. 
     */
    override fun natGatewaySubnets(natGatewaySubnets: SubnetSelection) {
      cdkBuilder.natGatewaySubnets(natGatewaySubnets.let(SubnetSelection::unwrap))
    }

    /**
     * Configures the subnets which will have NAT Gateways/Instances.
     *
     * You can pick a specific group of subnets by specifying the group name;
     * the picked subnets must be public subnets.
     *
     * Only necessary if you have more than one public subnet group.
     *
     * Default: - All public subnets.
     *
     * @param natGatewaySubnets Configures the subnets which will have NAT Gateways/Instances. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd126bbf35ef771f13980b947b33075c4f461eb29e9008839010fa6db310f4b5")
    override fun natGatewaySubnets(natGatewaySubnets: SubnetSelection.Builder.() -> Unit): Unit =
        natGatewaySubnets(SubnetSelection(natGatewaySubnets))

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
     *
     * @param natGateways The number of NAT Gateways/Instances to create. 
     */
    override fun natGateways(natGateways: Number) {
      cdkBuilder.natGateways(natGateways)
    }

    /**
     * Define the number of AZs to reserve.
     *
     * When specified, the IP space is reserved for the azs but no actual
     * resources are provisioned.
     *
     * Default: 0
     *
     * @param reservedAzs Define the number of AZs to reserve. 
     */
    override fun reservedAzs(reservedAzs: Number) {
      cdkBuilder.reservedAzs(reservedAzs)
    }

    /**
     * If set to true then the default inbound &amp; outbound rules will be removed from the default
     * security group.
     *
     * Default: true if '@aws-cdk/aws-ec2:restrictDefaultSecurityGroup' is enabled, false otherwise
     *
     * @param restrictDefaultSecurityGroup If set to true then the default inbound &amp; outbound
     * rules will be removed from the default security group. 
     */
    override fun restrictDefaultSecurityGroup(restrictDefaultSecurityGroup: Boolean) {
      cdkBuilder.restrictDefaultSecurityGroup(restrictDefaultSecurityGroup)
    }

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
     *
     * @param subnetConfiguration Configure the subnets to build for each AZ. 
     */
    override fun subnetConfiguration(subnetConfiguration: List<SubnetConfiguration>) {
      cdkBuilder.subnetConfiguration(subnetConfiguration.map(SubnetConfiguration::unwrap))
    }

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
     *
     * @param subnetConfiguration Configure the subnets to build for each AZ. 
     */
    override fun subnetConfiguration(vararg subnetConfiguration: SubnetConfiguration): Unit =
        subnetConfiguration(subnetConfiguration.toList())

    /**
     * The VPC name.
     *
     * Since the VPC resource doesn't support providing a physical name, the value provided here
     * will be recorded in the `Name` tag
     *
     * Default: this.node.path
     *
     * @param vpcName The VPC name. 
     */
    override fun vpcName(vpcName: String) {
      cdkBuilder.vpcName(vpcName)
    }

    /**
     * VPN connections to this VPC.
     *
     * Default: - No connections.
     *
     * @param vpnConnections VPN connections to this VPC. 
     */
    override fun vpnConnections(vpnConnections: Map<String, VpnConnectionOptions>) {
      cdkBuilder.vpnConnections(vpnConnections.mapValues{VpnConnectionOptions.unwrap(it.value)})
    }

    /**
     * Indicates whether a VPN gateway should be created and attached to this VPC.
     *
     * Default: - true when vpnGatewayAsn or vpnConnections is specified
     *
     * @param vpnGateway Indicates whether a VPN gateway should be created and attached to this VPC.
     * 
     */
    override fun vpnGateway(vpnGateway: Boolean) {
      cdkBuilder.vpnGateway(vpnGateway)
    }

    /**
     * The private Autonomous System Number (ASN) for the VPN gateway.
     *
     * Default: - Amazon default ASN.
     *
     * @param vpnGatewayAsn The private Autonomous System Number (ASN) for the VPN gateway. 
     */
    override fun vpnGatewayAsn(vpnGatewayAsn: Number) {
      cdkBuilder.vpnGatewayAsn(vpnGatewayAsn)
    }

    /**
     * Where to propagate VPN routes.
     *
     * Default: - On the route tables associated with private subnets. If no
     * private subnets exists, isolated subnets are used. If no isolated subnets
     * exists, public subnets are used.
     *
     * @param vpnRoutePropagation Where to propagate VPN routes. 
     */
    override fun vpnRoutePropagation(vpnRoutePropagation: List<SubnetSelection>) {
      cdkBuilder.vpnRoutePropagation(vpnRoutePropagation.map(SubnetSelection::unwrap))
    }

    /**
     * Where to propagate VPN routes.
     *
     * Default: - On the route tables associated with private subnets. If no
     * private subnets exists, isolated subnets are used. If no isolated subnets
     * exists, public subnets are used.
     *
     * @param vpnRoutePropagation Where to propagate VPN routes. 
     */
    override fun vpnRoutePropagation(vararg vpnRoutePropagation: SubnetSelection): Unit =
        vpnRoutePropagation(vpnRoutePropagation.toList())

    public fun build(): software.amazon.awscdk.services.ec2.Vpc = cdkBuilder.build()
  }

  public companion object {
    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: VpcLookupOptions,
    ): IVpc =
        software.amazon.awscdk.services.ec2.Vpc.fromLookup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, options.let(VpcLookupOptions::unwrap)).let(IVpc::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfd3d4a9b937e72de676f265f17bf0e942f1bc1be6304439abd5c5d51ed927ca")
    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: VpcLookupOptions.Builder.() -> Unit,
    ): IVpc = fromLookup(scope, id, VpcLookupOptions(options))

    public fun fromVpcAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VpcAttributes,
    ): IVpc =
        software.amazon.awscdk.services.ec2.Vpc.fromVpcAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(VpcAttributes::unwrap)).let(IVpc::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b042fc2d1b4b50c558012358dc931e1a21e45cb4ade21134892c366410e05793")
    public fun fromVpcAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VpcAttributes.Builder.() -> Unit,
    ): IVpc = fromVpcAttributes(scope, id, VpcAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Vpc {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Vpc(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.Vpc): Vpc = Vpc(cdkObject)

    internal fun unwrap(wrapped: Vpc): software.amazon.awscdk.services.ec2.Vpc = wrapped.cdkObject
  }
}
