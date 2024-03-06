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
import software.amazon.awscdk.services.batch.DnsPolicy
import software.amazon.awscdk.services.batch.EksContainerDefinition
import software.amazon.awscdk.services.batch.EksJobDefinitionProps
import software.amazon.awscdk.services.batch.RetryStrategy

/**
 * Props for EksJobDefinition.
 *
 * Example:
 * ```
 * EksJobDefinition jobDefn = EksJobDefinition.Builder.create(this, "eksf2")
 * .container(EksContainerDefinition.Builder.create(this, "container")
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .volumes(List.of(EksVolume.emptyDir(EmptyDirVolumeOptions.builder()
 * .name("myEmptyDirVolume")
 * .mountPath("/mount/path")
 * .medium(EmptyDirMediumType.MEMORY)
 * .readonly(true)
 * .sizeLimit(Size.mebibytes(2048))
 * .build())))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class EksJobDefinitionPropsDsl {
    private val cdkBuilder: EksJobDefinitionProps.Builder = EksJobDefinitionProps.builder()

    private val _retryStrategies: MutableList<RetryStrategy> = mutableListOf()

    /** @param container The container this Job Definition will run. */
    public fun container(container: EksContainerDefinition) {
        cdkBuilder.container(container)
    }

    /** @param dnsPolicy The DNS Policy of the pod used by this Job Definition. */
    public fun dnsPolicy(dnsPolicy: DnsPolicy) {
        cdkBuilder.dnsPolicy(dnsPolicy)
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
     * @param serviceAccount The name of the service account that's used to run the container.
     *   service accounts are Kubernetes method of identification and authentication, roughly
     *   analogous to IAM users.
     */
    public fun serviceAccount(serviceAccount: String) {
        cdkBuilder.serviceAccount(serviceAccount)
    }

    /**
     * @param timeout The timeout time for jobs that are submitted with this job definition. After
     *   the amount of time you specify passes, Batch terminates your jobs if they aren't finished.
     */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * @param useHostNetwork If specified, the Pod used by this Job Definition will use the host's
     *   network IP address. Otherwise, the Kubernetes pod networking model is enabled. Most AWS
     *   Batch workloads are egress-only and don't require the overhead of IP allocation for each
     *   pod for incoming connections.
     */
    public fun useHostNetwork(useHostNetwork: Boolean) {
        cdkBuilder.useHostNetwork(useHostNetwork)
    }

    public fun build(): EksJobDefinitionProps {
        if (_retryStrategies.isNotEmpty()) cdkBuilder.retryStrategies(_retryStrategies)
        return cdkBuilder.build()
    }
}
