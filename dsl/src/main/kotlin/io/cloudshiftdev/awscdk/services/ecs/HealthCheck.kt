package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface HealthCheck {
  /**
   * A string array representing the command that the container runs to determine if it is healthy.
   *
   * The string array must start with CMD to execute the command arguments directly, or
   * CMD-SHELL to run the command with the container's default shell.
   *
   * For example: [ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]
   */
  public fun command(): List<String>

  /**
   * The time period in seconds between each health check execution.
   *
   * You may specify between 5 and 300 seconds.
   *
   * Default: Duration.seconds(30)
   */
  public fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

  /**
   * The number of times to retry a failed health check before the container is considered
   * unhealthy.
   *
   * You may specify between 1 and 10 retries.
   *
   * Default: 3
   */
  public fun retries(): Number? = unwrap(this).getRetries()

  /**
   * The optional grace period within which to provide containers time to bootstrap before failed
   * health checks count towards the maximum number of retries.
   *
   * You may specify between 0 and 300 seconds.
   *
   * Default: No start period
   */
  public fun startPeriod(): Duration? = unwrap(this).getStartPeriod()?.let(Duration::wrap)

  /**
   * The time period in seconds to wait for a health check to succeed before it is considered a
   * failure.
   *
   * You may specify between 2 and 60 seconds.
   *
   * Default: Duration.seconds(5)
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * A builder for [HealthCheck]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param command A string array representing the command that the container runs to determine
     * if it is healthy. 
     * The string array must start with CMD to execute the command arguments directly, or
     * CMD-SHELL to run the command with the container's default shell.
     *
     * For example: [ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]
     */
    public fun command(command: List<String>)

    /**
     * @param command A string array representing the command that the container runs to determine
     * if it is healthy. 
     * The string array must start with CMD to execute the command arguments directly, or
     * CMD-SHELL to run the command with the container's default shell.
     *
     * For example: [ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]
     */
    public fun command(vararg command: String)

    /**
     * @param interval The time period in seconds between each health check execution.
     * You may specify between 5 and 300 seconds.
     */
    public fun interval(interval: Duration)

    /**
     * @param retries The number of times to retry a failed health check before the container is
     * considered unhealthy.
     * You may specify between 1 and 10 retries.
     */
    public fun retries(retries: Number)

    /**
     * @param startPeriod The optional grace period within which to provide containers time to
     * bootstrap before failed health checks count towards the maximum number of retries.
     * You may specify between 0 and 300 seconds.
     */
    public fun startPeriod(startPeriod: Duration)

    /**
     * @param timeout The time period in seconds to wait for a health check to succeed before it is
     * considered a failure.
     * You may specify between 2 and 60 seconds.
     */
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.HealthCheck.Builder =
        software.amazon.awscdk.services.ecs.HealthCheck.builder()

    /**
     * @param command A string array representing the command that the container runs to determine
     * if it is healthy. 
     * The string array must start with CMD to execute the command arguments directly, or
     * CMD-SHELL to run the command with the container's default shell.
     *
     * For example: [ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]
     */
    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    /**
     * @param command A string array representing the command that the container runs to determine
     * if it is healthy. 
     * The string array must start with CMD to execute the command arguments directly, or
     * CMD-SHELL to run the command with the container's default shell.
     *
     * For example: [ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]
     */
    override fun command(vararg command: String): Unit = command(command.toList())

    /**
     * @param interval The time period in seconds between each health check execution.
     * You may specify between 5 and 300 seconds.
     */
    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    /**
     * @param retries The number of times to retry a failed health check before the container is
     * considered unhealthy.
     * You may specify between 1 and 10 retries.
     */
    override fun retries(retries: Number) {
      cdkBuilder.retries(retries)
    }

    /**
     * @param startPeriod The optional grace period within which to provide containers time to
     * bootstrap before failed health checks count towards the maximum number of retries.
     * You may specify between 0 and 300 seconds.
     */
    override fun startPeriod(startPeriod: Duration) {
      cdkBuilder.startPeriod(startPeriod.let(Duration::unwrap))
    }

    /**
     * @param timeout The time period in seconds to wait for a health check to succeed before it is
     * considered a failure.
     * You may specify between 2 and 60 seconds.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.HealthCheck = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.HealthCheck,
  ) : HealthCheck {
    /**
     * A string array representing the command that the container runs to determine if it is
     * healthy.
     *
     * The string array must start with CMD to execute the command arguments directly, or
     * CMD-SHELL to run the command with the container's default shell.
     *
     * For example: [ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]
     */
    override fun command(): List<String> = unwrap(this).getCommand()

    /**
     * The time period in seconds between each health check execution.
     *
     * You may specify between 5 and 300 seconds.
     *
     * Default: Duration.seconds(30)
     */
    override fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

    /**
     * The number of times to retry a failed health check before the container is considered
     * unhealthy.
     *
     * You may specify between 1 and 10 retries.
     *
     * Default: 3
     */
    override fun retries(): Number? = unwrap(this).getRetries()

    /**
     * The optional grace period within which to provide containers time to bootstrap before failed
     * health checks count towards the maximum number of retries.
     *
     * You may specify between 0 and 300 seconds.
     *
     * Default: No start period
     */
    override fun startPeriod(): Duration? = unwrap(this).getStartPeriod()?.let(Duration::wrap)

    /**
     * The time period in seconds to wait for a health check to succeed before it is considered a
     * failure.
     *
     * You may specify between 2 and 60 seconds.
     *
     * Default: Duration.seconds(5)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheck {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.HealthCheck): HealthCheck =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheck): software.amazon.awscdk.services.ecs.HealthCheck =
        (wrapped as Wrapper).cdkObject
  }
}
