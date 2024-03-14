package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAcceptedPortfolioShare
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare,
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

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The language code.
         * * `jp` - Japanese
         * * `zh` - Chinese
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-acceptlanguage)
         *
         * @param acceptLanguage The language code.
         */
        public fun acceptLanguage(acceptLanguage: String)

        /**
         * The portfolio identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-portfolioid)
         *
         * @param portfolioId The portfolio identifier.
         */
        public fun portfolioId(portfolioId: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare.Builder =
            software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare.Builder.create(
                scope,
                id
            )

        /**
         * The language code.
         * * `jp` - Japanese
         * * `zh` - Chinese
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-acceptlanguage)
         *
         * @param acceptLanguage The language code.
         */
        override fun acceptLanguage(acceptLanguage: String) {
            cdkBuilder.acceptLanguage(acceptLanguage)
        }

        /**
         * The portfolio identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-portfolioid)
         *
         * @param portfolioId The portfolio identifier.
         */
        override fun portfolioId(portfolioId: String) {
            cdkBuilder.portfolioId(portfolioId)
        }

        public fun build():
            software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnAcceptedPortfolioShare {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnAcceptedPortfolioShare(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare
        ): CfnAcceptedPortfolioShare = CfnAcceptedPortfolioShare(cdkObject)

        internal fun unwrap(
            wrapped: CfnAcceptedPortfolioShare
        ): software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare =
            wrapped.cdkObject
    }
}
