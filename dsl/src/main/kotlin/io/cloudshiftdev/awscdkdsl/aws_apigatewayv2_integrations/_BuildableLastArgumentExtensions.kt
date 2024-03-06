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

package io.cloudshiftdev.awscdkdsl.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdkdsl.services.apigatewayv2.HttpRouteIntegrationBindOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.apigatewayv2.WebSocketRouteIntegrationBindOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegration
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegration
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration
import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegration
import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration
import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegration
import software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig

/**
 * Bind this integration to the route.
 *
 * @param options
 */
public inline fun HttpAlbIntegration.bind(
    block: HttpRouteIntegrationBindOptionsDsl.() -> Unit = {}
): HttpRouteIntegrationConfig {
    val builder = HttpRouteIntegrationBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Bind this integration to the route.
 *
 * @param _options
 */
public inline fun HttpLambdaIntegration.bind(
    block: HttpRouteIntegrationBindOptionsDsl.() -> Unit = {}
): HttpRouteIntegrationConfig {
    val builder = HttpRouteIntegrationBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Bind this integration to the route.
 *
 * @param options
 */
public inline fun HttpNlbIntegration.bind(
    block: HttpRouteIntegrationBindOptionsDsl.() -> Unit = {}
): HttpRouteIntegrationConfig {
    val builder = HttpRouteIntegrationBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Bind this integration to the route.
 *
 * @param _options
 */
public inline fun HttpServiceDiscoveryIntegration.bind(
    block: HttpRouteIntegrationBindOptionsDsl.() -> Unit = {}
): HttpRouteIntegrationConfig {
    val builder = HttpRouteIntegrationBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Bind this integration to the route.
 *
 * @param options
 */
public inline fun HttpStepFunctionsIntegration.bind(
    block: HttpRouteIntegrationBindOptionsDsl.() -> Unit = {}
): HttpRouteIntegrationConfig {
    val builder = HttpRouteIntegrationBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Bind this integration to the route.
 *
 * @param _options
 */
public inline fun HttpUrlIntegration.bind(
    block: HttpRouteIntegrationBindOptionsDsl.() -> Unit = {}
): HttpRouteIntegrationConfig {
    val builder = HttpRouteIntegrationBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Bind this integration to the route.
 *
 * @param _options
 */
public inline fun WebSocketAwsIntegration.bind(
    block: WebSocketRouteIntegrationBindOptionsDsl.() -> Unit = {}
): WebSocketRouteIntegrationConfig {
    val builder = WebSocketRouteIntegrationBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Bind this integration to the route.
 *
 * @param options
 */
public inline fun WebSocketLambdaIntegration.bind(
    block: WebSocketRouteIntegrationBindOptionsDsl.() -> Unit = {}
): WebSocketRouteIntegrationConfig {
    val builder = WebSocketRouteIntegrationBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Bind this integration to the route.
 *
 * @param options
 */
public inline fun WebSocketMockIntegration.bind(
    block: WebSocketRouteIntegrationBindOptionsDsl.() -> Unit = {}
): WebSocketRouteIntegrationConfig {
    val builder = WebSocketRouteIntegrationBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}
