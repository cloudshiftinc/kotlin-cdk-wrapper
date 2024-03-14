package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.LogDriver
import io.cloudshiftdev.awscdk.services.ecs.Secret
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface ScheduledEc2TaskImageOptions : ScheduledTaskImageProps {
  /**
   * The minimum number of CPU units to reserve for the container.
   *
   * Default: none
   */
  public fun cpu(): Number? = unwrap(this).getCpu()

  /**
   * The hard limit (in MiB) of memory to present to the container.
   *
   * If your container attempts to exceed the allocated memory, the container
   * is terminated.
   *
   * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
   *
   * Default: - No memory limit.
   */
  public fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

  /**
   * The soft limit (in MiB) of memory to reserve for the container.
   *
   * When system memory is under contention, Docker attempts to keep the
   * container memory within the limit. If the container requires more memory,
   * it can consume up to the value specified by the Memory property or all of
   * the available memory on the container instance—whichever comes first.
   *
   * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
   *
   * Default: - No memory reserved.
   */
  public fun memoryReservationMiB(): Number? = unwrap(this).getMemoryReservationMiB()

  /**
   * A builder for [ScheduledEc2TaskImageOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param command The command that is passed to the container.
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     */
    public fun command(command: List<String>)

    /**
     * @param command The command that is passed to the container.
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     */
    public fun command(vararg command: String)

    /**
     * @param cpu The minimum number of CPU units to reserve for the container.
     */
    public fun cpu(cpu: Number)

    /**
     * @param environment The environment variables to pass to the container.
     */
    public fun environment(environment: Map<String, String>)

    /**
     * @param image The image used to start a container. 
     * Image or taskDefinition must be specified, but not both.
     */
    public fun image(image: ContainerImage)

    /**
     * @param logDriver The log driver to use.
     */
    public fun logDriver(logDriver: LogDriver)

    /**
     * @param memoryLimitMiB The hard limit (in MiB) of memory to present to the container.
     * If your container attempts to exceed the allocated memory, the container
     * is terminated.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     */
    public fun memoryLimitMiB(memoryLimitMiB: Number)

    /**
     * @param memoryReservationMiB The soft limit (in MiB) of memory to reserve for the container.
     * When system memory is under contention, Docker attempts to keep the
     * container memory within the limit. If the container requires more memory,
     * it can consume up to the value specified by the Memory property or all of
     * the available memory on the container instance—whichever comes first.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     */
    public fun memoryReservationMiB(memoryReservationMiB: Number)

    /**
     * @param secrets The secret to expose to the container as an environment variable.
     */
    public fun secrets(secrets: Map<String, Secret>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions.Builder =
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions.builder()

    /**
     * @param command The command that is passed to the container.
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     */
    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    /**
     * @param command The command that is passed to the container.
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     */
    override fun command(vararg command: String): Unit = command(command.toList())

    /**
     * @param cpu The minimum number of CPU units to reserve for the container.
     */
    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * @param environment The environment variables to pass to the container.
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    /**
     * @param image The image used to start a container. 
     * Image or taskDefinition must be specified, but not both.
     */
    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    /**
     * @param logDriver The log driver to use.
     */
    override fun logDriver(logDriver: LogDriver) {
      cdkBuilder.logDriver(logDriver.let(LogDriver::unwrap))
    }

    /**
     * @param memoryLimitMiB The hard limit (in MiB) of memory to present to the container.
     * If your container attempts to exceed the allocated memory, the container
     * is terminated.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     */
    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    /**
     * @param memoryReservationMiB The soft limit (in MiB) of memory to reserve for the container.
     * When system memory is under contention, Docker attempts to keep the
     * container memory within the limit. If the container requires more memory,
     * it can consume up to the value specified by the Memory property or all of
     * the available memory on the container instance—whichever comes first.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     */
    override fun memoryReservationMiB(memoryReservationMiB: Number) {
      cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    /**
     * @param secrets The secret to expose to the container as an environment variable.
     */
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
    /**
     * The command that is passed to the container.
     *
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     *
     * Default: - CMD value built into container image.
     */
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * The minimum number of CPU units to reserve for the container.
     *
     * Default: none
     */
    override fun cpu(): Number? = unwrap(this).getCpu()

    /**
     * The environment variables to pass to the container.
     *
     * Default: none
     */
    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    /**
     * The image used to start a container.
     *
     * Image or taskDefinition must be specified, but not both.
     *
     * Default: - none
     */
    override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

    /**
     * The log driver to use.
     *
     * Default: - AwsLogDriver if enableLogging is true
     */
    override fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

    /**
     * The hard limit (in MiB) of memory to present to the container.
     *
     * If your container attempts to exceed the allocated memory, the container
     * is terminated.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     *
     * Default: - No memory limit.
     */
    override fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

    /**
     * The soft limit (in MiB) of memory to reserve for the container.
     *
     * When system memory is under contention, Docker attempts to keep the
     * container memory within the limit. If the container requires more memory,
     * it can consume up to the value specified by the Memory property or all of
     * the available memory on the container instance—whichever comes first.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     *
     * Default: - No memory reserved.
     */
    override fun memoryReservationMiB(): Number? = unwrap(this).getMemoryReservationMiB()

    /**
     * The secret to expose to the container as an environment variable.
     *
     * Default: - No secret environment variables.
     */
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
