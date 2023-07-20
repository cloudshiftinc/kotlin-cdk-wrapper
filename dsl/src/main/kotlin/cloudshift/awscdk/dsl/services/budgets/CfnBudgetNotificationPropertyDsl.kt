@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.budgets.CfnBudget

@CdkDslMarker
public class CfnBudgetNotificationPropertyDsl {
  private val cdkBuilder: CfnBudget.NotificationProperty.Builder =
      CfnBudget.NotificationProperty.builder()

  public fun comparisonOperator(comparisonOperator: String) {
    cdkBuilder.comparisonOperator(comparisonOperator)
  }

  public fun notificationType(notificationType: String) {
    cdkBuilder.notificationType(notificationType)
  }

  public fun threshold(threshold: Number) {
    cdkBuilder.threshold(threshold)
  }

  public fun thresholdType(thresholdType: String) {
    cdkBuilder.thresholdType(thresholdType)
  }

  public fun build(): CfnBudget.NotificationProperty = cdkBuilder.build()
}
