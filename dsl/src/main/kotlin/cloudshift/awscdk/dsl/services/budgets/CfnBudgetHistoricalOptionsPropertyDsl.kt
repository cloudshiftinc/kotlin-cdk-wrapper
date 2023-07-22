@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.budgets.CfnBudget

/**
 * Example:
 *
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
   * @param budgetAdjustmentPeriod the value to be set. 
   */
  public fun budgetAdjustmentPeriod(budgetAdjustmentPeriod: Number) {
    cdkBuilder.budgetAdjustmentPeriod(budgetAdjustmentPeriod)
  }

  public fun build(): CfnBudget.HistoricalOptionsProperty = cdkBuilder.build()
}
