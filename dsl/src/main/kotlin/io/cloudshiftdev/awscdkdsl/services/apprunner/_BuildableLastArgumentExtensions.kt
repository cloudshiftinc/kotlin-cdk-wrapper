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

package io.cloudshiftdev.awscdkdsl.services.apprunner

import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration
import software.amazon.awscdk.services.apprunner.CfnService
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection

/** The configuration of the tracing feature within this observability configuration. */
public inline fun CfnObservabilityConfiguration.setTraceConfiguration(
    block: CfnObservabilityConfigurationTraceConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnObservabilityConfigurationTraceConfigurationPropertyDsl()
    builder.apply(block)
    return setTraceConfiguration(builder.build())
}

/**
 * An optional custom encryption key that App Runner uses to encrypt the copy of your source
 * repository that it maintains and your service logs.
 */
public inline fun CfnService.setEncryptionConfiguration(
    block: CfnServiceEncryptionConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnServiceEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return setEncryptionConfiguration(builder.build())
}

/**
 * The settings for the health check that AWS App Runner performs to monitor the health of the App
 * Runner service.
 */
public inline fun CfnService.setHealthCheckConfiguration(
    block: CfnServiceHealthCheckConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnServiceHealthCheckConfigurationPropertyDsl()
    builder.apply(block)
    return setHealthCheckConfiguration(builder.build())
}

/** The runtime configuration of instances (scaling units) of your service. */
public inline fun CfnService.setInstanceConfiguration(
    block: CfnServiceInstanceConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnServiceInstanceConfigurationPropertyDsl()
    builder.apply(block)
    return setInstanceConfiguration(builder.build())
}

/**
 * Configuration settings related to network traffic of the web application that the App Runner
 * service runs.
 */
public inline fun CfnService.setNetworkConfiguration(
    block: CfnServiceNetworkConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnServiceNetworkConfigurationPropertyDsl()
    builder.apply(block)
    return setNetworkConfiguration(builder.build())
}

/** The observability configuration of your service. */
public inline fun CfnService.setObservabilityConfiguration(
    block: CfnServiceServiceObservabilityConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnServiceServiceObservabilityConfigurationPropertyDsl()
    builder.apply(block)
    return setObservabilityConfiguration(builder.build())
}

/** The source to deploy to the App Runner service. */
public inline fun CfnService.setSourceConfiguration(
    block: CfnServiceSourceConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnServiceSourceConfigurationPropertyDsl()
    builder.apply(block)
    return setSourceConfiguration(builder.build())
}

/**
 * Specifications for the customer’s Amazon VPC and the related AWS PrivateLink VPC endpoint that
 * are used to create the VPC Ingress Connection resource.
 */
public inline fun CfnVpcIngressConnection.setIngressVpcConfiguration(
    block: CfnVpcIngressConnectionIngressVpcConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnVpcIngressConnectionIngressVpcConfigurationPropertyDsl()
    builder.apply(block)
    return setIngressVpcConfiguration(builder.build())
}
