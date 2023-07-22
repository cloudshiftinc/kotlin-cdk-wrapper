@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.budgets.CfnBudgetsAction

@CdkDslMarker
public class CfnBudgetsActionActionThresholdPropertyDsl {
  private val cdkBuilder: CfnBudgetsAction.ActionThresholdProperty.Builder =
      CfnBudgetsAction.ActionThresholdProperty.builder()

  /**
   * @param type The type of threshold for a notification. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param value The threshold of a notification. 
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnBudgetsAction.ActionThresholdProperty = cdkBuilder.build()
}
