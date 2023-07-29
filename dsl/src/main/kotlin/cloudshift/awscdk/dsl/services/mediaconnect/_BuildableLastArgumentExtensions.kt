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

package cloudshift.awscdk.dsl.services.mediaconnect

import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnBridge
import software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSource
import software.amazon.awscdk.services.mediaconnect.CfnFlow
import software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement
import software.amazon.awscdk.services.mediaconnect.CfnFlowOutput
import software.amazon.awscdk.services.mediaconnect.CfnFlowSource

/** Add a flow source to an existing bridge. */
public inline fun CfnBridgeSource.setFlowSource(
    block: CfnBridgeSourceBridgeFlowSourcePropertyDsl.() -> Unit = {}
) {
    val builder = CfnBridgeSourceBridgeFlowSourcePropertyDsl()
    builder.apply(block)
    return setFlowSource(builder.build())
}

/** Add a network source to an existing bridge. */
public inline fun CfnBridgeSource.setNetworkSource(
    block: CfnBridgeSourceBridgeNetworkSourcePropertyDsl.() -> Unit = {}
) {
    val builder = CfnBridgeSourceBridgeNetworkSourcePropertyDsl()
    builder.apply(block)
    return setNetworkSource(builder.build())
}

/** The settings for the source that you want to use for the new flow. */
public inline fun CfnFlow.setSource(block: CfnFlowSourcePropertyDsl.() -> Unit = {}) {
    val builder = CfnFlowSourcePropertyDsl()
    builder.apply(block)
    return setSource(builder.build())
}

/** The settings for source failover. */
public inline fun CfnFlow.setSourceFailoverConfig(
    block: CfnFlowFailoverConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFlowFailoverConfigPropertyDsl()
    builder.apply(block)
    return setSourceFailoverConfig(builder.build())
}

/** Create a bridge with the egress bridge type. */
public inline fun CfnBridge.setEgressGatewayBridge(
    block: CfnBridgeEgressGatewayBridgePropertyDsl.() -> Unit = {}
) {
    val builder = CfnBridgeEgressGatewayBridgePropertyDsl()
    builder.apply(block)
    return setEgressGatewayBridge(builder.build())
}

/** Create a bridge with the ingress bridge type. */
public inline fun CfnBridge.setIngressGatewayBridge(
    block: CfnBridgeIngressGatewayBridgePropertyDsl.() -> Unit = {}
) {
    val builder = CfnBridgeIngressGatewayBridgePropertyDsl()
    builder.apply(block)
    return setIngressGatewayBridge(builder.build())
}

/** The settings for source failover. */
public inline fun CfnBridge.setSourceFailoverConfig(
    block: CfnBridgeFailoverConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBridgeFailoverConfigPropertyDsl()
    builder.apply(block)
    return setSourceFailoverConfig(builder.build())
}

/** Add a network output to an existing bridge. */
public inline fun CfnBridgeOutput.setNetworkOutput(
    block: CfnBridgeOutputBridgeNetworkOutputPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBridgeOutputBridgeNetworkOutputPropertyDsl()
    builder.apply(block)
    return setNetworkOutput(builder.build())
}

/** The encryption credentials that you want to use for the output. */
public inline fun CfnFlowOutput.setEncryption(
    block: CfnFlowOutputEncryptionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFlowOutputEncryptionPropertyDsl()
    builder.apply(block)
    return setEncryption(builder.build())
}

/** The VPC interface that you want to send your output to. */
public inline fun CfnFlowOutput.setVpcInterfaceAttachment(
    block: CfnFlowOutputVpcInterfaceAttachmentPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFlowOutputVpcInterfaceAttachmentPropertyDsl()
    builder.apply(block)
    return setVpcInterfaceAttachment(builder.build())
}

/** The type of encryption that is used on the content ingested from the source. */
public inline fun CfnFlowSource.setDecryption(
    block: CfnFlowSourceEncryptionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFlowSourceEncryptionPropertyDsl()
    builder.apply(block)
    return setDecryption(builder.build())
}

/** The source configuration for cloud flows receiving a stream from a bridge. */
public inline fun CfnFlowSource.setGatewayBridgeSource(
    block: CfnFlowSourceGatewayBridgeSourcePropertyDsl.() -> Unit = {}
) {
    val builder = CfnFlowSourceGatewayBridgeSourcePropertyDsl()
    builder.apply(block)
    return setGatewayBridgeSource(builder.build())
}

/**
 * The type of encryption that MediaConnect will use on the output that is associated with the
 * entitlement.
 */
public inline fun CfnFlowEntitlement.setEncryption(
    block: CfnFlowEntitlementEncryptionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFlowEntitlementEncryptionPropertyDsl()
    builder.apply(block)
    return setEncryption(builder.build())
}
