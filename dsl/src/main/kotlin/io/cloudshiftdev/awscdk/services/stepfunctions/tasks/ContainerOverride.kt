package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.services.ecs.ContainerDefinition
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ContainerOverride {
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  public fun containerDefinition(): ContainerDefinition

  public fun cpu(): Number? = unwrap(this).getCpu()

  public fun environment(): List<TaskEnvironmentVariable> =
      unwrap(this).getEnvironment()?.map(TaskEnvironmentVariable::wrap) ?: emptyList()

  public fun memoryLimit(): Number? = unwrap(this).getMemoryLimit()

  public fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()

  public interface Builder {
    public fun command(command: List<String>)

    public fun command(vararg command: String)

    public fun containerDefinition(containerDefinition: ContainerDefinition)

    public fun cpu(cpu: Number)

    public fun environment(environment: List<TaskEnvironmentVariable>)

    public fun environment(vararg environment: TaskEnvironmentVariable)

    public fun memoryLimit(memoryLimit: Number)

    public fun memoryReservation(memoryReservation: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride.builder()

    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    override fun command(vararg command: String): Unit = command(command.toList())

    override fun containerDefinition(containerDefinition: ContainerDefinition) {
      cdkBuilder.containerDefinition(containerDefinition.let(ContainerDefinition::unwrap))
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride,
  ) : ContainerOverride {
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    override fun containerDefinition(): ContainerDefinition =
        unwrap(this).getContainerDefinition().let(ContainerDefinition::wrap)

    override fun cpu(): Number? = unwrap(this).getCpu()

    override fun environment(): List<TaskEnvironmentVariable> =
        unwrap(this).getEnvironment()?.map(TaskEnvironmentVariable::wrap) ?: emptyList()

    override fun memoryLimit(): Number? = unwrap(this).getMemoryLimit()

    override fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerOverride {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride):
        ContainerOverride = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerOverride):
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride = (wrapped as
        Wrapper).cdkObject
  }
}
