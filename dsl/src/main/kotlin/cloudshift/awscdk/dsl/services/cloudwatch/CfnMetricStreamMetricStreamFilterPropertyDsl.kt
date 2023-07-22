@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream

/**
 * This structure contains a metric namespace and optionally, a list of metric names, to either
 * include in a metric ' stream or exclude from a metric stream.
 *
 * A metric stream's filters can include up to 1000 total names. This limit applies to the sum of
 * namespace names and metric names in the filters. For example, this could include 10 metric namespace
 * filters with 99 metrics each, or 20 namespace filters with 49 metrics specified in each filter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * MetricStreamFilterProperty metricStreamFilterProperty = MetricStreamFilterProperty.builder()
 * .namespace("namespace")
 * // the properties below are optional
 * .metricNames(List.of("metricNames"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamfilter.html)
 */
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
