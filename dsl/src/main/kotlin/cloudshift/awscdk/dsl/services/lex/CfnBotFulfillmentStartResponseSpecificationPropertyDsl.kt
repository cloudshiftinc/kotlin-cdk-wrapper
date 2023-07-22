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

/**
 * Provides settings for a message that is sent to the user when a fulfillment Lambda function
 * starts running.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * FulfillmentStartResponseSpecificationProperty fulfillmentStartResponseSpecificationProperty =
 * FulfillmentStartResponseSpecificationProperty.builder()
 * .delayInSeconds(123)
 * .messageGroups(List.of(MessageGroupProperty.builder()
 * .message(MessageProperty.builder()
 * .customPayload(CustomPayloadProperty.builder()
 * .value("value")
 * .build())
 * .imageResponseCard(ImageResponseCardProperty.builder()
 * .title("title")
 * // the properties below are optional
 * .buttons(List.of(ButtonProperty.builder()
 * .text("text")
 * .value("value")
 * .build()))
 * .imageUrl("imageUrl")
 * .subtitle("subtitle")
 * .build())
 * .plainTextMessage(PlainTextMessageProperty.builder()
 * .value("value")
 * .build())
 * .ssmlMessage(SSMLMessageProperty.builder()
 * .value("value")
 * .build())
 * .build())
 * // the properties below are optional
 * .variations(List.of(MessageProperty.builder()
 * .customPayload(CustomPayloadProperty.builder()
 * .value("value")
 * .build())
 * .imageResponseCard(ImageResponseCardProperty.builder()
 * .title("title")
 * // the properties below are optional
 * .buttons(List.of(ButtonProperty.builder()
 * .text("text")
 * .value("value")
 * .build()))
 * .imageUrl("imageUrl")
 * .subtitle("subtitle")
 * .build())
 * .plainTextMessage(PlainTextMessageProperty.builder()
 * .value("value")
 * .build())
 * .ssmlMessage(SSMLMessageProperty.builder()
 * .value("value")
 * .build())
 * .build()))
 * .build()))
 * // the properties below are optional
 * .allowInterrupt(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentstartresponsespecification.html)
 */
@CdkDslMarker
public class CfnBotFulfillmentStartResponseSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.FulfillmentStartResponseSpecificationProperty.Builder =
      CfnBot.FulfillmentStartResponseSpecificationProperty.builder()

  private val _messageGroups: MutableList<Any> = mutableListOf()

  /**
   * @param allowInterrupt Determines whether the user can interrupt the start message while it is
   * playing.
   */
  public fun allowInterrupt(allowInterrupt: Boolean) {
    cdkBuilder.allowInterrupt(allowInterrupt)
  }

  /**
   * @param allowInterrupt Determines whether the user can interrupt the start message while it is
   * playing.
   */
  public fun allowInterrupt(allowInterrupt: IResolvable) {
    cdkBuilder.allowInterrupt(allowInterrupt)
  }

  /**
   * @param delayInSeconds The delay between when the Lambda fulfillment function starts running and
   * the start message is played. 
   * If the Lambda function returns before the delay is over, the start message isn't played.
   */
  public fun delayInSeconds(delayInSeconds: Number) {
    cdkBuilder.delayInSeconds(delayInSeconds)
  }

  /**
   * @param messageGroups 1 - 5 message groups that contain start messages. 
   * Amazon Lex chooses one of the messages to play to the user.
   */
  public fun messageGroups(vararg messageGroups: Any) {
    _messageGroups.addAll(listOf(*messageGroups))
  }

  /**
   * @param messageGroups 1 - 5 message groups that contain start messages. 
   * Amazon Lex chooses one of the messages to play to the user.
   */
  public fun messageGroups(messageGroups: Collection<Any>) {
    _messageGroups.addAll(messageGroups)
  }

  /**
   * @param messageGroups 1 - 5 message groups that contain start messages. 
   * Amazon Lex chooses one of the messages to play to the user.
   */
  public fun messageGroups(messageGroups: IResolvable) {
    cdkBuilder.messageGroups(messageGroups)
  }

  public fun build(): CfnBot.FulfillmentStartResponseSpecificationProperty {
    if(_messageGroups.isNotEmpty()) cdkBuilder.messageGroups(_messageGroups)
    return cdkBuilder.build()
  }
}
