package io.cloudshiftdev.awscdk.services.appconfig

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnExtensionAssociation
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.appconfig.CfnExtensionAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The ARN of the extension defined in the association. */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /** The ARN of the extension defined in the association. */
    public open fun attrExtensionArn(): String = unwrap(this).getAttrExtensionArn()

    /** The system-generated ID for the association. */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /**
     * The ARNs of applications, configuration profiles, or environments defined in the association.
     */
    public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

    /** The name, the ID, or the Amazon Resource Name (ARN) of the extension. */
    public open fun extensionIdentifier(): String? = unwrap(this).getExtensionIdentifier()

    /** The name, the ID, or the Amazon Resource Name (ARN) of the extension. */
    public open fun extensionIdentifier(`value`: String) {
        unwrap(this).setExtensionIdentifier(`value`)
    }

    /** The version number of the extension. */
    public open fun extensionVersionNumber(): Number? = unwrap(this).getExtensionVersionNumber()

    /** The version number of the extension. */
    public open fun extensionVersionNumber(`value`: Number) {
        unwrap(this).setExtensionVersionNumber(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The parameter names and values defined in the extensions. */
    public open fun parameters(): Any? = unwrap(this).getParameters()

    /** The parameter names and values defined in the extensions. */
    public open fun parameters(`value`: IResolvable) {
        unwrap(this).setParameters(`value`.let(IResolvable::unwrap))
    }

    /** The parameter names and values defined in the extensions. */
    public open fun parameters(`value`: Map<String, String>) {
        unwrap(this).setParameters(`value`)
    }

    /** The ARN of an application, configuration profile, or environment. */
    public open fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

    /** The ARN of an application, configuration profile, or environment. */
    public open fun resourceIdentifier(`value`: String) {
        unwrap(this).setResourceIdentifier(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** Adds one or more tags for the specified extension association. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** Adds one or more tags for the specified extension association. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** Adds one or more tags for the specified extension association. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /**
     * A fluent builder for [io.cloudshiftdev.awscdk.services.appconfig.CfnExtensionAssociation].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-extensionidentifier)
         *
         * @param extensionIdentifier The name, the ID, or the Amazon Resource Name (ARN) of the
         *   extension.
         */
        public fun extensionIdentifier(extensionIdentifier: String)

        /**
         * The version number of the extension.
         *
         * If not specified, AWS AppConfig uses the maximum version of the extension.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-extensionversionnumber)
         *
         * @param extensionVersionNumber The version number of the extension.
         */
        public fun extensionVersionNumber(extensionVersionNumber: Number)

        /**
         * The parameter names and values defined in the extensions.
         *
         * Extension parameters marked `Required` must be entered for this field.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-parameters)
         *
         * @param parameters The parameter names and values defined in the extensions.
         */
        public fun parameters(parameters: IResolvable)

        /**
         * The parameter names and values defined in the extensions.
         *
         * Extension parameters marked `Required` must be entered for this field.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-parameters)
         *
         * @param parameters The parameter names and values defined in the extensions.
         */
        public fun parameters(parameters: Map<String, String>)

        /**
         * The ARN of an application, configuration profile, or environment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-resourceidentifier)
         *
         * @param resourceIdentifier The ARN of an application, configuration profile, or
         *   environment.
         */
        public fun resourceIdentifier(resourceIdentifier: String)

        /**
         * Adds one or more tags for the specified extension association.
         *
         * Tags are metadata that help you categorize resources in different ways, for example, by
         * purpose, owner, or environment. Each tag consists of a key and an optional value, both of
         * which you define.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-tags)
         *
         * @param tags Adds one or more tags for the specified extension association.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * Adds one or more tags for the specified extension association.
         *
         * Tags are metadata that help you categorize resources in different ways, for example, by
         * purpose, owner, or environment. Each tag consists of a key and an optional value, both of
         * which you define.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-tags)
         *
         * @param tags Adds one or more tags for the specified extension association.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.appconfig.CfnExtensionAssociation.Builder =
            software.amazon.awscdk.services.appconfig.CfnExtensionAssociation.Builder.create(
                scope,
                id
            )

        /**
         * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-extensionidentifier)
         *
         * @param extensionIdentifier The name, the ID, or the Amazon Resource Name (ARN) of the
         *   extension.
         */
        override fun extensionIdentifier(extensionIdentifier: String) {
            cdkBuilder.extensionIdentifier(extensionIdentifier)
        }

        /**
         * The version number of the extension.
         *
         * If not specified, AWS AppConfig uses the maximum version of the extension.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-extensionversionnumber)
         *
         * @param extensionVersionNumber The version number of the extension.
         */
        override fun extensionVersionNumber(extensionVersionNumber: Number) {
            cdkBuilder.extensionVersionNumber(extensionVersionNumber)
        }

        /**
         * The parameter names and values defined in the extensions.
         *
         * Extension parameters marked `Required` must be entered for this field.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-parameters)
         *
         * @param parameters The parameter names and values defined in the extensions.
         */
        override fun parameters(parameters: IResolvable) {
            cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
        }

        /**
         * The parameter names and values defined in the extensions.
         *
         * Extension parameters marked `Required` must be entered for this field.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-parameters)
         *
         * @param parameters The parameter names and values defined in the extensions.
         */
        override fun parameters(parameters: Map<String, String>) {
            cdkBuilder.parameters(parameters)
        }

        /**
         * The ARN of an application, configuration profile, or environment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-resourceidentifier)
         *
         * @param resourceIdentifier The ARN of an application, configuration profile, or
         *   environment.
         */
        override fun resourceIdentifier(resourceIdentifier: String) {
            cdkBuilder.resourceIdentifier(resourceIdentifier)
        }

        /**
         * Adds one or more tags for the specified extension association.
         *
         * Tags are metadata that help you categorize resources in different ways, for example, by
         * purpose, owner, or environment. Each tag consists of a key and an optional value, both of
         * which you define.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-tags)
         *
         * @param tags Adds one or more tags for the specified extension association.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * Adds one or more tags for the specified extension association.
         *
         * Tags are metadata that help you categorize resources in different ways, for example, by
         * purpose, owner, or environment. Each tag consists of a key and an optional value, both of
         * which you define.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-tags)
         *
         * @param tags Adds one or more tags for the specified extension association.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.appconfig.CfnExtensionAssociation =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnExtensionAssociation {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnExtensionAssociation(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appconfig.CfnExtensionAssociation
        ): CfnExtensionAssociation = CfnExtensionAssociation(cdkObject)

        internal fun unwrap(
            wrapped: CfnExtensionAssociation
        ): software.amazon.awscdk.services.appconfig.CfnExtensionAssociation = wrapped.cdkObject
    }
}
