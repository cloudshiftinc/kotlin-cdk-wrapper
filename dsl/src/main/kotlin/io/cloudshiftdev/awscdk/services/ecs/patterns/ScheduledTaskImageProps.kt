package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.LogDriver
import io.cloudshiftdev.awscdk.services.ecs.Secret
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface ScheduledTaskImageProps {
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  public fun image(): ContainerImage

  public fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

  public fun secrets(): Map<String, Secret> =
      unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

  public interface Builder {
    public fun command(command: List<String>)

    public fun command(vararg command: String)

    public fun environment(environment: Map<String, String>)

    public fun image(image: ContainerImage)

    public fun logDriver(logDriver: LogDriver)

    public fun secrets(secrets: Map<String, Secret>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps.builder()

    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    override fun command(vararg command: String): Unit = command(command.toList())

    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    override fun logDriver(logDriver: LogDriver) {
      cdkBuilder.logDriver(logDriver.let(LogDriver::unwrap))
    }

    override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues{Secret.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps,
  ) : ScheduledTaskImageProps {
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

    override fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

    override fun secrets(): Map<String, Secret> =
        unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ScheduledTaskImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps):
        ScheduledTaskImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduledTaskImageProps):
        software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps = (wrapped as
        Wrapper).cdkObject
  }
}
