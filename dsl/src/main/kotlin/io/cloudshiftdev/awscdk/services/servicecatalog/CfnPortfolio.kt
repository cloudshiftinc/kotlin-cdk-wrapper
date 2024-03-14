package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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

public open class CfnPortfolio
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolio,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The language code. */
    public open fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    /** The language code. */
    public open fun acceptLanguage(`value`: String) {
        unwrap(this).setAcceptLanguage(`value`)
    }

    /** The portfolio identifier. */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** The name of the portfolio. */
    public open fun attrPortfolioName(): String = unwrap(this).getAttrPortfolioName()

    /** The description of the portfolio. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** The description of the portfolio. */
    public open fun description(`value`: String) {
        unwrap(this).setDescription(`value`)
    }

    /** The name to use for display purposes. */
    public open fun displayName(): String = unwrap(this).getDisplayName()

    /** The name to use for display purposes. */
    public open fun displayName(`value`: String) {
        unwrap(this).setDisplayName(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The name of the portfolio provider. */
    public open fun providerName(): String = unwrap(this).getProviderName()

    /** The name of the portfolio provider. */
    public open fun providerName(`value`: String) {
        unwrap(this).setProviderName(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** One or more tags. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** One or more tags. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** One or more tags. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.servicecatalog.CfnPortfolio]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The language code.
         * * `jp` - Japanese
         * * `zh` - Chinese
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-acceptlanguage)
         *
         * @param acceptLanguage The language code.
         */
        public fun acceptLanguage(acceptLanguage: String)

        /**
         * The description of the portfolio.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-description)
         *
         * @param description The description of the portfolio.
         */
        public fun description(description: String)

        /**
         * The name to use for display purposes.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-displayname)
         *
         * @param displayName The name to use for display purposes.
         */
        public fun displayName(displayName: String)

        /**
         * The name of the portfolio provider.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-providername)
         *
         * @param providerName The name of the portfolio provider.
         */
        public fun providerName(providerName: String)

        /**
         * One or more tags.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-tags)
         *
         * @param tags One or more tags.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * One or more tags.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-tags)
         *
         * @param tags One or more tags.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.servicecatalog.CfnPortfolio.Builder =
            software.amazon.awscdk.services.servicecatalog.CfnPortfolio.Builder.create(scope, id)

        /**
         * The language code.
         * * `jp` - Japanese
         * * `zh` - Chinese
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-acceptlanguage)
         *
         * @param acceptLanguage The language code.
         */
        override fun acceptLanguage(acceptLanguage: String) {
            cdkBuilder.acceptLanguage(acceptLanguage)
        }

        /**
         * The description of the portfolio.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-description)
         *
         * @param description The description of the portfolio.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * The name to use for display purposes.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-displayname)
         *
         * @param displayName The name to use for display purposes.
         */
        override fun displayName(displayName: String) {
            cdkBuilder.displayName(displayName)
        }

        /**
         * The name of the portfolio provider.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-providername)
         *
         * @param providerName The name of the portfolio provider.
         */
        override fun providerName(providerName: String) {
            cdkBuilder.providerName(providerName)
        }

        /**
         * One or more tags.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-tags)
         *
         * @param tags One or more tags.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * One or more tags.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-tags)
         *
         * @param tags One or more tags.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.servicecatalog.CfnPortfolio =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnPortfolio {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnPortfolio(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolio
        ): CfnPortfolio = CfnPortfolio(cdkObject)

        internal fun unwrap(
            wrapped: CfnPortfolio
        ): software.amazon.awscdk.services.servicecatalog.CfnPortfolio = wrapped.cdkObject
    }
}
