@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrserverless

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.emrserverless.CfnApplication

public inline fun CfnApplication.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnApplication.setAutoStartConfiguration(block: CfnApplicationAutoStartConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationAutoStartConfigurationPropertyDsl()
  builder.apply(block)
  return setAutoStartConfiguration(builder.build())
}

public inline
    fun CfnApplication.setAutoStopConfiguration(block: CfnApplicationAutoStopConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationAutoStopConfigurationPropertyDsl()
  builder.apply(block)
  return setAutoStopConfiguration(builder.build())
}

public inline
    fun CfnApplication.setImageConfiguration(block: CfnApplicationImageConfigurationInputPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationImageConfigurationInputPropertyDsl()
  builder.apply(block)
  return setImageConfiguration(builder.build())
}

public inline
    fun CfnApplication.setMaximumCapacity(block: CfnApplicationMaximumAllowedResourcesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationMaximumAllowedResourcesPropertyDsl()
  builder.apply(block)
  return setMaximumCapacity(builder.build())
}

public inline
    fun CfnApplication.setNetworkConfiguration(block: CfnApplicationNetworkConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationNetworkConfigurationPropertyDsl()
  builder.apply(block)
  return setNetworkConfiguration(builder.build())
}
