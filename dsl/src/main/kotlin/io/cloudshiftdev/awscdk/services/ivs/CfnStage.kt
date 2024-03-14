package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStage
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ivs.CfnStage,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
    /**
     * ID of the active session within the stage.
     *
     * For example: `st-a1b2c3d4e5f6g`
     */
    public open fun attrActiveSessionId(): String = unwrap(this).getAttrActiveSessionId()

    /**
     * The stage ARN.
     *
     * For example: `arn:aws:ivs:us-west-2:123456789012:stage/abcdABCDefgh`
     */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /** Tag Manager which manages the tags for this resource. */
    public override fun cdkTagManager(): TagManager =
        unwrap(this).getCdkTagManager().let(TagManager::wrap)

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** Stage name. */
    public open fun name(): String? = unwrap(this).getName()

    /** Stage name. */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /** An array of key-value pairs to apply to this resource. */
    public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /** An array of key-value pairs to apply to this resource. */
    public open fun tags(`value`: List<CfnTag>) {
        unwrap(this).setTags(`value`.map(CfnTag::unwrap))
    }

    /** An array of key-value pairs to apply to this resource. */
    public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.ivs.CfnStage]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Stage name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-name)
         *
         * @param name Stage name.
         */
        public fun name(name: String)

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-tag.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-tag.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnStage.Builder =
            software.amazon.awscdk.services.ivs.CfnStage.Builder.create(scope, id)

        /**
         * Stage name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-name)
         *
         * @param name Stage name.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-tag.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-tag.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.ivs.CfnStage = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnStage {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnStage(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnStage): CfnStage =
            CfnStage(cdkObject)

        internal fun unwrap(wrapped: CfnStage): software.amazon.awscdk.services.ivs.CfnStage =
            wrapped.cdkObject
    }
}
