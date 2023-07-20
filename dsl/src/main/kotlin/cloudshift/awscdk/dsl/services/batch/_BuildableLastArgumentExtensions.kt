@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnComputeEnvironment
import software.amazon.awscdk.services.batch.CfnJobDefinition
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy

public inline
    fun CfnJobDefinition.setContainerProperties(block: CfnJobDefinitionContainerPropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnJobDefinitionContainerPropertiesPropertyDsl()
  builder.apply(block)
  return setContainerProperties(builder.build())
}

public inline
    fun CfnJobDefinition.setEksProperties(block: CfnJobDefinitionEksPropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnJobDefinitionEksPropertiesPropertyDsl()
  builder.apply(block)
  return setEksProperties(builder.build())
}

public inline
    fun CfnJobDefinition.setNodeProperties(block: CfnJobDefinitionNodePropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnJobDefinitionNodePropertiesPropertyDsl()
  builder.apply(block)
  return setNodeProperties(builder.build())
}

public inline
    fun CfnJobDefinition.setRetryStrategy(block: CfnJobDefinitionRetryStrategyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnJobDefinitionRetryStrategyPropertyDsl()
  builder.apply(block)
  return setRetryStrategy(builder.build())
}

public inline fun CfnJobDefinition.setTimeout(block: CfnJobDefinitionTimeoutPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnJobDefinitionTimeoutPropertyDsl()
  builder.apply(block)
  return setTimeout(builder.build())
}

public inline
    fun CfnSchedulingPolicy.setFairsharePolicy(block: CfnSchedulingPolicyFairsharePolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSchedulingPolicyFairsharePolicyPropertyDsl()
  builder.apply(block)
  return setFairsharePolicy(builder.build())
}

public inline
    fun CfnComputeEnvironment.setComputeResources(block: CfnComputeEnvironmentComputeResourcesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnComputeEnvironmentComputeResourcesPropertyDsl()
  builder.apply(block)
  return setComputeResources(builder.build())
}

public inline
    fun CfnComputeEnvironment.setEksConfiguration(block: CfnComputeEnvironmentEksConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnComputeEnvironmentEksConfigurationPropertyDsl()
  builder.apply(block)
  return setEksConfiguration(builder.build())
}

public inline
    fun CfnComputeEnvironment.setUpdatePolicy(block: CfnComputeEnvironmentUpdatePolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnComputeEnvironmentUpdatePolicyPropertyDsl()
  builder.apply(block)
  return setUpdatePolicy(builder.build())
}
