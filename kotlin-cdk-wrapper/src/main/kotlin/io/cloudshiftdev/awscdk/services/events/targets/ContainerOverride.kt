@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ContainerOverride {
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  public fun containerName(): String

  public fun cpu(): Number? = unwrap(this).getCpu()

  public fun environment(): List<TaskEnvironmentVariable> =
      unwrap(this).getEnvironment()?.map(TaskEnvironmentVariable::wrap) ?: emptyList()

  public fun memoryLimit(): Number? = unwrap(this).getMemoryLimit()

  public fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()

  @CdkDslMarker
  public interface Builder {
    public fun command(command: List<String>)

    public fun command(vararg command: String)

    public fun containerName(containerName: String)

    public fun cpu(cpu: Number)

    public fun environment(environment: List<TaskEnvironmentVariable>)

    public fun environment(vararg environment: TaskEnvironmentVariable)

    public fun memoryLimit(memoryLimit: Number)

    public fun memoryReservation(memoryReservation: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.ContainerOverride.Builder
        = software.amazon.awscdk.services.events.targets.ContainerOverride.builder()

    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    override fun command(vararg command: String): Unit = command(command.toList())

    override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    override fun environment(environment: List<TaskEnvironmentVariable>) {
      cdkBuilder.environment(environment.map(TaskEnvironmentVariable::unwrap))
    }

    override fun environment(vararg environment: TaskEnvironmentVariable): Unit =
        environment(environment.toList())

    override fun memoryLimit(memoryLimit: Number) {
      cdkBuilder.memoryLimit(memoryLimit)
    }

    override fun memoryReservation(memoryReservation: Number) {
      cdkBuilder.memoryReservation(memoryReservation)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.ContainerOverride =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.ContainerOverride,
  ) : CdkObject(cdkObject), ContainerOverride {
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    override fun containerName(): String = unwrap(this).getContainerName()

    override fun cpu(): Number? = unwrap(this).getCpu()

    override fun environment(): List<TaskEnvironmentVariable> =
        unwrap(this).getEnvironment()?.map(TaskEnvironmentVariable::wrap) ?: emptyList()

    override fun memoryLimit(): Number? = unwrap(this).getMemoryLimit()

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
