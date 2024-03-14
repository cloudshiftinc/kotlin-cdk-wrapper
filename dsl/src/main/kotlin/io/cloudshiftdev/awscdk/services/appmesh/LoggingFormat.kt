package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String
import kotlin.collections.Map

public abstract class LoggingFormat internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.LoggingFormat,
) : CdkObject(cdkObject) {
  /**
   * Called when the Access Log Format is initialized.
   *
   * Can be used to enforce
   * mutual exclusivity with future properties
   */
  public open fun bind(): LoggingFormatConfig = unwrap(this).bind().let(LoggingFormatConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.LoggingFormat,
  ) : LoggingFormat(cdkObject)

  public companion object {
    public fun fromJson(jsonLoggingFormat: Map<String, String>): LoggingFormat =
        software.amazon.awscdk.services.appmesh.LoggingFormat.fromJson(jsonLoggingFormat).let(LoggingFormat::wrap)

    public fun fromText(text: String): LoggingFormat =
        software.amazon.awscdk.services.appmesh.LoggingFormat.fromText(text).let(LoggingFormat::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.LoggingFormat):
        LoggingFormat = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoggingFormat):
        software.amazon.awscdk.services.appmesh.LoggingFormat = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.LoggingFormat
  }
}
