@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import kotlin.String

public interface IFileSystem : IConnectable {
  public fun fileSystemId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fsx.IFileSystem,
  ) : CdkObject(cdkObject), IFileSystem {
    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    override fun fileSystemId(): String = unwrap(this).getFileSystemId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.IFileSystem): IFileSystem =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFileSystem): software.amazon.awscdk.services.fsx.IFileSystem =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.fsx.IFileSystem
  }
}
