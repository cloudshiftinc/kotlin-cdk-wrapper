@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotSlotDefaultValuePropertyDsl {
  private val cdkBuilder: CfnBot.SlotDefaultValueProperty.Builder =
      CfnBot.SlotDefaultValueProperty.builder()

  /**
   * @param defaultValue The default value to use when a user doesn't provide a value for a slot. 
   */
  public fun defaultValue(defaultValue: String) {
    cdkBuilder.defaultValue(defaultValue)
  }

  public fun build(): CfnBot.SlotDefaultValueProperty = cdkBuilder.build()
}
