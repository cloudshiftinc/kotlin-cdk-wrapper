@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.Connections
import kotlin.String

public abstract class FileSystemBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.fsx.FileSystemBase,
) : Resource(cdkObject), IFileSystem {
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public open fun dnsName(): String = unwrap(this).getDnsName()

  public override fun fileSystemId(): String = unwrap(this).getFileSystemId()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fsx.FileSystemBase,
  ) : FileSystemBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.FileSystemBase): FileSystemBase
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSystemBase): software.amazon.awscdk.services.fsx.FileSystemBase
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.fsx.FileSystemBase
  }
}
