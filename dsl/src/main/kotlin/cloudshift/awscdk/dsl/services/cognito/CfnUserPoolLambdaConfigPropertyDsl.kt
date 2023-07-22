@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolLambdaConfigPropertyDsl {
  private val cdkBuilder: CfnUserPool.LambdaConfigProperty.Builder =
      CfnUserPool.LambdaConfigProperty.builder()

  /**
   * @param createAuthChallenge Creates an authentication challenge.
   */
  public fun createAuthChallenge(createAuthChallenge: String) {
    cdkBuilder.createAuthChallenge(createAuthChallenge)
  }

  /**
   * @param customEmailSender A custom email sender AWS Lambda trigger.
   */
  public fun customEmailSender(customEmailSender: IResolvable) {
    cdkBuilder.customEmailSender(customEmailSender)
  }

  /**
   * @param customEmailSender A custom email sender AWS Lambda trigger.
   */
  public fun customEmailSender(customEmailSender: CfnUserPool.CustomEmailSenderProperty) {
    cdkBuilder.customEmailSender(customEmailSender)
  }

  /**
   * @param customMessage A custom Message AWS Lambda trigger.
   */
  public fun customMessage(customMessage: String) {
    cdkBuilder.customMessage(customMessage)
  }

  /**
   * @param customSmsSender A custom SMS sender AWS Lambda trigger.
   */
  public fun customSmsSender(customSmsSender: IResolvable) {
    cdkBuilder.customSmsSender(customSmsSender)
  }

  /**
   * @param customSmsSender A custom SMS sender AWS Lambda trigger.
   */
  public fun customSmsSender(customSmsSender: CfnUserPool.CustomSMSSenderProperty) {
    cdkBuilder.customSmsSender(customSmsSender)
  }

  /**
   * @param defineAuthChallenge Defines the authentication challenge.
   */
  public fun defineAuthChallenge(defineAuthChallenge: String) {
    cdkBuilder.defineAuthChallenge(defineAuthChallenge)
  }

  /**
   * @param kmsKeyId The Amazon Resource Name of a AWS Key Management Service ( AWS KMS ) key.
   * Amazon Cognito uses the key to encrypt codes and temporary passwords sent to
   * `CustomEmailSender` and `CustomSMSSender` .
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param postAuthentication A post-authentication AWS Lambda trigger.
   */
  public fun postAuthentication(postAuthentication: String) {
    cdkBuilder.postAuthentication(postAuthentication)
  }

  /**
   * @param postConfirmation A post-confirmation AWS Lambda trigger.
   */
  public fun postConfirmation(postConfirmation: String) {
    cdkBuilder.postConfirmation(postConfirmation)
  }

  /**
   * @param preAuthentication A pre-authentication AWS Lambda trigger.
   */
  public fun preAuthentication(preAuthentication: String) {
    cdkBuilder.preAuthentication(preAuthentication)
  }

  /**
   * @param preSignUp A pre-registration AWS Lambda trigger.
   */
  public fun preSignUp(preSignUp: String) {
    cdkBuilder.preSignUp(preSignUp)
  }

  /**
   * @param preTokenGeneration A Lambda trigger that is invoked before token generation.
   */
  public fun preTokenGeneration(preTokenGeneration: String) {
    cdkBuilder.preTokenGeneration(preTokenGeneration)
  }

  /**
   * @param userMigration The user migration Lambda config type.
   */
  public fun userMigration(userMigration: String) {
    cdkBuilder.userMigration(userMigration)
  }

  /**
   * @param verifyAuthChallengeResponse Verifies the authentication challenge response.
   */
  public fun verifyAuthChallengeResponse(verifyAuthChallengeResponse: String) {
    cdkBuilder.verifyAuthChallengeResponse(verifyAuthChallengeResponse)
  }

  public fun build(): CfnUserPool.LambdaConfigProperty = cdkBuilder.build()
}
