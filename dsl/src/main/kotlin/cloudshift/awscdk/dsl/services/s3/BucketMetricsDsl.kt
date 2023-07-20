@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.s3.BucketMetrics

@CdkDslMarker
public class BucketMetricsDsl {
  private val cdkBuilder: BucketMetrics.Builder = BucketMetrics.builder()

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun tagFilters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tagFilters(builder.map)
  }

  public fun tagFilters(tagFilters: Map<String, Any>) {
    cdkBuilder.tagFilters(tagFilters)
  }

  public fun build(): BucketMetrics = cdkBuilder.build()
}
