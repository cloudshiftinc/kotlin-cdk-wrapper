package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.constructs.Construct

public interface IFileSystemLocation {
  /**
   * Called by the project when a file system is added so it can perform binding operations on this
   * file system location.
   *
   * @param scope 
   * @param project 
   */
  public fun bind(scope: Construct, project: IProject): FileSystemConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.IFileSystemLocation,
  ) : IFileSystemLocation {
    /**
     * Called by the project when a file system is added so it can perform binding operations on
     * this file system location.
     *
     * @param scope 
     * @param project 
     */
    override fun bind(scope: Construct, project: IProject): FileSystemConfig =
        unwrap(this).bind(scope.let(Construct::unwrap),
        project.let(IProject::unwrap)).let(FileSystemConfig::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.IFileSystemLocation):
        IFileSystemLocation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFileSystemLocation):
        software.amazon.awscdk.services.codebuild.IFileSystemLocation = (wrapped as
        Wrapper).cdkObject
  }
}
