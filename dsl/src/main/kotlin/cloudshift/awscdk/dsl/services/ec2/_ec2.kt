@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

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
    /**
     * Acl Configuration for CIDR.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AclCidrConfig aclCidrConfig = AclCidrConfig.builder()
     * .cidrBlock("cidrBlock")
     * .ipv6CidrBlock("ipv6CidrBlock")
     * .build();
     * ```
     */
    public inline fun aclCidrConfig(block: AclCidrConfigDsl.() -> Unit = {}): AclCidrConfig {
        val builder = AclCidrConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to create Icmp.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AclIcmp aclIcmp = AclIcmp.builder()
     * .code(123)
     * .type(123)
     * .build();
     * ```
     */
    public inline fun aclIcmp(block: AclIcmpDsl.() -> Unit = {}): AclIcmp {
        val builder = AclIcmpDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to create PortRange.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AclPortRange aclPortRange = AclPortRange.builder()
     * .from(123)
     * .to(123)
     * .build();
     * ```
     */
    public inline fun aclPortRange(block: AclPortRangeDsl.() -> Unit = {}): AclPortRange {
        val builder = AclPortRangeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Acl Configuration for traffic.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AclTrafficConfig aclTrafficConfig = AclTrafficConfig.builder()
     * .protocol(123)
     * // the properties below are optional
     * .icmp(AclIcmp.builder()
     * .code(123)
     * .type(123)
     * .build())
     * .portRange(AclPortRange.builder()
     * .from(123)
     * .to(123)
     * .build())
     * .build();
     * ```
     */
    public inline fun aclTrafficConfig(
        block: AclTrafficConfigDsl.() -> Unit = {}
    ): AclTrafficConfig {
        val builder = AclTrafficConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for adding a new route to a subnet.
     *
     * Example:
     * ```
     * Vpc vpc = Vpc.Builder.create(this, "VPC")
     * .subnetConfiguration(List.of(SubnetConfiguration.builder()
     * .subnetType(SubnetType.PUBLIC)
     * .name("Public")
     * .build(), SubnetConfiguration.builder()
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .name("Isolated")
     * .build()))
     * .build();
     * ((Subnet)vpc.isolatedSubnets[0]).addRoute("StaticRoute", AddRouteOptions.builder()
     * .routerId(vpc.getInternetGatewayId())
     * .routerType(RouterType.GATEWAY)
     * .destinationCidrBlock("8.8.8.8/32")
     * .build());
     * ```
     */
    public inline fun addRouteOptions(block: AddRouteOptionsDsl.() -> Unit = {}): AddRouteOptions {
        val builder = AddRouteOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Request for subnets Cidr to be allocated for a Vpc.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AllocateCidrRequest allocateCidrRequest = AllocateCidrRequest.builder()
     * .requestedSubnets(List.of(RequestedSubnet.builder()
     * .availabilityZone("availabilityZone")
     * .configuration(SubnetConfiguration.builder()
     * .name("name")
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * // the properties below are optional
     * .cidrMask(123)
     * .mapPublicIpOnLaunch(false)
     * .reserved(false)
     * .build())
     * .subnetConstructId("subnetConstructId")
     * .build()))
     * .vpcCidr("vpcCidr")
     * .build();
     * ```
     */
    public inline fun allocateCidrRequest(
        block: AllocateCidrRequestDsl.() -> Unit = {}
    ): AllocateCidrRequest {
        val builder = AllocateCidrRequestDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Cidr Allocated Subnet.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AllocatedSubnet allocatedSubnet = AllocatedSubnet.builder()
     * .cidr("cidr")
     * .build();
     * ```
     */
    public inline fun allocatedSubnet(block: AllocatedSubnetDsl.() -> Unit = {}): AllocatedSubnet {
        val builder = AllocatedSubnetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A SSM Parameter that contains the AMI ID for Amazon Linux 2023.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AmazonLinux2022Kernel amazonLinux2022Kernel;
     * UserData userData;
     * AmazonLinux2022ImageSsmParameter amazonLinux2022ImageSsmParameter =
     * AmazonLinux2022ImageSsmParameter.Builder.create()
     * .cachedInContext(false)
     * .cpuType(AmazonLinuxCpuType.ARM_64)
     * .edition(AmazonLinuxEdition.STANDARD)
     * .kernel(amazonLinux2022Kernel)
     * .userData(userData)
     * .build();
     * ```
     */
    public inline fun amazonLinux2022ImageSsmParameter(
        block: AmazonLinux2022ImageSsmParameterDsl.() -> Unit = {}
    ): AmazonLinux2022ImageSsmParameter {
        val builder = AmazonLinux2022ImageSsmParameterDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties specific to al2022 images.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AmazonLinux2022Kernel amazonLinux2022Kernel;
     * UserData userData;
     * AmazonLinux2022ImageSsmParameterProps amazonLinux2022ImageSsmParameterProps =
     * AmazonLinux2022ImageSsmParameterProps.builder()
     * .cachedInContext(false)
     * .cpuType(AmazonLinuxCpuType.ARM_64)
     * .edition(AmazonLinuxEdition.STANDARD)
     * .kernel(amazonLinux2022Kernel)
     * .userData(userData)
     * .build();
     * ```
     */
    public inline fun amazonLinux2022ImageSsmParameterProps(
        block: AmazonLinux2022ImageSsmParameterPropsDsl.() -> Unit = {}
    ): AmazonLinux2022ImageSsmParameterProps {
        val builder = AmazonLinux2022ImageSsmParameterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A SSM Parameter that contains the AMI ID for Amazon Linux 2023.
     *
     * Example:
     * ```
     * Vpc vpc;
     * Instance.Builder.create(this, "LatestAl2023")
     * .vpc(vpc)
     * .instanceType(InstanceType.of(InstanceClass.C7G, InstanceSize.LARGE))
     * .machineImage(MachineImage.latestAmazonLinux2023(AmazonLinux2023ImageSsmParameterProps.builder()
     * .cachedInContext(true)
     * .build()))
     * .build();
     * // or
     * // or
     * Instance.Builder.create(this, "LatestAl2023")
     * .vpc(vpc)
     * .instanceType(InstanceType.of(InstanceClass.C7G, InstanceSize.LARGE))
     * // context cache is turned on by default
     * .machineImage(new AmazonLinux2023ImageSsmParameter())
     * .build();
     * ```
     */
    public inline fun amazonLinux2023ImageSsmParameter(
        block: AmazonLinux2023ImageSsmParameterDsl.() -> Unit = {}
    ): AmazonLinux2023ImageSsmParameter {
        val builder = AmazonLinux2023ImageSsmParameterDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties specific to al2023 images.
     *
     * Example:
     * ```
     * Vpc vpc;
     * Instance.Builder.create(this, "LatestAl2023")
     * .vpc(vpc)
     * .instanceType(InstanceType.of(InstanceClass.C7G, InstanceSize.LARGE))
     * .machineImage(MachineImage.latestAmazonLinux2023(AmazonLinux2023ImageSsmParameterProps.builder()
     * .cachedInContext(true)
     * .build()))
     * .build();
     * // or
     * // or
     * Instance.Builder.create(this, "LatestAl2023")
     * .vpc(vpc)
     * .instanceType(InstanceType.of(InstanceClass.C7G, InstanceSize.LARGE))
     * // context cache is turned on by default
     * .machineImage(new AmazonLinux2023ImageSsmParameter())
     * .build();
     * ```
     */
    public inline fun amazonLinux2023ImageSsmParameterProps(
        block: AmazonLinux2023ImageSsmParameterPropsDsl.() -> Unit = {}
    ): AmazonLinux2023ImageSsmParameterProps {
        val builder = AmazonLinux2023ImageSsmParameterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A SSM Parameter that contains the AMI ID for Amazon Linux 2.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AmazonLinux2Kernel amazonLinux2Kernel;
     * UserData userData;
     * AmazonLinux2ImageSsmParameter amazonLinux2ImageSsmParameter =
     * AmazonLinux2ImageSsmParameter.Builder.create()
     * .cachedInContext(false)
     * .cpuType(AmazonLinuxCpuType.ARM_64)
     * .edition(AmazonLinuxEdition.STANDARD)
     * .kernel(amazonLinux2Kernel)
     * .storage(AmazonLinuxStorage.EBS)
     * .userData(userData)
     * .virtualization(AmazonLinuxVirt.HVM)
     * .build();
     * ```
     */
    public inline fun amazonLinux2ImageSsmParameter(
        block: AmazonLinux2ImageSsmParameterDsl.() -> Unit = {}
    ): AmazonLinux2ImageSsmParameter {
        val builder = AmazonLinux2ImageSsmParameterDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties specific to amzn2 images.
     *
     * Example:
     * ```
     * Vpc vpc;
     * InstanceType instanceType;
     * // Amazon Linux 2
     * // Amazon Linux 2
     * Instance.Builder.create(this, "Instance2")
     * .vpc(vpc)
     * .instanceType(instanceType)
     * .machineImage(MachineImage.latestAmazonLinux2())
     * .build();
     * // Amazon Linux 2 with kernel 5.x
     * // Amazon Linux 2 with kernel 5.x
     * Instance.Builder.create(this, "Instance3")
     * .vpc(vpc)
     * .instanceType(instanceType)
     * .machineImage(MachineImage.latestAmazonLinux2(AmazonLinux2ImageSsmParameterProps.builder()
     * .kernel(AmazonLinux2Kernel.KERNEL_5_10)
     * .build()))
     * .build();
     * // Amazon Linux 2023
     * // Amazon Linux 2023
     * Instance.Builder.create(this, "Instance4")
     * .vpc(vpc)
     * .instanceType(instanceType)
     * .machineImage(MachineImage.latestAmazonLinux2023())
     * .build();
     * // Graviton 3 Processor
     * // Graviton 3 Processor
     * Instance.Builder.create(this, "Instance5")
     * .vpc(vpc)
     * .instanceType(InstanceType.of(InstanceClass.C7G, InstanceSize.LARGE))
     * .machineImage(MachineImage.latestAmazonLinux2023(AmazonLinux2023ImageSsmParameterProps.builder()
     * .cpuType(AmazonLinuxCpuType.ARM_64)
     * .build()))
     * .build();
     * ```
     */
    public inline fun amazonLinux2ImageSsmParameterProps(
        block: AmazonLinux2ImageSsmParameterPropsDsl.() -> Unit = {}
    ): AmazonLinux2ImageSsmParameterProps {
        val builder = AmazonLinux2ImageSsmParameterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Selects the latest version of Amazon Linux.
     *
     * This Machine Image automatically updates to the latest version on every deployment. Be aware
     * this will cause your instances to be replaced when a new version of the image becomes
     * available. Do not store stateful information on the instance if you are using this image.
     *
     * The AMI ID is selected using the values published to the SSM parameter store.
     *
     * Example:
     * ```
     * ISecurityGroup sg = SecurityGroup.fromSecurityGroupId(this, "FsxSecurityGroup",
     * "{SECURITY-GROUP-ID}");
     * IFileSystem fs = LustreFileSystem.fromLustreFileSystemAttributes(this, "FsxLustreFileSystem",
     * FileSystemAttributes.builder()
     * .dnsName("{FILE-SYSTEM-DNS-NAME}")
     * .fileSystemId("{FILE-SYSTEM-ID}")
     * .securityGroup(sg)
     * .build());
     * IVpc vpc = Vpc.fromVpcAttributes(this, "Vpc", VpcAttributes.builder()
     * .availabilityZones(List.of("us-west-2a", "us-west-2b"))
     * .publicSubnetIds(List.of("{US-WEST-2A-SUBNET-ID}", "{US-WEST-2B-SUBNET-ID}"))
     * .vpcId("{VPC-ID}")
     * .build());
     * Instance inst = Instance.Builder.create(this, "inst")
     * .instanceType(InstanceType.of(InstanceClass.T2, InstanceSize.LARGE))
     * .machineImage(AmazonLinuxImage.Builder.create()
     * .generation(AmazonLinuxGeneration.AMAZON_LINUX_2)
     * .build())
     * .vpc(vpc)
     * .vpcSubnets(SubnetSelection.builder()
     * .subnetType(SubnetType.PUBLIC)
     * .build())
     * .build();
     * fs.connections.allowDefaultPortFrom(inst);
     * ```
     */
    public inline fun amazonLinuxImage(
        block: AmazonLinuxImageDsl.() -> Unit = {}
    ): AmazonLinuxImage {
        val builder = AmazonLinuxImageDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Amazon Linux image properties.
     *
     * Example:
     * ```
     * IVpc vpc;
     * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB")
     * .vpc(vpc)
     * .internetFacing(true)
     * .build();
     * // instance to add as the target for load balancer.
     * Instance instance = Instance.Builder.create(this, "targetInstance")
     * .vpc(vpc)
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.MICRO))
     * .machineImage(AmazonLinuxImage.Builder.create().generation(AmazonLinuxGeneration.AMAZON_LINUX_2).build())
     * .build();
     * lb.addTarget(new InstanceTarget(instance));
     * ```
     */
    public inline fun amazonLinuxImageProps(
        block: AmazonLinuxImagePropsDsl.() -> Unit = {}
    ): AmazonLinuxImageProps {
        val builder = AmazonLinuxImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Base options for amazon linux ssm parameters.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * UserData userData;
     * AmazonLinuxImageSsmParameterBaseOptions amazonLinuxImageSsmParameterBaseOptions =
     * AmazonLinuxImageSsmParameterBaseOptions.builder()
     * .cachedInContext(false)
     * .userData(userData)
     * .build();
     * ```
     */
    public inline fun amazonLinuxImageSsmParameterBaseOptions(
        block: AmazonLinuxImageSsmParameterBaseOptionsDsl.() -> Unit = {}
    ): AmazonLinuxImageSsmParameterBaseOptions {
        val builder = AmazonLinuxImageSsmParameterBaseOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Base properties for an Amazon Linux SSM Parameter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * UserData userData;
     * AmazonLinuxImageSsmParameterBaseProps amazonLinuxImageSsmParameterBaseProps =
     * AmazonLinuxImageSsmParameterBaseProps.builder()
     * .parameterName("parameterName")
     * // the properties below are optional
     * .cachedInContext(false)
     * .userData(userData)
     * .build();
     * ```
     */
    public inline fun amazonLinuxImageSsmParameterBaseProps(
        block: AmazonLinuxImageSsmParameterBasePropsDsl.() -> Unit = {}
    ): AmazonLinuxImageSsmParameterBaseProps {
        val builder = AmazonLinuxImageSsmParameterBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Common options across all generations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * UserData userData;
     * AmazonLinuxImageSsmParameterCommonOptions amazonLinuxImageSsmParameterCommonOptions =
     * AmazonLinuxImageSsmParameterCommonOptions.builder()
     * .cachedInContext(false)
     * .cpuType(AmazonLinuxCpuType.ARM_64)
     * .edition(AmazonLinuxEdition.STANDARD)
     * .userData(userData)
     * .build();
     * ```
     */
    public inline fun amazonLinuxImageSsmParameterCommonOptions(
        block: AmazonLinuxImageSsmParameterCommonOptionsDsl.() -> Unit = {}
    ): AmazonLinuxImageSsmParameterCommonOptions {
        val builder = AmazonLinuxImageSsmParameterCommonOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for applying CloudFormation init to an instance or instance group.
     *
     * Example:
     * ```
     * Vpc vpc;
     * InstanceType instanceType;
     * IMachineImage machineImage;
     * Instance.Builder.create(this, "Instance")
     * .vpc(vpc)
     * .instanceType(instanceType)
     * .machineImage(machineImage)
     * // Showing the most complex setup, if you have simpler requirements
     * // you can use `CloudFormationInit.fromElements()`.
     * .init(CloudFormationInit.fromConfigSets(ConfigSetProps.builder()
     * .configSets(Map.of(
     * // Applies the configs below in this order
     * "default", List.of("yumPreinstall", "config")))
     * .configs(Map.of(
     * "yumPreinstall", new InitConfig(List.of(InitPackage.yum("git"))),
     * "config", new InitConfig(List.of(InitFile.fromObject("/etc/stack.json", Map.of(
     * "stackId", Stack.of(this).getStackId(),
     * "stackName", Stack.of(this).getStackName(),
     * "region", Stack.of(this).getRegion())), InitGroup.fromName("my-group"),
     * InitUser.fromName("my-user"),
     * InitPackage.rpm("http://mirrors.ukfast.co.uk/sites/dl.fedoraproject.org/pub/epel/8/Everything/x86_64/Packages/r/rubygem-git-1.5.0-2.el8.noarch.rpm")))))
     * .build()))
     * .initOptions(ApplyCloudFormationInitOptions.builder()
     * // Optional, which configsets to activate (['default'] by default)
     * .configSets(List.of("default"))
     * // Optional, how long the installation is expected to take (5 minutes by default)
     * .timeout(Duration.minutes(30))
     * // Optional, whether to include the --url argument when running cfn-init and cfn-signal
     * commands (false by default)
     * .includeUrl(true)
     * // Optional, whether to include the --role argument when running cfn-init and cfn-signal
     * commands (false by default)
     * .includeRole(true)
     * .build())
     * .build();
     * ```
     */
    public inline fun applyCloudFormationInitOptions(
        block: ApplyCloudFormationInitOptionsDsl.() -> Unit = {}
    ): ApplyCloudFormationInitOptions {
        val builder = ApplyCloudFormationInitOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for attaching a CloudFormationInit to a resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.iam.*;
     * CfnResource cfnResource;
     * Role role;
     * UserData userData;
     * AttachInitOptions attachInitOptions = AttachInitOptions.builder()
     * .instanceRole(role)
     * .platform(OperatingSystemType.LINUX)
     * .userData(userData)
     * // the properties below are optional
     * .configSets(List.of("configSets"))
     * .embedFingerprint(false)
     * .ignoreFailures(false)
     * .includeRole(false)
     * .includeUrl(false)
     * .printLog(false)
     * .signalResource(cfnResource)
     * .build();
     * ```
     */
    public inline fun attachInitOptions(
        block: AttachInitOptionsDsl.() -> Unit = {}
    ): AttachInitOptions {
        val builder = AttachInitOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for AwsIpam.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ec2.IpAddresses;
     * CfnIPAMPool pool;
     * Vpc.Builder.create(this, "TheVPC")
     * .ipAddresses(IpAddresses.awsIpamAllocation(AwsIpamProps.builder()
     * .ipv4IpamPoolId(pool.getRef())
     * .ipv4NetmaskLength(18)
     * .defaultSubnetIpv4NetmaskLength(24)
     * .build()))
     * .build();
     * ```
     */
    public inline fun awsIpamProps(block: AwsIpamPropsDsl.() -> Unit = {}): AwsIpamProps {
        val builder = AwsIpamPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This creates a linux bastion host you can use to connect to other instances or services in
     * your VPC.
     *
     * The recommended way to connect to the bastion host is by using AWS Systems Manager Session
     * Manager.
     *
     * The operating system is Amazon Linux 2 with the latest SSM agent installed
     *
     * You can also configure this bastion host to allow connections via SSH
     *
     * Example:
     * ```
     * BastionHostLinux host = BastionHostLinux.Builder.create(this, "BastionHost")
     * .vpc(vpc)
     * .blockDevices(List.of(BlockDevice.builder()
     * .deviceName("EBSBastionHost")
     * .volume(BlockDeviceVolume.ebs(10, EbsDeviceOptions.builder()
     * .encrypted(true)
     * .build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun bastionHostLinux(
        scope: Construct,
        id: String,
        block: BastionHostLinuxDsl.() -> Unit = {},
    ): BastionHostLinux {
        val builder = BastionHostLinuxDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of the bastion host.
     *
     * Example:
     * ```
     * BastionHostLinux host = BastionHostLinux.Builder.create(this, "BastionHost")
     * .vpc(vpc)
     * .blockDevices(List.of(BlockDevice.builder()
     * .deviceName("EBSBastionHost")
     * .volume(BlockDeviceVolume.ebs(10, EbsDeviceOptions.builder()
     * .encrypted(true)
     * .build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun bastionHostLinuxProps(
        block: BastionHostLinuxPropsDsl.() -> Unit = {}
    ): BastionHostLinuxProps {
        val builder = BastionHostLinuxPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Block device.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * BlockDeviceVolume blockDeviceVolume;
     * BlockDevice blockDevice = BlockDevice.builder()
     * .deviceName("deviceName")
     * .volume(blockDeviceVolume)
     * // the properties below are optional
     * .mappingEnabled(false)
     * .build();
     * ```
     */
    public inline fun blockDevice(block: BlockDeviceDsl.() -> Unit = {}): BlockDevice {
        val builder = BlockDeviceDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new Capacity Reservation with the specified attributes.
     *
     * For more information, see
     * [Capacity Reservations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-capacity-reservations.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnCapacityReservation cfnCapacityReservation = CfnCapacityReservation.Builder.create(this,
     * "MyCfnCapacityReservation")
     * .availabilityZone("availabilityZone")
     * .instanceCount(123)
     * .instancePlatform("instancePlatform")
     * .instanceType("instanceType")
     * // the properties below are optional
     * .ebsOptimized(false)
     * .endDate("endDate")
     * .endDateType("endDateType")
     * .ephemeralStorage(false)
     * .instanceMatchCriteria("instanceMatchCriteria")
     * .outPostArn("outPostArn")
     * .placementGroupArn("placementGroupArn")
     * .tagSpecifications(List.of(TagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * .tenancy("tenancy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html)
     */
    public inline fun cfnCapacityReservation(
        scope: Construct,
        id: String,
        block: CfnCapacityReservationDsl.() -> Unit = {},
    ): CfnCapacityReservation {
        val builder = CfnCapacityReservationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new Capacity Reservation Fleet with the specified attributes.
     *
     * For more information, see
     * [Capacity Reservation Fleets](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cr-fleets.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnCapacityReservationFleet cfnCapacityReservationFleet =
     * CfnCapacityReservationFleet.Builder.create(this, "MyCfnCapacityReservationFleet")
     * .allocationStrategy("allocationStrategy")
     * .endDate("endDate")
     * .instanceMatchCriteria("instanceMatchCriteria")
     * .instanceTypeSpecifications(List.of(InstanceTypeSpecificationProperty.builder()
     * .availabilityZone("availabilityZone")
     * .availabilityZoneId("availabilityZoneId")
     * .ebsOptimized(false)
     * .instancePlatform("instancePlatform")
     * .instanceType("instanceType")
     * .priority(123)
     * .weight(123)
     * .build()))
     * .noRemoveEndDate(false)
     * .removeEndDate(false)
     * .tagSpecifications(List.of(TagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * .tenancy("tenancy")
     * .totalTargetCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html)
     */
    public inline fun cfnCapacityReservationFleet(
        scope: Construct,
        id: String,
        block: CfnCapacityReservationFleetDsl.() -> Unit = {},
    ): CfnCapacityReservationFleet {
        val builder = CfnCapacityReservationFleetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies information about an instance type to use in a Capacity Reservation Fleet.
     *
     * `InstanceTypeSpecification` is a property of the
     * [AWS::EC2::CapacityReservationFleet](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * InstanceTypeSpecificationProperty instanceTypeSpecificationProperty =
     * InstanceTypeSpecificationProperty.builder()
     * .availabilityZone("availabilityZone")
     * .availabilityZoneId("availabilityZoneId")
     * .ebsOptimized(false)
     * .instancePlatform("instancePlatform")
     * .instanceType("instanceType")
     * .priority(123)
     * .weight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-instancetypespecification.html)
     */
    public inline fun cfnCapacityReservationFleetInstanceTypeSpecificationProperty(
        block: CfnCapacityReservationFleetInstanceTypeSpecificationPropertyDsl.() -> Unit = {}
    ): CfnCapacityReservationFleet.InstanceTypeSpecificationProperty {
        val builder = CfnCapacityReservationFleetInstanceTypeSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCapacityReservationFleet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnCapacityReservationFleetProps cfnCapacityReservationFleetProps =
     * CfnCapacityReservationFleetProps.builder()
     * .allocationStrategy("allocationStrategy")
     * .endDate("endDate")
     * .instanceMatchCriteria("instanceMatchCriteria")
     * .instanceTypeSpecifications(List.of(InstanceTypeSpecificationProperty.builder()
     * .availabilityZone("availabilityZone")
     * .availabilityZoneId("availabilityZoneId")
     * .ebsOptimized(false)
     * .instancePlatform("instancePlatform")
     * .instanceType("instanceType")
     * .priority(123)
     * .weight(123)
     * .build()))
     * .noRemoveEndDate(false)
     * .removeEndDate(false)
     * .tagSpecifications(List.of(TagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * .tenancy("tenancy")
     * .totalTargetCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservationfleet.html)
     */
    public inline fun cfnCapacityReservationFleetProps(
        block: CfnCapacityReservationFleetPropsDsl.() -> Unit = {}
    ): CfnCapacityReservationFleetProps {
        val builder = CfnCapacityReservationFleetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The tags to apply to a resource when the resource is being created.
     *
     * When you specify a tag, you must specify the resource type to tag, otherwise the request will
     * fail.
     *
     * The `Valid Values` lists all the resource types that can be tagged. However, the action
     * you're using might not support tagging all of these resource types. If you try to tag a
     * resource type that is unsupported for the action you're using, you'll get an error.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * TagSpecificationProperty tagSpecificationProperty = TagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservationfleet-tagspecification.html)
     */
    public inline fun cfnCapacityReservationFleetTagSpecificationProperty(
        block: CfnCapacityReservationFleetTagSpecificationPropertyDsl.() -> Unit = {}
    ): CfnCapacityReservationFleet.TagSpecificationProperty {
        val builder = CfnCapacityReservationFleetTagSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCapacityReservation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnCapacityReservationProps cfnCapacityReservationProps = CfnCapacityReservationProps.builder()
     * .availabilityZone("availabilityZone")
     * .instanceCount(123)
     * .instancePlatform("instancePlatform")
     * .instanceType("instanceType")
     * // the properties below are optional
     * .ebsOptimized(false)
     * .endDate("endDate")
     * .endDateType("endDateType")
     * .ephemeralStorage(false)
     * .instanceMatchCriteria("instanceMatchCriteria")
     * .outPostArn("outPostArn")
     * .placementGroupArn("placementGroupArn")
     * .tagSpecifications(List.of(TagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * .tenancy("tenancy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html)
     */
    public inline fun cfnCapacityReservationProps(
        block: CfnCapacityReservationPropsDsl.() -> Unit = {}
    ): CfnCapacityReservationProps {
        val builder = CfnCapacityReservationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * TagSpecificationProperty tagSpecificationProperty = TagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservation-tagspecification.html)
     */
    public inline fun cfnCapacityReservationTagSpecificationProperty(
        block: CfnCapacityReservationTagSpecificationPropertyDsl.() -> Unit = {}
    ): CfnCapacityReservation.TagSpecificationProperty {
        val builder = CfnCapacityReservationTagSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a carrier gateway.
     *
     * For more information about carrier gateways, see
     * [Carrier gateways](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#wavelength-carrier-gateway)
     * in the *AWS Wavelength Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnCarrierGateway cfnCarrierGateway = CfnCarrierGateway.Builder.create(this,
     * "MyCfnCarrierGateway")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-carriergateway.html)
     */
    public inline fun cfnCarrierGateway(
        scope: Construct,
        id: String,
        block: CfnCarrierGatewayDsl.() -> Unit = {},
    ): CfnCarrierGateway {
        val builder = CfnCarrierGatewayDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCarrierGateway`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnCarrierGatewayProps cfnCarrierGatewayProps = CfnCarrierGatewayProps.builder()
     * .vpcId("vpcId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-carriergateway.html)
     */
    public inline fun cfnCarrierGatewayProps(
        block: CfnCarrierGatewayPropsDsl.() -> Unit = {}
    ): CfnCarrierGatewayProps {
        val builder = CfnCarrierGatewayPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an ingress authorization rule to add to a Client VPN endpoint.
     *
     * Ingress authorization rules act as firewall rules that grant access to networks. You must
     * configure ingress authorization rules to enable clients to access resources in AWS or
     * on-premises networks.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnClientVpnAuthorizationRule cfnClientVpnAuthorizationRule =
     * CfnClientVpnAuthorizationRule.Builder.create(this, "MyCfnClientVpnAuthorizationRule")
     * .clientVpnEndpointId("clientVpnEndpointId")
     * .targetNetworkCidr("targetNetworkCidr")
     * // the properties below are optional
     * .accessGroupId("accessGroupId")
     * .authorizeAllGroups(false)
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html)
     */
    public inline fun cfnClientVpnAuthorizationRule(
        scope: Construct,
        id: String,
        block: CfnClientVpnAuthorizationRuleDsl.() -> Unit = {},
    ): CfnClientVpnAuthorizationRule {
        val builder = CfnClientVpnAuthorizationRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnClientVpnAuthorizationRule`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnClientVpnAuthorizationRuleProps cfnClientVpnAuthorizationRuleProps =
     * CfnClientVpnAuthorizationRuleProps.builder()
     * .clientVpnEndpointId("clientVpnEndpointId")
     * .targetNetworkCidr("targetNetworkCidr")
     * // the properties below are optional
     * .accessGroupId("accessGroupId")
     * .authorizeAllGroups(false)
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html)
     */
    public inline fun cfnClientVpnAuthorizationRuleProps(
        block: CfnClientVpnAuthorizationRulePropsDsl.() -> Unit = {}
    ): CfnClientVpnAuthorizationRuleProps {
        val builder = CfnClientVpnAuthorizationRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a Client VPN endpoint.
     *
     * A Client VPN endpoint is the resource you create and configure to enable and manage client
     * VPN sessions. It is the destination endpoint at which all client VPN sessions are terminated.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnClientVpnEndpoint cfnClientVpnEndpoint = CfnClientVpnEndpoint.Builder.create(this,
     * "MyCfnClientVpnEndpoint")
     * .authenticationOptions(List.of(ClientAuthenticationRequestProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .activeDirectory(DirectoryServiceAuthenticationRequestProperty.builder()
     * .directoryId("directoryId")
     * .build())
     * .federatedAuthentication(FederatedAuthenticationRequestProperty.builder()
     * .samlProviderArn("samlProviderArn")
     * // the properties below are optional
     * .selfServiceSamlProviderArn("selfServiceSamlProviderArn")
     * .build())
     * .mutualAuthentication(CertificateAuthenticationRequestProperty.builder()
     * .clientRootCertificateChainArn("clientRootCertificateChainArn")
     * .build())
     * .build()))
     * .clientCidrBlock("clientCidrBlock")
     * .connectionLogOptions(ConnectionLogOptionsProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .cloudwatchLogGroup("cloudwatchLogGroup")
     * .cloudwatchLogStream("cloudwatchLogStream")
     * .build())
     * .serverCertificateArn("serverCertificateArn")
     * // the properties below are optional
     * .clientConnectOptions(ClientConnectOptionsProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .lambdaFunctionArn("lambdaFunctionArn")
     * .build())
     * .clientLoginBannerOptions(ClientLoginBannerOptionsProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .bannerText("bannerText")
     * .build())
     * .description("description")
     * .dnsServers(List.of("dnsServers"))
     * .securityGroupIds(List.of("securityGroupIds"))
     * .selfServicePortal("selfServicePortal")
     * .sessionTimeoutHours(123)
     * .splitTunnel(false)
     * .tagSpecifications(List.of(TagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * .transportProtocol("transportProtocol")
     * .vpcId("vpcId")
     * .vpnPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html)
     */
    public inline fun cfnClientVpnEndpoint(
        scope: Construct,
        id: String,
        block: CfnClientVpnEndpointDsl.() -> Unit = {},
    ): CfnClientVpnEndpoint {
        val builder = CfnClientVpnEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the client certificate to be used for authentication.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CertificateAuthenticationRequestProperty certificateAuthenticationRequestProperty =
     * CertificateAuthenticationRequestProperty.builder()
     * .clientRootCertificateChainArn("clientRootCertificateChainArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-certificateauthenticationrequest.html)
     */
    public inline fun cfnClientVpnEndpointCertificateAuthenticationRequestProperty(
        block: CfnClientVpnEndpointCertificateAuthenticationRequestPropertyDsl.() -> Unit = {}
    ): CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty {
        val builder = CfnClientVpnEndpointCertificateAuthenticationRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the authentication method to be used by a Client VPN endpoint.
     *
     * For more information, see
     * [Authentication](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/authentication-authrization.html#client-authentication)
     * in the *AWS Client VPN Administrator Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ClientAuthenticationRequestProperty clientAuthenticationRequestProperty =
     * ClientAuthenticationRequestProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .activeDirectory(DirectoryServiceAuthenticationRequestProperty.builder()
     * .directoryId("directoryId")
     * .build())
     * .federatedAuthentication(FederatedAuthenticationRequestProperty.builder()
     * .samlProviderArn("samlProviderArn")
     * // the properties below are optional
     * .selfServiceSamlProviderArn("selfServiceSamlProviderArn")
     * .build())
     * .mutualAuthentication(CertificateAuthenticationRequestProperty.builder()
     * .clientRootCertificateChainArn("clientRootCertificateChainArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientauthenticationrequest.html)
     */
    public inline fun cfnClientVpnEndpointClientAuthenticationRequestProperty(
        block: CfnClientVpnEndpointClientAuthenticationRequestPropertyDsl.() -> Unit = {}
    ): CfnClientVpnEndpoint.ClientAuthenticationRequestProperty {
        val builder = CfnClientVpnEndpointClientAuthenticationRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Indicates whether client connect options are enabled.
     *
     * The default is `false` (not enabled).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ClientConnectOptionsProperty clientConnectOptionsProperty =
     * ClientConnectOptionsProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .lambdaFunctionArn("lambdaFunctionArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientconnectoptions.html)
     */
    public inline fun cfnClientVpnEndpointClientConnectOptionsProperty(
        block: CfnClientVpnEndpointClientConnectOptionsPropertyDsl.() -> Unit = {}
    ): CfnClientVpnEndpoint.ClientConnectOptionsProperty {
        val builder = CfnClientVpnEndpointClientConnectOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for enabling a customizable text banner that will be displayed on AWS provided
     * clients when a VPN session is established.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ClientLoginBannerOptionsProperty clientLoginBannerOptionsProperty =
     * ClientLoginBannerOptionsProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .bannerText("bannerText")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientloginbanneroptions.html)
     */
    public inline fun cfnClientVpnEndpointClientLoginBannerOptionsProperty(
        block: CfnClientVpnEndpointClientLoginBannerOptionsPropertyDsl.() -> Unit = {}
    ): CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty {
        val builder = CfnClientVpnEndpointClientLoginBannerOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the client connection logging options for the Client VPN endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ConnectionLogOptionsProperty connectionLogOptionsProperty =
     * ConnectionLogOptionsProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .cloudwatchLogGroup("cloudwatchLogGroup")
     * .cloudwatchLogStream("cloudwatchLogStream")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html)
     */
    public inline fun cfnClientVpnEndpointConnectionLogOptionsProperty(
        block: CfnClientVpnEndpointConnectionLogOptionsPropertyDsl.() -> Unit = {}
    ): CfnClientVpnEndpoint.ConnectionLogOptionsProperty {
        val builder = CfnClientVpnEndpointConnectionLogOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the Active Directory to be used for client authentication.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * DirectoryServiceAuthenticationRequestProperty directoryServiceAuthenticationRequestProperty =
     * DirectoryServiceAuthenticationRequestProperty.builder()
     * .directoryId("directoryId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-directoryserviceauthenticationrequest.html)
     */
    public inline fun cfnClientVpnEndpointDirectoryServiceAuthenticationRequestProperty(
        block: CfnClientVpnEndpointDirectoryServiceAuthenticationRequestPropertyDsl.() -> Unit = {}
    ): CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty {
        val builder = CfnClientVpnEndpointDirectoryServiceAuthenticationRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The IAM SAML identity provider used for federated authentication.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * FederatedAuthenticationRequestProperty federatedAuthenticationRequestProperty =
     * FederatedAuthenticationRequestProperty.builder()
     * .samlProviderArn("samlProviderArn")
     * // the properties below are optional
     * .selfServiceSamlProviderArn("selfServiceSamlProviderArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-federatedauthenticationrequest.html)
     */
    public inline fun cfnClientVpnEndpointFederatedAuthenticationRequestProperty(
        block: CfnClientVpnEndpointFederatedAuthenticationRequestPropertyDsl.() -> Unit = {}
    ): CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty {
        val builder = CfnClientVpnEndpointFederatedAuthenticationRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnClientVpnEndpoint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnClientVpnEndpointProps cfnClientVpnEndpointProps = CfnClientVpnEndpointProps.builder()
     * .authenticationOptions(List.of(ClientAuthenticationRequestProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .activeDirectory(DirectoryServiceAuthenticationRequestProperty.builder()
     * .directoryId("directoryId")
     * .build())
     * .federatedAuthentication(FederatedAuthenticationRequestProperty.builder()
     * .samlProviderArn("samlProviderArn")
     * // the properties below are optional
     * .selfServiceSamlProviderArn("selfServiceSamlProviderArn")
     * .build())
     * .mutualAuthentication(CertificateAuthenticationRequestProperty.builder()
     * .clientRootCertificateChainArn("clientRootCertificateChainArn")
     * .build())
     * .build()))
     * .clientCidrBlock("clientCidrBlock")
     * .connectionLogOptions(ConnectionLogOptionsProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .cloudwatchLogGroup("cloudwatchLogGroup")
     * .cloudwatchLogStream("cloudwatchLogStream")
     * .build())
     * .serverCertificateArn("serverCertificateArn")
     * // the properties below are optional
     * .clientConnectOptions(ClientConnectOptionsProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .lambdaFunctionArn("lambdaFunctionArn")
     * .build())
     * .clientLoginBannerOptions(ClientLoginBannerOptionsProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .bannerText("bannerText")
     * .build())
     * .description("description")
     * .dnsServers(List.of("dnsServers"))
     * .securityGroupIds(List.of("securityGroupIds"))
     * .selfServicePortal("selfServicePortal")
     * .sessionTimeoutHours(123)
     * .splitTunnel(false)
     * .tagSpecifications(List.of(TagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * .transportProtocol("transportProtocol")
     * .vpcId("vpcId")
     * .vpnPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html)
     */
    public inline fun cfnClientVpnEndpointProps(
        block: CfnClientVpnEndpointPropsDsl.() -> Unit = {}
    ): CfnClientVpnEndpointProps {
        val builder = CfnClientVpnEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The tags to apply to a resource when the resource is being created.
     *
     * When you specify a tag, you must specify the resource type to tag, otherwise the request will
     * fail.
     *
     * The `Valid Values` lists all the resource types that can be tagged. However, the action
     * you're using might not support tagging all of these resource types. If you try to tag a
     * resource type that is unsupported for the action you're using, you'll get an error.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * TagSpecificationProperty tagSpecificationProperty = TagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-tagspecification.html)
     */
    public inline fun cfnClientVpnEndpointTagSpecificationProperty(
        block: CfnClientVpnEndpointTagSpecificationPropertyDsl.() -> Unit = {}
    ): CfnClientVpnEndpoint.TagSpecificationProperty {
        val builder = CfnClientVpnEndpointTagSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a network route to add to a Client VPN endpoint.
     *
     * Each Client VPN endpoint has a route table that describes the available destination network
     * routes. Each route in the route table specifies the path for traffic to specific resources or
     * networks.
     *
     * A target network association must be created before you can specify a route. If you're
     * setting up all the components of a Client VPN endpoint at the same time, you must use the
     * [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the `AWS::EC2::ClientVpnTargetNetworkAssociation` resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnClientVpnRoute cfnClientVpnRoute = CfnClientVpnRoute.Builder.create(this,
     * "MyCfnClientVpnRoute")
     * .clientVpnEndpointId("clientVpnEndpointId")
     * .destinationCidrBlock("destinationCidrBlock")
     * .targetVpcSubnetId("targetVpcSubnetId")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html)
     */
    public inline fun cfnClientVpnRoute(
        scope: Construct,
        id: String,
        block: CfnClientVpnRouteDsl.() -> Unit = {},
    ): CfnClientVpnRoute {
        val builder = CfnClientVpnRouteDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnClientVpnRoute`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnClientVpnRouteProps cfnClientVpnRouteProps = CfnClientVpnRouteProps.builder()
     * .clientVpnEndpointId("clientVpnEndpointId")
     * .destinationCidrBlock("destinationCidrBlock")
     * .targetVpcSubnetId("targetVpcSubnetId")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html)
     */
    public inline fun cfnClientVpnRouteProps(
        block: CfnClientVpnRoutePropsDsl.() -> Unit = {}
    ): CfnClientVpnRouteProps {
        val builder = CfnClientVpnRoutePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a target network to associate with a Client VPN endpoint.
     *
     * A target network is a subnet in a VPC. You can associate multiple subnets from the same VPC
     * with a Client VPN endpoint. You can associate only one subnet in each Availability Zone. We
     * recommend that you associate at least two subnets to provide Availability Zone redundancy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnClientVpnTargetNetworkAssociation cfnClientVpnTargetNetworkAssociation =
     * CfnClientVpnTargetNetworkAssociation.Builder.create(this,
     * "MyCfnClientVpnTargetNetworkAssociation")
     * .clientVpnEndpointId("clientVpnEndpointId")
     * .subnetId("subnetId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html)
     */
    public inline fun cfnClientVpnTargetNetworkAssociation(
        scope: Construct,
        id: String,
        block: CfnClientVpnTargetNetworkAssociationDsl.() -> Unit = {},
    ): CfnClientVpnTargetNetworkAssociation {
        val builder = CfnClientVpnTargetNetworkAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnClientVpnTargetNetworkAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnClientVpnTargetNetworkAssociationProps cfnClientVpnTargetNetworkAssociationProps =
     * CfnClientVpnTargetNetworkAssociationProps.builder()
     * .clientVpnEndpointId("clientVpnEndpointId")
     * .subnetId("subnetId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html)
     */
    public inline fun cfnClientVpnTargetNetworkAssociationProps(
        block: CfnClientVpnTargetNetworkAssociationPropsDsl.() -> Unit = {}
    ): CfnClientVpnTargetNetworkAssociationProps {
        val builder = CfnClientVpnTargetNetworkAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a customer gateway.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnCustomerGateway cfnCustomerGateway = CfnCustomerGateway.Builder.create(this,
     * "MyCfnCustomerGateway")
     * .bgpAsn(123)
     * .ipAddress("ipAddress")
     * .type("type")
     * // the properties below are optional
     * .deviceName("deviceName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html)
     */
    public inline fun cfnCustomerGateway(
        scope: Construct,
        id: String,
        block: CfnCustomerGatewayDsl.() -> Unit = {},
    ): CfnCustomerGateway {
        val builder = CfnCustomerGatewayDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCustomerGateway`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnCustomerGatewayProps cfnCustomerGatewayProps = CfnCustomerGatewayProps.builder()
     * .bgpAsn(123)
     * .ipAddress("ipAddress")
     * .type("type")
     * // the properties below are optional
     * .deviceName("deviceName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html)
     */
    public inline fun cfnCustomerGatewayProps(
        block: CfnCustomerGatewayPropsDsl.() -> Unit = {}
    ): CfnCustomerGatewayProps {
        val builder = CfnCustomerGatewayPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a set of DHCP options for your VPC.
     *
     * You must specify at least one of the following properties: `DomainNameServers` ,
     * `NetbiosNameServers` , `NtpServers` . If you specify `NetbiosNameServers` , you must specify
     * `NetbiosNodeType` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnDHCPOptions cfnDHCPOptions = CfnDHCPOptions.Builder.create(this, "MyCfnDHCPOptions")
     * .domainName("domainName")
     * .domainNameServers(List.of("domainNameServers"))
     * .netbiosNameServers(List.of("netbiosNameServers"))
     * .netbiosNodeType(123)
     * .ntpServers(List.of("ntpServers"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html)
     */
    public inline fun cfnDHCPOptions(
        scope: Construct,
        id: String,
        block: CfnDHCPOptionsDsl.() -> Unit = {},
    ): CfnDHCPOptions {
        val builder = CfnDHCPOptionsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDHCPOptions`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnDHCPOptionsProps cfnDHCPOptionsProps = CfnDHCPOptionsProps.builder()
     * .domainName("domainName")
     * .domainNameServers(List.of("domainNameServers"))
     * .netbiosNameServers(List.of("netbiosNameServers"))
     * .netbiosNodeType(123)
     * .ntpServers(List.of("ntpServers"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html)
     */
    public inline fun cfnDHCPOptionsProps(
        block: CfnDHCPOptionsPropsDsl.() -> Unit = {}
    ): CfnDHCPOptionsProps {
        val builder = CfnDHCPOptionsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration information to launch a fleet--or group--of instances.
     *
     * An EC2 Fleet can launch multiple instance types across multiple Availability Zones, using the
     * On-Demand Instance, Reserved Instance, and Spot Instance purchasing models together. Using
     * EC2 Fleet, you can define separate On-Demand and Spot capacity targets, specify the instance
     * types that work best for your applications, and specify how Amazon EC2 should distribute your
     * fleet capacity within each purchasing model. For more information, see
     * [Launching an EC2 Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnEC2Fleet cfnEC2Fleet = CfnEC2Fleet.Builder.create(this, "MyCfnEC2Fleet")
     * .launchTemplateConfigs(List.of(FleetLaunchTemplateConfigRequestProperty.builder()
     * .launchTemplateSpecification(FleetLaunchTemplateSpecificationRequestProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * .overrides(List.of(FleetLaunchTemplateOverridesRequestProperty.builder()
     * .availabilityZone("availabilityZone")
     * .instanceRequirements(InstanceRequirementsRequestProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRangeRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .maxPrice("maxPrice")
     * .placement(PlacementProperty.builder()
     * .affinity("affinity")
     * .availabilityZone("availabilityZone")
     * .groupName("groupName")
     * .hostId("hostId")
     * .hostResourceGroupArn("hostResourceGroupArn")
     * .partitionNumber(123)
     * .spreadDomain("spreadDomain")
     * .tenancy("tenancy")
     * .build())
     * .priority(123)
     * .subnetId("subnetId")
     * .weightedCapacity(123)
     * .build()))
     * .build()))
     * .targetCapacitySpecification(TargetCapacitySpecificationRequestProperty.builder()
     * .totalTargetCapacity(123)
     * // the properties below are optional
     * .defaultTargetCapacityType("defaultTargetCapacityType")
     * .onDemandTargetCapacity(123)
     * .spotTargetCapacity(123)
     * .targetCapacityUnitType("targetCapacityUnitType")
     * .build())
     * // the properties below are optional
     * .context("context")
     * .excessCapacityTerminationPolicy("excessCapacityTerminationPolicy")
     * .onDemandOptions(OnDemandOptionsRequestProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .capacityReservationOptions(CapacityReservationOptionsRequestProperty.builder()
     * .usageStrategy("usageStrategy")
     * .build())
     * .maxTotalPrice("maxTotalPrice")
     * .minTargetCapacity(123)
     * .singleAvailabilityZone(false)
     * .singleInstanceType(false)
     * .build())
     * .replaceUnhealthyInstances(false)
     * .spotOptions(SpotOptionsRequestProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .instanceInterruptionBehavior("instanceInterruptionBehavior")
     * .instancePoolsToUseCount(123)
     * .maintenanceStrategies(MaintenanceStrategiesProperty.builder()
     * .capacityRebalance(CapacityRebalanceProperty.builder()
     * .replacementStrategy("replacementStrategy")
     * .terminationDelay(123)
     * .build())
     * .build())
     * .maxTotalPrice("maxTotalPrice")
     * .minTargetCapacity(123)
     * .singleAvailabilityZone(false)
     * .singleInstanceType(false)
     * .build())
     * .tagSpecifications(List.of(TagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * .terminateInstancesWithExpiration(false)
     * .type("type")
     * .validFrom("validFrom")
     * .validUntil("validUntil")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html)
     */
    public inline fun cfnEC2Fleet(
        scope: Construct,
        id: String,
        block: CfnEC2FleetDsl.() -> Unit = {},
    ): CfnEC2Fleet {
        val builder = CfnEC2FleetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips) on an
     * instance.
     *
     * To exclude accelerator-enabled instance types, set `Max` to `0` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AcceleratorCountRequestProperty acceleratorCountRequestProperty =
     * AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-acceleratorcountrequest.html)
     */
    public inline fun cfnEC2FleetAcceleratorCountRequestProperty(
        block: CfnEC2FleetAcceleratorCountRequestPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.AcceleratorCountRequestProperty {
        val builder = CfnEC2FleetAcceleratorCountRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum amount of total accelerator memory, in MiB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AcceleratorTotalMemoryMiBRequestProperty acceleratorTotalMemoryMiBRequestProperty =
     * AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-acceleratortotalmemorymibrequest.html)
     */
    public inline fun cfnEC2FleetAcceleratorTotalMemoryMiBRequestProperty(
        block: CfnEC2FleetAcceleratorTotalMemoryMiBRequestPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.AcceleratorTotalMemoryMiBRequestProperty {
        val builder = CfnEC2FleetAcceleratorTotalMemoryMiBRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps.
     *
     * For more information, see
     * [Amazon EBS–optimized instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * BaselineEbsBandwidthMbpsRequestProperty baselineEbsBandwidthMbpsRequestProperty =
     * BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-baselineebsbandwidthmbpsrequest.html)
     */
    public inline fun cfnEC2FleetBaselineEbsBandwidthMbpsRequestProperty(
        block: CfnEC2FleetBaselineEbsBandwidthMbpsRequestPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty {
        val builder = CfnEC2FleetBaselineEbsBandwidthMbpsRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Spot Instance replacement strategy to use when Amazon EC2 emits a rebalance notification
     * signal that your Spot Instance is at an elevated risk of being interrupted.
     *
     * For more information, see
     * [Capacity rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-capacity-rebalance.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CapacityRebalanceProperty capacityRebalanceProperty = CapacityRebalanceProperty.builder()
     * .replacementStrategy("replacementStrategy")
     * .terminationDelay(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityrebalance.html)
     */
    public inline fun cfnEC2FleetCapacityRebalanceProperty(
        block: CfnEC2FleetCapacityRebalancePropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.CapacityRebalanceProperty {
        val builder = CfnEC2FleetCapacityRebalancePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the strategy for using unused Capacity Reservations for fulfilling On-Demand
     * capacity.
     *
     * This strategy can only be used if the EC2 Fleet is of type `instant` .
     *
     * For more information about Capacity Reservations, see
     * [On-Demand Capacity Reservations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-capacity-reservations.html)
     * in the *Amazon EC2 User Guide* . For examples of using Capacity Reservations in an EC2 Fleet,
     * see
     * [EC2 Fleet example configurations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-examples.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CapacityReservationOptionsRequestProperty capacityReservationOptionsRequestProperty =
     * CapacityReservationOptionsRequestProperty.builder()
     * .usageStrategy("usageStrategy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityreservationoptionsrequest.html)
     */
    public inline fun cfnEC2FleetCapacityReservationOptionsRequestProperty(
        block: CfnEC2FleetCapacityReservationOptionsRequestPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.CapacityReservationOptionsRequestProperty {
        val builder = CfnEC2FleetCapacityReservationOptionsRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a launch template and overrides for an EC2 Fleet.
     *
     * `FleetLaunchTemplateConfigRequest` is a property of the
     * [AWS::EC2::EC2Fleet](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * FleetLaunchTemplateConfigRequestProperty fleetLaunchTemplateConfigRequestProperty =
     * FleetLaunchTemplateConfigRequestProperty.builder()
     * .launchTemplateSpecification(FleetLaunchTemplateSpecificationRequestProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * .overrides(List.of(FleetLaunchTemplateOverridesRequestProperty.builder()
     * .availabilityZone("availabilityZone")
     * .instanceRequirements(InstanceRequirementsRequestProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRangeRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .maxPrice("maxPrice")
     * .placement(PlacementProperty.builder()
     * .affinity("affinity")
     * .availabilityZone("availabilityZone")
     * .groupName("groupName")
     * .hostId("hostId")
     * .hostResourceGroupArn("hostResourceGroupArn")
     * .partitionNumber(123)
     * .spreadDomain("spreadDomain")
     * .tenancy("tenancy")
     * .build())
     * .priority(123)
     * .subnetId("subnetId")
     * .weightedCapacity(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateconfigrequest.html)
     */
    public inline fun cfnEC2FleetFleetLaunchTemplateConfigRequestProperty(
        block: CfnEC2FleetFleetLaunchTemplateConfigRequestPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty {
        val builder = CfnEC2FleetFleetLaunchTemplateConfigRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies overrides for a launch template for an EC2 Fleet.
     *
     * `FleetLaunchTemplateOverridesRequest` is a property of the
     * [FleetLaunchTemplateConfigRequest](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateconfigrequest.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * FleetLaunchTemplateOverridesRequestProperty fleetLaunchTemplateOverridesRequestProperty =
     * FleetLaunchTemplateOverridesRequestProperty.builder()
     * .availabilityZone("availabilityZone")
     * .instanceRequirements(InstanceRequirementsRequestProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRangeRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .maxPrice("maxPrice")
     * .placement(PlacementProperty.builder()
     * .affinity("affinity")
     * .availabilityZone("availabilityZone")
     * .groupName("groupName")
     * .hostId("hostId")
     * .hostResourceGroupArn("hostResourceGroupArn")
     * .partitionNumber(123)
     * .spreadDomain("spreadDomain")
     * .tenancy("tenancy")
     * .build())
     * .priority(123)
     * .subnetId("subnetId")
     * .weightedCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html)
     */
    public inline fun cfnEC2FleetFleetLaunchTemplateOverridesRequestProperty(
        block: CfnEC2FleetFleetLaunchTemplateOverridesRequestPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty {
        val builder = CfnEC2FleetFleetLaunchTemplateOverridesRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the launch template to be used by the EC2 Fleet for configuring Amazon EC2
     * instances.
     *
     * You must specify the following:
     * * The ID or the name of the launch template, but not both.
     * * The version of the launch template.
     *
     * `FleetLaunchTemplateSpecificationRequest` is a property of the
     * [FleetLaunchTemplateConfigRequest](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateconfigrequest.html)
     * property type.
     *
     * For information about creating a launch template, see
     * [AWS::EC2::LaunchTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
     * and
     * [Create a launch template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
     * in the *Amazon EC2 User Guide* .
     *
     * For examples of launch templates, see
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#aws-resource-ec2-launchtemplate--examples)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * FleetLaunchTemplateSpecificationRequestProperty fleetLaunchTemplateSpecificationRequestProperty
     * = FleetLaunchTemplateSpecificationRequestProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest.html)
     */
    public inline fun cfnEC2FleetFleetLaunchTemplateSpecificationRequestProperty(
        block: CfnEC2FleetFleetLaunchTemplateSpecificationRequestPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty {
        val builder = CfnEC2FleetFleetLaunchTemplateSpecificationRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The attributes for the instance types.
     *
     * When you specify instance attributes, Amazon EC2 will identify instance types with these
     * attributes.
     *
     * You must specify `VCpuCount` and `MemoryMiB` . All other attributes are optional. Any
     * unspecified optional attribute is set to its default.
     *
     * When you specify multiple attributes, you get instance types that satisfy all of the
     * specified attributes. If you specify multiple values for an attribute, you get instance types
     * that satisfy any of the specified values.
     *
     * To limit the list of instance types from which Amazon EC2 can identify matching instance
     * types, you can use one of the following parameters, but not both in the same request:
     * * `AllowedInstanceTypes` - The instance types to include in the list. All other instance
     *   types are ignored, even if they match your specified attributes.
     * * `ExcludedInstanceTypes` - The instance types to exclude from the list, even if they match
     *   your specified attributes.
     *
     * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
     *
     * Attribute-based instance type selection is only supported when using Auto Scaling groups, EC2
     * Fleet, and Spot Fleet to launch instances. If you plan to use the launch template in the
     * [launch instance wizard](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-instance-wizard.html)
     * , or with the
     * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
     * API or
     * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     * AWS CloudFormation resource, you can't specify `InstanceRequirements` .
     *
     * For more information, see
     * [Attribute-based instance type selection for EC2 Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html)
     * ,
     * [Attribute-based instance type selection for Spot Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-attribute-based-instance-type-selection.html)
     * , and
     * [Spot placement score](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-placement-score.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * InstanceRequirementsRequestProperty instanceRequirementsRequestProperty =
     * InstanceRequirementsRequestProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRangeRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html)
     */
    public inline fun cfnEC2FleetInstanceRequirementsRequestProperty(
        block: CfnEC2FleetInstanceRequirementsRequestPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.InstanceRequirementsRequestProperty {
        val builder = CfnEC2FleetInstanceRequirementsRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The strategies for managing your Spot Instances that are at an elevated risk of being
     * interrupted.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * MaintenanceStrategiesProperty maintenanceStrategiesProperty =
     * MaintenanceStrategiesProperty.builder()
     * .capacityRebalance(CapacityRebalanceProperty.builder()
     * .replacementStrategy("replacementStrategy")
     * .terminationDelay(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-maintenancestrategies.html)
     */
    public inline fun cfnEC2FleetMaintenanceStrategiesProperty(
        block: CfnEC2FleetMaintenanceStrategiesPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.MaintenanceStrategiesProperty {
        val builder = CfnEC2FleetMaintenanceStrategiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum amount of memory per vCPU, in GiB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * MemoryGiBPerVCpuRequestProperty memoryGiBPerVCpuRequestProperty =
     * MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-memorygibpervcpurequest.html)
     */
    public inline fun cfnEC2FleetMemoryGiBPerVCpuRequestProperty(
        block: CfnEC2FleetMemoryGiBPerVCpuRequestPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty {
        val builder = CfnEC2FleetMemoryGiBPerVCpuRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum amount of memory, in MiB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * MemoryMiBRequestProperty memoryMiBRequestProperty = MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-memorymibrequest.html)
     */
    public inline fun cfnEC2FleetMemoryMiBRequestProperty(
        block: CfnEC2FleetMemoryMiBRequestPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.MemoryMiBRequestProperty {
        val builder = CfnEC2FleetMemoryMiBRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps).
     *
     * Setting the minimum bandwidth does not guarantee that your instance will achieve the minimum
     * bandwidth. Amazon EC2 will identify instance types that support the specified minimum
     * bandwidth, but the actual bandwidth of your instance might go below the specified minimum at
     * times. For more information, see
     * [Available instance bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html#available-instance-bandwidth)
     * in the *Amazon EC2 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * NetworkBandwidthGbpsRequestProperty networkBandwidthGbpsRequestProperty =
     * NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-networkbandwidthgbpsrequest.html)
     */
    public inline fun cfnEC2FleetNetworkBandwidthGbpsRequestProperty(
        block: CfnEC2FleetNetworkBandwidthGbpsRequestPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty {
        val builder = CfnEC2FleetNetworkBandwidthGbpsRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum number of network interfaces.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * NetworkInterfaceCountRequestProperty networkInterfaceCountRequestProperty =
     * NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-networkinterfacecountrequest.html)
     */
    public inline fun cfnEC2FleetNetworkInterfaceCountRequestProperty(
        block: CfnEC2FleetNetworkInterfaceCountRequestPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.NetworkInterfaceCountRequestProperty {
        val builder = CfnEC2FleetNetworkInterfaceCountRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the allocation strategy of On-Demand Instances in an EC2 Fleet.
     *
     * `OnDemandOptionsRequest` is a property of the
     * [AWS::EC2::EC2Fleet](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * OnDemandOptionsRequestProperty onDemandOptionsRequestProperty =
     * OnDemandOptionsRequestProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .capacityReservationOptions(CapacityReservationOptionsRequestProperty.builder()
     * .usageStrategy("usageStrategy")
     * .build())
     * .maxTotalPrice("maxTotalPrice")
     * .minTargetCapacity(123)
     * .singleAvailabilityZone(false)
     * .singleInstanceType(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html)
     */
    public inline fun cfnEC2FleetOnDemandOptionsRequestProperty(
        block: CfnEC2FleetOnDemandOptionsRequestPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.OnDemandOptionsRequestProperty {
        val builder = CfnEC2FleetOnDemandOptionsRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the placement of an instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PlacementProperty placementProperty = PlacementProperty.builder()
     * .affinity("affinity")
     * .availabilityZone("availabilityZone")
     * .groupName("groupName")
     * .hostId("hostId")
     * .hostResourceGroupArn("hostResourceGroupArn")
     * .partitionNumber(123)
     * .spreadDomain("spreadDomain")
     * .tenancy("tenancy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html)
     */
    public inline fun cfnEC2FleetPlacementProperty(
        block: CfnEC2FleetPlacementPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.PlacementProperty {
        val builder = CfnEC2FleetPlacementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEC2Fleet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnEC2FleetProps cfnEC2FleetProps = CfnEC2FleetProps.builder()
     * .launchTemplateConfigs(List.of(FleetLaunchTemplateConfigRequestProperty.builder()
     * .launchTemplateSpecification(FleetLaunchTemplateSpecificationRequestProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * .overrides(List.of(FleetLaunchTemplateOverridesRequestProperty.builder()
     * .availabilityZone("availabilityZone")
     * .instanceRequirements(InstanceRequirementsRequestProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRangeRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .maxPrice("maxPrice")
     * .placement(PlacementProperty.builder()
     * .affinity("affinity")
     * .availabilityZone("availabilityZone")
     * .groupName("groupName")
     * .hostId("hostId")
     * .hostResourceGroupArn("hostResourceGroupArn")
     * .partitionNumber(123)
     * .spreadDomain("spreadDomain")
     * .tenancy("tenancy")
     * .build())
     * .priority(123)
     * .subnetId("subnetId")
     * .weightedCapacity(123)
     * .build()))
     * .build()))
     * .targetCapacitySpecification(TargetCapacitySpecificationRequestProperty.builder()
     * .totalTargetCapacity(123)
     * // the properties below are optional
     * .defaultTargetCapacityType("defaultTargetCapacityType")
     * .onDemandTargetCapacity(123)
     * .spotTargetCapacity(123)
     * .targetCapacityUnitType("targetCapacityUnitType")
     * .build())
     * // the properties below are optional
     * .context("context")
     * .excessCapacityTerminationPolicy("excessCapacityTerminationPolicy")
     * .onDemandOptions(OnDemandOptionsRequestProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .capacityReservationOptions(CapacityReservationOptionsRequestProperty.builder()
     * .usageStrategy("usageStrategy")
     * .build())
     * .maxTotalPrice("maxTotalPrice")
     * .minTargetCapacity(123)
     * .singleAvailabilityZone(false)
     * .singleInstanceType(false)
     * .build())
     * .replaceUnhealthyInstances(false)
     * .spotOptions(SpotOptionsRequestProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .instanceInterruptionBehavior("instanceInterruptionBehavior")
     * .instancePoolsToUseCount(123)
     * .maintenanceStrategies(MaintenanceStrategiesProperty.builder()
     * .capacityRebalance(CapacityRebalanceProperty.builder()
     * .replacementStrategy("replacementStrategy")
     * .terminationDelay(123)
     * .build())
     * .build())
     * .maxTotalPrice("maxTotalPrice")
     * .minTargetCapacity(123)
     * .singleAvailabilityZone(false)
     * .singleInstanceType(false)
     * .build())
     * .tagSpecifications(List.of(TagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * .terminateInstancesWithExpiration(false)
     * .type("type")
     * .validFrom("validFrom")
     * .validUntil("validUntil")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html)
     */
    public inline fun cfnEC2FleetProps(
        block: CfnEC2FleetPropsDsl.() -> Unit = {}
    ): CfnEC2FleetProps {
        val builder = CfnEC2FleetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration of Spot Instances for an EC2 Fleet.
     *
     * `SpotOptionsRequest` is a property of the
     * [AWS::EC2::EC2Fleet](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * SpotOptionsRequestProperty spotOptionsRequestProperty = SpotOptionsRequestProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .instanceInterruptionBehavior("instanceInterruptionBehavior")
     * .instancePoolsToUseCount(123)
     * .maintenanceStrategies(MaintenanceStrategiesProperty.builder()
     * .capacityRebalance(CapacityRebalanceProperty.builder()
     * .replacementStrategy("replacementStrategy")
     * .terminationDelay(123)
     * .build())
     * .build())
     * .maxTotalPrice("maxTotalPrice")
     * .minTargetCapacity(123)
     * .singleAvailabilityZone(false)
     * .singleInstanceType(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html)
     */
    public inline fun cfnEC2FleetSpotOptionsRequestProperty(
        block: CfnEC2FleetSpotOptionsRequestPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.SpotOptionsRequestProperty {
        val builder = CfnEC2FleetSpotOptionsRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the tags to apply to a resource when the resource is being created for an EC2
     * Fleet.
     *
     * `TagSpecification` is a property of the
     * [AWS::EC2::EC2Fleet](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * TagSpecificationProperty tagSpecificationProperty = TagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-tagspecification.html)
     */
    public inline fun cfnEC2FleetTagSpecificationProperty(
        block: CfnEC2FleetTagSpecificationPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.TagSpecificationProperty {
        val builder = CfnEC2FleetTagSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the number of units to request for an EC2 Fleet.
     *
     * You can choose to set the target capacity in terms of instances or a performance
     * characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
     * If the request type is `maintain` , you can specify a target capacity of `0` and add capacity
     * later.
     *
     * `TargetCapacitySpecificationRequest` is a property of the
     * [AWS::EC2::EC2Fleet](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * TargetCapacitySpecificationRequestProperty targetCapacitySpecificationRequestProperty =
     * TargetCapacitySpecificationRequestProperty.builder()
     * .totalTargetCapacity(123)
     * // the properties below are optional
     * .defaultTargetCapacityType("defaultTargetCapacityType")
     * .onDemandTargetCapacity(123)
     * .spotTargetCapacity(123)
     * .targetCapacityUnitType("targetCapacityUnitType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html)
     */
    public inline fun cfnEC2FleetTargetCapacitySpecificationRequestProperty(
        block: CfnEC2FleetTargetCapacitySpecificationRequestPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.TargetCapacitySpecificationRequestProperty {
        val builder = CfnEC2FleetTargetCapacitySpecificationRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum amount of total local storage, in GB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * TotalLocalStorageGBRequestProperty totalLocalStorageGBRequestProperty =
     * TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-totallocalstoragegbrequest.html)
     */
    public inline fun cfnEC2FleetTotalLocalStorageGBRequestProperty(
        block: CfnEC2FleetTotalLocalStorageGBRequestPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.TotalLocalStorageGBRequestProperty {
        val builder = CfnEC2FleetTotalLocalStorageGBRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum number of vCPUs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * VCpuCountRangeRequestProperty vCpuCountRangeRequestProperty =
     * VCpuCountRangeRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-vcpucountrangerequest.html)
     */
    public inline fun cfnEC2FleetVCpuCountRangeRequestProperty(
        block: CfnEC2FleetVCpuCountRangeRequestPropertyDsl.() -> Unit = {}
    ): CfnEC2Fleet.VCpuCountRangeRequestProperty {
        val builder = CfnEC2FleetVCpuCountRangeRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Elastic IP (EIP) address and can, optionally, associate it with an Amazon EC2
     * instance.
     *
     * You can allocate an Elastic IP address from an address pool owned by AWS or from an address
     * pool created from a public IPv4 address range that you have brought to AWS for use with your
     * AWS resources using bring your own IP addresses (BYOIP). For more information, see
     * [Bring Your Own IP Addresses (BYOIP)](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html)
     * in the *Amazon EC2 User Guide* .
     *
     * For more information, see
     * [Elastic IP Addresses](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Example:
     * ```
     * Listener listener;
     * CfnEIP eip;
     * listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
     * .endpoints(List.of(
     * CfnEipEndpoint.Builder.create(eip)
     * .weight(128)
     * .build()))
     * .build());
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html)
     */
    public inline fun cfnEIP(
        scope: Construct,
        id: String,
        block: CfnEIPDsl.() -> Unit = {},
    ): CfnEIP {
        val builder = CfnEIPDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates an Elastic IP address with an instance or a network interface.
     *
     * Before you can use an Elastic IP address, you must allocate it to your account. For more
     * information about working with Elastic IP addresses, see
     * [Elastic IP address concepts and rules](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-eips.html#vpc-eip-overview)
     * .
     *
     * You must specify `AllocationId` and either `InstanceId` , `NetworkInterfaceId` , or
     * `PrivateIpAddress` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnEIPAssociation cfnEIPAssociation = CfnEIPAssociation.Builder.create(this,
     * "MyCfnEIPAssociation")
     * .allocationId("allocationId")
     * .eip("eip")
     * .instanceId("instanceId")
     * .networkInterfaceId("networkInterfaceId")
     * .privateIpAddress("privateIpAddress")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html)
     */
    public inline fun cfnEIPAssociation(
        scope: Construct,
        id: String,
        block: CfnEIPAssociationDsl.() -> Unit = {},
    ): CfnEIPAssociation {
        val builder = CfnEIPAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEIPAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnEIPAssociationProps cfnEIPAssociationProps = CfnEIPAssociationProps.builder()
     * .allocationId("allocationId")
     * .eip("eip")
     * .instanceId("instanceId")
     * .networkInterfaceId("networkInterfaceId")
     * .privateIpAddress("privateIpAddress")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html)
     */
    public inline fun cfnEIPAssociationProps(
        block: CfnEIPAssociationPropsDsl.() -> Unit = {}
    ): CfnEIPAssociationProps {
        val builder = CfnEIPAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEIP`.
     *
     * Example:
     * ```
     * Instance instance;
     * HostedZone myZone;
     * CfnEIP elasticIp = CfnEIP.Builder.create(this, "EIP")
     * .domain("vpc")
     * .instanceId(instance.getInstanceId())
     * .build();
     * ARecord.Builder.create(this, "ARecord")
     * .zone(myZone)
     * .target(RecordTarget.fromIpAddresses(elasticIp.getRef()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html)
     */
    public inline fun cfnEIPProps(block: CfnEIPPropsDsl.() -> Unit = {}): CfnEIPProps {
        val builder = CfnEIPPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * [IPv6 only] Specifies an egress-only internet gateway for your VPC.
     *
     * An egress-only internet gateway is used to enable outbound communication over IPv6 from
     * instances in your VPC to the internet, and prevents hosts outside of your VPC from initiating
     * an IPv6 connection with your instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnEgressOnlyInternetGateway cfnEgressOnlyInternetGateway =
     * CfnEgressOnlyInternetGateway.Builder.create(this, "MyCfnEgressOnlyInternetGateway")
     * .vpcId("vpcId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html)
     */
    public inline fun cfnEgressOnlyInternetGateway(
        scope: Construct,
        id: String,
        block: CfnEgressOnlyInternetGatewayDsl.() -> Unit = {},
    ): CfnEgressOnlyInternetGateway {
        val builder = CfnEgressOnlyInternetGatewayDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEgressOnlyInternetGateway`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnEgressOnlyInternetGatewayProps cfnEgressOnlyInternetGatewayProps =
     * CfnEgressOnlyInternetGatewayProps.builder()
     * .vpcId("vpcId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html)
     */
    public inline fun cfnEgressOnlyInternetGatewayProps(
        block: CfnEgressOnlyInternetGatewayPropsDsl.() -> Unit = {}
    ): CfnEgressOnlyInternetGatewayProps {
        val builder = CfnEgressOnlyInternetGatewayPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates an AWS Identity and Access Management (IAM) role with an AWS Certificate Manager
     * (ACM) certificate.
     *
     * This enables the certificate to be used by the ACM for Nitro Enclaves application inside an
     * enclave. For more information, see
     * [AWS Certificate Manager for Nitro Enclaves](https://docs.aws.amazon.com/enclaves/latest/user/nitro-enclave-refapp.html)
     * in the *AWS Nitro Enclaves User Guide* .
     *
     * When the IAM role is associated with the ACM certificate, the certificate, certificate chain,
     * and encrypted private key are placed in an Amazon S3 location that only the associated IAM
     * role can access. The private key of the certificate is encrypted with an AWS managed key that
     * has an attached attestation-based key policy.
     *
     * To enable the IAM role to access the Amazon S3 object, you must grant it permission to call
     * `s3:GetObject` on the Amazon S3 bucket returned by the command. To enable the IAM role to
     * access the KMS key, you must grant it permission to call `kms:Decrypt` on the KMS key
     * returned by the command. For more information, see
     * [Grant the role permission to access the certificate and encryption key](https://docs.aws.amazon.com/enclaves/latest/user/nitro-enclave-refapp.html#add-policy)
     * in the *AWS Nitro Enclaves User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnEnclaveCertificateIamRoleAssociation cfnEnclaveCertificateIamRoleAssociation =
     * CfnEnclaveCertificateIamRoleAssociation.Builder.create(this,
     * "MyCfnEnclaveCertificateIamRoleAssociation")
     * .certificateArn("certificateArn")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-enclavecertificateiamroleassociation.html)
     */
    public inline fun cfnEnclaveCertificateIamRoleAssociation(
        scope: Construct,
        id: String,
        block: CfnEnclaveCertificateIamRoleAssociationDsl.() -> Unit = {},
    ): CfnEnclaveCertificateIamRoleAssociation {
        val builder = CfnEnclaveCertificateIamRoleAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEnclaveCertificateIamRoleAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnEnclaveCertificateIamRoleAssociationProps cfnEnclaveCertificateIamRoleAssociationProps =
     * CfnEnclaveCertificateIamRoleAssociationProps.builder()
     * .certificateArn("certificateArn")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-enclavecertificateiamroleassociation.html)
     */
    public inline fun cfnEnclaveCertificateIamRoleAssociationProps(
        block: CfnEnclaveCertificateIamRoleAssociationPropsDsl.() -> Unit = {}
    ): CfnEnclaveCertificateIamRoleAssociationProps {
        val builder = CfnEnclaveCertificateIamRoleAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a VPC flow log that captures IP traffic for a specified network interface, subnet,
     * or VPC.
     *
     * To view the log data, use Amazon CloudWatch Logs (CloudWatch Logs) to help troubleshoot
     * connection issues. For example, you can use a flow log to investigate why certain traffic
     * isn't reaching an instance, which can help you diagnose overly restrictive security group
     * rules. For more information, see
     * [VPC Flow Logs](https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html) in the
     * *Amazon VPC User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * Object destinationOptions;
     * CfnFlowLog cfnFlowLog = CfnFlowLog.Builder.create(this, "MyCfnFlowLog")
     * .resourceId("resourceId")
     * .resourceType("resourceType")
     * // the properties below are optional
     * .deliverLogsPermissionArn("deliverLogsPermissionArn")
     * .destinationOptions(destinationOptions)
     * .logDestination("logDestination")
     * .logDestinationType("logDestinationType")
     * .logFormat("logFormat")
     * .logGroupName("logGroupName")
     * .maxAggregationInterval(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .trafficType("trafficType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html)
     */
    public inline fun cfnFlowLog(
        scope: Construct,
        id: String,
        block: CfnFlowLogDsl.() -> Unit = {},
    ): CfnFlowLog {
        val builder = CfnFlowLogDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the destination options for a flow log.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * DestinationOptionsProperty destinationOptionsProperty = DestinationOptionsProperty.builder()
     * .fileFormat("fileFormat")
     * .hiveCompatiblePartitions(false)
     * .perHourPartition(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-flowlog-destinationoptions.html)
     */
    public inline fun cfnFlowLogDestinationOptionsProperty(
        block: CfnFlowLogDestinationOptionsPropertyDsl.() -> Unit = {}
    ): CfnFlowLog.DestinationOptionsProperty {
        val builder = CfnFlowLogDestinationOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFlowLog`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * Object destinationOptions;
     * CfnFlowLogProps cfnFlowLogProps = CfnFlowLogProps.builder()
     * .resourceId("resourceId")
     * .resourceType("resourceType")
     * // the properties below are optional
     * .deliverLogsPermissionArn("deliverLogsPermissionArn")
     * .destinationOptions(destinationOptions)
     * .logDestination("logDestination")
     * .logDestinationType("logDestinationType")
     * .logFormat("logFormat")
     * .logGroupName("logGroupName")
     * .maxAggregationInterval(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .trafficType("trafficType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html)
     */
    public inline fun cfnFlowLogProps(block: CfnFlowLogPropsDsl.() -> Unit = {}): CfnFlowLogProps {
        val builder = CfnFlowLogPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates a virtual private gateway or internet gateway with a route table.
     *
     * The gateway and route table must be in the same VPC. This association causes the incoming
     * traffic to the gateway to be routed according to the routes in the route table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnGatewayRouteTableAssociation cfnGatewayRouteTableAssociation =
     * CfnGatewayRouteTableAssociation.Builder.create(this, "MyCfnGatewayRouteTableAssociation")
     * .gatewayId("gatewayId")
     * .routeTableId("routeTableId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html)
     */
    public inline fun cfnGatewayRouteTableAssociation(
        scope: Construct,
        id: String,
        block: CfnGatewayRouteTableAssociationDsl.() -> Unit = {},
    ): CfnGatewayRouteTableAssociation {
        val builder = CfnGatewayRouteTableAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGatewayRouteTableAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnGatewayRouteTableAssociationProps cfnGatewayRouteTableAssociationProps =
     * CfnGatewayRouteTableAssociationProps.builder()
     * .gatewayId("gatewayId")
     * .routeTableId("routeTableId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html)
     */
    public inline fun cfnGatewayRouteTableAssociationProps(
        block: CfnGatewayRouteTableAssociationPropsDsl.() -> Unit = {}
    ): CfnGatewayRouteTableAssociationProps {
        val builder = CfnGatewayRouteTableAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Allocates a fully dedicated physical server for launching EC2 instances.
     *
     * Because the host is fully dedicated for your use, it can help you address compliance
     * requirements and reduce costs by allowing you to use your existing server-bound software
     * licenses. For more information, see
     * [Dedicated Hosts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-overview.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnHost cfnHost = CfnHost.Builder.create(this, "MyCfnHost")
     * .availabilityZone("availabilityZone")
     * // the properties below are optional
     * .assetId("assetId")
     * .autoPlacement("autoPlacement")
     * .hostMaintenance("hostMaintenance")
     * .hostRecovery("hostRecovery")
     * .instanceFamily("instanceFamily")
     * .instanceType("instanceType")
     * .outpostArn("outpostArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html)
     */
    public inline fun cfnHost(
        scope: Construct,
        id: String,
        block: CfnHostDsl.() -> Unit = {},
    ): CfnHost {
        val builder = CfnHostDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnHost`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnHostProps cfnHostProps = CfnHostProps.builder()
     * .availabilityZone("availabilityZone")
     * // the properties below are optional
     * .assetId("assetId")
     * .autoPlacement("autoPlacement")
     * .hostMaintenance("hostMaintenance")
     * .hostRecovery("hostRecovery")
     * .instanceFamily("instanceFamily")
     * .instanceType("instanceType")
     * .outpostArn("outpostArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html)
     */
    public inline fun cfnHostProps(block: CfnHostPropsDsl.() -> Unit = {}): CfnHostProps {
        val builder = CfnHostPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * IPAM is a VPC feature that you can use to automate your IP address management workflows
     * including assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions
     * and accounts throughout your AWS Organization.
     *
     * For more information, see
     * [What is IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the
     * *Amazon VPC IPAM User Guide* .
     *
     * There are AWS Identity and Access Management (IAM) permissions required to fully manage an
     * IPAM in CloudFormation. For more information, see
     * [Example policy](https://docs.aws.amazon.com//vpc/latest/ipam/iam-ipam-policy-examples.html)
     * in the *Amazon VPC IPAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnIPAM cfnIPAM = CfnIPAM.Builder.create(this, "MyCfnIPAM")
     * .defaultResourceDiscoveryAssociationId("defaultResourceDiscoveryAssociationId")
     * .defaultResourceDiscoveryId("defaultResourceDiscoveryId")
     * .description("description")
     * .operatingRegions(List.of(IpamOperatingRegionProperty.builder()
     * .regionName("regionName")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html)
     */
    public inline fun cfnIPAM(
        scope: Construct,
        id: String,
        block: CfnIPAMDsl.() -> Unit = {},
    ): CfnIPAM {
        val builder = CfnIPAMDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * In IPAM, an allocation is a CIDR assignment from an IPAM pool to another IPAM pool or to a
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnIPAMAllocation cfnIPAMAllocation = CfnIPAMAllocation.Builder.create(this,
     * "MyCfnIPAMAllocation")
     * .ipamPoolId("ipamPoolId")
     * // the properties below are optional
     * .cidr("cidr")
     * .description("description")
     * .netmaskLength(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html)
     */
    public inline fun cfnIPAMAllocation(
        scope: Construct,
        id: String,
        block: CfnIPAMAllocationDsl.() -> Unit = {},
    ): CfnIPAMAllocation {
        val builder = CfnIPAMAllocationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIPAMAllocation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnIPAMAllocationProps cfnIPAMAllocationProps = CfnIPAMAllocationProps.builder()
     * .ipamPoolId("ipamPoolId")
     * // the properties below are optional
     * .cidr("cidr")
     * .description("description")
     * .netmaskLength(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html)
     */
    public inline fun cfnIPAMAllocationProps(
        block: CfnIPAMAllocationPropsDsl.() -> Unit = {}
    ): CfnIPAMAllocationProps {
        val builder = CfnIPAMAllocationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The operating Regions for an IPAM.
     *
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * For more information about operating Regions, see
     * [Create an IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the
     * *Amazon VPC IPAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * IpamOperatingRegionProperty ipamOperatingRegionProperty = IpamOperatingRegionProperty.builder()
     * .regionName("regionName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipam-ipamoperatingregion.html)
     */
    public inline fun cfnIPAMIpamOperatingRegionProperty(
        block: CfnIPAMIpamOperatingRegionPropertyDsl.() -> Unit = {}
    ): CfnIPAM.IpamOperatingRegionProperty {
        val builder = CfnIPAMIpamOperatingRegionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * In IPAM, a pool is a collection of contiguous IP addresses CIDRs.
     *
     * Pools enable you to organize your IP addresses according to your routing and security needs.
     * For example, if you have separate routing and security needs for development and production
     * applications, you can create a pool for each.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnIPAMPool cfnIPAMPool = CfnIPAMPool.Builder.create(this, "MyCfnIPAMPool")
     * .addressFamily("addressFamily")
     * .ipamScopeId("ipamScopeId")
     * // the properties below are optional
     * .allocationDefaultNetmaskLength(123)
     * .allocationMaxNetmaskLength(123)
     * .allocationMinNetmaskLength(123)
     * .allocationResourceTags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .autoImport(false)
     * .awsService("awsService")
     * .description("description")
     * .locale("locale")
     * .provisionedCidrs(List.of(ProvisionedCidrProperty.builder()
     * .cidr("cidr")
     * .build()))
     * .publicIpSource("publicIpSource")
     * .publiclyAdvertisable(false)
     * .sourceIpamPoolId("sourceIpamPoolId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html)
     */
    public inline fun cfnIPAMPool(
        scope: Construct,
        id: String,
        block: CfnIPAMPoolDsl.() -> Unit = {},
    ): CfnIPAMPool {
        val builder = CfnIPAMPoolDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A CIDR provisioned to an IPAM pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnIPAMPoolCidr cfnIPAMPoolCidr = CfnIPAMPoolCidr.Builder.create(this, "MyCfnIPAMPoolCidr")
     * .ipamPoolId("ipamPoolId")
     * // the properties below are optional
     * .cidr("cidr")
     * .netmaskLength(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html)
     */
    public inline fun cfnIPAMPoolCidr(
        scope: Construct,
        id: String,
        block: CfnIPAMPoolCidrDsl.() -> Unit = {},
    ): CfnIPAMPoolCidr {
        val builder = CfnIPAMPoolCidrDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIPAMPoolCidr`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnIPAMPoolCidrProps cfnIPAMPoolCidrProps = CfnIPAMPoolCidrProps.builder()
     * .ipamPoolId("ipamPoolId")
     * // the properties below are optional
     * .cidr("cidr")
     * .netmaskLength(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html)
     */
    public inline fun cfnIPAMPoolCidrProps(
        block: CfnIPAMPoolCidrPropsDsl.() -> Unit = {}
    ): CfnIPAMPoolCidrProps {
        val builder = CfnIPAMPoolCidrPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIPAMPool`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnIPAMPoolProps cfnIPAMPoolProps = CfnIPAMPoolProps.builder()
     * .addressFamily("addressFamily")
     * .ipamScopeId("ipamScopeId")
     * // the properties below are optional
     * .allocationDefaultNetmaskLength(123)
     * .allocationMaxNetmaskLength(123)
     * .allocationMinNetmaskLength(123)
     * .allocationResourceTags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .autoImport(false)
     * .awsService("awsService")
     * .description("description")
     * .locale("locale")
     * .provisionedCidrs(List.of(ProvisionedCidrProperty.builder()
     * .cidr("cidr")
     * .build()))
     * .publicIpSource("publicIpSource")
     * .publiclyAdvertisable(false)
     * .sourceIpamPoolId("sourceIpamPoolId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html)
     */
    public inline fun cfnIPAMPoolProps(
        block: CfnIPAMPoolPropsDsl.() -> Unit = {}
    ): CfnIPAMPoolProps {
        val builder = CfnIPAMPoolPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The CIDR provisioned to the IPAM pool.
     *
     * A CIDR is a representation of an IP address and its associated network mask (or netmask) and
     * refers to a range of IP addresses. An IPv4 CIDR example is `10.24.34.0/23` . An IPv6 CIDR
     * example is `2001:DB8::/32` .
     *
     * This resource type does not allow you to provision a CIDR using the netmask length. To
     * provision a CIDR using netmask length, use
     * [AWS::EC2::IPAMPoolCidr](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ProvisionedCidrProperty provisionedCidrProperty = ProvisionedCidrProperty.builder()
     * .cidr("cidr")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipampool-provisionedcidr.html)
     */
    public inline fun cfnIPAMPoolProvisionedCidrProperty(
        block: CfnIPAMPoolProvisionedCidrPropertyDsl.() -> Unit = {}
    ): CfnIPAMPool.ProvisionedCidrProperty {
        val builder = CfnIPAMPoolProvisionedCidrPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIPAM`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnIPAMProps cfnIPAMProps = CfnIPAMProps.builder()
     * .defaultResourceDiscoveryAssociationId("defaultResourceDiscoveryAssociationId")
     * .defaultResourceDiscoveryId("defaultResourceDiscoveryId")
     * .description("description")
     * .operatingRegions(List.of(IpamOperatingRegionProperty.builder()
     * .regionName("regionName")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html)
     */
    public inline fun cfnIPAMProps(block: CfnIPAMPropsDsl.() -> Unit = {}): CfnIPAMProps {
        val builder = CfnIPAMPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A resource discovery is an IPAM component that enables IPAM to manage and monitor resources
     * that belong to the owning account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnIPAMResourceDiscovery cfnIPAMResourceDiscovery =
     * CfnIPAMResourceDiscovery.Builder.create(this, "MyCfnIPAMResourceDiscovery")
     * .description("description")
     * .operatingRegions(List.of(IpamOperatingRegionProperty.builder()
     * .regionName("regionName")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html)
     */
    public inline fun cfnIPAMResourceDiscovery(
        scope: Construct,
        id: String,
        block: CfnIPAMResourceDiscoveryDsl.() -> Unit = {},
    ): CfnIPAMResourceDiscovery {
        val builder = CfnIPAMResourceDiscoveryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An IPAM resource discovery association.
     *
     * An associated resource discovery is a resource discovery that has been associated with an
     * IPAM. IPAM aggregates the resource CIDRs discovered by the associated resource discovery.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnIPAMResourceDiscoveryAssociation cfnIPAMResourceDiscoveryAssociation =
     * CfnIPAMResourceDiscoveryAssociation.Builder.create(this, "MyCfnIPAMResourceDiscoveryAssociation")
     * .ipamId("ipamId")
     * .ipamResourceDiscoveryId("ipamResourceDiscoveryId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html)
     */
    public inline fun cfnIPAMResourceDiscoveryAssociation(
        scope: Construct,
        id: String,
        block: CfnIPAMResourceDiscoveryAssociationDsl.() -> Unit = {},
    ): CfnIPAMResourceDiscoveryAssociation {
        val builder = CfnIPAMResourceDiscoveryAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIPAMResourceDiscoveryAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnIPAMResourceDiscoveryAssociationProps cfnIPAMResourceDiscoveryAssociationProps =
     * CfnIPAMResourceDiscoveryAssociationProps.builder()
     * .ipamId("ipamId")
     * .ipamResourceDiscoveryId("ipamResourceDiscoveryId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html)
     */
    public inline fun cfnIPAMResourceDiscoveryAssociationProps(
        block: CfnIPAMResourceDiscoveryAssociationPropsDsl.() -> Unit = {}
    ): CfnIPAMResourceDiscoveryAssociationProps {
        val builder = CfnIPAMResourceDiscoveryAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The operating Regions for an IPAM.
     *
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * For more information about operating Regions, see
     * [Create an IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the
     * *Amazon VPC IPAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * IpamOperatingRegionProperty ipamOperatingRegionProperty = IpamOperatingRegionProperty.builder()
     * .regionName("regionName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipamresourcediscovery-ipamoperatingregion.html)
     */
    public inline fun cfnIPAMResourceDiscoveryIpamOperatingRegionProperty(
        block: CfnIPAMResourceDiscoveryIpamOperatingRegionPropertyDsl.() -> Unit = {}
    ): CfnIPAMResourceDiscovery.IpamOperatingRegionProperty {
        val builder = CfnIPAMResourceDiscoveryIpamOperatingRegionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIPAMResourceDiscovery`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnIPAMResourceDiscoveryProps cfnIPAMResourceDiscoveryProps =
     * CfnIPAMResourceDiscoveryProps.builder()
     * .description("description")
     * .operatingRegions(List.of(IpamOperatingRegionProperty.builder()
     * .regionName("regionName")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html)
     */
    public inline fun cfnIPAMResourceDiscoveryProps(
        block: CfnIPAMResourceDiscoveryPropsDsl.() -> Unit = {}
    ): CfnIPAMResourceDiscoveryProps {
        val builder = CfnIPAMResourceDiscoveryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * In IPAM, a scope is the highest-level container within IPAM.
     *
     * An IPAM contains two default scopes. Each scope represents the IP space for a single network.
     * The private scope is intended for all private IP address space. The public scope is intended
     * for all public IP address space. Scopes enable you to reuse IP addresses across multiple
     * unconnected networks without causing IP address overlap or conflict.
     *
     * For more information, see
     * [How IPAM works](https://docs.aws.amazon.com//vpc/latest/ipam/how-it-works-ipam.html) in the
     * *Amazon VPC IPAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnIPAMScope cfnIPAMScope = CfnIPAMScope.Builder.create(this, "MyCfnIPAMScope")
     * .ipamId("ipamId")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamscope.html)
     */
    public inline fun cfnIPAMScope(
        scope: Construct,
        id: String,
        block: CfnIPAMScopeDsl.() -> Unit = {},
    ): CfnIPAMScope {
        val builder = CfnIPAMScopeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIPAMScope`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnIPAMScopeProps cfnIPAMScopeProps = CfnIPAMScopeProps.builder()
     * .ipamId("ipamId")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamscope.html)
     */
    public inline fun cfnIPAMScopeProps(
        block: CfnIPAMScopePropsDsl.() -> Unit = {}
    ): CfnIPAMScopeProps {
        val builder = CfnIPAMScopePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an EC2 instance.
     *
     * If an Elastic IP address is attached to your instance, AWS CloudFormation reattaches the
     * Elastic IP address after it updates the instance. For more information about updating stacks,
     * see
     * [AWS CloudFormation Stacks Updates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnInstance cfnInstance = CfnInstance.Builder.create(this, "MyCfnInstance")
     * .additionalInfo("additionalInfo")
     * .affinity("affinity")
     * .availabilityZone("availabilityZone")
     * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * // the properties below are optional
     * .ebs(EbsProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .snapshotId("snapshotId")
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice(NoDeviceProperty.builder().build())
     * .virtualName("virtualName")
     * .build()))
     * .cpuOptions(CpuOptionsProperty.builder()
     * .coreCount(123)
     * .threadsPerCore(123)
     * .build())
     * .creditSpecification(CreditSpecificationProperty.builder()
     * .cpuCredits("cpuCredits")
     * .build())
     * .disableApiTermination(false)
     * .ebsOptimized(false)
     * .elasticGpuSpecifications(List.of(ElasticGpuSpecificationProperty.builder()
     * .type("type")
     * .build()))
     * .elasticInferenceAccelerators(List.of(ElasticInferenceAcceleratorProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .count(123)
     * .build()))
     * .enclaveOptions(EnclaveOptionsProperty.builder()
     * .enabled(false)
     * .build())
     * .hibernationOptions(HibernationOptionsProperty.builder()
     * .configured(false)
     * .build())
     * .hostId("hostId")
     * .hostResourceGroupArn("hostResourceGroupArn")
     * .iamInstanceProfile("iamInstanceProfile")
     * .imageId("imageId")
     * .instanceInitiatedShutdownBehavior("instanceInitiatedShutdownBehavior")
     * .instanceType("instanceType")
     * .ipv6AddressCount(123)
     * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build()))
     * .kernelId("kernelId")
     * .keyName("keyName")
     * .launchTemplate(LaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * .licenseSpecifications(List.of(LicenseSpecificationProperty.builder()
     * .licenseConfigurationArn("licenseConfigurationArn")
     * .build()))
     * .monitoring(false)
     * .networkInterfaces(List.of(NetworkInterfaceProperty.builder()
     * .deviceIndex("deviceIndex")
     * // the properties below are optional
     * .associateCarrierIpAddress(false)
     * .associatePublicIpAddress(false)
     * .deleteOnTermination(false)
     * .description("description")
     * .groupSet(List.of("groupSet"))
     * .ipv6AddressCount(123)
     * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build()))
     * .networkInterfaceId("networkInterfaceId")
     * .privateIpAddress("privateIpAddress")
     * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
     * .primary(false)
     * .privateIpAddress("privateIpAddress")
     * .build()))
     * .secondaryPrivateIpAddressCount(123)
     * .subnetId("subnetId")
     * .build()))
     * .placementGroupName("placementGroupName")
     * .privateDnsNameOptions(PrivateDnsNameOptionsProperty.builder()
     * .enableResourceNameDnsAaaaRecord(false)
     * .enableResourceNameDnsARecord(false)
     * .hostnameType("hostnameType")
     * .build())
     * .privateIpAddress("privateIpAddress")
     * .propagateTagsToVolumeOnCreation(false)
     * .ramdiskId("ramdiskId")
     * .securityGroupIds(List.of("securityGroupIds"))
     * .securityGroups(List.of("securityGroups"))
     * .sourceDestCheck(false)
     * .ssmAssociations(List.of(SsmAssociationProperty.builder()
     * .documentName("documentName")
     * // the properties below are optional
     * .associationParameters(List.of(AssociationParameterProperty.builder()
     * .key("key")
     * .value(List.of("value"))
     * .build()))
     * .build()))
     * .subnetId("subnetId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tenancy("tenancy")
     * .userData("userData")
     * .volumes(List.of(VolumeProperty.builder()
     * .device("device")
     * .volumeId("volumeId")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html)
     */
    public inline fun cfnInstance(
        scope: Construct,
        id: String,
        block: CfnInstanceDsl.() -> Unit = {},
    ): CfnInstance {
        val builder = CfnInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies input parameter values for an SSM document in AWS Systems Manager .
     *
     * `AssociationParameter` is a property of the
     * [Amazon EC2 Instance SsmAssociation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html)
     * property.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AssociationParameterProperty associationParameterProperty =
     * AssociationParameterProperty.builder()
     * .key("key")
     * .value(List.of("value"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-associationparameter.html)
     */
    public inline fun cfnInstanceAssociationParameterProperty(
        block: CfnInstanceAssociationParameterPropertyDsl.() -> Unit = {}
    ): CfnInstance.AssociationParameterProperty {
        val builder = CfnInstanceAssociationParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a block device mapping for an instance.
     *
     * You must specify exactly one of the following properties: `VirtualName` , `Ebs` , or
     * `NoDevice` .
     *
     * `BlockDeviceMapping` is a property of the
     * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     * resource.
     *
     * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
     * the attached volumes without interrupting the instance. Modifying any other parameter results
     * in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * BlockDeviceMappingProperty blockDeviceMappingProperty = BlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * // the properties below are optional
     * .ebs(EbsProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .snapshotId("snapshotId")
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice(NoDeviceProperty.builder().build())
     * .virtualName("virtualName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-blockdevicemapping.html)
     */
    public inline fun cfnInstanceBlockDeviceMappingProperty(
        block: CfnInstanceBlockDeviceMappingPropertyDsl.() -> Unit = {}
    ): CfnInstance.BlockDeviceMappingProperty {
        val builder = CfnInstanceBlockDeviceMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the CPU options for the instance.
     *
     * When you specify CPU options, you must specify both the number of CPU cores and threads per
     * core.
     *
     * Modifying the CPU options for an instance results in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * For more information, see
     * [Optimize CPU options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html)
     * in the *Amazon Elastic Compute Cloud User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CpuOptionsProperty cpuOptionsProperty = CpuOptionsProperty.builder()
     * .coreCount(123)
     * .threadsPerCore(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-cpuoptions.html)
     */
    public inline fun cfnInstanceCpuOptionsProperty(
        block: CfnInstanceCpuOptionsPropertyDsl.() -> Unit = {}
    ): CfnInstance.CpuOptionsProperty {
        val builder = CfnInstanceCpuOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the credit option for CPU usage of a T instance.
     *
     * `CreditSpecification` is a property of the
     * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     * resource.
     *
     * For more information, see
     * [Burstable performance instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CreditSpecificationProperty creditSpecificationProperty = CreditSpecificationProperty.builder()
     * .cpuCredits("cpuCredits")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html)
     */
    public inline fun cfnInstanceCreditSpecificationProperty(
        block: CfnInstanceCreditSpecificationPropertyDsl.() -> Unit = {}
    ): CfnInstance.CreditSpecificationProperty {
        val builder = CfnInstanceCreditSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a block device for an EBS volume.
     *
     * `Ebs` is a property of the
     * [Amazon EC2 BlockDeviceMapping](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html)
     * property.
     *
     * After the instance is running, you can modify only the `DeleteOnTermination` parameters for
     * the attached volumes without interrupting the instance. Modifying any other parameter results
     * in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * EbsProperty ebsProperty = EbsProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .snapshotId("snapshotId")
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ebs.html)
     */
    public inline fun cfnInstanceEbsProperty(
        block: CfnInstanceEbsPropertyDsl.() -> Unit = {}
    ): CfnInstance.EbsProperty {
        val builder = CfnInstanceEbsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the type of Elastic GPU.
     *
     * An Elastic GPU is a GPU resource that you can attach to your Amazon EC2 instance to
     * accelerate the graphics performance of your applications. For more information, see
     * [Amazon EC2 Elastic GPUs](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html)
     * in the *Amazon EC2 User Guide for Windows Instances* .
     *
     * `ElasticGpuSpecification` is a property of the
     * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ElasticGpuSpecificationProperty elasticGpuSpecificationProperty =
     * ElasticGpuSpecificationProperty.builder()
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticgpuspecification.html)
     */
    public inline fun cfnInstanceElasticGpuSpecificationProperty(
        block: CfnInstanceElasticGpuSpecificationPropertyDsl.() -> Unit = {}
    ): CfnInstance.ElasticGpuSpecificationProperty {
        val builder = CfnInstanceElasticGpuSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the Elastic Inference Accelerator for the instance.
     *
     * `ElasticInferenceAccelerator` is a property of the
     * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ElasticInferenceAcceleratorProperty elasticInferenceAcceleratorProperty =
     * ElasticInferenceAcceleratorProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .count(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticinferenceaccelerator.html)
     */
    public inline fun cfnInstanceElasticInferenceAcceleratorProperty(
        block: CfnInstanceElasticInferenceAcceleratorPropertyDsl.() -> Unit = {}
    ): CfnInstance.ElasticInferenceAcceleratorProperty {
        val builder = CfnInstanceElasticInferenceAcceleratorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Indicates whether the instance is enabled for AWS Nitro Enclaves.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * EnclaveOptionsProperty enclaveOptionsProperty = EnclaveOptionsProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-enclaveoptions.html)
     */
    public inline fun cfnInstanceEnclaveOptionsProperty(
        block: CfnInstanceEnclaveOptionsPropertyDsl.() -> Unit = {}
    ): CfnInstance.EnclaveOptionsProperty {
        val builder = CfnInstanceEnclaveOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the hibernation options for the instance.
     *
     * `HibernationOptions` is a property of the
     * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * HibernationOptionsProperty hibernationOptionsProperty = HibernationOptionsProperty.builder()
     * .configured(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-hibernationoptions.html)
     */
    public inline fun cfnInstanceHibernationOptionsProperty(
        block: CfnInstanceHibernationOptionsPropertyDsl.() -> Unit = {}
    ): CfnInstance.HibernationOptionsProperty {
        val builder = CfnInstanceHibernationOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the IPv6 address for the instance.
     *
     * `InstanceIpv6Address` is a property of the
     * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * InstanceIpv6AddressProperty instanceIpv6AddressProperty = InstanceIpv6AddressProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-instanceipv6address.html)
     */
    public inline fun cfnInstanceInstanceIpv6AddressProperty(
        block: CfnInstanceInstanceIpv6AddressPropertyDsl.() -> Unit = {}
    ): CfnInstance.InstanceIpv6AddressProperty {
        val builder = CfnInstanceInstanceIpv6AddressPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a launch template to use when launching an Amazon EC2 instance.
     *
     * You must specify the following:
     * * The ID or the name of the launch template, but not both.
     * * The version of the launch template.
     *
     * `LaunchTemplateSpecification` is a property of the
     * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     * resource.
     *
     * For information about creating a launch template, see
     * [AWS::EC2::LaunchTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
     * and
     * [Create a launch template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
     * in the *Amazon EC2 User Guide* .
     *
     * For examples of launch templates, see
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#aws-resource-ec2-launchtemplate--examples)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * LaunchTemplateSpecificationProperty launchTemplateSpecificationProperty =
     * LaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html)
     */
    public inline fun cfnInstanceLaunchTemplateSpecificationProperty(
        block: CfnInstanceLaunchTemplateSpecificationPropertyDsl.() -> Unit = {}
    ): CfnInstance.LaunchTemplateSpecificationProperty {
        val builder = CfnInstanceLaunchTemplateSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the license configuration to use.
     *
     * `LicenseSpecification` is a property of the
     * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * LicenseSpecificationProperty licenseSpecificationProperty =
     * LicenseSpecificationProperty.builder()
     * .licenseConfigurationArn("licenseConfigurationArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-licensespecification.html)
     */
    public inline fun cfnInstanceLicenseSpecificationProperty(
        block: CfnInstanceLicenseSpecificationPropertyDsl.() -> Unit = {}
    ): CfnInstance.LicenseSpecificationProperty {
        val builder = CfnInstanceLicenseSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a network interface that is to be attached to an instance.
     *
     * You can create a network interface when launching an instance. For an example, see the
     * [AWS::EC2::Instance examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#aws-properties-ec2-instance--examples--Automatically_assign_a_public_IP_address)
     * .
     *
     * Alternatively, you can attach an existing network interface when launching an instance. For
     * an example, see the
     * [AWS::EC2:NetworkInterface examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#aws-resource-ec2-networkinterface--examples)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * NetworkInterfaceProperty networkInterfaceProperty = NetworkInterfaceProperty.builder()
     * .deviceIndex("deviceIndex")
     * // the properties below are optional
     * .associateCarrierIpAddress(false)
     * .associatePublicIpAddress(false)
     * .deleteOnTermination(false)
     * .description("description")
     * .groupSet(List.of("groupSet"))
     * .ipv6AddressCount(123)
     * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build()))
     * .networkInterfaceId("networkInterfaceId")
     * .privateIpAddress("privateIpAddress")
     * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
     * .primary(false)
     * .privateIpAddress("privateIpAddress")
     * .build()))
     * .secondaryPrivateIpAddressCount(123)
     * .subnetId("subnetId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html)
     */
    public inline fun cfnInstanceNetworkInterfaceProperty(
        block: CfnInstanceNetworkInterfacePropertyDsl.() -> Unit = {}
    ): CfnInstance.NetworkInterfaceProperty {
        val builder = CfnInstanceNetworkInterfacePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Suppresses the specified device included in the block device mapping of the AMI.
     *
     * To suppress a device, specify an empty string.
     *
     * `NoDevice` is a property of the
     * [Amazon EC2 BlockDeviceMapping](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html)
     * property.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * NoDeviceProperty noDeviceProperty = NoDeviceProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-nodevice.html)
     */
    public inline fun cfnInstanceNoDeviceProperty(
        block: CfnInstanceNoDevicePropertyDsl.() -> Unit = {}
    ): CfnInstance.NoDeviceProperty {
        val builder = CfnInstanceNoDevicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The type of hostnames to assign to instances in the subnet at launch.
     *
     * For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For
     * IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
     * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
     * For more information, see
     * [Amazon EC2 instance hostname types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html)
     * in the *Amazon Elastic Compute Cloud User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PrivateDnsNameOptionsProperty privateDnsNameOptionsProperty =
     * PrivateDnsNameOptionsProperty.builder()
     * .enableResourceNameDnsAaaaRecord(false)
     * .enableResourceNameDnsARecord(false)
     * .hostnameType("hostnameType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-privatednsnameoptions.html)
     */
    public inline fun cfnInstancePrivateDnsNameOptionsProperty(
        block: CfnInstancePrivateDnsNameOptionsPropertyDsl.() -> Unit = {}
    ): CfnInstance.PrivateDnsNameOptionsProperty {
        val builder = CfnInstancePrivateDnsNameOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a secondary private IPv4 address for a network interface.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PrivateIpAddressSpecificationProperty privateIpAddressSpecificationProperty =
     * PrivateIpAddressSpecificationProperty.builder()
     * .primary(false)
     * .privateIpAddress("privateIpAddress")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-privateipaddressspecification.html)
     */
    public inline fun cfnInstancePrivateIpAddressSpecificationProperty(
        block: CfnInstancePrivateIpAddressSpecificationPropertyDsl.() -> Unit = {}
    ): CfnInstance.PrivateIpAddressSpecificationProperty {
        val builder = CfnInstancePrivateIpAddressSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnInstance`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnInstanceProps cfnInstanceProps = CfnInstanceProps.builder()
     * .additionalInfo("additionalInfo")
     * .affinity("affinity")
     * .availabilityZone("availabilityZone")
     * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * // the properties below are optional
     * .ebs(EbsProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .snapshotId("snapshotId")
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice(NoDeviceProperty.builder().build())
     * .virtualName("virtualName")
     * .build()))
     * .cpuOptions(CpuOptionsProperty.builder()
     * .coreCount(123)
     * .threadsPerCore(123)
     * .build())
     * .creditSpecification(CreditSpecificationProperty.builder()
     * .cpuCredits("cpuCredits")
     * .build())
     * .disableApiTermination(false)
     * .ebsOptimized(false)
     * .elasticGpuSpecifications(List.of(ElasticGpuSpecificationProperty.builder()
     * .type("type")
     * .build()))
     * .elasticInferenceAccelerators(List.of(ElasticInferenceAcceleratorProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .count(123)
     * .build()))
     * .enclaveOptions(EnclaveOptionsProperty.builder()
     * .enabled(false)
     * .build())
     * .hibernationOptions(HibernationOptionsProperty.builder()
     * .configured(false)
     * .build())
     * .hostId("hostId")
     * .hostResourceGroupArn("hostResourceGroupArn")
     * .iamInstanceProfile("iamInstanceProfile")
     * .imageId("imageId")
     * .instanceInitiatedShutdownBehavior("instanceInitiatedShutdownBehavior")
     * .instanceType("instanceType")
     * .ipv6AddressCount(123)
     * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build()))
     * .kernelId("kernelId")
     * .keyName("keyName")
     * .launchTemplate(LaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * .licenseSpecifications(List.of(LicenseSpecificationProperty.builder()
     * .licenseConfigurationArn("licenseConfigurationArn")
     * .build()))
     * .monitoring(false)
     * .networkInterfaces(List.of(NetworkInterfaceProperty.builder()
     * .deviceIndex("deviceIndex")
     * // the properties below are optional
     * .associateCarrierIpAddress(false)
     * .associatePublicIpAddress(false)
     * .deleteOnTermination(false)
     * .description("description")
     * .groupSet(List.of("groupSet"))
     * .ipv6AddressCount(123)
     * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build()))
     * .networkInterfaceId("networkInterfaceId")
     * .privateIpAddress("privateIpAddress")
     * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
     * .primary(false)
     * .privateIpAddress("privateIpAddress")
     * .build()))
     * .secondaryPrivateIpAddressCount(123)
     * .subnetId("subnetId")
     * .build()))
     * .placementGroupName("placementGroupName")
     * .privateDnsNameOptions(PrivateDnsNameOptionsProperty.builder()
     * .enableResourceNameDnsAaaaRecord(false)
     * .enableResourceNameDnsARecord(false)
     * .hostnameType("hostnameType")
     * .build())
     * .privateIpAddress("privateIpAddress")
     * .propagateTagsToVolumeOnCreation(false)
     * .ramdiskId("ramdiskId")
     * .securityGroupIds(List.of("securityGroupIds"))
     * .securityGroups(List.of("securityGroups"))
     * .sourceDestCheck(false)
     * .ssmAssociations(List.of(SsmAssociationProperty.builder()
     * .documentName("documentName")
     * // the properties below are optional
     * .associationParameters(List.of(AssociationParameterProperty.builder()
     * .key("key")
     * .value(List.of("value"))
     * .build()))
     * .build()))
     * .subnetId("subnetId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tenancy("tenancy")
     * .userData("userData")
     * .volumes(List.of(VolumeProperty.builder()
     * .device("device")
     * .volumeId("volumeId")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html)
     */
    public inline fun cfnInstanceProps(
        block: CfnInstancePropsDsl.() -> Unit = {}
    ): CfnInstanceProps {
        val builder = CfnInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the SSM document and parameter values in AWS Systems Manager to associate with an
     * instance.
     *
     * `SsmAssociations` is a property of the
     * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * SsmAssociationProperty ssmAssociationProperty = SsmAssociationProperty.builder()
     * .documentName("documentName")
     * // the properties below are optional
     * .associationParameters(List.of(AssociationParameterProperty.builder()
     * .key("key")
     * .value(List.of("value"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociation.html)
     */
    public inline fun cfnInstanceSsmAssociationProperty(
        block: CfnInstanceSsmAssociationPropertyDsl.() -> Unit = {}
    ): CfnInstance.SsmAssociationProperty {
        val builder = CfnInstanceSsmAssociationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a volume to attach to an instance.
     *
     * `Volume` is an embedded property of the
     * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * VolumeProperty volumeProperty = VolumeProperty.builder()
     * .device("device")
     * .volumeId("volumeId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-volume.html)
     */
    public inline fun cfnInstanceVolumeProperty(
        block: CfnInstanceVolumePropertyDsl.() -> Unit = {}
    ): CfnInstance.VolumeProperty {
        val builder = CfnInstanceVolumePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Allocates an internet gateway for use with a VPC.
     *
     * After creating the Internet gateway, you then attach it to a VPC.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnInternetGateway cfnInternetGateway = CfnInternetGateway.Builder.create(this,
     * "MyCfnInternetGateway")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-internetgateway.html)
     */
    public inline fun cfnInternetGateway(
        scope: Construct,
        id: String,
        block: CfnInternetGatewayDsl.() -> Unit = {},
    ): CfnInternetGateway {
        val builder = CfnInternetGatewayDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnInternetGateway`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnInternetGatewayProps cfnInternetGatewayProps = CfnInternetGatewayProps.builder()
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-internetgateway.html)
     */
    public inline fun cfnInternetGatewayProps(
        block: CfnInternetGatewayPropsDsl.() -> Unit = {}
    ): CfnInternetGatewayProps {
        val builder = CfnInternetGatewayPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a key pair for use with an Amazon Elastic Compute Cloud instance as follows:.
     * * To import an existing key pair, include the `PublicKeyMaterial` property.
     * * To create a new key pair, omit the `PublicKeyMaterial` property.
     *
     * When you import an existing key pair, you specify the public key material for the key. We
     * assume that you have the private key material for the key. AWS CloudFormation does not create
     * or return the private key material when you import a key pair.
     *
     * When you create a new key pair, the private key is saved to AWS Systems Manager Parameter
     * Store, using a parameter with the following name: `/ec2/keypair/{key_pair_id}` . For more
     * information about retrieving private key, and the required permissions, see
     * [Create a key pair using AWS CloudFormation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/create-key-pairs.html#create-key-pair-cloudformation)
     * in the *Amazon EC2 User Guide* .
     *
     * When AWS CloudFormation deletes a key pair that was created or imported by a stack, it also
     * deletes the parameter that was used to store the private key material in Parameter Store.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnKeyPair cfnKeyPair = CfnKeyPair.Builder.create(this, "MyCfnKeyPair")
     * .keyName("keyName")
     * // the properties below are optional
     * .keyFormat("keyFormat")
     * .keyType("keyType")
     * .publicKeyMaterial("publicKeyMaterial")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html)
     */
    public inline fun cfnKeyPair(
        scope: Construct,
        id: String,
        block: CfnKeyPairDsl.() -> Unit = {},
    ): CfnKeyPair {
        val builder = CfnKeyPairDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnKeyPair`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnKeyPairProps cfnKeyPairProps = CfnKeyPairProps.builder()
     * .keyName("keyName")
     * // the properties below are optional
     * .keyFormat("keyFormat")
     * .keyType("keyType")
     * .publicKeyMaterial("publicKeyMaterial")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html)
     */
    public inline fun cfnKeyPairProps(block: CfnKeyPairPropsDsl.() -> Unit = {}): CfnKeyPairProps {
        val builder = CfnKeyPairPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the properties for creating a launch template.
     *
     * The minimum required properties for specifying a launch template are as follows:
     * * You must specify at least one property for the launch template data.
     * * You do not need to specify a name for the launch template. If you do not specify a name,
     *   AWS CloudFormation creates the name for you.
     *
     * A launch template can contain some or all of the configuration information to launch an
     * instance. When you launch an instance using a launch template, instance properties that are
     * not specified in the launch template use default values, except the `ImageId` property, which
     * has no default value. If you do not specify an AMI ID for the launch template `ImageId`
     * property, you must specify an AMI ID for the instance `ImageId` property.
     *
     * For more information, see
     * [Launch an instance from a launch template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Example:
     * ```
     * Cluster cluster;
     * String userData = "MIME-Version: 1.0\nContent-Type: multipart/mixed;
     * boundary=\"==MYBOUNDARY==\"\n\n--==MYBOUNDARY==\nContent-Type: text/x-shellscript;
     * charset=\"us-ascii\"\n\n#!/bin/bash\necho \"Running custom user data
     * script\"\n\n--==MYBOUNDARY==--\\\n";
     * CfnLaunchTemplate lt = CfnLaunchTemplate.Builder.create(this, "LaunchTemplate")
     * .launchTemplateData(LaunchTemplateDataProperty.builder()
     * .instanceType("t3.small")
     * .userData(Fn.base64(userData))
     * .build())
     * .build();
     * cluster.addNodegroupCapacity("extra-ng", NodegroupOptions.builder()
     * .launchTemplateSpec(LaunchTemplateSpec.builder()
     * .id(lt.getRef())
     * .version(lt.getAttrLatestVersionNumber())
     * .build())
     * .build());
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
     */
    public inline fun cfnLaunchTemplate(
        scope: Construct,
        id: String,
        block: CfnLaunchTemplateDsl.() -> Unit = {},
    ): CfnLaunchTemplate {
        val builder = CfnLaunchTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips) on an
     * instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AcceleratorCountProperty acceleratorCountProperty = AcceleratorCountProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-acceleratorcount.html)
     */
    public inline fun cfnLaunchTemplateAcceleratorCountProperty(
        block: CfnLaunchTemplateAcceleratorCountPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.AcceleratorCountProperty {
        val builder = CfnLaunchTemplateAcceleratorCountPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum amount of total accelerator memory, in MiB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AcceleratorTotalMemoryMiBProperty acceleratorTotalMemoryMiBProperty =
     * AcceleratorTotalMemoryMiBProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-acceleratortotalmemorymib.html)
     */
    public inline fun cfnLaunchTemplateAcceleratorTotalMemoryMiBProperty(
        block: CfnLaunchTemplateAcceleratorTotalMemoryMiBPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty {
        val builder = CfnLaunchTemplateAcceleratorTotalMemoryMiBPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps.
     *
     * For more information, see
     * [Amazon EBS–optimized instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * BaselineEbsBandwidthMbpsProperty baselineEbsBandwidthMbpsProperty =
     * BaselineEbsBandwidthMbpsProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-baselineebsbandwidthmbps.html)
     */
    public inline fun cfnLaunchTemplateBaselineEbsBandwidthMbpsProperty(
        block: CfnLaunchTemplateBaselineEbsBandwidthMbpsPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty {
        val builder = CfnLaunchTemplateBaselineEbsBandwidthMbpsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a block device mapping for an Amazon EC2 launch template.
     *
     * `BlockDeviceMapping` is a property of
     * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * BlockDeviceMappingProperty blockDeviceMappingProperty = BlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * .ebs(EbsProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .snapshotId("snapshotId")
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice("noDevice")
     * .virtualName("virtualName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html)
     */
    public inline fun cfnLaunchTemplateBlockDeviceMappingProperty(
        block: CfnLaunchTemplateBlockDeviceMappingPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.BlockDeviceMappingProperty {
        val builder = CfnLaunchTemplateBlockDeviceMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an instance's Capacity Reservation targeting option. You can specify only one
     * option at a time.
     *
     * `CapacityReservationSpecification` is a property of
     * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CapacityReservationSpecificationProperty capacityReservationSpecificationProperty =
     * CapacityReservationSpecificationProperty.builder()
     * .capacityReservationPreference("capacityReservationPreference")
     * .capacityReservationTarget(CapacityReservationTargetProperty.builder()
     * .capacityReservationId("capacityReservationId")
     * .capacityReservationResourceGroupArn("capacityReservationResourceGroupArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationspecification.html)
     */
    public inline fun cfnLaunchTemplateCapacityReservationSpecificationProperty(
        block: CfnLaunchTemplateCapacityReservationSpecificationPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.CapacityReservationSpecificationProperty {
        val builder = CfnLaunchTemplateCapacityReservationSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a target Capacity Reservation.
     *
     * `CapacityReservationTarget` is a property of the
     * [Amazon EC2 LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CapacityReservationTargetProperty capacityReservationTargetProperty =
     * CapacityReservationTargetProperty.builder()
     * .capacityReservationId("capacityReservationId")
     * .capacityReservationResourceGroupArn("capacityReservationResourceGroupArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html)
     */
    public inline fun cfnLaunchTemplateCapacityReservationTargetProperty(
        block: CfnLaunchTemplateCapacityReservationTargetPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.CapacityReservationTargetProperty {
        val builder = CfnLaunchTemplateCapacityReservationTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the CPU options for an instance.
     *
     * For more information, see
     * [Optimize CPU options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html)
     * in the *Amazon Elastic Compute Cloud User Guide* .
     *
     * `CpuOptions` is a property of
     * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CpuOptionsProperty cpuOptionsProperty = CpuOptionsProperty.builder()
     * .amdSevSnp("amdSevSnp")
     * .coreCount(123)
     * .threadsPerCore(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-cpuoptions.html)
     */
    public inline fun cfnLaunchTemplateCpuOptionsProperty(
        block: CfnLaunchTemplateCpuOptionsPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.CpuOptionsProperty {
        val builder = CfnLaunchTemplateCpuOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the credit option for CPU usage of a T2, T3, or T3a instance.
     *
     * `CreditSpecification` is a property of
     * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CreditSpecificationProperty creditSpecificationProperty = CreditSpecificationProperty.builder()
     * .cpuCredits("cpuCredits")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-creditspecification.html)
     */
    public inline fun cfnLaunchTemplateCreditSpecificationProperty(
        block: CfnLaunchTemplateCreditSpecificationPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.CreditSpecificationProperty {
        val builder = CfnLaunchTemplateCreditSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Parameters for a block device for an EBS volume in an Amazon EC2 launch template.
     *
     * `Ebs` is a property of
     * [AWS::EC2::LaunchTemplate BlockDeviceMapping](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * EbsProperty ebsProperty = EbsProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .snapshotId("snapshotId")
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html)
     */
    public inline fun cfnLaunchTemplateEbsProperty(
        block: CfnLaunchTemplateEbsPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.EbsProperty {
        val builder = CfnLaunchTemplateEbsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a specification for an Elastic GPU for an Amazon EC2 launch template.
     *
     * `ElasticGpuSpecification` is a property of
     * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ElasticGpuSpecificationProperty elasticGpuSpecificationProperty =
     * ElasticGpuSpecificationProperty.builder()
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-elasticgpuspecification.html)
     */
    public inline fun cfnLaunchTemplateElasticGpuSpecificationProperty(
        block: CfnLaunchTemplateElasticGpuSpecificationPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.ElasticGpuSpecificationProperty {
        val builder = CfnLaunchTemplateElasticGpuSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Indicates whether the instance is enabled for AWS Nitro Enclaves.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * EnclaveOptionsProperty enclaveOptionsProperty = EnclaveOptionsProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-enclaveoptions.html)
     */
    public inline fun cfnLaunchTemplateEnclaveOptionsProperty(
        block: CfnLaunchTemplateEnclaveOptionsPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.EnclaveOptionsProperty {
        val builder = CfnLaunchTemplateEnclaveOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies whether your instance is configured for hibernation.
     *
     * This parameter is valid only if the instance meets the
     * [hibernation prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites)
     * . For more information, see
     * [Hibernate Your Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html)
     * in the *Amazon EC2 User Guide* .
     *
     * `HibernationOptions` is a property of
     * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * HibernationOptionsProperty hibernationOptionsProperty = HibernationOptionsProperty.builder()
     * .configured(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-hibernationoptions.html)
     */
    public inline fun cfnLaunchTemplateHibernationOptionsProperty(
        block: CfnLaunchTemplateHibernationOptionsPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.HibernationOptionsProperty {
        val builder = CfnLaunchTemplateHibernationOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an IAM instance profile, which is a container for an IAM role for your instance.
     *
     * You can use an IAM role to distribute your AWS credentials to your instances.
     *
     * If you are creating the launch template for use with an Amazon EC2 Auto Scaling group, you
     * can specify either the name or the ARN of the instance profile, but not both.
     *
     * `IamInstanceProfile` is a property of
     * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * IamInstanceProfileProperty iamInstanceProfileProperty = IamInstanceProfileProperty.builder()
     * .arn("arn")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-iaminstanceprofile.html)
     */
    public inline fun cfnLaunchTemplateIamInstanceProfileProperty(
        block: CfnLaunchTemplateIamInstanceProfilePropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.IamInstanceProfileProperty {
        val builder = CfnLaunchTemplateIamInstanceProfilePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the market (purchasing) option for an instance.
     *
     * `InstanceMarketOptions` is a property of the
     * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * InstanceMarketOptionsProperty instanceMarketOptionsProperty =
     * InstanceMarketOptionsProperty.builder()
     * .marketType("marketType")
     * .spotOptions(SpotOptionsProperty.builder()
     * .blockDurationMinutes(123)
     * .instanceInterruptionBehavior("instanceInterruptionBehavior")
     * .maxPrice("maxPrice")
     * .spotInstanceType("spotInstanceType")
     * .validUntil("validUntil")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancemarketoptions.html)
     */
    public inline fun cfnLaunchTemplateInstanceMarketOptionsProperty(
        block: CfnLaunchTemplateInstanceMarketOptionsPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.InstanceMarketOptionsProperty {
        val builder = CfnLaunchTemplateInstanceMarketOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The attributes for the instance types.
     *
     * When you specify instance attributes, Amazon EC2 will identify instance types with these
     * attributes.
     *
     * You must specify `VCpuCount` and `MemoryMiB` . All other attributes are optional. Any
     * unspecified optional attribute is set to its default.
     *
     * When you specify multiple attributes, you get instance types that satisfy all of the
     * specified attributes. If you specify multiple values for an attribute, you get instance types
     * that satisfy any of the specified values.
     *
     * To limit the list of instance types from which Amazon EC2 can identify matching instance
     * types, you can use one of the following parameters, but not both in the same request:
     * * `AllowedInstanceTypes` - The instance types to include in the list. All other instance
     *   types are ignored, even if they match your specified attributes.
     * * `ExcludedInstanceTypes` - The instance types to exclude from the list, even if they match
     *   your specified attributes.
     *
     * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
     *
     * Attribute-based instance type selection is only supported when using Auto Scaling groups, EC2
     * Fleet, and Spot Fleet to launch instances. If you plan to use the launch template in the
     * [launch instance wizard](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-instance-wizard.html)
     * , or with the
     * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
     * API or
     * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     * AWS CloudFormation resource, you can't specify `InstanceRequirements` .
     *
     * For more information, see
     * [Attribute-based instance type selection for EC2 Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html)
     * ,
     * [Attribute-based instance type selection for Spot Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-attribute-based-instance-type-selection.html)
     * , and
     * [Spot placement score](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-placement-score.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * InstanceRequirementsProperty instanceRequirementsProperty =
     * InstanceRequirementsProperty.builder()
     * .acceleratorCount(AcceleratorCountProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html)
     */
    public inline fun cfnLaunchTemplateInstanceRequirementsProperty(
        block: CfnLaunchTemplateInstanceRequirementsPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.InstanceRequirementsProperty {
        val builder = CfnLaunchTemplateInstanceRequirementsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an IPv4 prefix for a network interface.
     *
     * `Ipv4PrefixSpecification` is a property of
     * [AWS::EC2::LaunchTemplate NetworkInterface](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * Ipv4PrefixSpecificationProperty ipv4PrefixSpecificationProperty =
     * Ipv4PrefixSpecificationProperty.builder()
     * .ipv4Prefix("ipv4Prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv4prefixspecification.html)
     */
    public inline fun cfnLaunchTemplateIpv4PrefixSpecificationProperty(
        block: CfnLaunchTemplateIpv4PrefixSpecificationPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.Ipv4PrefixSpecificationProperty {
        val builder = CfnLaunchTemplateIpv4PrefixSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an IPv6 address in an Amazon EC2 launch template.
     *
     * `Ipv6Add` is a property of
     * [AWS::EC2::LaunchTemplate NetworkInterface](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * Ipv6AddProperty ipv6AddProperty = Ipv6AddProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6add.html)
     */
    public inline fun cfnLaunchTemplateIpv6AddProperty(
        block: CfnLaunchTemplateIpv6AddPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.Ipv6AddProperty {
        val builder = CfnLaunchTemplateIpv6AddPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an IPv6 prefix for a network interface.
     *
     * `Ipv6PrefixSpecification` is a property of
     * [AWS::EC2::LaunchTemplate NetworkInterface](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * Ipv6PrefixSpecificationProperty ipv6PrefixSpecificationProperty =
     * Ipv6PrefixSpecificationProperty.builder()
     * .ipv6Prefix("ipv6Prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6prefixspecification.html)
     */
    public inline fun cfnLaunchTemplateIpv6PrefixSpecificationProperty(
        block: CfnLaunchTemplateIpv6PrefixSpecificationPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.Ipv6PrefixSpecificationProperty {
        val builder = CfnLaunchTemplateIpv6PrefixSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The information to include in the launch template.
     *
     * You must specify at least one parameter for the launch template data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * LaunchTemplateDataProperty launchTemplateDataProperty = LaunchTemplateDataProperty.builder()
     * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * .ebs(EbsProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .snapshotId("snapshotId")
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice("noDevice")
     * .virtualName("virtualName")
     * .build()))
     * .capacityReservationSpecification(CapacityReservationSpecificationProperty.builder()
     * .capacityReservationPreference("capacityReservationPreference")
     * .capacityReservationTarget(CapacityReservationTargetProperty.builder()
     * .capacityReservationId("capacityReservationId")
     * .capacityReservationResourceGroupArn("capacityReservationResourceGroupArn")
     * .build())
     * .build())
     * .cpuOptions(CpuOptionsProperty.builder()
     * .amdSevSnp("amdSevSnp")
     * .coreCount(123)
     * .threadsPerCore(123)
     * .build())
     * .creditSpecification(CreditSpecificationProperty.builder()
     * .cpuCredits("cpuCredits")
     * .build())
     * .disableApiStop(false)
     * .disableApiTermination(false)
     * .ebsOptimized(false)
     * .elasticGpuSpecifications(List.of(ElasticGpuSpecificationProperty.builder()
     * .type("type")
     * .build()))
     * .elasticInferenceAccelerators(List.of(LaunchTemplateElasticInferenceAcceleratorProperty.builder()
     * .count(123)
     * .type("type")
     * .build()))
     * .enclaveOptions(EnclaveOptionsProperty.builder()
     * .enabled(false)
     * .build())
     * .hibernationOptions(HibernationOptionsProperty.builder()
     * .configured(false)
     * .build())
     * .iamInstanceProfile(IamInstanceProfileProperty.builder()
     * .arn("arn")
     * .name("name")
     * .build())
     * .imageId("imageId")
     * .instanceInitiatedShutdownBehavior("instanceInitiatedShutdownBehavior")
     * .instanceMarketOptions(InstanceMarketOptionsProperty.builder()
     * .marketType("marketType")
     * .spotOptions(SpotOptionsProperty.builder()
     * .blockDurationMinutes(123)
     * .instanceInterruptionBehavior("instanceInterruptionBehavior")
     * .maxPrice("maxPrice")
     * .spotInstanceType("spotInstanceType")
     * .validUntil("validUntil")
     * .build())
     * .build())
     * .instanceRequirements(InstanceRequirementsProperty.builder()
     * .acceleratorCount(AcceleratorCountProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .kernelId("kernelId")
     * .keyName("keyName")
     * .licenseSpecifications(List.of(LicenseSpecificationProperty.builder()
     * .licenseConfigurationArn("licenseConfigurationArn")
     * .build()))
     * .maintenanceOptions(MaintenanceOptionsProperty.builder()
     * .autoRecovery("autoRecovery")
     * .build())
     * .metadataOptions(MetadataOptionsProperty.builder()
     * .httpEndpoint("httpEndpoint")
     * .httpProtocolIpv6("httpProtocolIpv6")
     * .httpPutResponseHopLimit(123)
     * .httpTokens("httpTokens")
     * .instanceMetadataTags("instanceMetadataTags")
     * .build())
     * .monitoring(MonitoringProperty.builder()
     * .enabled(false)
     * .build())
     * .networkInterfaces(List.of(NetworkInterfaceProperty.builder()
     * .associateCarrierIpAddress(false)
     * .associatePublicIpAddress(false)
     * .deleteOnTermination(false)
     * .description("description")
     * .deviceIndex(123)
     * .groups(List.of("groups"))
     * .interfaceType("interfaceType")
     * .ipv4PrefixCount(123)
     * .ipv4Prefixes(List.of(Ipv4PrefixSpecificationProperty.builder()
     * .ipv4Prefix("ipv4Prefix")
     * .build()))
     * .ipv6AddressCount(123)
     * .ipv6Addresses(List.of(Ipv6AddProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build()))
     * .ipv6PrefixCount(123)
     * .ipv6Prefixes(List.of(Ipv6PrefixSpecificationProperty.builder()
     * .ipv6Prefix("ipv6Prefix")
     * .build()))
     * .networkCardIndex(123)
     * .networkInterfaceId("networkInterfaceId")
     * .privateIpAddress("privateIpAddress")
     * .privateIpAddresses(List.of(PrivateIpAddProperty.builder()
     * .primary(false)
     * .privateIpAddress("privateIpAddress")
     * .build()))
     * .secondaryPrivateIpAddressCount(123)
     * .subnetId("subnetId")
     * .build()))
     * .placement(PlacementProperty.builder()
     * .affinity("affinity")
     * .availabilityZone("availabilityZone")
     * .groupId("groupId")
     * .groupName("groupName")
     * .hostId("hostId")
     * .hostResourceGroupArn("hostResourceGroupArn")
     * .partitionNumber(123)
     * .spreadDomain("spreadDomain")
     * .tenancy("tenancy")
     * .build())
     * .privateDnsNameOptions(PrivateDnsNameOptionsProperty.builder()
     * .enableResourceNameDnsAaaaRecord(false)
     * .enableResourceNameDnsARecord(false)
     * .hostnameType("hostnameType")
     * .build())
     * .ramDiskId("ramDiskId")
     * .securityGroupIds(List.of("securityGroupIds"))
     * .securityGroups(List.of("securityGroups"))
     * .tagSpecifications(List.of(TagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * .userData("userData")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
     */
    public inline fun cfnLaunchTemplateLaunchTemplateDataProperty(
        block: CfnLaunchTemplateLaunchTemplateDataPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.LaunchTemplateDataProperty {
        val builder = CfnLaunchTemplateLaunchTemplateDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an elastic inference accelerator.
     *
     * `LaunchTemplateElasticInferenceAccelerator` is a property of
     * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * LaunchTemplateElasticInferenceAcceleratorProperty
     * launchTemplateElasticInferenceAcceleratorProperty =
     * LaunchTemplateElasticInferenceAcceleratorProperty.builder()
     * .count(123)
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplateelasticinferenceaccelerator.html)
     */
    public inline fun cfnLaunchTemplateLaunchTemplateElasticInferenceAcceleratorProperty(
        block: CfnLaunchTemplateLaunchTemplateElasticInferenceAcceleratorPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty {
        val builder = CfnLaunchTemplateLaunchTemplateElasticInferenceAcceleratorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the tags to apply to the launch template during creation.
     *
     * `LaunchTemplateTagSpecification` is a property of
     * [AWS::EC2::LaunchTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * LaunchTemplateTagSpecificationProperty launchTemplateTagSpecificationProperty =
     * LaunchTemplateTagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatetagspecification.html)
     */
    public inline fun cfnLaunchTemplateLaunchTemplateTagSpecificationProperty(
        block: CfnLaunchTemplateLaunchTemplateTagSpecificationPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty {
        val builder = CfnLaunchTemplateLaunchTemplateTagSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a license configuration for an instance.
     *
     * `LicenseSpecification` is a property of
     * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * LicenseSpecificationProperty licenseSpecificationProperty =
     * LicenseSpecificationProperty.builder()
     * .licenseConfigurationArn("licenseConfigurationArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-licensespecification.html)
     */
    public inline fun cfnLaunchTemplateLicenseSpecificationProperty(
        block: CfnLaunchTemplateLicenseSpecificationPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.LicenseSpecificationProperty {
        val builder = CfnLaunchTemplateLicenseSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The maintenance options of your instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * MaintenanceOptionsProperty maintenanceOptionsProperty = MaintenanceOptionsProperty.builder()
     * .autoRecovery("autoRecovery")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-maintenanceoptions.html)
     */
    public inline fun cfnLaunchTemplateMaintenanceOptionsProperty(
        block: CfnLaunchTemplateMaintenanceOptionsPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.MaintenanceOptionsProperty {
        val builder = CfnLaunchTemplateMaintenanceOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum amount of memory per vCPU, in GiB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * MemoryGiBPerVCpuProperty memoryGiBPerVCpuProperty = MemoryGiBPerVCpuProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-memorygibpervcpu.html)
     */
    public inline fun cfnLaunchTemplateMemoryGiBPerVCpuProperty(
        block: CfnLaunchTemplateMemoryGiBPerVCpuPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.MemoryGiBPerVCpuProperty {
        val builder = CfnLaunchTemplateMemoryGiBPerVCpuPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum amount of memory, in MiB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * MemoryMiBProperty memoryMiBProperty = MemoryMiBProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-memorymib.html)
     */
    public inline fun cfnLaunchTemplateMemoryMiBProperty(
        block: CfnLaunchTemplateMemoryMiBPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.MemoryMiBProperty {
        val builder = CfnLaunchTemplateMemoryMiBPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The metadata options for the instance.
     *
     * For more information, see
     * [Instance metadata and user data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html)
     * in the *Amazon EC2 User Guide* .
     *
     * `MetadataOptions` is a property of
     * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * MetadataOptionsProperty metadataOptionsProperty = MetadataOptionsProperty.builder()
     * .httpEndpoint("httpEndpoint")
     * .httpProtocolIpv6("httpProtocolIpv6")
     * .httpPutResponseHopLimit(123)
     * .httpTokens("httpTokens")
     * .instanceMetadataTags("instanceMetadataTags")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-metadataoptions.html)
     */
    public inline fun cfnLaunchTemplateMetadataOptionsProperty(
        block: CfnLaunchTemplateMetadataOptionsPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.MetadataOptionsProperty {
        val builder = CfnLaunchTemplateMetadataOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies whether detailed monitoring is enabled for an instance.
     *
     * For more information about detailed monitoring, see
     * [Enable or turn off detailed monitoring for your instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html)
     * in the *Amazon EC2 User Guide* .
     *
     * `Monitoring` is a property of
     * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * MonitoringProperty monitoringProperty = MonitoringProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-monitoring.html)
     */
    public inline fun cfnLaunchTemplateMonitoringProperty(
        block: CfnLaunchTemplateMonitoringPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.MonitoringProperty {
        val builder = CfnLaunchTemplateMonitoringPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps).
     *
     * Setting the minimum bandwidth does not guarantee that your instance will achieve the minimum
     * bandwidth. Amazon EC2 will identify instance types that support the specified minimum
     * bandwidth, but the actual bandwidth of your instance might go below the specified minimum at
     * times. For more information, see
     * [Available instance bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html#available-instance-bandwidth)
     * in the *Amazon EC2 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * NetworkBandwidthGbpsProperty networkBandwidthGbpsProperty =
     * NetworkBandwidthGbpsProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkbandwidthgbps.html)
     */
    public inline fun cfnLaunchTemplateNetworkBandwidthGbpsProperty(
        block: CfnLaunchTemplateNetworkBandwidthGbpsPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.NetworkBandwidthGbpsProperty {
        val builder = CfnLaunchTemplateNetworkBandwidthGbpsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum number of network interfaces.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * NetworkInterfaceCountProperty networkInterfaceCountProperty =
     * NetworkInterfaceCountProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterfacecount.html)
     */
    public inline fun cfnLaunchTemplateNetworkInterfaceCountProperty(
        block: CfnLaunchTemplateNetworkInterfaceCountPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.NetworkInterfaceCountProperty {
        val builder = CfnLaunchTemplateNetworkInterfaceCountPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the parameters for a network interface.
     *
     * `NetworkInterface` is a property of
     * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * NetworkInterfaceProperty networkInterfaceProperty = NetworkInterfaceProperty.builder()
     * .associateCarrierIpAddress(false)
     * .associatePublicIpAddress(false)
     * .deleteOnTermination(false)
     * .description("description")
     * .deviceIndex(123)
     * .groups(List.of("groups"))
     * .interfaceType("interfaceType")
     * .ipv4PrefixCount(123)
     * .ipv4Prefixes(List.of(Ipv4PrefixSpecificationProperty.builder()
     * .ipv4Prefix("ipv4Prefix")
     * .build()))
     * .ipv6AddressCount(123)
     * .ipv6Addresses(List.of(Ipv6AddProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build()))
     * .ipv6PrefixCount(123)
     * .ipv6Prefixes(List.of(Ipv6PrefixSpecificationProperty.builder()
     * .ipv6Prefix("ipv6Prefix")
     * .build()))
     * .networkCardIndex(123)
     * .networkInterfaceId("networkInterfaceId")
     * .privateIpAddress("privateIpAddress")
     * .privateIpAddresses(List.of(PrivateIpAddProperty.builder()
     * .primary(false)
     * .privateIpAddress("privateIpAddress")
     * .build()))
     * .secondaryPrivateIpAddressCount(123)
     * .subnetId("subnetId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html)
     */
    public inline fun cfnLaunchTemplateNetworkInterfaceProperty(
        block: CfnLaunchTemplateNetworkInterfacePropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.NetworkInterfaceProperty {
        val builder = CfnLaunchTemplateNetworkInterfacePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the placement of an instance.
     *
     * `Placement` is a property of
     * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PlacementProperty placementProperty = PlacementProperty.builder()
     * .affinity("affinity")
     * .availabilityZone("availabilityZone")
     * .groupId("groupId")
     * .groupName("groupName")
     * .hostId("hostId")
     * .hostResourceGroupArn("hostResourceGroupArn")
     * .partitionNumber(123)
     * .spreadDomain("spreadDomain")
     * .tenancy("tenancy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html)
     */
    public inline fun cfnLaunchTemplatePlacementProperty(
        block: CfnLaunchTemplatePlacementPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.PlacementProperty {
        val builder = CfnLaunchTemplatePlacementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The hostname type for EC2 instances launched into this subnet and how DNS A and AAAA record
     * queries should be handled.
     *
     * For more information, see
     * [Amazon EC2 instance hostname types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html)
     * in the *Amazon Elastic Compute Cloud User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PrivateDnsNameOptionsProperty privateDnsNameOptionsProperty =
     * PrivateDnsNameOptionsProperty.builder()
     * .enableResourceNameDnsAaaaRecord(false)
     * .enableResourceNameDnsARecord(false)
     * .hostnameType("hostnameType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privatednsnameoptions.html)
     */
    public inline fun cfnLaunchTemplatePrivateDnsNameOptionsProperty(
        block: CfnLaunchTemplatePrivateDnsNameOptionsPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.PrivateDnsNameOptionsProperty {
        val builder = CfnLaunchTemplatePrivateDnsNameOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a secondary private IPv4 address for a network interface.
     *
     * `PrivateIpAdd` is a property of
     * [AWS::EC2::LaunchTemplate NetworkInterface](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PrivateIpAddProperty privateIpAddProperty = PrivateIpAddProperty.builder()
     * .primary(false)
     * .privateIpAddress("privateIpAddress")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html)
     */
    public inline fun cfnLaunchTemplatePrivateIpAddProperty(
        block: CfnLaunchTemplatePrivateIpAddPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.PrivateIpAddProperty {
        val builder = CfnLaunchTemplatePrivateIpAddPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLaunchTemplate`.
     *
     * Example:
     * ```
     * Cluster cluster;
     * String userData = "MIME-Version: 1.0\nContent-Type: multipart/mixed;
     * boundary=\"==MYBOUNDARY==\"\n\n--==MYBOUNDARY==\nContent-Type: text/x-shellscript;
     * charset=\"us-ascii\"\n\n#!/bin/bash\necho \"Running custom user data
     * script\"\n\n--==MYBOUNDARY==--\\\n";
     * CfnLaunchTemplate lt = CfnLaunchTemplate.Builder.create(this, "LaunchTemplate")
     * .launchTemplateData(LaunchTemplateDataProperty.builder()
     * .instanceType("t3.small")
     * .userData(Fn.base64(userData))
     * .build())
     * .build();
     * cluster.addNodegroupCapacity("extra-ng", NodegroupOptions.builder()
     * .launchTemplateSpec(LaunchTemplateSpec.builder()
     * .id(lt.getRef())
     * .version(lt.getAttrLatestVersionNumber())
     * .build())
     * .build());
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
     */
    public inline fun cfnLaunchTemplateProps(
        block: CfnLaunchTemplatePropsDsl.() -> Unit = {}
    ): CfnLaunchTemplateProps {
        val builder = CfnLaunchTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies options for Spot Instances.
     *
     * `SpotOptions` is a property of
     * [AWS::EC2::LaunchTemplate InstanceMarketOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * SpotOptionsProperty spotOptionsProperty = SpotOptionsProperty.builder()
     * .blockDurationMinutes(123)
     * .instanceInterruptionBehavior("instanceInterruptionBehavior")
     * .maxPrice("maxPrice")
     * .spotInstanceType("spotInstanceType")
     * .validUntil("validUntil")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-spotoptions.html)
     */
    public inline fun cfnLaunchTemplateSpotOptionsProperty(
        block: CfnLaunchTemplateSpotOptionsPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.SpotOptionsProperty {
        val builder = CfnLaunchTemplateSpotOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the tags to apply to a resource when the resource is created for the launch
     * template.
     *
     * `TagSpecification` is a property type of
     * [`TagSpecifications`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications)
     * .
     * [`TagSpecifications`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications)
     * is a property of
     * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * TagSpecificationProperty tagSpecificationProperty = TagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html)
     */
    public inline fun cfnLaunchTemplateTagSpecificationProperty(
        block: CfnLaunchTemplateTagSpecificationPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.TagSpecificationProperty {
        val builder = CfnLaunchTemplateTagSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum amount of total local storage, in GB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * TotalLocalStorageGBProperty totalLocalStorageGBProperty = TotalLocalStorageGBProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-totallocalstoragegb.html)
     */
    public inline fun cfnLaunchTemplateTotalLocalStorageGBProperty(
        block: CfnLaunchTemplateTotalLocalStorageGBPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.TotalLocalStorageGBProperty {
        val builder = CfnLaunchTemplateTotalLocalStorageGBPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum number of vCPUs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * VCpuCountProperty vCpuCountProperty = VCpuCountProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-vcpucount.html)
     */
    public inline fun cfnLaunchTemplateVCpuCountProperty(
        block: CfnLaunchTemplateVCpuCountPropertyDsl.() -> Unit = {}
    ): CfnLaunchTemplate.VCpuCountProperty {
        val builder = CfnLaunchTemplateVCpuCountPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a static route for the specified local gateway route table. You must specify one of
     * the following targets:.
     * * `LocalGatewayVirtualInterfaceGroupId`
     * * `NetworkInterfaceId`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnLocalGatewayRoute cfnLocalGatewayRoute = CfnLocalGatewayRoute.Builder.create(this,
     * "MyCfnLocalGatewayRoute")
     * .destinationCidrBlock("destinationCidrBlock")
     * .localGatewayRouteTableId("localGatewayRouteTableId")
     * // the properties below are optional
     * .localGatewayVirtualInterfaceGroupId("localGatewayVirtualInterfaceGroupId")
     * .networkInterfaceId("networkInterfaceId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html)
     */
    public inline fun cfnLocalGatewayRoute(
        scope: Construct,
        id: String,
        block: CfnLocalGatewayRouteDsl.() -> Unit = {},
    ): CfnLocalGatewayRoute {
        val builder = CfnLocalGatewayRouteDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLocalGatewayRoute`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnLocalGatewayRouteProps cfnLocalGatewayRouteProps = CfnLocalGatewayRouteProps.builder()
     * .destinationCidrBlock("destinationCidrBlock")
     * .localGatewayRouteTableId("localGatewayRouteTableId")
     * // the properties below are optional
     * .localGatewayVirtualInterfaceGroupId("localGatewayVirtualInterfaceGroupId")
     * .networkInterfaceId("networkInterfaceId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html)
     */
    public inline fun cfnLocalGatewayRouteProps(
        block: CfnLocalGatewayRoutePropsDsl.() -> Unit = {}
    ): CfnLocalGatewayRouteProps {
        val builder = CfnLocalGatewayRoutePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a local gateway route table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnLocalGatewayRouteTable cfnLocalGatewayRouteTable =
     * CfnLocalGatewayRouteTable.Builder.create(this, "MyCfnLocalGatewayRouteTable")
     * .localGatewayId("localGatewayId")
     * // the properties below are optional
     * .mode("mode")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html)
     */
    public inline fun cfnLocalGatewayRouteTable(
        scope: Construct,
        id: String,
        block: CfnLocalGatewayRouteTableDsl.() -> Unit = {},
    ): CfnLocalGatewayRouteTable {
        val builder = CfnLocalGatewayRouteTableDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLocalGatewayRouteTable`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnLocalGatewayRouteTableProps cfnLocalGatewayRouteTableProps =
     * CfnLocalGatewayRouteTableProps.builder()
     * .localGatewayId("localGatewayId")
     * // the properties below are optional
     * .mode("mode")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html)
     */
    public inline fun cfnLocalGatewayRouteTableProps(
        block: CfnLocalGatewayRouteTablePropsDsl.() -> Unit = {}
    ): CfnLocalGatewayRouteTableProps {
        val builder = CfnLocalGatewayRouteTablePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates the specified VPC with the specified local gateway route table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnLocalGatewayRouteTableVPCAssociation cfnLocalGatewayRouteTableVPCAssociation =
     * CfnLocalGatewayRouteTableVPCAssociation.Builder.create(this,
     * "MyCfnLocalGatewayRouteTableVPCAssociation")
     * .localGatewayRouteTableId("localGatewayRouteTableId")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html)
     */
    public inline fun cfnLocalGatewayRouteTableVPCAssociation(
        scope: Construct,
        id: String,
        block: CfnLocalGatewayRouteTableVPCAssociationDsl.() -> Unit = {},
    ): CfnLocalGatewayRouteTableVPCAssociation {
        val builder = CfnLocalGatewayRouteTableVPCAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLocalGatewayRouteTableVPCAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnLocalGatewayRouteTableVPCAssociationProps cfnLocalGatewayRouteTableVPCAssociationProps =
     * CfnLocalGatewayRouteTableVPCAssociationProps.builder()
     * .localGatewayRouteTableId("localGatewayRouteTableId")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html)
     */
    public inline fun cfnLocalGatewayRouteTableVPCAssociationProps(
        block: CfnLocalGatewayRouteTableVPCAssociationPropsDsl.() -> Unit = {}
    ): CfnLocalGatewayRouteTableVPCAssociationProps {
        val builder = CfnLocalGatewayRouteTableVPCAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an association between a local gateway route table and a virtual interface group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation
     * cfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation =
     * CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation.Builder.create(this,
     * "MyCfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation")
     * .localGatewayRouteTableId("localGatewayRouteTableId")
     * .localGatewayVirtualInterfaceGroupId("localGatewayVirtualInterfaceGroupId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html)
     */
    public inline fun cfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation(
        scope: Construct,
        id: String,
        block: CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationDsl.() -> Unit = {},
    ): CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation {
        val builder = CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps
     * cfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps =
     * CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps.builder()
     * .localGatewayRouteTableId("localGatewayRouteTableId")
     * .localGatewayVirtualInterfaceGroupId("localGatewayVirtualInterfaceGroupId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html)
     */
    public inline fun cfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps(
        block: CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationPropsDsl.() -> Unit = {}
    ): CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps {
        val builder = CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a network address translation (NAT) gateway in the specified subnet.
     *
     * You can create either a public NAT gateway or a private NAT gateway. The default is a public
     * NAT gateway. If you create a public NAT gateway, you must specify an elastic IP address.
     *
     * With a NAT gateway, instances in a private subnet can connect to the internet, other AWS
     * services, or an on-premises network using the IP address of the NAT gateway.
     *
     * If you add a default route ( `AWS::EC2::Route` resource) that points to a NAT gateway,
     * specify the NAT gateway ID for the route's `NatGatewayId` property.
     *
     * For more information, see
     * [NAT Gateways](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html) in the
     * *Amazon VPC User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNatGateway cfnNatGateway = CfnNatGateway.Builder.create(this, "MyCfnNatGateway")
     * .subnetId("subnetId")
     * // the properties below are optional
     * .allocationId("allocationId")
     * .connectivityType("connectivityType")
     * .maxDrainDurationSeconds(123)
     * .privateIpAddress("privateIpAddress")
     * .secondaryAllocationIds(List.of("secondaryAllocationIds"))
     * .secondaryPrivateIpAddressCount(123)
     * .secondaryPrivateIpAddresses(List.of("secondaryPrivateIpAddresses"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html)
     */
    public inline fun cfnNatGateway(
        scope: Construct,
        id: String,
        block: CfnNatGatewayDsl.() -> Unit = {},
    ): CfnNatGateway {
        val builder = CfnNatGatewayDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNatGateway`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNatGatewayProps cfnNatGatewayProps = CfnNatGatewayProps.builder()
     * .subnetId("subnetId")
     * // the properties below are optional
     * .allocationId("allocationId")
     * .connectivityType("connectivityType")
     * .maxDrainDurationSeconds(123)
     * .privateIpAddress("privateIpAddress")
     * .secondaryAllocationIds(List.of("secondaryAllocationIds"))
     * .secondaryPrivateIpAddressCount(123)
     * .secondaryPrivateIpAddresses(List.of("secondaryPrivateIpAddresses"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html)
     */
    public inline fun cfnNatGatewayProps(
        block: CfnNatGatewayPropsDsl.() -> Unit = {}
    ): CfnNatGatewayProps {
        val builder = CfnNatGatewayPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a network ACL for your VPC.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkAcl cfnNetworkAcl = CfnNetworkAcl.Builder.create(this, "MyCfnNetworkAcl")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkacl.html)
     */
    public inline fun cfnNetworkAcl(
        scope: Construct,
        id: String,
        block: CfnNetworkAclDsl.() -> Unit = {},
    ): CfnNetworkAcl {
        val builder = CfnNetworkAclDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an entry, known as a rule, in a network ACL with a rule number you specify.
     *
     * Each network ACL has a set of numbered ingress rules and a separate set of numbered egress
     * rules.
     *
     * For information about the protocol value, see
     * [Protocol Numbers](https://docs.aws.amazon.com/https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     * on the Internet Assigned Numbers Authority (IANA) website.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkAclEntry cfnNetworkAclEntry = CfnNetworkAclEntry.Builder.create(this,
     * "MyCfnNetworkAclEntry")
     * .networkAclId("networkAclId")
     * .protocol(123)
     * .ruleAction("ruleAction")
     * .ruleNumber(123)
     * // the properties below are optional
     * .cidrBlock("cidrBlock")
     * .egress(false)
     * .icmp(IcmpProperty.builder()
     * .code(123)
     * .type(123)
     * .build())
     * .ipv6CidrBlock("ipv6CidrBlock")
     * .portRange(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html)
     */
    public inline fun cfnNetworkAclEntry(
        scope: Construct,
        id: String,
        block: CfnNetworkAclEntryDsl.() -> Unit = {},
    ): CfnNetworkAclEntry {
        val builder = CfnNetworkAclEntryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the ICMP type and code.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * IcmpProperty icmpProperty = IcmpProperty.builder()
     * .code(123)
     * .type(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html)
     */
    public inline fun cfnNetworkAclEntryIcmpProperty(
        block: CfnNetworkAclEntryIcmpPropertyDsl.() -> Unit = {}
    ): CfnNetworkAclEntry.IcmpProperty {
        val builder = CfnNetworkAclEntryIcmpPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a range of ports.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PortRangeProperty portRangeProperty = PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html)
     */
    public inline fun cfnNetworkAclEntryPortRangeProperty(
        block: CfnNetworkAclEntryPortRangePropertyDsl.() -> Unit = {}
    ): CfnNetworkAclEntry.PortRangeProperty {
        val builder = CfnNetworkAclEntryPortRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNetworkAclEntry`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkAclEntryProps cfnNetworkAclEntryProps = CfnNetworkAclEntryProps.builder()
     * .networkAclId("networkAclId")
     * .protocol(123)
     * .ruleAction("ruleAction")
     * .ruleNumber(123)
     * // the properties below are optional
     * .cidrBlock("cidrBlock")
     * .egress(false)
     * .icmp(IcmpProperty.builder()
     * .code(123)
     * .type(123)
     * .build())
     * .ipv6CidrBlock("ipv6CidrBlock")
     * .portRange(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkaclentry.html)
     */
    public inline fun cfnNetworkAclEntryProps(
        block: CfnNetworkAclEntryPropsDsl.() -> Unit = {}
    ): CfnNetworkAclEntryProps {
        val builder = CfnNetworkAclEntryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNetworkAcl`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkAclProps cfnNetworkAclProps = CfnNetworkAclProps.builder()
     * .vpcId("vpcId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkacl.html)
     */
    public inline fun cfnNetworkAclProps(
        block: CfnNetworkAclPropsDsl.() -> Unit = {}
    ): CfnNetworkAclProps {
        val builder = CfnNetworkAclPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a Network Access Scope.
     *
     * A Network Access Scope defines outbound (egress) and inbound (ingress) traffic patterns,
     * including sources, destinations, paths, and traffic types.
     *
     * Network Access Analyzer identifies unintended network access to your resources on AWS . When
     * you start an analysis on a Network Access Scope, Network Access Analyzer produces findings.
     * For more information, see the
     * [Network Access Analyzer User Guide](https://docs.aws.amazon.com/vpc/latest/network-access-analyzer/)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkInsightsAccessScope cfnNetworkInsightsAccessScope =
     * CfnNetworkInsightsAccessScope.Builder.create(this, "MyCfnNetworkInsightsAccessScope")
     * .excludePaths(List.of(AccessScopePathRequestProperty.builder()
     * .destination(PathStatementRequestProperty.builder()
     * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
     * .destinationAddresses(List.of("destinationAddresses"))
     * .destinationPorts(List.of("destinationPorts"))
     * .destinationPrefixLists(List.of("destinationPrefixLists"))
     * .protocols(List.of("protocols"))
     * .sourceAddresses(List.of("sourceAddresses"))
     * .sourcePorts(List.of("sourcePorts"))
     * .sourcePrefixLists(List.of("sourcePrefixLists"))
     * .build())
     * .resourceStatement(ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build())
     * .source(PathStatementRequestProperty.builder()
     * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
     * .destinationAddresses(List.of("destinationAddresses"))
     * .destinationPorts(List.of("destinationPorts"))
     * .destinationPrefixLists(List.of("destinationPrefixLists"))
     * .protocols(List.of("protocols"))
     * .sourceAddresses(List.of("sourceAddresses"))
     * .sourcePorts(List.of("sourcePorts"))
     * .sourcePrefixLists(List.of("sourcePrefixLists"))
     * .build())
     * .resourceStatement(ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build())
     * .throughResources(List.of(ThroughResourcesStatementRequestProperty.builder()
     * .resourceStatement(ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build()))
     * .build()))
     * .matchPaths(List.of(AccessScopePathRequestProperty.builder()
     * .destination(PathStatementRequestProperty.builder()
     * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
     * .destinationAddresses(List.of("destinationAddresses"))
     * .destinationPorts(List.of("destinationPorts"))
     * .destinationPrefixLists(List.of("destinationPrefixLists"))
     * .protocols(List.of("protocols"))
     * .sourceAddresses(List.of("sourceAddresses"))
     * .sourcePorts(List.of("sourcePorts"))
     * .sourcePrefixLists(List.of("sourcePrefixLists"))
     * .build())
     * .resourceStatement(ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build())
     * .source(PathStatementRequestProperty.builder()
     * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
     * .destinationAddresses(List.of("destinationAddresses"))
     * .destinationPorts(List.of("destinationPorts"))
     * .destinationPrefixLists(List.of("destinationPrefixLists"))
     * .protocols(List.of("protocols"))
     * .sourceAddresses(List.of("sourceAddresses"))
     * .sourcePorts(List.of("sourcePorts"))
     * .sourcePrefixLists(List.of("sourcePrefixLists"))
     * .build())
     * .resourceStatement(ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build())
     * .throughResources(List.of(ThroughResourcesStatementRequestProperty.builder()
     * .resourceStatement(ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build()))
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html)
     */
    public inline fun cfnNetworkInsightsAccessScope(
        scope: Construct,
        id: String,
        block: CfnNetworkInsightsAccessScopeDsl.() -> Unit = {},
    ): CfnNetworkInsightsAccessScope {
        val builder = CfnNetworkInsightsAccessScopeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a path.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AccessScopePathRequestProperty accessScopePathRequestProperty =
     * AccessScopePathRequestProperty.builder()
     * .destination(PathStatementRequestProperty.builder()
     * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
     * .destinationAddresses(List.of("destinationAddresses"))
     * .destinationPorts(List.of("destinationPorts"))
     * .destinationPrefixLists(List.of("destinationPrefixLists"))
     * .protocols(List.of("protocols"))
     * .sourceAddresses(List.of("sourceAddresses"))
     * .sourcePorts(List.of("sourcePorts"))
     * .sourcePrefixLists(List.of("sourcePrefixLists"))
     * .build())
     * .resourceStatement(ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build())
     * .source(PathStatementRequestProperty.builder()
     * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
     * .destinationAddresses(List.of("destinationAddresses"))
     * .destinationPorts(List.of("destinationPorts"))
     * .destinationPrefixLists(List.of("destinationPrefixLists"))
     * .protocols(List.of("protocols"))
     * .sourceAddresses(List.of("sourceAddresses"))
     * .sourcePorts(List.of("sourcePorts"))
     * .sourcePrefixLists(List.of("sourcePrefixLists"))
     * .build())
     * .resourceStatement(ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build())
     * .throughResources(List.of(ThroughResourcesStatementRequestProperty.builder()
     * .resourceStatement(ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-accessscopepathrequest.html)
     */
    public inline fun cfnNetworkInsightsAccessScopeAccessScopePathRequestProperty(
        block: CfnNetworkInsightsAccessScopeAccessScopePathRequestPropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty {
        val builder = CfnNetworkInsightsAccessScopeAccessScopePathRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a Network Access Scope analysis.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkInsightsAccessScopeAnalysis cfnNetworkInsightsAccessScopeAnalysis =
     * CfnNetworkInsightsAccessScopeAnalysis.Builder.create(this,
     * "MyCfnNetworkInsightsAccessScopeAnalysis")
     * .networkInsightsAccessScopeId("networkInsightsAccessScopeId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscopeanalysis.html)
     */
    public inline fun cfnNetworkInsightsAccessScopeAnalysis(
        scope: Construct,
        id: String,
        block: CfnNetworkInsightsAccessScopeAnalysisDsl.() -> Unit = {},
    ): CfnNetworkInsightsAccessScopeAnalysis {
        val builder = CfnNetworkInsightsAccessScopeAnalysisDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNetworkInsightsAccessScopeAnalysis`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkInsightsAccessScopeAnalysisProps cfnNetworkInsightsAccessScopeAnalysisProps =
     * CfnNetworkInsightsAccessScopeAnalysisProps.builder()
     * .networkInsightsAccessScopeId("networkInsightsAccessScopeId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscopeanalysis.html)
     */
    public inline fun cfnNetworkInsightsAccessScopeAnalysisProps(
        block: CfnNetworkInsightsAccessScopeAnalysisPropsDsl.() -> Unit = {}
    ): CfnNetworkInsightsAccessScopeAnalysisProps {
        val builder = CfnNetworkInsightsAccessScopeAnalysisPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a packet header statement.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PacketHeaderStatementRequestProperty packetHeaderStatementRequestProperty =
     * PacketHeaderStatementRequestProperty.builder()
     * .destinationAddresses(List.of("destinationAddresses"))
     * .destinationPorts(List.of("destinationPorts"))
     * .destinationPrefixLists(List.of("destinationPrefixLists"))
     * .protocols(List.of("protocols"))
     * .sourceAddresses(List.of("sourceAddresses"))
     * .sourcePorts(List.of("sourcePorts"))
     * .sourcePrefixLists(List.of("sourcePrefixLists"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-packetheaderstatementrequest.html)
     */
    public inline fun cfnNetworkInsightsAccessScopePacketHeaderStatementRequestProperty(
        block: CfnNetworkInsightsAccessScopePacketHeaderStatementRequestPropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty {
        val builder = CfnNetworkInsightsAccessScopePacketHeaderStatementRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a path statement.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PathStatementRequestProperty pathStatementRequestProperty =
     * PathStatementRequestProperty.builder()
     * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
     * .destinationAddresses(List.of("destinationAddresses"))
     * .destinationPorts(List.of("destinationPorts"))
     * .destinationPrefixLists(List.of("destinationPrefixLists"))
     * .protocols(List.of("protocols"))
     * .sourceAddresses(List.of("sourceAddresses"))
     * .sourcePorts(List.of("sourcePorts"))
     * .sourcePrefixLists(List.of("sourcePrefixLists"))
     * .build())
     * .resourceStatement(ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-pathstatementrequest.html)
     */
    public inline fun cfnNetworkInsightsAccessScopePathStatementRequestProperty(
        block: CfnNetworkInsightsAccessScopePathStatementRequestPropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsAccessScope.PathStatementRequestProperty {
        val builder = CfnNetworkInsightsAccessScopePathStatementRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNetworkInsightsAccessScope`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkInsightsAccessScopeProps cfnNetworkInsightsAccessScopeProps =
     * CfnNetworkInsightsAccessScopeProps.builder()
     * .excludePaths(List.of(AccessScopePathRequestProperty.builder()
     * .destination(PathStatementRequestProperty.builder()
     * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
     * .destinationAddresses(List.of("destinationAddresses"))
     * .destinationPorts(List.of("destinationPorts"))
     * .destinationPrefixLists(List.of("destinationPrefixLists"))
     * .protocols(List.of("protocols"))
     * .sourceAddresses(List.of("sourceAddresses"))
     * .sourcePorts(List.of("sourcePorts"))
     * .sourcePrefixLists(List.of("sourcePrefixLists"))
     * .build())
     * .resourceStatement(ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build())
     * .source(PathStatementRequestProperty.builder()
     * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
     * .destinationAddresses(List.of("destinationAddresses"))
     * .destinationPorts(List.of("destinationPorts"))
     * .destinationPrefixLists(List.of("destinationPrefixLists"))
     * .protocols(List.of("protocols"))
     * .sourceAddresses(List.of("sourceAddresses"))
     * .sourcePorts(List.of("sourcePorts"))
     * .sourcePrefixLists(List.of("sourcePrefixLists"))
     * .build())
     * .resourceStatement(ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build())
     * .throughResources(List.of(ThroughResourcesStatementRequestProperty.builder()
     * .resourceStatement(ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build()))
     * .build()))
     * .matchPaths(List.of(AccessScopePathRequestProperty.builder()
     * .destination(PathStatementRequestProperty.builder()
     * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
     * .destinationAddresses(List.of("destinationAddresses"))
     * .destinationPorts(List.of("destinationPorts"))
     * .destinationPrefixLists(List.of("destinationPrefixLists"))
     * .protocols(List.of("protocols"))
     * .sourceAddresses(List.of("sourceAddresses"))
     * .sourcePorts(List.of("sourcePorts"))
     * .sourcePrefixLists(List.of("sourcePrefixLists"))
     * .build())
     * .resourceStatement(ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build())
     * .source(PathStatementRequestProperty.builder()
     * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
     * .destinationAddresses(List.of("destinationAddresses"))
     * .destinationPorts(List.of("destinationPorts"))
     * .destinationPrefixLists(List.of("destinationPrefixLists"))
     * .protocols(List.of("protocols"))
     * .sourceAddresses(List.of("sourceAddresses"))
     * .sourcePorts(List.of("sourcePorts"))
     * .sourcePrefixLists(List.of("sourcePrefixLists"))
     * .build())
     * .resourceStatement(ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build())
     * .throughResources(List.of(ThroughResourcesStatementRequestProperty.builder()
     * .resourceStatement(ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build()))
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html)
     */
    public inline fun cfnNetworkInsightsAccessScopeProps(
        block: CfnNetworkInsightsAccessScopePropsDsl.() -> Unit = {}
    ): CfnNetworkInsightsAccessScopeProps {
        val builder = CfnNetworkInsightsAccessScopePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a resource statement.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ResourceStatementRequestProperty resourceStatementRequestProperty =
     * ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-resourcestatementrequest.html)
     */
    public inline fun cfnNetworkInsightsAccessScopeResourceStatementRequestProperty(
        block: CfnNetworkInsightsAccessScopeResourceStatementRequestPropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty {
        val builder = CfnNetworkInsightsAccessScopeResourceStatementRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a through resource statement.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ThroughResourcesStatementRequestProperty throughResourcesStatementRequestProperty =
     * ThroughResourcesStatementRequestProperty.builder()
     * .resourceStatement(ResourceStatementRequestProperty.builder()
     * .resources(List.of("resources"))
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-throughresourcesstatementrequest.html)
     */
    public inline fun cfnNetworkInsightsAccessScopeThroughResourcesStatementRequestProperty(
        block: CfnNetworkInsightsAccessScopeThroughResourcesStatementRequestPropertyDsl.() -> Unit =
            {}
    ): CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty {
        val builder = CfnNetworkInsightsAccessScopeThroughResourcesStatementRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a network insights analysis.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkInsightsAnalysis cfnNetworkInsightsAnalysis =
     * CfnNetworkInsightsAnalysis.Builder.create(this, "MyCfnNetworkInsightsAnalysis")
     * .networkInsightsPathId("networkInsightsPathId")
     * // the properties below are optional
     * .additionalAccounts(List.of("additionalAccounts"))
     * .filterInArns(List.of("filterInArns"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html)
     */
    public inline fun cfnNetworkInsightsAnalysis(
        scope: Construct,
        id: String,
        block: CfnNetworkInsightsAnalysisDsl.() -> Unit = {},
    ): CfnNetworkInsightsAnalysis {
        val builder = CfnNetworkInsightsAnalysisDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an additional detail for a path analysis.
     *
     * For more information, see
     * [Reachability Analyzer additional detail codes](https://docs.aws.amazon.com/vpc/latest/reachability/additional-detail-codes.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AdditionalDetailProperty additionalDetailProperty = AdditionalDetailProperty.builder()
     * .additionalDetailType("additionalDetailType")
     * .component(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .loadBalancers(List.of(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build()))
     * .serviceName("serviceName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-additionaldetail.html)
     */
    public inline fun cfnNetworkInsightsAnalysisAdditionalDetailProperty(
        block: CfnNetworkInsightsAnalysisAdditionalDetailPropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsAnalysis.AdditionalDetailProperty {
        val builder = CfnNetworkInsightsAnalysisAdditionalDetailPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an potential intermediate component of a feasible path.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AlternatePathHintProperty alternatePathHintProperty = AlternatePathHintProperty.builder()
     * .componentArn("componentArn")
     * .componentId("componentId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-alternatepathhint.html)
     */
    public inline fun cfnNetworkInsightsAnalysisAlternatePathHintProperty(
        block: CfnNetworkInsightsAnalysisAlternatePathHintPropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsAnalysis.AlternatePathHintProperty {
        val builder = CfnNetworkInsightsAnalysisAlternatePathHintPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a network access control (ACL) rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AnalysisAclRuleProperty analysisAclRuleProperty = AnalysisAclRuleProperty.builder()
     * .cidr("cidr")
     * .egress(false)
     * .portRange(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build())
     * .protocol("protocol")
     * .ruleAction("ruleAction")
     * .ruleNumber(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisaclrule.html)
     */
    public inline fun cfnNetworkInsightsAnalysisAnalysisAclRuleProperty(
        block: CfnNetworkInsightsAnalysisAnalysisAclRulePropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty {
        val builder = CfnNetworkInsightsAnalysisAnalysisAclRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a path component.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AnalysisComponentProperty analysisComponentProperty = AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysiscomponent.html)
     */
    public inline fun cfnNetworkInsightsAnalysisAnalysisComponentProperty(
        block: CfnNetworkInsightsAnalysisAnalysisComponentPropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsAnalysis.AnalysisComponentProperty {
        val builder = CfnNetworkInsightsAnalysisAnalysisComponentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a load balancer listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AnalysisLoadBalancerListenerProperty analysisLoadBalancerListenerProperty =
     * AnalysisLoadBalancerListenerProperty.builder()
     * .instancePort(123)
     * .loadBalancerPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancerlistener.html)
     */
    public inline fun cfnNetworkInsightsAnalysisAnalysisLoadBalancerListenerProperty(
        block: CfnNetworkInsightsAnalysisAnalysisLoadBalancerListenerPropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty {
        val builder = CfnNetworkInsightsAnalysisAnalysisLoadBalancerListenerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a load balancer target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AnalysisLoadBalancerTargetProperty analysisLoadBalancerTargetProperty =
     * AnalysisLoadBalancerTargetProperty.builder()
     * .address("address")
     * .availabilityZone("availabilityZone")
     * .instance(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .port(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancertarget.html)
     */
    public inline fun cfnNetworkInsightsAnalysisAnalysisLoadBalancerTargetProperty(
        block: CfnNetworkInsightsAnalysisAnalysisLoadBalancerTargetPropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty {
        val builder = CfnNetworkInsightsAnalysisAnalysisLoadBalancerTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a header.
     *
     * Reflects any changes made by a component as traffic passes through. The fields of an inbound
     * header are null except for the first component of a path.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AnalysisPacketHeaderProperty analysisPacketHeaderProperty =
     * AnalysisPacketHeaderProperty.builder()
     * .destinationAddresses(List.of("destinationAddresses"))
     * .destinationPortRanges(List.of(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build()))
     * .protocol("protocol")
     * .sourceAddresses(List.of("sourceAddresses"))
     * .sourcePortRanges(List.of(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysispacketheader.html)
     */
    public inline fun cfnNetworkInsightsAnalysisAnalysisPacketHeaderProperty(
        block: CfnNetworkInsightsAnalysisAnalysisPacketHeaderPropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty {
        val builder = CfnNetworkInsightsAnalysisAnalysisPacketHeaderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a route table route.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AnalysisRouteTableRouteProperty analysisRouteTableRouteProperty =
     * AnalysisRouteTableRouteProperty.builder()
     * .destinationCidr("destinationCidr")
     * .destinationPrefixListId("destinationPrefixListId")
     * .egressOnlyInternetGatewayId("egressOnlyInternetGatewayId")
     * .gatewayId("gatewayId")
     * .instanceId("instanceId")
     * .natGatewayId("natGatewayId")
     * .networkInterfaceId("networkInterfaceId")
     * .origin("origin")
     * .state("state")
     * .transitGatewayId("transitGatewayId")
     * .vpcPeeringConnectionId("vpcPeeringConnectionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html)
     */
    public inline fun cfnNetworkInsightsAnalysisAnalysisRouteTableRouteProperty(
        block: CfnNetworkInsightsAnalysisAnalysisRouteTableRoutePropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty {
        val builder = CfnNetworkInsightsAnalysisAnalysisRouteTableRoutePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a security group rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AnalysisSecurityGroupRuleProperty analysisSecurityGroupRuleProperty =
     * AnalysisSecurityGroupRuleProperty.builder()
     * .cidr("cidr")
     * .direction("direction")
     * .portRange(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build())
     * .prefixListId("prefixListId")
     * .protocol("protocol")
     * .securityGroupId("securityGroupId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysissecuritygrouprule.html)
     */
    public inline fun cfnNetworkInsightsAnalysisAnalysisSecurityGroupRuleProperty(
        block: CfnNetworkInsightsAnalysisAnalysisSecurityGroupRulePropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty {
        val builder = CfnNetworkInsightsAnalysisAnalysisSecurityGroupRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an explanation code for an unreachable path.
     *
     * For more information, see
     * [Reachability Analyzer explanation codes](https://docs.aws.amazon.com/vpc/latest/reachability/explanation-codes.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ExplanationProperty explanationProperty = ExplanationProperty.builder()
     * .acl(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .aclRule(AnalysisAclRuleProperty.builder()
     * .cidr("cidr")
     * .egress(false)
     * .portRange(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build())
     * .protocol("protocol")
     * .ruleAction("ruleAction")
     * .ruleNumber(123)
     * .build())
     * .address("address")
     * .addresses(List.of("addresses"))
     * .attachedTo(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .availabilityZones(List.of("availabilityZones"))
     * .cidrs(List.of("cidrs"))
     * .classicLoadBalancerListener(AnalysisLoadBalancerListenerProperty.builder()
     * .instancePort(123)
     * .loadBalancerPort(123)
     * .build())
     * .component(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .componentAccount("componentAccount")
     * .componentRegion("componentRegion")
     * .customerGateway(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .destination(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .destinationVpc(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .direction("direction")
     * .elasticLoadBalancerListener(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .explanationCode("explanationCode")
     * .ingressRouteTable(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .internetGateway(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .loadBalancerArn("loadBalancerArn")
     * .loadBalancerListenerPort(123)
     * .loadBalancerTarget(AnalysisLoadBalancerTargetProperty.builder()
     * .address("address")
     * .availabilityZone("availabilityZone")
     * .instance(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .port(123)
     * .build())
     * .loadBalancerTargetGroup(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .loadBalancerTargetGroups(List.of(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build()))
     * .loadBalancerTargetPort(123)
     * .missingComponent("missingComponent")
     * .natGateway(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .networkInterface(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .packetField("packetField")
     * .port(123)
     * .portRanges(List.of(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build()))
     * .prefixList(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .protocols(List.of("protocols"))
     * .routeTable(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .routeTableRoute(AnalysisRouteTableRouteProperty.builder()
     * .destinationCidr("destinationCidr")
     * .destinationPrefixListId("destinationPrefixListId")
     * .egressOnlyInternetGatewayId("egressOnlyInternetGatewayId")
     * .gatewayId("gatewayId")
     * .instanceId("instanceId")
     * .natGatewayId("natGatewayId")
     * .networkInterfaceId("networkInterfaceId")
     * .origin("origin")
     * .state("state")
     * .transitGatewayId("transitGatewayId")
     * .vpcPeeringConnectionId("vpcPeeringConnectionId")
     * .build())
     * .securityGroup(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .securityGroupRule(AnalysisSecurityGroupRuleProperty.builder()
     * .cidr("cidr")
     * .direction("direction")
     * .portRange(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build())
     * .prefixListId("prefixListId")
     * .protocol("protocol")
     * .securityGroupId("securityGroupId")
     * .build())
     * .securityGroups(List.of(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build()))
     * .sourceVpc(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .state("state")
     * .subnet(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .subnetRouteTable(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .transitGateway(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .transitGatewayAttachment(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .transitGatewayRouteTable(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .transitGatewayRouteTableRoute(TransitGatewayRouteTableRouteProperty.builder()
     * .attachmentId("attachmentId")
     * .destinationCidr("destinationCidr")
     * .prefixListId("prefixListId")
     * .resourceId("resourceId")
     * .resourceType("resourceType")
     * .routeOrigin("routeOrigin")
     * .state("state")
     * .build())
     * .vpc(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .vpcEndpoint(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .vpcPeeringConnection(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .vpnConnection(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .vpnGateway(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html)
     */
    public inline fun cfnNetworkInsightsAnalysisExplanationProperty(
        block: CfnNetworkInsightsAnalysisExplanationPropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsAnalysis.ExplanationProperty {
        val builder = CfnNetworkInsightsAnalysisExplanationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a path component.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PathComponentProperty pathComponentProperty = PathComponentProperty.builder()
     * .aclRule(AnalysisAclRuleProperty.builder()
     * .cidr("cidr")
     * .egress(false)
     * .portRange(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build())
     * .protocol("protocol")
     * .ruleAction("ruleAction")
     * .ruleNumber(123)
     * .build())
     * .additionalDetails(List.of(AdditionalDetailProperty.builder()
     * .additionalDetailType("additionalDetailType")
     * .component(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .loadBalancers(List.of(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build()))
     * .serviceName("serviceName")
     * .build()))
     * .component(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .destinationVpc(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .elasticLoadBalancerListener(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .explanations(List.of(ExplanationProperty.builder()
     * .acl(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .aclRule(AnalysisAclRuleProperty.builder()
     * .cidr("cidr")
     * .egress(false)
     * .portRange(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build())
     * .protocol("protocol")
     * .ruleAction("ruleAction")
     * .ruleNumber(123)
     * .build())
     * .address("address")
     * .addresses(List.of("addresses"))
     * .attachedTo(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .availabilityZones(List.of("availabilityZones"))
     * .cidrs(List.of("cidrs"))
     * .classicLoadBalancerListener(AnalysisLoadBalancerListenerProperty.builder()
     * .instancePort(123)
     * .loadBalancerPort(123)
     * .build())
     * .component(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .componentAccount("componentAccount")
     * .componentRegion("componentRegion")
     * .customerGateway(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .destination(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .destinationVpc(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .direction("direction")
     * .elasticLoadBalancerListener(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .explanationCode("explanationCode")
     * .ingressRouteTable(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .internetGateway(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .loadBalancerArn("loadBalancerArn")
     * .loadBalancerListenerPort(123)
     * .loadBalancerTarget(AnalysisLoadBalancerTargetProperty.builder()
     * .address("address")
     * .availabilityZone("availabilityZone")
     * .instance(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .port(123)
     * .build())
     * .loadBalancerTargetGroup(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .loadBalancerTargetGroups(List.of(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build()))
     * .loadBalancerTargetPort(123)
     * .missingComponent("missingComponent")
     * .natGateway(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .networkInterface(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .packetField("packetField")
     * .port(123)
     * .portRanges(List.of(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build()))
     * .prefixList(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .protocols(List.of("protocols"))
     * .routeTable(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .routeTableRoute(AnalysisRouteTableRouteProperty.builder()
     * .destinationCidr("destinationCidr")
     * .destinationPrefixListId("destinationPrefixListId")
     * .egressOnlyInternetGatewayId("egressOnlyInternetGatewayId")
     * .gatewayId("gatewayId")
     * .instanceId("instanceId")
     * .natGatewayId("natGatewayId")
     * .networkInterfaceId("networkInterfaceId")
     * .origin("origin")
     * .state("state")
     * .transitGatewayId("transitGatewayId")
     * .vpcPeeringConnectionId("vpcPeeringConnectionId")
     * .build())
     * .securityGroup(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .securityGroupRule(AnalysisSecurityGroupRuleProperty.builder()
     * .cidr("cidr")
     * .direction("direction")
     * .portRange(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build())
     * .prefixListId("prefixListId")
     * .protocol("protocol")
     * .securityGroupId("securityGroupId")
     * .build())
     * .securityGroups(List.of(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build()))
     * .sourceVpc(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .state("state")
     * .subnet(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .subnetRouteTable(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .transitGateway(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .transitGatewayAttachment(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .transitGatewayRouteTable(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .transitGatewayRouteTableRoute(TransitGatewayRouteTableRouteProperty.builder()
     * .attachmentId("attachmentId")
     * .destinationCidr("destinationCidr")
     * .prefixListId("prefixListId")
     * .resourceId("resourceId")
     * .resourceType("resourceType")
     * .routeOrigin("routeOrigin")
     * .state("state")
     * .build())
     * .vpc(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .vpcEndpoint(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .vpcPeeringConnection(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .vpnConnection(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .vpnGateway(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .build()))
     * .inboundHeader(AnalysisPacketHeaderProperty.builder()
     * .destinationAddresses(List.of("destinationAddresses"))
     * .destinationPortRanges(List.of(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build()))
     * .protocol("protocol")
     * .sourceAddresses(List.of("sourceAddresses"))
     * .sourcePortRanges(List.of(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build()))
     * .build())
     * .outboundHeader(AnalysisPacketHeaderProperty.builder()
     * .destinationAddresses(List.of("destinationAddresses"))
     * .destinationPortRanges(List.of(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build()))
     * .protocol("protocol")
     * .sourceAddresses(List.of("sourceAddresses"))
     * .sourcePortRanges(List.of(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build()))
     * .build())
     * .routeTableRoute(AnalysisRouteTableRouteProperty.builder()
     * .destinationCidr("destinationCidr")
     * .destinationPrefixListId("destinationPrefixListId")
     * .egressOnlyInternetGatewayId("egressOnlyInternetGatewayId")
     * .gatewayId("gatewayId")
     * .instanceId("instanceId")
     * .natGatewayId("natGatewayId")
     * .networkInterfaceId("networkInterfaceId")
     * .origin("origin")
     * .state("state")
     * .transitGatewayId("transitGatewayId")
     * .vpcPeeringConnectionId("vpcPeeringConnectionId")
     * .build())
     * .securityGroupRule(AnalysisSecurityGroupRuleProperty.builder()
     * .cidr("cidr")
     * .direction("direction")
     * .portRange(PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build())
     * .prefixListId("prefixListId")
     * .protocol("protocol")
     * .securityGroupId("securityGroupId")
     * .build())
     * .sequenceNumber(123)
     * .serviceName("serviceName")
     * .sourceVpc(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .subnet(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .transitGateway(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .transitGatewayRouteTableRoute(TransitGatewayRouteTableRouteProperty.builder()
     * .attachmentId("attachmentId")
     * .destinationCidr("destinationCidr")
     * .prefixListId("prefixListId")
     * .resourceId("resourceId")
     * .resourceType("resourceType")
     * .routeOrigin("routeOrigin")
     * .state("state")
     * .build())
     * .vpc(AnalysisComponentProperty.builder()
     * .arn("arn")
     * .id("id")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html)
     */
    public inline fun cfnNetworkInsightsAnalysisPathComponentProperty(
        block: CfnNetworkInsightsAnalysisPathComponentPropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsAnalysis.PathComponentProperty {
        val builder = CfnNetworkInsightsAnalysisPathComponentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a range of ports.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PortRangeProperty portRangeProperty = PortRangeProperty.builder()
     * .from(123)
     * .to(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-portrange.html)
     */
    public inline fun cfnNetworkInsightsAnalysisPortRangeProperty(
        block: CfnNetworkInsightsAnalysisPortRangePropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsAnalysis.PortRangeProperty {
        val builder = CfnNetworkInsightsAnalysisPortRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNetworkInsightsAnalysis`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkInsightsAnalysisProps cfnNetworkInsightsAnalysisProps =
     * CfnNetworkInsightsAnalysisProps.builder()
     * .networkInsightsPathId("networkInsightsPathId")
     * // the properties below are optional
     * .additionalAccounts(List.of("additionalAccounts"))
     * .filterInArns(List.of("filterInArns"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html)
     */
    public inline fun cfnNetworkInsightsAnalysisProps(
        block: CfnNetworkInsightsAnalysisPropsDsl.() -> Unit = {}
    ): CfnNetworkInsightsAnalysisProps {
        val builder = CfnNetworkInsightsAnalysisPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a route in a transit gateway route table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * TransitGatewayRouteTableRouteProperty transitGatewayRouteTableRouteProperty =
     * TransitGatewayRouteTableRouteProperty.builder()
     * .attachmentId("attachmentId")
     * .destinationCidr("destinationCidr")
     * .prefixListId("prefixListId")
     * .resourceId("resourceId")
     * .resourceType("resourceType")
     * .routeOrigin("routeOrigin")
     * .state("state")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-transitgatewayroutetableroute.html)
     */
    public inline fun cfnNetworkInsightsAnalysisTransitGatewayRouteTableRouteProperty(
        block: CfnNetworkInsightsAnalysisTransitGatewayRouteTableRoutePropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty {
        val builder = CfnNetworkInsightsAnalysisTransitGatewayRouteTableRoutePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a path to analyze for reachability.
     *
     * VPC Reachability Analyzer enables you to analyze and debug network reachability between two
     * resources in your virtual private cloud (VPC). For more information, see the
     * [Reachability Analyzer User Guide](https://docs.aws.amazon.com/vpc/latest/reachability/what-is-reachability-analyzer.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkInsightsPath cfnNetworkInsightsPath = CfnNetworkInsightsPath.Builder.create(this,
     * "MyCfnNetworkInsightsPath")
     * .protocol("protocol")
     * .source("source")
     * // the properties below are optional
     * .destination("destination")
     * .destinationIp("destinationIp")
     * .destinationPort(123)
     * .filterAtDestination(PathFilterProperty.builder()
     * .destinationAddress("destinationAddress")
     * .destinationPortRange(FilterPortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build())
     * .sourceAddress("sourceAddress")
     * .sourcePortRange(FilterPortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build())
     * .build())
     * .filterAtSource(PathFilterProperty.builder()
     * .destinationAddress("destinationAddress")
     * .destinationPortRange(FilterPortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build())
     * .sourceAddress("sourceAddress")
     * .sourcePortRange(FilterPortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build())
     * .build())
     * .sourceIp("sourceIp")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html)
     */
    public inline fun cfnNetworkInsightsPath(
        scope: Construct,
        id: String,
        block: CfnNetworkInsightsPathDsl.() -> Unit = {},
    ): CfnNetworkInsightsPath {
        val builder = CfnNetworkInsightsPathDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a port range.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * FilterPortRangeProperty filterPortRangeProperty = FilterPortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-filterportrange.html)
     */
    public inline fun cfnNetworkInsightsPathFilterPortRangeProperty(
        block: CfnNetworkInsightsPathFilterPortRangePropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsPath.FilterPortRangeProperty {
        val builder = CfnNetworkInsightsPathFilterPortRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a set of filters for a path analysis.
     *
     * Use path filters to scope the analysis when there can be multiple resulting paths.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PathFilterProperty pathFilterProperty = PathFilterProperty.builder()
     * .destinationAddress("destinationAddress")
     * .destinationPortRange(FilterPortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build())
     * .sourceAddress("sourceAddress")
     * .sourcePortRange(FilterPortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-pathfilter.html)
     */
    public inline fun cfnNetworkInsightsPathPathFilterProperty(
        block: CfnNetworkInsightsPathPathFilterPropertyDsl.() -> Unit = {}
    ): CfnNetworkInsightsPath.PathFilterProperty {
        val builder = CfnNetworkInsightsPathPathFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNetworkInsightsPath`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkInsightsPathProps cfnNetworkInsightsPathProps = CfnNetworkInsightsPathProps.builder()
     * .protocol("protocol")
     * .source("source")
     * // the properties below are optional
     * .destination("destination")
     * .destinationIp("destinationIp")
     * .destinationPort(123)
     * .filterAtDestination(PathFilterProperty.builder()
     * .destinationAddress("destinationAddress")
     * .destinationPortRange(FilterPortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build())
     * .sourceAddress("sourceAddress")
     * .sourcePortRange(FilterPortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build())
     * .build())
     * .filterAtSource(PathFilterProperty.builder()
     * .destinationAddress("destinationAddress")
     * .destinationPortRange(FilterPortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build())
     * .sourceAddress("sourceAddress")
     * .sourcePortRange(FilterPortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build())
     * .build())
     * .sourceIp("sourceIp")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html)
     */
    public inline fun cfnNetworkInsightsPathProps(
        block: CfnNetworkInsightsPathPropsDsl.() -> Unit = {}
    ): CfnNetworkInsightsPathProps {
        val builder = CfnNetworkInsightsPathPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a network interface in an Amazon EC2 instance for AWS CloudFormation .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkInterface cfnNetworkInterface = CfnNetworkInterface.Builder.create(this,
     * "MyCfnNetworkInterface")
     * .subnetId("subnetId")
     * // the properties below are optional
     * .description("description")
     * .enablePrimaryIpv6(false)
     * .groupSet(List.of("groupSet"))
     * .interfaceType("interfaceType")
     * .ipv6AddressCount(123)
     * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build()))
     * .privateIpAddress("privateIpAddress")
     * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
     * .primary(false)
     * .privateIpAddress("privateIpAddress")
     * .build()))
     * .secondaryPrivateIpAddressCount(123)
     * .sourceDestCheck(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html)
     */
    public inline fun cfnNetworkInterface(
        scope: Construct,
        id: String,
        block: CfnNetworkInterfaceDsl.() -> Unit = {},
    ): CfnNetworkInterface {
        val builder = CfnNetworkInterfaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attaches an elastic network interface (ENI) to an Amazon EC2 instance.
     *
     * You can use this resource type to attach additional network interfaces to an instance without
     * interruption.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkInterfaceAttachment cfnNetworkInterfaceAttachment =
     * CfnNetworkInterfaceAttachment.Builder.create(this, "MyCfnNetworkInterfaceAttachment")
     * .deviceIndex("deviceIndex")
     * .instanceId("instanceId")
     * .networkInterfaceId("networkInterfaceId")
     * // the properties below are optional
     * .deleteOnTermination(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html)
     */
    public inline fun cfnNetworkInterfaceAttachment(
        scope: Construct,
        id: String,
        block: CfnNetworkInterfaceAttachmentDsl.() -> Unit = {},
    ): CfnNetworkInterfaceAttachment {
        val builder = CfnNetworkInterfaceAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNetworkInterfaceAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkInterfaceAttachmentProps cfnNetworkInterfaceAttachmentProps =
     * CfnNetworkInterfaceAttachmentProps.builder()
     * .deviceIndex("deviceIndex")
     * .instanceId("instanceId")
     * .networkInterfaceId("networkInterfaceId")
     * // the properties below are optional
     * .deleteOnTermination(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html)
     */
    public inline fun cfnNetworkInterfaceAttachmentProps(
        block: CfnNetworkInterfaceAttachmentPropsDsl.() -> Unit = {}
    ): CfnNetworkInterfaceAttachmentProps {
        val builder = CfnNetworkInterfaceAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the IPv6 addresses to associate with the network interface.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * InstanceIpv6AddressProperty instanceIpv6AddressProperty = InstanceIpv6AddressProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-instanceipv6address.html)
     */
    public inline fun cfnNetworkInterfaceInstanceIpv6AddressProperty(
        block: CfnNetworkInterfaceInstanceIpv6AddressPropertyDsl.() -> Unit = {}
    ): CfnNetworkInterface.InstanceIpv6AddressProperty {
        val builder = CfnNetworkInterfaceInstanceIpv6AddressPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a permission for an Amazon EC2 network interface.
     *
     * For example, you can grant an AWS authorized partner account permission to attach the
     * specified network interface to an instance in their account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkInterfacePermission cfnNetworkInterfacePermission =
     * CfnNetworkInterfacePermission.Builder.create(this, "MyCfnNetworkInterfacePermission")
     * .awsAccountId("awsAccountId")
     * .networkInterfaceId("networkInterfaceId")
     * .permission("permission")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html)
     */
    public inline fun cfnNetworkInterfacePermission(
        scope: Construct,
        id: String,
        block: CfnNetworkInterfacePermissionDsl.() -> Unit = {},
    ): CfnNetworkInterfacePermission {
        val builder = CfnNetworkInterfacePermissionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNetworkInterfacePermission`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkInterfacePermissionProps cfnNetworkInterfacePermissionProps =
     * CfnNetworkInterfacePermissionProps.builder()
     * .awsAccountId("awsAccountId")
     * .networkInterfaceId("networkInterfaceId")
     * .permission("permission")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html)
     */
    public inline fun cfnNetworkInterfacePermissionProps(
        block: CfnNetworkInterfacePermissionPropsDsl.() -> Unit = {}
    ): CfnNetworkInterfacePermissionProps {
        val builder = CfnNetworkInterfacePermissionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a secondary private IPv4 address for a network interface.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PrivateIpAddressSpecificationProperty privateIpAddressSpecificationProperty =
     * PrivateIpAddressSpecificationProperty.builder()
     * .primary(false)
     * .privateIpAddress("privateIpAddress")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-privateipaddressspecification.html)
     */
    public inline fun cfnNetworkInterfacePrivateIpAddressSpecificationProperty(
        block: CfnNetworkInterfacePrivateIpAddressSpecificationPropertyDsl.() -> Unit = {}
    ): CfnNetworkInterface.PrivateIpAddressSpecificationProperty {
        val builder = CfnNetworkInterfacePrivateIpAddressSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNetworkInterface`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkInterfaceProps cfnNetworkInterfaceProps = CfnNetworkInterfaceProps.builder()
     * .subnetId("subnetId")
     * // the properties below are optional
     * .description("description")
     * .enablePrimaryIpv6(false)
     * .groupSet(List.of("groupSet"))
     * .interfaceType("interfaceType")
     * .ipv6AddressCount(123)
     * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build()))
     * .privateIpAddress("privateIpAddress")
     * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
     * .primary(false)
     * .privateIpAddress("privateIpAddress")
     * .build()))
     * .secondaryPrivateIpAddressCount(123)
     * .sourceDestCheck(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html)
     */
    public inline fun cfnNetworkInterfaceProps(
        block: CfnNetworkInterfacePropsDsl.() -> Unit = {}
    ): CfnNetworkInterfaceProps {
        val builder = CfnNetworkInterfacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes Infrastructure Performance subscriptions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkPerformanceMetricSubscription cfnNetworkPerformanceMetricSubscription =
     * CfnNetworkPerformanceMetricSubscription.Builder.create(this,
     * "MyCfnNetworkPerformanceMetricSubscription")
     * .destination("destination")
     * .metric("metric")
     * .source("source")
     * .statistic("statistic")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html)
     */
    public inline fun cfnNetworkPerformanceMetricSubscription(
        scope: Construct,
        id: String,
        block: CfnNetworkPerformanceMetricSubscriptionDsl.() -> Unit = {},
    ): CfnNetworkPerformanceMetricSubscription {
        val builder = CfnNetworkPerformanceMetricSubscriptionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNetworkPerformanceMetricSubscription`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnNetworkPerformanceMetricSubscriptionProps cfnNetworkPerformanceMetricSubscriptionProps =
     * CfnNetworkPerformanceMetricSubscriptionProps.builder()
     * .destination("destination")
     * .metric("metric")
     * .source("source")
     * .statistic("statistic")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html)
     */
    public inline fun cfnNetworkPerformanceMetricSubscriptionProps(
        block: CfnNetworkPerformanceMetricSubscriptionPropsDsl.() -> Unit = {}
    ): CfnNetworkPerformanceMetricSubscriptionProps {
        val builder = CfnNetworkPerformanceMetricSubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a placement group in which to launch instances.
     *
     * The strategy of the placement group determines how the instances are organized within the
     * group.
     *
     * A `cluster` placement group is a logical grouping of instances within a single Availability
     * Zone that benefit from low network latency, high network throughput. A `spread` placement
     * group places instances on distinct hardware. A `partition` placement group places groups of
     * instances in different partitions, where instances in one partition do not share the same
     * hardware with instances in another partition.
     *
     * For more information, see
     * [Placement Groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnPlacementGroup cfnPlacementGroup = CfnPlacementGroup.Builder.create(this,
     * "MyCfnPlacementGroup")
     * .partitionCount(123)
     * .spreadLevel("spreadLevel")
     * .strategy("strategy")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html)
     */
    public inline fun cfnPlacementGroup(
        scope: Construct,
        id: String,
        block: CfnPlacementGroupDsl.() -> Unit = {},
    ): CfnPlacementGroup {
        val builder = CfnPlacementGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPlacementGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnPlacementGroupProps cfnPlacementGroupProps = CfnPlacementGroupProps.builder()
     * .partitionCount(123)
     * .spreadLevel("spreadLevel")
     * .strategy("strategy")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html)
     */
    public inline fun cfnPlacementGroupProps(
        block: CfnPlacementGroupPropsDsl.() -> Unit = {}
    ): CfnPlacementGroupProps {
        val builder = CfnPlacementGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a managed prefix list.
     *
     * You can add one or more entries to the prefix list. Each entry consists of a CIDR block and
     * an optional description.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnPrefixList cfnPrefixList = CfnPrefixList.Builder.create(this, "MyCfnPrefixList")
     * .addressFamily("addressFamily")
     * .maxEntries(123)
     * .prefixListName("prefixListName")
     * // the properties below are optional
     * .entries(List.of(EntryProperty.builder()
     * .cidr("cidr")
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html)
     */
    public inline fun cfnPrefixList(
        scope: Construct,
        id: String,
        block: CfnPrefixListDsl.() -> Unit = {},
    ): CfnPrefixList {
        val builder = CfnPrefixListDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An entry for a prefix list.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * EntryProperty entryProperty = EntryProperty.builder()
     * .cidr("cidr")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-prefixlist-entry.html)
     */
    public inline fun cfnPrefixListEntryProperty(
        block: CfnPrefixListEntryPropertyDsl.() -> Unit = {}
    ): CfnPrefixList.EntryProperty {
        val builder = CfnPrefixListEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPrefixList`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnPrefixListProps cfnPrefixListProps = CfnPrefixListProps.builder()
     * .addressFamily("addressFamily")
     * .maxEntries(123)
     * .prefixListName("prefixListName")
     * // the properties below are optional
     * .entries(List.of(EntryProperty.builder()
     * .cidr("cidr")
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html)
     */
    public inline fun cfnPrefixListProps(
        block: CfnPrefixListPropsDsl.() -> Unit = {}
    ): CfnPrefixListProps {
        val builder = CfnPrefixListPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a route in a route table.
     *
     * You must specify either `DestinationCidrBlock` or `DestinationIpv6CidrBlock` , plus the ID of
     * one of the target resources.
     *
     * If you create a route that references a transit gateway in the same template where you create
     * the transit gateway, you must declare a dependency on the transit gateway attachment. The
     * route table cannot use the transit gateway until it has successfully attached to the VPC. Add
     * a
     * [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * in the `AWS::EC2::Route` resource to explicitly declare a dependency on the
     * `AWS::EC2::TransitGatewayAttachment` resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnRoute cfnRoute = CfnRoute.Builder.create(this, "MyCfnRoute")
     * .routeTableId("routeTableId")
     * // the properties below are optional
     * .carrierGatewayId("carrierGatewayId")
     * .destinationCidrBlock("destinationCidrBlock")
     * .destinationIpv6CidrBlock("destinationIpv6CidrBlock")
     * .egressOnlyInternetGatewayId("egressOnlyInternetGatewayId")
     * .gatewayId("gatewayId")
     * .instanceId("instanceId")
     * .localGatewayId("localGatewayId")
     * .natGatewayId("natGatewayId")
     * .networkInterfaceId("networkInterfaceId")
     * .transitGatewayId("transitGatewayId")
     * .vpcEndpointId("vpcEndpointId")
     * .vpcPeeringConnectionId("vpcPeeringConnectionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html)
     */
    public inline fun cfnRoute(
        scope: Construct,
        id: String,
        block: CfnRouteDsl.() -> Unit = {},
    ): CfnRoute {
        val builder = CfnRouteDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRoute`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnRouteProps cfnRouteProps = CfnRouteProps.builder()
     * .routeTableId("routeTableId")
     * // the properties below are optional
     * .carrierGatewayId("carrierGatewayId")
     * .destinationCidrBlock("destinationCidrBlock")
     * .destinationIpv6CidrBlock("destinationIpv6CidrBlock")
     * .egressOnlyInternetGatewayId("egressOnlyInternetGatewayId")
     * .gatewayId("gatewayId")
     * .instanceId("instanceId")
     * .localGatewayId("localGatewayId")
     * .natGatewayId("natGatewayId")
     * .networkInterfaceId("networkInterfaceId")
     * .transitGatewayId("transitGatewayId")
     * .vpcEndpointId("vpcEndpointId")
     * .vpcPeeringConnectionId("vpcPeeringConnectionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html)
     */
    public inline fun cfnRouteProps(block: CfnRoutePropsDsl.() -> Unit = {}): CfnRouteProps {
        val builder = CfnRoutePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a route table for the specified VPC.
     *
     * After you create a route table, you can add routes and associate the table with a subnet.
     *
     * For more information, see
     * [Route Tables](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html)
     * in the *Amazon VPC User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnRouteTable cfnRouteTable = CfnRouteTable.Builder.create(this, "MyCfnRouteTable")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routetable.html)
     */
    public inline fun cfnRouteTable(
        scope: Construct,
        id: String,
        block: CfnRouteTableDsl.() -> Unit = {},
    ): CfnRouteTable {
        val builder = CfnRouteTableDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRouteTable`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnRouteTableProps cfnRouteTableProps = CfnRouteTableProps.builder()
     * .vpcId("vpcId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routetable.html)
     */
    public inline fun cfnRouteTableProps(
        block: CfnRouteTablePropsDsl.() -> Unit = {}
    ): CfnRouteTableProps {
        val builder = CfnRouteTablePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a security group.
     *
     * To create a security group, use the
     * [VpcId](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-vpcid)
     * property to specify the VPC for which to create the security group.
     *
     * If you do not specify an egress rule, we add egress rules that allow IPv4 and IPv6 traffic on
     * all ports and protocols to any destination. We do not add these rules if you specify your own
     * egress rules. If you later remove your egress rules, we restore the default egress rules.
     *
     * This type supports updates. For more information about updating stacks, see
     * [AWS CloudFormation Stacks Updates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html)
     * .
     *
     * To cross-reference two security groups in the ingress and egress rules of those security
     * groups, use the
     * [AWS::EC2::SecurityGroupEgress](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html)
     * and
     * [AWS::EC2::SecurityGroupIngress](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-ingress.html)
     * resources to define your rules. Do not use the embedded ingress and egress rules in the
     * `AWS::EC2::SecurityGroup` . Doing so creates a circular dependency, which AWS CloudFormation
     * doesn't allow.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnSecurityGroup cfnSecurityGroup = CfnSecurityGroup.Builder.create(this, "MyCfnSecurityGroup")
     * .groupDescription("groupDescription")
     * // the properties below are optional
     * .groupName("groupName")
     * .securityGroupEgress(List.of(EgressProperty.builder()
     * .ipProtocol("ipProtocol")
     * // the properties below are optional
     * .cidrIp("cidrIp")
     * .cidrIpv6("cidrIpv6")
     * .description("description")
     * .destinationPrefixListId("destinationPrefixListId")
     * .destinationSecurityGroupId("destinationSecurityGroupId")
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .securityGroupIngress(List.of(IngressProperty.builder()
     * .ipProtocol("ipProtocol")
     * // the properties below are optional
     * .cidrIp("cidrIp")
     * .cidrIpv6("cidrIpv6")
     * .description("description")
     * .fromPort(123)
     * .sourcePrefixListId("sourcePrefixListId")
     * .sourceSecurityGroupId("sourceSecurityGroupId")
     * .sourceSecurityGroupName("sourceSecurityGroupName")
     * .sourceSecurityGroupOwnerId("sourceSecurityGroupOwnerId")
     * .toPort(123)
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcId("vpcId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html)
     */
    public inline fun cfnSecurityGroup(
        scope: Construct,
        id: String,
        block: CfnSecurityGroupDsl.() -> Unit = {},
    ): CfnSecurityGroup {
        val builder = CfnSecurityGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds the specified egress rules to a security group.
     *
     * An outbound rule permits instances to send traffic to the specified destination IPv4 or IPv6
     * CIDR address ranges, or to the specified destination security groups for the same VPC.
     *
     * You specify a protocol for each rule (for example, TCP). For the TCP and UDP protocols, you
     * must also specify the destination port or port range. For the ICMP protocol, you must also
     * specify the ICMP type and code. You can use -1 for the type or code to mean all types or all
     * codes.
     *
     * You must specify only one of the following properties: `CidrIp` , `CidrIpv6` ,
     * `DestinationPrefixListId` , or `DestinationSecurityGroupId` .
     *
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ). If you do not
     * specify one of these parameters, the stack will launch successfully but the rule will not be
     * added to the security group.
     *
     * Rule changes are propagated to affected instances as quickly as possible. However, a small
     * delay might occur.
     *
     * For more information about VPC security group limits, see
     * [Amazon VPC Limits](https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html)
     * .
     *
     * Use `AWS::EC2::SecurityGroupIngress` and `AWS::EC2::SecurityGroupEgress` only when necessary,
     * typically to allow security groups to reference each other in ingress and egress rules.
     * Otherwise, use the embedded ingress and egress rules of the security group. For more
     * information, see
     * [Amazon EC2 Security Groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnSecurityGroupEgress cfnSecurityGroupEgress = CfnSecurityGroupEgress.Builder.create(this,
     * "MyCfnSecurityGroupEgress")
     * .groupId("groupId")
     * .ipProtocol("ipProtocol")
     * // the properties below are optional
     * .cidrIp("cidrIp")
     * .cidrIpv6("cidrIpv6")
     * .description("description")
     * .destinationPrefixListId("destinationPrefixListId")
     * .destinationSecurityGroupId("destinationSecurityGroupId")
     * .fromPort(123)
     * .toPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html)
     */
    public inline fun cfnSecurityGroupEgress(
        scope: Construct,
        id: String,
        block: CfnSecurityGroupEgressDsl.() -> Unit = {},
    ): CfnSecurityGroupEgress {
        val builder = CfnSecurityGroupEgressDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds the specified egress rules to a security group for use with a VPC.
     *
     * An outbound rule permits instances to send traffic to the specified destination IPv4 or IPv6
     * CIDR address ranges, or to the specified destination security groups for the same VPC.
     *
     * You specify a protocol for each rule (for example, TCP). For the TCP and UDP protocols, you
     * must also specify the destination port or port range. For the ICMP protocol, you must also
     * specify the ICMP type and code. You can use -1 for the type or code to mean all types or all
     * codes.
     *
     * You must specify only one of the following properties: `CidrIp` , `CidrIpv6` ,
     * `DestinationPrefixListId` , or `DestinationSecurityGroupId` .
     *
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ). If you do not
     * specify one of these parameters, the stack will launch successfully but the rule will not be
     * added to the security group.
     *
     * Rule changes are propagated to affected instances as quickly as possible. However, a small
     * delay might occur.
     *
     * For more information about VPC security group limits, see
     * [Amazon VPC Limits](https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html)
     * .
     *
     * Use `SecurityGroup.Ingress` and `SecurityGroup.Egress` only when necessary, typically to
     * allow security groups to reference each other in ingress and egress rules. Otherwise, use the
     * embedded ingress and egress rules of the security group. For more information, see
     * [Amazon EC2 Security Groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html)
     * .
     *
     * The EC2 Security Group Rule is an embedded property of the `AWS::EC2::SecurityGroup` type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * EgressProperty egressProperty = EgressProperty.builder()
     * .ipProtocol("ipProtocol")
     * // the properties below are optional
     * .cidrIp("cidrIp")
     * .cidrIpv6("cidrIpv6")
     * .description("description")
     * .destinationPrefixListId("destinationPrefixListId")
     * .destinationSecurityGroupId("destinationSecurityGroupId")
     * .fromPort(123)
     * .toPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html)
     */
    public inline fun cfnSecurityGroupEgressProperty(
        block: CfnSecurityGroupEgressPropertyDsl.() -> Unit = {}
    ): CfnSecurityGroup.EgressProperty {
        val builder = CfnSecurityGroupEgressPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSecurityGroupEgress`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnSecurityGroupEgressProps cfnSecurityGroupEgressProps = CfnSecurityGroupEgressProps.builder()
     * .groupId("groupId")
     * .ipProtocol("ipProtocol")
     * // the properties below are optional
     * .cidrIp("cidrIp")
     * .cidrIpv6("cidrIpv6")
     * .description("description")
     * .destinationPrefixListId("destinationPrefixListId")
     * .destinationSecurityGroupId("destinationSecurityGroupId")
     * .fromPort(123)
     * .toPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html)
     */
    public inline fun cfnSecurityGroupEgressProps(
        block: CfnSecurityGroupEgressPropsDsl.() -> Unit = {}
    ): CfnSecurityGroupEgressProps {
        val builder = CfnSecurityGroupEgressPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds an inbound rule to a security group.
     *
     * An inbound rule permits instances to receive traffic from the specified IPv4 or IPv6 CIDR
     * address range, or from the instances associated with the specified security group.
     *
     * You must specify only one of the following properties: `CidrIp` , `CidrIpv6` ,
     * `SourcePrefixListId` , `SourceSecurityGroupId` , or `SourceSecurityGroupName` .
     *
     * You specify a protocol for each rule (for example, TCP). For TCP and UDP, you must also
     * specify a port or port range. For ICMP/ICMPv6, you must also specify the ICMP/ICMPv6 type and
     * code. You can use -1 to mean all types or all codes.
     *
     * You must specify a source security group ( `SourcePrefixListId` , `SourceSecurityGroupId` ,
     * or `SourceSecurityGroupName` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ). If you do not
     * specify one of these parameters, the stack will launch successfully but the rule will not be
     * added to the security group.
     *
     * Rule changes are propagated to instances within the security group as quickly as possible.
     * However, a small delay might occur.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnSecurityGroupIngress cfnSecurityGroupIngress = CfnSecurityGroupIngress.Builder.create(this,
     * "MyCfnSecurityGroupIngress")
     * .ipProtocol("ipProtocol")
     * // the properties below are optional
     * .cidrIp("cidrIp")
     * .cidrIpv6("cidrIpv6")
     * .description("description")
     * .fromPort(123)
     * .groupId("groupId")
     * .groupName("groupName")
     * .sourcePrefixListId("sourcePrefixListId")
     * .sourceSecurityGroupId("sourceSecurityGroupId")
     * .sourceSecurityGroupName("sourceSecurityGroupName")
     * .sourceSecurityGroupOwnerId("sourceSecurityGroupOwnerId")
     * .toPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html)
     */
    public inline fun cfnSecurityGroupIngress(
        scope: Construct,
        id: String,
        block: CfnSecurityGroupIngressDsl.() -> Unit = {},
    ): CfnSecurityGroupIngress {
        val builder = CfnSecurityGroupIngressDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds an inbound rule to a security group.
     *
     * An inbound rule permits instances to receive traffic from the specified IPv4 or IPv6 CIDR
     * address range, or from the instances associated with the specified security group.
     *
     * You must specify only one of the following properties: `CidrIp` , `CidrIpv6` ,
     * `SourcePrefixListId` , `SourceSecurityGroupId` , or `SourceSecurityGroupName` .
     *
     * You specify a protocol for each rule (for example, TCP). For TCP and UDP, you must also
     * specify a port or port range. For ICMP/ICMPv6, you must also specify the ICMP/ICMPv6 type and
     * code. You can use -1 to mean all types or all codes.
     *
     * You must specify a source security group ( `SourcePrefixListId` , `SourceSecurityGroupId` ,
     * or `SourceSecurityGroupName` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ). If you do not
     * specify one of these parameters, the stack will launch successfully but the rule will not be
     * added to the security group.
     *
     * Rule changes are propagated to instances within the security group as quickly as possible.
     * However, a small delay might occur.
     *
     * The EC2 Security Group Rule is an embedded property of the `AWS::EC2::SecurityGroup` type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * IngressProperty ingressProperty = IngressProperty.builder()
     * .ipProtocol("ipProtocol")
     * // the properties below are optional
     * .cidrIp("cidrIp")
     * .cidrIpv6("cidrIpv6")
     * .description("description")
     * .fromPort(123)
     * .sourcePrefixListId("sourcePrefixListId")
     * .sourceSecurityGroupId("sourceSecurityGroupId")
     * .sourceSecurityGroupName("sourceSecurityGroupName")
     * .sourceSecurityGroupOwnerId("sourceSecurityGroupOwnerId")
     * .toPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html)
     */
    public inline fun cfnSecurityGroupIngressProperty(
        block: CfnSecurityGroupIngressPropertyDsl.() -> Unit = {}
    ): CfnSecurityGroup.IngressProperty {
        val builder = CfnSecurityGroupIngressPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSecurityGroupIngress`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnSecurityGroupIngressProps cfnSecurityGroupIngressProps =
     * CfnSecurityGroupIngressProps.builder()
     * .ipProtocol("ipProtocol")
     * // the properties below are optional
     * .cidrIp("cidrIp")
     * .cidrIpv6("cidrIpv6")
     * .description("description")
     * .fromPort(123)
     * .groupId("groupId")
     * .groupName("groupName")
     * .sourcePrefixListId("sourcePrefixListId")
     * .sourceSecurityGroupId("sourceSecurityGroupId")
     * .sourceSecurityGroupName("sourceSecurityGroupName")
     * .sourceSecurityGroupOwnerId("sourceSecurityGroupOwnerId")
     * .toPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupingress.html)
     */
    public inline fun cfnSecurityGroupIngressProps(
        block: CfnSecurityGroupIngressPropsDsl.() -> Unit = {}
    ): CfnSecurityGroupIngressProps {
        val builder = CfnSecurityGroupIngressPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSecurityGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnSecurityGroupProps cfnSecurityGroupProps = CfnSecurityGroupProps.builder()
     * .groupDescription("groupDescription")
     * // the properties below are optional
     * .groupName("groupName")
     * .securityGroupEgress(List.of(EgressProperty.builder()
     * .ipProtocol("ipProtocol")
     * // the properties below are optional
     * .cidrIp("cidrIp")
     * .cidrIpv6("cidrIpv6")
     * .description("description")
     * .destinationPrefixListId("destinationPrefixListId")
     * .destinationSecurityGroupId("destinationSecurityGroupId")
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .securityGroupIngress(List.of(IngressProperty.builder()
     * .ipProtocol("ipProtocol")
     * // the properties below are optional
     * .cidrIp("cidrIp")
     * .cidrIpv6("cidrIpv6")
     * .description("description")
     * .fromPort(123)
     * .sourcePrefixListId("sourcePrefixListId")
     * .sourceSecurityGroupId("sourceSecurityGroupId")
     * .sourceSecurityGroupName("sourceSecurityGroupName")
     * .sourceSecurityGroupOwnerId("sourceSecurityGroupOwnerId")
     * .toPort(123)
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcId("vpcId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html)
     */
    public inline fun cfnSecurityGroupProps(
        block: CfnSecurityGroupPropsDsl.() -> Unit = {}
    ): CfnSecurityGroupProps {
        val builder = CfnSecurityGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a Spot Fleet request.
     *
     * The Spot Fleet request specifies the total target capacity and the On-Demand target capacity.
     * Amazon EC2 calculates the difference between the total capacity and On-Demand capacity, and
     * launches the difference as Spot capacity.
     *
     * You can submit a single request that includes multiple launch specifications that vary by
     * instance type, AMI, Availability Zone, or subnet.
     *
     * By default, the Spot Fleet requests Spot Instances in the Spot Instance pool where the price
     * per unit is the lowest. Each launch specification can include its own instance weighting that
     * reflects the value of the instance type to your application workload.
     *
     * Alternatively, you can specify that the Spot Fleet distribute the target capacity across the
     * Spot pools included in its launch specifications. By ensuring that the Spot Instances in your
     * Spot Fleet are in different Spot pools, you can improve the availability of your fleet.
     *
     * You can specify tags for the Spot Fleet request and instances launched by the fleet. You
     * cannot tag other resource types in a Spot Fleet request because only the `spot-fleet-request`
     * and `instance` resource types are supported.
     *
     * For more information, see
     * [Spot Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     *
     * We strongly discourage using the RequestSpotFleet API because it is a legacy API with no
     * planned investment. For options for requesting Spot Instances, see
     * [Which is the best Spot request method to use?](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-best-practices.html#which-spot-request-method-to-use)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnSpotFleet cfnSpotFleet = CfnSpotFleet.Builder.create(this, "MyCfnSpotFleet")
     * .spotFleetRequestConfigData(SpotFleetRequestConfigDataProperty.builder()
     * .iamFleetRole("iamFleetRole")
     * .targetCapacity(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .context("context")
     * .excessCapacityTerminationPolicy("excessCapacityTerminationPolicy")
     * .instanceInterruptionBehavior("instanceInterruptionBehavior")
     * .instancePoolsToUseCount(123)
     * .launchSpecifications(List.of(SpotFleetLaunchSpecificationProperty.builder()
     * .imageId("imageId")
     * // the properties below are optional
     * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * // the properties below are optional
     * .ebs(EbsBlockDeviceProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .snapshotId("snapshotId")
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice("noDevice")
     * .virtualName("virtualName")
     * .build()))
     * .ebsOptimized(false)
     * .iamInstanceProfile(IamInstanceProfileSpecificationProperty.builder()
     * .arn("arn")
     * .build())
     * .instanceRequirements(InstanceRequirementsRequestProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRangeRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .kernelId("kernelId")
     * .keyName("keyName")
     * .monitoring(SpotFleetMonitoringProperty.builder()
     * .enabled(false)
     * .build())
     * .networkInterfaces(List.of(InstanceNetworkInterfaceSpecificationProperty.builder()
     * .associatePublicIpAddress(false)
     * .deleteOnTermination(false)
     * .description("description")
     * .deviceIndex(123)
     * .groups(List.of("groups"))
     * .ipv6AddressCount(123)
     * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build()))
     * .networkInterfaceId("networkInterfaceId")
     * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
     * .privateIpAddress("privateIpAddress")
     * // the properties below are optional
     * .primary(false)
     * .build()))
     * .secondaryPrivateIpAddressCount(123)
     * .subnetId("subnetId")
     * .build()))
     * .placement(SpotPlacementProperty.builder()
     * .availabilityZone("availabilityZone")
     * .groupName("groupName")
     * .tenancy("tenancy")
     * .build())
     * .ramdiskId("ramdiskId")
     * .securityGroups(List.of(GroupIdentifierProperty.builder()
     * .groupId("groupId")
     * .build()))
     * .spotPrice("spotPrice")
     * .subnetId("subnetId")
     * .tagSpecifications(List.of(SpotFleetTagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * .userData("userData")
     * .weightedCapacity(123)
     * .build()))
     * .launchTemplateConfigs(List.of(LaunchTemplateConfigProperty.builder()
     * .launchTemplateSpecification(FleetLaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * .overrides(List.of(LaunchTemplateOverridesProperty.builder()
     * .availabilityZone("availabilityZone")
     * .instanceRequirements(InstanceRequirementsRequestProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRangeRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .priority(123)
     * .spotPrice("spotPrice")
     * .subnetId("subnetId")
     * .weightedCapacity(123)
     * .build()))
     * .build()))
     * .loadBalancersConfig(LoadBalancersConfigProperty.builder()
     * .classicLoadBalancersConfig(ClassicLoadBalancersConfigProperty.builder()
     * .classicLoadBalancers(List.of(ClassicLoadBalancerProperty.builder()
     * .name("name")
     * .build()))
     * .build())
     * .targetGroupsConfig(TargetGroupsConfigProperty.builder()
     * .targetGroups(List.of(TargetGroupProperty.builder()
     * .arn("arn")
     * .build()))
     * .build())
     * .build())
     * .onDemandAllocationStrategy("onDemandAllocationStrategy")
     * .onDemandMaxTotalPrice("onDemandMaxTotalPrice")
     * .onDemandTargetCapacity(123)
     * .replaceUnhealthyInstances(false)
     * .spotMaintenanceStrategies(SpotMaintenanceStrategiesProperty.builder()
     * .capacityRebalance(SpotCapacityRebalanceProperty.builder()
     * .replacementStrategy("replacementStrategy")
     * .terminationDelay(123)
     * .build())
     * .build())
     * .spotMaxTotalPrice("spotMaxTotalPrice")
     * .spotPrice("spotPrice")
     * .tagSpecifications(List.of(SpotFleetTagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * .targetCapacityUnitType("targetCapacityUnitType")
     * .terminateInstancesWithExpiration(false)
     * .type("type")
     * .validFrom("validFrom")
     * .validUntil("validUntil")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html)
     */
    public inline fun cfnSpotFleet(
        scope: Construct,
        id: String,
        block: CfnSpotFleetDsl.() -> Unit = {},
    ): CfnSpotFleet {
        val builder = CfnSpotFleetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips) on an
     * instance.
     *
     * To exclude accelerator-enabled instance types, set `Max` to `0` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AcceleratorCountRequestProperty acceleratorCountRequestProperty =
     * AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-acceleratorcountrequest.html)
     */
    public inline fun cfnSpotFleetAcceleratorCountRequestProperty(
        block: CfnSpotFleetAcceleratorCountRequestPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.AcceleratorCountRequestProperty {
        val builder = CfnSpotFleetAcceleratorCountRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum amount of total accelerator memory, in MiB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AcceleratorTotalMemoryMiBRequestProperty acceleratorTotalMemoryMiBRequestProperty =
     * AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-acceleratortotalmemorymibrequest.html)
     */
    public inline fun cfnSpotFleetAcceleratorTotalMemoryMiBRequestProperty(
        block: CfnSpotFleetAcceleratorTotalMemoryMiBRequestPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty {
        val builder = CfnSpotFleetAcceleratorTotalMemoryMiBRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps.
     *
     * For more information, see
     * [Amazon EBS–optimized instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * BaselineEbsBandwidthMbpsRequestProperty baselineEbsBandwidthMbpsRequestProperty =
     * BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-baselineebsbandwidthmbpsrequest.html)
     */
    public inline fun cfnSpotFleetBaselineEbsBandwidthMbpsRequestProperty(
        block: CfnSpotFleetBaselineEbsBandwidthMbpsRequestPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty {
        val builder = CfnSpotFleetBaselineEbsBandwidthMbpsRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a block device mapping.
     *
     * You can specify `Ebs` or `VirtualName` , but not both.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * BlockDeviceMappingProperty blockDeviceMappingProperty = BlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * // the properties below are optional
     * .ebs(EbsBlockDeviceProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .snapshotId("snapshotId")
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice("noDevice")
     * .virtualName("virtualName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-blockdevicemapping.html)
     */
    public inline fun cfnSpotFleetBlockDeviceMappingProperty(
        block: CfnSpotFleetBlockDeviceMappingPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.BlockDeviceMappingProperty {
        val builder = CfnSpotFleetBlockDeviceMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a Classic Load Balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ClassicLoadBalancerProperty classicLoadBalancerProperty = ClassicLoadBalancerProperty.builder()
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancer.html)
     */
    public inline fun cfnSpotFleetClassicLoadBalancerProperty(
        block: CfnSpotFleetClassicLoadBalancerPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.ClassicLoadBalancerProperty {
        val builder = CfnSpotFleetClassicLoadBalancerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the Classic Load Balancers to attach to a Spot Fleet.
     *
     * Spot Fleet registers the running Spot Instances with these Classic Load Balancers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ClassicLoadBalancersConfigProperty classicLoadBalancersConfigProperty =
     * ClassicLoadBalancersConfigProperty.builder()
     * .classicLoadBalancers(List.of(ClassicLoadBalancerProperty.builder()
     * .name("name")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html)
     */
    public inline fun cfnSpotFleetClassicLoadBalancersConfigProperty(
        block: CfnSpotFleetClassicLoadBalancersConfigPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.ClassicLoadBalancersConfigProperty {
        val builder = CfnSpotFleetClassicLoadBalancersConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a block device for an EBS volume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * EbsBlockDeviceProperty ebsBlockDeviceProperty = EbsBlockDeviceProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .snapshotId("snapshotId")
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-ebsblockdevice.html)
     */
    public inline fun cfnSpotFleetEbsBlockDeviceProperty(
        block: CfnSpotFleetEbsBlockDevicePropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.EbsBlockDeviceProperty {
        val builder = CfnSpotFleetEbsBlockDevicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the launch template to be used by the Spot Fleet request for configuring Amazon EC2
     * instances.
     *
     * You must specify the following:
     * * The ID or the name of the launch template, but not both.
     * * The version of the launch template.
     *
     * `FleetLaunchTemplateSpecification` is a property of the
     * [AWS::EC2::SpotFleet](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html)
     * resource.
     *
     * For information about creating a launch template, see
     * [AWS::EC2::LaunchTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
     * and
     * [Create a launch template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
     * in the *Amazon EC2 User Guide* .
     *
     * For examples of launch templates, see
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#aws-resource-ec2-launchtemplate--examples)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * FleetLaunchTemplateSpecificationProperty fleetLaunchTemplateSpecificationProperty =
     * FleetLaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html)
     */
    public inline fun cfnSpotFleetFleetLaunchTemplateSpecificationProperty(
        block: CfnSpotFleetFleetLaunchTemplateSpecificationPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.FleetLaunchTemplateSpecificationProperty {
        val builder = CfnSpotFleetFleetLaunchTemplateSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a security group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * GroupIdentifierProperty groupIdentifierProperty = GroupIdentifierProperty.builder()
     * .groupId("groupId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-groupidentifier.html)
     */
    public inline fun cfnSpotFleetGroupIdentifierProperty(
        block: CfnSpotFleetGroupIdentifierPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.GroupIdentifierProperty {
        val builder = CfnSpotFleetGroupIdentifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an IAM instance profile.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * IamInstanceProfileSpecificationProperty iamInstanceProfileSpecificationProperty =
     * IamInstanceProfileSpecificationProperty.builder()
     * .arn("arn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-iaminstanceprofilespecification.html)
     */
    public inline fun cfnSpotFleetIamInstanceProfileSpecificationProperty(
        block: CfnSpotFleetIamInstanceProfileSpecificationPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.IamInstanceProfileSpecificationProperty {
        val builder = CfnSpotFleetIamInstanceProfileSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an IPv6 address.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * InstanceIpv6AddressProperty instanceIpv6AddressProperty = InstanceIpv6AddressProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instanceipv6address.html)
     */
    public inline fun cfnSpotFleetInstanceIpv6AddressProperty(
        block: CfnSpotFleetInstanceIpv6AddressPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.InstanceIpv6AddressProperty {
        val builder = CfnSpotFleetInstanceIpv6AddressPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a network interface.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * InstanceNetworkInterfaceSpecificationProperty instanceNetworkInterfaceSpecificationProperty =
     * InstanceNetworkInterfaceSpecificationProperty.builder()
     * .associatePublicIpAddress(false)
     * .deleteOnTermination(false)
     * .description("description")
     * .deviceIndex(123)
     * .groups(List.of("groups"))
     * .ipv6AddressCount(123)
     * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build()))
     * .networkInterfaceId("networkInterfaceId")
     * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
     * .privateIpAddress("privateIpAddress")
     * // the properties below are optional
     * .primary(false)
     * .build()))
     * .secondaryPrivateIpAddressCount(123)
     * .subnetId("subnetId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html)
     */
    public inline fun cfnSpotFleetInstanceNetworkInterfaceSpecificationProperty(
        block: CfnSpotFleetInstanceNetworkInterfaceSpecificationPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty {
        val builder = CfnSpotFleetInstanceNetworkInterfaceSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The attributes for the instance types.
     *
     * When you specify instance attributes, Amazon EC2 will identify instance types with these
     * attributes.
     *
     * You must specify `VCpuCount` and `MemoryMiB` . All other attributes are optional. Any
     * unspecified optional attribute is set to its default.
     *
     * When you specify multiple attributes, you get instance types that satisfy all of the
     * specified attributes. If you specify multiple values for an attribute, you get instance types
     * that satisfy any of the specified values.
     *
     * To limit the list of instance types from which Amazon EC2 can identify matching instance
     * types, you can use one of the following parameters, but not both in the same request:
     * * `AllowedInstanceTypes` - The instance types to include in the list. All other instance
     *   types are ignored, even if they match your specified attributes.
     * * `ExcludedInstanceTypes` - The instance types to exclude from the list, even if they match
     *   your specified attributes.
     *
     * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
     *
     * Attribute-based instance type selection is only supported when using Auto Scaling groups, EC2
     * Fleet, and Spot Fleet to launch instances. If you plan to use the launch template in the
     * [launch instance wizard](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-instance-wizard.html)
     * , or with the
     * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
     * API or
     * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     * AWS CloudFormation resource, you can't specify `InstanceRequirements` .
     *
     * For more information, see
     * [Attribute-based instance type selection for EC2 Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html)
     * ,
     * [Attribute-based instance type selection for Spot Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-attribute-based-instance-type-selection.html)
     * , and
     * [Spot placement score](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-placement-score.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * InstanceRequirementsRequestProperty instanceRequirementsRequestProperty =
     * InstanceRequirementsRequestProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRangeRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html)
     */
    public inline fun cfnSpotFleetInstanceRequirementsRequestProperty(
        block: CfnSpotFleetInstanceRequirementsRequestPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.InstanceRequirementsRequestProperty {
        val builder = CfnSpotFleetInstanceRequirementsRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a launch template and overrides.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * LaunchTemplateConfigProperty launchTemplateConfigProperty =
     * LaunchTemplateConfigProperty.builder()
     * .launchTemplateSpecification(FleetLaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * .overrides(List.of(LaunchTemplateOverridesProperty.builder()
     * .availabilityZone("availabilityZone")
     * .instanceRequirements(InstanceRequirementsRequestProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRangeRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .priority(123)
     * .spotPrice("spotPrice")
     * .subnetId("subnetId")
     * .weightedCapacity(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html)
     */
    public inline fun cfnSpotFleetLaunchTemplateConfigProperty(
        block: CfnSpotFleetLaunchTemplateConfigPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.LaunchTemplateConfigProperty {
        val builder = CfnSpotFleetLaunchTemplateConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies overrides for a launch template.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * LaunchTemplateOverridesProperty launchTemplateOverridesProperty =
     * LaunchTemplateOverridesProperty.builder()
     * .availabilityZone("availabilityZone")
     * .instanceRequirements(InstanceRequirementsRequestProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRangeRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .priority(123)
     * .spotPrice("spotPrice")
     * .subnetId("subnetId")
     * .weightedCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html)
     */
    public inline fun cfnSpotFleetLaunchTemplateOverridesProperty(
        block: CfnSpotFleetLaunchTemplateOverridesPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.LaunchTemplateOverridesProperty {
        val builder = CfnSpotFleetLaunchTemplateOverridesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the Classic Load Balancers and target groups to attach to a Spot Fleet request.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * LoadBalancersConfigProperty loadBalancersConfigProperty = LoadBalancersConfigProperty.builder()
     * .classicLoadBalancersConfig(ClassicLoadBalancersConfigProperty.builder()
     * .classicLoadBalancers(List.of(ClassicLoadBalancerProperty.builder()
     * .name("name")
     * .build()))
     * .build())
     * .targetGroupsConfig(TargetGroupsConfigProperty.builder()
     * .targetGroups(List.of(TargetGroupProperty.builder()
     * .arn("arn")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html)
     */
    public inline fun cfnSpotFleetLoadBalancersConfigProperty(
        block: CfnSpotFleetLoadBalancersConfigPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.LoadBalancersConfigProperty {
        val builder = CfnSpotFleetLoadBalancersConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum amount of memory per vCPU, in GiB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * MemoryGiBPerVCpuRequestProperty memoryGiBPerVCpuRequestProperty =
     * MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-memorygibpervcpurequest.html)
     */
    public inline fun cfnSpotFleetMemoryGiBPerVCpuRequestProperty(
        block: CfnSpotFleetMemoryGiBPerVCpuRequestPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.MemoryGiBPerVCpuRequestProperty {
        val builder = CfnSpotFleetMemoryGiBPerVCpuRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum amount of memory, in MiB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * MemoryMiBRequestProperty memoryMiBRequestProperty = MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-memorymibrequest.html)
     */
    public inline fun cfnSpotFleetMemoryMiBRequestProperty(
        block: CfnSpotFleetMemoryMiBRequestPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.MemoryMiBRequestProperty {
        val builder = CfnSpotFleetMemoryMiBRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum amount of baseline network bandwidth, in gigabits per second (Gbps).
     *
     * For more information, see
     * [Amazon EC2 instance network bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: No minimum or maximum limits
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * NetworkBandwidthGbpsRequestProperty networkBandwidthGbpsRequestProperty =
     * NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-networkbandwidthgbpsrequest.html)
     */
    public inline fun cfnSpotFleetNetworkBandwidthGbpsRequestProperty(
        block: CfnSpotFleetNetworkBandwidthGbpsRequestPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.NetworkBandwidthGbpsRequestProperty {
        val builder = CfnSpotFleetNetworkBandwidthGbpsRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum number of network interfaces.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * NetworkInterfaceCountRequestProperty networkInterfaceCountRequestProperty =
     * NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-networkinterfacecountrequest.html)
     */
    public inline fun cfnSpotFleetNetworkInterfaceCountRequestProperty(
        block: CfnSpotFleetNetworkInterfaceCountRequestPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.NetworkInterfaceCountRequestProperty {
        val builder = CfnSpotFleetNetworkInterfaceCountRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a secondary private IPv4 address for a network interface.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PrivateIpAddressSpecificationProperty privateIpAddressSpecificationProperty =
     * PrivateIpAddressSpecificationProperty.builder()
     * .privateIpAddress("privateIpAddress")
     * // the properties below are optional
     * .primary(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-privateipaddressspecification.html)
     */
    public inline fun cfnSpotFleetPrivateIpAddressSpecificationProperty(
        block: CfnSpotFleetPrivateIpAddressSpecificationPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.PrivateIpAddressSpecificationProperty {
        val builder = CfnSpotFleetPrivateIpAddressSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSpotFleet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnSpotFleetProps cfnSpotFleetProps = CfnSpotFleetProps.builder()
     * .spotFleetRequestConfigData(SpotFleetRequestConfigDataProperty.builder()
     * .iamFleetRole("iamFleetRole")
     * .targetCapacity(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .context("context")
     * .excessCapacityTerminationPolicy("excessCapacityTerminationPolicy")
     * .instanceInterruptionBehavior("instanceInterruptionBehavior")
     * .instancePoolsToUseCount(123)
     * .launchSpecifications(List.of(SpotFleetLaunchSpecificationProperty.builder()
     * .imageId("imageId")
     * // the properties below are optional
     * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * // the properties below are optional
     * .ebs(EbsBlockDeviceProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .snapshotId("snapshotId")
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice("noDevice")
     * .virtualName("virtualName")
     * .build()))
     * .ebsOptimized(false)
     * .iamInstanceProfile(IamInstanceProfileSpecificationProperty.builder()
     * .arn("arn")
     * .build())
     * .instanceRequirements(InstanceRequirementsRequestProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRangeRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .kernelId("kernelId")
     * .keyName("keyName")
     * .monitoring(SpotFleetMonitoringProperty.builder()
     * .enabled(false)
     * .build())
     * .networkInterfaces(List.of(InstanceNetworkInterfaceSpecificationProperty.builder()
     * .associatePublicIpAddress(false)
     * .deleteOnTermination(false)
     * .description("description")
     * .deviceIndex(123)
     * .groups(List.of("groups"))
     * .ipv6AddressCount(123)
     * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build()))
     * .networkInterfaceId("networkInterfaceId")
     * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
     * .privateIpAddress("privateIpAddress")
     * // the properties below are optional
     * .primary(false)
     * .build()))
     * .secondaryPrivateIpAddressCount(123)
     * .subnetId("subnetId")
     * .build()))
     * .placement(SpotPlacementProperty.builder()
     * .availabilityZone("availabilityZone")
     * .groupName("groupName")
     * .tenancy("tenancy")
     * .build())
     * .ramdiskId("ramdiskId")
     * .securityGroups(List.of(GroupIdentifierProperty.builder()
     * .groupId("groupId")
     * .build()))
     * .spotPrice("spotPrice")
     * .subnetId("subnetId")
     * .tagSpecifications(List.of(SpotFleetTagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * .userData("userData")
     * .weightedCapacity(123)
     * .build()))
     * .launchTemplateConfigs(List.of(LaunchTemplateConfigProperty.builder()
     * .launchTemplateSpecification(FleetLaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * .overrides(List.of(LaunchTemplateOverridesProperty.builder()
     * .availabilityZone("availabilityZone")
     * .instanceRequirements(InstanceRequirementsRequestProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRangeRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .priority(123)
     * .spotPrice("spotPrice")
     * .subnetId("subnetId")
     * .weightedCapacity(123)
     * .build()))
     * .build()))
     * .loadBalancersConfig(LoadBalancersConfigProperty.builder()
     * .classicLoadBalancersConfig(ClassicLoadBalancersConfigProperty.builder()
     * .classicLoadBalancers(List.of(ClassicLoadBalancerProperty.builder()
     * .name("name")
     * .build()))
     * .build())
     * .targetGroupsConfig(TargetGroupsConfigProperty.builder()
     * .targetGroups(List.of(TargetGroupProperty.builder()
     * .arn("arn")
     * .build()))
     * .build())
     * .build())
     * .onDemandAllocationStrategy("onDemandAllocationStrategy")
     * .onDemandMaxTotalPrice("onDemandMaxTotalPrice")
     * .onDemandTargetCapacity(123)
     * .replaceUnhealthyInstances(false)
     * .spotMaintenanceStrategies(SpotMaintenanceStrategiesProperty.builder()
     * .capacityRebalance(SpotCapacityRebalanceProperty.builder()
     * .replacementStrategy("replacementStrategy")
     * .terminationDelay(123)
     * .build())
     * .build())
     * .spotMaxTotalPrice("spotMaxTotalPrice")
     * .spotPrice("spotPrice")
     * .tagSpecifications(List.of(SpotFleetTagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * .targetCapacityUnitType("targetCapacityUnitType")
     * .terminateInstancesWithExpiration(false)
     * .type("type")
     * .validFrom("validFrom")
     * .validUntil("validUntil")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html)
     */
    public inline fun cfnSpotFleetProps(
        block: CfnSpotFleetPropsDsl.() -> Unit = {}
    ): CfnSpotFleetProps {
        val builder = CfnSpotFleetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Spot Instance replacement strategy to use when Amazon EC2 emits a signal that your Spot
     * Instance is at an elevated risk of being interrupted.
     *
     * For more information, see
     * [Capacity rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-capacity-rebalance.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * SpotCapacityRebalanceProperty spotCapacityRebalanceProperty =
     * SpotCapacityRebalanceProperty.builder()
     * .replacementStrategy("replacementStrategy")
     * .terminationDelay(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotcapacityrebalance.html)
     */
    public inline fun cfnSpotFleetSpotCapacityRebalanceProperty(
        block: CfnSpotFleetSpotCapacityRebalancePropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.SpotCapacityRebalanceProperty {
        val builder = CfnSpotFleetSpotCapacityRebalancePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the launch specification for one or more Spot Instances.
     *
     * If you include On-Demand capacity in your fleet request, you can't use
     * `SpotFleetLaunchSpecification` ; you must use
     * [LaunchTemplateConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * SpotFleetLaunchSpecificationProperty spotFleetLaunchSpecificationProperty =
     * SpotFleetLaunchSpecificationProperty.builder()
     * .imageId("imageId")
     * // the properties below are optional
     * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * // the properties below are optional
     * .ebs(EbsBlockDeviceProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .snapshotId("snapshotId")
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice("noDevice")
     * .virtualName("virtualName")
     * .build()))
     * .ebsOptimized(false)
     * .iamInstanceProfile(IamInstanceProfileSpecificationProperty.builder()
     * .arn("arn")
     * .build())
     * .instanceRequirements(InstanceRequirementsRequestProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRangeRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .kernelId("kernelId")
     * .keyName("keyName")
     * .monitoring(SpotFleetMonitoringProperty.builder()
     * .enabled(false)
     * .build())
     * .networkInterfaces(List.of(InstanceNetworkInterfaceSpecificationProperty.builder()
     * .associatePublicIpAddress(false)
     * .deleteOnTermination(false)
     * .description("description")
     * .deviceIndex(123)
     * .groups(List.of("groups"))
     * .ipv6AddressCount(123)
     * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build()))
     * .networkInterfaceId("networkInterfaceId")
     * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
     * .privateIpAddress("privateIpAddress")
     * // the properties below are optional
     * .primary(false)
     * .build()))
     * .secondaryPrivateIpAddressCount(123)
     * .subnetId("subnetId")
     * .build()))
     * .placement(SpotPlacementProperty.builder()
     * .availabilityZone("availabilityZone")
     * .groupName("groupName")
     * .tenancy("tenancy")
     * .build())
     * .ramdiskId("ramdiskId")
     * .securityGroups(List.of(GroupIdentifierProperty.builder()
     * .groupId("groupId")
     * .build()))
     * .spotPrice("spotPrice")
     * .subnetId("subnetId")
     * .tagSpecifications(List.of(SpotFleetTagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * .userData("userData")
     * .weightedCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html)
     */
    public inline fun cfnSpotFleetSpotFleetLaunchSpecificationProperty(
        block: CfnSpotFleetSpotFleetLaunchSpecificationPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.SpotFleetLaunchSpecificationProperty {
        val builder = CfnSpotFleetSpotFleetLaunchSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes whether monitoring is enabled.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * SpotFleetMonitoringProperty spotFleetMonitoringProperty = SpotFleetMonitoringProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetmonitoring.html)
     */
    public inline fun cfnSpotFleetSpotFleetMonitoringProperty(
        block: CfnSpotFleetSpotFleetMonitoringPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.SpotFleetMonitoringProperty {
        val builder = CfnSpotFleetSpotFleetMonitoringPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration of a Spot Fleet request.
     *
     * For more information, see
     * [Spot Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet.html) in the
     * *Amazon EC2 User Guide* .
     *
     * You must specify either `LaunchSpecifications` or `LaunchTemplateConfigs` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * SpotFleetRequestConfigDataProperty spotFleetRequestConfigDataProperty =
     * SpotFleetRequestConfigDataProperty.builder()
     * .iamFleetRole("iamFleetRole")
     * .targetCapacity(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .context("context")
     * .excessCapacityTerminationPolicy("excessCapacityTerminationPolicy")
     * .instanceInterruptionBehavior("instanceInterruptionBehavior")
     * .instancePoolsToUseCount(123)
     * .launchSpecifications(List.of(SpotFleetLaunchSpecificationProperty.builder()
     * .imageId("imageId")
     * // the properties below are optional
     * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * // the properties below are optional
     * .ebs(EbsBlockDeviceProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .snapshotId("snapshotId")
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice("noDevice")
     * .virtualName("virtualName")
     * .build()))
     * .ebsOptimized(false)
     * .iamInstanceProfile(IamInstanceProfileSpecificationProperty.builder()
     * .arn("arn")
     * .build())
     * .instanceRequirements(InstanceRequirementsRequestProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRangeRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .kernelId("kernelId")
     * .keyName("keyName")
     * .monitoring(SpotFleetMonitoringProperty.builder()
     * .enabled(false)
     * .build())
     * .networkInterfaces(List.of(InstanceNetworkInterfaceSpecificationProperty.builder()
     * .associatePublicIpAddress(false)
     * .deleteOnTermination(false)
     * .description("description")
     * .deviceIndex(123)
     * .groups(List.of("groups"))
     * .ipv6AddressCount(123)
     * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
     * .ipv6Address("ipv6Address")
     * .build()))
     * .networkInterfaceId("networkInterfaceId")
     * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
     * .privateIpAddress("privateIpAddress")
     * // the properties below are optional
     * .primary(false)
     * .build()))
     * .secondaryPrivateIpAddressCount(123)
     * .subnetId("subnetId")
     * .build()))
     * .placement(SpotPlacementProperty.builder()
     * .availabilityZone("availabilityZone")
     * .groupName("groupName")
     * .tenancy("tenancy")
     * .build())
     * .ramdiskId("ramdiskId")
     * .securityGroups(List.of(GroupIdentifierProperty.builder()
     * .groupId("groupId")
     * .build()))
     * .spotPrice("spotPrice")
     * .subnetId("subnetId")
     * .tagSpecifications(List.of(SpotFleetTagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * .userData("userData")
     * .weightedCapacity(123)
     * .build()))
     * .launchTemplateConfigs(List.of(LaunchTemplateConfigProperty.builder()
     * .launchTemplateSpecification(FleetLaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * .overrides(List.of(LaunchTemplateOverridesProperty.builder()
     * .availabilityZone("availabilityZone")
     * .instanceRequirements(InstanceRequirementsRequestProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRangeRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .priority(123)
     * .spotPrice("spotPrice")
     * .subnetId("subnetId")
     * .weightedCapacity(123)
     * .build()))
     * .build()))
     * .loadBalancersConfig(LoadBalancersConfigProperty.builder()
     * .classicLoadBalancersConfig(ClassicLoadBalancersConfigProperty.builder()
     * .classicLoadBalancers(List.of(ClassicLoadBalancerProperty.builder()
     * .name("name")
     * .build()))
     * .build())
     * .targetGroupsConfig(TargetGroupsConfigProperty.builder()
     * .targetGroups(List.of(TargetGroupProperty.builder()
     * .arn("arn")
     * .build()))
     * .build())
     * .build())
     * .onDemandAllocationStrategy("onDemandAllocationStrategy")
     * .onDemandMaxTotalPrice("onDemandMaxTotalPrice")
     * .onDemandTargetCapacity(123)
     * .replaceUnhealthyInstances(false)
     * .spotMaintenanceStrategies(SpotMaintenanceStrategiesProperty.builder()
     * .capacityRebalance(SpotCapacityRebalanceProperty.builder()
     * .replacementStrategy("replacementStrategy")
     * .terminationDelay(123)
     * .build())
     * .build())
     * .spotMaxTotalPrice("spotMaxTotalPrice")
     * .spotPrice("spotPrice")
     * .tagSpecifications(List.of(SpotFleetTagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * .targetCapacityUnitType("targetCapacityUnitType")
     * .terminateInstancesWithExpiration(false)
     * .type("type")
     * .validFrom("validFrom")
     * .validUntil("validUntil")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html)
     */
    public inline fun cfnSpotFleetSpotFleetRequestConfigDataProperty(
        block: CfnSpotFleetSpotFleetRequestConfigDataPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.SpotFleetRequestConfigDataProperty {
        val builder = CfnSpotFleetSpotFleetRequestConfigDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The tags for a Spot Fleet resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * SpotFleetTagSpecificationProperty spotFleetTagSpecificationProperty =
     * SpotFleetTagSpecificationProperty.builder()
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleettagspecification.html)
     */
    public inline fun cfnSpotFleetSpotFleetTagSpecificationProperty(
        block: CfnSpotFleetSpotFleetTagSpecificationPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.SpotFleetTagSpecificationProperty {
        val builder = CfnSpotFleetSpotFleetTagSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The strategies for managing your Spot Instances that are at an elevated risk of being
     * interrupted.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * SpotMaintenanceStrategiesProperty spotMaintenanceStrategiesProperty =
     * SpotMaintenanceStrategiesProperty.builder()
     * .capacityRebalance(SpotCapacityRebalanceProperty.builder()
     * .replacementStrategy("replacementStrategy")
     * .terminationDelay(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotmaintenancestrategies.html)
     */
    public inline fun cfnSpotFleetSpotMaintenanceStrategiesProperty(
        block: CfnSpotFleetSpotMaintenanceStrategiesPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.SpotMaintenanceStrategiesProperty {
        val builder = CfnSpotFleetSpotMaintenanceStrategiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes Spot Instance placement.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * SpotPlacementProperty spotPlacementProperty = SpotPlacementProperty.builder()
     * .availabilityZone("availabilityZone")
     * .groupName("groupName")
     * .tenancy("tenancy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotplacement.html)
     */
    public inline fun cfnSpotFleetSpotPlacementProperty(
        block: CfnSpotFleetSpotPlacementPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.SpotPlacementProperty {
        val builder = CfnSpotFleetSpotPlacementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a load balancer target group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * TargetGroupProperty targetGroupProperty = TargetGroupProperty.builder()
     * .arn("arn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroup.html)
     */
    public inline fun cfnSpotFleetTargetGroupProperty(
        block: CfnSpotFleetTargetGroupPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.TargetGroupProperty {
        val builder = CfnSpotFleetTargetGroupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the target groups to attach to a Spot Fleet.
     *
     * Spot Fleet registers the running Spot Instances with these target groups.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * TargetGroupsConfigProperty targetGroupsConfigProperty = TargetGroupsConfigProperty.builder()
     * .targetGroups(List.of(TargetGroupProperty.builder()
     * .arn("arn")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html)
     */
    public inline fun cfnSpotFleetTargetGroupsConfigProperty(
        block: CfnSpotFleetTargetGroupsConfigPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.TargetGroupsConfigProperty {
        val builder = CfnSpotFleetTargetGroupsConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum amount of total local storage, in GB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * TotalLocalStorageGBRequestProperty totalLocalStorageGBRequestProperty =
     * TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-totallocalstoragegbrequest.html)
     */
    public inline fun cfnSpotFleetTotalLocalStorageGBRequestProperty(
        block: CfnSpotFleetTotalLocalStorageGBRequestPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.TotalLocalStorageGBRequestProperty {
        val builder = CfnSpotFleetTotalLocalStorageGBRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum number of vCPUs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * VCpuCountRangeRequestProperty vCpuCountRangeRequestProperty =
     * VCpuCountRangeRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-vcpucountrangerequest.html)
     */
    public inline fun cfnSpotFleetVCpuCountRangeRequestProperty(
        block: CfnSpotFleetVCpuCountRangeRequestPropertyDsl.() -> Unit = {}
    ): CfnSpotFleet.VCpuCountRangeRequestProperty {
        val builder = CfnSpotFleetVCpuCountRangeRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a subnet for the specified VPC.
     *
     * For an IPv4 only subnet, specify an IPv4 CIDR block. If the VPC has an IPv6 CIDR block, you
     * can create an IPv6 only subnet or a dual stack subnet instead. For an IPv6 only subnet,
     * specify an IPv6 CIDR block. For a dual stack subnet, specify both an IPv4 CIDR block and an
     * IPv6 CIDR block.
     *
     * For more information, see
     * [Subnets for your VPC](https://docs.aws.amazon.com/vpc/latest/userguide/configure-subnets.html)
     * in the *Amazon VPC User Guide* .
     *
     * Example:
     * ```
     * Vpc vpc;
     * public void associateSubnetWithV6Cidr(Vpc vpc, Number count, ISubnet subnet) {
     * CfnSubnet cfnSubnet = (CfnSubnet)subnet.getNode().getDefaultChild();
     * cfnSubnet.getIpv6CidrBlock() = Fn.select(count, Fn.cidr(Fn.select(0,
     * vpc.getVpcIpv6CidrBlocks()), 256, (128 - 64).toString()));
     * cfnSubnet.getAssignIpv6AddressOnCreation() = true;
     * }
     * // make an ipv6 cidr
     * CfnVPCCidrBlock ipv6cidr = CfnVPCCidrBlock.Builder.create(this, "CIDR6")
     * .vpcId(vpc.getVpcId())
     * .amazonProvidedIpv6CidrBlock(true)
     * .build();
     * // connect the ipv6 cidr to all vpc subnets
     * Number subnetcount = 0;
     * ISubnet[] subnets = vpc.publicSubnets.concat(vpc.getPrivateSubnets());
     * for (Object subnet : subnets) {
     * // Wait for the ipv6 cidr to complete
     * subnet.node.addDependency(ipv6cidr);
     * associateSubnetWithV6Cidr(vpc, subnetcount, subnet);
     * subnetcount = subnetcount + 1;
     * }
     * Cluster cluster = Cluster.Builder.create(this, "hello-eks")
     * .version(KubernetesVersion.V1_27)
     * .vpc(vpc)
     * .ipFamily(IpFamily.IP_V6)
     * .vpcSubnets(List.of(SubnetSelection.builder().subnets(vpc.getPublicSubnets()).build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html)
     */
    public inline fun cfnSubnet(
        scope: Construct,
        id: String,
        block: CfnSubnetDsl.() -> Unit = {},
    ): CfnSubnet {
        val builder = CfnSubnetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates a CIDR block with your subnet.
     *
     * You can associate a single IPv6 CIDR block with your subnet. An IPv6 CIDR block must have a
     * prefix length of /64.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnSubnetCidrBlock cfnSubnetCidrBlock = CfnSubnetCidrBlock.Builder.create(this,
     * "MyCfnSubnetCidrBlock")
     * .ipv6CidrBlock("ipv6CidrBlock")
     * .subnetId("subnetId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html)
     */
    public inline fun cfnSubnetCidrBlock(
        scope: Construct,
        id: String,
        block: CfnSubnetCidrBlockDsl.() -> Unit = {},
    ): CfnSubnetCidrBlock {
        val builder = CfnSubnetCidrBlockDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSubnetCidrBlock`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnSubnetCidrBlockProps cfnSubnetCidrBlockProps = CfnSubnetCidrBlockProps.builder()
     * .ipv6CidrBlock("ipv6CidrBlock")
     * .subnetId("subnetId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html)
     */
    public inline fun cfnSubnetCidrBlockProps(
        block: CfnSubnetCidrBlockPropsDsl.() -> Unit = {}
    ): CfnSubnetCidrBlockProps {
        val builder = CfnSubnetCidrBlockPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates a subnet with a network ACL. For more information, see
     * [ReplaceNetworkAclAssociation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-ReplaceNetworkAclAssociation.html)
     * in the *Amazon EC2 API Reference* .
     *
     * When `AWS::EC2::SubnetNetworkAclAssociation` resources are created during create or update
     * operations, AWS CloudFormation adopts existing resources that share the same key properties
     * (the properties that contribute to uniquely identify the resource). However, if the operation
     * fails and rolls back, AWS CloudFormation deletes the previously out-of-band resources. You
     * can protect against this behavior by using `Retain` deletion policies. For more information,
     * see
     * [DeletionPolicy Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnSubnetNetworkAclAssociation cfnSubnetNetworkAclAssociation =
     * CfnSubnetNetworkAclAssociation.Builder.create(this, "MyCfnSubnetNetworkAclAssociation")
     * .networkAclId("networkAclId")
     * .subnetId("subnetId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html)
     */
    public inline fun cfnSubnetNetworkAclAssociation(
        scope: Construct,
        id: String,
        block: CfnSubnetNetworkAclAssociationDsl.() -> Unit = {},
    ): CfnSubnetNetworkAclAssociation {
        val builder = CfnSubnetNetworkAclAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSubnetNetworkAclAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnSubnetNetworkAclAssociationProps cfnSubnetNetworkAclAssociationProps =
     * CfnSubnetNetworkAclAssociationProps.builder()
     * .networkAclId("networkAclId")
     * .subnetId("subnetId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html)
     */
    public inline fun cfnSubnetNetworkAclAssociationProps(
        block: CfnSubnetNetworkAclAssociationPropsDsl.() -> Unit = {}
    ): CfnSubnetNetworkAclAssociationProps {
        val builder = CfnSubnetNetworkAclAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the options for instance hostnames.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PrivateDnsNameOptionsOnLaunchProperty privateDnsNameOptionsOnLaunchProperty =
     * PrivateDnsNameOptionsOnLaunchProperty.builder()
     * .enableResourceNameDnsAaaaRecord(false)
     * .enableResourceNameDnsARecord(false)
     * .hostnameType("hostnameType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-subnet-privatednsnameoptionsonlaunch.html)
     */
    public inline fun cfnSubnetPrivateDnsNameOptionsOnLaunchProperty(
        block: CfnSubnetPrivateDnsNameOptionsOnLaunchPropertyDsl.() -> Unit = {}
    ): CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty {
        val builder = CfnSubnetPrivateDnsNameOptionsOnLaunchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSubnet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * Object privateDnsNameOptionsOnLaunch;
     * CfnSubnetProps cfnSubnetProps = CfnSubnetProps.builder()
     * .vpcId("vpcId")
     * // the properties below are optional
     * .assignIpv6AddressOnCreation(false)
     * .availabilityZone("availabilityZone")
     * .availabilityZoneId("availabilityZoneId")
     * .cidrBlock("cidrBlock")
     * .enableDns64(false)
     * .ipv6CidrBlock("ipv6CidrBlock")
     * .ipv6Native(false)
     * .mapPublicIpOnLaunch(false)
     * .outpostArn("outpostArn")
     * .privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html)
     */
    public inline fun cfnSubnetProps(block: CfnSubnetPropsDsl.() -> Unit = {}): CfnSubnetProps {
        val builder = CfnSubnetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates a subnet with a route table.
     *
     * The subnet and route table must be in the same VPC. This association causes traffic
     * originating from the subnet to be routed according to the routes in the route table. A route
     * table can be associated with multiple subnets. To create a route table, see
     * [AWS::EC2::RouteTable](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routetable.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnSubnetRouteTableAssociation cfnSubnetRouteTableAssociation =
     * CfnSubnetRouteTableAssociation.Builder.create(this, "MyCfnSubnetRouteTableAssociation")
     * .routeTableId("routeTableId")
     * .subnetId("subnetId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetroutetableassociation.html)
     */
    public inline fun cfnSubnetRouteTableAssociation(
        scope: Construct,
        id: String,
        block: CfnSubnetRouteTableAssociationDsl.() -> Unit = {},
    ): CfnSubnetRouteTableAssociation {
        val builder = CfnSubnetRouteTableAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSubnetRouteTableAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnSubnetRouteTableAssociationProps cfnSubnetRouteTableAssociationProps =
     * CfnSubnetRouteTableAssociationProps.builder()
     * .routeTableId("routeTableId")
     * .subnetId("subnetId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetroutetableassociation.html)
     */
    public inline fun cfnSubnetRouteTableAssociationProps(
        block: CfnSubnetRouteTableAssociationPropsDsl.() -> Unit = {}
    ): CfnSubnetRouteTableAssociationProps {
        val builder = CfnSubnetRouteTableAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a Traffic Mirror filter.
     *
     * A Traffic Mirror filter is a set of rules that defines the traffic to mirror.
     *
     * By default, no traffic is mirrored. To mirror traffic, use
     * [AWS::EC2::TrafficMirrorFilterRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html)
     * to add Traffic Mirror rules to the filter. The rules you add define what traffic gets
     * mirrored.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTrafficMirrorFilter cfnTrafficMirrorFilter = CfnTrafficMirrorFilter.Builder.create(this,
     * "MyCfnTrafficMirrorFilter")
     * .description("description")
     * .networkServices(List.of("networkServices"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html)
     */
    public inline fun cfnTrafficMirrorFilter(
        scope: Construct,
        id: String,
        block: CfnTrafficMirrorFilterDsl.() -> Unit = {},
    ): CfnTrafficMirrorFilter {
        val builder = CfnTrafficMirrorFilterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTrafficMirrorFilter`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTrafficMirrorFilterProps cfnTrafficMirrorFilterProps = CfnTrafficMirrorFilterProps.builder()
     * .description("description")
     * .networkServices(List.of("networkServices"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html)
     */
    public inline fun cfnTrafficMirrorFilterProps(
        block: CfnTrafficMirrorFilterPropsDsl.() -> Unit = {}
    ): CfnTrafficMirrorFilterProps {
        val builder = CfnTrafficMirrorFilterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a Traffic Mirror filter rule.
     *
     * A Traffic Mirror rule defines the Traffic Mirror source traffic to mirror.
     *
     * You need the Traffic Mirror filter ID when you create the rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTrafficMirrorFilterRule cfnTrafficMirrorFilterRule =
     * CfnTrafficMirrorFilterRule.Builder.create(this, "MyCfnTrafficMirrorFilterRule")
     * .destinationCidrBlock("destinationCidrBlock")
     * .ruleAction("ruleAction")
     * .ruleNumber(123)
     * .sourceCidrBlock("sourceCidrBlock")
     * .trafficDirection("trafficDirection")
     * .trafficMirrorFilterId("trafficMirrorFilterId")
     * // the properties below are optional
     * .description("description")
     * .destinationPortRange(TrafficMirrorPortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build())
     * .protocol(123)
     * .sourcePortRange(TrafficMirrorPortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html)
     */
    public inline fun cfnTrafficMirrorFilterRule(
        scope: Construct,
        id: String,
        block: CfnTrafficMirrorFilterRuleDsl.() -> Unit = {},
    ): CfnTrafficMirrorFilterRule {
        val builder = CfnTrafficMirrorFilterRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTrafficMirrorFilterRule`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTrafficMirrorFilterRuleProps cfnTrafficMirrorFilterRuleProps =
     * CfnTrafficMirrorFilterRuleProps.builder()
     * .destinationCidrBlock("destinationCidrBlock")
     * .ruleAction("ruleAction")
     * .ruleNumber(123)
     * .sourceCidrBlock("sourceCidrBlock")
     * .trafficDirection("trafficDirection")
     * .trafficMirrorFilterId("trafficMirrorFilterId")
     * // the properties below are optional
     * .description("description")
     * .destinationPortRange(TrafficMirrorPortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build())
     * .protocol(123)
     * .sourcePortRange(TrafficMirrorPortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html)
     */
    public inline fun cfnTrafficMirrorFilterRuleProps(
        block: CfnTrafficMirrorFilterRulePropsDsl.() -> Unit = {}
    ): CfnTrafficMirrorFilterRuleProps {
        val builder = CfnTrafficMirrorFilterRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the Traffic Mirror port range.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * TrafficMirrorPortRangeProperty trafficMirrorPortRangeProperty =
     * TrafficMirrorPortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-trafficmirrorfilterrule-trafficmirrorportrange.html)
     */
    public inline fun cfnTrafficMirrorFilterRuleTrafficMirrorPortRangeProperty(
        block: CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl.() -> Unit = {}
    ): CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty {
        val builder = CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a Traffic Mirror session.
     *
     * A Traffic Mirror session actively copies packets from a Traffic Mirror source to a Traffic
     * Mirror target. Create a filter, and then assign it to the session to define a subset of the
     * traffic to mirror, for example all TCP traffic.
     *
     * The Traffic Mirror source and the Traffic Mirror target (monitoring appliances) can be in the
     * same VPC, or in a different VPC connected via VPC peering or a transit gateway.
     *
     * By default, no traffic is mirrored. Use
     * [AWS::EC2::TrafficMirrorFilterRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html)
     * to specify filter rules that specify the traffic to mirror.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTrafficMirrorSession cfnTrafficMirrorSession = CfnTrafficMirrorSession.Builder.create(this,
     * "MyCfnTrafficMirrorSession")
     * .networkInterfaceId("networkInterfaceId")
     * .sessionNumber(123)
     * .trafficMirrorFilterId("trafficMirrorFilterId")
     * .trafficMirrorTargetId("trafficMirrorTargetId")
     * // the properties below are optional
     * .description("description")
     * .packetLength(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .virtualNetworkId(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html)
     */
    public inline fun cfnTrafficMirrorSession(
        scope: Construct,
        id: String,
        block: CfnTrafficMirrorSessionDsl.() -> Unit = {},
    ): CfnTrafficMirrorSession {
        val builder = CfnTrafficMirrorSessionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTrafficMirrorSession`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTrafficMirrorSessionProps cfnTrafficMirrorSessionProps =
     * CfnTrafficMirrorSessionProps.builder()
     * .networkInterfaceId("networkInterfaceId")
     * .sessionNumber(123)
     * .trafficMirrorFilterId("trafficMirrorFilterId")
     * .trafficMirrorTargetId("trafficMirrorTargetId")
     * // the properties below are optional
     * .description("description")
     * .packetLength(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .virtualNetworkId(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html)
     */
    public inline fun cfnTrafficMirrorSessionProps(
        block: CfnTrafficMirrorSessionPropsDsl.() -> Unit = {}
    ): CfnTrafficMirrorSessionProps {
        val builder = CfnTrafficMirrorSessionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a target for your Traffic Mirror session.
     *
     * A Traffic Mirror target is the destination for mirrored traffic. The Traffic Mirror source
     * and the Traffic Mirror target (monitoring appliances) can be in the same VPC, or in different
     * VPCs connected via VPC peering or a transit gateway.
     *
     * A Traffic Mirror target can be a network interface, a Network Load Balancer, or a Gateway
     * Load Balancer endpoint.
     *
     * To use the target in a Traffic Mirror session, use
     * [AWS::EC2::TrafficMirrorSession](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTrafficMirrorTarget cfnTrafficMirrorTarget = CfnTrafficMirrorTarget.Builder.create(this,
     * "MyCfnTrafficMirrorTarget")
     * .description("description")
     * .gatewayLoadBalancerEndpointId("gatewayLoadBalancerEndpointId")
     * .networkInterfaceId("networkInterfaceId")
     * .networkLoadBalancerArn("networkLoadBalancerArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html)
     */
    public inline fun cfnTrafficMirrorTarget(
        scope: Construct,
        id: String,
        block: CfnTrafficMirrorTargetDsl.() -> Unit = {},
    ): CfnTrafficMirrorTarget {
        val builder = CfnTrafficMirrorTargetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTrafficMirrorTarget`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTrafficMirrorTargetProps cfnTrafficMirrorTargetProps = CfnTrafficMirrorTargetProps.builder()
     * .description("description")
     * .gatewayLoadBalancerEndpointId("gatewayLoadBalancerEndpointId")
     * .networkInterfaceId("networkInterfaceId")
     * .networkLoadBalancerArn("networkLoadBalancerArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html)
     */
    public inline fun cfnTrafficMirrorTargetProps(
        block: CfnTrafficMirrorTargetPropsDsl.() -> Unit = {}
    ): CfnTrafficMirrorTargetProps {
        val builder = CfnTrafficMirrorTargetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a transit gateway.
     *
     * You can use a transit gateway to interconnect your virtual private clouds (VPC) and
     * on-premises networks. After the transit gateway enters the `available` state, you can attach
     * your VPCs and VPN connections to the transit gateway.
     *
     * To attach your VPCs, use
     * [AWS::EC2::TransitGatewayAttachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html)
     * .
     *
     * To attach a VPN connection, use
     * [AWS::EC2::CustomerGateway](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html)
     * to create a customer gateway and specify the ID of the customer gateway and the ID of the
     * transit gateway in a call to
     * [AWS::EC2::VPNConnection](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html)
     * .
     *
     * When you create a transit gateway, we create a default transit gateway route table and use it
     * as the default association route table and the default propagation route table. You can use
     * [AWS::EC2::TransitGatewayRouteTable](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetable.html)
     * to create additional transit gateway route tables. If you disable automatic route
     * propagation, we do not create a default transit gateway route table. You can use
     * [AWS::EC2::TransitGatewayRouteTablePropagation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html)
     * to propagate routes from a resource attachment to a transit gateway route table. If you
     * disable automatic associations, you can use
     * [AWS::EC2::TransitGatewayRouteTableAssociation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetableassociation.html)
     * to associate a resource attachment with a transit gateway route table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGateway cfnTransitGateway = CfnTransitGateway.Builder.create(this,
     * "MyCfnTransitGateway")
     * .amazonSideAsn(123)
     * .associationDefaultRouteTableId("associationDefaultRouteTableId")
     * .autoAcceptSharedAttachments("autoAcceptSharedAttachments")
     * .defaultRouteTableAssociation("defaultRouteTableAssociation")
     * .defaultRouteTablePropagation("defaultRouteTablePropagation")
     * .description("description")
     * .dnsSupport("dnsSupport")
     * .multicastSupport("multicastSupport")
     * .propagationDefaultRouteTableId("propagationDefaultRouteTableId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .transitGatewayCidrBlocks(List.of("transitGatewayCidrBlocks"))
     * .vpnEcmpSupport("vpnEcmpSupport")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html)
     */
    public inline fun cfnTransitGateway(
        scope: Construct,
        id: String,
        block: CfnTransitGatewayDsl.() -> Unit = {},
    ): CfnTransitGateway {
        val builder = CfnTransitGatewayDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attaches a VPC to a transit gateway.
     *
     * If you attach a VPC with a CIDR range that overlaps the CIDR range of a VPC that is already
     * attached, the new VPC CIDR range is not propagated to the default propagation route table.
     *
     * To send VPC traffic to an attached transit gateway, add a route to the VPC route table using
     * [AWS::EC2::Route](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html)
     * .
     *
     * To update tags for a VPC attachment after creation without replacing the attachment, use
     * [AWS::EC2::TransitGatewayVpcAttachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html)
     * instead.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * Object options;
     * CfnTransitGatewayAttachment cfnTransitGatewayAttachment =
     * CfnTransitGatewayAttachment.Builder.create(this, "MyCfnTransitGatewayAttachment")
     * .subnetIds(List.of("subnetIds"))
     * .transitGatewayId("transitGatewayId")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .options(options)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html)
     */
    public inline fun cfnTransitGatewayAttachment(
        scope: Construct,
        id: String,
        block: CfnTransitGatewayAttachmentDsl.() -> Unit = {},
    ): CfnTransitGatewayAttachment {
        val builder = CfnTransitGatewayAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the VPC attachment options.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * OptionsProperty optionsProperty = OptionsProperty.builder()
     * .applianceModeSupport("applianceModeSupport")
     * .dnsSupport("dnsSupport")
     * .ipv6Support("ipv6Support")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayattachment-options.html)
     */
    public inline fun cfnTransitGatewayAttachmentOptionsProperty(
        block: CfnTransitGatewayAttachmentOptionsPropertyDsl.() -> Unit = {}
    ): CfnTransitGatewayAttachment.OptionsProperty {
        val builder = CfnTransitGatewayAttachmentOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTransitGatewayAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * Object options;
     * CfnTransitGatewayAttachmentProps cfnTransitGatewayAttachmentProps =
     * CfnTransitGatewayAttachmentProps.builder()
     * .subnetIds(List.of("subnetIds"))
     * .transitGatewayId("transitGatewayId")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .options(options)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html)
     */
    public inline fun cfnTransitGatewayAttachmentProps(
        block: CfnTransitGatewayAttachmentPropsDsl.() -> Unit = {}
    ): CfnTransitGatewayAttachmentProps {
        val builder = CfnTransitGatewayAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a Connect attachment from a specified transit gateway attachment.
     *
     * A Connect attachment is a GRE-based tunnel attachment that you can use to establish a
     * connection between a transit gateway and an appliance.
     *
     * A Connect attachment uses an existing VPC or AWS Direct Connect attachment as the underlying
     * transport mechanism.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayConnect cfnTransitGatewayConnect =
     * CfnTransitGatewayConnect.Builder.create(this, "MyCfnTransitGatewayConnect")
     * .options(TransitGatewayConnectOptionsProperty.builder()
     * .protocol("protocol")
     * .build())
     * .transportTransitGatewayAttachmentId("transportTransitGatewayAttachmentId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html)
     */
    public inline fun cfnTransitGatewayConnect(
        scope: Construct,
        id: String,
        block: CfnTransitGatewayConnectDsl.() -> Unit = {},
    ): CfnTransitGatewayConnect {
        val builder = CfnTransitGatewayConnectDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTransitGatewayConnect`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayConnectProps cfnTransitGatewayConnectProps =
     * CfnTransitGatewayConnectProps.builder()
     * .options(TransitGatewayConnectOptionsProperty.builder()
     * .protocol("protocol")
     * .build())
     * .transportTransitGatewayAttachmentId("transportTransitGatewayAttachmentId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html)
     */
    public inline fun cfnTransitGatewayConnectProps(
        block: CfnTransitGatewayConnectPropsDsl.() -> Unit = {}
    ): CfnTransitGatewayConnectProps {
        val builder = CfnTransitGatewayConnectPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the Connect attachment options.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * TransitGatewayConnectOptionsProperty transitGatewayConnectOptionsProperty =
     * TransitGatewayConnectOptionsProperty.builder()
     * .protocol("protocol")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayconnect-transitgatewayconnectoptions.html)
     */
    public inline fun cfnTransitGatewayConnectTransitGatewayConnectOptionsProperty(
        block: CfnTransitGatewayConnectTransitGatewayConnectOptionsPropertyDsl.() -> Unit = {}
    ): CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty {
        val builder = CfnTransitGatewayConnectTransitGatewayConnectOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a multicast domain using the specified transit gateway.
     *
     * The transit gateway must be in the available state before you create a domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * Object options;
     * CfnTransitGatewayMulticastDomain cfnTransitGatewayMulticastDomain =
     * CfnTransitGatewayMulticastDomain.Builder.create(this, "MyCfnTransitGatewayMulticastDomain")
     * .transitGatewayId("transitGatewayId")
     * // the properties below are optional
     * .options(options)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html)
     */
    public inline fun cfnTransitGatewayMulticastDomain(
        scope: Construct,
        id: String,
        block: CfnTransitGatewayMulticastDomainDsl.() -> Unit = {},
    ): CfnTransitGatewayMulticastDomain {
        val builder = CfnTransitGatewayMulticastDomainDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates the specified subnets and transit gateway attachments with the specified transit
     * gateway multicast domain.
     *
     * The transit gateway attachment must be in the available state before you can add a resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayMulticastDomainAssociation cfnTransitGatewayMulticastDomainAssociation =
     * CfnTransitGatewayMulticastDomainAssociation.Builder.create(this,
     * "MyCfnTransitGatewayMulticastDomainAssociation")
     * .subnetId("subnetId")
     * .transitGatewayAttachmentId("transitGatewayAttachmentId")
     * .transitGatewayMulticastDomainId("transitGatewayMulticastDomainId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html)
     */
    public inline fun cfnTransitGatewayMulticastDomainAssociation(
        scope: Construct,
        id: String,
        block: CfnTransitGatewayMulticastDomainAssociationDsl.() -> Unit = {},
    ): CfnTransitGatewayMulticastDomainAssociation {
        val builder = CfnTransitGatewayMulticastDomainAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTransitGatewayMulticastDomainAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayMulticastDomainAssociationProps
     * cfnTransitGatewayMulticastDomainAssociationProps =
     * CfnTransitGatewayMulticastDomainAssociationProps.builder()
     * .subnetId("subnetId")
     * .transitGatewayAttachmentId("transitGatewayAttachmentId")
     * .transitGatewayMulticastDomainId("transitGatewayMulticastDomainId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html)
     */
    public inline fun cfnTransitGatewayMulticastDomainAssociationProps(
        block: CfnTransitGatewayMulticastDomainAssociationPropsDsl.() -> Unit = {}
    ): CfnTransitGatewayMulticastDomainAssociationProps {
        val builder = CfnTransitGatewayMulticastDomainAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The options for the transit gateway multicast domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * OptionsProperty optionsProperty = OptionsProperty.builder()
     * .autoAcceptSharedAssociations("autoAcceptSharedAssociations")
     * .igmpv2Support("igmpv2Support")
     * .staticSourcesSupport("staticSourcesSupport")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewaymulticastdomain-options.html)
     */
    public inline fun cfnTransitGatewayMulticastDomainOptionsProperty(
        block: CfnTransitGatewayMulticastDomainOptionsPropertyDsl.() -> Unit = {}
    ): CfnTransitGatewayMulticastDomain.OptionsProperty {
        val builder = CfnTransitGatewayMulticastDomainOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTransitGatewayMulticastDomain`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * Object options;
     * CfnTransitGatewayMulticastDomainProps cfnTransitGatewayMulticastDomainProps =
     * CfnTransitGatewayMulticastDomainProps.builder()
     * .transitGatewayId("transitGatewayId")
     * // the properties below are optional
     * .options(options)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html)
     */
    public inline fun cfnTransitGatewayMulticastDomainProps(
        block: CfnTransitGatewayMulticastDomainPropsDsl.() -> Unit = {}
    ): CfnTransitGatewayMulticastDomainProps {
        val builder = CfnTransitGatewayMulticastDomainPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Registers members (network interfaces) with the transit gateway multicast group.
     *
     * A member is a network interface associated with a supported EC2 instance that receives
     * multicast traffic. For information about supported instances, see
     * [Multicast Consideration](https://docs.aws.amazon.com/vpc/latest/tgw/transit-gateway-limits.html#multicast-limits)
     * in *Amazon VPC Transit Gateways* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayMulticastGroupMember cfnTransitGatewayMulticastGroupMember =
     * CfnTransitGatewayMulticastGroupMember.Builder.create(this,
     * "MyCfnTransitGatewayMulticastGroupMember")
     * .groupIpAddress("groupIpAddress")
     * .networkInterfaceId("networkInterfaceId")
     * .transitGatewayMulticastDomainId("transitGatewayMulticastDomainId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html)
     */
    public inline fun cfnTransitGatewayMulticastGroupMember(
        scope: Construct,
        id: String,
        block: CfnTransitGatewayMulticastGroupMemberDsl.() -> Unit = {},
    ): CfnTransitGatewayMulticastGroupMember {
        val builder = CfnTransitGatewayMulticastGroupMemberDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTransitGatewayMulticastGroupMember`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayMulticastGroupMemberProps cfnTransitGatewayMulticastGroupMemberProps =
     * CfnTransitGatewayMulticastGroupMemberProps.builder()
     * .groupIpAddress("groupIpAddress")
     * .networkInterfaceId("networkInterfaceId")
     * .transitGatewayMulticastDomainId("transitGatewayMulticastDomainId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html)
     */
    public inline fun cfnTransitGatewayMulticastGroupMemberProps(
        block: CfnTransitGatewayMulticastGroupMemberPropsDsl.() -> Unit = {}
    ): CfnTransitGatewayMulticastGroupMemberProps {
        val builder = CfnTransitGatewayMulticastGroupMemberPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Registers sources (network interfaces) with the specified transit gateway multicast domain.
     *
     * A multicast source is a network interface attached to a supported instance that sends
     * multicast traffic. For information about supported instances, see
     * [Multicast Considerations](https://docs.aws.amazon.com/vpc/latest/tgw/transit-gateway-limits.html#multicast-limits)
     * in *Amazon VPC Transit Gateways* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayMulticastGroupSource cfnTransitGatewayMulticastGroupSource =
     * CfnTransitGatewayMulticastGroupSource.Builder.create(this,
     * "MyCfnTransitGatewayMulticastGroupSource")
     * .groupIpAddress("groupIpAddress")
     * .networkInterfaceId("networkInterfaceId")
     * .transitGatewayMulticastDomainId("transitGatewayMulticastDomainId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html)
     */
    public inline fun cfnTransitGatewayMulticastGroupSource(
        scope: Construct,
        id: String,
        block: CfnTransitGatewayMulticastGroupSourceDsl.() -> Unit = {},
    ): CfnTransitGatewayMulticastGroupSource {
        val builder = CfnTransitGatewayMulticastGroupSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTransitGatewayMulticastGroupSource`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayMulticastGroupSourceProps cfnTransitGatewayMulticastGroupSourceProps =
     * CfnTransitGatewayMulticastGroupSourceProps.builder()
     * .groupIpAddress("groupIpAddress")
     * .networkInterfaceId("networkInterfaceId")
     * .transitGatewayMulticastDomainId("transitGatewayMulticastDomainId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html)
     */
    public inline fun cfnTransitGatewayMulticastGroupSourceProps(
        block: CfnTransitGatewayMulticastGroupSourcePropsDsl.() -> Unit = {}
    ): CfnTransitGatewayMulticastGroupSourceProps {
        val builder = CfnTransitGatewayMulticastGroupSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Requests a transit gateway peering attachment between the specified transit gateway
     * (requester) and a peer transit gateway (accepter).
     *
     * The peer transit gateway can be in your account or a different AWS account .
     *
     * After you create the peering attachment, the owner of the accepter transit gateway must
     * accept the attachment request.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayPeeringAttachment cfnTransitGatewayPeeringAttachment =
     * CfnTransitGatewayPeeringAttachment.Builder.create(this, "MyCfnTransitGatewayPeeringAttachment")
     * .peerAccountId("peerAccountId")
     * .peerRegion("peerRegion")
     * .peerTransitGatewayId("peerTransitGatewayId")
     * .transitGatewayId("transitGatewayId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html)
     */
    public inline fun cfnTransitGatewayPeeringAttachment(
        scope: Construct,
        id: String,
        block: CfnTransitGatewayPeeringAttachmentDsl.() -> Unit = {},
    ): CfnTransitGatewayPeeringAttachment {
        val builder = CfnTransitGatewayPeeringAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The status of the transit gateway peering attachment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PeeringAttachmentStatusProperty peeringAttachmentStatusProperty =
     * PeeringAttachmentStatusProperty.builder()
     * .code("code")
     * .message("message")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewaypeeringattachment-peeringattachmentstatus.html)
     */
    public inline fun cfnTransitGatewayPeeringAttachmentPeeringAttachmentStatusProperty(
        block: CfnTransitGatewayPeeringAttachmentPeeringAttachmentStatusPropertyDsl.() -> Unit = {}
    ): CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty {
        val builder = CfnTransitGatewayPeeringAttachmentPeeringAttachmentStatusPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTransitGatewayPeeringAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayPeeringAttachmentProps cfnTransitGatewayPeeringAttachmentProps =
     * CfnTransitGatewayPeeringAttachmentProps.builder()
     * .peerAccountId("peerAccountId")
     * .peerRegion("peerRegion")
     * .peerTransitGatewayId("peerTransitGatewayId")
     * .transitGatewayId("transitGatewayId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html)
     */
    public inline fun cfnTransitGatewayPeeringAttachmentProps(
        block: CfnTransitGatewayPeeringAttachmentPropsDsl.() -> Unit = {}
    ): CfnTransitGatewayPeeringAttachmentProps {
        val builder = CfnTransitGatewayPeeringAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTransitGateway`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayProps cfnTransitGatewayProps = CfnTransitGatewayProps.builder()
     * .amazonSideAsn(123)
     * .associationDefaultRouteTableId("associationDefaultRouteTableId")
     * .autoAcceptSharedAttachments("autoAcceptSharedAttachments")
     * .defaultRouteTableAssociation("defaultRouteTableAssociation")
     * .defaultRouteTablePropagation("defaultRouteTablePropagation")
     * .description("description")
     * .dnsSupport("dnsSupport")
     * .multicastSupport("multicastSupport")
     * .propagationDefaultRouteTableId("propagationDefaultRouteTableId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .transitGatewayCidrBlocks(List.of("transitGatewayCidrBlocks"))
     * .vpnEcmpSupport("vpnEcmpSupport")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html)
     */
    public inline fun cfnTransitGatewayProps(
        block: CfnTransitGatewayPropsDsl.() -> Unit = {}
    ): CfnTransitGatewayProps {
        val builder = CfnTransitGatewayPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a static route for a transit gateway route table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayRoute cfnTransitGatewayRoute = CfnTransitGatewayRoute.Builder.create(this,
     * "MyCfnTransitGatewayRoute")
     * .transitGatewayRouteTableId("transitGatewayRouteTableId")
     * // the properties below are optional
     * .blackhole(false)
     * .destinationCidrBlock("destinationCidrBlock")
     * .transitGatewayAttachmentId("transitGatewayAttachmentId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html)
     */
    public inline fun cfnTransitGatewayRoute(
        scope: Construct,
        id: String,
        block: CfnTransitGatewayRouteDsl.() -> Unit = {},
    ): CfnTransitGatewayRoute {
        val builder = CfnTransitGatewayRouteDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTransitGatewayRoute`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayRouteProps cfnTransitGatewayRouteProps = CfnTransitGatewayRouteProps.builder()
     * .transitGatewayRouteTableId("transitGatewayRouteTableId")
     * // the properties below are optional
     * .blackhole(false)
     * .destinationCidrBlock("destinationCidrBlock")
     * .transitGatewayAttachmentId("transitGatewayAttachmentId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html)
     */
    public inline fun cfnTransitGatewayRouteProps(
        block: CfnTransitGatewayRoutePropsDsl.() -> Unit = {}
    ): CfnTransitGatewayRouteProps {
        val builder = CfnTransitGatewayRoutePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a route table for a transit gateway.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayRouteTable cfnTransitGatewayRouteTable =
     * CfnTransitGatewayRouteTable.Builder.create(this, "MyCfnTransitGatewayRouteTable")
     * .transitGatewayId("transitGatewayId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetable.html)
     */
    public inline fun cfnTransitGatewayRouteTable(
        scope: Construct,
        id: String,
        block: CfnTransitGatewayRouteTableDsl.() -> Unit = {},
    ): CfnTransitGatewayRouteTable {
        val builder = CfnTransitGatewayRouteTableDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates the specified attachment with the specified transit gateway route table.
     *
     * You can associate one route table with an attachment.
     *
     * Before you can update the route table associated with an attachment, you must disassociate
     * the transit gateway route table that is currently associated with the attachment. First
     * update the stack to remove the associated transit gateway route table, and then update the
     * stack with the ID of the new transit gateway route table to associate.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayRouteTableAssociation cfnTransitGatewayRouteTableAssociation =
     * CfnTransitGatewayRouteTableAssociation.Builder.create(this,
     * "MyCfnTransitGatewayRouteTableAssociation")
     * .transitGatewayAttachmentId("transitGatewayAttachmentId")
     * .transitGatewayRouteTableId("transitGatewayRouteTableId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetableassociation.html)
     */
    public inline fun cfnTransitGatewayRouteTableAssociation(
        scope: Construct,
        id: String,
        block: CfnTransitGatewayRouteTableAssociationDsl.() -> Unit = {},
    ): CfnTransitGatewayRouteTableAssociation {
        val builder = CfnTransitGatewayRouteTableAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTransitGatewayRouteTableAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayRouteTableAssociationProps cfnTransitGatewayRouteTableAssociationProps =
     * CfnTransitGatewayRouteTableAssociationProps.builder()
     * .transitGatewayAttachmentId("transitGatewayAttachmentId")
     * .transitGatewayRouteTableId("transitGatewayRouteTableId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetableassociation.html)
     */
    public inline fun cfnTransitGatewayRouteTableAssociationProps(
        block: CfnTransitGatewayRouteTableAssociationPropsDsl.() -> Unit = {}
    ): CfnTransitGatewayRouteTableAssociationProps {
        val builder = CfnTransitGatewayRouteTableAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Enables the specified attachment to propagate routes to the specified propagation route
     * table.
     *
     * For more information about enabling transit gateway route propagation, see
     * [EnableTransitGatewayRouteTablePropagation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EnableTransitGatewayRouteTablePropagation.html)
     * in the *Amazon EC2 API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayRouteTablePropagation cfnTransitGatewayRouteTablePropagation =
     * CfnTransitGatewayRouteTablePropagation.Builder.create(this,
     * "MyCfnTransitGatewayRouteTablePropagation")
     * .transitGatewayAttachmentId("transitGatewayAttachmentId")
     * .transitGatewayRouteTableId("transitGatewayRouteTableId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html)
     */
    public inline fun cfnTransitGatewayRouteTablePropagation(
        scope: Construct,
        id: String,
        block: CfnTransitGatewayRouteTablePropagationDsl.() -> Unit = {},
    ): CfnTransitGatewayRouteTablePropagation {
        val builder = CfnTransitGatewayRouteTablePropagationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTransitGatewayRouteTablePropagation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayRouteTablePropagationProps cfnTransitGatewayRouteTablePropagationProps =
     * CfnTransitGatewayRouteTablePropagationProps.builder()
     * .transitGatewayAttachmentId("transitGatewayAttachmentId")
     * .transitGatewayRouteTableId("transitGatewayRouteTableId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html)
     */
    public inline fun cfnTransitGatewayRouteTablePropagationProps(
        block: CfnTransitGatewayRouteTablePropagationPropsDsl.() -> Unit = {}
    ): CfnTransitGatewayRouteTablePropagationProps {
        val builder = CfnTransitGatewayRouteTablePropagationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTransitGatewayRouteTable`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnTransitGatewayRouteTableProps cfnTransitGatewayRouteTableProps =
     * CfnTransitGatewayRouteTableProps.builder()
     * .transitGatewayId("transitGatewayId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetable.html)
     */
    public inline fun cfnTransitGatewayRouteTableProps(
        block: CfnTransitGatewayRouteTablePropsDsl.() -> Unit = {}
    ): CfnTransitGatewayRouteTableProps {
        val builder = CfnTransitGatewayRouteTablePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a VPC attachment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * Object options;
     * CfnTransitGatewayVpcAttachment cfnTransitGatewayVpcAttachment =
     * CfnTransitGatewayVpcAttachment.Builder.create(this, "MyCfnTransitGatewayVpcAttachment")
     * .subnetIds(List.of("subnetIds"))
     * .transitGatewayId("transitGatewayId")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .addSubnetIds(List.of("addSubnetIds"))
     * .options(options)
     * .removeSubnetIds(List.of("removeSubnetIds"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html)
     */
    public inline fun cfnTransitGatewayVpcAttachment(
        scope: Construct,
        id: String,
        block: CfnTransitGatewayVpcAttachmentDsl.() -> Unit = {},
    ): CfnTransitGatewayVpcAttachment {
        val builder = CfnTransitGatewayVpcAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the VPC attachment options.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * OptionsProperty optionsProperty = OptionsProperty.builder()
     * .applianceModeSupport("applianceModeSupport")
     * .dnsSupport("dnsSupport")
     * .ipv6Support("ipv6Support")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayvpcattachment-options.html)
     */
    public inline fun cfnTransitGatewayVpcAttachmentOptionsProperty(
        block: CfnTransitGatewayVpcAttachmentOptionsPropertyDsl.() -> Unit = {}
    ): CfnTransitGatewayVpcAttachment.OptionsProperty {
        val builder = CfnTransitGatewayVpcAttachmentOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTransitGatewayVpcAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * Object options;
     * CfnTransitGatewayVpcAttachmentProps cfnTransitGatewayVpcAttachmentProps =
     * CfnTransitGatewayVpcAttachmentProps.builder()
     * .subnetIds(List.of("subnetIds"))
     * .transitGatewayId("transitGatewayId")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .addSubnetIds(List.of("addSubnetIds"))
     * .options(options)
     * .removeSubnetIds(List.of("removeSubnetIds"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html)
     */
    public inline fun cfnTransitGatewayVpcAttachmentProps(
        block: CfnTransitGatewayVpcAttachmentPropsDsl.() -> Unit = {}
    ): CfnTransitGatewayVpcAttachmentProps {
        val builder = CfnTransitGatewayVpcAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a virtual private cloud (VPC).
     *
     * You can optionally request an IPv6 CIDR block for the VPC. You can request an Amazon-provided
     * IPv6 CIDR block from Amazon's pool of IPv6 addresses, or an IPv6 CIDR block from an IPv6
     * address pool that you provisioned through bring your own IP addresses (BYOIP).
     *
     * For more information, see
     * [Virtual private clouds (VPC)](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/configure-your-vpc.html)
     * in the *Amazon VPC User Guide* .
     *
     * Example:
     * ```
     * CfnInclude cfnTemplate;
     * // using from*Attributes()
     * CfnSubnet privateCfnSubnet1;
     * CfnSubnet privateCfnSubnet2;
     * // using from*Name()
     * CfnBucket cfnBucket = (CfnBucket)cfnTemplate.getResource("Bucket");
     * IBucket bucket = Bucket.fromBucketName(this, "L2Bucket", cfnBucket.getRef());
     * // using from*Arn()
     * CfnKey cfnKey = (CfnKey)cfnTemplate.getResource("Key");
     * IKey key = Key.fromKeyArn(this, "L2Key", cfnKey.getAttrArn());
     * CfnVPC cfnVpc = (CfnVPC)cfnTemplate.getResource("Vpc");
     * IVpc vpc = Vpc.fromVpcAttributes(this, "L2Vpc", VpcAttributes.builder()
     * .vpcId(cfnVpc.getRef())
     * .availabilityZones(Fn.getAzs())
     * .privateSubnetIds(List.of(privateCfnSubnet1.getRef(), privateCfnSubnet2.getRef()))
     * .build());
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html)
     */
    public inline fun cfnVPC(
        scope: Construct,
        id: String,
        block: CfnVPCDsl.() -> Unit = {},
    ): CfnVPC {
        val builder = CfnVPCDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates a CIDR block with your VPC.
     *
     * You can only associate a single IPv6 CIDR block with your VPC. The IPv6 CIDR block size is
     * fixed at /56.
     *
     * For more information about associating CIDR blocks with your VPC and applicable restrictions,
     * see
     * [VPC and Subnet Sizing](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html#VPC_Sizing)
     * in the *Amazon VPC User Guide* .
     *
     * Example:
     * ```
     * Vpc vpc;
     * public void associateSubnetWithV6Cidr(Vpc vpc, Number count, ISubnet subnet) {
     * CfnSubnet cfnSubnet = (CfnSubnet)subnet.getNode().getDefaultChild();
     * cfnSubnet.getIpv6CidrBlock() = Fn.select(count, Fn.cidr(Fn.select(0,
     * vpc.getVpcIpv6CidrBlocks()), 256, (128 - 64).toString()));
     * cfnSubnet.getAssignIpv6AddressOnCreation() = true;
     * }
     * // make an ipv6 cidr
     * CfnVPCCidrBlock ipv6cidr = CfnVPCCidrBlock.Builder.create(this, "CIDR6")
     * .vpcId(vpc.getVpcId())
     * .amazonProvidedIpv6CidrBlock(true)
     * .build();
     * // connect the ipv6 cidr to all vpc subnets
     * Number subnetcount = 0;
     * ISubnet[] subnets = vpc.publicSubnets.concat(vpc.getPrivateSubnets());
     * for (Object subnet : subnets) {
     * // Wait for the ipv6 cidr to complete
     * subnet.node.addDependency(ipv6cidr);
     * associateSubnetWithV6Cidr(vpc, subnetcount, subnet);
     * subnetcount = subnetcount + 1;
     * }
     * Cluster cluster = Cluster.Builder.create(this, "hello-eks")
     * .version(KubernetesVersion.V1_27)
     * .vpc(vpc)
     * .ipFamily(IpFamily.IP_V6)
     * .vpcSubnets(List.of(SubnetSelection.builder().subnets(vpc.getPublicSubnets()).build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html)
     */
    public inline fun cfnVPCCidrBlock(
        scope: Construct,
        id: String,
        block: CfnVPCCidrBlockDsl.() -> Unit = {},
    ): CfnVPCCidrBlock {
        val builder = CfnVPCCidrBlockDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVPCCidrBlock`.
     *
     * Example:
     * ```
     * Vpc vpc;
     * public void associateSubnetWithV6Cidr(Vpc vpc, Number count, ISubnet subnet) {
     * CfnSubnet cfnSubnet = (CfnSubnet)subnet.getNode().getDefaultChild();
     * cfnSubnet.getIpv6CidrBlock() = Fn.select(count, Fn.cidr(Fn.select(0,
     * vpc.getVpcIpv6CidrBlocks()), 256, (128 - 64).toString()));
     * cfnSubnet.getAssignIpv6AddressOnCreation() = true;
     * }
     * // make an ipv6 cidr
     * CfnVPCCidrBlock ipv6cidr = CfnVPCCidrBlock.Builder.create(this, "CIDR6")
     * .vpcId(vpc.getVpcId())
     * .amazonProvidedIpv6CidrBlock(true)
     * .build();
     * // connect the ipv6 cidr to all vpc subnets
     * Number subnetcount = 0;
     * ISubnet[] subnets = vpc.publicSubnets.concat(vpc.getPrivateSubnets());
     * for (Object subnet : subnets) {
     * // Wait for the ipv6 cidr to complete
     * subnet.node.addDependency(ipv6cidr);
     * associateSubnetWithV6Cidr(vpc, subnetcount, subnet);
     * subnetcount = subnetcount + 1;
     * }
     * Cluster cluster = Cluster.Builder.create(this, "hello-eks")
     * .version(KubernetesVersion.V1_27)
     * .vpc(vpc)
     * .ipFamily(IpFamily.IP_V6)
     * .vpcSubnets(List.of(SubnetSelection.builder().subnets(vpc.getPublicSubnets()).build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html)
     */
    public inline fun cfnVPCCidrBlockProps(
        block: CfnVPCCidrBlockPropsDsl.() -> Unit = {}
    ): CfnVPCCidrBlockProps {
        val builder = CfnVPCCidrBlockPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates a set of DHCP options with a VPC, or associates no DHCP options with the VPC.
     *
     * After you associate the options with the VPC, any existing instances and all new instances
     * that you launch in that VPC use the options. You don't need to restart or relaunch the
     * instances. They automatically pick up the changes within a few hours, depending on how
     * frequently the instance renews its DHCP lease. You can explicitly renew the lease using the
     * operating system on the instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPCDHCPOptionsAssociation cfnVPCDHCPOptionsAssociation =
     * CfnVPCDHCPOptionsAssociation.Builder.create(this, "MyCfnVPCDHCPOptionsAssociation")
     * .dhcpOptionsId("dhcpOptionsId")
     * .vpcId("vpcId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcdhcpoptionsassociation.html)
     */
    public inline fun cfnVPCDHCPOptionsAssociation(
        scope: Construct,
        id: String,
        block: CfnVPCDHCPOptionsAssociationDsl.() -> Unit = {},
    ): CfnVPCDHCPOptionsAssociation {
        val builder = CfnVPCDHCPOptionsAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVPCDHCPOptionsAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPCDHCPOptionsAssociationProps cfnVPCDHCPOptionsAssociationProps =
     * CfnVPCDHCPOptionsAssociationProps.builder()
     * .dhcpOptionsId("dhcpOptionsId")
     * .vpcId("vpcId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcdhcpoptionsassociation.html)
     */
    public inline fun cfnVPCDHCPOptionsAssociationProps(
        block: CfnVPCDHCPOptionsAssociationPropsDsl.() -> Unit = {}
    ): CfnVPCDHCPOptionsAssociationProps {
        val builder = CfnVPCDHCPOptionsAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a VPC endpoint.
     *
     * A VPC endpoint provides a private connection between your VPC and an endpoint service. You
     * can use an endpoint service provided by AWS , an AWS Marketplace Partner, or another AWS
     * accounts in your organization. For more information, see the
     * [AWS PrivateLink User Guide](https://docs.aws.amazon.com/vpc/latest/privatelink/) .
     *
     * An endpoint of type `Interface` establishes connections between the subnets in your VPC and
     * an AWS service , your own service, or a service hosted by another AWS account . With an
     * interface VPC endpoint, you specify the subnets in which to create the endpoint and the
     * security groups to associate with the endpoint network interfaces.
     *
     * An endpoint of type `gateway` serves as a target for a route in your route table for traffic
     * destined for Amazon S3 or DynamoDB . You can specify an endpoint policy for the endpoint,
     * which controls access to the service from your VPC. You can also specify the VPC route tables
     * that use the endpoint. For more information about connectivity to Amazon S3 , see
     * [Why can't I connect to an S3 bucket using a gateway VPC endpoint?](https://docs.aws.amazon.com/premiumsupport/knowledge-center/connect-s3-vpc-endpoint)
     *
     * An endpoint of type `GatewayLoadBalancer` provides private connectivity between your VPC and
     * virtual appliances from a service provider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * Object policyDocument;
     * CfnVPCEndpoint cfnVPCEndpoint = CfnVPCEndpoint.Builder.create(this, "MyCfnVPCEndpoint")
     * .serviceName("serviceName")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .policyDocument(policyDocument)
     * .privateDnsEnabled(false)
     * .routeTableIds(List.of("routeTableIds"))
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .vpcEndpointType("vpcEndpointType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html)
     */
    public inline fun cfnVPCEndpoint(
        scope: Construct,
        id: String,
        block: CfnVPCEndpointDsl.() -> Unit = {},
    ): CfnVPCEndpoint {
        val builder = CfnVPCEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a connection notification for a VPC endpoint or VPC endpoint service.
     *
     * A connection notification notifies you of specific endpoint events. You must create an SNS
     * topic to receive notifications. For more information, see
     * [Create a Topic](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) in the *Amazon
     * Simple Notification Service Developer Guide* .
     *
     * You can create a connection notification for interface endpoints only.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPCEndpointConnectionNotification cfnVPCEndpointConnectionNotification =
     * CfnVPCEndpointConnectionNotification.Builder.create(this,
     * "MyCfnVPCEndpointConnectionNotification")
     * .connectionEvents(List.of("connectionEvents"))
     * .connectionNotificationArn("connectionNotificationArn")
     * // the properties below are optional
     * .serviceId("serviceId")
     * .vpcEndpointId("vpcEndpointId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html)
     */
    public inline fun cfnVPCEndpointConnectionNotification(
        scope: Construct,
        id: String,
        block: CfnVPCEndpointConnectionNotificationDsl.() -> Unit = {},
    ): CfnVPCEndpointConnectionNotification {
        val builder = CfnVPCEndpointConnectionNotificationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVPCEndpointConnectionNotification`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPCEndpointConnectionNotificationProps cfnVPCEndpointConnectionNotificationProps =
     * CfnVPCEndpointConnectionNotificationProps.builder()
     * .connectionEvents(List.of("connectionEvents"))
     * .connectionNotificationArn("connectionNotificationArn")
     * // the properties below are optional
     * .serviceId("serviceId")
     * .vpcEndpointId("vpcEndpointId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html)
     */
    public inline fun cfnVPCEndpointConnectionNotificationProps(
        block: CfnVPCEndpointConnectionNotificationPropsDsl.() -> Unit = {}
    ): CfnVPCEndpointConnectionNotificationProps {
        val builder = CfnVPCEndpointConnectionNotificationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVPCEndpoint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * Object policyDocument;
     * CfnVPCEndpointProps cfnVPCEndpointProps = CfnVPCEndpointProps.builder()
     * .serviceName("serviceName")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .policyDocument(policyDocument)
     * .privateDnsEnabled(false)
     * .routeTableIds(List.of("routeTableIds"))
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .vpcEndpointType("vpcEndpointType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html)
     */
    public inline fun cfnVPCEndpointProps(
        block: CfnVPCEndpointPropsDsl.() -> Unit = {}
    ): CfnVPCEndpointProps {
        val builder = CfnVPCEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a VPC endpoint service configuration to which service consumers ( AWS accounts,
     * users, and IAM roles) can connect.
     *
     * To create an endpoint service configuration, you must first create one of the following for
     * your service:
     * * A [Network Load Balancer](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/introduction.html)
     *   . Service consumers connect to your service using an interface endpoint.
     * * A [Gateway Load Balancer](https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/introduction.html)
     *   . Service consumers connect to your service using a Gateway Load Balancer endpoint.
     *
     * For more information, see the
     * [AWS PrivateLink User Guide](https://docs.aws.amazon.com/vpc/latest/privatelink/) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPCEndpointService cfnVPCEndpointService = CfnVPCEndpointService.Builder.create(this,
     * "MyCfnVPCEndpointService")
     * .acceptanceRequired(false)
     * .contributorInsightsEnabled(false)
     * .gatewayLoadBalancerArns(List.of("gatewayLoadBalancerArns"))
     * .networkLoadBalancerArns(List.of("networkLoadBalancerArns"))
     * .payerResponsibility("payerResponsibility")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html)
     */
    public inline fun cfnVPCEndpointService(
        scope: Construct,
        id: String,
        block: CfnVPCEndpointServiceDsl.() -> Unit = {},
    ): CfnVPCEndpointService {
        val builder = CfnVPCEndpointServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Grant or revoke permissions for service consumers (users, IAM roles, and AWS accounts) to
     * connect to a VPC endpoint service.
     *
     * If you grant permissions to all principals, the service is public. Any users who know the
     * name of a public service can send a request to attach an endpoint. If the service does not
     * require manual approval, attachments are automatically approved.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPCEndpointServicePermissions cfnVPCEndpointServicePermissions =
     * CfnVPCEndpointServicePermissions.Builder.create(this, "MyCfnVPCEndpointServicePermissions")
     * .serviceId("serviceId")
     * // the properties below are optional
     * .allowedPrincipals(List.of("allowedPrincipals"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html)
     */
    public inline fun cfnVPCEndpointServicePermissions(
        scope: Construct,
        id: String,
        block: CfnVPCEndpointServicePermissionsDsl.() -> Unit = {},
    ): CfnVPCEndpointServicePermissions {
        val builder = CfnVPCEndpointServicePermissionsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVPCEndpointServicePermissions`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPCEndpointServicePermissionsProps cfnVPCEndpointServicePermissionsProps =
     * CfnVPCEndpointServicePermissionsProps.builder()
     * .serviceId("serviceId")
     * // the properties below are optional
     * .allowedPrincipals(List.of("allowedPrincipals"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html)
     */
    public inline fun cfnVPCEndpointServicePermissionsProps(
        block: CfnVPCEndpointServicePermissionsPropsDsl.() -> Unit = {}
    ): CfnVPCEndpointServicePermissionsProps {
        val builder = CfnVPCEndpointServicePermissionsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVPCEndpointService`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPCEndpointServiceProps cfnVPCEndpointServiceProps = CfnVPCEndpointServiceProps.builder()
     * .acceptanceRequired(false)
     * .contributorInsightsEnabled(false)
     * .gatewayLoadBalancerArns(List.of("gatewayLoadBalancerArns"))
     * .networkLoadBalancerArns(List.of("networkLoadBalancerArns"))
     * .payerResponsibility("payerResponsibility")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html)
     */
    public inline fun cfnVPCEndpointServiceProps(
        block: CfnVPCEndpointServicePropsDsl.() -> Unit = {}
    ): CfnVPCEndpointServiceProps {
        val builder = CfnVPCEndpointServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attaches an internet gateway, or a virtual private gateway to a VPC, enabling connectivity
     * between the internet and the VPC.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPCGatewayAttachment cfnVPCGatewayAttachment = CfnVPCGatewayAttachment.Builder.create(this,
     * "MyCfnVPCGatewayAttachment")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .internetGatewayId("internetGatewayId")
     * .vpnGatewayId("vpnGatewayId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html)
     */
    public inline fun cfnVPCGatewayAttachment(
        scope: Construct,
        id: String,
        block: CfnVPCGatewayAttachmentDsl.() -> Unit = {},
    ): CfnVPCGatewayAttachment {
        val builder = CfnVPCGatewayAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVPCGatewayAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPCGatewayAttachmentProps cfnVPCGatewayAttachmentProps =
     * CfnVPCGatewayAttachmentProps.builder()
     * .vpcId("vpcId")
     * // the properties below are optional
     * .internetGatewayId("internetGatewayId")
     * .vpnGatewayId("vpnGatewayId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html)
     */
    public inline fun cfnVPCGatewayAttachmentProps(
        block: CfnVPCGatewayAttachmentPropsDsl.() -> Unit = {}
    ): CfnVPCGatewayAttachmentProps {
        val builder = CfnVPCGatewayAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Requests a VPC peering connection between two VPCs: a requester VPC that you own and an
     * accepter VPC with which to create the connection.
     *
     * The accepter VPC can belong to a different AWS account and can be in a different Region than
     * the requester VPC.
     *
     * The requester VPC and accepter VPC cannot have overlapping CIDR blocks. If you create a VPC
     * peering connection request between VPCs with overlapping CIDR blocks, the VPC peering
     * connection has a status of `failed` .
     *
     * If the VPCs belong to different accounts, the acceptor account must have a role that allows
     * the requester account to accept the VPC peering connection. For more information, see
     * [Walkthough: Peer with a VPC in another AWS account](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/peer-with-vpc-in-another-account.html)
     * .
     *
     * If the requester and acceptor VPCs are in the same account, the peering request is accepted
     * without a peering role.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPCPeeringConnection cfnVPCPeeringConnection = CfnVPCPeeringConnection.Builder.create(this,
     * "MyCfnVPCPeeringConnection")
     * .peerVpcId("peerVpcId")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .peerOwnerId("peerOwnerId")
     * .peerRegion("peerRegion")
     * .peerRoleArn("peerRoleArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html)
     */
    public inline fun cfnVPCPeeringConnection(
        scope: Construct,
        id: String,
        block: CfnVPCPeeringConnectionDsl.() -> Unit = {},
    ): CfnVPCPeeringConnection {
        val builder = CfnVPCPeeringConnectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVPCPeeringConnection`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPCPeeringConnectionProps cfnVPCPeeringConnectionProps =
     * CfnVPCPeeringConnectionProps.builder()
     * .peerVpcId("peerVpcId")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .peerOwnerId("peerOwnerId")
     * .peerRegion("peerRegion")
     * .peerRoleArn("peerRoleArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html)
     */
    public inline fun cfnVPCPeeringConnectionProps(
        block: CfnVPCPeeringConnectionPropsDsl.() -> Unit = {}
    ): CfnVPCPeeringConnectionProps {
        val builder = CfnVPCPeeringConnectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVPC`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPCProps cfnVPCProps = CfnVPCProps.builder()
     * .cidrBlock("cidrBlock")
     * .enableDnsHostnames(false)
     * .enableDnsSupport(false)
     * .instanceTenancy("instanceTenancy")
     * .ipv4IpamPoolId("ipv4IpamPoolId")
     * .ipv4NetmaskLength(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html)
     */
    public inline fun cfnVPCProps(block: CfnVPCPropsDsl.() -> Unit = {}): CfnVPCProps {
        val builder = CfnVPCPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a VPN connection between a virtual private gateway and a VPN customer gateway or a
     * transit gateway and a VPN customer gateway.
     *
     * To specify a VPN connection between a transit gateway and customer gateway, use the
     * `TransitGatewayId` and `CustomerGatewayId` properties.
     *
     * To specify a VPN connection between a virtual private gateway and customer gateway, use the
     * `VpnGatewayId` and `CustomerGatewayId` properties.
     *
     * For more information, see
     * [AWS Site-to-Site VPN](https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html) in the
     * *AWS Site-to-Site VPN User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPNConnection cfnVPNConnection = CfnVPNConnection.Builder.create(this, "MyCfnVPNConnection")
     * .customerGatewayId("customerGatewayId")
     * .type("type")
     * // the properties below are optional
     * .staticRoutesOnly(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .transitGatewayId("transitGatewayId")
     * .vpnGatewayId("vpnGatewayId")
     * .vpnTunnelOptionsSpecifications(List.of(VpnTunnelOptionsSpecificationProperty.builder()
     * .preSharedKey("preSharedKey")
     * .tunnelInsideCidr("tunnelInsideCidr")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html)
     */
    public inline fun cfnVPNConnection(
        scope: Construct,
        id: String,
        block: CfnVPNConnectionDsl.() -> Unit = {},
    ): CfnVPNConnection {
        val builder = CfnVPNConnectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVPNConnection`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPNConnectionProps cfnVPNConnectionProps = CfnVPNConnectionProps.builder()
     * .customerGatewayId("customerGatewayId")
     * .type("type")
     * // the properties below are optional
     * .staticRoutesOnly(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .transitGatewayId("transitGatewayId")
     * .vpnGatewayId("vpnGatewayId")
     * .vpnTunnelOptionsSpecifications(List.of(VpnTunnelOptionsSpecificationProperty.builder()
     * .preSharedKey("preSharedKey")
     * .tunnelInsideCidr("tunnelInsideCidr")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html)
     */
    public inline fun cfnVPNConnectionProps(
        block: CfnVPNConnectionPropsDsl.() -> Unit = {}
    ): CfnVPNConnectionProps {
        val builder = CfnVPNConnectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a static route for a VPN connection between an existing virtual private gateway and
     * a VPN customer gateway.
     *
     * The static route allows traffic to be routed from the virtual private gateway to the VPN
     * customer gateway.
     *
     * For more information, see
     * [AWS Site-to-Site VPN](https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html) in the
     * *AWS Site-to-Site VPN User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPNConnectionRoute cfnVPNConnectionRoute = CfnVPNConnectionRoute.Builder.create(this,
     * "MyCfnVPNConnectionRoute")
     * .destinationCidrBlock("destinationCidrBlock")
     * .vpnConnectionId("vpnConnectionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnectionroute.html)
     */
    public inline fun cfnVPNConnectionRoute(
        scope: Construct,
        id: String,
        block: CfnVPNConnectionRouteDsl.() -> Unit = {},
    ): CfnVPNConnectionRoute {
        val builder = CfnVPNConnectionRouteDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVPNConnectionRoute`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPNConnectionRouteProps cfnVPNConnectionRouteProps = CfnVPNConnectionRouteProps.builder()
     * .destinationCidrBlock("destinationCidrBlock")
     * .vpnConnectionId("vpnConnectionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnectionroute.html)
     */
    public inline fun cfnVPNConnectionRouteProps(
        block: CfnVPNConnectionRoutePropsDsl.() -> Unit = {}
    ): CfnVPNConnectionRouteProps {
        val builder = CfnVPNConnectionRoutePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The tunnel options for a single VPN tunnel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * VpnTunnelOptionsSpecificationProperty vpnTunnelOptionsSpecificationProperty =
     * VpnTunnelOptionsSpecificationProperty.builder()
     * .preSharedKey("preSharedKey")
     * .tunnelInsideCidr("tunnelInsideCidr")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html)
     */
    public inline fun cfnVPNConnectionVpnTunnelOptionsSpecificationProperty(
        block: CfnVPNConnectionVpnTunnelOptionsSpecificationPropertyDsl.() -> Unit = {}
    ): CfnVPNConnection.VpnTunnelOptionsSpecificationProperty {
        val builder = CfnVPNConnectionVpnTunnelOptionsSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a virtual private gateway.
     *
     * A virtual private gateway is the endpoint on the VPC side of your VPN connection. You can
     * create a virtual private gateway before creating the VPC itself.
     *
     * For more information, see
     * [AWS Site-to-Site VPN](https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html) in the
     * *AWS Site-to-Site VPN User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPNGateway cfnVPNGateway = CfnVPNGateway.Builder.create(this, "MyCfnVPNGateway")
     * .type("type")
     * // the properties below are optional
     * .amazonSideAsn(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html)
     */
    public inline fun cfnVPNGateway(
        scope: Construct,
        id: String,
        block: CfnVPNGatewayDsl.() -> Unit = {},
    ): CfnVPNGateway {
        val builder = CfnVPNGatewayDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVPNGateway`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPNGatewayProps cfnVPNGatewayProps = CfnVPNGatewayProps.builder()
     * .type("type")
     * // the properties below are optional
     * .amazonSideAsn(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html)
     */
    public inline fun cfnVPNGatewayProps(
        block: CfnVPNGatewayPropsDsl.() -> Unit = {}
    ): CfnVPNGatewayProps {
        val builder = CfnVPNGatewayPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Enables a virtual private gateway (VGW) to propagate routes to the specified route table of a
     * VPC.
     *
     * If you reference a VPN gateway that is in the same template as your VPN gateway route
     * propagation, you must explicitly declare a dependency on the VPN gateway attachment. The
     * `AWS::EC2::VPNGatewayRoutePropagation` resource cannot use the VPN gateway until it has
     * successfully attached to the VPC. Add a
     * [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * in the `AWS::EC2::VPNGatewayRoutePropagation` resource to explicitly declare a dependency on
     * the VPN gateway attachment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPNGatewayRoutePropagation cfnVPNGatewayRoutePropagation =
     * CfnVPNGatewayRoutePropagation.Builder.create(this, "MyCfnVPNGatewayRoutePropagation")
     * .routeTableIds(List.of("routeTableIds"))
     * .vpnGatewayId("vpnGatewayId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html)
     */
    public inline fun cfnVPNGatewayRoutePropagation(
        scope: Construct,
        id: String,
        block: CfnVPNGatewayRoutePropagationDsl.() -> Unit = {},
    ): CfnVPNGatewayRoutePropagation {
        val builder = CfnVPNGatewayRoutePropagationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVPNGatewayRoutePropagation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVPNGatewayRoutePropagationProps cfnVPNGatewayRoutePropagationProps =
     * CfnVPNGatewayRoutePropagationProps.builder()
     * .routeTableIds(List.of("routeTableIds"))
     * .vpnGatewayId("vpnGatewayId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html)
     */
    public inline fun cfnVPNGatewayRoutePropagationProps(
        block: CfnVPNGatewayRoutePropagationPropsDsl.() -> Unit = {}
    ): CfnVPNGatewayRoutePropagationProps {
        val builder = CfnVPNGatewayRoutePropagationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An AWS Verified Access endpoint specifies the application that AWS Verified Access provides
     * access to.
     *
     * It must be attached to an AWS Verified Access group. An AWS Verified Access endpoint must
     * also have an attached access policy before you attached it to a group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVerifiedAccessEndpoint cfnVerifiedAccessEndpoint =
     * CfnVerifiedAccessEndpoint.Builder.create(this, "MyCfnVerifiedAccessEndpoint")
     * .applicationDomain("applicationDomain")
     * .attachmentType("attachmentType")
     * .domainCertificateArn("domainCertificateArn")
     * .endpointDomainPrefix("endpointDomainPrefix")
     * .endpointType("endpointType")
     * .verifiedAccessGroupId("verifiedAccessGroupId")
     * // the properties below are optional
     * .description("description")
     * .loadBalancerOptions(LoadBalancerOptionsProperty.builder()
     * .loadBalancerArn("loadBalancerArn")
     * .port(123)
     * .protocol("protocol")
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .networkInterfaceOptions(NetworkInterfaceOptionsProperty.builder()
     * .networkInterfaceId("networkInterfaceId")
     * .port(123)
     * .protocol("protocol")
     * .build())
     * .policyDocument("policyDocument")
     * .policyEnabled(false)
     * .securityGroupIds(List.of("securityGroupIds"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html)
     */
    public inline fun cfnVerifiedAccessEndpoint(
        scope: Construct,
        id: String,
        block: CfnVerifiedAccessEndpointDsl.() -> Unit = {},
    ): CfnVerifiedAccessEndpoint {
        val builder = CfnVerifiedAccessEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the load balancer options when creating an AWS Verified Access endpoint using the
     * `load-balancer` type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * LoadBalancerOptionsProperty loadBalancerOptionsProperty = LoadBalancerOptionsProperty.builder()
     * .loadBalancerArn("loadBalancerArn")
     * .port(123)
     * .protocol("protocol")
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-loadbalanceroptions.html)
     */
    public inline fun cfnVerifiedAccessEndpointLoadBalancerOptionsProperty(
        block: CfnVerifiedAccessEndpointLoadBalancerOptionsPropertyDsl.() -> Unit = {}
    ): CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty {
        val builder = CfnVerifiedAccessEndpointLoadBalancerOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the network interface options when creating an AWS Verified Access endpoint using
     * the `network-interface` type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * NetworkInterfaceOptionsProperty networkInterfaceOptionsProperty =
     * NetworkInterfaceOptionsProperty.builder()
     * .networkInterfaceId("networkInterfaceId")
     * .port(123)
     * .protocol("protocol")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-networkinterfaceoptions.html)
     */
    public inline fun cfnVerifiedAccessEndpointNetworkInterfaceOptionsProperty(
        block: CfnVerifiedAccessEndpointNetworkInterfaceOptionsPropertyDsl.() -> Unit = {}
    ): CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty {
        val builder = CfnVerifiedAccessEndpointNetworkInterfaceOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVerifiedAccessEndpoint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVerifiedAccessEndpointProps cfnVerifiedAccessEndpointProps =
     * CfnVerifiedAccessEndpointProps.builder()
     * .applicationDomain("applicationDomain")
     * .attachmentType("attachmentType")
     * .domainCertificateArn("domainCertificateArn")
     * .endpointDomainPrefix("endpointDomainPrefix")
     * .endpointType("endpointType")
     * .verifiedAccessGroupId("verifiedAccessGroupId")
     * // the properties below are optional
     * .description("description")
     * .loadBalancerOptions(LoadBalancerOptionsProperty.builder()
     * .loadBalancerArn("loadBalancerArn")
     * .port(123)
     * .protocol("protocol")
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .networkInterfaceOptions(NetworkInterfaceOptionsProperty.builder()
     * .networkInterfaceId("networkInterfaceId")
     * .port(123)
     * .protocol("protocol")
     * .build())
     * .policyDocument("policyDocument")
     * .policyEnabled(false)
     * .securityGroupIds(List.of("securityGroupIds"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html)
     */
    public inline fun cfnVerifiedAccessEndpointProps(
        block: CfnVerifiedAccessEndpointPropsDsl.() -> Unit = {}
    ): CfnVerifiedAccessEndpointProps {
        val builder = CfnVerifiedAccessEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a Verified Access group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVerifiedAccessGroup cfnVerifiedAccessGroup = CfnVerifiedAccessGroup.Builder.create(this,
     * "MyCfnVerifiedAccessGroup")
     * .verifiedAccessInstanceId("verifiedAccessInstanceId")
     * // the properties below are optional
     * .description("description")
     * .policyDocument("policyDocument")
     * .policyEnabled(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html)
     */
    public inline fun cfnVerifiedAccessGroup(
        scope: Construct,
        id: String,
        block: CfnVerifiedAccessGroupDsl.() -> Unit = {},
    ): CfnVerifiedAccessGroup {
        val builder = CfnVerifiedAccessGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVerifiedAccessGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVerifiedAccessGroupProps cfnVerifiedAccessGroupProps = CfnVerifiedAccessGroupProps.builder()
     * .verifiedAccessInstanceId("verifiedAccessInstanceId")
     * // the properties below are optional
     * .description("description")
     * .policyDocument("policyDocument")
     * .policyEnabled(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html)
     */
    public inline fun cfnVerifiedAccessGroupProps(
        block: CfnVerifiedAccessGroupPropsDsl.() -> Unit = {}
    ): CfnVerifiedAccessGroupProps {
        val builder = CfnVerifiedAccessGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a Verified Access instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVerifiedAccessInstance cfnVerifiedAccessInstance =
     * CfnVerifiedAccessInstance.Builder.create(this, "MyCfnVerifiedAccessInstance")
     * .description("description")
     * .loggingConfigurations(VerifiedAccessLogsProperty.builder()
     * .cloudWatchLogs(CloudWatchLogsProperty.builder()
     * .enabled(false)
     * .logGroup("logGroup")
     * .build())
     * .includeTrustContext(false)
     * .kinesisDataFirehose(KinesisDataFirehoseProperty.builder()
     * .deliveryStream("deliveryStream")
     * .enabled(false)
     * .build())
     * .logVersion("logVersion")
     * .s3(S3Property.builder()
     * .bucketName("bucketName")
     * .bucketOwner("bucketOwner")
     * .enabled(false)
     * .prefix("prefix")
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .verifiedAccessTrustProviderIds(List.of("verifiedAccessTrustProviderIds"))
     * .verifiedAccessTrustProviders(List.of(VerifiedAccessTrustProviderProperty.builder()
     * .description("description")
     * .deviceTrustProviderType("deviceTrustProviderType")
     * .trustProviderType("trustProviderType")
     * .userTrustProviderType("userTrustProviderType")
     * .verifiedAccessTrustProviderId("verifiedAccessTrustProviderId")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html)
     */
    public inline fun cfnVerifiedAccessInstance(
        scope: Construct,
        id: String,
        block: CfnVerifiedAccessInstanceDsl.() -> Unit = {},
    ): CfnVerifiedAccessInstance {
        val builder = CfnVerifiedAccessInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for CloudWatch Logs as a logging destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CloudWatchLogsProperty cloudWatchLogsProperty = CloudWatchLogsProperty.builder()
     * .enabled(false)
     * .logGroup("logGroup")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-cloudwatchlogs.html)
     */
    public inline fun cfnVerifiedAccessInstanceCloudWatchLogsProperty(
        block: CfnVerifiedAccessInstanceCloudWatchLogsPropertyDsl.() -> Unit = {}
    ): CfnVerifiedAccessInstance.CloudWatchLogsProperty {
        val builder = CfnVerifiedAccessInstanceCloudWatchLogsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for Kinesis as a logging destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * KinesisDataFirehoseProperty kinesisDataFirehoseProperty = KinesisDataFirehoseProperty.builder()
     * .deliveryStream("deliveryStream")
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-kinesisdatafirehose.html)
     */
    public inline fun cfnVerifiedAccessInstanceKinesisDataFirehoseProperty(
        block: CfnVerifiedAccessInstanceKinesisDataFirehosePropertyDsl.() -> Unit = {}
    ): CfnVerifiedAccessInstance.KinesisDataFirehoseProperty {
        val builder = CfnVerifiedAccessInstanceKinesisDataFirehosePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVerifiedAccessInstance`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVerifiedAccessInstanceProps cfnVerifiedAccessInstanceProps =
     * CfnVerifiedAccessInstanceProps.builder()
     * .description("description")
     * .loggingConfigurations(VerifiedAccessLogsProperty.builder()
     * .cloudWatchLogs(CloudWatchLogsProperty.builder()
     * .enabled(false)
     * .logGroup("logGroup")
     * .build())
     * .includeTrustContext(false)
     * .kinesisDataFirehose(KinesisDataFirehoseProperty.builder()
     * .deliveryStream("deliveryStream")
     * .enabled(false)
     * .build())
     * .logVersion("logVersion")
     * .s3(S3Property.builder()
     * .bucketName("bucketName")
     * .bucketOwner("bucketOwner")
     * .enabled(false)
     * .prefix("prefix")
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .verifiedAccessTrustProviderIds(List.of("verifiedAccessTrustProviderIds"))
     * .verifiedAccessTrustProviders(List.of(VerifiedAccessTrustProviderProperty.builder()
     * .description("description")
     * .deviceTrustProviderType("deviceTrustProviderType")
     * .trustProviderType("trustProviderType")
     * .userTrustProviderType("userTrustProviderType")
     * .verifiedAccessTrustProviderId("verifiedAccessTrustProviderId")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html)
     */
    public inline fun cfnVerifiedAccessInstanceProps(
        block: CfnVerifiedAccessInstancePropsDsl.() -> Unit = {}
    ): CfnVerifiedAccessInstanceProps {
        val builder = CfnVerifiedAccessInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for Amazon S3 as a logging destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * S3Property s3Property = S3Property.builder()
     * .bucketName("bucketName")
     * .bucketOwner("bucketOwner")
     * .enabled(false)
     * .prefix("prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-s3.html)
     */
    public inline fun cfnVerifiedAccessInstanceS3Property(
        block: CfnVerifiedAccessInstanceS3PropertyDsl.() -> Unit = {}
    ): CfnVerifiedAccessInstance.S3Property {
        val builder = CfnVerifiedAccessInstanceS3PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the options for Verified Access logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * VerifiedAccessLogsProperty verifiedAccessLogsProperty = VerifiedAccessLogsProperty.builder()
     * .cloudWatchLogs(CloudWatchLogsProperty.builder()
     * .enabled(false)
     * .logGroup("logGroup")
     * .build())
     * .includeTrustContext(false)
     * .kinesisDataFirehose(KinesisDataFirehoseProperty.builder()
     * .deliveryStream("deliveryStream")
     * .enabled(false)
     * .build())
     * .logVersion("logVersion")
     * .s3(S3Property.builder()
     * .bucketName("bucketName")
     * .bucketOwner("bucketOwner")
     * .enabled(false)
     * .prefix("prefix")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesslogs.html)
     */
    public inline fun cfnVerifiedAccessInstanceVerifiedAccessLogsProperty(
        block: CfnVerifiedAccessInstanceVerifiedAccessLogsPropertyDsl.() -> Unit = {}
    ): CfnVerifiedAccessInstance.VerifiedAccessLogsProperty {
        val builder = CfnVerifiedAccessInstanceVerifiedAccessLogsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a Verified Access trust provider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * VerifiedAccessTrustProviderProperty verifiedAccessTrustProviderProperty =
     * VerifiedAccessTrustProviderProperty.builder()
     * .description("description")
     * .deviceTrustProviderType("deviceTrustProviderType")
     * .trustProviderType("trustProviderType")
     * .userTrustProviderType("userTrustProviderType")
     * .verifiedAccessTrustProviderId("verifiedAccessTrustProviderId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesstrustprovider.html)
     */
    public inline fun cfnVerifiedAccessInstanceVerifiedAccessTrustProviderProperty(
        block: CfnVerifiedAccessInstanceVerifiedAccessTrustProviderPropertyDsl.() -> Unit = {}
    ): CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty {
        val builder = CfnVerifiedAccessInstanceVerifiedAccessTrustProviderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a Verified Access trust provider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVerifiedAccessTrustProvider cfnVerifiedAccessTrustProvider =
     * CfnVerifiedAccessTrustProvider.Builder.create(this, "MyCfnVerifiedAccessTrustProvider")
     * .policyReferenceName("policyReferenceName")
     * .trustProviderType("trustProviderType")
     * // the properties below are optional
     * .description("description")
     * .deviceOptions(DeviceOptionsProperty.builder()
     * .tenantId("tenantId")
     * .build())
     * .deviceTrustProviderType("deviceTrustProviderType")
     * .oidcOptions(OidcOptionsProperty.builder()
     * .authorizationEndpoint("authorizationEndpoint")
     * .clientId("clientId")
     * .clientSecret("clientSecret")
     * .issuer("issuer")
     * .scope("scope")
     * .tokenEndpoint("tokenEndpoint")
     * .userInfoEndpoint("userInfoEndpoint")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userTrustProviderType("userTrustProviderType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html)
     */
    public inline fun cfnVerifiedAccessTrustProvider(
        scope: Construct,
        id: String,
        block: CfnVerifiedAccessTrustProviderDsl.() -> Unit = {},
    ): CfnVerifiedAccessTrustProvider {
        val builder = CfnVerifiedAccessTrustProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the options for an AWS Verified Access device-identity based trust provider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * DeviceOptionsProperty deviceOptionsProperty = DeviceOptionsProperty.builder()
     * .tenantId("tenantId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-deviceoptions.html)
     */
    public inline fun cfnVerifiedAccessTrustProviderDeviceOptionsProperty(
        block: CfnVerifiedAccessTrustProviderDeviceOptionsPropertyDsl.() -> Unit = {}
    ): CfnVerifiedAccessTrustProvider.DeviceOptionsProperty {
        val builder = CfnVerifiedAccessTrustProviderDeviceOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the options for an OpenID Connect-compatible user-identity trust provider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * OidcOptionsProperty oidcOptionsProperty = OidcOptionsProperty.builder()
     * .authorizationEndpoint("authorizationEndpoint")
     * .clientId("clientId")
     * .clientSecret("clientSecret")
     * .issuer("issuer")
     * .scope("scope")
     * .tokenEndpoint("tokenEndpoint")
     * .userInfoEndpoint("userInfoEndpoint")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-oidcoptions.html)
     */
    public inline fun cfnVerifiedAccessTrustProviderOidcOptionsProperty(
        block: CfnVerifiedAccessTrustProviderOidcOptionsPropertyDsl.() -> Unit = {}
    ): CfnVerifiedAccessTrustProvider.OidcOptionsProperty {
        val builder = CfnVerifiedAccessTrustProviderOidcOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVerifiedAccessTrustProvider`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVerifiedAccessTrustProviderProps cfnVerifiedAccessTrustProviderProps =
     * CfnVerifiedAccessTrustProviderProps.builder()
     * .policyReferenceName("policyReferenceName")
     * .trustProviderType("trustProviderType")
     * // the properties below are optional
     * .description("description")
     * .deviceOptions(DeviceOptionsProperty.builder()
     * .tenantId("tenantId")
     * .build())
     * .deviceTrustProviderType("deviceTrustProviderType")
     * .oidcOptions(OidcOptionsProperty.builder()
     * .authorizationEndpoint("authorizationEndpoint")
     * .clientId("clientId")
     * .clientSecret("clientSecret")
     * .issuer("issuer")
     * .scope("scope")
     * .tokenEndpoint("tokenEndpoint")
     * .userInfoEndpoint("userInfoEndpoint")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userTrustProviderType("userTrustProviderType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html)
     */
    public inline fun cfnVerifiedAccessTrustProviderProps(
        block: CfnVerifiedAccessTrustProviderPropsDsl.() -> Unit = {}
    ): CfnVerifiedAccessTrustProviderProps {
        val builder = CfnVerifiedAccessTrustProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Amazon Elastic Block Store (Amazon EBS) volume.
     *
     * You can attach the volume to an instance in the same Availability Zone using
     * [AWS::EC2::VolumeAttachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html)
     * .
     *
     * When you use AWS CloudFormation to update an Amazon EBS volume that modifies `Iops` , `Size`
     * , or `VolumeType` , there is a cooldown period before another operation can occur. This can
     * cause your stack to report being in `UPDATE_IN_PROGRESS` or `UPDATE_ROLLBACK_IN_PROGRESS` for
     * long periods of time.
     *
     * Amazon EBS does not support sizing down an Amazon EBS volume. AWS CloudFormation does not
     * attempt to modify an Amazon EBS volume to a smaller size on rollback.
     *
     * Some common scenarios when you might encounter a cooldown period for Amazon EBS include:
     * * You successfully update an Amazon EBS volume and the update succeeds. When you attempt
     *   another update within the cooldown window, that update will be subject to a cooldown
     *   period.
     * * You successfully update an Amazon EBS volume and the update succeeds but another change in
     *   your `update-stack` call fails. The rollback will be subject to a cooldown period.
     *
     * For more information on the cooldown period, see
     * [Requirements when modifying volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/modify-volume-requirements.html)
     * .
     *
     * *DeletionPolicy attribute*
     *
     * To control how AWS CloudFormation handles the volume when the stack is deleted, set a
     * deletion policy for your volume. You can choose to retain the volume, to delete the volume,
     * or to create a snapshot of the volume. For more information, see
     * [DeletionPolicy attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
     * .
     *
     * If you set a deletion policy that creates a snapshot, all tags on the volume are included in
     * the snapshot.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVolume cfnVolume = CfnVolume.Builder.create(this, "MyCfnVolume")
     * .availabilityZone("availabilityZone")
     * // the properties below are optional
     * .autoEnableIo(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .multiAttachEnabled(false)
     * .outpostArn("outpostArn")
     * .size(123)
     * .snapshotId("snapshotId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .throughput(123)
     * .volumeType("volumeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html)
     */
    public inline fun cfnVolume(
        scope: Construct,
        id: String,
        block: CfnVolumeDsl.() -> Unit = {},
    ): CfnVolume {
        val builder = CfnVolumeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attaches an Amazon EBS volume to a running instance and exposes it to the instance with the
     * specified device name.
     *
     * Before this resource can be deleted (and therefore the volume detached), you must first
     * unmount the volume in the instance. Failure to do so results in the volume being stuck in the
     * busy state while it is trying to detach, which could possibly damage the file system or the
     * data it contains.
     *
     * If an Amazon EBS volume is the root device of an instance, it cannot be detached while the
     * instance is in the "running" state. To detach the root volume, stop the instance first.
     *
     * If the root volume is detached from an instance with an AWS Marketplace product code, then
     * the product codes from that volume are no longer associated with the instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVolumeAttachment cfnVolumeAttachment = CfnVolumeAttachment.Builder.create(this,
     * "MyCfnVolumeAttachment")
     * .instanceId("instanceId")
     * .volumeId("volumeId")
     * // the properties below are optional
     * .device("device")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volumeattachment.html)
     */
    public inline fun cfnVolumeAttachment(
        scope: Construct,
        id: String,
        block: CfnVolumeAttachmentDsl.() -> Unit = {},
    ): CfnVolumeAttachment {
        val builder = CfnVolumeAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVolumeAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVolumeAttachmentProps cfnVolumeAttachmentProps = CfnVolumeAttachmentProps.builder()
     * .instanceId("instanceId")
     * .volumeId("volumeId")
     * // the properties below are optional
     * .device("device")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volumeattachment.html)
     */
    public inline fun cfnVolumeAttachmentProps(
        block: CfnVolumeAttachmentPropsDsl.() -> Unit = {}
    ): CfnVolumeAttachmentProps {
        val builder = CfnVolumeAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVolume`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * CfnVolumeProps cfnVolumeProps = CfnVolumeProps.builder()
     * .availabilityZone("availabilityZone")
     * // the properties below are optional
     * .autoEnableIo(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .multiAttachEnabled(false)
     * .outpostArn("outpostArn")
     * .size(123)
     * .snapshotId("snapshotId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .throughput(123)
     * .volumeType("volumeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html)
     */
    public inline fun cfnVolumeProps(block: CfnVolumePropsDsl.() -> Unit = {}): CfnVolumeProps {
        val builder = CfnVolumePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A client VPN authorization rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ClientVpnEndpoint clientVpnEndpoint;
     * ClientVpnAuthorizationRule clientVpnAuthorizationRule =
     * ClientVpnAuthorizationRule.Builder.create(this, "MyClientVpnAuthorizationRule")
     * .cidr("cidr")
     * // the properties below are optional
     * .clientVpnEndpoint(clientVpnEndpoint)
     * .description("description")
     * .groupId("groupId")
     * .build();
     * ```
     */
    public inline fun clientVpnAuthorizationRule(
        scope: Construct,
        id: String,
        block: ClientVpnAuthorizationRuleDsl.() -> Unit = {},
    ): ClientVpnAuthorizationRule {
        val builder = ClientVpnAuthorizationRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for a ClientVpnAuthorizationRule.
     *
     * Example:
     * ```
     * ClientVpnEndpoint endpoint = vpc.addClientVpnEndpoint("Endpoint",
     * ClientVpnEndpointOptions.builder()
     * .cidr("10.100.0.0/16")
     * .serverCertificateArn("arn:aws:acm:us-east-1:123456789012:certificate/server-certificate-id")
     * .userBasedAuthentication(ClientVpnUserBasedAuthentication.federated(samlProvider))
     * .authorizeAllUsersToVpcCidr(false)
     * .build());
     * endpoint.addAuthorizationRule("Rule", ClientVpnAuthorizationRuleOptions.builder()
     * .cidr("10.0.10.0/32")
     * .groupId("group-id")
     * .build());
     * ```
     */
    public inline fun clientVpnAuthorizationRuleOptions(
        block: ClientVpnAuthorizationRuleOptionsDsl.() -> Unit = {}
    ): ClientVpnAuthorizationRuleOptions {
        val builder = ClientVpnAuthorizationRuleOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a ClientVpnAuthorizationRule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ClientVpnEndpoint clientVpnEndpoint;
     * ClientVpnAuthorizationRuleProps clientVpnAuthorizationRuleProps =
     * ClientVpnAuthorizationRuleProps.builder()
     * .cidr("cidr")
     * // the properties below are optional
     * .clientVpnEndpoint(clientVpnEndpoint)
     * .description("description")
     * .groupId("groupId")
     * .build();
     * ```
     */
    public inline fun clientVpnAuthorizationRuleProps(
        block: ClientVpnAuthorizationRulePropsDsl.() -> Unit = {}
    ): ClientVpnAuthorizationRuleProps {
        val builder = ClientVpnAuthorizationRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A client VPN connnection.
     *
     * Example:
     * ```
     * ClientVpnEndpoint endpoint = vpc.addClientVpnEndpoint("Endpoint",
     * ClientVpnEndpointOptions.builder()
     * .cidr("10.100.0.0/16")
     * .serverCertificateArn("arn:aws:acm:us-east-1:123456789012:certificate/server-certificate-id")
     * .userBasedAuthentication(ClientVpnUserBasedAuthentication.federated(samlProvider))
     * .authorizeAllUsersToVpcCidr(false)
     * .build());
     * endpoint.addAuthorizationRule("Rule", ClientVpnAuthorizationRuleOptions.builder()
     * .cidr("10.0.10.0/32")
     * .groupId("group-id")
     * .build());
     * ```
     */
    public inline fun clientVpnEndpoint(
        scope: Construct,
        id: String,
        block: ClientVpnEndpointDsl.() -> Unit = {},
    ): ClientVpnEndpoint {
        val builder = ClientVpnEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes when importing an existing client VPN endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * SecurityGroup securityGroup;
     * ClientVpnEndpointAttributes clientVpnEndpointAttributes = ClientVpnEndpointAttributes.builder()
     * .endpointId("endpointId")
     * .securityGroups(List.of(securityGroup))
     * .build();
     * ```
     */
    public inline fun clientVpnEndpointAttributes(
        block: ClientVpnEndpointAttributesDsl.() -> Unit = {}
    ): ClientVpnEndpointAttributes {
        val builder = ClientVpnEndpointAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for a client VPN endpoint.
     *
     * Example:
     * ```
     * ClientVpnEndpoint endpoint = vpc.addClientVpnEndpoint("Endpoint",
     * ClientVpnEndpointOptions.builder()
     * .cidr("10.100.0.0/16")
     * .serverCertificateArn("arn:aws:acm:us-east-1:123456789012:certificate/server-certificate-id")
     * .userBasedAuthentication(ClientVpnUserBasedAuthentication.federated(samlProvider))
     * .authorizeAllUsersToVpcCidr(false)
     * .build());
     * endpoint.addAuthorizationRule("Rule", ClientVpnAuthorizationRuleOptions.builder()
     * .cidr("10.0.10.0/32")
     * .groupId("group-id")
     * .build());
     * ```
     */
    public inline fun clientVpnEndpointOptions(
        block: ClientVpnEndpointOptionsDsl.() -> Unit = {}
    ): ClientVpnEndpointOptions {
        val builder = ClientVpnEndpointOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a client VPN endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.logs.*;
     * IClientVpnConnectionHandler clientVpnConnectionHandler;
     * ClientVpnUserBasedAuthentication clientVpnUserBasedAuthentication;
     * LogGroup logGroup;
     * LogStream logStream;
     * SecurityGroup securityGroup;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Vpc vpc;
     * ClientVpnEndpointProps clientVpnEndpointProps = ClientVpnEndpointProps.builder()
     * .cidr("cidr")
     * .serverCertificateArn("serverCertificateArn")
     * .vpc(vpc)
     * // the properties below are optional
     * .authorizeAllUsersToVpcCidr(false)
     * .clientCertificateArn("clientCertificateArn")
     * .clientConnectionHandler(clientVpnConnectionHandler)
     * .clientLoginBanner("clientLoginBanner")
     * .description("description")
     * .dnsServers(List.of("dnsServers"))
     * .logging(false)
     * .logGroup(logGroup)
     * .logStream(logStream)
     * .port(VpnPort.HTTPS)
     * .securityGroups(List.of(securityGroup))
     * .selfServicePortal(false)
     * .sessionTimeout(ClientVpnSessionTimeout.EIGHT_HOURS)
     * .splitTunnel(false)
     * .transportProtocol(TransportProtocol.TCP)
     * .userBasedAuthentication(clientVpnUserBasedAuthentication)
     * .vpcSubnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun clientVpnEndpointProps(
        block: ClientVpnEndpointPropsDsl.() -> Unit = {}
    ): ClientVpnEndpointProps {
        val builder = ClientVpnEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A client VPN route.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ClientVpnEndpoint clientVpnEndpoint;
     * ClientVpnRouteTarget clientVpnRouteTarget;
     * ClientVpnRoute clientVpnRoute = ClientVpnRoute.Builder.create(this, "MyClientVpnRoute")
     * .cidr("cidr")
     * .target(clientVpnRouteTarget)
     * // the properties below are optional
     * .clientVpnEndpoint(clientVpnEndpoint)
     * .description("description")
     * .build();
     * ```
     */
    public inline fun clientVpnRoute(
        scope: Construct,
        id: String,
        block: ClientVpnRouteDsl.() -> Unit = {},
    ): ClientVpnRoute {
        val builder = ClientVpnRouteDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for a ClientVpnRoute.
     *
     * Example:
     * ```
     * ClientVpnEndpoint endpoint = vpc.addClientVpnEndpoint("Endpoint",
     * ClientVpnEndpointOptions.builder()
     * .cidr("10.100.0.0/16")
     * .serverCertificateArn("arn:aws:acm:us-east-1:123456789012:certificate/server-certificate-id")
     * .userBasedAuthentication(ClientVpnUserBasedAuthentication.federated(samlProvider))
     * .build());
     * // Client-to-client access
     * endpoint.addRoute("Route", ClientVpnRouteOptions.builder()
     * .cidr("10.100.0.0/16")
     * .target(ClientVpnRouteTarget.local())
     * .build());
     * ```
     */
    public inline fun clientVpnRouteOptions(
        block: ClientVpnRouteOptionsDsl.() -> Unit = {}
    ): ClientVpnRouteOptions {
        val builder = ClientVpnRouteOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a ClientVpnRoute.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ClientVpnEndpoint clientVpnEndpoint;
     * ClientVpnRouteTarget clientVpnRouteTarget;
     * ClientVpnRouteProps clientVpnRouteProps = ClientVpnRouteProps.builder()
     * .cidr("cidr")
     * .target(clientVpnRouteTarget)
     * // the properties below are optional
     * .clientVpnEndpoint(clientVpnEndpoint)
     * .description("description")
     * .build();
     * ```
     */
    public inline fun clientVpnRouteProps(
        block: ClientVpnRoutePropsDsl.() -> Unit = {}
    ): ClientVpnRouteProps {
        val builder = ClientVpnRoutePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Basic NetworkACL entry props.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AclCidr aclCidr;
     * AclTraffic aclTraffic;
     * CommonNetworkAclEntryOptions commonNetworkAclEntryOptions =
     * CommonNetworkAclEntryOptions.builder()
     * .cidr(aclCidr)
     * .ruleNumber(123)
     * .traffic(aclTraffic)
     * // the properties below are optional
     * .direction(TrafficDirection.EGRESS)
     * .networkAclEntryName("networkAclEntryName")
     * .ruleAction(Action.ALLOW)
     * .build();
     * ```
     */
    public inline fun commonNetworkAclEntryOptions(
        block: CommonNetworkAclEntryOptionsDsl.() -> Unit = {}
    ): CommonNetworkAclEntryOptions {
        val builder = CommonNetworkAclEntryOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for CloudFormationInit.withConfigSets.
     *
     * Example:
     * ```
     * Vpc vpc;
     * InstanceType instanceType;
     * IMachineImage machineImage;
     * Instance.Builder.create(this, "Instance")
     * .vpc(vpc)
     * .instanceType(instanceType)
     * .machineImage(machineImage)
     * // Showing the most complex setup, if you have simpler requirements
     * // you can use `CloudFormationInit.fromElements()`.
     * .init(CloudFormationInit.fromConfigSets(ConfigSetProps.builder()
     * .configSets(Map.of(
     * // Applies the configs below in this order
     * "default", List.of("yumPreinstall", "config")))
     * .configs(Map.of(
     * "yumPreinstall", new InitConfig(List.of(InitPackage.yum("git"))),
     * "config", new InitConfig(List.of(InitFile.fromObject("/etc/stack.json", Map.of(
     * "stackId", Stack.of(this).getStackId(),
     * "stackName", Stack.of(this).getStackName(),
     * "region", Stack.of(this).getRegion())), InitGroup.fromName("my-group"),
     * InitUser.fromName("my-user"),
     * InitPackage.rpm("http://mirrors.ukfast.co.uk/sites/dl.fedoraproject.org/pub/epel/8/Everything/x86_64/Packages/r/rubygem-git-1.5.0-2.el8.noarch.rpm")))))
     * .build()))
     * .initOptions(ApplyCloudFormationInitOptions.builder()
     * // Optional, which configsets to activate (['default'] by default)
     * .configSets(List.of("default"))
     * // Optional, how long the installation is expected to take (5 minutes by default)
     * .timeout(Duration.minutes(30))
     * // Optional, whether to include the --url argument when running cfn-init and cfn-signal
     * commands (false by default)
     * .includeUrl(true)
     * // Optional, whether to include the --role argument when running cfn-init and cfn-signal
     * commands (false by default)
     * .includeRole(true)
     * .build())
     * .build();
     * ```
     */
    public inline fun configSetProps(block: ConfigSetPropsDsl.() -> Unit = {}): ConfigSetProps {
        val builder = ConfigSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options passed by the VPC when NAT needs to be configured.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PrivateSubnet privateSubnet;
     * PublicSubnet publicSubnet;
     * Vpc vpc;
     * ConfigureNatOptions configureNatOptions = ConfigureNatOptions.builder()
     * .natSubnets(List.of(publicSubnet))
     * .privateSubnets(List.of(privateSubnet))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun configureNatOptions(
        block: ConfigureNatOptionsDsl.() -> Unit = {}
    ): ConfigureNatOptions {
        val builder = ConfigureNatOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * ConnectionRule connectionRule = ConnectionRule.builder()
     * .fromPort(123)
     * // the properties below are optional
     * .description("description")
     * .protocol("protocol")
     * .toPort(123)
     * .build();
     * ```
     */
    public inline fun connectionRule(block: ConnectionRuleDsl.() -> Unit = {}): ConnectionRule {
        val builder = ConnectionRuleDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Manage the allowed network connections for constructs with Security Groups.
     *
     * Security Groups can be thought of as a firewall for network-connected devices. This class
     * makes it easy to allow network connections to and from security groups, and between security
     * groups individually. When establishing connectivity between security groups, it will
     * automatically add rules in both security groups
     *
     * This object can manage one or more security groups.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * IPeer peer;
     * Port port;
     * SecurityGroup securityGroup;
     * Connections connections = Connections.Builder.create()
     * .defaultPort(port)
     * .peer(peer)
     * .securityGroups(List.of(securityGroup))
     * .build();
     * ```
     */
    public inline fun connections(block: ConnectionsDsl.() -> Unit = {}): Connections {
        val builder = ConnectionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to intialize a new Connections object.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * IPeer peer;
     * Port port;
     * SecurityGroup securityGroup;
     * ConnectionsProps connectionsProps = ConnectionsProps.builder()
     * .defaultPort(port)
     * .peer(peer)
     * .securityGroups(List.of(securityGroup))
     * .build();
     * ```
     */
    public inline fun connectionsProps(
        block: ConnectionsPropsDsl.() -> Unit = {}
    ): ConnectionsProps {
        val builder = ConnectionsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for writing logs to a destination.
     *
     * TODO: there are other destination options, currently they are only for s3 destinations (not
     *   sure if that will change)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * DestinationOptions destinationOptions = DestinationOptions.builder()
     * .fileFormat(FlowLogFileFormat.PLAIN_TEXT)
     * .hiveCompatiblePartitions(false)
     * .perHourPartition(false)
     * .build();
     * ```
     */
    public inline fun destinationOptions(
        block: DestinationOptionsDsl.() -> Unit = {}
    ): DestinationOptions {
        val builder = DestinationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Block device options for an EBS volume.
     *
     * Example:
     * ```
     * BastionHostLinux host = BastionHostLinux.Builder.create(this, "BastionHost")
     * .vpc(vpc)
     * .blockDevices(List.of(BlockDevice.builder()
     * .deviceName("EBSBastionHost")
     * .volume(BlockDeviceVolume.ebs(10, EbsDeviceOptions.builder()
     * .encrypted(true)
     * .build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun ebsDeviceOptions(
        block: EbsDeviceOptionsDsl.() -> Unit = {}
    ): EbsDeviceOptions {
        val builder = EbsDeviceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Base block device options for an EBS volume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * EbsDeviceOptionsBase ebsDeviceOptionsBase = EbsDeviceOptionsBase.builder()
     * .deleteOnTermination(false)
     * .iops(123)
     * .volumeType(EbsDeviceVolumeType.STANDARD)
     * .build();
     * ```
     */
    public inline fun ebsDeviceOptionsBase(
        block: EbsDeviceOptionsBaseDsl.() -> Unit = {}
    ): EbsDeviceOptionsBase {
        val builder = EbsDeviceOptionsBaseDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of an EBS block device.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.kms.*;
     * Key key;
     * EbsDeviceProps ebsDeviceProps = EbsDeviceProps.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKey(key)
     * .snapshotId("snapshotId")
     * .volumeSize(123)
     * .volumeType(EbsDeviceVolumeType.STANDARD)
     * .build();
     * ```
     */
    public inline fun ebsDeviceProps(block: EbsDevicePropsDsl.() -> Unit = {}): EbsDeviceProps {
        val builder = EbsDevicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Block device options for an EBS volume created from a snapshot.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * EbsDeviceSnapshotOptions ebsDeviceSnapshotOptions = EbsDeviceSnapshotOptions.builder()
     * .deleteOnTermination(false)
     * .iops(123)
     * .volumeSize(123)
     * .volumeType(EbsDeviceVolumeType.STANDARD)
     * .build();
     * ```
     */
    public inline fun ebsDeviceSnapshotOptions(
        block: EbsDeviceSnapshotOptionsDsl.() -> Unit = {}
    ): EbsDeviceSnapshotOptions {
        val builder = EbsDeviceSnapshotOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for the Vpc.enableVpnGateway() method.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * EnableVpnGatewayOptions enableVpnGatewayOptions = EnableVpnGatewayOptions.builder()
     * .type("type")
     * // the properties below are optional
     * .amazonSideAsn(123)
     * .vpnRoutePropagation(List.of(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build()))
     * .build();
     * ```
     */
    public inline fun enableVpnGatewayOptions(
        block: EnableVpnGatewayOptionsDsl.() -> Unit = {}
    ): EnableVpnGatewayOptions {
        val builder = EnableVpnGatewayOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options when executing a file.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.assets.Asset;
     * Instance instance;
     * Asset asset = Asset.Builder.create(this, "Asset")
     * .path("./configure.sh")
     * .build();
     * String localPath = instance.userData.addS3DownloadCommand(S3DownloadOptions.builder()
     * .bucket(asset.getBucket())
     * .bucketKey(asset.getS3ObjectKey())
     * .region("us-east-1")
     * .build());
     * instance.userData.addExecuteFileCommand(ExecuteFileOptions.builder()
     * .filePath(localPath)
     * .arguments("--verbose -y")
     * .build());
     * asset.grantRead(instance.getRole());
     * ```
     */
    public inline fun executeFileOptions(
        block: ExecuteFileOptionsDsl.() -> Unit = {}
    ): ExecuteFileOptions {
        val builder = ExecuteFileOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A VPC flow log.
     *
     * Example:
     * ```
     * Vpc vpc;
     * LogGroup logGroup = new LogGroup(this, "MyCustomLogGroup");
     * Role role = Role.Builder.create(this, "MyCustomRole")
     * .assumedBy(new ServicePrincipal("vpc-flow-logs.amazonaws.com"))
     * .build();
     * FlowLog.Builder.create(this, "FlowLog")
     * .resourceType(FlowLogResourceType.fromVpc(vpc))
     * .destination(FlowLogDestination.toCloudWatchLogs(logGroup, role))
     * .build();
     * ```
     */
    public inline fun flowLog(
        scope: Construct,
        id: String,
        block: FlowLogDsl.() -> Unit = {},
    ): FlowLog {
        val builder = FlowLogDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Flow Log Destination configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.logs.*;
     * import software.amazon.awscdk.services.s3.*;
     * Bucket bucket;
     * LogGroup logGroup;
     * Role role;
     * FlowLogDestinationConfig flowLogDestinationConfig = FlowLogDestinationConfig.builder()
     * .logDestinationType(FlowLogDestinationType.CLOUD_WATCH_LOGS)
     * // the properties below are optional
     * .destinationOptions(DestinationOptions.builder()
     * .fileFormat(FlowLogFileFormat.PLAIN_TEXT)
     * .hiveCompatiblePartitions(false)
     * .perHourPartition(false)
     * .build())
     * .iamRole(role)
     * .keyPrefix("keyPrefix")
     * .logGroup(logGroup)
     * .s3Bucket(bucket)
     * .build();
     * ```
     */
    public inline fun flowLogDestinationConfig(
        block: FlowLogDestinationConfigDsl.() -> Unit = {}
    ): FlowLogDestinationConfig {
        val builder = FlowLogDestinationConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to add a flow log to a VPC.
     *
     * Example:
     * ```
     * Vpc vpc = new Vpc(this, "Vpc");
     * vpc.addFlowLog("FlowLogS3", FlowLogOptions.builder()
     * .destination(FlowLogDestination.toS3())
     * .build());
     * // Only reject traffic and interval every minute.
     * vpc.addFlowLog("FlowLogCloudWatch", FlowLogOptions.builder()
     * .trafficType(FlowLogTrafficType.REJECT)
     * .maxAggregationInterval(FlowLogMaxAggregationInterval.ONE_MINUTE)
     * .build());
     * ```
     */
    public inline fun flowLogOptions(block: FlowLogOptionsDsl.() -> Unit = {}): FlowLogOptions {
        val builder = FlowLogOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of a VPC Flow Log.
     *
     * Example:
     * ```
     * Vpc vpc;
     * LogGroup logGroup = new LogGroup(this, "MyCustomLogGroup");
     * Role role = Role.Builder.create(this, "MyCustomRole")
     * .assumedBy(new ServicePrincipal("vpc-flow-logs.amazonaws.com"))
     * .build();
     * FlowLog.Builder.create(this, "FlowLog")
     * .resourceType(FlowLogResourceType.fromVpc(vpc))
     * .destination(FlowLogDestination.toCloudWatchLogs(logGroup, role))
     * .build();
     * ```
     */
    public inline fun flowLogProps(block: FlowLogPropsDsl.() -> Unit = {}): FlowLogProps {
        val builder = FlowLogPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Pair represents a gateway created by NAT Provider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * GatewayConfig gatewayConfig = GatewayConfig.builder()
     * .az("az")
     * .gatewayId("gatewayId")
     * .build();
     * ```
     */
    public inline fun gatewayConfig(block: GatewayConfigDsl.() -> Unit = {}): GatewayConfig {
        val builder = GatewayConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A gateway VPC endpoint.
     *
     * Example:
     * ```
     * // Add gateway endpoints when creating the VPC
     * Vpc vpc = Vpc.Builder.create(this, "MyVpc")
     * .gatewayEndpoints(Map.of(
     * "S3", GatewayVpcEndpointOptions.builder()
     * .service(GatewayVpcEndpointAwsService.S3)
     * .build()))
     * .build();
     * // Alternatively gateway endpoints can be added on the VPC
     * GatewayVpcEndpoint dynamoDbEndpoint = vpc.addGatewayEndpoint("DynamoDbEndpoint",
     * GatewayVpcEndpointOptions.builder()
     * .service(GatewayVpcEndpointAwsService.DYNAMODB)
     * .build());
     * // This allows to customize the endpoint policy
     * dynamoDbEndpoint.addToPolicy(
     * PolicyStatement.Builder.create() // Restrict to listing and describing tables
     * .principals(List.of(new AnyPrincipal()))
     * .actions(List.of("dynamodb:DescribeTable", "dynamodb:ListTables"))
     * .resources(List.of("*")).build());
     * // Add an interface endpoint
     * vpc.addInterfaceEndpoint("EcrDockerEndpoint", InterfaceVpcEndpointOptions.builder()
     * .service(InterfaceVpcEndpointAwsService.ECR_DOCKER)
     * .build());
     * ```
     */
    public inline fun gatewayVpcEndpoint(
        scope: Construct,
        id: String,
        block: GatewayVpcEndpointDsl.() -> Unit = {},
    ): GatewayVpcEndpoint {
        val builder = GatewayVpcEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to add a gateway endpoint to a VPC.
     *
     * Example:
     * ```
     * // Add gateway endpoints when creating the VPC
     * Vpc vpc = Vpc.Builder.create(this, "MyVpc")
     * .gatewayEndpoints(Map.of(
     * "S3", GatewayVpcEndpointOptions.builder()
     * .service(GatewayVpcEndpointAwsService.S3)
     * .build()))
     * .build();
     * // Alternatively gateway endpoints can be added on the VPC
     * GatewayVpcEndpoint dynamoDbEndpoint = vpc.addGatewayEndpoint("DynamoDbEndpoint",
     * GatewayVpcEndpointOptions.builder()
     * .service(GatewayVpcEndpointAwsService.DYNAMODB)
     * .build());
     * // This allows to customize the endpoint policy
     * dynamoDbEndpoint.addToPolicy(
     * PolicyStatement.Builder.create() // Restrict to listing and describing tables
     * .principals(List.of(new AnyPrincipal()))
     * .actions(List.of("dynamodb:DescribeTable", "dynamodb:ListTables"))
     * .resources(List.of("*")).build());
     * // Add an interface endpoint
     * vpc.addInterfaceEndpoint("EcrDockerEndpoint", InterfaceVpcEndpointOptions.builder()
     * .service(InterfaceVpcEndpointAwsService.ECR_DOCKER)
     * .build());
     * ```
     */
    public inline fun gatewayVpcEndpointOptions(
        block: GatewayVpcEndpointOptionsDsl.() -> Unit = {}
    ): GatewayVpcEndpointOptions {
        val builder = GatewayVpcEndpointOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a GatewayVpcEndpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * IGatewayVpcEndpointService gatewayVpcEndpointService;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Vpc vpc;
     * GatewayVpcEndpointProps gatewayVpcEndpointProps = GatewayVpcEndpointProps.builder()
     * .service(gatewayVpcEndpointService)
     * .vpc(vpc)
     * // the properties below are optional
     * .subnets(List.of(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build()))
     * .build();
     * ```
     */
    public inline fun gatewayVpcEndpointProps(
        block: GatewayVpcEndpointPropsDsl.() -> Unit = {}
    ): GatewayVpcEndpointProps {
        val builder = GatewayVpcEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construct a Linux machine image from an AMI map.
     *
     * Linux images IDs are not published to SSM parameter store yet, so you'll have to manually
     * specify an AMI map.
     *
     * Example:
     * ```
     * // Pick a Windows edition to use
     * WindowsImage windows = new WindowsImage(WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_BASE);
     * // Pick the right Amazon Linux edition. All arguments shown are optional
     * // and will default to these values when omitted.
     * AmazonLinuxImage amznLinux = AmazonLinuxImage.Builder.create()
     * .generation(AmazonLinuxGeneration.AMAZON_LINUX)
     * .edition(AmazonLinuxEdition.STANDARD)
     * .virtualization(AmazonLinuxVirt.HVM)
     * .storage(AmazonLinuxStorage.GENERAL_PURPOSE)
     * .build();
     * // For other custom (Linux) images, instantiate a `GenericLinuxImage` with
     * // a map giving the AMI to in for each region:
     * GenericLinuxImage linux = new GenericLinuxImage(Map.of(
     * "us-east-1", "ami-97785bed",
     * "eu-west-1", "ami-12345678"));
     * ```
     */
    public inline fun genericLinuxImage(
        amiMap: Map<String, String>,
        block: GenericLinuxImageDsl.() -> Unit = {}
    ): GenericLinuxImage {
        val builder = GenericLinuxImageDsl(amiMap)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration options for GenericLinuxImage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * UserData userData;
     * GenericLinuxImageProps genericLinuxImageProps = GenericLinuxImageProps.builder()
     * .userData(userData)
     * .build();
     * ```
     */
    public inline fun genericLinuxImageProps(
        block: GenericLinuxImagePropsDsl.() -> Unit = {}
    ): GenericLinuxImageProps {
        val builder = GenericLinuxImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construct a Windows machine image from an AMI map.
     *
     * Allows you to create a generic Windows EC2 , manually specify an AMI map.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * UserData userData;
     * GenericWindowsImage genericWindowsImage = GenericWindowsImage.Builder.create(Map.of(
     * "amiMapKey", "amiMap"))
     * .userData(userData)
     * .build();
     * ```
     */
    public inline fun genericWindowsImage(
        amiMap: Map<String, String>,
        block: GenericWindowsImageDsl.() -> Unit = {}
    ): GenericWindowsImage {
        val builder = GenericWindowsImageDsl(amiMap)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration options for GenericWindowsImage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * UserData userData;
     * GenericWindowsImageProps genericWindowsImageProps = GenericWindowsImageProps.builder()
     * .userData(userData)
     * .build();
     * ```
     */
    public inline fun genericWindowsImageProps(
        block: GenericWindowsImagePropsDsl.() -> Unit = {}
    ): GenericWindowsImageProps {
        val builder = GenericWindowsImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for InitCommand.
     *
     * Example:
     * ```
     * InitServiceRestartHandle handle = new InitServiceRestartHandle();
     * CloudFormationInit.fromElements(InitCommand.shellCommand("/usr/bin/custom-nginx-install.sh",
     * InitCommandOptions.builder().serviceRestartHandles(List.of(handle)).build()),
     * InitService.enable("nginx", InitServiceOptions.builder().serviceRestartHandle(handle).build()));
     * ```
     */
    public inline fun initCommandOptions(
        block: InitCommandOptionsDsl.() -> Unit = {}
    ): InitCommandOptions {
        val builder = InitCommandOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Additional options for creating an InitFile from an asset.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.iam.*;
     * DockerImage dockerImage;
     * IGrantable grantable;
     * InitServiceRestartHandle initServiceRestartHandle;
     * ILocalBundling localBundling;
     * InitFileAssetOptions initFileAssetOptions = InitFileAssetOptions.builder()
     * .assetHash("assetHash")
     * .assetHashType(AssetHashType.SOURCE)
     * .base64Encoded(false)
     * .bundling(BundlingOptions.builder()
     * .image(dockerImage)
     * // the properties below are optional
     * .bundlingFileAccess(BundlingFileAccess.VOLUME_COPY)
     * .command(List.of("command"))
     * .entrypoint(List.of("entrypoint"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .local(localBundling)
     * .network("network")
     * .outputType(BundlingOutput.ARCHIVED)
     * .platform("platform")
     * .securityOpt("securityOpt")
     * .user("user")
     * .volumes(List.of(DockerVolume.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * // the properties below are optional
     * .consistency(DockerVolumeConsistency.CONSISTENT)
     * .build()))
     * .volumesFrom(List.of("volumesFrom"))
     * .workingDirectory("workingDirectory")
     * .build())
     * .deployTime(false)
     * .exclude(List.of("exclude"))
     * .followSymlinks(SymlinkFollowMode.NEVER)
     * .group("group")
     * .ignoreMode(IgnoreMode.GLOB)
     * .mode("mode")
     * .owner("owner")
     * .readers(List.of(grantable))
     * .serviceRestartHandles(List.of(initServiceRestartHandle))
     * .build();
     * ```
     */
    public inline fun initFileAssetOptions(
        block: InitFileAssetOptionsDsl.() -> Unit = {}
    ): InitFileAssetOptions {
        val builder = InitFileAssetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for InitFile.
     *
     * Example:
     * ```
     * Bucket myBucket;
     * InitServiceRestartHandle handle = new InitServiceRestartHandle();
     * CloudFormationInit.fromElements(InitFile.fromString("/etc/nginx/nginx.conf", "...",
     * InitFileOptions.builder().serviceRestartHandles(List.of(handle)).build()),
     * InitSource.fromS3Object("/var/www/html", myBucket, "html.zip",
     * InitSourceOptions.builder().serviceRestartHandles(List.of(handle)).build()),
     * InitService.enable("nginx", InitServiceOptions.builder()
     * .serviceRestartHandle(handle)
     * .build()));
     * ```
     */
    public inline fun initFileOptions(block: InitFileOptionsDsl.() -> Unit = {}): InitFileOptions {
        val builder = InitFileOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for an InitService.
     *
     * Example:
     * ```
     * Bucket myBucket;
     * InitServiceRestartHandle handle = new InitServiceRestartHandle();
     * CloudFormationInit.fromElements(InitFile.fromString("/etc/nginx/nginx.conf", "...",
     * InitFileOptions.builder().serviceRestartHandles(List.of(handle)).build()),
     * InitSource.fromS3Object("/var/www/html", myBucket, "html.zip",
     * InitSourceOptions.builder().serviceRestartHandles(List.of(handle)).build()),
     * InitService.enable("nginx", InitServiceOptions.builder()
     * .serviceRestartHandle(handle)
     * .build()));
     * ```
     */
    public inline fun initServiceOptions(
        block: InitServiceOptionsDsl.() -> Unit = {}
    ): InitServiceOptions {
        val builder = InitServiceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Additional options for an InitSource that builds an asset from local files.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.iam.*;
     * DockerImage dockerImage;
     * IGrantable grantable;
     * InitServiceRestartHandle initServiceRestartHandle;
     * ILocalBundling localBundling;
     * InitSourceAssetOptions initSourceAssetOptions = InitSourceAssetOptions.builder()
     * .assetHash("assetHash")
     * .assetHashType(AssetHashType.SOURCE)
     * .bundling(BundlingOptions.builder()
     * .image(dockerImage)
     * // the properties below are optional
     * .bundlingFileAccess(BundlingFileAccess.VOLUME_COPY)
     * .command(List.of("command"))
     * .entrypoint(List.of("entrypoint"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .local(localBundling)
     * .network("network")
     * .outputType(BundlingOutput.ARCHIVED)
     * .platform("platform")
     * .securityOpt("securityOpt")
     * .user("user")
     * .volumes(List.of(DockerVolume.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * // the properties below are optional
     * .consistency(DockerVolumeConsistency.CONSISTENT)
     * .build()))
     * .volumesFrom(List.of("volumesFrom"))
     * .workingDirectory("workingDirectory")
     * .build())
     * .deployTime(false)
     * .exclude(List.of("exclude"))
     * .followSymlinks(SymlinkFollowMode.NEVER)
     * .ignoreMode(IgnoreMode.GLOB)
     * .readers(List.of(grantable))
     * .serviceRestartHandles(List.of(initServiceRestartHandle))
     * .build();
     * ```
     */
    public inline fun initSourceAssetOptions(
        block: InitSourceAssetOptionsDsl.() -> Unit = {}
    ): InitSourceAssetOptions {
        val builder = InitSourceAssetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Additional options for an InitSource.
     *
     * Example:
     * ```
     * Bucket myBucket;
     * InitServiceRestartHandle handle = new InitServiceRestartHandle();
     * CloudFormationInit.fromElements(InitFile.fromString("/etc/nginx/nginx.conf", "...",
     * InitFileOptions.builder().serviceRestartHandles(List.of(handle)).build()),
     * InitSource.fromS3Object("/var/www/html", myBucket, "html.zip",
     * InitSourceOptions.builder().serviceRestartHandles(List.of(handle)).build()),
     * InitService.enable("nginx", InitServiceOptions.builder()
     * .serviceRestartHandle(handle)
     * .build()));
     * ```
     */
    public inline fun initSourceOptions(
        block: InitSourceOptionsDsl.() -> Unit = {}
    ): InitSourceOptions {
        val builder = InitSourceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Optional parameters used when creating a user.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * InitUserOptions initUserOptions = InitUserOptions.builder()
     * .groups(List.of("groups"))
     * .homeDir("homeDir")
     * .userId(123)
     * .build();
     * ```
     */
    public inline fun initUserOptions(block: InitUserOptionsDsl.() -> Unit = {}): InitUserOptions {
        val builder = InitUserOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This represents a single EC2 instance.
     *
     * Example:
     * ```
     * IVpc vpc;
     * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB")
     * .vpc(vpc)
     * .internetFacing(true)
     * .build();
     * // instance to add as the target for load balancer.
     * Instance instance = Instance.Builder.create(this, "targetInstance")
     * .vpc(vpc)
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.MICRO))
     * .machineImage(AmazonLinuxImage.Builder.create().generation(AmazonLinuxGeneration.AMAZON_LINUX_2).build())
     * .build();
     * lb.addTarget(new InstanceTarget(instance));
     * ```
     */
    public inline fun instance(
        scope: Construct,
        id: String,
        block: InstanceDsl.() -> Unit = {},
    ): Instance {
        val builder = InstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of an EC2 Instance.
     *
     * Example:
     * ```
     * IVpc vpc;
     * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB")
     * .vpc(vpc)
     * .internetFacing(true)
     * .build();
     * // instance to add as the target for load balancer.
     * Instance instance = Instance.Builder.create(this, "targetInstance")
     * .vpc(vpc)
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.MICRO))
     * .machineImage(AmazonLinuxImage.Builder.create().generation(AmazonLinuxGeneration.AMAZON_LINUX_2).build())
     * .build();
     * lb.addTarget(new InstanceTarget(instance));
     * ```
     */
    public inline fun instanceProps(block: InstancePropsDsl.() -> Unit = {}): InstanceProps {
        val builder = InstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Aspect that applies IMDS configuration on EC2 Instance constructs.
     *
     * This aspect configures IMDS on an EC2 instance by creating a Launch Template with the IMDS
     * configuration and associating that Launch Template with the instance. If an Instance is
     * already associated with a Launch Template, a warning will (optionally) be added to the
     * construct node and it will be skipped.
     *
     * To cover Instances already associated with Launch Templates, use `LaunchTemplateImdsAspect`.
     *
     * Example:
     * ```
     * InstanceRequireImdsv2Aspect aspect = new InstanceRequireImdsv2Aspect();
     * Aspects.of(this).add(aspect);
     * ```
     */
    public inline fun instanceRequireImdsv2Aspect(
        block: InstanceRequireImdsv2AspectDsl.() -> Unit = {}
    ): InstanceRequireImdsv2Aspect {
        val builder = InstanceRequireImdsv2AspectDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for `InstanceRequireImdsv2Aspect`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * InstanceRequireImdsv2AspectProps instanceRequireImdsv2AspectProps =
     * InstanceRequireImdsv2AspectProps.builder()
     * .suppressLaunchTemplateWarning(false)
     * .suppressWarnings(false)
     * .build();
     * ```
     */
    public inline fun instanceRequireImdsv2AspectProps(
        block: InstanceRequireImdsv2AspectPropsDsl.() -> Unit = {}
    ): InstanceRequireImdsv2AspectProps {
        val builder = InstanceRequireImdsv2AspectPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A interface VPC endpoint.
     *
     * Example:
     * ```
     * Vpc vpc;
     * InterfaceVpcEndpoint.Builder.create(this, "VPC Endpoint")
     * .vpc(vpc)
     * .service(new
     * InterfaceVpcEndpointService("com.amazonaws.vpce.us-east-1.vpce-svc-uuddlrlrbastrtsvc", 443))
     * // Choose which availability zones to place the VPC endpoint in, based on
     * // available AZs
     * .subnets(SubnetSelection.builder()
     * .availabilityZones(List.of("us-east-1a", "us-east-1c"))
     * .build())
     * .build();
     * ```
     */
    public inline fun interfaceVpcEndpoint(
        scope: Construct,
        id: String,
        block: InterfaceVpcEndpointDsl.() -> Unit = {},
    ): InterfaceVpcEndpoint {
        val builder = InterfaceVpcEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for an ImportedInterfaceVpcEndpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * SecurityGroup securityGroup;
     * InterfaceVpcEndpointAttributes interfaceVpcEndpointAttributes =
     * InterfaceVpcEndpointAttributes.builder()
     * .port(123)
     * .vpcEndpointId("vpcEndpointId")
     * // the properties below are optional
     * .securityGroups(List.of(securityGroup))
     * .build();
     * ```
     */
    public inline fun interfaceVpcEndpointAttributes(
        block: InterfaceVpcEndpointAttributesDsl.() -> Unit = {}
    ): InterfaceVpcEndpointAttributes {
        val builder = InterfaceVpcEndpointAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to add an interface endpoint to a VPC.
     *
     * Example:
     * ```
     * // Add gateway endpoints when creating the VPC
     * Vpc vpc = Vpc.Builder.create(this, "MyVpc")
     * .gatewayEndpoints(Map.of(
     * "S3", GatewayVpcEndpointOptions.builder()
     * .service(GatewayVpcEndpointAwsService.S3)
     * .build()))
     * .build();
     * // Alternatively gateway endpoints can be added on the VPC
     * GatewayVpcEndpoint dynamoDbEndpoint = vpc.addGatewayEndpoint("DynamoDbEndpoint",
     * GatewayVpcEndpointOptions.builder()
     * .service(GatewayVpcEndpointAwsService.DYNAMODB)
     * .build());
     * // This allows to customize the endpoint policy
     * dynamoDbEndpoint.addToPolicy(
     * PolicyStatement.Builder.create() // Restrict to listing and describing tables
     * .principals(List.of(new AnyPrincipal()))
     * .actions(List.of("dynamodb:DescribeTable", "dynamodb:ListTables"))
     * .resources(List.of("*")).build());
     * // Add an interface endpoint
     * vpc.addInterfaceEndpoint("EcrDockerEndpoint", InterfaceVpcEndpointOptions.builder()
     * .service(InterfaceVpcEndpointAwsService.ECR_DOCKER)
     * .build());
     * ```
     */
    public inline fun interfaceVpcEndpointOptions(
        block: InterfaceVpcEndpointOptionsDsl.() -> Unit = {}
    ): InterfaceVpcEndpointOptions {
        val builder = InterfaceVpcEndpointOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for an InterfaceVpcEndpoint.
     *
     * Example:
     * ```
     * Vpc vpc;
     * InterfaceVpcEndpoint.Builder.create(this, "VPC Endpoint")
     * .vpc(vpc)
     * .service(new
     * InterfaceVpcEndpointService("com.amazonaws.vpce.us-east-1.vpce-svc-uuddlrlrbastrtsvc", 443))
     * // Choose which availability zones to place the VPC endpoint in, based on
     * // available AZs
     * .subnets(SubnetSelection.builder()
     * .availabilityZones(List.of("us-east-1a", "us-east-1c"))
     * .build())
     * .build();
     * ```
     */
    public inline fun interfaceVpcEndpointProps(
        block: InterfaceVpcEndpointPropsDsl.() -> Unit = {}
    ): InterfaceVpcEndpointProps {
        val builder = InterfaceVpcEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This represents an EC2 LaunchTemplate.
     *
     * Example:
     * ```
     * Vpc vpc;
     * SecurityGroup sg1 = SecurityGroup.Builder.create(this, "sg1")
     * .vpc(vpc)
     * .build();
     * SecurityGroup sg2 = SecurityGroup.Builder.create(this, "sg2")
     * .vpc(vpc)
     * .build();
     * LaunchTemplate launchTemplate = LaunchTemplate.Builder.create(this, "LaunchTemplate")
     * .machineImage(MachineImage.latestAmazonLinux2023())
     * .securityGroup(sg1)
     * .build();
     * launchTemplate.addSecurityGroup(sg2);
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html)
     */
    public inline fun launchTemplate(
        scope: Construct,
        id: String,
        block: LaunchTemplateDsl.() -> Unit = {},
    ): LaunchTemplate {
        val builder = LaunchTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes for an imported LaunchTemplate.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * LaunchTemplateAttributes launchTemplateAttributes = LaunchTemplateAttributes.builder()
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .versionNumber("versionNumber")
     * .build();
     * ```
     */
    public inline fun launchTemplateAttributes(
        block: LaunchTemplateAttributesDsl.() -> Unit = {}
    ): LaunchTemplateAttributes {
        val builder = LaunchTemplateAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of a LaunchTemplate.
     *
     * Example:
     * ```
     * Vpc vpc;
     * SecurityGroup sg1 = SecurityGroup.Builder.create(this, "sg1")
     * .vpc(vpc)
     * .build();
     * SecurityGroup sg2 = SecurityGroup.Builder.create(this, "sg2")
     * .vpc(vpc)
     * .build();
     * LaunchTemplate launchTemplate = LaunchTemplate.Builder.create(this, "LaunchTemplate")
     * .machineImage(MachineImage.latestAmazonLinux2023())
     * .securityGroup(sg1)
     * .build();
     * launchTemplate.addSecurityGroup(sg2);
     * ```
     */
    public inline fun launchTemplateProps(
        block: LaunchTemplatePropsDsl.() -> Unit = {}
    ): LaunchTemplateProps {
        val builder = LaunchTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Aspect that applies IMDS configuration on EC2 Launch Template constructs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * LaunchTemplateRequireImdsv2Aspect launchTemplateRequireImdsv2Aspect =
     * LaunchTemplateRequireImdsv2Aspect.Builder.create()
     * .suppressWarnings(false)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html)
     */
    public inline fun launchTemplateRequireImdsv2Aspect(
        block: LaunchTemplateRequireImdsv2AspectDsl.() -> Unit = {}
    ): LaunchTemplateRequireImdsv2Aspect {
        val builder = LaunchTemplateRequireImdsv2AspectDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for `LaunchTemplateRequireImdsv2Aspect`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * LaunchTemplateRequireImdsv2AspectProps launchTemplateRequireImdsv2AspectProps =
     * LaunchTemplateRequireImdsv2AspectProps.builder()
     * .suppressWarnings(false)
     * .build();
     * ```
     */
    public inline fun launchTemplateRequireImdsv2AspectProps(
        block: LaunchTemplateRequireImdsv2AspectPropsDsl.() -> Unit = {}
    ): LaunchTemplateRequireImdsv2AspectProps {
        val builder = LaunchTemplateRequireImdsv2AspectPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Interface for the Spot market instance options provided in a LaunchTemplate.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * Expiration expiration;
     * LaunchTemplateSpotOptions launchTemplateSpotOptions = LaunchTemplateSpotOptions.builder()
     * .blockDuration(Duration.minutes(30))
     * .interruptionBehavior(SpotInstanceInterruption.STOP)
     * .maxPrice(123)
     * .requestType(SpotRequestType.ONE_TIME)
     * .validUntil(expiration)
     * .build();
     * ```
     */
    public inline fun launchTemplateSpotOptions(
        block: LaunchTemplateSpotOptionsDsl.() -> Unit = {}
    ): LaunchTemplateSpotOptions {
        val builder = LaunchTemplateSpotOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options when constructing UserData for Linux.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * LinuxUserDataOptions linuxUserDataOptions = LinuxUserDataOptions.builder()
     * .shebang("shebang")
     * .build();
     * ```
     */
    public inline fun linuxUserDataOptions(
        block: LinuxUserDataOptionsDsl.() -> Unit = {}
    ): LinuxUserDataOptions {
        val builder = LinuxUserDataOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for InitPackage.rpm/InitPackage.msi.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * InitServiceRestartHandle initServiceRestartHandle;
     * LocationPackageOptions locationPackageOptions = LocationPackageOptions.builder()
     * .key("key")
     * .serviceRestartHandles(List.of(initServiceRestartHandle))
     * .build();
     * ```
     */
    public inline fun locationPackageOptions(
        block: LocationPackageOptionsDsl.() -> Unit = {}
    ): LocationPackageOptions {
        val builder = LocationPackageOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A machine image whose AMI ID will be searched using DescribeImages.
     *
     * The most recent, available, launchable image matching the given filter criteria will be used.
     * Looking up AMIs may take a long time; specify as many filter criteria as possible to narrow
     * down the search.
     *
     * The AMI selected will be cached in `cdk.context.json` and the same value will be used on
     * future runs. To refresh the AMI lookup, you will have to evict the value from the cache using
     * the `cdk context` command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
     * more information.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * UserData userData;
     * LookupMachineImage lookupMachineImage = LookupMachineImage.Builder.create()
     * .name("name")
     * // the properties below are optional
     * .filters(Map.of(
     * "filtersKey", List.of("filters")))
     * .owners(List.of("owners"))
     * .userData(userData)
     * .windows(false)
     * .build();
     * ```
     */
    public inline fun lookupMachineImage(
        block: LookupMachineImageDsl.() -> Unit = {}
    ): LookupMachineImage {
        val builder = LookupMachineImageDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for looking up an image.
     *
     * Example:
     * ```
     * // Pick the right Amazon Linux edition. All arguments shown are optional
     * // and will default to these values when omitted.
     * IMachineImage amznLinux = MachineImage.latestAmazonLinux(AmazonLinuxImageProps.builder()
     * .generation(AmazonLinuxGeneration.AMAZON_LINUX)
     * .edition(AmazonLinuxEdition.STANDARD)
     * .virtualization(AmazonLinuxVirt.HVM)
     * .storage(AmazonLinuxStorage.GENERAL_PURPOSE)
     * .cpuType(AmazonLinuxCpuType.X86_64)
     * .build());
     * // Pick a Windows edition to use
     * IMachineImage windows =
     * MachineImage.latestWindows(WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_BASE);
     * // Read AMI id from SSM parameter store
     * IMachineImage ssm = MachineImage.fromSsmParameter("/my/ami",
     * SsmParameterImageOptions.builder().os(OperatingSystemType.LINUX).build());
     * // Look up the most recent image matching a set of AMI filters.
     * // In this case, look up the NAT instance AMI, by using a wildcard
     * // in the 'name' field:
     * IMachineImage natAmi = MachineImage.lookup(LookupMachineImageProps.builder()
     * .name("amzn-ami-vpc-nat-*")
     * .owners(List.of("amazon"))
     * .build());
     * // For other custom (Linux) images, instantiate a `GenericLinuxImage` with
     * // a map giving the AMI to in for each region:
     * IMachineImage linux = MachineImage.genericLinux(Map.of(
     * "us-east-1", "ami-97785bed",
     * "eu-west-1", "ami-12345678"));
     * // For other custom (Windows) images, instantiate a `GenericWindowsImage` with
     * // a map giving the AMI to in for each region:
     * IMachineImage genericWindows = MachineImage.genericWindows(Map.of(
     * "us-east-1", "ami-97785bed",
     * "eu-west-1", "ami-12345678"));
     * ```
     */
    public inline fun lookupMachineImageProps(
        block: LookupMachineImagePropsDsl.() -> Unit = {}
    ): LookupMachineImageProps {
        val builder = LookupMachineImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for a machine image.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * UserData userData;
     * MachineImageConfig machineImageConfig = MachineImageConfig.builder()
     * .imageId("imageId")
     * .osType(OperatingSystemType.LINUX)
     * .userData(userData)
     * .build();
     * ```
     */
    public inline fun machineImageConfig(
        block: MachineImageConfigDsl.() -> Unit = {}
    ): MachineImageConfig {
        val builder = MachineImageConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options when creating `MultipartBody`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * MultipartBodyOptions multipartBodyOptions = MultipartBodyOptions.builder()
     * .contentType("contentType")
     * // the properties below are optional
     * .body("body")
     * .transferEncoding("transferEncoding")
     * .build();
     * ```
     */
    public inline fun multipartBodyOptions(
        block: MultipartBodyOptionsDsl.() -> Unit = {}
    ): MultipartBodyOptions {
        val builder = MultipartBodyOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Mime multipart user data.
     *
     * This class represents MIME multipart user data, as described in.
     * [Specifying Multiple User Data Blocks Using a MIME Multi Part Archive](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/bootstrap_container_instance.html#multi-part_user_data)
     *
     * Example:
     * ```
     * UserData bootHookConf = UserData.forLinux();
     * bootHookConf.addCommands("cloud-init-per once docker_options echo
     * 'OPTIONS=\"${OPTIONS} --storage-opt dm.basesize=40G\"' &gt;&gt; /etc/sysconfig/docker");
     * UserData setupCommands = UserData.forLinux();
     * setupCommands.addCommands("sudo yum install awscli &amp;&amp; echo Packages installed らと &gt;
     * /var/tmp/setup");
     * MultipartUserData multipartUserData = new MultipartUserData();
     * // The docker has to be configured at early stage, so content type is overridden to boothook
     * multipartUserData.addPart(MultipartBody.fromUserData(bootHookConf, "text/cloud-boothook;
     * charset=\"us-ascii\""));
     * // Execute the rest of setup
     * multipartUserData.addPart(MultipartBody.fromUserData(setupCommands));
     * LaunchTemplate.Builder.create(this, "")
     * .userData(multipartUserData)
     * .blockDevices(List.of())
     * .build();
     * ```
     */
    public inline fun multipartUserData(
        block: MultipartUserDataDsl.() -> Unit = {}
    ): MultipartUserData {
        val builder = MultipartUserDataDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for creating `MultipartUserData`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * MultipartUserDataOptions multipartUserDataOptions = MultipartUserDataOptions.builder()
     * .partsSeparator("partsSeparator")
     * .build();
     * ```
     */
    public inline fun multipartUserDataOptions(
        block: MultipartUserDataOptionsDsl.() -> Unit = {}
    ): MultipartUserDataOptions {
        val builder = MultipartUserDataOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for InitPackage.yum/apt/rubyGem/python.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * InitServiceRestartHandle initServiceRestartHandle;
     * NamedPackageOptions namedPackageOptions = NamedPackageOptions.builder()
     * .serviceRestartHandles(List.of(initServiceRestartHandle))
     * .version(List.of("version"))
     * .build();
     * ```
     */
    public inline fun namedPackageOptions(
        block: NamedPackageOptionsDsl.() -> Unit = {}
    ): NamedPackageOptions {
        val builder = NamedPackageOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a NAT gateway.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * NatGatewayProps natGatewayProps = NatGatewayProps.builder()
     * .eipAllocationIds(List.of("eipAllocationIds"))
     * .build();
     * ```
     */
    public inline fun natGatewayProps(block: NatGatewayPropsDsl.() -> Unit = {}): NatGatewayProps {
        val builder = NatGatewayPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a NAT instance.
     *
     * Example:
     * ```
     * // Configure the `natGatewayProvider` when defining a Vpc
     * NatInstanceProvider natGatewayProvider = NatProvider.instance(NatInstanceProps.builder()
     * .instanceType(new InstanceType("t3.small"))
     * .build());
     * Vpc vpc = Vpc.Builder.create(this, "MyVpc")
     * .natGatewayProvider(natGatewayProvider)
     * // The 'natGateways' parameter now controls the number of NAT instances
     * .natGateways(2)
     * .build();
     * ```
     */
    public inline fun natInstanceProps(
        block: NatInstancePropsDsl.() -> Unit = {}
    ): NatInstanceProps {
        val builder = NatInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * NAT provider which uses NAT Instances.
     *
     * Example:
     * ```
     * // Configure the `natGatewayProvider` when defining a Vpc
     * NatInstanceProvider natGatewayProvider = NatProvider.instance(NatInstanceProps.builder()
     * .instanceType(new InstanceType("t3.small"))
     * .build());
     * Vpc vpc = Vpc.Builder.create(this, "MyVpc")
     * .natGatewayProvider(natGatewayProvider)
     * // The 'natGateways' parameter now controls the number of NAT instances
     * .natGateways(2)
     * .build();
     * ```
     */
    public inline fun natInstanceProvider(
        block: NatInstanceProviderDsl.() -> Unit = {}
    ): NatInstanceProvider {
        val builder = NatInstanceProviderDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a new custom network ACL.
     *
     * By default, will deny all inbound and outbound traffic unless entries are added explicitly
     * allowing it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Vpc vpc;
     * NetworkAcl networkAcl = NetworkAcl.Builder.create(this, "MyNetworkAcl")
     * .vpc(vpc)
     * // the properties below are optional
     * .networkAclName("networkAclName")
     * .subnetSelection(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun networkAcl(
        scope: Construct,
        id: String,
        block: NetworkAclDsl.() -> Unit = {},
    ): NetworkAcl {
        val builder = NetworkAclDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define an entry in a Network ACL table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AclCidr aclCidr;
     * AclTraffic aclTraffic;
     * NetworkAcl networkAcl;
     * NetworkAclEntry networkAclEntry = NetworkAclEntry.Builder.create(this, "MyNetworkAclEntry")
     * .cidr(aclCidr)
     * .networkAcl(networkAcl)
     * .ruleNumber(123)
     * .traffic(aclTraffic)
     * // the properties below are optional
     * .direction(TrafficDirection.EGRESS)
     * .networkAclEntryName("networkAclEntryName")
     * .ruleAction(Action.ALLOW)
     * .build();
     * ```
     */
    public inline fun networkAclEntry(
        scope: Construct,
        id: String,
        block: NetworkAclEntryDsl.() -> Unit = {},
    ): NetworkAclEntry {
        val builder = NetworkAclEntryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to create NetworkAclEntry.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * AclCidr aclCidr;
     * AclTraffic aclTraffic;
     * NetworkAcl networkAcl;
     * NetworkAclEntryProps networkAclEntryProps = NetworkAclEntryProps.builder()
     * .cidr(aclCidr)
     * .networkAcl(networkAcl)
     * .ruleNumber(123)
     * .traffic(aclTraffic)
     * // the properties below are optional
     * .direction(TrafficDirection.EGRESS)
     * .networkAclEntryName("networkAclEntryName")
     * .ruleAction(Action.ALLOW)
     * .build();
     * ```
     */
    public inline fun networkAclEntryProps(
        block: NetworkAclEntryPropsDsl.() -> Unit = {}
    ): NetworkAclEntryProps {
        val builder = NetworkAclEntryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to create NetworkAcl.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Vpc vpc;
     * NetworkAclProps networkAclProps = NetworkAclProps.builder()
     * .vpc(vpc)
     * // the properties below are optional
     * .networkAclName("networkAclName")
     * .subnetSelection(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun networkAclProps(block: NetworkAclPropsDsl.() -> Unit = {}): NetworkAclProps {
        val builder = NetworkAclPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a placement group.
     *
     * Placement groups give you fine-grained control over where your instances are provisioned.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PlacementGroup placementGroup = PlacementGroup.Builder.create(this, "MyPlacementGroup")
     * .partitions(123)
     * .placementGroupName("placementGroupName")
     * .spreadLevel(PlacementGroupSpreadLevel.HOST)
     * .strategy(PlacementGroupStrategy.CLUSTER)
     * .build();
     * ```
     */
    public inline fun placementGroup(
        scope: Construct,
        id: String,
        block: PlacementGroupDsl.() -> Unit = {},
    ): PlacementGroup {
        val builder = PlacementGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props for a PlacementGroup.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PlacementGroupProps placementGroupProps = PlacementGroupProps.builder()
     * .partitions(123)
     * .placementGroupName("placementGroupName")
     * .spreadLevel(PlacementGroupSpreadLevel.HOST)
     * .strategy(PlacementGroupStrategy.CLUSTER)
     * .build();
     * ```
     */
    public inline fun placementGroupProps(
        block: PlacementGroupPropsDsl.() -> Unit = {}
    ): PlacementGroupProps {
        val builder = PlacementGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Interface for classes that provide the connection-specification parts of a security group
     * rule.
     *
     * Example:
     * ```
     * InstanceType instanceType;
     * NatInstanceProvider provider = NatProvider.instance(NatInstanceProps.builder()
     * .instanceType(instanceType)
     * .defaultAllowedTraffic(NatTrafficDirection.OUTBOUND_ONLY)
     * .build());
     * Vpc.Builder.create(this, "TheVPC")
     * .natGatewayProvider(provider)
     * .build();
     * provider.connections.allowFrom(Peer.ipv4("1.2.3.4/8"), Port.tcp(80));
     * ```
     */
    public inline fun port(block: PortDsl.() -> Unit = {}): Port {
        val builder = PortDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to create a port range.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PortProps portProps = PortProps.builder()
     * .protocol(Protocol.ALL)
     * .stringRepresentation("stringRepresentation")
     * // the properties below are optional
     * .fromPort(123)
     * .toPort(123)
     * .build();
     * ```
     */
    public inline fun portProps(block: PortPropsDsl.() -> Unit = {}): PortProps {
        val builder = PortPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A managed prefix list.
     *
     * Example:
     * ```
     * PrefixList.Builder.create(this, "EmptyPrefixList")
     * .maxEntries(100)
     * .build();
     * ```
     */
    public inline fun prefixList(
        scope: Construct,
        id: String,
        block: PrefixListDsl.() -> Unit = {},
    ): PrefixList {
        val builder = PrefixListDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to add a prefix list.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PrefixListOptions prefixListOptions = PrefixListOptions.builder()
     * .maxEntries(123)
     * .build();
     * ```
     */
    public inline fun prefixListOptions(
        block: PrefixListOptionsDsl.() -> Unit = {}
    ): PrefixListOptions {
        val builder = PrefixListOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating a prefix list.
     *
     * Example:
     * ```
     * PrefixList.Builder.create(this, "EmptyPrefixList")
     * .maxEntries(100)
     * .build();
     * ```
     */
    public inline fun prefixListProps(block: PrefixListPropsDsl.() -> Unit = {}): PrefixListProps {
        val builder = PrefixListPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a private VPC subnet resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PrivateSubnet privateSubnet = PrivateSubnet.Builder.create(this, "MyPrivateSubnet")
     * .availabilityZone("availabilityZone")
     * .cidrBlock("cidrBlock")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .mapPublicIpOnLaunch(false)
     * .build();
     * ```
     */
    public inline fun privateSubnet(
        scope: Construct,
        id: String,
        block: PrivateSubnetDsl.() -> Unit = {},
    ): PrivateSubnet {
        val builder = PrivateSubnetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PrivateSubnetAttributes privateSubnetAttributes = PrivateSubnetAttributes.builder()
     * .subnetId("subnetId")
     * // the properties below are optional
     * .availabilityZone("availabilityZone")
     * .ipv4CidrBlock("ipv4CidrBlock")
     * .routeTableId("routeTableId")
     * .build();
     * ```
     */
    public inline fun privateSubnetAttributes(
        block: PrivateSubnetAttributesDsl.() -> Unit = {}
    ): PrivateSubnetAttributes {
        val builder = PrivateSubnetAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PrivateSubnetProps privateSubnetProps = PrivateSubnetProps.builder()
     * .availabilityZone("availabilityZone")
     * .cidrBlock("cidrBlock")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .mapPublicIpOnLaunch(false)
     * .build();
     * ```
     */
    public inline fun privateSubnetProps(
        block: PrivateSubnetPropsDsl.() -> Unit = {}
    ): PrivateSubnetProps {
        val builder = PrivateSubnetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a public VPC subnet resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PublicSubnet publicSubnet = PublicSubnet.Builder.create(this, "MyPublicSubnet")
     * .availabilityZone("availabilityZone")
     * .cidrBlock("cidrBlock")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .mapPublicIpOnLaunch(false)
     * .build();
     * ```
     */
    public inline fun publicSubnet(
        scope: Construct,
        id: String,
        block: PublicSubnetDsl.() -> Unit = {},
    ): PublicSubnet {
        val builder = PublicSubnetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PublicSubnetAttributes publicSubnetAttributes = PublicSubnetAttributes.builder()
     * .subnetId("subnetId")
     * // the properties below are optional
     * .availabilityZone("availabilityZone")
     * .ipv4CidrBlock("ipv4CidrBlock")
     * .routeTableId("routeTableId")
     * .build();
     * ```
     */
    public inline fun publicSubnetAttributes(
        block: PublicSubnetAttributesDsl.() -> Unit = {}
    ): PublicSubnetAttributes {
        val builder = PublicSubnetAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * PublicSubnetProps publicSubnetProps = PublicSubnetProps.builder()
     * .availabilityZone("availabilityZone")
     * .cidrBlock("cidrBlock")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .mapPublicIpOnLaunch(false)
     * .build();
     * ```
     */
    public inline fun publicSubnetProps(
        block: PublicSubnetPropsDsl.() -> Unit = {}
    ): PublicSubnetProps {
        val builder = PublicSubnetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Subnet requested for allocation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * RequestedSubnet requestedSubnet = RequestedSubnet.builder()
     * .availabilityZone("availabilityZone")
     * .configuration(SubnetConfiguration.builder()
     * .name("name")
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * // the properties below are optional
     * .cidrMask(123)
     * .mapPublicIpOnLaunch(false)
     * .reserved(false)
     * .build())
     * .subnetConstructId("subnetConstructId")
     * .build();
     * ```
     */
    public inline fun requestedSubnet(block: RequestedSubnetDsl.() -> Unit = {}): RequestedSubnet {
        val builder = RequestedSubnetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Select the image based on a given SSM parameter at instance launch time.
     *
     * This Machine Image comes with an imageId as `resolve:ssm:parameter-name` or
     * `resolve:ssm:parameter-name:version` format as described in the document:
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * UserData userData;
     * ResolveSsmParameterAtLaunchImage resolveSsmParameterAtLaunchImage =
     * ResolveSsmParameterAtLaunchImage.Builder.create("parameterName")
     * .cachedInContext(false)
     * .os(OperatingSystemType.LINUX)
     * .parameterVersion("parameterVersion")
     * .userData(userData)
     * .build();
     * ```
     *
     * @see <a
     *   href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/using-systems-manager-parameters.html
     *   The AMI ID would be selected at instance launch
     *   time.">https://docs.aws.amazon.com/autoscaling/ec2/userguide/using-systems-manager-parameters.html
     *   The AMI ID would be selected at instance launch time.</a>
     */
    public inline fun resolveSsmParameterAtLaunchImage(
        parameterName: String,
        block: ResolveSsmParameterAtLaunchImageDsl.() -> Unit = {}
    ): ResolveSsmParameterAtLaunchImage {
        val builder = ResolveSsmParameterAtLaunchImageDsl(parameterName)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The scope and id in which a given SecurityGroup rule should be defined.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * SecurityGroup securityGroup;
     * RuleScope ruleScope = RuleScope.builder()
     * .id("id")
     * .scope(securityGroup)
     * .build();
     * ```
     */
    public inline fun ruleScope(block: RuleScopeDsl.() -> Unit = {}): RuleScope {
        val builder = RuleScopeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for writing logs to a S3 destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * S3DestinationOptions s3DestinationOptions = S3DestinationOptions.builder()
     * .fileFormat(FlowLogFileFormat.PLAIN_TEXT)
     * .hiveCompatiblePartitions(false)
     * .perHourPartition(false)
     * .build();
     * ```
     */
    public inline fun s3DestinationOptions(
        block: S3DestinationOptionsDsl.() -> Unit = {}
    ): S3DestinationOptions {
        val builder = S3DestinationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options when downloading files from S3.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.assets.Asset;
     * Instance instance;
     * Asset asset = Asset.Builder.create(this, "Asset")
     * .path("./configure.sh")
     * .build();
     * String localPath = instance.userData.addS3DownloadCommand(S3DownloadOptions.builder()
     * .bucket(asset.getBucket())
     * .bucketKey(asset.getS3ObjectKey())
     * .region("us-east-1")
     * .build());
     * instance.userData.addExecuteFileCommand(ExecuteFileOptions.builder()
     * .filePath(localPath)
     * .arguments("--verbose -y")
     * .build());
     * asset.grantRead(instance.getRole());
     * ```
     */
    public inline fun s3DownloadOptions(
        block: S3DownloadOptionsDsl.() -> Unit = {}
    ): S3DownloadOptions {
        val builder = S3DownloadOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an Amazon EC2 security group within a VPC.
     *
     * Security Groups act like a firewall with a set of rules, and are associated with any AWS
     * resource that has or creates Elastic Network Interfaces (ENIs). A typical example of a
     * resource that has a security group is an Instance (or Auto Scaling Group of instances)
     *
     * If you are defining new infrastructure in CDK, there is a good chance you won't have to
     * interact with this class at all. Like IAM Roles, Security Groups need to exist to control
     * access between AWS resources, but CDK will automatically generate and populate them with
     * least-privilege permissions for you so you can concentrate on your business logic.
     *
     * All Constructs that require Security Groups will create one for you if you don't specify one
     * at construction. After construction, you can selectively allow connections to and between
     * constructs via--for example-- the `instance.connections` object. Think of it as "allowing
     * connections to your instance", rather than "adding ingress rules a security group". See the
     * <a
     * href="https://docs.aws.amazon.com/cdk/api/latest/docs/aws-cdk-lib.aws_ec2-readme.html#allowing-connections">Allowing
     * Connections</a> section in the library documentation for examples.
     *
     * Direct manipulation of the Security Group through `addIngressRule` and `addEgressRule` is
     * possible, but mutation through the `.connections` object is recommended. If you peer two
     * constructs with security groups this way, appropriate rules will be created in both.
     *
     * If you have an existing security group you want to use in your CDK application, you would
     * import it like this:
     * ```
     * ISecurityGroup securityGroup = SecurityGroup.fromSecurityGroupId(this, "SG", "sg-12345",
     * SecurityGroupImportOptions.builder()
     * .mutable(false)
     * .build());
     * ```
     *
     * Example:
     * ```
     * SecurityGroup mySecurityGroupWithoutInlineRules = SecurityGroup.Builder.create(this,
     * "SecurityGroup")
     * .vpc(vpc)
     * .description("Allow ssh access to ec2 instances")
     * .allowAllOutbound(true)
     * .disableInlineRules(true)
     * .build();
     * //This will add the rule as an external cloud formation construct
     * mySecurityGroupWithoutInlineRules.addIngressRule(Peer.anyIpv4(), Port.tcp(22), "allow ssh
     * access from the world");
     * ```
     */
    public inline fun securityGroup(
        scope: Construct,
        id: String,
        block: SecurityGroupDsl.() -> Unit = {},
    ): SecurityGroup {
        val builder = SecurityGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Additional options for imported security groups.
     *
     * Example:
     * ```
     * ISecurityGroup securityGroup = SecurityGroup.fromSecurityGroupId(this, "SG", "sg-12345",
     * SecurityGroupImportOptions.builder()
     * .mutable(false)
     * .build());
     * ```
     */
    public inline fun securityGroupImportOptions(
        block: SecurityGroupImportOptionsDsl.() -> Unit = {}
    ): SecurityGroupImportOptions {
        val builder = SecurityGroupImportOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Vpc vpc;
     * SecurityGroup sg1 = SecurityGroup.Builder.create(this, "sg1")
     * .vpc(vpc)
     * .build();
     * SecurityGroup sg2 = SecurityGroup.Builder.create(this, "sg2")
     * .vpc(vpc)
     * .build();
     * LaunchTemplate launchTemplate = LaunchTemplate.Builder.create(this, "LaunchTemplate")
     * .machineImage(MachineImage.latestAmazonLinux2023())
     * .securityGroup(sg1)
     * .build();
     * launchTemplate.addSecurityGroup(sg2);
     * ```
     */
    public inline fun securityGroupProps(
        block: SecurityGroupPropsDsl.() -> Unit = {}
    ): SecurityGroupProps {
        val builder = SecurityGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Result of selecting a subset of subnets from a VPC.
     *
     * Example:
     * ```
     * Vpc vpc = Vpc.Builder.create(this, "TheVPC")
     * .ipAddresses(IpAddresses.cidr("10.0.0.0/16"))
     * .build();
     * // Iterate the private subnets
     * SelectedSubnets selection = vpc.selectSubnets(SubnetSelection.builder()
     * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
     * .build());
     * for (Object subnet : selection.getSubnets()) {
     * }
     * ```
     */
    public inline fun selectedSubnets(block: SelectedSubnetsDsl.() -> Unit = {}): SelectedSubnets {
        val builder = SelectedSubnetsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for GenericSsmParameterImage.
     *
     * Example:
     * ```
     * // Pick the right Amazon Linux edition. All arguments shown are optional
     * // and will default to these values when omitted.
     * IMachineImage amznLinux = MachineImage.latestAmazonLinux(AmazonLinuxImageProps.builder()
     * .generation(AmazonLinuxGeneration.AMAZON_LINUX)
     * .edition(AmazonLinuxEdition.STANDARD)
     * .virtualization(AmazonLinuxVirt.HVM)
     * .storage(AmazonLinuxStorage.GENERAL_PURPOSE)
     * .cpuType(AmazonLinuxCpuType.X86_64)
     * .build());
     * // Pick a Windows edition to use
     * IMachineImage windows =
     * MachineImage.latestWindows(WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_BASE);
     * // Read AMI id from SSM parameter store
     * IMachineImage ssm = MachineImage.fromSsmParameter("/my/ami",
     * SsmParameterImageOptions.builder().os(OperatingSystemType.LINUX).build());
     * // Look up the most recent image matching a set of AMI filters.
     * // In this case, look up the NAT instance AMI, by using a wildcard
     * // in the 'name' field:
     * IMachineImage natAmi = MachineImage.lookup(LookupMachineImageProps.builder()
     * .name("amzn-ami-vpc-nat-*")
     * .owners(List.of("amazon"))
     * .build());
     * // For other custom (Linux) images, instantiate a `GenericLinuxImage` with
     * // a map giving the AMI to in for each region:
     * IMachineImage linux = MachineImage.genericLinux(Map.of(
     * "us-east-1", "ami-97785bed",
     * "eu-west-1", "ami-12345678"));
     * // For other custom (Windows) images, instantiate a `GenericWindowsImage` with
     * // a map giving the AMI to in for each region:
     * IMachineImage genericWindows = MachineImage.genericWindows(Map.of(
     * "us-east-1", "ami-97785bed",
     * "eu-west-1", "ami-12345678"));
     * ```
     */
    public inline fun ssmParameterImageOptions(
        block: SsmParameterImageOptionsDsl.() -> Unit = {}
    ): SsmParameterImageOptions {
        val builder = SsmParameterImageOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a new VPC subnet resource.
     *
     * Example:
     * ```
     * Cluster cluster;
     * ApplicationLoadBalancedFargateService loadBalancedFargateService =
     * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .desiredCount(1)
     * .cpu(512)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .taskSubnets(SubnetSelection.builder()
     * .subnets(List.of(Subnet.fromSubnetId(this, "subnet", "VpcISOLATEDSubnet1Subnet80F07FA0")))
     * .build())
     * .build();
     * ```
     */
    public inline fun subnet(
        scope: Construct,
        id: String,
        block: SubnetDsl.() -> Unit = {},
    ): Subnet {
        val builder = SubnetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // Supply all properties
     * ISubnet subnet1 = Subnet.fromSubnetAttributes(this, "SubnetFromAttributes",
     * SubnetAttributes.builder()
     * .subnetId("s-1234")
     * .availabilityZone("pub-az-4465")
     * .routeTableId("rt-145")
     * .build());
     * // Supply only subnet id
     * ISubnet subnet2 = Subnet.fromSubnetId(this, "SubnetFromId", "s-1234");
     * ```
     */
    public inline fun subnetAttributes(
        block: SubnetAttributesDsl.() -> Unit = {}
    ): SubnetAttributes {
        val builder = SubnetAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specify configuration parameters for a single subnet group in a VPC.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * SubnetConfiguration subnetConfiguration = SubnetConfiguration.builder()
     * .name("name")
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * // the properties below are optional
     * .cidrMask(123)
     * .mapPublicIpOnLaunch(false)
     * .reserved(false)
     * .build();
     * ```
     */
    public inline fun subnetConfiguration(
        block: SubnetConfigurationDsl.() -> Unit = {}
    ): SubnetConfiguration {
        val builder = SubnetConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Cidr Allocated Subnets.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * SubnetIpamOptions subnetIpamOptions = SubnetIpamOptions.builder()
     * .allocatedSubnets(List.of(AllocatedSubnet.builder()
     * .cidr("cidr")
     * .build()))
     * .build();
     * ```
     */
    public inline fun subnetIpamOptions(
        block: SubnetIpamOptionsDsl.() -> Unit = {}
    ): SubnetIpamOptions {
        val builder = SubnetIpamOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * NetworkAcl networkAcl;
     * Subnet subnet;
     * SubnetNetworkAclAssociation subnetNetworkAclAssociation =
     * SubnetNetworkAclAssociation.Builder.create(this, "MySubnetNetworkAclAssociation")
     * .networkAcl(networkAcl)
     * .subnet(subnet)
     * // the properties below are optional
     * .subnetNetworkAclAssociationName("subnetNetworkAclAssociationName")
     * .build();
     * ```
     */
    public inline fun subnetNetworkAclAssociation(
        scope: Construct,
        id: String,
        block: SubnetNetworkAclAssociationDsl.() -> Unit = {},
    ): SubnetNetworkAclAssociation {
        val builder = SubnetNetworkAclAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to create a SubnetNetworkAclAssociation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * NetworkAcl networkAcl;
     * Subnet subnet;
     * SubnetNetworkAclAssociationProps subnetNetworkAclAssociationProps =
     * SubnetNetworkAclAssociationProps.builder()
     * .networkAcl(networkAcl)
     * .subnet(subnet)
     * // the properties below are optional
     * .subnetNetworkAclAssociationName("subnetNetworkAclAssociationName")
     * .build();
     * ```
     */
    public inline fun subnetNetworkAclAssociationProps(
        block: SubnetNetworkAclAssociationPropsDsl.() -> Unit = {}
    ): SubnetNetworkAclAssociationProps {
        val builder = SubnetNetworkAclAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specify configuration parameters for a VPC subnet.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * SubnetProps subnetProps = SubnetProps.builder()
     * .availabilityZone("availabilityZone")
     * .cidrBlock("cidrBlock")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .mapPublicIpOnLaunch(false)
     * .build();
     * ```
     */
    public inline fun subnetProps(block: SubnetPropsDsl.() -> Unit = {}): SubnetProps {
        val builder = SubnetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Customize subnets that are selected for placement of ENIs.
     *
     * Constructs that allow customization of VPC placement use parameters of this type to provide
     * placement settings.
     *
     * By default, the instances are placed in the private subnets.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
     * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder()
     * .version(AuroraMysqlEngineVersion.VER_3_03_0)
     * .build()))
     * .instances(2)
     * .instanceProps(InstanceProps.builder()
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.SMALL))
     * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
     * .vpc(vpc)
     * .build())
     * .build();
     * ```
     */
    public inline fun subnetSelection(block: SubnetSelectionDsl.() -> Unit = {}): SubnetSelection {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for creating a SystemD configuration file.
     *
     * Example:
     * ```
     * Vpc vpc;
     * InstanceType instanceType;
     * Instance.Builder.create(this, "Instance")
     * .vpc(vpc)
     * .instanceType(instanceType)
     * .machineImage(MachineImage.latestAmazonLinux2023())
     * .init(CloudFormationInit.fromElements(InitService.systemdConfigFile("simpleserver",
     * SystemdConfigFileOptions.builder()
     * .command("/usr/bin/python3 -m http.server 8080")
     * .cwd("/var/www/html")
     * .build()), InitService.enable("simpleserver", InitServiceOptions.builder()
     * .serviceManager(ServiceManager.SYSTEMD)
     * .build()), InitFile.fromString("/var/www/html/index.html", "Hello! It's working!")))
     * .build();
     * ```
     */
    public inline fun systemdConfigFileOptions(
        block: SystemdConfigFileOptionsDsl.() -> Unit = {}
    ): SystemdConfigFileOptions {
        val builder = SystemdConfigFileOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new EBS Volume in AWS EC2.
     *
     * Example:
     * ```
     * Instance instance;
     * Role role;
     * Volume volume = Volume.Builder.create(this, "Volume")
     * .availabilityZone("us-west-2a")
     * .size(Size.gibibytes(500))
     * .encrypted(true)
     * .build();
     * volume.grantAttachVolume(role, List.of(instance));
     * ```
     */
    public inline fun volume(
        scope: Construct,
        id: String,
        block: VolumeDsl.() -> Unit = {},
    ): Volume {
        val builder = VolumeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes required to import an existing EBS Volume into the Stack.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.kms.*;
     * Key key;
     * VolumeAttributes volumeAttributes = VolumeAttributes.builder()
     * .availabilityZone("availabilityZone")
     * .volumeId("volumeId")
     * // the properties below are optional
     * .encryptionKey(key)
     * .build();
     * ```
     */
    public inline fun volumeAttributes(
        block: VolumeAttributesDsl.() -> Unit = {}
    ): VolumeAttributes {
        val builder = VolumeAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of an EBS Volume.
     *
     * Example:
     * ```
     * Instance instance;
     * Role role;
     * Volume volume = Volume.Builder.create(this, "Volume")
     * .availabilityZone("us-west-2a")
     * .size(Size.gibibytes(500))
     * .encrypted(true)
     * .build();
     * volume.grantAttachVolume(role, List.of(instance));
     * ```
     */
    public inline fun volumeProps(block: VolumePropsDsl.() -> Unit = {}): VolumeProps {
        val builder = VolumePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define an AWS Virtual Private Cloud.
     *
     * See the package-level documentation of this package for an overview of the various dimensions
     * in which you can configure your VPC.
     *
     * For example:
     * ```
     * Vpc vpc = Vpc.Builder.create(this, "TheVPC")
     * .ipAddresses(IpAddresses.cidr("10.0.0.0/16"))
     * .build();
     * // Iterate the private subnets
     * SelectedSubnets selection = vpc.selectSubnets(SubnetSelection.builder()
     * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
     * .build());
     * for (Object subnet : selection.getSubnets()) {
     * }
     * ```
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ec2.*;
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
    public inline fun vpc(
        scope: Construct,
        id: String,
        block: VpcDsl.() -> Unit = {},
    ): Vpc {
        val builder = VpcDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties that reference an external Vpc.
     *
     * Example:
     * ```
     * IVpc vpc = Vpc.fromVpcAttributes(this, "VPC", VpcAttributes.builder()
     * .vpcId("vpc-1234")
     * .availabilityZones(List.of("us-east-1a", "us-east-1b"))
     * // Either pass literals for all IDs
     * .publicSubnetIds(List.of("s-12345", "s-67890"))
     * // OR: import a list of known length
     * .privateSubnetIds(Fn.importListValue("PrivateSubnetIds", 2))
     * // OR: split an imported string to a list of known length
     * .isolatedSubnetIds(Fn.split(",", StringParameter.valueForStringParameter(this, "MyParameter"),
     * 2))
     * .build());
     * ```
     */
    public inline fun vpcAttributes(block: VpcAttributesDsl.() -> Unit = {}): VpcAttributes {
        val builder = VpcAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A VPC endpoint service.
     *
     * Example:
     * ```
     * NetworkLoadBalancer networkLoadBalancer1;
     * NetworkLoadBalancer networkLoadBalancer2;
     * VpcEndpointService.Builder.create(this, "EndpointService")
     * .vpcEndpointServiceLoadBalancers(List.of(networkLoadBalancer1, networkLoadBalancer2))
     * .acceptanceRequired(true)
     * .allowedPrincipals(List.of(new ArnPrincipal("arn:aws:iam::123456789012:root")))
     * .build();
     * ```
     */
    public inline fun vpcEndpointService(
        scope: Construct,
        id: String,
        block: VpcEndpointServiceDsl.() -> Unit = {},
    ): VpcEndpointService {
        val builder = VpcEndpointServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a VpcEndpointService.
     *
     * Example:
     * ```
     * NetworkLoadBalancer networkLoadBalancer1;
     * NetworkLoadBalancer networkLoadBalancer2;
     * VpcEndpointService.Builder.create(this, "EndpointService")
     * .vpcEndpointServiceLoadBalancers(List.of(networkLoadBalancer1, networkLoadBalancer2))
     * .acceptanceRequired(true)
     * .allowedPrincipals(List.of(new ArnPrincipal("arn:aws:iam::123456789012:root")))
     * .build();
     * ```
     */
    public inline fun vpcEndpointServiceProps(
        block: VpcEndpointServicePropsDsl.() -> Unit = {}
    ): VpcEndpointServiceProps {
        val builder = VpcEndpointServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Cidr Allocated Vpc.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * VpcIpamOptions vpcIpamOptions = VpcIpamOptions.builder()
     * .cidrBlock("cidrBlock")
     * .ipv4IpamPoolId("ipv4IpamPoolId")
     * .ipv4NetmaskLength(123)
     * .build();
     * ```
     */
    public inline fun vpcIpamOptions(block: VpcIpamOptionsDsl.() -> Unit = {}): VpcIpamOptions {
        val builder = VpcIpamOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for looking up an existing VPC.
     *
     * The combination of properties must specify filter down to exactly one non-default VPC,
     * otherwise an error is raised.
     *
     * Example:
     * ```
     * // create a cloud9 ec2 environment in a new VPC
     * Vpc vpc = Vpc.Builder.create(this, "VPC").maxAzs(3).build();
     * Ec2Environment.Builder.create(this,
     * "Cloud9Env").vpc(vpc).imageId(ImageId.AMAZON_LINUX_2).build();
     * // or create the cloud9 environment in the default VPC with specific instanceType
     * IVpc defaultVpc = Vpc.fromLookup(this, "DefaultVPC",
     * VpcLookupOptions.builder().isDefault(true).build());
     * Ec2Environment.Builder.create(this, "Cloud9Env2")
     * .vpc(defaultVpc)
     * .instanceType(new InstanceType("t3.large"))
     * .imageId(ImageId.AMAZON_LINUX_2)
     * .build();
     * // or specify in a different subnetSelection
     * Ec2Environment c9env = Ec2Environment.Builder.create(this, "Cloud9Env3")
     * .vpc(vpc)
     * .subnetSelection(SubnetSelection.builder()
     * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
     * .build())
     * .imageId(ImageId.AMAZON_LINUX_2)
     * .build();
     * // print the Cloud9 IDE URL in the output
     * // print the Cloud9 IDE URL in the output
     * CfnOutput.Builder.create(this, "URL").value(c9env.getIdeUrl()).build();
     * ```
     */
    public inline fun vpcLookupOptions(
        block: VpcLookupOptionsDsl.() -> Unit = {}
    ): VpcLookupOptions {
        val builder = VpcLookupOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for Vpc.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ec2.*;
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
    public inline fun vpcProps(block: VpcPropsDsl.() -> Unit = {}): VpcProps {
        val builder = VpcPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a VPN Connection.
     *
     * Example:
     * ```
     * // Across all tunnels in the account/region
     * Metric allDataOut = VpnConnection.metricAllTunnelDataOut();
     * // For a specific vpn connection
     * VpnConnection vpnConnection = vpc.addVpnConnection("Dynamic", VpnConnectionOptions.builder()
     * .ip("1.2.3.4")
     * .build());
     * Metric state = vpnConnection.metricTunnelState();
     * ```
     */
    public inline fun vpnConnection(
        scope: Construct,
        id: String,
        block: VpnConnectionDsl.() -> Unit = {},
    ): VpnConnection {
        val builder = VpnConnectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes of an imported VpnConnection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * VpnConnectionAttributes vpnConnectionAttributes = VpnConnectionAttributes.builder()
     * .customerGatewayAsn(123)
     * .customerGatewayId("customerGatewayId")
     * .customerGatewayIp("customerGatewayIp")
     * .vpnId("vpnId")
     * .build();
     * ```
     */
    public inline fun vpnConnectionAttributes(
        block: VpnConnectionAttributesDsl.() -> Unit = {}
    ): VpnConnectionAttributes {
        val builder = VpnConnectionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Vpc vpc = Vpc.Builder.create(this, "MyVpc")
     * .vpnConnections(Map.of(
     * "dynamic", VpnConnectionOptions.builder() // Dynamic routing (BGP)
     * .ip("1.2.3.4").build(),
     * "static", VpnConnectionOptions.builder() // Static routing
     * .ip("4.5.6.7")
     * .staticRoutes(List.of("192.168.10.0/24", "192.168.20.0/24")).build()))
     * .build();
     * ```
     */
    public inline fun vpnConnectionOptions(
        block: VpnConnectionOptionsDsl.() -> Unit = {}
    ): VpnConnectionOptions {
        val builder = VpnConnectionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * SecretValue secretValue;
     * Vpc vpc;
     * VpnConnectionProps vpnConnectionProps = VpnConnectionProps.builder()
     * .ip("ip")
     * .vpc(vpc)
     * // the properties below are optional
     * .asn(123)
     * .staticRoutes(List.of("staticRoutes"))
     * .tunnelOptions(List.of(VpnTunnelOption.builder()
     * .preSharedKey("preSharedKey")
     * .preSharedKeySecret(secretValue)
     * .tunnelInsideCidr("tunnelInsideCidr")
     * .build()))
     * .build();
     * ```
     */
    public inline fun vpnConnectionProps(
        block: VpnConnectionPropsDsl.() -> Unit = {}
    ): VpnConnectionProps {
        val builder = VpnConnectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The VPN Gateway that shall be added to the VPC.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * VpnGateway vpnGateway = VpnGateway.Builder.create(this, "MyVpnGateway")
     * .type("type")
     * // the properties below are optional
     * .amazonSideAsn(123)
     * .build();
     * ```
     */
    public inline fun vpnGateway(
        scope: Construct,
        id: String,
        block: VpnGatewayDsl.() -> Unit = {},
    ): VpnGateway {
        val builder = VpnGatewayDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The VpnGateway Properties.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * VpnGatewayProps vpnGatewayProps = VpnGatewayProps.builder()
     * .type("type")
     * // the properties below are optional
     * .amazonSideAsn(123)
     * .build();
     * ```
     */
    public inline fun vpnGatewayProps(block: VpnGatewayPropsDsl.() -> Unit = {}): VpnGatewayProps {
        val builder = VpnGatewayPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * SecretValue secretValue;
     * VpnTunnelOption vpnTunnelOption = VpnTunnelOption.builder()
     * .preSharedKey("preSharedKey")
     * .preSharedKeySecret(secretValue)
     * .tunnelInsideCidr("tunnelInsideCidr")
     * .build();
     * ```
     */
    public inline fun vpnTunnelOption(block: VpnTunnelOptionDsl.() -> Unit = {}): VpnTunnelOption {
        val builder = VpnTunnelOptionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Select the latest version of the indicated Windows version.
     *
     * This Machine Image automatically updates to the latest version on every deployment. Be aware
     * this will cause your instances to be replaced when a new version of the image becomes
     * available. Do not store stateful information on the instance if you are using this image.
     *
     * The AMI ID is selected using the values published to the SSM parameter store.
     *
     * https://aws.amazon.com/blogs/mt/query-for-the-latest-windows-ami-using-systems-manager-parameter-store/
     *
     * Example:
     * ```
     * // Pick a Windows edition to use
     * WindowsImage windows = new WindowsImage(WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_BASE);
     * // Pick the right Amazon Linux edition. All arguments shown are optional
     * // and will default to these values when omitted.
     * AmazonLinuxImage amznLinux = AmazonLinuxImage.Builder.create()
     * .generation(AmazonLinuxGeneration.AMAZON_LINUX)
     * .edition(AmazonLinuxEdition.STANDARD)
     * .virtualization(AmazonLinuxVirt.HVM)
     * .storage(AmazonLinuxStorage.GENERAL_PURPOSE)
     * .build();
     * // For other custom (Linux) images, instantiate a `GenericLinuxImage` with
     * // a map giving the AMI to in for each region:
     * GenericLinuxImage linux = new GenericLinuxImage(Map.of(
     * "us-east-1", "ami-97785bed",
     * "eu-west-1", "ami-12345678"));
     * ```
     */
    public inline fun windowsImage(
        version: WindowsVersion,
        block: WindowsImageDsl.() -> Unit = {}
    ): WindowsImage {
        val builder = WindowsImageDsl(version)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration options for WindowsImage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * UserData userData;
     * WindowsImageProps windowsImageProps = WindowsImageProps.builder()
     * .userData(userData)
     * .build();
     * ```
     */
    public inline fun windowsImageProps(
        block: WindowsImagePropsDsl.() -> Unit = {}
    ): WindowsImageProps {
        val builder = WindowsImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options when constructing UserData for Windows.
     *
     * Example:
     * ```
     * UserData windowsUserData =
     * UserData.forWindows(WindowsUserDataOptions.builder().persist(true).build());
     * ```
     */
    public inline fun windowsUserDataOptions(
        block: WindowsUserDataOptionsDsl.() -> Unit = {}
    ): WindowsUserDataOptions {
        val builder = WindowsUserDataOptionsDsl()
        builder.apply(block)
        return builder.build()
    }
}
