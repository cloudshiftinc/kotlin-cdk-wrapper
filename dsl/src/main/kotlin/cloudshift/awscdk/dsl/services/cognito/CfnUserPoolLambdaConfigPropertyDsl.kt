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

  public fun createAuthChallenge(createAuthChallenge: String) {
    cdkBuilder.createAuthChallenge(createAuthChallenge)
  }

  public fun customEmailSender(customEmailSender: IResolvable) {
    cdkBuilder.customEmailSender(customEmailSender)
  }

  public fun customEmailSender(customEmailSender: CfnUserPool.CustomEmailSenderProperty) {
    cdkBuilder.customEmailSender(customEmailSender)
  }

  public fun customMessage(customMessage: String) {
    cdkBuilder.customMessage(customMessage)
  }

  public fun customSmsSender(customSmsSender: IResolvable) {
    cdkBuilder.customSmsSender(customSmsSender)
  }

  public fun customSmsSender(customSmsSender: CfnUserPool.CustomSMSSenderProperty) {
    cdkBuilder.customSmsSender(customSmsSender)
  }

  public fun defineAuthChallenge(defineAuthChallenge: String) {
    cdkBuilder.defineAuthChallenge(defineAuthChallenge)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun postAuthentication(postAuthentication: String) {
    cdkBuilder.postAuthentication(postAuthentication)
  }

  public fun postConfirmation(postConfirmation: String) {
    cdkBuilder.postConfirmation(postConfirmation)
  }

  public fun preAuthentication(preAuthentication: String) {
    cdkBuilder.preAuthentication(preAuthentication)
  }

  public fun preSignUp(preSignUp: String) {
    cdkBuilder.preSignUp(preSignUp)
  }

  public fun preTokenGeneration(preTokenGeneration: String) {
    cdkBuilder.preTokenGeneration(preTokenGeneration)
  }

  public fun userMigration(userMigration: String) {
    cdkBuilder.userMigration(userMigration)
  }

  public fun verifyAuthChallengeResponse(verifyAuthChallengeResponse: String) {
    cdkBuilder.verifyAuthChallengeResponse(verifyAuthChallengeResponse)
  }

  public fun build(): CfnUserPool.LambdaConfigProperty = cdkBuilder.build()
}
