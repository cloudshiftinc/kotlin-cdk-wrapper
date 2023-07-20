@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotPostDialogCodeHookInvocationSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.PostDialogCodeHookInvocationSpecificationProperty.Builder =
      CfnBot.PostDialogCodeHookInvocationSpecificationProperty.builder()

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

  public fun successConditional(successConditional: IResolvable) {
    cdkBuilder.successConditional(successConditional)
  }

  public fun successConditional(successConditional: CfnBot.ConditionalSpecificationProperty) {
    cdkBuilder.successConditional(successConditional)
  }

  public fun successNextStep(successNextStep: IResolvable) {
    cdkBuilder.successNextStep(successNextStep)
  }

  public fun successNextStep(successNextStep: CfnBot.DialogStateProperty) {
    cdkBuilder.successNextStep(successNextStep)
  }

  public fun successResponse(successResponse: IResolvable) {
    cdkBuilder.successResponse(successResponse)
  }

  public fun successResponse(successResponse: CfnBot.ResponseSpecificationProperty) {
    cdkBuilder.successResponse(successResponse)
  }

  public fun timeoutConditional(timeoutConditional: IResolvable) {
    cdkBuilder.timeoutConditional(timeoutConditional)
  }

  public fun timeoutConditional(timeoutConditional: CfnBot.ConditionalSpecificationProperty) {
    cdkBuilder.timeoutConditional(timeoutConditional)
  }

  public fun timeoutNextStep(timeoutNextStep: IResolvable) {
    cdkBuilder.timeoutNextStep(timeoutNextStep)
  }

  public fun timeoutNextStep(timeoutNextStep: CfnBot.DialogStateProperty) {
    cdkBuilder.timeoutNextStep(timeoutNextStep)
  }

  public fun timeoutResponse(timeoutResponse: IResolvable) {
    cdkBuilder.timeoutResponse(timeoutResponse)
  }

  public fun timeoutResponse(timeoutResponse: CfnBot.ResponseSpecificationProperty) {
    cdkBuilder.timeoutResponse(timeoutResponse)
  }

  public fun build(): CfnBot.PostDialogCodeHookInvocationSpecificationProperty = cdkBuilder.build()
}
