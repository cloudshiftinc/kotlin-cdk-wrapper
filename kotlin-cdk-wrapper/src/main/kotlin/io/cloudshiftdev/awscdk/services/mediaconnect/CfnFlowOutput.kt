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
 * SRT-caller, Zixi pull, Zixi push, and Fujitsu-QoS. CDI and ST 2110 JPEG XS protocols are not
 * currently supported by AWS CloudFormation.
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
 * .minLatency(123)
 * .name("name")
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
) : CfnResource(cdkObject), IInspectable {
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
     * This parameter applies only to RIST-based, Zixi-based, and Fujitsu-based streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-maxlatency)
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
     * The port to use when MediaConnect distributes content to the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-port)
     * @param port The port to use when MediaConnect distributes content to the output. 
     */
    public fun port(port: Number)

    /**
     * The protocol to use for the output.
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
     * This parameter applies only to RIST-based, Zixi-based, and Fujitsu-based streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-maxlatency)
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
    ) : CdkObject(cdkObject), EncryptionProperty {
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
    ) : CdkObject(cdkObject), VpcInterfaceAttachmentProperty {
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
