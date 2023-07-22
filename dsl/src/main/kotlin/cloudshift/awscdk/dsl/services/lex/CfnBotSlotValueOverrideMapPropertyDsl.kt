@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotSlotValueOverrideMapPropertyDsl {
  private val cdkBuilder: CfnBot.SlotValueOverrideMapProperty.Builder =
      CfnBot.SlotValueOverrideMapProperty.builder()

  /**
   * @param slotName The name of the slot.
   */
  public fun slotName(slotName: String) {
    cdkBuilder.slotName(slotName)
  }

  /**
   * @param slotValueOverride The SlotValueOverride object to which the slot name will be mapped.
   */
  public fun slotValueOverride(slotValueOverride: IResolvable) {
    cdkBuilder.slotValueOverride(slotValueOverride)
  }

  /**
   * @param slotValueOverride The SlotValueOverride object to which the slot name will be mapped.
   */
  public fun slotValueOverride(slotValueOverride: CfnBot.SlotValueOverrideProperty) {
    cdkBuilder.slotValueOverride(slotValueOverride)
  }

  public fun build(): CfnBot.SlotValueOverrideMapProperty = cdkBuilder.build()
}
