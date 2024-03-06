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

package io.cloudshiftdev.awscdkdsl.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer
import software.amazon.awscdk.services.lambda.IFunction

/**
 * Authorize WebSocket Api routes via a lambda function.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer;
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration;
 * // This function handles your auth logic
 * Function authHandler;
 * // This function handles your WebSocket requests
 * Function handler;
 * WebSocketLambdaAuthorizer authorizer = new WebSocketLambdaAuthorizer("Authorizer", authHandler);
 * WebSocketLambdaIntegration integration = new WebSocketLambdaIntegration("Integration", handler);
 * WebSocketApi.Builder.create(this, "WebSocketApi")
 * .connectRouteOptions(WebSocketRouteOptions.builder()
 * .integration(integration)
 * .authorizer(authorizer)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class WebSocketLambdaAuthorizerDsl(
    id: String,
    handler: IFunction,
) {
    private val cdkBuilder: WebSocketLambdaAuthorizer.Builder =
        WebSocketLambdaAuthorizer.Builder.create(id, handler)

    private val _identitySource: MutableList<String> = mutableListOf()

    /**
     * The name of the authorizer.
     *
     * Default: - same value as `id` passed in the constructor.
     *
     * @param authorizerName The name of the authorizer.
     */
    public fun authorizerName(authorizerName: String) {
        cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * The identity source for which authorization is requested.
     *
     * Request parameter match `'route.request.querystring|header.[a-zA-z0-9._-]+'`. Staged variable
     * match `'stageVariables.[a-zA-Z0-9._-]+'`. Context parameter match
     * `'context.[a-zA-Z0-9._-]+'`.
     *
     * Default: ['route.request.header.Authorization']
     *
     * @param identitySource The identity source for which authorization is requested.
     */
    public fun identitySource(vararg identitySource: String) {
        _identitySource.addAll(listOf(*identitySource))
    }

    /**
     * The identity source for which authorization is requested.
     *
     * Request parameter match `'route.request.querystring|header.[a-zA-z0-9._-]+'`. Staged variable
     * match `'stageVariables.[a-zA-Z0-9._-]+'`. Context parameter match
     * `'context.[a-zA-Z0-9._-]+'`.
     *
     * Default: ['route.request.header.Authorization']
     *
     * @param identitySource The identity source for which authorization is requested.
     */
    public fun identitySource(identitySource: Collection<String>) {
        _identitySource.addAll(identitySource)
    }

    public fun build(): WebSocketLambdaAuthorizer {
        if (_identitySource.isNotEmpty()) cdkBuilder.identitySource(_identitySource)
        return cdkBuilder.build()
    }
}
