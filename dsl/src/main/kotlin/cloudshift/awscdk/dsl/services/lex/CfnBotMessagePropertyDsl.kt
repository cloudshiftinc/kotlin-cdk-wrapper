@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * The object that provides message text and its type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * MessageProperty messageProperty = MessageProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-message.html)
 */
@CdkDslMarker
public class CfnBotMessagePropertyDsl {
    private val cdkBuilder: CfnBot.MessageProperty.Builder = CfnBot.MessageProperty.builder()

    /** @param customPayload A message in a custom format defined by the client application. */
    public fun customPayload(customPayload: IResolvable) {
        cdkBuilder.customPayload(customPayload)
    }

    /** @param customPayload A message in a custom format defined by the client application. */
    public fun customPayload(customPayload: CfnBot.CustomPayloadProperty) {
        cdkBuilder.customPayload(customPayload)
    }

    /**
     * @param imageResponseCard A message that defines a response card that the client application
     *   can show to the user.
     */
    public fun imageResponseCard(imageResponseCard: IResolvable) {
        cdkBuilder.imageResponseCard(imageResponseCard)
    }

    /**
     * @param imageResponseCard A message that defines a response card that the client application
     *   can show to the user.
     */
    public fun imageResponseCard(imageResponseCard: CfnBot.ImageResponseCardProperty) {
        cdkBuilder.imageResponseCard(imageResponseCard)
    }

    /** @param plainTextMessage A message in plain text format. */
    public fun plainTextMessage(plainTextMessage: IResolvable) {
        cdkBuilder.plainTextMessage(plainTextMessage)
    }

    /** @param plainTextMessage A message in plain text format. */
    public fun plainTextMessage(plainTextMessage: CfnBot.PlainTextMessageProperty) {
        cdkBuilder.plainTextMessage(plainTextMessage)
    }

    /** @param ssmlMessage A message in Speech Synthesis Markup Language (SSML). */
    public fun ssmlMessage(ssmlMessage: IResolvable) {
        cdkBuilder.ssmlMessage(ssmlMessage)
    }

    /** @param ssmlMessage A message in Speech Synthesis Markup Language (SSML). */
    public fun ssmlMessage(ssmlMessage: CfnBot.SSMLMessageProperty) {
        cdkBuilder.ssmlMessage(ssmlMessage)
    }

    public fun build(): CfnBot.MessageProperty = cdkBuilder.build()
}
