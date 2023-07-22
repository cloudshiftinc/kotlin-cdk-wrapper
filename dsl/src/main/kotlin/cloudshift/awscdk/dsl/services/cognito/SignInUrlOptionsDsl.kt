@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.cognito.SignInUrlOptions

/**
 * Options to customize the behaviour of `signInUrl()`.
 *
 * Example:
 *
 * ```
 * UserPool userpool = UserPool.Builder.create(this, "UserPool").build();
 * UserPoolClient client = userpool.addClient("Client", UserPoolClientOptions.builder()
 * // ...
 * .oAuth(OAuthSettings.builder()
 * .flows(OAuthFlows.builder()
 * .implicitCodeGrant(true)
 * .build())
 * .callbackUrls(List.of("https://myapp.com/home", "https://myapp.com/users"))
 * .build())
 * .build());
 * UserPoolDomain domain = userpool.addDomain("Domain", UserPoolDomainOptions.builder().build());
 * String signInUrl = domain.signInUrl(client, SignInUrlOptions.builder()
 * .redirectUri("https://myapp.com/home")
 * .build());
 * ```
 */
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
