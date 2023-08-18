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

package io.cloudshiftdev.awscdkdsl.services.lex

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
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

/**
 * Specifies a list of message groups that Amazon Lex sends to a user to elicit a response.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * PromptSpecificationProperty promptSpecificationProperty = PromptSpecificationProperty.builder()
 * .maxRetries(123)
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
 * .messageSelectionStrategy("messageSelectionStrategy")
 * .promptAttemptsSpecification(Map.of(
 * "promptAttemptsSpecificationKey", PromptAttemptSpecificationProperty.builder()
 * .allowedInputTypes(AllowedInputTypesProperty.builder()
 * .allowAudioInput(false)
 * .allowDtmfInput(false)
 * .build())
 * // the properties below are optional
 * .allowInterrupt(false)
 * .audioAndDtmfInputSpecification(AudioAndDTMFInputSpecificationProperty.builder()
 * .startTimeoutMs(123)
 * // the properties below are optional
 * .audioSpecification(AudioSpecificationProperty.builder()
 * .endTimeoutMs(123)
 * .maxLengthMs(123)
 * .build())
 * .dtmfSpecification(DTMFSpecificationProperty.builder()
 * .deletionCharacter("deletionCharacter")
 * .endCharacter("endCharacter")
 * .endTimeoutMs(123)
 * .maxLength(123)
 * .build())
 * .build())
 * .textInputSpecification(TextInputSpecificationProperty.builder()
 * .startTimeoutMs(123)
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptspecification.html)
 */
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
     * @param maxRetries The maximum number of times the bot tries to elicit a response from the
     *   user using this prompt.
     */
    public fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
    }

    /**
     * @param messageGroupsList A collection of messages that Amazon Lex can send to the user.
     *   Amazon Lex chooses the actual message to send at runtime.
     */
    public fun messageGroupsList(vararg messageGroupsList: Any) {
        _messageGroupsList.addAll(listOf(*messageGroupsList))
    }

    /**
     * @param messageGroupsList A collection of messages that Amazon Lex can send to the user.
     *   Amazon Lex chooses the actual message to send at runtime.
     */
    public fun messageGroupsList(messageGroupsList: Collection<Any>) {
        _messageGroupsList.addAll(messageGroupsList)
    }

    /**
     * @param messageGroupsList A collection of messages that Amazon Lex can send to the user.
     *   Amazon Lex chooses the actual message to send at runtime.
     */
    public fun messageGroupsList(messageGroupsList: IResolvable) {
        cdkBuilder.messageGroupsList(messageGroupsList)
    }

    /**
     * @param messageSelectionStrategy Indicates how a message is selected from a message group
     *   among retries.
     */
    public fun messageSelectionStrategy(messageSelectionStrategy: String) {
        cdkBuilder.messageSelectionStrategy(messageSelectionStrategy)
    }

    /**
     * @param promptAttemptsSpecification Specifies the advanced settings on each attempt of the
     *   prompt.
     */
    public fun promptAttemptsSpecification(
        promptAttemptsSpecification: MapBuilder.() -> Unit = {}
    ) {
        val builder = MapBuilder()
        builder.apply(promptAttemptsSpecification)
        cdkBuilder.promptAttemptsSpecification(builder.map)
    }

    /**
     * @param promptAttemptsSpecification Specifies the advanced settings on each attempt of the
     *   prompt.
     */
    public fun promptAttemptsSpecification(promptAttemptsSpecification: Map<String, Any>) {
        cdkBuilder.promptAttemptsSpecification(promptAttemptsSpecification)
    }

    /**
     * @param promptAttemptsSpecification Specifies the advanced settings on each attempt of the
     *   prompt.
     */
    public fun promptAttemptsSpecification(promptAttemptsSpecification: IResolvable) {
        cdkBuilder.promptAttemptsSpecification(promptAttemptsSpecification)
    }

    public fun build(): CfnBot.PromptSpecificationProperty {
        if (_messageGroupsList.isNotEmpty()) cdkBuilder.messageGroupsList(_messageGroupsList)
        return cdkBuilder.build()
    }
}
