package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.constructs.Construct
import kotlin.String

public abstract class AccessLog internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.AccessLog,
) {
  /**
   * Called when the AccessLog type is initialized.
   *
   * Can be used to enforce
   * mutual exclusivity with future properties
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): AccessLogConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(AccessLogConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.AccessLog,
  ) : AccessLog(cdkObject)

  public companion object {
    public fun fromFilePath(filePath: String): AccessLog =
        software.amazon.awscdk.services.appmesh.AccessLog.fromFilePath(filePath).let(AccessLog::wrap)

    public fun fromFilePath(filePath: String, loggingFormat: LoggingFormat): AccessLog =
        software.amazon.awscdk.services.appmesh.AccessLog.fromFilePath(filePath,
        loggingFormat.let(LoggingFormat::unwrap)).let(AccessLog::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.AccessLog): AccessLog =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessLog): software.amazon.awscdk.services.appmesh.AccessLog =
        (wrapped as Wrapper).cdkObject
  }
}
