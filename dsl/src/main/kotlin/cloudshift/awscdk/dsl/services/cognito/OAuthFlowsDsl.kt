@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.OAuthFlows

/**
 * Types of OAuth grant flows.
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
 *
 * [Documentation]( - the 'Allowed OAuth Flows' section at
 * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-app-idp-settings.html)
 */
@CdkDslMarker
public class OAuthFlowsDsl {
  private val cdkBuilder: OAuthFlows.Builder = OAuthFlows.builder()

  /**
   * @param authorizationCodeGrant Initiate an authorization code grant flow, which provides an
   * authorization code as the response.
   */
  public fun authorizationCodeGrant(authorizationCodeGrant: Boolean) {
    cdkBuilder.authorizationCodeGrant(authorizationCodeGrant)
  }

  /**
   * @param clientCredentials Client should get the access token and ID token from the token
   * endpoint using a combination of client and client_secret.
   */
  public fun clientCredentials(clientCredentials: Boolean) {
    cdkBuilder.clientCredentials(clientCredentials)
  }

  /**
   * @param implicitCodeGrant The client should get the access token and ID token directly.
   */
  public fun implicitCodeGrant(implicitCodeGrant: Boolean) {
    cdkBuilder.implicitCodeGrant(implicitCodeGrant)
  }

  public fun build(): OAuthFlows = cdkBuilder.build()
}
