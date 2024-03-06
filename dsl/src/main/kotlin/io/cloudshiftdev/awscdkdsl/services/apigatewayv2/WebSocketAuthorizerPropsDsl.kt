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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigatewayv2.IWebSocketApi
import software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerProps
import software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerType

/**
 * Properties to initialize an instance of `WebSocketAuthorizer`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * WebSocketApi webSocketApi;
 * WebSocketAuthorizerProps webSocketAuthorizerProps = WebSocketAuthorizerProps.builder()
 * .identitySource(List.of("identitySource"))
 * .type(WebSocketAuthorizerType.LAMBDA)
 * .webSocketApi(webSocketApi)
 * // the properties below are optional
 * .authorizerName("authorizerName")
 * .authorizerUri("authorizerUri")
 * .build();
 * ```
 */
@CdkDslMarker
public class WebSocketAuthorizerPropsDsl {
    private val cdkBuilder: WebSocketAuthorizerProps.Builder = WebSocketAuthorizerProps.builder()

    private val _identitySource: MutableList<String> = mutableListOf()

    /** @param authorizerName Name of the authorizer. */
    public fun authorizerName(authorizerName: String) {
        cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * @param authorizerUri The authorizer's Uniform Resource Identifier (URI). For REQUEST
     *   authorizers, this must be a well-formed Lambda function URI.
     */
    public fun authorizerUri(authorizerUri: String) {
        cdkBuilder.authorizerUri(authorizerUri)
    }

    /** @param identitySource The identity source for which authorization is requested. */
    public fun identitySource(vararg identitySource: String) {
        _identitySource.addAll(listOf(*identitySource))
    }

    /** @param identitySource The identity source for which authorization is requested. */
    public fun identitySource(identitySource: Collection<String>) {
        _identitySource.addAll(identitySource)
    }

    /** @param type The type of authorizer. */
    public fun type(type: WebSocketAuthorizerType) {
        cdkBuilder.type(type)
    }

    /** @param webSocketApi WebSocket Api to attach the authorizer to. */
    public fun webSocketApi(webSocketApi: IWebSocketApi) {
        cdkBuilder.webSocketApi(webSocketApi)
    }

    public fun build(): WebSocketAuthorizerProps {
        if (_identitySource.isNotEmpty()) cdkBuilder.identitySource(_identitySource)
        return cdkBuilder.build()
    }
}
