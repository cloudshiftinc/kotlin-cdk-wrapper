package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
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
  private val cdkObject: software.amazon.awscdk.services.ec2.Vpc,
) : Resource(cdkObject), IVpc {
  public override fun addClientVpnEndpoint(id: String, options: ClientVpnEndpointOptions):
      ClientVpnEndpoint = unwrap(this).addClientVpnEndpoint(id,
      options.let(ClientVpnEndpointOptions::unwrap)).let(ClientVpnEndpoint::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9867bb96829934449edc260a28ad25313b9e46415f161716411c1dc3f8a0777")
  public override fun addClientVpnEndpoint(id: String,
      options: ClientVpnEndpointOptions.Builder.() -> Unit): ClientVpnEndpoint =
      addClientVpnEndpoint(id, ClientVpnEndpointOptions(options))

  public override fun addFlowLog(id: String): FlowLog =
      unwrap(this).addFlowLog(id).let(FlowLog::wrap)

  public override fun addFlowLog(id: String, options: FlowLogOptions): FlowLog =
      unwrap(this).addFlowLog(id, options.let(FlowLogOptions::unwrap)).let(FlowLog::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9694d439eff0a0b7410bef2929300223bfcd80e853da6012ab893a1556726e61")
  public override fun addFlowLog(id: String, options: FlowLogOptions.Builder.() -> Unit): FlowLog =
      addFlowLog(id, FlowLogOptions(options))

  public override fun addGatewayEndpoint(id: String, options: GatewayVpcEndpointOptions):
      GatewayVpcEndpoint = unwrap(this).addGatewayEndpoint(id,
      options.let(GatewayVpcEndpointOptions::unwrap)).let(GatewayVpcEndpoint::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0358f597f2d85d52f474246428a7d6b6a783f8b6e281584ba207e87da87ecfc9")
  public override fun addGatewayEndpoint(id: String,
      options: GatewayVpcEndpointOptions.Builder.() -> Unit): GatewayVpcEndpoint =
      addGatewayEndpoint(id, GatewayVpcEndpointOptions(options))

  public override fun addInterfaceEndpoint(id: String, options: InterfaceVpcEndpointOptions):
      InterfaceVpcEndpoint = unwrap(this).addInterfaceEndpoint(id,
      options.let(InterfaceVpcEndpointOptions::unwrap)).let(InterfaceVpcEndpoint::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5687c2ffc6f0ea79a369efbf6653613fa2d37983f1ceea66663564e5abbb9d87")
  public override fun addInterfaceEndpoint(id: String,
      options: InterfaceVpcEndpointOptions.Builder.() -> Unit): InterfaceVpcEndpoint =
      addInterfaceEndpoint(id, InterfaceVpcEndpointOptions(options))

  public override fun addVpnConnection(id: String, options: VpnConnectionOptions): VpnConnection =
      unwrap(this).addVpnConnection(id,
      options.let(VpnConnectionOptions::unwrap)).let(VpnConnection::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9494479c72b80059e9912c1942267f6410024b87e77370ac10ee3b1e7201163")
  public override fun addVpnConnection(id: String,
      options: VpnConnectionOptions.Builder.() -> Unit): VpnConnection = addVpnConnection(id,
      VpnConnectionOptions(options))

  public override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
      emptyList()

  public open fun dnsHostnamesEnabled(): Boolean = unwrap(this).getDnsHostnamesEnabled()

  public open fun dnsSupportEnabled(): Boolean = unwrap(this).getDnsSupportEnabled()

  public override fun enableVpnGateway(options: EnableVpnGatewayOptions) {
    unwrap(this).enableVpnGateway(options.let(EnableVpnGatewayOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0419d315196f5544d7f849797f4d6ab898040391ac4500e80dbee4e7772c698c")
  public override fun enableVpnGateway(options: EnableVpnGatewayOptions.Builder.() -> Unit): Unit =
      enableVpnGateway(EnableVpnGatewayOptions(options))

  public override fun internetConnectivityEstablished(): IDependable =
      unwrap(this).getInternetConnectivityEstablished().let(IDependable::wrap)

  public open fun internetGatewayId(): String? = unwrap(this).getInternetGatewayId()

  public override fun isolatedSubnets(): List<ISubnet> =
      unwrap(this).getIsolatedSubnets().map(ISubnet::wrap)

  public override fun privateSubnets(): List<ISubnet> =
      unwrap(this).getPrivateSubnets().map(ISubnet::wrap)

  public override fun publicSubnets(): List<ISubnet> =
      unwrap(this).getPublicSubnets().map(ISubnet::wrap)

  public override fun selectSubnets(): SelectedSubnets =
      unwrap(this).selectSubnets().let(SelectedSubnets::wrap)

  public override fun selectSubnets(selection: SubnetSelection): SelectedSubnets =
      unwrap(this).selectSubnets(selection.let(SubnetSelection::unwrap)).let(SelectedSubnets::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3ff24695b1c0049f856a227bcf1aebd4677ac82763e86022909a5eedb23a1da4")
  public override fun selectSubnets(selection: SubnetSelection.Builder.() -> Unit): SelectedSubnets
      = selectSubnets(SubnetSelection(selection))

  public override fun vpcArn(): String = unwrap(this).getVpcArn()

  public override fun vpcCidrBlock(): String = unwrap(this).getVpcCidrBlock()

  public open fun vpcCidrBlockAssociations(): List<String> =
      unwrap(this).getVpcCidrBlockAssociations() ?: emptyList()

  public open fun vpcDefaultNetworkAcl(): String = unwrap(this).getVpcDefaultNetworkAcl()

  public open fun vpcDefaultSecurityGroup(): String = unwrap(this).getVpcDefaultSecurityGroup()

  public override fun vpcId(): String = unwrap(this).getVpcId()

  public open fun vpcIpv6CidrBlocks(): List<String> = unwrap(this).getVpcIpv6CidrBlocks() ?:
      emptyList()

  public override fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

  public interface Builder {
    public fun availabilityZones(availabilityZones: List<String>)

    @Deprecated(message = "deprecated in CDK")
    public fun cidr(cidr: String)

    public fun createInternetGateway(createInternetGateway: Boolean)

    public fun defaultInstanceTenancy(defaultInstanceTenancy: DefaultInstanceTenancy)

    public fun enableDnsHostnames(enableDnsHostnames: Boolean)

    public fun enableDnsSupport(enableDnsSupport: Boolean)

    public fun flowLogs(flowLogs: Map<String, FlowLogOptions>)

    public fun gatewayEndpoints(gatewayEndpoints: Map<String, GatewayVpcEndpointOptions>)

    public fun ipAddresses(ipAddresses: IIpAddresses)

    public fun ipProtocol(ipProtocol: IpProtocol)

    public fun ipv6Addresses(ipv6Addresses: IIpv6Addresses)

    public fun maxAzs(maxAzs: Number)

    public fun natGatewayProvider(natGatewayProvider: NatProvider)

    public fun natGatewaySubnets(natGatewaySubnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd126bbf35ef771f13980b947b33075c4f461eb29e9008839010fa6db310f4b5")
    public fun natGatewaySubnets(natGatewaySubnets: SubnetSelection.Builder.() -> Unit)

    public fun natGateways(natGateways: Number)

    public fun reservedAzs(reservedAzs: Number)

    public fun restrictDefaultSecurityGroup(restrictDefaultSecurityGroup: Boolean)

    public fun subnetConfiguration(subnetConfiguration: List<SubnetConfiguration>)

    public fun vpcName(vpcName: String)

    public fun vpnConnections(vpnConnections: Map<String, VpnConnectionOptions>)

    public fun vpnGateway(vpnGateway: Boolean)

    public fun vpnGatewayAsn(vpnGatewayAsn: Number)

    public fun vpnRoutePropagation(vpnRoutePropagation: List<SubnetSelection>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.Vpc.Builder =
        software.amazon.awscdk.services.ec2.Vpc.Builder.create(scope, id)

    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    override fun createInternetGateway(createInternetGateway: Boolean) {
      cdkBuilder.createInternetGateway(createInternetGateway)
    }

    override fun defaultInstanceTenancy(defaultInstanceTenancy: DefaultInstanceTenancy) {
      cdkBuilder.defaultInstanceTenancy(defaultInstanceTenancy.let(DefaultInstanceTenancy::unwrap))
    }

    override fun enableDnsHostnames(enableDnsHostnames: Boolean) {
      cdkBuilder.enableDnsHostnames(enableDnsHostnames)
    }

    override fun enableDnsSupport(enableDnsSupport: Boolean) {
      cdkBuilder.enableDnsSupport(enableDnsSupport)
    }

    override fun flowLogs(flowLogs: Map<String, FlowLogOptions>) {
      cdkBuilder.flowLogs(flowLogs.mapValues{FlowLogOptions.unwrap(it.value)})
    }

    override fun gatewayEndpoints(gatewayEndpoints: Map<String, GatewayVpcEndpointOptions>) {
      cdkBuilder.gatewayEndpoints(gatewayEndpoints.mapValues{GatewayVpcEndpointOptions.unwrap(it.value)})
    }

    override fun ipAddresses(ipAddresses: IIpAddresses) {
      cdkBuilder.ipAddresses(ipAddresses.let(IIpAddresses::unwrap))
    }

    override fun ipProtocol(ipProtocol: IpProtocol) {
      cdkBuilder.ipProtocol(ipProtocol.let(IpProtocol::unwrap))
    }

    override fun ipv6Addresses(ipv6Addresses: IIpv6Addresses) {
      cdkBuilder.ipv6Addresses(ipv6Addresses.let(IIpv6Addresses::unwrap))
    }

    override fun maxAzs(maxAzs: Number) {
      cdkBuilder.maxAzs(maxAzs)
    }

    override fun natGatewayProvider(natGatewayProvider: NatProvider) {
      cdkBuilder.natGatewayProvider(natGatewayProvider.let(NatProvider::unwrap))
    }

    override fun natGatewaySubnets(natGatewaySubnets: SubnetSelection) {
      cdkBuilder.natGatewaySubnets(natGatewaySubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd126bbf35ef771f13980b947b33075c4f461eb29e9008839010fa6db310f4b5")
    override fun natGatewaySubnets(natGatewaySubnets: SubnetSelection.Builder.() -> Unit): Unit =
        natGatewaySubnets(SubnetSelection(natGatewaySubnets))

    override fun natGateways(natGateways: Number) {
      cdkBuilder.natGateways(natGateways)
    }

    override fun reservedAzs(reservedAzs: Number) {
      cdkBuilder.reservedAzs(reservedAzs)
    }

    override fun restrictDefaultSecurityGroup(restrictDefaultSecurityGroup: Boolean) {
      cdkBuilder.restrictDefaultSecurityGroup(restrictDefaultSecurityGroup)
    }

    override fun subnetConfiguration(subnetConfiguration: List<SubnetConfiguration>) {
      cdkBuilder.subnetConfiguration(subnetConfiguration.map(SubnetConfiguration::unwrap))
    }

    override fun vpcName(vpcName: String) {
      cdkBuilder.vpcName(vpcName)
    }

    override fun vpnConnections(vpnConnections: Map<String, VpnConnectionOptions>) {
      cdkBuilder.vpnConnections(vpnConnections.mapValues{VpnConnectionOptions.unwrap(it.value)})
    }

    override fun vpnGateway(vpnGateway: Boolean) {
      cdkBuilder.vpnGateway(vpnGateway)
    }

    override fun vpnGatewayAsn(vpnGatewayAsn: Number) {
      cdkBuilder.vpnGatewayAsn(vpnGatewayAsn)
    }

    override fun vpnRoutePropagation(vpnRoutePropagation: List<SubnetSelection>) {
      cdkBuilder.vpnRoutePropagation(vpnRoutePropagation.map(SubnetSelection::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.Vpc = cdkBuilder.build()
  }

  public companion object {
    public open fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: VpcLookupOptions,
    ): IVpc =
        software.amazon.awscdk.services.ec2.Vpc.fromLookup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, options.let(VpcLookupOptions::unwrap)).let(IVpc::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfd3d4a9b937e72de676f265f17bf0e942f1bc1be6304439abd5c5d51ed927ca")
    public open fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: VpcLookupOptions.Builder.() -> Unit,
    ): IVpc = fromLookup(scope, id, VpcLookupOptions(options))

    public open fun fromVpcAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VpcAttributes,
    ): IVpc =
        software.amazon.awscdk.services.ec2.Vpc.fromVpcAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(VpcAttributes::unwrap)).let(IVpc::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b042fc2d1b4b50c558012358dc931e1a21e45cb4ade21134892c366410e05793")
    public open fun fromVpcAttributes(
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
