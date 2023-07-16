@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.networkmanager.CfnConnectAttachment
import software.amazon.awscdk.services.networkmanager.CfnConnectPeer
import software.amazon.awscdk.services.networkmanager.CfnCoreNetwork
import software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation
import software.amazon.awscdk.services.networkmanager.CfnDevice
import software.amazon.awscdk.services.networkmanager.CfnGlobalNetwork
import software.amazon.awscdk.services.networkmanager.CfnLink
import software.amazon.awscdk.services.networkmanager.CfnLinkAssociation
import software.amazon.awscdk.services.networkmanager.CfnSite
import software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachment

public inline fun CfnConnectAttachment.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnConnectAttachment.setOptions(block: CfnConnectAttachmentConnectAttachmentOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConnectAttachmentConnectAttachmentOptionsPropertyDsl()
  builder.apply(block)
  return setOptions(builder.build())
}

public inline
    fun CfnConnectAttachment.setProposedSegmentChange(block: CfnConnectAttachmentProposedSegmentChangePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConnectAttachmentProposedSegmentChangePropertyDsl()
  builder.apply(block)
  return setProposedSegmentChange(builder.build())
}

public inline fun CfnConnectPeer.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnConnectPeer.setBgpOptions(block: CfnConnectPeerBgpOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConnectPeerBgpOptionsPropertyDsl()
  builder.apply(block)
  return setBgpOptions(builder.build())
}

public inline fun CfnCoreNetwork.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnCustomerGatewayAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDevice.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDevice.setAwsLocation(block: CfnDeviceAWSLocationPropertyDsl.() -> Unit = {}) {
  val builder = CfnDeviceAWSLocationPropertyDsl()
  builder.apply(block)
  return setAwsLocation(builder.build())
}

public inline fun CfnDevice.setLocation(block: CfnDeviceLocationPropertyDsl.() -> Unit = {}) {
  val builder = CfnDeviceLocationPropertyDsl()
  builder.apply(block)
  return setLocation(builder.build())
}

public inline fun CfnGlobalNetwork.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnLink.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnLink.setBandwidth(block: CfnLinkBandwidthPropertyDsl.() -> Unit = {}) {
  val builder = CfnLinkBandwidthPropertyDsl()
  builder.apply(block)
  return setBandwidth(builder.build())
}

public inline fun CfnLinkAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSite.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSite.setLocation(block: CfnSiteLocationPropertyDsl.() -> Unit = {}) {
  val builder = CfnSiteLocationPropertyDsl()
  builder.apply(block)
  return setLocation(builder.build())
}

public inline fun CfnSiteToSiteVpnAttachment.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnSiteToSiteVpnAttachment.setProposedSegmentChange(block: CfnSiteToSiteVpnAttachmentProposedSegmentChangePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSiteToSiteVpnAttachmentProposedSegmentChangePropertyDsl()
  builder.apply(block)
  return setProposedSegmentChange(builder.build())
}

public inline fun CfnTransitGatewayPeering.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTransitGatewayRegistration.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTransitGatewayRouteTableAttachment.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnTransitGatewayRouteTableAttachment.setProposedSegmentChange(block: CfnTransitGatewayRouteTableAttachmentProposedSegmentChangePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTransitGatewayRouteTableAttachmentProposedSegmentChangePropertyDsl()
  builder.apply(block)
  return setProposedSegmentChange(builder.build())
}

public inline fun CfnVpcAttachment.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnVpcAttachment.setOptions(block: CfnVpcAttachmentVpcOptionsPropertyDsl.() -> Unit = {}) {
  val builder = CfnVpcAttachmentVpcOptionsPropertyDsl()
  builder.apply(block)
  return setOptions(builder.build())
}

public inline
    fun CfnVpcAttachment.setProposedSegmentChange(block: CfnVpcAttachmentProposedSegmentChangePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVpcAttachmentProposedSegmentChangePropertyDsl()
  builder.apply(block)
  return setProposedSegmentChange(builder.build())
}
