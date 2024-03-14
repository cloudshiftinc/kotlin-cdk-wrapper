package io.cloudshiftdev.awscdk.services.wisdom

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
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAssistantAssociation
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.wisdom.CfnAssistantAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The identifier of the Wisdom assistant. */
    public open fun assistantId(): String = unwrap(this).getAssistantId()

    /** The identifier of the Wisdom assistant. */
    public open fun assistantId(`value`: String) {
        unwrap(this).setAssistantId(`value`)
    }

    /** The identifier of the associated resource. */
    public open fun association(): Any = unwrap(this).getAssociation()

    /** The identifier of the associated resource. */
    public open fun association(`value`: IResolvable) {
        unwrap(this).setAssociation(`value`.let(IResolvable::unwrap))
    }

    /** The identifier of the associated resource. */
    public open fun association(`value`: AssociationDataProperty) {
        unwrap(this).setAssociation(`value`.let(AssociationDataProperty::unwrap))
    }

    /** The identifier of the associated resource. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f82105d9aab991526f2f9dc45442aea093a0b7ac098ef7e6b0e00592427e5d92")
    public open fun association(`value`: AssociationDataProperty.Builder.() -> Unit): Unit =
        association(AssociationDataProperty(`value`))

    /** The type of association. */
    public open fun associationType(): String = unwrap(this).getAssociationType()

    /** The type of association. */
    public open fun associationType(`value`: String) {
        unwrap(this).setAssociationType(`value`)
    }

    /** The Amazon Resource Name (ARN) of the Wisdom assistant. */
    public open fun attrAssistantArn(): String = unwrap(this).getAttrAssistantArn()

    /** The Amazon Resource Name (ARN) of the assistant association. */
    public open fun attrAssistantAssociationArn(): String =
        unwrap(this).getAttrAssistantAssociationArn()

    /** The ID of the association. */
    public open fun attrAssistantAssociationId(): String =
        unwrap(this).getAttrAssistantAssociationId()

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

    /** The tags used to organize, track, or control access for this resource. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** The tags used to organize, track, or control access for this resource. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** The tags used to organize, track, or control access for this resource. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.wisdom.CfnAssistantAssociation]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The identifier of the Wisdom assistant.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-assistantid)
         *
         * @param assistantId The identifier of the Wisdom assistant.
         */
        public fun assistantId(assistantId: String)

        /**
         * The identifier of the associated resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-association)
         *
         * @param association The identifier of the associated resource.
         */
        public fun association(association: IResolvable)

        /**
         * The identifier of the associated resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-association)
         *
         * @param association The identifier of the associated resource.
         */
        public fun association(association: AssociationDataProperty)

        /**
         * The identifier of the associated resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-association)
         *
         * @param association The identifier of the associated resource.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("0dfc74a83d0b1068a26927ba9482deb1f2fc08e5a670593a0d2aa3219048d27c")
        public fun association(association: AssociationDataProperty.Builder.() -> Unit)

        /**
         * The type of association.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-associationtype)
         *
         * @param associationType The type of association.
         */
        public fun associationType(associationType: String)

        /**
         * The tags used to organize, track, or control access for this resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-tags)
         *
         * @param tags The tags used to organize, track, or control access for this resource.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * The tags used to organize, track, or control access for this resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-tags)
         *
         * @param tags The tags used to organize, track, or control access for this resource.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.Builder =
            software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.Builder.create(scope, id)

        /**
         * The identifier of the Wisdom assistant.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-assistantid)
         *
         * @param assistantId The identifier of the Wisdom assistant.
         */
        override fun assistantId(assistantId: String) {
            cdkBuilder.assistantId(assistantId)
        }

        /**
         * The identifier of the associated resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-association)
         *
         * @param association The identifier of the associated resource.
         */
        override fun association(association: IResolvable) {
            cdkBuilder.association(association.let(IResolvable::unwrap))
        }

        /**
         * The identifier of the associated resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-association)
         *
         * @param association The identifier of the associated resource.
         */
        override fun association(association: AssociationDataProperty) {
            cdkBuilder.association(association.let(AssociationDataProperty::unwrap))
        }

        /**
         * The identifier of the associated resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-association)
         *
         * @param association The identifier of the associated resource.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("0dfc74a83d0b1068a26927ba9482deb1f2fc08e5a670593a0d2aa3219048d27c")
        override fun association(association: AssociationDataProperty.Builder.() -> Unit): Unit =
            association(AssociationDataProperty(association))

        /**
         * The type of association.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-associationtype)
         *
         * @param associationType The type of association.
         */
        override fun associationType(associationType: String) {
            cdkBuilder.associationType(associationType)
        }

        /**
         * The tags used to organize, track, or control access for this resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-tags)
         *
         * @param tags The tags used to organize, track, or control access for this resource.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * The tags used to organize, track, or control access for this resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-tags)
         *
         * @param tags The tags used to organize, track, or control access for this resource.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.wisdom.CfnAssistantAssociation =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnAssistantAssociation {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnAssistantAssociation(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.wisdom.CfnAssistantAssociation
        ): CfnAssistantAssociation = CfnAssistantAssociation(cdkObject)

        internal fun unwrap(
            wrapped: CfnAssistantAssociation
        ): software.amazon.awscdk.services.wisdom.CfnAssistantAssociation = wrapped.cdkObject
    }

    public interface AssociationDataProperty {
        /**
         * The identifier of the knowledge base.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-assistantassociation-associationdata.html#cfn-wisdom-assistantassociation-associationdata-knowledgebaseid)
         */
        public fun knowledgeBaseId(): String

        /** A builder for [AssociationDataProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param knowledgeBaseId The identifier of the knowledge base. */
            public fun knowledgeBaseId(knowledgeBaseId: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.AssociationDataProperty.Builder =
                software.amazon.awscdk.services.wisdom.CfnAssistantAssociation
                    .AssociationDataProperty
                    .builder()

            /** @param knowledgeBaseId The identifier of the knowledge base. */
            override fun knowledgeBaseId(knowledgeBaseId: String) {
                cdkBuilder.knowledgeBaseId(knowledgeBaseId)
            }

            public fun build():
                software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.AssociationDataProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.AssociationDataProperty,
        ) : AssociationDataProperty {
            /**
             * The identifier of the knowledge base.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-assistantassociation-associationdata.html#cfn-wisdom-assistantassociation-associationdata-knowledgebaseid)
             */
            override fun knowledgeBaseId(): String = unwrap(this).getKnowledgeBaseId()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): AssociationDataProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.AssociationDataProperty
            ): AssociationDataProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AssociationDataProperty
            ): software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.AssociationDataProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
