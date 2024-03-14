package io.cloudshiftdev.awscdk.services.mediapackage

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAsset
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.mediapackage.CfnAsset,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /**
     * The Amazon Resource Name (ARN) for the asset.
     *
     * You can get this from the response to any request to the asset.
     */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /** The date and time that the asset was initially submitted for ingest. */
    public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

    /** List of playback endpoints that are available for this asset. */
    public open fun egressEndpoints(): Any? = unwrap(this).getEgressEndpoints()

    /** List of playback endpoints that are available for this asset. */
    public open fun egressEndpoints(`value`: IResolvable) {
        unwrap(this).setEgressEndpoints(`value`.let(IResolvable::unwrap))
    }

    /** List of playback endpoints that are available for this asset. */
    public open fun egressEndpoints(__idx_ac66f0: List<Any>) {
        unwrap(this).setEgressEndpoints(__idx_ac66f0)
    }

    /** List of playback endpoints that are available for this asset. */
    public open fun egressEndpoints(vararg __idx_ac66f0: Any): Unit =
        egressEndpoints(__idx_ac66f0.toList())

    /** Unique identifier that you assign to the asset. */
    public open fun id(): String = unwrap(this).getId()

    /** Unique identifier that you assign to the asset. */
    public open fun id(`value`: String) {
        unwrap(this).setId(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The ID of the packaging group associated with this asset. */
    public open fun packagingGroupId(): String = unwrap(this).getPackagingGroupId()

    /** The ID of the packaging group associated with this asset. */
    public open fun packagingGroupId(`value`: String) {
        unwrap(this).setPackagingGroupId(`value`)
    }

    /** Unique identifier for this asset, as it's configured in the key provider service. */
    public open fun resourceId(): String? = unwrap(this).getResourceId()

    /** Unique identifier for this asset, as it's configured in the key provider service. */
    public open fun resourceId(`value`: String) {
        unwrap(this).setResourceId(`value`)
    }

    /** The ARN for the source content in Amazon S3. */
    public open fun sourceArn(): String = unwrap(this).getSourceArn()

    /** The ARN for the source content in Amazon S3. */
    public open fun sourceArn(`value`: String) {
        unwrap(this).setSourceArn(`value`)
    }

    /**
     * The ARN for the IAM role that provides AWS Elemental MediaPackage access to the Amazon S3
     * bucket where the source content is stored.
     */
    public open fun sourceRoleArn(): String = unwrap(this).getSourceRoleArn()

    /**
     * The ARN for the IAM role that provides AWS Elemental MediaPackage access to the Amazon S3
     * bucket where the source content is stored.
     */
    public open fun sourceRoleArn(`value`: String) {
        unwrap(this).setSourceRoleArn(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** The tags to assign to the asset. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** The tags to assign to the asset. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** The tags to assign to the asset. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.mediapackage.CfnAsset]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * List of playback endpoints that are available for this asset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-egressendpoints)
         *
         * @param egressEndpoints List of playback endpoints that are available for this asset.
         */
        public fun egressEndpoints(egressEndpoints: IResolvable)

        /**
         * List of playback endpoints that are available for this asset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-egressendpoints)
         *
         * @param egressEndpoints List of playback endpoints that are available for this asset.
         */
        public fun egressEndpoints(egressEndpoints: List<Any>)

        /**
         * List of playback endpoints that are available for this asset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-egressendpoints)
         *
         * @param egressEndpoints List of playback endpoints that are available for this asset.
         */
        public fun egressEndpoints(vararg egressEndpoints: Any)

        /**
         * Unique identifier that you assign to the asset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-id)
         *
         * @param id Unique identifier that you assign to the asset.
         */
        public fun id(id: String)

        /**
         * The ID of the packaging group associated with this asset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-packaginggroupid)
         *
         * @param packagingGroupId The ID of the packaging group associated with this asset.
         */
        public fun packagingGroupId(packagingGroupId: String)

        /**
         * Unique identifier for this asset, as it's configured in the key provider service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-resourceid)
         *
         * @param resourceId Unique identifier for this asset, as it's configured in the key
         *   provider service.
         */
        public fun resourceId(resourceId: String)

        /**
         * The ARN for the source content in Amazon S3.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-sourcearn)
         *
         * @param sourceArn The ARN for the source content in Amazon S3.
         */
        public fun sourceArn(sourceArn: String)

        /**
         * The ARN for the IAM role that provides AWS Elemental MediaPackage access to the Amazon S3
         * bucket where the source content is stored.
         *
         * Valid format: arn:aws:iam::{accountID}:role/{name}
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-sourcerolearn)
         *
         * @param sourceRoleArn The ARN for the IAM role that provides AWS Elemental MediaPackage
         *   access to the Amazon S3 bucket where the source content is stored.
         */
        public fun sourceRoleArn(sourceRoleArn: String)

        /**
         * The tags to assign to the asset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-tags)
         *
         * @param tags The tags to assign to the asset.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * The tags to assign to the asset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-tags)
         *
         * @param tags The tags to assign to the asset.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.mediapackage.CfnAsset.Builder =
            software.amazon.awscdk.services.mediapackage.CfnAsset.Builder.create(scope, id)

        /**
         * List of playback endpoints that are available for this asset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-egressendpoints)
         *
         * @param egressEndpoints List of playback endpoints that are available for this asset.
         */
        override fun egressEndpoints(egressEndpoints: IResolvable) {
            cdkBuilder.egressEndpoints(egressEndpoints.let(IResolvable::unwrap))
        }

        /**
         * List of playback endpoints that are available for this asset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-egressendpoints)
         *
         * @param egressEndpoints List of playback endpoints that are available for this asset.
         */
        override fun egressEndpoints(egressEndpoints: List<Any>) {
            cdkBuilder.egressEndpoints(egressEndpoints)
        }

        /**
         * List of playback endpoints that are available for this asset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-egressendpoints)
         *
         * @param egressEndpoints List of playback endpoints that are available for this asset.
         */
        override fun egressEndpoints(vararg egressEndpoints: Any): Unit =
            egressEndpoints(egressEndpoints.toList())

        /**
         * Unique identifier that you assign to the asset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-id)
         *
         * @param id Unique identifier that you assign to the asset.
         */
        override fun id(id: String) {
            cdkBuilder.id(id)
        }

        /**
         * The ID of the packaging group associated with this asset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-packaginggroupid)
         *
         * @param packagingGroupId The ID of the packaging group associated with this asset.
         */
        override fun packagingGroupId(packagingGroupId: String) {
            cdkBuilder.packagingGroupId(packagingGroupId)
        }

        /**
         * Unique identifier for this asset, as it's configured in the key provider service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-resourceid)
         *
         * @param resourceId Unique identifier for this asset, as it's configured in the key
         *   provider service.
         */
        override fun resourceId(resourceId: String) {
            cdkBuilder.resourceId(resourceId)
        }

        /**
         * The ARN for the source content in Amazon S3.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-sourcearn)
         *
         * @param sourceArn The ARN for the source content in Amazon S3.
         */
        override fun sourceArn(sourceArn: String) {
            cdkBuilder.sourceArn(sourceArn)
        }

        /**
         * The ARN for the IAM role that provides AWS Elemental MediaPackage access to the Amazon S3
         * bucket where the source content is stored.
         *
         * Valid format: arn:aws:iam::{accountID}:role/{name}
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-sourcerolearn)
         *
         * @param sourceRoleArn The ARN for the IAM role that provides AWS Elemental MediaPackage
         *   access to the Amazon S3 bucket where the source content is stored.
         */
        override fun sourceRoleArn(sourceRoleArn: String) {
            cdkBuilder.sourceRoleArn(sourceRoleArn)
        }

        /**
         * The tags to assign to the asset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-tags)
         *
         * @param tags The tags to assign to the asset.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * The tags to assign to the asset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-tags)
         *
         * @param tags The tags to assign to the asset.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.mediapackage.CfnAsset =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnAsset {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnAsset(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.mediapackage.CfnAsset
        ): CfnAsset = CfnAsset(cdkObject)

        internal fun unwrap(
            wrapped: CfnAsset
        ): software.amazon.awscdk.services.mediapackage.CfnAsset = wrapped.cdkObject
    }

    public interface EgressEndpointProperty {
        /**
         * The ID of a packaging configuration that's applied to this asset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-asset-egressendpoint.html#cfn-mediapackage-asset-egressendpoint-packagingconfigurationid)
         */
        public fun packagingConfigurationId(): String

        /**
         * The URL that's used to request content from this endpoint.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-asset-egressendpoint.html#cfn-mediapackage-asset-egressendpoint-url)
         */
        public fun url(): String

        /** A builder for [EgressEndpointProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param packagingConfigurationId The ID of a packaging configuration that's applied to
             *   this asset.
             */
            public fun packagingConfigurationId(packagingConfigurationId: String)

            /** @param url The URL that's used to request content from this endpoint. */
            public fun url(url: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.mediapackage.CfnAsset.EgressEndpointProperty.Builder =
                software.amazon.awscdk.services.mediapackage.CfnAsset.EgressEndpointProperty
                    .builder()

            /**
             * @param packagingConfigurationId The ID of a packaging configuration that's applied to
             *   this asset.
             */
            override fun packagingConfigurationId(packagingConfigurationId: String) {
                cdkBuilder.packagingConfigurationId(packagingConfigurationId)
            }

            /** @param url The URL that's used to request content from this endpoint. */
            override fun url(url: String) {
                cdkBuilder.url(url)
            }

            public fun build():
                software.amazon.awscdk.services.mediapackage.CfnAsset.EgressEndpointProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.mediapackage.CfnAsset.EgressEndpointProperty,
        ) : EgressEndpointProperty {
            /**
             * The ID of a packaging configuration that's applied to this asset.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-asset-egressendpoint.html#cfn-mediapackage-asset-egressendpoint-packagingconfigurationid)
             */
            override fun packagingConfigurationId(): String =
                unwrap(this).getPackagingConfigurationId()

            /**
             * The URL that's used to request content from this endpoint.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-asset-egressendpoint.html#cfn-mediapackage-asset-egressendpoint-url)
             */
            override fun url(): String = unwrap(this).getUrl()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): EgressEndpointProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.mediapackage.CfnAsset.EgressEndpointProperty
            ): EgressEndpointProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: EgressEndpointProperty
            ): software.amazon.awscdk.services.mediapackage.CfnAsset.EgressEndpointProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
