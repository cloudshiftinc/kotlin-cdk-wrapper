@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrserverless

import kotlin.Unit
import software.amazon.awscdk.services.emrserverless.CfnApplication

/**
 * The configuration for an application to automatically start on job submission.
 */
public inline
    fun CfnApplication.setAutoStartConfiguration(block: CfnApplicationAutoStartConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationAutoStartConfigurationPropertyDsl()
  builder.apply(block)
  return setAutoStartConfiguration(builder.build())
}

/**
 * The configuration for an application to automatically stop after a certain amount of time being
 * idle.
 */
public inline
    fun CfnApplication.setAutoStopConfiguration(block: CfnApplicationAutoStopConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationAutoStopConfigurationPropertyDsl()
  builder.apply(block)
  return setAutoStopConfiguration(builder.build())
}

/**
 * The image configuration.
 */
public inline
    fun CfnApplication.setImageConfiguration(block: CfnApplicationImageConfigurationInputPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationImageConfigurationInputPropertyDsl()
  builder.apply(block)
  return setImageConfiguration(builder.build())
}

/**
 * The maximum capacity of the application.
 */
public inline
    fun CfnApplication.setMaximumCapacity(block: CfnApplicationMaximumAllowedResourcesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationMaximumAllowedResourcesPropertyDsl()
  builder.apply(block)
  return setMaximumCapacity(builder.build())
}

/**
 * The network configuration for customer VPC connectivity for the application.
 */
public inline
    fun CfnApplication.setNetworkConfiguration(block: CfnApplicationNetworkConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationNetworkConfigurationPropertyDsl()
  builder.apply(block)
  return setNetworkConfiguration(builder.build())
}
