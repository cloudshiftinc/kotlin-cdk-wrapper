@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration
import software.amazon.awscdk.services.apprunner.CfnService
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection

public inline
    fun CfnObservabilityConfiguration.setTraceConfiguration(block: CfnObservabilityConfigurationTraceConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnObservabilityConfigurationTraceConfigurationPropertyDsl()
  builder.apply(block)
  return setTraceConfiguration(builder.build())
}

public inline
    fun CfnVpcIngressConnection.setIngressVpcConfiguration(block: CfnVpcIngressConnectionIngressVpcConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVpcIngressConnectionIngressVpcConfigurationPropertyDsl()
  builder.apply(block)
  return setIngressVpcConfiguration(builder.build())
}

public inline
    fun CfnService.setSourceConfiguration(block: CfnServiceSourceConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceSourceConfigurationPropertyDsl()
  builder.apply(block)
  return setSourceConfiguration(builder.build())
}

public inline
    fun CfnService.setEncryptionConfiguration(block: CfnServiceEncryptionConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceEncryptionConfigurationPropertyDsl()
  builder.apply(block)
  return setEncryptionConfiguration(builder.build())
}

public inline
    fun CfnService.setHealthCheckConfiguration(block: CfnServiceHealthCheckConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceHealthCheckConfigurationPropertyDsl()
  builder.apply(block)
  return setHealthCheckConfiguration(builder.build())
}

public inline
    fun CfnService.setInstanceConfiguration(block: CfnServiceInstanceConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceInstanceConfigurationPropertyDsl()
  builder.apply(block)
  return setInstanceConfiguration(builder.build())
}

public inline
    fun CfnService.setNetworkConfiguration(block: CfnServiceNetworkConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceNetworkConfigurationPropertyDsl()
  builder.apply(block)
  return setNetworkConfiguration(builder.build())
}

public inline
    fun CfnService.setObservabilityConfiguration(block: CfnServiceServiceObservabilityConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceServiceObservabilityConfigurationPropertyDsl()
  builder.apply(block)
  return setObservabilityConfiguration(builder.build())
}
