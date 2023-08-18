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
 * Settings that specify the dialog code hook that is called by Amazon Lex between eliciting slot
 * values.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * ElicitationCodeHookInvocationSettingProperty elicitationCodeHookInvocationSettingProperty =
 * ElicitationCodeHookInvocationSettingProperty.builder()
 * .enableCodeHookInvocation(false)
 * // the properties below are optional
 * .invocationLabel("invocationLabel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-elicitationcodehookinvocationsetting.html)
 */
@CdkDslMarker
public class CfnBotElicitationCodeHookInvocationSettingPropertyDsl {
    private val cdkBuilder: CfnBot.ElicitationCodeHookInvocationSettingProperty.Builder =
        CfnBot.ElicitationCodeHookInvocationSettingProperty.builder()

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

    public fun build(): CfnBot.ElicitationCodeHookInvocationSettingProperty = cdkBuilder.build()
}
