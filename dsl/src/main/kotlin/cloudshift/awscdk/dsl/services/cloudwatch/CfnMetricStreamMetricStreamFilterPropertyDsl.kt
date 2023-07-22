@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream

@CdkDslMarker
public class CfnMetricStreamMetricStreamFilterPropertyDsl {
  private val cdkBuilder: CfnMetricStream.MetricStreamFilterProperty.Builder =
      CfnMetricStream.MetricStreamFilterProperty.builder()

  private val _metricNames: MutableList<String> = mutableListOf()

  /**
   * @param metricNames The names of the metrics to either include or exclude from the metric
   * stream.
   * If you omit this parameter, all metrics in the namespace are included or excluded, depending on
   * whether this filter is specified as an exclude filter or an include filter.
   *
   * Each metric name can contain only ASCII printable characters (ASCII range 32 through 126). Each
   * metric name must contain at least one non-whitespace character.
   */
  public fun metricNames(vararg metricNames: String) {
    _metricNames.addAll(listOf(*metricNames))
  }

  /**
   * @param metricNames The names of the metrics to either include or exclude from the metric
   * stream.
   * If you omit this parameter, all metrics in the namespace are included or excluded, depending on
   * whether this filter is specified as an exclude filter or an include filter.
   *
   * Each metric name can contain only ASCII printable characters (ASCII range 32 through 126). Each
   * metric name must contain at least one non-whitespace character.
   */
  public fun metricNames(metricNames: Collection<String>) {
    _metricNames.addAll(metricNames)
  }

  /**
   * @param namespace The name of the metric namespace in the filter. 
   * The namespace can contain only ASCII printable characters (ASCII range 32 through 126). It must
   * contain at least one non-whitespace character.
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun build(): CfnMetricStream.MetricStreamFilterProperty {
    if(_metricNames.isNotEmpty()) cdkBuilder.metricNames(_metricNames)
    return cdkBuilder.build()
  }
}
