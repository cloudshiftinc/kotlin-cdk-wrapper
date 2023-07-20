@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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

public inline fun CfnUsagePlan.setQuota(block: CfnUsagePlanQuotaSettingsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnUsagePlanQuotaSettingsPropertyDsl()
  builder.apply(block)
  return setQuota(builder.build())
}

public inline fun CfnUsagePlan.setThrottle(block: CfnUsagePlanThrottleSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnUsagePlanThrottleSettingsPropertyDsl()
  builder.apply(block)
  return setThrottle(builder.build())
}

public inline fun StageBase.addApiKey(id: String, block: ApiKeyOptionsDsl.() -> Unit = {}):
    IApiKey {
  val builder = ApiKeyOptionsDsl()
  builder.apply(block)
  return addApiKey(id, builder.build())
}

public inline fun StageBase.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

public inline fun StageBase.metricCacheHitCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheHitCount(builder.build())
}

public inline fun StageBase.metricCacheMissCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheMissCount(builder.build())
}

public inline fun StageBase.metricClientError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricClientError(builder.build())
}

public inline fun StageBase.metricCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCount(builder.build())
}

public inline fun StageBase.metricIntegrationLatency(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIntegrationLatency(builder.build())
}

public inline fun StageBase.metricLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricLatency(builder.build())
}

public inline fun StageBase.metricServerError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricServerError(builder.build())
}

public inline fun IStage.addApiKey(arg0: String, block: ApiKeyOptionsDsl.() -> Unit = {}): IApiKey {
  val builder = ApiKeyOptionsDsl()
  builder.apply(block)
  return addApiKey(arg0, builder.build())
}

public inline fun CfnRestApi.setBodyS3Location(block: CfnRestApiS3LocationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnRestApiS3LocationPropertyDsl()
  builder.apply(block)
  return setBodyS3Location(builder.build())
}

public inline
    fun CfnRestApi.setEndpointConfiguration(block: CfnRestApiEndpointConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnRestApiEndpointConfigurationPropertyDsl()
  builder.apply(block)
  return setEndpointConfiguration(builder.build())
}

public inline fun IResource.addCorsPreflight(block: CorsOptionsDsl.() -> Unit = {}): Method {
  val builder = CorsOptionsDsl()
  builder.apply(block)
  return addCorsPreflight(builder.build())
}

public inline fun IResource.addMethod(
  arg0: String,
  arg1: Integration,
  block: MethodOptionsDsl.() -> Unit = {},
): Method {
  val builder = MethodOptionsDsl()
  builder.apply(block)
  return addMethod(arg0, arg1, builder.build())
}

public inline fun IResource.addMethod(arg0: String, block: IntegrationDsl.() -> Unit = {}): Method {
  val builder = IntegrationDsl()
  builder.apply(block)
  return addMethod(arg0, builder.build())
}

public inline fun IResource.addProxy(block: ProxyResourceOptionsDsl.() -> Unit = {}):
    ProxyResource {
  val builder = ProxyResourceOptionsDsl()
  builder.apply(block)
  return addProxy(builder.build())
}

public inline fun IResource.addResource(arg0: String, block: ResourceOptionsDsl.() -> Unit = {}):
    Resource {
  val builder = ResourceOptionsDsl()
  builder.apply(block)
  return addResource(arg0, builder.build())
}

public inline fun IUsagePlan.addApiKey(arg0: IApiKey, block: AddApiKeyOptionsDsl.() -> Unit = {}) {
  val builder = AddApiKeyOptionsDsl()
  builder.apply(block)
  return addApiKey(arg0, builder.build())
}

public inline fun UsagePlan.addApiKey(apiKey: IApiKey, block: AddApiKeyOptionsDsl.() -> Unit = {}) {
  val builder = AddApiKeyOptionsDsl()
  builder.apply(block)
  return addApiKey(apiKey, builder.build())
}

public inline fun UsagePlan.addApiStage(block: UsagePlanPerApiStageDsl.() -> Unit = {}) {
  val builder = UsagePlanPerApiStageDsl()
  builder.apply(block)
  return addApiStage(builder.build())
}

public inline fun DomainName.addApiMapping(targetStage: IStage,
    block: ApiMappingOptionsDsl.() -> Unit = {}) {
  val builder = ApiMappingOptionsDsl()
  builder.apply(block)
  return addApiMapping(targetStage, builder.build())
}

public inline fun DomainName.addBasePathMapping(targetApi: IRestApi,
    block: BasePathMappingOptionsDsl.() -> Unit = {}): BasePathMapping {
  val builder = BasePathMappingOptionsDsl()
  builder.apply(block)
  return addBasePathMapping(targetApi, builder.build())
}

public inline fun Method.addMethodResponse(block: MethodResponseDsl.() -> Unit = {}) {
  val builder = MethodResponseDsl()
  builder.apply(block)
  return addMethodResponse(builder.build())
}

public inline fun Method.metric(
  metricName: String,
  stage: IStage,
  block: MetricOptionsDsl.() -> Unit = {},
): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, stage, builder.build())
}

public inline fun Method.metricCacheHitCount(stage: IStage, block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheHitCount(stage, builder.build())
}

public inline fun Method.metricCacheMissCount(stage: IStage, block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheMissCount(stage, builder.build())
}

public inline fun Method.metricClientError(stage: IStage, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricClientError(stage, builder.build())
}

public inline fun Method.metricCount(stage: IStage, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCount(stage, builder.build())
}

public inline fun Method.metricIntegrationLatency(stage: IStage, block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIntegrationLatency(stage, builder.build())
}

public inline fun Method.metricLatency(stage: IStage, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricLatency(stage, builder.build())
}

public inline fun Method.metricServerError(stage: IStage, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricServerError(stage, builder.build())
}

public inline fun CfnStage.setAccessLogSetting(block: CfnStageAccessLogSettingPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStageAccessLogSettingPropertyDsl()
  builder.apply(block)
  return setAccessLogSetting(builder.build())
}

public inline fun CfnStage.setCanarySetting(block: CfnStageCanarySettingPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnStageCanarySettingPropertyDsl()
  builder.apply(block)
  return setCanarySetting(builder.build())
}

public inline fun ResourceBase.addCorsPreflight(block: CorsOptionsDsl.() -> Unit = {}): Method {
  val builder = CorsOptionsDsl()
  builder.apply(block)
  return addCorsPreflight(builder.build())
}

public inline fun ResourceBase.addMethod(
  httpMethod: String,
  integration: Integration,
  block: MethodOptionsDsl.() -> Unit = {},
): Method {
  val builder = MethodOptionsDsl()
  builder.apply(block)
  return addMethod(httpMethod, integration, builder.build())
}

public inline fun ResourceBase.addMethod(httpMethod: String, block: IntegrationDsl.() -> Unit = {}):
    Method {
  val builder = IntegrationDsl()
  builder.apply(block)
  return addMethod(httpMethod, builder.build())
}

public inline fun ResourceBase.addProxy(block: ProxyResourceOptionsDsl.() -> Unit = {}):
    ProxyResource {
  val builder = ProxyResourceOptionsDsl()
  builder.apply(block)
  return addProxy(builder.build())
}

public inline fun ResourceBase.addResource(pathPart: String, block: ResourceOptionsDsl.() -> Unit =
    {}): Resource {
  val builder = ResourceOptionsDsl()
  builder.apply(block)
  return addResource(pathPart, builder.build())
}

public inline fun CfnMethod.setIntegration(block: CfnMethodIntegrationPropertyDsl.() -> Unit = {}) {
  val builder = CfnMethodIntegrationPropertyDsl()
  builder.apply(block)
  return setIntegration(builder.build())
}

public inline
    fun CfnDocumentationPart.setLocation(block: CfnDocumentationPartLocationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnDocumentationPartLocationPropertyDsl()
  builder.apply(block)
  return setLocation(builder.build())
}

public inline fun RestApi.addModel(id: String, block: ModelOptionsDsl.() -> Unit = {}): Model {
  val builder = ModelOptionsDsl()
  builder.apply(block)
  return addModel(id, builder.build())
}

public inline fun RestApi.addRequestValidator(id: String,
    block: RequestValidatorOptionsDsl.() -> Unit = {}): RequestValidator {
  val builder = RequestValidatorOptionsDsl()
  builder.apply(block)
  return addRequestValidator(id, builder.build())
}

public inline fun RestApiBase.addApiKey(id: String, block: ApiKeyOptionsDsl.() -> Unit = {}):
    IApiKey {
  val builder = ApiKeyOptionsDsl()
  builder.apply(block)
  return addApiKey(id, builder.build())
}

public inline fun RestApiBase.addDomainName(id: String, block: DomainNameOptionsDsl.() -> Unit =
    {}): DomainName {
  val builder = DomainNameOptionsDsl()
  builder.apply(block)
  return addDomainName(id, builder.build())
}

public inline fun RestApiBase.addGatewayResponse(id: String,
    block: GatewayResponseOptionsDsl.() -> Unit = {}): GatewayResponse {
  val builder = GatewayResponseOptionsDsl()
  builder.apply(block)
  return addGatewayResponse(id, builder.build())
}

public inline fun RestApiBase.addUsagePlan(id: String, block: UsagePlanPropsDsl.() -> Unit = {}):
    UsagePlan {
  val builder = UsagePlanPropsDsl()
  builder.apply(block)
  return addUsagePlan(id, builder.build())
}

public inline fun RestApiBase.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

public inline fun RestApiBase.metricCacheHitCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheHitCount(builder.build())
}

public inline fun RestApiBase.metricCacheMissCount(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheMissCount(builder.build())
}

public inline fun RestApiBase.metricClientError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricClientError(builder.build())
}

public inline fun RestApiBase.metricCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCount(builder.build())
}

public inline fun RestApiBase.metricIntegrationLatency(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIntegrationLatency(builder.build())
}

public inline fun RestApiBase.metricLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricLatency(builder.build())
}

public inline fun RestApiBase.metricServerError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricServerError(builder.build())
}

public inline
    fun CfnDeployment.setDeploymentCanarySettings(block: CfnDeploymentDeploymentCanarySettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeploymentDeploymentCanarySettingsPropertyDsl()
  builder.apply(block)
  return setDeploymentCanarySettings(builder.build())
}

public inline
    fun CfnDeployment.setStageDescription(block: CfnDeploymentStageDescriptionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeploymentStageDescriptionPropertyDsl()
  builder.apply(block)
  return setStageDescription(builder.build())
}

public inline
    fun CfnDomainName.setEndpointConfiguration(block: CfnDomainNameEndpointConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDomainNameEndpointConfigurationPropertyDsl()
  builder.apply(block)
  return setEndpointConfiguration(builder.build())
}

public inline
    fun CfnDomainName.setMutualTlsAuthentication(block: CfnDomainNameMutualTlsAuthenticationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDomainNameMutualTlsAuthenticationPropertyDsl()
  builder.apply(block)
  return setMutualTlsAuthentication(builder.build())
}

public inline fun ProxyResource.addMethod(
  httpMethod: String,
  integration: Integration,
  block: MethodOptionsDsl.() -> Unit = {},
): Method {
  val builder = MethodOptionsDsl()
  builder.apply(block)
  return addMethod(httpMethod, integration, builder.build())
}

public inline fun ProxyResource.addMethod(httpMethod: String, block: IntegrationDsl.() -> Unit =
    {}): Method {
  val builder = IntegrationDsl()
  builder.apply(block)
  return addMethod(httpMethod, builder.build())
}
