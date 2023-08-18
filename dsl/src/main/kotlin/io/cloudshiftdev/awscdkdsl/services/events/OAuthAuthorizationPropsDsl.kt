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

package io.cloudshiftdev.awscdkdsl.services.events

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.events.HttpMethod
import software.amazon.awscdk.services.events.HttpParameter
import software.amazon.awscdk.services.events.OAuthAuthorizationProps

/**
 * Properties for `Authorization.oauth()`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.events.*;
 * HttpParameter httpParameter;
 * SecretValue secretValue;
 * OAuthAuthorizationProps oAuthAuthorizationProps = OAuthAuthorizationProps.builder()
 * .authorizationEndpoint("authorizationEndpoint")
 * .clientId("clientId")
 * .clientSecret(secretValue)
 * .httpMethod(HttpMethod.POST)
 * // the properties below are optional
 * .bodyParameters(Map.of(
 * "bodyParametersKey", httpParameter))
 * .headerParameters(Map.of(
 * "headerParametersKey", httpParameter))
 * .queryStringParameters(Map.of(
 * "queryStringParametersKey", httpParameter))
 * .build();
 * ```
 */
@CdkDslMarker
public class OAuthAuthorizationPropsDsl {
    private val cdkBuilder: OAuthAuthorizationProps.Builder = OAuthAuthorizationProps.builder()

    /** @param authorizationEndpoint The URL to the authorization endpoint. */
    public fun authorizationEndpoint(authorizationEndpoint: String) {
        cdkBuilder.authorizationEndpoint(authorizationEndpoint)
    }

    /** @param bodyParameters Additional string parameters to add to the OAuth request body. */
    public fun bodyParameters(bodyParameters: Map<String, HttpParameter>) {
        cdkBuilder.bodyParameters(bodyParameters)
    }

    /** @param clientId The client ID to use for OAuth authorization for the connection. */
    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    /**
     * @param clientSecret The client secret associated with the client ID to use for OAuth
     *   authorization for the connection.
     */
    public fun clientSecret(clientSecret: SecretValue) {
        cdkBuilder.clientSecret(clientSecret)
    }

    /** @param headerParameters Additional string parameters to add to the OAuth request header. */
    public fun headerParameters(headerParameters: Map<String, HttpParameter>) {
        cdkBuilder.headerParameters(headerParameters)
    }

    /**
     * @param httpMethod The method to use for the authorization request. (Can only choose POST, GET
     *   or PUT).
     */
    public fun httpMethod(httpMethod: HttpMethod) {
        cdkBuilder.httpMethod(httpMethod)
    }

    /**
     * @param queryStringParameters Additional string parameters to add to the OAuth request query
     *   string.
     */
    public fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>) {
        cdkBuilder.queryStringParameters(queryStringParameters)
    }

    public fun build(): OAuthAuthorizationProps = cdkBuilder.build()
}
