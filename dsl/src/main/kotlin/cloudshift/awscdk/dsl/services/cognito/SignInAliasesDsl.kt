@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.SignInAliases

@CdkDslMarker
public class SignInAliasesDsl {
  private val cdkBuilder: SignInAliases.Builder = SignInAliases.builder()

  public fun email(email: Boolean) {
    cdkBuilder.email(email)
  }

  public fun phone(phone: Boolean) {
    cdkBuilder.phone(phone)
  }

  public fun preferredUsername(preferredUsername: Boolean) {
    cdkBuilder.preferredUsername(preferredUsername)
  }

  public fun username(username: Boolean) {
    cdkBuilder.username(username)
  }

  public fun build(): SignInAliases = cdkBuilder.build()
}
