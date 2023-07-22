@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnFlow

@CdkDslMarker
public class CfnFlowSourcePropertyDsl {
  private val cdkBuilder: CfnFlow.SourceProperty.Builder = CfnFlow.SourceProperty.builder()

  /**
   * @param decryption The type of encryption that is used on the content ingested from the source.
   */
  public fun decryption(decryption: IResolvable) {
    cdkBuilder.decryption(decryption)
  }

  /**
   * @param decryption The type of encryption that is used on the content ingested from the source.
   */
  public fun decryption(decryption: CfnFlow.EncryptionProperty) {
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
   * @param entitlementArn The ARN of the entitlement that allows you to subscribe to content that
   * comes from another AWS account.
   * The entitlement is set by the content originator and the ARN is generated as part of the
   * originator’s flow.
   */
  public fun entitlementArn(entitlementArn: String) {
    cdkBuilder.entitlementArn(entitlementArn)
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
  public fun gatewayBridgeSource(gatewayBridgeSource: CfnFlow.GatewayBridgeSourceProperty) {
    cdkBuilder.gatewayBridgeSource(gatewayBridgeSource)
  }

  /**
   * @param ingestIp The IP address that the flow listens on for incoming content.
   */
  public fun ingestIp(ingestIp: String) {
    cdkBuilder.ingestIp(ingestIp)
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
   * @param maxLatency The maximum latency in milliseconds for a RIST or Zixi-based source.
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
   * @param protocol The protocol that is used by the source.
   * AWS CloudFormation does not currently support CDI or ST 2110 JPEG XS source protocols.
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
   * @param sourceArn The ARN of the source.
   */
  public fun sourceArn(sourceArn: String) {
    cdkBuilder.sourceArn(sourceArn)
  }

  /**
   * @param sourceIngestPort The port that the flow listens on for incoming content.
   * If the protocol of the source is Zixi, the port must be set to 2088.
   */
  public fun sourceIngestPort(sourceIngestPort: String) {
    cdkBuilder.sourceIngestPort(sourceIngestPort)
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
   * @param streamId The stream ID that you want to use for the transport.
   * This parameter applies only to Zixi-based streams.
   */
  public fun streamId(streamId: String) {
    cdkBuilder.streamId(streamId)
  }

  /**
   * @param vpcInterfaceName The name of the VPC interface that the source content comes from.
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

  public fun build(): CfnFlow.SourceProperty = cdkBuilder.build()
}
