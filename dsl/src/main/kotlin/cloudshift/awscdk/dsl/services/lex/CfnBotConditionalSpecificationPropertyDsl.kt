@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Provides a list of conditional branches.
 *
 * Branches are evaluated in the order that they are entered in the list. The first branch with a
 * condition that evaluates to true is executed. The last branch in the list is the default branch. The
 * default branch should not have any condition expression. The default branch is executed if no other
 * branch has a matching condition.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SlotValueOverrideProperty slotValueOverrideProperty_;
 * ConditionalSpecificationProperty conditionalSpecificationProperty =
 * ConditionalSpecificationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-conditionalspecification.html)
 */
@CdkDslMarker
public class CfnBotConditionalSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.ConditionalSpecificationProperty.Builder =
      CfnBot.ConditionalSpecificationProperty.builder()

  private val _conditionalBranches: MutableList<Any> = mutableListOf()

  /**
   * @param conditionalBranches A list of conditional branches. 
   * A conditional branch is made up of a condition, a response and a next step. The response and
   * next step are executed when the condition is true.
   */
  public fun conditionalBranches(vararg conditionalBranches: Any) {
    _conditionalBranches.addAll(listOf(*conditionalBranches))
  }

  /**
   * @param conditionalBranches A list of conditional branches. 
   * A conditional branch is made up of a condition, a response and a next step. The response and
   * next step are executed when the condition is true.
   */
  public fun conditionalBranches(conditionalBranches: Collection<Any>) {
    _conditionalBranches.addAll(conditionalBranches)
  }

  /**
   * @param conditionalBranches A list of conditional branches. 
   * A conditional branch is made up of a condition, a response and a next step. The response and
   * next step are executed when the condition is true.
   */
  public fun conditionalBranches(conditionalBranches: IResolvable) {
    cdkBuilder.conditionalBranches(conditionalBranches)
  }

  /**
   * @param defaultBranch The conditional branch that should be followed when the conditions for
   * other branches are not satisfied. 
   * A conditional branch is made up of a condition, a response and a next step.
   */
  public fun defaultBranch(defaultBranch: IResolvable) {
    cdkBuilder.defaultBranch(defaultBranch)
  }

  /**
   * @param defaultBranch The conditional branch that should be followed when the conditions for
   * other branches are not satisfied. 
   * A conditional branch is made up of a condition, a response and a next step.
   */
  public fun defaultBranch(defaultBranch: CfnBot.DefaultConditionalBranchProperty) {
    cdkBuilder.defaultBranch(defaultBranch)
  }

  /**
   * @param isActive Determines whether a conditional branch is active. 
   * When `IsActive` is false, the conditions are not evaluated.
   */
  public fun isActive(isActive: Boolean) {
    cdkBuilder.isActive(isActive)
  }

  /**
   * @param isActive Determines whether a conditional branch is active. 
   * When `IsActive` is false, the conditions are not evaluated.
   */
  public fun isActive(isActive: IResolvable) {
    cdkBuilder.isActive(isActive)
  }

  public fun build(): CfnBot.ConditionalSpecificationProperty {
    if(_conditionalBranches.isNotEmpty()) cdkBuilder.conditionalBranches(_conditionalBranches)
    return cdkBuilder.build()
  }
}
