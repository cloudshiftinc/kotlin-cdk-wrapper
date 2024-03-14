package io.cloudshiftdev.awscdk.services.cloudwatch.actions

public enum class OpsItemSeverity(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.actions.OpsItemSeverity,
) {
  CRITICAL(software.amazon.awscdk.services.cloudwatch.actions.OpsItemSeverity.CRITICAL),
  HIGH(software.amazon.awscdk.services.cloudwatch.actions.OpsItemSeverity.HIGH),
  MEDIUM(software.amazon.awscdk.services.cloudwatch.actions.OpsItemSeverity.MEDIUM),
  LOW(software.amazon.awscdk.services.cloudwatch.actions.OpsItemSeverity.LOW),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.actions.OpsItemSeverity):
        OpsItemSeverity = when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.actions.OpsItemSeverity.CRITICAL ->
          OpsItemSeverity.CRITICAL
      software.amazon.awscdk.services.cloudwatch.actions.OpsItemSeverity.HIGH ->
          OpsItemSeverity.HIGH
      software.amazon.awscdk.services.cloudwatch.actions.OpsItemSeverity.MEDIUM ->
          OpsItemSeverity.MEDIUM
      software.amazon.awscdk.services.cloudwatch.actions.OpsItemSeverity.LOW -> OpsItemSeverity.LOW
    }

    internal fun unwrap(wrapped: OpsItemSeverity):
        software.amazon.awscdk.services.cloudwatch.actions.OpsItemSeverity = wrapped.cdkObject
  }
}
