@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.servicecatalog

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint
import software.constructs.Construct

/**
 * Specifies a StackSet constraint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnStackSetConstraint cfnStackSetConstraint = CfnStackSetConstraint.Builder.create(this,
 * "MyCfnStackSetConstraint")
 * .accountList(List.of("accountList"))
 * .adminRole("adminRole")
 * .description("description")
 * .executionRole("executionRole")
 * .portfolioId("portfolioId")
 * .productId("productId")
 * .regionList(List.of("regionList"))
 * .stackInstanceControl("stackInstanceControl")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html)
 */
@CdkDslMarker
public class CfnStackSetConstraintDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStackSetConstraint.Builder =
        CfnStackSetConstraint.Builder.create(scope, id)

    private val _accountList: MutableList<String> = mutableListOf()

    private val _regionList: MutableList<String> = mutableListOf()

    /**
     * The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-acceptlanguage)
     *
     * @param acceptLanguage The language code.
     */
    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * One or more AWS accounts that will have access to the provisioned product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-accountlist)
     *
     * @param accountList One or more AWS accounts that will have access to the provisioned product.
     */
    public fun accountList(vararg accountList: String) {
        _accountList.addAll(listOf(*accountList))
    }

    /**
     * One or more AWS accounts that will have access to the provisioned product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-accountlist)
     *
     * @param accountList One or more AWS accounts that will have access to the provisioned product.
     */
    public fun accountList(accountList: Collection<String>) {
        _accountList.addAll(accountList)
    }

    /**
     * AdminRole ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-adminrole)
     *
     * @param adminRole AdminRole ARN.
     */
    public fun adminRole(adminRole: String) {
        cdkBuilder.adminRole(adminRole)
    }

    /**
     * The description of the constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-description)
     *
     * @param description The description of the constraint.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * ExecutionRole name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-executionrole)
     *
     * @param executionRole ExecutionRole name.
     */
    public fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
    }

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-portfolioid)
     *
     * @param portfolioId The portfolio identifier.
     */
    public fun portfolioId(portfolioId: String) {
        cdkBuilder.portfolioId(portfolioId)
    }

    /**
     * The product identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-productid)
     *
     * @param productId The product identifier.
     */
    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    /**
     * One or more AWS Regions where the provisioned product will be available.
     *
     * Applicable only to a `CFN_STACKSET` provisioned product type.
     *
     * The specified Regions should be within the list of Regions from the `STACKSET` constraint. To
     * get the list of Regions in the `STACKSET` constraint, use the
     * `DescribeProvisioningParameters` operation.
     *
     * If no values are specified, the default value is all Regions from the `STACKSET` constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-regionlist)
     *
     * @param regionList One or more AWS Regions where the provisioned product will be available.
     */
    public fun regionList(vararg regionList: String) {
        _regionList.addAll(listOf(*regionList))
    }

    /**
     * One or more AWS Regions where the provisioned product will be available.
     *
     * Applicable only to a `CFN_STACKSET` provisioned product type.
     *
     * The specified Regions should be within the list of Regions from the `STACKSET` constraint. To
     * get the list of Regions in the `STACKSET` constraint, use the
     * `DescribeProvisioningParameters` operation.
     *
     * If no values are specified, the default value is all Regions from the `STACKSET` constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-regionlist)
     *
     * @param regionList One or more AWS Regions where the provisioned product will be available.
     */
    public fun regionList(regionList: Collection<String>) {
        _regionList.addAll(regionList)
    }

    /**
     * Permission to create, update, and delete stack instances.
     *
     * Choose from ALLOWED and NOT_ALLOWED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-stackinstancecontrol)
     *
     * @param stackInstanceControl Permission to create, update, and delete stack instances.
     */
    public fun stackInstanceControl(stackInstanceControl: String) {
        cdkBuilder.stackInstanceControl(stackInstanceControl)
    }

    public fun build(): CfnStackSetConstraint {
        if (_accountList.isNotEmpty()) cdkBuilder.accountList(_accountList)
        if (_regionList.isNotEmpty()) cdkBuilder.regionList(_regionList)
        return cdkBuilder.build()
    }
}
