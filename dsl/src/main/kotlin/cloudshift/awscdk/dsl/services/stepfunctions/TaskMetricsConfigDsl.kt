@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig

@CdkDslMarker
public class TaskMetricsConfigDsl {
  private val cdkBuilder: TaskMetricsConfig.Builder = TaskMetricsConfig.builder()

  public fun metricDimensions(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.metricDimensions(builder.map)
  }

  public fun metricDimensions(metricDimensions: Map<String, *>) {
    cdkBuilder.metricDimensions(metricDimensions)
  }

  public fun metricPrefixPlural(metricPrefixPlural: String) {
    cdkBuilder.metricPrefixPlural(metricPrefixPlural)
  }

  public fun metricPrefixSingular(metricPrefixSingular: String) {
    cdkBuilder.metricPrefixSingular(metricPrefixSingular)
  }

  public fun build(): TaskMetricsConfig = cdkBuilder.build()
}
