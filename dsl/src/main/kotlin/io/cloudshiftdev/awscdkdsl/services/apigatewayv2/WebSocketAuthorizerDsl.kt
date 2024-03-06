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
import software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer
import software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerType
import software.constructs.Construct

/**
 * An authorizer for WebSocket Apis.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * WebSocketApi webSocketApi;
 * WebSocketAuthorizer webSocketAuthorizer = WebSocketAuthorizer.Builder.create(this,
 * "MyWebSocketAuthorizer")
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
public class WebSocketAuthorizerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: WebSocketAuthorizer.Builder =
        WebSocketAuthorizer.Builder.create(scope, id)

    private val _identitySource: MutableList<String> = mutableListOf()

    /**
     * Name of the authorizer.
     *
     * Default: - id of the WebSocketAuthorizer construct.
     *
     * @param authorizerName Name of the authorizer.
     */
    public fun authorizerName(authorizerName: String) {
        cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * The authorizer's Uniform Resource Identifier (URI).
     *
     * For REQUEST authorizers, this must be a well-formed Lambda function URI.
     *
     * Default: - required for Request authorizer types
     *
     * @param authorizerUri The authorizer's Uniform Resource Identifier (URI).
     */
    public fun authorizerUri(authorizerUri: String) {
        cdkBuilder.authorizerUri(authorizerUri)
    }

    /**
     * The identity source for which authorization is requested.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identitysource)
     *
     * @param identitySource The identity source for which authorization is requested.
     */
    public fun identitySource(vararg identitySource: String) {
        _identitySource.addAll(listOf(*identitySource))
    }

    /**
     * The identity source for which authorization is requested.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identitysource)
     *
     * @param identitySource The identity source for which authorization is requested.
     */
    public fun identitySource(identitySource: Collection<String>) {
        _identitySource.addAll(identitySource)
    }

    /**
     * The type of authorizer.
     *
     * @param type The type of authorizer.
     */
    public fun type(type: WebSocketAuthorizerType) {
        cdkBuilder.type(type)
    }

    /**
     * WebSocket Api to attach the authorizer to.
     *
     * @param webSocketApi WebSocket Api to attach the authorizer to.
     */
    public fun webSocketApi(webSocketApi: IWebSocketApi) {
        cdkBuilder.webSocketApi(webSocketApi)
    }

    public fun build(): WebSocketAuthorizer {
        if (_identitySource.isNotEmpty()) cdkBuilder.identitySource(_identitySource)
        return cdkBuilder.build()
    }
}
