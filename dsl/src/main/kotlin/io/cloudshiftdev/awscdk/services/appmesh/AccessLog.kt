package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.constructs.Construct
import kotlin.String

public abstract class AccessLog internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.AccessLog,
) {
  public open fun bind(arg0: Construct): AccessLogConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(AccessLogConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.AccessLog,
  ) : AccessLog(cdkObject)

  public companion object {
    public open fun fromFilePath(filePath: String): AccessLog =
        software.amazon.awscdk.services.appmesh.AccessLog.fromFilePath(filePath).let(AccessLog::wrap)

    public open fun fromFilePath(filePath: String, loggingFormat: LoggingFormat): AccessLog =
        software.amazon.awscdk.services.appmesh.AccessLog.fromFilePath(filePath,
        loggingFormat.let(LoggingFormat::unwrap)).let(AccessLog::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.AccessLog): AccessLog =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessLog): software.amazon.awscdk.services.appmesh.AccessLog =
        (wrapped as Wrapper).cdkObject
  }
}
