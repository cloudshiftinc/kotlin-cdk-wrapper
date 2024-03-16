@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFlowSource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
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
public interface CfnFlowSourceProps {
  /**
   * The type of encryption that is used on the content ingested from the source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-decryption)
   */
  public fun decryption(): Any? = unwrap(this).getDecryption()

  /**
   * A description of the source.
   *
   * This description is not visible outside of the current AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-description)
   */
  public fun description(): String

  /**
   * The ARN of the entitlement that allows you to subscribe to the flow.
   *
   * The entitlement is set by the content originator, and the ARN is generated as part of the
   * originator's flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-entitlementarn)
   */
  public fun entitlementArn(): String? = unwrap(this).getEntitlementArn()

  /**
   * The Amazon Resource Name (ARN) of the flow this source is connected to.
   *
   * The flow must have Failover enabled to add an additional source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-flowarn)
   */
  public fun flowArn(): String? = unwrap(this).getFlowArn()

  /**
   * The source configuration for cloud flows receiving a stream from a bridge.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-gatewaybridgesource)
   */
  public fun gatewayBridgeSource(): Any? = unwrap(this).getGatewayBridgeSource()

  /**
   * The port that the flow listens on for incoming content.
   *
   * If the protocol of the source is Zixi, the port must be set to 2088.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-ingestport)
   */
  public fun ingestPort(): Number? = unwrap(this).getIngestPort()

  /**
   * The maximum bitrate for RIST, RTP, and RTP-FEC streams.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-maxbitrate)
   */
  public fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

  /**
   * The maximum latency in milliseconds.
   *
   * This parameter applies only to RIST-based, Zixi-based, and Fujitsu-based streams.
   *
   * Default: - 2000
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-maxlatency)
   */
  public fun maxLatency(): Number? = unwrap(this).getMaxLatency()

  /**
   * The minimum latency in milliseconds for SRT-based streams.
   *
   * In streams that use the SRT protocol, this value that you set on your MediaConnect source or
   * output represents the minimal potential latency of that connection. The latency of the stream is
   * set to the highest number between the sender’s minimum latency and the receiver’s minimum latency.
   *
   * Default: - 2000
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-minlatency)
   */
  public fun minLatency(): Number? = unwrap(this).getMinLatency()

  /**
   * The name of the source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-name)
   */
  public fun name(): String

  /**
   * The protocol that the source uses to deliver the content to MediaConnect.
   *
   * Adding additional sources to an existing flow requires Failover to be enabled. When you enable
   * Failover, the additional source must use the same protocol as the existing source. Only the
   * following protocols support failover: Zixi-push, RTP-FEC, RTP, RIST and SRT protocols.
   *
   * If you use failover with SRT caller or listener, the `FailoverMode` property must be set to
   * `FAILOVER` . The `FailoverMode` property is found in the `FailoverConfig` resource of the same
   * flow ARN you used for the source's `FlowArn` property. SRT caller/listener does not
   * support merge mode failover.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-protocol)
   */
  public fun protocol(): String? = unwrap(this).getProtocol()

  /**
   * The port that the flow uses to send outbound requests to initiate connection with the sender.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-sendercontrolport)
   */
  public fun senderControlPort(): Number? = unwrap(this).getSenderControlPort()

  /**
   * The IP address that the flow communicates with to initiate connection with the sender.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-senderipaddress)
   */
  public fun senderIpAddress(): String? = unwrap(this).getSenderIpAddress()

  /**
   * Source IP or domain name for SRT-caller protocol.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-sourcelisteneraddress)
   */
  public fun sourceListenerAddress(): String? = unwrap(this).getSourceListenerAddress()

  /**
   * Source port for SRT-caller protocol.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-sourcelistenerport)
   */
  public fun sourceListenerPort(): Number? = unwrap(this).getSourceListenerPort()

  /**
   * The stream ID that you want to use for this transport.
   *
   * This parameter applies only to Zixi and SRT caller-based streams.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-streamid)
   */
  public fun streamId(): String? = unwrap(this).getStreamId()

  /**
   * The name of the VPC interface that you want to send your output to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-vpcinterfacename)
   */
  public fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

  /**
   * The range of IP addresses that are allowed to contribute content to your source.
   *
   * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
   * 10.0.0.0/16.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-whitelistcidr)
   */
  public fun whitelistCidr(): String? = unwrap(this).getWhitelistCidr()

  /**
   * A builder for [CfnFlowSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param decryption The type of encryption that is used on the content ingested from the
     * source.
     */
    public fun decryption(decryption: IResolvable)

    /**
     * @param decryption The type of encryption that is used on the content ingested from the
     * source.
     */
    public fun decryption(decryption: CfnFlowSource.EncryptionProperty)

    /**
     * @param decryption The type of encryption that is used on the content ingested from the
     * source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f0976742db86495e5476f81a237be48492ec425993aeaf16c967a70445457db")
    public fun decryption(decryption: CfnFlowSource.EncryptionProperty.Builder.() -> Unit)

    /**
     * @param description A description of the source. 
     * This description is not visible outside of the current AWS account.
     */
    public fun description(description: String)

    /**
     * @param entitlementArn The ARN of the entitlement that allows you to subscribe to the flow.
     * The entitlement is set by the content originator, and the ARN is generated as part of the
     * originator's flow.
     */
    public fun entitlementArn(entitlementArn: String)

    /**
     * @param flowArn The Amazon Resource Name (ARN) of the flow this source is connected to.
     * The flow must have Failover enabled to add an additional source.
     */
    public fun flowArn(flowArn: String)

    /**
     * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from a
     * bridge.
     */
    public fun gatewayBridgeSource(gatewayBridgeSource: IResolvable)

    /**
     * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from a
     * bridge.
     */
    public fun gatewayBridgeSource(gatewayBridgeSource: CfnFlowSource.GatewayBridgeSourceProperty)

    /**
     * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from a
     * bridge.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("269657b8a09c3885e667977a7b2e75de5100021b63bd0633dd13f7f80860882c")
    public
        fun gatewayBridgeSource(gatewayBridgeSource: CfnFlowSource.GatewayBridgeSourceProperty.Builder.() -> Unit)

    /**
     * @param ingestPort The port that the flow listens on for incoming content.
     * If the protocol of the source is Zixi, the port must be set to 2088.
     */
    public fun ingestPort(ingestPort: Number)

    /**
     * @param maxBitrate The maximum bitrate for RIST, RTP, and RTP-FEC streams.
     */
    public fun maxBitrate(maxBitrate: Number)

    /**
     * @param maxLatency The maximum latency in milliseconds.
     * This parameter applies only to RIST-based, Zixi-based, and Fujitsu-based streams.
     */
    public fun maxLatency(maxLatency: Number)

    /**
     * @param minLatency The minimum latency in milliseconds for SRT-based streams.
     * In streams that use the SRT protocol, this value that you set on your MediaConnect source or
     * output represents the minimal potential latency of that connection. The latency of the stream is
     * set to the highest number between the sender’s minimum latency and the receiver’s minimum
     * latency.
     */
    public fun minLatency(minLatency: Number)

    /**
     * @param name The name of the source. 
     */
    public fun name(name: String)

    /**
     * @param protocol The protocol that the source uses to deliver the content to MediaConnect.
     * Adding additional sources to an existing flow requires Failover to be enabled. When you
     * enable Failover, the additional source must use the same protocol as the existing source. Only
     * the following protocols support failover: Zixi-push, RTP-FEC, RTP, RIST and SRT protocols.
     *
     * If you use failover with SRT caller or listener, the `FailoverMode` property must be set to
     * `FAILOVER` . The `FailoverMode` property is found in the `FailoverConfig` resource of the same
     * flow ARN you used for the source's `FlowArn` property. SRT caller/listener does not
     * support merge mode failover.
     */
    public fun protocol(protocol: String)

    /**
     * @param senderControlPort The port that the flow uses to send outbound requests to initiate
     * connection with the sender.
     */
    public fun senderControlPort(senderControlPort: Number)

    /**
     * @param senderIpAddress The IP address that the flow communicates with to initiate connection
     * with the sender.
     */
    public fun senderIpAddress(senderIpAddress: String)

    /**
     * @param sourceListenerAddress Source IP or domain name for SRT-caller protocol.
     */
    public fun sourceListenerAddress(sourceListenerAddress: String)

    /**
     * @param sourceListenerPort Source port for SRT-caller protocol.
     */
    public fun sourceListenerPort(sourceListenerPort: Number)

    /**
     * @param streamId The stream ID that you want to use for this transport.
     * This parameter applies only to Zixi and SRT caller-based streams.
     */
    public fun streamId(streamId: String)

    /**
     * @param vpcInterfaceName The name of the VPC interface that you want to send your output to.
     */
    public fun vpcInterfaceName(vpcInterfaceName: String)

    /**
     * @param whitelistCidr The range of IP addresses that are allowed to contribute content to your
     * source.
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     */
    public fun whitelistCidr(whitelistCidr: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps.Builder
        = software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps.builder()

    /**
     * @param decryption The type of encryption that is used on the content ingested from the
     * source.
     */
    override fun decryption(decryption: IResolvable) {
      cdkBuilder.decryption(decryption.let(IResolvable::unwrap))
    }

    /**
     * @param decryption The type of encryption that is used on the content ingested from the
     * source.
     */
    override fun decryption(decryption: CfnFlowSource.EncryptionProperty) {
      cdkBuilder.decryption(decryption.let(CfnFlowSource.EncryptionProperty::unwrap))
    }

    /**
     * @param decryption The type of encryption that is used on the content ingested from the
     * source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f0976742db86495e5476f81a237be48492ec425993aeaf16c967a70445457db")
    override fun decryption(decryption: CfnFlowSource.EncryptionProperty.Builder.() -> Unit): Unit =
        decryption(CfnFlowSource.EncryptionProperty(decryption))

    /**
     * @param description A description of the source. 
     * This description is not visible outside of the current AWS account.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param entitlementArn The ARN of the entitlement that allows you to subscribe to the flow.
     * The entitlement is set by the content originator, and the ARN is generated as part of the
     * originator's flow.
     */
    override fun entitlementArn(entitlementArn: String) {
      cdkBuilder.entitlementArn(entitlementArn)
    }

    /**
     * @param flowArn The Amazon Resource Name (ARN) of the flow this source is connected to.
     * The flow must have Failover enabled to add an additional source.
     */
    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    /**
     * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from a
     * bridge.
     */
    override fun gatewayBridgeSource(gatewayBridgeSource: IResolvable) {
      cdkBuilder.gatewayBridgeSource(gatewayBridgeSource.let(IResolvable::unwrap))
    }

    /**
     * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from a
     * bridge.
     */
    override
        fun gatewayBridgeSource(gatewayBridgeSource: CfnFlowSource.GatewayBridgeSourceProperty) {
      cdkBuilder.gatewayBridgeSource(gatewayBridgeSource.let(CfnFlowSource.GatewayBridgeSourceProperty::unwrap))
    }

    /**
     * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from a
     * bridge.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("269657b8a09c3885e667977a7b2e75de5100021b63bd0633dd13f7f80860882c")
    override
        fun gatewayBridgeSource(gatewayBridgeSource: CfnFlowSource.GatewayBridgeSourceProperty.Builder.() -> Unit):
        Unit = gatewayBridgeSource(CfnFlowSource.GatewayBridgeSourceProperty(gatewayBridgeSource))

    /**
     * @param ingestPort The port that the flow listens on for incoming content.
     * If the protocol of the source is Zixi, the port must be set to 2088.
     */
    override fun ingestPort(ingestPort: Number) {
      cdkBuilder.ingestPort(ingestPort)
    }

    /**
     * @param maxBitrate The maximum bitrate for RIST, RTP, and RTP-FEC streams.
     */
    override fun maxBitrate(maxBitrate: Number) {
      cdkBuilder.maxBitrate(maxBitrate)
    }

    /**
     * @param maxLatency The maximum latency in milliseconds.
     * This parameter applies only to RIST-based, Zixi-based, and Fujitsu-based streams.
     */
    override fun maxLatency(maxLatency: Number) {
      cdkBuilder.maxLatency(maxLatency)
    }

    /**
     * @param minLatency The minimum latency in milliseconds for SRT-based streams.
     * In streams that use the SRT protocol, this value that you set on your MediaConnect source or
     * output represents the minimal potential latency of that connection. The latency of the stream is
     * set to the highest number between the sender’s minimum latency and the receiver’s minimum
     * latency.
     */
    override fun minLatency(minLatency: Number) {
      cdkBuilder.minLatency(minLatency)
    }

    /**
     * @param name The name of the source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param protocol The protocol that the source uses to deliver the content to MediaConnect.
     * Adding additional sources to an existing flow requires Failover to be enabled. When you
     * enable Failover, the additional source must use the same protocol as the existing source. Only
     * the following protocols support failover: Zixi-push, RTP-FEC, RTP, RIST and SRT protocols.
     *
     * If you use failover with SRT caller or listener, the `FailoverMode` property must be set to
     * `FAILOVER` . The `FailoverMode` property is found in the `FailoverConfig` resource of the same
     * flow ARN you used for the source's `FlowArn` property. SRT caller/listener does not
     * support merge mode failover.
     */
    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    /**
     * @param senderControlPort The port that the flow uses to send outbound requests to initiate
     * connection with the sender.
     */
    override fun senderControlPort(senderControlPort: Number) {
      cdkBuilder.senderControlPort(senderControlPort)
    }

    /**
     * @param senderIpAddress The IP address that the flow communicates with to initiate connection
     * with the sender.
     */
    override fun senderIpAddress(senderIpAddress: String) {
      cdkBuilder.senderIpAddress(senderIpAddress)
    }

    /**
     * @param sourceListenerAddress Source IP or domain name for SRT-caller protocol.
     */
    override fun sourceListenerAddress(sourceListenerAddress: String) {
      cdkBuilder.sourceListenerAddress(sourceListenerAddress)
    }

    /**
     * @param sourceListenerPort Source port for SRT-caller protocol.
     */
    override fun sourceListenerPort(sourceListenerPort: Number) {
      cdkBuilder.sourceListenerPort(sourceListenerPort)
    }

    /**
     * @param streamId The stream ID that you want to use for this transport.
     * This parameter applies only to Zixi and SRT caller-based streams.
     */
    override fun streamId(streamId: String) {
      cdkBuilder.streamId(streamId)
    }

    /**
     * @param vpcInterfaceName The name of the VPC interface that you want to send your output to.
     */
    override fun vpcInterfaceName(vpcInterfaceName: String) {
      cdkBuilder.vpcInterfaceName(vpcInterfaceName)
    }

    /**
     * @param whitelistCidr The range of IP addresses that are allowed to contribute content to your
     * source.
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     */
    override fun whitelistCidr(whitelistCidr: String) {
      cdkBuilder.whitelistCidr(whitelistCidr)
    }

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps,
  ) : CdkObject(cdkObject), CfnFlowSourceProps {
    /**
     * The type of encryption that is used on the content ingested from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-decryption)
     */
    override fun decryption(): Any? = unwrap(this).getDecryption()

    /**
     * A description of the source.
     *
     * This description is not visible outside of the current AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * The ARN of the entitlement that allows you to subscribe to the flow.
     *
     * The entitlement is set by the content originator, and the ARN is generated as part of the
     * originator's flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-entitlementarn)
     */
    override fun entitlementArn(): String? = unwrap(this).getEntitlementArn()

    /**
     * The Amazon Resource Name (ARN) of the flow this source is connected to.
     *
     * The flow must have Failover enabled to add an additional source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-flowarn)
     */
    override fun flowArn(): String? = unwrap(this).getFlowArn()

    /**
     * The source configuration for cloud flows receiving a stream from a bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-gatewaybridgesource)
     */
    override fun gatewayBridgeSource(): Any? = unwrap(this).getGatewayBridgeSource()

    /**
     * The port that the flow listens on for incoming content.
     *
     * If the protocol of the source is Zixi, the port must be set to 2088.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-ingestport)
     */
    override fun ingestPort(): Number? = unwrap(this).getIngestPort()

    /**
     * The maximum bitrate for RIST, RTP, and RTP-FEC streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-maxbitrate)
     */
    override fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

    /**
     * The maximum latency in milliseconds.
     *
     * This parameter applies only to RIST-based, Zixi-based, and Fujitsu-based streams.
     *
     * Default: - 2000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-maxlatency)
     */
    override fun maxLatency(): Number? = unwrap(this).getMaxLatency()

    /**
     * The minimum latency in milliseconds for SRT-based streams.
     *
     * In streams that use the SRT protocol, this value that you set on your MediaConnect source or
     * output represents the minimal potential latency of that connection. The latency of the stream is
     * set to the highest number between the sender’s minimum latency and the receiver’s minimum
     * latency.
     *
     * Default: - 2000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-minlatency)
     */
    override fun minLatency(): Number? = unwrap(this).getMinLatency()

    /**
     * The name of the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The protocol that the source uses to deliver the content to MediaConnect.
     *
     * Adding additional sources to an existing flow requires Failover to be enabled. When you
     * enable Failover, the additional source must use the same protocol as the existing source. Only
     * the following protocols support failover: Zixi-push, RTP-FEC, RTP, RIST and SRT protocols.
     *
     * If you use failover with SRT caller or listener, the `FailoverMode` property must be set to
     * `FAILOVER` . The `FailoverMode` property is found in the `FailoverConfig` resource of the same
     * flow ARN you used for the source's `FlowArn` property. SRT caller/listener does not
     * support merge mode failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-protocol)
     */
    override fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * The port that the flow uses to send outbound requests to initiate connection with the sender.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-sendercontrolport)
     */
    override fun senderControlPort(): Number? = unwrap(this).getSenderControlPort()

    /**
     * The IP address that the flow communicates with to initiate connection with the sender.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-senderipaddress)
     */
    override fun senderIpAddress(): String? = unwrap(this).getSenderIpAddress()

    /**
     * Source IP or domain name for SRT-caller protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-sourcelisteneraddress)
     */
    override fun sourceListenerAddress(): String? = unwrap(this).getSourceListenerAddress()

    /**
     * Source port for SRT-caller protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-sourcelistenerport)
     */
    override fun sourceListenerPort(): Number? = unwrap(this).getSourceListenerPort()

    /**
     * The stream ID that you want to use for this transport.
     *
     * This parameter applies only to Zixi and SRT caller-based streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-streamid)
     */
    override fun streamId(): String? = unwrap(this).getStreamId()

    /**
     * The name of the VPC interface that you want to send your output to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-vpcinterfacename)
     */
    override fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

    /**
     * The range of IP addresses that are allowed to contribute content to your source.
     *
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-whitelistcidr)
     */
    override fun whitelistCidr(): String? = unwrap(this).getWhitelistCidr()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps):
        CfnFlowSourceProps = CdkObjectWrappers.wrap(cdkObject) as CfnFlowSourceProps

    internal fun unwrap(wrapped: CfnFlowSourceProps):
        software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps
  }
}
