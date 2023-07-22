@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps

@CdkDslMarker
public class CfnTrafficMirrorSessionPropsDsl {
  private val cdkBuilder: CfnTrafficMirrorSessionProps.Builder =
      CfnTrafficMirrorSessionProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description The description of the Traffic Mirror session.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param networkInterfaceId The ID of the source network interface. 
   */
  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  /**
   * @param packetLength The number of bytes in each packet to mirror.
   * These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror
   * the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you
   * want to mirror. For example, if you set this value to 100, then the first 100 bytes that meet the
   * filter criteria are copied to the target.
   *
   * If you do not want to mirror the entire packet, use the `PacketLength` parameter to specify the
   * number of bytes in each packet to mirror.
   */
  public fun packetLength(packetLength: Number) {
    cdkBuilder.packetLength(packetLength)
  }

  /**
   * @param sessionNumber The session number determines the order in which sessions are evaluated
   * when an interface is used by multiple sessions. 
   * The first session with a matching filter is the one that mirrors the packets.
   *
   * Valid values are 1-32766.
   */
  public fun sessionNumber(sessionNumber: Number) {
    cdkBuilder.sessionNumber(sessionNumber)
  }

  /**
   * @param tags The tags to assign to a Traffic Mirror session.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to assign to a Traffic Mirror session.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param trafficMirrorFilterId The ID of the Traffic Mirror filter. 
   */
  public fun trafficMirrorFilterId(trafficMirrorFilterId: String) {
    cdkBuilder.trafficMirrorFilterId(trafficMirrorFilterId)
  }

  /**
   * @param trafficMirrorTargetId The ID of the Traffic Mirror target. 
   */
  public fun trafficMirrorTargetId(trafficMirrorTargetId: String) {
    cdkBuilder.trafficMirrorTargetId(trafficMirrorTargetId)
  }

  /**
   * @param virtualNetworkId The VXLAN ID for the Traffic Mirror session.
   * For more information about the VXLAN protocol, see [RFC
   * 7348](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc7348) . If you do not specify a
   * `VirtualNetworkId` , an account-wide unique id is chosen at random.
   */
  public fun virtualNetworkId(virtualNetworkId: Number) {
    cdkBuilder.virtualNetworkId(virtualNetworkId)
  }

  public fun build(): CfnTrafficMirrorSessionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
