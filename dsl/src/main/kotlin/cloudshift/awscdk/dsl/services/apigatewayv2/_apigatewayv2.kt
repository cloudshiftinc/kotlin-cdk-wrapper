@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnApi
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps
import software.amazon.awscdk.services.apigatewayv2.CfnApiMapping
import software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps
import software.amazon.awscdk.services.apigatewayv2.CfnApiProps
import software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer
import software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps
import software.amazon.awscdk.services.apigatewayv2.CfnDeployment
import software.amazon.awscdk.services.apigatewayv2.CfnDeploymentProps
import software.amazon.awscdk.services.apigatewayv2.CfnDomainName
import software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps
import software.amazon.awscdk.services.apigatewayv2.CfnModel
import software.amazon.awscdk.services.apigatewayv2.CfnModelProps
import software.amazon.awscdk.services.apigatewayv2.CfnRoute
import software.amazon.awscdk.services.apigatewayv2.CfnRouteProps
import software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse
import software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps
import software.amazon.awscdk.services.apigatewayv2.CfnStage
import software.amazon.awscdk.services.apigatewayv2.CfnStageProps
import software.amazon.awscdk.services.apigatewayv2.CfnVpcLink
import software.amazon.awscdk.services.apigatewayv2.CfnVpcLinkProps
import software.constructs.Construct

public object apigatewayv2 {
  public inline fun cfnApi(
    scope: Construct,
    id: String,
    block: CfnApiDsl.() -> Unit = {},
  ): CfnApi {
    val builder = CfnApiDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiBodyS3LocationProperty(block: CfnApiBodyS3LocationPropertyDsl.() -> Unit =
      {}): CfnApi.BodyS3LocationProperty {
    val builder = CfnApiBodyS3LocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiCorsProperty(block: CfnApiCorsPropertyDsl.() -> Unit = {}):
      CfnApi.CorsProperty {
    val builder = CfnApiCorsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiGatewayManagedOverrides(
    scope: Construct,
    id: String,
    block: CfnApiGatewayManagedOverridesDsl.() -> Unit = {},
  ): CfnApiGatewayManagedOverrides {
    val builder = CfnApiGatewayManagedOverridesDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApiGatewayManagedOverridesAccessLogSettingsProperty(block: CfnApiGatewayManagedOverridesAccessLogSettingsPropertyDsl.() -> Unit
      = {}): CfnApiGatewayManagedOverrides.AccessLogSettingsProperty {
    val builder = CfnApiGatewayManagedOverridesAccessLogSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApiGatewayManagedOverridesIntegrationOverridesProperty(block: CfnApiGatewayManagedOverridesIntegrationOverridesPropertyDsl.() -> Unit
      = {}): CfnApiGatewayManagedOverrides.IntegrationOverridesProperty {
    val builder = CfnApiGatewayManagedOverridesIntegrationOverridesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApiGatewayManagedOverridesProps(block: CfnApiGatewayManagedOverridesPropsDsl.() -> Unit
      = {}): CfnApiGatewayManagedOverridesProps {
    val builder = CfnApiGatewayManagedOverridesPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApiGatewayManagedOverridesRouteOverridesProperty(block: CfnApiGatewayManagedOverridesRouteOverridesPropertyDsl.() -> Unit
      = {}): CfnApiGatewayManagedOverrides.RouteOverridesProperty {
    val builder = CfnApiGatewayManagedOverridesRouteOverridesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApiGatewayManagedOverridesRouteSettingsProperty(block: CfnApiGatewayManagedOverridesRouteSettingsPropertyDsl.() -> Unit
      = {}): CfnApiGatewayManagedOverrides.RouteSettingsProperty {
    val builder = CfnApiGatewayManagedOverridesRouteSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApiGatewayManagedOverridesStageOverridesProperty(block: CfnApiGatewayManagedOverridesStageOverridesPropertyDsl.() -> Unit
      = {}): CfnApiGatewayManagedOverrides.StageOverridesProperty {
    val builder = CfnApiGatewayManagedOverridesStageOverridesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiMapping(
    scope: Construct,
    id: String,
    block: CfnApiMappingDsl.() -> Unit = {},
  ): CfnApiMapping {
    val builder = CfnApiMappingDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiMappingProps(block: CfnApiMappingPropsDsl.() -> Unit = {}):
      CfnApiMappingProps {
    val builder = CfnApiMappingPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiProps(block: CfnApiPropsDsl.() -> Unit = {}): CfnApiProps {
    val builder = CfnApiPropsDsl()
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

  public inline
      fun cfnAuthorizerJWTConfigurationProperty(block: CfnAuthorizerJWTConfigurationPropertyDsl.() -> Unit
      = {}): CfnAuthorizer.JWTConfigurationProperty {
    val builder = CfnAuthorizerJWTConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAuthorizerProps(block: CfnAuthorizerPropsDsl.() -> Unit = {}):
      CfnAuthorizerProps {
    val builder = CfnAuthorizerPropsDsl()
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

  public inline fun cfnDeploymentProps(block: CfnDeploymentPropsDsl.() -> Unit = {}):
      CfnDeploymentProps {
    val builder = CfnDeploymentPropsDsl()
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
      fun cfnDomainNameDomainNameConfigurationProperty(block: CfnDomainNameDomainNameConfigurationPropertyDsl.() -> Unit
      = {}): CfnDomainName.DomainNameConfigurationProperty {
    val builder = CfnDomainNameDomainNameConfigurationPropertyDsl()
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

  public inline fun cfnIntegration(
    scope: Construct,
    id: String,
    block: CfnIntegrationDsl.() -> Unit = {},
  ): CfnIntegration {
    val builder = CfnIntegrationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIntegrationProps(block: CfnIntegrationPropsDsl.() -> Unit = {}):
      CfnIntegrationProps {
    val builder = CfnIntegrationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIntegrationResponse(
    scope: Construct,
    id: String,
    block: CfnIntegrationResponseDsl.() -> Unit = {},
  ): CfnIntegrationResponse {
    val builder = CfnIntegrationResponseDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnIntegrationResponseParameterListProperty(block: CfnIntegrationResponseParameterListPropertyDsl.() -> Unit
      = {}): CfnIntegration.ResponseParameterListProperty {
    val builder = CfnIntegrationResponseParameterListPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnIntegrationResponseParameterProperty(block: CfnIntegrationResponseParameterPropertyDsl.() -> Unit
      = {}): CfnIntegration.ResponseParameterProperty {
    val builder = CfnIntegrationResponseParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIntegrationResponseProps(block: CfnIntegrationResponsePropsDsl.() -> Unit =
      {}): CfnIntegrationResponseProps {
    val builder = CfnIntegrationResponsePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnIntegrationTlsConfigProperty(block: CfnIntegrationTlsConfigPropertyDsl.() -> Unit =
      {}): CfnIntegration.TlsConfigProperty {
    val builder = CfnIntegrationTlsConfigPropertyDsl()
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

  public inline fun cfnRoute(
    scope: Construct,
    id: String,
    block: CfnRouteDsl.() -> Unit = {},
  ): CfnRoute {
    val builder = CfnRouteDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRouteParameterConstraintsProperty(block: CfnRouteParameterConstraintsPropertyDsl.() -> Unit
      = {}): CfnRoute.ParameterConstraintsProperty {
    val builder = CfnRouteParameterConstraintsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRouteProps(block: CfnRoutePropsDsl.() -> Unit = {}): CfnRouteProps {
    val builder = CfnRoutePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRouteResponse(
    scope: Construct,
    id: String,
    block: CfnRouteResponseDsl.() -> Unit = {},
  ): CfnRouteResponse {
    val builder = CfnRouteResponseDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRouteResponseParameterConstraintsProperty(block: CfnRouteResponseParameterConstraintsPropertyDsl.() -> Unit
      = {}): CfnRouteResponse.ParameterConstraintsProperty {
    val builder = CfnRouteResponseParameterConstraintsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRouteResponseProps(block: CfnRouteResponsePropsDsl.() -> Unit = {}):
      CfnRouteResponseProps {
    val builder = CfnRouteResponsePropsDsl()
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
      fun cfnStageAccessLogSettingsProperty(block: CfnStageAccessLogSettingsPropertyDsl.() -> Unit =
      {}): CfnStage.AccessLogSettingsProperty {
    val builder = CfnStageAccessLogSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStageProps(block: CfnStagePropsDsl.() -> Unit = {}): CfnStageProps {
    val builder = CfnStagePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStageRouteSettingsProperty(block: CfnStageRouteSettingsPropertyDsl.() -> Unit
      = {}): CfnStage.RouteSettingsProperty {
    val builder = CfnStageRouteSettingsPropertyDsl()
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
}
