@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.gamelift.CfnAlias
import software.amazon.awscdk.services.gamelift.CfnBuild
import software.amazon.awscdk.services.gamelift.CfnFleet
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue
import software.amazon.awscdk.services.gamelift.CfnLocation
import software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration
import software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet
import software.amazon.awscdk.services.gamelift.CfnScript

public inline fun CfnAlias.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnAlias.setRoutingStrategy(block: CfnAliasRoutingStrategyPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnAliasRoutingStrategyPropertyDsl()
  builder.apply(block)
  return setRoutingStrategy(builder.build())
}

public inline fun CfnBuild.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnBuild.setStorageLocation(block: CfnBuildStorageLocationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnBuildStorageLocationPropertyDsl()
  builder.apply(block)
  return setStorageLocation(builder.build())
}

public inline fun CfnFleet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnFleet.setAnywhereConfiguration(block: CfnFleetAnywhereConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFleetAnywhereConfigurationPropertyDsl()
  builder.apply(block)
  return setAnywhereConfiguration(builder.build())
}

public inline
    fun CfnFleet.setCertificateConfiguration(block: CfnFleetCertificateConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFleetCertificateConfigurationPropertyDsl()
  builder.apply(block)
  return setCertificateConfiguration(builder.build())
}

public inline
    fun CfnFleet.setResourceCreationLimitPolicy(block: CfnFleetResourceCreationLimitPolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFleetResourceCreationLimitPolicyPropertyDsl()
  builder.apply(block)
  return setResourceCreationLimitPolicy(builder.build())
}

public inline
    fun CfnFleet.setRuntimeConfiguration(block: CfnFleetRuntimeConfigurationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnFleetRuntimeConfigurationPropertyDsl()
  builder.apply(block)
  return setRuntimeConfiguration(builder.build())
}

public inline fun CfnGameServerGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnGameServerGroup.setAutoScalingPolicy(block: CfnGameServerGroupAutoScalingPolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnGameServerGroupAutoScalingPolicyPropertyDsl()
  builder.apply(block)
  return setAutoScalingPolicy(builder.build())
}

public inline
    fun CfnGameServerGroup.setLaunchTemplate(block: CfnGameServerGroupLaunchTemplatePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnGameServerGroupLaunchTemplatePropertyDsl()
  builder.apply(block)
  return setLaunchTemplate(builder.build())
}

public inline fun CfnGameSessionQueue.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnGameSessionQueue.setFilterConfiguration(block: CfnGameSessionQueueFilterConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnGameSessionQueueFilterConfigurationPropertyDsl()
  builder.apply(block)
  return setFilterConfiguration(builder.build())
}

public inline
    fun CfnGameSessionQueue.setPriorityConfiguration(block: CfnGameSessionQueuePriorityConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnGameSessionQueuePriorityConfigurationPropertyDsl()
  builder.apply(block)
  return setPriorityConfiguration(builder.build())
}

public inline fun CfnLocation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnMatchmakingConfiguration.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnMatchmakingRuleSet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnScript.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnScript.setStorageLocation(block: CfnScriptS3LocationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnScriptS3LocationPropertyDsl()
  builder.apply(block)
  return setStorageLocation(builder.build())
}
