@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Describe the source of a file asset.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * FileSource fileSource = FileSource.builder()
 * .executable(List.of("executable"))
 * .packaging(FileAssetPackaging.FILE)
 * .path("path")
 * .build();
 * ```
 */
public interface FileSource {
  /**
   * External command which will produce the file asset to upload.
   *
   * Default: - Exactly one of `executable` and `path` is required.
   */
  public fun executable(): List<String> = unwrap(this).getExecutable() ?: emptyList()

  /**
   * Packaging method.
   *
   * Only allowed when `path` is specified.
   *
   * Default: FILE
   */
  public fun packaging(): FileAssetPackaging? =
      unwrap(this).getPackaging()?.let(FileAssetPackaging::wrap)

  /**
   * The filesystem object to upload.
   *
   * This path is relative to the asset manifest location.
   *
   * Default: - Exactly one of `executable` and `path` is required.
   */
  public fun path(): String? = unwrap(this).getPath()

  /**
   * A builder for [FileSource]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param executable External command which will produce the file asset to upload.
     */
    public fun executable(executable: List<String>)

    /**
     * @param executable External command which will produce the file asset to upload.
     */
    public fun executable(vararg executable: String)

    /**
     * @param packaging Packaging method.
     * Only allowed when `path` is specified.
     */
    public fun packaging(packaging: FileAssetPackaging)

    /**
     * @param path The filesystem object to upload.
     * This path is relative to the asset manifest location.
     */
    public fun path(path: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.FileSource.Builder =
        software.amazon.awscdk.cloudassembly.schema.FileSource.builder()

    /**
     * @param executable External command which will produce the file asset to upload.
     */
    override fun executable(executable: List<String>) {
      cdkBuilder.executable(executable)
    }

    /**
     * @param executable External command which will produce the file asset to upload.
     */
    override fun executable(vararg executable: String): Unit = executable(executable.toList())

    /**
     * @param packaging Packaging method.
     * Only allowed when `path` is specified.
     */
    override fun packaging(packaging: FileAssetPackaging) {
      cdkBuilder.packaging(packaging.let(FileAssetPackaging::unwrap))
    }

    /**
     * @param path The filesystem object to upload.
     * This path is relative to the asset manifest location.
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.FileSource = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.FileSource,
  ) : CdkObject(cdkObject), FileSource {
    /**
     * External command which will produce the file asset to upload.
     *
     * Default: - Exactly one of `executable` and `path` is required.
     */
    override fun executable(): List<String> = unwrap(this).getExecutable() ?: emptyList()

    /**
     * Packaging method.
     *
     * Only allowed when `path` is specified.
     *
     * Default: FILE
     */
    override fun packaging(): FileAssetPackaging? =
        unwrap(this).getPackaging()?.let(FileAssetPackaging::wrap)

    /**
     * The filesystem object to upload.
     *
     * This path is relative to the asset manifest location.
     *
     * Default: - Exactly one of `executable` and `path` is required.
     */
    override fun path(): String? = unwrap(this).getPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileSource {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.FileSource): FileSource
        = CdkObjectWrappers.wrap(cdkObject) as? FileSource ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSource): software.amazon.awscdk.cloudassembly.schema.FileSource
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.FileSource
  }
}
