@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.DefaultInstanceTenancy
import software.amazon.awscdk.services.ec2.FlowLogOptions
import software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions
import software.amazon.awscdk.services.ec2.IIpAddresses
import software.amazon.awscdk.services.ec2.NatProvider
import software.amazon.awscdk.services.ec2.SubnetConfiguration
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ec2.VpcProps
import software.amazon.awscdk.services.ec2.VpnConnectionOptions

@CdkDslMarker
public class VpcPropsDsl {
  private val cdkBuilder: VpcProps.Builder = VpcProps.builder()

  private val _availabilityZones: MutableList<String> = mutableListOf()

  private val _subnetConfiguration: MutableList<SubnetConfiguration> = mutableListOf()

  private val _vpnRoutePropagation: MutableList<SubnetSelection> = mutableListOf()

  public fun availabilityZones(vararg availabilityZones: String) {
    _availabilityZones.addAll(listOf(*availabilityZones))
  }

  public fun availabilityZones(availabilityZones: Collection<String>) {
    _availabilityZones.addAll(availabilityZones)
  }

  public fun cidr(cidr: String) {
    cdkBuilder.cidr(cidr)
  }

  public fun defaultInstanceTenancy(defaultInstanceTenancy: DefaultInstanceTenancy) {
    cdkBuilder.defaultInstanceTenancy(defaultInstanceTenancy)
  }

  public fun enableDnsHostnames(enableDnsHostnames: Boolean) {
    cdkBuilder.enableDnsHostnames(enableDnsHostnames)
  }

  public fun enableDnsSupport(enableDnsSupport: Boolean) {
    cdkBuilder.enableDnsSupport(enableDnsSupport)
  }

  public fun flowLogs(flowLogs: Map<String, FlowLogOptions>) {
    cdkBuilder.flowLogs(flowLogs)
  }

  public fun gatewayEndpoints(gatewayEndpoints: Map<String, GatewayVpcEndpointOptions>) {
    cdkBuilder.gatewayEndpoints(gatewayEndpoints)
  }

  public fun ipAddresses(ipAddresses: IIpAddresses) {
    cdkBuilder.ipAddresses(ipAddresses)
  }

  public fun maxAzs(maxAzs: Number) {
    cdkBuilder.maxAzs(maxAzs)
  }

  public fun natGatewayProvider(natGatewayProvider: NatProvider) {
    cdkBuilder.natGatewayProvider(natGatewayProvider)
  }

  public fun natGatewaySubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    cdkBuilder.natGatewaySubnets(builder.build())
  }

  public fun natGatewaySubnets(natGatewaySubnets: SubnetSelection) {
    cdkBuilder.natGatewaySubnets(natGatewaySubnets)
  }

  public fun natGateways(natGateways: Number) {
    cdkBuilder.natGateways(natGateways)
  }

  public fun reservedAzs(reservedAzs: Number) {
    cdkBuilder.reservedAzs(reservedAzs)
  }

  public fun restrictDefaultSecurityGroup(restrictDefaultSecurityGroup: Boolean) {
    cdkBuilder.restrictDefaultSecurityGroup(restrictDefaultSecurityGroup)
  }

  public fun subnetConfiguration(subnetConfiguration: SubnetConfigurationDsl.() -> Unit) {
    _subnetConfiguration.add(SubnetConfigurationDsl().apply(subnetConfiguration).build())
  }

  public fun subnetConfiguration(subnetConfiguration: Collection<SubnetConfiguration>) {
    _subnetConfiguration.addAll(subnetConfiguration)
  }

  public fun vpcName(vpcName: String) {
    cdkBuilder.vpcName(vpcName)
  }

  public fun vpnConnections(vpnConnections: Map<String, VpnConnectionOptions>) {
    cdkBuilder.vpnConnections(vpnConnections)
  }

  public fun vpnGateway(vpnGateway: Boolean) {
    cdkBuilder.vpnGateway(vpnGateway)
  }

  public fun vpnGatewayAsn(vpnGatewayAsn: Number) {
    cdkBuilder.vpnGatewayAsn(vpnGatewayAsn)
  }

  public fun vpnRoutePropagation(vpnRoutePropagation: SubnetSelectionDsl.() -> Unit) {
    _vpnRoutePropagation.add(SubnetSelectionDsl().apply(vpnRoutePropagation).build())
  }

  public fun vpnRoutePropagation(vpnRoutePropagation: Collection<SubnetSelection>) {
    _vpnRoutePropagation.addAll(vpnRoutePropagation)
  }

  public fun build(): VpcProps {
    if(_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
    if(_subnetConfiguration.isNotEmpty()) cdkBuilder.subnetConfiguration(_subnetConfiguration)
    if(_vpnRoutePropagation.isNotEmpty()) cdkBuilder.vpnRoutePropagation(_vpnRoutePropagation)
    return cdkBuilder.build()
  }
}
