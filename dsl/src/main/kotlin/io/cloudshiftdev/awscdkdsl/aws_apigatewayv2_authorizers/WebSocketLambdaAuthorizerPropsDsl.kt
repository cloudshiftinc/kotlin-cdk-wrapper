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
import software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizerProps

/**
 * Properties to initialize WebSocketTokenAuthorizer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.aws_apigatewayv2_authorizers.*;
 * WebSocketLambdaAuthorizerProps webSocketLambdaAuthorizerProps =
 * WebSocketLambdaAuthorizerProps.builder()
 * .authorizerName("authorizerName")
 * .identitySource(List.of("identitySource"))
 * .build();
 * ```
 */
@CdkDslMarker
public class WebSocketLambdaAuthorizerPropsDsl {
    private val cdkBuilder: WebSocketLambdaAuthorizerProps.Builder =
        WebSocketLambdaAuthorizerProps.builder()

    private val _identitySource: MutableList<String> = mutableListOf()

    /** @param authorizerName The name of the authorizer. */
    public fun authorizerName(authorizerName: String) {
        cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * @param identitySource The identity source for which authorization is requested. Request
     *   parameter match `'route.request.querystring|header.[a-zA-z0-9._-]+'`. Staged variable match
     *   `'stageVariables.[a-zA-Z0-9._-]+'`. Context parameter match `'context.[a-zA-Z0-9._-]+'`.
     */
    public fun identitySource(vararg identitySource: String) {
        _identitySource.addAll(listOf(*identitySource))
    }

    /**
     * @param identitySource The identity source for which authorization is requested. Request
     *   parameter match `'route.request.querystring|header.[a-zA-z0-9._-]+'`. Staged variable match
     *   `'stageVariables.[a-zA-Z0-9._-]+'`. Context parameter match `'context.[a-zA-Z0-9._-]+'`.
     */
    public fun identitySource(identitySource: Collection<String>) {
        _identitySource.addAll(identitySource)
    }

    public fun build(): WebSocketLambdaAuthorizerProps {
        if (_identitySource.isNotEmpty()) cdkBuilder.identitySource(_identitySource)
        return cdkBuilder.build()
    }
}
