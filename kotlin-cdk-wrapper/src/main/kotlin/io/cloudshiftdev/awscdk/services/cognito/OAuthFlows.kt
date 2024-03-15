@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

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
public interface OAuthFlows {
  /**
   * Initiate an authorization code grant flow, which provides an authorization code as the
   * response.
   *
   * Default: false
   */
  public fun authorizationCodeGrant(): Boolean? = unwrap(this).getAuthorizationCodeGrant()

  /**
   * Client should get the access token and ID token from the token endpoint using a combination of
   * client and client_secret.
   *
   * Default: false
   */
  public fun clientCredentials(): Boolean? = unwrap(this).getClientCredentials()

  /**
   * The client should get the access token and ID token directly.
   *
   * Default: false
   */
  public fun implicitCodeGrant(): Boolean? = unwrap(this).getImplicitCodeGrant()

  /**
   * A builder for [OAuthFlows]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizationCodeGrant Initiate an authorization code grant flow, which provides an
     * authorization code as the response.
     */
    public fun authorizationCodeGrant(authorizationCodeGrant: Boolean)

    /**
     * @param clientCredentials Client should get the access token and ID token from the token
     * endpoint using a combination of client and client_secret.
     */
    public fun clientCredentials(clientCredentials: Boolean)

    /**
     * @param implicitCodeGrant The client should get the access token and ID token directly.
     */
    public fun implicitCodeGrant(implicitCodeGrant: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.OAuthFlows.Builder =
        software.amazon.awscdk.services.cognito.OAuthFlows.builder()

    /**
     * @param authorizationCodeGrant Initiate an authorization code grant flow, which provides an
     * authorization code as the response.
     */
    override fun authorizationCodeGrant(authorizationCodeGrant: Boolean) {
      cdkBuilder.authorizationCodeGrant(authorizationCodeGrant)
    }

    /**
     * @param clientCredentials Client should get the access token and ID token from the token
     * endpoint using a combination of client and client_secret.
     */
    override fun clientCredentials(clientCredentials: Boolean) {
      cdkBuilder.clientCredentials(clientCredentials)
    }

    /**
     * @param implicitCodeGrant The client should get the access token and ID token directly.
     */
    override fun implicitCodeGrant(implicitCodeGrant: Boolean) {
      cdkBuilder.implicitCodeGrant(implicitCodeGrant)
    }

    public fun build(): software.amazon.awscdk.services.cognito.OAuthFlows = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.OAuthFlows,
  ) : CdkObject(cdkObject), OAuthFlows {
    /**
     * Initiate an authorization code grant flow, which provides an authorization code as the
     * response.
     *
     * Default: false
     */
    override fun authorizationCodeGrant(): Boolean? = unwrap(this).getAuthorizationCodeGrant()

    /**
     * Client should get the access token and ID token from the token endpoint using a combination
     * of client and client_secret.
     *
     * Default: false
     */
    override fun clientCredentials(): Boolean? = unwrap(this).getClientCredentials()

    /**
     * The client should get the access token and ID token directly.
     *
     * Default: false
     */
    override fun implicitCodeGrant(): Boolean? = unwrap(this).getImplicitCodeGrant()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OAuthFlows {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.OAuthFlows): OAuthFlows =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: OAuthFlows): software.amazon.awscdk.services.cognito.OAuthFlows =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cognito.OAuthFlows
  }
}
