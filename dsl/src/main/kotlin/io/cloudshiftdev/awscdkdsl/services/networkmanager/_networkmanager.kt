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
    /**
     * Creates a core network Connect attachment from a specified core network attachment.
     *
     * A core network Connect attachment is a GRE-based tunnel attachment that you can use to
     * establish a connection between a core network and an appliance. A core network Connect
     * attachment uses an existing VPC attachment as the underlying transport mechanism.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnConnectAttachment cfnConnectAttachment = CfnConnectAttachment.Builder.create(this,
     * "MyCfnConnectAttachment")
     * .coreNetworkId("coreNetworkId")
     * .edgeLocation("edgeLocation")
     * .options(ConnectAttachmentOptionsProperty.builder()
     * .protocol("protocol")
     * .build())
     * .transportAttachmentId("transportAttachmentId")
     * // the properties below are optional
     * .proposedSegmentChange(ProposedSegmentChangeProperty.builder()
     * .attachmentPolicyRuleNumber(123)
     * .segmentName("segmentName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html)
     */
    public inline fun cfnConnectAttachment(
        scope: Construct,
        id: String,
        block: CfnConnectAttachmentDsl.() -> Unit = {},
    ): CfnConnectAttachment {
        val builder = CfnConnectAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a core network Connect attachment options.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * ConnectAttachmentOptionsProperty connectAttachmentOptionsProperty =
     * ConnectAttachmentOptionsProperty.builder()
     * .protocol("protocol")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectattachment-connectattachmentoptions.html)
     */
    public inline fun cfnConnectAttachmentConnectAttachmentOptionsProperty(
        block: CfnConnectAttachmentConnectAttachmentOptionsPropertyDsl.() -> Unit = {}
    ): CfnConnectAttachment.ConnectAttachmentOptionsProperty {
        val builder = CfnConnectAttachmentConnectAttachmentOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * ProposedSegmentChangeProperty proposedSegmentChangeProperty =
     * ProposedSegmentChangeProperty.builder()
     * .attachmentPolicyRuleNumber(123)
     * .segmentName("segmentName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectattachment-proposedsegmentchange.html)
     */
    public inline fun cfnConnectAttachmentProposedSegmentChangeProperty(
        block: CfnConnectAttachmentProposedSegmentChangePropertyDsl.() -> Unit = {}
    ): CfnConnectAttachment.ProposedSegmentChangeProperty {
        val builder = CfnConnectAttachmentProposedSegmentChangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConnectAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnConnectAttachmentProps cfnConnectAttachmentProps = CfnConnectAttachmentProps.builder()
     * .coreNetworkId("coreNetworkId")
     * .edgeLocation("edgeLocation")
     * .options(ConnectAttachmentOptionsProperty.builder()
     * .protocol("protocol")
     * .build())
     * .transportAttachmentId("transportAttachmentId")
     * // the properties below are optional
     * .proposedSegmentChange(ProposedSegmentChangeProperty.builder()
     * .attachmentPolicyRuleNumber(123)
     * .segmentName("segmentName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html)
     */
    public inline fun cfnConnectAttachmentProps(
        block: CfnConnectAttachmentPropsDsl.() -> Unit = {}
    ): CfnConnectAttachmentProps {
        val builder = CfnConnectAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a core network Connect peer for a specified core network connect attachment between a
     * core network and an appliance.
     *
     * The peer address and transit gateway address must be the same IP address family (IPv4 or
     * IPv6).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnConnectPeer cfnConnectPeer = CfnConnectPeer.Builder.create(this, "MyCfnConnectPeer")
     * .connectAttachmentId("connectAttachmentId")
     * .peerAddress("peerAddress")
     * // the properties below are optional
     * .bgpOptions(BgpOptionsProperty.builder()
     * .peerAsn(123)
     * .build())
     * .coreNetworkAddress("coreNetworkAddress")
     * .insideCidrBlocks(List.of("insideCidrBlocks"))
     * .subnetArn("subnetArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html)
     */
    public inline fun cfnConnectPeer(
        scope: Construct,
        id: String,
        block: CfnConnectPeerDsl.() -> Unit = {},
    ): CfnConnectPeer {
        val builder = CfnConnectPeerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the BGP options.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * BgpOptionsProperty bgpOptionsProperty = BgpOptionsProperty.builder()
     * .peerAsn(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-bgpoptions.html)
     */
    public inline fun cfnConnectPeerBgpOptionsProperty(
        block: CfnConnectPeerBgpOptionsPropertyDsl.() -> Unit = {}
    ): CfnConnectPeer.BgpOptionsProperty {
        val builder = CfnConnectPeerBgpOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a core network BGP configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * ConnectPeerBgpConfigurationProperty connectPeerBgpConfigurationProperty =
     * ConnectPeerBgpConfigurationProperty.builder()
     * .coreNetworkAddress("coreNetworkAddress")
     * .coreNetworkAsn(123)
     * .peerAddress("peerAddress")
     * .peerAsn(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerbgpconfiguration.html)
     */
    public inline fun cfnConnectPeerConnectPeerBgpConfigurationProperty(
        block: CfnConnectPeerConnectPeerBgpConfigurationPropertyDsl.() -> Unit = {}
    ): CfnConnectPeer.ConnectPeerBgpConfigurationProperty {
        val builder = CfnConnectPeerConnectPeerBgpConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a core network Connect peer configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * ConnectPeerConfigurationProperty connectPeerConfigurationProperty =
     * ConnectPeerConfigurationProperty.builder()
     * .bgpConfigurations(List.of(ConnectPeerBgpConfigurationProperty.builder()
     * .coreNetworkAddress("coreNetworkAddress")
     * .coreNetworkAsn(123)
     * .peerAddress("peerAddress")
     * .peerAsn(123)
     * .build()))
     * .coreNetworkAddress("coreNetworkAddress")
     * .insideCidrBlocks(List.of("insideCidrBlocks"))
     * .peerAddress("peerAddress")
     * .protocol("protocol")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerconfiguration.html)
     */
    public inline fun cfnConnectPeerConnectPeerConfigurationProperty(
        block: CfnConnectPeerConnectPeerConfigurationPropertyDsl.() -> Unit = {}
    ): CfnConnectPeer.ConnectPeerConfigurationProperty {
        val builder = CfnConnectPeerConnectPeerConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConnectPeer`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnConnectPeerProps cfnConnectPeerProps = CfnConnectPeerProps.builder()
     * .connectAttachmentId("connectAttachmentId")
     * .peerAddress("peerAddress")
     * // the properties below are optional
     * .bgpOptions(BgpOptionsProperty.builder()
     * .peerAsn(123)
     * .build())
     * .coreNetworkAddress("coreNetworkAddress")
     * .insideCidrBlocks(List.of("insideCidrBlocks"))
     * .subnetArn("subnetArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html)
     */
    public inline fun cfnConnectPeerProps(
        block: CfnConnectPeerPropsDsl.() -> Unit = {}
    ): CfnConnectPeerProps {
        val builder = CfnConnectPeerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a core network.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * Object policyDocument;
     * CfnCoreNetwork cfnCoreNetwork = CfnCoreNetwork.Builder.create(this, "MyCfnCoreNetwork")
     * .globalNetworkId("globalNetworkId")
     * // the properties below are optional
     * .description("description")
     * .policyDocument(policyDocument)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html)
     */
    public inline fun cfnCoreNetwork(
        scope: Construct,
        id: String,
        block: CfnCoreNetworkDsl.() -> Unit = {},
    ): CfnCoreNetwork {
        val builder = CfnCoreNetworkDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a core network edge.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CoreNetworkEdgeProperty coreNetworkEdgeProperty = CoreNetworkEdgeProperty.builder()
     * .asn(123)
     * .edgeLocation("edgeLocation")
     * .insideCidrBlocks(List.of("insideCidrBlocks"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworkedge.html)
     */
    public inline fun cfnCoreNetworkCoreNetworkEdgeProperty(
        block: CfnCoreNetworkCoreNetworkEdgePropertyDsl.() -> Unit = {}
    ): CfnCoreNetwork.CoreNetworkEdgeProperty {
        val builder = CfnCoreNetworkCoreNetworkEdgePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a core network segment, which are dedicated routes.
     *
     * Only attachments within this segment can communicate with each other.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CoreNetworkSegmentProperty coreNetworkSegmentProperty = CoreNetworkSegmentProperty.builder()
     * .edgeLocations(List.of("edgeLocations"))
     * .name("name")
     * .sharedSegments(List.of("sharedSegments"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworksegment.html)
     */
    public inline fun cfnCoreNetworkCoreNetworkSegmentProperty(
        block: CfnCoreNetworkCoreNetworkSegmentPropertyDsl.() -> Unit = {}
    ): CfnCoreNetwork.CoreNetworkSegmentProperty {
        val builder = CfnCoreNetworkCoreNetworkSegmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCoreNetwork`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * Object policyDocument;
     * CfnCoreNetworkProps cfnCoreNetworkProps = CfnCoreNetworkProps.builder()
     * .globalNetworkId("globalNetworkId")
     * // the properties below are optional
     * .description("description")
     * .policyDocument(policyDocument)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html)
     */
    public inline fun cfnCoreNetworkProps(
        block: CfnCoreNetworkPropsDsl.() -> Unit = {}
    ): CfnCoreNetworkProps {
        val builder = CfnCoreNetworkPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an association between a customer gateway, a device, and optionally, a link.
     *
     * If you specify a link, it must be associated with the specified device. The customer gateway
     * must be connected to a VPN attachment on a transit gateway that's registered in your global
     * network.
     *
     * You cannot associate a customer gateway with more than one device and link.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnCustomerGatewayAssociation cfnCustomerGatewayAssociation =
     * CfnCustomerGatewayAssociation.Builder.create(this, "MyCfnCustomerGatewayAssociation")
     * .customerGatewayArn("customerGatewayArn")
     * .deviceId("deviceId")
     * .globalNetworkId("globalNetworkId")
     * // the properties below are optional
     * .linkId("linkId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html)
     */
    public inline fun cfnCustomerGatewayAssociation(
        scope: Construct,
        id: String,
        block: CfnCustomerGatewayAssociationDsl.() -> Unit = {},
    ): CfnCustomerGatewayAssociation {
        val builder = CfnCustomerGatewayAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCustomerGatewayAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnCustomerGatewayAssociationProps cfnCustomerGatewayAssociationProps =
     * CfnCustomerGatewayAssociationProps.builder()
     * .customerGatewayArn("customerGatewayArn")
     * .deviceId("deviceId")
     * .globalNetworkId("globalNetworkId")
     * // the properties below are optional
     * .linkId("linkId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html)
     */
    public inline fun cfnCustomerGatewayAssociationProps(
        block: CfnCustomerGatewayAssociationPropsDsl.() -> Unit = {}
    ): CfnCustomerGatewayAssociationProps {
        val builder = CfnCustomerGatewayAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a device.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnDevice cfnDevice = CfnDevice.Builder.create(this, "MyCfnDevice")
     * .globalNetworkId("globalNetworkId")
     * // the properties below are optional
     * .awsLocation(AWSLocationProperty.builder()
     * .subnetArn("subnetArn")
     * .zone("zone")
     * .build())
     * .description("description")
     * .location(LocationProperty.builder()
     * .address("address")
     * .latitude("latitude")
     * .longitude("longitude")
     * .build())
     * .model("model")
     * .serialNumber("serialNumber")
     * .siteId("siteId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .type("type")
     * .vendor("vendor")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html)
     */
    public inline fun cfnDevice(
        scope: Construct,
        id: String,
        block: CfnDeviceDsl.() -> Unit = {},
    ): CfnDevice {
        val builder = CfnDeviceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a location in AWS .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * AWSLocationProperty aWSLocationProperty = AWSLocationProperty.builder()
     * .subnetArn("subnetArn")
     * .zone("zone")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-awslocation.html)
     */
    public inline fun cfnDeviceAWSLocationProperty(
        block: CfnDeviceAWSLocationPropertyDsl.() -> Unit = {}
    ): CfnDevice.AWSLocationProperty {
        val builder = CfnDeviceAWSLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * LocationProperty locationProperty = LocationProperty.builder()
     * .address("address")
     * .latitude("latitude")
     * .longitude("longitude")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html)
     */
    public inline fun cfnDeviceLocationProperty(
        block: CfnDeviceLocationPropertyDsl.() -> Unit = {}
    ): CfnDevice.LocationProperty {
        val builder = CfnDeviceLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDevice`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnDeviceProps cfnDeviceProps = CfnDeviceProps.builder()
     * .globalNetworkId("globalNetworkId")
     * // the properties below are optional
     * .awsLocation(AWSLocationProperty.builder()
     * .subnetArn("subnetArn")
     * .zone("zone")
     * .build())
     * .description("description")
     * .location(LocationProperty.builder()
     * .address("address")
     * .latitude("latitude")
     * .longitude("longitude")
     * .build())
     * .model("model")
     * .serialNumber("serialNumber")
     * .siteId("siteId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .type("type")
     * .vendor("vendor")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html)
     */
    public inline fun cfnDeviceProps(block: CfnDevicePropsDsl.() -> Unit = {}): CfnDeviceProps {
        val builder = CfnDevicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new, empty global network.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnGlobalNetwork cfnGlobalNetwork = CfnGlobalNetwork.Builder.create(this, "MyCfnGlobalNetwork")
     * .createdAt("createdAt")
     * .description("description")
     * .state("state")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html)
     */
    public inline fun cfnGlobalNetwork(
        scope: Construct,
        id: String,
        block: CfnGlobalNetworkDsl.() -> Unit = {},
    ): CfnGlobalNetwork {
        val builder = CfnGlobalNetworkDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGlobalNetwork`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnGlobalNetworkProps cfnGlobalNetworkProps = CfnGlobalNetworkProps.builder()
     * .createdAt("createdAt")
     * .description("description")
     * .state("state")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html)
     */
    public inline fun cfnGlobalNetworkProps(
        block: CfnGlobalNetworkPropsDsl.() -> Unit = {}
    ): CfnGlobalNetworkProps {
        val builder = CfnGlobalNetworkPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a link for a site.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnLink cfnLink = CfnLink.Builder.create(this, "MyCfnLink")
     * .bandwidth(BandwidthProperty.builder()
     * .downloadSpeed(123)
     * .uploadSpeed(123)
     * .build())
     * .globalNetworkId("globalNetworkId")
     * .siteId("siteId")
     * // the properties below are optional
     * .description("description")
     * .provider("provider")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html)
     */
    public inline fun cfnLink(
        scope: Construct,
        id: String,
        block: CfnLinkDsl.() -> Unit = {},
    ): CfnLink {
        val builder = CfnLinkDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the association between a device and a link.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnLinkAssociation cfnLinkAssociation = CfnLinkAssociation.Builder.create(this,
     * "MyCfnLinkAssociation")
     * .deviceId("deviceId")
     * .globalNetworkId("globalNetworkId")
     * .linkId("linkId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html)
     */
    public inline fun cfnLinkAssociation(
        scope: Construct,
        id: String,
        block: CfnLinkAssociationDsl.() -> Unit = {},
    ): CfnLinkAssociation {
        val builder = CfnLinkAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLinkAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnLinkAssociationProps cfnLinkAssociationProps = CfnLinkAssociationProps.builder()
     * .deviceId("deviceId")
     * .globalNetworkId("globalNetworkId")
     * .linkId("linkId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html)
     */
    public inline fun cfnLinkAssociationProps(
        block: CfnLinkAssociationPropsDsl.() -> Unit = {}
    ): CfnLinkAssociationProps {
        val builder = CfnLinkAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes bandwidth information.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * BandwidthProperty bandwidthProperty = BandwidthProperty.builder()
     * .downloadSpeed(123)
     * .uploadSpeed(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-link-bandwidth.html)
     */
    public inline fun cfnLinkBandwidthProperty(
        block: CfnLinkBandwidthPropertyDsl.() -> Unit = {}
    ): CfnLink.BandwidthProperty {
        val builder = CfnLinkBandwidthPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLink`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnLinkProps cfnLinkProps = CfnLinkProps.builder()
     * .bandwidth(BandwidthProperty.builder()
     * .downloadSpeed(123)
     * .uploadSpeed(123)
     * .build())
     * .globalNetworkId("globalNetworkId")
     * .siteId("siteId")
     * // the properties below are optional
     * .description("description")
     * .provider("provider")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html)
     */
    public inline fun cfnLinkProps(block: CfnLinkPropsDsl.() -> Unit = {}): CfnLinkProps {
        val builder = CfnLinkPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new site in a global network.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnSite cfnSite = CfnSite.Builder.create(this, "MyCfnSite")
     * .globalNetworkId("globalNetworkId")
     * // the properties below are optional
     * .description("description")
     * .location(LocationProperty.builder()
     * .address("address")
     * .latitude("latitude")
     * .longitude("longitude")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html)
     */
    public inline fun cfnSite(
        scope: Construct,
        id: String,
        block: CfnSiteDsl.() -> Unit = {},
    ): CfnSite {
        val builder = CfnSiteDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * LocationProperty locationProperty = LocationProperty.builder()
     * .address("address")
     * .latitude("latitude")
     * .longitude("longitude")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html)
     */
    public inline fun cfnSiteLocationProperty(
        block: CfnSiteLocationPropertyDsl.() -> Unit = {}
    ): CfnSite.LocationProperty {
        val builder = CfnSiteLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSite`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnSiteProps cfnSiteProps = CfnSiteProps.builder()
     * .globalNetworkId("globalNetworkId")
     * // the properties below are optional
     * .description("description")
     * .location(LocationProperty.builder()
     * .address("address")
     * .latitude("latitude")
     * .longitude("longitude")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html)
     */
    public inline fun cfnSiteProps(block: CfnSitePropsDsl.() -> Unit = {}): CfnSiteProps {
        val builder = CfnSitePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an Amazon Web Services site-to-site VPN attachment on an edge location of a core
     * network.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnSiteToSiteVpnAttachment cfnSiteToSiteVpnAttachment =
     * CfnSiteToSiteVpnAttachment.Builder.create(this, "MyCfnSiteToSiteVpnAttachment")
     * .coreNetworkId("coreNetworkId")
     * .vpnConnectionArn("vpnConnectionArn")
     * // the properties below are optional
     * .proposedSegmentChange(ProposedSegmentChangeProperty.builder()
     * .attachmentPolicyRuleNumber(123)
     * .segmentName("segmentName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html)
     */
    public inline fun cfnSiteToSiteVpnAttachment(
        scope: Construct,
        id: String,
        block: CfnSiteToSiteVpnAttachmentDsl.() -> Unit = {},
    ): CfnSiteToSiteVpnAttachment {
        val builder = CfnSiteToSiteVpnAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * ProposedSegmentChangeProperty proposedSegmentChangeProperty =
     * ProposedSegmentChangeProperty.builder()
     * .attachmentPolicyRuleNumber(123)
     * .segmentName("segmentName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-sitetositevpnattachment-proposedsegmentchange.html)
     */
    public inline fun cfnSiteToSiteVpnAttachmentProposedSegmentChangeProperty(
        block: CfnSiteToSiteVpnAttachmentProposedSegmentChangePropertyDsl.() -> Unit = {}
    ): CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty {
        val builder = CfnSiteToSiteVpnAttachmentProposedSegmentChangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSiteToSiteVpnAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnSiteToSiteVpnAttachmentProps cfnSiteToSiteVpnAttachmentProps =
     * CfnSiteToSiteVpnAttachmentProps.builder()
     * .coreNetworkId("coreNetworkId")
     * .vpnConnectionArn("vpnConnectionArn")
     * // the properties below are optional
     * .proposedSegmentChange(ProposedSegmentChangeProperty.builder()
     * .attachmentPolicyRuleNumber(123)
     * .segmentName("segmentName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html)
     */
    public inline fun cfnSiteToSiteVpnAttachmentProps(
        block: CfnSiteToSiteVpnAttachmentPropsDsl.() -> Unit = {}
    ): CfnSiteToSiteVpnAttachmentProps {
        val builder = CfnSiteToSiteVpnAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a transit gateway peering connection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnTransitGatewayPeering cfnTransitGatewayPeering =
     * CfnTransitGatewayPeering.Builder.create(this, "MyCfnTransitGatewayPeering")
     * .coreNetworkId("coreNetworkId")
     * .transitGatewayArn("transitGatewayArn")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html)
     */
    public inline fun cfnTransitGatewayPeering(
        scope: Construct,
        id: String,
        block: CfnTransitGatewayPeeringDsl.() -> Unit = {},
    ): CfnTransitGatewayPeering {
        val builder = CfnTransitGatewayPeeringDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTransitGatewayPeering`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnTransitGatewayPeeringProps cfnTransitGatewayPeeringProps =
     * CfnTransitGatewayPeeringProps.builder()
     * .coreNetworkId("coreNetworkId")
     * .transitGatewayArn("transitGatewayArn")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html)
     */
    public inline fun cfnTransitGatewayPeeringProps(
        block: CfnTransitGatewayPeeringPropsDsl.() -> Unit = {}
    ): CfnTransitGatewayPeeringProps {
        val builder = CfnTransitGatewayPeeringPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Registers a transit gateway in your global network.
     *
     * Not all Regions support transit gateways for global networks. For a list of the supported
     * Regions, see
     * [Region Availability](https://docs.aws.amazon.com/network-manager/latest/tgwnm/what-are-global-networks.html#nm-available-regions)
     * in the *AWS Transit Gateways for Global Networks User Guide* . The transit gateway can be in
     * any of the supported AWS Regions, but it must be owned by the same AWS account that owns the
     * global network. You cannot register a transit gateway in more than one global network.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnTransitGatewayRegistration cfnTransitGatewayRegistration =
     * CfnTransitGatewayRegistration.Builder.create(this, "MyCfnTransitGatewayRegistration")
     * .globalNetworkId("globalNetworkId")
     * .transitGatewayArn("transitGatewayArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html)
     */
    public inline fun cfnTransitGatewayRegistration(
        scope: Construct,
        id: String,
        block: CfnTransitGatewayRegistrationDsl.() -> Unit = {},
    ): CfnTransitGatewayRegistration {
        val builder = CfnTransitGatewayRegistrationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTransitGatewayRegistration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnTransitGatewayRegistrationProps cfnTransitGatewayRegistrationProps =
     * CfnTransitGatewayRegistrationProps.builder()
     * .globalNetworkId("globalNetworkId")
     * .transitGatewayArn("transitGatewayArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html)
     */
    public inline fun cfnTransitGatewayRegistrationProps(
        block: CfnTransitGatewayRegistrationPropsDsl.() -> Unit = {}
    ): CfnTransitGatewayRegistrationProps {
        val builder = CfnTransitGatewayRegistrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a transit gateway route table attachment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnTransitGatewayRouteTableAttachment cfnTransitGatewayRouteTableAttachment =
     * CfnTransitGatewayRouteTableAttachment.Builder.create(this,
     * "MyCfnTransitGatewayRouteTableAttachment")
     * .peeringId("peeringId")
     * .transitGatewayRouteTableArn("transitGatewayRouteTableArn")
     * // the properties below are optional
     * .proposedSegmentChange(ProposedSegmentChangeProperty.builder()
     * .attachmentPolicyRuleNumber(123)
     * .segmentName("segmentName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html)
     */
    public inline fun cfnTransitGatewayRouteTableAttachment(
        scope: Construct,
        id: String,
        block: CfnTransitGatewayRouteTableAttachmentDsl.() -> Unit = {},
    ): CfnTransitGatewayRouteTableAttachment {
        val builder = CfnTransitGatewayRouteTableAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * ProposedSegmentChangeProperty proposedSegmentChangeProperty =
     * ProposedSegmentChangeProperty.builder()
     * .attachmentPolicyRuleNumber(123)
     * .segmentName("segmentName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange.html)
     */
    public inline fun cfnTransitGatewayRouteTableAttachmentProposedSegmentChangeProperty(
        block: CfnTransitGatewayRouteTableAttachmentProposedSegmentChangePropertyDsl.() -> Unit = {}
    ): CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty {
        val builder = CfnTransitGatewayRouteTableAttachmentProposedSegmentChangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTransitGatewayRouteTableAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnTransitGatewayRouteTableAttachmentProps cfnTransitGatewayRouteTableAttachmentProps =
     * CfnTransitGatewayRouteTableAttachmentProps.builder()
     * .peeringId("peeringId")
     * .transitGatewayRouteTableArn("transitGatewayRouteTableArn")
     * // the properties below are optional
     * .proposedSegmentChange(ProposedSegmentChangeProperty.builder()
     * .attachmentPolicyRuleNumber(123)
     * .segmentName("segmentName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html)
     */
    public inline fun cfnTransitGatewayRouteTableAttachmentProps(
        block: CfnTransitGatewayRouteTableAttachmentPropsDsl.() -> Unit = {}
    ): CfnTransitGatewayRouteTableAttachmentProps {
        val builder = CfnTransitGatewayRouteTableAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a VPC attachment on an edge location of a core network.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnVpcAttachment cfnVpcAttachment = CfnVpcAttachment.Builder.create(this, "MyCfnVpcAttachment")
     * .coreNetworkId("coreNetworkId")
     * .subnetArns(List.of("subnetArns"))
     * .vpcArn("vpcArn")
     * // the properties below are optional
     * .options(VpcOptionsProperty.builder()
     * .applianceModeSupport(false)
     * .ipv6Support(false)
     * .build())
     * .proposedSegmentChange(ProposedSegmentChangeProperty.builder()
     * .attachmentPolicyRuleNumber(123)
     * .segmentName("segmentName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html)
     */
    public inline fun cfnVpcAttachment(
        scope: Construct,
        id: String,
        block: CfnVpcAttachmentDsl.() -> Unit = {},
    ): CfnVpcAttachment {
        val builder = CfnVpcAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * ProposedSegmentChangeProperty proposedSegmentChangeProperty =
     * ProposedSegmentChangeProperty.builder()
     * .attachmentPolicyRuleNumber(123)
     * .segmentName("segmentName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-proposedsegmentchange.html)
     */
    public inline fun cfnVpcAttachmentProposedSegmentChangeProperty(
        block: CfnVpcAttachmentProposedSegmentChangePropertyDsl.() -> Unit = {}
    ): CfnVpcAttachment.ProposedSegmentChangeProperty {
        val builder = CfnVpcAttachmentProposedSegmentChangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVpcAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * CfnVpcAttachmentProps cfnVpcAttachmentProps = CfnVpcAttachmentProps.builder()
     * .coreNetworkId("coreNetworkId")
     * .subnetArns(List.of("subnetArns"))
     * .vpcArn("vpcArn")
     * // the properties below are optional
     * .options(VpcOptionsProperty.builder()
     * .applianceModeSupport(false)
     * .ipv6Support(false)
     * .build())
     * .proposedSegmentChange(ProposedSegmentChangeProperty.builder()
     * .attachmentPolicyRuleNumber(123)
     * .segmentName("segmentName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html)
     */
    public inline fun cfnVpcAttachmentProps(
        block: CfnVpcAttachmentPropsDsl.() -> Unit = {}
    ): CfnVpcAttachmentProps {
        val builder = CfnVpcAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the VPC options.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkmanager.*;
     * VpcOptionsProperty vpcOptionsProperty = VpcOptionsProperty.builder()
     * .applianceModeSupport(false)
     * .ipv6Support(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-vpcoptions.html)
     */
    public inline fun cfnVpcAttachmentVpcOptionsProperty(
        block: CfnVpcAttachmentVpcOptionsPropertyDsl.() -> Unit = {}
    ): CfnVpcAttachment.VpcOptionsProperty {
        val builder = CfnVpcAttachmentVpcOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
