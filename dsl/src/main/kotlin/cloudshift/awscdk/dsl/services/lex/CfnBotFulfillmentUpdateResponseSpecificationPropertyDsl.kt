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
public class CfnBotFulfillmentUpdateResponseSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.FulfillmentUpdateResponseSpecificationProperty.Builder =
      CfnBot.FulfillmentUpdateResponseSpecificationProperty.builder()

  private val _messageGroups: MutableList<Any> = mutableListOf()

  /**
   * @param allowInterrupt Determines whether the user can interrupt an update message while it is
   * playing.
   */
  public fun allowInterrupt(allowInterrupt: Boolean) {
    cdkBuilder.allowInterrupt(allowInterrupt)
  }

  /**
   * @param allowInterrupt Determines whether the user can interrupt an update message while it is
   * playing.
   */
  public fun allowInterrupt(allowInterrupt: IResolvable) {
    cdkBuilder.allowInterrupt(allowInterrupt)
  }

  /**
   * @param frequencyInSeconds The frequency that a message is sent to the user. 
   * When the period ends, Amazon Lex chooses a message from the message groups and plays it to the
   * user. If the fulfillment Lambda returns before the first period ends, an update message is not
   * played to the user.
   */
  public fun frequencyInSeconds(frequencyInSeconds: Number) {
    cdkBuilder.frequencyInSeconds(frequencyInSeconds)
  }

  /**
   * @param messageGroups 1 - 5 message groups that contain update messages. 
   * Amazon Lex chooses one of the messages to play to the user.
   */
  public fun messageGroups(vararg messageGroups: Any) {
    _messageGroups.addAll(listOf(*messageGroups))
  }

  /**
   * @param messageGroups 1 - 5 message groups that contain update messages. 
   * Amazon Lex chooses one of the messages to play to the user.
   */
  public fun messageGroups(messageGroups: Collection<Any>) {
    _messageGroups.addAll(messageGroups)
  }

  /**
   * @param messageGroups 1 - 5 message groups that contain update messages. 
   * Amazon Lex chooses one of the messages to play to the user.
   */
  public fun messageGroups(messageGroups: IResolvable) {
    cdkBuilder.messageGroups(messageGroups)
  }

  public fun build(): CfnBot.FulfillmentUpdateResponseSpecificationProperty {
    if(_messageGroups.isNotEmpty()) cdkBuilder.messageGroups(_messageGroups)
    return cdkBuilder.build()
  }
}
