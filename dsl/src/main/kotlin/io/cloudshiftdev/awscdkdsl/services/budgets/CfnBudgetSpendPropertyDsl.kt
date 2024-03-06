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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.budgets.CfnBudget

/**
 * The amount of cost or usage that's measured for a budget.
 *
 * *Cost example:* A `Spend` for `3 USD` of costs has the following parameters:
 * * An `Amount` of `3`
 * * A `Unit` of `USD`
 *
 * *Usage example:* A `Spend` for `3 GB` of S3 usage has the following parameters:
 * * An `Amount` of `3`
 * * A `Unit` of `GB`
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.budgets.*;
 * SpendProperty spendProperty = SpendProperty.builder()
 * .amount(123)
 * .unit("unit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html)
 */
@CdkDslMarker
public class CfnBudgetSpendPropertyDsl {
    private val cdkBuilder: CfnBudget.SpendProperty.Builder = CfnBudget.SpendProperty.builder()

    /**
     * @param amount The cost or usage amount that's associated with a budget forecast, actual
     *   spend, or budget threshold.
     */
    public fun amount(amount: Number) {
        cdkBuilder.amount(amount)
    }

    /**
     * @param unit The unit of measurement that's used for the budget forecast, actual spend, or
     *   budget threshold.
     */
    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun build(): CfnBudget.SpendProperty = cdkBuilder.build()
}
