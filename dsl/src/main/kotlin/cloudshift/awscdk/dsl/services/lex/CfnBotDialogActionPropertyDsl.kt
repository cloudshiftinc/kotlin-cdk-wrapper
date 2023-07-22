@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotDialogActionPropertyDsl {
  private val cdkBuilder: CfnBot.DialogActionProperty.Builder =
      CfnBot.DialogActionProperty.builder()

  /**
   * @param slotToElicit If the dialog action is `ElicitSlot` , defines the slot to elicit from the
   * user.
   */
  public fun slotToElicit(slotToElicit: String) {
    cdkBuilder.slotToElicit(slotToElicit)
  }

  /**
   * @param suppressNextMessage When true the next message for the intent is not used.
   */
  public fun suppressNextMessage(suppressNextMessage: Boolean) {
    cdkBuilder.suppressNextMessage(suppressNextMessage)
  }

  /**
   * @param suppressNextMessage When true the next message for the intent is not used.
   */
  public fun suppressNextMessage(suppressNextMessage: IResolvable) {
    cdkBuilder.suppressNextMessage(suppressNextMessage)
  }

  /**
   * @param type The action that the bot should execute. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnBot.DialogActionProperty = cdkBuilder.build()
}
