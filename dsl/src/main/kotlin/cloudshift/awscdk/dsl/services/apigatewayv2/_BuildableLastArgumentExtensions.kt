@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnApi
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides
import software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer
import software.amazon.awscdk.services.apigatewayv2.CfnDomainName
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration
import software.amazon.awscdk.services.apigatewayv2.CfnStage

/**
 * The S3 location of an OpenAPI definition.
 */
public inline fun CfnApi.setBodyS3Location(block: CfnApiBodyS3LocationPropertyDsl.() -> Unit = {}) {
  val builder = CfnApiBodyS3LocationPropertyDsl()
  builder.apply(block)
  return setBodyS3Location(builder.build())
}

/**
 * A CORS configuration.
 */
public inline fun CfnApi.setCorsConfiguration(block: CfnApiCorsPropertyDsl.() -> Unit = {}) {
  val builder = CfnApiCorsPropertyDsl()
  builder.apply(block)
  return setCorsConfiguration(builder.build())
}

/**
 * Settings for logging access in this stage.
 */
public inline
    fun CfnStage.setAccessLogSettings(block: CfnStageAccessLogSettingsPropertyDsl.() -> Unit = {}) {
  val builder = CfnStageAccessLogSettingsPropertyDsl()
  builder.apply(block)
  return setAccessLogSettings(builder.build())
}

/**
 * The default route settings for the stage.
 */
public inline
    fun CfnStage.setDefaultRouteSettings(block: CfnStageRouteSettingsPropertyDsl.() -> Unit = {}) {
  val builder = CfnStageRouteSettingsPropertyDsl()
  builder.apply(block)
  return setDefaultRouteSettings(builder.build())
}

/**
 * Overrides the integration configuration for an API Gateway-managed integration.
 */
public inline
    fun CfnApiGatewayManagedOverrides.setIntegration(block: CfnApiGatewayManagedOverridesIntegrationOverridesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApiGatewayManagedOverridesIntegrationOverridesPropertyDsl()
  builder.apply(block)
  return setIntegration(builder.build())
}

/**
 * Overrides the route configuration for an API Gateway-managed route.
 */
public inline
    fun CfnApiGatewayManagedOverrides.setRoute(block: CfnApiGatewayManagedOverridesRouteOverridesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApiGatewayManagedOverridesRouteOverridesPropertyDsl()
  builder.apply(block)
  return setRoute(builder.build())
}

/**
 * Overrides the stage configuration for an API Gateway-managed stage.
 */
public inline
    fun CfnApiGatewayManagedOverrides.setStage(block: CfnApiGatewayManagedOverridesStageOverridesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApiGatewayManagedOverridesStageOverridesPropertyDsl()
  builder.apply(block)
  return setStage(builder.build())
}

/**
 * The mutual TLS authentication configuration for a custom domain name.
 */
public inline
    fun CfnDomainName.setMutualTlsAuthentication(block: CfnDomainNameMutualTlsAuthenticationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDomainNameMutualTlsAuthenticationPropertyDsl()
  builder.apply(block)
  return setMutualTlsAuthentication(builder.build())
}

/**
 * The `JWTConfiguration` property specifies the configuration of a JWT authorizer.
 */
public inline
    fun CfnAuthorizer.setJwtConfiguration(block: CfnAuthorizerJWTConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAuthorizerJWTConfigurationPropertyDsl()
  builder.apply(block)
  return setJwtConfiguration(builder.build())
}

/**
 * The TLS configuration for a private integration.
 */
public inline fun CfnIntegration.setTlsConfig(block: CfnIntegrationTlsConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnIntegrationTlsConfigPropertyDsl()
  builder.apply(block)
  return setTlsConfig(builder.build())
}
