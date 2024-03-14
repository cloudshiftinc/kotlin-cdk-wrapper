package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnActivity
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.stepfunctions.CfnActivity,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** Returns the ARN of the resource. */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /**
     * Returns the name of the activity. For example:.
     *
     * `{ "Fn::GetAtt": ["MyActivity", "Name"] }`
     *
     * Returns a value similar to the following:
     *
     * `myActivity`
     *
     * For more information about using `Fn::GetAtt` , see
     * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
     * .
     */
    public open fun attrName(): String = unwrap(this).getAttrName()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The name of the activity. */
    public open fun name(): String = unwrap(this).getName()

    /** The name of the activity. */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** The list of tags to add to a resource. */
    public open fun tagsRaw(): List<TagsEntryProperty> =
        unwrap(this).getTagsRaw()?.map(TagsEntryProperty::wrap) ?: emptyList()

    /** The list of tags to add to a resource. */
    public open fun tagsRaw(`value`: List<TagsEntryProperty>) {
        unwrap(this).setTagsRaw(`value`.map(TagsEntryProperty::unwrap))
    }

    /** The list of tags to add to a resource. */
    public open fun tagsRaw(vararg `value`: TagsEntryProperty): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.CfnActivity]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the activity.
         *
         * A name must *not* contain:
         * * white space
         * * brackets `&lt; &gt; { } [ ]`
         * * wildcard characters `? *`
         * * special characters `" # % \ ^ | ~ ` $ &amp; , ; : /`
         * * control characters ( `U+0000-001F` , `U+007F-009F` )
         *
         * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and
         * _.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-name)
         *
         * @param name The name of the activity.
         */
        public fun name(name: String)

        /**
         * The list of tags to add to a resource.
         *
         * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : /
         * = + -
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-tags)
         *
         * @param tags The list of tags to add to a resource.
         */
        public fun tags(tags: List<TagsEntryProperty>)

        /**
         * The list of tags to add to a resource.
         *
         * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : /
         * = + -
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-tags)
         *
         * @param tags The list of tags to add to a resource.
         */
        public fun tags(vararg tags: TagsEntryProperty)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.CfnActivity.Builder =
            software.amazon.awscdk.services.stepfunctions.CfnActivity.Builder.create(scope, id)

        /**
         * The name of the activity.
         *
         * A name must *not* contain:
         * * white space
         * * brackets `&lt; &gt; { } [ ]`
         * * wildcard characters `? *`
         * * special characters `" # % \ ^ | ~ ` $ &amp; , ; : /`
         * * control characters ( `U+0000-001F` , `U+007F-009F` )
         *
         * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and
         * _.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-name)
         *
         * @param name The name of the activity.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * The list of tags to add to a resource.
         *
         * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : /
         * = + -
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-tags)
         *
         * @param tags The list of tags to add to a resource.
         */
        override fun tags(tags: List<TagsEntryProperty>) {
            cdkBuilder.tags(tags.map(TagsEntryProperty::unwrap))
        }

        /**
         * The list of tags to add to a resource.
         *
         * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : /
         * = + -
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-tags)
         *
         * @param tags The list of tags to add to a resource.
         */
        override fun tags(vararg tags: TagsEntryProperty): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.stepfunctions.CfnActivity =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnActivity {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnActivity(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.CfnActivity
        ): CfnActivity = CfnActivity(cdkObject)

        internal fun unwrap(
            wrapped: CfnActivity
        ): software.amazon.awscdk.services.stepfunctions.CfnActivity = wrapped.cdkObject
    }

    public interface TagsEntryProperty {
        /**
         * The `key` for a key-value pair in a tag entry.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-tagsentry.html#cfn-stepfunctions-activity-tagsentry-key)
         */
        public fun key(): String

        /**
         * The `value` for a key-value pair in a tag entry.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-tagsentry.html#cfn-stepfunctions-activity-tagsentry-value)
         */
        public fun `value`(): String

        /** A builder for [TagsEntryProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param key The `key` for a key-value pair in a tag entry. */
            public fun key(key: String)

            /** @param value The `value` for a key-value pair in a tag entry. */
            public fun `value`(`value`: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty.Builder =
                software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty
                    .builder()

            /** @param key The `key` for a key-value pair in a tag entry. */
            override fun key(key: String) {
                cdkBuilder.key(key)
            }

            /** @param value The `value` for a key-value pair in a tag entry. */
            override fun `value`(`value`: String) {
                cdkBuilder.`value`(`value`)
            }

            public fun build():
                software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty,
        ) : TagsEntryProperty {
            /**
             * The `key` for a key-value pair in a tag entry.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-tagsentry.html#cfn-stepfunctions-activity-tagsentry-key)
             */
            override fun key(): String = unwrap(this).getKey()

            /**
             * The `value` for a key-value pair in a tag entry.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-tagsentry.html#cfn-stepfunctions-activity-tagsentry-value)
             */
            override fun `value`(): String = unwrap(this).getValue()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): TagsEntryProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty
            ): TagsEntryProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: TagsEntryProperty
            ): software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
