@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::MediaConnect::FlowSource resource is used to add additional sources to an existing flow.
 *
 * Adding an additional source requires Failover to be enabled. When you enable Failover, the
 * additional source must use the same protocol as the existing source. A source is the external video
 * content that includes configuration information (encryption and source type) and a network address.
 * Each flow has at least one source. A standard source comes from a source other than another AWS
 * Elemental MediaConnect flow, such as an on-premises encoder.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
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
public open class CfnFlowSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowSource,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The IP address that the flow listens on for incoming content.
   */
  public open fun attrIngestIp(): String = unwrap(this).getAttrIngestIp()

  /**
   * The ARN of the source.
   */
  public open fun attrSourceArn(): String = unwrap(this).getAttrSourceArn()

  /**
   * The port that the flow listens on for incoming content.
   *
   * If the protocol of the source is Zixi, the port must be set to 2088.
   */
  public open fun attrSourceIngestPort(): String = unwrap(this).getAttrSourceIngestPort()

  /**
   * The type of encryption that is used on the content ingested from the source.
   */
  public open fun decryption(): Any? = unwrap(this).getDecryption()

  /**
   * The type of encryption that is used on the content ingested from the source.
   */
  public open fun decryption(`value`: IResolvable) {
    unwrap(this).setDecryption(`value`.let(IResolvable::unwrap))
  }

  /**
   * The type of encryption that is used on the content ingested from the source.
   */
  public open fun decryption(`value`: EncryptionProperty) {
    unwrap(this).setDecryption(`value`.let(EncryptionProperty::unwrap))
  }

  /**
   * The type of encryption that is used on the content ingested from the source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6bef9d320d73a09780a6b8a6ad11f125ecd161cfd424639faac0d6256d4e946e")
  public open fun decryption(`value`: EncryptionProperty.Builder.() -> Unit): Unit =
      decryption(EncryptionProperty(`value`))

  /**
   * A description of the source.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * A description of the source.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The ARN of the entitlement that allows you to subscribe to the flow.
   */
  public open fun entitlementArn(): String? = unwrap(this).getEntitlementArn()

  /**
   * The ARN of the entitlement that allows you to subscribe to the flow.
   */
  public open fun entitlementArn(`value`: String) {
    unwrap(this).setEntitlementArn(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the flow this source is connected to.
   */
  public open fun flowArn(): String? = unwrap(this).getFlowArn()

  /**
   * The Amazon Resource Name (ARN) of the flow this source is connected to.
   */
  public open fun flowArn(`value`: String) {
    unwrap(this).setFlowArn(`value`)
  }

  /**
   * The source configuration for cloud flows receiving a stream from a bridge.
   */
  public open fun gatewayBridgeSource(): Any? = unwrap(this).getGatewayBridgeSource()

  /**
   * The source configuration for cloud flows receiving a stream from a bridge.
   */
  public open fun gatewayBridgeSource(`value`: IResolvable) {
    unwrap(this).setGatewayBridgeSource(`value`.let(IResolvable::unwrap))
  }

  /**
   * The source configuration for cloud flows receiving a stream from a bridge.
   */
  public open fun gatewayBridgeSource(`value`: GatewayBridgeSourceProperty) {
    unwrap(this).setGatewayBridgeSource(`value`.let(GatewayBridgeSourceProperty::unwrap))
  }

  /**
   * The source configuration for cloud flows receiving a stream from a bridge.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6c461a61dbbc538bc19f84b2a06355eb21b6bf4dfeb61a89e6d71e93dafe04f8")
  public open fun gatewayBridgeSource(`value`: GatewayBridgeSourceProperty.Builder.() -> Unit): Unit
      = gatewayBridgeSource(GatewayBridgeSourceProperty(`value`))

  /**
   * The port that the flow listens on for incoming content.
   */
  public open fun ingestPort(): Number? = unwrap(this).getIngestPort()

  /**
   * The port that the flow listens on for incoming content.
   */
  public open fun ingestPort(`value`: Number) {
    unwrap(this).setIngestPort(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The maximum bitrate for RIST, RTP, and RTP-FEC streams.
   */
  public open fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

  /**
   * The maximum bitrate for RIST, RTP, and RTP-FEC streams.
   */
  public open fun maxBitrate(`value`: Number) {
    unwrap(this).setMaxBitrate(`value`)
  }

  /**
   * The maximum latency in milliseconds.
   */
  public open fun maxLatency(): Number? = unwrap(this).getMaxLatency()

  /**
   * The maximum latency in milliseconds.
   */
  public open fun maxLatency(`value`: Number) {
    unwrap(this).setMaxLatency(`value`)
  }

  /**
   * The minimum latency in milliseconds for SRT-based streams.
   */
  public open fun minLatency(): Number? = unwrap(this).getMinLatency()

  /**
   * The minimum latency in milliseconds for SRT-based streams.
   */
  public open fun minLatency(`value`: Number) {
    unwrap(this).setMinLatency(`value`)
  }

  /**
   * The name of the source.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the source.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The protocol that the source uses to deliver the content to MediaConnect.
   */
  public open fun protocol(): String? = unwrap(this).getProtocol()

  /**
   * The protocol that the source uses to deliver the content to MediaConnect.
   */
  public open fun protocol(`value`: String) {
    unwrap(this).setProtocol(`value`)
  }

  /**
   * The port that the flow uses to send outbound requests to initiate connection with the sender.
   */
  public open fun senderControlPort(): Number? = unwrap(this).getSenderControlPort()

  /**
   * The port that the flow uses to send outbound requests to initiate connection with the sender.
   */
  public open fun senderControlPort(`value`: Number) {
    unwrap(this).setSenderControlPort(`value`)
  }

  /**
   * The IP address that the flow communicates with to initiate connection with the sender.
   */
  public open fun senderIpAddress(): String? = unwrap(this).getSenderIpAddress()

  /**
   * The IP address that the flow communicates with to initiate connection with the sender.
   */
  public open fun senderIpAddress(`value`: String) {
    unwrap(this).setSenderIpAddress(`value`)
  }

  /**
   * Source IP or domain name for SRT-caller protocol.
   */
  public open fun sourceListenerAddress(): String? = unwrap(this).getSourceListenerAddress()

  /**
   * Source IP or domain name for SRT-caller protocol.
   */
  public open fun sourceListenerAddress(`value`: String) {
    unwrap(this).setSourceListenerAddress(`value`)
  }

  /**
   * Source port for SRT-caller protocol.
   */
  public open fun sourceListenerPort(): Number? = unwrap(this).getSourceListenerPort()

  /**
   * Source port for SRT-caller protocol.
   */
  public open fun sourceListenerPort(`value`: Number) {
    unwrap(this).setSourceListenerPort(`value`)
  }

  /**
   * The stream ID that you want to use for this transport.
   */
  public open fun streamId(): String? = unwrap(this).getStreamId()

  /**
   * The stream ID that you want to use for this transport.
   */
  public open fun streamId(`value`: String) {
    unwrap(this).setStreamId(`value`)
  }

  /**
   * The name of the VPC interface that you want to send your output to.
   */
  public open fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

  /**
   * The name of the VPC interface that you want to send your output to.
   */
  public open fun vpcInterfaceName(`value`: String) {
    unwrap(this).setVpcInterfaceName(`value`)
  }

  /**
   * The range of IP addresses that are allowed to contribute content to your source.
   */
  public open fun whitelistCidr(): String? = unwrap(this).getWhitelistCidr()

  /**
   * The range of IP addresses that are allowed to contribute content to your source.
   */
  public open fun whitelistCidr(`value`: String) {
    unwrap(this).setWhitelistCidr(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediaconnect.CfnFlowSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The type of encryption that is used on the content ingested from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-decryption)
     * @param decryption The type of encryption that is used on the content ingested from the
     * source. 
     */
    public fun decryption(decryption: IResolvable)

    /**
     * The type of encryption that is used on the content ingested from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-decryption)
     * @param decryption The type of encryption that is used on the content ingested from the
     * source. 
     */
    public fun decryption(decryption: EncryptionProperty)

    /**
     * The type of encryption that is used on the content ingested from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-decryption)
     * @param decryption The type of encryption that is used on the content ingested from the
     * source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a11efebc014cff7bfdf7e8b2e789149fbafcb3d0f1cf703b54b7747b44a8d95")
    public fun decryption(decryption: EncryptionProperty.Builder.() -> Unit)

    /**
     * A description of the source.
     *
     * This description is not visible outside of the current AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-description)
     * @param description A description of the source. 
     */
    public fun description(description: String)

    /**
     * The ARN of the entitlement that allows you to subscribe to the flow.
     *
     * The entitlement is set by the content originator, and the ARN is generated as part of the
     * originator's flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-entitlementarn)
     * @param entitlementArn The ARN of the entitlement that allows you to subscribe to the flow. 
     */
    public fun entitlementArn(entitlementArn: String)

    /**
     * The Amazon Resource Name (ARN) of the flow this source is connected to.
     *
     * The flow must have Failover enabled to add an additional source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-flowarn)
     * @param flowArn The Amazon Resource Name (ARN) of the flow this source is connected to. 
     */
    public fun flowArn(flowArn: String)

    /**
     * The source configuration for cloud flows receiving a stream from a bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-gatewaybridgesource)
     * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from a
     * bridge. 
     */
    public fun gatewayBridgeSource(gatewayBridgeSource: IResolvable)

    /**
     * The source configuration for cloud flows receiving a stream from a bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-gatewaybridgesource)
     * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from a
     * bridge. 
     */
    public fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty)

    /**
     * The source configuration for cloud flows receiving a stream from a bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-gatewaybridgesource)
     * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from a
     * bridge. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c1cdbcb9bc692f05686bb840b6e19403470dbeb5b6b434a34687d0f43c867b4")
    public
        fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty.Builder.() -> Unit)

    /**
     * The port that the flow listens on for incoming content.
     *
     * If the protocol of the source is Zixi, the port must be set to 2088.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-ingestport)
     * @param ingestPort The port that the flow listens on for incoming content. 
     */
    public fun ingestPort(ingestPort: Number)

    /**
     * The maximum bitrate for RIST, RTP, and RTP-FEC streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-maxbitrate)
     * @param maxBitrate The maximum bitrate for RIST, RTP, and RTP-FEC streams. 
     */
    public fun maxBitrate(maxBitrate: Number)

    /**
     * The maximum latency in milliseconds.
     *
     * This parameter applies only to RIST-based, Zixi-based, and Fujitsu-based streams.
     *
     * Default: - 2000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-maxlatency)
     * @param maxLatency The maximum latency in milliseconds. 
     */
    public fun maxLatency(maxLatency: Number)

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
     * @param minLatency The minimum latency in milliseconds for SRT-based streams. 
     */
    public fun minLatency(minLatency: Number)

    /**
     * The name of the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-name)
     * @param name The name of the source. 
     */
    public fun name(name: String)

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
     * @param protocol The protocol that the source uses to deliver the content to MediaConnect. 
     */
    public fun protocol(protocol: String)

    /**
     * The port that the flow uses to send outbound requests to initiate connection with the sender.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-sendercontrolport)
     * @param senderControlPort The port that the flow uses to send outbound requests to initiate
     * connection with the sender. 
     */
    public fun senderControlPort(senderControlPort: Number)

    /**
     * The IP address that the flow communicates with to initiate connection with the sender.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-senderipaddress)
     * @param senderIpAddress The IP address that the flow communicates with to initiate connection
     * with the sender. 
     */
    public fun senderIpAddress(senderIpAddress: String)

    /**
     * Source IP or domain name for SRT-caller protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-sourcelisteneraddress)
     * @param sourceListenerAddress Source IP or domain name for SRT-caller protocol. 
     */
    public fun sourceListenerAddress(sourceListenerAddress: String)

    /**
     * Source port for SRT-caller protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-sourcelistenerport)
     * @param sourceListenerPort Source port for SRT-caller protocol. 
     */
    public fun sourceListenerPort(sourceListenerPort: Number)

    /**
     * The stream ID that you want to use for this transport.
     *
     * This parameter applies only to Zixi and SRT caller-based streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-streamid)
     * @param streamId The stream ID that you want to use for this transport. 
     */
    public fun streamId(streamId: String)

    /**
     * The name of the VPC interface that you want to send your output to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-vpcinterfacename)
     * @param vpcInterfaceName The name of the VPC interface that you want to send your output to. 
     */
    public fun vpcInterfaceName(vpcInterfaceName: String)

    /**
     * The range of IP addresses that are allowed to contribute content to your source.
     *
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-whitelistcidr)
     * @param whitelistCidr The range of IP addresses that are allowed to contribute content to your
     * source. 
     */
    public fun whitelistCidr(whitelistCidr: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnFlowSource.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnFlowSource.Builder.create(scope, id)

    /**
     * The type of encryption that is used on the content ingested from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-decryption)
     * @param decryption The type of encryption that is used on the content ingested from the
     * source. 
     */
    override fun decryption(decryption: IResolvable) {
      cdkBuilder.decryption(decryption.let(IResolvable::unwrap))
    }

    /**
     * The type of encryption that is used on the content ingested from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-decryption)
     * @param decryption The type of encryption that is used on the content ingested from the
     * source. 
     */
    override fun decryption(decryption: EncryptionProperty) {
      cdkBuilder.decryption(decryption.let(EncryptionProperty::unwrap))
    }

    /**
     * The type of encryption that is used on the content ingested from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-decryption)
     * @param decryption The type of encryption that is used on the content ingested from the
     * source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a11efebc014cff7bfdf7e8b2e789149fbafcb3d0f1cf703b54b7747b44a8d95")
    override fun decryption(decryption: EncryptionProperty.Builder.() -> Unit): Unit =
        decryption(EncryptionProperty(decryption))

    /**
     * A description of the source.
     *
     * This description is not visible outside of the current AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-description)
     * @param description A description of the source. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ARN of the entitlement that allows you to subscribe to the flow.
     *
     * The entitlement is set by the content originator, and the ARN is generated as part of the
     * originator's flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-entitlementarn)
     * @param entitlementArn The ARN of the entitlement that allows you to subscribe to the flow. 
     */
    override fun entitlementArn(entitlementArn: String) {
      cdkBuilder.entitlementArn(entitlementArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the flow this source is connected to.
     *
     * The flow must have Failover enabled to add an additional source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-flowarn)
     * @param flowArn The Amazon Resource Name (ARN) of the flow this source is connected to. 
     */
    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    /**
     * The source configuration for cloud flows receiving a stream from a bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-gatewaybridgesource)
     * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from a
     * bridge. 
     */
    override fun gatewayBridgeSource(gatewayBridgeSource: IResolvable) {
      cdkBuilder.gatewayBridgeSource(gatewayBridgeSource.let(IResolvable::unwrap))
    }

    /**
     * The source configuration for cloud flows receiving a stream from a bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-gatewaybridgesource)
     * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from a
     * bridge. 
     */
    override fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty) {
      cdkBuilder.gatewayBridgeSource(gatewayBridgeSource.let(GatewayBridgeSourceProperty::unwrap))
    }

    /**
     * The source configuration for cloud flows receiving a stream from a bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-gatewaybridgesource)
     * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from a
     * bridge. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c1cdbcb9bc692f05686bb840b6e19403470dbeb5b6b434a34687d0f43c867b4")
    override
        fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty.Builder.() -> Unit):
        Unit = gatewayBridgeSource(GatewayBridgeSourceProperty(gatewayBridgeSource))

    /**
     * The port that the flow listens on for incoming content.
     *
     * If the protocol of the source is Zixi, the port must be set to 2088.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-ingestport)
     * @param ingestPort The port that the flow listens on for incoming content. 
     */
    override fun ingestPort(ingestPort: Number) {
      cdkBuilder.ingestPort(ingestPort)
    }

    /**
     * The maximum bitrate for RIST, RTP, and RTP-FEC streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-maxbitrate)
     * @param maxBitrate The maximum bitrate for RIST, RTP, and RTP-FEC streams. 
     */
    override fun maxBitrate(maxBitrate: Number) {
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
     * @param maxLatency The maximum latency in milliseconds. 
     */
    override fun maxLatency(maxLatency: Number) {
      cdkBuilder.maxLatency(maxLatency)
    }

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
     * @param minLatency The minimum latency in milliseconds for SRT-based streams. 
     */
    override fun minLatency(minLatency: Number) {
      cdkBuilder.minLatency(minLatency)
    }

    /**
     * The name of the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-name)
     * @param name The name of the source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param protocol The protocol that the source uses to deliver the content to MediaConnect. 
     */
    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    /**
     * The port that the flow uses to send outbound requests to initiate connection with the sender.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-sendercontrolport)
     * @param senderControlPort The port that the flow uses to send outbound requests to initiate
     * connection with the sender. 
     */
    override fun senderControlPort(senderControlPort: Number) {
      cdkBuilder.senderControlPort(senderControlPort)
    }

    /**
     * The IP address that the flow communicates with to initiate connection with the sender.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-senderipaddress)
     * @param senderIpAddress The IP address that the flow communicates with to initiate connection
     * with the sender. 
     */
    override fun senderIpAddress(senderIpAddress: String) {
      cdkBuilder.senderIpAddress(senderIpAddress)
    }

    /**
     * Source IP or domain name for SRT-caller protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-sourcelisteneraddress)
     * @param sourceListenerAddress Source IP or domain name for SRT-caller protocol. 
     */
    override fun sourceListenerAddress(sourceListenerAddress: String) {
      cdkBuilder.sourceListenerAddress(sourceListenerAddress)
    }

    /**
     * Source port for SRT-caller protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-sourcelistenerport)
     * @param sourceListenerPort Source port for SRT-caller protocol. 
     */
    override fun sourceListenerPort(sourceListenerPort: Number) {
      cdkBuilder.sourceListenerPort(sourceListenerPort)
    }

    /**
     * The stream ID that you want to use for this transport.
     *
     * This parameter applies only to Zixi and SRT caller-based streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-streamid)
     * @param streamId The stream ID that you want to use for this transport. 
     */
    override fun streamId(streamId: String) {
      cdkBuilder.streamId(streamId)
    }

    /**
     * The name of the VPC interface that you want to send your output to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-vpcinterfacename)
     * @param vpcInterfaceName The name of the VPC interface that you want to send your output to. 
     */
    override fun vpcInterfaceName(vpcInterfaceName: String) {
      cdkBuilder.vpcInterfaceName(vpcInterfaceName)
    }

    /**
     * The range of IP addresses that are allowed to contribute content to your source.
     *
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowsource.html#cfn-mediaconnect-flowsource-whitelistcidr)
     * @param whitelistCidr The range of IP addresses that are allowed to contribute content to your
     * source. 
     */
    override fun whitelistCidr(whitelistCidr: String) {
      cdkBuilder.whitelistCidr(whitelistCidr)
    }

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowSource =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediaconnect.CfnFlowSource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlowSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlowSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowSource):
        CfnFlowSource = CfnFlowSource(cdkObject)

    internal fun unwrap(wrapped: CfnFlowSource):
        software.amazon.awscdk.services.mediaconnect.CfnFlowSource = wrapped.cdkObject
  }

  /**
   * Information about the encryption of the flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
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
  public interface EncryptionProperty {
    /**
     * The type of algorithm that is used for static key encryption (such as aes128, aes192, or
     * aes256).
     *
     * If you are using SPEKE or SRT-password encryption, this property must be left blank.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-algorithm)
     */
    public fun algorithm(): String? = unwrap(this).getAlgorithm()

    /**
     * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key
     * for encrypting content.
     *
     * This parameter is not valid for static key encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-constantinitializationvector)
     */
    public fun constantInitializationVector(): String? =
        unwrap(this).getConstantInitializationVector()

    /**
     * The value of one of the devices that you configured with your digital rights management (DRM)
     * platform key provider.
     *
     * This parameter is required for SPEKE encryption and is not valid for static key encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-deviceid)
     */
    public fun deviceId(): String? = unwrap(this).getDeviceId()

    /**
     * The type of key that is used for the encryption.
     *
     * If you don't specify a `keyType` value, the service uses the default setting ( `static-key`
     * ). Valid key types are: `static-key` , `speke` , and `srt-password` .
     *
     * Default: - "static-key"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-keytype)
     */
    public fun keyType(): String? = unwrap(this).getKeyType()

    /**
     * The AWS Region that the API Gateway proxy endpoint was created in.
     *
     * This parameter is required for SPEKE encryption and is not valid for static key encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-region)
     */
    public fun region(): String? = unwrap(this).getRegion()

    /**
     * An identifier for the content.
     *
     * The service sends this value to the key server to identify the current endpoint. The resource
     * ID is also known as the content ID. This parameter is required for SPEKE encryption and is not
     * valid for static key encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-resourceid)
     */
    public fun resourceId(): String? = unwrap(this).getResourceId()

    /**
     * The Amazon Resource Name (ARN) of the role that you created during setup (when you set up
     * MediaConnect as a trusted entity).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-rolearn)
     */
    public fun roleArn(): String

    /**
     * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-secretarn)
     */
    public fun secretArn(): String? = unwrap(this).getSecretArn()

    /**
     * The URL from the API Gateway proxy that you set up to talk to your key server.
     *
     * This parameter is required for SPEKE encryption and is not valid for static key encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * A builder for [EncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param algorithm The type of algorithm that is used for static key encryption (such as
       * aes128, aes192, or aes256).
       * If you are using SPEKE or SRT-password encryption, this property must be left blank.
       */
      public fun algorithm(algorithm: String)

      /**
       * @param constantInitializationVector A 128-bit, 16-byte hex value represented by a
       * 32-character string, to be used with the key for encrypting content.
       * This parameter is not valid for static key encryption.
       */
      public fun constantInitializationVector(constantInitializationVector: String)

      /**
       * @param deviceId The value of one of the devices that you configured with your digital
       * rights management (DRM) platform key provider.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      public fun deviceId(deviceId: String)

      /**
       * @param keyType The type of key that is used for the encryption.
       * If you don't specify a `keyType` value, the service uses the default setting ( `static-key`
       * ). Valid key types are: `static-key` , `speke` , and `srt-password` .
       */
      public fun keyType(keyType: String)

      /**
       * @param region The AWS Region that the API Gateway proxy endpoint was created in.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      public fun region(region: String)

      /**
       * @param resourceId An identifier for the content.
       * The service sends this value to the key server to identify the current endpoint. The
       * resource ID is also known as the content ID. This parameter is required for SPEKE encryption
       * and is not valid for static key encryption.
       */
      public fun resourceId(resourceId: String)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role that you created during setup
       * (when you set up MediaConnect as a trusted entity). 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param secretArn The ARN of the secret that you created in AWS Secrets Manager to store the
       * encryption key.
       */
      public fun secretArn(secretArn: String)

      /**
       * @param url The URL from the API Gateway proxy that you set up to talk to your key server.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.EncryptionProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.EncryptionProperty.builder()

      /**
       * @param algorithm The type of algorithm that is used for static key encryption (such as
       * aes128, aes192, or aes256).
       * If you are using SPEKE or SRT-password encryption, this property must be left blank.
       */
      override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      /**
       * @param constantInitializationVector A 128-bit, 16-byte hex value represented by a
       * 32-character string, to be used with the key for encrypting content.
       * This parameter is not valid for static key encryption.
       */
      override fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
      }

      /**
       * @param deviceId The value of one of the devices that you configured with your digital
       * rights management (DRM) platform key provider.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      override fun deviceId(deviceId: String) {
        cdkBuilder.deviceId(deviceId)
      }

      /**
       * @param keyType The type of key that is used for the encryption.
       * If you don't specify a `keyType` value, the service uses the default setting ( `static-key`
       * ). Valid key types are: `static-key` , `speke` , and `srt-password` .
       */
      override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      /**
       * @param region The AWS Region that the API Gateway proxy endpoint was created in.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      /**
       * @param resourceId An identifier for the content.
       * The service sends this value to the key server to identify the current endpoint. The
       * resource ID is also known as the content ID. This parameter is required for SPEKE encryption
       * and is not valid for static key encryption.
       */
      override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role that you created during setup
       * (when you set up MediaConnect as a trusted entity). 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param secretArn The ARN of the secret that you created in AWS Secrets Manager to store the
       * encryption key.
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      /**
       * @param url The URL from the API Gateway proxy that you set up to talk to your key server.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.EncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.EncryptionProperty,
    ) : CdkObject(cdkObject), EncryptionProperty {
      /**
       * The type of algorithm that is used for static key encryption (such as aes128, aes192, or
       * aes256).
       *
       * If you are using SPEKE or SRT-password encryption, this property must be left blank.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-algorithm)
       */
      override fun algorithm(): String? = unwrap(this).getAlgorithm()

      /**
       * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key
       * for encrypting content.
       *
       * This parameter is not valid for static key encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-constantinitializationvector)
       */
      override fun constantInitializationVector(): String? =
          unwrap(this).getConstantInitializationVector()

      /**
       * The value of one of the devices that you configured with your digital rights management
       * (DRM) platform key provider.
       *
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-deviceid)
       */
      override fun deviceId(): String? = unwrap(this).getDeviceId()

      /**
       * The type of key that is used for the encryption.
       *
       * If you don't specify a `keyType` value, the service uses the default setting ( `static-key`
       * ). Valid key types are: `static-key` , `speke` , and `srt-password` .
       *
       * Default: - "static-key"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-keytype)
       */
      override fun keyType(): String? = unwrap(this).getKeyType()

      /**
       * The AWS Region that the API Gateway proxy endpoint was created in.
       *
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-region)
       */
      override fun region(): String? = unwrap(this).getRegion()

      /**
       * An identifier for the content.
       *
       * The service sends this value to the key server to identify the current endpoint. The
       * resource ID is also known as the content ID. This parameter is required for SPEKE encryption
       * and is not valid for static key encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-resourceid)
       */
      override fun resourceId(): String? = unwrap(this).getResourceId()

      /**
       * The Amazon Resource Name (ARN) of the role that you created during setup (when you set up
       * MediaConnect as a trusted entity).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-secretarn)
       */
      override fun secretArn(): String? = unwrap(this).getSecretArn()

      /**
       * The URL from the API Gateway proxy that you set up to talk to your key server.
       *
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-encryption.html#cfn-mediaconnect-flowsource-encryption-url)
       */
      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowSource.EncryptionProperty):
          EncryptionProperty = CdkObjectWrappers.wrap(cdkObject) as? EncryptionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.EncryptionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.EncryptionProperty
    }
  }

  /**
   * The VPC interface that you want to send your output to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * VpcInterfaceAttachmentProperty vpcInterfaceAttachmentProperty =
   * VpcInterfaceAttachmentProperty.builder()
   * .vpcInterfaceName("vpcInterfaceName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-vpcinterfaceattachment.html)
   */
  public interface VpcInterfaceAttachmentProperty {
    /**
     * The name of the VPC interface that you want to send your output to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-vpcinterfaceattachment.html#cfn-mediaconnect-flowsource-vpcinterfaceattachment-vpcinterfacename)
     */
    public fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

    /**
     * A builder for [VpcInterfaceAttachmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param vpcInterfaceName The name of the VPC interface that you want to send your output to.
       */
      public fun vpcInterfaceName(vpcInterfaceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.VpcInterfaceAttachmentProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.VpcInterfaceAttachmentProperty.builder()

      /**
       * @param vpcInterfaceName The name of the VPC interface that you want to send your output to.
       */
      override fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.VpcInterfaceAttachmentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.VpcInterfaceAttachmentProperty,
    ) : CdkObject(cdkObject), VpcInterfaceAttachmentProperty {
      /**
       * The name of the VPC interface that you want to send your output to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-vpcinterfaceattachment.html#cfn-mediaconnect-flowsource-vpcinterfaceattachment-vpcinterfacename)
       */
      override fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcInterfaceAttachmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowSource.VpcInterfaceAttachmentProperty):
          VpcInterfaceAttachmentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VpcInterfaceAttachmentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcInterfaceAttachmentProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.VpcInterfaceAttachmentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.VpcInterfaceAttachmentProperty
    }
  }

  /**
   * The source configuration for cloud flows receiving a stream from a bridge.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
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
  public interface GatewayBridgeSourceProperty {
    /**
     * The ARN of the bridge feeding this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-gatewaybridgesource.html#cfn-mediaconnect-flowsource-gatewaybridgesource-bridgearn)
     */
    public fun bridgeArn(): String

    /**
     * The name of the VPC interface attachment to use for this bridge source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-gatewaybridgesource.html#cfn-mediaconnect-flowsource-gatewaybridgesource-vpcinterfaceattachment)
     */
    public fun vpcInterfaceAttachment(): Any? = unwrap(this).getVpcInterfaceAttachment()

    /**
     * A builder for [GatewayBridgeSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bridgeArn The ARN of the bridge feeding this flow. 
       */
      public fun bridgeArn(bridgeArn: String)

      /**
       * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * bridge source.
       */
      public fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable)

      /**
       * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * bridge source.
       */
      public fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty)

      /**
       * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * bridge source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc2783e910543d146007ba790ef8cae3c4b0f4c17d102fca4b56d927036fb84d")
      public
          fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.GatewayBridgeSourceProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.GatewayBridgeSourceProperty.builder()

      /**
       * @param bridgeArn The ARN of the bridge feeding this flow. 
       */
      override fun bridgeArn(bridgeArn: String) {
        cdkBuilder.bridgeArn(bridgeArn)
      }

      /**
       * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * bridge source.
       */
      override fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable) {
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(IResolvable::unwrap))
      }

      /**
       * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * bridge source.
       */
      override fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty) {
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(VpcInterfaceAttachmentProperty::unwrap))
      }

      /**
       * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * bridge source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc2783e910543d146007ba790ef8cae3c4b0f4c17d102fca4b56d927036fb84d")
      override
          fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit):
          Unit = vpcInterfaceAttachment(VpcInterfaceAttachmentProperty(vpcInterfaceAttachment))

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.GatewayBridgeSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.GatewayBridgeSourceProperty,
    ) : CdkObject(cdkObject), GatewayBridgeSourceProperty {
      /**
       * The ARN of the bridge feeding this flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-gatewaybridgesource.html#cfn-mediaconnect-flowsource-gatewaybridgesource-bridgearn)
       */
      override fun bridgeArn(): String = unwrap(this).getBridgeArn()

      /**
       * The name of the VPC interface attachment to use for this bridge source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-gatewaybridgesource.html#cfn-mediaconnect-flowsource-gatewaybridgesource-vpcinterfaceattachment)
       */
      override fun vpcInterfaceAttachment(): Any? = unwrap(this).getVpcInterfaceAttachment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GatewayBridgeSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowSource.GatewayBridgeSourceProperty):
          GatewayBridgeSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GatewayBridgeSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayBridgeSourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.GatewayBridgeSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.GatewayBridgeSourceProperty
    }
  }
}
