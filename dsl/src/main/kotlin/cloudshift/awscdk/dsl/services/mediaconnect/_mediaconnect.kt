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

package cloudshift.awscdk.dsl.services.mediaconnect

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
import kotlin.String
import kotlin.Unit

public object mediaconnect {
    public inline fun cfnBridge(
        scope: Construct,
        id: String,
        block: CfnBridgeDsl.() -> Unit = {},
    ): CfnBridge {
        val builder = CfnBridgeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeBridgeFlowSourceProperty(
        block: CfnBridgeBridgeFlowSourcePropertyDsl.() -> Unit =
            {},
    ): CfnBridge.BridgeFlowSourceProperty {
        val builder = CfnBridgeBridgeFlowSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeBridgeNetworkOutputProperty(
        block: CfnBridgeBridgeNetworkOutputPropertyDsl.() -> Unit =
            {},
    ): CfnBridge.BridgeNetworkOutputProperty {
        val builder = CfnBridgeBridgeNetworkOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeBridgeNetworkSourceProperty(
        block: CfnBridgeBridgeNetworkSourcePropertyDsl.() -> Unit =
            {},
    ): CfnBridge.BridgeNetworkSourceProperty {
        val builder = CfnBridgeBridgeNetworkSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeBridgeOutputProperty(
        block: CfnBridgeBridgeOutputPropertyDsl.() -> Unit =
            {},
    ): CfnBridge.BridgeOutputProperty {
        val builder = CfnBridgeBridgeOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeBridgeSourceProperty(
        block: CfnBridgeBridgeSourcePropertyDsl.() -> Unit =
            {},
    ): CfnBridge.BridgeSourceProperty {
        val builder = CfnBridgeBridgeSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeEgressGatewayBridgeProperty(
        block: CfnBridgeEgressGatewayBridgePropertyDsl.() -> Unit =
            {},
    ): CfnBridge.EgressGatewayBridgeProperty {
        val builder = CfnBridgeEgressGatewayBridgePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeFailoverConfigProperty(
        block: CfnBridgeFailoverConfigPropertyDsl.() -> Unit =
            {},
    ): CfnBridge.FailoverConfigProperty {
        val builder = CfnBridgeFailoverConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeIngressGatewayBridgeProperty(
        block: CfnBridgeIngressGatewayBridgePropertyDsl.() -> Unit =
            {},
    ): CfnBridge.IngressGatewayBridgeProperty {
        val builder = CfnBridgeIngressGatewayBridgePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeOutput(
        scope: Construct,
        id: String,
        block: CfnBridgeOutputDsl.() -> Unit = {},
    ): CfnBridgeOutput {
        val builder = CfnBridgeOutputDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeOutputBridgeNetworkOutputProperty(
        block: CfnBridgeOutputBridgeNetworkOutputPropertyDsl.() -> Unit =
            {},
    ): CfnBridgeOutput.BridgeNetworkOutputProperty {
        val builder = CfnBridgeOutputBridgeNetworkOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeOutputProps(block: CfnBridgeOutputPropsDsl.() -> Unit = {}): CfnBridgeOutputProps {
        val builder = CfnBridgeOutputPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeProps(block: CfnBridgePropsDsl.() -> Unit = {}): CfnBridgeProps {
        val builder = CfnBridgePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeSource(
        scope: Construct,
        id: String,
        block: CfnBridgeSourceDsl.() -> Unit = {},
    ): CfnBridgeSource {
        val builder = CfnBridgeSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeSourceBridgeFlowSourceProperty(
        block: CfnBridgeSourceBridgeFlowSourcePropertyDsl.() -> Unit =
            {},
    ): CfnBridgeSource.BridgeFlowSourceProperty {
        val builder = CfnBridgeSourceBridgeFlowSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeSourceBridgeNetworkSourceProperty(
        block: CfnBridgeSourceBridgeNetworkSourcePropertyDsl.() -> Unit =
            {},
    ): CfnBridgeSource.BridgeNetworkSourceProperty {
        val builder = CfnBridgeSourceBridgeNetworkSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeSourcePriorityProperty(
        block: CfnBridgeSourcePriorityPropertyDsl.() -> Unit =
            {},
    ): CfnBridge.SourcePriorityProperty {
        val builder = CfnBridgeSourcePriorityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeSourceProps(block: CfnBridgeSourcePropsDsl.() -> Unit = {}): CfnBridgeSourceProps {
        val builder = CfnBridgeSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeSourceVpcInterfaceAttachmentProperty(
        block: CfnBridgeSourceVpcInterfaceAttachmentPropertyDsl.() -> Unit =
            {},
    ): CfnBridgeSource.VpcInterfaceAttachmentProperty {
        val builder = CfnBridgeSourceVpcInterfaceAttachmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBridgeVpcInterfaceAttachmentProperty(
        block: CfnBridgeVpcInterfaceAttachmentPropertyDsl.() -> Unit =
            {},
    ): CfnBridge.VpcInterfaceAttachmentProperty {
        val builder = CfnBridgeVpcInterfaceAttachmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlow(
        scope: Construct,
        id: String,
        block: CfnFlowDsl.() -> Unit = {},
    ): CfnFlow {
        val builder = CfnFlowDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowEncryptionProperty(block: CfnFlowEncryptionPropertyDsl.() -> Unit = {}): CfnFlow.EncryptionProperty {
        val builder = CfnFlowEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowEntitlement(
        scope: Construct,
        id: String,
        block: CfnFlowEntitlementDsl.() -> Unit = {},
    ): CfnFlowEntitlement {
        val builder = CfnFlowEntitlementDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowEntitlementEncryptionProperty(
        block: CfnFlowEntitlementEncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnFlowEntitlement.EncryptionProperty {
        val builder = CfnFlowEntitlementEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowEntitlementProps(block: CfnFlowEntitlementPropsDsl.() -> Unit = {}): CfnFlowEntitlementProps {
        val builder = CfnFlowEntitlementPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowFailoverConfigProperty(
        block: CfnFlowFailoverConfigPropertyDsl.() -> Unit =
            {},
    ): CfnFlow.FailoverConfigProperty {
        val builder = CfnFlowFailoverConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowGatewayBridgeSourceProperty(
        block: CfnFlowGatewayBridgeSourcePropertyDsl.() -> Unit =
            {},
    ): CfnFlow.GatewayBridgeSourceProperty {
        val builder = CfnFlowGatewayBridgeSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowOutput(
        scope: Construct,
        id: String,
        block: CfnFlowOutputDsl.() -> Unit = {},
    ): CfnFlowOutput {
        val builder = CfnFlowOutputDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowOutputEncryptionProperty(
        block: CfnFlowOutputEncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnFlowOutput.EncryptionProperty {
        val builder = CfnFlowOutputEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowOutputProps(block: CfnFlowOutputPropsDsl.() -> Unit = {}): CfnFlowOutputProps {
        val builder = CfnFlowOutputPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowOutputVpcInterfaceAttachmentProperty(
        block: CfnFlowOutputVpcInterfaceAttachmentPropertyDsl.() -> Unit =
            {},
    ): CfnFlowOutput.VpcInterfaceAttachmentProperty {
        val builder = CfnFlowOutputVpcInterfaceAttachmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowProps(block: CfnFlowPropsDsl.() -> Unit = {}): CfnFlowProps {
        val builder = CfnFlowPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowSource(
        scope: Construct,
        id: String,
        block: CfnFlowSourceDsl.() -> Unit = {},
    ): CfnFlowSource {
        val builder = CfnFlowSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowSourceEncryptionProperty(
        block: CfnFlowSourceEncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnFlowSource.EncryptionProperty {
        val builder = CfnFlowSourceEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowSourceGatewayBridgeSourceProperty(
        block: CfnFlowSourceGatewayBridgeSourcePropertyDsl.() -> Unit =
            {},
    ): CfnFlowSource.GatewayBridgeSourceProperty {
        val builder = CfnFlowSourceGatewayBridgeSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowSourcePriorityProperty(
        block: CfnFlowSourcePriorityPropertyDsl.() -> Unit =
            {},
    ): CfnFlow.SourcePriorityProperty {
        val builder = CfnFlowSourcePriorityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowSourceProperty(block: CfnFlowSourcePropertyDsl.() -> Unit = {}): CfnFlow.SourceProperty {
        val builder = CfnFlowSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowSourceProps(block: CfnFlowSourcePropsDsl.() -> Unit = {}): CfnFlowSourceProps {
        val builder = CfnFlowSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowSourceVpcInterfaceAttachmentProperty(
        block: CfnFlowSourceVpcInterfaceAttachmentPropertyDsl.() -> Unit =
            {},
    ): CfnFlowSource.VpcInterfaceAttachmentProperty {
        val builder = CfnFlowSourceVpcInterfaceAttachmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowVpcInterface(
        scope: Construct,
        id: String,
        block: CfnFlowVpcInterfaceDsl.() -> Unit = {},
    ): CfnFlowVpcInterface {
        val builder = CfnFlowVpcInterfaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowVpcInterfaceAttachmentProperty(
        block: CfnFlowVpcInterfaceAttachmentPropertyDsl.() -> Unit =
            {},
    ): CfnFlow.VpcInterfaceAttachmentProperty {
        val builder = CfnFlowVpcInterfaceAttachmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlowVpcInterfaceProps(block: CfnFlowVpcInterfacePropsDsl.() -> Unit = {}): CfnFlowVpcInterfaceProps {
        val builder = CfnFlowVpcInterfacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGateway(
        scope: Construct,
        id: String,
        block: CfnGatewayDsl.() -> Unit = {},
    ): CfnGateway {
        val builder = CfnGatewayDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayGatewayNetworkProperty(
        block: CfnGatewayGatewayNetworkPropertyDsl.() -> Unit =
            {},
    ): CfnGateway.GatewayNetworkProperty {
        val builder = CfnGatewayGatewayNetworkPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayProps(block: CfnGatewayPropsDsl.() -> Unit = {}): CfnGatewayProps {
        val builder = CfnGatewayPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
