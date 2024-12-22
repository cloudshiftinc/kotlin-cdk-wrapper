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
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::MediaConnect::FlowOutput resource defines the destination address, protocol, and port
 * that AWS Elemental MediaConnect sends the ingested video to.
 *
 * Each flow can have up to 50 outputs. An output can have the same protocol or a different protocol
 * from the source. The following protocols are supported: RIST, RTP, RTP-FEC, SRT-listener,
 * SRT-caller, Zixi pull, and Zixi push. CDI and ST 2110 JPEG XS protocols are not currently supported
 * by AWS CloudFormation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
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
 * .mediaStreamOutputConfigurations(List.of(MediaStreamOutputConfigurationProperty.builder()
 * .encodingName("encodingName")
 * .mediaStreamName("mediaStreamName")
 * // the properties below are optional
 * .destinationConfigurations(List.of(DestinationConfigurationProperty.builder()
 * .destinationIp("destinationIp")
 * .destinationPort(123)
 * .interface(InterfaceProperty.builder()
 * .name("name")
 * .build())
 * .build()))
 * .encodingParameters(EncodingParametersProperty.builder()
 * .compressionFactor(123)
 * // the properties below are optional
 * .encoderProfile("encoderProfile")
 * .build())
 * .build()))
 * .minLatency(123)
 * .name("name")
 * .outputStatus("outputStatus")
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
public open class CfnFlowOutput(
  cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFlowOutputProps,
  ) :
      this(software.amazon.awscdk.services.mediaconnect.CfnFlowOutput(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFlowOutputProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFlowOutputProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFlowOutputProps(props)
  )

  /**
   * The ARN of the output.
   */
  public open fun attrOutputArn(): String = unwrap(this).getAttrOutputArn()

  /**
   * The range of IP addresses that are allowed to initiate output requests to this flow.
   */
  public open fun cidrAllowList(): List<String> = unwrap(this).getCidrAllowList() ?: emptyList()

  /**
   * The range of IP addresses that are allowed to initiate output requests to this flow.
   */
  public open fun cidrAllowList(`value`: List<String>) {
    unwrap(this).setCidrAllowList(`value`)
  }

  /**
   * The range of IP addresses that are allowed to initiate output requests to this flow.
   */
  public open fun cidrAllowList(vararg `value`: String): Unit = cidrAllowList(`value`.toList())

  /**
   * A description of the output.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the output.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The IP address where you want to send the output.
   */
  public open fun destination(): String? = unwrap(this).getDestination()

  /**
   * The IP address where you want to send the output.
   */
  public open fun destination(`value`: String) {
    unwrap(this).setDestination(`value`)
  }

  /**
   * The encryption credentials that you want to use for the output.
   */
  public open fun encryption(): Any? = unwrap(this).getEncryption()

  /**
   * The encryption credentials that you want to use for the output.
   */
  public open fun encryption(`value`: IResolvable) {
    unwrap(this).setEncryption(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The encryption credentials that you want to use for the output.
   */
  public open fun encryption(`value`: EncryptionProperty) {
    unwrap(this).setEncryption(`value`.let(EncryptionProperty.Companion::unwrap))
  }

  /**
   * The encryption credentials that you want to use for the output.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("34150c17429825542e545bf1fdc131117f5c2a63847265dd4a6f1ebe9a35a31d")
  public open fun encryption(`value`: EncryptionProperty.Builder.() -> Unit): Unit =
      encryption(EncryptionProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the flow this output is attached to.
   */
  public open fun flowArn(): String = unwrap(this).getFlowArn()

  /**
   * The Amazon Resource Name (ARN) of the flow this output is attached to.
   */
  public open fun flowArn(`value`: String) {
    unwrap(this).setFlowArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
   * The definition for each media stream that is associated with the output.
   */
  public open fun mediaStreamOutputConfigurations(): Any? =
      unwrap(this).getMediaStreamOutputConfigurations()

  /**
   * The definition for each media stream that is associated with the output.
   */
  public open fun mediaStreamOutputConfigurations(`value`: IResolvable) {
    unwrap(this).setMediaStreamOutputConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The definition for each media stream that is associated with the output.
   */
  public open fun mediaStreamOutputConfigurations(`value`: List<Any>) {
    unwrap(this).setMediaStreamOutputConfigurations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The definition for each media stream that is associated with the output.
   */
  public open fun mediaStreamOutputConfigurations(vararg `value`: Any): Unit =
      mediaStreamOutputConfigurations(`value`.toList())

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
   * The name of the output.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the output.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An indication of whether the new output should be enabled or disabled as soon as it is created.
   */
  public open fun outputStatus(): String? = unwrap(this).getOutputStatus()

  /**
   * An indication of whether the new output should be enabled or disabled as soon as it is created.
   */
  public open fun outputStatus(`value`: String) {
    unwrap(this).setOutputStatus(`value`)
  }

  /**
   * The port to use when MediaConnect distributes content to the output.
   */
  public open fun port(): Number? = unwrap(this).getPort()

  /**
   * The port to use when MediaConnect distributes content to the output.
   */
  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  /**
   * The protocol to use for the output.
   */
  public open fun protocol(): String = unwrap(this).getProtocol()

  /**
   * The protocol to use for the output.
   */
  public open fun protocol(`value`: String) {
    unwrap(this).setProtocol(`value`)
  }

  /**
   * The identifier that is assigned to the Zixi receiver.
   */
  public open fun remoteId(): String? = unwrap(this).getRemoteId()

  /**
   * The identifier that is assigned to the Zixi receiver.
   */
  public open fun remoteId(`value`: String) {
    unwrap(this).setRemoteId(`value`)
  }

  /**
   * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
   */
  public open fun smoothingLatency(): Number? = unwrap(this).getSmoothingLatency()

  /**
   * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
   */
  public open fun smoothingLatency(`value`: Number) {
    unwrap(this).setSmoothingLatency(`value`)
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
   * The VPC interface that you want to send your output to.
   */
  public open fun vpcInterfaceAttachment(): Any? = unwrap(this).getVpcInterfaceAttachment()

  /**
   * The VPC interface that you want to send your output to.
   */
  public open fun vpcInterfaceAttachment(`value`: IResolvable) {
    unwrap(this).setVpcInterfaceAttachment(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The VPC interface that you want to send your output to.
   */
  public open fun vpcInterfaceAttachment(`value`: VpcInterfaceAttachmentProperty) {
    unwrap(this).setVpcInterfaceAttachment(`value`.let(VpcInterfaceAttachmentProperty.Companion::unwrap))
  }

  /**
   * The VPC interface that you want to send your output to.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("15c8cd4ddbfa9debad1194d03150a7f31338a3a470c154b7b68f9e76914764e8")
  public open
      fun vpcInterfaceAttachment(`value`: VpcInterfaceAttachmentProperty.Builder.() -> Unit): Unit =
      vpcInterfaceAttachment(VpcInterfaceAttachmentProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediaconnect.CfnFlowOutput].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The range of IP addresses that are allowed to initiate output requests to this flow.
     *
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-cidrallowlist)
     * @param cidrAllowList The range of IP addresses that are allowed to initiate output requests
     * to this flow. 
     */
    public fun cidrAllowList(cidrAllowList: List<String>)

    /**
     * The range of IP addresses that are allowed to initiate output requests to this flow.
     *
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-cidrallowlist)
     * @param cidrAllowList The range of IP addresses that are allowed to initiate output requests
     * to this flow. 
     */
    public fun cidrAllowList(vararg cidrAllowList: String)

    /**
     * A description of the output.
     *
     * This description is not visible outside of the current AWS account even if the account grants
     * entitlements to other accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-description)
     * @param description A description of the output. 
     */
    public fun description(description: String)

    /**
     * The IP address where you want to send the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-destination)
     * @param destination The IP address where you want to send the output. 
     */
    public fun destination(destination: String)

    /**
     * The encryption credentials that you want to use for the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-encryption)
     * @param encryption The encryption credentials that you want to use for the output. 
     */
    public fun encryption(encryption: IResolvable)

    /**
     * The encryption credentials that you want to use for the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-encryption)
     * @param encryption The encryption credentials that you want to use for the output. 
     */
    public fun encryption(encryption: EncryptionProperty)

    /**
     * The encryption credentials that you want to use for the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-encryption)
     * @param encryption The encryption credentials that you want to use for the output. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40bfe21686627a21508f97b0b94d2276d2b7a80627f2b75acc06b464e5314460")
    public fun encryption(encryption: EncryptionProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the flow this output is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-flowarn)
     * @param flowArn The Amazon Resource Name (ARN) of the flow this output is attached to. 
     */
    public fun flowArn(flowArn: String)

    /**
     * The maximum latency in milliseconds.
     *
     * This parameter applies only to RIST-based and Zixi-based streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-maxlatency)
     * @param maxLatency The maximum latency in milliseconds. 
     */
    public fun maxLatency(maxLatency: Number)

    /**
     * The definition for each media stream that is associated with the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-mediastreamoutputconfigurations)
     * @param mediaStreamOutputConfigurations The definition for each media stream that is
     * associated with the output. 
     */
    public fun mediaStreamOutputConfigurations(mediaStreamOutputConfigurations: IResolvable)

    /**
     * The definition for each media stream that is associated with the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-mediastreamoutputconfigurations)
     * @param mediaStreamOutputConfigurations The definition for each media stream that is
     * associated with the output. 
     */
    public fun mediaStreamOutputConfigurations(mediaStreamOutputConfigurations: List<Any>)

    /**
     * The definition for each media stream that is associated with the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-mediastreamoutputconfigurations)
     * @param mediaStreamOutputConfigurations The definition for each media stream that is
     * associated with the output. 
     */
    public fun mediaStreamOutputConfigurations(vararg mediaStreamOutputConfigurations: Any)

    /**
     * The minimum latency in milliseconds for SRT-based streams.
     *
     * In streams that use the SRT protocol, this value that you set on your MediaConnect source or
     * output represents the minimal potential latency of that connection. The latency of the stream is
     * set to the highest number between the sender’s minimum latency and the receiver’s minimum
     * latency.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-minlatency)
     * @param minLatency The minimum latency in milliseconds for SRT-based streams. 
     */
    public fun minLatency(minLatency: Number)

    /**
     * The name of the output.
     *
     * This value must be unique within the current flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-name)
     * @param name The name of the output. 
     */
    public fun name(name: String)

    /**
     * An indication of whether the new output should be enabled or disabled as soon as it is
     * created.
     *
     * If you don't specify the outputStatus field in your request, MediaConnect sets it to ENABLED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-outputstatus)
     * @param outputStatus An indication of whether the new output should be enabled or disabled as
     * soon as it is created. 
     */
    public fun outputStatus(outputStatus: String)

    /**
     * The port to use when MediaConnect distributes content to the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-port)
     * @param port The port to use when MediaConnect distributes content to the output. 
     */
    public fun port(port: Number)

    /**
     * The protocol to use for the output.
     *
     *
     * AWS Elemental MediaConnect no longer supports the Fujitsu QoS protocol. This reference is
     * maintained for legacy purposes only.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-protocol)
     * @param protocol The protocol to use for the output. 
     */
    public fun protocol(protocol: String)

    /**
     * The identifier that is assigned to the Zixi receiver.
     *
     * This parameter applies only to outputs that use Zixi pull.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-remoteid)
     * @param remoteId The identifier that is assigned to the Zixi receiver. 
     */
    public fun remoteId(remoteId: String)

    /**
     * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-smoothinglatency)
     * @param smoothingLatency The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC
     * streams. 
     */
    public fun smoothingLatency(smoothingLatency: Number)

    /**
     * The stream ID that you want to use for this transport.
     *
     * This parameter applies only to Zixi and SRT caller-based streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-streamid)
     * @param streamId The stream ID that you want to use for this transport. 
     */
    public fun streamId(streamId: String)

    /**
     * The VPC interface that you want to send your output to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-vpcinterfaceattachment)
     * @param vpcInterfaceAttachment The VPC interface that you want to send your output to. 
     */
    public fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable)

    /**
     * The VPC interface that you want to send your output to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-vpcinterfaceattachment)
     * @param vpcInterfaceAttachment The VPC interface that you want to send your output to. 
     */
    public fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty)

    /**
     * The VPC interface that you want to send your output to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-vpcinterfaceattachment)
     * @param vpcInterfaceAttachment The VPC interface that you want to send your output to. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d453e2c57e9a6614af8b22f664e7a79444a20efe7a3e2be75552713a7e6a708b")
    public
        fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.Builder.create(scope, id)

    /**
     * The range of IP addresses that are allowed to initiate output requests to this flow.
     *
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-cidrallowlist)
     * @param cidrAllowList The range of IP addresses that are allowed to initiate output requests
     * to this flow. 
     */
    override fun cidrAllowList(cidrAllowList: List<String>) {
      cdkBuilder.cidrAllowList(cidrAllowList)
    }

    /**
     * The range of IP addresses that are allowed to initiate output requests to this flow.
     *
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-cidrallowlist)
     * @param cidrAllowList The range of IP addresses that are allowed to initiate output requests
     * to this flow. 
     */
    override fun cidrAllowList(vararg cidrAllowList: String): Unit =
        cidrAllowList(cidrAllowList.toList())

    /**
     * A description of the output.
     *
     * This description is not visible outside of the current AWS account even if the account grants
     * entitlements to other accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-description)
     * @param description A description of the output. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The IP address where you want to send the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-destination)
     * @param destination The IP address where you want to send the output. 
     */
    override fun destination(destination: String) {
      cdkBuilder.destination(destination)
    }

    /**
     * The encryption credentials that you want to use for the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-encryption)
     * @param encryption The encryption credentials that you want to use for the output. 
     */
    override fun encryption(encryption: IResolvable) {
      cdkBuilder.encryption(encryption.let(IResolvable.Companion::unwrap))
    }

    /**
     * The encryption credentials that you want to use for the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-encryption)
     * @param encryption The encryption credentials that you want to use for the output. 
     */
    override fun encryption(encryption: EncryptionProperty) {
      cdkBuilder.encryption(encryption.let(EncryptionProperty.Companion::unwrap))
    }

    /**
     * The encryption credentials that you want to use for the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-encryption)
     * @param encryption The encryption credentials that you want to use for the output. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40bfe21686627a21508f97b0b94d2276d2b7a80627f2b75acc06b464e5314460")
    override fun encryption(encryption: EncryptionProperty.Builder.() -> Unit): Unit =
        encryption(EncryptionProperty(encryption))

    /**
     * The Amazon Resource Name (ARN) of the flow this output is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-flowarn)
     * @param flowArn The Amazon Resource Name (ARN) of the flow this output is attached to. 
     */
    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    /**
     * The maximum latency in milliseconds.
     *
     * This parameter applies only to RIST-based and Zixi-based streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-maxlatency)
     * @param maxLatency The maximum latency in milliseconds. 
     */
    override fun maxLatency(maxLatency: Number) {
      cdkBuilder.maxLatency(maxLatency)
    }

    /**
     * The definition for each media stream that is associated with the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-mediastreamoutputconfigurations)
     * @param mediaStreamOutputConfigurations The definition for each media stream that is
     * associated with the output. 
     */
    override fun mediaStreamOutputConfigurations(mediaStreamOutputConfigurations: IResolvable) {
      cdkBuilder.mediaStreamOutputConfigurations(mediaStreamOutputConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * The definition for each media stream that is associated with the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-mediastreamoutputconfigurations)
     * @param mediaStreamOutputConfigurations The definition for each media stream that is
     * associated with the output. 
     */
    override fun mediaStreamOutputConfigurations(mediaStreamOutputConfigurations: List<Any>) {
      cdkBuilder.mediaStreamOutputConfigurations(mediaStreamOutputConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The definition for each media stream that is associated with the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-mediastreamoutputconfigurations)
     * @param mediaStreamOutputConfigurations The definition for each media stream that is
     * associated with the output. 
     */
    override fun mediaStreamOutputConfigurations(vararg mediaStreamOutputConfigurations: Any): Unit
        = mediaStreamOutputConfigurations(mediaStreamOutputConfigurations.toList())

    /**
     * The minimum latency in milliseconds for SRT-based streams.
     *
     * In streams that use the SRT protocol, this value that you set on your MediaConnect source or
     * output represents the minimal potential latency of that connection. The latency of the stream is
     * set to the highest number between the sender’s minimum latency and the receiver’s minimum
     * latency.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-minlatency)
     * @param minLatency The minimum latency in milliseconds for SRT-based streams. 
     */
    override fun minLatency(minLatency: Number) {
      cdkBuilder.minLatency(minLatency)
    }

    /**
     * The name of the output.
     *
     * This value must be unique within the current flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-name)
     * @param name The name of the output. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An indication of whether the new output should be enabled or disabled as soon as it is
     * created.
     *
     * If you don't specify the outputStatus field in your request, MediaConnect sets it to ENABLED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-outputstatus)
     * @param outputStatus An indication of whether the new output should be enabled or disabled as
     * soon as it is created. 
     */
    override fun outputStatus(outputStatus: String) {
      cdkBuilder.outputStatus(outputStatus)
    }

    /**
     * The port to use when MediaConnect distributes content to the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-port)
     * @param port The port to use when MediaConnect distributes content to the output. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * The protocol to use for the output.
     *
     *
     * AWS Elemental MediaConnect no longer supports the Fujitsu QoS protocol. This reference is
     * maintained for legacy purposes only.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-protocol)
     * @param protocol The protocol to use for the output. 
     */
    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    /**
     * The identifier that is assigned to the Zixi receiver.
     *
     * This parameter applies only to outputs that use Zixi pull.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-remoteid)
     * @param remoteId The identifier that is assigned to the Zixi receiver. 
     */
    override fun remoteId(remoteId: String) {
      cdkBuilder.remoteId(remoteId)
    }

    /**
     * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-smoothinglatency)
     * @param smoothingLatency The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC
     * streams. 
     */
    override fun smoothingLatency(smoothingLatency: Number) {
      cdkBuilder.smoothingLatency(smoothingLatency)
    }

    /**
     * The stream ID that you want to use for this transport.
     *
     * This parameter applies only to Zixi and SRT caller-based streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-streamid)
     * @param streamId The stream ID that you want to use for this transport. 
     */
    override fun streamId(streamId: String) {
      cdkBuilder.streamId(streamId)
    }

    /**
     * The VPC interface that you want to send your output to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-vpcinterfaceattachment)
     * @param vpcInterfaceAttachment The VPC interface that you want to send your output to. 
     */
    override fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable) {
      cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(IResolvable.Companion::unwrap))
    }

    /**
     * The VPC interface that you want to send your output to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-vpcinterfaceattachment)
     * @param vpcInterfaceAttachment The VPC interface that you want to send your output to. 
     */
    override fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty) {
      cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(VpcInterfaceAttachmentProperty.Companion::unwrap))
    }

    /**
     * The VPC interface that you want to send your output to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-vpcinterfaceattachment)
     * @param vpcInterfaceAttachment The VPC interface that you want to send your output to. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d453e2c57e9a6614af8b22f664e7a79444a20efe7a3e2be75552713a7e6a708b")
    override
        fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit):
        Unit = vpcInterfaceAttachment(VpcInterfaceAttachmentProperty(vpcInterfaceAttachment))

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowOutput =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlowOutput {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlowOutput(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput):
        CfnFlowOutput = CfnFlowOutput(cdkObject)

    internal fun unwrap(wrapped: CfnFlowOutput):
        software.amazon.awscdk.services.mediaconnect.CfnFlowOutput = wrapped.cdkObject as
        software.amazon.awscdk.services.mediaconnect.CfnFlowOutput
  }

  /**
   * The definition of a media stream that is associated with the output.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * DestinationConfigurationProperty destinationConfigurationProperty =
   * DestinationConfigurationProperty.builder()
   * .destinationIp("destinationIp")
   * .destinationPort(123)
   * .interface(InterfaceProperty.builder()
   * .name("name")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-destinationconfiguration.html)
   */
  public interface DestinationConfigurationProperty {
    /**
     * The IP address where contents of the media stream will be sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-destinationconfiguration.html#cfn-mediaconnect-flowoutput-destinationconfiguration-destinationip)
     */
    public fun destinationIp(): String

    /**
     * The port to use when the content of the media stream is distributed to the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-destinationconfiguration.html#cfn-mediaconnect-flowoutput-destinationconfiguration-destinationport)
     */
    public fun destinationPort(): Number

    /**
     * The VPC interface that is used for the media stream associated with the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-destinationconfiguration.html#cfn-mediaconnect-flowoutput-destinationconfiguration-interface)
     */
    public fun interfaceValue(): Any

    /**
     * A builder for [DestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationIp The IP address where contents of the media stream will be sent. 
       */
      public fun destinationIp(destinationIp: String)

      /**
       * @param destinationPort The port to use when the content of the media stream is distributed
       * to the output. 
       */
      public fun destinationPort(destinationPort: Number)

      /**
       * @param interfaceValue The VPC interface that is used for the media stream associated with
       * the output. 
       */
      public fun interfaceValue(interfaceValue: IResolvable)

      /**
       * @param interfaceValue The VPC interface that is used for the media stream associated with
       * the output. 
       */
      public fun interfaceValue(interfaceValue: InterfaceProperty)

      /**
       * @param interfaceValue The VPC interface that is used for the media stream associated with
       * the output. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ac0d67d5b865e74d398e5cc59bf54a1e5a69ed2a3166e6c5f7b051c54c959de")
      public fun interfaceValue(interfaceValue: InterfaceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.DestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.DestinationConfigurationProperty.builder()

      /**
       * @param destinationIp The IP address where contents of the media stream will be sent. 
       */
      override fun destinationIp(destinationIp: String) {
        cdkBuilder.destinationIp(destinationIp)
      }

      /**
       * @param destinationPort The port to use when the content of the media stream is distributed
       * to the output. 
       */
      override fun destinationPort(destinationPort: Number) {
        cdkBuilder.destinationPort(destinationPort)
      }

      /**
       * @param interfaceValue The VPC interface that is used for the media stream associated with
       * the output. 
       */
      override fun interfaceValue(interfaceValue: IResolvable) {
        cdkBuilder.interfaceValue(interfaceValue.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param interfaceValue The VPC interface that is used for the media stream associated with
       * the output. 
       */
      override fun interfaceValue(interfaceValue: InterfaceProperty) {
        cdkBuilder.interfaceValue(interfaceValue.let(InterfaceProperty.Companion::unwrap))
      }

      /**
       * @param interfaceValue The VPC interface that is used for the media stream associated with
       * the output. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ac0d67d5b865e74d398e5cc59bf54a1e5a69ed2a3166e6c5f7b051c54c959de")
      override fun interfaceValue(interfaceValue: InterfaceProperty.Builder.() -> Unit): Unit =
          interfaceValue(InterfaceProperty(interfaceValue))

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.DestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.DestinationConfigurationProperty,
    ) : CdkObject(cdkObject),
        DestinationConfigurationProperty {
      /**
       * The IP address where contents of the media stream will be sent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-destinationconfiguration.html#cfn-mediaconnect-flowoutput-destinationconfiguration-destinationip)
       */
      override fun destinationIp(): String = unwrap(this).getDestinationIp()

      /**
       * The port to use when the content of the media stream is distributed to the output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-destinationconfiguration.html#cfn-mediaconnect-flowoutput-destinationconfiguration-destinationport)
       */
      override fun destinationPort(): Number = unwrap(this).getDestinationPort()

      /**
       * The VPC interface that is used for the media stream associated with the output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-destinationconfiguration.html#cfn-mediaconnect-flowoutput-destinationconfiguration-interface)
       */
      override fun interfaceValue(): Any = unwrap(this).getInterfaceValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.DestinationConfigurationProperty):
          DestinationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DestinationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationConfigurationProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.DestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.DestinationConfigurationProperty
    }
  }

  /**
   * A collection of parameters that determine how MediaConnect will convert the content.
   *
   * These fields only apply to outputs on flows that have a CDI source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * EncodingParametersProperty encodingParametersProperty = EncodingParametersProperty.builder()
   * .compressionFactor(123)
   * // the properties below are optional
   * .encoderProfile("encoderProfile")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-encodingparameters.html)
   */
  public interface EncodingParametersProperty {
    /**
     * A value that is used to calculate compression for an output.
     *
     * The bitrate of the output is calculated as follows:
     *
     * Output bitrate = (1 / compressionFactor) * (source bitrate)
     *
     * This property only applies to outputs that use the ST 2110 JPEG XS protocol, with a flow
     * source that uses the CDI protocol. Valid values are in the range of 3.0 to 10.0, inclusive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-encodingparameters.html#cfn-mediaconnect-flowoutput-encodingparameters-compressionfactor)
     */
    public fun compressionFactor(): Number

    /**
     * A setting on the encoder that drives compression settings.
     *
     * This property only applies to video media streams associated with outputs that use the ST
     * 2110 JPEG XS protocol, with a flow source that uses the CDI protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-encodingparameters.html#cfn-mediaconnect-flowoutput-encodingparameters-encoderprofile)
     */
    public fun encoderProfile(): String? = unwrap(this).getEncoderProfile()

    /**
     * A builder for [EncodingParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param compressionFactor A value that is used to calculate compression for an output. 
       * The bitrate of the output is calculated as follows:
       *
       * Output bitrate = (1 / compressionFactor) * (source bitrate)
       *
       * This property only applies to outputs that use the ST 2110 JPEG XS protocol, with a flow
       * source that uses the CDI protocol. Valid values are in the range of 3.0 to 10.0, inclusive.
       */
      public fun compressionFactor(compressionFactor: Number)

      /**
       * @param encoderProfile A setting on the encoder that drives compression settings.
       * This property only applies to video media streams associated with outputs that use the ST
       * 2110 JPEG XS protocol, with a flow source that uses the CDI protocol.
       */
      public fun encoderProfile(encoderProfile: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncodingParametersProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncodingParametersProperty.builder()

      /**
       * @param compressionFactor A value that is used to calculate compression for an output. 
       * The bitrate of the output is calculated as follows:
       *
       * Output bitrate = (1 / compressionFactor) * (source bitrate)
       *
       * This property only applies to outputs that use the ST 2110 JPEG XS protocol, with a flow
       * source that uses the CDI protocol. Valid values are in the range of 3.0 to 10.0, inclusive.
       */
      override fun compressionFactor(compressionFactor: Number) {
        cdkBuilder.compressionFactor(compressionFactor)
      }

      /**
       * @param encoderProfile A setting on the encoder that drives compression settings.
       * This property only applies to video media streams associated with outputs that use the ST
       * 2110 JPEG XS protocol, with a flow source that uses the CDI protocol.
       */
      override fun encoderProfile(encoderProfile: String) {
        cdkBuilder.encoderProfile(encoderProfile)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncodingParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncodingParametersProperty,
    ) : CdkObject(cdkObject),
        EncodingParametersProperty {
      /**
       * A value that is used to calculate compression for an output.
       *
       * The bitrate of the output is calculated as follows:
       *
       * Output bitrate = (1 / compressionFactor) * (source bitrate)
       *
       * This property only applies to outputs that use the ST 2110 JPEG XS protocol, with a flow
       * source that uses the CDI protocol. Valid values are in the range of 3.0 to 10.0, inclusive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-encodingparameters.html#cfn-mediaconnect-flowoutput-encodingparameters-compressionfactor)
       */
      override fun compressionFactor(): Number = unwrap(this).getCompressionFactor()

      /**
       * A setting on the encoder that drives compression settings.
       *
       * This property only applies to video media streams associated with outputs that use the ST
       * 2110 JPEG XS protocol, with a flow source that uses the CDI protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-encodingparameters.html#cfn-mediaconnect-flowoutput-encodingparameters-encoderprofile)
       */
      override fun encoderProfile(): String? = unwrap(this).getEncoderProfile()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncodingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncodingParametersProperty):
          EncodingParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncodingParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncodingParametersProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncodingParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncodingParametersProperty
    }
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
   * .secretArn("secretArn")
   * // the properties below are optional
   * .algorithm("algorithm")
   * .keyType("keyType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-encryption.html)
   */
  public interface EncryptionProperty {
    /**
     * The type of algorithm that is used for static key encryption (such as aes128, aes192, or
     * aes256).
     *
     * If you are using SPEKE or SRT-password encryption, this property must be left blank.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-encryption.html#cfn-mediaconnect-flowoutput-encryption-algorithm)
     */
    public fun algorithm(): String? = unwrap(this).getAlgorithm()

    /**
     * The type of key that is used for the encryption.
     *
     * If you don't specify a `keyType` value, the service uses the default setting ( `static-key`
     * ). Valid key types are: `static-key` , `speke` , and `srt-password` .
     *
     * Default: - "static-key"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-encryption.html#cfn-mediaconnect-flowoutput-encryption-keytype)
     */
    public fun keyType(): String? = unwrap(this).getKeyType()

    /**
     * The Amazon Resource Name (ARN) of the role that you created during setup (when you set up
     * MediaConnect as a trusted entity).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-encryption.html#cfn-mediaconnect-flowoutput-encryption-rolearn)
     */
    public fun roleArn(): String

    /**
     * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-encryption.html#cfn-mediaconnect-flowoutput-encryption-secretarn)
     */
    public fun secretArn(): String

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
       * @param keyType The type of key that is used for the encryption.
       * If you don't specify a `keyType` value, the service uses the default setting ( `static-key`
       * ). Valid key types are: `static-key` , `speke` , and `srt-password` .
       */
      public fun keyType(keyType: String)

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
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty.builder()

      /**
       * @param algorithm The type of algorithm that is used for static key encryption (such as
       * aes128, aes192, or aes256).
       * If you are using SPEKE or SRT-password encryption, this property must be left blank.
       */
      override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
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

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty,
    ) : CdkObject(cdkObject),
        EncryptionProperty {
      /**
       * The type of algorithm that is used for static key encryption (such as aes128, aes192, or
       * aes256).
       *
       * If you are using SPEKE or SRT-password encryption, this property must be left blank.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-encryption.html#cfn-mediaconnect-flowoutput-encryption-algorithm)
       */
      override fun algorithm(): String? = unwrap(this).getAlgorithm()

      /**
       * The type of key that is used for the encryption.
       *
       * If you don't specify a `keyType` value, the service uses the default setting ( `static-key`
       * ). Valid key types are: `static-key` , `speke` , and `srt-password` .
       *
       * Default: - "static-key"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-encryption.html#cfn-mediaconnect-flowoutput-encryption-keytype)
       */
      override fun keyType(): String? = unwrap(this).getKeyType()

      /**
       * The Amazon Resource Name (ARN) of the role that you created during setup (when you set up
       * MediaConnect as a trusted entity).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-encryption.html#cfn-mediaconnect-flowoutput-encryption-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-encryption.html#cfn-mediaconnect-flowoutput-encryption-secretarn)
       */
      override fun secretArn(): String = unwrap(this).getSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty):
          EncryptionProperty = CdkObjectWrappers.wrap(cdkObject) as? EncryptionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty
    }
  }

  /**
   * The VPC interface that you want to use for the media stream associated with the output.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * InterfaceProperty interfaceProperty = InterfaceProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-interface.html)
   */
  public interface InterfaceProperty {
    /**
     * The name of the VPC interface that you want to use for the media stream associated with the
     * output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-interface.html#cfn-mediaconnect-flowoutput-interface-name)
     */
    public fun name(): String

    /**
     * A builder for [InterfaceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the VPC interface that you want to use for the media stream
       * associated with the output. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.InterfaceProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.InterfaceProperty.builder()

      /**
       * @param name The name of the VPC interface that you want to use for the media stream
       * associated with the output. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.InterfaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.InterfaceProperty,
    ) : CdkObject(cdkObject),
        InterfaceProperty {
      /**
       * The name of the VPC interface that you want to use for the media stream associated with the
       * output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-interface.html#cfn-mediaconnect-flowoutput-interface-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.InterfaceProperty):
          InterfaceProperty = CdkObjectWrappers.wrap(cdkObject) as? InterfaceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: InterfaceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.InterfaceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.InterfaceProperty
    }
  }

  /**
   * The media stream that is associated with the output, and the parameters for that association.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * MediaStreamOutputConfigurationProperty mediaStreamOutputConfigurationProperty =
   * MediaStreamOutputConfigurationProperty.builder()
   * .encodingName("encodingName")
   * .mediaStreamName("mediaStreamName")
   * // the properties below are optional
   * .destinationConfigurations(List.of(DestinationConfigurationProperty.builder()
   * .destinationIp("destinationIp")
   * .destinationPort(123)
   * .interface(InterfaceProperty.builder()
   * .name("name")
   * .build())
   * .build()))
   * .encodingParameters(EncodingParametersProperty.builder()
   * .compressionFactor(123)
   * // the properties below are optional
   * .encoderProfile("encoderProfile")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-mediastreamoutputconfiguration.html)
   */
  public interface MediaStreamOutputConfigurationProperty {
    /**
     * The media streams that you want to associate with the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-mediastreamoutputconfiguration.html#cfn-mediaconnect-flowoutput-mediastreamoutputconfiguration-destinationconfigurations)
     */
    public fun destinationConfigurations(): Any? = unwrap(this).getDestinationConfigurations()

    /**
     * The format that will be used to encode the data.
     *
     * For ancillary data streams, set the encoding name to `smpte291` .
     *
     * For audio streams, set the encoding name to `pcm` .
     *
     * For video streams on sources or outputs that use the CDI protocol, set the encoding name to
     * `raw` .
     *
     * For video streams on sources or outputs that use the ST 2110 JPEG XS protocol, set the
     * encoding name to `jxsv` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-mediastreamoutputconfiguration.html#cfn-mediaconnect-flowoutput-mediastreamoutputconfiguration-encodingname)
     */
    public fun encodingName(): String

    /**
     * A collection of parameters that determine how MediaConnect will convert the content.
     *
     * These fields only apply to outputs on flows that have a CDI source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-mediastreamoutputconfiguration.html#cfn-mediaconnect-flowoutput-mediastreamoutputconfiguration-encodingparameters)
     */
    public fun encodingParameters(): Any? = unwrap(this).getEncodingParameters()

    /**
     * A name that helps you distinguish one media stream from another.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-mediastreamoutputconfiguration.html#cfn-mediaconnect-flowoutput-mediastreamoutputconfiguration-mediastreamname)
     */
    public fun mediaStreamName(): String

    /**
     * A builder for [MediaStreamOutputConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationConfigurations The media streams that you want to associate with the
       * output.
       */
      public fun destinationConfigurations(destinationConfigurations: IResolvable)

      /**
       * @param destinationConfigurations The media streams that you want to associate with the
       * output.
       */
      public fun destinationConfigurations(destinationConfigurations: List<Any>)

      /**
       * @param destinationConfigurations The media streams that you want to associate with the
       * output.
       */
      public fun destinationConfigurations(vararg destinationConfigurations: Any)

      /**
       * @param encodingName The format that will be used to encode the data. 
       * For ancillary data streams, set the encoding name to `smpte291` .
       *
       * For audio streams, set the encoding name to `pcm` .
       *
       * For video streams on sources or outputs that use the CDI protocol, set the encoding name to
       * `raw` .
       *
       * For video streams on sources or outputs that use the ST 2110 JPEG XS protocol, set the
       * encoding name to `jxsv` .
       */
      public fun encodingName(encodingName: String)

      /**
       * @param encodingParameters A collection of parameters that determine how MediaConnect will
       * convert the content.
       * These fields only apply to outputs on flows that have a CDI source.
       */
      public fun encodingParameters(encodingParameters: IResolvable)

      /**
       * @param encodingParameters A collection of parameters that determine how MediaConnect will
       * convert the content.
       * These fields only apply to outputs on flows that have a CDI source.
       */
      public fun encodingParameters(encodingParameters: EncodingParametersProperty)

      /**
       * @param encodingParameters A collection of parameters that determine how MediaConnect will
       * convert the content.
       * These fields only apply to outputs on flows that have a CDI source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5be553b5bdfe13ccfdb8262908165d3d4c5af4a5f2edc037dae8632d9b947726")
      public
          fun encodingParameters(encodingParameters: EncodingParametersProperty.Builder.() -> Unit)

      /**
       * @param mediaStreamName A name that helps you distinguish one media stream from another. 
       */
      public fun mediaStreamName(mediaStreamName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.MediaStreamOutputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.MediaStreamOutputConfigurationProperty.builder()

      /**
       * @param destinationConfigurations The media streams that you want to associate with the
       * output.
       */
      override fun destinationConfigurations(destinationConfigurations: IResolvable) {
        cdkBuilder.destinationConfigurations(destinationConfigurations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param destinationConfigurations The media streams that you want to associate with the
       * output.
       */
      override fun destinationConfigurations(destinationConfigurations: List<Any>) {
        cdkBuilder.destinationConfigurations(destinationConfigurations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param destinationConfigurations The media streams that you want to associate with the
       * output.
       */
      override fun destinationConfigurations(vararg destinationConfigurations: Any): Unit =
          destinationConfigurations(destinationConfigurations.toList())

      /**
       * @param encodingName The format that will be used to encode the data. 
       * For ancillary data streams, set the encoding name to `smpte291` .
       *
       * For audio streams, set the encoding name to `pcm` .
       *
       * For video streams on sources or outputs that use the CDI protocol, set the encoding name to
       * `raw` .
       *
       * For video streams on sources or outputs that use the ST 2110 JPEG XS protocol, set the
       * encoding name to `jxsv` .
       */
      override fun encodingName(encodingName: String) {
        cdkBuilder.encodingName(encodingName)
      }

      /**
       * @param encodingParameters A collection of parameters that determine how MediaConnect will
       * convert the content.
       * These fields only apply to outputs on flows that have a CDI source.
       */
      override fun encodingParameters(encodingParameters: IResolvable) {
        cdkBuilder.encodingParameters(encodingParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param encodingParameters A collection of parameters that determine how MediaConnect will
       * convert the content.
       * These fields only apply to outputs on flows that have a CDI source.
       */
      override fun encodingParameters(encodingParameters: EncodingParametersProperty) {
        cdkBuilder.encodingParameters(encodingParameters.let(EncodingParametersProperty.Companion::unwrap))
      }

      /**
       * @param encodingParameters A collection of parameters that determine how MediaConnect will
       * convert the content.
       * These fields only apply to outputs on flows that have a CDI source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5be553b5bdfe13ccfdb8262908165d3d4c5af4a5f2edc037dae8632d9b947726")
      override
          fun encodingParameters(encodingParameters: EncodingParametersProperty.Builder.() -> Unit):
          Unit = encodingParameters(EncodingParametersProperty(encodingParameters))

      /**
       * @param mediaStreamName A name that helps you distinguish one media stream from another. 
       */
      override fun mediaStreamName(mediaStreamName: String) {
        cdkBuilder.mediaStreamName(mediaStreamName)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.MediaStreamOutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.MediaStreamOutputConfigurationProperty,
    ) : CdkObject(cdkObject),
        MediaStreamOutputConfigurationProperty {
      /**
       * The media streams that you want to associate with the output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-mediastreamoutputconfiguration.html#cfn-mediaconnect-flowoutput-mediastreamoutputconfiguration-destinationconfigurations)
       */
      override fun destinationConfigurations(): Any? = unwrap(this).getDestinationConfigurations()

      /**
       * The format that will be used to encode the data.
       *
       * For ancillary data streams, set the encoding name to `smpte291` .
       *
       * For audio streams, set the encoding name to `pcm` .
       *
       * For video streams on sources or outputs that use the CDI protocol, set the encoding name to
       * `raw` .
       *
       * For video streams on sources or outputs that use the ST 2110 JPEG XS protocol, set the
       * encoding name to `jxsv` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-mediastreamoutputconfiguration.html#cfn-mediaconnect-flowoutput-mediastreamoutputconfiguration-encodingname)
       */
      override fun encodingName(): String = unwrap(this).getEncodingName()

      /**
       * A collection of parameters that determine how MediaConnect will convert the content.
       *
       * These fields only apply to outputs on flows that have a CDI source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-mediastreamoutputconfiguration.html#cfn-mediaconnect-flowoutput-mediastreamoutputconfiguration-encodingparameters)
       */
      override fun encodingParameters(): Any? = unwrap(this).getEncodingParameters()

      /**
       * A name that helps you distinguish one media stream from another.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-mediastreamoutputconfiguration.html#cfn-mediaconnect-flowoutput-mediastreamoutputconfiguration-mediastreamname)
       */
      override fun mediaStreamName(): String = unwrap(this).getMediaStreamName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MediaStreamOutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.MediaStreamOutputConfigurationProperty):
          MediaStreamOutputConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MediaStreamOutputConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MediaStreamOutputConfigurationProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.MediaStreamOutputConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.MediaStreamOutputConfigurationProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-vpcinterfaceattachment.html)
   */
  public interface VpcInterfaceAttachmentProperty {
    /**
     * The name of the VPC interface that you want to send your output to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-vpcinterfaceattachment.html#cfn-mediaconnect-flowoutput-vpcinterfaceattachment-vpcinterfacename)
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
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.VpcInterfaceAttachmentProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.VpcInterfaceAttachmentProperty.builder()

      /**
       * @param vpcInterfaceName The name of the VPC interface that you want to send your output to.
       */
      override fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.VpcInterfaceAttachmentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.VpcInterfaceAttachmentProperty,
    ) : CdkObject(cdkObject),
        VpcInterfaceAttachmentProperty {
      /**
       * The name of the VPC interface that you want to send your output to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-vpcinterfaceattachment.html#cfn-mediaconnect-flowoutput-vpcinterfaceattachment-vpcinterfacename)
       */
      override fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcInterfaceAttachmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.VpcInterfaceAttachmentProperty):
          VpcInterfaceAttachmentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VpcInterfaceAttachmentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcInterfaceAttachmentProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.VpcInterfaceAttachmentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.VpcInterfaceAttachmentProperty
    }
  }
}
