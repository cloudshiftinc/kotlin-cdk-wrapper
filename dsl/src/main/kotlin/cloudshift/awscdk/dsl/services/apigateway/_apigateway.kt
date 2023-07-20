@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig
import software.amazon.awscdk.services.apigateway.AddApiKeyOptions
import software.amazon.awscdk.services.apigateway.ApiDefinitionConfig
import software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location
import software.amazon.awscdk.services.apigateway.ApiKey
import software.amazon.awscdk.services.apigateway.ApiKeyOptions
import software.amazon.awscdk.services.apigateway.ApiKeyProps
import software.amazon.awscdk.services.apigateway.ApiMappingOptions
import software.amazon.awscdk.services.apigateway.AssetApiDefinition
import software.amazon.awscdk.services.apigateway.AwsIntegration
import software.amazon.awscdk.services.apigateway.AwsIntegrationProps
import software.amazon.awscdk.services.apigateway.BasePathMapping
import software.amazon.awscdk.services.apigateway.BasePathMappingOptions
import software.amazon.awscdk.services.apigateway.BasePathMappingProps
import software.amazon.awscdk.services.apigateway.CfnAccount
import software.amazon.awscdk.services.apigateway.CfnAccountProps
import software.amazon.awscdk.services.apigateway.CfnApiKey
import software.amazon.awscdk.services.apigateway.CfnApiKeyProps
import software.amazon.awscdk.services.apigateway.CfnAuthorizer
import software.amazon.awscdk.services.apigateway.CfnAuthorizerProps
import software.amazon.awscdk.services.apigateway.CfnBasePathMapping
import software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps
import software.amazon.awscdk.services.apigateway.CfnClientCertificate
import software.amazon.awscdk.services.apigateway.CfnClientCertificateProps
import software.amazon.awscdk.services.apigateway.CfnDeployment
import software.amazon.awscdk.services.apigateway.CfnDeploymentProps
import software.amazon.awscdk.services.apigateway.CfnDocumentationPart
import software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps
import software.amazon.awscdk.services.apigateway.CfnDocumentationVersion
import software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps
import software.amazon.awscdk.services.apigateway.CfnDomainName
import software.amazon.awscdk.services.apigateway.CfnDomainNameProps
import software.amazon.awscdk.services.apigateway.CfnGatewayResponse
import software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps
import software.amazon.awscdk.services.apigateway.CfnMethod
import software.amazon.awscdk.services.apigateway.CfnMethodProps
import software.amazon.awscdk.services.apigateway.CfnModel
import software.amazon.awscdk.services.apigateway.CfnModelProps
import software.amazon.awscdk.services.apigateway.CfnRequestValidator
import software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps
import software.amazon.awscdk.services.apigateway.CfnResource
import software.amazon.awscdk.services.apigateway.CfnResourceProps
import software.amazon.awscdk.services.apigateway.CfnRestApi
import software.amazon.awscdk.services.apigateway.CfnRestApiProps
import software.amazon.awscdk.services.apigateway.CfnStage
import software.amazon.awscdk.services.apigateway.CfnStageProps
import software.amazon.awscdk.services.apigateway.CfnUsagePlan
import software.amazon.awscdk.services.apigateway.CfnUsagePlanKey
import software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps
import software.amazon.awscdk.services.apigateway.CfnUsagePlanProps
import software.amazon.awscdk.services.apigateway.CfnVpcLink
import software.amazon.awscdk.services.apigateway.CfnVpcLinkProps
import software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer
import software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps
import software.amazon.awscdk.services.apigateway.CorsOptions
import software.amazon.awscdk.services.apigateway.Deployment
import software.amazon.awscdk.services.apigateway.DeploymentProps
import software.amazon.awscdk.services.apigateway.DomainName
import software.amazon.awscdk.services.apigateway.DomainNameAttributes
import software.amazon.awscdk.services.apigateway.DomainNameOptions
import software.amazon.awscdk.services.apigateway.DomainNameProps
import software.amazon.awscdk.services.apigateway.EndpointConfiguration
import software.amazon.awscdk.services.apigateway.GatewayResponse
import software.amazon.awscdk.services.apigateway.GatewayResponseOptions
import software.amazon.awscdk.services.apigateway.GatewayResponseProps
import software.amazon.awscdk.services.apigateway.HttpIntegration
import software.amazon.awscdk.services.apigateway.HttpIntegrationProps
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.IntegrationConfig
import software.amazon.awscdk.services.apigateway.IntegrationOptions
import software.amazon.awscdk.services.apigateway.IntegrationProps
import software.amazon.awscdk.services.apigateway.IntegrationResponse
import software.amazon.awscdk.services.apigateway.JsonSchema
import software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps
import software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps
import software.amazon.awscdk.services.apigateway.LambdaIntegration
import software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions
import software.amazon.awscdk.services.apigateway.LambdaRestApi
import software.amazon.awscdk.services.apigateway.LambdaRestApiProps
import software.amazon.awscdk.services.apigateway.MTLSConfig
import software.amazon.awscdk.services.apigateway.Method
import software.amazon.awscdk.services.apigateway.MethodDeploymentOptions
import software.amazon.awscdk.services.apigateway.MethodOptions
import software.amazon.awscdk.services.apigateway.MethodProps
import software.amazon.awscdk.services.apigateway.MethodResponse
import software.amazon.awscdk.services.apigateway.MockIntegration
import software.amazon.awscdk.services.apigateway.Model
import software.amazon.awscdk.services.apigateway.ModelOptions
import software.amazon.awscdk.services.apigateway.ModelProps
import software.amazon.awscdk.services.apigateway.ProxyResource
import software.amazon.awscdk.services.apigateway.ProxyResourceOptions
import software.amazon.awscdk.services.apigateway.ProxyResourceProps
import software.amazon.awscdk.services.apigateway.QuotaSettings
import software.amazon.awscdk.services.apigateway.RateLimitedApiKey
import software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps
import software.amazon.awscdk.services.apigateway.RequestAuthorizer
import software.amazon.awscdk.services.apigateway.RequestAuthorizerProps
import software.amazon.awscdk.services.apigateway.RequestContext
import software.amazon.awscdk.services.apigateway.RequestValidator
import software.amazon.awscdk.services.apigateway.RequestValidatorOptions
import software.amazon.awscdk.services.apigateway.RequestValidatorProps
import software.amazon.awscdk.services.apigateway.Resource
import software.amazon.awscdk.services.apigateway.ResourceAttributes
import software.amazon.awscdk.services.apigateway.ResourceOptions
import software.amazon.awscdk.services.apigateway.ResourceProps
import software.amazon.awscdk.services.apigateway.RestApi
import software.amazon.awscdk.services.apigateway.RestApiAttributes
import software.amazon.awscdk.services.apigateway.RestApiBaseProps
import software.amazon.awscdk.services.apigateway.RestApiProps
import software.amazon.awscdk.services.apigateway.SpecRestApi
import software.amazon.awscdk.services.apigateway.SpecRestApiProps
import software.amazon.awscdk.services.apigateway.Stage
import software.amazon.awscdk.services.apigateway.StageAttributes
import software.amazon.awscdk.services.apigateway.StageOptions
import software.amazon.awscdk.services.apigateway.StageProps
import software.amazon.awscdk.services.apigateway.StepFunctionsExecutionIntegrationOptions
import software.amazon.awscdk.services.apigateway.StepFunctionsRestApi
import software.amazon.awscdk.services.apigateway.StepFunctionsRestApiProps
import software.amazon.awscdk.services.apigateway.ThrottleSettings
import software.amazon.awscdk.services.apigateway.ThrottlingPerMethod
import software.amazon.awscdk.services.apigateway.TokenAuthorizer
import software.amazon.awscdk.services.apigateway.TokenAuthorizerProps
import software.amazon.awscdk.services.apigateway.UsagePlan
import software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage
import software.amazon.awscdk.services.apigateway.UsagePlanProps
import software.amazon.awscdk.services.apigateway.VpcLink
import software.amazon.awscdk.services.apigateway.VpcLinkProps
import software.amazon.awscdk.services.lambda.IFunction
import software.constructs.Construct

public object apigateway {
  public inline fun accessLogDestinationConfig(block: AccessLogDestinationConfigDsl.() -> Unit =
      {}): AccessLogDestinationConfig {
    val builder = AccessLogDestinationConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun addApiKeyOptions(block: AddApiKeyOptionsDsl.() -> Unit = {}): AddApiKeyOptions {
    val builder = AddApiKeyOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun apiDefinitionConfig(block: ApiDefinitionConfigDsl.() -> Unit = {}):
      ApiDefinitionConfig {
    val builder = ApiDefinitionConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun apiDefinitionS3Location(block: ApiDefinitionS3LocationDsl.() -> Unit = {}):
      ApiDefinitionS3Location {
    val builder = ApiDefinitionS3LocationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun apiKey(
    scope: Construct,
    id: String,
    block: ApiKeyDsl.() -> Unit = {},
  ): ApiKey {
    val builder = ApiKeyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun apiKeyOptions(block: ApiKeyOptionsDsl.() -> Unit = {}): ApiKeyOptions {
    val builder = ApiKeyOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun apiKeyProps(block: ApiKeyPropsDsl.() -> Unit = {}): ApiKeyProps {
    val builder = ApiKeyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun apiMappingOptions(block: ApiMappingOptionsDsl.() -> Unit = {}):
      ApiMappingOptions {
    val builder = ApiMappingOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun assetApiDefinition(path: String, block: AssetApiDefinitionDsl.() -> Unit = {}):
      AssetApiDefinition {
    val builder = AssetApiDefinitionDsl(path)
    builder.apply(block)
    return builder.build()
  }

  public inline fun awsIntegration(block: AwsIntegrationDsl.() -> Unit = {}): AwsIntegration {
    val builder = AwsIntegrationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun awsIntegrationProps(block: AwsIntegrationPropsDsl.() -> Unit = {}):
      AwsIntegrationProps {
    val builder = AwsIntegrationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun basePathMapping(
    scope: Construct,
    id: String,
    block: BasePathMappingDsl.() -> Unit = {},
  ): BasePathMapping {
    val builder = BasePathMappingDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun basePathMappingOptions(block: BasePathMappingOptionsDsl.() -> Unit = {}):
      BasePathMappingOptions {
    val builder = BasePathMappingOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun basePathMappingProps(block: BasePathMappingPropsDsl.() -> Unit = {}):
      BasePathMappingProps {
    val builder = BasePathMappingPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAccount(
    scope: Construct,
    id: String,
    block: CfnAccountDsl.() -> Unit = {},
  ): CfnAccount {
    val builder = CfnAccountDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAccountProps(block: CfnAccountPropsDsl.() -> Unit = {}): CfnAccountProps {
    val builder = CfnAccountPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiKey(
    scope: Construct,
    id: String,
    block: CfnApiKeyDsl.() -> Unit = {},
  ): CfnApiKey {
    val builder = CfnApiKeyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiKeyProps(block: CfnApiKeyPropsDsl.() -> Unit = {}): CfnApiKeyProps {
    val builder = CfnApiKeyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiKeyStageKeyProperty(block: CfnApiKeyStageKeyPropertyDsl.() -> Unit = {}):
      CfnApiKey.StageKeyProperty {
    val builder = CfnApiKeyStageKeyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAuthorizer(
    scope: Construct,
    id: String,
    block: CfnAuthorizerDsl.() -> Unit = {},
  ): CfnAuthorizer {
    val builder = CfnAuthorizerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAuthorizerProps(block: CfnAuthorizerPropsDsl.() -> Unit = {}):
      CfnAuthorizerProps {
    val builder = CfnAuthorizerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBasePathMapping(
    scope: Construct,
    id: String,
    block: CfnBasePathMappingDsl.() -> Unit = {},
  ): CfnBasePathMapping {
    val builder = CfnBasePathMappingDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBasePathMappingProps(block: CfnBasePathMappingPropsDsl.() -> Unit = {}):
      CfnBasePathMappingProps {
    val builder = CfnBasePathMappingPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnClientCertificate(
    scope: Construct,
    id: String,
    block: CfnClientCertificateDsl.() -> Unit = {},
  ): CfnClientCertificate {
    val builder = CfnClientCertificateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnClientCertificateProps(block: CfnClientCertificatePropsDsl.() -> Unit = {}):
      CfnClientCertificateProps {
    val builder = CfnClientCertificatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeployment(
    scope: Construct,
    id: String,
    block: CfnDeploymentDsl.() -> Unit = {},
  ): CfnDeployment {
    val builder = CfnDeploymentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeploymentAccessLogSettingProperty(block: CfnDeploymentAccessLogSettingPropertyDsl.() -> Unit
      = {}): CfnDeployment.AccessLogSettingProperty {
    val builder = CfnDeploymentAccessLogSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeploymentCanarySettingProperty(block: CfnDeploymentCanarySettingPropertyDsl.() -> Unit
      = {}): CfnDeployment.CanarySettingProperty {
    val builder = CfnDeploymentCanarySettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeploymentDeploymentCanarySettingsProperty(block: CfnDeploymentDeploymentCanarySettingsPropertyDsl.() -> Unit
      = {}): CfnDeployment.DeploymentCanarySettingsProperty {
    val builder = CfnDeploymentDeploymentCanarySettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeploymentMethodSettingProperty(block: CfnDeploymentMethodSettingPropertyDsl.() -> Unit
      = {}): CfnDeployment.MethodSettingProperty {
    val builder = CfnDeploymentMethodSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeploymentProps(block: CfnDeploymentPropsDsl.() -> Unit = {}):
      CfnDeploymentProps {
    val builder = CfnDeploymentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeploymentStageDescriptionProperty(block: CfnDeploymentStageDescriptionPropertyDsl.() -> Unit
      = {}): CfnDeployment.StageDescriptionProperty {
    val builder = CfnDeploymentStageDescriptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDocumentationPart(
    scope: Construct,
    id: String,
    block: CfnDocumentationPartDsl.() -> Unit = {},
  ): CfnDocumentationPart {
    val builder = CfnDocumentationPartDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDocumentationPartLocationProperty(block: CfnDocumentationPartLocationPropertyDsl.() -> Unit
      = {}): CfnDocumentationPart.LocationProperty {
    val builder = CfnDocumentationPartLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDocumentationPartProps(block: CfnDocumentationPartPropsDsl.() -> Unit = {}):
      CfnDocumentationPartProps {
    val builder = CfnDocumentationPartPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDocumentationVersion(
    scope: Construct,
    id: String,
    block: CfnDocumentationVersionDsl.() -> Unit = {},
  ): CfnDocumentationVersion {
    val builder = CfnDocumentationVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDocumentationVersionProps(block: CfnDocumentationVersionPropsDsl.() -> Unit =
      {}): CfnDocumentationVersionProps {
    val builder = CfnDocumentationVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDomainName(
    scope: Construct,
    id: String,
    block: CfnDomainNameDsl.() -> Unit = {},
  ): CfnDomainName {
    val builder = CfnDomainNameDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainNameEndpointConfigurationProperty(block: CfnDomainNameEndpointConfigurationPropertyDsl.() -> Unit
      = {}): CfnDomainName.EndpointConfigurationProperty {
    val builder = CfnDomainNameEndpointConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainNameMutualTlsAuthenticationProperty(block: CfnDomainNameMutualTlsAuthenticationPropertyDsl.() -> Unit
      = {}): CfnDomainName.MutualTlsAuthenticationProperty {
    val builder = CfnDomainNameMutualTlsAuthenticationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDomainNameProps(block: CfnDomainNamePropsDsl.() -> Unit = {}):
      CfnDomainNameProps {
    val builder = CfnDomainNamePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGatewayResponse(
    scope: Construct,
    id: String,
    block: CfnGatewayResponseDsl.() -> Unit = {},
  ): CfnGatewayResponse {
    val builder = CfnGatewayResponseDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGatewayResponseProps(block: CfnGatewayResponsePropsDsl.() -> Unit = {}):
      CfnGatewayResponseProps {
    val builder = CfnGatewayResponsePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMethod(
    scope: Construct,
    id: String,
    block: CfnMethodDsl.() -> Unit = {},
  ): CfnMethod {
    val builder = CfnMethodDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMethodIntegrationProperty(block: CfnMethodIntegrationPropertyDsl.() -> Unit =
      {}): CfnMethod.IntegrationProperty {
    val builder = CfnMethodIntegrationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMethodIntegrationResponseProperty(block: CfnMethodIntegrationResponsePropertyDsl.() -> Unit
      = {}): CfnMethod.IntegrationResponseProperty {
    val builder = CfnMethodIntegrationResponsePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMethodMethodResponseProperty(block: CfnMethodMethodResponsePropertyDsl.() -> Unit =
      {}): CfnMethod.MethodResponseProperty {
    val builder = CfnMethodMethodResponsePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMethodProps(block: CfnMethodPropsDsl.() -> Unit = {}): CfnMethodProps {
    val builder = CfnMethodPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModel(
    scope: Construct,
    id: String,
    block: CfnModelDsl.() -> Unit = {},
  ): CfnModel {
    val builder = CfnModelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelProps(block: CfnModelPropsDsl.() -> Unit = {}): CfnModelProps {
    val builder = CfnModelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRequestValidator(
    scope: Construct,
    id: String,
    block: CfnRequestValidatorDsl.() -> Unit = {},
  ): CfnRequestValidator {
    val builder = CfnRequestValidatorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRequestValidatorProps(block: CfnRequestValidatorPropsDsl.() -> Unit = {}):
      CfnRequestValidatorProps {
    val builder = CfnRequestValidatorPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResource(
    scope: Construct,
    id: String,
    block: CfnResourceDsl.() -> Unit = {},
  ): CfnResource {
    val builder = CfnResourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceProps(block: CfnResourcePropsDsl.() -> Unit = {}): CfnResourceProps {
    val builder = CfnResourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRestApi(
    scope: Construct,
    id: String,
    block: CfnRestApiDsl.() -> Unit = {},
  ): CfnRestApi {
    val builder = CfnRestApiDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRestApiEndpointConfigurationProperty(block: CfnRestApiEndpointConfigurationPropertyDsl.() -> Unit
      = {}): CfnRestApi.EndpointConfigurationProperty {
    val builder = CfnRestApiEndpointConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRestApiProps(block: CfnRestApiPropsDsl.() -> Unit = {}): CfnRestApiProps {
    val builder = CfnRestApiPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRestApiS3LocationProperty(block: CfnRestApiS3LocationPropertyDsl.() -> Unit =
      {}): CfnRestApi.S3LocationProperty {
    val builder = CfnRestApiS3LocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStage(
    scope: Construct,
    id: String,
    block: CfnStageDsl.() -> Unit = {},
  ): CfnStage {
    val builder = CfnStageDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStageAccessLogSettingProperty(block: CfnStageAccessLogSettingPropertyDsl.() -> Unit =
      {}): CfnStage.AccessLogSettingProperty {
    val builder = CfnStageAccessLogSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStageCanarySettingProperty(block: CfnStageCanarySettingPropertyDsl.() -> Unit
      = {}): CfnStage.CanarySettingProperty {
    val builder = CfnStageCanarySettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStageMethodSettingProperty(block: CfnStageMethodSettingPropertyDsl.() -> Unit
      = {}): CfnStage.MethodSettingProperty {
    val builder = CfnStageMethodSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStageProps(block: CfnStagePropsDsl.() -> Unit = {}): CfnStageProps {
    val builder = CfnStagePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUsagePlan(
    scope: Construct,
    id: String,
    block: CfnUsagePlanDsl.() -> Unit = {},
  ): CfnUsagePlan {
    val builder = CfnUsagePlanDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUsagePlanApiStageProperty(block: CfnUsagePlanApiStagePropertyDsl.() -> Unit =
      {}): CfnUsagePlan.ApiStageProperty {
    val builder = CfnUsagePlanApiStagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUsagePlanKey(
    scope: Construct,
    id: String,
    block: CfnUsagePlanKeyDsl.() -> Unit = {},
  ): CfnUsagePlanKey {
    val builder = CfnUsagePlanKeyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUsagePlanKeyProps(block: CfnUsagePlanKeyPropsDsl.() -> Unit = {}):
      CfnUsagePlanKeyProps {
    val builder = CfnUsagePlanKeyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUsagePlanProps(block: CfnUsagePlanPropsDsl.() -> Unit = {}):
      CfnUsagePlanProps {
    val builder = CfnUsagePlanPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUsagePlanQuotaSettingsProperty(block: CfnUsagePlanQuotaSettingsPropertyDsl.() -> Unit =
      {}): CfnUsagePlan.QuotaSettingsProperty {
    val builder = CfnUsagePlanQuotaSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUsagePlanThrottleSettingsProperty(block: CfnUsagePlanThrottleSettingsPropertyDsl.() -> Unit
      = {}): CfnUsagePlan.ThrottleSettingsProperty {
    val builder = CfnUsagePlanThrottleSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVpcLink(
    scope: Construct,
    id: String,
    block: CfnVpcLinkDsl.() -> Unit = {},
  ): CfnVpcLink {
    val builder = CfnVpcLinkDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVpcLinkProps(block: CfnVpcLinkPropsDsl.() -> Unit = {}): CfnVpcLinkProps {
    val builder = CfnVpcLinkPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cognitoUserPoolsAuthorizer(
    scope: Construct,
    id: String,
    block: CognitoUserPoolsAuthorizerDsl.() -> Unit = {},
  ): CognitoUserPoolsAuthorizer {
    val builder = CognitoUserPoolsAuthorizerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cognitoUserPoolsAuthorizerProps(block: CognitoUserPoolsAuthorizerPropsDsl.() -> Unit =
      {}): CognitoUserPoolsAuthorizerProps {
    val builder = CognitoUserPoolsAuthorizerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun corsOptions(block: CorsOptionsDsl.() -> Unit = {}): CorsOptions {
    val builder = CorsOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun deployment(
    scope: Construct,
    id: String,
    block: DeploymentDsl.() -> Unit = {},
  ): Deployment {
    val builder = DeploymentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun deploymentProps(block: DeploymentPropsDsl.() -> Unit = {}): DeploymentProps {
    val builder = DeploymentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun domainName(
    scope: Construct,
    id: String,
    block: DomainNameDsl.() -> Unit = {},
  ): DomainName {
    val builder = DomainNameDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun domainNameAttributes(block: DomainNameAttributesDsl.() -> Unit = {}):
      DomainNameAttributes {
    val builder = DomainNameAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun domainNameOptions(block: DomainNameOptionsDsl.() -> Unit = {}):
      DomainNameOptions {
    val builder = DomainNameOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun domainNameProps(block: DomainNamePropsDsl.() -> Unit = {}): DomainNameProps {
    val builder = DomainNamePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun endpointConfiguration(block: EndpointConfigurationDsl.() -> Unit = {}):
      EndpointConfiguration {
    val builder = EndpointConfigurationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun gatewayResponse(
    scope: Construct,
    id: String,
    block: GatewayResponseDsl.() -> Unit = {},
  ): GatewayResponse {
    val builder = GatewayResponseDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun gatewayResponseOptions(block: GatewayResponseOptionsDsl.() -> Unit = {}):
      GatewayResponseOptions {
    val builder = GatewayResponseOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun gatewayResponseProps(block: GatewayResponsePropsDsl.() -> Unit = {}):
      GatewayResponseProps {
    val builder = GatewayResponsePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun httpIntegration(url: String, block: HttpIntegrationDsl.() -> Unit = {}):
      HttpIntegration {
    val builder = HttpIntegrationDsl(url)
    builder.apply(block)
    return builder.build()
  }

  public inline fun httpIntegrationProps(block: HttpIntegrationPropsDsl.() -> Unit = {}):
      HttpIntegrationProps {
    val builder = HttpIntegrationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun integration(block: IntegrationDsl.() -> Unit = {}): Integration {
    val builder = IntegrationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun integrationConfig(block: IntegrationConfigDsl.() -> Unit = {}):
      IntegrationConfig {
    val builder = IntegrationConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun integrationOptions(block: IntegrationOptionsDsl.() -> Unit = {}):
      IntegrationOptions {
    val builder = IntegrationOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun integrationProps(block: IntegrationPropsDsl.() -> Unit = {}): IntegrationProps {
    val builder = IntegrationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun integrationResponse(block: IntegrationResponseDsl.() -> Unit = {}):
      IntegrationResponse {
    val builder = IntegrationResponseDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun jsonSchema(block: JsonSchemaDsl.() -> Unit = {}): JsonSchema {
    val builder = JsonSchemaDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun jsonWithStandardFieldProps(block: JsonWithStandardFieldPropsDsl.() -> Unit =
      {}): JsonWithStandardFieldProps {
    val builder = JsonWithStandardFieldPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lambdaAuthorizerProps(block: LambdaAuthorizerPropsDsl.() -> Unit = {}):
      LambdaAuthorizerProps {
    val builder = LambdaAuthorizerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lambdaIntegration(handler: IFunction, block: LambdaIntegrationDsl.() -> Unit =
      {}): LambdaIntegration {
    val builder = LambdaIntegrationDsl(handler)
    builder.apply(block)
    return builder.build()
  }

  public inline fun lambdaIntegrationOptions(block: LambdaIntegrationOptionsDsl.() -> Unit = {}):
      LambdaIntegrationOptions {
    val builder = LambdaIntegrationOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lambdaRestApi(
    scope: Construct,
    id: String,
    block: LambdaRestApiDsl.() -> Unit = {},
  ): LambdaRestApi {
    val builder = LambdaRestApiDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun lambdaRestApiProps(block: LambdaRestApiPropsDsl.() -> Unit = {}):
      LambdaRestApiProps {
    val builder = LambdaRestApiPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun mTLSConfig(block: MTLSConfigDsl.() -> Unit = {}): MTLSConfig {
    val builder = MTLSConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun method(
    scope: Construct,
    id: String,
    block: MethodDsl.() -> Unit = {},
  ): Method {
    val builder = MethodDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun methodDeploymentOptions(block: MethodDeploymentOptionsDsl.() -> Unit = {}):
      MethodDeploymentOptions {
    val builder = MethodDeploymentOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun methodOptions(block: MethodOptionsDsl.() -> Unit = {}): MethodOptions {
    val builder = MethodOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun methodProps(block: MethodPropsDsl.() -> Unit = {}): MethodProps {
    val builder = MethodPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun methodResponse(block: MethodResponseDsl.() -> Unit = {}): MethodResponse {
    val builder = MethodResponseDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun mockIntegration(block: MockIntegrationDsl.() -> Unit = {}): MockIntegration {
    val builder = MockIntegrationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun model(
    scope: Construct,
    id: String,
    block: ModelDsl.() -> Unit = {},
  ): Model {
    val builder = ModelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun modelOptions(block: ModelOptionsDsl.() -> Unit = {}): ModelOptions {
    val builder = ModelOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun modelProps(block: ModelPropsDsl.() -> Unit = {}): ModelProps {
    val builder = ModelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun proxyResource(
    scope: Construct,
    id: String,
    block: ProxyResourceDsl.() -> Unit = {},
  ): ProxyResource {
    val builder = ProxyResourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun proxyResourceOptions(block: ProxyResourceOptionsDsl.() -> Unit = {}):
      ProxyResourceOptions {
    val builder = ProxyResourceOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun proxyResourceProps(block: ProxyResourcePropsDsl.() -> Unit = {}):
      ProxyResourceProps {
    val builder = ProxyResourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun quotaSettings(block: QuotaSettingsDsl.() -> Unit = {}): QuotaSettings {
    val builder = QuotaSettingsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun rateLimitedApiKey(
    scope: Construct,
    id: String,
    block: RateLimitedApiKeyDsl.() -> Unit = {},
  ): RateLimitedApiKey {
    val builder = RateLimitedApiKeyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun rateLimitedApiKeyProps(block: RateLimitedApiKeyPropsDsl.() -> Unit = {}):
      RateLimitedApiKeyProps {
    val builder = RateLimitedApiKeyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun requestAuthorizer(
    scope: Construct,
    id: String,
    block: RequestAuthorizerDsl.() -> Unit = {},
  ): RequestAuthorizer {
    val builder = RequestAuthorizerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun requestAuthorizerProps(block: RequestAuthorizerPropsDsl.() -> Unit = {}):
      RequestAuthorizerProps {
    val builder = RequestAuthorizerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun requestContext(block: RequestContextDsl.() -> Unit = {}): RequestContext {
    val builder = RequestContextDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun requestValidator(
    scope: Construct,
    id: String,
    block: RequestValidatorDsl.() -> Unit = {},
  ): RequestValidator {
    val builder = RequestValidatorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun requestValidatorOptions(block: RequestValidatorOptionsDsl.() -> Unit = {}):
      RequestValidatorOptions {
    val builder = RequestValidatorOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun requestValidatorProps(block: RequestValidatorPropsDsl.() -> Unit = {}):
      RequestValidatorProps {
    val builder = RequestValidatorPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun resource(
    scope: Construct,
    id: String,
    block: ResourceDsl.() -> Unit = {},
  ): Resource {
    val builder = ResourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun resourceAttributes(block: ResourceAttributesDsl.() -> Unit = {}):
      ResourceAttributes {
    val builder = ResourceAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun resourceOptions(block: ResourceOptionsDsl.() -> Unit = {}): ResourceOptions {
    val builder = ResourceOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun resourceProps(block: ResourcePropsDsl.() -> Unit = {}): ResourceProps {
    val builder = ResourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun restApi(
    scope: Construct,
    id: String,
    block: RestApiDsl.() -> Unit = {},
  ): RestApi {
    val builder = RestApiDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun restApiAttributes(block: RestApiAttributesDsl.() -> Unit = {}):
      RestApiAttributes {
    val builder = RestApiAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun restApiBaseProps(block: RestApiBasePropsDsl.() -> Unit = {}): RestApiBaseProps {
    val builder = RestApiBasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun restApiProps(block: RestApiPropsDsl.() -> Unit = {}): RestApiProps {
    val builder = RestApiPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun specRestApi(
    scope: Construct,
    id: String,
    block: SpecRestApiDsl.() -> Unit = {},
  ): SpecRestApi {
    val builder = SpecRestApiDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun specRestApiProps(block: SpecRestApiPropsDsl.() -> Unit = {}): SpecRestApiProps {
    val builder = SpecRestApiPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stage(
    scope: Construct,
    id: String,
    block: StageDsl.() -> Unit = {},
  ): Stage {
    val builder = StageDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun stageAttributes(block: StageAttributesDsl.() -> Unit = {}): StageAttributes {
    val builder = StageAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stageOptions(block: StageOptionsDsl.() -> Unit = {}): StageOptions {
    val builder = StageOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stageProps(block: StagePropsDsl.() -> Unit = {}): StageProps {
    val builder = StagePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun stepFunctionsExecutionIntegrationOptions(block: StepFunctionsExecutionIntegrationOptionsDsl.() -> Unit
      = {}): StepFunctionsExecutionIntegrationOptions {
    val builder = StepFunctionsExecutionIntegrationOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stepFunctionsRestApi(
    scope: Construct,
    id: String,
    block: StepFunctionsRestApiDsl.() -> Unit = {},
  ): StepFunctionsRestApi {
    val builder = StepFunctionsRestApiDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun stepFunctionsRestApiProps(block: StepFunctionsRestApiPropsDsl.() -> Unit = {}):
      StepFunctionsRestApiProps {
    val builder = StepFunctionsRestApiPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun throttleSettings(block: ThrottleSettingsDsl.() -> Unit = {}): ThrottleSettings {
    val builder = ThrottleSettingsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun throttlingPerMethod(block: ThrottlingPerMethodDsl.() -> Unit = {}):
      ThrottlingPerMethod {
    val builder = ThrottlingPerMethodDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun tokenAuthorizer(
    scope: Construct,
    id: String,
    block: TokenAuthorizerDsl.() -> Unit = {},
  ): TokenAuthorizer {
    val builder = TokenAuthorizerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun tokenAuthorizerProps(block: TokenAuthorizerPropsDsl.() -> Unit = {}):
      TokenAuthorizerProps {
    val builder = TokenAuthorizerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun usagePlan(
    scope: Construct,
    id: String,
    block: UsagePlanDsl.() -> Unit = {},
  ): UsagePlan {
    val builder = UsagePlanDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun usagePlanPerApiStage(block: UsagePlanPerApiStageDsl.() -> Unit = {}):
      UsagePlanPerApiStage {
    val builder = UsagePlanPerApiStageDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun usagePlanProps(block: UsagePlanPropsDsl.() -> Unit = {}): UsagePlanProps {
    val builder = UsagePlanPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpcLink(
    scope: Construct,
    id: String,
    block: VpcLinkDsl.() -> Unit = {},
  ): VpcLink {
    val builder = VpcLinkDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpcLinkProps(block: VpcLinkPropsDsl.() -> Unit = {}): VpcLinkProps {
    val builder = VpcLinkPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
