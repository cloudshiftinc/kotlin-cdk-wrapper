@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.ResourceServerScope
import software.amazon.awscdk.services.cognito.UserPoolResourceServer
import software.constructs.Construct

/**
 * Defines a User Pool OAuth2.0 Resource Server.
 *
 * Example:
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
@CdkDslMarker
public class UserPoolResourceServerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: UserPoolResourceServer.Builder =
        UserPoolResourceServer.Builder.create(scope, id)

    private val _scopes: MutableList<ResourceServerScope> = mutableListOf()

    /**
     * A unique resource server identifier for the resource server.
     *
     * @param identifier A unique resource server identifier for the resource server.
     */
    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    /**
     * Oauth scopes.
     *
     * Default: - No scopes will be added
     *
     * @param scopes Oauth scopes.
     */
    public fun scopes(scopes: ResourceServerScopeDsl.() -> Unit) {
        _scopes.add(ResourceServerScopeDsl().apply(scopes).build())
    }

    /**
     * Oauth scopes.
     *
     * Default: - No scopes will be added
     *
     * @param scopes Oauth scopes.
     */
    public fun scopes(scopes: Collection<ResourceServerScope>) {
        _scopes.addAll(scopes)
    }

    /**
     * The user pool to add this resource server to.
     *
     * @param userPool The user pool to add this resource server to.
     */
    public fun userPool(userPool: IUserPool) {
        cdkBuilder.userPool(userPool)
    }

    /**
     * A friendly name for the resource server.
     *
     * Default: - same as `identifier`
     *
     * @param userPoolResourceServerName A friendly name for the resource server.
     */
    public fun userPoolResourceServerName(userPoolResourceServerName: String) {
        cdkBuilder.userPoolResourceServerName(userPoolResourceServerName)
    }

    public fun build(): UserPoolResourceServer {
        if (_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
        return cdkBuilder.build()
    }
}
