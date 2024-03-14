package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.services.efs.IAccessPoint
import kotlin.String

public open class FileSystem internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.FileSystem,
) {
  public open fun config(): FileSystemConfig = unwrap(this).getConfig().let(FileSystemConfig::wrap)

  public companion object {
    public open fun fromEfsAccessPoint(ap: IAccessPoint, mountPath: String): FileSystem =
        software.amazon.awscdk.services.lambda.FileSystem.fromEfsAccessPoint(ap.let(IAccessPoint::unwrap),
        mountPath).let(FileSystem::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FileSystem): FileSystem =
        FileSystem(cdkObject)

    internal fun unwrap(wrapped: FileSystem): software.amazon.awscdk.services.lambda.FileSystem =
        wrapped.cdkObject
  }
}
