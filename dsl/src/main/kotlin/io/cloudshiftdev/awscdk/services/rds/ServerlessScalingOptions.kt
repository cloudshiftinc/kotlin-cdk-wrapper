package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import kotlin.Unit

public interface ServerlessScalingOptions {
  public fun autoPause(): Duration? = unwrap(this).getAutoPause()?.let(Duration::wrap)

  public fun maxCapacity(): AuroraCapacityUnit? =
      unwrap(this).getMaxCapacity()?.let(AuroraCapacityUnit::wrap)

  public fun minCapacity(): AuroraCapacityUnit? =
      unwrap(this).getMinCapacity()?.let(AuroraCapacityUnit::wrap)

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public fun timeoutAction(): TimeoutAction? =
      unwrap(this).getTimeoutAction()?.let(TimeoutAction::wrap)

  public interface Builder {
    public fun autoPause(autoPause: Duration) {
    }

    public fun maxCapacity(maxCapacity: AuroraCapacityUnit) {
    }

    public fun minCapacity(minCapacity: AuroraCapacityUnit) {
    }

    public fun timeout(timeout: Duration) {
    }

    public fun timeoutAction(timeoutAction: TimeoutAction) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ServerlessScalingOptions.Builder =
        software.amazon.awscdk.services.rds.ServerlessScalingOptions.builder()

    public override fun autoPause(autoPause: Duration) {
      cdkBuilder.autoPause(autoPause.let(Duration::unwrap))
    }

    public override fun maxCapacity(maxCapacity: AuroraCapacityUnit) {
      cdkBuilder.maxCapacity(maxCapacity.let(AuroraCapacityUnit::unwrap))
    }

    public override fun minCapacity(minCapacity: AuroraCapacityUnit) {
      cdkBuilder.minCapacity(minCapacity.let(AuroraCapacityUnit::unwrap))
    }

    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public override fun timeoutAction(timeoutAction: TimeoutAction) {
      cdkBuilder.timeoutAction(timeoutAction.let(TimeoutAction::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.ServerlessScalingOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.ServerlessScalingOptions,
  ) : ServerlessScalingOptions {
    public override fun autoPause(): Duration? = unwrap(this).getAutoPause()?.let(Duration::wrap)

    public override fun maxCapacity(): AuroraCapacityUnit? =
        unwrap(this).getMaxCapacity()?.let(AuroraCapacityUnit::wrap)

    public override fun minCapacity(): AuroraCapacityUnit? =
        unwrap(this).getMinCapacity()?.let(AuroraCapacityUnit::wrap)

    public override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    public override fun timeoutAction(): TimeoutAction? =
        unwrap(this).getTimeoutAction()?.let(TimeoutAction::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ServerlessScalingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ServerlessScalingOptions):
        ServerlessScalingOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServerlessScalingOptions):
        software.amazon.awscdk.services.rds.ServerlessScalingOptions = (wrapped as
        Wrapper).cdkObject
  }
}
