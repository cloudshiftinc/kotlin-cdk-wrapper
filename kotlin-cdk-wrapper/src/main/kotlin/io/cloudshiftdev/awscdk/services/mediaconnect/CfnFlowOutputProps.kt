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
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFlowOutput`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
 * CfnFlowOutputProps cfnFlowOutputProps = CfnFlowOutputProps.builder()
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
public interface CfnFlowOutputProps {
  /**
   * The range of IP addresses that are allowed to initiate output requests to this flow.
   *
   * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
   * 10.0.0.0/16.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-cidrallowlist)
   */
  public fun cidrAllowList(): List<String> = unwrap(this).getCidrAllowList() ?: emptyList()

  /**
   * A description of the output.
   *
   * This description is not visible outside of the current AWS account even if the account grants
   * entitlements to other accounts.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The IP address where you want to send the output.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-destination)
   */
  public fun destination(): String? = unwrap(this).getDestination()

  /**
   * The encryption credentials that you want to use for the output.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-encryption)
   */
  public fun encryption(): Any? = unwrap(this).getEncryption()

  /**
   * The Amazon Resource Name (ARN) of the flow this output is attached to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-flowarn)
   */
  public fun flowArn(): String

  /**
   * The maximum latency in milliseconds.
   *
   * This parameter applies only to RIST-based and Zixi-based streams.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-maxlatency)
   */
  public fun maxLatency(): Number? = unwrap(this).getMaxLatency()

  /**
   * The definition for each media stream that is associated with the output.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-mediastreamoutputconfigurations)
   */
  public fun mediaStreamOutputConfigurations(): Any? =
      unwrap(this).getMediaStreamOutputConfigurations()

  /**
   * The minimum latency in milliseconds for SRT-based streams.
   *
   * In streams that use the SRT protocol, this value that you set on your MediaConnect source or
   * output represents the minimal potential latency of that connection. The latency of the stream is
   * set to the highest number between the sender’s minimum latency and the receiver’s minimum latency.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-minlatency)
   */
  public fun minLatency(): Number? = unwrap(this).getMinLatency()

  /**
   * The name of the output.
   *
   * This value must be unique within the current flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * An indication of whether the new output should be enabled or disabled as soon as it is created.
   *
   * If you don't specify the outputStatus field in your request, MediaConnect sets it to ENABLED.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-outputstatus)
   */
  public fun outputStatus(): String? = unwrap(this).getOutputStatus()

  /**
   * The port to use when MediaConnect distributes content to the output.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-port)
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * The protocol to use for the output.
   *
   *
   * AWS Elemental MediaConnect no longer supports the Fujitsu QoS protocol. This reference is
   * maintained for legacy purposes only.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-protocol)
   */
  public fun protocol(): String

  /**
   * The identifier that is assigned to the Zixi receiver.
   *
   * This parameter applies only to outputs that use Zixi pull.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-remoteid)
   */
  public fun remoteId(): String? = unwrap(this).getRemoteId()

  /**
   * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-smoothinglatency)
   */
  public fun smoothingLatency(): Number? = unwrap(this).getSmoothingLatency()

  /**
   * The stream ID that you want to use for this transport.
   *
   * This parameter applies only to Zixi and SRT caller-based streams.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-streamid)
   */
  public fun streamId(): String? = unwrap(this).getStreamId()

  /**
   * The VPC interface that you want to send your output to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-vpcinterfaceattachment)
   */
  public fun vpcInterfaceAttachment(): Any? = unwrap(this).getVpcInterfaceAttachment()

  /**
   * A builder for [CfnFlowOutputProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidrAllowList The range of IP addresses that are allowed to initiate output requests
     * to this flow.
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     */
    public fun cidrAllowList(cidrAllowList: List<String>)

    /**
     * @param cidrAllowList The range of IP addresses that are allowed to initiate output requests
     * to this flow.
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     */
    public fun cidrAllowList(vararg cidrAllowList: String)

    /**
     * @param description A description of the output.
     * This description is not visible outside of the current AWS account even if the account grants
     * entitlements to other accounts.
     */
    public fun description(description: String)

    /**
     * @param destination The IP address where you want to send the output.
     */
    public fun destination(destination: String)

    /**
     * @param encryption The encryption credentials that you want to use for the output.
     */
    public fun encryption(encryption: IResolvable)

    /**
     * @param encryption The encryption credentials that you want to use for the output.
     */
    public fun encryption(encryption: CfnFlowOutput.EncryptionProperty)

    /**
     * @param encryption The encryption credentials that you want to use for the output.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f59ced2d139f794ca3d4f98e5468ddee0649043a41bfa5db7c3e30fd5d413d93")
    public fun encryption(encryption: CfnFlowOutput.EncryptionProperty.Builder.() -> Unit)

    /**
     * @param flowArn The Amazon Resource Name (ARN) of the flow this output is attached to. 
     */
    public fun flowArn(flowArn: String)

    /**
     * @param maxLatency The maximum latency in milliseconds.
     * This parameter applies only to RIST-based and Zixi-based streams.
     */
    public fun maxLatency(maxLatency: Number)

    /**
     * @param mediaStreamOutputConfigurations The definition for each media stream that is
     * associated with the output.
     */
    public fun mediaStreamOutputConfigurations(mediaStreamOutputConfigurations: IResolvable)

    /**
     * @param mediaStreamOutputConfigurations The definition for each media stream that is
     * associated with the output.
     */
    public fun mediaStreamOutputConfigurations(mediaStreamOutputConfigurations: List<Any>)

    /**
     * @param mediaStreamOutputConfigurations The definition for each media stream that is
     * associated with the output.
     */
    public fun mediaStreamOutputConfigurations(vararg mediaStreamOutputConfigurations: Any)

    /**
     * @param minLatency The minimum latency in milliseconds for SRT-based streams.
     * In streams that use the SRT protocol, this value that you set on your MediaConnect source or
     * output represents the minimal potential latency of that connection. The latency of the stream is
     * set to the highest number between the sender’s minimum latency and the receiver’s minimum
     * latency.
     */
    public fun minLatency(minLatency: Number)

    /**
     * @param name The name of the output.
     * This value must be unique within the current flow.
     */
    public fun name(name: String)

    /**
     * @param outputStatus An indication of whether the new output should be enabled or disabled as
     * soon as it is created.
     * If you don't specify the outputStatus field in your request, MediaConnect sets it to ENABLED.
     */
    public fun outputStatus(outputStatus: String)

    /**
     * @param port The port to use when MediaConnect distributes content to the output.
     */
    public fun port(port: Number)

    /**
     * @param protocol The protocol to use for the output. 
     *
     * AWS Elemental MediaConnect no longer supports the Fujitsu QoS protocol. This reference is
     * maintained for legacy purposes only.
     */
    public fun protocol(protocol: String)

    /**
     * @param remoteId The identifier that is assigned to the Zixi receiver.
     * This parameter applies only to outputs that use Zixi pull.
     */
    public fun remoteId(remoteId: String)

    /**
     * @param smoothingLatency The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC
     * streams.
     */
    public fun smoothingLatency(smoothingLatency: Number)

    /**
     * @param streamId The stream ID that you want to use for this transport.
     * This parameter applies only to Zixi and SRT caller-based streams.
     */
    public fun streamId(streamId: String)

    /**
     * @param vpcInterfaceAttachment The VPC interface that you want to send your output to.
     */
    public fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable)

    /**
     * @param vpcInterfaceAttachment The VPC interface that you want to send your output to.
     */
    public
        fun vpcInterfaceAttachment(vpcInterfaceAttachment: CfnFlowOutput.VpcInterfaceAttachmentProperty)

    /**
     * @param vpcInterfaceAttachment The VPC interface that you want to send your output to.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f53231f0185723a488a606bc19d0ac25b401cce21ea6fa43381af0fef59ba93c")
    public
        fun vpcInterfaceAttachment(vpcInterfaceAttachment: CfnFlowOutput.VpcInterfaceAttachmentProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps.Builder
        = software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps.builder()

    /**
     * @param cidrAllowList The range of IP addresses that are allowed to initiate output requests
     * to this flow.
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     */
    override fun cidrAllowList(cidrAllowList: List<String>) {
      cdkBuilder.cidrAllowList(cidrAllowList)
    }

    /**
     * @param cidrAllowList The range of IP addresses that are allowed to initiate output requests
     * to this flow.
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     */
    override fun cidrAllowList(vararg cidrAllowList: String): Unit =
        cidrAllowList(cidrAllowList.toList())

    /**
     * @param description A description of the output.
     * This description is not visible outside of the current AWS account even if the account grants
     * entitlements to other accounts.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param destination The IP address where you want to send the output.
     */
    override fun destination(destination: String) {
      cdkBuilder.destination(destination)
    }

    /**
     * @param encryption The encryption credentials that you want to use for the output.
     */
    override fun encryption(encryption: IResolvable) {
      cdkBuilder.encryption(encryption.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param encryption The encryption credentials that you want to use for the output.
     */
    override fun encryption(encryption: CfnFlowOutput.EncryptionProperty) {
      cdkBuilder.encryption(encryption.let(CfnFlowOutput.EncryptionProperty.Companion::unwrap))
    }

    /**
     * @param encryption The encryption credentials that you want to use for the output.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f59ced2d139f794ca3d4f98e5468ddee0649043a41bfa5db7c3e30fd5d413d93")
    override fun encryption(encryption: CfnFlowOutput.EncryptionProperty.Builder.() -> Unit): Unit =
        encryption(CfnFlowOutput.EncryptionProperty(encryption))

    /**
     * @param flowArn The Amazon Resource Name (ARN) of the flow this output is attached to. 
     */
    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    /**
     * @param maxLatency The maximum latency in milliseconds.
     * This parameter applies only to RIST-based and Zixi-based streams.
     */
    override fun maxLatency(maxLatency: Number) {
      cdkBuilder.maxLatency(maxLatency)
    }

    /**
     * @param mediaStreamOutputConfigurations The definition for each media stream that is
     * associated with the output.
     */
    override fun mediaStreamOutputConfigurations(mediaStreamOutputConfigurations: IResolvable) {
      cdkBuilder.mediaStreamOutputConfigurations(mediaStreamOutputConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param mediaStreamOutputConfigurations The definition for each media stream that is
     * associated with the output.
     */
    override fun mediaStreamOutputConfigurations(mediaStreamOutputConfigurations: List<Any>) {
      cdkBuilder.mediaStreamOutputConfigurations(mediaStreamOutputConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param mediaStreamOutputConfigurations The definition for each media stream that is
     * associated with the output.
     */
    override fun mediaStreamOutputConfigurations(vararg mediaStreamOutputConfigurations: Any): Unit
        = mediaStreamOutputConfigurations(mediaStreamOutputConfigurations.toList())

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
     * @param name The name of the output.
     * This value must be unique within the current flow.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param outputStatus An indication of whether the new output should be enabled or disabled as
     * soon as it is created.
     * If you don't specify the outputStatus field in your request, MediaConnect sets it to ENABLED.
     */
    override fun outputStatus(outputStatus: String) {
      cdkBuilder.outputStatus(outputStatus)
    }

    /**
     * @param port The port to use when MediaConnect distributes content to the output.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param protocol The protocol to use for the output. 
     *
     * AWS Elemental MediaConnect no longer supports the Fujitsu QoS protocol. This reference is
     * maintained for legacy purposes only.
     */
    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    /**
     * @param remoteId The identifier that is assigned to the Zixi receiver.
     * This parameter applies only to outputs that use Zixi pull.
     */
    override fun remoteId(remoteId: String) {
      cdkBuilder.remoteId(remoteId)
    }

    /**
     * @param smoothingLatency The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC
     * streams.
     */
    override fun smoothingLatency(smoothingLatency: Number) {
      cdkBuilder.smoothingLatency(smoothingLatency)
    }

    /**
     * @param streamId The stream ID that you want to use for this transport.
     * This parameter applies only to Zixi and SRT caller-based streams.
     */
    override fun streamId(streamId: String) {
      cdkBuilder.streamId(streamId)
    }

    /**
     * @param vpcInterfaceAttachment The VPC interface that you want to send your output to.
     */
    override fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable) {
      cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcInterfaceAttachment The VPC interface that you want to send your output to.
     */
    override
        fun vpcInterfaceAttachment(vpcInterfaceAttachment: CfnFlowOutput.VpcInterfaceAttachmentProperty) {
      cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(CfnFlowOutput.VpcInterfaceAttachmentProperty.Companion::unwrap))
    }

    /**
     * @param vpcInterfaceAttachment The VPC interface that you want to send your output to.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f53231f0185723a488a606bc19d0ac25b401cce21ea6fa43381af0fef59ba93c")
    override
        fun vpcInterfaceAttachment(vpcInterfaceAttachment: CfnFlowOutput.VpcInterfaceAttachmentProperty.Builder.() -> Unit):
        Unit =
        vpcInterfaceAttachment(CfnFlowOutput.VpcInterfaceAttachmentProperty(vpcInterfaceAttachment))

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps,
  ) : CdkObject(cdkObject),
      CfnFlowOutputProps {
    /**
     * The range of IP addresses that are allowed to initiate output requests to this flow.
     *
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-cidrallowlist)
     */
    override fun cidrAllowList(): List<String> = unwrap(this).getCidrAllowList() ?: emptyList()

    /**
     * A description of the output.
     *
     * This description is not visible outside of the current AWS account even if the account grants
     * entitlements to other accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The IP address where you want to send the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-destination)
     */
    override fun destination(): String? = unwrap(this).getDestination()

    /**
     * The encryption credentials that you want to use for the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-encryption)
     */
    override fun encryption(): Any? = unwrap(this).getEncryption()

    /**
     * The Amazon Resource Name (ARN) of the flow this output is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-flowarn)
     */
    override fun flowArn(): String = unwrap(this).getFlowArn()

    /**
     * The maximum latency in milliseconds.
     *
     * This parameter applies only to RIST-based and Zixi-based streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-maxlatency)
     */
    override fun maxLatency(): Number? = unwrap(this).getMaxLatency()

    /**
     * The definition for each media stream that is associated with the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-mediastreamoutputconfigurations)
     */
    override fun mediaStreamOutputConfigurations(): Any? =
        unwrap(this).getMediaStreamOutputConfigurations()

    /**
     * The minimum latency in milliseconds for SRT-based streams.
     *
     * In streams that use the SRT protocol, this value that you set on your MediaConnect source or
     * output represents the minimal potential latency of that connection. The latency of the stream is
     * set to the highest number between the sender’s minimum latency and the receiver’s minimum
     * latency.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-minlatency)
     */
    override fun minLatency(): Number? = unwrap(this).getMinLatency()

    /**
     * The name of the output.
     *
     * This value must be unique within the current flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * An indication of whether the new output should be enabled or disabled as soon as it is
     * created.
     *
     * If you don't specify the outputStatus field in your request, MediaConnect sets it to ENABLED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-outputstatus)
     */
    override fun outputStatus(): String? = unwrap(this).getOutputStatus()

    /**
     * The port to use when MediaConnect distributes content to the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-port)
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * The protocol to use for the output.
     *
     *
     * AWS Elemental MediaConnect no longer supports the Fujitsu QoS protocol. This reference is
     * maintained for legacy purposes only.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-protocol)
     */
    override fun protocol(): String = unwrap(this).getProtocol()

    /**
     * The identifier that is assigned to the Zixi receiver.
     *
     * This parameter applies only to outputs that use Zixi pull.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-remoteid)
     */
    override fun remoteId(): String? = unwrap(this).getRemoteId()

    /**
     * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-smoothinglatency)
     */
    override fun smoothingLatency(): Number? = unwrap(this).getSmoothingLatency()

    /**
     * The stream ID that you want to use for this transport.
     *
     * This parameter applies only to Zixi and SRT caller-based streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-streamid)
     */
    override fun streamId(): String? = unwrap(this).getStreamId()

    /**
     * The VPC interface that you want to send your output to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-vpcinterfaceattachment)
     */
    override fun vpcInterfaceAttachment(): Any? = unwrap(this).getVpcInterfaceAttachment()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowOutputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps):
        CfnFlowOutputProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFlowOutputProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowOutputProps):
        software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps
  }
}
