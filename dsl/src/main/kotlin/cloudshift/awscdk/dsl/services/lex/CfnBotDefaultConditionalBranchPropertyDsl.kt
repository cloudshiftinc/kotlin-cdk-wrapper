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
 * A set of actions that Amazon Lex should run if none of the other conditions are met.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SlotValueOverrideProperty slotValueOverrideProperty_;
 * DefaultConditionalBranchProperty defaultConditionalBranchProperty =
 * DefaultConditionalBranchProperty.builder()
 * .nextStep(DialogStateProperty.builder()
 * .dialogAction(DialogActionProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .slotToElicit("slotToElicit")
 * .suppressNextMessage(false)
 * .build())
 * .intent(IntentOverrideProperty.builder()
 * .name("name")
 * .slots(List.of(SlotValueOverrideMapProperty.builder()
 * .slotName("slotName")
 * .slotValueOverride(SlotValueOverrideProperty.builder()
 * .shape("shape")
 * .value(SlotValueProperty.builder()
 * .interpretedValue("interpretedValue")
 * .build())
 * .values(List.of(slotValueOverrideProperty_))
 * .build())
 * .build()))
 * .build())
 * .sessionAttributes(List.of(SessionAttributeProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .value("value")
 * .build()))
 * .build())
 * .response(ResponseSpecificationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-defaultconditionalbranch.html)
 */
@CdkDslMarker
public class CfnBotDefaultConditionalBranchPropertyDsl {
    private val cdkBuilder: CfnBot.DefaultConditionalBranchProperty.Builder =
        CfnBot.DefaultConditionalBranchProperty.builder()

    /** @param nextStep The next step in the conversation. */
    public fun nextStep(nextStep: IResolvable) {
        cdkBuilder.nextStep(nextStep)
    }

    /** @param nextStep The next step in the conversation. */
    public fun nextStep(nextStep: CfnBot.DialogStateProperty) {
        cdkBuilder.nextStep(nextStep)
    }

    /**
     * @param response Specifies a list of message groups that Amazon Lex uses to respond the user
     *   input.
     */
    public fun response(response: IResolvable) {
        cdkBuilder.response(response)
    }

    /**
     * @param response Specifies a list of message groups that Amazon Lex uses to respond the user
     *   input.
     */
    public fun response(response: CfnBot.ResponseSpecificationProperty) {
        cdkBuilder.response(response)
    }

    public fun build(): CfnBot.DefaultConditionalBranchProperty = cdkBuilder.build()
}
