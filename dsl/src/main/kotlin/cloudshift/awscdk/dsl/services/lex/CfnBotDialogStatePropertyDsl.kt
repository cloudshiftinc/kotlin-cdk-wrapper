@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotDialogStatePropertyDsl {
  private val cdkBuilder: CfnBot.DialogStateProperty.Builder = CfnBot.DialogStateProperty.builder()

  private val _sessionAttributes: MutableList<Any> = mutableListOf()

  /**
   * @param dialogAction Defines the action that the bot executes at runtime when the conversation
   * reaches this step.
   */
  public fun dialogAction(dialogAction: IResolvable) {
    cdkBuilder.dialogAction(dialogAction)
  }

  /**
   * @param dialogAction Defines the action that the bot executes at runtime when the conversation
   * reaches this step.
   */
  public fun dialogAction(dialogAction: CfnBot.DialogActionProperty) {
    cdkBuilder.dialogAction(dialogAction)
  }

  /**
   * @param intent Override settings to configure the intent state.
   */
  public fun intent(intent: IResolvable) {
    cdkBuilder.intent(intent)
  }

  /**
   * @param intent Override settings to configure the intent state.
   */
  public fun intent(intent: CfnBot.IntentOverrideProperty) {
    cdkBuilder.intent(intent)
  }

  /**
   * @param sessionAttributes Map of key/value pairs representing session-specific context
   * information.
   * It contains application information passed between Amazon Lex and a client application.
   */
  public fun sessionAttributes(vararg sessionAttributes: Any) {
    _sessionAttributes.addAll(listOf(*sessionAttributes))
  }

  /**
   * @param sessionAttributes Map of key/value pairs representing session-specific context
   * information.
   * It contains application information passed between Amazon Lex and a client application.
   */
  public fun sessionAttributes(sessionAttributes: Collection<Any>) {
    _sessionAttributes.addAll(sessionAttributes)
  }

  /**
   * @param sessionAttributes Map of key/value pairs representing session-specific context
   * information.
   * It contains application information passed between Amazon Lex and a client application.
   */
  public fun sessionAttributes(sessionAttributes: IResolvable) {
    cdkBuilder.sessionAttributes(sessionAttributes)
  }

  public fun build(): CfnBot.DialogStateProperty {
    if(_sessionAttributes.isNotEmpty()) cdkBuilder.sessionAttributes(_sessionAttributes)
    return cdkBuilder.build()
  }
}
