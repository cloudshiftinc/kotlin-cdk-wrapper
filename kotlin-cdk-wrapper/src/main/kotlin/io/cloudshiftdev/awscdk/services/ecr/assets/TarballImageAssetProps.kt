@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr.assets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options for TarballImageAsset.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ecr.assets.TarballImageAsset;
 * TarballImageAsset asset = TarballImageAsset.Builder.create(this, "MyBuildImage")
 * .tarballFile("local-image.tar")
 * .build();
 * ```
 */
public interface TarballImageAssetProps {
  /**
   * A display name for this asset.
   *
   * If supplied, the display name will be used in locations where the asset
   * identifier is printed, like in the CLI progress information. If the same
   * asset is added multiple times, the display name of the first occurrence is
   * used.
   *
   * The default is the construct path of the `TarballImageAsset` construct,
   * with respect to the enclosing stack. If the asset is produced by a
   * construct helper function (such as `lambda.Code.fromAssetImage()`), this
   * will look like `MyFunction/AssetImage`.
   *
   * We use the stack-relative construct path so that in the common case where
   * you have multiple stacks with the same asset, we won't show something like
   * `/MyBetaStack/MyFunction/Code` when you are actually deploying to
   * production.
   *
   * Default: - Stack-relative construct path
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * Absolute path to the tarball.
   *
   * It is recommended to to use the script running directory (e.g. `__dirname`
   * in Node.js projects or dirname of `__file__` in Python) if your tarball
   * is located as a resource inside your project.
   */
  public fun tarballFile(): String

  /**
   * A builder for [TarballImageAssetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param displayName A display name for this asset.
     * If supplied, the display name will be used in locations where the asset
     * identifier is printed, like in the CLI progress information. If the same
     * asset is added multiple times, the display name of the first occurrence is
     * used.
     *
     * The default is the construct path of the `TarballImageAsset` construct,
     * with respect to the enclosing stack. If the asset is produced by a
     * construct helper function (such as `lambda.Code.fromAssetImage()`), this
     * will look like `MyFunction/AssetImage`.
     *
     * We use the stack-relative construct path so that in the common case where
     * you have multiple stacks with the same asset, we won't show something like
     * `/MyBetaStack/MyFunction/Code` when you are actually deploying to
     * production.
     */
    public fun displayName(displayName: String)

    /**
     * @param tarballFile Absolute path to the tarball. 
     * It is recommended to to use the script running directory (e.g. `__dirname`
     * in Node.js projects or dirname of `__file__` in Python) if your tarball
     * is located as a resource inside your project.
     */
    public fun tarballFile(tarballFile: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps.Builder =
        software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps.builder()

    /**
     * @param displayName A display name for this asset.
     * If supplied, the display name will be used in locations where the asset
     * identifier is printed, like in the CLI progress information. If the same
     * asset is added multiple times, the display name of the first occurrence is
     * used.
     *
     * The default is the construct path of the `TarballImageAsset` construct,
     * with respect to the enclosing stack. If the asset is produced by a
     * construct helper function (such as `lambda.Code.fromAssetImage()`), this
     * will look like `MyFunction/AssetImage`.
     *
     * We use the stack-relative construct path so that in the common case where
     * you have multiple stacks with the same asset, we won't show something like
     * `/MyBetaStack/MyFunction/Code` when you are actually deploying to
     * production.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param tarballFile Absolute path to the tarball. 
     * It is recommended to to use the script running directory (e.g. `__dirname`
     * in Node.js projects or dirname of `__file__` in Python) if your tarball
     * is located as a resource inside your project.
     */
    override fun tarballFile(tarballFile: String) {
      cdkBuilder.tarballFile(tarballFile)
    }

    public fun build(): software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps,
  ) : CdkObject(cdkObject),
      TarballImageAssetProps {
    /**
     * A display name for this asset.
     *
     * If supplied, the display name will be used in locations where the asset
     * identifier is printed, like in the CLI progress information. If the same
     * asset is added multiple times, the display name of the first occurrence is
     * used.
     *
     * The default is the construct path of the `TarballImageAsset` construct,
     * with respect to the enclosing stack. If the asset is produced by a
     * construct helper function (such as `lambda.Code.fromAssetImage()`), this
     * will look like `MyFunction/AssetImage`.
     *
     * We use the stack-relative construct path so that in the common case where
     * you have multiple stacks with the same asset, we won't show something like
     * `/MyBetaStack/MyFunction/Code` when you are actually deploying to
     * production.
     *
     * Default: - Stack-relative construct path
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * Absolute path to the tarball.
     *
     * It is recommended to to use the script running directory (e.g. `__dirname`
     * in Node.js projects or dirname of `__file__` in Python) if your tarball
     * is located as a resource inside your project.
     */
    override fun tarballFile(): String = unwrap(this).getTarballFile()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TarballImageAssetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps):
        TarballImageAssetProps = CdkObjectWrappers.wrap(cdkObject) as? TarballImageAssetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TarballImageAssetProps):
        software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps
  }
}
