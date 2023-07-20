@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot
import kotlin.Boolean

@CdkDslMarker
public class CfnBotIntentConfirmationSettingPropertyDsl {
    private val cdkBuilder: CfnBot.IntentConfirmationSettingProperty.Builder =
        CfnBot.IntentConfirmationSettingProperty.builder()

    public fun codeHook(codeHook: IResolvable) {
        cdkBuilder.codeHook(codeHook)
    }

    public fun codeHook(codeHook: CfnBot.DialogCodeHookInvocationSettingProperty) {
        cdkBuilder.codeHook(codeHook)
    }

    public fun confirmationConditional(confirmationConditional: IResolvable) {
        cdkBuilder.confirmationConditional(confirmationConditional)
    }

    public fun confirmationConditional(confirmationConditional: CfnBot.ConditionalSpecificationProperty) {
        cdkBuilder.confirmationConditional(confirmationConditional)
    }

    public fun confirmationNextStep(confirmationNextStep: IResolvable) {
        cdkBuilder.confirmationNextStep(confirmationNextStep)
    }

    public fun confirmationNextStep(confirmationNextStep: CfnBot.DialogStateProperty) {
        cdkBuilder.confirmationNextStep(confirmationNextStep)
    }

    public fun confirmationResponse(confirmationResponse: IResolvable) {
        cdkBuilder.confirmationResponse(confirmationResponse)
    }

    public fun confirmationResponse(confirmationResponse: CfnBot.ResponseSpecificationProperty) {
        cdkBuilder.confirmationResponse(confirmationResponse)
    }

    public fun declinationConditional(declinationConditional: IResolvable) {
        cdkBuilder.declinationConditional(declinationConditional)
    }

    public fun declinationConditional(declinationConditional: CfnBot.ConditionalSpecificationProperty) {
        cdkBuilder.declinationConditional(declinationConditional)
    }

    public fun declinationNextStep(declinationNextStep: IResolvable) {
        cdkBuilder.declinationNextStep(declinationNextStep)
    }

    public fun declinationNextStep(declinationNextStep: CfnBot.DialogStateProperty) {
        cdkBuilder.declinationNextStep(declinationNextStep)
    }

    public fun declinationResponse(declinationResponse: IResolvable) {
        cdkBuilder.declinationResponse(declinationResponse)
    }

    public fun declinationResponse(declinationResponse: CfnBot.ResponseSpecificationProperty) {
        cdkBuilder.declinationResponse(declinationResponse)
    }

    public fun elicitationCodeHook(elicitationCodeHook: IResolvable) {
        cdkBuilder.elicitationCodeHook(elicitationCodeHook)
    }

    public fun elicitationCodeHook(elicitationCodeHook: CfnBot.ElicitationCodeHookInvocationSettingProperty) {
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

    public fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
    }

    public fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive)
    }

    public fun promptSpecification(promptSpecification: IResolvable) {
        cdkBuilder.promptSpecification(promptSpecification)
    }

    public fun promptSpecification(promptSpecification: CfnBot.PromptSpecificationProperty) {
        cdkBuilder.promptSpecification(promptSpecification)
    }

    public fun build(): CfnBot.IntentConfirmationSettingProperty = cdkBuilder.build()
}
