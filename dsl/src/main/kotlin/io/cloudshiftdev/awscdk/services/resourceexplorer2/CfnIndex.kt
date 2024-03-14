package io.cloudshiftdev.awscdk.services.resourceexplorer2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIndex
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnIndex,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /**
     * The ARN of the new index for the AWS Region . For example:.
     *
     * `arn:aws:resource-explorer-2:us-east-1:123456789012:index/EXAMPLE8-90ab-cdef-fedc-EXAMPLE22222`
     */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /**
     * Indicates the current state of the index. For example:.
     *
     * `CREATING`
     */
    public open fun attrIndexState(): String = unwrap(this).getAttrIndexState()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** The specified tags are attached to only the index created in this AWS Region . */
    public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

    /** The specified tags are attached to only the index created in this AWS Region . */
    public open fun tagsRaw(`value`: Map<String, String>) {
        unwrap(this).setTagsRaw(`value`)
    }

    /** Specifies the type of the index in this Region. */
    public open fun type(): String = unwrap(this).getType()

    /** Specifies the type of the index in this Region. */
    public open fun type(`value`: String) {
        unwrap(this).setType(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.resourceexplorer2.CfnIndex]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The specified tags are attached to only the index created in this AWS Region .
         *
         * The tags don't attach to any of the resources listed in the index.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html#cfn-resourceexplorer2-index-tags)
         *
         * @param tags The specified tags are attached to only the index created in this AWS Region
         *   .
         */
        public fun tags(tags: Map<String, String>)

        /**
         * Specifies the type of the index in this Region.
         *
         * For information about the aggregator index and how it differs from a local index, see
         * [Turning on cross-Region search by creating an aggregator index](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html)
         * in the *AWS Resource Explorer User Guide.* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html#cfn-resourceexplorer2-index-type)
         *
         * @param type Specifies the type of the index in this Region.
         */
        public fun type(type: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.resourceexplorer2.CfnIndex.Builder =
            software.amazon.awscdk.services.resourceexplorer2.CfnIndex.Builder.create(scope, id)

        /**
         * The specified tags are attached to only the index created in this AWS Region .
         *
         * The tags don't attach to any of the resources listed in the index.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html#cfn-resourceexplorer2-index-tags)
         *
         * @param tags The specified tags are attached to only the index created in this AWS Region
         *   .
         */
        override fun tags(tags: Map<String, String>) {
            cdkBuilder.tags(tags)
        }

        /**
         * Specifies the type of the index in this Region.
         *
         * For information about the aggregator index and how it differs from a local index, see
         * [Turning on cross-Region search by creating an aggregator index](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html)
         * in the *AWS Resource Explorer User Guide.* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html#cfn-resourceexplorer2-index-type)
         *
         * @param type Specifies the type of the index in this Region.
         */
        override fun type(type: String) {
            cdkBuilder.type(type)
        }

        public fun build(): software.amazon.awscdk.services.resourceexplorer2.CfnIndex =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnIndex {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnIndex(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnIndex
        ): CfnIndex = CfnIndex(cdkObject)

        internal fun unwrap(
            wrapped: CfnIndex
        ): software.amazon.awscdk.services.resourceexplorer2.CfnIndex = wrapped.cdkObject
    }
}
