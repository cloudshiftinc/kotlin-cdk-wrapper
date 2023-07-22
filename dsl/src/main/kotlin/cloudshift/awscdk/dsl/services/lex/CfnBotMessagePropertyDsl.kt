@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotMessagePropertyDsl {
  private val cdkBuilder: CfnBot.MessageProperty.Builder = CfnBot.MessageProperty.builder()

  /**
   * @param customPayload A message in a custom format defined by the client application.
   */
  public fun customPayload(customPayload: IResolvable) {
    cdkBuilder.customPayload(customPayload)
  }

  /**
   * @param customPayload A message in a custom format defined by the client application.
   */
  public fun customPayload(customPayload: CfnBot.CustomPayloadProperty) {
    cdkBuilder.customPayload(customPayload)
  }

  /**
   * @param imageResponseCard A message that defines a response card that the client application can
   * show to the user.
   */
  public fun imageResponseCard(imageResponseCard: IResolvable) {
    cdkBuilder.imageResponseCard(imageResponseCard)
  }

  /**
   * @param imageResponseCard A message that defines a response card that the client application can
   * show to the user.
   */
  public fun imageResponseCard(imageResponseCard: CfnBot.ImageResponseCardProperty) {
    cdkBuilder.imageResponseCard(imageResponseCard)
  }

  /**
   * @param plainTextMessage A message in plain text format.
   */
  public fun plainTextMessage(plainTextMessage: IResolvable) {
    cdkBuilder.plainTextMessage(plainTextMessage)
  }

  /**
   * @param plainTextMessage A message in plain text format.
   */
  public fun plainTextMessage(plainTextMessage: CfnBot.PlainTextMessageProperty) {
    cdkBuilder.plainTextMessage(plainTextMessage)
  }

  /**
   * @param ssmlMessage A message in Speech Synthesis Markup Language (SSML).
   */
  public fun ssmlMessage(ssmlMessage: IResolvable) {
    cdkBuilder.ssmlMessage(ssmlMessage)
  }

  /**
   * @param ssmlMessage A message in Speech Synthesis Markup Language (SSML).
   */
  public fun ssmlMessage(ssmlMessage: CfnBot.SSMLMessageProperty) {
    cdkBuilder.ssmlMessage(ssmlMessage)
  }

  public fun build(): CfnBot.MessageProperty = cdkBuilder.build()
}
