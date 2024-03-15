@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * OpenID Connect endpoints.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * OidcEndpoints oidcEndpoints = OidcEndpoints.builder()
 * .authorization("authorization")
 * .jwksUri("jwksUri")
 * .token("token")
 * .userInfo("userInfo")
 * .build();
 * ```
 */
public interface OidcEndpoints {
  /**
   * Authorization endpoint.
   */
  public fun authorization(): String

  /**
   * Jwks_uri endpoint.
   */
  public fun jwksUri(): String

  /**
   * Token endpoint.
   */
  public fun token(): String

  /**
   * UserInfo endpoint.
   */
  public fun userInfo(): String

  /**
   * A builder for [OidcEndpoints]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorization Authorization endpoint. 
     */
    public fun authorization(authorization: String)

    /**
     * @param jwksUri Jwks_uri endpoint. 
     */
    public fun jwksUri(jwksUri: String)

    /**
     * @param token Token endpoint. 
     */
    public fun token(token: String)

    /**
     * @param userInfo UserInfo endpoint. 
     */
    public fun userInfo(userInfo: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.OidcEndpoints.Builder =
        software.amazon.awscdk.services.cognito.OidcEndpoints.builder()

    /**
     * @param authorization Authorization endpoint. 
     */
    override fun authorization(authorization: String) {
      cdkBuilder.authorization(authorization)
    }

    /**
     * @param jwksUri Jwks_uri endpoint. 
     */
    override fun jwksUri(jwksUri: String) {
      cdkBuilder.jwksUri(jwksUri)
    }

    /**
     * @param token Token endpoint. 
     */
    override fun token(token: String) {
      cdkBuilder.token(token)
    }

    /**
     * @param userInfo UserInfo endpoint. 
     */
    override fun userInfo(userInfo: String) {
      cdkBuilder.userInfo(userInfo)
    }

    public fun build(): software.amazon.awscdk.services.cognito.OidcEndpoints = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.OidcEndpoints,
  ) : CdkObject(cdkObject), OidcEndpoints {
    /**
     * Authorization endpoint.
     */
    override fun authorization(): String = unwrap(this).getAuthorization()

    /**
     * Jwks_uri endpoint.
     */
    override fun jwksUri(): String = unwrap(this).getJwksUri()

    /**
     * Token endpoint.
     */
    override fun token(): String = unwrap(this).getToken()

    /**
     * UserInfo endpoint.
     */
    override fun userInfo(): String = unwrap(this).getUserInfo()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OidcEndpoints {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.OidcEndpoints):
        OidcEndpoints = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OidcEndpoints):
        software.amazon.awscdk.services.cognito.OidcEndpoints = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.OidcEndpoints
  }
}
