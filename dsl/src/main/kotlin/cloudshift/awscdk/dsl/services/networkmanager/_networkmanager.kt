@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnConnectAttachment
import software.amazon.awscdk.services.networkmanager.CfnConnectAttachmentProps
import software.amazon.awscdk.services.networkmanager.CfnConnectPeer
import software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps
import software.amazon.awscdk.services.networkmanager.CfnCoreNetwork
import software.amazon.awscdk.services.networkmanager.CfnCoreNetworkProps
import software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation
import software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps
import software.amazon.awscdk.services.networkmanager.CfnDevice
import software.amazon.awscdk.services.networkmanager.CfnDeviceProps
import software.amazon.awscdk.services.networkmanager.CfnGlobalNetwork
import software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps
import software.amazon.awscdk.services.networkmanager.CfnLink
import software.amazon.awscdk.services.networkmanager.CfnLinkAssociation
import software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps
import software.amazon.awscdk.services.networkmanager.CfnLinkProps
import software.amazon.awscdk.services.networkmanager.CfnSite
import software.amazon.awscdk.services.networkmanager.CfnSiteProps
import software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment
import software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachment
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps
import software.constructs.Construct

public object networkmanager {
  public inline fun cfnConnectAttachment(
    scope: Construct,
    id: String,
    block: CfnConnectAttachmentDsl.() -> Unit = {},
  ): CfnConnectAttachment {
    val builder = CfnConnectAttachmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectAttachmentConnectAttachmentOptionsProperty(block: CfnConnectAttachmentConnectAttachmentOptionsPropertyDsl.() -> Unit
      = {}): CfnConnectAttachment.ConnectAttachmentOptionsProperty {
    val builder = CfnConnectAttachmentConnectAttachmentOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectAttachmentProposedSegmentChangeProperty(block: CfnConnectAttachmentProposedSegmentChangePropertyDsl.() -> Unit
      = {}): CfnConnectAttachment.ProposedSegmentChangeProperty {
    val builder = CfnConnectAttachmentProposedSegmentChangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConnectAttachmentProps(block: CfnConnectAttachmentPropsDsl.() -> Unit = {}):
      CfnConnectAttachmentProps {
    val builder = CfnConnectAttachmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConnectPeer(
    scope: Construct,
    id: String,
    block: CfnConnectPeerDsl.() -> Unit = {},
  ): CfnConnectPeer {
    val builder = CfnConnectPeerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectPeerBgpOptionsProperty(block: CfnConnectPeerBgpOptionsPropertyDsl.() -> Unit =
      {}): CfnConnectPeer.BgpOptionsProperty {
    val builder = CfnConnectPeerBgpOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectPeerConnectPeerBgpConfigurationProperty(block: CfnConnectPeerConnectPeerBgpConfigurationPropertyDsl.() -> Unit
      = {}): CfnConnectPeer.ConnectPeerBgpConfigurationProperty {
    val builder = CfnConnectPeerConnectPeerBgpConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectPeerConnectPeerConfigurationProperty(block: CfnConnectPeerConnectPeerConfigurationPropertyDsl.() -> Unit
      = {}): CfnConnectPeer.ConnectPeerConfigurationProperty {
    val builder = CfnConnectPeerConnectPeerConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConnectPeerProps(block: CfnConnectPeerPropsDsl.() -> Unit = {}):
      CfnConnectPeerProps {
    val builder = CfnConnectPeerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCoreNetwork(
    scope: Construct,
    id: String,
    block: CfnCoreNetworkDsl.() -> Unit = {},
  ): CfnCoreNetwork {
    val builder = CfnCoreNetworkDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCoreNetworkCoreNetworkEdgeProperty(block: CfnCoreNetworkCoreNetworkEdgePropertyDsl.() -> Unit
      = {}): CfnCoreNetwork.CoreNetworkEdgeProperty {
    val builder = CfnCoreNetworkCoreNetworkEdgePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCoreNetworkCoreNetworkSegmentProperty(block: CfnCoreNetworkCoreNetworkSegmentPropertyDsl.() -> Unit
      = {}): CfnCoreNetwork.CoreNetworkSegmentProperty {
    val builder = CfnCoreNetworkCoreNetworkSegmentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCoreNetworkProps(block: CfnCoreNetworkPropsDsl.() -> Unit = {}):
      CfnCoreNetworkProps {
    val builder = CfnCoreNetworkPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCustomerGatewayAssociation(
    scope: Construct,
    id: String,
    block: CfnCustomerGatewayAssociationDsl.() -> Unit = {},
  ): CfnCustomerGatewayAssociation {
    val builder = CfnCustomerGatewayAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCustomerGatewayAssociationProps(block: CfnCustomerGatewayAssociationPropsDsl.() -> Unit
      = {}): CfnCustomerGatewayAssociationProps {
    val builder = CfnCustomerGatewayAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDevice(
    scope: Construct,
    id: String,
    block: CfnDeviceDsl.() -> Unit = {},
  ): CfnDevice {
    val builder = CfnDeviceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeviceAWSLocationProperty(block: CfnDeviceAWSLocationPropertyDsl.() -> Unit =
      {}): CfnDevice.AWSLocationProperty {
    val builder = CfnDeviceAWSLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeviceLocationProperty(block: CfnDeviceLocationPropertyDsl.() -> Unit = {}):
      CfnDevice.LocationProperty {
    val builder = CfnDeviceLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeviceProps(block: CfnDevicePropsDsl.() -> Unit = {}): CfnDeviceProps {
    val builder = CfnDevicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGlobalNetwork(
    scope: Construct,
    id: String,
    block: CfnGlobalNetworkDsl.() -> Unit = {},
  ): CfnGlobalNetwork {
    val builder = CfnGlobalNetworkDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGlobalNetworkProps(block: CfnGlobalNetworkPropsDsl.() -> Unit = {}):
      CfnGlobalNetworkProps {
    val builder = CfnGlobalNetworkPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLink(
    scope: Construct,
    id: String,
    block: CfnLinkDsl.() -> Unit = {},
  ): CfnLink {
    val builder = CfnLinkDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLinkAssociation(
    scope: Construct,
    id: String,
    block: CfnLinkAssociationDsl.() -> Unit = {},
  ): CfnLinkAssociation {
    val builder = CfnLinkAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLinkAssociationProps(block: CfnLinkAssociationPropsDsl.() -> Unit = {}):
      CfnLinkAssociationProps {
    val builder = CfnLinkAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLinkBandwidthProperty(block: CfnLinkBandwidthPropertyDsl.() -> Unit = {}):
      CfnLink.BandwidthProperty {
    val builder = CfnLinkBandwidthPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLinkProps(block: CfnLinkPropsDsl.() -> Unit = {}): CfnLinkProps {
    val builder = CfnLinkPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSite(
    scope: Construct,
    id: String,
    block: CfnSiteDsl.() -> Unit = {},
  ): CfnSite {
    val builder = CfnSiteDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSiteLocationProperty(block: CfnSiteLocationPropertyDsl.() -> Unit = {}):
      CfnSite.LocationProperty {
    val builder = CfnSiteLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSiteProps(block: CfnSitePropsDsl.() -> Unit = {}): CfnSiteProps {
    val builder = CfnSitePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSiteToSiteVpnAttachment(
    scope: Construct,
    id: String,
    block: CfnSiteToSiteVpnAttachmentDsl.() -> Unit = {},
  ): CfnSiteToSiteVpnAttachment {
    val builder = CfnSiteToSiteVpnAttachmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSiteToSiteVpnAttachmentProposedSegmentChangeProperty(block: CfnSiteToSiteVpnAttachmentProposedSegmentChangePropertyDsl.() -> Unit
      = {}): CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty {
    val builder = CfnSiteToSiteVpnAttachmentProposedSegmentChangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSiteToSiteVpnAttachmentProps(block: CfnSiteToSiteVpnAttachmentPropsDsl.() -> Unit =
      {}): CfnSiteToSiteVpnAttachmentProps {
    val builder = CfnSiteToSiteVpnAttachmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayPeering(
    scope: Construct,
    id: String,
    block: CfnTransitGatewayPeeringDsl.() -> Unit = {},
  ): CfnTransitGatewayPeering {
    val builder = CfnTransitGatewayPeeringDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayPeeringProps(block: CfnTransitGatewayPeeringPropsDsl.() -> Unit
      = {}): CfnTransitGatewayPeeringProps {
    val builder = CfnTransitGatewayPeeringPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayRegistration(
    scope: Construct,
    id: String,
    block: CfnTransitGatewayRegistrationDsl.() -> Unit = {},
  ): CfnTransitGatewayRegistration {
    val builder = CfnTransitGatewayRegistrationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayRegistrationProps(block: CfnTransitGatewayRegistrationPropsDsl.() -> Unit
      = {}): CfnTransitGatewayRegistrationProps {
    val builder = CfnTransitGatewayRegistrationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTransitGatewayRouteTableAttachment(
    scope: Construct,
    id: String,
    block: CfnTransitGatewayRouteTableAttachmentDsl.() -> Unit = {},
  ): CfnTransitGatewayRouteTableAttachment {
    val builder = CfnTransitGatewayRouteTableAttachmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayRouteTableAttachmentProposedSegmentChangeProperty(block: CfnTransitGatewayRouteTableAttachmentProposedSegmentChangePropertyDsl.() -> Unit
      = {}): CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty {
    val builder = CfnTransitGatewayRouteTableAttachmentProposedSegmentChangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTransitGatewayRouteTableAttachmentProps(block: CfnTransitGatewayRouteTableAttachmentPropsDsl.() -> Unit
      = {}): CfnTransitGatewayRouteTableAttachmentProps {
    val builder = CfnTransitGatewayRouteTableAttachmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVpcAttachment(
    scope: Construct,
    id: String,
    block: CfnVpcAttachmentDsl.() -> Unit = {},
  ): CfnVpcAttachment {
    val builder = CfnVpcAttachmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVpcAttachmentProposedSegmentChangeProperty(block: CfnVpcAttachmentProposedSegmentChangePropertyDsl.() -> Unit
      = {}): CfnVpcAttachment.ProposedSegmentChangeProperty {
    val builder = CfnVpcAttachmentProposedSegmentChangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVpcAttachmentProps(block: CfnVpcAttachmentPropsDsl.() -> Unit = {}):
      CfnVpcAttachmentProps {
    val builder = CfnVpcAttachmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVpcAttachmentVpcOptionsProperty(block: CfnVpcAttachmentVpcOptionsPropertyDsl.() -> Unit
      = {}): CfnVpcAttachment.VpcOptionsProperty {
    val builder = CfnVpcAttachmentVpcOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
