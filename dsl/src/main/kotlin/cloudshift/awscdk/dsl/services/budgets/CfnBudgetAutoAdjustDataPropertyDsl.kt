@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.budgets.CfnBudget

@CdkDslMarker
public class CfnBudgetAutoAdjustDataPropertyDsl {
  private val cdkBuilder: CfnBudget.AutoAdjustDataProperty.Builder =
      CfnBudget.AutoAdjustDataProperty.builder()

  /**
   * @param autoAdjustType the value to be set. 
   */
  public fun autoAdjustType(autoAdjustType: String) {
    cdkBuilder.autoAdjustType(autoAdjustType)
  }

  /**
   * @param historicalOptions the value to be set.
   */
  public fun historicalOptions(historicalOptions: IResolvable) {
    cdkBuilder.historicalOptions(historicalOptions)
  }

  /**
   * @param historicalOptions the value to be set.
   */
  public fun historicalOptions(historicalOptions: CfnBudget.HistoricalOptionsProperty) {
    cdkBuilder.historicalOptions(historicalOptions)
  }

  public fun build(): CfnBudget.AutoAdjustDataProperty = cdkBuilder.build()
}
