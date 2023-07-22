@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.SignInAliases

@CdkDslMarker
public class SignInAliasesDsl {
  private val cdkBuilder: SignInAliases.Builder = SignInAliases.builder()

  /**
   * @param email Whether a user is allowed to sign up or sign in with an email address.
   */
  public fun email(email: Boolean) {
    cdkBuilder.email(email)
  }

  /**
   * @param phone Whether a user is allowed to sign up or sign in with a phone number.
   */
  public fun phone(phone: Boolean) {
    cdkBuilder.phone(phone)
  }

  /**
   * @param preferredUsername Whether a user is allowed to sign in with a secondary username, that
   * can be set and modified after sign up.
   * Can only be used in conjunction with `USERNAME`.
   */
  public fun preferredUsername(preferredUsername: Boolean) {
    cdkBuilder.preferredUsername(preferredUsername)
  }

  /**
   * @param username Whether user is allowed to sign up or sign in with a username.
   */
  public fun username(username: Boolean) {
    cdkBuilder.username(username)
  }

  public fun build(): SignInAliases = cdkBuilder.build()
}
