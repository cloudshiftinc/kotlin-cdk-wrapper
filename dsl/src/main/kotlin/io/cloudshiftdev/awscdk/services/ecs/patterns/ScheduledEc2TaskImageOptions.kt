package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.LogDriver
import io.cloudshiftdev.awscdk.services.ecs.Secret
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface ScheduledEc2TaskImageOptions : ScheduledTaskImageProps {
  public fun cpu(): Number? = unwrap(this).getCpu()

  public fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

  public fun memoryReservationMiB(): Number? = unwrap(this).getMemoryReservationMiB()

  public interface Builder {
    public fun command(command: List<String>)

    public fun command(vararg command: String)

    public fun cpu(cpu: Number)

    public fun environment(environment: Map<String, String>)

    public fun image(image: ContainerImage)

    public fun logDriver(logDriver: LogDriver)

    public fun memoryLimitMiB(memoryLimitMiB: Number)

    public fun memoryReservationMiB(memoryReservationMiB: Number)

    public fun secrets(secrets: Map<String, Secret>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions.Builder =
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions.builder()

    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    override fun command(vararg command: String): Unit = command(command.toList())

    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    override fun logDriver(logDriver: LogDriver) {
      cdkBuilder.logDriver(logDriver.let(LogDriver::unwrap))
    }

    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    override fun memoryReservationMiB(memoryReservationMiB: Number) {
      cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues{Secret.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions,
  ) : ScheduledEc2TaskImageOptions {
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    override fun cpu(): Number? = unwrap(this).getCpu()

    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

    override fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

    override fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

    override fun memoryReservationMiB(): Number? = unwrap(this).getMemoryReservationMiB()

    override fun secrets(): Map<String, Secret> =
        unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ScheduledEc2TaskImageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions):
        ScheduledEc2TaskImageOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduledEc2TaskImageOptions):
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions = (wrapped as
        Wrapper).cdkObject
  }
}
