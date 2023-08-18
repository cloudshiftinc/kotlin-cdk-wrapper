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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * A set of actions that Amazon Lex should run if the condition is matched.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SlotValueOverrideProperty slotValueOverrideProperty_;
 * ConditionalBranchProperty conditionalBranchProperty = ConditionalBranchProperty.builder()
 * .condition(ConditionProperty.builder()
 * .expressionString("expressionString")
 * .build())
 * .name("name")
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
 * // the properties below are optional
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalbranch.html)
 */
@CdkDslMarker
public class CfnBotConditionalBranchPropertyDsl {
    private val cdkBuilder: CfnBot.ConditionalBranchProperty.Builder =
        CfnBot.ConditionalBranchProperty.builder()

    /**
     * @param condition Contains the expression to evaluate. If the condition is true, the branch's
     *   actions are taken.
     */
    public fun condition(condition: IResolvable) {
        cdkBuilder.condition(condition)
    }

    /**
     * @param condition Contains the expression to evaluate. If the condition is true, the branch's
     *   actions are taken.
     */
    public fun condition(condition: CfnBot.ConditionProperty) {
        cdkBuilder.condition(condition)
    }

    /** @param name The name of the branch. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

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

    public fun build(): CfnBot.ConditionalBranchProperty = cdkBuilder.build()
}
