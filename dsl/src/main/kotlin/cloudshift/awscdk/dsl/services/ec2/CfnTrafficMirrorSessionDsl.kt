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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession
import software.constructs.Construct

/**
 * Creates a Traffic Mirror session.
 *
 * A Traffic Mirror session actively copies packets from a Traffic Mirror source to a Traffic Mirror
 * target. Create a filter, and then assign it to the session to define a subset of the traffic to
 * mirror, for example all TCP traffic.
 *
 * The Traffic Mirror source and the Traffic Mirror target (monitoring appliances) can be in the
 * same VPC, or in a different VPC connected via VPC peering or a transit gateway.
 *
 * By default, no traffic is mirrored. Use
 * [AWS::EC2::TrafficMirrorFilterRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html)
 * to specify filter rules that specify the traffic to mirror.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTrafficMirrorSession cfnTrafficMirrorSession = CfnTrafficMirrorSession.Builder.create(this,
 * "MyCfnTrafficMirrorSession")
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
@CdkDslMarker
public class CfnTrafficMirrorSessionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTrafficMirrorSession.Builder =
        CfnTrafficMirrorSession.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The description of the Traffic Mirror session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-description)
     *
     * @param description The description of the Traffic Mirror session.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The ID of the source network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-networkinterfaceid)
     *
     * @param networkInterfaceId The ID of the source network interface.
     */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * The number of bytes in each packet to mirror.
     *
     * These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror
     * the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that
     * you want to mirror. For example, if you set this value to 100, then the first 100 bytes that
     * meet the filter criteria are copied to the target.
     *
     * If you do not want to mirror the entire packet, use the `PacketLength` parameter to specify
     * the number of bytes in each packet to mirror.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-packetlength)
     *
     * @param packetLength The number of bytes in each packet to mirror.
     */
    public fun packetLength(packetLength: Number) {
        cdkBuilder.packetLength(packetLength)
    }

    /**
     * The session number determines the order in which sessions are evaluated when an interface is
     * used by multiple sessions.
     *
     * The first session with a matching filter is the one that mirrors the packets.
     *
     * Valid values are 1-32766.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-sessionnumber)
     *
     * @param sessionNumber The session number determines the order in which sessions are evaluated
     *   when an interface is used by multiple sessions.
     */
    public fun sessionNumber(sessionNumber: Number) {
        cdkBuilder.sessionNumber(sessionNumber)
    }

    /**
     * The tags to assign to a Traffic Mirror session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-tags)
     *
     * @param tags The tags to assign to a Traffic Mirror session.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to assign to a Traffic Mirror session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-tags)
     *
     * @param tags The tags to assign to a Traffic Mirror session.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ID of the Traffic Mirror filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-trafficmirrorfilterid)
     *
     * @param trafficMirrorFilterId The ID of the Traffic Mirror filter.
     */
    public fun trafficMirrorFilterId(trafficMirrorFilterId: String) {
        cdkBuilder.trafficMirrorFilterId(trafficMirrorFilterId)
    }

    /**
     * The ID of the Traffic Mirror target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-trafficmirrortargetid)
     *
     * @param trafficMirrorTargetId The ID of the Traffic Mirror target.
     */
    public fun trafficMirrorTargetId(trafficMirrorTargetId: String) {
        cdkBuilder.trafficMirrorTargetId(trafficMirrorTargetId)
    }

    /**
     * The VXLAN ID for the Traffic Mirror session.
     *
     * For more information about the VXLAN protocol, see
     * [RFC 7348](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc7348) . If you do not
     * specify a `VirtualNetworkId` , an account-wide unique id is chosen at random.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-virtualnetworkid)
     *
     * @param virtualNetworkId The VXLAN ID for the Traffic Mirror session.
     */
    public fun virtualNetworkId(virtualNetworkId: Number) {
        cdkBuilder.virtualNetworkId(virtualNetworkId)
    }

    public fun build(): CfnTrafficMirrorSession {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
