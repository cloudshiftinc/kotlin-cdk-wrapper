@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotSlotPriorityPropertyDsl {
  private val cdkBuilder: CfnBot.SlotPriorityProperty.Builder =
      CfnBot.SlotPriorityProperty.builder()

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun slotName(slotName: String) {
    cdkBuilder.slotName(slotName)
  }

  public fun build(): CfnBot.SlotPriorityProperty = cdkBuilder.build()
}
