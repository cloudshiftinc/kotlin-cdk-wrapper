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
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig

/**
 * Results of binding an authorizer to an WebSocket route.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * WebSocketRouteAuthorizerConfig webSocketRouteAuthorizerConfig =
 * WebSocketRouteAuthorizerConfig.builder()
 * .authorizationType("authorizationType")
 * // the properties below are optional
 * .authorizerId("authorizerId")
 * .build();
 * ```
 */
@CdkDslMarker
public class WebSocketRouteAuthorizerConfigDsl {
    private val cdkBuilder: WebSocketRouteAuthorizerConfig.Builder =
        WebSocketRouteAuthorizerConfig.builder()

    /**
     * @param authorizationType The type of authorization. Possible values are:
     * * CUSTOM - Lambda Authorizer
     * * NONE - No Authorization
     */
    public fun authorizationType(authorizationType: String) {
        cdkBuilder.authorizationType(authorizationType)
    }

    /** @param authorizerId The authorizer id. */
    public fun authorizerId(authorizerId: String) {
        cdkBuilder.authorizerId(authorizerId)
    }

    public fun build(): WebSocketRouteAuthorizerConfig = cdkBuilder.build()
}
