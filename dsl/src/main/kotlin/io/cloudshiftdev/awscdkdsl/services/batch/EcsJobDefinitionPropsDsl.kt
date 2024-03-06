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
import software.amazon.awscdk.services.batch.EcsJobDefinitionProps
import software.amazon.awscdk.services.batch.IEcsContainerDefinition
import software.amazon.awscdk.services.batch.RetryStrategy

/**
 * Props for EcsJobDefinition.
 *
 * Example:
 * ```
 * IVpc vpc;
 * EcsJobDefinition ecsJob = EcsJobDefinition.Builder.create(this, "JobDefn")
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
 * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
 * .memory(Size.mebibytes(2048))
 * .cpu(256)
 * .build())
 * .build();
 * JobQueue queue = JobQueue.Builder.create(this, "JobQueue")
 * .computeEnvironments(List.of(OrderedComputeEnvironment.builder()
 * .computeEnvironment(ManagedEc2EcsComputeEnvironment.Builder.create(this, "managedEc2CE")
 * .vpc(vpc)
 * .build())
 * .order(1)
 * .build()))
 * .priority(10)
 * .build();
 * User user = new User(this, "MyUser");
 * ecsJob.grantSubmitJob(user, queue);
 * ```
 */
@CdkDslMarker
public class EcsJobDefinitionPropsDsl {
    private val cdkBuilder: EcsJobDefinitionProps.Builder = EcsJobDefinitionProps.builder()

    private val _retryStrategies: MutableList<RetryStrategy> = mutableListOf()

    /** @param container The container that this job will run. */
    public fun container(container: IEcsContainerDefinition) {
        cdkBuilder.container(container)
    }

    /** @param jobDefinitionName The name of this job definition. */
    public fun jobDefinitionName(jobDefinitionName: String) {
        cdkBuilder.jobDefinitionName(jobDefinitionName)
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

    public fun build(): EcsJobDefinitionProps {
        if (_retryStrategies.isNotEmpty()) cdkBuilder.retryStrategies(_retryStrategies)
        return cdkBuilder.build()
    }
}
