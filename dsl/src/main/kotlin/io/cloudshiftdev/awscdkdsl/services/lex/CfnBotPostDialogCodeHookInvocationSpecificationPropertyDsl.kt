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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Specifies next steps to run after the dialog code hook finishes.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postdialogcodehookinvocationspecification.html)
 */
@CdkDslMarker
public class CfnBotPostDialogCodeHookInvocationSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.PostDialogCodeHookInvocationSpecificationProperty.Builder =
        CfnBot.PostDialogCodeHookInvocationSpecificationProperty.builder()

    /**
     * @param failureConditional A list of conditional branches to evaluate after the dialog code
     *   hook throws an exception or returns with the `State` field of the `Intent` object set to
     *   `Failed` .
     */
    public fun failureConditional(failureConditional: IResolvable) {
        cdkBuilder.failureConditional(failureConditional)
    }

    /**
     * @param failureConditional A list of conditional branches to evaluate after the dialog code
     *   hook throws an exception or returns with the `State` field of the `Intent` object set to
     *   `Failed` .
     */
    public fun failureConditional(failureConditional: CfnBot.ConditionalSpecificationProperty) {
        cdkBuilder.failureConditional(failureConditional)
    }

    /**
     * @param failureNextStep Specifies the next step the bot runs after the dialog code hook throws
     *   an exception or returns with the `State` field of the `Intent` object set to `Failed` .
     */
    public fun failureNextStep(failureNextStep: IResolvable) {
        cdkBuilder.failureNextStep(failureNextStep)
    }

    /**
     * @param failureNextStep Specifies the next step the bot runs after the dialog code hook throws
     *   an exception or returns with the `State` field of the `Intent` object set to `Failed` .
     */
    public fun failureNextStep(failureNextStep: CfnBot.DialogStateProperty) {
        cdkBuilder.failureNextStep(failureNextStep)
    }

    /**
     * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond the
     *   user input when the code hook fails.
     */
    public fun failureResponse(failureResponse: IResolvable) {
        cdkBuilder.failureResponse(failureResponse)
    }

    /**
     * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond the
     *   user input when the code hook fails.
     */
    public fun failureResponse(failureResponse: CfnBot.ResponseSpecificationProperty) {
        cdkBuilder.failureResponse(failureResponse)
    }

    /**
     * @param successConditional A list of conditional branches to evaluate after the dialog code
     *   hook finishes successfully.
     */
    public fun successConditional(successConditional: IResolvable) {
        cdkBuilder.successConditional(successConditional)
    }

    /**
     * @param successConditional A list of conditional branches to evaluate after the dialog code
     *   hook finishes successfully.
     */
    public fun successConditional(successConditional: CfnBot.ConditionalSpecificationProperty) {
        cdkBuilder.successConditional(successConditional)
    }

    /**
     * @param successNextStep Specifics the next step the bot runs after the dialog code hook
     *   finishes successfully.
     */
    public fun successNextStep(successNextStep: IResolvable) {
        cdkBuilder.successNextStep(successNextStep)
    }

    /**
     * @param successNextStep Specifics the next step the bot runs after the dialog code hook
     *   finishes successfully.
     */
    public fun successNextStep(successNextStep: CfnBot.DialogStateProperty) {
        cdkBuilder.successNextStep(successNextStep)
    }

    /**
     * @param successResponse Specifies a list of message groups that Amazon Lex uses to respond
     *   when the code hook succeeds.
     */
    public fun successResponse(successResponse: IResolvable) {
        cdkBuilder.successResponse(successResponse)
    }

    /**
     * @param successResponse Specifies a list of message groups that Amazon Lex uses to respond
     *   when the code hook succeeds.
     */
    public fun successResponse(successResponse: CfnBot.ResponseSpecificationProperty) {
        cdkBuilder.successResponse(successResponse)
    }

    /**
     * @param timeoutConditional A list of conditional branches to evaluate if the code hook times
     *   out.
     */
    public fun timeoutConditional(timeoutConditional: IResolvable) {
        cdkBuilder.timeoutConditional(timeoutConditional)
    }

    /**
     * @param timeoutConditional A list of conditional branches to evaluate if the code hook times
     *   out.
     */
    public fun timeoutConditional(timeoutConditional: CfnBot.ConditionalSpecificationProperty) {
        cdkBuilder.timeoutConditional(timeoutConditional)
    }

    /**
     * @param timeoutNextStep Specifies the next step that the bot runs when the code hook times
     *   out.
     */
    public fun timeoutNextStep(timeoutNextStep: IResolvable) {
        cdkBuilder.timeoutNextStep(timeoutNextStep)
    }

    /**
     * @param timeoutNextStep Specifies the next step that the bot runs when the code hook times
     *   out.
     */
    public fun timeoutNextStep(timeoutNextStep: CfnBot.DialogStateProperty) {
        cdkBuilder.timeoutNextStep(timeoutNextStep)
    }

    /**
     * @param timeoutResponse Specifies a list of message groups that Amazon Lex uses to respond to
     *   the user input when the code hook times out.
     */
    public fun timeoutResponse(timeoutResponse: IResolvable) {
        cdkBuilder.timeoutResponse(timeoutResponse)
    }

    /**
     * @param timeoutResponse Specifies a list of message groups that Amazon Lex uses to respond to
     *   the user input when the code hook times out.
     */
    public fun timeoutResponse(timeoutResponse: CfnBot.ResponseSpecificationProperty) {
        cdkBuilder.timeoutResponse(timeoutResponse)
    }

    public fun build(): CfnBot.PostDialogCodeHookInvocationSpecificationProperty =
        cdkBuilder.build()
}
