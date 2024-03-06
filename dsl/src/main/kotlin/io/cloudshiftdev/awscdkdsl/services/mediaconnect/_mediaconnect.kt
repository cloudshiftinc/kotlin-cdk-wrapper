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

package io.cloudshiftdev.awscdkdsl.services.mediaconnect

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnBridge
import software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput
import software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps
import software.amazon.awscdk.services.mediaconnect.CfnBridgeProps
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSource
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps
import software.amazon.awscdk.services.mediaconnect.CfnFlow
import software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement
import software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps
import software.amazon.awscdk.services.mediaconnect.CfnFlowOutput
import software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps
import software.amazon.awscdk.services.mediaconnect.CfnFlowProps
import software.amazon.awscdk.services.mediaconnect.CfnFlowSource
import software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps
import software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface
import software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps
import software.amazon.awscdk.services.mediaconnect.CfnGateway
import software.amazon.awscdk.services.mediaconnect.CfnGatewayProps
import software.constructs.Construct

public object mediaconnect {
    /**
     * The AWS::MediaConnect::Bridge resource defines a connection between your data center’s
     * gateway instances and the cloud.
     *
     * For each bridge, you specify the type of bridge, transport protocol to use, and details for
     * any outputs and failover.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnBridge cfnBridge = CfnBridge.Builder.create(this, "MyCfnBridge")
     * .name("name")
     * .placementArn("placementArn")
     * .sources(List.of(BridgeSourceProperty.builder()
     * .flowSource(BridgeFlowSourceProperty.builder()
     * .flowArn("flowArn")
     * .name("name")
     * // the properties below are optional
     * .flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build())
     * .build())
     * .networkSource(BridgeNetworkSourceProperty.builder()
     * .multicastIp("multicastIp")
     * .name("name")
     * .networkName("networkName")
     * .port(123)
     * .protocol("protocol")
     * .build())
     * .build()))
     * // the properties below are optional
     * .egressGatewayBridge(EgressGatewayBridgeProperty.builder()
     * .maxBitrate(123)
     * .build())
     * .ingressGatewayBridge(IngressGatewayBridgeProperty.builder()
     * .maxBitrate(123)
     * .maxOutputs(123)
     * .build())
     * .outputs(List.of(BridgeOutputProperty.builder()
     * .networkOutput(BridgeNetworkOutputProperty.builder()
     * .ipAddress("ipAddress")
     * .name("name")
     * .networkName("networkName")
     * .port(123)
     * .protocol("protocol")
     * .ttl(123)
     * .build())
     * .build()))
     * .sourceFailoverConfig(FailoverConfigProperty.builder()
     * .failoverMode("failoverMode")
     * // the properties below are optional
     * .sourcePriority(SourcePriorityProperty.builder()
     * .primarySource("primarySource")
     * .build())
     * .state("state")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html)
     */
    public inline fun cfnBridge(
        scope: Construct,
        id: String,
        block: CfnBridgeDsl.() -> Unit = {},
    ): CfnBridge {
        val builder = CfnBridgeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The source of the bridge.
     *
     * A flow source originates in MediaConnect as an existing cloud flow.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * BridgeFlowSourceProperty bridgeFlowSourceProperty = BridgeFlowSourceProperty.builder()
     * .flowArn("flowArn")
     * .name("name")
     * // the properties below are optional
     * .flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgeflowsource.html)
     */
    public inline fun cfnBridgeBridgeFlowSourceProperty(
        block: CfnBridgeBridgeFlowSourcePropertyDsl.() -> Unit = {}
    ): CfnBridge.BridgeFlowSourceProperty {
        val builder = CfnBridgeBridgeFlowSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The output of the bridge.
     *
     * A network output is delivered to your premises.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * BridgeNetworkOutputProperty bridgeNetworkOutputProperty = BridgeNetworkOutputProperty.builder()
     * .ipAddress("ipAddress")
     * .name("name")
     * .networkName("networkName")
     * .port(123)
     * .protocol("protocol")
     * .ttl(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworkoutput.html)
     */
    public inline fun cfnBridgeBridgeNetworkOutputProperty(
        block: CfnBridgeBridgeNetworkOutputPropertyDsl.() -> Unit = {}
    ): CfnBridge.BridgeNetworkOutputProperty {
        val builder = CfnBridgeBridgeNetworkOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The source of the bridge.
     *
     * A network source originates at your premises.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * BridgeNetworkSourceProperty bridgeNetworkSourceProperty = BridgeNetworkSourceProperty.builder()
     * .multicastIp("multicastIp")
     * .name("name")
     * .networkName("networkName")
     * .port(123)
     * .protocol("protocol")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworksource.html)
     */
    public inline fun cfnBridgeBridgeNetworkSourceProperty(
        block: CfnBridgeBridgeNetworkSourcePropertyDsl.() -> Unit = {}
    ): CfnBridge.BridgeNetworkSourceProperty {
        val builder = CfnBridgeBridgeNetworkSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The output of the bridge.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * BridgeOutputProperty bridgeOutputProperty = BridgeOutputProperty.builder()
     * .networkOutput(BridgeNetworkOutputProperty.builder()
     * .ipAddress("ipAddress")
     * .name("name")
     * .networkName("networkName")
     * .port(123)
     * .protocol("protocol")
     * .ttl(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgeoutput.html)
     */
    public inline fun cfnBridgeBridgeOutputProperty(
        block: CfnBridgeBridgeOutputPropertyDsl.() -> Unit = {}
    ): CfnBridge.BridgeOutputProperty {
        val builder = CfnBridgeBridgeOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The bridge's source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * BridgeSourceProperty bridgeSourceProperty = BridgeSourceProperty.builder()
     * .flowSource(BridgeFlowSourceProperty.builder()
     * .flowArn("flowArn")
     * .name("name")
     * // the properties below are optional
     * .flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build())
     * .build())
     * .networkSource(BridgeNetworkSourceProperty.builder()
     * .multicastIp("multicastIp")
     * .name("name")
     * .networkName("networkName")
     * .port(123)
     * .protocol("protocol")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgesource.html)
     */
    public inline fun cfnBridgeBridgeSourceProperty(
        block: CfnBridgeBridgeSourcePropertyDsl.() -> Unit = {}
    ): CfnBridge.BridgeSourceProperty {
        val builder = CfnBridgeBridgeSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a bridge with the egress bridge type.
     *
     * An egress bridge is a cloud-to-ground bridge. The content comes from an existing MediaConnect
     * flow and is delivered to your premises.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * EgressGatewayBridgeProperty egressGatewayBridgeProperty = EgressGatewayBridgeProperty.builder()
     * .maxBitrate(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-egressgatewaybridge.html)
     */
    public inline fun cfnBridgeEgressGatewayBridgeProperty(
        block: CfnBridgeEgressGatewayBridgePropertyDsl.() -> Unit = {}
    ): CfnBridge.EgressGatewayBridgeProperty {
        val builder = CfnBridgeEgressGatewayBridgePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for source failover.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * FailoverConfigProperty failoverConfigProperty = FailoverConfigProperty.builder()
     * .failoverMode("failoverMode")
     * // the properties below are optional
     * .sourcePriority(SourcePriorityProperty.builder()
     * .primarySource("primarySource")
     * .build())
     * .state("state")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-failoverconfig.html)
     */
    public inline fun cfnBridgeFailoverConfigProperty(
        block: CfnBridgeFailoverConfigPropertyDsl.() -> Unit = {}
    ): CfnBridge.FailoverConfigProperty {
        val builder = CfnBridgeFailoverConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a bridge with the ingress bridge type.
     *
     * An ingress bridge is a ground-to-cloud bridge. The content originates at your premises and is
     * delivered to the cloud.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * IngressGatewayBridgeProperty ingressGatewayBridgeProperty =
     * IngressGatewayBridgeProperty.builder()
     * .maxBitrate(123)
     * .maxOutputs(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-ingressgatewaybridge.html)
     */
    public inline fun cfnBridgeIngressGatewayBridgeProperty(
        block: CfnBridgeIngressGatewayBridgePropertyDsl.() -> Unit = {}
    ): CfnBridge.IngressGatewayBridgeProperty {
        val builder = CfnBridgeIngressGatewayBridgePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds outputs to an existing bridge.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnBridgeOutput cfnBridgeOutput = CfnBridgeOutput.Builder.create(this, "MyCfnBridgeOutput")
     * .bridgeArn("bridgeArn")
     * .name("name")
     * .networkOutput(BridgeNetworkOutputProperty.builder()
     * .ipAddress("ipAddress")
     * .networkName("networkName")
     * .port(123)
     * .protocol("protocol")
     * .ttl(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html)
     */
    public inline fun cfnBridgeOutput(
        scope: Construct,
        id: String,
        block: CfnBridgeOutputDsl.() -> Unit = {},
    ): CfnBridgeOutput {
        val builder = CfnBridgeOutputDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The output of the bridge.
     *
     * A network output is delivered to your premises.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * BridgeNetworkOutputProperty bridgeNetworkOutputProperty = BridgeNetworkOutputProperty.builder()
     * .ipAddress("ipAddress")
     * .networkName("networkName")
     * .port(123)
     * .protocol("protocol")
     * .ttl(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgeoutput-bridgenetworkoutput.html)
     */
    public inline fun cfnBridgeOutputBridgeNetworkOutputProperty(
        block: CfnBridgeOutputBridgeNetworkOutputPropertyDsl.() -> Unit = {}
    ): CfnBridgeOutput.BridgeNetworkOutputProperty {
        val builder = CfnBridgeOutputBridgeNetworkOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBridgeOutput`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnBridgeOutputProps cfnBridgeOutputProps = CfnBridgeOutputProps.builder()
     * .bridgeArn("bridgeArn")
     * .name("name")
     * .networkOutput(BridgeNetworkOutputProperty.builder()
     * .ipAddress("ipAddress")
     * .networkName("networkName")
     * .port(123)
     * .protocol("protocol")
     * .ttl(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html)
     */
    public inline fun cfnBridgeOutputProps(
        block: CfnBridgeOutputPropsDsl.() -> Unit = {}
    ): CfnBridgeOutputProps {
        val builder = CfnBridgeOutputPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBridge`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnBridgeProps cfnBridgeProps = CfnBridgeProps.builder()
     * .name("name")
     * .placementArn("placementArn")
     * .sources(List.of(BridgeSourceProperty.builder()
     * .flowSource(BridgeFlowSourceProperty.builder()
     * .flowArn("flowArn")
     * .name("name")
     * // the properties below are optional
     * .flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build())
     * .build())
     * .networkSource(BridgeNetworkSourceProperty.builder()
     * .multicastIp("multicastIp")
     * .name("name")
     * .networkName("networkName")
     * .port(123)
     * .protocol("protocol")
     * .build())
     * .build()))
     * // the properties below are optional
     * .egressGatewayBridge(EgressGatewayBridgeProperty.builder()
     * .maxBitrate(123)
     * .build())
     * .ingressGatewayBridge(IngressGatewayBridgeProperty.builder()
     * .maxBitrate(123)
     * .maxOutputs(123)
     * .build())
     * .outputs(List.of(BridgeOutputProperty.builder()
     * .networkOutput(BridgeNetworkOutputProperty.builder()
     * .ipAddress("ipAddress")
     * .name("name")
     * .networkName("networkName")
     * .port(123)
     * .protocol("protocol")
     * .ttl(123)
     * .build())
     * .build()))
     * .sourceFailoverConfig(FailoverConfigProperty.builder()
     * .failoverMode("failoverMode")
     * // the properties below are optional
     * .sourcePriority(SourcePriorityProperty.builder()
     * .primarySource("primarySource")
     * .build())
     * .state("state")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html)
     */
    public inline fun cfnBridgeProps(block: CfnBridgePropsDsl.() -> Unit = {}): CfnBridgeProps {
        val builder = CfnBridgePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds sources to an existing bridge.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnBridgeSource cfnBridgeSource = CfnBridgeSource.Builder.create(this, "MyCfnBridgeSource")
     * .bridgeArn("bridgeArn")
     * .name("name")
     * // the properties below are optional
     * .flowSource(BridgeFlowSourceProperty.builder()
     * .flowArn("flowArn")
     * // the properties below are optional
     * .flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build())
     * .build())
     * .networkSource(BridgeNetworkSourceProperty.builder()
     * .multicastIp("multicastIp")
     * .networkName("networkName")
     * .port(123)
     * .protocol("protocol")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html)
     */
    public inline fun cfnBridgeSource(
        scope: Construct,
        id: String,
        block: CfnBridgeSourceDsl.() -> Unit = {},
    ): CfnBridgeSource {
        val builder = CfnBridgeSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The source of the bridge.
     *
     * A flow source originates in MediaConnect as an existing cloud flow.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * BridgeFlowSourceProperty bridgeFlowSourceProperty = BridgeFlowSourceProperty.builder()
     * .flowArn("flowArn")
     * // the properties below are optional
     * .flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgeflowsource.html)
     */
    public inline fun cfnBridgeSourceBridgeFlowSourceProperty(
        block: CfnBridgeSourceBridgeFlowSourcePropertyDsl.() -> Unit = {}
    ): CfnBridgeSource.BridgeFlowSourceProperty {
        val builder = CfnBridgeSourceBridgeFlowSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The source of the bridge.
     *
     * A network source originates at your premises.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * BridgeNetworkSourceProperty bridgeNetworkSourceProperty = BridgeNetworkSourceProperty.builder()
     * .multicastIp("multicastIp")
     * .networkName("networkName")
     * .port(123)
     * .protocol("protocol")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgenetworksource.html)
     */
    public inline fun cfnBridgeSourceBridgeNetworkSourceProperty(
        block: CfnBridgeSourceBridgeNetworkSourcePropertyDsl.() -> Unit = {}
    ): CfnBridgeSource.BridgeNetworkSourceProperty {
        val builder = CfnBridgeSourceBridgeNetworkSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The priority you want to assign to a source.
     *
     * You can have a primary stream and a backup stream or two equally prioritized streams. This
     * setting only applies when Failover Mode is set to FAILOVER.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * SourcePriorityProperty sourcePriorityProperty = SourcePriorityProperty.builder()
     * .primarySource("primarySource")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-sourcepriority.html)
     */
    public inline fun cfnBridgeSourcePriorityProperty(
        block: CfnBridgeSourcePriorityPropertyDsl.() -> Unit = {}
    ): CfnBridge.SourcePriorityProperty {
        val builder = CfnBridgeSourcePriorityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBridgeSource`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnBridgeSourceProps cfnBridgeSourceProps = CfnBridgeSourceProps.builder()
     * .bridgeArn("bridgeArn")
     * .name("name")
     * // the properties below are optional
     * .flowSource(BridgeFlowSourceProperty.builder()
     * .flowArn("flowArn")
     * // the properties below are optional
     * .flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build())
     * .build())
     * .networkSource(BridgeNetworkSourceProperty.builder()
     * .multicastIp("multicastIp")
     * .networkName("networkName")
     * .port(123)
     * .protocol("protocol")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html)
     */
    public inline fun cfnBridgeSourceProps(
        block: CfnBridgeSourcePropsDsl.() -> Unit = {}
    ): CfnBridgeSourceProps {
        val builder = CfnBridgeSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The VPC interface that you want to send your output to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * VpcInterfaceAttachmentProperty vpcInterfaceAttachmentProperty =
     * VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-vpcinterfaceattachment.html)
     */
    public inline fun cfnBridgeSourceVpcInterfaceAttachmentProperty(
        block: CfnBridgeSourceVpcInterfaceAttachmentPropertyDsl.() -> Unit = {}
    ): CfnBridgeSource.VpcInterfaceAttachmentProperty {
        val builder = CfnBridgeSourceVpcInterfaceAttachmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The VPC interface that you want to send your output to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * VpcInterfaceAttachmentProperty vpcInterfaceAttachmentProperty =
     * VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-vpcinterfaceattachment.html)
     */
    public inline fun cfnBridgeVpcInterfaceAttachmentProperty(
        block: CfnBridgeVpcInterfaceAttachmentPropertyDsl.() -> Unit = {}
    ): CfnBridge.VpcInterfaceAttachmentProperty {
        val builder = CfnBridgeVpcInterfaceAttachmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::MediaConnect::Flow resource defines a connection between one or more video sources
     * and one or more outputs.
     *
     * For each flow, you specify the transport protocol to use, encryption information, and details
     * for any outputs or entitlements that you want. AWS Elemental MediaConnect returns an ingest
     * endpoint where you can send your live video as a single unicast stream. The service
     * replicates and distributes the video to every output that you specify, whether inside or
     * outside the AWS Cloud. You can also set up entitlements on a flow to allow other AWS accounts
     * to access your content.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnFlow cfnFlow = CfnFlow.Builder.create(this, "MyCfnFlow")
     * .name("name")
     * .source(SourceProperty.builder()
     * .decryption(EncryptionProperty.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .algorithm("algorithm")
     * .constantInitializationVector("constantInitializationVector")
     * .deviceId("deviceId")
     * .keyType("keyType")
     * .region("region")
     * .resourceId("resourceId")
     * .secretArn("secretArn")
     * .url("url")
     * .build())
     * .description("description")
     * .entitlementArn("entitlementArn")
     * .gatewayBridgeSource(GatewayBridgeSourceProperty.builder()
     * .bridgeArn("bridgeArn")
     * // the properties below are optional
     * .vpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build())
     * .build())
     * .ingestIp("ingestIp")
     * .ingestPort(123)
     * .maxBitrate(123)
     * .maxLatency(123)
     * .minLatency(123)
     * .name("name")
     * .protocol("protocol")
     * .senderControlPort(123)
     * .senderIpAddress("senderIpAddress")
     * .sourceArn("sourceArn")
     * .sourceIngestPort("sourceIngestPort")
     * .sourceListenerAddress("sourceListenerAddress")
     * .sourceListenerPort(123)
     * .streamId("streamId")
     * .vpcInterfaceName("vpcInterfaceName")
     * .whitelistCidr("whitelistCidr")
     * .build())
     * // the properties below are optional
     * .availabilityZone("availabilityZone")
     * .sourceFailoverConfig(FailoverConfigProperty.builder()
     * .failoverMode("failoverMode")
     * .recoveryWindow(123)
     * .sourcePriority(SourcePriorityProperty.builder()
     * .primarySource("primarySource")
     * .build())
     * .state("state")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html)
     */
    public inline fun cfnFlow(
        scope: Construct,
        id: String,
        block: CfnFlowDsl.() -> Unit = {},
    ): CfnFlow {
        val builder = CfnFlowDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the encryption of the flow.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * EncryptionProperty encryptionProperty = EncryptionProperty.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .algorithm("algorithm")
     * .constantInitializationVector("constantInitializationVector")
     * .deviceId("deviceId")
     * .keyType("keyType")
     * .region("region")
     * .resourceId("resourceId")
     * .secretArn("secretArn")
     * .url("url")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html)
     */
    public inline fun cfnFlowEncryptionProperty(
        block: CfnFlowEncryptionPropertyDsl.() -> Unit = {}
    ): CfnFlow.EncryptionProperty {
        val builder = CfnFlowEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::MediaConnect::FlowEntitlement resource defines the permission that an AWS account
     * grants to another AWS account to allow access to the content in a specific AWS Elemental
     * MediaConnect flow.
     *
     * The content originator grants an entitlement to a specific AWS account (the subscriber). When
     * an entitlement is granted, the subscriber can create a flow using the originator's flow as
     * the source. Each flow can have up to 50 entitlements.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnFlowEntitlement cfnFlowEntitlement = CfnFlowEntitlement.Builder.create(this,
     * "MyCfnFlowEntitlement")
     * .description("description")
     * .flowArn("flowArn")
     * .name("name")
     * .subscribers(List.of("subscribers"))
     * // the properties below are optional
     * .dataTransferSubscriberFeePercent(123)
     * .encryption(EncryptionProperty.builder()
     * .algorithm("algorithm")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .constantInitializationVector("constantInitializationVector")
     * .deviceId("deviceId")
     * .keyType("keyType")
     * .region("region")
     * .resourceId("resourceId")
     * .secretArn("secretArn")
     * .url("url")
     * .build())
     * .entitlementStatus("entitlementStatus")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html)
     */
    public inline fun cfnFlowEntitlement(
        scope: Construct,
        id: String,
        block: CfnFlowEntitlementDsl.() -> Unit = {},
    ): CfnFlowEntitlement {
        val builder = CfnFlowEntitlementDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the encryption of the flow.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * EncryptionProperty encryptionProperty = EncryptionProperty.builder()
     * .algorithm("algorithm")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .constantInitializationVector("constantInitializationVector")
     * .deviceId("deviceId")
     * .keyType("keyType")
     * .region("region")
     * .resourceId("resourceId")
     * .secretArn("secretArn")
     * .url("url")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html)
     */
    public inline fun cfnFlowEntitlementEncryptionProperty(
        block: CfnFlowEntitlementEncryptionPropertyDsl.() -> Unit = {}
    ): CfnFlowEntitlement.EncryptionProperty {
        val builder = CfnFlowEntitlementEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFlowEntitlement`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnFlowEntitlementProps cfnFlowEntitlementProps = CfnFlowEntitlementProps.builder()
     * .description("description")
     * .flowArn("flowArn")
     * .name("name")
     * .subscribers(List.of("subscribers"))
     * // the properties below are optional
     * .dataTransferSubscriberFeePercent(123)
     * .encryption(EncryptionProperty.builder()
     * .algorithm("algorithm")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .constantInitializationVector("constantInitializationVector")
     * .deviceId("deviceId")
     * .keyType("keyType")
     * .region("region")
     * .resourceId("resourceId")
     * .secretArn("secretArn")
     * .url("url")
     * .build())
     * .entitlementStatus("entitlementStatus")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html)
     */
    public inline fun cfnFlowEntitlementProps(
        block: CfnFlowEntitlementPropsDsl.() -> Unit = {}
    ): CfnFlowEntitlementProps {
        val builder = CfnFlowEntitlementPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for source failover.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * FailoverConfigProperty failoverConfigProperty = FailoverConfigProperty.builder()
     * .failoverMode("failoverMode")
     * .recoveryWindow(123)
     * .sourcePriority(SourcePriorityProperty.builder()
     * .primarySource("primarySource")
     * .build())
     * .state("state")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-failoverconfig.html)
     */
    public inline fun cfnFlowFailoverConfigProperty(
        block: CfnFlowFailoverConfigPropertyDsl.() -> Unit = {}
    ): CfnFlow.FailoverConfigProperty {
        val builder = CfnFlowFailoverConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The source configuration for cloud flows receiving a stream from a bridge.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * GatewayBridgeSourceProperty gatewayBridgeSourceProperty = GatewayBridgeSourceProperty.builder()
     * .bridgeArn("bridgeArn")
     * // the properties below are optional
     * .vpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-gatewaybridgesource.html)
     */
    public inline fun cfnFlowGatewayBridgeSourceProperty(
        block: CfnFlowGatewayBridgeSourcePropertyDsl.() -> Unit = {}
    ): CfnFlow.GatewayBridgeSourceProperty {
        val builder = CfnFlowGatewayBridgeSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::MediaConnect::FlowOutput resource defines the destination address, protocol, and
     * port that AWS Elemental MediaConnect sends the ingested video to.
     *
     * Each flow can have up to 50 outputs. An output can have the same protocol or a different
     * protocol from the source. The following protocols are supported: RIST, RTP, RTP-FEC,
     * SRT-listener, SRT-caller, Zixi pull, Zixi push, and Fujitsu-QoS. CDI and ST 2110 JPEG XS
     * protocols are not currently supported by AWS CloudFormation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnFlowOutput cfnFlowOutput = CfnFlowOutput.Builder.create(this, "MyCfnFlowOutput")
     * .flowArn("flowArn")
     * .protocol("protocol")
     * // the properties below are optional
     * .cidrAllowList(List.of("cidrAllowList"))
     * .description("description")
     * .destination("destination")
     * .encryption(EncryptionProperty.builder()
     * .roleArn("roleArn")
     * .secretArn("secretArn")
     * // the properties below are optional
     * .algorithm("algorithm")
     * .keyType("keyType")
     * .build())
     * .maxLatency(123)
     * .minLatency(123)
     * .name("name")
     * .port(123)
     * .remoteId("remoteId")
     * .smoothingLatency(123)
     * .streamId("streamId")
     * .vpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html)
     */
    public inline fun cfnFlowOutput(
        scope: Construct,
        id: String,
        block: CfnFlowOutputDsl.() -> Unit = {},
    ): CfnFlowOutput {
        val builder = CfnFlowOutputDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the encryption of the flow.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * EncryptionProperty encryptionProperty = EncryptionProperty.builder()
     * .roleArn("roleArn")
     * .secretArn("secretArn")
     * // the properties below are optional
     * .algorithm("algorithm")
     * .keyType("keyType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-encryption.html)
     */
    public inline fun cfnFlowOutputEncryptionProperty(
        block: CfnFlowOutputEncryptionPropertyDsl.() -> Unit = {}
    ): CfnFlowOutput.EncryptionProperty {
        val builder = CfnFlowOutputEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFlowOutput`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnFlowOutputProps cfnFlowOutputProps = CfnFlowOutputProps.builder()
     * .flowArn("flowArn")
     * .protocol("protocol")
     * // the properties below are optional
     * .cidrAllowList(List.of("cidrAllowList"))
     * .description("description")
     * .destination("destination")
     * .encryption(EncryptionProperty.builder()
     * .roleArn("roleArn")
     * .secretArn("secretArn")
     * // the properties below are optional
     * .algorithm("algorithm")
     * .keyType("keyType")
     * .build())
     * .maxLatency(123)
     * .minLatency(123)
     * .name("name")
     * .port(123)
     * .remoteId("remoteId")
     * .smoothingLatency(123)
     * .streamId("streamId")
     * .vpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html)
     */
    public inline fun cfnFlowOutputProps(
        block: CfnFlowOutputPropsDsl.() -> Unit = {}
    ): CfnFlowOutputProps {
        val builder = CfnFlowOutputPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The VPC interface that you want to send your output to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * VpcInterfaceAttachmentProperty vpcInterfaceAttachmentProperty =
     * VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-vpcinterfaceattachment.html)
     */
    public inline fun cfnFlowOutputVpcInterfaceAttachmentProperty(
        block: CfnFlowOutputVpcInterfaceAttachmentPropertyDsl.() -> Unit = {}
    ): CfnFlowOutput.VpcInterfaceAttachmentProperty {
        val builder = CfnFlowOutputVpcInterfaceAttachmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFlow`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnFlowProps cfnFlowProps = CfnFlowProps.builder()
     * .name("name")
     * .source(SourceProperty.builder()
     * .decryption(EncryptionProperty.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .algorithm("algorithm")
     * .constantInitializationVector("constantInitializationVector")
     * .deviceId("deviceId")
     * .keyType("keyType")
     * .region("region")
     * .resourceId("resourceId")
     * .secretArn("secretArn")
     * .url("url")
     * .build())
     * .description("description")
     * .entitlementArn("entitlementArn")
     * .gatewayBridgeSource(GatewayBridgeSourceProperty.builder()
     * .bridgeArn("bridgeArn")
     * // the properties below are optional
     * .vpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build())
     * .build())
     * .ingestIp("ingestIp")
     * .ingestPort(123)
     * .maxBitrate(123)
     * .maxLatency(123)
     * .minLatency(123)
     * .name("name")
     * .protocol("protocol")
     * .senderControlPort(123)
     * .senderIpAddress("senderIpAddress")
     * .sourceArn("sourceArn")
     * .sourceIngestPort("sourceIngestPort")
     * .sourceListenerAddress("sourceListenerAddress")
     * .sourceListenerPort(123)
     * .streamId("streamId")
     * .vpcInterfaceName("vpcInterfaceName")
     * .whitelistCidr("whitelistCidr")
     * .build())
     * // the properties below are optional
     * .availabilityZone("availabilityZone")
     * .sourceFailoverConfig(FailoverConfigProperty.builder()
     * .failoverMode("failoverMode")
     * .recoveryWindow(123)
     * .sourcePriority(SourcePriorityProperty.builder()
     * .primarySource("primarySource")
     * .build())
     * .state("state")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html)
     */
    public inline fun cfnFlowProps(block: CfnFlowPropsDsl.() -> Unit = {}): CfnFlowProps {
        val builder = CfnFlowPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::MediaConnect::FlowSource resource is used to add additional sources to an existing
     * flow.
     *
     * Adding an additional source requires Failover to be enabled. When you enable Failover, the
     * additional source must use the same protocol as the existing source. A source is the external
     * video content that includes configuration information (encryption and source type) and a
     * network address. Each flow has at least one source. A standard source comes from a source
     * other than another AWS Elemental MediaConnect flow, such as an on-premises encoder.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnFlowSource cfnFlowSource = CfnFlowSource.Builder.create(this, "MyCfnFlowSource")
     * .description("description")
     * .name("name")
     * // the properties below are optional
     * .decryption(EncryptionProperty.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .algorithm("algorithm")
     * .constantInitializationVector("constantInitializationVector")
     * .deviceId("deviceId")
     * .keyType("keyType")
     * .region("region")
     * .resourceId("resourceId")
     * .secretArn("secretArn")
     * .url("url")
     * .build())
     * .entitlementArn("entitlementArn")
     * .flowArn("flowArn")
     * .gatewayBridgeSource(GatewayBridgeSourceProperty.builder()
     * .bridgeArn("bridgeArn")
     * // the properties below are optional
     * .vpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build())
     * .build())
     * .ingestPort(123)
     * .maxBitrate(123)
     * .maxLatency(123)
     * .minLatency(123)
     * .protocol("protocol")
     * .senderControlPort(123)
     * .senderIpAddress("senderIpAddress")
     * .sourceListenerAddress("sourceListenerAddress")
     * .sourceListenerPort(123)
     * .streamId("streamId")
     * .vpcInterfaceName("vpcInterfaceName")
     * .whitelistCidr("whitelistCidr")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html)
     */
    public inline fun cfnFlowSource(
        scope: Construct,
        id: String,
        block: CfnFlowSourceDsl.() -> Unit = {},
    ): CfnFlowSource {
        val builder = CfnFlowSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the encryption of the flow.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * EncryptionProperty encryptionProperty = EncryptionProperty.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .algorithm("algorithm")
     * .constantInitializationVector("constantInitializationVector")
     * .deviceId("deviceId")
     * .keyType("keyType")
     * .region("region")
     * .resourceId("resourceId")
     * .secretArn("secretArn")
     * .url("url")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html)
     */
    public inline fun cfnFlowSourceEncryptionProperty(
        block: CfnFlowSourceEncryptionPropertyDsl.() -> Unit = {}
    ): CfnFlowSource.EncryptionProperty {
        val builder = CfnFlowSourceEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The source configuration for cloud flows receiving a stream from a bridge.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * GatewayBridgeSourceProperty gatewayBridgeSourceProperty = GatewayBridgeSourceProperty.builder()
     * .bridgeArn("bridgeArn")
     * // the properties below are optional
     * .vpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-gatewaybridgesource.html)
     */
    public inline fun cfnFlowSourceGatewayBridgeSourceProperty(
        block: CfnFlowSourceGatewayBridgeSourcePropertyDsl.() -> Unit = {}
    ): CfnFlowSource.GatewayBridgeSourceProperty {
        val builder = CfnFlowSourceGatewayBridgeSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The priority you want to assign to a source.
     *
     * You can have a primary stream and a backup stream or two equally prioritized streams. This
     * setting only applies when Failover Mode is set to FAILOVER.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * SourcePriorityProperty sourcePriorityProperty = SourcePriorityProperty.builder()
     * .primarySource("primarySource")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-sourcepriority.html)
     */
    public inline fun cfnFlowSourcePriorityProperty(
        block: CfnFlowSourcePriorityPropertyDsl.() -> Unit = {}
    ): CfnFlow.SourcePriorityProperty {
        val builder = CfnFlowSourcePriorityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of the sources of the flow.
     *
     * If you are creating a flow with a VPC source, you must first create the flow with a temporary
     * standard source by doing the following:
     * * Use CloudFormation to create a flow with a standard source that uses the flow’s public IP
     *   address.
     * * Use CloudFormation to create the VPC interface to add to this flow. This can also be done
     *   as part of the previous step.
     * * After CloudFormation has created the flow and the VPC interface, update the source to point
     *   to the VPC interface that you created.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * SourceProperty sourceProperty = SourceProperty.builder()
     * .decryption(EncryptionProperty.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .algorithm("algorithm")
     * .constantInitializationVector("constantInitializationVector")
     * .deviceId("deviceId")
     * .keyType("keyType")
     * .region("region")
     * .resourceId("resourceId")
     * .secretArn("secretArn")
     * .url("url")
     * .build())
     * .description("description")
     * .entitlementArn("entitlementArn")
     * .gatewayBridgeSource(GatewayBridgeSourceProperty.builder()
     * .bridgeArn("bridgeArn")
     * // the properties below are optional
     * .vpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build())
     * .build())
     * .ingestIp("ingestIp")
     * .ingestPort(123)
     * .maxBitrate(123)
     * .maxLatency(123)
     * .minLatency(123)
     * .name("name")
     * .protocol("protocol")
     * .senderControlPort(123)
     * .senderIpAddress("senderIpAddress")
     * .sourceArn("sourceArn")
     * .sourceIngestPort("sourceIngestPort")
     * .sourceListenerAddress("sourceListenerAddress")
     * .sourceListenerPort(123)
     * .streamId("streamId")
     * .vpcInterfaceName("vpcInterfaceName")
     * .whitelistCidr("whitelistCidr")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html)
     */
    public inline fun cfnFlowSourceProperty(
        block: CfnFlowSourcePropertyDsl.() -> Unit = {}
    ): CfnFlow.SourceProperty {
        val builder = CfnFlowSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFlowSource`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnFlowSourceProps cfnFlowSourceProps = CfnFlowSourceProps.builder()
     * .description("description")
     * .name("name")
     * // the properties below are optional
     * .decryption(EncryptionProperty.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .algorithm("algorithm")
     * .constantInitializationVector("constantInitializationVector")
     * .deviceId("deviceId")
     * .keyType("keyType")
     * .region("region")
     * .resourceId("resourceId")
     * .secretArn("secretArn")
     * .url("url")
     * .build())
     * .entitlementArn("entitlementArn")
     * .flowArn("flowArn")
     * .gatewayBridgeSource(GatewayBridgeSourceProperty.builder()
     * .bridgeArn("bridgeArn")
     * // the properties below are optional
     * .vpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build())
     * .build())
     * .ingestPort(123)
     * .maxBitrate(123)
     * .maxLatency(123)
     * .minLatency(123)
     * .protocol("protocol")
     * .senderControlPort(123)
     * .senderIpAddress("senderIpAddress")
     * .sourceListenerAddress("sourceListenerAddress")
     * .sourceListenerPort(123)
     * .streamId("streamId")
     * .vpcInterfaceName("vpcInterfaceName")
     * .whitelistCidr("whitelistCidr")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html)
     */
    public inline fun cfnFlowSourceProps(
        block: CfnFlowSourcePropsDsl.() -> Unit = {}
    ): CfnFlowSourceProps {
        val builder = CfnFlowSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The VPC interface that you want to send your output to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * VpcInterfaceAttachmentProperty vpcInterfaceAttachmentProperty =
     * VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-vpcinterfaceattachment.html)
     */
    public inline fun cfnFlowSourceVpcInterfaceAttachmentProperty(
        block: CfnFlowSourceVpcInterfaceAttachmentPropertyDsl.() -> Unit = {}
    ): CfnFlowSource.VpcInterfaceAttachmentProperty {
        val builder = CfnFlowSourceVpcInterfaceAttachmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::MediaConnect::FlowVpcInterface resource is a connection between your AWS Elemental
     * MediaConnect flow and a virtual private cloud (VPC) that you created using the Amazon Virtual
     * Private Cloud service.
     *
     * To avoid streaming your content over the public internet, you can add up to two VPC
     * interfaces to your flow and use those connections to transfer content between your VPC and
     * MediaConnect.
     *
     * You can update an existing flow to add a VPC interface. If you haven’t created the flow yet,
     * you must create the flow with a temporary standard source by doing the following:
     * * Use CloudFormation to create a flow with a standard source that uses to the flow’s public
     *   IP address.
     * * Use CloudFormation to create a VPC interface to add to this flow. This can also be done as
     *   part of the previous step.
     * * After CloudFormation has created the flow and the VPC interface, update the source to point
     *   to the VPC interface that you created.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnFlowVpcInterface cfnFlowVpcInterface = CfnFlowVpcInterface.Builder.create(this,
     * "MyCfnFlowVpcInterface")
     * .flowArn("flowArn")
     * .name("name")
     * .roleArn("roleArn")
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetId("subnetId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html)
     */
    public inline fun cfnFlowVpcInterface(
        scope: Construct,
        id: String,
        block: CfnFlowVpcInterfaceDsl.() -> Unit = {},
    ): CfnFlowVpcInterface {
        val builder = CfnFlowVpcInterfaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The VPC interface that you want to send your output to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * VpcInterfaceAttachmentProperty vpcInterfaceAttachmentProperty =
     * VpcInterfaceAttachmentProperty.builder()
     * .vpcInterfaceName("vpcInterfaceName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterfaceattachment.html)
     */
    public inline fun cfnFlowVpcInterfaceAttachmentProperty(
        block: CfnFlowVpcInterfaceAttachmentPropertyDsl.() -> Unit = {}
    ): CfnFlow.VpcInterfaceAttachmentProperty {
        val builder = CfnFlowVpcInterfaceAttachmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFlowVpcInterface`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnFlowVpcInterfaceProps cfnFlowVpcInterfaceProps = CfnFlowVpcInterfaceProps.builder()
     * .flowArn("flowArn")
     * .name("name")
     * .roleArn("roleArn")
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetId("subnetId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html)
     */
    public inline fun cfnFlowVpcInterfaceProps(
        block: CfnFlowVpcInterfacePropsDsl.() -> Unit = {}
    ): CfnFlowVpcInterfaceProps {
        val builder = CfnFlowVpcInterfacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::MediaConnect::Gateway resource is used to create a new gateway.
     *
     * AWS Elemental MediaConnect Gateway is a feature of MediaConnect that allows the deployment of
     * on-premises resources for transporting live video to and from the AWS Cloud. MediaConnect
     * Gateway allows you to contribute live video to the AWS Cloud from on-premises hardware, as
     * well as distribute live video from the AWS Cloud to your local data center.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnGateway cfnGateway = CfnGateway.Builder.create(this, "MyCfnGateway")
     * .egressCidrBlocks(List.of("egressCidrBlocks"))
     * .name("name")
     * .networks(List.of(GatewayNetworkProperty.builder()
     * .cidrBlock("cidrBlock")
     * .name("name")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html)
     */
    public inline fun cfnGateway(
        scope: Construct,
        id: String,
        block: CfnGatewayDsl.() -> Unit = {},
    ): CfnGateway {
        val builder = CfnGatewayDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The network settings for a gateway.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * GatewayNetworkProperty gatewayNetworkProperty = GatewayNetworkProperty.builder()
     * .cidrBlock("cidrBlock")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-gateway-gatewaynetwork.html)
     */
    public inline fun cfnGatewayGatewayNetworkProperty(
        block: CfnGatewayGatewayNetworkPropertyDsl.() -> Unit = {}
    ): CfnGateway.GatewayNetworkProperty {
        val builder = CfnGatewayGatewayNetworkPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGateway`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconnect.*;
     * CfnGatewayProps cfnGatewayProps = CfnGatewayProps.builder()
     * .egressCidrBlocks(List.of("egressCidrBlocks"))
     * .name("name")
     * .networks(List.of(GatewayNetworkProperty.builder()
     * .cidrBlock("cidrBlock")
     * .name("name")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html)
     */
    public inline fun cfnGatewayProps(block: CfnGatewayPropsDsl.() -> Unit = {}): CfnGatewayProps {
        val builder = CfnGatewayPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
