@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.UserInvitationConfig

@CdkDslMarker
public class UserInvitationConfigDsl {
  private val cdkBuilder: UserInvitationConfig.Builder = UserInvitationConfig.builder()

  /**
   * @param emailBody The template to the email body that is sent to the user when an administrator
   * signs them up to the user pool.
   */
  public fun emailBody(emailBody: String) {
    cdkBuilder.emailBody(emailBody)
  }

  /**
   * @param emailSubject The template to the email subject that is sent to the user when an
   * administrator signs them up to the user pool.
   */
  public fun emailSubject(emailSubject: String) {
    cdkBuilder.emailSubject(emailSubject)
  }

  /**
   * @param smsMessage The template to the SMS message that is sent to the user when an
   * administrator signs them up to the user pool.
   */
  public fun smsMessage(smsMessage: String) {
    cdkBuilder.smsMessage(smsMessage)
  }

  public fun build(): UserInvitationConfig = cdkBuilder.build()
}
