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
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Provides a statement the Amazon Lex conveys to the user when the intent is successfully
 * fulfilled.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SlotValueOverrideProperty slotValueOverrideProperty_;
 * IntentClosingSettingProperty intentClosingSettingProperty =
 * IntentClosingSettingProperty.builder()
 * .closingResponse(ResponseSpecificationProperty.builder()
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
 * .conditional(ConditionalSpecificationProperty.builder()
 * .conditionalBranches(List.of(ConditionalBranchProperty.builder()
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
 * .build()))
 * .defaultBranch(DefaultConditionalBranchProperty.builder()
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
 * .build())
 * .isActive(false)
 * .build())
 * .isActive(false)
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentclosingsetting.html)
 */
@CdkDslMarker
public class CfnBotIntentClosingSettingPropertyDsl {
    private val cdkBuilder: CfnBot.IntentClosingSettingProperty.Builder =
        CfnBot.IntentClosingSettingProperty.builder()

    /**
     * @param closingResponse The response that Amazon Lex sends to the user when the intent is
     *   complete.
     */
    public fun closingResponse(closingResponse: IResolvable) {
        cdkBuilder.closingResponse(closingResponse)
    }

    /**
     * @param closingResponse The response that Amazon Lex sends to the user when the intent is
     *   complete.
     */
    public fun closingResponse(closingResponse: CfnBot.ResponseSpecificationProperty) {
        cdkBuilder.closingResponse(closingResponse)
    }

    /**
     * @param conditional A list of conditional branches associated with the intent's closing
     *   response. These branches are executed when the `nextStep` attribute is set to
     *   `EvalutateConditional` .
     */
    public fun conditional(conditional: IResolvable) {
        cdkBuilder.conditional(conditional)
    }

    /**
     * @param conditional A list of conditional branches associated with the intent's closing
     *   response. These branches are executed when the `nextStep` attribute is set to
     *   `EvalutateConditional` .
     */
    public fun conditional(conditional: CfnBot.ConditionalSpecificationProperty) {
        cdkBuilder.conditional(conditional)
    }

    /**
     * @param isActive Specifies whether an intent's closing response is used. When this field is
     *   false, the closing response isn't sent to the user. If the `IsActive` field isn't
     *   specified, the default is true.
     */
    public fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
    }

    /**
     * @param isActive Specifies whether an intent's closing response is used. When this field is
     *   false, the closing response isn't sent to the user. If the `IsActive` field isn't
     *   specified, the default is true.
     */
    public fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive)
    }

    /**
     * @param nextStep Specifies the next step that the bot executes after playing the intent's
     *   closing response.
     */
    public fun nextStep(nextStep: IResolvable) {
        cdkBuilder.nextStep(nextStep)
    }

    /**
     * @param nextStep Specifies the next step that the bot executes after playing the intent's
     *   closing response.
     */
    public fun nextStep(nextStep: CfnBot.DialogStateProperty) {
        cdkBuilder.nextStep(nextStep)
    }

    public fun build(): CfnBot.IntentClosingSettingProperty = cdkBuilder.build()
}
