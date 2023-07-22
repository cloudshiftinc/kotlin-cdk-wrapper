@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotIntentConfirmationSettingPropertyDsl {
  private val cdkBuilder: CfnBot.IntentConfirmationSettingProperty.Builder =
      CfnBot.IntentConfirmationSettingProperty.builder()

  /**
   * @param codeHook The `DialogCodeHookInvocationSetting` object associated with intent's
   * confirmation step.
   * The dialog code hook is triggered based on these invocation settings when the confirmation next
   * step or declination next step or failure next step is `InvokeDialogCodeHook` .
   */
  public fun codeHook(codeHook: IResolvable) {
    cdkBuilder.codeHook(codeHook)
  }

  /**
   * @param codeHook The `DialogCodeHookInvocationSetting` object associated with intent's
   * confirmation step.
   * The dialog code hook is triggered based on these invocation settings when the confirmation next
   * step or declination next step or failure next step is `InvokeDialogCodeHook` .
   */
  public fun codeHook(codeHook: CfnBot.DialogCodeHookInvocationSettingProperty) {
    cdkBuilder.codeHook(codeHook)
  }

  /**
   * @param confirmationConditional A list of conditional branches to evaluate after the intent is
   * closed.
   */
  public fun confirmationConditional(confirmationConditional: IResolvable) {
    cdkBuilder.confirmationConditional(confirmationConditional)
  }

  /**
   * @param confirmationConditional A list of conditional branches to evaluate after the intent is
   * closed.
   */
  public
      fun confirmationConditional(confirmationConditional: CfnBot.ConditionalSpecificationProperty) {
    cdkBuilder.confirmationConditional(confirmationConditional)
  }

  /**
   * @param confirmationNextStep Specifies the next step that the bot executes when the customer
   * confirms the intent.
   */
  public fun confirmationNextStep(confirmationNextStep: IResolvable) {
    cdkBuilder.confirmationNextStep(confirmationNextStep)
  }

  /**
   * @param confirmationNextStep Specifies the next step that the bot executes when the customer
   * confirms the intent.
   */
  public fun confirmationNextStep(confirmationNextStep: CfnBot.DialogStateProperty) {
    cdkBuilder.confirmationNextStep(confirmationNextStep)
  }

  /**
   * @param confirmationResponse Specifies a list of message groups that Amazon Lex uses to respond
   * the user input.
   */
  public fun confirmationResponse(confirmationResponse: IResolvable) {
    cdkBuilder.confirmationResponse(confirmationResponse)
  }

  /**
   * @param confirmationResponse Specifies a list of message groups that Amazon Lex uses to respond
   * the user input.
   */
  public fun confirmationResponse(confirmationResponse: CfnBot.ResponseSpecificationProperty) {
    cdkBuilder.confirmationResponse(confirmationResponse)
  }

  /**
   * @param declinationConditional A list of conditional branches to evaluate after the intent is
   * declined.
   */
  public fun declinationConditional(declinationConditional: IResolvable) {
    cdkBuilder.declinationConditional(declinationConditional)
  }

  /**
   * @param declinationConditional A list of conditional branches to evaluate after the intent is
   * declined.
   */
  public
      fun declinationConditional(declinationConditional: CfnBot.ConditionalSpecificationProperty) {
    cdkBuilder.declinationConditional(declinationConditional)
  }

  /**
   * @param declinationNextStep Specifies the next step that the bot executes when the customer
   * declines the intent.
   */
  public fun declinationNextStep(declinationNextStep: IResolvable) {
    cdkBuilder.declinationNextStep(declinationNextStep)
  }

  /**
   * @param declinationNextStep Specifies the next step that the bot executes when the customer
   * declines the intent.
   */
  public fun declinationNextStep(declinationNextStep: CfnBot.DialogStateProperty) {
    cdkBuilder.declinationNextStep(declinationNextStep)
  }

  /**
   * @param declinationResponse When the user answers "no" to the question defined in
   * `promptSpecification` , Amazon Lex responds with this response to acknowledge that the intent was
   * canceled.
   */
  public fun declinationResponse(declinationResponse: IResolvable) {
    cdkBuilder.declinationResponse(declinationResponse)
  }

  /**
   * @param declinationResponse When the user answers "no" to the question defined in
   * `promptSpecification` , Amazon Lex responds with this response to acknowledge that the intent was
   * canceled.
   */
  public fun declinationResponse(declinationResponse: CfnBot.ResponseSpecificationProperty) {
    cdkBuilder.declinationResponse(declinationResponse)
  }

  /**
   * @param elicitationCodeHook The `DialogCodeHookInvocationSetting` used when the code hook is
   * invoked during confirmation prompt retries.
   */
  public fun elicitationCodeHook(elicitationCodeHook: IResolvable) {
    cdkBuilder.elicitationCodeHook(elicitationCodeHook)
  }

  /**
   * @param elicitationCodeHook The `DialogCodeHookInvocationSetting` used when the code hook is
   * invoked during confirmation prompt retries.
   */
  public
      fun elicitationCodeHook(elicitationCodeHook: CfnBot.ElicitationCodeHookInvocationSettingProperty) {
    cdkBuilder.elicitationCodeHook(elicitationCodeHook)
  }

  /**
   * @param failureConditional Provides a list of conditional branches.
   * Branches are evaluated in the order that they are entered in the list. The first branch with a
   * condition that evaluates to true is executed. The last branch in the list is the default branch.
   * The default branch should not have any condition expression. The default branch is executed if no
   * other branch has a matching condition.
   */
  public fun failureConditional(failureConditional: IResolvable) {
    cdkBuilder.failureConditional(failureConditional)
  }

  /**
   * @param failureConditional Provides a list of conditional branches.
   * Branches are evaluated in the order that they are entered in the list. The first branch with a
   * condition that evaluates to true is executed. The last branch in the list is the default branch.
   * The default branch should not have any condition expression. The default branch is executed if no
   * other branch has a matching condition.
   */
  public fun failureConditional(failureConditional: CfnBot.ConditionalSpecificationProperty) {
    cdkBuilder.failureConditional(failureConditional)
  }

  /**
   * @param failureNextStep The next step to take in the conversation if the confirmation step
   * fails.
   */
  public fun failureNextStep(failureNextStep: IResolvable) {
    cdkBuilder.failureNextStep(failureNextStep)
  }

  /**
   * @param failureNextStep The next step to take in the conversation if the confirmation step
   * fails.
   */
  public fun failureNextStep(failureNextStep: CfnBot.DialogStateProperty) {
    cdkBuilder.failureNextStep(failureNextStep)
  }

  /**
   * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond the
   * user input when the intent confirmation fails.
   */
  public fun failureResponse(failureResponse: IResolvable) {
    cdkBuilder.failureResponse(failureResponse)
  }

  /**
   * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond the
   * user input when the intent confirmation fails.
   */
  public fun failureResponse(failureResponse: CfnBot.ResponseSpecificationProperty) {
    cdkBuilder.failureResponse(failureResponse)
  }

  /**
   * @param isActive Specifies whether the intent's confirmation is sent to the user.
   * When this field is false, confirmation and declination responses aren't sent. If the `IsActive`
   * field isn't specified, the default is true.
   */
  public fun isActive(isActive: Boolean) {
    cdkBuilder.isActive(isActive)
  }

  /**
   * @param isActive Specifies whether the intent's confirmation is sent to the user.
   * When this field is false, confirmation and declination responses aren't sent. If the `IsActive`
   * field isn't specified, the default is true.
   */
  public fun isActive(isActive: IResolvable) {
    cdkBuilder.isActive(isActive)
  }

  /**
   * @param promptSpecification Prompts the user to confirm the intent. This question should have a
   * yes or no answer. 
   * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for
   * fulfillment. For example, with the `OrderPizza` intent, you might want to confirm that the order
   * is correct before placing it. For other intents, such as intents that simply respond to user
   * questions, you might not need to ask the user for confirmation before providing the information.
   */
  public fun promptSpecification(promptSpecification: IResolvable) {
    cdkBuilder.promptSpecification(promptSpecification)
  }

  /**
   * @param promptSpecification Prompts the user to confirm the intent. This question should have a
   * yes or no answer. 
   * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for
   * fulfillment. For example, with the `OrderPizza` intent, you might want to confirm that the order
   * is correct before placing it. For other intents, such as intents that simply respond to user
   * questions, you might not need to ask the user for confirmation before providing the information.
   */
  public fun promptSpecification(promptSpecification: CfnBot.PromptSpecificationProperty) {
    cdkBuilder.promptSpecification(promptSpecification)
  }

  public fun build(): CfnBot.IntentConfirmationSettingProperty = cdkBuilder.build()
}
