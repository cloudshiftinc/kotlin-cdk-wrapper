@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import software.amazon.awscdk.CfnResource
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint
import software.amazon.awscdk.services.ec2.CfnEC2Fleet
import software.amazon.awscdk.services.ec2.CfnInstance
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntry
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath
import software.amazon.awscdk.services.ec2.CfnSpotFleet
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider
import software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRule
import software.amazon.awscdk.services.ec2.ClientVpnEndpoint
import software.amazon.awscdk.services.ec2.ClientVpnRoute
import software.amazon.awscdk.services.ec2.CloudFormationInit
import software.amazon.awscdk.services.ec2.Connections
import software.amazon.awscdk.services.ec2.FlowLog
import software.amazon.awscdk.services.ec2.GatewayVpcEndpoint
import software.amazon.awscdk.services.ec2.IConnectable
import software.amazon.awscdk.services.ec2.IIpAddresses
import software.amazon.awscdk.services.ec2.INetworkAcl
import software.amazon.awscdk.services.ec2.IPeer
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.IVpnConnection
import software.amazon.awscdk.services.ec2.Instance
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint
import software.amazon.awscdk.services.ec2.MultipartUserData
import software.amazon.awscdk.services.ec2.NatInstanceProvider
import software.amazon.awscdk.services.ec2.NatProvider
import software.amazon.awscdk.services.ec2.NetworkAcl
import software.amazon.awscdk.services.ec2.NetworkAclEntry
import software.amazon.awscdk.services.ec2.SecurityGroup
import software.amazon.awscdk.services.ec2.SelectedSubnets
import software.amazon.awscdk.services.ec2.Subnet
import software.amazon.awscdk.services.ec2.SubnetIpamOptions
import software.amazon.awscdk.services.ec2.UserData
import software.amazon.awscdk.services.ec2.Vpc
import software.amazon.awscdk.services.ec2.VpcEndpoint
import software.amazon.awscdk.services.ec2.VpnConnection
import software.amazon.awscdk.services.ec2.VpnConnectionBase
import kotlin.String
import kotlin.Unit

public inline fun CfnVerifiedAccessTrustProvider.setDeviceOptions(
    block: CfnVerifiedAccessTrustProviderDeviceOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnVerifiedAccessTrustProviderDeviceOptionsPropertyDsl()
    builder.apply(block)
    return setDeviceOptions(builder.build())
}

public inline fun CfnVerifiedAccessTrustProvider.setOidcOptions(
    block: CfnVerifiedAccessTrustProviderOidcOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnVerifiedAccessTrustProviderOidcOptionsPropertyDsl()
    builder.apply(block)
    return setOidcOptions(builder.build())
}

public inline fun CfnTrafficMirrorFilterRule.setDestinationPortRange(
    block: CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl()
    builder.apply(block)
    return setDestinationPortRange(builder.build())
}

public inline fun CfnTrafficMirrorFilterRule.setSourcePortRange(
    block: CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl()
    builder.apply(block)
    return setSourcePortRange(builder.build())
}

public inline fun CfnEC2Fleet.setTargetCapacitySpecification(
    block: CfnEC2FleetTargetCapacitySpecificationRequestPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnEC2FleetTargetCapacitySpecificationRequestPropertyDsl()
    builder.apply(block)
    return setTargetCapacitySpecification(builder.build())
}

public inline fun CfnEC2Fleet.setOnDemandOptions(
    block: CfnEC2FleetOnDemandOptionsRequestPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnEC2FleetOnDemandOptionsRequestPropertyDsl()
    builder.apply(block)
    return setOnDemandOptions(builder.build())
}

public inline fun CfnEC2Fleet.setSpotOptions(
    block: CfnEC2FleetSpotOptionsRequestPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnEC2FleetSpotOptionsRequestPropertyDsl()
    builder.apply(block)
    return setSpotOptions(builder.build())
}

public inline fun IVpnConnection.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(arg0, builder.build())
}

public inline fun IVpnConnection.metricTunnelDataIn(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTunnelDataIn(builder.build())
}

public inline fun IVpnConnection.metricTunnelDataOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTunnelDataOut(builder.build())
}

public inline fun IVpnConnection.metricTunnelState(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTunnelState(builder.build())
}

public inline fun UserData.addExecuteFileCommand(block: ExecuteFileOptionsDsl.() -> Unit = {}) {
    val builder = ExecuteFileOptionsDsl()
    builder.apply(block)
    return addExecuteFileCommand(builder.build())
}

public inline fun UserData.addS3DownloadCommand(block: S3DownloadOptionsDsl.() -> Unit = {}): String {
    val builder = S3DownloadOptionsDsl()
    builder.apply(block)
    return addS3DownloadCommand(builder.build())
}

public inline fun MultipartUserData.addExecuteFileCommand(
    block: ExecuteFileOptionsDsl.() -> Unit =
        {},
) {
    val builder = ExecuteFileOptionsDsl()
    builder.apply(block)
    return addExecuteFileCommand(builder.build())
}

public inline fun MultipartUserData.addS3DownloadCommand(
    block: S3DownloadOptionsDsl.() -> Unit =
        {},
): String {
    val builder = S3DownloadOptionsDsl()
    builder.apply(block)
    return addS3DownloadCommand(builder.build())
}

public inline fun Vpc.addClientVpnEndpoint(
    id: String,
    block: ClientVpnEndpointOptionsDsl.() -> Unit =
        {},
): ClientVpnEndpoint {
    val builder = ClientVpnEndpointOptionsDsl()
    builder.apply(block)
    return addClientVpnEndpoint(id, builder.build())
}

public inline fun Vpc.addFlowLog(id: String, block: FlowLogOptionsDsl.() -> Unit = {}): FlowLog {
    val builder = FlowLogOptionsDsl()
    builder.apply(block)
    return addFlowLog(id, builder.build())
}

public inline fun Vpc.addGatewayEndpoint(
    id: String,
    block: GatewayVpcEndpointOptionsDsl.() -> Unit =
        {},
): GatewayVpcEndpoint {
    val builder = GatewayVpcEndpointOptionsDsl()
    builder.apply(block)
    return addGatewayEndpoint(id, builder.build())
}

public inline fun Vpc.addInterfaceEndpoint(
    id: String,
    block: InterfaceVpcEndpointOptionsDsl.() -> Unit = {},
): InterfaceVpcEndpoint {
    val builder = InterfaceVpcEndpointOptionsDsl()
    builder.apply(block)
    return addInterfaceEndpoint(id, builder.build())
}

public inline fun Vpc.addVpnConnection(id: String, block: VpnConnectionOptionsDsl.() -> Unit = {}): VpnConnection {
    val builder = VpnConnectionOptionsDsl()
    builder.apply(block)
    return addVpnConnection(id, builder.build())
}

public inline fun Vpc.enableVpnGateway(block: EnableVpnGatewayOptionsDsl.() -> Unit = {}) {
    val builder = EnableVpnGatewayOptionsDsl()
    builder.apply(block)
    return enableVpnGateway(builder.build())
}

public inline fun Vpc.selectSubnets(block: SubnetSelectionDsl.() -> Unit = {}): SelectedSubnets {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    return selectSubnets(builder.build())
}

public inline fun NatProvider.configureNat(block: ConfigureNatOptionsDsl.() -> Unit = {}) {
    val builder = ConfigureNatOptionsDsl()
    builder.apply(block)
    return configureNat(builder.build())
}

public inline fun CloudFormationInit.attach(
    attachedResource: CfnResource,
    block: AttachInitOptionsDsl.() -> Unit = {},
) {
    val builder = AttachInitOptionsDsl()
    builder.apply(block)
    return attach(attachedResource, builder.build())
}

public inline fun NatInstanceProvider.configureNat(block: ConfigureNatOptionsDsl.() -> Unit = {}) {
    val builder = ConfigureNatOptionsDsl()
    builder.apply(block)
    return configureNat(builder.build())
}

public inline fun VpcEndpoint.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPolicy(builder.build())
}

public inline fun Connections.allowFrom(other: IConnectable, block: PortDsl.() -> Unit = {}) {
    val builder = PortDsl()
    builder.apply(block)
    return allowFrom(other, builder.build())
}

public inline fun Connections.allowFromAnyIpv4(block: PortDsl.() -> Unit = {}) {
    val builder = PortDsl()
    builder.apply(block)
    return allowFromAnyIpv4(builder.build())
}

public inline fun Connections.allowInternally(block: PortDsl.() -> Unit = {}) {
    val builder = PortDsl()
    builder.apply(block)
    return allowInternally(builder.build())
}

public inline fun Connections.allowTo(other: IConnectable, block: PortDsl.() -> Unit = {}) {
    val builder = PortDsl()
    builder.apply(block)
    return allowTo(other, builder.build())
}

public inline fun Connections.allowToAnyIpv4(block: PortDsl.() -> Unit = {}) {
    val builder = PortDsl()
    builder.apply(block)
    return allowToAnyIpv4(builder.build())
}

public inline fun CfnTransitGatewayConnect.setOptions(
    block: CfnTransitGatewayConnectTransitGatewayConnectOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnTransitGatewayConnectTransitGatewayConnectOptionsPropertyDsl()
    builder.apply(block)
    return setOptions(builder.build())
}

public inline fun ISecurityGroup.addEgressRule(arg0: IPeer, block: PortDsl.() -> Unit = {}) {
    val builder = PortDsl()
    builder.apply(block)
    return addEgressRule(arg0, builder.build())
}

public inline fun ISecurityGroup.addIngressRule(arg0: IPeer, block: PortDsl.() -> Unit = {}) {
    val builder = PortDsl()
    builder.apply(block)
    return addIngressRule(arg0, builder.build())
}

public inline fun Instance.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToRolePolicy(builder.build())
}

public inline fun CfnClientVpnEndpoint.setConnectionLogOptions(
    block: CfnClientVpnEndpointConnectionLogOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnClientVpnEndpointConnectionLogOptionsPropertyDsl()
    builder.apply(block)
    return setConnectionLogOptions(builder.build())
}

public inline fun CfnClientVpnEndpoint.setClientConnectOptions(
    block: CfnClientVpnEndpointClientConnectOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnClientVpnEndpointClientConnectOptionsPropertyDsl()
    builder.apply(block)
    return setClientConnectOptions(builder.build())
}

public inline fun CfnClientVpnEndpoint.setClientLoginBannerOptions(
    block: CfnClientVpnEndpointClientLoginBannerOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnClientVpnEndpointClientLoginBannerOptionsPropertyDsl()
    builder.apply(block)
    return setClientLoginBannerOptions(builder.build())
}

public inline fun INetworkAcl.addEntry(
    arg0: String,
    block: CommonNetworkAclEntryOptionsDsl.() -> Unit = {},
): NetworkAclEntry {
    val builder = CommonNetworkAclEntryOptionsDsl()
    builder.apply(block)
    return addEntry(arg0, builder.build())
}

public inline fun CfnVerifiedAccessEndpoint.setLoadBalancerOptions(
    block: CfnVerifiedAccessEndpointLoadBalancerOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnVerifiedAccessEndpointLoadBalancerOptionsPropertyDsl()
    builder.apply(block)
    return setLoadBalancerOptions(builder.build())
}

public inline fun CfnVerifiedAccessEndpoint.setNetworkInterfaceOptions(
    block: CfnVerifiedAccessEndpointNetworkInterfaceOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnVerifiedAccessEndpointNetworkInterfaceOptionsPropertyDsl()
    builder.apply(block)
    return setNetworkInterfaceOptions(builder.build())
}

public inline fun ClientVpnEndpoint.addAuthorizationRule(
    id: String,
    block: ClientVpnAuthorizationRuleOptionsDsl.() -> Unit = {},
): ClientVpnAuthorizationRule {
    val builder = ClientVpnAuthorizationRuleOptionsDsl()
    builder.apply(block)
    return addAuthorizationRule(id, builder.build())
}

public inline fun ClientVpnEndpoint.addRoute(
    id: String,
    block: ClientVpnRouteOptionsDsl.() -> Unit =
        {},
): ClientVpnRoute {
    val builder = ClientVpnRouteOptionsDsl()
    builder.apply(block)
    return addRoute(id, builder.build())
}

public inline fun VpnConnectionBase.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

public inline fun VpnConnectionBase.metricTunnelDataIn(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTunnelDataIn(builder.build())
}

public inline fun VpnConnectionBase.metricTunnelDataOut(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTunnelDataOut(builder.build())
}

public inline fun VpnConnectionBase.metricTunnelState(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTunnelState(builder.build())
}

public inline fun CfnVerifiedAccessInstance.setLoggingConfigurations(
    block: CfnVerifiedAccessInstanceVerifiedAccessLogsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnVerifiedAccessInstanceVerifiedAccessLogsPropertyDsl()
    builder.apply(block)
    return setLoggingConfigurations(builder.build())
}

public inline fun Subnet.addRoute(id: String, block: AddRouteOptionsDsl.() -> Unit = {}) {
    val builder = AddRouteOptionsDsl()
    builder.apply(block)
    return addRoute(id, builder.build())
}

public inline fun CfnLaunchTemplate.setLaunchTemplateData(
    block: CfnLaunchTemplateLaunchTemplateDataPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnLaunchTemplateLaunchTemplateDataPropertyDsl()
    builder.apply(block)
    return setLaunchTemplateData(builder.build())
}

public inline fun CfnInstance.setCpuOptions(
    block: CfnInstanceCpuOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnInstanceCpuOptionsPropertyDsl()
    builder.apply(block)
    return setCpuOptions(builder.build())
}

public inline fun CfnInstance.setCreditSpecification(
    block: CfnInstanceCreditSpecificationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnInstanceCreditSpecificationPropertyDsl()
    builder.apply(block)
    return setCreditSpecification(builder.build())
}

public inline fun CfnInstance.setEnclaveOptions(block: CfnInstanceEnclaveOptionsPropertyDsl.() -> Unit = {}) {
    val builder = CfnInstanceEnclaveOptionsPropertyDsl()
    builder.apply(block)
    return setEnclaveOptions(builder.build())
}

public inline fun CfnInstance.setHibernationOptions(
    block: CfnInstanceHibernationOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnInstanceHibernationOptionsPropertyDsl()
    builder.apply(block)
    return setHibernationOptions(builder.build())
}

public inline fun CfnInstance.setLaunchTemplate(
    block: CfnInstanceLaunchTemplateSpecificationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnInstanceLaunchTemplateSpecificationPropertyDsl()
    builder.apply(block)
    return setLaunchTemplate(builder.build())
}

public inline fun CfnInstance.setPrivateDnsNameOptions(
    block: CfnInstancePrivateDnsNameOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnInstancePrivateDnsNameOptionsPropertyDsl()
    builder.apply(block)
    return setPrivateDnsNameOptions(builder.build())
}

public inline fun SecurityGroup.addEgressRule(peer: IPeer, block: PortDsl.() -> Unit = {}) {
    val builder = PortDsl()
    builder.apply(block)
    return addEgressRule(peer, builder.build())
}

public inline fun SecurityGroup.addIngressRule(peer: IPeer, block: PortDsl.() -> Unit = {}) {
    val builder = PortDsl()
    builder.apply(block)
    return addIngressRule(peer, builder.build())
}

public inline fun CfnSpotFleet.setSpotFleetRequestConfigData(
    block: CfnSpotFleetSpotFleetRequestConfigDataPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnSpotFleetSpotFleetRequestConfigDataPropertyDsl()
    builder.apply(block)
    return setSpotFleetRequestConfigData(builder.build())
}

public inline fun CfnNetworkInsightsPath.setFilterAtDestination(
    block: CfnNetworkInsightsPathPathFilterPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnNetworkInsightsPathPathFilterPropertyDsl()
    builder.apply(block)
    return setFilterAtDestination(builder.build())
}

public inline fun CfnNetworkInsightsPath.setFilterAtSource(
    block: CfnNetworkInsightsPathPathFilterPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnNetworkInsightsPathPathFilterPropertyDsl()
    builder.apply(block)
    return setFilterAtSource(builder.build())
}

public inline fun NetworkAcl.addEntry(
    id: String,
    block: CommonNetworkAclEntryOptionsDsl.() -> Unit =
        {},
): NetworkAclEntry {
    val builder = CommonNetworkAclEntryOptionsDsl()
    builder.apply(block)
    return addEntry(id, builder.build())
}

public inline fun NetworkAcl.associateWithSubnet(
    id: String,
    block: SubnetSelectionDsl.() -> Unit =
        {},
) {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    return associateWithSubnet(id, builder.build())
}

public inline fun IIpAddresses.allocateSubnetsCidr(block: AllocateCidrRequestDsl.() -> Unit = {}): SubnetIpamOptions {
    val builder = AllocateCidrRequestDsl()
    builder.apply(block)
    return allocateSubnetsCidr(builder.build())
}

public inline fun CfnNetworkAclEntry.setIcmp(
    block: CfnNetworkAclEntryIcmpPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnNetworkAclEntryIcmpPropertyDsl()
    builder.apply(block)
    return setIcmp(builder.build())
}

public inline fun CfnNetworkAclEntry.setPortRange(
    block: CfnNetworkAclEntryPortRangePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnNetworkAclEntryPortRangePropertyDsl()
    builder.apply(block)
    return setPortRange(builder.build())
}

public inline fun IVpc.addClientVpnEndpoint(
    arg0: String,
    block: ClientVpnEndpointOptionsDsl.() -> Unit = {},
): ClientVpnEndpoint {
    val builder = ClientVpnEndpointOptionsDsl()
    builder.apply(block)
    return addClientVpnEndpoint(arg0, builder.build())
}

public inline fun IVpc.addFlowLog(arg0: String, block: FlowLogOptionsDsl.() -> Unit = {}): FlowLog {
    val builder = FlowLogOptionsDsl()
    builder.apply(block)
    return addFlowLog(arg0, builder.build())
}

public inline fun IVpc.addGatewayEndpoint(
    arg0: String,
    block: GatewayVpcEndpointOptionsDsl.() -> Unit = {},
): GatewayVpcEndpoint {
    val builder = GatewayVpcEndpointOptionsDsl()
    builder.apply(block)
    return addGatewayEndpoint(arg0, builder.build())
}

public inline fun IVpc.addInterfaceEndpoint(
    arg0: String,
    block: InterfaceVpcEndpointOptionsDsl.() -> Unit = {},
): InterfaceVpcEndpoint {
    val builder = InterfaceVpcEndpointOptionsDsl()
    builder.apply(block)
    return addInterfaceEndpoint(arg0, builder.build())
}

public inline fun IVpc.addVpnConnection(
    arg0: String,
    block: VpnConnectionOptionsDsl.() -> Unit =
        {},
): VpnConnection {
    val builder = VpnConnectionOptionsDsl()
    builder.apply(block)
    return addVpnConnection(arg0, builder.build())
}

public inline fun IVpc.enableVpnGateway(block: EnableVpnGatewayOptionsDsl.() -> Unit = {}) {
    val builder = EnableVpnGatewayOptionsDsl()
    builder.apply(block)
    return enableVpnGateway(builder.build())
}

public inline fun IVpc.selectSubnets(block: SubnetSelectionDsl.() -> Unit = {}): SelectedSubnets {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    return selectSubnets(builder.build())
}
