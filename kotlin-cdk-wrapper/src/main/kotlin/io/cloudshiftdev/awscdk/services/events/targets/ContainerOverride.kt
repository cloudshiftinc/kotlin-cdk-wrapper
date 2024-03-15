@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.targets.*;
 * ContainerOverride containerOverride = ContainerOverride.builder()
 * .containerName("containerName")
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
   * Default: Default command
   */
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  /**
   * Name of the container inside the task definition.
   */
  public fun containerName(): String

  /**
   * The number of cpu units reserved for the container.
   *
   * Default: The default value from the task definition.
   */
  public fun cpu(): Number? = unwrap(this).getCpu()

  /**
   * Variables to set in the container's environment.
   */
  public fun environment(): List<TaskEnvironmentVariable> =
      unwrap(this).getEnvironment()?.map(TaskEnvironmentVariable::wrap) ?: emptyList()

  /**
   * Hard memory limit on the container.
   *
   * Default: The default value from the task definition.
   */
  public fun memoryLimit(): Number? = unwrap(this).getMemoryLimit()

  /**
   * Soft memory limit on the container.
   *
   * Default: The default value from the task definition.
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
     * @param containerName Name of the container inside the task definition. 
     */
    public fun containerName(containerName: String)

    /**
     * @param cpu The number of cpu units reserved for the container.
     */
    public fun cpu(cpu: Number)

    /**
     * @param environment Variables to set in the container's environment.
     */
    public fun environment(environment: List<TaskEnvironmentVariable>)

    /**
     * @param environment Variables to set in the container's environment.
     */
    public fun environment(vararg environment: TaskEnvironmentVariable)

    /**
     * @param memoryLimit Hard memory limit on the container.
     */
    public fun memoryLimit(memoryLimit: Number)

    /**
     * @param memoryReservation Soft memory limit on the container.
     */
    public fun memoryReservation(memoryReservation: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.ContainerOverride.Builder
        = software.amazon.awscdk.services.events.targets.ContainerOverride.builder()

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
     * @param containerName Name of the container inside the task definition. 
     */
    override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    /**
     * @param cpu The number of cpu units reserved for the container.
     */
    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * @param environment Variables to set in the container's environment.
     */
    override fun environment(environment: List<TaskEnvironmentVariable>) {
      cdkBuilder.environment(environment.map(TaskEnvironmentVariable::unwrap))
    }

    /**
     * @param environment Variables to set in the container's environment.
     */
    override fun environment(vararg environment: TaskEnvironmentVariable): Unit =
        environment(environment.toList())

    /**
     * @param memoryLimit Hard memory limit on the container.
     */
    override fun memoryLimit(memoryLimit: Number) {
      cdkBuilder.memoryLimit(memoryLimit)
    }

    /**
     * @param memoryReservation Soft memory limit on the container.
     */
    override fun memoryReservation(memoryReservation: Number) {
      cdkBuilder.memoryReservation(memoryReservation)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.ContainerOverride =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.ContainerOverride,
  ) : CdkObject(cdkObject), ContainerOverride {
    /**
     * Command to run inside the container.
     *
     * Default: Default command
     */
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * Name of the container inside the task definition.
     */
    override fun containerName(): String = unwrap(this).getContainerName()

    /**
     * The number of cpu units reserved for the container.
     *
     * Default: The default value from the task definition.
     */
    override fun cpu(): Number? = unwrap(this).getCpu()

    /**
     * Variables to set in the container's environment.
     */
    override fun environment(): List<TaskEnvironmentVariable> =
        unwrap(this).getEnvironment()?.map(TaskEnvironmentVariable::wrap) ?: emptyList()

    /**
     * Hard memory limit on the container.
     *
     * Default: The default value from the task definition.
     */
    override fun memoryLimit(): Number? = unwrap(this).getMemoryLimit()

    /**
     * Soft memory limit on the container.
     *
     * Default: The default value from the task definition.
     */
    override fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerOverride {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.ContainerOverride):
        ContainerOverride = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerOverride):
        software.amazon.awscdk.services.events.targets.ContainerOverride = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.ContainerOverride
  }
}
