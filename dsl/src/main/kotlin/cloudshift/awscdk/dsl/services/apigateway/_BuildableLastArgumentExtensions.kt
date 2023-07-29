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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.BasePathMapping
import software.amazon.awscdk.services.apigateway.CfnDeployment
import software.amazon.awscdk.services.apigateway.CfnDocumentationPart
import software.amazon.awscdk.services.apigateway.CfnDomainName
import software.amazon.awscdk.services.apigateway.CfnMethod
import software.amazon.awscdk.services.apigateway.CfnRestApi
import software.amazon.awscdk.services.apigateway.CfnStage
import software.amazon.awscdk.services.apigateway.CfnUsagePlan
import software.amazon.awscdk.services.apigateway.DomainName
import software.amazon.awscdk.services.apigateway.GatewayResponse
import software.amazon.awscdk.services.apigateway.IApiKey
import software.amazon.awscdk.services.apigateway.IResource
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.IStage
import software.amazon.awscdk.services.apigateway.IUsagePlan
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.Method
import software.amazon.awscdk.services.apigateway.Model
import software.amazon.awscdk.services.apigateway.ProxyResource
import software.amazon.awscdk.services.apigateway.RequestValidator
import software.amazon.awscdk.services.apigateway.Resource
import software.amazon.awscdk.services.apigateway.ResourceBase
import software.amazon.awscdk.services.apigateway.RestApi
import software.amazon.awscdk.services.apigateway.RestApiBase
import software.amazon.awscdk.services.apigateway.StageBase
import software.amazon.awscdk.services.apigateway.UsagePlan
import software.amazon.awscdk.services.cloudwatch.Metric

/**
 * Add an ApiKey to this stage.
 *
 * @param id
 * @param options
 */
public inline fun StageBase.addApiKey(
    id: String,
    block: ApiKeyOptionsDsl.() -> Unit = {}
): IApiKey {
    val builder = ApiKeyOptionsDsl()
    builder.apply(block)
    return addApiKey(id, builder.build())
}

/**
 * Returns the given named metric for this stage.
 *
 * @param metricName
 * @param props
 */
public inline fun StageBase.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * Metric for the number of requests served from the API cache in a given period.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun StageBase.metricCacheHitCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCacheHitCount(builder.build())
}

/**
 * Metric for the number of requests served from the backend in a given period, when API caching is
 * enabled.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun StageBase.metricCacheMissCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCacheMissCount(builder.build())
}

/**
 * Metric for the number of client-side errors captured in a given period.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun StageBase.metricClientError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricClientError(builder.build())
}

/**
 * Metric for the total number API requests in a given period.
 *
 * Default: - sample count over 5 minutes
 *
 * @param props
 */
public inline fun StageBase.metricCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCount(builder.build())
}

/**
 * Metric for the time between when API Gateway relays a request to the backend and when it receives
 * a response from the backend.
 *
 * Default: - average over 5 minutes.
 *
 * @param props
 */
public inline fun StageBase.metricIntegrationLatency(
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
 * Default: - average over 5 minutes.
 *
 * @param props
 */
public inline fun StageBase.metricLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
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
public inline fun StageBase.metricServerError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricServerError(builder.build())
}

/**
 * Adds an OPTIONS method to this resource which responds to Cross-Origin Resource Sharing (CORS)
 * preflight requests.
 *
 * Cross-Origin Resource Sharing (CORS) is a mechanism that uses additional HTTP headers to tell
 * browsers to give a web application running at one origin, access to selected resources from a
 * different origin. A web application executes a cross-origin HTTP request when it requests a
 * resource that has a different origin (domain, protocol, or port) from its own.
 *
 * @param options CORS options.
 * @return a `Method` object [Documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
 */
public inline fun IResource.addCorsPreflight(block: CorsOptionsDsl.() -> Unit = {}): Method {
    val builder = CorsOptionsDsl()
    builder.apply(block)
    return addCorsPreflight(builder.build())
}

/**
 * Defines a new method for this resource.
 *
 * @param httpMethod The HTTP method.
 * @param target The target backend integration for this method.
 * @param options Method options, such as authentication.
 * @return The newly created `Method` object.
 */
public inline fun IResource.addMethod(
    arg0: String,
    arg1: Integration?,
    block: MethodOptionsDsl.() -> Unit = {},
): Method {
    val builder = MethodOptionsDsl()
    builder.apply(block)
    return addMethod(arg0, arg1, builder.build())
}

/**
 * Defines a new method for this resource.
 *
 * @param httpMethod The HTTP method.
 * @param target The target backend integration for this method.
 * @param options Method options, such as authentication.
 * @return The newly created `Method` object.
 */
public inline fun IResource.addMethod(arg0: String, block: IntegrationDsl.() -> Unit = {}): Method {
    val builder = IntegrationDsl()
    builder.apply(block)
    return addMethod(arg0, builder.build())
}

/**
 * Adds a greedy proxy resource ("{proxy+}") and an ANY method to this route.
 *
 * @param options Default integration and method options.
 */
public inline fun IResource.addProxy(
    block: ProxyResourceOptionsDsl.() -> Unit = {}
): ProxyResource {
    val builder = ProxyResourceOptionsDsl()
    builder.apply(block)
    return addProxy(builder.build())
}

/**
 * Defines a new child resource where this resource is the parent.
 *
 * @param pathPart The path part for the child resource.
 * @param options Resource options.
 * @return A Resource object
 */
public inline fun IResource.addResource(
    arg0: String,
    block: ResourceOptionsDsl.() -> Unit = {}
): Resource {
    val builder = ResourceOptionsDsl()
    builder.apply(block)
    return addResource(arg0, builder.build())
}

/**
 * Add an ApiKey to the deploymentStage.
 *
 * @param id
 * @param options
 */
public inline fun RestApiBase.addApiKey(
    id: String,
    block: ApiKeyOptionsDsl.() -> Unit = {}
): IApiKey {
    val builder = ApiKeyOptionsDsl()
    builder.apply(block)
    return addApiKey(id, builder.build())
}

/**
 * Defines an API Gateway domain name and maps it to this API.
 *
 * @param id The construct id.
 * @param options custom domain options.
 */
public inline fun RestApiBase.addDomainName(
    id: String,
    block: DomainNameOptionsDsl.() -> Unit = {}
): DomainName {
    val builder = DomainNameOptionsDsl()
    builder.apply(block)
    return addDomainName(id, builder.build())
}

/**
 * Adds a new gateway response.
 *
 * @param id
 * @param options
 */
public inline fun RestApiBase.addGatewayResponse(
    id: String,
    block: GatewayResponseOptionsDsl.() -> Unit = {}
): GatewayResponse {
    val builder = GatewayResponseOptionsDsl()
    builder.apply(block)
    return addGatewayResponse(id, builder.build())
}

/**
 * Adds a usage plan.
 *
 * @param id
 * @param props
 */
public inline fun RestApiBase.addUsagePlan(
    id: String,
    block: UsagePlanPropsDsl.() -> Unit = {}
): UsagePlan {
    val builder = UsagePlanPropsDsl()
    builder.apply(block)
    return addUsagePlan(id, builder.build())
}

/**
 * Returns the given named metric for this API.
 *
 * @param metricName
 * @param props
 */
public inline fun RestApiBase.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * Metric for the number of requests served from the API cache in a given period.
 *
 * Default: sum over 5 minutes
 *
 * @param props
 */
public inline fun RestApiBase.metricCacheHitCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCacheHitCount(builder.build())
}

/**
 * Metric for the number of requests served from the backend in a given period, when API caching is
 * enabled.
 *
 * Default: sum over 5 minutes
 *
 * @param props
 */
public inline fun RestApiBase.metricCacheMissCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCacheMissCount(builder.build())
}

/**
 * Metric for the number of client-side errors captured in a given period.
 *
 * Default: sum over 5 minutes
 *
 * @param props
 */
public inline fun RestApiBase.metricClientError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricClientError(builder.build())
}

/**
 * Metric for the total number API requests in a given period.
 *
 * Default: sample count over 5 minutes
 *
 * @param props
 */
public inline fun RestApiBase.metricCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCount(builder.build())
}

/**
 * Metric for the time between when API Gateway relays a request to the backend and when it receives
 * a response from the backend.
 *
 * Default: average over 5 minutes.
 *
 * @param props
 */
public inline fun RestApiBase.metricIntegrationLatency(
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
 * Default: average over 5 minutes.
 *
 * @param props
 */
public inline fun RestApiBase.metricLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricLatency(builder.build())
}

/**
 * Metric for the number of server-side errors captured in a given period.
 *
 * Default: sum over 5 minutes
 *
 * @param props
 */
public inline fun RestApiBase.metricServerError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricServerError(builder.build())
}

/** The location of the targeted API entity of the to-be-created documentation part. */
public inline fun CfnDocumentationPart.setLocation(
    block: CfnDocumentationPartLocationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDocumentationPartLocationPropertyDsl()
    builder.apply(block)
    return setLocation(builder.build())
}

/** Access log settings, including the access log format and access log destination ARN. */
public inline fun CfnStage.setAccessLogSetting(
    block: CfnStageAccessLogSettingPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStageAccessLogSettingPropertyDsl()
    builder.apply(block)
    return setAccessLogSetting(builder.build())
}

/** Settings for the canary deployment in this stage. */
public inline fun CfnStage.setCanarySetting(
    block: CfnStageCanarySettingPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStageCanarySettingPropertyDsl()
    builder.apply(block)
    return setCanarySetting(builder.build())
}

/**
 * Add an ApiKey to this Stage.
 *
 * @param id
 * @param options
 */
public inline fun IStage.addApiKey(arg0: String, block: ApiKeyOptionsDsl.() -> Unit = {}): IApiKey {
    val builder = ApiKeyOptionsDsl()
    builder.apply(block)
    return addApiKey(arg0, builder.build())
}

/** The target maximum number of permitted requests per a given unit time interval. */
public inline fun CfnUsagePlan.setQuota(
    block: CfnUsagePlanQuotaSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnUsagePlanQuotaSettingsPropertyDsl()
    builder.apply(block)
    return setQuota(builder.build())
}

/** A map containing method level throttling information for API stage in a usage plan. */
public inline fun CfnUsagePlan.setThrottle(
    block: CfnUsagePlanThrottleSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnUsagePlanThrottleSettingsPropertyDsl()
    builder.apply(block)
    return setThrottle(builder.build())
}

/**
 * Adds a new model.
 *
 * @param id
 * @param props
 */
public inline fun RestApi.addModel(id: String, block: ModelOptionsDsl.() -> Unit = {}): Model {
    val builder = ModelOptionsDsl()
    builder.apply(block)
    return addModel(id, builder.build())
}

/**
 * Adds a new request validator.
 *
 * @param id
 * @param props
 */
public inline fun RestApi.addRequestValidator(
    id: String,
    block: RequestValidatorOptionsDsl.() -> Unit = {}
): RequestValidator {
    val builder = RequestValidatorOptionsDsl()
    builder.apply(block)
    return addRequestValidator(id, builder.build())
}

/**
 * Adds an ApiKey.
 *
 * @param apiKey the api key to associate with this usage plan.
 * @param options options that control the behaviour of this method.
 */
public inline fun UsagePlan.addApiKey(apiKey: IApiKey, block: AddApiKeyOptionsDsl.() -> Unit = {}) {
    val builder = AddApiKeyOptionsDsl()
    builder.apply(block)
    return addApiKey(apiKey, builder.build())
}

/**
 * Adds an apiStage.
 *
 * @param apiStage
 */
public inline fun UsagePlan.addApiStage(block: UsagePlanPerApiStageDsl.() -> Unit = {}) {
    val builder = UsagePlanPerApiStageDsl()
    builder.apply(block)
    return addApiStage(builder.build())
}

/**
 * The Amazon Simple Storage Service (Amazon S3) location that points to an OpenAPI file, which
 * defines a set of RESTful APIs in JSON or YAML format.
 */
public inline fun CfnRestApi.setBodyS3Location(
    block: CfnRestApiS3LocationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRestApiS3LocationPropertyDsl()
    builder.apply(block)
    return setBodyS3Location(builder.build())
}

/** A list of the endpoint types of the API. */
public inline fun CfnRestApi.setEndpointConfiguration(
    block: CfnRestApiEndpointConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRestApiEndpointConfigurationPropertyDsl()
    builder.apply(block)
    return setEndpointConfiguration(builder.build())
}

/**
 * Adds an ApiKey.
 *
 * @param apiKey the api key to associate with this usage plan.
 * @param options options that control the behaviour of this method.
 */
public inline fun IUsagePlan.addApiKey(arg0: IApiKey, block: AddApiKeyOptionsDsl.() -> Unit = {}) {
    val builder = AddApiKeyOptionsDsl()
    builder.apply(block)
    return addApiKey(arg0, builder.build())
}

/** The endpoint configuration of this DomainName showing the endpoint types of the domain name. */
public inline fun CfnDomainName.setEndpointConfiguration(
    block: CfnDomainNameEndpointConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDomainNameEndpointConfigurationPropertyDsl()
    builder.apply(block)
    return setEndpointConfiguration(builder.build())
}

/** The mutual TLS authentication configuration for a custom domain name. */
public inline fun CfnDomainName.setMutualTlsAuthentication(
    block: CfnDomainNameMutualTlsAuthenticationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDomainNameMutualTlsAuthenticationPropertyDsl()
    builder.apply(block)
    return setMutualTlsAuthentication(builder.build())
}

/**
 * Defines a new method for this resource.
 *
 * @param httpMethod
 * @param integration
 * @param options
 */
public inline fun ProxyResource.addMethod(
    httpMethod: String,
    integration: Integration?,
    block: MethodOptionsDsl.() -> Unit = {},
): Method {
    val builder = MethodOptionsDsl()
    builder.apply(block)
    return addMethod(httpMethod, integration, builder.build())
}

/**
 * Defines a new method for this resource.
 *
 * @param httpMethod
 * @param integration
 * @param options
 */
public inline fun ProxyResource.addMethod(
    httpMethod: String,
    block: IntegrationDsl.() -> Unit = {}
): Method {
    val builder = IntegrationDsl()
    builder.apply(block)
    return addMethod(httpMethod, builder.build())
}

/** The input configuration for a canary deployment. */
public inline fun CfnDeployment.setDeploymentCanarySettings(
    block: CfnDeploymentDeploymentCanarySettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeploymentDeploymentCanarySettingsPropertyDsl()
    builder.apply(block)
    return setDeploymentCanarySettings(builder.build())
}

/** The description of the Stage resource for the Deployment resource to create. */
public inline fun CfnDeployment.setStageDescription(
    block: CfnDeploymentStageDescriptionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeploymentStageDescriptionPropertyDsl()
    builder.apply(block)
    return setStageDescription(builder.build())
}

/**
 * Add a method response to this method.
 *
 * @param methodResponse
 */
public inline fun Method.addMethodResponse(block: MethodResponseDsl.() -> Unit = {}) {
    val builder = MethodResponseDsl()
    builder.apply(block)
    return addMethodResponse(builder.build())
}

/**
 * Returns the given named metric for this API method.
 *
 * @param metricName
 * @param stage
 * @param props
 */
public inline fun Method.metric(
    metricName: String,
    stage: IStage,
    block: MetricOptionsDsl.() -> Unit = {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, stage, builder.build())
}

/**
 * Metric for the number of requests served from the API cache in a given period.
 *
 * Default: - sum over 5 minutes
 *
 * @param stage
 * @param props
 */
public inline fun Method.metricCacheHitCount(
    stage: IStage,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCacheHitCount(stage, builder.build())
}

/**
 * Metric for the number of requests served from the backend in a given period, when API caching is
 * enabled.
 *
 * Default: - sum over 5 minutes
 *
 * @param stage
 * @param props
 */
public inline fun Method.metricCacheMissCount(
    stage: IStage,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCacheMissCount(stage, builder.build())
}

/**
 * Metric for the number of client-side errors captured in a given period.
 *
 * Default: - sum over 5 minutes
 *
 * @param stage
 * @param props
 */
public inline fun Method.metricClientError(
    stage: IStage,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricClientError(stage, builder.build())
}

/**
 * Metric for the total number API requests in a given period.
 *
 * Default: - sample count over 5 minutes
 *
 * @param stage
 * @param props
 */
public inline fun Method.metricCount(
    stage: IStage,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCount(stage, builder.build())
}

/**
 * Metric for the time between when API Gateway relays a request to the backend and when it receives
 * a response from the backend.
 *
 * Default: - average over 5 minutes.
 *
 * @param stage
 * @param props
 */
public inline fun Method.metricIntegrationLatency(
    stage: IStage,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricIntegrationLatency(stage, builder.build())
}

/**
 * The time between when API Gateway receives a request from a client and when it returns a response
 * to the client.
 *
 * The latency includes the integration latency and other API Gateway overhead.
 *
 * Default: - average over 5 minutes.
 *
 * @param stage
 * @param props
 */
public inline fun Method.metricLatency(
    stage: IStage,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricLatency(stage, builder.build())
}

/**
 * Metric for the number of server-side errors captured in a given period.
 *
 * Default: - sum over 5 minutes
 *
 * @param stage
 * @param props
 */
public inline fun Method.metricServerError(
    stage: IStage,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricServerError(stage, builder.build())
}

/**
 * Adds an OPTIONS method to this resource which responds to Cross-Origin Resource Sharing (CORS)
 * preflight requests.
 *
 * Cross-Origin Resource Sharing (CORS) is a mechanism that uses additional HTTP headers to tell
 * browsers to give a web application running at one origin, access to selected resources from a
 * different origin. A web application executes a cross-origin HTTP request when it requests a
 * resource that has a different origin (domain, protocol, or port) from its own.
 *
 * @param options
 */
public inline fun ResourceBase.addCorsPreflight(block: CorsOptionsDsl.() -> Unit = {}): Method {
    val builder = CorsOptionsDsl()
    builder.apply(block)
    return addCorsPreflight(builder.build())
}

/**
 * Defines a new method for this resource.
 *
 * @param httpMethod
 * @param integration
 * @param options
 */
public inline fun ResourceBase.addMethod(
    httpMethod: String,
    integration: Integration?,
    block: MethodOptionsDsl.() -> Unit = {},
): Method {
    val builder = MethodOptionsDsl()
    builder.apply(block)
    return addMethod(httpMethod, integration, builder.build())
}

/**
 * Defines a new method for this resource.
 *
 * @param httpMethod
 * @param integration
 * @param options
 */
public inline fun ResourceBase.addMethod(
    httpMethod: String,
    block: IntegrationDsl.() -> Unit = {}
): Method {
    val builder = IntegrationDsl()
    builder.apply(block)
    return addMethod(httpMethod, builder.build())
}

/**
 * Adds a greedy proxy resource ("{proxy+}") and an ANY method to this route.
 *
 * @param options
 */
public inline fun ResourceBase.addProxy(
    block: ProxyResourceOptionsDsl.() -> Unit = {}
): ProxyResource {
    val builder = ProxyResourceOptionsDsl()
    builder.apply(block)
    return addProxy(builder.build())
}

/**
 * Defines a new child resource where this resource is the parent.
 *
 * @param pathPart
 * @param options
 */
public inline fun ResourceBase.addResource(
    pathPart: String,
    block: ResourceOptionsDsl.() -> Unit = {}
): Resource {
    val builder = ResourceOptionsDsl()
    builder.apply(block)
    return addResource(pathPart, builder.build())
}

/**
 * Maps this domain to an API endpoint.
 *
 * This uses the ApiMapping from ApiGatewayV2 which supports multi-level paths, but also only
 * supports:
 * * SecurityPolicy.TLS_1_2
 * * EndpointType.REGIONAL
 *
 * @param targetStage the target API stage.
 * @param options Options for mapping to a stage.
 */
public inline fun DomainName.addApiMapping(
    targetStage: IStage,
    block: ApiMappingOptionsDsl.() -> Unit = {}
) {
    val builder = ApiMappingOptionsDsl()
    builder.apply(block)
    return addApiMapping(targetStage, builder.build())
}

/**
 * Maps this domain to an API endpoint.
 *
 * This uses the BasePathMapping from ApiGateway v1 which does not support multi-level paths.
 *
 * If you need to create a mapping for a multi-level path use `addApiMapping` instead.
 *
 * @param targetApi That target API endpoint, requests will be mapped to the deployment stage.
 * @param options Options for mapping to base path with or without a stage.
 */
public inline fun DomainName.addBasePathMapping(
    targetApi: IRestApi,
    block: BasePathMappingOptionsDsl.() -> Unit = {}
): BasePathMapping {
    val builder = BasePathMappingOptionsDsl()
    builder.apply(block)
    return addBasePathMapping(targetApi, builder.build())
}

/** Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock integration. */
public inline fun CfnMethod.setIntegration(block: CfnMethodIntegrationPropertyDsl.() -> Unit = {}) {
    val builder = CfnMethodIntegrationPropertyDsl()
    builder.apply(block)
    return setIntegration(builder.build())
}
