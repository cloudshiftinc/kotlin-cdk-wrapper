package io.cloudshiftdev.awscdk.services.lambda

public enum class SystemLogLevel(
  private val cdkObject: software.amazon.awscdk.services.lambda.SystemLogLevel,
) {
  INFO(software.amazon.awscdk.services.lambda.SystemLogLevel.INFO),
  DEBUG(software.amazon.awscdk.services.lambda.SystemLogLevel.DEBUG),
  WARN(software.amazon.awscdk.services.lambda.SystemLogLevel.WARN),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.SystemLogLevel):
        SystemLogLevel = when (cdkObject) {
      software.amazon.awscdk.services.lambda.SystemLogLevel.INFO -> SystemLogLevel.INFO
      software.amazon.awscdk.services.lambda.SystemLogLevel.DEBUG -> SystemLogLevel.DEBUG
      software.amazon.awscdk.services.lambda.SystemLogLevel.WARN -> SystemLogLevel.WARN
    }

    internal fun unwrap(wrapped: SystemLogLevel):
        software.amazon.awscdk.services.lambda.SystemLogLevel = wrapped.cdkObject
  }
}
