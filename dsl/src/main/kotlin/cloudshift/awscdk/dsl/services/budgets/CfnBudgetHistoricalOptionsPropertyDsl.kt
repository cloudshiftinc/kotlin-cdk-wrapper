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

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.budgets.CfnBudget

/**
 * The parameters that define or describe the historical data that your auto-adjusting budget is
 * based on.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.budgets.*;
 * HistoricalOptionsProperty historicalOptionsProperty = HistoricalOptionsProperty.builder()
 * .budgetAdjustmentPeriod(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-historicaloptions.html)
 */
@CdkDslMarker
public class CfnBudgetHistoricalOptionsPropertyDsl {
    private val cdkBuilder: CfnBudget.HistoricalOptionsProperty.Builder =
        CfnBudget.HistoricalOptionsProperty.builder()

    /**
     * @param budgetAdjustmentPeriod The number of budget periods included in the moving-average
     *   calculation that determines your auto-adjusted budget amount. The maximum value depends on
     *   the `TimeUnit` granularity of the budget:
     * * For the `DAILY` granularity, the maximum value is `60` .
     * * For the `MONTHLY` granularity, the maximum value is `12` .
     * * For the `QUARTERLY` granularity, the maximum value is `4` .
     * * For the `ANNUALLY` granularity, the maximum value is `1` .
     */
    public fun budgetAdjustmentPeriod(budgetAdjustmentPeriod: Number) {
        cdkBuilder.budgetAdjustmentPeriod(budgetAdjustmentPeriod)
    }

    public fun build(): CfnBudget.HistoricalOptionsProperty = cdkBuilder.build()
}
