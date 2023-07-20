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

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnFlowSource
import software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnFlowSourcePropsDsl {
    private val cdkBuilder: CfnFlowSourceProps.Builder = CfnFlowSourceProps.builder()

    public fun decryption(decryption: IResolvable) {
        cdkBuilder.decryption(decryption)
    }

    public fun decryption(decryption: CfnFlowSource.EncryptionProperty) {
        cdkBuilder.decryption(decryption)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun entitlementArn(entitlementArn: String) {
        cdkBuilder.entitlementArn(entitlementArn)
    }

    public fun flowArn(flowArn: String) {
        cdkBuilder.flowArn(flowArn)
    }

    public fun gatewayBridgeSource(gatewayBridgeSource: IResolvable) {
        cdkBuilder.gatewayBridgeSource(gatewayBridgeSource)
    }

    public fun gatewayBridgeSource(gatewayBridgeSource: CfnFlowSource.GatewayBridgeSourceProperty) {
        cdkBuilder.gatewayBridgeSource(gatewayBridgeSource)
    }

    public fun ingestPort(ingestPort: Number) {
        cdkBuilder.ingestPort(ingestPort)
    }

    public fun maxBitrate(maxBitrate: Number) {
        cdkBuilder.maxBitrate(maxBitrate)
    }

    public fun maxLatency(maxLatency: Number) {
        cdkBuilder.maxLatency(maxLatency)
    }

    public fun minLatency(minLatency: Number) {
        cdkBuilder.minLatency(minLatency)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun senderControlPort(senderControlPort: Number) {
        cdkBuilder.senderControlPort(senderControlPort)
    }

    public fun senderIpAddress(senderIpAddress: String) {
        cdkBuilder.senderIpAddress(senderIpAddress)
    }

    public fun sourceListenerAddress(sourceListenerAddress: String) {
        cdkBuilder.sourceListenerAddress(sourceListenerAddress)
    }

    public fun sourceListenerPort(sourceListenerPort: Number) {
        cdkBuilder.sourceListenerPort(sourceListenerPort)
    }

    public fun streamId(streamId: String) {
        cdkBuilder.streamId(streamId)
    }

    public fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
    }

    public fun whitelistCidr(whitelistCidr: String) {
        cdkBuilder.whitelistCidr(whitelistCidr)
    }

    public fun build(): CfnFlowSourceProps = cdkBuilder.build()
}
