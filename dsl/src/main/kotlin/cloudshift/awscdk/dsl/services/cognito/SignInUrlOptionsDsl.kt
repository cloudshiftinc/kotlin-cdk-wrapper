@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.cognito.SignInUrlOptions

@CdkDslMarker
public class SignInUrlOptionsDsl {
  private val cdkBuilder: SignInUrlOptions.Builder = SignInUrlOptions.builder()

  public fun fips(fips: Boolean) {
    cdkBuilder.fips(fips)
  }

  public fun redirectUri(redirectUri: String) {
    cdkBuilder.redirectUri(redirectUri)
  }

  public fun signInPath(signInPath: String) {
    cdkBuilder.signInPath(signInPath)
  }

  public fun build(): SignInUrlOptions = cdkBuilder.build()
}
