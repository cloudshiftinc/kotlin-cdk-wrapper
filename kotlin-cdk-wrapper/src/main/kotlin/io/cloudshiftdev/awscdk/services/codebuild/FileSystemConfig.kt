@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface FileSystemConfig {
  public fun location(): CfnProject.ProjectFileSystemLocationProperty

  @CdkDslMarker
  public interface Builder {
    public fun location(location: CfnProject.ProjectFileSystemLocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed1a7c5c4d7a90387275d61d3365c66e9a21d98bb1c1fb761d7f96e824015488")
    public fun location(location: CfnProject.ProjectFileSystemLocationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.FileSystemConfig.Builder =
        software.amazon.awscdk.services.codebuild.FileSystemConfig.builder()

    override fun location(location: CfnProject.ProjectFileSystemLocationProperty) {
      cdkBuilder.location(location.let(CfnProject.ProjectFileSystemLocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed1a7c5c4d7a90387275d61d3365c66e9a21d98bb1c1fb761d7f96e824015488")
    override
        fun location(location: CfnProject.ProjectFileSystemLocationProperty.Builder.() -> Unit):
        Unit = location(CfnProject.ProjectFileSystemLocationProperty(location))

    public fun build(): software.amazon.awscdk.services.codebuild.FileSystemConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.FileSystemConfig,
  ) : CdkObject(cdkObject), FileSystemConfig {
    override fun location(): CfnProject.ProjectFileSystemLocationProperty =
        unwrap(this).getLocation().let(CfnProject.ProjectFileSystemLocationProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.FileSystemConfig):
        FileSystemConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSystemConfig):
        software.amazon.awscdk.services.codebuild.FileSystemConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.FileSystemConfig
  }
}
