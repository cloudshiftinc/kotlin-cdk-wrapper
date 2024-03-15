@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface FileSource {
  public fun executable(): List<String> = unwrap(this).getExecutable() ?: emptyList()

  public fun packaging(): FileAssetPackaging? =
      unwrap(this).getPackaging()?.let(FileAssetPackaging::wrap)

  public fun path(): String? = unwrap(this).getPath()

  @CdkDslMarker
  public interface Builder {
    public fun executable(executable: List<String>)

    public fun executable(vararg executable: String)

    public fun packaging(packaging: FileAssetPackaging)

    public fun path(path: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.FileSource.Builder =
        software.amazon.awscdk.cloudassembly.schema.FileSource.builder()

    override fun executable(executable: List<String>) {
      cdkBuilder.executable(executable)
    }

    override fun executable(vararg executable: String): Unit = executable(executable.toList())

    override fun packaging(packaging: FileAssetPackaging) {
      cdkBuilder.packaging(packaging.let(FileAssetPackaging::unwrap))
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.FileSource = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.FileSource,
  ) : CdkObject(cdkObject), FileSource {
    override fun executable(): List<String> = unwrap(this).getExecutable() ?: emptyList()

    override fun packaging(): FileAssetPackaging? =
        unwrap(this).getPackaging()?.let(FileAssetPackaging::wrap)

    override fun path(): String? = unwrap(this).getPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileSource {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.FileSource): FileSource
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSource): software.amazon.awscdk.cloudassembly.schema.FileSource
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.FileSource
  }
}
