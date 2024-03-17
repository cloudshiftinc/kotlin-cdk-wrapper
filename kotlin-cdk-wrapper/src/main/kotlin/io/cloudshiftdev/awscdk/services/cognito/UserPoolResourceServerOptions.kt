@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options to create a UserPoolResourceServer.
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
public interface UserPoolResourceServerOptions {
  /**
   * A unique resource server identifier for the resource server.
   */
  public fun identifier(): String

  /**
   * Oauth scopes.
   *
   * Default: - No scopes will be added
   */
  public fun scopes(): List<ResourceServerScope> =
      unwrap(this).getScopes()?.map(ResourceServerScope::wrap) ?: emptyList()

  /**
   * A friendly name for the resource server.
   *
   * Default: - same as `identifier`
   */
  public fun userPoolResourceServerName(): String? = unwrap(this).getUserPoolResourceServerName()

  /**
   * A builder for [UserPoolResourceServerOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param identifier A unique resource server identifier for the resource server. 
     */
    public fun identifier(identifier: String)

    /**
     * @param scopes Oauth scopes.
     */
    public fun scopes(scopes: List<ResourceServerScope>)

    /**
     * @param scopes Oauth scopes.
     */
    public fun scopes(vararg scopes: ResourceServerScope)

    /**
     * @param userPoolResourceServerName A friendly name for the resource server.
     */
    public fun userPoolResourceServerName(userPoolResourceServerName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolResourceServerOptions.Builder =
        software.amazon.awscdk.services.cognito.UserPoolResourceServerOptions.builder()

    /**
     * @param identifier A unique resource server identifier for the resource server. 
     */
    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    /**
     * @param scopes Oauth scopes.
     */
    override fun scopes(scopes: List<ResourceServerScope>) {
      cdkBuilder.scopes(scopes.map(ResourceServerScope::unwrap))
    }

    /**
     * @param scopes Oauth scopes.
     */
    override fun scopes(vararg scopes: ResourceServerScope): Unit = scopes(scopes.toList())

    /**
     * @param userPoolResourceServerName A friendly name for the resource server.
     */
    override fun userPoolResourceServerName(userPoolResourceServerName: String) {
      cdkBuilder.userPoolResourceServerName(userPoolResourceServerName)
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolResourceServerOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.UserPoolResourceServerOptions,
  ) : CdkObject(cdkObject), UserPoolResourceServerOptions {
    /**
     * A unique resource server identifier for the resource server.
     */
    override fun identifier(): String = unwrap(this).getIdentifier()

    /**
     * Oauth scopes.
     *
     * Default: - No scopes will be added
     */
    override fun scopes(): List<ResourceServerScope> =
        unwrap(this).getScopes()?.map(ResourceServerScope::wrap) ?: emptyList()

    /**
     * A friendly name for the resource server.
     *
     * Default: - same as `identifier`
     */
    override fun userPoolResourceServerName(): String? =
        unwrap(this).getUserPoolResourceServerName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolResourceServerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolResourceServerOptions):
        UserPoolResourceServerOptions = CdkObjectWrappers.wrap(cdkObject) as?
        UserPoolResourceServerOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolResourceServerOptions):
        software.amazon.awscdk.services.cognito.UserPoolResourceServerOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolResourceServerOptions
  }
}
