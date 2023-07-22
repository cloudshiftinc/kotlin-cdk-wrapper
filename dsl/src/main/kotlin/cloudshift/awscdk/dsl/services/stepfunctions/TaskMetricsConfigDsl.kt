@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig

/**
 * Task Metrics.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * Object metricDimensions;
 * TaskMetricsConfig taskMetricsConfig = TaskMetricsConfig.builder()
 * .metricDimensions(Map.of(
 * "metricDimensionsKey", metricDimensions))
 * .metricPrefixPlural("metricPrefixPlural")
 * .metricPrefixSingular("metricPrefixSingular")
 * .build();
 * ```
 */
@CdkDslMarker
public class TaskMetricsConfigDsl {
  private val cdkBuilder: TaskMetricsConfig.Builder = TaskMetricsConfig.builder()

  /**
   * @param metricDimensions The dimensions to attach to metrics.
   */
  public fun metricDimensions(metricDimensions: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(metricDimensions)
    cdkBuilder.metricDimensions(builder.map)
  }

  /**
   * @param metricDimensions The dimensions to attach to metrics.
   */
  public fun metricDimensions(metricDimensions: Map<String, Any>) {
    cdkBuilder.metricDimensions(metricDimensions)
  }

  /**
   * @param metricPrefixPlural Prefix for plural metric names of activity actions.
   */
  public fun metricPrefixPlural(metricPrefixPlural: String) {
    cdkBuilder.metricPrefixPlural(metricPrefixPlural)
  }

  /**
   * @param metricPrefixSingular Prefix for singular metric names of activity actions.
   */
  public fun metricPrefixSingular(metricPrefixSingular: String) {
    cdkBuilder.metricPrefixSingular(metricPrefixSingular)
  }

  public fun build(): TaskMetricsConfig = cdkBuilder.build()
}
