@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import kotlin.String

/**
 * Interface to implement FSx File Systems.
 */
public interface IFileSystem : IConnectable {
  /**
   * The ID of the file system, assigned by Amazon FSx.
   */
  public fun fileSystemId(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.fsx.IFileSystem,
  ) : CdkObject(cdkObject), IFileSystem {
    /**
     * The network connections associated with this resource.
     */
    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    /**
     * The ID of the file system, assigned by Amazon FSx.
     */
    override fun fileSystemId(): String = unwrap(this).getFileSystemId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.IFileSystem): IFileSystem =
        CdkObjectWrappers.wrap(cdkObject) as? IFileSystem ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFileSystem): software.amazon.awscdk.services.fsx.IFileSystem =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.fsx.IFileSystem
  }
}
