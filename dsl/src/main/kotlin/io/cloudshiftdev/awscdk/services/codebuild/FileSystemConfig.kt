package io.cloudshiftdev.awscdk.services.codebuild

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface FileSystemConfig {
  public fun location(): CfnProject.ProjectFileSystemLocationProperty

  public interface Builder {
    public fun location(location: CfnProject.ProjectFileSystemLocationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed1a7c5c4d7a90387275d61d3365c66e9a21d98bb1c1fb761d7f96e824015488")
    public fun location(location: CfnProject.ProjectFileSystemLocationProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.FileSystemConfig.Builder =
        software.amazon.awscdk.services.codebuild.FileSystemConfig.builder()

    public override fun location(location: CfnProject.ProjectFileSystemLocationProperty) {
      cdkBuilder.location(location.let(CfnProject.ProjectFileSystemLocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed1a7c5c4d7a90387275d61d3365c66e9a21d98bb1c1fb761d7f96e824015488")
    public override
        fun location(location: CfnProject.ProjectFileSystemLocationProperty.Builder.() -> Unit):
        Unit = location(CfnProject.ProjectFileSystemLocationProperty(location))

    public fun build(): software.amazon.awscdk.services.codebuild.FileSystemConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.FileSystemConfig,
  ) : FileSystemConfig {
    public override fun location(): CfnProject.ProjectFileSystemLocationProperty =
        unwrap(this).getLocation().let(CfnProject.ProjectFileSystemLocationProperty::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.FileSystemConfig):
        FileSystemConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSystemConfig):
        software.amazon.awscdk.services.codebuild.FileSystemConfig = (wrapped as Wrapper).cdkObject
  }
}
