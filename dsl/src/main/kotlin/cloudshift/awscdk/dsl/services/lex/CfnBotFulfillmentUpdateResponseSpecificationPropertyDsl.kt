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
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Provides settings for a message that is sent periodically to the user while a fulfillment Lambda
 * function is running.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * FulfillmentUpdateResponseSpecificationProperty fulfillmentUpdateResponseSpecificationProperty =
 * FulfillmentUpdateResponseSpecificationProperty.builder()
 * .frequencyInSeconds(123)
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdateresponsespecification.html)
 */
@CdkDslMarker
public class CfnBotFulfillmentUpdateResponseSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.FulfillmentUpdateResponseSpecificationProperty.Builder =
        CfnBot.FulfillmentUpdateResponseSpecificationProperty.builder()

    private val _messageGroups: MutableList<Any> = mutableListOf()

    /**
     * @param allowInterrupt Determines whether the user can interrupt an update message while it is
     *   playing.
     */
    public fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
    }

    /**
     * @param allowInterrupt Determines whether the user can interrupt an update message while it is
     *   playing.
     */
    public fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt)
    }

    /**
     * @param frequencyInSeconds The frequency that a message is sent to the user. When the period
     *   ends, Amazon Lex chooses a message from the message groups and plays it to the user. If the
     *   fulfillment Lambda returns before the first period ends, an update message is not played to
     *   the user.
     */
    public fun frequencyInSeconds(frequencyInSeconds: Number) {
        cdkBuilder.frequencyInSeconds(frequencyInSeconds)
    }

    /**
     * @param messageGroups 1 - 5 message groups that contain update messages. Amazon Lex chooses
     *   one of the messages to play to the user.
     */
    public fun messageGroups(vararg messageGroups: Any) {
        _messageGroups.addAll(listOf(*messageGroups))
    }

    /**
     * @param messageGroups 1 - 5 message groups that contain update messages. Amazon Lex chooses
     *   one of the messages to play to the user.
     */
    public fun messageGroups(messageGroups: Collection<Any>) {
        _messageGroups.addAll(messageGroups)
    }

    /**
     * @param messageGroups 1 - 5 message groups that contain update messages. Amazon Lex chooses
     *   one of the messages to play to the user.
     */
    public fun messageGroups(messageGroups: IResolvable) {
        cdkBuilder.messageGroups(messageGroups)
    }

    public fun build(): CfnBot.FulfillmentUpdateResponseSpecificationProperty {
        if (_messageGroups.isNotEmpty()) cdkBuilder.messageGroups(_messageGroups)
        return cdkBuilder.build()
    }
}
