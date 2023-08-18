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
import software.amazon.awscdk.services.cognito.OAuthFlows
import software.amazon.awscdk.services.cognito.OAuthScope
import software.amazon.awscdk.services.cognito.OAuthSettings

/**
 * OAuth settings to configure the interaction between the app and this client.
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
public class OAuthSettingsDsl {
    private val cdkBuilder: OAuthSettings.Builder = OAuthSettings.builder()

    private val _callbackUrls: MutableList<String> = mutableListOf()

    private val _logoutUrls: MutableList<String> = mutableListOf()

    private val _scopes: MutableList<OAuthScope> = mutableListOf()

    /** @param callbackUrls List of allowed redirect URLs for the identity providers. */
    public fun callbackUrls(vararg callbackUrls: String) {
        _callbackUrls.addAll(listOf(*callbackUrls))
    }

    /** @param callbackUrls List of allowed redirect URLs for the identity providers. */
    public fun callbackUrls(callbackUrls: Collection<String>) {
        _callbackUrls.addAll(callbackUrls)
    }

    /** @param flows OAuth flows that are allowed with this client. */
    public fun flows(flows: OAuthFlowsDsl.() -> Unit = {}) {
        val builder = OAuthFlowsDsl()
        builder.apply(flows)
        cdkBuilder.flows(builder.build())
    }

    /** @param flows OAuth flows that are allowed with this client. */
    public fun flows(flows: OAuthFlows) {
        cdkBuilder.flows(flows)
    }

    /** @param logoutUrls List of allowed logout URLs for the identity providers. */
    public fun logoutUrls(vararg logoutUrls: String) {
        _logoutUrls.addAll(listOf(*logoutUrls))
    }

    /** @param logoutUrls List of allowed logout URLs for the identity providers. */
    public fun logoutUrls(logoutUrls: Collection<String>) {
        _logoutUrls.addAll(logoutUrls)
    }

    /** @param scopes OAuth scopes that are allowed with this client. */
    public fun scopes(vararg scopes: OAuthScope) {
        _scopes.addAll(listOf(*scopes))
    }

    /** @param scopes OAuth scopes that are allowed with this client. */
    public fun scopes(scopes: Collection<OAuthScope>) {
        _scopes.addAll(scopes)
    }

    public fun build(): OAuthSettings {
        if (_callbackUrls.isNotEmpty()) cdkBuilder.callbackUrls(_callbackUrls)
        if (_logoutUrls.isNotEmpty()) cdkBuilder.logoutUrls(_logoutUrls)
        if (_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
        return cdkBuilder.build()
    }
}
