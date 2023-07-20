@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.ec2.AclCidrConfig
import software.amazon.awscdk.services.ec2.AclIcmp
import software.amazon.awscdk.services.ec2.AclPortRange
import software.amazon.awscdk.services.ec2.AclTrafficConfig
import software.amazon.awscdk.services.ec2.AddRouteOptions
import software.amazon.awscdk.services.ec2.AllocateCidrRequest
import software.amazon.awscdk.services.ec2.AllocatedSubnet
import software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameter
import software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameterProps
import software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter
import software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameterProps
import software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameter
import software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps
import software.amazon.awscdk.services.ec2.AmazonLinuxImage
import software.amazon.awscdk.services.ec2.AmazonLinuxImageProps
import software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseOptions
import software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseProps
import software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions
import software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions
import software.amazon.awscdk.services.ec2.AttachInitOptions
import software.amazon.awscdk.services.ec2.AwsIpamProps
import software.amazon.awscdk.services.ec2.BastionHostLinux
import software.amazon.awscdk.services.ec2.BastionHostLinuxProps
import software.amazon.awscdk.services.ec2.BlockDevice
import software.amazon.awscdk.services.ec2.CfnCapacityReservation
import software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet
import software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps
import software.amazon.awscdk.services.ec2.CfnCapacityReservationProps
import software.amazon.awscdk.services.ec2.CfnCarrierGateway
import software.amazon.awscdk.services.ec2.CfnCarrierGatewayProps
import software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule
import software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps
import software.amazon.awscdk.services.ec2.CfnClientVpnRoute
import software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps
import software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation
import software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps
import software.amazon.awscdk.services.ec2.CfnCustomerGateway
import software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps
import software.amazon.awscdk.services.ec2.CfnDHCPOptions
import software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps
import software.amazon.awscdk.services.ec2.CfnEC2Fleet
import software.amazon.awscdk.services.ec2.CfnEC2FleetProps
import software.amazon.awscdk.services.ec2.CfnEIP
import software.amazon.awscdk.services.ec2.CfnEIPAssociation
import software.amazon.awscdk.services.ec2.CfnEIPAssociationProps
import software.amazon.awscdk.services.ec2.CfnEIPProps
import software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway
import software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps
import software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation
import software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps
import software.amazon.awscdk.services.ec2.CfnFlowLog
import software.amazon.awscdk.services.ec2.CfnFlowLogProps
import software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation
import software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps
import software.amazon.awscdk.services.ec2.CfnHost
import software.amazon.awscdk.services.ec2.CfnHostProps
import software.amazon.awscdk.services.ec2.CfnIPAM
import software.amazon.awscdk.services.ec2.CfnIPAMAllocation
import software.amazon.awscdk.services.ec2.CfnIPAMAllocationProps
import software.amazon.awscdk.services.ec2.CfnIPAMPool
import software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr
import software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps
import software.amazon.awscdk.services.ec2.CfnIPAMPoolProps
import software.amazon.awscdk.services.ec2.CfnIPAMProps
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps
import software.amazon.awscdk.services.ec2.CfnIPAMScope
import software.amazon.awscdk.services.ec2.CfnIPAMScopeProps
import software.amazon.awscdk.services.ec2.CfnInstance
import software.amazon.awscdk.services.ec2.CfnInstanceProps
import software.amazon.awscdk.services.ec2.CfnInternetGateway
import software.amazon.awscdk.services.ec2.CfnInternetGatewayProps
import software.amazon.awscdk.services.ec2.CfnKeyPair
import software.amazon.awscdk.services.ec2.CfnKeyPairProps
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociation
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociationProps
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps
import software.amazon.awscdk.services.ec2.CfnNatGateway
import software.amazon.awscdk.services.ec2.CfnNatGatewayProps
import software.amazon.awscdk.services.ec2.CfnNetworkAcl
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntry
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps
import software.amazon.awscdk.services.ec2.CfnNetworkAclProps
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps
import software.amazon.awscdk.services.ec2.CfnNetworkInterface
import software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment
import software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps
import software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission
import software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps
import software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps
import software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscription
import software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscriptionProps
import software.amazon.awscdk.services.ec2.CfnPlacementGroup
import software.amazon.awscdk.services.ec2.CfnPlacementGroupProps
import software.amazon.awscdk.services.ec2.CfnPrefixList
import software.amazon.awscdk.services.ec2.CfnPrefixListProps
import software.amazon.awscdk.services.ec2.CfnRoute
import software.amazon.awscdk.services.ec2.CfnRouteProps
import software.amazon.awscdk.services.ec2.CfnRouteTable
import software.amazon.awscdk.services.ec2.CfnRouteTableProps
import software.amazon.awscdk.services.ec2.CfnSecurityGroup
import software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress
import software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps
import software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress
import software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps
import software.amazon.awscdk.services.ec2.CfnSecurityGroupProps
import software.amazon.awscdk.services.ec2.CfnSpotFleet
import software.amazon.awscdk.services.ec2.CfnSpotFleetProps
import software.amazon.awscdk.services.ec2.CfnSubnet
import software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock
import software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps
import software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation
import software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps
import software.amazon.awscdk.services.ec2.CfnSubnetProps
import software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation
import software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilter
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps
import software.amazon.awscdk.services.ec2.CfnTransitGateway
import software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment
import software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainProps
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps
import software.amazon.awscdk.services.ec2.CfnTransitGatewayProps
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTable
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociation
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociationProps
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableProps
import software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment
import software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps
import software.amazon.awscdk.services.ec2.CfnVPC
import software.amazon.awscdk.services.ec2.CfnVPCCidrBlock
import software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps
import software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation
import software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps
import software.amazon.awscdk.services.ec2.CfnVPCEndpoint
import software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification
import software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps
import software.amazon.awscdk.services.ec2.CfnVPCEndpointProps
import software.amazon.awscdk.services.ec2.CfnVPCEndpointService
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps
import software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment
import software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps
import software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection
import software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps
import software.amazon.awscdk.services.ec2.CfnVPCProps
import software.amazon.awscdk.services.ec2.CfnVPNConnection
import software.amazon.awscdk.services.ec2.CfnVPNConnectionProps
import software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute
import software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps
import software.amazon.awscdk.services.ec2.CfnVPNGateway
import software.amazon.awscdk.services.ec2.CfnVPNGatewayProps
import software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation
import software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps
import software.amazon.awscdk.services.ec2.CfnVolume
import software.amazon.awscdk.services.ec2.CfnVolumeAttachment
import software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps
import software.amazon.awscdk.services.ec2.CfnVolumeProps
import software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRule
import software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions
import software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleProps
import software.amazon.awscdk.services.ec2.ClientVpnEndpoint
import software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes
import software.amazon.awscdk.services.ec2.ClientVpnEndpointOptions
import software.amazon.awscdk.services.ec2.ClientVpnEndpointProps
import software.amazon.awscdk.services.ec2.ClientVpnRoute
import software.amazon.awscdk.services.ec2.ClientVpnRouteOptions
import software.amazon.awscdk.services.ec2.ClientVpnRouteProps
import software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions
import software.amazon.awscdk.services.ec2.ConfigSetProps
import software.amazon.awscdk.services.ec2.ConfigureNatOptions
import software.amazon.awscdk.services.ec2.ConnectionRule
import software.amazon.awscdk.services.ec2.Connections
import software.amazon.awscdk.services.ec2.ConnectionsProps
import software.amazon.awscdk.services.ec2.DestinationOptions
import software.amazon.awscdk.services.ec2.EbsDeviceOptions
import software.amazon.awscdk.services.ec2.EbsDeviceOptionsBase
import software.amazon.awscdk.services.ec2.EbsDeviceProps
import software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions
import software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions
import software.amazon.awscdk.services.ec2.ExecuteFileOptions
import software.amazon.awscdk.services.ec2.FlowLog
import software.amazon.awscdk.services.ec2.FlowLogDestinationConfig
import software.amazon.awscdk.services.ec2.FlowLogOptions
import software.amazon.awscdk.services.ec2.FlowLogProps
import software.amazon.awscdk.services.ec2.GatewayConfig
import software.amazon.awscdk.services.ec2.GatewayVpcEndpoint
import software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions
import software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps
import software.amazon.awscdk.services.ec2.GenericLinuxImage
import software.amazon.awscdk.services.ec2.GenericLinuxImageProps
import software.amazon.awscdk.services.ec2.GenericWindowsImage
import software.amazon.awscdk.services.ec2.GenericWindowsImageProps
import software.amazon.awscdk.services.ec2.InitCommandOptions
import software.amazon.awscdk.services.ec2.InitFileAssetOptions
import software.amazon.awscdk.services.ec2.InitFileOptions
import software.amazon.awscdk.services.ec2.InitServiceOptions
import software.amazon.awscdk.services.ec2.InitSourceAssetOptions
import software.amazon.awscdk.services.ec2.InitSourceOptions
import software.amazon.awscdk.services.ec2.InitUserOptions
import software.amazon.awscdk.services.ec2.Instance
import software.amazon.awscdk.services.ec2.InstanceProps
import software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect
import software.amazon.awscdk.services.ec2.InstanceRequireImdsv2AspectProps
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps
import software.amazon.awscdk.services.ec2.LaunchTemplate
import software.amazon.awscdk.services.ec2.LaunchTemplateAttributes
import software.amazon.awscdk.services.ec2.LaunchTemplateProps
import software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2Aspect
import software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2AspectProps
import software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions
import software.amazon.awscdk.services.ec2.LinuxUserDataOptions
import software.amazon.awscdk.services.ec2.LocationPackageOptions
import software.amazon.awscdk.services.ec2.LookupMachineImage
import software.amazon.awscdk.services.ec2.LookupMachineImageProps
import software.amazon.awscdk.services.ec2.MachineImageConfig
import software.amazon.awscdk.services.ec2.MultipartBodyOptions
import software.amazon.awscdk.services.ec2.MultipartUserData
import software.amazon.awscdk.services.ec2.MultipartUserDataOptions
import software.amazon.awscdk.services.ec2.NamedPackageOptions
import software.amazon.awscdk.services.ec2.NatGatewayProps
import software.amazon.awscdk.services.ec2.NatInstanceProps
import software.amazon.awscdk.services.ec2.NatInstanceProvider
import software.amazon.awscdk.services.ec2.NetworkAcl
import software.amazon.awscdk.services.ec2.NetworkAclEntry
import software.amazon.awscdk.services.ec2.NetworkAclEntryProps
import software.amazon.awscdk.services.ec2.NetworkAclProps
import software.amazon.awscdk.services.ec2.PlacementGroup
import software.amazon.awscdk.services.ec2.PlacementGroupProps
import software.amazon.awscdk.services.ec2.Port
import software.amazon.awscdk.services.ec2.PortProps
import software.amazon.awscdk.services.ec2.PrefixList
import software.amazon.awscdk.services.ec2.PrefixListOptions
import software.amazon.awscdk.services.ec2.PrefixListProps
import software.amazon.awscdk.services.ec2.PrivateSubnet
import software.amazon.awscdk.services.ec2.PrivateSubnetAttributes
import software.amazon.awscdk.services.ec2.PrivateSubnetProps
import software.amazon.awscdk.services.ec2.PublicSubnet
import software.amazon.awscdk.services.ec2.PublicSubnetAttributes
import software.amazon.awscdk.services.ec2.PublicSubnetProps
import software.amazon.awscdk.services.ec2.RequestedSubnet
import software.amazon.awscdk.services.ec2.ResolveSsmParameterAtLaunchImage
import software.amazon.awscdk.services.ec2.RuleScope
import software.amazon.awscdk.services.ec2.S3DestinationOptions
import software.amazon.awscdk.services.ec2.S3DownloadOptions
import software.amazon.awscdk.services.ec2.SecurityGroup
import software.amazon.awscdk.services.ec2.SecurityGroupImportOptions
import software.amazon.awscdk.services.ec2.SecurityGroupProps
import software.amazon.awscdk.services.ec2.SelectedSubnets
import software.amazon.awscdk.services.ec2.SsmParameterImageOptions
import software.amazon.awscdk.services.ec2.Subnet
import software.amazon.awscdk.services.ec2.SubnetAttributes
import software.amazon.awscdk.services.ec2.SubnetConfiguration
import software.amazon.awscdk.services.ec2.SubnetIpamOptions
import software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation
import software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps
import software.amazon.awscdk.services.ec2.SubnetProps
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ec2.SystemdConfigFileOptions
import software.amazon.awscdk.services.ec2.Volume
import software.amazon.awscdk.services.ec2.VolumeAttributes
import software.amazon.awscdk.services.ec2.VolumeProps
import software.amazon.awscdk.services.ec2.Vpc
import software.amazon.awscdk.services.ec2.VpcAttributes
import software.amazon.awscdk.services.ec2.VpcEndpointService
import software.amazon.awscdk.services.ec2.VpcEndpointServiceProps
import software.amazon.awscdk.services.ec2.VpcIpamOptions
import software.amazon.awscdk.services.ec2.VpcLookupOptions
import software.amazon.awscdk.services.ec2.VpcProps
import software.amazon.awscdk.services.ec2.VpnConnection
import software.amazon.awscdk.services.ec2.VpnConnectionAttributes
import software.amazon.awscdk.services.ec2.VpnConnectionOptions
import software.amazon.awscdk.services.ec2.VpnConnectionProps
import software.amazon.awscdk.services.ec2.VpnGateway
import software.amazon.awscdk.services.ec2.VpnGatewayProps
import software.amazon.awscdk.services.ec2.VpnTunnelOption
import software.amazon.awscdk.services.ec2.WindowsImage
import software.amazon.awscdk.services.ec2.WindowsImageProps
import software.amazon.awscdk.services.ec2.WindowsUserDataOptions
import software.amazon.awscdk.services.ec2.WindowsVersion
import software.constructs.Construct

public object ec2 {
  public inline fun aclCidrConfig(block: AclCidrConfigDsl.() -> Unit = {}): AclCidrConfig {
    val builder = AclCidrConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun aclIcmp(block: AclIcmpDsl.() -> Unit = {}): AclIcmp {
    val builder = AclIcmpDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun aclPortRange(block: AclPortRangeDsl.() -> Unit = {}): AclPortRange {
    val builder = AclPortRangeDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun aclTrafficConfig(block: AclTrafficConfigDsl.() -> Unit = {}): AclTrafficConfig {
    val builder = AclTrafficConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun addRouteOptions(block: AddRouteOptionsDsl.() -> Unit = {}): AddRouteOptions {
    val builder = AddRouteOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun allocateCidrRequest(block: AllocateCidrRequestDsl.() -> Unit = {}):
      AllocateCidrRequest {
    val builder = AllocateCidrRequestDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun allocatedSubnet(block: AllocatedSubnetDsl.() -> Unit = {}): AllocatedSubnet {
    val builder = AllocatedSubnetDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun amazonLinux2022ImageSsmParameter(block: AmazonLinux2022ImageSsmParameterDsl.() -> Unit =
      {}): AmazonLinux2022ImageSsmParameter {
    val builder = AmazonLinux2022ImageSsmParameterDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun amazonLinux2022ImageSsmParameterProps(block: AmazonLinux2022ImageSsmParameterPropsDsl.() -> Unit
      = {}): AmazonLinux2022ImageSsmParameterProps {
    val builder = AmazonLinux2022ImageSsmParameterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun amazonLinux2023ImageSsmParameter(block: AmazonLinux2023ImageSsmParameterDsl.() -> Unit =
      {}): AmazonLinux2023ImageSsmParameter {
    val builder = AmazonLinux2023ImageSsmParameterDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun amazonLinux2023ImageSsmParameterProps(block: AmazonLinux2023ImageSsmParameterPropsDsl.() -> Unit
      = {}): AmazonLinux2023ImageSsmParameterProps {
    val builder = AmazonLinux2023ImageSsmParameterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun amazonLinux2ImageSsmParameter(block: AmazonLinux2ImageSsmParameterDsl.() -> Unit
      = {}): AmazonLinux2ImageSsmParameter {
    val builder = AmazonLinux2ImageSsmParameterDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun amazonLinux2ImageSsmParameterProps(block: AmazonLinux2ImageSsmParameterPropsDsl.() -> Unit
      = {}): AmazonLinux2ImageSsmParameterProps {
    val builder = AmazonLinux2ImageSsmParameterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun amazonLinuxImage(block: AmazonLinuxImageDsl.() -> Unit = {}): AmazonLinuxImage {
    val builder = AmazonLinuxImageDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun amazonLinuxImageProps(block: AmazonLinuxImagePropsDsl.() -> Unit = {}):
      AmazonLinuxImageProps {
    val builder = AmazonLinuxImagePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun amazonLinuxImageSsmParameterBaseOptions(block: AmazonLinuxImageSsmParameterBaseOptionsDsl.() -> Unit
      = {}): AmazonLinuxImageSsmParameterBaseOptions {
    val builder = AmazonLinuxImageSsmParameterBaseOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun amazonLinuxImageSsmParameterBaseProps(block: AmazonLinuxImageSsmParameterBasePropsDsl.() -> Unit
      = {}): AmazonLinuxImageSsmParameterBaseProps {
    val builder = AmazonLinuxImageSsmParameterBasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun amazonLinuxImageSsmParameterCommonOptions(block: AmazonLinuxImageSsmParameterCommonOptionsDsl.() -> Unit
      = {}): AmazonLinuxImageSsmParameterCommonOptions {
    val builder = AmazonLinuxImageSsmParameterCommonOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun applyCloudFormationInitOptions(block: ApplyCloudFormationInitOptionsDsl.() -> Unit = {}):
      ApplyCloudFormationInitOptions {
    val builder = ApplyCloudFormationInitOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun attachInitOptions(block: AttachInitOptionsDsl.() -> Unit = {}):
      AttachInitOptions {
    val builder = AttachInitOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun awsIpamProps(block: AwsIpamPropsDsl.() -> Unit = {}): AwsIpamProps {
    val builder = AwsIpamPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun bastionHostLinux(
    scope: Construct,
    id: String,
    block: BastionHostLinuxDsl.() -> Unit = {},
  ): BastionHostLinux {
    val builder = BastionHostLinuxDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun bastionHostLinuxProps(block: BastionHostLinuxPropsDsl.() -> Unit = {}):
      BastionHostLinuxProps {
    val builder = BastionHostLinuxPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun blockDevice(block: BlockDeviceDsl.() -> Unit = {}): BlockDevice {
    val builder = BlockDeviceDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCapacityReservation(
    scope: Construct,
    id: String,
    block: CfnCapacityReservationDsl.() -> Unit = {},
  ): CfnCapacityReservation {
    val builder = CfnCapacityReservationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCapacityReservationFleet(
    scope: Construct,
    id: String,
    block: CfnCapacityReservationFleetDsl.() -> Unit = {},
  ): CfnCapacityReservationFleet {
    val builder = CfnCapacityReservationFleetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCapacityReservationFleetInstanceTypeSpecificationProperty(block: CfnCapacityReservationFleetInstanceTypeSpecificationPropertyDsl.() -> Unit
      = {}): CfnCapacityReservationFleet.InstanceTypeSpecificationProperty {
    val builder = CfnCapacityReservationFleetInstanceTypeSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCapacityReservationFleetProps(block: CfnCapacityReservationFleetPropsDsl.() -> Unit =
      {}): CfnCapacityReservationFleetProps {
    val builder = CfnCapacityReservationFleetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCapacityReservationFleetTagSpecificationProperty(block: CfnCapacityReservationFleetTagSpecificationPropertyDsl.() -> Unit
      = {}): CfnCapacityReservationFleet.TagSpecificationProperty {
    val builder = CfnCapacityReservationFleetTagSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCapacityReservationProps(block: CfnCapacityReservationPropsDsl.() -> Unit =
      {}): CfnCapacityReservationProps {
    val builder = CfnCapacityReservationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCapacityReservationTagSpecificationProperty(block: CfnCapacityReservationTagSpecificationPropertyDsl.() -> Unit
      = {}): CfnCapacityReservation.TagSpecificationProperty {
    val builder = CfnCapacityReservationTagSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCarrierGateway(
    scope: Construct,
    id: String,
    block: CfnCarrierGatewayDsl.() -> Unit = {},
  ): CfnCarrierGateway {
    val builder = CfnCarrierGatewayDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCarrierGatewayProps(block: CfnCarrierGatewayPropsDsl.() -> Unit = {}):
      CfnCarrierGatewayProps {
    val builder = CfnCarrierGatewayPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnClientVpnAuthorizationRule(
    scope: Construct,
    id: String,
    block: CfnClientVpnAuthorizationRuleDsl.() -> Unit = {},
  ): CfnClientVpnAuthorizationRule {
    val builder = CfnClientVpnAuthorizationRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnClientVpnAuthorizationRuleProps(block: CfnClientVpnAuthorizationRulePropsDsl.() -> Unit
      = {}): CfnClientVpnAuthorizationRuleProps {
    val builder = CfnClientVpnAuthorizationRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnClientVpnEndpoint(
    scope: Construct,
    id: String,
    block: CfnClientVpnEndpointDsl.() -> Unit = {},
  ): CfnClientVpnEndpoint {
    val builder = CfnClientVpnEndpointDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnClientVpnEndpointCertificateAuthenticationRequestProperty(block: CfnClientVpnEndpointCertificateAuthenticationRequestPropertyDsl.() -> Unit
      = {}): CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty {
    val builder = CfnClientVpnEndpointCertificateAuthenticationRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnClientVpnEndpointClientAuthenticationRequestProperty(block: CfnClientVpnEndpointClientAuthenticationRequestPropertyDsl.() -> Unit
      = {}): CfnClientVpnEndpoint.ClientAuthenticationRequestProperty {
    val builder = CfnClientVpnEndpointClientAuthenticationRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnClientVpnEndpointClientConnectOptionsProperty(block: CfnClientVpnEndpointClientConnectOptionsPropertyDsl.() -> Unit
      = {}): CfnClientVpnEndpoint.ClientConnectOptionsProperty {
    val builder = CfnClientVpnEndpointClientConnectOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnClientVpnEndpointClientLoginBannerOptionsProperty(block: CfnClientVpnEndpointClientLoginBannerOptionsPropertyDsl.() -> Unit
      = {}): CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty {
    val builder = CfnClientVpnEndpointClientLoginBannerOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnClientVpnEndpointConnectionLogOptionsProperty(block: CfnClientVpnEndpointConnectionLogOptionsPropertyDsl.() -> Unit
      = {}): CfnClientVpnEndpoint.ConnectionLogOptionsProperty {
    val builder = CfnClientVpnEndpointConnectionLogOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnClientVpnEndpointDirectoryServiceAuthenticationRequestProperty(block: CfnClientVpnEndpointDirectoryServiceAuthenticationRequestPropertyDsl.() -> Unit
      = {}): CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty {
    val builder = CfnClientVpnEndpointDirectoryServiceAuthenticationRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnClientVpnEndpointFederatedAuthenticationRequestProperty(block: CfnClientVpnEndpointFederatedAuthenticationRequestPropertyDsl.() -> Unit
      = {}): CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty {
    val builder = CfnClientVpnEndpointFederatedAuthenticationRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnClientVpnEndpointProps(block: CfnClientVpnEndpointPropsDsl.() -> Unit = {}):
      CfnClientVpnEndpointProps {
    val builder = CfnClientVpnEndpointPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnClientVpnEndpointTagSpecificationProperty(block: CfnClientVpnEndpointTagSpecificationPropertyDsl.() -> Unit
      = {}): CfnClientVpnEndpoint.TagSpecificationProperty {
    val builder = CfnClientVpnEndpointTagSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnClientVpnRoute(
    scope: Construct,
    id: String,
    block: CfnClientVpnRouteDsl.() -> Unit = {},
  ): CfnClientVpnRoute {
    val builder = CfnClientVpnRouteDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnClientVpnRouteProps(block: CfnClientVpnRoutePropsDsl.() -> Unit = {}):
      CfnClientVpnRouteProps {
    val builder = CfnClientVpnRoutePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnClientVpnTargetNetworkAssociation(
    scope: Construct,
    id: String,
    block: CfnClientVpnTargetNetworkAssociationDsl.() -> Unit = {},
  ): CfnClientVpnTargetNetworkAssociation {
    val builder = CfnClientVpnTargetNetworkAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnClientVpnTargetNetworkAssociationProps(block: CfnClientVpnTargetNetworkAssociationPropsDsl.() -> Unit
      = {}): CfnClientVpnTargetNetworkAssociationProps {
    val builder = CfnClientVpnTargetNetworkAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCustomerGateway(
    scope: Construct,
    id: String,
    block: CfnCustomerGatewayDsl.() -> Unit = {},
  ): CfnCustomerGateway {
    val builder = CfnCustomerGatewayDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCustomerGatewayProps(block: CfnCustomerGatewayPropsDsl.() -> Unit = {}):
      CfnCustomerGatewayProps {
    val builder = CfnCustomerGatewayPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDHCPOptions(
    scope: Construct,
    id: String,
    block: CfnDHCPOptionsDsl.() -> Unit = {},
  ): CfnDHCPOptions {
    val builder = CfnDHCPOptionsDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDHCPOptionsProps(block: CfnDHCPOptionsPropsDsl.() -> Unit = {}):
      CfnDHCPOptionsProps {
    val builder = CfnDHCPOptionsPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEC2Fleet(
    scope: Construct,
    id: String,
    block: CfnEC2FleetDsl.() -> Unit = {},
  ): CfnEC2Fleet {
    val builder = CfnEC2FleetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetAcceleratorCountRequestProperty(block: CfnEC2FleetAcceleratorCountRequestPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.AcceleratorCountRequestProperty {
    val builder = CfnEC2FleetAcceleratorCountRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetAcceleratorTotalMemoryMiBRequestProperty(block: CfnEC2FleetAcceleratorTotalMemoryMiBRequestPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.AcceleratorTotalMemoryMiBRequestProperty {
    val builder = CfnEC2FleetAcceleratorTotalMemoryMiBRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetBaselineEbsBandwidthMbpsRequestProperty(block: CfnEC2FleetBaselineEbsBandwidthMbpsRequestPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty {
    val builder = CfnEC2FleetBaselineEbsBandwidthMbpsRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetCapacityRebalanceProperty(block: CfnEC2FleetCapacityRebalancePropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.CapacityRebalanceProperty {
    val builder = CfnEC2FleetCapacityRebalancePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetCapacityReservationOptionsRequestProperty(block: CfnEC2FleetCapacityReservationOptionsRequestPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.CapacityReservationOptionsRequestProperty {
    val builder = CfnEC2FleetCapacityReservationOptionsRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetFleetLaunchTemplateConfigRequestProperty(block: CfnEC2FleetFleetLaunchTemplateConfigRequestPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty {
    val builder = CfnEC2FleetFleetLaunchTemplateConfigRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetFleetLaunchTemplateOverridesRequestProperty(block: CfnEC2FleetFleetLaunchTemplateOverridesRequestPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty {
    val builder = CfnEC2FleetFleetLaunchTemplateOverridesRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetFleetLaunchTemplateSpecificationRequestProperty(block: CfnEC2FleetFleetLaunchTemplateSpecificationRequestPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty {
    val builder = CfnEC2FleetFleetLaunchTemplateSpecificationRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetInstanceRequirementsRequestProperty(block: CfnEC2FleetInstanceRequirementsRequestPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.InstanceRequirementsRequestProperty {
    val builder = CfnEC2FleetInstanceRequirementsRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetMaintenanceStrategiesProperty(block: CfnEC2FleetMaintenanceStrategiesPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.MaintenanceStrategiesProperty {
    val builder = CfnEC2FleetMaintenanceStrategiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetMemoryGiBPerVCpuRequestProperty(block: CfnEC2FleetMemoryGiBPerVCpuRequestPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty {
    val builder = CfnEC2FleetMemoryGiBPerVCpuRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetMemoryMiBRequestProperty(block: CfnEC2FleetMemoryMiBRequestPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.MemoryMiBRequestProperty {
    val builder = CfnEC2FleetMemoryMiBRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetNetworkBandwidthGbpsRequestProperty(block: CfnEC2FleetNetworkBandwidthGbpsRequestPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty {
    val builder = CfnEC2FleetNetworkBandwidthGbpsRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetNetworkInterfaceCountRequestProperty(block: CfnEC2FleetNetworkInterfaceCountRequestPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.NetworkInterfaceCountRequestProperty {
    val builder = CfnEC2FleetNetworkInterfaceCountRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetOnDemandOptionsRequestProperty(block: CfnEC2FleetOnDemandOptionsRequestPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.OnDemandOptionsRequestProperty {
    val builder = CfnEC2FleetOnDemandOptionsRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEC2FleetPlacementProperty(block: CfnEC2FleetPlacementPropertyDsl.() -> Unit =
      {}): CfnEC2Fleet.PlacementProperty {
    val builder = CfnEC2FleetPlacementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEC2FleetProps(block: CfnEC2FleetPropsDsl.() -> Unit = {}): CfnEC2FleetProps {
    val builder = CfnEC2FleetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetSpotOptionsRequestProperty(block: CfnEC2FleetSpotOptionsRequestPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.SpotOptionsRequestProperty {
    val builder = CfnEC2FleetSpotOptionsRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetTagSpecificationProperty(block: CfnEC2FleetTagSpecificationPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.TagSpecificationProperty {
    val builder = CfnEC2FleetTagSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetTargetCapacitySpecificationRequestProperty(block: CfnEC2FleetTargetCapacitySpecificationRequestPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.TargetCapacitySpecificationRequestProperty {
    val builder = CfnEC2FleetTargetCapacitySpecificationRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetTotalLocalStorageGBRequestProperty(block: CfnEC2FleetTotalLocalStorageGBRequestPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.TotalLocalStorageGBRequestProperty {
    val builder = CfnEC2FleetTotalLocalStorageGBRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEC2FleetVCpuCountRangeRequestProperty(block: CfnEC2FleetVCpuCountRangeRequestPropertyDsl.() -> Unit
      = {}): CfnEC2Fleet.VCpuCountRangeRequestProperty {
    val builder = CfnEC2FleetVCpuCountRangeRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEIP(
    scope: Construct,
    id: String,
    block: CfnEIPDsl.() -> Unit = {},
  ): CfnEIP {
    val builder = CfnEIPDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEIPAssociation(
    scope: Construct,
    id: String,
    block: CfnEIPAssociationDsl.() -> Unit = {},
  ): CfnEIPAssociation {
    val builder = CfnEIPAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEIPAssociationProps(block: CfnEIPAssociationPropsDsl.() -> Unit = {}):
      CfnEIPAssociationProps {
    val builder = CfnEIPAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEIPProps(block: CfnEIPPropsDsl.() -> Unit = {}): CfnEIPProps {
    val builder = CfnEIPPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEgressOnlyInternetGateway(
    scope: Construct,
    id: String,
    block: CfnEgressOnlyInternetGatewayDsl.() -> Unit = {},
  ): CfnEgressOnlyInternetGateway {
    val builder = CfnEgressOnlyInternetGatewayDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEgressOnlyInternetGatewayProps(block: CfnEgressOnlyInternetGatewayPropsDsl.() -> Unit =
      {}): CfnEgressOnlyInternetGatewayProps {
    val builder = CfnEgressOnlyInternetGatewayPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEnclaveCertificateIamRoleAssociation(
    scope: Construct,
    id: String,
    block: CfnEnclaveCertificateIamRoleAssociationDsl.() -> Unit = {},
  ): CfnEnclaveCertificateIamRoleAssociation {
    val builder = CfnEnclaveCertificateIamRoleAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEnclaveCertificateIamRoleAssociationProps(block: CfnEnclaveCertificateIamRoleAssociationPropsDsl.() -> Unit
      = {}): CfnEnclaveCertificateIamRoleAssociationProps {
    val builder = CfnEnclaveCertificateIamRoleAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFlowLog(
    scope: Construct,
    id: String,
    block: CfnFlowLogDsl.() -> Unit = {},
  ): CfnFlowLog {
    val builder = CfnFlowLogDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowLogDestinationOptionsProperty(block: CfnFlowLogDestinationOptionsPropertyDsl.() -> Unit
      = {}): CfnFlowLog.DestinationOptionsProperty {
    val builder = CfnFlowLogDestinationOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFlowLogProps(block: CfnFlowLogPropsDsl.() -> Unit = {}): CfnFlowLogProps {
    val builder = CfnFlowLogPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGatewayRouteTableAssociation(
    scope: Construct,
    id: String,
    block: CfnGatewayRouteTableAssociationDsl.() -> Unit = {},
  ): CfnGatewayRouteTableAssociation {
    val builder = CfnGatewayRouteTableAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGatewayRouteTableAssociationProps(block: CfnGatewayRouteTableAssociationPropsDsl.() -> Unit
      = {}): CfnGatewayRouteTableAssociationProps {
    val builder = CfnGatewayRouteTableAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHost(
    scope: Construct,
    id: String,
    block: CfnHostDsl.() -> Unit = {},
  ): CfnHost {
    val builder = CfnHostDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHostProps(block: CfnHostPropsDsl.() -> Unit = {}): CfnHostProps {
    val builder = CfnHostPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIPAM(
    scope: Construct,
    id: String,
    block: CfnIPAMDsl.() -> Unit = {},
  ): CfnIPAM {
    val builder = CfnIPAMDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIPAMAllocation(
    scope: Construct,
    id: String,
    block: CfnIPAMAllocationDsl.() -> Unit = {},
  ): CfnIPAMAllocation {
    val builder = CfnIPAMAllocationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIPAMAllocationProps(block: CfnIPAMAllocationPropsDsl.() -> Unit = {}):
      CfnIPAMAllocationProps {
    val builder = CfnIPAMAllocationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnIPAMIpamOperatingRegionProperty(block: CfnIPAMIpamOperatingRegionPropertyDsl.() -> Unit
      = {}): CfnIPAM.IpamOperatingRegionProperty {
    val builder = CfnIPAMIpamOperatingRegionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIPAMPool(
    scope: Construct,
    id: String,
    block: CfnIPAMPoolDsl.() -> Unit = {},
  ): CfnIPAMPool {
    val builder = CfnIPAMPoolDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIPAMPoolCidr(
    scope: Construct,
    id: String,
    block: CfnIPAMPoolCidrDsl.() -> Unit = {},
  ): CfnIPAMPoolCidr {
    val builder = CfnIPAMPoolCidrDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIPAMPoolCidrProps(block: CfnIPAMPoolCidrPropsDsl.() -> Unit = {}):
      CfnIPAMPoolCidrProps {
    val builder = CfnIPAMPoolCidrPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIPAMPoolProps(block: CfnIPAMPoolPropsDsl.() -> Unit = {}): CfnIPAMPoolProps {
    val builder = CfnIPAMPoolPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnIPAMPoolProvisionedCidrProperty(block: CfnIPAMPoolProvisionedCidrPropertyDsl.() -> Unit
      = {}): CfnIPAMPool.ProvisionedCidrProperty {
    val builder = CfnIPAMPoolProvisionedCidrPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIPAMProps(block: CfnIPAMPropsDsl.() -> Unit = {}): CfnIPAMProps {
    val builder = CfnIPAMPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIPAMResourceDiscovery(
    scope: Construct,
    id: String,
    block: CfnIPAMResourceDiscoveryDsl.() -> Unit = {},
  ): CfnIPAMResourceDiscovery {
    val builder = CfnIPAMResourceDiscoveryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIPAMResourceDiscoveryAssociation(
    scope: Construct,
    id: String,
    block: CfnIPAMResourceDiscoveryAssociationDsl.() -> Unit = {},
  ): CfnIPAMResourceDiscoveryAssociation {
    val builder = CfnIPAMResourceDiscoveryAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnIPAMResourceDiscoveryAssociationProps(block: CfnIPAMResourceDiscoveryAssociationPropsDsl.() -> Unit
      = {}): CfnIPAMResourceDiscoveryAssociationProps {
    val builder = CfnIPAMResourceDiscoveryAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnIPAMResourceDiscoveryIpamOperatingRegionProperty(block: CfnIPAMResourceDiscoveryIpamOperatingRegionPropertyDsl.() -> Unit
      = {}): CfnIPAMResourceDiscovery.IpamOperatingRegionProperty {
    val builder = CfnIPAMResourceDiscoveryIpamOperatingRegionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIPAMResourceDiscoveryProps(block: CfnIPAMResourceDiscoveryPropsDsl.() -> Unit
      = {}): CfnIPAMResourceDiscoveryProps {
    val builder = CfnIPAMResourceDiscoveryPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIPAMScope(
    scope: Construct,
    id: String,
    block: CfnIPAMScopeDsl.() -> Unit = {},
  ): CfnIPAMScope {
    val builder = CfnIPAMScopeDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIPAMScopeProps(block: CfnIPAMScopePropsDsl.() -> Unit = {}):
      CfnIPAMScopeProps {
    val builder = CfnIPAMScopePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInstance(
    scope: Construct,
    id: String,
    block: CfnInstanceDsl.() -> Unit = {},
  ): CfnInstance {
    val builder = CfnInstanceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstanceAssociationParameterProperty(block: CfnInstanceAssociationParameterPropertyDsl.() -> Unit
      = {}): CfnInstance.AssociationParameterProperty {
    val builder = CfnInstanceAssociationParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstanceBlockDeviceMappingProperty(block: CfnInstanceBlockDeviceMappingPropertyDsl.() -> Unit
      = {}): CfnInstance.BlockDeviceMappingProperty {
    val builder = CfnInstanceBlockDeviceMappingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInstanceCpuOptionsProperty(block: CfnInstanceCpuOptionsPropertyDsl.() -> Unit
      = {}): CfnInstance.CpuOptionsProperty {
    val builder = CfnInstanceCpuOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstanceCreditSpecificationProperty(block: CfnInstanceCreditSpecificationPropertyDsl.() -> Unit
      = {}): CfnInstance.CreditSpecificationProperty {
    val builder = CfnInstanceCreditSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInstanceEbsProperty(block: CfnInstanceEbsPropertyDsl.() -> Unit = {}):
      CfnInstance.EbsProperty {
    val builder = CfnInstanceEbsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstanceElasticGpuSpecificationProperty(block: CfnInstanceElasticGpuSpecificationPropertyDsl.() -> Unit
      = {}): CfnInstance.ElasticGpuSpecificationProperty {
    val builder = CfnInstanceElasticGpuSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstanceElasticInferenceAcceleratorProperty(block: CfnInstanceElasticInferenceAcceleratorPropertyDsl.() -> Unit
      = {}): CfnInstance.ElasticInferenceAcceleratorProperty {
    val builder = CfnInstanceElasticInferenceAcceleratorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstanceEnclaveOptionsProperty(block: CfnInstanceEnclaveOptionsPropertyDsl.() -> Unit =
      {}): CfnInstance.EnclaveOptionsProperty {
    val builder = CfnInstanceEnclaveOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstanceHibernationOptionsProperty(block: CfnInstanceHibernationOptionsPropertyDsl.() -> Unit
      = {}): CfnInstance.HibernationOptionsProperty {
    val builder = CfnInstanceHibernationOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstanceInstanceIpv6AddressProperty(block: CfnInstanceInstanceIpv6AddressPropertyDsl.() -> Unit
      = {}): CfnInstance.InstanceIpv6AddressProperty {
    val builder = CfnInstanceInstanceIpv6AddressPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstanceLaunchTemplateSpecificationProperty(block: CfnInstanceLaunchTemplateSpecificationPropertyDsl.() -> Unit
      = {}): CfnInstance.LaunchTemplateSpecificationProperty {
    val builder = CfnInstanceLaunchTemplateSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstanceLicenseSpecificationProperty(block: CfnInstanceLicenseSpecificationPropertyDsl.() -> Unit
      = {}): CfnInstance.LicenseSpecificationProperty {
    val builder = CfnInstanceLicenseSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstanceNetworkInterfaceProperty(block: CfnInstanceNetworkInterfacePropertyDsl.() -> Unit
      = {}): CfnInstance.NetworkInterfaceProperty {
    val builder = CfnInstanceNetworkInterfacePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInstanceNoDeviceProperty(block: CfnInstanceNoDevicePropertyDsl.() -> Unit =
      {}): CfnInstance.NoDeviceProperty {
    val builder = CfnInstanceNoDevicePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstancePrivateDnsNameOptionsProperty(block: CfnInstancePrivateDnsNameOptionsPropertyDsl.() -> Unit
      = {}): CfnInstance.PrivateDnsNameOptionsProperty {
    val builder = CfnInstancePrivateDnsNameOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstancePrivateIpAddressSpecificationProperty(block: CfnInstancePrivateIpAddressSpecificationPropertyDsl.() -> Unit
      = {}): CfnInstance.PrivateIpAddressSpecificationProperty {
    val builder = CfnInstancePrivateIpAddressSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInstanceProps(block: CfnInstancePropsDsl.() -> Unit = {}): CfnInstanceProps {
    val builder = CfnInstancePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstanceSsmAssociationProperty(block: CfnInstanceSsmAssociationPropertyDsl.() -> Unit =
      {}): CfnInstance.SsmAssociationProperty {
    val builder = CfnInstanceSsmAssociationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInstanceVolumeProperty(block: CfnInstanceVolumePropertyDsl.() -> Unit = {}):
      CfnInstance.VolumeProperty {
    val builder = CfnInstanceVolumePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInternetGateway(
    scope: Construct,
    id: String,
    block: CfnInternetGatewayDsl.() -> Unit = {},
  ): CfnInternetGateway {
    val builder = CfnInternetGatewayDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInternetGatewayProps(block: CfnInternetGatewayPropsDsl.() -> Unit = {}):
      CfnInternetGatewayProps {
    val builder = CfnInternetGatewayPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnKeyPair(
    scope: Construct,
    id: String,
    block: CfnKeyPairDsl.() -> Unit = {},
  ): CfnKeyPair {
    val builder = CfnKeyPairDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnKeyPairProps(block: CfnKeyPairPropsDsl.() -> Unit = {}): CfnKeyPairProps {
    val builder = CfnKeyPairPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLaunchTemplate(
    scope: Construct,
    id: String,
    block: CfnLaunchTemplateDsl.() -> Unit = {},
  ): CfnLaunchTemplate {
    val builder = CfnLaunchTemplateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateAcceleratorCountProperty(block: CfnLaunchTemplateAcceleratorCountPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.AcceleratorCountProperty {
    val builder = CfnLaunchTemplateAcceleratorCountPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateAcceleratorTotalMemoryMiBProperty(block: CfnLaunchTemplateAcceleratorTotalMemoryMiBPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty {
    val builder = CfnLaunchTemplateAcceleratorTotalMemoryMiBPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateBaselineEbsBandwidthMbpsProperty(block: CfnLaunchTemplateBaselineEbsBandwidthMbpsPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty {
    val builder = CfnLaunchTemplateBaselineEbsBandwidthMbpsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateBlockDeviceMappingProperty(block: CfnLaunchTemplateBlockDeviceMappingPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.BlockDeviceMappingProperty {
    val builder = CfnLaunchTemplateBlockDeviceMappingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateCapacityReservationSpecificationProperty(block: CfnLaunchTemplateCapacityReservationSpecificationPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.CapacityReservationSpecificationProperty {
    val builder = CfnLaunchTemplateCapacityReservationSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateCapacityReservationTargetProperty(block: CfnLaunchTemplateCapacityReservationTargetPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.CapacityReservationTargetProperty {
    val builder = CfnLaunchTemplateCapacityReservationTargetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateCpuOptionsProperty(block: CfnLaunchTemplateCpuOptionsPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.CpuOptionsProperty {
    val builder = CfnLaunchTemplateCpuOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateCreditSpecificationProperty(block: CfnLaunchTemplateCreditSpecificationPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.CreditSpecificationProperty {
    val builder = CfnLaunchTemplateCreditSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLaunchTemplateEbsProperty(block: CfnLaunchTemplateEbsPropertyDsl.() -> Unit =
      {}): CfnLaunchTemplate.EbsProperty {
    val builder = CfnLaunchTemplateEbsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateElasticGpuSpecificationProperty(block: CfnLaunchTemplateElasticGpuSpecificationPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.ElasticGpuSpecificationProperty {
    val builder = CfnLaunchTemplateElasticGpuSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateEnclaveOptionsProperty(block: CfnLaunchTemplateEnclaveOptionsPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.EnclaveOptionsProperty {
    val builder = CfnLaunchTemplateEnclaveOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateHibernationOptionsProperty(block: CfnLaunchTemplateHibernationOptionsPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.HibernationOptionsProperty {
    val builder = CfnLaunchTemplateHibernationOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateIamInstanceProfileProperty(block: CfnLaunchTemplateIamInstanceProfilePropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.IamInstanceProfileProperty {
    val builder = CfnLaunchTemplateIamInstanceProfilePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateInstanceMarketOptionsProperty(block: CfnLaunchTemplateInstanceMarketOptionsPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.InstanceMarketOptionsProperty {
    val builder = CfnLaunchTemplateInstanceMarketOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateInstanceRequirementsProperty(block: CfnLaunchTemplateInstanceRequirementsPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.InstanceRequirementsProperty {
    val builder = CfnLaunchTemplateInstanceRequirementsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateIpv4PrefixSpecificationProperty(block: CfnLaunchTemplateIpv4PrefixSpecificationPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.Ipv4PrefixSpecificationProperty {
    val builder = CfnLaunchTemplateIpv4PrefixSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateIpv6AddProperty(block: CfnLaunchTemplateIpv6AddPropertyDsl.() -> Unit =
      {}): CfnLaunchTemplate.Ipv6AddProperty {
    val builder = CfnLaunchTemplateIpv6AddPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateIpv6PrefixSpecificationProperty(block: CfnLaunchTemplateIpv6PrefixSpecificationPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.Ipv6PrefixSpecificationProperty {
    val builder = CfnLaunchTemplateIpv6PrefixSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateLaunchTemplateDataProperty(block: CfnLaunchTemplateLaunchTemplateDataPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.LaunchTemplateDataProperty {
    val builder = CfnLaunchTemplateLaunchTemplateDataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateLaunchTemplateElasticInferenceAcceleratorProperty(block: CfnLaunchTemplateLaunchTemplateElasticInferenceAcceleratorPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty {
    val builder = CfnLaunchTemplateLaunchTemplateElasticInferenceAcceleratorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateLaunchTemplateTagSpecificationProperty(block: CfnLaunchTemplateLaunchTemplateTagSpecificationPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty {
    val builder = CfnLaunchTemplateLaunchTemplateTagSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateLicenseSpecificationProperty(block: CfnLaunchTemplateLicenseSpecificationPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.LicenseSpecificationProperty {
    val builder = CfnLaunchTemplateLicenseSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateMaintenanceOptionsProperty(block: CfnLaunchTemplateMaintenanceOptionsPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.MaintenanceOptionsProperty {
    val builder = CfnLaunchTemplateMaintenanceOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateMemoryGiBPerVCpuProperty(block: CfnLaunchTemplateMemoryGiBPerVCpuPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.MemoryGiBPerVCpuProperty {
    val builder = CfnLaunchTemplateMemoryGiBPerVCpuPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateMemoryMiBProperty(block: CfnLaunchTemplateMemoryMiBPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.MemoryMiBProperty {
    val builder = CfnLaunchTemplateMemoryMiBPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateMetadataOptionsProperty(block: CfnLaunchTemplateMetadataOptionsPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.MetadataOptionsProperty {
    val builder = CfnLaunchTemplateMetadataOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateMonitoringProperty(block: CfnLaunchTemplateMonitoringPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.MonitoringProperty {
    val builder = CfnLaunchTemplateMonitoringPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateNetworkBandwidthGbpsProperty(block: CfnLaunchTemplateNetworkBandwidthGbpsPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.NetworkBandwidthGbpsProperty {
    val builder = CfnLaunchTemplateNetworkBandwidthGbpsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateNetworkInterfaceCountProperty(block: CfnLaunchTemplateNetworkInterfaceCountPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.NetworkInterfaceCountProperty {
    val builder = CfnLaunchTemplateNetworkInterfaceCountPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateNetworkInterfaceProperty(block: CfnLaunchTemplateNetworkInterfacePropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.NetworkInterfaceProperty {
    val builder = CfnLaunchTemplateNetworkInterfacePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplatePlacementProperty(block: CfnLaunchTemplatePlacementPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.PlacementProperty {
    val builder = CfnLaunchTemplatePlacementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplatePrivateDnsNameOptionsProperty(block: CfnLaunchTemplatePrivateDnsNameOptionsPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.PrivateDnsNameOptionsProperty {
    val builder = CfnLaunchTemplatePrivateDnsNameOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplatePrivateIpAddProperty(block: CfnLaunchTemplatePrivateIpAddPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.PrivateIpAddProperty {
    val builder = CfnLaunchTemplatePrivateIpAddPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLaunchTemplateProps(block: CfnLaunchTemplatePropsDsl.() -> Unit = {}):
      CfnLaunchTemplateProps {
    val builder = CfnLaunchTemplatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateSpotOptionsProperty(block: CfnLaunchTemplateSpotOptionsPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.SpotOptionsProperty {
    val builder = CfnLaunchTemplateSpotOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateTagSpecificationProperty(block: CfnLaunchTemplateTagSpecificationPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.TagSpecificationProperty {
    val builder = CfnLaunchTemplateTagSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateTotalLocalStorageGBProperty(block: CfnLaunchTemplateTotalLocalStorageGBPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.TotalLocalStorageGBProperty {
    val builder = CfnLaunchTemplateTotalLocalStorageGBPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchTemplateVCpuCountProperty(block: CfnLaunchTemplateVCpuCountPropertyDsl.() -> Unit
      = {}): CfnLaunchTemplate.VCpuCountProperty {
    val builder = CfnLaunchTemplateVCpuCountPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLocalGatewayRoute(
    scope: Construct,
    id: String,
    block: CfnLocalGatewayRouteDsl.() -> Unit = {},
  ): CfnLocalGatewayRoute {
    val builder = CfnLocalGatewayRouteDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLocalGatewayRouteProps(block: CfnLocalGatewayRoutePropsDsl.() -> Unit = {}):
      CfnLocalGatewayRouteProps {
    val builder = CfnLocalGatewayRoutePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLocalGatewayRouteTable(
    scope: Construct,
    id: String,
    block: CfnLocalGatewayRouteTableDsl.() -> Unit = {},
  ): CfnLocalGatewayRouteTable {
    val builder = CfnLocalGatewayRouteTableDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLocalGatewayRouteTableProps(block: CfnLocalGatewayRouteTablePropsDsl.() -> Unit = {}):
      CfnLocalGatewayRouteTableProps {
    val builder = CfnLocalGatewayRouteTablePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLocalGatewayRouteTableVPCAssociation(
    scope: Construct,
    id: String,
    block: CfnLocalGatewayRouteTableVPCAssociationDsl.() -> Unit = {},
  ): CfnLocalGatewayRouteTableVPCAssociation {
    val builder = CfnLocalGatewayRouteTableVPCAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLocalGatewayRouteTableVPCAssociationProps(block: CfnLocalGatewayRouteTableVPCAssociationPropsDsl.() -> Unit
      = {}): CfnLocalGatewayRouteTableVPCAssociationProps {
    val builder = CfnLocalGatewayRouteTableVPCAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation(
    scope: Construct,
    id: String,
    block: CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationDsl.() -> Unit = {},
  ): CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation {
    val builder = CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps(block: CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationPropsDsl.() -> Unit
      = {}): CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps {
    val builder = CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNatGateway(
    scope: Construct,
    id: String,
    block: CfnNatGatewayDsl.() -> Unit = {},
  ): CfnNatGateway {
    val builder = CfnNatGatewayDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNatGatewayProps(block: CfnNatGatewayPropsDsl.() -> Unit = {}):
      CfnNatGatewayProps {
    val builder = CfnNatGatewayPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNetworkAcl(
    scope: Construct,
    id: String,
    block: CfnNetworkAclDsl.() -> Unit = {},
  ): CfnNetworkAcl {
    val builder = CfnNetworkAclDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNetworkAclEntry(
    scope: Construct,
    id: String,
    block: CfnNetworkAclEntryDsl.() -> Unit = {},
  ): CfnNetworkAclEntry {
    val builder = CfnNetworkAclEntryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkAclEntryIcmpProperty(block: CfnNetworkAclEntryIcmpPropertyDsl.() -> Unit = {}):
      CfnNetworkAclEntry.IcmpProperty {
    val builder = CfnNetworkAclEntryIcmpPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkAclEntryPortRangeProperty(block: CfnNetworkAclEntryPortRangePropertyDsl.() -> Unit
      = {}): CfnNetworkAclEntry.PortRangeProperty {
    val builder = CfnNetworkAclEntryPortRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNetworkAclEntryProps(block: CfnNetworkAclEntryPropsDsl.() -> Unit = {}):
      CfnNetworkAclEntryProps {
    val builder = CfnNetworkAclEntryPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNetworkAclProps(block: CfnNetworkAclPropsDsl.() -> Unit = {}):
      CfnNetworkAclProps {
    val builder = CfnNetworkAclPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNetworkInsightsAccessScope(
    scope: Construct,
    id: String,
    block: CfnNetworkInsightsAccessScopeDsl.() -> Unit = {},
  ): CfnNetworkInsightsAccessScope {
    val builder = CfnNetworkInsightsAccessScopeDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAccessScopeAccessScopePathRequestProperty(block: CfnNetworkInsightsAccessScopeAccessScopePathRequestPropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty {
    val builder = CfnNetworkInsightsAccessScopeAccessScopePathRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNetworkInsightsAccessScopeAnalysis(
    scope: Construct,
    id: String,
    block: CfnNetworkInsightsAccessScopeAnalysisDsl.() -> Unit = {},
  ): CfnNetworkInsightsAccessScopeAnalysis {
    val builder = CfnNetworkInsightsAccessScopeAnalysisDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAccessScopeAnalysisProps(block: CfnNetworkInsightsAccessScopeAnalysisPropsDsl.() -> Unit
      = {}): CfnNetworkInsightsAccessScopeAnalysisProps {
    val builder = CfnNetworkInsightsAccessScopeAnalysisPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAccessScopePacketHeaderStatementRequestProperty(block: CfnNetworkInsightsAccessScopePacketHeaderStatementRequestPropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty {
    val builder = CfnNetworkInsightsAccessScopePacketHeaderStatementRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAccessScopePathStatementRequestProperty(block: CfnNetworkInsightsAccessScopePathStatementRequestPropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAccessScope.PathStatementRequestProperty {
    val builder = CfnNetworkInsightsAccessScopePathStatementRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAccessScopeProps(block: CfnNetworkInsightsAccessScopePropsDsl.() -> Unit
      = {}): CfnNetworkInsightsAccessScopeProps {
    val builder = CfnNetworkInsightsAccessScopePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAccessScopeResourceStatementRequestProperty(block: CfnNetworkInsightsAccessScopeResourceStatementRequestPropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty {
    val builder = CfnNetworkInsightsAccessScopeResourceStatementRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAccessScopeThroughResourcesStatementRequestProperty(block: CfnNetworkInsightsAccessScopeThroughResourcesStatementRequestPropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty {
    val builder = CfnNetworkInsightsAccessScopeThroughResourcesStatementRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNetworkInsightsAnalysis(
    scope: Construct,
    id: String,
    block: CfnNetworkInsightsAnalysisDsl.() -> Unit = {},
  ): CfnNetworkInsightsAnalysis {
    val builder = CfnNetworkInsightsAnalysisDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAnalysisAdditionalDetailProperty(block: CfnNetworkInsightsAnalysisAdditionalDetailPropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAnalysis.AdditionalDetailProperty {
    val builder = CfnNetworkInsightsAnalysisAdditionalDetailPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAnalysisAlternatePathHintProperty(block: CfnNetworkInsightsAnalysisAlternatePathHintPropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAnalysis.AlternatePathHintProperty {
    val builder = CfnNetworkInsightsAnalysisAlternatePathHintPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAnalysisAnalysisAclRuleProperty(block: CfnNetworkInsightsAnalysisAnalysisAclRulePropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty {
    val builder = CfnNetworkInsightsAnalysisAnalysisAclRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAnalysisAnalysisComponentProperty(block: CfnNetworkInsightsAnalysisAnalysisComponentPropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAnalysis.AnalysisComponentProperty {
    val builder = CfnNetworkInsightsAnalysisAnalysisComponentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAnalysisAnalysisLoadBalancerListenerProperty(block: CfnNetworkInsightsAnalysisAnalysisLoadBalancerListenerPropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty {
    val builder = CfnNetworkInsightsAnalysisAnalysisLoadBalancerListenerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAnalysisAnalysisLoadBalancerTargetProperty(block: CfnNetworkInsightsAnalysisAnalysisLoadBalancerTargetPropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty {
    val builder = CfnNetworkInsightsAnalysisAnalysisLoadBalancerTargetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAnalysisAnalysisPacketHeaderProperty(block: CfnNetworkInsightsAnalysisAnalysisPacketHeaderPropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty {
    val builder = CfnNetworkInsightsAnalysisAnalysisPacketHeaderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAnalysisAnalysisRouteTableRouteProperty(block: CfnNetworkInsightsAnalysisAnalysisRouteTableRoutePropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty {
    val builder = CfnNetworkInsightsAnalysisAnalysisRouteTableRoutePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAnalysisAnalysisSecurityGroupRuleProperty(block: CfnNetworkInsightsAnalysisAnalysisSecurityGroupRulePropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty {
    val builder = CfnNetworkInsightsAnalysisAnalysisSecurityGroupRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAnalysisExplanationProperty(block: CfnNetworkInsightsAnalysisExplanationPropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAnalysis.ExplanationProperty {
    val builder = CfnNetworkInsightsAnalysisExplanationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAnalysisPathComponentProperty(block: CfnNetworkInsightsAnalysisPathComponentPropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAnalysis.PathComponentProperty {
    val builder = CfnNetworkInsightsAnalysisPathComponentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAnalysisPortRangeProperty(block: CfnNetworkInsightsAnalysisPortRangePropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAnalysis.PortRangeProperty {
    val builder = CfnNetworkInsightsAnalysisPortRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAnalysisProps(block: CfnNetworkInsightsAnalysisPropsDsl.() -> Unit =
      {}): CfnNetworkInsightsAnalysisProps {
    val builder = CfnNetworkInsightsAnalysisPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsAnalysisTransitGatewayRouteTableRouteProperty(block: CfnNetworkInsightsAnalysisTransitGatewayRouteTableRoutePropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty {
    val builder = CfnNetworkInsightsAnalysisTransitGatewayRouteTableRoutePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNetworkInsightsPath(
    scope: Construct,
    id: String,
    block: CfnNetworkInsightsPathDsl.() -> Unit = {},
  ): CfnNetworkInsightsPath {
    val builder = CfnNetworkInsightsPathDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsPathFilterPortRangeProperty(block: CfnNetworkInsightsPathFilterPortRangePropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsPath.FilterPortRangeProperty {
    val builder = CfnNetworkInsightsPathFilterPortRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInsightsPathPathFilterProperty(block: CfnNetworkInsightsPathPathFilterPropertyDsl.() -> Unit
      = {}): CfnNetworkInsightsPath.PathFilterProperty {
    val builder = CfnNetworkInsightsPathPathFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNetworkInsightsPathProps(block: CfnNetworkInsightsPathPropsDsl.() -> Unit =
      {}): CfnNetworkInsightsPathProps {
    val builder = CfnNetworkInsightsPathPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNetworkInterface(
    scope: Construct,
    id: String,
    block: CfnNetworkInterfaceDsl.() -> Unit = {},
  ): CfnNetworkInterface {
    val builder = CfnNetworkInterfaceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNetworkInterfaceAttachment(
    scope: Construct,
    id: String,
    block: CfnNetworkInterfaceAttachmentDsl.() -> Unit = {},
  ): CfnNetworkInterfaceAttachment {
    val builder = CfnNetworkInterfaceAttachmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInterfaceAttachmentProps(block: CfnNetworkInterfaceAttachmentPropsDsl.() -> Unit
      = {}): CfnNetworkInterfaceAttachmentProps {
    val builder = CfnNetworkInterfaceAttachmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInterfaceInstanceIpv6AddressProperty(block: CfnNetworkInterfaceInstanceIpv6AddressPropertyDsl.() -> Unit
      = {}): CfnNetworkInterface.InstanceIpv6AddressProperty {
    val builder = CfnNetworkInterfaceInstanceIpv6AddressPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNetworkInterfacePermission(
    scope: Construct,
    id: String,
    block: CfnNetworkInterfacePermissionDsl.() -> Unit = {},
  ): CfnNetworkInterfacePermission {
    val builder = CfnNetworkInterfacePermissionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInterfacePermissionProps(block: CfnNetworkInterfacePermissionPropsDsl.() -> Unit
      = {}): CfnNetworkInterfacePermissionProps {
    val builder = CfnNetworkInterfacePermissionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkInterfacePrivateIpAddressSpecificationProperty(block: CfnNetworkInterfacePrivateIpAddressSpecificationPropertyDsl.() -> Unit
      = {}): CfnNetworkInterface.PrivateIpAddressSpecificationProperty {
    val builder = CfnNetworkInterfacePrivateIpAddressSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNetworkInterfaceProps(block: CfnNetworkInterfacePropsDsl.() -> Unit = {}):
      CfnNetworkInterfaceProps {
    val builder = CfnNetworkInterfacePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNetworkPerformanceMetricSubscription(
    scope: Construct,
    id: String,
    block: CfnNetworkPerformanceMetricSubscriptionDsl.() -> Unit = {},
  ): CfnNetworkPerformanceMetricSubscription {
    val builder = CfnNetworkPerformanceMetricSubscriptionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkPerformanceMetricSubscriptionProps(block: CfnNetworkPerformanceMetricSubscriptionPropsDsl.() -> Unit
      = {}): CfnNetworkPerformanceMetricSubscriptionProps {
    val builder = CfnNetworkPerformanceMetricSubscriptionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPlacementGroup(
    scope: Construct,
    id: String,
    block: CfnPlacementGroupDsl.() -> Unit = {},
  ): CfnPlacementGroup {
    val builder = CfnPlacementGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPlacementGroupProps(block: CfnPlacementGroupPropsDsl.() -> Unit = {}):
      CfnPlacementGroupProps {
    val builder = CfnPlacementGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPrefixList(
    scope: Construct,
    id: String,
    block: CfnPrefixListDsl.() -> Unit = {},
  ): CfnPrefixList {
    val builder = CfnPrefixListDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPrefixListEntryProperty(block: CfnPrefixListEntryPropertyDsl.() -> Unit =
      {}): CfnPrefixList.EntryProperty {
    val builder = CfnPrefixListEntryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPrefixListProps(block: CfnPrefixListPropsDsl.() -> Unit = {}):
      CfnPrefixListProps {
    val builder = CfnPrefixListPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRoute(
    scope: Construct,
    id: String,
    block: CfnRouteDsl.() -> Unit = {},
  ): CfnRoute {
    val builder = CfnRouteDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRouteProps(block: CfnRoutePropsDsl.() -> Unit = {}): CfnRouteProps {
    val builder = CfnRoutePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRouteTable(
    scope: Construct,
    id: String,
    block: CfnRouteTableDsl.() -> Unit = {},
  ): CfnRouteTable {
    val builder = CfnRouteTableDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRouteTableProps(block: CfnRouteTablePropsDsl.() -> Unit = {}):
      CfnRouteTableProps {
    val builder = CfnRouteTablePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSecurityGroup(
    scope: Construct,
    id: String,
    block: CfnSecurityGroupDsl.() -> Unit = {},
  ): CfnSecurityGroup {
    val builder = CfnSecurityGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSecurityGroupEgress(
    scope: Construct,
    id: String,
    block: CfnSecurityGroupEgressDsl.() -> Unit = {},
  ): CfnSecurityGroupEgress {
    val builder = CfnSecurityGroupEgressDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSecurityGroupEgressProperty(block: CfnSecurityGroupEgressPropertyDsl.() -> Unit = {}):
      CfnSecurityGroup.EgressProperty {
    val builder = CfnSecurityGroupEgressPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSecurityGroupEgressProps(block: CfnSecurityGroupEgressPropsDsl.() -> Unit =
      {}): CfnSecurityGroupEgressProps {
    val builder = CfnSecurityGroupEgressPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSecurityGroupIngress(
    scope: Construct,
    id: String,
    block: CfnSecurityGroupIngressDsl.() -> Unit = {},
  ): CfnSecurityGroupIngress {
    val builder = CfnSecurityGroupIngressDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSecurityGroupIngressProperty(block: CfnSecurityGroupIngressPropertyDsl.() -> Unit =
      {}): CfnSecurityGroup.IngressProperty {
    val builder = CfnSecurityGroupIngressPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSecurityGroupIngressProps(block: CfnSecurityGroupIngressPropsDsl.() -> Unit =
      {}): CfnSecurityGroupIngressProps {
    val builder = CfnSecurityGroupIngressPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSecurityGroupProps(block: CfnSecurityGroupPropsDsl.() -> Unit = {}):
      CfnSecurityGroupProps {
    val builder = CfnSecurityGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSpotFleet(
    scope: Construct,
    id: String,
    block: CfnSpotFleetDsl.() -> Unit = {},
  ): CfnSpotFleet {
    val builder = CfnSpotFleetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetAcceleratorCountRequestProperty(block: CfnSpotFleetAcceleratorCountRequestPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.AcceleratorCountRequestProperty {
    val builder = CfnSpotFleetAcceleratorCountRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetAcceleratorTotalMemoryMiBRequestProperty(block: CfnSpotFleetAcceleratorTotalMemoryMiBRequestPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty {
    val builder = CfnSpotFleetAcceleratorTotalMemoryMiBRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetBaselineEbsBandwidthMbpsRequestProperty(block: CfnSpotFleetBaselineEbsBandwidthMbpsRequestPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty {
    val builder = CfnSpotFleetBaselineEbsBandwidthMbpsRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetBlockDeviceMappingProperty(block: CfnSpotFleetBlockDeviceMappingPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.BlockDeviceMappingProperty {
    val builder = CfnSpotFleetBlockDeviceMappingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetClassicLoadBalancerProperty(block: CfnSpotFleetClassicLoadBalancerPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.ClassicLoadBalancerProperty {
    val builder = CfnSpotFleetClassicLoadBalancerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetClassicLoadBalancersConfigProperty(block: CfnSpotFleetClassicLoadBalancersConfigPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.ClassicLoadBalancersConfigProperty {
    val builder = CfnSpotFleetClassicLoadBalancersConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetEbsBlockDeviceProperty(block: CfnSpotFleetEbsBlockDevicePropertyDsl.() -> Unit
      = {}): CfnSpotFleet.EbsBlockDeviceProperty {
    val builder = CfnSpotFleetEbsBlockDevicePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetFleetLaunchTemplateSpecificationProperty(block: CfnSpotFleetFleetLaunchTemplateSpecificationPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.FleetLaunchTemplateSpecificationProperty {
    val builder = CfnSpotFleetFleetLaunchTemplateSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetGroupIdentifierProperty(block: CfnSpotFleetGroupIdentifierPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.GroupIdentifierProperty {
    val builder = CfnSpotFleetGroupIdentifierPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetIamInstanceProfileSpecificationProperty(block: CfnSpotFleetIamInstanceProfileSpecificationPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.IamInstanceProfileSpecificationProperty {
    val builder = CfnSpotFleetIamInstanceProfileSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetInstanceIpv6AddressProperty(block: CfnSpotFleetInstanceIpv6AddressPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.InstanceIpv6AddressProperty {
    val builder = CfnSpotFleetInstanceIpv6AddressPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetInstanceNetworkInterfaceSpecificationProperty(block: CfnSpotFleetInstanceNetworkInterfaceSpecificationPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty {
    val builder = CfnSpotFleetInstanceNetworkInterfaceSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetInstanceRequirementsRequestProperty(block: CfnSpotFleetInstanceRequirementsRequestPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.InstanceRequirementsRequestProperty {
    val builder = CfnSpotFleetInstanceRequirementsRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetLaunchTemplateConfigProperty(block: CfnSpotFleetLaunchTemplateConfigPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.LaunchTemplateConfigProperty {
    val builder = CfnSpotFleetLaunchTemplateConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetLaunchTemplateOverridesProperty(block: CfnSpotFleetLaunchTemplateOverridesPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.LaunchTemplateOverridesProperty {
    val builder = CfnSpotFleetLaunchTemplateOverridesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetLoadBalancersConfigProperty(block: CfnSpotFleetLoadBalancersConfigPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.LoadBalancersConfigProperty {
    val builder = CfnSpotFleetLoadBalancersConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetMemoryGiBPerVCpuRequestProperty(block: CfnSpotFleetMemoryGiBPerVCpuRequestPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.MemoryGiBPerVCpuRequestProperty {
    val builder = CfnSpotFleetMemoryGiBPerVCpuRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetMemoryMiBRequestProperty(block: CfnSpotFleetMemoryMiBRequestPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.MemoryMiBRequestProperty {
    val builder = CfnSpotFleetMemoryMiBRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetNetworkBandwidthGbpsRequestProperty(block: CfnSpotFleetNetworkBandwidthGbpsRequestPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.NetworkBandwidthGbpsRequestProperty {
    val builder = CfnSpotFleetNetworkBandwidthGbpsRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetNetworkInterfaceCountRequestProperty(block: CfnSpotFleetNetworkInterfaceCountRequestPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.NetworkInterfaceCountRequestProperty {
    val builder = CfnSpotFleetNetworkInterfaceCountRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetPrivateIpAddressSpecificationProperty(block: CfnSpotFleetPrivateIpAddressSpecificationPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.PrivateIpAddressSpecificationProperty {
    val builder = CfnSpotFleetPrivateIpAddressSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSpotFleetProps(block: CfnSpotFleetPropsDsl.() -> Unit = {}):
      CfnSpotFleetProps {
    val builder = CfnSpotFleetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetSpotCapacityRebalanceProperty(block: CfnSpotFleetSpotCapacityRebalancePropertyDsl.() -> Unit
      = {}): CfnSpotFleet.SpotCapacityRebalanceProperty {
    val builder = CfnSpotFleetSpotCapacityRebalancePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetSpotFleetLaunchSpecificationProperty(block: CfnSpotFleetSpotFleetLaunchSpecificationPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.SpotFleetLaunchSpecificationProperty {
    val builder = CfnSpotFleetSpotFleetLaunchSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetSpotFleetMonitoringProperty(block: CfnSpotFleetSpotFleetMonitoringPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.SpotFleetMonitoringProperty {
    val builder = CfnSpotFleetSpotFleetMonitoringPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetSpotFleetRequestConfigDataProperty(block: CfnSpotFleetSpotFleetRequestConfigDataPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.SpotFleetRequestConfigDataProperty {
    val builder = CfnSpotFleetSpotFleetRequestConfigDataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetSpotFleetTagSpecificationProperty(block: CfnSpotFleetSpotFleetTagSpecificationPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.SpotFleetTagSpecificationProperty {
    val builder = CfnSpotFleetSpotFleetTagSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetSpotMaintenanceStrategiesProperty(block: CfnSpotFleetSpotMaintenanceStrategiesPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.SpotMaintenanceStrategiesProperty {
    val builder = CfnSpotFleetSpotMaintenanceStrategiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetSpotPlacementProperty(block: CfnSpotFleetSpotPlacementPropertyDsl.() -> Unit =
      {}): CfnSpotFleet.SpotPlacementProperty {
    val builder = CfnSpotFleetSpotPlacementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetTargetGroupProperty(block: CfnSpotFleetTargetGroupPropertyDsl.() -> Unit =
      {}): CfnSpotFleet.TargetGroupProperty {
    val builder = CfnSpotFleetTargetGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetTargetGroupsConfigProperty(block: CfnSpotFleetTargetGroupsConfigPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.TargetGroupsConfigProperty {
    val builder = CfnSpotFleetTargetGroupsConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetTotalLocalStorageGBRequestProperty(block: CfnSpotFleetTotalLocalStorageGBRequestPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.TotalLocalStorageGBRequestProperty {
    val builder = CfnSpotFleetTotalLocalStorageGBRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpotFleetVCpuCountRangeRequestProperty(block: CfnSpotFleetVCpuCountRangeRequestPropertyDsl.() -> Unit
      = {}): CfnSpotFleet.VCpuCountRangeRequestProperty {
    val builder = CfnSpotFleetVCpuCountRangeRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSubnet(
    scope: Construct,
    id: String,
    block: CfnSubnetDsl.() -> Unit = {},
  ): CfnSubnet {
    val builder = CfnSubnetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSubnetCidrBlock(
    scope: Construct,
    id: String,
    block: CfnSubnetCidrBlockDsl.() -> Unit = {},
  ): CfnSubnetCidrBlock {
    val builder = CfnSubnetCidrBlockDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSubnetCidrBlockProps(block: CfnSubnetCidrBlockPropsDsl.() -> Unit = {}):
      CfnSubnetCidrBlockProps {
    val builder = CfnSubnetCidrBlockPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSubnetNetworkAclAssociation(
    scope: Construct,
    id: String,
    block: CfnSubnetNetworkAclAssociationDsl.() -> Unit = {},
  ): CfnSubnetNetworkAclAssociation {
    val builder = CfnSubnetNetworkAclAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSubnetNetworkAclAssociationProps(block: CfnSubnetNetworkAclAssociationPropsDsl.() -> Unit
      = {}): CfnSubnetNetworkAclAssociationProps {
    val builder = CfnSubnetNetworkAclAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSubnetPrivateDnsNameOptionsOnLaunchProperty(block: CfnSubnetPrivateDnsNameOptionsOnLaunchPropertyDsl.() -> Unit
      = {}): CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty {
    val builder = CfnSubnetPrivateDnsNameOptionsOnLaunchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSubnetProps(block: CfnSubnetPropsDsl.() -> Unit = {}): CfnSubnetProps {
    val builder = CfnSubnetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSubnetRouteTableAssociation(
    scope: Construct,
    id: String,
    block: CfnSubnetRouteTableAssociationDsl.() -> Unit = {},
  ): CfnSubnetRouteTableAssociation {
    val builder = CfnSubnetRouteTableAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSubnetRouteTableAssociationProps(block: CfnSubnetRouteTableAssociationPropsDsl.() -> Unit
      = {}): CfnSubnetRouteTableAssociationProps {
    val builder = CfnSubnetRouteTableAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTrafficMirrorFilter(
    scope: Construct,
    id: String,
    block: CfnTrafficMirrorFilterDsl.() -> Unit = {},
  ): CfnTrafficMirrorFilter {
    val builder = CfnTrafficMirrorFilterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTrafficMirrorFilterProps(block: CfnTrafficMirrorFilterPropsDsl.() -> Unit =
      {}): CfnTrafficMirrorFilterProps {
    val builder = CfnTrafficMirrorFilterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTrafficMirrorFilterRule(
    scope: Construct,
    id: String,
    block: CfnTrafficMirrorFilterRuleDsl.() -> Unit = {},
  ): CfnTrafficMirrorFilterRule {
    val builder = CfnTrafficMirrorFilterRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTrafficMirrorFilterRuleProps(block: CfnTrafficMirrorFilterRulePropsDsl.() -> Unit =
      {}): CfnTrafficMirrorFilterRuleProps {
    val builder = CfnTrafficMirrorFilterRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTrafficMirrorFilterRuleTrafficMirrorPortRangeProperty(block: CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl.() -> Unit
      = {}): CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty {
    val builder = CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTrafficMirrorSession(
    scope: Construct,
    id: String,
    block: CfnTrafficMirrorSessionDsl.() -> Unit = {},
  ): CfnTrafficMirrorSession {
    val builder = CfnTrafficMirrorSessionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTrafficMirrorSessionProps(block: CfnTrafficMirrorSessionPropsDsl.() -> Unit =
      {}): CfnTrafficMirrorSessionProps {
    val builder = CfnTrafficMirrorSessionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTrafficMirrorTarget(
    scope: Construct,
    id: String,
    block: CfnTrafficMirrorTargetDsl.() -> Unit = {},
  ): CfnTrafficMirrorTarget {
    val builder = CfnTrafficMirrorTargetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTrafficMirrorTargetProps(block: CfnTrafficMirrorTargetPropsDsl.() -> Unit =
      {}): CfnTrafficMirrorTargetProps {
    val builder = CfnTrafficMirrorTargetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGateway(
    scope: Construct,
    id: String,
    block: CfnTransitGatewayDsl.() -> Unit = {},
  ): CfnTransitGateway {
    val builder = CfnTransitGatewayDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayAttachment(
    scope: Construct,
    id: String,
    block: CfnTransitGatewayAttachmentDsl.() -> Unit = {},
  ): CfnTransitGatewayAttachment {
    val builder = CfnTransitGatewayAttachmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayAttachmentOptionsProperty(block: CfnTransitGatewayAttachmentOptionsPropertyDsl.() -> Unit
      = {}): CfnTransitGatewayAttachment.OptionsProperty {
    val builder = CfnTransitGatewayAttachmentOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayAttachmentProps(block: CfnTransitGatewayAttachmentPropsDsl.() -> Unit =
      {}): CfnTransitGatewayAttachmentProps {
    val builder = CfnTransitGatewayAttachmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayConnect(
    scope: Construct,
    id: String,
    block: CfnTransitGatewayConnectDsl.() -> Unit = {},
  ): CfnTransitGatewayConnect {
    val builder = CfnTransitGatewayConnectDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayConnectProps(block: CfnTransitGatewayConnectPropsDsl.() -> Unit
      = {}): CfnTransitGatewayConnectProps {
    val builder = CfnTransitGatewayConnectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayConnectTransitGatewayConnectOptionsProperty(block: CfnTransitGatewayConnectTransitGatewayConnectOptionsPropertyDsl.() -> Unit
      = {}): CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty {
    val builder = CfnTransitGatewayConnectTransitGatewayConnectOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayMulticastDomain(
    scope: Construct,
    id: String,
    block: CfnTransitGatewayMulticastDomainDsl.() -> Unit = {},
  ): CfnTransitGatewayMulticastDomain {
    val builder = CfnTransitGatewayMulticastDomainDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayMulticastDomainAssociation(
    scope: Construct,
    id: String,
    block: CfnTransitGatewayMulticastDomainAssociationDsl.() -> Unit = {},
  ): CfnTransitGatewayMulticastDomainAssociation {
    val builder = CfnTransitGatewayMulticastDomainAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayMulticastDomainAssociationProps(block: CfnTransitGatewayMulticastDomainAssociationPropsDsl.() -> Unit
      = {}): CfnTransitGatewayMulticastDomainAssociationProps {
    val builder = CfnTransitGatewayMulticastDomainAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayMulticastDomainOptionsProperty(block: CfnTransitGatewayMulticastDomainOptionsPropertyDsl.() -> Unit
      = {}): CfnTransitGatewayMulticastDomain.OptionsProperty {
    val builder = CfnTransitGatewayMulticastDomainOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayMulticastDomainProps(block: CfnTransitGatewayMulticastDomainPropsDsl.() -> Unit
      = {}): CfnTransitGatewayMulticastDomainProps {
    val builder = CfnTransitGatewayMulticastDomainPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayMulticastGroupMember(
    scope: Construct,
    id: String,
    block: CfnTransitGatewayMulticastGroupMemberDsl.() -> Unit = {},
  ): CfnTransitGatewayMulticastGroupMember {
    val builder = CfnTransitGatewayMulticastGroupMemberDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayMulticastGroupMemberProps(block: CfnTransitGatewayMulticastGroupMemberPropsDsl.() -> Unit
      = {}): CfnTransitGatewayMulticastGroupMemberProps {
    val builder = CfnTransitGatewayMulticastGroupMemberPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayMulticastGroupSource(
    scope: Construct,
    id: String,
    block: CfnTransitGatewayMulticastGroupSourceDsl.() -> Unit = {},
  ): CfnTransitGatewayMulticastGroupSource {
    val builder = CfnTransitGatewayMulticastGroupSourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayMulticastGroupSourceProps(block: CfnTransitGatewayMulticastGroupSourcePropsDsl.() -> Unit
      = {}): CfnTransitGatewayMulticastGroupSourceProps {
    val builder = CfnTransitGatewayMulticastGroupSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayPeeringAttachment(
    scope: Construct,
    id: String,
    block: CfnTransitGatewayPeeringAttachmentDsl.() -> Unit = {},
  ): CfnTransitGatewayPeeringAttachment {
    val builder = CfnTransitGatewayPeeringAttachmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayPeeringAttachmentPeeringAttachmentStatusProperty(block: CfnTransitGatewayPeeringAttachmentPeeringAttachmentStatusPropertyDsl.() -> Unit
      = {}): CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty {
    val builder = CfnTransitGatewayPeeringAttachmentPeeringAttachmentStatusPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayPeeringAttachmentProps(block: CfnTransitGatewayPeeringAttachmentPropsDsl.() -> Unit
      = {}): CfnTransitGatewayPeeringAttachmentProps {
    val builder = CfnTransitGatewayPeeringAttachmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayProps(block: CfnTransitGatewayPropsDsl.() -> Unit = {}):
      CfnTransitGatewayProps {
    val builder = CfnTransitGatewayPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayRoute(
    scope: Construct,
    id: String,
    block: CfnTransitGatewayRouteDsl.() -> Unit = {},
  ): CfnTransitGatewayRoute {
    val builder = CfnTransitGatewayRouteDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayRouteProps(block: CfnTransitGatewayRoutePropsDsl.() -> Unit =
      {}): CfnTransitGatewayRouteProps {
    val builder = CfnTransitGatewayRoutePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayRouteTable(
    scope: Construct,
    id: String,
    block: CfnTransitGatewayRouteTableDsl.() -> Unit = {},
  ): CfnTransitGatewayRouteTable {
    val builder = CfnTransitGatewayRouteTableDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayRouteTableAssociation(
    scope: Construct,
    id: String,
    block: CfnTransitGatewayRouteTableAssociationDsl.() -> Unit = {},
  ): CfnTransitGatewayRouteTableAssociation {
    val builder = CfnTransitGatewayRouteTableAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayRouteTableAssociationProps(block: CfnTransitGatewayRouteTableAssociationPropsDsl.() -> Unit
      = {}): CfnTransitGatewayRouteTableAssociationProps {
    val builder = CfnTransitGatewayRouteTableAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayRouteTablePropagation(
    scope: Construct,
    id: String,
    block: CfnTransitGatewayRouteTablePropagationDsl.() -> Unit = {},
  ): CfnTransitGatewayRouteTablePropagation {
    val builder = CfnTransitGatewayRouteTablePropagationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayRouteTablePropagationProps(block: CfnTransitGatewayRouteTablePropagationPropsDsl.() -> Unit
      = {}): CfnTransitGatewayRouteTablePropagationProps {
    val builder = CfnTransitGatewayRouteTablePropagationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayRouteTableProps(block: CfnTransitGatewayRouteTablePropsDsl.() -> Unit =
      {}): CfnTransitGatewayRouteTableProps {
    val builder = CfnTransitGatewayRouteTablePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayVpcAttachment(
    scope: Construct,
    id: String,
    block: CfnTransitGatewayVpcAttachmentDsl.() -> Unit = {},
  ): CfnTransitGatewayVpcAttachment {
    val builder = CfnTransitGatewayVpcAttachmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayVpcAttachmentOptionsProperty(block: CfnTransitGatewayVpcAttachmentOptionsPropertyDsl.() -> Unit
      = {}): CfnTransitGatewayVpcAttachment.OptionsProperty {
    val builder = CfnTransitGatewayVpcAttachmentOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayVpcAttachmentProps(block: CfnTransitGatewayVpcAttachmentPropsDsl.() -> Unit
      = {}): CfnTransitGatewayVpcAttachmentProps {
    val builder = CfnTransitGatewayVpcAttachmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPC(
    scope: Construct,
    id: String,
    block: CfnVPCDsl.() -> Unit = {},
  ): CfnVPC {
    val builder = CfnVPCDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPCCidrBlock(
    scope: Construct,
    id: String,
    block: CfnVPCCidrBlockDsl.() -> Unit = {},
  ): CfnVPCCidrBlock {
    val builder = CfnVPCCidrBlockDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPCCidrBlockProps(block: CfnVPCCidrBlockPropsDsl.() -> Unit = {}):
      CfnVPCCidrBlockProps {
    val builder = CfnVPCCidrBlockPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPCDHCPOptionsAssociation(
    scope: Construct,
    id: String,
    block: CfnVPCDHCPOptionsAssociationDsl.() -> Unit = {},
  ): CfnVPCDHCPOptionsAssociation {
    val builder = CfnVPCDHCPOptionsAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVPCDHCPOptionsAssociationProps(block: CfnVPCDHCPOptionsAssociationPropsDsl.() -> Unit =
      {}): CfnVPCDHCPOptionsAssociationProps {
    val builder = CfnVPCDHCPOptionsAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPCEndpoint(
    scope: Construct,
    id: String,
    block: CfnVPCEndpointDsl.() -> Unit = {},
  ): CfnVPCEndpoint {
    val builder = CfnVPCEndpointDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPCEndpointConnectionNotification(
    scope: Construct,
    id: String,
    block: CfnVPCEndpointConnectionNotificationDsl.() -> Unit = {},
  ): CfnVPCEndpointConnectionNotification {
    val builder = CfnVPCEndpointConnectionNotificationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVPCEndpointConnectionNotificationProps(block: CfnVPCEndpointConnectionNotificationPropsDsl.() -> Unit
      = {}): CfnVPCEndpointConnectionNotificationProps {
    val builder = CfnVPCEndpointConnectionNotificationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPCEndpointProps(block: CfnVPCEndpointPropsDsl.() -> Unit = {}):
      CfnVPCEndpointProps {
    val builder = CfnVPCEndpointPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPCEndpointService(
    scope: Construct,
    id: String,
    block: CfnVPCEndpointServiceDsl.() -> Unit = {},
  ): CfnVPCEndpointService {
    val builder = CfnVPCEndpointServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPCEndpointServicePermissions(
    scope: Construct,
    id: String,
    block: CfnVPCEndpointServicePermissionsDsl.() -> Unit = {},
  ): CfnVPCEndpointServicePermissions {
    val builder = CfnVPCEndpointServicePermissionsDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVPCEndpointServicePermissionsProps(block: CfnVPCEndpointServicePermissionsPropsDsl.() -> Unit
      = {}): CfnVPCEndpointServicePermissionsProps {
    val builder = CfnVPCEndpointServicePermissionsPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPCEndpointServiceProps(block: CfnVPCEndpointServicePropsDsl.() -> Unit =
      {}): CfnVPCEndpointServiceProps {
    val builder = CfnVPCEndpointServicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPCGatewayAttachment(
    scope: Construct,
    id: String,
    block: CfnVPCGatewayAttachmentDsl.() -> Unit = {},
  ): CfnVPCGatewayAttachment {
    val builder = CfnVPCGatewayAttachmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPCGatewayAttachmentProps(block: CfnVPCGatewayAttachmentPropsDsl.() -> Unit =
      {}): CfnVPCGatewayAttachmentProps {
    val builder = CfnVPCGatewayAttachmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPCPeeringConnection(
    scope: Construct,
    id: String,
    block: CfnVPCPeeringConnectionDsl.() -> Unit = {},
  ): CfnVPCPeeringConnection {
    val builder = CfnVPCPeeringConnectionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPCPeeringConnectionProps(block: CfnVPCPeeringConnectionPropsDsl.() -> Unit =
      {}): CfnVPCPeeringConnectionProps {
    val builder = CfnVPCPeeringConnectionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPCProps(block: CfnVPCPropsDsl.() -> Unit = {}): CfnVPCProps {
    val builder = CfnVPCPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPNConnection(
    scope: Construct,
    id: String,
    block: CfnVPNConnectionDsl.() -> Unit = {},
  ): CfnVPNConnection {
    val builder = CfnVPNConnectionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPNConnectionProps(block: CfnVPNConnectionPropsDsl.() -> Unit = {}):
      CfnVPNConnectionProps {
    val builder = CfnVPNConnectionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPNConnectionRoute(
    scope: Construct,
    id: String,
    block: CfnVPNConnectionRouteDsl.() -> Unit = {},
  ): CfnVPNConnectionRoute {
    val builder = CfnVPNConnectionRouteDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPNConnectionRouteProps(block: CfnVPNConnectionRoutePropsDsl.() -> Unit =
      {}): CfnVPNConnectionRouteProps {
    val builder = CfnVPNConnectionRoutePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVPNConnectionVpnTunnelOptionsSpecificationProperty(block: CfnVPNConnectionVpnTunnelOptionsSpecificationPropertyDsl.() -> Unit
      = {}): CfnVPNConnection.VpnTunnelOptionsSpecificationProperty {
    val builder = CfnVPNConnectionVpnTunnelOptionsSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPNGateway(
    scope: Construct,
    id: String,
    block: CfnVPNGatewayDsl.() -> Unit = {},
  ): CfnVPNGateway {
    val builder = CfnVPNGatewayDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPNGatewayProps(block: CfnVPNGatewayPropsDsl.() -> Unit = {}):
      CfnVPNGatewayProps {
    val builder = CfnVPNGatewayPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPNGatewayRoutePropagation(
    scope: Construct,
    id: String,
    block: CfnVPNGatewayRoutePropagationDsl.() -> Unit = {},
  ): CfnVPNGatewayRoutePropagation {
    val builder = CfnVPNGatewayRoutePropagationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVPNGatewayRoutePropagationProps(block: CfnVPNGatewayRoutePropagationPropsDsl.() -> Unit
      = {}): CfnVPNGatewayRoutePropagationProps {
    val builder = CfnVPNGatewayRoutePropagationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVerifiedAccessEndpoint(
    scope: Construct,
    id: String,
    block: CfnVerifiedAccessEndpointDsl.() -> Unit = {},
  ): CfnVerifiedAccessEndpoint {
    val builder = CfnVerifiedAccessEndpointDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVerifiedAccessEndpointLoadBalancerOptionsProperty(block: CfnVerifiedAccessEndpointLoadBalancerOptionsPropertyDsl.() -> Unit
      = {}): CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty {
    val builder = CfnVerifiedAccessEndpointLoadBalancerOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVerifiedAccessEndpointNetworkInterfaceOptionsProperty(block: CfnVerifiedAccessEndpointNetworkInterfaceOptionsPropertyDsl.() -> Unit
      = {}): CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty {
    val builder = CfnVerifiedAccessEndpointNetworkInterfaceOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVerifiedAccessEndpointProps(block: CfnVerifiedAccessEndpointPropsDsl.() -> Unit = {}):
      CfnVerifiedAccessEndpointProps {
    val builder = CfnVerifiedAccessEndpointPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVerifiedAccessGroup(
    scope: Construct,
    id: String,
    block: CfnVerifiedAccessGroupDsl.() -> Unit = {},
  ): CfnVerifiedAccessGroup {
    val builder = CfnVerifiedAccessGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVerifiedAccessGroupProps(block: CfnVerifiedAccessGroupPropsDsl.() -> Unit =
      {}): CfnVerifiedAccessGroupProps {
    val builder = CfnVerifiedAccessGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVerifiedAccessInstance(
    scope: Construct,
    id: String,
    block: CfnVerifiedAccessInstanceDsl.() -> Unit = {},
  ): CfnVerifiedAccessInstance {
    val builder = CfnVerifiedAccessInstanceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVerifiedAccessInstanceCloudWatchLogsProperty(block: CfnVerifiedAccessInstanceCloudWatchLogsPropertyDsl.() -> Unit
      = {}): CfnVerifiedAccessInstance.CloudWatchLogsProperty {
    val builder = CfnVerifiedAccessInstanceCloudWatchLogsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVerifiedAccessInstanceKinesisDataFirehoseProperty(block: CfnVerifiedAccessInstanceKinesisDataFirehosePropertyDsl.() -> Unit
      = {}): CfnVerifiedAccessInstance.KinesisDataFirehoseProperty {
    val builder = CfnVerifiedAccessInstanceKinesisDataFirehosePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVerifiedAccessInstanceProps(block: CfnVerifiedAccessInstancePropsDsl.() -> Unit = {}):
      CfnVerifiedAccessInstanceProps {
    val builder = CfnVerifiedAccessInstancePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVerifiedAccessInstanceS3Property(block: CfnVerifiedAccessInstanceS3PropertyDsl.() -> Unit
      = {}): CfnVerifiedAccessInstance.S3Property {
    val builder = CfnVerifiedAccessInstanceS3PropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVerifiedAccessInstanceVerifiedAccessLogsProperty(block: CfnVerifiedAccessInstanceVerifiedAccessLogsPropertyDsl.() -> Unit
      = {}): CfnVerifiedAccessInstance.VerifiedAccessLogsProperty {
    val builder = CfnVerifiedAccessInstanceVerifiedAccessLogsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVerifiedAccessInstanceVerifiedAccessTrustProviderProperty(block: CfnVerifiedAccessInstanceVerifiedAccessTrustProviderPropertyDsl.() -> Unit
      = {}): CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty {
    val builder = CfnVerifiedAccessInstanceVerifiedAccessTrustProviderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVerifiedAccessTrustProvider(
    scope: Construct,
    id: String,
    block: CfnVerifiedAccessTrustProviderDsl.() -> Unit = {},
  ): CfnVerifiedAccessTrustProvider {
    val builder = CfnVerifiedAccessTrustProviderDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVerifiedAccessTrustProviderDeviceOptionsProperty(block: CfnVerifiedAccessTrustProviderDeviceOptionsPropertyDsl.() -> Unit
      = {}): CfnVerifiedAccessTrustProvider.DeviceOptionsProperty {
    val builder = CfnVerifiedAccessTrustProviderDeviceOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVerifiedAccessTrustProviderOidcOptionsProperty(block: CfnVerifiedAccessTrustProviderOidcOptionsPropertyDsl.() -> Unit
      = {}): CfnVerifiedAccessTrustProvider.OidcOptionsProperty {
    val builder = CfnVerifiedAccessTrustProviderOidcOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVerifiedAccessTrustProviderProps(block: CfnVerifiedAccessTrustProviderPropsDsl.() -> Unit
      = {}): CfnVerifiedAccessTrustProviderProps {
    val builder = CfnVerifiedAccessTrustProviderPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVolume(
    scope: Construct,
    id: String,
    block: CfnVolumeDsl.() -> Unit = {},
  ): CfnVolume {
    val builder = CfnVolumeDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVolumeAttachment(
    scope: Construct,
    id: String,
    block: CfnVolumeAttachmentDsl.() -> Unit = {},
  ): CfnVolumeAttachment {
    val builder = CfnVolumeAttachmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVolumeAttachmentProps(block: CfnVolumeAttachmentPropsDsl.() -> Unit = {}):
      CfnVolumeAttachmentProps {
    val builder = CfnVolumeAttachmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVolumeProps(block: CfnVolumePropsDsl.() -> Unit = {}): CfnVolumeProps {
    val builder = CfnVolumePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun clientVpnAuthorizationRule(
    scope: Construct,
    id: String,
    block: ClientVpnAuthorizationRuleDsl.() -> Unit = {},
  ): ClientVpnAuthorizationRule {
    val builder = ClientVpnAuthorizationRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun clientVpnAuthorizationRuleOptions(block: ClientVpnAuthorizationRuleOptionsDsl.() -> Unit =
      {}): ClientVpnAuthorizationRuleOptions {
    val builder = ClientVpnAuthorizationRuleOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun clientVpnAuthorizationRuleProps(block: ClientVpnAuthorizationRulePropsDsl.() -> Unit =
      {}): ClientVpnAuthorizationRuleProps {
    val builder = ClientVpnAuthorizationRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun clientVpnEndpoint(
    scope: Construct,
    id: String,
    block: ClientVpnEndpointDsl.() -> Unit = {},
  ): ClientVpnEndpoint {
    val builder = ClientVpnEndpointDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun clientVpnEndpointAttributes(block: ClientVpnEndpointAttributesDsl.() -> Unit =
      {}): ClientVpnEndpointAttributes {
    val builder = ClientVpnEndpointAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun clientVpnEndpointOptions(block: ClientVpnEndpointOptionsDsl.() -> Unit = {}):
      ClientVpnEndpointOptions {
    val builder = ClientVpnEndpointOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun clientVpnEndpointProps(block: ClientVpnEndpointPropsDsl.() -> Unit = {}):
      ClientVpnEndpointProps {
    val builder = ClientVpnEndpointPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun clientVpnRoute(
    scope: Construct,
    id: String,
    block: ClientVpnRouteDsl.() -> Unit = {},
  ): ClientVpnRoute {
    val builder = ClientVpnRouteDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun clientVpnRouteOptions(block: ClientVpnRouteOptionsDsl.() -> Unit = {}):
      ClientVpnRouteOptions {
    val builder = ClientVpnRouteOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun clientVpnRouteProps(block: ClientVpnRoutePropsDsl.() -> Unit = {}):
      ClientVpnRouteProps {
    val builder = ClientVpnRoutePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun commonNetworkAclEntryOptions(block: CommonNetworkAclEntryOptionsDsl.() -> Unit =
      {}): CommonNetworkAclEntryOptions {
    val builder = CommonNetworkAclEntryOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun configSetProps(block: ConfigSetPropsDsl.() -> Unit = {}): ConfigSetProps {
    val builder = ConfigSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun configureNatOptions(block: ConfigureNatOptionsDsl.() -> Unit = {}):
      ConfigureNatOptions {
    val builder = ConfigureNatOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun connectionRule(block: ConnectionRuleDsl.() -> Unit = {}): ConnectionRule {
    val builder = ConnectionRuleDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun connections(block: ConnectionsDsl.() -> Unit = {}): Connections {
    val builder = ConnectionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun connectionsProps(block: ConnectionsPropsDsl.() -> Unit = {}): ConnectionsProps {
    val builder = ConnectionsPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun destinationOptions(block: DestinationOptionsDsl.() -> Unit = {}):
      DestinationOptions {
    val builder = DestinationOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun ebsDeviceOptions(block: EbsDeviceOptionsDsl.() -> Unit = {}): EbsDeviceOptions {
    val builder = EbsDeviceOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun ebsDeviceOptionsBase(block: EbsDeviceOptionsBaseDsl.() -> Unit = {}):
      EbsDeviceOptionsBase {
    val builder = EbsDeviceOptionsBaseDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun ebsDeviceProps(block: EbsDevicePropsDsl.() -> Unit = {}): EbsDeviceProps {
    val builder = EbsDevicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun ebsDeviceSnapshotOptions(block: EbsDeviceSnapshotOptionsDsl.() -> Unit = {}):
      EbsDeviceSnapshotOptions {
    val builder = EbsDeviceSnapshotOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun enableVpnGatewayOptions(block: EnableVpnGatewayOptionsDsl.() -> Unit = {}):
      EnableVpnGatewayOptions {
    val builder = EnableVpnGatewayOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun executeFileOptions(block: ExecuteFileOptionsDsl.() -> Unit = {}):
      ExecuteFileOptions {
    val builder = ExecuteFileOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun flowLog(
    scope: Construct,
    id: String,
    block: FlowLogDsl.() -> Unit = {},
  ): FlowLog {
    val builder = FlowLogDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun flowLogDestinationConfig(block: FlowLogDestinationConfigDsl.() -> Unit = {}):
      FlowLogDestinationConfig {
    val builder = FlowLogDestinationConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun flowLogOptions(block: FlowLogOptionsDsl.() -> Unit = {}): FlowLogOptions {
    val builder = FlowLogOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun flowLogProps(block: FlowLogPropsDsl.() -> Unit = {}): FlowLogProps {
    val builder = FlowLogPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun gatewayConfig(block: GatewayConfigDsl.() -> Unit = {}): GatewayConfig {
    val builder = GatewayConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun gatewayVpcEndpoint(
    scope: Construct,
    id: String,
    block: GatewayVpcEndpointDsl.() -> Unit = {},
  ): GatewayVpcEndpoint {
    val builder = GatewayVpcEndpointDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun gatewayVpcEndpointOptions(block: GatewayVpcEndpointOptionsDsl.() -> Unit = {}):
      GatewayVpcEndpointOptions {
    val builder = GatewayVpcEndpointOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun gatewayVpcEndpointProps(block: GatewayVpcEndpointPropsDsl.() -> Unit = {}):
      GatewayVpcEndpointProps {
    val builder = GatewayVpcEndpointPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun genericLinuxImage(amiMap: Map<String, String>,
      block: GenericLinuxImageDsl.() -> Unit = {}): GenericLinuxImage {
    val builder = GenericLinuxImageDsl(amiMap)
    builder.apply(block)
    return builder.build()
  }

  public inline fun genericLinuxImageProps(block: GenericLinuxImagePropsDsl.() -> Unit = {}):
      GenericLinuxImageProps {
    val builder = GenericLinuxImagePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun genericWindowsImage(amiMap: Map<String, String>,
      block: GenericWindowsImageDsl.() -> Unit = {}): GenericWindowsImage {
    val builder = GenericWindowsImageDsl(amiMap)
    builder.apply(block)
    return builder.build()
  }

  public inline fun genericWindowsImageProps(block: GenericWindowsImagePropsDsl.() -> Unit = {}):
      GenericWindowsImageProps {
    val builder = GenericWindowsImagePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun initCommandOptions(block: InitCommandOptionsDsl.() -> Unit = {}):
      InitCommandOptions {
    val builder = InitCommandOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun initFileAssetOptions(block: InitFileAssetOptionsDsl.() -> Unit = {}):
      InitFileAssetOptions {
    val builder = InitFileAssetOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun initFileOptions(block: InitFileOptionsDsl.() -> Unit = {}): InitFileOptions {
    val builder = InitFileOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun initServiceOptions(block: InitServiceOptionsDsl.() -> Unit = {}):
      InitServiceOptions {
    val builder = InitServiceOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun initSourceAssetOptions(block: InitSourceAssetOptionsDsl.() -> Unit = {}):
      InitSourceAssetOptions {
    val builder = InitSourceAssetOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun initSourceOptions(block: InitSourceOptionsDsl.() -> Unit = {}):
      InitSourceOptions {
    val builder = InitSourceOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun initUserOptions(block: InitUserOptionsDsl.() -> Unit = {}): InitUserOptions {
    val builder = InitUserOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun instance(
    scope: Construct,
    id: String,
    block: InstanceDsl.() -> Unit = {},
  ): Instance {
    val builder = InstanceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun instanceProps(block: InstancePropsDsl.() -> Unit = {}): InstanceProps {
    val builder = InstancePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun instanceRequireImdsv2Aspect(block: InstanceRequireImdsv2AspectDsl.() -> Unit =
      {}): InstanceRequireImdsv2Aspect {
    val builder = InstanceRequireImdsv2AspectDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun instanceRequireImdsv2AspectProps(block: InstanceRequireImdsv2AspectPropsDsl.() -> Unit =
      {}): InstanceRequireImdsv2AspectProps {
    val builder = InstanceRequireImdsv2AspectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun interfaceVpcEndpoint(
    scope: Construct,
    id: String,
    block: InterfaceVpcEndpointDsl.() -> Unit = {},
  ): InterfaceVpcEndpoint {
    val builder = InterfaceVpcEndpointDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun interfaceVpcEndpointAttributes(block: InterfaceVpcEndpointAttributesDsl.() -> Unit = {}):
      InterfaceVpcEndpointAttributes {
    val builder = InterfaceVpcEndpointAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun interfaceVpcEndpointOptions(block: InterfaceVpcEndpointOptionsDsl.() -> Unit =
      {}): InterfaceVpcEndpointOptions {
    val builder = InterfaceVpcEndpointOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun interfaceVpcEndpointProps(block: InterfaceVpcEndpointPropsDsl.() -> Unit = {}):
      InterfaceVpcEndpointProps {
    val builder = InterfaceVpcEndpointPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun launchTemplate(
    scope: Construct,
    id: String,
    block: LaunchTemplateDsl.() -> Unit = {},
  ): LaunchTemplate {
    val builder = LaunchTemplateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun launchTemplateAttributes(block: LaunchTemplateAttributesDsl.() -> Unit = {}):
      LaunchTemplateAttributes {
    val builder = LaunchTemplateAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun launchTemplateProps(block: LaunchTemplatePropsDsl.() -> Unit = {}):
      LaunchTemplateProps {
    val builder = LaunchTemplatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun launchTemplateRequireImdsv2Aspect(block: LaunchTemplateRequireImdsv2AspectDsl.() -> Unit =
      {}): LaunchTemplateRequireImdsv2Aspect {
    val builder = LaunchTemplateRequireImdsv2AspectDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun launchTemplateRequireImdsv2AspectProps(block: LaunchTemplateRequireImdsv2AspectPropsDsl.() -> Unit
      = {}): LaunchTemplateRequireImdsv2AspectProps {
    val builder = LaunchTemplateRequireImdsv2AspectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun launchTemplateSpotOptions(block: LaunchTemplateSpotOptionsDsl.() -> Unit = {}):
      LaunchTemplateSpotOptions {
    val builder = LaunchTemplateSpotOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun linuxUserDataOptions(block: LinuxUserDataOptionsDsl.() -> Unit = {}):
      LinuxUserDataOptions {
    val builder = LinuxUserDataOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun locationPackageOptions(block: LocationPackageOptionsDsl.() -> Unit = {}):
      LocationPackageOptions {
    val builder = LocationPackageOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lookupMachineImage(block: LookupMachineImageDsl.() -> Unit = {}):
      LookupMachineImage {
    val builder = LookupMachineImageDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lookupMachineImageProps(block: LookupMachineImagePropsDsl.() -> Unit = {}):
      LookupMachineImageProps {
    val builder = LookupMachineImagePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun machineImageConfig(block: MachineImageConfigDsl.() -> Unit = {}):
      MachineImageConfig {
    val builder = MachineImageConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun multipartBodyOptions(block: MultipartBodyOptionsDsl.() -> Unit = {}):
      MultipartBodyOptions {
    val builder = MultipartBodyOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun multipartUserData(block: MultipartUserDataDsl.() -> Unit = {}):
      MultipartUserData {
    val builder = MultipartUserDataDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun multipartUserDataOptions(block: MultipartUserDataOptionsDsl.() -> Unit = {}):
      MultipartUserDataOptions {
    val builder = MultipartUserDataOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun namedPackageOptions(block: NamedPackageOptionsDsl.() -> Unit = {}):
      NamedPackageOptions {
    val builder = NamedPackageOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun natGatewayProps(block: NatGatewayPropsDsl.() -> Unit = {}): NatGatewayProps {
    val builder = NatGatewayPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun natInstanceProps(block: NatInstancePropsDsl.() -> Unit = {}): NatInstanceProps {
    val builder = NatInstancePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun natInstanceProvider(block: NatInstanceProviderDsl.() -> Unit = {}):
      NatInstanceProvider {
    val builder = NatInstanceProviderDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkAcl(
    scope: Construct,
    id: String,
    block: NetworkAclDsl.() -> Unit = {},
  ): NetworkAcl {
    val builder = NetworkAclDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkAclEntry(
    scope: Construct,
    id: String,
    block: NetworkAclEntryDsl.() -> Unit = {},
  ): NetworkAclEntry {
    val builder = NetworkAclEntryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkAclEntryProps(block: NetworkAclEntryPropsDsl.() -> Unit = {}):
      NetworkAclEntryProps {
    val builder = NetworkAclEntryPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkAclProps(block: NetworkAclPropsDsl.() -> Unit = {}): NetworkAclProps {
    val builder = NetworkAclPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun placementGroup(
    scope: Construct,
    id: String,
    block: PlacementGroupDsl.() -> Unit = {},
  ): PlacementGroup {
    val builder = PlacementGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun placementGroupProps(block: PlacementGroupPropsDsl.() -> Unit = {}):
      PlacementGroupProps {
    val builder = PlacementGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun port(block: PortDsl.() -> Unit = {}): Port {
    val builder = PortDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun portProps(block: PortPropsDsl.() -> Unit = {}): PortProps {
    val builder = PortPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun prefixList(
    scope: Construct,
    id: String,
    block: PrefixListDsl.() -> Unit = {},
  ): PrefixList {
    val builder = PrefixListDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun prefixListOptions(block: PrefixListOptionsDsl.() -> Unit = {}):
      PrefixListOptions {
    val builder = PrefixListOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun prefixListProps(block: PrefixListPropsDsl.() -> Unit = {}): PrefixListProps {
    val builder = PrefixListPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun privateSubnet(
    scope: Construct,
    id: String,
    block: PrivateSubnetDsl.() -> Unit = {},
  ): PrivateSubnet {
    val builder = PrivateSubnetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun privateSubnetAttributes(block: PrivateSubnetAttributesDsl.() -> Unit = {}):
      PrivateSubnetAttributes {
    val builder = PrivateSubnetAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun privateSubnetProps(block: PrivateSubnetPropsDsl.() -> Unit = {}):
      PrivateSubnetProps {
    val builder = PrivateSubnetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun publicSubnet(
    scope: Construct,
    id: String,
    block: PublicSubnetDsl.() -> Unit = {},
  ): PublicSubnet {
    val builder = PublicSubnetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun publicSubnetAttributes(block: PublicSubnetAttributesDsl.() -> Unit = {}):
      PublicSubnetAttributes {
    val builder = PublicSubnetAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun publicSubnetProps(block: PublicSubnetPropsDsl.() -> Unit = {}):
      PublicSubnetProps {
    val builder = PublicSubnetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun requestedSubnet(block: RequestedSubnetDsl.() -> Unit = {}): RequestedSubnet {
    val builder = RequestedSubnetDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun resolveSsmParameterAtLaunchImage(parameterName: String,
      block: ResolveSsmParameterAtLaunchImageDsl.() -> Unit = {}):
      ResolveSsmParameterAtLaunchImage {
    val builder = ResolveSsmParameterAtLaunchImageDsl(parameterName)
    builder.apply(block)
    return builder.build()
  }

  public inline fun ruleScope(block: RuleScopeDsl.() -> Unit = {}): RuleScope {
    val builder = RuleScopeDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun s3DestinationOptions(block: S3DestinationOptionsDsl.() -> Unit = {}):
      S3DestinationOptions {
    val builder = S3DestinationOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun s3DownloadOptions(block: S3DownloadOptionsDsl.() -> Unit = {}):
      S3DownloadOptions {
    val builder = S3DownloadOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun securityGroup(
    scope: Construct,
    id: String,
    block: SecurityGroupDsl.() -> Unit = {},
  ): SecurityGroup {
    val builder = SecurityGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun securityGroupImportOptions(block: SecurityGroupImportOptionsDsl.() -> Unit =
      {}): SecurityGroupImportOptions {
    val builder = SecurityGroupImportOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun securityGroupProps(block: SecurityGroupPropsDsl.() -> Unit = {}):
      SecurityGroupProps {
    val builder = SecurityGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun selectedSubnets(block: SelectedSubnetsDsl.() -> Unit = {}): SelectedSubnets {
    val builder = SelectedSubnetsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun ssmParameterImageOptions(block: SsmParameterImageOptionsDsl.() -> Unit = {}):
      SsmParameterImageOptions {
    val builder = SsmParameterImageOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun subnet(
    scope: Construct,
    id: String,
    block: SubnetDsl.() -> Unit = {},
  ): Subnet {
    val builder = SubnetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun subnetAttributes(block: SubnetAttributesDsl.() -> Unit = {}): SubnetAttributes {
    val builder = SubnetAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun subnetConfiguration(block: SubnetConfigurationDsl.() -> Unit = {}):
      SubnetConfiguration {
    val builder = SubnetConfigurationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun subnetIpamOptions(block: SubnetIpamOptionsDsl.() -> Unit = {}):
      SubnetIpamOptions {
    val builder = SubnetIpamOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun subnetNetworkAclAssociation(
    scope: Construct,
    id: String,
    block: SubnetNetworkAclAssociationDsl.() -> Unit = {},
  ): SubnetNetworkAclAssociation {
    val builder = SubnetNetworkAclAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun subnetNetworkAclAssociationProps(block: SubnetNetworkAclAssociationPropsDsl.() -> Unit =
      {}): SubnetNetworkAclAssociationProps {
    val builder = SubnetNetworkAclAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun subnetProps(block: SubnetPropsDsl.() -> Unit = {}): SubnetProps {
    val builder = SubnetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun subnetSelection(block: SubnetSelectionDsl.() -> Unit = {}): SubnetSelection {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun systemdConfigFileOptions(block: SystemdConfigFileOptionsDsl.() -> Unit = {}):
      SystemdConfigFileOptions {
    val builder = SystemdConfigFileOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun volume(
    scope: Construct,
    id: String,
    block: VolumeDsl.() -> Unit = {},
  ): Volume {
    val builder = VolumeDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun volumeAttributes(block: VolumeAttributesDsl.() -> Unit = {}): VolumeAttributes {
    val builder = VolumeAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun volumeProps(block: VolumePropsDsl.() -> Unit = {}): VolumeProps {
    val builder = VolumePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpc(
    scope: Construct,
    id: String,
    block: VpcDsl.() -> Unit = {},
  ): Vpc {
    val builder = VpcDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpcAttributes(block: VpcAttributesDsl.() -> Unit = {}): VpcAttributes {
    val builder = VpcAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpcEndpointService(
    scope: Construct,
    id: String,
    block: VpcEndpointServiceDsl.() -> Unit = {},
  ): VpcEndpointService {
    val builder = VpcEndpointServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpcEndpointServiceProps(block: VpcEndpointServicePropsDsl.() -> Unit = {}):
      VpcEndpointServiceProps {
    val builder = VpcEndpointServicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpcIpamOptions(block: VpcIpamOptionsDsl.() -> Unit = {}): VpcIpamOptions {
    val builder = VpcIpamOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpcLookupOptions(block: VpcLookupOptionsDsl.() -> Unit = {}): VpcLookupOptions {
    val builder = VpcLookupOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpcProps(block: VpcPropsDsl.() -> Unit = {}): VpcProps {
    val builder = VpcPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpnConnection(
    scope: Construct,
    id: String,
    block: VpnConnectionDsl.() -> Unit = {},
  ): VpnConnection {
    val builder = VpnConnectionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpnConnectionAttributes(block: VpnConnectionAttributesDsl.() -> Unit = {}):
      VpnConnectionAttributes {
    val builder = VpnConnectionAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpnConnectionOptions(block: VpnConnectionOptionsDsl.() -> Unit = {}):
      VpnConnectionOptions {
    val builder = VpnConnectionOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpnConnectionProps(block: VpnConnectionPropsDsl.() -> Unit = {}):
      VpnConnectionProps {
    val builder = VpnConnectionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpnGateway(
    scope: Construct,
    id: String,
    block: VpnGatewayDsl.() -> Unit = {},
  ): VpnGateway {
    val builder = VpnGatewayDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpnGatewayProps(block: VpnGatewayPropsDsl.() -> Unit = {}): VpnGatewayProps {
    val builder = VpnGatewayPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpnTunnelOption(block: VpnTunnelOptionDsl.() -> Unit = {}): VpnTunnelOption {
    val builder = VpnTunnelOptionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun windowsImage(version: WindowsVersion, block: WindowsImageDsl.() -> Unit = {}):
      WindowsImage {
    val builder = WindowsImageDsl(version)
    builder.apply(block)
    return builder.build()
  }

  public inline fun windowsImageProps(block: WindowsImagePropsDsl.() -> Unit = {}):
      WindowsImageProps {
    val builder = WindowsImagePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun windowsUserDataOptions(block: WindowsUserDataOptionsDsl.() -> Unit = {}):
      WindowsUserDataOptions {
    val builder = WindowsUserDataOptionsDsl()
    builder.apply(block)
    return builder.build()
  }
}
