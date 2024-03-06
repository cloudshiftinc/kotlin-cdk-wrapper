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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.batch.MultiNodeContainer
import software.amazon.awscdk.services.batch.MultiNodeJobDefinitionProps
import software.amazon.awscdk.services.batch.RetryStrategy
import software.amazon.awscdk.services.ec2.InstanceType

/**
 * Props to configure a MultiNodeJobDefinition.
 *
 * Example:
 * ```
 * MultiNodeJobDefinition multiNodeJob = MultiNodeJobDefinition.Builder.create(this,
 * "JobDefinition")
 * .instanceType(InstanceType.of(InstanceClass.R4, InstanceSize.LARGE)) // optional, omit to let
 * Batch choose the type for you
 * .containers(List.of(MultiNodeContainer.builder()
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "mainMPIContainer")
 * .image(ContainerImage.fromRegistry("yourregsitry.com/yourMPIImage:latest"))
 * .cpu(256)
 * .memory(Size.mebibytes(2048))
 * .build())
 * .startNode(0)
 * .endNode(5)
 * .build()))
 * .build();
 * // convenience method
 * multiNodeJob.addContainer(MultiNodeContainer.builder()
 * .startNode(6)
 * .endNode(10)
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "multiContainer")
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .cpu(256)
 * .memory(Size.mebibytes(2048))
 * .build())
 * .build());
 * ```
 */
@CdkDslMarker
public class MultiNodeJobDefinitionPropsDsl {
    private val cdkBuilder: MultiNodeJobDefinitionProps.Builder =
        MultiNodeJobDefinitionProps.builder()

    private val _containers: MutableList<MultiNodeContainer> = mutableListOf()

    private val _retryStrategies: MutableList<RetryStrategy> = mutableListOf()

    /** @param containers The containers that this multinode job will run. */
    public fun containers(containers: MultiNodeContainerDsl.() -> Unit) {
        _containers.add(MultiNodeContainerDsl().apply(containers).build())
    }

    /** @param containers The containers that this multinode job will run. */
    public fun containers(containers: Collection<MultiNodeContainer>) {
        _containers.addAll(containers)
    }

    /** @param instanceType The instance type that this job definition will run. */
    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    /** @param jobDefinitionName The name of this job definition. */
    public fun jobDefinitionName(jobDefinitionName: String) {
        cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    /**
     * @param mainNode The index of the main node in this job. The main node is responsible for
     *   orchestration.
     */
    public fun mainNode(mainNode: Number) {
        cdkBuilder.mainNode(mainNode)
    }

    /**
     * @param parameters The default parameters passed to the container These parameters can be
     *   referenced in the `command` that you give to the container.
     */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /**
     * @param parameters The default parameters passed to the container These parameters can be
     *   referenced in the `command` that you give to the container.
     */
    public fun parameters(parameters: Map<String, Any>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param propagateTags Whether to propogate tags from the JobDefinition to the ECS task that
     *   Batch spawns.
     */
    public fun propagateTags(propagateTags: Boolean) {
        cdkBuilder.propagateTags(propagateTags)
    }

    /**
     * @param retryAttempts The number of times to retry a job. The job is retried on failure the
     *   same number of attempts as the value.
     */
    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    /** @param retryStrategies Defines the retry behavior for this job. */
    public fun retryStrategies(vararg retryStrategies: RetryStrategy) {
        _retryStrategies.addAll(listOf(*retryStrategies))
    }

    /** @param retryStrategies Defines the retry behavior for this job. */
    public fun retryStrategies(retryStrategies: Collection<RetryStrategy>) {
        _retryStrategies.addAll(retryStrategies)
    }

    /**
     * @param schedulingPriority The priority of this Job. Only used in Fairshare Scheduling to
     *   decide which job to run first when there are multiple jobs with the same share identifier.
     */
    public fun schedulingPriority(schedulingPriority: Number) {
        cdkBuilder.schedulingPriority(schedulingPriority)
    }

    /**
     * @param timeout The timeout time for jobs that are submitted with this job definition. After
     *   the amount of time you specify passes, Batch terminates your jobs if they aren't finished.
     */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): MultiNodeJobDefinitionProps {
        if (_containers.isNotEmpty()) cdkBuilder.containers(_containers)
        if (_retryStrategies.isNotEmpty()) cdkBuilder.retryStrategies(_retryStrategies)
        return cdkBuilder.build()
    }
}
