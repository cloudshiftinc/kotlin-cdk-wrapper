package io.cloudshiftdev.awscdk.services.batch

public open class RetryStrategy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.RetryStrategy,
) {
  public open fun action(): Action = unwrap(this).getAction().let(Action::wrap)

  public open fun on(): Reason = unwrap(this).getOn().let(Reason::wrap)

  public companion object {
    public open fun of(action: Action, on: Reason): RetryStrategy =
        software.amazon.awscdk.services.batch.RetryStrategy.of(action.let(Action::unwrap),
        on.let(Reason::unwrap)).let(RetryStrategy::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.RetryStrategy): RetryStrategy
        = RetryStrategy(cdkObject)

    internal fun unwrap(wrapped: RetryStrategy): software.amazon.awscdk.services.batch.RetryStrategy
        = wrapped.cdkObject
  }
}
