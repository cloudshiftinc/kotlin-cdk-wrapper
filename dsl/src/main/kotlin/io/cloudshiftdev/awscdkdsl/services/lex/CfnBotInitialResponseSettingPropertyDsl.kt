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
 * Configuration setting for a response sent to the user before Amazon Lex starts eliciting slots.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-initialresponsesetting.html)
 */
@CdkDslMarker
public class CfnBotInitialResponseSettingPropertyDsl {
    private val cdkBuilder: CfnBot.InitialResponseSettingProperty.Builder =
        CfnBot.InitialResponseSettingProperty.builder()

    /**
     * @param codeHook Settings that specify the dialog code hook that is called by Amazon Lex at a
     *   step of the conversation.
     */
    public fun codeHook(codeHook: IResolvable) {
        cdkBuilder.codeHook(codeHook)
    }

    /**
     * @param codeHook Settings that specify the dialog code hook that is called by Amazon Lex at a
     *   step of the conversation.
     */
    public fun codeHook(codeHook: CfnBot.DialogCodeHookInvocationSettingProperty) {
        cdkBuilder.codeHook(codeHook)
    }

    /**
     * @param conditional Provides a list of conditional branches. Branches are evaluated in the
     *   order that they are entered in the list. The first branch with a condition that evaluates
     *   to true is executed. The last branch in the list is the default branch. The default branch
     *   should not have any condition expression. The default branch is executed if no other branch
     *   has a matching condition.
     */
    public fun conditional(conditional: IResolvable) {
        cdkBuilder.conditional(conditional)
    }

    /**
     * @param conditional Provides a list of conditional branches. Branches are evaluated in the
     *   order that they are entered in the list. The first branch with a condition that evaluates
     *   to true is executed. The last branch in the list is the default branch. The default branch
     *   should not have any condition expression. The default branch is executed if no other branch
     *   has a matching condition.
     */
    public fun conditional(conditional: CfnBot.ConditionalSpecificationProperty) {
        cdkBuilder.conditional(conditional)
    }

    /**
     * @param initialResponse Specifies a list of message groups that Amazon Lex uses to respond the
     *   user input.
     */
    public fun initialResponse(initialResponse: IResolvable) {
        cdkBuilder.initialResponse(initialResponse)
    }

    /**
     * @param initialResponse Specifies a list of message groups that Amazon Lex uses to respond the
     *   user input.
     */
    public fun initialResponse(initialResponse: CfnBot.ResponseSpecificationProperty) {
        cdkBuilder.initialResponse(initialResponse)
    }

    /** @param nextStep The next step in the conversation. */
    public fun nextStep(nextStep: IResolvable) {
        cdkBuilder.nextStep(nextStep)
    }

    /** @param nextStep The next step in the conversation. */
    public fun nextStep(nextStep: CfnBot.DialogStateProperty) {
        cdkBuilder.nextStep(nextStep)
    }

    public fun build(): CfnBot.InitialResponseSettingProperty = cdkBuilder.build()
}
