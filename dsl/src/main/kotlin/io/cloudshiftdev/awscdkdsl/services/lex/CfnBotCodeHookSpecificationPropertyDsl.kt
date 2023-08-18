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
 * Contains information about code hooks that Amazon Lex calls during a conversation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * CodeHookSpecificationProperty codeHookSpecificationProperty =
 * CodeHookSpecificationProperty.builder()
 * .lambdaCodeHook(LambdaCodeHookProperty.builder()
 * .codeHookInterfaceVersion("codeHookInterfaceVersion")
 * .lambdaArn("lambdaArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-codehookspecification.html)
 */
@CdkDslMarker
public class CfnBotCodeHookSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.CodeHookSpecificationProperty.Builder =
        CfnBot.CodeHookSpecificationProperty.builder()

    /**
     * @param lambdaCodeHook Specifies a Lambda function that verifies requests to a bot or fulfills
     *   the user's request to a bot.
     */
    public fun lambdaCodeHook(lambdaCodeHook: IResolvable) {
        cdkBuilder.lambdaCodeHook(lambdaCodeHook)
    }

    /**
     * @param lambdaCodeHook Specifies a Lambda function that verifies requests to a bot or fulfills
     *   the user's request to a bot.
     */
    public fun lambdaCodeHook(lambdaCodeHook: CfnBot.LambdaCodeHookProperty) {
        cdkBuilder.lambdaCodeHook(lambdaCodeHook)
    }

    public fun build(): CfnBot.CodeHookSpecificationProperty = cdkBuilder.build()
}
