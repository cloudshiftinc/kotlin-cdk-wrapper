@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotStillWaitingResponseSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.StillWaitingResponseSpecificationProperty.Builder =
      CfnBot.StillWaitingResponseSpecificationProperty.builder()

  private val _messageGroupsList: MutableList<Any> = mutableListOf()

  /**
   * @param allowInterrupt Indicates that the user can interrupt the response by speaking while the
   * message is being played.
   */
  public fun allowInterrupt(allowInterrupt: Boolean) {
    cdkBuilder.allowInterrupt(allowInterrupt)
  }

  /**
   * @param allowInterrupt Indicates that the user can interrupt the response by speaking while the
   * message is being played.
   */
  public fun allowInterrupt(allowInterrupt: IResolvable) {
    cdkBuilder.allowInterrupt(allowInterrupt)
  }

  /**
   * @param frequencyInSeconds How often a message should be sent to the user. 
   * Minimum of 1 second, maximum of 5 minutes.
   */
  public fun frequencyInSeconds(frequencyInSeconds: Number) {
    cdkBuilder.frequencyInSeconds(frequencyInSeconds)
  }

  /**
   * @param messageGroupsList One or more message groups, each containing one or more messages, that
   * define the prompts that Amazon Lex sends to the user. 
   */
  public fun messageGroupsList(vararg messageGroupsList: Any) {
    _messageGroupsList.addAll(listOf(*messageGroupsList))
  }

  /**
   * @param messageGroupsList One or more message groups, each containing one or more messages, that
   * define the prompts that Amazon Lex sends to the user. 
   */
  public fun messageGroupsList(messageGroupsList: Collection<Any>) {
    _messageGroupsList.addAll(messageGroupsList)
  }

  /**
   * @param messageGroupsList One or more message groups, each containing one or more messages, that
   * define the prompts that Amazon Lex sends to the user. 
   */
  public fun messageGroupsList(messageGroupsList: IResolvable) {
    cdkBuilder.messageGroupsList(messageGroupsList)
  }

  /**
   * @param timeoutInSeconds If Amazon Lex waits longer than this length of time for a response, it
   * will stop sending messages. 
   */
  public fun timeoutInSeconds(timeoutInSeconds: Number) {
    cdkBuilder.timeoutInSeconds(timeoutInSeconds)
  }

  public fun build(): CfnBot.StillWaitingResponseSpecificationProperty {
    if(_messageGroupsList.isNotEmpty()) cdkBuilder.messageGroupsList(_messageGroupsList)
    return cdkBuilder.build()
  }
}
