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

import io.cloudshiftdev.awscdkdsl.services.apigatewayv2.HttpRouteAuthorizerBindOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.apigatewayv2.WebSocketRouteAuthorizerBindOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpIamAuthorizer
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizer
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizer
import software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketIamAuthorizer
import software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer
import software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig

/**
 * Bind this authorizer to a specified Http route.
 *
 * @param _options
 */
public inline fun HttpIamAuthorizer.bind(
    block: HttpRouteAuthorizerBindOptionsDsl.() -> Unit = {}
): HttpRouteAuthorizerConfig {
    val builder = HttpRouteAuthorizerBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Bind this authorizer to a specified Http route.
 *
 * @param options
 */
public inline fun HttpJwtAuthorizer.bind(
    block: HttpRouteAuthorizerBindOptionsDsl.() -> Unit = {}
): HttpRouteAuthorizerConfig {
    val builder = HttpRouteAuthorizerBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Bind this authorizer to a specified Http route.
 *
 * @param options
 */
public inline fun HttpLambdaAuthorizer.bind(
    block: HttpRouteAuthorizerBindOptionsDsl.() -> Unit = {}
): HttpRouteAuthorizerConfig {
    val builder = HttpRouteAuthorizerBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Bind this authorizer to a specified Http route.
 *
 * @param options
 */
public inline fun HttpUserPoolAuthorizer.bind(
    block: HttpRouteAuthorizerBindOptionsDsl.() -> Unit = {}
): HttpRouteAuthorizerConfig {
    val builder = HttpRouteAuthorizerBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Bind this authorizer to a specified WebSocket route.
 *
 * @param _options
 */
public inline fun WebSocketIamAuthorizer.bind(
    block: WebSocketRouteAuthorizerBindOptionsDsl.() -> Unit = {}
): WebSocketRouteAuthorizerConfig {
    val builder = WebSocketRouteAuthorizerBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Bind this authorizer to a specified WebSocket route.
 *
 * @param options
 */
public inline fun WebSocketLambdaAuthorizer.bind(
    block: WebSocketRouteAuthorizerBindOptionsDsl.() -> Unit = {}
): WebSocketRouteAuthorizerConfig {
    val builder = WebSocketRouteAuthorizerBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}
