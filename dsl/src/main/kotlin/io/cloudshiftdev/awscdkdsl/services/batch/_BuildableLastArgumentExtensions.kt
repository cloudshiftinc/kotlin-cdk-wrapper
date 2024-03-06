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

package io.cloudshiftdev.awscdkdsl.services.batch

import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnComputeEnvironment
import software.amazon.awscdk.services.batch.CfnJobDefinition
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy
import software.amazon.awscdk.services.batch.EcsEc2ContainerDefinition
import software.amazon.awscdk.services.batch.FairshareSchedulingPolicy
import software.amazon.awscdk.services.batch.IEcsEc2ContainerDefinition
import software.amazon.awscdk.services.batch.LinuxParameters
import software.amazon.awscdk.services.batch.MultiNodeJobDefinition

/**
 * The ComputeResources property type specifies details of the compute resources managed by the
 * compute environment.
 */
public inline fun CfnComputeEnvironment.setComputeResources(
    block: CfnComputeEnvironmentComputeResourcesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnComputeEnvironmentComputeResourcesPropertyDsl()
    builder.apply(block)
    return setComputeResources(builder.build())
}

/** The details for the Amazon EKS cluster that supports the compute environment. */
public inline fun CfnComputeEnvironment.setEksConfiguration(
    block: CfnComputeEnvironmentEksConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnComputeEnvironmentEksConfigurationPropertyDsl()
    builder.apply(block)
    return setEksConfiguration(builder.build())
}

/** Specifies the infrastructure update policy for the compute environment. */
public inline fun CfnComputeEnvironment.setUpdatePolicy(
    block: CfnComputeEnvironmentUpdatePolicyPropertyDsl.() -> Unit = {}
) {
    val builder = CfnComputeEnvironmentUpdatePolicyPropertyDsl()
    builder.apply(block)
    return setUpdatePolicy(builder.build())
}

/** An object with various properties specific to Amazon ECS based jobs. */
public inline fun CfnJobDefinition.setContainerProperties(
    block: CfnJobDefinitionContainerPropertiesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnJobDefinitionContainerPropertiesPropertyDsl()
    builder.apply(block)
    return setContainerProperties(builder.build())
}

/** An object with various properties that are specific to Amazon EKS based jobs. */
public inline fun CfnJobDefinition.setEksProperties(
    block: CfnJobDefinitionEksPropertiesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnJobDefinitionEksPropertiesPropertyDsl()
    builder.apply(block)
    return setEksProperties(builder.build())
}

/** An object with various properties that are specific to multi-node parallel jobs. */
public inline fun CfnJobDefinition.setNodeProperties(
    block: CfnJobDefinitionNodePropertiesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnJobDefinitionNodePropertiesPropertyDsl()
    builder.apply(block)
    return setNodeProperties(builder.build())
}

/** The retry strategy to use for failed jobs that are submitted with this job definition. */
public inline fun CfnJobDefinition.setRetryStrategy(
    block: CfnJobDefinitionRetryStrategyPropertyDsl.() -> Unit = {}
) {
    val builder = CfnJobDefinitionRetryStrategyPropertyDsl()
    builder.apply(block)
    return setRetryStrategy(builder.build())
}

/** The timeout time for jobs that are submitted with this job definition. */
public inline fun CfnJobDefinition.setTimeout(
    block: CfnJobDefinitionTimeoutPropertyDsl.() -> Unit = {}
) {
    val builder = CfnJobDefinitionTimeoutPropertyDsl()
    builder.apply(block)
    return setTimeout(builder.build())
}

/** The fair share policy of the scheduling policy. */
public inline fun CfnSchedulingPolicy.setFairsharePolicy(
    block: CfnSchedulingPolicyFairsharePolicyPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSchedulingPolicyFairsharePolicyPropertyDsl()
    builder.apply(block)
    return setFairsharePolicy(builder.build())
}

/**
 * Add a ulimit to this container.
 *
 * @param ulimit
 */
public inline fun EcsEc2ContainerDefinition.addUlimit(block: UlimitDsl.() -> Unit = {}) {
    val builder = UlimitDsl()
    builder.apply(block)
    return addUlimit(builder.build())
}

/**
 * Add a share this to this Fairshare SchedulingPolicy.
 *
 * @param share
 */
public inline fun FairshareSchedulingPolicy.addShare(block: ShareDsl.() -> Unit = {}) {
    val builder = ShareDsl()
    builder.apply(block)
    return addShare(builder.build())
}

/**
 * Add a ulimit to this container.
 *
 * @param ulimit
 */
public inline fun IEcsEc2ContainerDefinition.addUlimit(block: UlimitDsl.() -> Unit = {}) {
    val builder = UlimitDsl()
    builder.apply(block)
    return addUlimit(builder.build())
}

/**
 * Adds one or more host devices to a container.
 *
 * @param device
 */
public inline fun LinuxParameters.addDevices(block: DeviceDsl.() -> Unit = {}) {
    val builder = DeviceDsl()
    builder.apply(block)
    return addDevices(builder.build())
}

/**
 * Specifies the container path, mount options, and size (in MiB) of the tmpfs mount for a
 * container.
 *
 * Only works with EC2 launch type.
 *
 * @param tmpfs
 */
public inline fun LinuxParameters.addTmpfs(block: TmpfsDsl.() -> Unit = {}) {
    val builder = TmpfsDsl()
    builder.apply(block)
    return addTmpfs(builder.build())
}

/**
 * Add a container to this multinode job.
 *
 * @param container
 */
public inline fun MultiNodeJobDefinition.addContainer(
    block: MultiNodeContainerDsl.() -> Unit = {}
) {
    val builder = MultiNodeContainerDsl()
    builder.apply(block)
    return addContainer(builder.build())
}
