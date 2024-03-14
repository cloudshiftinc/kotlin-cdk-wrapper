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

public open class CfnStackSetConstraint
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint,
) : CfnResource(cdkObject), IInspectable {
    /** The language code. */
    public open fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    /** The language code. */
    public open fun acceptLanguage(`value`: String) {
        unwrap(this).setAcceptLanguage(`value`)
    }

    /** One or more AWS accounts that will have access to the provisioned product. */
    public open fun accountList(): List<String> = unwrap(this).getAccountList()

    /** One or more AWS accounts that will have access to the provisioned product. */
    public open fun accountList(`value`: List<String>) {
        unwrap(this).setAccountList(`value`)
    }

    /** One or more AWS accounts that will have access to the provisioned product. */
    public open fun accountList(vararg `value`: String): Unit = accountList(`value`.toList())

    /** AdminRole ARN. */
    public open fun adminRole(): String = unwrap(this).getAdminRole()

    /** AdminRole ARN. */
    public open fun adminRole(`value`: String) {
        unwrap(this).setAdminRole(`value`)
    }

    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** The description of the constraint. */
    public open fun description(): String = unwrap(this).getDescription()

    /** The description of the constraint. */
    public open fun description(`value`: String) {
        unwrap(this).setDescription(`value`)
    }

    /** ExecutionRole name. */
    public open fun executionRole(): String = unwrap(this).getExecutionRole()

    /** ExecutionRole name. */
    public open fun executionRole(`value`: String) {
        unwrap(this).setExecutionRole(`value`)
    }

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

    /** One or more AWS Regions where the provisioned product will be available. */
    public open fun regionList(): List<String> = unwrap(this).getRegionList()

    /** One or more AWS Regions where the provisioned product will be available. */
    public open fun regionList(`value`: List<String>) {
        unwrap(this).setRegionList(`value`)
    }

    /** One or more AWS Regions where the provisioned product will be available. */
    public open fun regionList(vararg `value`: String): Unit = regionList(`value`.toList())

    /** Permission to create, update, and delete stack instances. */
    public open fun stackInstanceControl(): String = unwrap(this).getStackInstanceControl()

    /** Permission to create, update, and delete stack instances. */
    public open fun stackInstanceControl(`value`: String) {
        unwrap(this).setStackInstanceControl(`value`)
    }

    /**
     * A fluent builder for [io.cloudshiftdev.awscdk.services.servicecatalog.CfnStackSetConstraint].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The language code.
         * * `jp` - Japanese
         * * `zh` - Chinese
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-acceptlanguage)
         *
         * @param acceptLanguage The language code.
         */
        public fun acceptLanguage(acceptLanguage: String)

        /**
         * One or more AWS accounts that will have access to the provisioned product.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-accountlist)
         *
         * @param accountList One or more AWS accounts that will have access to the provisioned
         *   product.
         */
        public fun accountList(accountList: List<String>)

        /**
         * One or more AWS accounts that will have access to the provisioned product.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-accountlist)
         *
         * @param accountList One or more AWS accounts that will have access to the provisioned
         *   product.
         */
        public fun accountList(vararg accountList: String)

        /**
         * AdminRole ARN.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-adminrole)
         *
         * @param adminRole AdminRole ARN.
         */
        public fun adminRole(adminRole: String)

        /**
         * The description of the constraint.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-description)
         *
         * @param description The description of the constraint.
         */
        public fun description(description: String)

        /**
         * ExecutionRole name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-executionrole)
         *
         * @param executionRole ExecutionRole name.
         */
        public fun executionRole(executionRole: String)

        /**
         * The portfolio identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-portfolioid)
         *
         * @param portfolioId The portfolio identifier.
         */
        public fun portfolioId(portfolioId: String)

        /**
         * The product identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-productid)
         *
         * @param productId The product identifier.
         */
        public fun productId(productId: String)

        /**
         * One or more AWS Regions where the provisioned product will be available.
         *
         * Applicable only to a `CFN_STACKSET` provisioned product type.
         *
         * The specified Regions should be within the list of Regions from the `STACKSET`
         * constraint. To get the list of Regions in the `STACKSET` constraint, use the
         * `DescribeProvisioningParameters` operation.
         *
         * If no values are specified, the default value is all Regions from the `STACKSET`
         * constraint.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-regionlist)
         *
         * @param regionList One or more AWS Regions where the provisioned product will be
         *   available.
         */
        public fun regionList(regionList: List<String>)

        /**
         * One or more AWS Regions where the provisioned product will be available.
         *
         * Applicable only to a `CFN_STACKSET` provisioned product type.
         *
         * The specified Regions should be within the list of Regions from the `STACKSET`
         * constraint. To get the list of Regions in the `STACKSET` constraint, use the
         * `DescribeProvisioningParameters` operation.
         *
         * If no values are specified, the default value is all Regions from the `STACKSET`
         * constraint.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-regionlist)
         *
         * @param regionList One or more AWS Regions where the provisioned product will be
         *   available.
         */
        public fun regionList(vararg regionList: String)

        /**
         * Permission to create, update, and delete stack instances.
         *
         * Choose from ALLOWED and NOT_ALLOWED.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-stackinstancecontrol)
         *
         * @param stackInstanceControl Permission to create, update, and delete stack instances.
         */
        public fun stackInstanceControl(stackInstanceControl: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint.Builder =
            software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint.Builder.create(
                scope,
                id
            )

        /**
         * The language code.
         * * `jp` - Japanese
         * * `zh` - Chinese
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-acceptlanguage)
         *
         * @param acceptLanguage The language code.
         */
        override fun acceptLanguage(acceptLanguage: String) {
            cdkBuilder.acceptLanguage(acceptLanguage)
        }

        /**
         * One or more AWS accounts that will have access to the provisioned product.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-accountlist)
         *
         * @param accountList One or more AWS accounts that will have access to the provisioned
         *   product.
         */
        override fun accountList(accountList: List<String>) {
            cdkBuilder.accountList(accountList)
        }

        /**
         * One or more AWS accounts that will have access to the provisioned product.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-accountlist)
         *
         * @param accountList One or more AWS accounts that will have access to the provisioned
         *   product.
         */
        override fun accountList(vararg accountList: String): Unit =
            accountList(accountList.toList())

        /**
         * AdminRole ARN.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-adminrole)
         *
         * @param adminRole AdminRole ARN.
         */
        override fun adminRole(adminRole: String) {
            cdkBuilder.adminRole(adminRole)
        }

        /**
         * The description of the constraint.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-description)
         *
         * @param description The description of the constraint.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * ExecutionRole name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-executionrole)
         *
         * @param executionRole ExecutionRole name.
         */
        override fun executionRole(executionRole: String) {
            cdkBuilder.executionRole(executionRole)
        }

        /**
         * The portfolio identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-portfolioid)
         *
         * @param portfolioId The portfolio identifier.
         */
        override fun portfolioId(portfolioId: String) {
            cdkBuilder.portfolioId(portfolioId)
        }

        /**
         * The product identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-productid)
         *
         * @param productId The product identifier.
         */
        override fun productId(productId: String) {
            cdkBuilder.productId(productId)
        }

        /**
         * One or more AWS Regions where the provisioned product will be available.
         *
         * Applicable only to a `CFN_STACKSET` provisioned product type.
         *
         * The specified Regions should be within the list of Regions from the `STACKSET`
         * constraint. To get the list of Regions in the `STACKSET` constraint, use the
         * `DescribeProvisioningParameters` operation.
         *
         * If no values are specified, the default value is all Regions from the `STACKSET`
         * constraint.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-regionlist)
         *
         * @param regionList One or more AWS Regions where the provisioned product will be
         *   available.
         */
        override fun regionList(regionList: List<String>) {
            cdkBuilder.regionList(regionList)
        }

        /**
         * One or more AWS Regions where the provisioned product will be available.
         *
         * Applicable only to a `CFN_STACKSET` provisioned product type.
         *
         * The specified Regions should be within the list of Regions from the `STACKSET`
         * constraint. To get the list of Regions in the `STACKSET` constraint, use the
         * `DescribeProvisioningParameters` operation.
         *
         * If no values are specified, the default value is all Regions from the `STACKSET`
         * constraint.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-regionlist)
         *
         * @param regionList One or more AWS Regions where the provisioned product will be
         *   available.
         */
        override fun regionList(vararg regionList: String): Unit = regionList(regionList.toList())

        /**
         * Permission to create, update, and delete stack instances.
         *
         * Choose from ALLOWED and NOT_ALLOWED.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-stackinstancecontrol)
         *
         * @param stackInstanceControl Permission to create, update, and delete stack instances.
         */
        override fun stackInstanceControl(stackInstanceControl: String) {
            cdkBuilder.stackInstanceControl(stackInstanceControl)
        }

        public fun build(): software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnStackSetConstraint {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnStackSetConstraint(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint
        ): CfnStackSetConstraint = CfnStackSetConstraint(cdkObject)

        internal fun unwrap(
            wrapped: CfnStackSetConstraint
        ): software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint = wrapped.cdkObject
    }
}
