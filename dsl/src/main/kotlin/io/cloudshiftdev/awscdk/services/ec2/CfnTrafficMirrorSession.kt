package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTrafficMirrorSession
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** The description of the Traffic Mirror session. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** The description of the Traffic Mirror session. */
    public open fun description(`value`: String) {
        unwrap(this).setDescription(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The ID of the source network interface. */
    public open fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

    /** The ID of the source network interface. */
    public open fun networkInterfaceId(`value`: String) {
        unwrap(this).setNetworkInterfaceId(`value`)
    }

    /** The number of bytes in each packet to mirror. */
    public open fun packetLength(): Number? = unwrap(this).getPacketLength()

    /** The number of bytes in each packet to mirror. */
    public open fun packetLength(`value`: Number) {
        unwrap(this).setPacketLength(`value`)
    }

    /**
     * The session number determines the order in which sessions are evaluated when an interface is
     * used by multiple sessions.
     */
    public open fun sessionNumber(): Number = unwrap(this).getSessionNumber()

    /**
     * The session number determines the order in which sessions are evaluated when an interface is
     * used by multiple sessions.
     */
    public open fun sessionNumber(`value`: Number) {
        unwrap(this).setSessionNumber(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** The tags to assign to a Traffic Mirror session. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** The tags to assign to a Traffic Mirror session. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** The tags to assign to a Traffic Mirror session. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** The ID of the Traffic Mirror filter. */
    public open fun trafficMirrorFilterId(): String = unwrap(this).getTrafficMirrorFilterId()

    /** The ID of the Traffic Mirror filter. */
    public open fun trafficMirrorFilterId(`value`: String) {
        unwrap(this).setTrafficMirrorFilterId(`value`)
    }

    /** The ID of the Traffic Mirror target. */
    public open fun trafficMirrorTargetId(): String = unwrap(this).getTrafficMirrorTargetId()

    /** The ID of the Traffic Mirror target. */
    public open fun trafficMirrorTargetId(`value`: String) {
        unwrap(this).setTrafficMirrorTargetId(`value`)
    }

    /** The VXLAN ID for the Traffic Mirror session. */
    public open fun virtualNetworkId(): Number? = unwrap(this).getVirtualNetworkId()

    /** The VXLAN ID for the Traffic Mirror session. */
    public open fun virtualNetworkId(`value`: Number) {
        unwrap(this).setVirtualNetworkId(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnTrafficMirrorSession]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The description of the Traffic Mirror session.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-description)
         *
         * @param description The description of the Traffic Mirror session.
         */
        public fun description(description: String)

        /**
         * The ID of the source network interface.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-networkinterfaceid)
         *
         * @param networkInterfaceId The ID of the source network interface.
         */
        public fun networkInterfaceId(networkInterfaceId: String)

        /**
         * The number of bytes in each packet to mirror.
         *
         * These are bytes after the VXLAN header. Do not specify this parameter when you want to
         * mirror the entire packet. To mirror a subset of the packet, set this to the length (in
         * bytes) that you want to mirror. For example, if you set this value to 100, then the first
         * 100 bytes that meet the filter criteria are copied to the target.
         *
         * If you do not want to mirror the entire packet, use the `PacketLength` parameter to
         * specify the number of bytes in each packet to mirror.
         *
         * For sessions with Network Load Balancer (NLB) Traffic Mirror targets the default
         * `PacketLength` will be set to 8500. Valid values are 1-8500. Setting a `PacketLength`
         * greater than 8500 will result in an error response.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-packetlength)
         *
         * @param packetLength The number of bytes in each packet to mirror.
         */
        public fun packetLength(packetLength: Number)

        /**
         * The session number determines the order in which sessions are evaluated when an interface
         * is used by multiple sessions.
         *
         * The first session with a matching filter is the one that mirrors the packets.
         *
         * Valid values are 1-32766.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-sessionnumber)
         *
         * @param sessionNumber The session number determines the order in which sessions are
         *   evaluated when an interface is used by multiple sessions.
         */
        public fun sessionNumber(sessionNumber: Number)

        /**
         * The tags to assign to a Traffic Mirror session.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-tags)
         *
         * @param tags The tags to assign to a Traffic Mirror session.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * The tags to assign to a Traffic Mirror session.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-tags)
         *
         * @param tags The tags to assign to a Traffic Mirror session.
         */
        public fun tags(vararg tags: CfnTag)

        /**
         * The ID of the Traffic Mirror filter.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-trafficmirrorfilterid)
         *
         * @param trafficMirrorFilterId The ID of the Traffic Mirror filter.
         */
        public fun trafficMirrorFilterId(trafficMirrorFilterId: String)

        /**
         * The ID of the Traffic Mirror target.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-trafficmirrortargetid)
         *
         * @param trafficMirrorTargetId The ID of the Traffic Mirror target.
         */
        public fun trafficMirrorTargetId(trafficMirrorTargetId: String)

        /**
         * The VXLAN ID for the Traffic Mirror session.
         *
         * For more information about the VXLAN protocol, see
         * [RFC 7348](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc7348) . If you do
         * not specify a `VirtualNetworkId` , an account-wide unique id is chosen at random.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-virtualnetworkid)
         *
         * @param virtualNetworkId The VXLAN ID for the Traffic Mirror session.
         */
        public fun virtualNetworkId(virtualNetworkId: Number)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession.Builder =
            software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession.Builder.create(scope, id)

        /**
         * The description of the Traffic Mirror session.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-description)
         *
         * @param description The description of the Traffic Mirror session.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * The ID of the source network interface.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-networkinterfaceid)
         *
         * @param networkInterfaceId The ID of the source network interface.
         */
        override fun networkInterfaceId(networkInterfaceId: String) {
            cdkBuilder.networkInterfaceId(networkInterfaceId)
        }

        /**
         * The number of bytes in each packet to mirror.
         *
         * These are bytes after the VXLAN header. Do not specify this parameter when you want to
         * mirror the entire packet. To mirror a subset of the packet, set this to the length (in
         * bytes) that you want to mirror. For example, if you set this value to 100, then the first
         * 100 bytes that meet the filter criteria are copied to the target.
         *
         * If you do not want to mirror the entire packet, use the `PacketLength` parameter to
         * specify the number of bytes in each packet to mirror.
         *
         * For sessions with Network Load Balancer (NLB) Traffic Mirror targets the default
         * `PacketLength` will be set to 8500. Valid values are 1-8500. Setting a `PacketLength`
         * greater than 8500 will result in an error response.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-packetlength)
         *
         * @param packetLength The number of bytes in each packet to mirror.
         */
        override fun packetLength(packetLength: Number) {
            cdkBuilder.packetLength(packetLength)
        }

        /**
         * The session number determines the order in which sessions are evaluated when an interface
         * is used by multiple sessions.
         *
         * The first session with a matching filter is the one that mirrors the packets.
         *
         * Valid values are 1-32766.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-sessionnumber)
         *
         * @param sessionNumber The session number determines the order in which sessions are
         *   evaluated when an interface is used by multiple sessions.
         */
        override fun sessionNumber(sessionNumber: Number) {
            cdkBuilder.sessionNumber(sessionNumber)
        }

        /**
         * The tags to assign to a Traffic Mirror session.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-tags)
         *
         * @param tags The tags to assign to a Traffic Mirror session.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * The tags to assign to a Traffic Mirror session.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-tags)
         *
         * @param tags The tags to assign to a Traffic Mirror session.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        /**
         * The ID of the Traffic Mirror filter.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-trafficmirrorfilterid)
         *
         * @param trafficMirrorFilterId The ID of the Traffic Mirror filter.
         */
        override fun trafficMirrorFilterId(trafficMirrorFilterId: String) {
            cdkBuilder.trafficMirrorFilterId(trafficMirrorFilterId)
        }

        /**
         * The ID of the Traffic Mirror target.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-trafficmirrortargetid)
         *
         * @param trafficMirrorTargetId The ID of the Traffic Mirror target.
         */
        override fun trafficMirrorTargetId(trafficMirrorTargetId: String) {
            cdkBuilder.trafficMirrorTargetId(trafficMirrorTargetId)
        }

        /**
         * The VXLAN ID for the Traffic Mirror session.
         *
         * For more information about the VXLAN protocol, see
         * [RFC 7348](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc7348) . If you do
         * not specify a `VirtualNetworkId` , an account-wide unique id is chosen at random.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html#cfn-ec2-trafficmirrorsession-virtualnetworkid)
         *
         * @param virtualNetworkId The VXLAN ID for the Traffic Mirror session.
         */
        override fun virtualNetworkId(virtualNetworkId: Number) {
            cdkBuilder.virtualNetworkId(virtualNetworkId)
        }

        public fun build(): software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnTrafficMirrorSession {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnTrafficMirrorSession(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession
        ): CfnTrafficMirrorSession = CfnTrafficMirrorSession(cdkObject)

        internal fun unwrap(
            wrapped: CfnTrafficMirrorSession
        ): software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession = wrapped.cdkObject
    }
}
