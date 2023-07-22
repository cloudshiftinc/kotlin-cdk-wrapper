@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.cloudassembly.schema.AssetManifest
import software.amazon.awscdk.cloudassembly.schema.DockerImageAsset
import software.amazon.awscdk.cloudassembly.schema.FileAsset

@CdkDslMarker
public class AssetManifestDsl {
  private val cdkBuilder: AssetManifest.Builder = AssetManifest.builder()

  /**
   * @param dockerImages The Docker image assets in this manifest.
   */
  public fun dockerImages(dockerImages: Map<String, DockerImageAsset>) {
    cdkBuilder.dockerImages(dockerImages)
  }

  /**
   * @param files The file assets in this manifest.
   */
  public fun files(files: Map<String, FileAsset>) {
    cdkBuilder.files(files)
  }

  /**
   * @param version Version of the manifest. 
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): AssetManifest = cdkBuilder.build()
}
