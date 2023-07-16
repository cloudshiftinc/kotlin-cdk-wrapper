@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnResource
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.ec2.CfnCapacityReservation
import software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet
import software.amazon.awscdk.services.ec2.CfnCarrierGateway
import software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint
import software.amazon.awscdk.services.ec2.CfnClientVpnRoute
import software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation
import software.amazon.awscdk.services.ec2.CfnCustomerGateway
import software.amazon.awscdk.services.ec2.CfnDHCPOptions
import software.amazon.awscdk.services.ec2.CfnEC2Fleet
import software.amazon.awscdk.services.ec2.CfnEIP
import software.amazon.awscdk.services.ec2.CfnEIPAssociation
import software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway
import software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation
import software.amazon.awscdk.services.ec2.CfnFlowLog
import software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation
import software.amazon.awscdk.services.ec2.CfnHost
import software.amazon.awscdk.services.ec2.CfnIPAM
import software.amazon.awscdk.services.ec2.CfnIPAMAllocation
import software.amazon.awscdk.services.ec2.CfnIPAMPool
import software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation
import software.amazon.awscdk.services.ec2.CfnIPAMScope
import software.amazon.awscdk.services.ec2.CfnInstance
import software.amazon.awscdk.services.ec2.CfnInternetGateway
import software.amazon.awscdk.services.ec2.CfnKeyPair
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociation
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation
import software.amazon.awscdk.services.ec2.CfnNatGateway
import software.amazon.awscdk.services.ec2.CfnNetworkAcl
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntry
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath
import software.amazon.awscdk.services.ec2.CfnNetworkInterface
import software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment
import software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission
import software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscription
import software.amazon.awscdk.services.ec2.CfnPlacementGroup
import software.amazon.awscdk.services.ec2.CfnPrefixList
import software.amazon.awscdk.services.ec2.CfnRoute
import software.amazon.awscdk.services.ec2.CfnRouteTable
import software.amazon.awscdk.services.ec2.CfnSecurityGroup
import software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress
import software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress
import software.amazon.awscdk.services.ec2.CfnSpotFleet
import software.amazon.awscdk.services.ec2.CfnSubnet
import software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock
import software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation
import software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilter
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget
import software.amazon.awscdk.services.ec2.CfnTransitGateway
import software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTable
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociation
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation
import software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment
import software.amazon.awscdk.services.ec2.CfnVPC
import software.amazon.awscdk.services.ec2.CfnVPCCidrBlock
import software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation
import software.amazon.awscdk.services.ec2.CfnVPCEndpoint
import software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification
import software.amazon.awscdk.services.ec2.CfnVPCEndpointService
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions
import software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment
import software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection
import software.amazon.awscdk.services.ec2.CfnVPNConnection
import software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute
import software.amazon.awscdk.services.ec2.CfnVPNGateway
import software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider
import software.amazon.awscdk.services.ec2.CfnVolume
import software.amazon.awscdk.services.ec2.CfnVolumeAttachment
import software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRule
import software.amazon.awscdk.services.ec2.ClientVpnEndpoint
import software.amazon.awscdk.services.ec2.ClientVpnRoute
import software.amazon.awscdk.services.ec2.CloudFormationInit
import software.amazon.awscdk.services.ec2.Connections
import software.amazon.awscdk.services.ec2.FlowLog
import software.amazon.awscdk.services.ec2.GatewayVpcEndpoint
import software.amazon.awscdk.services.ec2.IConnectable
import software.amazon.awscdk.services.ec2.IPeer
import software.amazon.awscdk.services.ec2.Instance
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint
import software.amazon.awscdk.services.ec2.MultipartUserData
import software.amazon.awscdk.services.ec2.NatInstanceProvider
import software.amazon.awscdk.services.ec2.NetworkAcl
import software.amazon.awscdk.services.ec2.NetworkAclEntry
import software.amazon.awscdk.services.ec2.PrivateSubnet
import software.amazon.awscdk.services.ec2.PublicSubnet
import software.amazon.awscdk.services.ec2.SecurityGroup
import software.amazon.awscdk.services.ec2.SelectedSubnets
import software.amazon.awscdk.services.ec2.Subnet
import software.amazon.awscdk.services.ec2.Vpc
import software.amazon.awscdk.services.ec2.VpnConnection

public inline fun CfnCapacityReservation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnCapacityReservationFleet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnCarrierGateway.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnClientVpnAuthorizationRule.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnClientVpnEndpoint.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnClientVpnEndpoint.setClientConnectOptions(block: CfnClientVpnEndpointClientConnectOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnClientVpnEndpointClientConnectOptionsPropertyDsl()
  builder.apply(block)
  return setClientConnectOptions(builder.build())
}

public inline
    fun CfnClientVpnEndpoint.setClientLoginBannerOptions(block: CfnClientVpnEndpointClientLoginBannerOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnClientVpnEndpointClientLoginBannerOptionsPropertyDsl()
  builder.apply(block)
  return setClientLoginBannerOptions(builder.build())
}

public inline
    fun CfnClientVpnEndpoint.setConnectionLogOptions(block: CfnClientVpnEndpointConnectionLogOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnClientVpnEndpointConnectionLogOptionsPropertyDsl()
  builder.apply(block)
  return setConnectionLogOptions(builder.build())
}

public inline fun CfnClientVpnRoute.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnClientVpnTargetNetworkAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnCustomerGateway.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDHCPOptions.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnEC2Fleet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnEC2Fleet.setOnDemandOptions(block: CfnEC2FleetOnDemandOptionsRequestPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEC2FleetOnDemandOptionsRequestPropertyDsl()
  builder.apply(block)
  return setOnDemandOptions(builder.build())
}

public inline
    fun CfnEC2Fleet.setSpotOptions(block: CfnEC2FleetSpotOptionsRequestPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnEC2FleetSpotOptionsRequestPropertyDsl()
  builder.apply(block)
  return setSpotOptions(builder.build())
}

public inline
    fun CfnEC2Fleet.setTargetCapacitySpecification(block: CfnEC2FleetTargetCapacitySpecificationRequestPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEC2FleetTargetCapacitySpecificationRequestPropertyDsl()
  builder.apply(block)
  return setTargetCapacitySpecification(builder.build())
}

public inline fun CfnEIP.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnEIPAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnEgressOnlyInternetGateway.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnEnclaveCertificateIamRoleAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnFlowLog.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnGatewayRouteTableAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnHost.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnIPAM.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnIPAMAllocation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnIPAMPool.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnIPAMPoolCidr.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnIPAMResourceDiscovery.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnIPAMResourceDiscoveryAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnIPAMScope.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnInstance.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnInstance.setCpuOptions(block: CfnInstanceCpuOptionsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnInstanceCpuOptionsPropertyDsl()
  builder.apply(block)
  return setCpuOptions(builder.build())
}

public inline
    fun CfnInstance.setCreditSpecification(block: CfnInstanceCreditSpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInstanceCreditSpecificationPropertyDsl()
  builder.apply(block)
  return setCreditSpecification(builder.build())
}

public inline
    fun CfnInstance.setEnclaveOptions(block: CfnInstanceEnclaveOptionsPropertyDsl.() -> Unit = {}) {
  val builder = CfnInstanceEnclaveOptionsPropertyDsl()
  builder.apply(block)
  return setEnclaveOptions(builder.build())
}

public inline
    fun CfnInstance.setHibernationOptions(block: CfnInstanceHibernationOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInstanceHibernationOptionsPropertyDsl()
  builder.apply(block)
  return setHibernationOptions(builder.build())
}

public inline
    fun CfnInstance.setLaunchTemplate(block: CfnInstanceLaunchTemplateSpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInstanceLaunchTemplateSpecificationPropertyDsl()
  builder.apply(block)
  return setLaunchTemplate(builder.build())
}

public inline
    fun CfnInstance.setPrivateDnsNameOptions(block: CfnInstancePrivateDnsNameOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInstancePrivateDnsNameOptionsPropertyDsl()
  builder.apply(block)
  return setPrivateDnsNameOptions(builder.build())
}

public inline fun CfnInternetGateway.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnKeyPair.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnLaunchTemplate.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnLaunchTemplate.setLaunchTemplateData(block: CfnLaunchTemplateLaunchTemplateDataPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLaunchTemplateLaunchTemplateDataPropertyDsl()
  builder.apply(block)
  return setLaunchTemplateData(builder.build())
}

public inline fun CfnLocalGatewayRoute.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnLocalGatewayRouteTable.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnLocalGatewayRouteTableVPCAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnNatGateway.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnNetworkAcl.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnNetworkAclEntry.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnNetworkAclEntry.setIcmp(block: CfnNetworkAclEntryIcmpPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnNetworkAclEntryIcmpPropertyDsl()
  builder.apply(block)
  return setIcmp(builder.build())
}

public inline
    fun CfnNetworkAclEntry.setPortRange(block: CfnNetworkAclEntryPortRangePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnNetworkAclEntryPortRangePropertyDsl()
  builder.apply(block)
  return setPortRange(builder.build())
}

public inline fun CfnNetworkInsightsAccessScope.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnNetworkInsightsAccessScopeAnalysis.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnNetworkInsightsAnalysis.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnNetworkInsightsPath.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnNetworkInsightsPath.setFilterAtDestination(block: CfnNetworkInsightsPathPathFilterPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnNetworkInsightsPathPathFilterPropertyDsl()
  builder.apply(block)
  return setFilterAtDestination(builder.build())
}

public inline
    fun CfnNetworkInsightsPath.setFilterAtSource(block: CfnNetworkInsightsPathPathFilterPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnNetworkInsightsPathPathFilterPropertyDsl()
  builder.apply(block)
  return setFilterAtSource(builder.build())
}

public inline fun CfnNetworkInterface.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnNetworkInterfaceAttachment.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnNetworkInterfacePermission.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnNetworkPerformanceMetricSubscription.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPlacementGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPrefixList.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRoute.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRouteTable.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSecurityGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSecurityGroupEgress.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSecurityGroupIngress.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSpotFleet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnSpotFleet.setSpotFleetRequestConfigData(block: CfnSpotFleetSpotFleetRequestConfigDataPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSpotFleetSpotFleetRequestConfigDataPropertyDsl()
  builder.apply(block)
  return setSpotFleetRequestConfigData(builder.build())
}

public inline fun CfnSubnet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSubnetCidrBlock.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSubnetNetworkAclAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSubnetRouteTableAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTrafficMirrorFilter.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTrafficMirrorFilterRule.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnTrafficMirrorFilterRule.setDestinationPortRange(block: CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl()
  builder.apply(block)
  return setDestinationPortRange(builder.build())
}

public inline
    fun CfnTrafficMirrorFilterRule.setSourcePortRange(block: CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl()
  builder.apply(block)
  return setSourcePortRange(builder.build())
}

public inline fun CfnTrafficMirrorSession.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTrafficMirrorTarget.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTransitGateway.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTransitGatewayAttachment.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTransitGatewayConnect.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnTransitGatewayConnect.setOptions(block: CfnTransitGatewayConnectTransitGatewayConnectOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTransitGatewayConnectTransitGatewayConnectOptionsPropertyDsl()
  builder.apply(block)
  return setOptions(builder.build())
}

public inline fun CfnTransitGatewayMulticastDomain.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnTransitGatewayMulticastDomainAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTransitGatewayMulticastGroupMember.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTransitGatewayMulticastGroupSource.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTransitGatewayPeeringAttachment.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTransitGatewayRoute.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTransitGatewayRouteTable.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTransitGatewayRouteTableAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTransitGatewayRouteTablePropagation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTransitGatewayVpcAttachment.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVPC.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVPCCidrBlock.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVPCDHCPOptionsAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVPCEndpoint.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVPCEndpointConnectionNotification.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVPCEndpointService.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVPCEndpointServicePermissions.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVPCGatewayAttachment.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVPCPeeringConnection.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVPNConnection.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVPNConnectionRoute.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVPNGateway.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVPNGatewayRoutePropagation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVerifiedAccessEndpoint.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnVerifiedAccessEndpoint.setLoadBalancerOptions(block: CfnVerifiedAccessEndpointLoadBalancerOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVerifiedAccessEndpointLoadBalancerOptionsPropertyDsl()
  builder.apply(block)
  return setLoadBalancerOptions(builder.build())
}

public inline
    fun CfnVerifiedAccessEndpoint.setNetworkInterfaceOptions(block: CfnVerifiedAccessEndpointNetworkInterfaceOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVerifiedAccessEndpointNetworkInterfaceOptionsPropertyDsl()
  builder.apply(block)
  return setNetworkInterfaceOptions(builder.build())
}

public inline fun CfnVerifiedAccessGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVerifiedAccessInstance.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnVerifiedAccessInstance.setLoggingConfigurations(block: CfnVerifiedAccessInstanceVerifiedAccessLogsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVerifiedAccessInstanceVerifiedAccessLogsPropertyDsl()
  builder.apply(block)
  return setLoggingConfigurations(builder.build())
}

public inline fun CfnVerifiedAccessTrustProvider.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnVerifiedAccessTrustProvider.setDeviceOptions(block: CfnVerifiedAccessTrustProviderDeviceOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVerifiedAccessTrustProviderDeviceOptionsPropertyDsl()
  builder.apply(block)
  return setDeviceOptions(builder.build())
}

public inline
    fun CfnVerifiedAccessTrustProvider.setOidcOptions(block: CfnVerifiedAccessTrustProviderOidcOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVerifiedAccessTrustProviderOidcOptionsPropertyDsl()
  builder.apply(block)
  return setOidcOptions(builder.build())
}

public inline fun CfnVolume.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVolumeAttachment.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun ClientVpnEndpoint.addAuthorizationRule(arg0: String,
    block: ClientVpnAuthorizationRuleOptionsDsl.() -> Unit = {}): ClientVpnAuthorizationRule {
  val builder = ClientVpnAuthorizationRuleOptionsDsl()
  builder.apply(block)
  return addAuthorizationRule(arg0,builder.build())
}

public inline fun ClientVpnEndpoint.addRoute(arg0: String,
    block: ClientVpnRouteOptionsDsl.() -> Unit = {}): ClientVpnRoute {
  val builder = ClientVpnRouteOptionsDsl()
  builder.apply(block)
  return addRoute(arg0,builder.build())
}

public inline fun CloudFormationInit.attach(arg0: CfnResource,
    block: AttachInitOptionsDsl.() -> Unit = {}) {
  val builder = AttachInitOptionsDsl()
  builder.apply(block)
  return attach(arg0,builder.build())
}

public inline fun Connections.allowFrom(arg0: IConnectable, block: PortDsl.() -> Unit = {}) {
  val builder = PortDsl()
  builder.apply(block)
  return allowFrom(arg0,builder.build())
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

public inline fun Connections.allowTo(arg0: IConnectable, block: PortDsl.() -> Unit = {}) {
  val builder = PortDsl()
  builder.apply(block)
  return allowTo(arg0,builder.build())
}

public inline fun Connections.allowToAnyIpv4(block: PortDsl.() -> Unit = {}) {
  val builder = PortDsl()
  builder.apply(block)
  return allowToAnyIpv4(builder.build())
}

public inline fun GatewayVpcEndpoint.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun Instance.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToRolePolicy(builder.build())
}

public inline fun InterfaceVpcEndpoint.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun MultipartUserData.addExecuteFileCommand(block: ExecuteFileOptionsDsl.() -> Unit =
    {}) {
  val builder = ExecuteFileOptionsDsl()
  builder.apply(block)
  return addExecuteFileCommand(builder.build())
}

public inline fun MultipartUserData.addS3DownloadCommand(block: S3DownloadOptionsDsl.() -> Unit =
    {}): String {
  val builder = S3DownloadOptionsDsl()
  builder.apply(block)
  return addS3DownloadCommand(builder.build())
}

public inline fun NatInstanceProvider.configureNat(block: ConfigureNatOptionsDsl.() -> Unit = {}) {
  val builder = ConfigureNatOptionsDsl()
  builder.apply(block)
  return configureNat(builder.build())
}

public inline fun NetworkAcl.addEntry(arg0: String,
    block: CommonNetworkAclEntryOptionsDsl.() -> Unit = {}): NetworkAclEntry {
  val builder = CommonNetworkAclEntryOptionsDsl()
  builder.apply(block)
  return addEntry(arg0,builder.build())
}

public inline fun NetworkAcl.associateWithSubnet(arg0: String, block: SubnetSelectionDsl.() -> Unit
    = {}) {
  val builder = SubnetSelectionDsl()
  builder.apply(block)
  return associateWithSubnet(arg0,builder.build())
}

public inline fun PrivateSubnet.addRoute(arg0: String, block: AddRouteOptionsDsl.() -> Unit = {}) {
  val builder = AddRouteOptionsDsl()
  builder.apply(block)
  return addRoute(arg0,builder.build())
}

public inline fun PublicSubnet.addRoute(arg0: String, block: AddRouteOptionsDsl.() -> Unit = {}) {
  val builder = AddRouteOptionsDsl()
  builder.apply(block)
  return addRoute(arg0,builder.build())
}

public inline fun SecurityGroup.addEgressRule(arg0: IPeer, block: PortDsl.() -> Unit = {}) {
  val builder = PortDsl()
  builder.apply(block)
  return addEgressRule(arg0,builder.build())
}

public inline fun SecurityGroup.addIngressRule(arg0: IPeer, block: PortDsl.() -> Unit = {}) {
  val builder = PortDsl()
  builder.apply(block)
  return addIngressRule(arg0,builder.build())
}

public inline fun Subnet.addRoute(arg0: String, block: AddRouteOptionsDsl.() -> Unit = {}) {
  val builder = AddRouteOptionsDsl()
  builder.apply(block)
  return addRoute(arg0,builder.build())
}

public inline fun Vpc.addClientVpnEndpoint(arg0: String,
    block: ClientVpnEndpointOptionsDsl.() -> Unit = {}): ClientVpnEndpoint {
  val builder = ClientVpnEndpointOptionsDsl()
  builder.apply(block)
  return addClientVpnEndpoint(arg0,builder.build())
}

public inline fun Vpc.addFlowLog(arg0: String, block: FlowLogOptionsDsl.() -> Unit = {}): FlowLog {
  val builder = FlowLogOptionsDsl()
  builder.apply(block)
  return addFlowLog(arg0,builder.build())
}

public inline fun Vpc.addGatewayEndpoint(arg0: String,
    block: GatewayVpcEndpointOptionsDsl.() -> Unit = {}): GatewayVpcEndpoint {
  val builder = GatewayVpcEndpointOptionsDsl()
  builder.apply(block)
  return addGatewayEndpoint(arg0,builder.build())
}

public inline fun Vpc.addInterfaceEndpoint(arg0: String,
    block: InterfaceVpcEndpointOptionsDsl.() -> Unit = {}): InterfaceVpcEndpoint {
  val builder = InterfaceVpcEndpointOptionsDsl()
  builder.apply(block)
  return addInterfaceEndpoint(arg0,builder.build())
}

public inline fun Vpc.addVpnConnection(arg0: String, block: VpnConnectionOptionsDsl.() -> Unit =
    {}): VpnConnection {
  val builder = VpnConnectionOptionsDsl()
  builder.apply(block)
  return addVpnConnection(arg0,builder.build())
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

public inline fun VpnConnection.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun VpnConnection.metricTunnelDataIn(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTunnelDataIn(builder.build())
}

public inline fun VpnConnection.metricTunnelDataOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTunnelDataOut(builder.build())
}

public inline fun VpnConnection.metricTunnelState(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTunnelState(builder.build())
}
