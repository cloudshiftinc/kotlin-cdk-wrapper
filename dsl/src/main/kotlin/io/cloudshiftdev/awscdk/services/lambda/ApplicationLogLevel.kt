package io.cloudshiftdev.awscdk.services.lambda

public enum class ApplicationLogLevel(
  private val cdkObject: software.amazon.awscdk.services.lambda.ApplicationLogLevel,
) {
  INFO(software.amazon.awscdk.services.lambda.ApplicationLogLevel.INFO),
  DEBUG(software.amazon.awscdk.services.lambda.ApplicationLogLevel.DEBUG),
  WARN(software.amazon.awscdk.services.lambda.ApplicationLogLevel.WARN),
  TRACE(software.amazon.awscdk.services.lambda.ApplicationLogLevel.TRACE),
  ERROR(software.amazon.awscdk.services.lambda.ApplicationLogLevel.ERROR),
  FATAL(software.amazon.awscdk.services.lambda.ApplicationLogLevel.FATAL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.ApplicationLogLevel):
        ApplicationLogLevel = when (cdkObject) {
      software.amazon.awscdk.services.lambda.ApplicationLogLevel.INFO -> ApplicationLogLevel.INFO
      software.amazon.awscdk.services.lambda.ApplicationLogLevel.DEBUG -> ApplicationLogLevel.DEBUG
      software.amazon.awscdk.services.lambda.ApplicationLogLevel.WARN -> ApplicationLogLevel.WARN
      software.amazon.awscdk.services.lambda.ApplicationLogLevel.TRACE -> ApplicationLogLevel.TRACE
      software.amazon.awscdk.services.lambda.ApplicationLogLevel.ERROR -> ApplicationLogLevel.ERROR
      software.amazon.awscdk.services.lambda.ApplicationLogLevel.FATAL -> ApplicationLogLevel.FATAL
    }

    internal fun unwrap(wrapped: ApplicationLogLevel):
        software.amazon.awscdk.services.lambda.ApplicationLogLevel = wrapped.cdkObject
  }
}
