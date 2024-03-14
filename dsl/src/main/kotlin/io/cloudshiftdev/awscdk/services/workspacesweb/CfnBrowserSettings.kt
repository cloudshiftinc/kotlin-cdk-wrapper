package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBrowserSettings
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.workspacesweb.CfnBrowserSettings,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
    /** Additional encryption context of the browser settings. */
    public open fun additionalEncryptionContext(): Any? =
        unwrap(this).getAdditionalEncryptionContext()

    /** Additional encryption context of the browser settings. */
    public open fun additionalEncryptionContext(`value`: IResolvable) {
        unwrap(this).setAdditionalEncryptionContext(`value`.let(IResolvable::unwrap))
    }

    /** Additional encryption context of the browser settings. */
    public open fun additionalEncryptionContext(`value`: Map<String, String>) {
        unwrap(this).setAdditionalEncryptionContext(`value`)
    }

    /** A list of web portal ARNs that the browser settings resource is associated with. */
    public open fun attrAssociatedPortalArns(): List<String> =
        unwrap(this).getAttrAssociatedPortalArns()

    /** The ARN of the browser settings. */
    public open fun attrBrowserSettingsArn(): String = unwrap(this).getAttrBrowserSettingsArn()

    /**
     * A JSON string containing Chrome Enterprise policies that will be applied to all streaming
     * sessions.
     */
    public open fun browserPolicy(): String? = unwrap(this).getBrowserPolicy()

    /**
     * A JSON string containing Chrome Enterprise policies that will be applied to all streaming
     * sessions.
     */
    public open fun browserPolicy(`value`: String) {
        unwrap(this).setBrowserPolicy(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun cdkTagManager(): TagManager =
        unwrap(this).getCdkTagManager().let(TagManager::wrap)

    /** The custom managed key of the browser settings. */
    public open fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

    /** The custom managed key of the browser settings. */
    public open fun customerManagedKey(`value`: String) {
        unwrap(this).setCustomerManagedKey(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The tags to add to the browser settings resource. */
    public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /** The tags to add to the browser settings resource. */
    public open fun tags(`value`: List<CfnTag>) {
        unwrap(this).setTags(`value`.map(CfnTag::unwrap))
    }

    /** The tags to add to the browser settings resource. */
    public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.workspacesweb.CfnBrowserSettings]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Additional encryption context of the browser settings.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-additionalencryptioncontext)
         *
         * @param additionalEncryptionContext Additional encryption context of the browser settings.
         */
        public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

        /**
         * Additional encryption context of the browser settings.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-additionalencryptioncontext)
         *
         * @param additionalEncryptionContext Additional encryption context of the browser settings.
         */
        public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

        /**
         * A JSON string containing Chrome Enterprise policies that will be applied to all streaming
         * sessions.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-browserpolicy)
         *
         * @param browserPolicy A JSON string containing Chrome Enterprise policies that will be
         *   applied to all streaming sessions.
         */
        public fun browserPolicy(browserPolicy: String)

        /**
         * The custom managed key of the browser settings.
         *
         * *Pattern* :
         * `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-customermanagedkey)
         *
         * @param customerManagedKey The custom managed key of the browser settings.
         */
        public fun customerManagedKey(customerManagedKey: String)

        /**
         * The tags to add to the browser settings resource.
         *
         * A tag is a key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-tags)
         *
         * @param tags The tags to add to the browser settings resource.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * The tags to add to the browser settings resource.
         *
         * A tag is a key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-tags)
         *
         * @param tags The tags to add to the browser settings resource.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.workspacesweb.CfnBrowserSettings.Builder =
            software.amazon.awscdk.services.workspacesweb.CfnBrowserSettings.Builder.create(
                scope,
                id
            )

        /**
         * Additional encryption context of the browser settings.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-additionalencryptioncontext)
         *
         * @param additionalEncryptionContext Additional encryption context of the browser settings.
         */
        override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
            cdkBuilder.additionalEncryptionContext(
                additionalEncryptionContext.let(IResolvable::unwrap)
            )
        }

        /**
         * Additional encryption context of the browser settings.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-additionalencryptioncontext)
         *
         * @param additionalEncryptionContext Additional encryption context of the browser settings.
         */
        override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
            cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
        }

        /**
         * A JSON string containing Chrome Enterprise policies that will be applied to all streaming
         * sessions.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-browserpolicy)
         *
         * @param browserPolicy A JSON string containing Chrome Enterprise policies that will be
         *   applied to all streaming sessions.
         */
        override fun browserPolicy(browserPolicy: String) {
            cdkBuilder.browserPolicy(browserPolicy)
        }

        /**
         * The custom managed key of the browser settings.
         *
         * *Pattern* :
         * `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-customermanagedkey)
         *
         * @param customerManagedKey The custom managed key of the browser settings.
         */
        override fun customerManagedKey(customerManagedKey: String) {
            cdkBuilder.customerManagedKey(customerManagedKey)
        }

        /**
         * The tags to add to the browser settings resource.
         *
         * A tag is a key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-tags)
         *
         * @param tags The tags to add to the browser settings resource.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * The tags to add to the browser settings resource.
         *
         * A tag is a key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html#cfn-workspacesweb-browsersettings-tags)
         *
         * @param tags The tags to add to the browser settings resource.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.workspacesweb.CfnBrowserSettings =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnBrowserSettings {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnBrowserSettings(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.workspacesweb.CfnBrowserSettings
        ): CfnBrowserSettings = CfnBrowserSettings(cdkObject)

        internal fun unwrap(
            wrapped: CfnBrowserSettings
        ): software.amazon.awscdk.services.workspacesweb.CfnBrowserSettings = wrapped.cdkObject
    }
}
