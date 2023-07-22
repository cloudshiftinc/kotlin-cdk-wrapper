@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotSlotValuePropertyDsl {
  private val cdkBuilder: CfnBot.SlotValueProperty.Builder = CfnBot.SlotValueProperty.builder()

  /**
   * @param interpretedValue The value that Amazon Lex determines for the slot.
   * The actual value depends on the setting of the value selection strategy for the bot. You can
   * choose to use the value entered by the user, or you can have Amazon Lex choose the first value in
   * the `resolvedValues` list.
   */
  public fun interpretedValue(interpretedValue: String) {
    cdkBuilder.interpretedValue(interpretedValue)
  }

  public fun build(): CfnBot.SlotValueProperty = cdkBuilder.build()
}
