@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface FileSetLocation {
  public fun directory(): String

  public fun fileSet(): FileSet

  @CdkDslMarker
  public interface Builder {
    public fun directory(directory: String)

    public fun fileSet(fileSet: FileSet)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.FileSetLocation.Builder =
        software.amazon.awscdk.pipelines.FileSetLocation.builder()

    override fun directory(directory: String) {
      cdkBuilder.directory(directory)
    }

    override fun fileSet(fileSet: FileSet) {
      cdkBuilder.fileSet(fileSet.let(FileSet::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.FileSetLocation = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.FileSetLocation,
  ) : CdkObject(cdkObject), FileSetLocation {
    override fun directory(): String = unwrap(this).getDirectory()

    override fun fileSet(): FileSet = unwrap(this).getFileSet().let(FileSet::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileSetLocation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.FileSetLocation): FileSetLocation
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSetLocation): software.amazon.awscdk.pipelines.FileSetLocation
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.pipelines.FileSetLocation
  }
}
