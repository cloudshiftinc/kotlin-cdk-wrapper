@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotSlotCaptureSettingPropertyDsl {
  private val cdkBuilder: CfnBot.SlotCaptureSettingProperty.Builder =
      CfnBot.SlotCaptureSettingProperty.builder()

  public fun captureConditional(captureConditional: IResolvable) {
    cdkBuilder.captureConditional(captureConditional)
  }

  public fun captureConditional(captureConditional: CfnBot.ConditionalSpecificationProperty) {
    cdkBuilder.captureConditional(captureConditional)
  }

  public fun captureNextStep(captureNextStep: IResolvable) {
    cdkBuilder.captureNextStep(captureNextStep)
  }

  public fun captureNextStep(captureNextStep: CfnBot.DialogStateProperty) {
    cdkBuilder.captureNextStep(captureNextStep)
  }

  public fun captureResponse(captureResponse: IResolvable) {
    cdkBuilder.captureResponse(captureResponse)
  }

  public fun captureResponse(captureResponse: CfnBot.ResponseSpecificationProperty) {
    cdkBuilder.captureResponse(captureResponse)
  }

  public fun codeHook(codeHook: IResolvable) {
    cdkBuilder.codeHook(codeHook)
  }

  public fun codeHook(codeHook: CfnBot.DialogCodeHookInvocationSettingProperty) {
    cdkBuilder.codeHook(codeHook)
  }

  public fun elicitationCodeHook(elicitationCodeHook: IResolvable) {
    cdkBuilder.elicitationCodeHook(elicitationCodeHook)
  }

  public
      fun elicitationCodeHook(elicitationCodeHook: CfnBot.ElicitationCodeHookInvocationSettingProperty) {
    cdkBuilder.elicitationCodeHook(elicitationCodeHook)
  }

  public fun failureConditional(failureConditional: IResolvable) {
    cdkBuilder.failureConditional(failureConditional)
  }

  public fun failureConditional(failureConditional: CfnBot.ConditionalSpecificationProperty) {
    cdkBuilder.failureConditional(failureConditional)
  }

  public fun failureNextStep(failureNextStep: IResolvable) {
    cdkBuilder.failureNextStep(failureNextStep)
  }

  public fun failureNextStep(failureNextStep: CfnBot.DialogStateProperty) {
    cdkBuilder.failureNextStep(failureNextStep)
  }

  public fun failureResponse(failureResponse: IResolvable) {
    cdkBuilder.failureResponse(failureResponse)
  }

  public fun failureResponse(failureResponse: CfnBot.ResponseSpecificationProperty) {
    cdkBuilder.failureResponse(failureResponse)
  }

  public fun build(): CfnBot.SlotCaptureSettingProperty = cdkBuilder.build()
}
