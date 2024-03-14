package io.cloudshiftdev.awscdk.services.route53recoverycontrol

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCluster
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The Amazon Resource Name (ARN) of the cluster. */
    public open fun attrClusterArn(): String = unwrap(this).getAttrClusterArn()

    /**
     * An array of endpoints for the cluster.
     *
     * You specify one of these endpoints when you want to set or retrieve a routing control state
     * in the cluster.
     */
    public open fun attrClusterEndpoints(): IResolvable =
        unwrap(this).getAttrClusterEndpoints().let(IResolvable::wrap)

    /**
     * The deployment status of the cluster.
     *
     * Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     */
    public open fun attrStatus(): String = unwrap(this).getAttrStatus()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** Name of the cluster. */
    public open fun name(): String = unwrap(this).getName()

    /** Name of the cluster. */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** The tags associated with the cluster. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** The tags associated with the cluster. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** The tags associated with the cluster. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /**
     * A fluent builder for [io.cloudshiftdev.awscdk.services.route53recoverycontrol.CfnCluster].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * Name of the cluster.
         *
         * You can use any non-white space character in the name except the following: &amp; &gt;
         * &lt; ' (single quote) " (double quote) ; (semicolon).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-cluster.html#cfn-route53recoverycontrol-cluster-name)
         *
         * @param name Name of the cluster.
         */
        public fun name(name: String)

        /**
         * The tags associated with the cluster.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-cluster.html#cfn-route53recoverycontrol-cluster-tags)
         *
         * @param tags The tags associated with the cluster.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * The tags associated with the cluster.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-cluster.html#cfn-route53recoverycontrol-cluster-tags)
         *
         * @param tags The tags associated with the cluster.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.Builder =
            software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.Builder.create(
                scope,
                id
            )

        /**
         * Name of the cluster.
         *
         * You can use any non-white space character in the name except the following: &amp; &gt;
         * &lt; ' (single quote) " (double quote) ; (semicolon).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-cluster.html#cfn-route53recoverycontrol-cluster-name)
         *
         * @param name Name of the cluster.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * The tags associated with the cluster.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-cluster.html#cfn-route53recoverycontrol-cluster-tags)
         *
         * @param tags The tags associated with the cluster.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * The tags associated with the cluster.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-cluster.html#cfn-route53recoverycontrol-cluster-tags)
         *
         * @param tags The tags associated with the cluster.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.route53recoverycontrol.CfnCluster =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnCluster {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnCluster(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnCluster
        ): CfnCluster = CfnCluster(cdkObject)

        internal fun unwrap(
            wrapped: CfnCluster
        ): software.amazon.awscdk.services.route53recoverycontrol.CfnCluster = wrapped.cdkObject
    }

    public interface ClusterEndpointProperty {
        /**
         * A cluster endpoint URL for one of the five redundant clusters that you specify to set or
         * retrieve a routing control state.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-cluster-clusterendpoint.html#cfn-route53recoverycontrol-cluster-clusterendpoint-endpoint)
         */
        public fun endpoint(): String? = unwrap(this).getEndpoint()

        /**
         * The AWS Region for a cluster endpoint.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-cluster-clusterendpoint.html#cfn-route53recoverycontrol-cluster-clusterendpoint-region)
         */
        public fun region(): String? = unwrap(this).getRegion()

        /** A builder for [ClusterEndpointProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param endpoint A cluster endpoint URL for one of the five redundant clusters that
             *   you specify to set or retrieve a routing control state.
             */
            public fun endpoint(endpoint: String)

            /** @param region The AWS Region for a cluster endpoint. */
            public fun region(region: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.ClusterEndpointProperty.Builder =
                software.amazon.awscdk.services.route53recoverycontrol.CfnCluster
                    .ClusterEndpointProperty
                    .builder()

            /**
             * @param endpoint A cluster endpoint URL for one of the five redundant clusters that
             *   you specify to set or retrieve a routing control state.
             */
            override fun endpoint(endpoint: String) {
                cdkBuilder.endpoint(endpoint)
            }

            /** @param region The AWS Region for a cluster endpoint. */
            override fun region(region: String) {
                cdkBuilder.region(region)
            }

            public fun build():
                software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.ClusterEndpointProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.ClusterEndpointProperty,
        ) : ClusterEndpointProperty {
            /**
             * A cluster endpoint URL for one of the five redundant clusters that you specify to set
             * or retrieve a routing control state.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-cluster-clusterendpoint.html#cfn-route53recoverycontrol-cluster-clusterendpoint-endpoint)
             */
            override fun endpoint(): String? = unwrap(this).getEndpoint()

            /**
             * The AWS Region for a cluster endpoint.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-cluster-clusterendpoint.html#cfn-route53recoverycontrol-cluster-clusterendpoint-region)
             */
            override fun region(): String? = unwrap(this).getRegion()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): ClusterEndpointProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.ClusterEndpointProperty
            ): ClusterEndpointProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ClusterEndpointProperty
            ): software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.ClusterEndpointProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
