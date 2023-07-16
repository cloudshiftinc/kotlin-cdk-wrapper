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

  public fun autoAdjustType(autoAdjustType: String) {
    cdkBuilder.autoAdjustType(autoAdjustType)
  }

  public fun historicalOptions(historicalOptions: IResolvable) {
    cdkBuilder.historicalOptions(historicalOptions)
  }

  public fun historicalOptions(historicalOptions: CfnBudget.HistoricalOptionsProperty) {
    cdkBuilder.historicalOptions(historicalOptions)
  }

  public fun build(): CfnBudget.AutoAdjustDataProperty = cdkBuilder.build()
}
