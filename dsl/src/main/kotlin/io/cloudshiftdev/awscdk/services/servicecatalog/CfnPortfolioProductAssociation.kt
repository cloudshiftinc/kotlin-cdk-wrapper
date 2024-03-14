package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPortfolioProductAssociation
internal constructor(
    private val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation,
) : CfnResource(cdkObject), IInspectable {
    /** The language code. */
    public open fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    /** The language code. */
    public open fun acceptLanguage(`value`: String) {
        unwrap(this).setAcceptLanguage(`value`)
    }

    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The portfolio identifier. */
    public open fun portfolioId(): String = unwrap(this).getPortfolioId()

    /** The portfolio identifier. */
    public open fun portfolioId(`value`: String) {
        unwrap(this).setPortfolioId(`value`)
    }

    /** The product identifier. */
    public open fun productId(): String = unwrap(this).getProductId()

    /** The product identifier. */
    public open fun productId(`value`: String) {
        unwrap(this).setProductId(`value`)
    }

    /** The identifier of the source portfolio. */
    public open fun sourcePortfolioId(): String? = unwrap(this).getSourcePortfolioId()

    /** The identifier of the source portfolio. */
    public open fun sourcePortfolioId(`value`: String) {
        unwrap(this).setSourcePortfolioId(`value`)
    }

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.servicecatalog.CfnPortfolioProductAssociation].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The language code.
         * * `jp` - Japanese
         * * `zh` - Chinese
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-acceptlanguage)
         *
         * @param acceptLanguage The language code.
         */
        public fun acceptLanguage(acceptLanguage: String)

        /**
         * The portfolio identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-portfolioid)
         *
         * @param portfolioId The portfolio identifier.
         */
        public fun portfolioId(portfolioId: String)

        /**
         * The product identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-productid)
         *
         * @param productId The product identifier.
         */
        public fun productId(productId: String)

        /**
         * The identifier of the source portfolio.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-sourceportfolioid)
         *
         * @param sourcePortfolioId The identifier of the source portfolio.
         */
        public fun sourcePortfolioId(sourcePortfolioId: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation.Builder =
            software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation.Builder
                .create(scope, id)

        /**
         * The language code.
         * * `jp` - Japanese
         * * `zh` - Chinese
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-acceptlanguage)
         *
         * @param acceptLanguage The language code.
         */
        override fun acceptLanguage(acceptLanguage: String) {
            cdkBuilder.acceptLanguage(acceptLanguage)
        }

        /**
         * The portfolio identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-portfolioid)
         *
         * @param portfolioId The portfolio identifier.
         */
        override fun portfolioId(portfolioId: String) {
            cdkBuilder.portfolioId(portfolioId)
        }

        /**
         * The product identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-productid)
         *
         * @param productId The product identifier.
         */
        override fun productId(productId: String) {
            cdkBuilder.productId(productId)
        }

        /**
         * The identifier of the source portfolio.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-sourceportfolioid)
         *
         * @param sourcePortfolioId The identifier of the source portfolio.
         */
        override fun sourcePortfolioId(sourcePortfolioId: String) {
            cdkBuilder.sourcePortfolioId(sourcePortfolioId)
        }

        public fun build():
            software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnPortfolioProductAssociation {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnPortfolioProductAssociation(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation
        ): CfnPortfolioProductAssociation = CfnPortfolioProductAssociation(cdkObject)

        internal fun unwrap(
            wrapped: CfnPortfolioProductAssociation
        ): software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation =
            wrapped.cdkObject
    }
}
