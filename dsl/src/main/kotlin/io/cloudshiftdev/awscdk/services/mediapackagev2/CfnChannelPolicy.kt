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

public open class CfnChannelPolicy
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicy,
) : CfnResource(cdkObject), IInspectable {
    /** The name of the channel group associated with the channel policy. */
    public open fun channelGroupName(): String = unwrap(this).getChannelGroupName()

    /** The name of the channel group associated with the channel policy. */
    public open fun channelGroupName(`value`: String) {
        unwrap(this).setChannelGroupName(`value`)
    }

    /** The name of the channel associated with the channel policy. */
    public open fun channelName(): String = unwrap(this).getChannelName()

    /** The name of the channel associated with the channel policy. */
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

    /** The policy associated with the channel. */
    public open fun policy(): Any = unwrap(this).getPolicy()

    /** The policy associated with the channel. */
    public open fun policy(`value`: Any) {
        unwrap(this).setPolicy(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.mediapackagev2.CfnChannelPolicy]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the channel group associated with the channel policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelpolicy.html#cfn-mediapackagev2-channelpolicy-channelgroupname)
         *
         * @param channelGroupName The name of the channel group associated with the channel policy.
         */
        public fun channelGroupName(channelGroupName: String)

        /**
         * The name of the channel associated with the channel policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelpolicy.html#cfn-mediapackagev2-channelpolicy-channelname)
         *
         * @param channelName The name of the channel associated with the channel policy.
         */
        public fun channelName(channelName: String)

        /**
         * The policy associated with the channel.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelpolicy.html#cfn-mediapackagev2-channelpolicy-policy)
         *
         * @param policy The policy associated with the channel.
         */
        public fun policy(policy: Any)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicy.Builder =
            software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicy.Builder.create(
                scope,
                id
            )

        /**
         * The name of the channel group associated with the channel policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelpolicy.html#cfn-mediapackagev2-channelpolicy-channelgroupname)
         *
         * @param channelGroupName The name of the channel group associated with the channel policy.
         */
        override fun channelGroupName(channelGroupName: String) {
            cdkBuilder.channelGroupName(channelGroupName)
        }

        /**
         * The name of the channel associated with the channel policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelpolicy.html#cfn-mediapackagev2-channelpolicy-channelname)
         *
         * @param channelName The name of the channel associated with the channel policy.
         */
        override fun channelName(channelName: String) {
            cdkBuilder.channelName(channelName)
        }

        /**
         * The policy associated with the channel.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelpolicy.html#cfn-mediapackagev2-channelpolicy-policy)
         *
         * @param policy The policy associated with the channel.
         */
        override fun policy(policy: Any) {
            cdkBuilder.policy(policy)
        }

        public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicy =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnChannelPolicy {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnChannelPolicy(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicy
        ): CfnChannelPolicy = CfnChannelPolicy(cdkObject)

        internal fun unwrap(
            wrapped: CfnChannelPolicy
        ): software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicy = wrapped.cdkObject
    }
}
