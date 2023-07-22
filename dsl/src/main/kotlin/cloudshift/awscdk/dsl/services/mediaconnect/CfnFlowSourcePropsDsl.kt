@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnFlowSource
import software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps

/**
 * Properties for defining a `CfnFlowSource`.
 *
 * Example:
 *
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
@CdkDslMarker
public class CfnFlowSourcePropsDsl {
  private val cdkBuilder: CfnFlowSourceProps.Builder = CfnFlowSourceProps.builder()

  /**
   * @param decryption The type of encryption that is used on the content ingested from the source.
   */
  public fun decryption(decryption: IResolvable) {
    cdkBuilder.decryption(decryption)
  }

  /**
   * @param decryption The type of encryption that is used on the content ingested from the source.
   */
  public fun decryption(decryption: CfnFlowSource.EncryptionProperty) {
    cdkBuilder.decryption(decryption)
  }

  /**
   * @param description A description of the source. 
   * This description is not visible outside of the current AWS account.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param entitlementArn The ARN of the entitlement that allows you to subscribe to the flow.
   * The entitlement is set by the content originator, and the ARN is generated as part of the
   * originator's flow.
   */
  public fun entitlementArn(entitlementArn: String) {
    cdkBuilder.entitlementArn(entitlementArn)
  }

  /**
   * @param flowArn The Amazon Resource Name (ARN) of the flow this source is connected to.
   * The flow must have Failover enabled to add an additional source.
   */
  public fun flowArn(flowArn: String) {
    cdkBuilder.flowArn(flowArn)
  }

  /**
   * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from a
   * bridge.
   */
  public fun gatewayBridgeSource(gatewayBridgeSource: IResolvable) {
    cdkBuilder.gatewayBridgeSource(gatewayBridgeSource)
  }

  /**
   * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from a
   * bridge.
   */
  public fun gatewayBridgeSource(gatewayBridgeSource: CfnFlowSource.GatewayBridgeSourceProperty) {
    cdkBuilder.gatewayBridgeSource(gatewayBridgeSource)
  }

  /**
   * @param ingestPort The port that the flow listens on for incoming content.
   * If the protocol of the source is Zixi, the port must be set to 2088.
   */
  public fun ingestPort(ingestPort: Number) {
    cdkBuilder.ingestPort(ingestPort)
  }

  /**
   * @param maxBitrate The maximum bitrate for RIST, RTP, and RTP-FEC streams.
   */
  public fun maxBitrate(maxBitrate: Number) {
    cdkBuilder.maxBitrate(maxBitrate)
  }

  /**
   * @param maxLatency The maximum latency in milliseconds.
   * This parameter applies only to RIST-based, Zixi-based, and Fujitsu-based streams.
   */
  public fun maxLatency(maxLatency: Number) {
    cdkBuilder.maxLatency(maxLatency)
  }

  /**
   * @param minLatency The minimum latency in milliseconds for SRT-based streams.
   * In streams that use the SRT protocol, this value that you set on your MediaConnect source or
   * output represents the minimal potential latency of that connection. The latency of the stream is
   * set to the highest number between the sender’s minimum latency and the receiver’s minimum latency.
   */
  public fun minLatency(minLatency: Number) {
    cdkBuilder.minLatency(minLatency)
  }

  /**
   * @param name The name of the source. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param protocol The protocol that the source uses to deliver the content to MediaConnect.
   * Adding additional sources to an existing flow requires Failover to be enabled. When you enable
   * Failover, the additional source must use the same protocol as the existing source. Only the
   * following protocols support failover: Zixi-push, RTP-FEC, RTP, RIST and SRT protocols.
   *
   * If you use failover with SRT caller or listener, the `FailoverMode` property must be set to
   * `FAILOVER` . The `FailoverMode` property is found in the `FailoverConfig` resource of the same
   * flow ARN you used for the source's `FlowArn` property. SRT caller/listener does not
   * support merge mode failover.
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param senderControlPort The port that the flow uses to send outbound requests to initiate
   * connection with the sender.
   */
  public fun senderControlPort(senderControlPort: Number) {
    cdkBuilder.senderControlPort(senderControlPort)
  }

  /**
   * @param senderIpAddress The IP address that the flow communicates with to initiate connection
   * with the sender.
   */
  public fun senderIpAddress(senderIpAddress: String) {
    cdkBuilder.senderIpAddress(senderIpAddress)
  }

  /**
   * @param sourceListenerAddress Source IP or domain name for SRT-caller protocol.
   */
  public fun sourceListenerAddress(sourceListenerAddress: String) {
    cdkBuilder.sourceListenerAddress(sourceListenerAddress)
  }

  /**
   * @param sourceListenerPort Source port for SRT-caller protocol.
   */
  public fun sourceListenerPort(sourceListenerPort: Number) {
    cdkBuilder.sourceListenerPort(sourceListenerPort)
  }

  /**
   * @param streamId The stream ID that you want to use for this transport.
   * This parameter applies only to Zixi and SRT caller-based streams.
   */
  public fun streamId(streamId: String) {
    cdkBuilder.streamId(streamId)
  }

  /**
   * @param vpcInterfaceName The name of the VPC interface that you want to send your output to.
   */
  public fun vpcInterfaceName(vpcInterfaceName: String) {
    cdkBuilder.vpcInterfaceName(vpcInterfaceName)
  }

  /**
   * @param whitelistCidr The range of IP addresses that are allowed to contribute content to your
   * source.
   * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
   * 10.0.0.0/16.
   */
  public fun whitelistCidr(whitelistCidr: String) {
    cdkBuilder.whitelistCidr(whitelistCidr)
  }

  public fun build(): CfnFlowSourceProps = cdkBuilder.build()
}
