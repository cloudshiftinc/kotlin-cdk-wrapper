package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLaunchNotificationConstraint
internal constructor(
    private val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint,
) : CfnResource(cdkObject), IInspectable {
    /** The language code. */
    public open fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    /** The language code. */
    public open fun acceptLanguage(`value`: String) {
        unwrap(this).setAcceptLanguage(`value`)
    }

    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** The description of the constraint. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** The description of the constraint. */
    public open fun description(`value`: String) {
        unwrap(this).setDescription(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The notification ARNs. */
    public open fun notificationArns(): List<String> = unwrap(this).getNotificationArns()

    /** The notification ARNs. */
    public open fun notificationArns(`value`: List<String>) {
        unwrap(this).setNotificationArns(`value`)
    }

    /** The notification ARNs. */
    public open fun notificationArns(vararg `value`: String): Unit =
        notificationArns(`value`.toList())

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

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The language code.
         * * `jp` - Japanese
         * * `zh` - Chinese
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-acceptlanguage)
         *
         * @param acceptLanguage The language code.
         */
        public fun acceptLanguage(acceptLanguage: String)

        /**
         * The description of the constraint.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-description)
         *
         * @param description The description of the constraint.
         */
        public fun description(description: String)

        /**
         * The notification ARNs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-notificationarns)
         *
         * @param notificationArns The notification ARNs.
         */
        public fun notificationArns(notificationArns: List<String>)

        /**
         * The notification ARNs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-notificationarns)
         *
         * @param notificationArns The notification ARNs.
         */
        public fun notificationArns(vararg notificationArns: String)

        /**
         * The portfolio identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-portfolioid)
         *
         * @param portfolioId The portfolio identifier.
         */
        public fun portfolioId(portfolioId: String)

        /**
         * The product identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-productid)
         *
         * @param productId The product identifier.
         */
        public fun productId(productId: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint.Builder =
            software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint.Builder
                .create(scope, id)

        /**
         * The language code.
         * * `jp` - Japanese
         * * `zh` - Chinese
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-acceptlanguage)
         *
         * @param acceptLanguage The language code.
         */
        override fun acceptLanguage(acceptLanguage: String) {
            cdkBuilder.acceptLanguage(acceptLanguage)
        }

        /**
         * The description of the constraint.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-description)
         *
         * @param description The description of the constraint.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * The notification ARNs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-notificationarns)
         *
         * @param notificationArns The notification ARNs.
         */
        override fun notificationArns(notificationArns: List<String>) {
            cdkBuilder.notificationArns(notificationArns)
        }

        /**
         * The notification ARNs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-notificationarns)
         *
         * @param notificationArns The notification ARNs.
         */
        override fun notificationArns(vararg notificationArns: String): Unit =
            notificationArns(notificationArns.toList())

        /**
         * The portfolio identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-portfolioid)
         *
         * @param portfolioId The portfolio identifier.
         */
        override fun portfolioId(portfolioId: String) {
            cdkBuilder.portfolioId(portfolioId)
        }

        /**
         * The product identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-productid)
         *
         * @param productId The product identifier.
         */
        override fun productId(productId: String) {
            cdkBuilder.productId(productId)
        }

        public fun build():
            software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnLaunchNotificationConstraint {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnLaunchNotificationConstraint(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject:
                software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint
        ): CfnLaunchNotificationConstraint = CfnLaunchNotificationConstraint(cdkObject)

        internal fun unwrap(
            wrapped: CfnLaunchNotificationConstraint
        ): software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint =
            wrapped.cdkObject
    }
}
