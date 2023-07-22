@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.budgets.CfnBudget

@CdkDslMarker
public class CfnBudgetSpendPropertyDsl {
  private val cdkBuilder: CfnBudget.SpendProperty.Builder = CfnBudget.SpendProperty.builder()

  /**
   * @param amount The cost or usage amount that's associated with a budget forecast, actual spend,
   * or budget threshold. 
   */
  public fun amount(amount: Number) {
    cdkBuilder.amount(amount)
  }

  /**
   * @param unit The unit of measurement that's used for the budget forecast, actual spend, or
   * budget threshold, such as USD or GBP. 
   */
  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun build(): CfnBudget.SpendProperty = cdkBuilder.build()
}
