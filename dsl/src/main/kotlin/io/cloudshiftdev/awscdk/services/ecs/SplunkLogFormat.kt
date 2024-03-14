package io.cloudshiftdev.awscdk.services.ecs

public enum class SplunkLogFormat(
  private val cdkObject: software.amazon.awscdk.services.ecs.SplunkLogFormat,
) {
  INLINE(software.amazon.awscdk.services.ecs.SplunkLogFormat.INLINE),
  JSON(software.amazon.awscdk.services.ecs.SplunkLogFormat.JSON),
  RAW(software.amazon.awscdk.services.ecs.SplunkLogFormat.RAW),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.SplunkLogFormat):
        SplunkLogFormat = when (cdkObject) {
      software.amazon.awscdk.services.ecs.SplunkLogFormat.INLINE -> SplunkLogFormat.INLINE
      software.amazon.awscdk.services.ecs.SplunkLogFormat.JSON -> SplunkLogFormat.JSON
      software.amazon.awscdk.services.ecs.SplunkLogFormat.RAW -> SplunkLogFormat.RAW
    }

    internal fun unwrap(wrapped: SplunkLogFormat):
        software.amazon.awscdk.services.ecs.SplunkLogFormat = wrapped.cdkObject
  }
}
