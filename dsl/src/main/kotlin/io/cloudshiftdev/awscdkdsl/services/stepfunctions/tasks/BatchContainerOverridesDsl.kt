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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.stepfunctions.tasks.BatchContainerOverrides

/**
 * The overrides that should be sent to a container.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * InstanceType instanceType;
 * Size size;
 * BatchContainerOverrides batchContainerOverrides = BatchContainerOverrides.builder()
 * .command(List.of("command"))
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .gpuCount(123)
 * .instanceType(instanceType)
 * .memory(size)
 * .vcpus(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class BatchContainerOverridesDsl {
    private val cdkBuilder: BatchContainerOverrides.Builder = BatchContainerOverrides.builder()

    private val _command: MutableList<String> = mutableListOf()

    /**
     * @param command The command to send to the container that overrides the default command from
     *   the Docker image or the job definition.
     */
    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    /**
     * @param command The command to send to the container that overrides the default command from
     *   the Docker image or the job definition.
     */
    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    /**
     * @param environment The environment variables to send to the container. You can add new
     *   environment variables, which are added to the container at launch, or you can override the
     *   existing environment variables from the Docker image or the job definition.
     */
    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param gpuCount The number of physical GPUs to reserve for the container. The number of GPUs
     *   reserved for all containers in a job should not exceed the number of available GPUs on the
     *   compute resource that the job is launched on.
     */
    public fun gpuCount(gpuCount: Number) {
        cdkBuilder.gpuCount(gpuCount)
    }

    /**
     * @param instanceType The instance type to use for a multi-node parallel job. This parameter is
     *   not valid for single-node container jobs.
     */
    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    /** @param memory Memory reserved for the job. */
    public fun memory(memory: Size) {
        cdkBuilder.memory(memory)
    }

    /**
     * @param vcpus The number of vCPUs to reserve for the container. This value overrides the value
     *   set in the job definition.
     */
    public fun vcpus(vcpus: Number) {
        cdkBuilder.vcpus(vcpus)
    }

    public fun build(): BatchContainerOverrides {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        return cdkBuilder.build()
    }
}
