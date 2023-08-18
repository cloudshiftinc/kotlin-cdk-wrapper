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

package io.cloudshiftdev.awscdkdsl.services.gamelift

import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnAlias
import software.amazon.awscdk.services.gamelift.CfnBuild
import software.amazon.awscdk.services.gamelift.CfnFleet
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue
import software.amazon.awscdk.services.gamelift.CfnScript

/** The routing configuration, including routing type and fleet target, for the alias. */
public inline fun CfnAlias.setRoutingStrategy(
    block: CfnAliasRoutingStrategyPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAliasRoutingStrategyPropertyDsl()
    builder.apply(block)
    return setRoutingStrategy(builder.build())
}

/** Information indicating where your game build files are stored. */
public inline fun CfnBuild.setStorageLocation(
    block: CfnBuildStorageLocationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBuildStorageLocationPropertyDsl()
    builder.apply(block)
    return setStorageLocation(builder.build())
}

/** Configuration for Anywhere fleet. */
public inline fun CfnFleet.setAnywhereConfiguration(
    block: CfnFleetAnywhereConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFleetAnywhereConfigurationPropertyDsl()
    builder.apply(block)
    return setAnywhereConfiguration(builder.build())
}

/** Prompts Amazon GameLift to generate a TLS/SSL certificate for the fleet. */
public inline fun CfnFleet.setCertificateConfiguration(
    block: CfnFleetCertificateConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFleetCertificateConfigurationPropertyDsl()
    builder.apply(block)
    return setCertificateConfiguration(builder.build())
}

/**
 * A policy that limits the number of game sessions that an individual player can create on
 * instances in this fleet within a specified span of time.
 */
public inline fun CfnFleet.setResourceCreationLimitPolicy(
    block: CfnFleetResourceCreationLimitPolicyPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFleetResourceCreationLimitPolicyPropertyDsl()
    builder.apply(block)
    return setResourceCreationLimitPolicy(builder.build())
}

/** Instructions for how to launch and maintain server processes on instances in the fleet. */
public inline fun CfnFleet.setRuntimeConfiguration(
    block: CfnFleetRuntimeConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFleetRuntimeConfigurationPropertyDsl()
    builder.apply(block)
    return setRuntimeConfiguration(builder.build())
}

/**
 * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized
 * for game hosting.
 */
public inline fun CfnGameServerGroup.setAutoScalingPolicy(
    block: CfnGameServerGroupAutoScalingPolicyPropertyDsl.() -> Unit = {}
) {
    val builder = CfnGameServerGroupAutoScalingPolicyPropertyDsl()
    builder.apply(block)
    return setAutoScalingPolicy(builder.build())
}

/**
 * The Amazon EC2 launch template that contains configuration settings and game server code to be
 * deployed to all instances in the game server group.
 */
public inline fun CfnGameServerGroup.setLaunchTemplate(
    block: CfnGameServerGroupLaunchTemplatePropertyDsl.() -> Unit = {}
) {
    val builder = CfnGameServerGroupLaunchTemplatePropertyDsl()
    builder.apply(block)
    return setLaunchTemplate(builder.build())
}

/** A list of locations where a queue is allowed to place new game sessions. */
public inline fun CfnGameSessionQueue.setFilterConfiguration(
    block: CfnGameSessionQueueFilterConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnGameSessionQueueFilterConfigurationPropertyDsl()
    builder.apply(block)
    return setFilterConfiguration(builder.build())
}

/**
 * Custom settings to use when prioritizing destinations and locations for game session placements.
 */
public inline fun CfnGameSessionQueue.setPriorityConfiguration(
    block: CfnGameSessionQueuePriorityConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnGameSessionQueuePriorityConfigurationPropertyDsl()
    builder.apply(block)
    return setPriorityConfiguration(builder.build())
}

/**
 * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is
 * stored.
 */
public inline fun CfnScript.setStorageLocation(
    block: CfnScriptS3LocationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnScriptS3LocationPropertyDsl()
    builder.apply(block)
    return setStorageLocation(builder.build())
}
