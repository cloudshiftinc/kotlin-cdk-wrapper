@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnFlowOutput
import software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps

@CdkDslMarker
public class CfnFlowOutputPropsDsl {
  private val cdkBuilder: CfnFlowOutputProps.Builder = CfnFlowOutputProps.builder()

  private val _cidrAllowList: MutableList<String> = mutableListOf()

  /**
   * @param cidrAllowList The range of IP addresses that are allowed to initiate output requests to
   * this flow.
   * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
   * 10.0.0.0/16.
   */
  public fun cidrAllowList(vararg cidrAllowList: String) {
    _cidrAllowList.addAll(listOf(*cidrAllowList))
  }

  /**
   * @param cidrAllowList The range of IP addresses that are allowed to initiate output requests to
   * this flow.
   * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
   * 10.0.0.0/16.
   */
  public fun cidrAllowList(cidrAllowList: Collection<String>) {
    _cidrAllowList.addAll(cidrAllowList)
  }

  /**
   * @param description A description of the output.
   * This description is not visible outside of the current AWS account even if the account grants
   * entitlements to other accounts.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param destination The IP address where you want to send the output.
   */
  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param encryption The encryption credentials that you want to use for the output.
   */
  public fun encryption(encryption: IResolvable) {
    cdkBuilder.encryption(encryption)
  }

  /**
   * @param encryption The encryption credentials that you want to use for the output.
   */
  public fun encryption(encryption: CfnFlowOutput.EncryptionProperty) {
    cdkBuilder.encryption(encryption)
  }

  /**
   * @param flowArn The Amazon Resource Name (ARN) of the flow this output is attached to. 
   */
  public fun flowArn(flowArn: String) {
    cdkBuilder.flowArn(flowArn)
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
   * @param name The name of the VPC interface.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param port The port to use when MediaConnect distributes content to the output.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param protocol The protocol to use for the output. 
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param remoteId The identifier that is assigned to the Zixi receiver.
   * This parameter applies only to outputs that use Zixi pull.
   */
  public fun remoteId(remoteId: String) {
    cdkBuilder.remoteId(remoteId)
  }

  /**
   * @param smoothingLatency The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC
   * streams.
   */
  public fun smoothingLatency(smoothingLatency: Number) {
    cdkBuilder.smoothingLatency(smoothingLatency)
  }

  /**
   * @param streamId The stream ID that you want to use for this transport.
   * This parameter applies only to Zixi and SRT caller-based streams.
   */
  public fun streamId(streamId: String) {
    cdkBuilder.streamId(streamId)
  }

  /**
   * @param vpcInterfaceAttachment The VPC interface that you want to send your output to.
   */
  public fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable) {
    cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment)
  }

  /**
   * @param vpcInterfaceAttachment The VPC interface that you want to send your output to.
   */
  public
      fun vpcInterfaceAttachment(vpcInterfaceAttachment: CfnFlowOutput.VpcInterfaceAttachmentProperty) {
    cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment)
  }

  public fun build(): CfnFlowOutputProps {
    if(_cidrAllowList.isNotEmpty()) cdkBuilder.cidrAllowList(_cidrAllowList)
    return cdkBuilder.build()
  }
}
