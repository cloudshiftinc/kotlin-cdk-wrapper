package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

public abstract class AccessLog internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.AccessLog,
) : CdkObject(cdkObject) {
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.AccessLog,
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
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.AccessLog
  }
}
