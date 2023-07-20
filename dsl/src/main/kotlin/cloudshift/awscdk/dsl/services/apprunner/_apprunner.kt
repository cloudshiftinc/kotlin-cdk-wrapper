@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration
import software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps
import software.amazon.awscdk.services.apprunner.CfnService
import software.amazon.awscdk.services.apprunner.CfnServiceProps
import software.amazon.awscdk.services.apprunner.CfnVpcConnector
import software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps
import software.constructs.Construct

public object apprunner {
  public inline fun cfnAutoScalingConfiguration(
    scope: Construct,
    id: String,
    block: CfnAutoScalingConfigurationDsl.() -> Unit = {},
  ): CfnAutoScalingConfiguration {
    val builder = CfnAutoScalingConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAutoScalingConfigurationProps(block: CfnAutoScalingConfigurationPropsDsl.() -> Unit =
      {}): CfnAutoScalingConfigurationProps {
    val builder = CfnAutoScalingConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnObservabilityConfiguration(
    scope: Construct,
    id: String,
    block: CfnObservabilityConfigurationDsl.() -> Unit = {},
  ): CfnObservabilityConfiguration {
    val builder = CfnObservabilityConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnObservabilityConfigurationProps(block: CfnObservabilityConfigurationPropsDsl.() -> Unit
      = {}): CfnObservabilityConfigurationProps {
    val builder = CfnObservabilityConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnObservabilityConfigurationTraceConfigurationProperty(block: CfnObservabilityConfigurationTraceConfigurationPropertyDsl.() -> Unit
      = {}): CfnObservabilityConfiguration.TraceConfigurationProperty {
    val builder = CfnObservabilityConfigurationTraceConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnService(
    scope: Construct,
    id: String,
    block: CfnServiceDsl.() -> Unit = {},
  ): CfnService {
    val builder = CfnServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceAuthenticationConfigurationProperty(block: CfnServiceAuthenticationConfigurationPropertyDsl.() -> Unit
      = {}): CfnService.AuthenticationConfigurationProperty {
    val builder = CfnServiceAuthenticationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceCodeConfigurationProperty(block: CfnServiceCodeConfigurationPropertyDsl.() -> Unit
      = {}): CfnService.CodeConfigurationProperty {
    val builder = CfnServiceCodeConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceCodeConfigurationValuesProperty(block: CfnServiceCodeConfigurationValuesPropertyDsl.() -> Unit
      = {}): CfnService.CodeConfigurationValuesProperty {
    val builder = CfnServiceCodeConfigurationValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceCodeRepositoryProperty(block: CfnServiceCodeRepositoryPropertyDsl.() -> Unit =
      {}): CfnService.CodeRepositoryProperty {
    val builder = CfnServiceCodeRepositoryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceEgressConfigurationProperty(block: CfnServiceEgressConfigurationPropertyDsl.() -> Unit
      = {}): CfnService.EgressConfigurationProperty {
    val builder = CfnServiceEgressConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceEncryptionConfigurationProperty(block: CfnServiceEncryptionConfigurationPropertyDsl.() -> Unit
      = {}): CfnService.EncryptionConfigurationProperty {
    val builder = CfnServiceEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceHealthCheckConfigurationProperty(block: CfnServiceHealthCheckConfigurationPropertyDsl.() -> Unit
      = {}): CfnService.HealthCheckConfigurationProperty {
    val builder = CfnServiceHealthCheckConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceImageConfigurationProperty(block: CfnServiceImageConfigurationPropertyDsl.() -> Unit
      = {}): CfnService.ImageConfigurationProperty {
    val builder = CfnServiceImageConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceImageRepositoryProperty(block: CfnServiceImageRepositoryPropertyDsl.() -> Unit =
      {}): CfnService.ImageRepositoryProperty {
    val builder = CfnServiceImageRepositoryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceIngressConfigurationProperty(block: CfnServiceIngressConfigurationPropertyDsl.() -> Unit
      = {}): CfnService.IngressConfigurationProperty {
    val builder = CfnServiceIngressConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceInstanceConfigurationProperty(block: CfnServiceInstanceConfigurationPropertyDsl.() -> Unit
      = {}): CfnService.InstanceConfigurationProperty {
    val builder = CfnServiceInstanceConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceKeyValuePairProperty(block: CfnServiceKeyValuePairPropertyDsl.() -> Unit = {}):
      CfnService.KeyValuePairProperty {
    val builder = CfnServiceKeyValuePairPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceNetworkConfigurationProperty(block: CfnServiceNetworkConfigurationPropertyDsl.() -> Unit
      = {}): CfnService.NetworkConfigurationProperty {
    val builder = CfnServiceNetworkConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnServiceProps(block: CfnServicePropsDsl.() -> Unit = {}): CfnServiceProps {
    val builder = CfnServicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceServiceObservabilityConfigurationProperty(block: CfnServiceServiceObservabilityConfigurationPropertyDsl.() -> Unit
      = {}): CfnService.ServiceObservabilityConfigurationProperty {
    val builder = CfnServiceServiceObservabilityConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceSourceCodeVersionProperty(block: CfnServiceSourceCodeVersionPropertyDsl.() -> Unit
      = {}): CfnService.SourceCodeVersionProperty {
    val builder = CfnServiceSourceCodeVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceSourceConfigurationProperty(block: CfnServiceSourceConfigurationPropertyDsl.() -> Unit
      = {}): CfnService.SourceConfigurationProperty {
    val builder = CfnServiceSourceConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVpcConnector(
    scope: Construct,
    id: String,
    block: CfnVpcConnectorDsl.() -> Unit = {},
  ): CfnVpcConnector {
    val builder = CfnVpcConnectorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVpcConnectorProps(block: CfnVpcConnectorPropsDsl.() -> Unit = {}):
      CfnVpcConnectorProps {
    val builder = CfnVpcConnectorPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVpcIngressConnection(
    scope: Construct,
    id: String,
    block: CfnVpcIngressConnectionDsl.() -> Unit = {},
  ): CfnVpcIngressConnection {
    val builder = CfnVpcIngressConnectionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVpcIngressConnectionIngressVpcConfigurationProperty(block: CfnVpcIngressConnectionIngressVpcConfigurationPropertyDsl.() -> Unit
      = {}): CfnVpcIngressConnection.IngressVpcConfigurationProperty {
    val builder = CfnVpcIngressConnectionIngressVpcConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVpcIngressConnectionProps(block: CfnVpcIngressConnectionPropsDsl.() -> Unit =
      {}): CfnVpcIngressConnectionProps {
    val builder = CfnVpcIngressConnectionPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
