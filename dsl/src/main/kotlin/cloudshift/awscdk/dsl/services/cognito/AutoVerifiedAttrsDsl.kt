@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.AutoVerifiedAttrs

@CdkDslMarker
public class AutoVerifiedAttrsDsl {
  private val cdkBuilder: AutoVerifiedAttrs.Builder = AutoVerifiedAttrs.builder()

  /**
   * @param email Whether the email address of the user should be auto verified at sign up.
   * Note: If both `email` and `phone` is set, Cognito only verifies the phone number. To also
   * verify email, see here -
   * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html
   */
  public fun email(email: Boolean) {
    cdkBuilder.email(email)
  }

  /**
   * @param phone Whether the phone number of the user should be auto verified at sign up.
   */
  public fun phone(phone: Boolean) {
    cdkBuilder.phone(phone)
  }

  public fun build(): AutoVerifiedAttrs = cdkBuilder.build()
}
