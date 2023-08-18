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
import kotlin.Any
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Specifies a list of message groups that Amazon Lex uses to respond the user input.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * ResponseSpecificationProperty responseSpecificationProperty =
 * ResponseSpecificationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-responsespecification.html)
 */
@CdkDslMarker
public class CfnBotResponseSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.ResponseSpecificationProperty.Builder =
        CfnBot.ResponseSpecificationProperty.builder()

    private val _messageGroupsList: MutableList<Any> = mutableListOf()

    /**
     * @param allowInterrupt Indicates whether the user can interrupt a speech response from Amazon
     *   Lex.
     */
    public fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
    }

    /**
     * @param allowInterrupt Indicates whether the user can interrupt a speech response from Amazon
     *   Lex.
     */
    public fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt)
    }

    /**
     * @param messageGroupsList A collection of responses that Amazon Lex can send to the user.
     *   Amazon Lex chooses the actual response to send at runtime.
     */
    public fun messageGroupsList(vararg messageGroupsList: Any) {
        _messageGroupsList.addAll(listOf(*messageGroupsList))
    }

    /**
     * @param messageGroupsList A collection of responses that Amazon Lex can send to the user.
     *   Amazon Lex chooses the actual response to send at runtime.
     */
    public fun messageGroupsList(messageGroupsList: Collection<Any>) {
        _messageGroupsList.addAll(messageGroupsList)
    }

    /**
     * @param messageGroupsList A collection of responses that Amazon Lex can send to the user.
     *   Amazon Lex chooses the actual response to send at runtime.
     */
    public fun messageGroupsList(messageGroupsList: IResolvable) {
        cdkBuilder.messageGroupsList(messageGroupsList)
    }

    public fun build(): CfnBot.ResponseSpecificationProperty {
        if (_messageGroupsList.isNotEmpty()) cdkBuilder.messageGroupsList(_messageGroupsList)
        return cdkBuilder.build()
    }
}
