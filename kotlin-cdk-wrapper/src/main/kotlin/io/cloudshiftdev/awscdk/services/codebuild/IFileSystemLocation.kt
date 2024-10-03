@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct

/**
 * The interface of a CodeBuild FileSystemLocation.
 *
 * Implemented by `EfsFileSystemLocation`.
 */
public interface IFileSystemLocation {
  /**
   * Called by the project when a file system is added so it can perform binding operations on this
   * file system location.
   *
   * @param scope 
   * @param project 
   */
  public fun bind(scope: Construct, project: IProject): FileSystemConfig

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.IFileSystemLocation,
  ) : CdkObject(cdkObject),
      IFileSystemLocation {
    /**
     * Called by the project when a file system is added so it can perform binding operations on
     * this file system location.
     *
     * @param scope 
     * @param project 
     */
    override fun bind(scope: Construct, project: IProject): FileSystemConfig =
        unwrap(this).bind(scope.let(Construct.Companion::unwrap),
        project.let(IProject.Companion::unwrap)).let(FileSystemConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.IFileSystemLocation):
        IFileSystemLocation = CdkObjectWrappers.wrap(cdkObject) as? IFileSystemLocation ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFileSystemLocation):
        software.amazon.awscdk.services.codebuild.IFileSystemLocation = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.IFileSystemLocation
  }
}
