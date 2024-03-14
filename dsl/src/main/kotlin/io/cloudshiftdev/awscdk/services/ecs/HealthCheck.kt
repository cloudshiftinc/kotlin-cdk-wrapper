package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface HealthCheck {
  public fun command(): List<String>

  public fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

  public fun retries(): Number? = unwrap(this).getRetries()

  public fun startPeriod(): Duration? = unwrap(this).getStartPeriod()?.let(Duration::wrap)

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public interface Builder {
    public fun command(command: List<String>)

    public fun command(vararg command: String)

    public fun interval(interval: Duration)

    public fun retries(retries: Number)

    public fun startPeriod(startPeriod: Duration)

    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.HealthCheck.Builder =
        software.amazon.awscdk.services.ecs.HealthCheck.builder()

    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    override fun command(vararg command: String): Unit = command(command.toList())

    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    override fun retries(retries: Number) {
      cdkBuilder.retries(retries)
    }

    override fun startPeriod(startPeriod: Duration) {
      cdkBuilder.startPeriod(startPeriod.let(Duration::unwrap))
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.HealthCheck = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.HealthCheck,
  ) : HealthCheck {
    override fun command(): List<String> = unwrap(this).getCommand()

    override fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

    override fun retries(): Number? = unwrap(this).getRetries()

    override fun startPeriod(): Duration? = unwrap(this).getStartPeriod()?.let(Duration::wrap)

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
