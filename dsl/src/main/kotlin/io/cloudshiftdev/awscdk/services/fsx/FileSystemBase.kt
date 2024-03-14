package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.ec2.Connections
import kotlin.String

public abstract class FileSystemBase internal constructor(
  private val cdkObject: software.amazon.awscdk.services.fsx.FileSystemBase,
) : Resource(cdkObject), IFileSystem {
  /**
   * The security groups/rules used to allow network connections to the file system.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * The DNS name assigned to this file system.
   */
  public open fun dnsName(): String = unwrap(this).getDnsName()

  /**
   * The ID of the file system, assigned by Amazon FSx.
   */
  public override fun fileSystemId(): String = unwrap(this).getFileSystemId()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.fsx.FileSystemBase,
  ) : FileSystemBase(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.FileSystemBase): FileSystemBase
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSystemBase): software.amazon.awscdk.services.fsx.FileSystemBase
        = (wrapped as Wrapper).cdkObject
  }
}
