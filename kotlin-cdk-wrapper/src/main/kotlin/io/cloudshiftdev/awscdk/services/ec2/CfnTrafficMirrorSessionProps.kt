@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnTrafficMirrorSession`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnTrafficMirrorSessionProps cfnTrafficMirrorSessionProps =
 * CfnTrafficMirrorSessionProps.builder()
 * .networkInterfaceId("networkInterfaceId")
 * .sessionNumber(123)
 * .trafficMirrorFilterId("trafficMirrorFilterId")
 * .trafficMirrorTargetId("trafficMirrorTargetId")
 * // the properties below are optional
 * .description("description")
 * .packetLength(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .virtualNetworkId(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html)
 */
public interface CfnTrafficMirrorSessionProps {
  /**
   * The description of the Traffic Mirror session.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the source network interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-networkinterfaceid)
   */
  public fun networkInterfaceId(): String

  /**
   * The number of bytes in each packet to mirror.
   *
   * These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror
   * the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you
   * want to mirror. For example, if you set this value to 100, then the first 100 bytes that meet the
   * filter criteria are copied to the target.
   *
   * If you do not want to mirror the entire packet, use the `PacketLength` parameter to specify the
   * number of bytes in each packet to mirror.
   *
   * For sessions with Network Load Balancer (NLB) Traffic Mirror targets the default `PacketLength`
   * will be set to 8500. Valid values are 1-8500. Setting a `PacketLength` greater than 8500 will
   * result in an error response.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-packetlength)
   */
  public fun packetLength(): Number? = unwrap(this).getPacketLength()

  /**
   * The session number determines the order in which sessions are evaluated when an interface is
   * used by multiple sessions.
   *
   * The first session with a matching filter is the one that mirrors the packets.
   *
   * Valid values are 1-32766.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-sessionnumber)
   */
  public fun sessionNumber(): Number

  /**
   * The tags to assign to a Traffic Mirror session.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the Traffic Mirror filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-trafficmirrorfilterid)
   */
  public fun trafficMirrorFilterId(): String

  /**
   * The ID of the Traffic Mirror target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-trafficmirrortargetid)
   */
  public fun trafficMirrorTargetId(): String

  /**
   * The VXLAN ID for the Traffic Mirror session.
   *
   * For more information about the VXLAN protocol, see [RFC
   * 7348](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc7348) . If you do not
   * specify a `VirtualNetworkId` , an account-wide unique ID is chosen at random.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-virtualnetworkid)
   */
  public fun virtualNetworkId(): Number? = unwrap(this).getVirtualNetworkId()

  /**
   * A builder for [CfnTrafficMirrorSessionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the Traffic Mirror session.
     */
    public fun description(description: String)

    /**
     * @param networkInterfaceId The ID of the source network interface. 
     */
    public fun networkInterfaceId(networkInterfaceId: String)

    /**
     * @param packetLength The number of bytes in each packet to mirror.
     * These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror
     * the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you
     * want to mirror. For example, if you set this value to 100, then the first 100 bytes that meet
     * the filter criteria are copied to the target.
     *
     * If you do not want to mirror the entire packet, use the `PacketLength` parameter to specify
     * the number of bytes in each packet to mirror.
     *
     * For sessions with Network Load Balancer (NLB) Traffic Mirror targets the default
     * `PacketLength` will be set to 8500. Valid values are 1-8500. Setting a `PacketLength` greater
     * than 8500 will result in an error response.
     */
    public fun packetLength(packetLength: Number)

    /**
     * @param sessionNumber The session number determines the order in which sessions are evaluated
     * when an interface is used by multiple sessions. 
     * The first session with a matching filter is the one that mirrors the packets.
     *
     * Valid values are 1-32766.
     */
    public fun sessionNumber(sessionNumber: Number)

    /**
     * @param tags The tags to assign to a Traffic Mirror session.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to assign to a Traffic Mirror session.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param trafficMirrorFilterId The ID of the Traffic Mirror filter. 
     */
    public fun trafficMirrorFilterId(trafficMirrorFilterId: String)

    /**
     * @param trafficMirrorTargetId The ID of the Traffic Mirror target. 
     */
    public fun trafficMirrorTargetId(trafficMirrorTargetId: String)

    /**
     * @param virtualNetworkId The VXLAN ID for the Traffic Mirror session.
     * For more information about the VXLAN protocol, see [RFC
     * 7348](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc7348) . If you do not
     * specify a `VirtualNetworkId` , an account-wide unique ID is chosen at random.
     */
    public fun virtualNetworkId(virtualNetworkId: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps.Builder
        = software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps.builder()

    /**
     * @param description The description of the Traffic Mirror session.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param networkInterfaceId The ID of the source network interface. 
     */
    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * @param packetLength The number of bytes in each packet to mirror.
     * These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror
     * the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you
     * want to mirror. For example, if you set this value to 100, then the first 100 bytes that meet
     * the filter criteria are copied to the target.
     *
     * If you do not want to mirror the entire packet, use the `PacketLength` parameter to specify
     * the number of bytes in each packet to mirror.
     *
     * For sessions with Network Load Balancer (NLB) Traffic Mirror targets the default
     * `PacketLength` will be set to 8500. Valid values are 1-8500. Setting a `PacketLength` greater
     * than 8500 will result in an error response.
     */
    override fun packetLength(packetLength: Number) {
      cdkBuilder.packetLength(packetLength)
    }

    /**
     * @param sessionNumber The session number determines the order in which sessions are evaluated
     * when an interface is used by multiple sessions. 
     * The first session with a matching filter is the one that mirrors the packets.
     *
     * Valid values are 1-32766.
     */
    override fun sessionNumber(sessionNumber: Number) {
      cdkBuilder.sessionNumber(sessionNumber)
    }

    /**
     * @param tags The tags to assign to a Traffic Mirror session.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to assign to a Traffic Mirror session.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param trafficMirrorFilterId The ID of the Traffic Mirror filter. 
     */
    override fun trafficMirrorFilterId(trafficMirrorFilterId: String) {
      cdkBuilder.trafficMirrorFilterId(trafficMirrorFilterId)
    }

    /**
     * @param trafficMirrorTargetId The ID of the Traffic Mirror target. 
     */
    override fun trafficMirrorTargetId(trafficMirrorTargetId: String) {
      cdkBuilder.trafficMirrorTargetId(trafficMirrorTargetId)
    }

    /**
     * @param virtualNetworkId The VXLAN ID for the Traffic Mirror session.
     * For more information about the VXLAN protocol, see [RFC
     * 7348](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc7348) . If you do not
     * specify a `VirtualNetworkId` , an account-wide unique ID is chosen at random.
     */
    override fun virtualNetworkId(virtualNetworkId: Number) {
      cdkBuilder.virtualNetworkId(virtualNetworkId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps,
  ) : CdkObject(cdkObject),
      CfnTrafficMirrorSessionProps {
    /**
     * The description of the Traffic Mirror session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the source network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-networkinterfaceid)
     */
    override fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

    /**
     * The number of bytes in each packet to mirror.
     *
     * These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror
     * the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you
     * want to mirror. For example, if you set this value to 100, then the first 100 bytes that meet
     * the filter criteria are copied to the target.
     *
     * If you do not want to mirror the entire packet, use the `PacketLength` parameter to specify
     * the number of bytes in each packet to mirror.
     *
     * For sessions with Network Load Balancer (NLB) Traffic Mirror targets the default
     * `PacketLength` will be set to 8500. Valid values are 1-8500. Setting a `PacketLength` greater
     * than 8500 will result in an error response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-packetlength)
     */
    override fun packetLength(): Number? = unwrap(this).getPacketLength()

    /**
     * The session number determines the order in which sessions are evaluated when an interface is
     * used by multiple sessions.
     *
     * The first session with a matching filter is the one that mirrors the packets.
     *
     * Valid values are 1-32766.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-sessionnumber)
     */
    override fun sessionNumber(): Number = unwrap(this).getSessionNumber()

    /**
     * The tags to assign to a Traffic Mirror session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the Traffic Mirror filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-trafficmirrorfilterid)
     */
    override fun trafficMirrorFilterId(): String = unwrap(this).getTrafficMirrorFilterId()

    /**
     * The ID of the Traffic Mirror target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-trafficmirrortargetid)
     */
    override fun trafficMirrorTargetId(): String = unwrap(this).getTrafficMirrorTargetId()

    /**
     * The VXLAN ID for the Traffic Mirror session.
     *
     * For more information about the VXLAN protocol, see [RFC
     * 7348](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc7348) . If you do not
     * specify a `VirtualNetworkId` , an account-wide unique ID is chosen at random.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-virtualnetworkid)
     */
    override fun virtualNetworkId(): Number? = unwrap(this).getVirtualNetworkId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficMirrorSessionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps):
        CfnTrafficMirrorSessionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnTrafficMirrorSessionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficMirrorSessionProps):
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps
  }
}
