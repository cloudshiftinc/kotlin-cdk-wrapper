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
 * Provides a setting that determines whether the post-fulfillment response is sent to the user.
 *
 * For more information, see
 * [](https://docs.aws.amazon.com/lexv2/latest/dg/streaming-progress.html#progress-complete)
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-postfulfillmentstatusspecification.html)
 */
@CdkDslMarker
public class CfnBotPostFulfillmentStatusSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.PostFulfillmentStatusSpecificationProperty.Builder =
        CfnBot.PostFulfillmentStatusSpecificationProperty.builder()

    /**
     * @param failureConditional A list of conditional branches to evaluate after the fulfillment
     *   code hook throws an exception or returns with the `State` field of the `Intent` object set
     *   to `Failed` .
     */
    public fun failureConditional(failureConditional: IResolvable) {
        cdkBuilder.failureConditional(failureConditional)
    }

    /**
     * @param failureConditional A list of conditional branches to evaluate after the fulfillment
     *   code hook throws an exception or returns with the `State` field of the `Intent` object set
     *   to `Failed` .
     */
    public fun failureConditional(failureConditional: CfnBot.ConditionalSpecificationProperty) {
        cdkBuilder.failureConditional(failureConditional)
    }

    /**
     * @param failureNextStep Specifies the next step the bot runs after the fulfillment code hook
     *   throws an exception or returns with the `State` field of the `Intent` object set to
     *   `Failed` .
     */
    public fun failureNextStep(failureNextStep: IResolvable) {
        cdkBuilder.failureNextStep(failureNextStep)
    }

    /**
     * @param failureNextStep Specifies the next step the bot runs after the fulfillment code hook
     *   throws an exception or returns with the `State` field of the `Intent` object set to
     *   `Failed` .
     */
    public fun failureNextStep(failureNextStep: CfnBot.DialogStateProperty) {
        cdkBuilder.failureNextStep(failureNextStep)
    }

    /**
     * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
     *   when fulfillment isn't successful.
     */
    public fun failureResponse(failureResponse: IResolvable) {
        cdkBuilder.failureResponse(failureResponse)
    }

    /**
     * @param failureResponse Specifies a list of message groups that Amazon Lex uses to respond
     *   when fulfillment isn't successful.
     */
    public fun failureResponse(failureResponse: CfnBot.ResponseSpecificationProperty) {
        cdkBuilder.failureResponse(failureResponse)
    }

    /**
     * @param successConditional A list of conditional branches to evaluate after the fulfillment
     *   code hook finishes successfully.
     */
    public fun successConditional(successConditional: IResolvable) {
        cdkBuilder.successConditional(successConditional)
    }

    /**
     * @param successConditional A list of conditional branches to evaluate after the fulfillment
     *   code hook finishes successfully.
     */
    public fun successConditional(successConditional: CfnBot.ConditionalSpecificationProperty) {
        cdkBuilder.successConditional(successConditional)
    }

    /**
     * @param successNextStep Specifies the next step in the conversation that Amazon Lex invokes
     *   when the fulfillment code hook completes successfully.
     */
    public fun successNextStep(successNextStep: IResolvable) {
        cdkBuilder.successNextStep(successNextStep)
    }

    /**
     * @param successNextStep Specifies the next step in the conversation that Amazon Lex invokes
     *   when the fulfillment code hook completes successfully.
     */
    public fun successNextStep(successNextStep: CfnBot.DialogStateProperty) {
        cdkBuilder.successNextStep(successNextStep)
    }

    /**
     * @param successResponse Specifies a list of message groups that Amazon Lex uses to respond
     *   when the fulfillment is successful.
     */
    public fun successResponse(successResponse: IResolvable) {
        cdkBuilder.successResponse(successResponse)
    }

    /**
     * @param successResponse Specifies a list of message groups that Amazon Lex uses to respond
     *   when the fulfillment is successful.
     */
    public fun successResponse(successResponse: CfnBot.ResponseSpecificationProperty) {
        cdkBuilder.successResponse(successResponse)
    }

    /**
     * @param timeoutConditional A list of conditional branches to evaluate if the fulfillment code
     *   hook times out.
     */
    public fun timeoutConditional(timeoutConditional: IResolvable) {
        cdkBuilder.timeoutConditional(timeoutConditional)
    }

    /**
     * @param timeoutConditional A list of conditional branches to evaluate if the fulfillment code
     *   hook times out.
     */
    public fun timeoutConditional(timeoutConditional: CfnBot.ConditionalSpecificationProperty) {
        cdkBuilder.timeoutConditional(timeoutConditional)
    }

    /**
     * @param timeoutNextStep Specifies the next step that the bot runs when the fulfillment code
     *   hook times out.
     */
    public fun timeoutNextStep(timeoutNextStep: IResolvable) {
        cdkBuilder.timeoutNextStep(timeoutNextStep)
    }

    /**
     * @param timeoutNextStep Specifies the next step that the bot runs when the fulfillment code
     *   hook times out.
     */
    public fun timeoutNextStep(timeoutNextStep: CfnBot.DialogStateProperty) {
        cdkBuilder.timeoutNextStep(timeoutNextStep)
    }

    /**
     * @param timeoutResponse Specifies a list of message groups that Amazon Lex uses to respond
     *   when fulfillment isn't completed within the timeout period.
     */
    public fun timeoutResponse(timeoutResponse: IResolvable) {
        cdkBuilder.timeoutResponse(timeoutResponse)
    }

    /**
     * @param timeoutResponse Specifies a list of message groups that Amazon Lex uses to respond
     *   when fulfillment isn't completed within the timeout period.
     */
    public fun timeoutResponse(timeoutResponse: CfnBot.ResponseSpecificationProperty) {
        cdkBuilder.timeoutResponse(timeoutResponse)
    }

    public fun build(): CfnBot.PostFulfillmentStatusSpecificationProperty = cdkBuilder.build()
}
