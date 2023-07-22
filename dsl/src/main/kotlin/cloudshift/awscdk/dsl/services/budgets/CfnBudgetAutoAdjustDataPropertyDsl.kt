@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.budgets.CfnBudget

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.budgets.*;
 * AutoAdjustDataProperty autoAdjustDataProperty = AutoAdjustDataProperty.builder()
 * .autoAdjustType("autoAdjustType")
 * // the properties below are optional
 * .historicalOptions(HistoricalOptionsProperty.builder()
 * .budgetAdjustmentPeriod(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-autoadjustdata.html)
 */
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
