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

  /**
   * @param destinations Destinations for this file asset. 
   */
  public fun destinations(destinations: Map<String, DockerImageDestination>) {
    cdkBuilder.destinations(destinations)
  }

  /**
   * @param source Source description for file assets. 
   */
  public fun source(source: DockerImageSourceDsl.() -> Unit = {}) {
    val builder = DockerImageSourceDsl()
    builder.apply(source)
    cdkBuilder.source(builder.build())
  }

  /**
   * @param source Source description for file assets. 
   */
  public fun source(source: DockerImageSource) {
    cdkBuilder.source(source)
  }

  public fun build(): DockerImageAsset = cdkBuilder.build()
}
