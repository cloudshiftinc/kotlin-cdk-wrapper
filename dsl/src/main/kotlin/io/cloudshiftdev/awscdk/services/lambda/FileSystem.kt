package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.efs.IAccessPoint
import kotlin.String

public open class FileSystem internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.FileSystem,
) : CdkObject(cdkObject) {
  /**
   * the FileSystem configurations for the Lambda function.
   */
  public open fun config(): FileSystemConfig = unwrap(this).getConfig().let(FileSystemConfig::wrap)

  public companion object {
    public fun fromEfsAccessPoint(ap: IAccessPoint, mountPath: String): FileSystem =
        software.amazon.awscdk.services.lambda.FileSystem.fromEfsAccessPoint(ap.let(IAccessPoint::unwrap),
        mountPath).let(FileSystem::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FileSystem): FileSystem =
        FileSystem(cdkObject)

    internal fun unwrap(wrapped: FileSystem): software.amazon.awscdk.services.lambda.FileSystem =
        wrapped.cdkObject
  }
}
