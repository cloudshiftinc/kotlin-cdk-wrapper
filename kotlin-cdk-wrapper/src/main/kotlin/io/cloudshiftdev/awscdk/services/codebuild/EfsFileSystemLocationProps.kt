@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface EfsFileSystemLocationProps {
  public fun identifier(): String

  public fun location(): String

  public fun mountOptions(): String? = unwrap(this).getMountOptions()

  public fun mountPoint(): String

  @CdkDslMarker
  public interface Builder {
    public fun identifier(identifier: String)

    public fun location(location: String)

    public fun mountOptions(mountOptions: String)

    public fun mountPoint(mountPoint: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps.Builder =
        software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps.builder()

    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    override fun location(location: String) {
      cdkBuilder.location(location)
    }

    override fun mountOptions(mountOptions: String) {
      cdkBuilder.mountOptions(mountOptions)
    }

    override fun mountPoint(mountPoint: String) {
      cdkBuilder.mountPoint(mountPoint)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps,
  ) : CdkObject(cdkObject), EfsFileSystemLocationProps {
    override fun identifier(): String = unwrap(this).getIdentifier()

    override fun location(): String = unwrap(this).getLocation()

    override fun mountOptions(): String? = unwrap(this).getMountOptions()

    override fun mountPoint(): String = unwrap(this).getMountPoint()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EfsFileSystemLocationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps):
        EfsFileSystemLocationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EfsFileSystemLocationProps):
        software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps
  }
}
