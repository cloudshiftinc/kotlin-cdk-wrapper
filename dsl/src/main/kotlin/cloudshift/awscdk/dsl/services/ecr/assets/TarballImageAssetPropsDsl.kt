@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr.assets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps

/**
 * Options for TarballImageAsset.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.ecr.assets.TarballImageAsset;
 * TarballImageAsset asset = TarballImageAsset.Builder.create(this, "MyBuildImage")
 * .tarballFile("local-image.tar")
 * .build();
 * ```
 */
@CdkDslMarker
public class TarballImageAssetPropsDsl {
  private val cdkBuilder: TarballImageAssetProps.Builder = TarballImageAssetProps.builder()

  /**
   * @param tarballFile Absolute path to the tarball. 
   * It is recommended to to use the script running directory (e.g. `__dirname`
   * in Node.js projects or dirname of `__file__` in Python) if your tarball
   * is located as a resource inside your project.
   */
  public fun tarballFile(tarballFile: String) {
    cdkBuilder.tarballFile(tarballFile)
  }

  public fun build(): TarballImageAssetProps = cdkBuilder.build()
}
