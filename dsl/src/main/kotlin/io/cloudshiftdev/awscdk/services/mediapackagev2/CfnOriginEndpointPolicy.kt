package io.cloudshiftdev.awscdk.services.mediapackagev2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnOriginEndpointPolicy
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicy,
) : CfnResource(cdkObject), IInspectable {
    /** The name of the channel group associated with the origin endpoint policy. */
    public open fun channelGroupName(): String = unwrap(this).getChannelGroupName()

    /** The name of the channel group associated with the origin endpoint policy. */
    public open fun channelGroupName(`value`: String) {
        unwrap(this).setChannelGroupName(`value`)
    }

    /** The channel name associated with the origin endpoint policy. */
    public open fun channelName(): String = unwrap(this).getChannelName()

    /** The channel name associated with the origin endpoint policy. */
    public open fun channelName(`value`: String) {
        unwrap(this).setChannelName(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The name of the origin endpoint associated with the origin endpoint policy. */
    public open fun originEndpointName(): String = unwrap(this).getOriginEndpointName()

    /** The name of the origin endpoint associated with the origin endpoint policy. */
    public open fun originEndpointName(`value`: String) {
        unwrap(this).setOriginEndpointName(`value`)
    }

    /** The policy associated with the origin endpoint. */
    public open fun policy(): Any = unwrap(this).getPolicy()

    /** The policy associated with the origin endpoint. */
    public open fun policy(`value`: Any) {
        unwrap(this).setPolicy(`value`)
    }

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.mediapackagev2.CfnOriginEndpointPolicy].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the channel group associated with the origin endpoint policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-channelgroupname)
         *
         * @param channelGroupName The name of the channel group associated with the origin endpoint
         *   policy.
         */
        public fun channelGroupName(channelGroupName: String)

        /**
         * The channel name associated with the origin endpoint policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-channelname)
         *
         * @param channelName The channel name associated with the origin endpoint policy.
         */
        public fun channelName(channelName: String)

        /**
         * The name of the origin endpoint associated with the origin endpoint policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-originendpointname)
         *
         * @param originEndpointName The name of the origin endpoint associated with the origin
         *   endpoint policy.
         */
        public fun originEndpointName(originEndpointName: String)

        /**
         * The policy associated with the origin endpoint.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-policy)
         *
         * @param policy The policy associated with the origin endpoint.
         */
        public fun policy(policy: Any)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicy.Builder =
            software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicy.Builder.create(
                scope,
                id
            )

        /**
         * The name of the channel group associated with the origin endpoint policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-channelgroupname)
         *
         * @param channelGroupName The name of the channel group associated with the origin endpoint
         *   policy.
         */
        override fun channelGroupName(channelGroupName: String) {
            cdkBuilder.channelGroupName(channelGroupName)
        }

        /**
         * The channel name associated with the origin endpoint policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-channelname)
         *
         * @param channelName The channel name associated with the origin endpoint policy.
         */
        override fun channelName(channelName: String) {
            cdkBuilder.channelName(channelName)
        }

        /**
         * The name of the origin endpoint associated with the origin endpoint policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-originendpointname)
         *
         * @param originEndpointName The name of the origin endpoint associated with the origin
         *   endpoint policy.
         */
        override fun originEndpointName(originEndpointName: String) {
            cdkBuilder.originEndpointName(originEndpointName)
        }

        /**
         * The policy associated with the origin endpoint.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-policy)
         *
         * @param policy The policy associated with the origin endpoint.
         */
        override fun policy(policy: Any) {
            cdkBuilder.policy(policy)
        }

        public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicy =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnOriginEndpointPolicy {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnOriginEndpointPolicy(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicy
        ): CfnOriginEndpointPolicy = CfnOriginEndpointPolicy(cdkObject)

        internal fun unwrap(
            wrapped: CfnOriginEndpointPolicy
        ): software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicy =
            wrapped.cdkObject
    }
}
