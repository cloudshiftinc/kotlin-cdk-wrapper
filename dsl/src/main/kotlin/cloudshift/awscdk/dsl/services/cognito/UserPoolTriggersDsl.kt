@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.UserPoolTriggers
import software.amazon.awscdk.services.lambda.IFunction

@CdkDslMarker
public class UserPoolTriggersDsl {
  private val cdkBuilder: UserPoolTriggers.Builder = UserPoolTriggers.builder()

  /**
   * @param createAuthChallenge Creates an authentication challenge.
   */
  public fun createAuthChallenge(createAuthChallenge: IFunction) {
    cdkBuilder.createAuthChallenge(createAuthChallenge)
  }

  /**
   * @param customEmailSender Amazon Cognito invokes this trigger to send email notifications to
   * users.
   */
  public fun customEmailSender(customEmailSender: IFunction) {
    cdkBuilder.customEmailSender(customEmailSender)
  }

  /**
   * @param customMessage A custom Message AWS Lambda trigger.
   */
  public fun customMessage(customMessage: IFunction) {
    cdkBuilder.customMessage(customMessage)
  }

  /**
   * @param customSmsSender Amazon Cognito invokes this trigger to send SMS notifications to users.
   */
  public fun customSmsSender(customSmsSender: IFunction) {
    cdkBuilder.customSmsSender(customSmsSender)
  }

  /**
   * @param defineAuthChallenge Defines the authentication challenge.
   */
  public fun defineAuthChallenge(defineAuthChallenge: IFunction) {
    cdkBuilder.defineAuthChallenge(defineAuthChallenge)
  }

  /**
   * @param postAuthentication A post-authentication AWS Lambda trigger.
   */
  public fun postAuthentication(postAuthentication: IFunction) {
    cdkBuilder.postAuthentication(postAuthentication)
  }

  /**
   * @param postConfirmation A post-confirmation AWS Lambda trigger.
   */
  public fun postConfirmation(postConfirmation: IFunction) {
    cdkBuilder.postConfirmation(postConfirmation)
  }

  /**
   * @param preAuthentication A pre-authentication AWS Lambda trigger.
   */
  public fun preAuthentication(preAuthentication: IFunction) {
    cdkBuilder.preAuthentication(preAuthentication)
  }

  /**
   * @param preSignUp A pre-registration AWS Lambda trigger.
   */
  public fun preSignUp(preSignUp: IFunction) {
    cdkBuilder.preSignUp(preSignUp)
  }

  /**
   * @param preTokenGeneration A pre-token-generation AWS Lambda trigger.
   */
  public fun preTokenGeneration(preTokenGeneration: IFunction) {
    cdkBuilder.preTokenGeneration(preTokenGeneration)
  }

  /**
   * @param userMigration A user-migration AWS Lambda trigger.
   */
  public fun userMigration(userMigration: IFunction) {
    cdkBuilder.userMigration(userMigration)
  }

  /**
   * @param verifyAuthChallengeResponse Verifies the authentication challenge response.
   */
  public fun verifyAuthChallengeResponse(verifyAuthChallengeResponse: IFunction) {
    cdkBuilder.verifyAuthChallengeResponse(verifyAuthChallengeResponse)
  }

  public fun build(): UserPoolTriggers = cdkBuilder.build()
}
