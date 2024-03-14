package io.cloudshiftdev.awscdk.services.lambda

public enum class LogFormat(
  private val cdkObject: software.amazon.awscdk.services.lambda.LogFormat,
) {
  TEXT(software.amazon.awscdk.services.lambda.LogFormat.TEXT),
  JSON(software.amazon.awscdk.services.lambda.LogFormat.JSON),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LogFormat): LogFormat = when
        (cdkObject) {
      software.amazon.awscdk.services.lambda.LogFormat.TEXT -> LogFormat.TEXT
      software.amazon.awscdk.services.lambda.LogFormat.JSON -> LogFormat.JSON
    }

    internal fun unwrap(wrapped: LogFormat): software.amazon.awscdk.services.lambda.LogFormat =
        wrapped.cdkObject
  }
}
