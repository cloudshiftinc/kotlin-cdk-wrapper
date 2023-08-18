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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Settings that specify the dialog code hook that is called by Amazon Lex at a step of the
 * conversation.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogcodehookinvocationsetting.html)
 */
@CdkDslMarker
public class CfnBotDialogCodeHookInvocationSettingPropertyDsl {
    private val cdkBuilder: CfnBot.DialogCodeHookInvocationSettingProperty.Builder =
        CfnBot.DialogCodeHookInvocationSettingProperty.builder()

    /**
     * @param enableCodeHookInvocation Indicates whether a Lambda function should be invoked for the
     *   dialog.
     */
    public fun enableCodeHookInvocation(enableCodeHookInvocation: Boolean) {
        cdkBuilder.enableCodeHookInvocation(enableCodeHookInvocation)
    }

    /**
     * @param enableCodeHookInvocation Indicates whether a Lambda function should be invoked for the
     *   dialog.
     */
    public fun enableCodeHookInvocation(enableCodeHookInvocation: IResolvable) {
        cdkBuilder.enableCodeHookInvocation(enableCodeHookInvocation)
    }

    /**
     * @param invocationLabel A label that indicates the dialog step from which the dialog code hook
     *   is happening.
     */
    public fun invocationLabel(invocationLabel: String) {
        cdkBuilder.invocationLabel(invocationLabel)
    }

    /**
     * @param isActive Determines whether a dialog code hook is used when the intent is activated.
     */
    public fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
    }

    /**
     * @param isActive Determines whether a dialog code hook is used when the intent is activated.
     */
    public fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive)
    }

    /**
     * @param postCodeHookSpecification Contains the responses and actions that Amazon Lex takes
     *   after the Lambda function is complete.
     */
    public fun postCodeHookSpecification(postCodeHookSpecification: IResolvable) {
        cdkBuilder.postCodeHookSpecification(postCodeHookSpecification)
    }

    /**
     * @param postCodeHookSpecification Contains the responses and actions that Amazon Lex takes
     *   after the Lambda function is complete.
     */
    public fun postCodeHookSpecification(
        postCodeHookSpecification: CfnBot.PostDialogCodeHookInvocationSpecificationProperty
    ) {
        cdkBuilder.postCodeHookSpecification(postCodeHookSpecification)
    }

    public fun build(): CfnBot.DialogCodeHookInvocationSettingProperty = cdkBuilder.build()
}
