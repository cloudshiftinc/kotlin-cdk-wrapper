@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.cloudwatch.Unit
import software.amazon.awscdk.services.logs.IFilterPattern
import software.amazon.awscdk.services.logs.MetricFilterOptions

@CdkDslMarker
public class MetricFilterOptionsDsl {
  private val cdkBuilder: MetricFilterOptions.Builder = MetricFilterOptions.builder()

  public fun defaultValue(defaultValue: Number) {
    cdkBuilder.defaultValue(defaultValue)
  }

  public fun dimensions(dimensions: Map<String, String>) {
    cdkBuilder.dimensions(dimensions)
  }

  public fun filterName(filterName: String) {
    cdkBuilder.filterName(filterName)
  }

  public fun filterPattern(filterPattern: IFilterPattern) {
    cdkBuilder.filterPattern(filterPattern)
  }

  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  public fun metricNamespace(metricNamespace: String) {
    cdkBuilder.metricNamespace(metricNamespace)
  }

  public fun metricValue(metricValue: String) {
    cdkBuilder.metricValue(metricValue)
  }

  public fun unit(unit: Unit) {
    cdkBuilder.unit(unit)
  }

  public fun build(): MetricFilterOptions = cdkBuilder.build()
}
