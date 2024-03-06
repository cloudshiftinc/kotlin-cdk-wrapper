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

package io.cloudshiftdev.awscdkdsl.services.lightsail

import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnBucket
import software.amazon.awscdk.services.lightsail.CfnContainer
import software.amazon.awscdk.services.lightsail.CfnDisk
import software.amazon.awscdk.services.lightsail.CfnDistribution
import software.amazon.awscdk.services.lightsail.CfnInstance

/** An object that describes the access rules for the bucket. */
public inline fun CfnBucket.setAccessRules(block: CfnBucketAccessRulesPropertyDsl.() -> Unit = {}) {
    val builder = CfnBucketAccessRulesPropertyDsl()
    builder.apply(block)
    return setAccessRules(builder.build())
}

/** An object that describes the current container deployment of the container service. */
public inline fun CfnContainer.setContainerServiceDeployment(
    block: CfnContainerContainerServiceDeploymentPropertyDsl.() -> Unit = {}
) {
    val builder = CfnContainerContainerServiceDeploymentPropertyDsl()
    builder.apply(block)
    return setContainerServiceDeployment(builder.build())
}

/**
 * An object that describes the configuration for the container service to access private container
 * image repositories, such as Amazon Elastic Container Registry ( Amazon ECR ) private
 * repositories.
 */
public inline fun CfnContainer.setPrivateRegistryAccess(
    block: CfnContainerPrivateRegistryAccessPropertyDsl.() -> Unit = {}
) {
    val builder = CfnContainerPrivateRegistryAccessPropertyDsl()
    builder.apply(block)
    return setPrivateRegistryAccess(builder.build())
}

/** The AWS Region and Availability Zone where the disk is located. */
public inline fun CfnDisk.setLocation(block: CfnDiskLocationPropertyDsl.() -> Unit = {}) {
    val builder = CfnDiskLocationPropertyDsl()
    builder.apply(block)
    return setLocation(builder.build())
}

/** An object that describes the cache behavior settings of the distribution. */
public inline fun CfnDistribution.setCacheBehaviorSettings(
    block: CfnDistributionCacheSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDistributionCacheSettingsPropertyDsl()
    builder.apply(block)
    return setCacheBehaviorSettings(builder.build())
}

/** An object that describes the default cache behavior of the distribution. */
public inline fun CfnDistribution.setDefaultCacheBehavior(
    block: CfnDistributionCacheBehaviorPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDistributionCacheBehaviorPropertyDsl()
    builder.apply(block)
    return setDefaultCacheBehavior(builder.build())
}

/**
 * An object that describes the origin resource of the distribution, such as a Lightsail instance,
 * bucket, or load balancer.
 */
public inline fun CfnDistribution.setOrigin(
    block: CfnDistributionInputOriginPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDistributionInputOriginPropertyDsl()
    builder.apply(block)
    return setOrigin(builder.build())
}

/**
 * The hardware properties for the instance, such as the vCPU count, attached disks, and amount of
 * RAM.
 */
public inline fun CfnInstance.setHardware(block: CfnInstanceHardwarePropertyDsl.() -> Unit = {}) {
    val builder = CfnInstanceHardwarePropertyDsl()
    builder.apply(block)
    return setHardware(builder.build())
}

/** The location for the instance, such as the AWS Region and Availability Zone. */
public inline fun CfnInstance.setLocation(block: CfnInstanceLocationPropertyDsl.() -> Unit = {}) {
    val builder = CfnInstanceLocationPropertyDsl()
    builder.apply(block)
    return setLocation(builder.build())
}

/** The public ports and the monthly amount of data transfer allocated for the instance. */
public inline fun CfnInstance.setNetworking(
    block: CfnInstanceNetworkingPropertyDsl.() -> Unit = {}
) {
    val builder = CfnInstanceNetworkingPropertyDsl()
    builder.apply(block)
    return setNetworking(builder.build())
}

/** The status code and the state (for example, `running` ) of the instance. */
public inline fun CfnInstance.setState(block: CfnInstanceStatePropertyDsl.() -> Unit = {}) {
    val builder = CfnInstanceStatePropertyDsl()
    builder.apply(block)
    return setState(builder.build())
}
