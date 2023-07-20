@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.apigatewayv2

import software.amazon.awscdk.services.apigatewayv2.CfnApi
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides
import software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer
import software.amazon.awscdk.services.apigatewayv2.CfnDomainName
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration
import software.amazon.awscdk.services.apigatewayv2.CfnStage
import kotlin.Unit

public inline fun CfnApi.setBodyS3Location(block: CfnApiBodyS3LocationPropertyDsl.() -> Unit = {}) {
    val builder = CfnApiBodyS3LocationPropertyDsl()
    builder.apply(block)
    return setBodyS3Location(builder.build())
}

public inline fun CfnApi.setCorsConfiguration(block: CfnApiCorsPropertyDsl.() -> Unit = {}) {
    val builder = CfnApiCorsPropertyDsl()
    builder.apply(block)
    return setCorsConfiguration(builder.build())
}

public inline fun CfnStage.setAccessLogSettings(block: CfnStageAccessLogSettingsPropertyDsl.() -> Unit = {}) {
    val builder = CfnStageAccessLogSettingsPropertyDsl()
    builder.apply(block)
    return setAccessLogSettings(builder.build())
}

public inline fun CfnStage.setDefaultRouteSettings(block: CfnStageRouteSettingsPropertyDsl.() -> Unit = {}) {
    val builder = CfnStageRouteSettingsPropertyDsl()
    builder.apply(block)
    return setDefaultRouteSettings(builder.build())
}

public inline fun CfnApiGatewayManagedOverrides.setIntegration(
    block: CfnApiGatewayManagedOverridesIntegrationOverridesPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnApiGatewayManagedOverridesIntegrationOverridesPropertyDsl()
    builder.apply(block)
    return setIntegration(builder.build())
}

public inline fun CfnApiGatewayManagedOverrides.setRoute(
    block: CfnApiGatewayManagedOverridesRouteOverridesPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnApiGatewayManagedOverridesRouteOverridesPropertyDsl()
    builder.apply(block)
    return setRoute(builder.build())
}

public inline fun CfnApiGatewayManagedOverrides.setStage(
    block: CfnApiGatewayManagedOverridesStageOverridesPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnApiGatewayManagedOverridesStageOverridesPropertyDsl()
    builder.apply(block)
    return setStage(builder.build())
}

public inline fun CfnDomainName.setMutualTlsAuthentication(
    block: CfnDomainNameMutualTlsAuthenticationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnDomainNameMutualTlsAuthenticationPropertyDsl()
    builder.apply(block)
    return setMutualTlsAuthentication(builder.build())
}

public inline fun CfnAuthorizer.setJwtConfiguration(
    block: CfnAuthorizerJWTConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnAuthorizerJWTConfigurationPropertyDsl()
    builder.apply(block)
    return setJwtConfiguration(builder.build())
}

public inline fun CfnIntegration.setTlsConfig(
    block: CfnIntegrationTlsConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnIntegrationTlsConfigPropertyDsl()
    builder.apply(block)
    return setTlsConfig(builder.build())
}
