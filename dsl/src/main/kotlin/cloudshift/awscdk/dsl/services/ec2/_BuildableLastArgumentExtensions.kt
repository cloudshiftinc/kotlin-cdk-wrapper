@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
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

/**
 * The options for device-identity trust provider.
 */
public inline
    fun CfnVerifiedAccessTrustProvider.setDeviceOptions(block: CfnVerifiedAccessTrustProviderDeviceOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVerifiedAccessTrustProviderDeviceOptionsPropertyDsl()
  builder.apply(block)
  return setDeviceOptions(builder.build())
}

/**
 * The options for an OpenID Connect-compatible user-identity trust provider.
 */
public inline
    fun CfnVerifiedAccessTrustProvider.setOidcOptions(block: CfnVerifiedAccessTrustProviderOidcOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVerifiedAccessTrustProviderOidcOptionsPropertyDsl()
  builder.apply(block)
  return setOidcOptions(builder.build())
}

/**
 * The destination port range.
 */
public inline
    fun CfnTrafficMirrorFilterRule.setDestinationPortRange(block: CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl()
  builder.apply(block)
  return setDestinationPortRange(builder.build())
}

/**
 * The source port range.
 */
public inline
    fun CfnTrafficMirrorFilterRule.setSourcePortRange(block: CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl()
  builder.apply(block)
  return setSourcePortRange(builder.build())
}

/**
 * The number of units to request.
 */
public inline
    fun CfnEC2Fleet.setTargetCapacitySpecification(block: CfnEC2FleetTargetCapacitySpecificationRequestPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEC2FleetTargetCapacitySpecificationRequestPropertyDsl()
  builder.apply(block)
  return setTargetCapacitySpecification(builder.build())
}

/**
 * Describes the configuration of On-Demand Instances in an EC2 Fleet.
 */
public inline
    fun CfnEC2Fleet.setOnDemandOptions(block: CfnEC2FleetOnDemandOptionsRequestPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEC2FleetOnDemandOptionsRequestPropertyDsl()
  builder.apply(block)
  return setOnDemandOptions(builder.build())
}

/**
 * Describes the configuration of Spot Instances in an EC2 Fleet.
 */
public inline
    fun CfnEC2Fleet.setSpotOptions(block: CfnEC2FleetSpotOptionsRequestPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnEC2FleetSpotOptionsRequestPropertyDsl()
  builder.apply(block)
  return setSpotOptions(builder.build())
}

/**
 * Return the given named metric for this VPNConnection.
 *
 * @param metricName 
 * @param props
 */
public inline fun IVpnConnection.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0, builder.build())
}

/**
 * The bytes received through the VPN tunnel.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun IVpnConnection.metricTunnelDataIn(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTunnelDataIn(builder.build())
}

/**
 * The bytes sent through the VPN tunnel.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun IVpnConnection.metricTunnelDataOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTunnelDataOut(builder.build())
}

/**
 * The state of the tunnel. 0 indicates DOWN and 1 indicates UP.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IVpnConnection.metricTunnelState(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTunnelState(builder.build())
}

/**
 * Adds commands to execute a file.
 *
 * @param params 
 */
public inline fun UserData.addExecuteFileCommand(block: ExecuteFileOptionsDsl.() -> Unit = {}) {
  val builder = ExecuteFileOptionsDsl()
  builder.apply(block)
  return addExecuteFileCommand(builder.build())
}

/**
 * Adds commands to download a file from S3.
 *
 * @return : The local path that the file will be downloaded to
 * @param params 
 */
public inline fun UserData.addS3DownloadCommand(block: S3DownloadOptionsDsl.() -> Unit = {}):
    String {
  val builder = S3DownloadOptionsDsl()
  builder.apply(block)
  return addS3DownloadCommand(builder.build())
}

/**
 * Adds commands to execute a file.
 *
 * @param params 
 */
public inline fun MultipartUserData.addExecuteFileCommand(block: ExecuteFileOptionsDsl.() -> Unit =
    {}) {
  val builder = ExecuteFileOptionsDsl()
  builder.apply(block)
  return addExecuteFileCommand(builder.build())
}

/**
 * Adds commands to download a file from S3.
 *
 * @param params 
 */
public inline fun MultipartUserData.addS3DownloadCommand(block: S3DownloadOptionsDsl.() -> Unit =
    {}): String {
  val builder = S3DownloadOptionsDsl()
  builder.apply(block)
  return addS3DownloadCommand(builder.build())
}

/**
 * Adds a new client VPN endpoint to this VPC.
 *
 * @param id 
 * @param options 
 */
public inline fun Vpc.addClientVpnEndpoint(id: String, block: ClientVpnEndpointOptionsDsl.() -> Unit
    = {}): ClientVpnEndpoint {
  val builder = ClientVpnEndpointOptionsDsl()
  builder.apply(block)
  return addClientVpnEndpoint(id, builder.build())
}

/**
 * Adds a new flow log to this VPC.
 *
 * @param id 
 * @param options
 */
public inline fun Vpc.addFlowLog(id: String, block: FlowLogOptionsDsl.() -> Unit = {}): FlowLog {
  val builder = FlowLogOptionsDsl()
  builder.apply(block)
  return addFlowLog(id, builder.build())
}

/**
 * Adds a new gateway endpoint to this VPC.
 *
 * @param id 
 * @param options 
 */
public inline fun Vpc.addGatewayEndpoint(id: String, block: GatewayVpcEndpointOptionsDsl.() -> Unit
    = {}): GatewayVpcEndpoint {
  val builder = GatewayVpcEndpointOptionsDsl()
  builder.apply(block)
  return addGatewayEndpoint(id, builder.build())
}

/**
 * Adds a new interface endpoint to this VPC.
 *
 * @param id 
 * @param options 
 */
public inline fun Vpc.addInterfaceEndpoint(id: String,
    block: InterfaceVpcEndpointOptionsDsl.() -> Unit = {}): InterfaceVpcEndpoint {
  val builder = InterfaceVpcEndpointOptionsDsl()
  builder.apply(block)
  return addInterfaceEndpoint(id, builder.build())
}

/**
 * Adds a new VPN connection to this VPC.
 *
 * @param id 
 * @param options 
 */
public inline fun Vpc.addVpnConnection(id: String, block: VpnConnectionOptionsDsl.() -> Unit = {}):
    VpnConnection {
  val builder = VpnConnectionOptionsDsl()
  builder.apply(block)
  return addVpnConnection(id, builder.build())
}

/**
 * Adds a VPN Gateway to this VPC.
 *
 * @param options 
 */
public inline fun Vpc.enableVpnGateway(block: EnableVpnGatewayOptionsDsl.() -> Unit = {}) {
  val builder = EnableVpnGatewayOptionsDsl()
  builder.apply(block)
  return enableVpnGateway(builder.build())
}

/**
 * Returns IDs of selected subnets.
 *
 * @param selection
 */
public inline fun Vpc.selectSubnets(block: SubnetSelectionDsl.() -> Unit = {}): SelectedSubnets {
  val builder = SubnetSelectionDsl()
  builder.apply(block)
  return selectSubnets(builder.build())
}

/**
 * Called by the VPC to configure NAT.
 *
 * Don't call this directly, the VPC will call it automatically.
 *
 * @param options 
 */
public inline fun NatProvider.configureNat(block: ConfigureNatOptionsDsl.() -> Unit = {}) {
  val builder = ConfigureNatOptionsDsl()
  builder.apply(block)
  return configureNat(builder.build())
}

/**
 * Attach the CloudFormation Init config to the given resource.
 *
 * As an app builder, use `instance.applyCloudFormationInit()` or
 * `autoScalingGroup.applyCloudFormationInit()` to trigger this method.
 *
 * This method does the following:
 *
 * * Renders the `AWS::CloudFormation::Init` object to the given resource's
 * metadata, potentially adding a `AWS::CloudFormation::Authentication` object
 * next to it if required.
 * * Updates the instance role policy to be able to call the APIs required for
 * `cfn-init` and `cfn-signal` to work, and potentially add permissions to download
 * referenced asset and bucket resources.
 * * Updates the given UserData with commands to execute the `cfn-init` script.
 *
 * @param attachedResource 
 * @param attachOptions 
 */
public inline fun CloudFormationInit.attach(attachedResource: CfnResource,
    block: AttachInitOptionsDsl.() -> Unit = {}) {
  val builder = AttachInitOptionsDsl()
  builder.apply(block)
  return attach(attachedResource, builder.build())
}

/**
 * Called by the VPC to configure NAT.
 *
 * Don't call this directly, the VPC will call it automatically.
 *
 * @param options 
 */
public inline fun NatInstanceProvider.configureNat(block: ConfigureNatOptionsDsl.() -> Unit = {}) {
  val builder = ConfigureNatOptionsDsl()
  builder.apply(block)
  return configureNat(builder.build())
}

/**
 * Adds a statement to the policy document of the VPC endpoint. The statement must have a Principal.
 *
 * Not all interface VPC endpoints support policy. For more information
 * see https://docs.aws.amazon.com/vpc/latest/userguide/vpce-interface.html
 *
 * @param statement the IAM statement to add. 
 */
public inline fun VpcEndpoint.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

/**
 * Allow connections from the peer on the given port.
 *
 * @param other 
 * @param portRange 
 * @param description
 */
public inline fun Connections.allowFrom(other: IConnectable, block: PortDsl.() -> Unit = {}) {
  val builder = PortDsl()
  builder.apply(block)
  return allowFrom(other, builder.build())
}

/**
 * Allow from any IPv4 ranges.
 *
 * @param portRange 
 * @param description
 */
public inline fun Connections.allowFromAnyIpv4(block: PortDsl.() -> Unit = {}) {
  val builder = PortDsl()
  builder.apply(block)
  return allowFromAnyIpv4(builder.build())
}

/**
 * Allow hosts inside the security group to connect to each other on the given port.
 *
 * @param portRange 
 * @param description
 */
public inline fun Connections.allowInternally(block: PortDsl.() -> Unit = {}) {
  val builder = PortDsl()
  builder.apply(block)
  return allowInternally(builder.build())
}

/**
 * Allow connections to the peer on the given port.
 *
 * @param other 
 * @param portRange 
 * @param description
 */
public inline fun Connections.allowTo(other: IConnectable, block: PortDsl.() -> Unit = {}) {
  val builder = PortDsl()
  builder.apply(block)
  return allowTo(other, builder.build())
}

/**
 * Allow to all IPv4 ranges.
 *
 * @param portRange 
 * @param description
 */
public inline fun Connections.allowToAnyIpv4(block: PortDsl.() -> Unit = {}) {
  val builder = PortDsl()
  builder.apply(block)
  return allowToAnyIpv4(builder.build())
}

/**
 * The Connect attachment options.
 */
public inline
    fun CfnTransitGatewayConnect.setOptions(block: CfnTransitGatewayConnectTransitGatewayConnectOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTransitGatewayConnectTransitGatewayConnectOptionsPropertyDsl()
  builder.apply(block)
  return setOptions(builder.build())
}

/**
 * Add an egress rule for the current security group.
 *
 * `remoteRule` controls where the Rule object is created if the peer is also a
 * securityGroup and they are in different stack. If false (default) the
 * rule object is created under the current SecurityGroup object. If true and the
 * peer is also a SecurityGroup, the rule object is created under the remote
 * SecurityGroup object.
 *
 * @param peer 
 * @param connection 
 * @param description
 * @param remoteRule
 */
public inline fun ISecurityGroup.addEgressRule(arg0: IPeer, block: PortDsl.() -> Unit = {}) {
  val builder = PortDsl()
  builder.apply(block)
  return addEgressRule(arg0, builder.build())
}

/**
 * Add an ingress rule for the current security group.
 *
 * `remoteRule` controls where the Rule object is created if the peer is also a
 * securityGroup and they are in different stack. If false (default) the
 * rule object is created under the current SecurityGroup object. If true and the
 * peer is also a SecurityGroup, the rule object is created under the remote
 * SecurityGroup object.
 *
 * @param peer 
 * @param connection 
 * @param description
 * @param remoteRule
 */
public inline fun ISecurityGroup.addIngressRule(arg0: IPeer, block: PortDsl.() -> Unit = {}) {
  val builder = PortDsl()
  builder.apply(block)
  return addIngressRule(arg0, builder.build())
}

/**
 * Adds a statement to the IAM role assumed by the instance.
 *
 * @param statement 
 */
public inline fun Instance.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToRolePolicy(builder.build())
}

/**
 * Information about the client connection logging options.
 */
public inline
    fun CfnClientVpnEndpoint.setConnectionLogOptions(block: CfnClientVpnEndpointConnectionLogOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnClientVpnEndpointConnectionLogOptionsPropertyDsl()
  builder.apply(block)
  return setConnectionLogOptions(builder.build())
}

/**
 * The options for managing connection authorization for new client connections.
 */
public inline
    fun CfnClientVpnEndpoint.setClientConnectOptions(block: CfnClientVpnEndpointClientConnectOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnClientVpnEndpointClientConnectOptionsPropertyDsl()
  builder.apply(block)
  return setClientConnectOptions(builder.build())
}

/**
 * Options for enabling a customizable text banner that will be displayed on AWS provided clients
 * when a VPN session is established.
 */
public inline
    fun CfnClientVpnEndpoint.setClientLoginBannerOptions(block: CfnClientVpnEndpointClientLoginBannerOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnClientVpnEndpointClientLoginBannerOptionsPropertyDsl()
  builder.apply(block)
  return setClientLoginBannerOptions(builder.build())
}

/**
 * Add a new entry to the ACL.
 *
 * @param id 
 * @param options 
 */
public inline fun INetworkAcl.addEntry(arg0: String,
    block: CommonNetworkAclEntryOptionsDsl.() -> Unit = {}): NetworkAclEntry {
  val builder = CommonNetworkAclEntryOptionsDsl()
  builder.apply(block)
  return addEntry(arg0, builder.build())
}

/**
 * The load balancer details if creating the AWS Verified Access endpoint as `load-balancer` type.
 */
public inline
    fun CfnVerifiedAccessEndpoint.setLoadBalancerOptions(block: CfnVerifiedAccessEndpointLoadBalancerOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVerifiedAccessEndpointLoadBalancerOptionsPropertyDsl()
  builder.apply(block)
  return setLoadBalancerOptions(builder.build())
}

/**
 * The options for network-interface type endpoint.
 */
public inline
    fun CfnVerifiedAccessEndpoint.setNetworkInterfaceOptions(block: CfnVerifiedAccessEndpointNetworkInterfaceOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVerifiedAccessEndpointNetworkInterfaceOptionsPropertyDsl()
  builder.apply(block)
  return setNetworkInterfaceOptions(builder.build())
}

/**
 * Adds an authorization rule to this endpoint.
 *
 * @param id 
 * @param props 
 */
public inline fun ClientVpnEndpoint.addAuthorizationRule(id: String,
    block: ClientVpnAuthorizationRuleOptionsDsl.() -> Unit = {}): ClientVpnAuthorizationRule {
  val builder = ClientVpnAuthorizationRuleOptionsDsl()
  builder.apply(block)
  return addAuthorizationRule(id, builder.build())
}

/**
 * Adds a route to this endpoint.
 *
 * @param id 
 * @param props 
 */
public inline fun ClientVpnEndpoint.addRoute(id: String, block: ClientVpnRouteOptionsDsl.() -> Unit
    = {}): ClientVpnRoute {
  val builder = ClientVpnRouteOptionsDsl()
  builder.apply(block)
  return addRoute(id, builder.build())
}

/**
 * Return the given named metric for this VPNConnection.
 *
 * @param metricName 
 * @param props
 */
public inline fun VpnConnectionBase.metric(metricName: String, block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

/**
 * The bytes received through the VPN tunnel.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun VpnConnectionBase.metricTunnelDataIn(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTunnelDataIn(builder.build())
}

/**
 * The bytes sent through the VPN tunnel.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun VpnConnectionBase.metricTunnelDataOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTunnelDataOut(builder.build())
}

/**
 * The state of the tunnel. 0 indicates DOWN and 1 indicates UP.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun VpnConnectionBase.metricTunnelState(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTunnelState(builder.build())
}

/**
 * The current logging configuration for the Verified Access instances.
 */
public inline
    fun CfnVerifiedAccessInstance.setLoggingConfigurations(block: CfnVerifiedAccessInstanceVerifiedAccessLogsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVerifiedAccessInstanceVerifiedAccessLogsPropertyDsl()
  builder.apply(block)
  return setLoggingConfigurations(builder.build())
}

/**
 * Adds an entry to this subnets route table.
 *
 * @param id 
 * @param options 
 */
public inline fun Subnet.addRoute(id: String, block: AddRouteOptionsDsl.() -> Unit = {}) {
  val builder = AddRouteOptionsDsl()
  builder.apply(block)
  return addRoute(id, builder.build())
}

/**
 * The information for the launch template.
 */
public inline
    fun CfnLaunchTemplate.setLaunchTemplateData(block: CfnLaunchTemplateLaunchTemplateDataPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLaunchTemplateLaunchTemplateDataPropertyDsl()
  builder.apply(block)
  return setLaunchTemplateData(builder.build())
}

/**
 * The CPU options for the instance.
 */
public inline fun CfnInstance.setCpuOptions(block: CfnInstanceCpuOptionsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnInstanceCpuOptionsPropertyDsl()
  builder.apply(block)
  return setCpuOptions(builder.build())
}

/**
 * The credit option for CPU usage of the burstable performance instance.
 */
public inline
    fun CfnInstance.setCreditSpecification(block: CfnInstanceCreditSpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInstanceCreditSpecificationPropertyDsl()
  builder.apply(block)
  return setCreditSpecification(builder.build())
}

/**
 * Indicates whether the instance is enabled for AWS Nitro Enclaves.
 */
public inline
    fun CfnInstance.setEnclaveOptions(block: CfnInstanceEnclaveOptionsPropertyDsl.() -> Unit = {}) {
  val builder = CfnInstanceEnclaveOptionsPropertyDsl()
  builder.apply(block)
  return setEnclaveOptions(builder.build())
}

/**
 * Indicates whether an instance is enabled for hibernation.
 */
public inline
    fun CfnInstance.setHibernationOptions(block: CfnInstanceHibernationOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInstanceHibernationOptionsPropertyDsl()
  builder.apply(block)
  return setHibernationOptions(builder.build())
}

/**
 * The launch template to use to launch the instances.
 */
public inline
    fun CfnInstance.setLaunchTemplate(block: CfnInstanceLaunchTemplateSpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInstanceLaunchTemplateSpecificationPropertyDsl()
  builder.apply(block)
  return setLaunchTemplate(builder.build())
}

/**
 * The options for the instance hostname.
 */
public inline
    fun CfnInstance.setPrivateDnsNameOptions(block: CfnInstancePrivateDnsNameOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInstancePrivateDnsNameOptionsPropertyDsl()
  builder.apply(block)
  return setPrivateDnsNameOptions(builder.build())
}

/**
 * Add an egress rule for the current security group.
 *
 * `remoteRule` controls where the Rule object is created if the peer is also a
 * securityGroup and they are in different stack. If false (default) the
 * rule object is created under the current SecurityGroup object. If true and the
 * peer is also a SecurityGroup, the rule object is created under the remote
 * SecurityGroup object.
 *
 * @param peer 
 * @param connection 
 * @param description
 * @param remoteRule
 */
public inline fun SecurityGroup.addEgressRule(peer: IPeer, block: PortDsl.() -> Unit = {}) {
  val builder = PortDsl()
  builder.apply(block)
  return addEgressRule(peer, builder.build())
}

/**
 * Add an ingress rule for the current security group.
 *
 * `remoteRule` controls where the Rule object is created if the peer is also a
 * securityGroup and they are in different stack. If false (default) the
 * rule object is created under the current SecurityGroup object. If true and the
 * peer is also a SecurityGroup, the rule object is created under the remote
 * SecurityGroup object.
 *
 * @param peer 
 * @param connection 
 * @param description
 * @param remoteRule
 */
public inline fun SecurityGroup.addIngressRule(peer: IPeer, block: PortDsl.() -> Unit = {}) {
  val builder = PortDsl()
  builder.apply(block)
  return addIngressRule(peer, builder.build())
}

/**
 * Describes the configuration of a Spot Fleet request.
 */
public inline
    fun CfnSpotFleet.setSpotFleetRequestConfigData(block: CfnSpotFleetSpotFleetRequestConfigDataPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSpotFleetSpotFleetRequestConfigDataPropertyDsl()
  builder.apply(block)
  return setSpotFleetRequestConfigData(builder.build())
}

/**
 * Scopes the analysis to network paths that match specific filters at the destination.
 */
public inline
    fun CfnNetworkInsightsPath.setFilterAtDestination(block: CfnNetworkInsightsPathPathFilterPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnNetworkInsightsPathPathFilterPropertyDsl()
  builder.apply(block)
  return setFilterAtDestination(builder.build())
}

/**
 * Scopes the analysis to network paths that match specific filters at the source.
 */
public inline
    fun CfnNetworkInsightsPath.setFilterAtSource(block: CfnNetworkInsightsPathPathFilterPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnNetworkInsightsPathPathFilterPropertyDsl()
  builder.apply(block)
  return setFilterAtSource(builder.build())
}

/**
 * Add a new entry to the ACL.
 *
 * @param id 
 * @param options 
 */
public inline fun NetworkAcl.addEntry(id: String, block: CommonNetworkAclEntryOptionsDsl.() -> Unit
    = {}): NetworkAclEntry {
  val builder = CommonNetworkAclEntryOptionsDsl()
  builder.apply(block)
  return addEntry(id, builder.build())
}

/**
 * Associate the ACL with a given set of subnets.
 *
 * @param id 
 * @param selection 
 */
public inline fun NetworkAcl.associateWithSubnet(id: String, block: SubnetSelectionDsl.() -> Unit =
    {}) {
  val builder = SubnetSelectionDsl()
  builder.apply(block)
  return associateWithSubnet(id, builder.build())
}

/**
 * Called by the VPC to retrieve Subnet options from the Ipam.
 *
 * Don't call this directly, the VPC will call it automatically.
 *
 * @param input 
 */
public inline fun IIpAddresses.allocateSubnetsCidr(block: AllocateCidrRequestDsl.() -> Unit = {}):
    SubnetIpamOptions {
  val builder = AllocateCidrRequestDsl()
  builder.apply(block)
  return allocateSubnetsCidr(builder.build())
}

/**
 * The Internet Control Message Protocol (ICMP) code and type.
 */
public inline fun CfnNetworkAclEntry.setIcmp(block: CfnNetworkAclEntryIcmpPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnNetworkAclEntryIcmpPropertyDsl()
  builder.apply(block)
  return setIcmp(builder.build())
}

/**
 * The range of port numbers for the UDP/TCP protocol.
 */
public inline
    fun CfnNetworkAclEntry.setPortRange(block: CfnNetworkAclEntryPortRangePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnNetworkAclEntryPortRangePropertyDsl()
  builder.apply(block)
  return setPortRange(builder.build())
}

/**
 * Adds a new client VPN endpoint to this VPC.
 *
 * @param id 
 * @param options 
 */
public inline fun IVpc.addClientVpnEndpoint(arg0: String,
    block: ClientVpnEndpointOptionsDsl.() -> Unit = {}): ClientVpnEndpoint {
  val builder = ClientVpnEndpointOptionsDsl()
  builder.apply(block)
  return addClientVpnEndpoint(arg0, builder.build())
}

/**
 * Adds a new Flow Log to this VPC.
 *
 * @param id 
 * @param options
 */
public inline fun IVpc.addFlowLog(arg0: String, block: FlowLogOptionsDsl.() -> Unit = {}): FlowLog {
  val builder = FlowLogOptionsDsl()
  builder.apply(block)
  return addFlowLog(arg0, builder.build())
}

/**
 * Adds a new gateway endpoint to this VPC.
 *
 * @param id 
 * @param options 
 */
public inline fun IVpc.addGatewayEndpoint(arg0: String,
    block: GatewayVpcEndpointOptionsDsl.() -> Unit = {}): GatewayVpcEndpoint {
  val builder = GatewayVpcEndpointOptionsDsl()
  builder.apply(block)
  return addGatewayEndpoint(arg0, builder.build())
}

/**
 * Adds a new interface endpoint to this VPC.
 *
 * @param id 
 * @param options 
 */
public inline fun IVpc.addInterfaceEndpoint(arg0: String,
    block: InterfaceVpcEndpointOptionsDsl.() -> Unit = {}): InterfaceVpcEndpoint {
  val builder = InterfaceVpcEndpointOptionsDsl()
  builder.apply(block)
  return addInterfaceEndpoint(arg0, builder.build())
}

/**
 * Adds a new VPN connection to this VPC.
 *
 * @param id 
 * @param options 
 */
public inline fun IVpc.addVpnConnection(arg0: String, block: VpnConnectionOptionsDsl.() -> Unit =
    {}): VpnConnection {
  val builder = VpnConnectionOptionsDsl()
  builder.apply(block)
  return addVpnConnection(arg0, builder.build())
}

/**
 * Adds a VPN Gateway to this VPC.
 *
 * @param options 
 */
public inline fun IVpc.enableVpnGateway(block: EnableVpnGatewayOptionsDsl.() -> Unit = {}) {
  val builder = EnableVpnGatewayOptionsDsl()
  builder.apply(block)
  return enableVpnGateway(builder.build())
}

/**
 * Return information on the subnets appropriate for the given selection strategy.
 *
 * Requires that at least one subnet is matched, throws a descriptive
 * error message otherwise.
 *
 * @param selection
 */
public inline fun IVpc.selectSubnets(block: SubnetSelectionDsl.() -> Unit = {}): SelectedSubnets {
  val builder = SubnetSelectionDsl()
  builder.apply(block)
  return selectSubnets(builder.build())
}
