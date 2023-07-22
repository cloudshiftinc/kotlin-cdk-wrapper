@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolInviteMessageTemplatePropertyDsl {
  private val cdkBuilder: CfnUserPool.InviteMessageTemplateProperty.Builder =
      CfnUserPool.InviteMessageTemplateProperty.builder()

  /**
   * @param emailMessage The message template for email messages.
   * EmailMessage is allowed only if
   * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
   * is DEVELOPER.
   */
  public fun emailMessage(emailMessage: String) {
    cdkBuilder.emailMessage(emailMessage)
  }

  /**
   * @param emailSubject The subject line for email messages.
   * EmailSubject is allowed only if
   * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
   * is DEVELOPER.
   */
  public fun emailSubject(emailSubject: String) {
    cdkBuilder.emailSubject(emailSubject)
  }

  /**
   * @param smsMessage The message template for SMS messages.
   */
  public fun smsMessage(smsMessage: String) {
    cdkBuilder.smsMessage(smsMessage)
  }

  public fun build(): CfnUserPool.InviteMessageTemplateProperty = cdkBuilder.build()
}
