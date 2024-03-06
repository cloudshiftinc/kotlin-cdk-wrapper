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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPool

/**
 * Specifies the configuration for AWS Lambda triggers.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * LambdaConfigProperty lambdaConfigProperty = LambdaConfigProperty.builder()
 * .createAuthChallenge("createAuthChallenge")
 * .customEmailSender(CustomEmailSenderProperty.builder()
 * .lambdaArn("lambdaArn")
 * .lambdaVersion("lambdaVersion")
 * .build())
 * .customMessage("customMessage")
 * .customSmsSender(CustomSMSSenderProperty.builder()
 * .lambdaArn("lambdaArn")
 * .lambdaVersion("lambdaVersion")
 * .build())
 * .defineAuthChallenge("defineAuthChallenge")
 * .kmsKeyId("kmsKeyId")
 * .postAuthentication("postAuthentication")
 * .postConfirmation("postConfirmation")
 * .preAuthentication("preAuthentication")
 * .preSignUp("preSignUp")
 * .preTokenGeneration("preTokenGeneration")
 * .preTokenGenerationConfig(PreTokenGenerationConfigProperty.builder()
 * .lambdaArn("lambdaArn")
 * .lambdaVersion("lambdaVersion")
 * .build())
 * .userMigration("userMigration")
 * .verifyAuthChallengeResponse("verifyAuthChallengeResponse")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html)
 */
@CdkDslMarker
public class CfnUserPoolLambdaConfigPropertyDsl {
    private val cdkBuilder: CfnUserPool.LambdaConfigProperty.Builder =
        CfnUserPool.LambdaConfigProperty.builder()

    /** @param createAuthChallenge Creates an authentication challenge. */
    public fun createAuthChallenge(createAuthChallenge: String) {
        cdkBuilder.createAuthChallenge(createAuthChallenge)
    }

    /** @param customEmailSender A custom email sender AWS Lambda trigger. */
    public fun customEmailSender(customEmailSender: IResolvable) {
        cdkBuilder.customEmailSender(customEmailSender)
    }

    /** @param customEmailSender A custom email sender AWS Lambda trigger. */
    public fun customEmailSender(customEmailSender: CfnUserPool.CustomEmailSenderProperty) {
        cdkBuilder.customEmailSender(customEmailSender)
    }

    /** @param customMessage A custom Message AWS Lambda trigger. */
    public fun customMessage(customMessage: String) {
        cdkBuilder.customMessage(customMessage)
    }

    /** @param customSmsSender A custom SMS sender AWS Lambda trigger. */
    public fun customSmsSender(customSmsSender: IResolvable) {
        cdkBuilder.customSmsSender(customSmsSender)
    }

    /** @param customSmsSender A custom SMS sender AWS Lambda trigger. */
    public fun customSmsSender(customSmsSender: CfnUserPool.CustomSMSSenderProperty) {
        cdkBuilder.customSmsSender(customSmsSender)
    }

    /** @param defineAuthChallenge Defines the authentication challenge. */
    public fun defineAuthChallenge(defineAuthChallenge: String) {
        cdkBuilder.defineAuthChallenge(defineAuthChallenge)
    }

    /**
     * @param kmsKeyId The Amazon Resource Name of a AWS Key Management Service ( AWS KMS ) key.
     *   Amazon Cognito uses the key to encrypt codes and temporary passwords sent to
     *   `CustomEmailSender` and `CustomSMSSender` .
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /** @param postAuthentication A post-authentication AWS Lambda trigger. */
    public fun postAuthentication(postAuthentication: String) {
        cdkBuilder.postAuthentication(postAuthentication)
    }

    /** @param postConfirmation A post-confirmation AWS Lambda trigger. */
    public fun postConfirmation(postConfirmation: String) {
        cdkBuilder.postConfirmation(postConfirmation)
    }

    /** @param preAuthentication A pre-authentication AWS Lambda trigger. */
    public fun preAuthentication(preAuthentication: String) {
        cdkBuilder.preAuthentication(preAuthentication)
    }

    /** @param preSignUp A pre-registration AWS Lambda trigger. */
    public fun preSignUp(preSignUp: String) {
        cdkBuilder.preSignUp(preSignUp)
    }

    /**
     * @param preTokenGeneration The Amazon Resource Name (ARN) of the function that you want to
     *   assign to your Lambda trigger. Set this parameter for legacy purposes. If you also set an
     *   ARN in `PreTokenGenerationConfig` , its value must be identical to `PreTokenGeneration` .
     *   For new instances of pre token generation triggers, set the `LambdaArn` of
     *   `PreTokenGenerationConfig` .
     *
     * You can set ``
     */
    public fun preTokenGeneration(preTokenGeneration: String) {
        cdkBuilder.preTokenGeneration(preTokenGeneration)
    }

    /**
     * @param preTokenGenerationConfig The detailed configuration of a pre token generation trigger.
     *   If you also set an ARN in `PreTokenGeneration` , its value must be identical to
     *   `PreTokenGenerationConfig` .
     */
    public fun preTokenGenerationConfig(preTokenGenerationConfig: IResolvable) {
        cdkBuilder.preTokenGenerationConfig(preTokenGenerationConfig)
    }

    /**
     * @param preTokenGenerationConfig The detailed configuration of a pre token generation trigger.
     *   If you also set an ARN in `PreTokenGeneration` , its value must be identical to
     *   `PreTokenGenerationConfig` .
     */
    public fun preTokenGenerationConfig(
        preTokenGenerationConfig: CfnUserPool.PreTokenGenerationConfigProperty
    ) {
        cdkBuilder.preTokenGenerationConfig(preTokenGenerationConfig)
    }

    /** @param userMigration The user migration Lambda config type. */
    public fun userMigration(userMigration: String) {
        cdkBuilder.userMigration(userMigration)
    }

    /** @param verifyAuthChallengeResponse Verifies the authentication challenge response. */
    public fun verifyAuthChallengeResponse(verifyAuthChallengeResponse: String) {
        cdkBuilder.verifyAuthChallengeResponse(verifyAuthChallengeResponse)
    }

    public fun build(): CfnUserPool.LambdaConfigProperty = cdkBuilder.build()
}
