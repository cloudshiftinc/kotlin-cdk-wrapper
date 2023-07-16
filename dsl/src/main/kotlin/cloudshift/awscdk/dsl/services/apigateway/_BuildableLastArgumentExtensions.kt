@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.apigateway.BasePathMapping
import software.amazon.awscdk.services.apigateway.CfnAccount
import software.amazon.awscdk.services.apigateway.CfnApiKey
import software.amazon.awscdk.services.apigateway.CfnAuthorizer
import software.amazon.awscdk.services.apigateway.CfnBasePathMapping
import software.amazon.awscdk.services.apigateway.CfnClientCertificate
import software.amazon.awscdk.services.apigateway.CfnDeployment
import software.amazon.awscdk.services.apigateway.CfnDocumentationPart
import software.amazon.awscdk.services.apigateway.CfnDocumentationVersion
import software.amazon.awscdk.services.apigateway.CfnDomainName
import software.amazon.awscdk.services.apigateway.CfnGatewayResponse
import software.amazon.awscdk.services.apigateway.CfnMethod
import software.amazon.awscdk.services.apigateway.CfnModel
import software.amazon.awscdk.services.apigateway.CfnRequestValidator
import software.amazon.awscdk.services.apigateway.CfnResource
import software.amazon.awscdk.services.apigateway.CfnRestApi
import software.amazon.awscdk.services.apigateway.CfnStage
import software.amazon.awscdk.services.apigateway.CfnUsagePlan
import software.amazon.awscdk.services.apigateway.CfnUsagePlanKey
import software.amazon.awscdk.services.apigateway.CfnVpcLink
import software.amazon.awscdk.services.apigateway.DomainName
import software.amazon.awscdk.services.apigateway.GatewayResponse
import software.amazon.awscdk.services.apigateway.IApiKey
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.IStage
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.LambdaRestApi
import software.amazon.awscdk.services.apigateway.Method
import software.amazon.awscdk.services.apigateway.Model
import software.amazon.awscdk.services.apigateway.ProxyResource
import software.amazon.awscdk.services.apigateway.RequestValidator
import software.amazon.awscdk.services.apigateway.Resource
import software.amazon.awscdk.services.apigateway.RestApi
import software.amazon.awscdk.services.apigateway.SpecRestApi
import software.amazon.awscdk.services.apigateway.Stage
import software.amazon.awscdk.services.apigateway.StepFunctionsRestApi
import software.amazon.awscdk.services.apigateway.UsagePlan
import software.amazon.awscdk.services.cloudwatch.Metric

public inline fun CfnAccount.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnApiKey.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnAuthorizer.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnBasePathMapping.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnClientCertificate.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDeployment.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
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

public inline fun CfnDocumentationPart.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDocumentationPart.setLocation(block: CfnDocumentationPartLocationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnDocumentationPartLocationPropertyDsl()
  builder.apply(block)
  return setLocation(builder.build())
}

public inline fun CfnDocumentationVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDomainName.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
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

public inline fun CfnGatewayResponse.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnMethod.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnMethod.setIntegration(block: CfnMethodIntegrationPropertyDsl.() -> Unit = {}) {
  val builder = CfnMethodIntegrationPropertyDsl()
  builder.apply(block)
  return setIntegration(builder.build())
}

public inline fun CfnModel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRequestValidator.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnResource.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRestApi.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
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

public inline fun CfnStage.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
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

public inline fun CfnUsagePlan.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

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

public inline fun CfnUsagePlanKey.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVpcLink.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun DomainName.addApiMapping(arg0: IStage, block: ApiMappingOptionsDsl.() -> Unit =
    {}) {
  val builder = ApiMappingOptionsDsl()
  builder.apply(block)
  return addApiMapping(arg0,builder.build())
}

public inline fun DomainName.addBasePathMapping(arg0: IRestApi,
    block: BasePathMappingOptionsDsl.() -> Unit = {}): BasePathMapping {
  val builder = BasePathMappingOptionsDsl()
  builder.apply(block)
  return addBasePathMapping(arg0,builder.build())
}

public inline fun LambdaRestApi.addApiKey(arg0: String, block: ApiKeyOptionsDsl.() -> Unit = {}):
    IApiKey {
  val builder = ApiKeyOptionsDsl()
  builder.apply(block)
  return addApiKey(arg0,builder.build())
}

public inline fun LambdaRestApi.addDomainName(arg0: String, block: DomainNameOptionsDsl.() -> Unit =
    {}): DomainName {
  val builder = DomainNameOptionsDsl()
  builder.apply(block)
  return addDomainName(arg0,builder.build())
}

public inline fun LambdaRestApi.addGatewayResponse(arg0: String,
    block: GatewayResponseOptionsDsl.() -> Unit = {}): GatewayResponse {
  val builder = GatewayResponseOptionsDsl()
  builder.apply(block)
  return addGatewayResponse(arg0,builder.build())
}

public inline fun LambdaRestApi.addModel(arg0: String, block: ModelOptionsDsl.() -> Unit = {}):
    Model {
  val builder = ModelOptionsDsl()
  builder.apply(block)
  return addModel(arg0,builder.build())
}

public inline fun LambdaRestApi.addRequestValidator(arg0: String,
    block: RequestValidatorOptionsDsl.() -> Unit = {}): RequestValidator {
  val builder = RequestValidatorOptionsDsl()
  builder.apply(block)
  return addRequestValidator(arg0,builder.build())
}

public inline fun LambdaRestApi.addUsagePlan(arg0: String, block: UsagePlanPropsDsl.() -> Unit =
    {}): UsagePlan {
  val builder = UsagePlanPropsDsl()
  builder.apply(block)
  return addUsagePlan(arg0,builder.build())
}

public inline fun LambdaRestApi.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun LambdaRestApi.metricCacheHitCount(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheHitCount(builder.build())
}

public inline fun LambdaRestApi.metricCacheMissCount(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheMissCount(builder.build())
}

public inline fun LambdaRestApi.metricClientError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricClientError(builder.build())
}

public inline fun LambdaRestApi.metricCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCount(builder.build())
}

public inline fun LambdaRestApi.metricIntegrationLatency(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIntegrationLatency(builder.build())
}

public inline fun LambdaRestApi.metricLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricLatency(builder.build())
}

public inline fun LambdaRestApi.metricServerError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricServerError(builder.build())
}

public inline fun Method.addMethodResponse(block: MethodResponseDsl.() -> Unit = {}) {
  val builder = MethodResponseDsl()
  builder.apply(block)
  return addMethodResponse(builder.build())
}

public inline fun Method.metric(
  arg0: String,
  arg1: IStage,
  block: MetricOptionsDsl.() -> Unit = {},
): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,arg1,builder.build())
}

public inline fun Method.metricCacheHitCount(arg0: IStage, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheHitCount(arg0,builder.build())
}

public inline fun Method.metricCacheMissCount(arg0: IStage, block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheMissCount(arg0,builder.build())
}

public inline fun Method.metricClientError(arg0: IStage, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricClientError(arg0,builder.build())
}

public inline fun Method.metricCount(arg0: IStage, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCount(arg0,builder.build())
}

public inline fun Method.metricIntegrationLatency(arg0: IStage, block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIntegrationLatency(arg0,builder.build())
}

public inline fun Method.metricLatency(arg0: IStage, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricLatency(arg0,builder.build())
}

public inline fun Method.metricServerError(arg0: IStage, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricServerError(arg0,builder.build())
}

public inline fun ProxyResource.addCorsPreflight(block: CorsOptionsDsl.() -> Unit = {}): Method {
  val builder = CorsOptionsDsl()
  builder.apply(block)
  return addCorsPreflight(builder.build())
}

public inline fun ProxyResource.addMethod(
  arg0: String,
  arg1: Integration,
  block: MethodOptionsDsl.() -> Unit = {},
): Method {
  val builder = MethodOptionsDsl()
  builder.apply(block)
  return addMethod(arg0,arg1,builder.build())
}

public inline fun ProxyResource.addMethod(arg0: String, block: IntegrationDsl.() -> Unit = {}):
    Method {
  val builder = IntegrationDsl()
  builder.apply(block)
  return addMethod(arg0,builder.build())
}

public inline fun ProxyResource.addProxy(block: ProxyResourceOptionsDsl.() -> Unit = {}):
    ProxyResource {
  val builder = ProxyResourceOptionsDsl()
  builder.apply(block)
  return addProxy(builder.build())
}

public inline fun ProxyResource.addResource(arg0: String, block: ResourceOptionsDsl.() -> Unit =
    {}): Resource {
  val builder = ResourceOptionsDsl()
  builder.apply(block)
  return addResource(arg0,builder.build())
}

public inline fun Resource.addCorsPreflight(block: CorsOptionsDsl.() -> Unit = {}): Method {
  val builder = CorsOptionsDsl()
  builder.apply(block)
  return addCorsPreflight(builder.build())
}

public inline fun Resource.addMethod(
  arg0: String,
  arg1: Integration,
  block: MethodOptionsDsl.() -> Unit = {},
): Method {
  val builder = MethodOptionsDsl()
  builder.apply(block)
  return addMethod(arg0,arg1,builder.build())
}

public inline fun Resource.addMethod(arg0: String, block: IntegrationDsl.() -> Unit = {}): Method {
  val builder = IntegrationDsl()
  builder.apply(block)
  return addMethod(arg0,builder.build())
}

public inline fun Resource.addProxy(block: ProxyResourceOptionsDsl.() -> Unit = {}): ProxyResource {
  val builder = ProxyResourceOptionsDsl()
  builder.apply(block)
  return addProxy(builder.build())
}

public inline fun Resource.addResource(arg0: String, block: ResourceOptionsDsl.() -> Unit = {}):
    Resource {
  val builder = ResourceOptionsDsl()
  builder.apply(block)
  return addResource(arg0,builder.build())
}

public inline fun RestApi.addApiKey(arg0: String, block: ApiKeyOptionsDsl.() -> Unit = {}):
    IApiKey {
  val builder = ApiKeyOptionsDsl()
  builder.apply(block)
  return addApiKey(arg0,builder.build())
}

public inline fun RestApi.addDomainName(arg0: String, block: DomainNameOptionsDsl.() -> Unit = {}):
    DomainName {
  val builder = DomainNameOptionsDsl()
  builder.apply(block)
  return addDomainName(arg0,builder.build())
}

public inline fun RestApi.addGatewayResponse(arg0: String,
    block: GatewayResponseOptionsDsl.() -> Unit = {}): GatewayResponse {
  val builder = GatewayResponseOptionsDsl()
  builder.apply(block)
  return addGatewayResponse(arg0,builder.build())
}

public inline fun RestApi.addModel(arg0: String, block: ModelOptionsDsl.() -> Unit = {}): Model {
  val builder = ModelOptionsDsl()
  builder.apply(block)
  return addModel(arg0,builder.build())
}

public inline fun RestApi.addRequestValidator(arg0: String,
    block: RequestValidatorOptionsDsl.() -> Unit = {}): RequestValidator {
  val builder = RequestValidatorOptionsDsl()
  builder.apply(block)
  return addRequestValidator(arg0,builder.build())
}

public inline fun RestApi.addUsagePlan(arg0: String, block: UsagePlanPropsDsl.() -> Unit = {}):
    UsagePlan {
  val builder = UsagePlanPropsDsl()
  builder.apply(block)
  return addUsagePlan(arg0,builder.build())
}

public inline fun RestApi.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun RestApi.metricCacheHitCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheHitCount(builder.build())
}

public inline fun RestApi.metricCacheMissCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheMissCount(builder.build())
}

public inline fun RestApi.metricClientError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricClientError(builder.build())
}

public inline fun RestApi.metricCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCount(builder.build())
}

public inline fun RestApi.metricIntegrationLatency(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIntegrationLatency(builder.build())
}

public inline fun RestApi.metricLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricLatency(builder.build())
}

public inline fun RestApi.metricServerError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricServerError(builder.build())
}

public inline fun SpecRestApi.addApiKey(arg0: String, block: ApiKeyOptionsDsl.() -> Unit = {}):
    IApiKey {
  val builder = ApiKeyOptionsDsl()
  builder.apply(block)
  return addApiKey(arg0,builder.build())
}

public inline fun SpecRestApi.addDomainName(arg0: String, block: DomainNameOptionsDsl.() -> Unit =
    {}): DomainName {
  val builder = DomainNameOptionsDsl()
  builder.apply(block)
  return addDomainName(arg0,builder.build())
}

public inline fun SpecRestApi.addGatewayResponse(arg0: String,
    block: GatewayResponseOptionsDsl.() -> Unit = {}): GatewayResponse {
  val builder = GatewayResponseOptionsDsl()
  builder.apply(block)
  return addGatewayResponse(arg0,builder.build())
}

public inline fun SpecRestApi.addUsagePlan(arg0: String, block: UsagePlanPropsDsl.() -> Unit = {}):
    UsagePlan {
  val builder = UsagePlanPropsDsl()
  builder.apply(block)
  return addUsagePlan(arg0,builder.build())
}

public inline fun SpecRestApi.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun SpecRestApi.metricCacheHitCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheHitCount(builder.build())
}

public inline fun SpecRestApi.metricCacheMissCount(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheMissCount(builder.build())
}

public inline fun SpecRestApi.metricClientError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricClientError(builder.build())
}

public inline fun SpecRestApi.metricCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCount(builder.build())
}

public inline fun SpecRestApi.metricIntegrationLatency(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIntegrationLatency(builder.build())
}

public inline fun SpecRestApi.metricLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricLatency(builder.build())
}

public inline fun SpecRestApi.metricServerError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricServerError(builder.build())
}

public inline fun Stage.addApiKey(arg0: String, block: ApiKeyOptionsDsl.() -> Unit = {}): IApiKey {
  val builder = ApiKeyOptionsDsl()
  builder.apply(block)
  return addApiKey(arg0,builder.build())
}

public inline fun Stage.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun Stage.metricCacheHitCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheHitCount(builder.build())
}

public inline fun Stage.metricCacheMissCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheMissCount(builder.build())
}

public inline fun Stage.metricClientError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricClientError(builder.build())
}

public inline fun Stage.metricCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCount(builder.build())
}

public inline fun Stage.metricIntegrationLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIntegrationLatency(builder.build())
}

public inline fun Stage.metricLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricLatency(builder.build())
}

public inline fun Stage.metricServerError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricServerError(builder.build())
}

public inline fun StepFunctionsRestApi.addApiKey(arg0: String, block: ApiKeyOptionsDsl.() -> Unit =
    {}): IApiKey {
  val builder = ApiKeyOptionsDsl()
  builder.apply(block)
  return addApiKey(arg0,builder.build())
}

public inline fun StepFunctionsRestApi.addDomainName(arg0: String,
    block: DomainNameOptionsDsl.() -> Unit = {}): DomainName {
  val builder = DomainNameOptionsDsl()
  builder.apply(block)
  return addDomainName(arg0,builder.build())
}

public inline fun StepFunctionsRestApi.addGatewayResponse(arg0: String,
    block: GatewayResponseOptionsDsl.() -> Unit = {}): GatewayResponse {
  val builder = GatewayResponseOptionsDsl()
  builder.apply(block)
  return addGatewayResponse(arg0,builder.build())
}

public inline fun StepFunctionsRestApi.addModel(arg0: String, block: ModelOptionsDsl.() -> Unit =
    {}): Model {
  val builder = ModelOptionsDsl()
  builder.apply(block)
  return addModel(arg0,builder.build())
}

public inline fun StepFunctionsRestApi.addRequestValidator(arg0: String,
    block: RequestValidatorOptionsDsl.() -> Unit = {}): RequestValidator {
  val builder = RequestValidatorOptionsDsl()
  builder.apply(block)
  return addRequestValidator(arg0,builder.build())
}

public inline fun StepFunctionsRestApi.addUsagePlan(arg0: String,
    block: UsagePlanPropsDsl.() -> Unit = {}): UsagePlan {
  val builder = UsagePlanPropsDsl()
  builder.apply(block)
  return addUsagePlan(arg0,builder.build())
}

public inline fun StepFunctionsRestApi.metric(arg0: String, block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun StepFunctionsRestApi.metricCacheHitCount(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheHitCount(builder.build())
}

public inline fun StepFunctionsRestApi.metricCacheMissCount(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCacheMissCount(builder.build())
}

public inline fun StepFunctionsRestApi.metricClientError(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricClientError(builder.build())
}

public inline fun StepFunctionsRestApi.metricCount(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCount(builder.build())
}

public inline fun StepFunctionsRestApi.metricIntegrationLatency(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIntegrationLatency(builder.build())
}

public inline fun StepFunctionsRestApi.metricLatency(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricLatency(builder.build())
}

public inline fun StepFunctionsRestApi.metricServerError(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricServerError(builder.build())
}

public inline fun UsagePlan.addApiKey(arg0: IApiKey, block: AddApiKeyOptionsDsl.() -> Unit = {}) {
  val builder = AddApiKeyOptionsDsl()
  builder.apply(block)
  return addApiKey(arg0,builder.build())
}

public inline fun UsagePlan.addApiStage(block: UsagePlanPerApiStageDsl.() -> Unit = {}) {
  val builder = UsagePlanPerApiStageDsl()
  builder.apply(block)
  return addApiStage(builder.build())
}
