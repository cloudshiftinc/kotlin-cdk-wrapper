@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.budgets.CfnBudget

@CdkDslMarker
public class CfnBudgetSubscriberPropertyDsl {
  private val cdkBuilder: CfnBudget.SubscriberProperty.Builder =
      CfnBudget.SubscriberProperty.builder()

  /**
   * @param address The address that AWS sends budget notifications to, either an SNS topic or an
   * email. 
   * When you create a subscriber, the value of `Address` can't contain line breaks.
   */
  public fun address(address: String) {
    cdkBuilder.address(address)
  }

  /**
   * @param subscriptionType The type of notification that AWS sends to a subscriber. 
   */
  public fun subscriptionType(subscriptionType: String) {
    cdkBuilder.subscriptionType(subscriptionType)
  }

  public fun build(): CfnBudget.SubscriberProperty = cdkBuilder.build()
}
