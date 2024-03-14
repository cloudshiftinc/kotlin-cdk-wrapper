package io.cloudshiftdev.awscdk.triggers

public enum class TriggerInvalidation(
  private val cdkObject: software.amazon.awscdk.triggers.TriggerInvalidation,
) {
  HANDLER_CHANGE(software.amazon.awscdk.triggers.TriggerInvalidation.HANDLER_CHANGE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.triggers.TriggerInvalidation):
        TriggerInvalidation = when (cdkObject) {
      software.amazon.awscdk.triggers.TriggerInvalidation.HANDLER_CHANGE ->
          TriggerInvalidation.HANDLER_CHANGE
    }

    internal fun unwrap(wrapped: TriggerInvalidation):
        software.amazon.awscdk.triggers.TriggerInvalidation = wrapped.cdkObject
  }
}
