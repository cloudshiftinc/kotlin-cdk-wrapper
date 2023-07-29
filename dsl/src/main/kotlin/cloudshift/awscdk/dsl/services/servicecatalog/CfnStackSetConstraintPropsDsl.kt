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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps

/**
 * Properties for defining a `CfnStackSetConstraint`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnStackSetConstraintProps cfnStackSetConstraintProps = CfnStackSetConstraintProps.builder()
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
public class CfnStackSetConstraintPropsDsl {
    private val cdkBuilder: CfnStackSetConstraintProps.Builder =
        CfnStackSetConstraintProps.builder()

    private val _accountList: MutableList<String> = mutableListOf()

    private val _regionList: MutableList<String> = mutableListOf()

    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * @param accountList One or more AWS accounts that will have access to the provisioned product.
     */
    public fun accountList(vararg accountList: String) {
        _accountList.addAll(listOf(*accountList))
    }

    /**
     * @param accountList One or more AWS accounts that will have access to the provisioned product.
     */
    public fun accountList(accountList: Collection<String>) {
        _accountList.addAll(accountList)
    }

    /** @param adminRole AdminRole ARN. */
    public fun adminRole(adminRole: String) {
        cdkBuilder.adminRole(adminRole)
    }

    /** @param description The description of the constraint. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param executionRole ExecutionRole name. */
    public fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
    }

    /** @param portfolioId The portfolio identifier. */
    public fun portfolioId(portfolioId: String) {
        cdkBuilder.portfolioId(portfolioId)
    }

    /** @param productId The product identifier. */
    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    /**
     * @param regionList One or more AWS Regions where the provisioned product will be available.
     *   Applicable only to a `CFN_STACKSET` provisioned product type.
     *
     * The specified Regions should be within the list of Regions from the `STACKSET` constraint. To
     * get the list of Regions in the `STACKSET` constraint, use the
     * `DescribeProvisioningParameters` operation.
     *
     * If no values are specified, the default value is all Regions from the `STACKSET` constraint.
     */
    public fun regionList(vararg regionList: String) {
        _regionList.addAll(listOf(*regionList))
    }

    /**
     * @param regionList One or more AWS Regions where the provisioned product will be available.
     *   Applicable only to a `CFN_STACKSET` provisioned product type.
     *
     * The specified Regions should be within the list of Regions from the `STACKSET` constraint. To
     * get the list of Regions in the `STACKSET` constraint, use the
     * `DescribeProvisioningParameters` operation.
     *
     * If no values are specified, the default value is all Regions from the `STACKSET` constraint.
     */
    public fun regionList(regionList: Collection<String>) {
        _regionList.addAll(regionList)
    }

    /**
     * @param stackInstanceControl Permission to create, update, and delete stack instances. Choose
     *   from ALLOWED and NOT_ALLOWED.
     */
    public fun stackInstanceControl(stackInstanceControl: String) {
        cdkBuilder.stackInstanceControl(stackInstanceControl)
    }

    public fun build(): CfnStackSetConstraintProps {
        if (_accountList.isNotEmpty()) cdkBuilder.accountList(_accountList)
        if (_regionList.isNotEmpty()) cdkBuilder.regionList(_regionList)
        return cdkBuilder.build()
    }
}
