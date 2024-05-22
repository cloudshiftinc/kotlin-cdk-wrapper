@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecs.ContainerDefinition
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A list of container overrides that specify the name of a container and the overrides it should
 * receive.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
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
public interface ContainerOverride {
  /**
   * Command to run inside the container.
   *
   * Default: - Default command from the Docker image or the task definition
   */
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  /**
   * Name of the container inside the task definition.
   */
  public fun containerDefinition(): ContainerDefinition

  /**
   * The number of cpu units reserved for the container.
   *
   * Default: - The default value from the task definition.
   */
  public fun cpu(): Number? = unwrap(this).getCpu()

  /**
   * The environment variables to send to the container.
   *
   * You can add new environment variables, which are added to the container at launch,
   * or you can override the existing environment variables from the Docker image or the task
   * definition.
   *
   * Default: - The existing environment variables from the Docker image or the task definition
   */
  public fun environment(): List<TaskEnvironmentVariable> =
      unwrap(this).getEnvironment()?.map(TaskEnvironmentVariable::wrap) ?: emptyList()

  /**
   * The hard limit (in MiB) of memory to present to the container.
   *
   * Default: - The default value from the task definition.
   */
  public fun memoryLimit(): Number? = unwrap(this).getMemoryLimit()

  /**
   * The soft limit (in MiB) of memory to reserve for the container.
   *
   * Default: - The default value from the task definition.
   */
  public fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()

  /**
   * A builder for [ContainerOverride]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param command Command to run inside the container.
     */
    public fun command(command: List<String>)

    /**
     * @param command Command to run inside the container.
     */
    public fun command(vararg command: String)

    /**
     * @param containerDefinition Name of the container inside the task definition. 
     */
    public fun containerDefinition(containerDefinition: ContainerDefinition)

    /**
     * @param cpu The number of cpu units reserved for the container.
     */
    public fun cpu(cpu: Number)

    /**
     * @param environment The environment variables to send to the container.
     * You can add new environment variables, which are added to the container at launch,
     * or you can override the existing environment variables from the Docker image or the task
     * definition.
     */
    public fun environment(environment: List<TaskEnvironmentVariable>)

    /**
     * @param environment The environment variables to send to the container.
     * You can add new environment variables, which are added to the container at launch,
     * or you can override the existing environment variables from the Docker image or the task
     * definition.
     */
    public fun environment(vararg environment: TaskEnvironmentVariable)

    /**
     * @param memoryLimit The hard limit (in MiB) of memory to present to the container.
     */
    public fun memoryLimit(memoryLimit: Number)

    /**
     * @param memoryReservation The soft limit (in MiB) of memory to reserve for the container.
     */
    public fun memoryReservation(memoryReservation: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride.builder()

    /**
     * @param command Command to run inside the container.
     */
    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    /**
     * @param command Command to run inside the container.
     */
    override fun command(vararg command: String): Unit = command(command.toList())

    /**
     * @param containerDefinition Name of the container inside the task definition. 
     */
    override fun containerDefinition(containerDefinition: ContainerDefinition) {
      cdkBuilder.containerDefinition(containerDefinition.let(ContainerDefinition.Companion::unwrap))
    }

    /**
     * @param cpu The number of cpu units reserved for the container.
     */
    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * @param environment The environment variables to send to the container.
     * You can add new environment variables, which are added to the container at launch,
     * or you can override the existing environment variables from the Docker image or the task
     * definition.
     */
    override fun environment(environment: List<TaskEnvironmentVariable>) {
      cdkBuilder.environment(environment.map(TaskEnvironmentVariable.Companion::unwrap))
    }

    /**
     * @param environment The environment variables to send to the container.
     * You can add new environment variables, which are added to the container at launch,
     * or you can override the existing environment variables from the Docker image or the task
     * definition.
     */
    override fun environment(vararg environment: TaskEnvironmentVariable): Unit =
        environment(environment.toList())

    /**
     * @param memoryLimit The hard limit (in MiB) of memory to present to the container.
     */
    override fun memoryLimit(memoryLimit: Number) {
      cdkBuilder.memoryLimit(memoryLimit)
    }

    /**
     * @param memoryReservation The soft limit (in MiB) of memory to reserve for the container.
     */
    override fun memoryReservation(memoryReservation: Number) {
      cdkBuilder.memoryReservation(memoryReservation)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride,
  ) : CdkObject(cdkObject), ContainerOverride {
    /**
     * Command to run inside the container.
     *
     * Default: - Default command from the Docker image or the task definition
     */
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * Name of the container inside the task definition.
     */
    override fun containerDefinition(): ContainerDefinition =
        unwrap(this).getContainerDefinition().let(ContainerDefinition::wrap)

    /**
     * The number of cpu units reserved for the container.
     *
     * Default: - The default value from the task definition.
     */
    override fun cpu(): Number? = unwrap(this).getCpu()

    /**
     * The environment variables to send to the container.
     *
     * You can add new environment variables, which are added to the container at launch,
     * or you can override the existing environment variables from the Docker image or the task
     * definition.
     *
     * Default: - The existing environment variables from the Docker image or the task definition
     */
    override fun environment(): List<TaskEnvironmentVariable> =
        unwrap(this).getEnvironment()?.map(TaskEnvironmentVariable::wrap) ?: emptyList()

    /**
     * The hard limit (in MiB) of memory to present to the container.
     *
     * Default: - The default value from the task definition.
     */
    override fun memoryLimit(): Number? = unwrap(this).getMemoryLimit()

    /**
     * The soft limit (in MiB) of memory to reserve for the container.
     *
     * Default: - The default value from the task definition.
     */
    override fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerOverride {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride):
        ContainerOverride = CdkObjectWrappers.wrap(cdkObject) as? ContainerOverride ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerOverride):
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride
  }
}
