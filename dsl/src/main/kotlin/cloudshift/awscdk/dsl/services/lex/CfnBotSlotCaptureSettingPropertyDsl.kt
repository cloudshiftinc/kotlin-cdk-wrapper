@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotSlotCaptureSettingPropertyDsl {
  private val cdkBuilder: CfnBot.SlotCaptureSettingProperty.Builder =
      CfnBot.SlotCaptureSettingProperty.builder()

  /**
   * @param captureConditional A list of conditional branches to evaluate after the slot value is
   * captured.
   */
  public fun captureConditional(captureConditional: IResolvable) {
    cdkBuilder.captureConditional(captureConditional)
  }

  /**
   * @param captureConditional A list of conditional branches to evaluate after the slot value is
   * captured.
   */
  public fun captureConditional(captureConditional: CfnBot.ConditionalSpecificationProperty) {
    cdkBuilder.captureConditional(captureConditional)
  }

  /**
   * @param captureNextStep Specifies the next step that the bot runs when the slot value is
   * captured before the code hook times out.
   */
  public fun captureNextStep(captureNextStep: IResolvable) {
    cdkBuilder.captureNextStep(captureNextStep)
  }

  /**
   * @param captureNextStep Specifies the next step that the bot runs when the slot value is
   * captured before the code hook times out.
   */
  public fun captureNextStep(captureNextStep: CfnBot.DialogStateProperty) {
    cdkBuilder.captureNextStep(captureNextStep)
  }

  /**
   * @param captureResponse Specifies a list of message groups that Amazon Lex uses to respond the
   * user input.
   */
  public fun captureResponse(captureResponse: IResolvable) {
    cdkBuilder.captureResponse(captureResponse)
  }

  /**
   * @param captureResponse Specifies a list of message groups that Amazon Lex uses to respond the
   * user input.
   */
  public fun captureResponse(captureResponse: CfnBot.ResponseSpecificationProperty) {
    cdkBuilder.captureResponse(captureResponse)
  }

  /**
   * @param codeHook Code hook called after Amazon Lex successfully captures a slot value.
   */
  public fun codeHook(codeHook: IResolvable) {
    cdkBuilder.codeHook(codeHook)
  }

  /**
   * @param codeHook Code hook called after Amazon Lex successfully captures a slot value.
   */
  public fun codeHook(codeHook: CfnBot.DialogCodeHookInvocationSettingProperty) {
    cdkBuilder.codeHook(codeHook)
  }

  /**
   * @param elicitationCodeHook Code hook called when Amazon Lex doesn't capture a slot value.
   */
  public fun elicitationCodeHook(elicitationCodeHook: IResolvable) {
    cdkBuilder.elicitationCodeHook(elicitationCodeHook)
  }

  /**
   * @param elicitationCodeHook Code hook called when Amazon Lex doesn't capture a slot value.
   */
  public
      fun elicitationCodeHook(elicitationCodeHook: CfnBot.ElicitationCodeHookInvocationSettingProperty) {
    cdkBuilder.elicitationCodeHook(elicitationCodeHook)
  }

  /**
   * @param failureConditional A list of conditional branches to evaluate when the slot value isn't
   * captured.
   */
  public fun failureConditional(failureConditional: IResolvable) {
    cdkBuilder.failureConditional(failureConditional)
  }

  /**
   * @param failureConditional A list of conditional branches to evaluate when the slot value isn't
   * captured.
   */
  public fun failureConditional(failureConditional: CfnBot.ConditionalSpecificationProperty) {
    cdkBuilder.failureConditional(failureConditional)
  }

  /**
   * @param failureNextStep Specifies the next step that the bot runs when the slot value code is
   * not recognized.
   */
  public fun failureNextStep(failureNextStep: IResolvable) {
    cdkBuilder.failureNextStep(failureNextStep)
  }

  /**
   * @param failureNextStep Specifies the next step that the bot runs when the slot value code is
   * not recognized.
   */
  public fun failureNextStep(failureNextStep: CfnBot.DialogStateProperty) {
    cdkBuilder.failureNextStep(failureNextStep)
  }

  /**
   * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond the
   * user input when the slot fails to be captured.
   */
  public fun failureResponse(failureResponse: IResolvable) {
    cdkBuilder.failureResponse(failureResponse)
  }

  /**
   * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond the
   * user input when the slot fails to be captured.
   */
  public fun failureResponse(failureResponse: CfnBot.ResponseSpecificationProperty) {
    cdkBuilder.failureResponse(failureResponse)
  }

  public fun build(): CfnBot.SlotCaptureSettingProperty = cdkBuilder.build()
}
