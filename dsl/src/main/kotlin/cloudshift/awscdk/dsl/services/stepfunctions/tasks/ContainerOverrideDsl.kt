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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.ContainerDefinition
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride
import software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable

/**
 * A list of container overrides that specify the name of a container and the overrides it should
 * receive.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * ContainerDefinition containerDefinition;
 * ContainerOverride containerOverride = ContainerOverride.builder()
 * .containerDefinition(containerDefinition)
 * // the properties below are optional
 * .command(List.of("command"))
 * .cpu(123)
 * .environment(List.of(TaskEnvironmentVariable.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .memoryLimit(123)
 * .memoryReservation(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class ContainerOverrideDsl {
    private val cdkBuilder: ContainerOverride.Builder = ContainerOverride.builder()

    private val _command: MutableList<String> = mutableListOf()

    private val _environment: MutableList<TaskEnvironmentVariable> = mutableListOf()

    /** @param command Command to run inside the container. */
    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    /** @param command Command to run inside the container. */
    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    /** @param containerDefinition Name of the container inside the task definition. */
    public fun containerDefinition(containerDefinition: ContainerDefinition) {
        cdkBuilder.containerDefinition(containerDefinition)
    }

    /** @param cpu The number of cpu units reserved for the container. */
    public fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
    }

    /**
     * @param environment The environment variables to send to the container. You can add new
     *   environment variables, which are added to the container at launch, or you can override the
     *   existing environment variables from the Docker image or the task definition.
     */
    public fun environment(environment: TaskEnvironmentVariableDsl.() -> Unit) {
        _environment.add(TaskEnvironmentVariableDsl().apply(environment).build())
    }

    /**
     * @param environment The environment variables to send to the container. You can add new
     *   environment variables, which are added to the container at launch, or you can override the
     *   existing environment variables from the Docker image or the task definition.
     */
    public fun environment(environment: Collection<TaskEnvironmentVariable>) {
        _environment.addAll(environment)
    }

    /** @param memoryLimit The hard limit (in MiB) of memory to present to the container. */
    public fun memoryLimit(memoryLimit: Number) {
        cdkBuilder.memoryLimit(memoryLimit)
    }

    /** @param memoryReservation The soft limit (in MiB) of memory to reserve for the container. */
    public fun memoryReservation(memoryReservation: Number) {
        cdkBuilder.memoryReservation(memoryReservation)
    }

    public fun build(): ContainerOverride {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        if (_environment.isNotEmpty()) cdkBuilder.environment(_environment)
        return cdkBuilder.build()
    }
}
