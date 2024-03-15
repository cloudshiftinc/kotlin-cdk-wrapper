@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * OAuth settings to configure the interaction between the app and this client.
 *
 * Example:
 *
 * ```
 * UserPool pool = new UserPool(this, "Pool");
 * ResourceServerScope readOnlyScope =
 * ResourceServerScope.Builder.create().scopeName("read").scopeDescription("Read-only access").build();
 * ResourceServerScope fullAccessScope =
 * ResourceServerScope.Builder.create().scopeName("*").scopeDescription("Full access").build();
 * UserPoolResourceServer userServer = pool.addResourceServer("ResourceServer",
 * UserPoolResourceServerOptions.builder()
 * .identifier("users")
 * .scopes(List.of(readOnlyScope, fullAccessScope))
 * .build());
 * UserPoolClient readOnlyClient = pool.addClient("read-only-client",
 * UserPoolClientOptions.builder()
 * // ...
 * .oAuth(OAuthSettings.builder()
 * // ...
 * .scopes(List.of(OAuthScope.resourceServer(userServer, readOnlyScope)))
 * .build())
 * .build());
 * UserPoolClient fullAccessClient = pool.addClient("full-access-client",
 * UserPoolClientOptions.builder()
 * // ...
 * .oAuth(OAuthSettings.builder()
 * // ...
 * .scopes(List.of(OAuthScope.resourceServer(userServer, fullAccessScope)))
 * .build())
 * .build());
 * ```
 */
public interface OAuthSettings {
  /**
   * List of allowed redirect URLs for the identity providers.
   *
   * Default: - ['https://example.com'] if either authorizationCodeGrant or implicitCodeGrant flows
   * are enabled, no callback URLs otherwise.
   */
  public fun callbackUrls(): List<String> = unwrap(this).getCallbackUrls() ?: emptyList()

  /**
   * OAuth flows that are allowed with this client.
   *
   * Default: {authorizationCodeGrant:true,implicitCodeGrant:true}
   *
   * [Documentation]( - the 'Allowed OAuth Flows' section at
   * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-app-idp-settings.html)
   */
  public fun flows(): OAuthFlows? = unwrap(this).getFlows()?.let(OAuthFlows::wrap)

  /**
   * List of allowed logout URLs for the identity providers.
   *
   * Default: - no logout URLs
   */
  public fun logoutUrls(): List<String> = unwrap(this).getLogoutUrls() ?: emptyList()

  /**
   * OAuth scopes that are allowed with this client.
   *
   * Default:
   * [OAuthScope.PHONE,OAuthScope.EMAIL,OAuthScope.OPENID,OAuthScope.PROFILE,OAuthScope.COGNITO_ADMIN]
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-app-idp-settings.html)
   */
  public fun scopes(): List<OAuthScope> = unwrap(this).getScopes()?.map(OAuthScope::wrap) ?:
      emptyList()

  /**
   * A builder for [OAuthSettings]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param callbackUrls List of allowed redirect URLs for the identity providers.
     */
    public fun callbackUrls(callbackUrls: List<String>)

    /**
     * @param callbackUrls List of allowed redirect URLs for the identity providers.
     */
    public fun callbackUrls(vararg callbackUrls: String)

    /**
     * @param flows OAuth flows that are allowed with this client.
     */
    public fun flows(flows: OAuthFlows)

    /**
     * @param flows OAuth flows that are allowed with this client.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb93ec242576c1797aed90a7fd0d4beb2c24332026aa722bda799a62aa9f77fd")
    public fun flows(flows: OAuthFlows.Builder.() -> Unit)

    /**
     * @param logoutUrls List of allowed logout URLs for the identity providers.
     */
    public fun logoutUrls(logoutUrls: List<String>)

    /**
     * @param logoutUrls List of allowed logout URLs for the identity providers.
     */
    public fun logoutUrls(vararg logoutUrls: String)

    /**
     * @param scopes OAuth scopes that are allowed with this client.
     */
    public fun scopes(scopes: List<OAuthScope>)

    /**
     * @param scopes OAuth scopes that are allowed with this client.
     */
    public fun scopes(vararg scopes: OAuthScope)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.OAuthSettings.Builder =
        software.amazon.awscdk.services.cognito.OAuthSettings.builder()

    /**
     * @param callbackUrls List of allowed redirect URLs for the identity providers.
     */
    override fun callbackUrls(callbackUrls: List<String>) {
      cdkBuilder.callbackUrls(callbackUrls)
    }

    /**
     * @param callbackUrls List of allowed redirect URLs for the identity providers.
     */
    override fun callbackUrls(vararg callbackUrls: String): Unit =
        callbackUrls(callbackUrls.toList())

    /**
     * @param flows OAuth flows that are allowed with this client.
     */
    override fun flows(flows: OAuthFlows) {
      cdkBuilder.flows(flows.let(OAuthFlows::unwrap))
    }

    /**
     * @param flows OAuth flows that are allowed with this client.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb93ec242576c1797aed90a7fd0d4beb2c24332026aa722bda799a62aa9f77fd")
    override fun flows(flows: OAuthFlows.Builder.() -> Unit): Unit = flows(OAuthFlows(flows))

    /**
     * @param logoutUrls List of allowed logout URLs for the identity providers.
     */
    override fun logoutUrls(logoutUrls: List<String>) {
      cdkBuilder.logoutUrls(logoutUrls)
    }

    /**
     * @param logoutUrls List of allowed logout URLs for the identity providers.
     */
    override fun logoutUrls(vararg logoutUrls: String): Unit = logoutUrls(logoutUrls.toList())

    /**
     * @param scopes OAuth scopes that are allowed with this client.
     */
    override fun scopes(scopes: List<OAuthScope>) {
      cdkBuilder.scopes(scopes.map(OAuthScope::unwrap))
    }

    /**
     * @param scopes OAuth scopes that are allowed with this client.
     */
    override fun scopes(vararg scopes: OAuthScope): Unit = scopes(scopes.toList())

    public fun build(): software.amazon.awscdk.services.cognito.OAuthSettings = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.OAuthSettings,
  ) : CdkObject(cdkObject), OAuthSettings {
    /**
     * List of allowed redirect URLs for the identity providers.
     *
     * Default: - ['https://example.com'] if either authorizationCodeGrant or implicitCodeGrant
     * flows are enabled, no callback URLs otherwise.
     */
    override fun callbackUrls(): List<String> = unwrap(this).getCallbackUrls() ?: emptyList()

    /**
     * OAuth flows that are allowed with this client.
     *
     * Default: {authorizationCodeGrant:true,implicitCodeGrant:true}
     *
     * [Documentation]( - the 'Allowed OAuth Flows' section at
     * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-app-idp-settings.html)
     */
    override fun flows(): OAuthFlows? = unwrap(this).getFlows()?.let(OAuthFlows::wrap)

    /**
     * List of allowed logout URLs for the identity providers.
     *
     * Default: - no logout URLs
     */
    override fun logoutUrls(): List<String> = unwrap(this).getLogoutUrls() ?: emptyList()

    /**
     * OAuth scopes that are allowed with this client.
     *
     * Default:
     * [OAuthScope.PHONE,OAuthScope.EMAIL,OAuthScope.OPENID,OAuthScope.PROFILE,OAuthScope.COGNITO_ADMIN]
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-app-idp-settings.html)
     */
    override fun scopes(): List<OAuthScope> = unwrap(this).getScopes()?.map(OAuthScope::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OAuthSettings {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.OAuthSettings):
        OAuthSettings = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OAuthSettings):
        software.amazon.awscdk.services.cognito.OAuthSettings = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.OAuthSettings
  }
}
