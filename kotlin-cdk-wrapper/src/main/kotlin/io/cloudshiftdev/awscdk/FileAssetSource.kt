@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Represents the source for a file asset.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * FileAssetSource fileAssetSource = FileAssetSource.builder()
 * .sourceHash("sourceHash")
 * // the properties below are optional
 * .deployTime(false)
 * .executable(List.of("executable"))
 * .fileName("fileName")
 * .packaging(FileAssetPackaging.ZIP_DIRECTORY)
 * .build();
 * ```
 */
public interface FileAssetSource {
  /**
   * Whether or not the asset needs to exist beyond deployment time;
   *
   * i.e.
   * are copied over to a different location and not needed afterwards.
   * Setting this property to true has an impact on the lifecycle of the asset,
   * because we will assume that it is safe to delete after the CloudFormation
   * deployment succeeds.
   *
   * For example, Lambda Function assets are copied over to Lambda during
   * deployment. Therefore, it is not necessary to store the asset in S3, so
   * we consider those deployTime assets.
   *
   * Default: false
   */
  public fun deployTime(): Boolean? = unwrap(this).getDeployTime()

  /**
   * An external command that will produce the packaged asset.
   *
   * The command should produce the location of a ZIP file on `stdout`.
   *
   * Default: - Exactly one of `fileName` and `executable` is required
   */
  public fun executable(): List<String> = unwrap(this).getExecutable() ?: emptyList()

  /**
   * The path, relative to the root of the cloud assembly, in which this asset source resides.
   *
   * This can be a path to a file or a directory, depending on the
   * packaging type.
   *
   * Default: - Exactly one of `fileName` and `executable` is required
   */
  public fun fileName(): String? = unwrap(this).getFileName()

  /**
   * Which type of packaging to perform.
   *
   * Default: - Required if `fileName` is specified.
   */
  public fun packaging(): FileAssetPackaging? =
      unwrap(this).getPackaging()?.let(FileAssetPackaging::wrap)

  /**
   * A hash on the content source.
   *
   * This hash is used to uniquely identify this
   * asset throughout the system. If this value doesn't change, the asset will
   * not be rebuilt or republished.
   */
  public fun sourceHash(): String

  /**
   * A builder for [FileAssetSource]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deployTime Whether or not the asset needs to exist beyond deployment time;.
     * i.e.
     * are copied over to a different location and not needed afterwards.
     * Setting this property to true has an impact on the lifecycle of the asset,
     * because we will assume that it is safe to delete after the CloudFormation
     * deployment succeeds.
     *
     * For example, Lambda Function assets are copied over to Lambda during
     * deployment. Therefore, it is not necessary to store the asset in S3, so
     * we consider those deployTime assets.
     */
    public fun deployTime(deployTime: Boolean)

    /**
     * @param executable An external command that will produce the packaged asset.
     * The command should produce the location of a ZIP file on `stdout`.
     */
    public fun executable(executable: List<String>)

    /**
     * @param executable An external command that will produce the packaged asset.
     * The command should produce the location of a ZIP file on `stdout`.
     */
    public fun executable(vararg executable: String)

    /**
     * @param fileName The path, relative to the root of the cloud assembly, in which this asset
     * source resides.
     * This can be a path to a file or a directory, depending on the
     * packaging type.
     */
    public fun fileName(fileName: String)

    /**
     * @param packaging Which type of packaging to perform.
     */
    public fun packaging(packaging: FileAssetPackaging)

    /**
     * @param sourceHash A hash on the content source. 
     * This hash is used to uniquely identify this
     * asset throughout the system. If this value doesn't change, the asset will
     * not be rebuilt or republished.
     */
    public fun sourceHash(sourceHash: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.FileAssetSource.Builder =
        software.amazon.awscdk.FileAssetSource.builder()

    /**
     * @param deployTime Whether or not the asset needs to exist beyond deployment time;.
     * i.e.
     * are copied over to a different location and not needed afterwards.
     * Setting this property to true has an impact on the lifecycle of the asset,
     * because we will assume that it is safe to delete after the CloudFormation
     * deployment succeeds.
     *
     * For example, Lambda Function assets are copied over to Lambda during
     * deployment. Therefore, it is not necessary to store the asset in S3, so
     * we consider those deployTime assets.
     */
    override fun deployTime(deployTime: Boolean) {
      cdkBuilder.deployTime(deployTime)
    }

    /**
     * @param executable An external command that will produce the packaged asset.
     * The command should produce the location of a ZIP file on `stdout`.
     */
    override fun executable(executable: List<String>) {
      cdkBuilder.executable(executable)
    }

    /**
     * @param executable An external command that will produce the packaged asset.
     * The command should produce the location of a ZIP file on `stdout`.
     */
    override fun executable(vararg executable: String): Unit = executable(executable.toList())

    /**
     * @param fileName The path, relative to the root of the cloud assembly, in which this asset
     * source resides.
     * This can be a path to a file or a directory, depending on the
     * packaging type.
     */
    override fun fileName(fileName: String) {
      cdkBuilder.fileName(fileName)
    }

    /**
     * @param packaging Which type of packaging to perform.
     */
    override fun packaging(packaging: FileAssetPackaging) {
      cdkBuilder.packaging(packaging.let(FileAssetPackaging.Companion::unwrap))
    }

    /**
     * @param sourceHash A hash on the content source. 
     * This hash is used to uniquely identify this
     * asset throughout the system. If this value doesn't change, the asset will
     * not be rebuilt or republished.
     */
    override fun sourceHash(sourceHash: String) {
      cdkBuilder.sourceHash(sourceHash)
    }

    public fun build(): software.amazon.awscdk.FileAssetSource = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.FileAssetSource,
  ) : CdkObject(cdkObject),
      FileAssetSource {
    /**
     * Whether or not the asset needs to exist beyond deployment time;
     *
     * i.e.
     * are copied over to a different location and not needed afterwards.
     * Setting this property to true has an impact on the lifecycle of the asset,
     * because we will assume that it is safe to delete after the CloudFormation
     * deployment succeeds.
     *
     * For example, Lambda Function assets are copied over to Lambda during
     * deployment. Therefore, it is not necessary to store the asset in S3, so
     * we consider those deployTime assets.
     *
     * Default: false
     */
    override fun deployTime(): Boolean? = unwrap(this).getDeployTime()

    /**
     * An external command that will produce the packaged asset.
     *
     * The command should produce the location of a ZIP file on `stdout`.
     *
     * Default: - Exactly one of `fileName` and `executable` is required
     */
    override fun executable(): List<String> = unwrap(this).getExecutable() ?: emptyList()

    /**
     * The path, relative to the root of the cloud assembly, in which this asset source resides.
     *
     * This can be a path to a file or a directory, depending on the
     * packaging type.
     *
     * Default: - Exactly one of `fileName` and `executable` is required
     */
    override fun fileName(): String? = unwrap(this).getFileName()

    /**
     * Which type of packaging to perform.
     *
     * Default: - Required if `fileName` is specified.
     */
    override fun packaging(): FileAssetPackaging? =
        unwrap(this).getPackaging()?.let(FileAssetPackaging::wrap)

    /**
     * A hash on the content source.
     *
     * This hash is used to uniquely identify this
     * asset throughout the system. If this value doesn't change, the asset will
     * not be rebuilt or republished.
     */
    override fun sourceHash(): String = unwrap(this).getSourceHash()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileAssetSource {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.FileAssetSource): FileAssetSource =
        CdkObjectWrappers.wrap(cdkObject) as? FileAssetSource ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileAssetSource): software.amazon.awscdk.FileAssetSource = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.FileAssetSource
  }
}
