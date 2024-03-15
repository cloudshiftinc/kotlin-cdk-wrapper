@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface VpcProps {
  public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?: emptyList()

  @Deprecated(message = "deprecated in CDK")
  public fun cidr(): String? = unwrap(this).getCidr()

  public fun createInternetGateway(): Boolean? = unwrap(this).getCreateInternetGateway()

  public fun defaultInstanceTenancy(): DefaultInstanceTenancy? =
      unwrap(this).getDefaultInstanceTenancy()?.let(DefaultInstanceTenancy::wrap)

  public fun enableDnsHostnames(): Boolean? = unwrap(this).getEnableDnsHostnames()

  public fun enableDnsSupport(): Boolean? = unwrap(this).getEnableDnsSupport()

  public fun flowLogs(): Map<String, FlowLogOptions> =
      unwrap(this).getFlowLogs()?.mapValues{FlowLogOptions.wrap(it.value)} ?: emptyMap()

  public fun gatewayEndpoints(): Map<String, GatewayVpcEndpointOptions> =
      unwrap(this).getGatewayEndpoints()?.mapValues{GatewayVpcEndpointOptions.wrap(it.value)} ?:
      emptyMap()

  public fun ipAddresses(): IIpAddresses? = unwrap(this).getIpAddresses()?.let(IIpAddresses::wrap)

  public fun ipProtocol(): IpProtocol? = unwrap(this).getIpProtocol()?.let(IpProtocol::wrap)

  public fun ipv6Addresses(): IIpv6Addresses? =
      unwrap(this).getIpv6Addresses()?.let(IIpv6Addresses::wrap)

  public fun maxAzs(): Number? = unwrap(this).getMaxAzs()

  public fun natGatewayProvider(): NatProvider? =
      unwrap(this).getNatGatewayProvider()?.let(NatProvider::wrap)

  public fun natGatewaySubnets(): SubnetSelection? =
      unwrap(this).getNatGatewaySubnets()?.let(SubnetSelection::wrap)

  public fun natGateways(): Number? = unwrap(this).getNatGateways()

  public fun reservedAzs(): Number? = unwrap(this).getReservedAzs()

  public fun restrictDefaultSecurityGroup(): Boolean? =
      unwrap(this).getRestrictDefaultSecurityGroup()

  public fun subnetConfiguration(): List<SubnetConfiguration> =
      unwrap(this).getSubnetConfiguration()?.map(SubnetConfiguration::wrap) ?: emptyList()

  public fun vpcName(): String? = unwrap(this).getVpcName()

  public fun vpnConnections(): Map<String, VpnConnectionOptions> =
      unwrap(this).getVpnConnections()?.mapValues{VpnConnectionOptions.wrap(it.value)} ?: emptyMap()

  public fun vpnGateway(): Boolean? = unwrap(this).getVpnGateway()

  public fun vpnGatewayAsn(): Number? = unwrap(this).getVpnGatewayAsn()

  public fun vpnRoutePropagation(): List<SubnetSelection> =
      unwrap(this).getVpnRoutePropagation()?.map(SubnetSelection::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun availabilityZones(availabilityZones: List<String>)

    public fun availabilityZones(vararg availabilityZones: String)

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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d6bc3f8802c1909ef64b5a8f784e8454c781d7681640d39fd3f50af04103f5a")
    public fun natGatewaySubnets(natGatewaySubnets: SubnetSelection.Builder.() -> Unit)

    public fun natGateways(natGateways: Number)

    public fun reservedAzs(reservedAzs: Number)

    public fun restrictDefaultSecurityGroup(restrictDefaultSecurityGroup: Boolean)

    public fun subnetConfiguration(subnetConfiguration: List<SubnetConfiguration>)

    public fun subnetConfiguration(vararg subnetConfiguration: SubnetConfiguration)

    public fun vpcName(vpcName: String)

    public fun vpnConnections(vpnConnections: Map<String, VpnConnectionOptions>)

    public fun vpnGateway(vpnGateway: Boolean)

    public fun vpnGatewayAsn(vpnGatewayAsn: Number)

    public fun vpnRoutePropagation(vpnRoutePropagation: List<SubnetSelection>)

    public fun vpnRoutePropagation(vararg vpnRoutePropagation: SubnetSelection)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpcProps.Builder =
        software.amazon.awscdk.services.ec2.VpcProps.builder()

    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d6bc3f8802c1909ef64b5a8f784e8454c781d7681640d39fd3f50af04103f5a")
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

    override fun subnetConfiguration(vararg subnetConfiguration: SubnetConfiguration): Unit =
        subnetConfiguration(subnetConfiguration.toList())

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

    override fun vpnRoutePropagation(vararg vpnRoutePropagation: SubnetSelection): Unit =
        vpnRoutePropagation(vpnRoutePropagation.toList())

    public fun build(): software.amazon.awscdk.services.ec2.VpcProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.VpcProps,
  ) : CdkObject(cdkObject), VpcProps {
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    @Deprecated(message = "deprecated in CDK")
    override fun cidr(): String? = unwrap(this).getCidr()

    override fun createInternetGateway(): Boolean? = unwrap(this).getCreateInternetGateway()

    override fun defaultInstanceTenancy(): DefaultInstanceTenancy? =
        unwrap(this).getDefaultInstanceTenancy()?.let(DefaultInstanceTenancy::wrap)

    override fun enableDnsHostnames(): Boolean? = unwrap(this).getEnableDnsHostnames()

    override fun enableDnsSupport(): Boolean? = unwrap(this).getEnableDnsSupport()

    override fun flowLogs(): Map<String, FlowLogOptions> =
        unwrap(this).getFlowLogs()?.mapValues{FlowLogOptions.wrap(it.value)} ?: emptyMap()

    override fun gatewayEndpoints(): Map<String, GatewayVpcEndpointOptions> =
        unwrap(this).getGatewayEndpoints()?.mapValues{GatewayVpcEndpointOptions.wrap(it.value)} ?:
        emptyMap()

    override fun ipAddresses(): IIpAddresses? =
        unwrap(this).getIpAddresses()?.let(IIpAddresses::wrap)

    override fun ipProtocol(): IpProtocol? = unwrap(this).getIpProtocol()?.let(IpProtocol::wrap)

    override fun ipv6Addresses(): IIpv6Addresses? =
        unwrap(this).getIpv6Addresses()?.let(IIpv6Addresses::wrap)

    override fun maxAzs(): Number? = unwrap(this).getMaxAzs()

    override fun natGatewayProvider(): NatProvider? =
        unwrap(this).getNatGatewayProvider()?.let(NatProvider::wrap)

    override fun natGatewaySubnets(): SubnetSelection? =
        unwrap(this).getNatGatewaySubnets()?.let(SubnetSelection::wrap)

    override fun natGateways(): Number? = unwrap(this).getNatGateways()

    override fun reservedAzs(): Number? = unwrap(this).getReservedAzs()

    override fun restrictDefaultSecurityGroup(): Boolean? =
        unwrap(this).getRestrictDefaultSecurityGroup()

    override fun subnetConfiguration(): List<SubnetConfiguration> =
        unwrap(this).getSubnetConfiguration()?.map(SubnetConfiguration::wrap) ?: emptyList()

    override fun vpcName(): String? = unwrap(this).getVpcName()

    override fun vpnConnections(): Map<String, VpnConnectionOptions> =
        unwrap(this).getVpnConnections()?.mapValues{VpnConnectionOptions.wrap(it.value)} ?:
        emptyMap()

    override fun vpnGateway(): Boolean? = unwrap(this).getVpnGateway()

    override fun vpnGatewayAsn(): Number? = unwrap(this).getVpnGatewayAsn()

    override fun vpnRoutePropagation(): List<SubnetSelection> =
        unwrap(this).getVpnRoutePropagation()?.map(SubnetSelection::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpcProps): VpcProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcProps): software.amazon.awscdk.services.ec2.VpcProps = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.VpcProps
  }
}
