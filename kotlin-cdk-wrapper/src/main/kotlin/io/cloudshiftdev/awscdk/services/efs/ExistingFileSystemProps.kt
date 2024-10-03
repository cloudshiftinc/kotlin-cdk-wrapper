@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Properties for configuring ReplicationConfiguration to replicate to an existing file system.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.efs.*;
 * FileSystem fileSystem;
 * ExistingFileSystemProps existingFileSystemProps = ExistingFileSystemProps.builder()
 * .destinationFileSystem(fileSystem)
 * .build();
 * ```
 */
public interface ExistingFileSystemProps {
  /**
   * The existing destination file system for the replication.
   */
  public fun destinationFileSystem(): IFileSystem

  /**
   * A builder for [ExistingFileSystemProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinationFileSystem The existing destination file system for the replication. 
     */
    public fun destinationFileSystem(destinationFileSystem: IFileSystem)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.ExistingFileSystemProps.Builder =
        software.amazon.awscdk.services.efs.ExistingFileSystemProps.builder()

    /**
     * @param destinationFileSystem The existing destination file system for the replication. 
     */
    override fun destinationFileSystem(destinationFileSystem: IFileSystem) {
      cdkBuilder.destinationFileSystem(destinationFileSystem.let(IFileSystem.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.efs.ExistingFileSystemProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.efs.ExistingFileSystemProps,
  ) : CdkObject(cdkObject),
      ExistingFileSystemProps {
    /**
     * The existing destination file system for the replication.
     */
    override fun destinationFileSystem(): IFileSystem =
        unwrap(this).getDestinationFileSystem().let(IFileSystem::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExistingFileSystemProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.ExistingFileSystemProps):
        ExistingFileSystemProps = CdkObjectWrappers.wrap(cdkObject) as? ExistingFileSystemProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExistingFileSystemProps):
        software.amazon.awscdk.services.efs.ExistingFileSystemProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.efs.ExistingFileSystemProps
  }
}
