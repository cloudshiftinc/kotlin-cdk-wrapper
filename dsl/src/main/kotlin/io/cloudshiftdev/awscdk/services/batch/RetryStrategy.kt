package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.CdkObject

public open class RetryStrategy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.batch.RetryStrategy,
) : CdkObject(cdkObject) {
  /**
   * The action to take when the job exits with the Reason specified.
   */
  public open fun action(): Action = unwrap(this).getAction().let(Action::wrap)

  /**
   * If the job exits with this Reason it will trigger the specified Action.
   */
  public open fun on(): Reason = unwrap(this).getOn().let(Reason::wrap)

  public companion object {
    public fun of(action: Action, on: Reason): RetryStrategy =
        software.amazon.awscdk.services.batch.RetryStrategy.of(action.let(Action::unwrap),
        on.let(Reason::unwrap)).let(RetryStrategy::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.RetryStrategy): RetryStrategy
        = RetryStrategy(cdkObject)

    internal fun unwrap(wrapped: RetryStrategy): software.amazon.awscdk.services.batch.RetryStrategy
        = wrapped.cdkObject
  }
}
