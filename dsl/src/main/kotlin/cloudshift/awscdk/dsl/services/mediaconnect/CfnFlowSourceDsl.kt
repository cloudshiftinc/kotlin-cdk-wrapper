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

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnFlowSource
import software.constructs.Construct

/**
 * The AWS::MediaConnect::FlowSource resource is used to add additional sources to an existing flow.
 *
 * Adding an additional source requires Failover to be enabled. When you enable Failover, the
 * additional source must use the same protocol as the existing source. A source is the external
 * video content that includes configuration information (encryption and source type) and a network
 * address. Each flow has at least one source. A standard source comes from a source other than
 * another AWS Elemental MediaConnect flow, such as an on-premises encoder.
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
@CdkDslMarker
public class CfnFlowSourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFlowSource.Builder = CfnFlowSource.Builder.create(scope, id)

    /**
     * The type of encryption that is used on the content ingested from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-decryption)
     *
     * @param decryption The type of encryption that is used on the content ingested from the
     *   source.
     */
    public fun decryption(decryption: IResolvable) {
        cdkBuilder.decryption(decryption)
    }

    /**
     * The type of encryption that is used on the content ingested from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-decryption)
     *
     * @param decryption The type of encryption that is used on the content ingested from the
     *   source.
     */
    public fun decryption(decryption: CfnFlowSource.EncryptionProperty) {
        cdkBuilder.decryption(decryption)
    }

    /**
     * A description of the source.
     *
     * This description is not visible outside of the current AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-description)
     *
     * @param description A description of the source.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The ARN of the entitlement that allows you to subscribe to the flow.
     *
     * The entitlement is set by the content originator, and the ARN is generated as part of the
     * originator's flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-entitlementarn)
     *
     * @param entitlementArn The ARN of the entitlement that allows you to subscribe to the flow.
     */
    public fun entitlementArn(entitlementArn: String) {
        cdkBuilder.entitlementArn(entitlementArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the flow this source is connected to.
     *
     * The flow must have Failover enabled to add an additional source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-flowarn)
     *
     * @param flowArn The Amazon Resource Name (ARN) of the flow this source is connected to.
     */
    public fun flowArn(flowArn: String) {
        cdkBuilder.flowArn(flowArn)
    }

    /**
     * The source configuration for cloud flows receiving a stream from a bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-gatewaybridgesource)
     *
     * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from a
     *   bridge.
     */
    public fun gatewayBridgeSource(gatewayBridgeSource: IResolvable) {
        cdkBuilder.gatewayBridgeSource(gatewayBridgeSource)
    }

    /**
     * The source configuration for cloud flows receiving a stream from a bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-gatewaybridgesource)
     *
     * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from a
     *   bridge.
     */
    public fun gatewayBridgeSource(gatewayBridgeSource: CfnFlowSource.GatewayBridgeSourceProperty) {
        cdkBuilder.gatewayBridgeSource(gatewayBridgeSource)
    }

    /**
     * The port that the flow listens on for incoming content.
     *
     * If the protocol of the source is Zixi, the port must be set to 2088.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-ingestport)
     *
     * @param ingestPort The port that the flow listens on for incoming content.
     */
    public fun ingestPort(ingestPort: Number) {
        cdkBuilder.ingestPort(ingestPort)
    }

    /**
     * The maximum bitrate for RIST, RTP, and RTP-FEC streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-maxbitrate)
     *
     * @param maxBitrate The maximum bitrate for RIST, RTP, and RTP-FEC streams.
     */
    public fun maxBitrate(maxBitrate: Number) {
        cdkBuilder.maxBitrate(maxBitrate)
    }

    /**
     * The maximum latency in milliseconds.
     *
     * This parameter applies only to RIST-based, Zixi-based, and Fujitsu-based streams.
     *
     * Default: - 2000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-maxlatency)
     *
     * @param maxLatency The maximum latency in milliseconds.
     */
    public fun maxLatency(maxLatency: Number) {
        cdkBuilder.maxLatency(maxLatency)
    }

    /**
     * The minimum latency in milliseconds for SRT-based streams.
     *
     * In streams that use the SRT protocol, this value that you set on your MediaConnect source or
     * output represents the minimal potential latency of that connection. The latency of the stream
     * is set to the highest number between the sender’s minimum latency and the receiver’s minimum
     * latency.
     *
     * Default: - 2000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-minlatency)
     *
     * @param minLatency The minimum latency in milliseconds for SRT-based streams.
     */
    public fun minLatency(minLatency: Number) {
        cdkBuilder.minLatency(minLatency)
    }

    /**
     * The name of the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-name)
     *
     * @param name The name of the source.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The protocol that the source uses to deliver the content to MediaConnect.
     *
     * Adding additional sources to an existing flow requires Failover to be enabled. When you
     * enable Failover, the additional source must use the same protocol as the existing source.
     * Only the following protocols support failover: Zixi-push, RTP-FEC, RTP, RIST and SRT
     * protocols.
     *
     * If you use failover with SRT caller or listener, the `FailoverMode` property must be set to
     * `FAILOVER` . The `FailoverMode` property is found in the `FailoverConfig` resource of the
     * same flow ARN you used for the source's `FlowArn` property. SRT caller/listener does not
     * support merge mode failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-protocol)
     *
     * @param protocol The protocol that the source uses to deliver the content to MediaConnect.
     */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * The port that the flow uses to send outbound requests to initiate connection with the sender.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-sendercontrolport)
     *
     * @param senderControlPort The port that the flow uses to send outbound requests to initiate
     *   connection with the sender.
     */
    public fun senderControlPort(senderControlPort: Number) {
        cdkBuilder.senderControlPort(senderControlPort)
    }

    /**
     * The IP address that the flow communicates with to initiate connection with the sender.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-senderipaddress)
     *
     * @param senderIpAddress The IP address that the flow communicates with to initiate connection
     *   with the sender.
     */
    public fun senderIpAddress(senderIpAddress: String) {
        cdkBuilder.senderIpAddress(senderIpAddress)
    }

    /**
     * Source IP or domain name for SRT-caller protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-sourcelisteneraddress)
     *
     * @param sourceListenerAddress Source IP or domain name for SRT-caller protocol.
     */
    public fun sourceListenerAddress(sourceListenerAddress: String) {
        cdkBuilder.sourceListenerAddress(sourceListenerAddress)
    }

    /**
     * Source port for SRT-caller protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-sourcelistenerport)
     *
     * @param sourceListenerPort Source port for SRT-caller protocol.
     */
    public fun sourceListenerPort(sourceListenerPort: Number) {
        cdkBuilder.sourceListenerPort(sourceListenerPort)
    }

    /**
     * The stream ID that you want to use for this transport.
     *
     * This parameter applies only to Zixi and SRT caller-based streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-streamid)
     *
     * @param streamId The stream ID that you want to use for this transport.
     */
    public fun streamId(streamId: String) {
        cdkBuilder.streamId(streamId)
    }

    /**
     * The name of the VPC interface that you want to send your output to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-vpcinterfacename)
     *
     * @param vpcInterfaceName The name of the VPC interface that you want to send your output to.
     */
    public fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
    }

    /**
     * The range of IP addresses that are allowed to contribute content to your source.
     *
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-whitelistcidr)
     *
     * @param whitelistCidr The range of IP addresses that are allowed to contribute content to your
     *   source.
     */
    public fun whitelistCidr(whitelistCidr: String) {
        cdkBuilder.whitelistCidr(whitelistCidr)
    }

    public fun build(): CfnFlowSource = cdkBuilder.build()
}
