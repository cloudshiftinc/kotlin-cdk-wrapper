@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Specifies the prompts that Amazon Lex uses while a bot is waiting for customer input.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * WaitAndContinueSpecificationProperty waitAndContinueSpecificationProperty =
 * WaitAndContinueSpecificationProperty.builder()
 * .continueResponse(ResponseSpecificationProperty.builder()
 * .messageGroupsList(List.of(MessageGroupProperty.builder()
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
 * .build())
 * .waitingResponse(ResponseSpecificationProperty.builder()
 * .messageGroupsList(List.of(MessageGroupProperty.builder()
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
 * .build())
 * // the properties below are optional
 * .isActive(false)
 * .stillWaitingResponse(StillWaitingResponseSpecificationProperty.builder()
 * .frequencyInSeconds(123)
 * .messageGroupsList(List.of(MessageGroupProperty.builder()
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
 * .timeoutInSeconds(123)
 * // the properties below are optional
 * .allowInterrupt(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-waitandcontinuespecification.html)
 */
@CdkDslMarker
public class CfnBotWaitAndContinueSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.WaitAndContinueSpecificationProperty.Builder =
      CfnBot.WaitAndContinueSpecificationProperty.builder()

  /**
   * @param continueResponse The response that Amazon Lex sends to indicate that the bot is ready to
   * continue the conversation. 
   */
  public fun continueResponse(continueResponse: IResolvable) {
    cdkBuilder.continueResponse(continueResponse)
  }

  /**
   * @param continueResponse The response that Amazon Lex sends to indicate that the bot is ready to
   * continue the conversation. 
   */
  public fun continueResponse(continueResponse: CfnBot.ResponseSpecificationProperty) {
    cdkBuilder.continueResponse(continueResponse)
  }

  /**
   * @param isActive Specifies whether the bot will wait for a user to respond.
   * When this field is false, wait and continue responses for a slot aren't used. If the `IsActive`
   * field isn't specified, the default is true.
   */
  public fun isActive(isActive: Boolean) {
    cdkBuilder.isActive(isActive)
  }

  /**
   * @param isActive Specifies whether the bot will wait for a user to respond.
   * When this field is false, wait and continue responses for a slot aren't used. If the `IsActive`
   * field isn't specified, the default is true.
   */
  public fun isActive(isActive: IResolvable) {
    cdkBuilder.isActive(isActive)
  }

  /**
   * @param stillWaitingResponse A response that Amazon Lex sends periodically to the user to
   * indicate that the bot is still waiting for input from the user.
   */
  public fun stillWaitingResponse(stillWaitingResponse: IResolvable) {
    cdkBuilder.stillWaitingResponse(stillWaitingResponse)
  }

  /**
   * @param stillWaitingResponse A response that Amazon Lex sends periodically to the user to
   * indicate that the bot is still waiting for input from the user.
   */
  public
      fun stillWaitingResponse(stillWaitingResponse: CfnBot.StillWaitingResponseSpecificationProperty) {
    cdkBuilder.stillWaitingResponse(stillWaitingResponse)
  }

  /**
   * @param waitingResponse The response that Amazon Lex sends to indicate that the bot is waiting
   * for the conversation to continue. 
   */
  public fun waitingResponse(waitingResponse: IResolvable) {
    cdkBuilder.waitingResponse(waitingResponse)
  }

  /**
   * @param waitingResponse The response that Amazon Lex sends to indicate that the bot is waiting
   * for the conversation to continue. 
   */
  public fun waitingResponse(waitingResponse: CfnBot.ResponseSpecificationProperty) {
    cdkBuilder.waitingResponse(waitingResponse)
  }

  public fun build(): CfnBot.WaitAndContinueSpecificationProperty = cdkBuilder.build()
}
