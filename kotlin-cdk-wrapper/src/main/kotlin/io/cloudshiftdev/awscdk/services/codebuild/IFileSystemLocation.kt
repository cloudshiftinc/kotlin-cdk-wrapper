@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct

public interface IFileSystemLocation {
  public fun bind(arg0: Construct, arg1: IProject): FileSystemConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.IFileSystemLocation,
  ) : CdkObject(cdkObject), IFileSystemLocation {
    override fun bind(arg0: Construct, arg1: IProject): FileSystemConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(IProject::unwrap)).let(FileSystemConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.IFileSystemLocation):
        IFileSystemLocation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFileSystemLocation):
        software.amazon.awscdk.services.codebuild.IFileSystemLocation = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.IFileSystemLocation
  }
}
