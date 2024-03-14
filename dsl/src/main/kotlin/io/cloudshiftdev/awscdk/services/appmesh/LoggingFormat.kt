package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.String
import kotlin.collections.Map

public abstract class LoggingFormat internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.LoggingFormat,
) {
  public open fun bind(): LoggingFormatConfig = unwrap(this).bind().let(LoggingFormatConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.LoggingFormat,
  ) : LoggingFormat(cdkObject)

  public companion object {
    public open fun fromJson(jsonLoggingFormat: Map<String, String>): LoggingFormat =
        software.amazon.awscdk.services.appmesh.LoggingFormat.fromJson(jsonLoggingFormat).let(LoggingFormat::wrap)

    public open fun fromText(text: String): LoggingFormat =
        software.amazon.awscdk.services.appmesh.LoggingFormat.fromText(text).let(LoggingFormat::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.LoggingFormat):
        LoggingFormat = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoggingFormat):
        software.amazon.awscdk.services.appmesh.LoggingFormat = (wrapped as Wrapper).cdkObject
  }
}
