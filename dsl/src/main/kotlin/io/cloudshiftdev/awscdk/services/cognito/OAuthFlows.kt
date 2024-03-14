package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.OAuthFlows,
  ) : OAuthFlows {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): OAuthFlows {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.OAuthFlows): OAuthFlows =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: OAuthFlows): software.amazon.awscdk.services.cognito.OAuthFlows =
        (wrapped as Wrapper).cdkObject
  }
}
