@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotPromptSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.PromptSpecificationProperty.Builder =
      CfnBot.PromptSpecificationProperty.builder()

  private val _messageGroupsList: MutableList<Any> = mutableListOf()

  /**
   * @param allowInterrupt Indicates whether the user can interrupt a speech prompt from the bot.
   */
  public fun allowInterrupt(allowInterrupt: Boolean) {
    cdkBuilder.allowInterrupt(allowInterrupt)
  }

  /**
   * @param allowInterrupt Indicates whether the user can interrupt a speech prompt from the bot.
   */
  public fun allowInterrupt(allowInterrupt: IResolvable) {
    cdkBuilder.allowInterrupt(allowInterrupt)
  }

  /**
   * @param maxRetries The maximum number of times the bot tries to elicit a response from the user
   * using this prompt. 
   */
  public fun maxRetries(maxRetries: Number) {
    cdkBuilder.maxRetries(maxRetries)
  }

  /**
   * @param messageGroupsList A collection of messages that Amazon Lex can send to the user. 
   * Amazon Lex chooses the actual message to send at runtime.
   */
  public fun messageGroupsList(vararg messageGroupsList: Any) {
    _messageGroupsList.addAll(listOf(*messageGroupsList))
  }

  /**
   * @param messageGroupsList A collection of messages that Amazon Lex can send to the user. 
   * Amazon Lex chooses the actual message to send at runtime.
   */
  public fun messageGroupsList(messageGroupsList: Collection<Any>) {
    _messageGroupsList.addAll(messageGroupsList)
  }

  /**
   * @param messageGroupsList A collection of messages that Amazon Lex can send to the user. 
   * Amazon Lex chooses the actual message to send at runtime.
   */
  public fun messageGroupsList(messageGroupsList: IResolvable) {
    cdkBuilder.messageGroupsList(messageGroupsList)
  }

  /**
   * @param messageSelectionStrategy Indicates how a message is selected from a message group among
   * retries.
   */
  public fun messageSelectionStrategy(messageSelectionStrategy: String) {
    cdkBuilder.messageSelectionStrategy(messageSelectionStrategy)
  }

  /**
   * @param promptAttemptsSpecification Specifies the advanced settings on each attempt of the
   * prompt.
   */
  public fun promptAttemptsSpecification(promptAttemptsSpecification: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(promptAttemptsSpecification)
    cdkBuilder.promptAttemptsSpecification(builder.map)
  }

  /**
   * @param promptAttemptsSpecification Specifies the advanced settings on each attempt of the
   * prompt.
   */
  public fun promptAttemptsSpecification(promptAttemptsSpecification: Map<String, Any>) {
    cdkBuilder.promptAttemptsSpecification(promptAttemptsSpecification)
  }

  /**
   * @param promptAttemptsSpecification Specifies the advanced settings on each attempt of the
   * prompt.
   */
  public fun promptAttemptsSpecification(promptAttemptsSpecification: IResolvable) {
    cdkBuilder.promptAttemptsSpecification(promptAttemptsSpecification)
  }

  public fun build(): CfnBot.PromptSpecificationProperty {
    if(_messageGroupsList.isNotEmpty()) cdkBuilder.messageGroupsList(_messageGroupsList)
    return cdkBuilder.build()
  }
}
