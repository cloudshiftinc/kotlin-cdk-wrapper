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

import io.cloudshiftdev.awscdkdsl.services.cloudwatch.MetricOptionsDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.amazon.awscdk.services.apigatewayv2.CfnApi
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides
import software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer
import software.amazon.awscdk.services.apigatewayv2.CfnDomainName
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration
import software.amazon.awscdk.services.apigatewayv2.CfnStage
import software.amazon.awscdk.services.apigatewayv2.DomainName
import software.amazon.awscdk.services.apigatewayv2.HttpApi
import software.amazon.awscdk.services.apigatewayv2.HttpNoneAuthorizer
import software.amazon.awscdk.services.apigatewayv2.HttpRoute
import software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig
import software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration
import software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig
import software.amazon.awscdk.services.apigatewayv2.HttpStage
import software.amazon.awscdk.services.apigatewayv2.IApi
import software.amazon.awscdk.services.apigatewayv2.IHttpApi
import software.amazon.awscdk.services.apigatewayv2.IHttpRoute
import software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer
import software.amazon.awscdk.services.apigatewayv2.IHttpStage
import software.amazon.awscdk.services.apigatewayv2.IStage
import software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer
import software.amazon.awscdk.services.apigatewayv2.VpcLink
import software.amazon.awscdk.services.apigatewayv2.WebSocketApi
import software.amazon.awscdk.services.apigatewayv2.WebSocketNoneAuthorizer
import software.amazon.awscdk.services.apigatewayv2.WebSocketRoute
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegration
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig
import software.amazon.awscdk.services.apigatewayv2.WebSocketStage
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.iam.Grant
import software.amazon.awscdk.services.iam.IGrantable

/** The S3 location of an OpenAPI definition. */
public inline fun CfnApi.setBodyS3Location(block: CfnApiBodyS3LocationPropertyDsl.() -> Unit = {}) {
    val builder = CfnApiBodyS3LocationPropertyDsl()
    builder.apply(block)
    return setBodyS3Location(builder.build())
}

/** A CORS configuration. */
public inline fun CfnApi.setCorsConfiguration(block: CfnApiCorsPropertyDsl.() -> Unit = {}) {
    val builder = CfnApiCorsPropertyDsl()
    builder.apply(block)
    return setCorsConfiguration(builder.build())
}

/** Overrides the integration configuration for an API Gateway-managed integration. */
public inline fun CfnApiGatewayManagedOverrides.setIntegration(
    block: CfnApiGatewayManagedOverridesIntegrationOverridesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApiGatewayManagedOverridesIntegrationOverridesPropertyDsl()
    builder.apply(block)
    return setIntegration(builder.build())
}

/** Overrides the route configuration for an API Gateway-managed route. */
public inline fun CfnApiGatewayManagedOverrides.setRoute(
    block: CfnApiGatewayManagedOverridesRouteOverridesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApiGatewayManagedOverridesRouteOverridesPropertyDsl()
    builder.apply(block)
    return setRoute(builder.build())
}

/** Overrides the stage configuration for an API Gateway-managed stage. */
public inline fun CfnApiGatewayManagedOverrides.setStage(
    block: CfnApiGatewayManagedOverridesStageOverridesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApiGatewayManagedOverridesStageOverridesPropertyDsl()
    builder.apply(block)
    return setStage(builder.build())
}

/** The `JWTConfiguration` property specifies the configuration of a JWT authorizer. */
public inline fun CfnAuthorizer.setJwtConfiguration(
    block: CfnAuthorizerJWTConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAuthorizerJWTConfigurationPropertyDsl()
    builder.apply(block)
    return setJwtConfiguration(builder.build())
}

/** The mutual TLS authentication configuration for a custom domain name. */
public inline fun CfnDomainName.setMutualTlsAuthentication(
    block: CfnDomainNameMutualTlsAuthenticationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDomainNameMutualTlsAuthenticationPropertyDsl()
    builder.apply(block)
    return setMutualTlsAuthentication(builder.build())
}

/** The TLS configuration for a private integration. */
public inline fun CfnIntegration.setTlsConfig(
    block: CfnIntegrationTlsConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnIntegrationTlsConfigPropertyDsl()
    builder.apply(block)
    return setTlsConfig(builder.build())
}

/** Settings for logging access in this stage. */
public inline fun CfnStage.setAccessLogSettings(
    block: CfnStageAccessLogSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStageAccessLogSettingsPropertyDsl()
    builder.apply(block)
    return setAccessLogSettings(builder.build())
}

/** The default route settings for the stage. */
public inline fun CfnStage.setDefaultRouteSettings(
    block: CfnStageRouteSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStageRouteSettingsPropertyDsl()
    builder.apply(block)
    return setDefaultRouteSettings(builder.build())
}

/**
 * Adds an endpoint to a domain name.
 *
 * @param options domain name endpoint properties to be set.
 */
public inline fun DomainName.addEndpoint(block: EndpointOptionsDsl.() -> Unit = {}) {
    val builder = EndpointOptionsDsl()
    builder.apply(block)
    return addEndpoint(builder.build())
}

/**
 * Add multiple routes that uses the same configuration.
 *
 * The routes all go to the same path, but for different methods.
 *
 * @param options
 */
public inline fun HttpApi.addRoutes(block: AddRoutesOptionsDsl.() -> Unit = {}): List<HttpRoute> {
    val builder = AddRoutesOptionsDsl()
    builder.apply(block)
    return addRoutes(builder.build())
}

/**
 * Add a new stage.
 *
 * @param id
 * @param options
 */
public inline fun HttpApi.addStage(
    id: String,
    block: HttpStageOptionsDsl.() -> Unit = {}
): HttpStage {
    val builder = HttpStageOptionsDsl()
    builder.apply(block)
    return addStage(id, builder.build())
}

/**
 * Add a new VpcLink.
 *
 * @param options
 */
public inline fun HttpApi.addVpcLink(block: VpcLinkPropsDsl.() -> Unit = {}): VpcLink {
    val builder = VpcLinkPropsDsl()
    builder.apply(block)
    return addVpcLink(builder.build())
}

/**
 * Return the given named metric for this Api Gateway.
 *
 * @param metricName
 * @param props
 */
public inline fun HttpApi.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * Metric for the number of client-side errors captured in a given period.
 *
 * @param props
 */
public inline fun HttpApi.metricClientError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricClientError(builder.build())
}

/**
 * Metric for the total number API requests in a given period.
 *
 * @param props
 */
public inline fun HttpApi.metricCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCount(builder.build())
}

/**
 * Metric for the amount of data processed in bytes.
 *
 * @param props
 */
public inline fun HttpApi.metricDataProcessed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricDataProcessed(builder.build())
}

/**
 * Metric for the time between when API Gateway relays a request to the backend and when it receives
 * a response from the backend.
 *
 * @param props
 */
public inline fun HttpApi.metricIntegrationLatency(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricIntegrationLatency(builder.build())
}

/**
 * The time between when API Gateway receives a request from a client and when it returns a response
 * to the client.
 *
 * The latency includes the integration latency and other API Gateway overhead.
 *
 * @param props
 */
public inline fun HttpApi.metricLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricLatency(builder.build())
}

/**
 * Metric for the number of server-side errors captured in a given period.
 *
 * @param props
 */
public inline fun HttpApi.metricServerError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricServerError(builder.build())
}

/**
 * Bind this authorizer to a specified Http route.
 *
 * @param _options
 */
public inline fun HttpNoneAuthorizer.bind(
    block: HttpRouteAuthorizerBindOptionsDsl.() -> Unit = {}
): HttpRouteAuthorizerConfig {
    val builder = HttpRouteAuthorizerBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Grant access to invoke the route.
 *
 * This method requires that the authorizer of the route is undefined or is an `HttpIamAuthorizer`.
 *
 * @param grantee
 * @param options
 */
public inline fun HttpRoute.grantInvoke(
    grantee: IGrantable,
    block: GrantInvokeOptionsDsl.() -> Unit = {}
): Grant {
    val builder = GrantInvokeOptionsDsl()
    builder.apply(block)
    return grantInvoke(grantee, builder.build())
}

/**
 * Bind this integration to the route.
 *
 * @param options
 */
public inline fun HttpRouteIntegration.bind(
    block: HttpRouteIntegrationBindOptionsDsl.() -> Unit = {}
): HttpRouteIntegrationConfig {
    val builder = HttpRouteIntegrationBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Return the given named metric for this HTTP Api Gateway Stage.
 *
 * @param metricName
 * @param props
 */
public inline fun HttpStage.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * Metric for the number of client-side errors captured in a given period.
 *
 * @param props
 */
public inline fun HttpStage.metricClientError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricClientError(builder.build())
}

/**
 * Metric for the total number API requests in a given period.
 *
 * @param props
 */
public inline fun HttpStage.metricCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCount(builder.build())
}

/**
 * Metric for the amount of data processed in bytes.
 *
 * @param props
 */
public inline fun HttpStage.metricDataProcessed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricDataProcessed(builder.build())
}

/**
 * Metric for the time between when API Gateway relays a request to the backend and when it receives
 * a response from the backend.
 *
 * @param props
 */
public inline fun HttpStage.metricIntegrationLatency(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricIntegrationLatency(builder.build())
}

/**
 * The time between when API Gateway receives a request from a client and when it returns a response
 * to the client.
 *
 * The latency includes the integration latency and other API Gateway overhead.
 *
 * @param props
 */
public inline fun HttpStage.metricLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricLatency(builder.build())
}

/**
 * Metric for the number of server-side errors captured in a given period.
 *
 * @param props
 */
public inline fun HttpStage.metricServerError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricServerError(builder.build())
}

/**
 * Return the given named metric for this Api Gateway.
 *
 * Default: - average over 5 minutes
 *
 * @param metricName
 * @param props
 */
public inline fun IApi.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(arg0, builder.build())
}

/**
 * Add a new VpcLink.
 *
 * @param options
 */
public inline fun IHttpApi.addVpcLink(block: VpcLinkPropsDsl.() -> Unit = {}): VpcLink {
    val builder = VpcLinkPropsDsl()
    builder.apply(block)
    return addVpcLink(builder.build())
}

/**
 * Metric for the number of client-side errors captured in a given period.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun IHttpApi.metricClientError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricClientError(builder.build())
}

/**
 * Metric for the total number API requests in a given period.
 *
 * Default: - SampleCount over 5 minutes
 *
 * @param props
 */
public inline fun IHttpApi.metricCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCount(builder.build())
}

/**
 * Metric for the amount of data processed in bytes.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun IHttpApi.metricDataProcessed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricDataProcessed(builder.build())
}

/**
 * Metric for the time between when API Gateway relays a request to the backend and when it receives
 * a response from the backend.
 *
 * Default: - no statistic
 *
 * @param props
 */
public inline fun IHttpApi.metricIntegrationLatency(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricIntegrationLatency(builder.build())
}

/**
 * The time between when API Gateway receives a request from a client and when it returns a response
 * to the client.
 *
 * The latency includes the integration latency and other API Gateway overhead.
 *
 * Default: - no statistic
 *
 * @param props
 */
public inline fun IHttpApi.metricLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricLatency(builder.build())
}

/**
 * Metric for the number of server-side errors captured in a given period.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun IHttpApi.metricServerError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricServerError(builder.build())
}

/**
 * Grant access to invoke the route.
 *
 * This method requires that the authorizer of the route is undefined or is an `HttpIamAuthorizer`.
 *
 * @param grantee
 * @param options
 */
public inline fun IHttpRoute.grantInvoke(
    arg0: IGrantable,
    block: GrantInvokeOptionsDsl.() -> Unit = {}
): Grant {
    val builder = GrantInvokeOptionsDsl()
    builder.apply(block)
    return grantInvoke(arg0, builder.build())
}

/**
 * Bind this authorizer to a specified Http route.
 *
 * @param options
 */
public inline fun IHttpRouteAuthorizer.bind(
    block: HttpRouteAuthorizerBindOptionsDsl.() -> Unit = {}
): HttpRouteAuthorizerConfig {
    val builder = HttpRouteAuthorizerBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Metric for the number of client-side errors captured in a given period.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun IHttpStage.metricClientError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricClientError(builder.build())
}

/**
 * Metric for the total number API requests in a given period.
 *
 * Default: - SampleCount over 5 minutes
 *
 * @param props
 */
public inline fun IHttpStage.metricCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCount(builder.build())
}

/**
 * Metric for the amount of data processed in bytes.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun IHttpStage.metricDataProcessed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricDataProcessed(builder.build())
}

/**
 * Metric for the time between when API Gateway relays a request to the backend and when it receives
 * a response from the backend.
 *
 * Default: - no statistic
 *
 * @param props
 */
public inline fun IHttpStage.metricIntegrationLatency(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricIntegrationLatency(builder.build())
}

/**
 * The time between when API Gateway receives a request from a client and when it returns a response
 * to the client.
 *
 * The latency includes the integration latency and other API Gateway overhead.
 *
 * Default: - no statistic
 *
 * @param props
 */
public inline fun IHttpStage.metricLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricLatency(builder.build())
}

/**
 * Metric for the number of server-side errors captured in a given period.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun IHttpStage.metricServerError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricServerError(builder.build())
}

/**
 * Return the given named metric for this HTTP Api Gateway Stage.
 *
 * Default: - average over 5 minutes
 *
 * @param metricName
 * @param props
 */
public inline fun IStage.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(arg0, builder.build())
}

/**
 * Bind this authorizer to a specified WebSocket route.
 *
 * @param options
 */
public inline fun IWebSocketRouteAuthorizer.bind(
    block: WebSocketRouteAuthorizerBindOptionsDsl.() -> Unit = {}
): WebSocketRouteAuthorizerConfig {
    val builder = WebSocketRouteAuthorizerBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Add a new route.
 *
 * @param routeKey
 * @param options
 */
public inline fun WebSocketApi.addRoute(
    routeKey: String,
    block: WebSocketRouteOptionsDsl.() -> Unit = {}
): WebSocketRoute {
    val builder = WebSocketRouteOptionsDsl()
    builder.apply(block)
    return addRoute(routeKey, builder.build())
}

/**
 * Return the given named metric for this Api Gateway.
 *
 * @param metricName
 * @param props
 */
public inline fun WebSocketApi.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * Bind this authorizer to a specified WebSocket route.
 *
 * @param _options
 */
public inline fun WebSocketNoneAuthorizer.bind(
    block: WebSocketRouteAuthorizerBindOptionsDsl.() -> Unit = {}
): WebSocketRouteAuthorizerConfig {
    val builder = WebSocketRouteAuthorizerBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Bind this integration to the route.
 *
 * @param options
 */
public inline fun WebSocketRouteIntegration.bind(
    block: WebSocketRouteIntegrationBindOptionsDsl.() -> Unit = {}
): WebSocketRouteIntegrationConfig {
    val builder = WebSocketRouteIntegrationBindOptionsDsl()
    builder.apply(block)
    return bind(builder.build())
}

/**
 * Return the given named metric for this HTTP Api Gateway Stage.
 *
 * @param metricName
 * @param props
 */
public inline fun WebSocketStage.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}
