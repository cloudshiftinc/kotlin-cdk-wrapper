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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.batch.JobDefinitionProps
import software.amazon.awscdk.services.batch.RetryStrategy

/**
 * Props common to all JobDefinitions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.batch.*;
 * Object parameters;
 * RetryStrategy retryStrategy;
 * JobDefinitionProps jobDefinitionProps = JobDefinitionProps.builder()
 * .jobDefinitionName("jobDefinitionName")
 * .parameters(Map.of(
 * "parametersKey", parameters))
 * .retryAttempts(123)
 * .retryStrategies(List.of(retryStrategy))
 * .schedulingPriority(123)
 * .timeout(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class JobDefinitionPropsDsl {
    private val cdkBuilder: JobDefinitionProps.Builder = JobDefinitionProps.builder()

    private val _retryStrategies: MutableList<RetryStrategy> = mutableListOf()

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

    public fun build(): JobDefinitionProps {
        if (_retryStrategies.isNotEmpty()) cdkBuilder.retryStrategies(_retryStrategies)
        return cdkBuilder.build()
    }
}
