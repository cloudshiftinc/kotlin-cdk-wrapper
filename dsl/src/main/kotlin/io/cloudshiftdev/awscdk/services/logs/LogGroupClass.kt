package io.cloudshiftdev.awscdk.services.logs

public enum class LogGroupClass(
  private val cdkObject: software.amazon.awscdk.services.logs.LogGroupClass,
) {
  STANDARD(software.amazon.awscdk.services.logs.LogGroupClass.STANDARD),
  INFREQUENT_ACCESS(software.amazon.awscdk.services.logs.LogGroupClass.INFREQUENT_ACCESS),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.LogGroupClass): LogGroupClass
        = when (cdkObject) {
      software.amazon.awscdk.services.logs.LogGroupClass.STANDARD -> LogGroupClass.STANDARD
      software.amazon.awscdk.services.logs.LogGroupClass.INFREQUENT_ACCESS ->
          LogGroupClass.INFREQUENT_ACCESS
    }

    internal fun unwrap(wrapped: LogGroupClass): software.amazon.awscdk.services.logs.LogGroupClass
        = wrapped.cdkObject
  }
}
