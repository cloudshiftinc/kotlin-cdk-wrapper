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

package io.cloudshiftdev.awscdkdsl.services.networkmanager

import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnConnectAttachment
import software.amazon.awscdk.services.networkmanager.CfnConnectPeer
import software.amazon.awscdk.services.networkmanager.CfnDevice
import software.amazon.awscdk.services.networkmanager.CfnLink
import software.amazon.awscdk.services.networkmanager.CfnSite
import software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachment

/** Options for connecting an attachment. */
public inline fun CfnConnectAttachment.setOptions(
    block: CfnConnectAttachmentConnectAttachmentOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConnectAttachmentConnectAttachmentOptionsPropertyDsl()
    builder.apply(block)
    return setOptions(builder.build())
}

/** Describes a proposed segment change. */
public inline fun CfnConnectAttachment.setProposedSegmentChange(
    block: CfnConnectAttachmentProposedSegmentChangePropertyDsl.() -> Unit = {}
) {
    val builder = CfnConnectAttachmentProposedSegmentChangePropertyDsl()
    builder.apply(block)
    return setProposedSegmentChange(builder.build())
}

/** Describes the BGP options. */
public inline fun CfnConnectPeer.setBgpOptions(
    block: CfnConnectPeerBgpOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConnectPeerBgpOptionsPropertyDsl()
    builder.apply(block)
    return setBgpOptions(builder.build())
}

/** The AWS location of the device. */
public inline fun CfnDevice.setAwsLocation(block: CfnDeviceAWSLocationPropertyDsl.() -> Unit = {}) {
    val builder = CfnDeviceAWSLocationPropertyDsl()
    builder.apply(block)
    return setAwsLocation(builder.build())
}

/** The site location. */
public inline fun CfnDevice.setLocation(block: CfnDeviceLocationPropertyDsl.() -> Unit = {}) {
    val builder = CfnDeviceLocationPropertyDsl()
    builder.apply(block)
    return setLocation(builder.build())
}

/** The bandwidth for the link. */
public inline fun CfnLink.setBandwidth(block: CfnLinkBandwidthPropertyDsl.() -> Unit = {}) {
    val builder = CfnLinkBandwidthPropertyDsl()
    builder.apply(block)
    return setBandwidth(builder.build())
}

/** The site location. */
public inline fun CfnSite.setLocation(block: CfnSiteLocationPropertyDsl.() -> Unit = {}) {
    val builder = CfnSiteLocationPropertyDsl()
    builder.apply(block)
    return setLocation(builder.build())
}

/** Describes a proposed segment change. */
public inline fun CfnSiteToSiteVpnAttachment.setProposedSegmentChange(
    block: CfnSiteToSiteVpnAttachmentProposedSegmentChangePropertyDsl.() -> Unit = {}
) {
    val builder = CfnSiteToSiteVpnAttachmentProposedSegmentChangePropertyDsl()
    builder.apply(block)
    return setProposedSegmentChange(builder.build())
}

/** This property is read-only. */
public inline fun CfnTransitGatewayRouteTableAttachment.setProposedSegmentChange(
    block: CfnTransitGatewayRouteTableAttachmentProposedSegmentChangePropertyDsl.() -> Unit = {}
) {
    val builder = CfnTransitGatewayRouteTableAttachmentProposedSegmentChangePropertyDsl()
    builder.apply(block)
    return setProposedSegmentChange(builder.build())
}

/** Options for creating the VPC attachment. */
public inline fun CfnVpcAttachment.setOptions(
    block: CfnVpcAttachmentVpcOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnVpcAttachmentVpcOptionsPropertyDsl()
    builder.apply(block)
    return setOptions(builder.build())
}

/** Describes a proposed segment change. */
public inline fun CfnVpcAttachment.setProposedSegmentChange(
    block: CfnVpcAttachmentProposedSegmentChangePropertyDsl.() -> Unit = {}
) {
    val builder = CfnVpcAttachmentProposedSegmentChangePropertyDsl()
    builder.apply(block)
    return setProposedSegmentChange(builder.build())
}
