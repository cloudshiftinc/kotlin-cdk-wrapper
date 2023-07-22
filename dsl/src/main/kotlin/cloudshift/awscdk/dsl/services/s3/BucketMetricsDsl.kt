@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.s3.BucketMetrics

/**
 * Specifies a metrics configuration for the CloudWatch request metrics from an Amazon S3 bucket.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * Object tagFilters;
 * BucketMetrics bucketMetrics = BucketMetrics.builder()
 * .id("id")
 * // the properties below are optional
 * .prefix("prefix")
 * .tagFilters(Map.of(
 * "tagFiltersKey", tagFilters))
 * .build();
 * ```
 */
@CdkDslMarker
public class BucketMetricsDsl {
  private val cdkBuilder: BucketMetrics.Builder = BucketMetrics.builder()

  /**
   * @param id The ID used to identify the metrics configuration. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param prefix The prefix that an object must have to be included in the metrics results.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param tagFilters Specifies a list of tag filters to use as a metrics configuration filter.
   * The metrics configuration includes only objects that meet the filter's criteria.
   */
  public fun tagFilters(tagFilters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tagFilters)
    cdkBuilder.tagFilters(builder.map)
  }

  /**
   * @param tagFilters Specifies a list of tag filters to use as a metrics configuration filter.
   * The metrics configuration includes only objects that meet the filter's criteria.
   */
  public fun tagFilters(tagFilters: Map<String, Any>) {
    cdkBuilder.tagFilters(tagFilters)
  }

  public fun build(): BucketMetrics = cdkBuilder.build()
}
