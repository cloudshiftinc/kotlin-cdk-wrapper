package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.constructs.Construct

public interface IFileSystemLocation {
  public fun bind(arg0: Construct, arg1: IProject): FileSystemConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.IFileSystemLocation,
  ) : IFileSystemLocation {
    override fun bind(arg0: Construct, arg1: IProject): FileSystemConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(IProject::unwrap)).let(FileSystemConfig::wrap)
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
