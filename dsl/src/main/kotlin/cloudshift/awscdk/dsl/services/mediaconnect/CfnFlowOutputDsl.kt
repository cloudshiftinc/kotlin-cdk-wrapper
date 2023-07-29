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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnFlowOutput
import software.constructs.Construct

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
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
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
@CdkDslMarker
public class CfnFlowOutputDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFlowOutput.Builder = CfnFlowOutput.Builder.create(scope, id)

    private val _cidrAllowList: MutableList<String> = mutableListOf()

    /**
     * The range of IP addresses that are allowed to initiate output requests to this flow.
     *
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-cidrallowlist)
     *
     * @param cidrAllowList The range of IP addresses that are allowed to initiate output requests
     *   to this flow.
     */
    public fun cidrAllowList(vararg cidrAllowList: String) {
        _cidrAllowList.addAll(listOf(*cidrAllowList))
    }

    /**
     * The range of IP addresses that are allowed to initiate output requests to this flow.
     *
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-cidrallowlist)
     *
     * @param cidrAllowList The range of IP addresses that are allowed to initiate output requests
     *   to this flow.
     */
    public fun cidrAllowList(cidrAllowList: Collection<String>) {
        _cidrAllowList.addAll(cidrAllowList)
    }

    /**
     * A description of the output.
     *
     * This description is not visible outside of the current AWS account even if the account grants
     * entitlements to other accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-description)
     *
     * @param description A description of the output.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The IP address where you want to send the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-destination)
     *
     * @param destination The IP address where you want to send the output.
     */
    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    /**
     * The encryption credentials that you want to use for the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-encryption)
     *
     * @param encryption The encryption credentials that you want to use for the output.
     */
    public fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption)
    }

    /**
     * The encryption credentials that you want to use for the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-encryption)
     *
     * @param encryption The encryption credentials that you want to use for the output.
     */
    public fun encryption(encryption: CfnFlowOutput.EncryptionProperty) {
        cdkBuilder.encryption(encryption)
    }

    /**
     * The Amazon Resource Name (ARN) of the flow this output is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-flowarn)
     *
     * @param flowArn The Amazon Resource Name (ARN) of the flow this output is attached to.
     */
    public fun flowArn(flowArn: String) {
        cdkBuilder.flowArn(flowArn)
    }

    /**
     * The maximum latency in milliseconds.
     *
     * This parameter applies only to RIST-based, Zixi-based, and Fujitsu-based streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-maxlatency)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-minlatency)
     *
     * @param minLatency The minimum latency in milliseconds for SRT-based streams.
     */
    public fun minLatency(minLatency: Number) {
        cdkBuilder.minLatency(minLatency)
    }

    /**
     * The name of the VPC interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-name)
     *
     * @param name The name of the VPC interface.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The port to use when MediaConnect distributes content to the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-port)
     *
     * @param port The port to use when MediaConnect distributes content to the output.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * The protocol to use for the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-protocol)
     *
     * @param protocol The protocol to use for the output.
     */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * The identifier that is assigned to the Zixi receiver.
     *
     * This parameter applies only to outputs that use Zixi pull.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-remoteid)
     *
     * @param remoteId The identifier that is assigned to the Zixi receiver.
     */
    public fun remoteId(remoteId: String) {
        cdkBuilder.remoteId(remoteId)
    }

    /**
     * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-smoothinglatency)
     *
     * @param smoothingLatency The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC
     *   streams.
     */
    public fun smoothingLatency(smoothingLatency: Number) {
        cdkBuilder.smoothingLatency(smoothingLatency)
    }

    /**
     * The stream ID that you want to use for this transport.
     *
     * This parameter applies only to Zixi and SRT caller-based streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-streamid)
     *
     * @param streamId The stream ID that you want to use for this transport.
     */
    public fun streamId(streamId: String) {
        cdkBuilder.streamId(streamId)
    }

    /**
     * The VPC interface that you want to send your output to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-vpcinterfaceattachment)
     *
     * @param vpcInterfaceAttachment The VPC interface that you want to send your output to.
     */
    public fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable) {
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment)
    }

    /**
     * The VPC interface that you want to send your output to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowoutput.html#cfn-mediaconnect-flowoutput-vpcinterfaceattachment)
     *
     * @param vpcInterfaceAttachment The VPC interface that you want to send your output to.
     */
    public fun vpcInterfaceAttachment(
        vpcInterfaceAttachment: CfnFlowOutput.VpcInterfaceAttachmentProperty
    ) {
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment)
    }

    public fun build(): CfnFlowOutput {
        if (_cidrAllowList.isNotEmpty()) cdkBuilder.cidrAllowList(_cidrAllowList)
        return cdkBuilder.build()
    }
}
