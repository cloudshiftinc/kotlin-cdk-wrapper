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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.ResourceServerScope
import software.amazon.awscdk.services.cognito.UserPoolResourceServerOptions

/**
 * Options to create a UserPoolResourceServer.
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
public class UserPoolResourceServerOptionsDsl {
    private val cdkBuilder: UserPoolResourceServerOptions.Builder =
        UserPoolResourceServerOptions.builder()

    private val _scopes: MutableList<ResourceServerScope> = mutableListOf()

    /** @param identifier A unique resource server identifier for the resource server. */
    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    /** @param scopes Oauth scopes. */
    public fun scopes(scopes: ResourceServerScopeDsl.() -> Unit) {
        _scopes.add(ResourceServerScopeDsl().apply(scopes).build())
    }

    /** @param scopes Oauth scopes. */
    public fun scopes(scopes: Collection<ResourceServerScope>) {
        _scopes.addAll(scopes)
    }

    /** @param userPoolResourceServerName A friendly name for the resource server. */
    public fun userPoolResourceServerName(userPoolResourceServerName: String) {
        cdkBuilder.userPoolResourceServerName(userPoolResourceServerName)
    }

    public fun build(): UserPoolResourceServerOptions {
        if (_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
        return cdkBuilder.build()
    }
}
