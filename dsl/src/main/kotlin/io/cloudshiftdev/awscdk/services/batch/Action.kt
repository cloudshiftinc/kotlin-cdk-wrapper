package io.cloudshiftdev.awscdk.services.batch

public enum class Action(
  private val cdkObject: software.amazon.awscdk.services.batch.Action,
) {
  EXIT(software.amazon.awscdk.services.batch.Action.EXIT),
  RETRY(software.amazon.awscdk.services.batch.Action.RETRY),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.Action): Action = when
        (cdkObject) {
      software.amazon.awscdk.services.batch.Action.EXIT -> Action.EXIT
      software.amazon.awscdk.services.batch.Action.RETRY -> Action.RETRY
    }

    internal fun unwrap(wrapped: Action): software.amazon.awscdk.services.batch.Action =
        wrapped.cdkObject
  }
}
