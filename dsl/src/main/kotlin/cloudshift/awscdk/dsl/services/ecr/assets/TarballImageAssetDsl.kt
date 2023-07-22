@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr.assets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecr.assets.TarballImageAsset
import software.constructs.Construct

@CdkDslMarker
public class TarballImageAssetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: TarballImageAsset.Builder = TarballImageAsset.Builder.create(scope, id)

  /**
   * Absolute path to the tarball.
   *
   * It is recommended to to use the script running directory (e.g. `__dirname`
   * in Node.js projects or dirname of `__file__` in Python) if your tarball
   * is located as a resource inside your project.
   *
   * @param tarballFile Absolute path to the tarball. 
   */
  public fun tarballFile(tarballFile: String) {
    cdkBuilder.tarballFile(tarballFile)
  }

  public fun build(): TarballImageAsset = cdkBuilder.build()
}
