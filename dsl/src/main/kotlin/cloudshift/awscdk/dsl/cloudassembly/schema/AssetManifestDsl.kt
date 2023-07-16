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

  public fun dockerImages(dockerImages: Map<String, out DockerImageAsset>) {
    cdkBuilder.dockerImages(dockerImages)
  }

  public fun files(files: Map<String, out FileAsset>) {
    cdkBuilder.files(files)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): AssetManifest = cdkBuilder.build()
}
