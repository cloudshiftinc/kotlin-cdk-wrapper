@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Provides one or more messages that Amazon Lex should send to the user.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * MessageGroupProperty messageGroupProperty = MessageGroupProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-messagegroup.html)
 */
@CdkDslMarker
public class CfnBotMessageGroupPropertyDsl {
  private val cdkBuilder: CfnBot.MessageGroupProperty.Builder =
      CfnBot.MessageGroupProperty.builder()

  private val _variations: MutableList<Any> = mutableListOf()

  /**
   * @param message The primary message that Amazon Lex should send to the user. 
   */
  public fun message(message: IResolvable) {
    cdkBuilder.message(message)
  }

  /**
   * @param message The primary message that Amazon Lex should send to the user. 
   */
  public fun message(message: CfnBot.MessageProperty) {
    cdkBuilder.message(message)
  }

  /**
   * @param variations Message variations to send to the user.
   * When variations are defined, Amazon Lex chooses the primary message or one of the variations to
   * send to the user.
   */
  public fun variations(vararg variations: Any) {
    _variations.addAll(listOf(*variations))
  }

  /**
   * @param variations Message variations to send to the user.
   * When variations are defined, Amazon Lex chooses the primary message or one of the variations to
   * send to the user.
   */
  public fun variations(variations: Collection<Any>) {
    _variations.addAll(variations)
  }

  /**
   * @param variations Message variations to send to the user.
   * When variations are defined, Amazon Lex chooses the primary message or one of the variations to
   * send to the user.
   */
  public fun variations(variations: IResolvable) {
    cdkBuilder.variations(variations)
  }

  public fun build(): CfnBot.MessageGroupProperty {
    if(_variations.isNotEmpty()) cdkBuilder.variations(_variations)
    return cdkBuilder.build()
  }
}
