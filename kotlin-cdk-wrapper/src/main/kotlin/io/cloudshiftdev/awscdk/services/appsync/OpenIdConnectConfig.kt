@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Configuration for OpenID Connect authorization in AppSync.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * OpenIdConnectConfig openIdConnectConfig = OpenIdConnectConfig.builder()
 * .oidcProvider("oidcProvider")
 * // the properties below are optional
 * .clientId("clientId")
 * .tokenExpiryFromAuth(123)
 * .tokenExpiryFromIssue(123)
 * .build();
 * ```
 */
public interface OpenIdConnectConfig {
  /**
   * The client identifier of the Relying party at the OpenID identity provider.
   *
   * A regular expression can be specified so AppSync can validate against multiple client
   * identifiers at a time.
   *
   * Default: - * (All)
   *
   * Example:
   *
   * ```
   * -"ABCD|CDEF";
   * ```
   */
  public fun clientId(): String? = unwrap(this).getClientId()

  /**
   * The issuer for the OIDC configuration.
   *
   * The issuer returned by discovery must exactly match the value of `iss` in the OIDC token.
   */
  public fun oidcProvider(): String

  /**
   * The number of milliseconds an OIDC token is valid after being authenticated by OIDC provider.
   *
   * `auth_time` claim in OIDC token is required for this validation to work.
   *
   * Default: - no validation
   */
  public fun tokenExpiryFromAuth(): Number? = unwrap(this).getTokenExpiryFromAuth()

  /**
   * The number of milliseconds an OIDC token is valid after being issued to a user.
   *
   * This validation uses `iat` claim of OIDC token.
   *
   * Default: - no validation
   */
  public fun tokenExpiryFromIssue(): Number? = unwrap(this).getTokenExpiryFromIssue()

  /**
   * A builder for [OpenIdConnectConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientId The client identifier of the Relying party at the OpenID identity provider.
     * A regular expression can be specified so AppSync can validate against multiple client
     * identifiers at a time.
     */
    public fun clientId(clientId: String)

    /**
     * @param oidcProvider The issuer for the OIDC configuration. 
     * The issuer returned by discovery must exactly match the value of `iss` in the OIDC token.
     */
    public fun oidcProvider(oidcProvider: String)

    /**
     * @param tokenExpiryFromAuth The number of milliseconds an OIDC token is valid after being
     * authenticated by OIDC provider.
     * `auth_time` claim in OIDC token is required for this validation to work.
     */
    public fun tokenExpiryFromAuth(tokenExpiryFromAuth: Number)

    /**
     * @param tokenExpiryFromIssue The number of milliseconds an OIDC token is valid after being
     * issued to a user.
     * This validation uses `iat` claim of OIDC token.
     */
    public fun tokenExpiryFromIssue(tokenExpiryFromIssue: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.OpenIdConnectConfig.Builder =
        software.amazon.awscdk.services.appsync.OpenIdConnectConfig.builder()

    /**
     * @param clientId The client identifier of the Relying party at the OpenID identity provider.
     * A regular expression can be specified so AppSync can validate against multiple client
     * identifiers at a time.
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * @param oidcProvider The issuer for the OIDC configuration. 
     * The issuer returned by discovery must exactly match the value of `iss` in the OIDC token.
     */
    override fun oidcProvider(oidcProvider: String) {
      cdkBuilder.oidcProvider(oidcProvider)
    }

    /**
     * @param tokenExpiryFromAuth The number of milliseconds an OIDC token is valid after being
     * authenticated by OIDC provider.
     * `auth_time` claim in OIDC token is required for this validation to work.
     */
    override fun tokenExpiryFromAuth(tokenExpiryFromAuth: Number) {
      cdkBuilder.tokenExpiryFromAuth(tokenExpiryFromAuth)
    }

    /**
     * @param tokenExpiryFromIssue The number of milliseconds an OIDC token is valid after being
     * issued to a user.
     * This validation uses `iat` claim of OIDC token.
     */
    override fun tokenExpiryFromIssue(tokenExpiryFromIssue: Number) {
      cdkBuilder.tokenExpiryFromIssue(tokenExpiryFromIssue)
    }

    public fun build(): software.amazon.awscdk.services.appsync.OpenIdConnectConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.OpenIdConnectConfig,
  ) : CdkObject(cdkObject),
      OpenIdConnectConfig {
    /**
     * The client identifier of the Relying party at the OpenID identity provider.
     *
     * A regular expression can be specified so AppSync can validate against multiple client
     * identifiers at a time.
     *
     * Default: - * (All)
     *
     * Example:
     *
     * ```
     * -"ABCD|CDEF";
     * ```
     */
    override fun clientId(): String? = unwrap(this).getClientId()

    /**
     * The issuer for the OIDC configuration.
     *
     * The issuer returned by discovery must exactly match the value of `iss` in the OIDC token.
     */
    override fun oidcProvider(): String = unwrap(this).getOidcProvider()

    /**
     * The number of milliseconds an OIDC token is valid after being authenticated by OIDC provider.
     *
     * `auth_time` claim in OIDC token is required for this validation to work.
     *
     * Default: - no validation
     */
    override fun tokenExpiryFromAuth(): Number? = unwrap(this).getTokenExpiryFromAuth()

    /**
     * The number of milliseconds an OIDC token is valid after being issued to a user.
     *
     * This validation uses `iat` claim of OIDC token.
     *
     * Default: - no validation
     */
    override fun tokenExpiryFromIssue(): Number? = unwrap(this).getTokenExpiryFromIssue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OpenIdConnectConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.OpenIdConnectConfig):
        OpenIdConnectConfig = CdkObjectWrappers.wrap(cdkObject) as? OpenIdConnectConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: OpenIdConnectConfig):
        software.amazon.awscdk.services.appsync.OpenIdConnectConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.OpenIdConnectConfig
  }
}
