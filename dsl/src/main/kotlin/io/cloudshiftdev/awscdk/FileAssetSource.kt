package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface FileAssetSource {
  public fun deployTime(): Boolean? = unwrap(this).getDeployTime()

  public fun executable(): List<String> = unwrap(this).getExecutable() ?: emptyList()

  public fun fileName(): String? = unwrap(this).getFileName()

  public fun packaging(): FileAssetPackaging? =
      unwrap(this).getPackaging()?.let(FileAssetPackaging::wrap)

  public fun sourceHash(): String

  public interface Builder {
    public fun deployTime(deployTime: Boolean) {
    }

    public fun executable(executable: List<String>) {
    }

    public fun fileName(fileName: String) {
    }

    public fun packaging(packaging: FileAssetPackaging) {
    }

    public fun sourceHash(sourceHash: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.FileAssetSource.Builder =
        software.amazon.awscdk.FileAssetSource.builder()

    public override fun deployTime(deployTime: Boolean) {
      cdkBuilder.deployTime(deployTime)
    }

    public override fun executable(executable: List<String>) {
      cdkBuilder.executable(executable)
    }

    public override fun fileName(fileName: String) {
      cdkBuilder.fileName(fileName)
    }

    public override fun packaging(packaging: FileAssetPackaging) {
      cdkBuilder.packaging(packaging.let(FileAssetPackaging::unwrap))
    }

    public override fun sourceHash(sourceHash: String) {
      cdkBuilder.sourceHash(sourceHash)
    }

    public fun build(): software.amazon.awscdk.FileAssetSource = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.FileAssetSource,
  ) : FileAssetSource {
    public override fun deployTime(): Boolean? = unwrap(this).getDeployTime()

    public override fun executable(): List<String> = unwrap(this).getExecutable() ?: emptyList()

    public override fun fileName(): String? = unwrap(this).getFileName()

    public override fun packaging(): FileAssetPackaging? =
        unwrap(this).getPackaging()?.let(FileAssetPackaging::wrap)

    public override fun sourceHash(): String = unwrap(this).getSourceHash()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FileAssetSource {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.FileAssetSource): FileAssetSource =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileAssetSource): software.amazon.awscdk.FileAssetSource = (wrapped
        as Wrapper).cdkObject
  }
}
