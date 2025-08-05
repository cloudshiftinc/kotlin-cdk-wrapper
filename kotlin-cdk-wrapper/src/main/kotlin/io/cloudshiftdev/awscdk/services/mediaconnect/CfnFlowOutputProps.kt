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
 * .ndiProgramName("ndiProgramName")
 * .ndiSpeedHqQuality(123)
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
   * The range of IP addresses that should be allowed to initiate output requests to this flow.
   *
   * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for
   * example, 10.0.0.0/16.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-cidrallowlist)
   */
  public fun cidrAllowList(): List<String> = unwrap(this).getCidrAllowList() ?: emptyList()

  /**
   * A description of the output.
   *
   * This description appears only on the MediaConnect console and will not be seen by the end user.
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
   * The type of key used for the encryption.
   *
   * If no `keyType` is provided, the service will use the default setting (static-key). Allowable
   * encryption types: static-key.
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
   * The media streams that are associated with the output, and the parameters for those
   * associations.
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
   * The name of the bridge's output.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A suffix for the names of the NDI sources that the flow creates.
   *
   * If a custom name isn't specified, MediaConnect uses the output name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-ndiprogramname)
   */
  public fun ndiProgramName(): String? = unwrap(this).getNdiProgramName()

  /**
   * A quality setting for the NDI Speed HQ encoder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-ndispeedhqquality)
   */
  public fun ndiSpeedHqQuality(): Number? = unwrap(this).getNdiSpeedHqQuality()

  /**
   * An indication of whether the output should transmit data or not.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-outputstatus)
   */
  public fun outputStatus(): String? = unwrap(this).getOutputStatus()

  /**
   * The port to use when content is distributed to this output.
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
   * The remote ID for the Zixi-pull stream.
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
   * The name of the VPC interface attachment to use for this output.
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
     * @param cidrAllowList The range of IP addresses that should be allowed to initiate output
     * requests to this flow.
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     */
    public fun cidrAllowList(cidrAllowList: List<String>)

    /**
     * @param cidrAllowList The range of IP addresses that should be allowed to initiate output
     * requests to this flow.
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     */
    public fun cidrAllowList(vararg cidrAllowList: String)

    /**
     * @param description A description of the output.
     * This description appears only on the MediaConnect console and will not be seen by the end
     * user.
     */
    public fun description(description: String)

    /**
     * @param destination The IP address where you want to send the output.
     */
    public fun destination(destination: String)

    /**
     * @param encryption The type of key used for the encryption.
     * If no `keyType` is provided, the service will use the default setting (static-key). Allowable
     * encryption types: static-key.
     */
    public fun encryption(encryption: IResolvable)

    /**
     * @param encryption The type of key used for the encryption.
     * If no `keyType` is provided, the service will use the default setting (static-key). Allowable
     * encryption types: static-key.
     */
    public fun encryption(encryption: CfnFlowOutput.EncryptionProperty)

    /**
     * @param encryption The type of key used for the encryption.
     * If no `keyType` is provided, the service will use the default setting (static-key). Allowable
     * encryption types: static-key.
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
     * @param mediaStreamOutputConfigurations The media streams that are associated with the output,
     * and the parameters for those associations.
     */
    public fun mediaStreamOutputConfigurations(mediaStreamOutputConfigurations: IResolvable)

    /**
     * @param mediaStreamOutputConfigurations The media streams that are associated with the output,
     * and the parameters for those associations.
     */
    public fun mediaStreamOutputConfigurations(mediaStreamOutputConfigurations: List<Any>)

    /**
     * @param mediaStreamOutputConfigurations The media streams that are associated with the output,
     * and the parameters for those associations.
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
     * @param name The name of the bridge's output.
     */
    public fun name(name: String)

    /**
     * @param ndiProgramName A suffix for the names of the NDI sources that the flow creates.
     * If a custom name isn't specified, MediaConnect uses the output name.
     */
    public fun ndiProgramName(ndiProgramName: String)

    /**
     * @param ndiSpeedHqQuality A quality setting for the NDI Speed HQ encoder.
     */
    public fun ndiSpeedHqQuality(ndiSpeedHqQuality: Number)

    /**
     * @param outputStatus An indication of whether the output should transmit data or not.
     */
    public fun outputStatus(outputStatus: String)

    /**
     * @param port The port to use when content is distributed to this output.
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
     * @param remoteId The remote ID for the Zixi-pull stream.
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
     * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
     * output.
     */
    public fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable)

    /**
     * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
     * output.
     */
    public
        fun vpcInterfaceAttachment(vpcInterfaceAttachment: CfnFlowOutput.VpcInterfaceAttachmentProperty)

    /**
     * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
     * output.
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
     * @param cidrAllowList The range of IP addresses that should be allowed to initiate output
     * requests to this flow.
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     */
    override fun cidrAllowList(cidrAllowList: List<String>) {
      cdkBuilder.cidrAllowList(cidrAllowList)
    }

    /**
     * @param cidrAllowList The range of IP addresses that should be allowed to initiate output
     * requests to this flow.
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     */
    override fun cidrAllowList(vararg cidrAllowList: String): Unit =
        cidrAllowList(cidrAllowList.toList())

    /**
     * @param description A description of the output.
     * This description appears only on the MediaConnect console and will not be seen by the end
     * user.
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
     * @param encryption The type of key used for the encryption.
     * If no `keyType` is provided, the service will use the default setting (static-key). Allowable
     * encryption types: static-key.
     */
    override fun encryption(encryption: IResolvable) {
      cdkBuilder.encryption(encryption.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param encryption The type of key used for the encryption.
     * If no `keyType` is provided, the service will use the default setting (static-key). Allowable
     * encryption types: static-key.
     */
    override fun encryption(encryption: CfnFlowOutput.EncryptionProperty) {
      cdkBuilder.encryption(encryption.let(CfnFlowOutput.EncryptionProperty.Companion::unwrap))
    }

    /**
     * @param encryption The type of key used for the encryption.
     * If no `keyType` is provided, the service will use the default setting (static-key). Allowable
     * encryption types: static-key.
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
     * @param mediaStreamOutputConfigurations The media streams that are associated with the output,
     * and the parameters for those associations.
     */
    override fun mediaStreamOutputConfigurations(mediaStreamOutputConfigurations: IResolvable) {
      cdkBuilder.mediaStreamOutputConfigurations(mediaStreamOutputConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param mediaStreamOutputConfigurations The media streams that are associated with the output,
     * and the parameters for those associations.
     */
    override fun mediaStreamOutputConfigurations(mediaStreamOutputConfigurations: List<Any>) {
      cdkBuilder.mediaStreamOutputConfigurations(mediaStreamOutputConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param mediaStreamOutputConfigurations The media streams that are associated with the output,
     * and the parameters for those associations.
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
     * @param name The name of the bridge's output.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param ndiProgramName A suffix for the names of the NDI sources that the flow creates.
     * If a custom name isn't specified, MediaConnect uses the output name.
     */
    override fun ndiProgramName(ndiProgramName: String) {
      cdkBuilder.ndiProgramName(ndiProgramName)
    }

    /**
     * @param ndiSpeedHqQuality A quality setting for the NDI Speed HQ encoder.
     */
    override fun ndiSpeedHqQuality(ndiSpeedHqQuality: Number) {
      cdkBuilder.ndiSpeedHqQuality(ndiSpeedHqQuality)
    }

    /**
     * @param outputStatus An indication of whether the output should transmit data or not.
     */
    override fun outputStatus(outputStatus: String) {
      cdkBuilder.outputStatus(outputStatus)
    }

    /**
     * @param port The port to use when content is distributed to this output.
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
     * @param remoteId The remote ID for the Zixi-pull stream.
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
     * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
     * output.
     */
    override fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable) {
      cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
     * output.
     */
    override
        fun vpcInterfaceAttachment(vpcInterfaceAttachment: CfnFlowOutput.VpcInterfaceAttachmentProperty) {
      cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(CfnFlowOutput.VpcInterfaceAttachmentProperty.Companion::unwrap))
    }

    /**
     * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
     * output.
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
     * The range of IP addresses that should be allowed to initiate output requests to this flow.
     *
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-cidrallowlist)
     */
    override fun cidrAllowList(): List<String> = unwrap(this).getCidrAllowList() ?: emptyList()

    /**
     * A description of the output.
     *
     * This description appears only on the MediaConnect console and will not be seen by the end
     * user.
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
     * The type of key used for the encryption.
     *
     * If no `keyType` is provided, the service will use the default setting (static-key). Allowable
     * encryption types: static-key.
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
     * The media streams that are associated with the output, and the parameters for those
     * associations.
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
     * The name of the bridge's output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * A suffix for the names of the NDI sources that the flow creates.
     *
     * If a custom name isn't specified, MediaConnect uses the output name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-ndiprogramname)
     */
    override fun ndiProgramName(): String? = unwrap(this).getNdiProgramName()

    /**
     * A quality setting for the NDI Speed HQ encoder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-ndispeedhqquality)
     */
    override fun ndiSpeedHqQuality(): Number? = unwrap(this).getNdiSpeedHqQuality()

    /**
     * An indication of whether the output should transmit data or not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-outputstatus)
     */
    override fun outputStatus(): String? = unwrap(this).getOutputStatus()

    /**
     * The port to use when content is distributed to this output.
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
     * The remote ID for the Zixi-pull stream.
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
     * The name of the VPC interface attachment to use for this output.
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
