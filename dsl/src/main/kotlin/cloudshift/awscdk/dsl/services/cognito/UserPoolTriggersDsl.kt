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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.UserPoolTriggers
import software.amazon.awscdk.services.lambda.IFunction

@CdkDslMarker
public class UserPoolTriggersDsl {
    private val cdkBuilder: UserPoolTriggers.Builder = UserPoolTriggers.builder()

    public fun createAuthChallenge(createAuthChallenge: IFunction) {
        cdkBuilder.createAuthChallenge(createAuthChallenge)
    }

    public fun customEmailSender(customEmailSender: IFunction) {
        cdkBuilder.customEmailSender(customEmailSender)
    }

    public fun customMessage(customMessage: IFunction) {
        cdkBuilder.customMessage(customMessage)
    }

    public fun customSmsSender(customSmsSender: IFunction) {
        cdkBuilder.customSmsSender(customSmsSender)
    }

    public fun defineAuthChallenge(defineAuthChallenge: IFunction) {
        cdkBuilder.defineAuthChallenge(defineAuthChallenge)
    }

    public fun postAuthentication(postAuthentication: IFunction) {
        cdkBuilder.postAuthentication(postAuthentication)
    }

    public fun postConfirmation(postConfirmation: IFunction) {
        cdkBuilder.postConfirmation(postConfirmation)
    }

    public fun preAuthentication(preAuthentication: IFunction) {
        cdkBuilder.preAuthentication(preAuthentication)
    }

    public fun preSignUp(preSignUp: IFunction) {
        cdkBuilder.preSignUp(preSignUp)
    }

    public fun preTokenGeneration(preTokenGeneration: IFunction) {
        cdkBuilder.preTokenGeneration(preTokenGeneration)
    }

    public fun userMigration(userMigration: IFunction) {
        cdkBuilder.userMigration(userMigration)
    }

    public fun verifyAuthChallengeResponse(verifyAuthChallengeResponse: IFunction) {
        cdkBuilder.verifyAuthChallengeResponse(verifyAuthChallengeResponse)
    }

    public fun build(): UserPoolTriggers = cdkBuilder.build()
}
