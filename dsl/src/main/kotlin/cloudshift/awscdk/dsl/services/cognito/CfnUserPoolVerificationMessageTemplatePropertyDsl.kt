@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolVerificationMessageTemplatePropertyDsl {
  private val cdkBuilder: CfnUserPool.VerificationMessageTemplateProperty.Builder =
      CfnUserPool.VerificationMessageTemplateProperty.builder()

  /**
   * @param defaultEmailOption The default email option.
   */
  public fun defaultEmailOption(defaultEmailOption: String) {
    cdkBuilder.defaultEmailOption(defaultEmailOption)
  }

  /**
   * @param emailMessage The template for email messages that Amazon Cognito sends to your users.
   * You can set an `EmailMessage` template only if the value of
   * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
   * is `DEVELOPER` . When your
   * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
   * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
   */
  public fun emailMessage(emailMessage: String) {
    cdkBuilder.emailMessage(emailMessage)
  }

  /**
   * @param emailMessageByLink The email message template for sending a confirmation link to the
   * user.
   * You can set an `EmailMessageByLink` template only if the value of
   * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
   * is `DEVELOPER` . When your
   * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
   * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
   */
  public fun emailMessageByLink(emailMessageByLink: String) {
    cdkBuilder.emailMessageByLink(emailMessageByLink)
  }

  /**
   * @param emailSubject The subject line for the email message template.
   * You can set an `EmailSubject` template only if the value of
   * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
   * is `DEVELOPER` . When your
   * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
   * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
   */
  public fun emailSubject(emailSubject: String) {
    cdkBuilder.emailSubject(emailSubject)
  }

  /**
   * @param emailSubjectByLink The subject line for the email message template for sending a
   * confirmation link to the user.
   * You can set an `EmailSubjectByLink` template only if the value of
   * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
   * is `DEVELOPER` . When your
   * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
   * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
   */
  public fun emailSubjectByLink(emailSubjectByLink: String) {
    cdkBuilder.emailSubjectByLink(emailSubjectByLink)
  }

  /**
   * @param smsMessage The template for SMS messages that Amazon Cognito sends to your users.
   */
  public fun smsMessage(smsMessage: String) {
    cdkBuilder.smsMessage(smsMessage)
  }

  public fun build(): CfnUserPool.VerificationMessageTemplateProperty = cdkBuilder.build()
}
