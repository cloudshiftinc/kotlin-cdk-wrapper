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

package io.cloudshiftdev.awscdkdsl.services.budgets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.budgets.CfnBudget

/**
 * The types of cost that are included in a `COST` budget, such as tax and subscriptions.
 *
 * `USAGE` , `RI_UTILIZATION` , `RI_COVERAGE` , `SAVINGS_PLANS_UTILIZATION` , and
 * `SAVINGS_PLANS_COVERAGE` budgets don't have `CostTypes` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.budgets.*;
 * CostTypesProperty costTypesProperty = CostTypesProperty.builder()
 * .includeCredit(false)
 * .includeDiscount(false)
 * .includeOtherSubscription(false)
 * .includeRecurring(false)
 * .includeRefund(false)
 * .includeSubscription(false)
 * .includeSupport(false)
 * .includeTax(false)
 * .includeUpfront(false)
 * .useAmortized(false)
 * .useBlended(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html)
 */
@CdkDslMarker
public class CfnBudgetCostTypesPropertyDsl {
    private val cdkBuilder: CfnBudget.CostTypesProperty.Builder =
        CfnBudget.CostTypesProperty.builder()

    /**
     * @param includeCredit Specifies whether a budget includes credits. The default value is `true`
     *   .
     */
    public fun includeCredit(includeCredit: Boolean) {
        cdkBuilder.includeCredit(includeCredit)
    }

    /**
     * @param includeCredit Specifies whether a budget includes credits. The default value is `true`
     *   .
     */
    public fun includeCredit(includeCredit: IResolvable) {
        cdkBuilder.includeCredit(includeCredit)
    }

    /**
     * @param includeDiscount Specifies whether a budget includes discounts. The default value is
     *   `true` .
     */
    public fun includeDiscount(includeDiscount: Boolean) {
        cdkBuilder.includeDiscount(includeDiscount)
    }

    /**
     * @param includeDiscount Specifies whether a budget includes discounts. The default value is
     *   `true` .
     */
    public fun includeDiscount(includeDiscount: IResolvable) {
        cdkBuilder.includeDiscount(includeDiscount)
    }

    /**
     * @param includeOtherSubscription Specifies whether a budget includes non-RI subscription
     *   costs. The default value is `true` .
     */
    public fun includeOtherSubscription(includeOtherSubscription: Boolean) {
        cdkBuilder.includeOtherSubscription(includeOtherSubscription)
    }

    /**
     * @param includeOtherSubscription Specifies whether a budget includes non-RI subscription
     *   costs. The default value is `true` .
     */
    public fun includeOtherSubscription(includeOtherSubscription: IResolvable) {
        cdkBuilder.includeOtherSubscription(includeOtherSubscription)
    }

    /**
     * @param includeRecurring Specifies whether a budget includes recurring fees such as monthly RI
     *   fees. The default value is `true` .
     */
    public fun includeRecurring(includeRecurring: Boolean) {
        cdkBuilder.includeRecurring(includeRecurring)
    }

    /**
     * @param includeRecurring Specifies whether a budget includes recurring fees such as monthly RI
     *   fees. The default value is `true` .
     */
    public fun includeRecurring(includeRecurring: IResolvable) {
        cdkBuilder.includeRecurring(includeRecurring)
    }

    /**
     * @param includeRefund Specifies whether a budget includes refunds. The default value is `true`
     *   .
     */
    public fun includeRefund(includeRefund: Boolean) {
        cdkBuilder.includeRefund(includeRefund)
    }

    /**
     * @param includeRefund Specifies whether a budget includes refunds. The default value is `true`
     *   .
     */
    public fun includeRefund(includeRefund: IResolvable) {
        cdkBuilder.includeRefund(includeRefund)
    }

    /**
     * @param includeSubscription Specifies whether a budget includes subscriptions. The default
     *   value is `true` .
     */
    public fun includeSubscription(includeSubscription: Boolean) {
        cdkBuilder.includeSubscription(includeSubscription)
    }

    /**
     * @param includeSubscription Specifies whether a budget includes subscriptions. The default
     *   value is `true` .
     */
    public fun includeSubscription(includeSubscription: IResolvable) {
        cdkBuilder.includeSubscription(includeSubscription)
    }

    /**
     * @param includeSupport Specifies whether a budget includes support subscription fees. The
     *   default value is `true` .
     */
    public fun includeSupport(includeSupport: Boolean) {
        cdkBuilder.includeSupport(includeSupport)
    }

    /**
     * @param includeSupport Specifies whether a budget includes support subscription fees. The
     *   default value is `true` .
     */
    public fun includeSupport(includeSupport: IResolvable) {
        cdkBuilder.includeSupport(includeSupport)
    }

    /**
     * @param includeTax Specifies whether a budget includes taxes. The default value is `true` .
     */
    public fun includeTax(includeTax: Boolean) {
        cdkBuilder.includeTax(includeTax)
    }

    /**
     * @param includeTax Specifies whether a budget includes taxes. The default value is `true` .
     */
    public fun includeTax(includeTax: IResolvable) {
        cdkBuilder.includeTax(includeTax)
    }

    /**
     * @param includeUpfront Specifies whether a budget includes upfront RI costs. The default value
     *   is `true` .
     */
    public fun includeUpfront(includeUpfront: Boolean) {
        cdkBuilder.includeUpfront(includeUpfront)
    }

    /**
     * @param includeUpfront Specifies whether a budget includes upfront RI costs. The default value
     *   is `true` .
     */
    public fun includeUpfront(includeUpfront: IResolvable) {
        cdkBuilder.includeUpfront(includeUpfront)
    }

    /**
     * @param useAmortized Specifies whether a budget uses the amortized rate. The default value is
     *   `false` .
     */
    public fun useAmortized(useAmortized: Boolean) {
        cdkBuilder.useAmortized(useAmortized)
    }

    /**
     * @param useAmortized Specifies whether a budget uses the amortized rate. The default value is
     *   `false` .
     */
    public fun useAmortized(useAmortized: IResolvable) {
        cdkBuilder.useAmortized(useAmortized)
    }

    /**
     * @param useBlended Specifies whether a budget uses a blended rate. The default value is
     *   `false` .
     */
    public fun useBlended(useBlended: Boolean) {
        cdkBuilder.useBlended(useBlended)
    }

    /**
     * @param useBlended Specifies whether a budget uses a blended rate. The default value is
     *   `false` .
     */
    public fun useBlended(useBlended: IResolvable) {
        cdkBuilder.useBlended(useBlended)
    }

    public fun build(): CfnBudget.CostTypesProperty = cdkBuilder.build()
}
