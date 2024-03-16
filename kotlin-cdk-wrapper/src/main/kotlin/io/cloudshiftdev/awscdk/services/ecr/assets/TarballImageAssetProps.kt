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
    override val cdkObject: software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps,
  ) : CdkObject(cdkObject), TarballImageAssetProps {
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
        TarballImageAssetProps = CdkObjectWrappers.wrap(cdkObject) as TarballImageAssetProps

    internal fun unwrap(wrapped: TarballImageAssetProps):
        software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps
  }
}
