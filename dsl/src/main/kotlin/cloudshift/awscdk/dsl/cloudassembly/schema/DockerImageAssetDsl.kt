@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.cloudassembly.schema.DockerImageAsset
import software.amazon.awscdk.cloudassembly.schema.DockerImageDestination
import software.amazon.awscdk.cloudassembly.schema.DockerImageSource

@CdkDslMarker
public class DockerImageAssetDsl {
  private val cdkBuilder: DockerImageAsset.Builder = DockerImageAsset.builder()

  public fun destinations(destinations: Map<String, out DockerImageDestination>) {
    cdkBuilder.destinations(destinations)
  }

  public fun source(block: DockerImageSourceDsl.() -> Unit = {}) {
    val builder = DockerImageSourceDsl()
    builder.apply(block)
    cdkBuilder.source(builder.build())
  }

  public fun source(source: DockerImageSource) {
    cdkBuilder.source(source)
  }

  public fun build(): DockerImageAsset = cdkBuilder.build()
}
