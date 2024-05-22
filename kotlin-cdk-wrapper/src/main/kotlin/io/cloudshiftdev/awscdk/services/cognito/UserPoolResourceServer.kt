@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Defines a User Pool OAuth2.0 Resource Server.
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
public open class UserPoolResourceServer(
  cdkObject: software.amazon.awscdk.services.cognito.UserPoolResourceServer,
) : Resource(cdkObject), IUserPoolResourceServer {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UserPoolResourceServerProps,
  ) :
      this(software.amazon.awscdk.services.cognito.UserPoolResourceServer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(UserPoolResourceServerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UserPoolResourceServerProps.Builder.() -> Unit,
  ) : this(scope, id, UserPoolResourceServerProps(props)
  )

  /**
   * Resource server id.
   */
  public override fun userPoolResourceServerId(): String =
      unwrap(this).getUserPoolResourceServerId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.UserPoolResourceServer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A unique resource server identifier for the resource server.
     *
     * @param identifier A unique resource server identifier for the resource server. 
     */
    public fun identifier(identifier: String)

    /**
     * Oauth scopes.
     *
     * Default: - No scopes will be added
     *
     * @param scopes Oauth scopes. 
     */
    public fun scopes(scopes: List<ResourceServerScope>)

    /**
     * Oauth scopes.
     *
     * Default: - No scopes will be added
     *
     * @param scopes Oauth scopes. 
     */
    public fun scopes(vararg scopes: ResourceServerScope)

    /**
     * The user pool to add this resource server to.
     *
     * @param userPool The user pool to add this resource server to. 
     */
    public fun userPool(userPool: IUserPool)

    /**
     * A friendly name for the resource server.
     *
     * Default: - same as `identifier`
     *
     * @param userPoolResourceServerName A friendly name for the resource server. 
     */
    public fun userPoolResourceServerName(userPoolResourceServerName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolResourceServer.Builder =
        software.amazon.awscdk.services.cognito.UserPoolResourceServer.Builder.create(scope, id)

    /**
     * A unique resource server identifier for the resource server.
     *
     * @param identifier A unique resource server identifier for the resource server. 
     */
    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    /**
     * Oauth scopes.
     *
     * Default: - No scopes will be added
     *
     * @param scopes Oauth scopes. 
     */
    override fun scopes(scopes: List<ResourceServerScope>) {
      cdkBuilder.scopes(scopes.map(ResourceServerScope.Companion::unwrap))
    }

    /**
     * Oauth scopes.
     *
     * Default: - No scopes will be added
     *
     * @param scopes Oauth scopes. 
     */
    override fun scopes(vararg scopes: ResourceServerScope): Unit = scopes(scopes.toList())

    /**
     * The user pool to add this resource server to.
     *
     * @param userPool The user pool to add this resource server to. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool.Companion::unwrap))
    }

    /**
     * A friendly name for the resource server.
     *
     * Default: - same as `identifier`
     *
     * @param userPoolResourceServerName A friendly name for the resource server. 
     */
    override fun userPoolResourceServerName(userPoolResourceServerName: String) {
      cdkBuilder.userPoolResourceServerName(userPoolResourceServerName)
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolResourceServer =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromUserPoolResourceServerId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      userPoolResourceServerId: String,
    ): IUserPoolResourceServer =
        software.amazon.awscdk.services.cognito.UserPoolResourceServer.fromUserPoolResourceServerId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, userPoolResourceServerId).let(IUserPoolResourceServer::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPoolResourceServer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPoolResourceServer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolResourceServer):
        UserPoolResourceServer = UserPoolResourceServer(cdkObject)

    internal fun unwrap(wrapped: UserPoolResourceServer):
        software.amazon.awscdk.services.cognito.UserPoolResourceServer = wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolResourceServer
  }
}
