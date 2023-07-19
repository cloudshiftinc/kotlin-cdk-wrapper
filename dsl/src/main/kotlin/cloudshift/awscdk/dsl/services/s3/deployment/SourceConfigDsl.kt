@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3.deployment

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.deployment.SourceConfig

@CdkDslMarker
public class SourceConfigDsl {
  private val cdkBuilder: SourceConfig.Builder = SourceConfig.builder()

  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  public fun markers(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.markers(builder.map)
  }

  public fun markers(markers: Map<String, Any>) {
    cdkBuilder.markers(markers)
  }

  public fun zipObjectKey(zipObjectKey: String) {
    cdkBuilder.zipObjectKey(zipObjectKey)
  }

  public fun build(): SourceConfig = cdkBuilder.build()
}
