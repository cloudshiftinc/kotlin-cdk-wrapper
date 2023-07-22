@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.cognito.SignInUrlOptions

@CdkDslMarker
public class SignInUrlOptionsDsl {
  private val cdkBuilder: SignInUrlOptions.Builder = SignInUrlOptions.builder()

  /**
   * @param fips Whether to return the FIPS-compliant endpoint.
   */
  public fun fips(fips: Boolean) {
    cdkBuilder.fips(fips)
  }

  /**
   * @param redirectUri Where to redirect to after sign in. 
   */
  public fun redirectUri(redirectUri: String) {
    cdkBuilder.redirectUri(redirectUri)
  }

  /**
   * @param signInPath The path in the URI where the sign-in page is located.
   */
  public fun signInPath(signInPath: String) {
    cdkBuilder.signInPath(signInPath)
  }

  public fun build(): SignInUrlOptions = cdkBuilder.build()
}
