@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnUserProps

@CdkDslMarker
public class CfnUserPropsDsl {
  private val cdkBuilder: CfnUserProps.Builder = CfnUserProps.builder()

  /**
   * @param authenticationType The authentication type for the user. 
   * You must specify USERPOOL.
   */
  public fun authenticationType(authenticationType: String) {
    cdkBuilder.authenticationType(authenticationType)
  }

  /**
   * @param firstName The first name, or given name, of the user.
   */
  public fun firstName(firstName: String) {
    cdkBuilder.firstName(firstName)
  }

  /**
   * @param lastName The last name, or surname, of the user.
   */
  public fun lastName(lastName: String) {
    cdkBuilder.lastName(lastName)
  }

  /**
   * @param messageAction The action to take for the welcome email that is sent to a user after the
   * user is created in the user pool.
   * If you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first name
   * or last name of the user. If the value is null, the email is sent.
   *
   *
   * The temporary password in the welcome email is valid for only 7 days. If users don’t set their
   * passwords within 7 days, you must send them a new welcome email.
   */
  public fun messageAction(messageAction: String) {
    cdkBuilder.messageAction(messageAction)
  }

  /**
   * @param userName The email address of the user. 
   * Users' email addresses are case-sensitive. During login, if they specify an email address that
   * doesn't use the same capitalization as the email address specified when their user pool account
   * was created, a "user does not exist" error message displays.
   */
  public fun userName(userName: String) {
    cdkBuilder.userName(userName)
  }

  public fun build(): CfnUserProps = cdkBuilder.build()
}
