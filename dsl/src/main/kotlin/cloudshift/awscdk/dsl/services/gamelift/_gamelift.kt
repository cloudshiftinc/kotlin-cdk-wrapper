@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnAlias
import software.amazon.awscdk.services.gamelift.CfnAliasProps
import software.amazon.awscdk.services.gamelift.CfnBuild
import software.amazon.awscdk.services.gamelift.CfnBuildProps
import software.amazon.awscdk.services.gamelift.CfnFleet
import software.amazon.awscdk.services.gamelift.CfnFleetProps
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup
import software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps
import software.amazon.awscdk.services.gamelift.CfnLocation
import software.amazon.awscdk.services.gamelift.CfnLocationProps
import software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration
import software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps
import software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet
import software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps
import software.amazon.awscdk.services.gamelift.CfnScript
import software.amazon.awscdk.services.gamelift.CfnScriptProps
import software.constructs.Construct

public object gamelift {
  public inline fun cfnAlias(
    scope: Construct,
    id: String,
    block: CfnAliasDsl.() -> Unit = {},
  ): CfnAlias {
    val builder = CfnAliasDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAliasProps(block: CfnAliasPropsDsl.() -> Unit = {}): CfnAliasProps {
    val builder = CfnAliasPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAliasRoutingStrategyProperty(block: CfnAliasRoutingStrategyPropertyDsl.() -> Unit =
      {}): CfnAlias.RoutingStrategyProperty {
    val builder = CfnAliasRoutingStrategyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBuild(
    scope: Construct,
    id: String,
    block: CfnBuildDsl.() -> Unit = {},
  ): CfnBuild {
    val builder = CfnBuildDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBuildProps(block: CfnBuildPropsDsl.() -> Unit = {}): CfnBuildProps {
    val builder = CfnBuildPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBuildStorageLocationProperty(block: CfnBuildStorageLocationPropertyDsl.() -> Unit =
      {}): CfnBuild.StorageLocationProperty {
    val builder = CfnBuildStorageLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFleet(
    scope: Construct,
    id: String,
    block: CfnFleetDsl.() -> Unit = {},
  ): CfnFleet {
    val builder = CfnFleetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFleetAnywhereConfigurationProperty(block: CfnFleetAnywhereConfigurationPropertyDsl.() -> Unit
      = {}): CfnFleet.AnywhereConfigurationProperty {
    val builder = CfnFleetAnywhereConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFleetCertificateConfigurationProperty(block: CfnFleetCertificateConfigurationPropertyDsl.() -> Unit
      = {}): CfnFleet.CertificateConfigurationProperty {
    val builder = CfnFleetCertificateConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFleetIpPermissionProperty(block: CfnFleetIpPermissionPropertyDsl.() -> Unit =
      {}): CfnFleet.IpPermissionProperty {
    val builder = CfnFleetIpPermissionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFleetLocationCapacityProperty(block: CfnFleetLocationCapacityPropertyDsl.() -> Unit =
      {}): CfnFleet.LocationCapacityProperty {
    val builder = CfnFleetLocationCapacityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFleetLocationConfigurationProperty(block: CfnFleetLocationConfigurationPropertyDsl.() -> Unit
      = {}): CfnFleet.LocationConfigurationProperty {
    val builder = CfnFleetLocationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFleetProps(block: CfnFleetPropsDsl.() -> Unit = {}): CfnFleetProps {
    val builder = CfnFleetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFleetResourceCreationLimitPolicyProperty(block: CfnFleetResourceCreationLimitPolicyPropertyDsl.() -> Unit
      = {}): CfnFleet.ResourceCreationLimitPolicyProperty {
    val builder = CfnFleetResourceCreationLimitPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFleetRuntimeConfigurationProperty(block: CfnFleetRuntimeConfigurationPropertyDsl.() -> Unit
      = {}): CfnFleet.RuntimeConfigurationProperty {
    val builder = CfnFleetRuntimeConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFleetServerProcessProperty(block: CfnFleetServerProcessPropertyDsl.() -> Unit
      = {}): CfnFleet.ServerProcessProperty {
    val builder = CfnFleetServerProcessPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGameServerGroup(
    scope: Construct,
    id: String,
    block: CfnGameServerGroupDsl.() -> Unit = {},
  ): CfnGameServerGroup {
    val builder = CfnGameServerGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGameServerGroupAutoScalingPolicyProperty(block: CfnGameServerGroupAutoScalingPolicyPropertyDsl.() -> Unit
      = {}): CfnGameServerGroup.AutoScalingPolicyProperty {
    val builder = CfnGameServerGroupAutoScalingPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGameServerGroupInstanceDefinitionProperty(block: CfnGameServerGroupInstanceDefinitionPropertyDsl.() -> Unit
      = {}): CfnGameServerGroup.InstanceDefinitionProperty {
    val builder = CfnGameServerGroupInstanceDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGameServerGroupLaunchTemplateProperty(block: CfnGameServerGroupLaunchTemplatePropertyDsl.() -> Unit
      = {}): CfnGameServerGroup.LaunchTemplateProperty {
    val builder = CfnGameServerGroupLaunchTemplatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGameServerGroupProps(block: CfnGameServerGroupPropsDsl.() -> Unit = {}):
      CfnGameServerGroupProps {
    val builder = CfnGameServerGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGameServerGroupTargetTrackingConfigurationProperty(block: CfnGameServerGroupTargetTrackingConfigurationPropertyDsl.() -> Unit
      = {}): CfnGameServerGroup.TargetTrackingConfigurationProperty {
    val builder = CfnGameServerGroupTargetTrackingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGameSessionQueue(
    scope: Construct,
    id: String,
    block: CfnGameSessionQueueDsl.() -> Unit = {},
  ): CfnGameSessionQueue {
    val builder = CfnGameSessionQueueDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGameSessionQueueDestinationProperty(block: CfnGameSessionQueueDestinationPropertyDsl.() -> Unit
      = {}): CfnGameSessionQueue.DestinationProperty {
    val builder = CfnGameSessionQueueDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGameSessionQueueFilterConfigurationProperty(block: CfnGameSessionQueueFilterConfigurationPropertyDsl.() -> Unit
      = {}): CfnGameSessionQueue.FilterConfigurationProperty {
    val builder = CfnGameSessionQueueFilterConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGameSessionQueuePlayerLatencyPolicyProperty(block: CfnGameSessionQueuePlayerLatencyPolicyPropertyDsl.() -> Unit
      = {}): CfnGameSessionQueue.PlayerLatencyPolicyProperty {
    val builder = CfnGameSessionQueuePlayerLatencyPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGameSessionQueuePriorityConfigurationProperty(block: CfnGameSessionQueuePriorityConfigurationPropertyDsl.() -> Unit
      = {}): CfnGameSessionQueue.PriorityConfigurationProperty {
    val builder = CfnGameSessionQueuePriorityConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGameSessionQueueProps(block: CfnGameSessionQueuePropsDsl.() -> Unit = {}):
      CfnGameSessionQueueProps {
    val builder = CfnGameSessionQueuePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLocation(
    scope: Construct,
    id: String,
    block: CfnLocationDsl.() -> Unit = {},
  ): CfnLocation {
    val builder = CfnLocationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLocationProps(block: CfnLocationPropsDsl.() -> Unit = {}): CfnLocationProps {
    val builder = CfnLocationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMatchmakingConfiguration(
    scope: Construct,
    id: String,
    block: CfnMatchmakingConfigurationDsl.() -> Unit = {},
  ): CfnMatchmakingConfiguration {
    val builder = CfnMatchmakingConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMatchmakingConfigurationGamePropertyProperty(block: CfnMatchmakingConfigurationGamePropertyPropertyDsl.() -> Unit
      = {}): CfnMatchmakingConfiguration.GamePropertyProperty {
    val builder = CfnMatchmakingConfigurationGamePropertyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMatchmakingConfigurationProps(block: CfnMatchmakingConfigurationPropsDsl.() -> Unit =
      {}): CfnMatchmakingConfigurationProps {
    val builder = CfnMatchmakingConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMatchmakingRuleSet(
    scope: Construct,
    id: String,
    block: CfnMatchmakingRuleSetDsl.() -> Unit = {},
  ): CfnMatchmakingRuleSet {
    val builder = CfnMatchmakingRuleSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMatchmakingRuleSetProps(block: CfnMatchmakingRuleSetPropsDsl.() -> Unit =
      {}): CfnMatchmakingRuleSetProps {
    val builder = CfnMatchmakingRuleSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnScript(
    scope: Construct,
    id: String,
    block: CfnScriptDsl.() -> Unit = {},
  ): CfnScript {
    val builder = CfnScriptDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnScriptProps(block: CfnScriptPropsDsl.() -> Unit = {}): CfnScriptProps {
    val builder = CfnScriptPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnScriptS3LocationProperty(block: CfnScriptS3LocationPropertyDsl.() -> Unit =
      {}): CfnScript.S3LocationProperty {
    val builder = CfnScriptS3LocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
