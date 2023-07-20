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
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSource
import software.amazon.awscdk.services.mediaconnect.CfnFlow
import software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement
import software.amazon.awscdk.services.mediaconnect.CfnFlowOutput
import software.amazon.awscdk.services.mediaconnect.CfnFlowSource
import kotlin.Unit

public inline fun CfnBridgeSource.setFlowSource(
    block: CfnBridgeSourceBridgeFlowSourcePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnBridgeSourceBridgeFlowSourcePropertyDsl()
    builder.apply(block)
    return setFlowSource(builder.build())
}

public inline fun CfnBridgeSource.setNetworkSource(
    block: CfnBridgeSourceBridgeNetworkSourcePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnBridgeSourceBridgeNetworkSourcePropertyDsl()
    builder.apply(block)
    return setNetworkSource(builder.build())
}

public inline fun CfnFlow.setSource(block: CfnFlowSourcePropertyDsl.() -> Unit = {}) {
    val builder = CfnFlowSourcePropertyDsl()
    builder.apply(block)
    return setSource(builder.build())
}

public inline fun CfnFlow.setSourceFailoverConfig(
    block: CfnFlowFailoverConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnFlowFailoverConfigPropertyDsl()
    builder.apply(block)
    return setSourceFailoverConfig(builder.build())
}

public inline fun CfnBridge.setEgressGatewayBridge(
    block: CfnBridgeEgressGatewayBridgePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnBridgeEgressGatewayBridgePropertyDsl()
    builder.apply(block)
    return setEgressGatewayBridge(builder.build())
}

public inline fun CfnBridge.setIngressGatewayBridge(
    block: CfnBridgeIngressGatewayBridgePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnBridgeIngressGatewayBridgePropertyDsl()
    builder.apply(block)
    return setIngressGatewayBridge(builder.build())
}

public inline fun CfnBridge.setSourceFailoverConfig(
    block: CfnBridgeFailoverConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnBridgeFailoverConfigPropertyDsl()
    builder.apply(block)
    return setSourceFailoverConfig(builder.build())
}

public inline fun CfnBridgeOutput.setNetworkOutput(
    block: CfnBridgeOutputBridgeNetworkOutputPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnBridgeOutputBridgeNetworkOutputPropertyDsl()
    builder.apply(block)
    return setNetworkOutput(builder.build())
}

public inline fun CfnFlowOutput.setEncryption(
    block: CfnFlowOutputEncryptionPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnFlowOutputEncryptionPropertyDsl()
    builder.apply(block)
    return setEncryption(builder.build())
}

public inline fun CfnFlowOutput.setVpcInterfaceAttachment(
    block: CfnFlowOutputVpcInterfaceAttachmentPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnFlowOutputVpcInterfaceAttachmentPropertyDsl()
    builder.apply(block)
    return setVpcInterfaceAttachment(builder.build())
}

public inline fun CfnFlowSource.setDecryption(
    block: CfnFlowSourceEncryptionPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnFlowSourceEncryptionPropertyDsl()
    builder.apply(block)
    return setDecryption(builder.build())
}

public inline fun CfnFlowSource.setGatewayBridgeSource(
    block: CfnFlowSourceGatewayBridgeSourcePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnFlowSourceGatewayBridgeSourcePropertyDsl()
    builder.apply(block)
    return setGatewayBridgeSource(builder.build())
}

public inline fun CfnFlowEntitlement.setEncryption(
    block: CfnFlowEntitlementEncryptionPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnFlowEntitlementEncryptionPropertyDsl()
    builder.apply(block)
    return setEncryption(builder.build())
}
