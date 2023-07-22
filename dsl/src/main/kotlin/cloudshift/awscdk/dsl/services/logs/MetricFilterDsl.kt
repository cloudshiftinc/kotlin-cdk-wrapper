@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.cloudwatch.Unit
import software.amazon.awscdk.services.logs.IFilterPattern
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.MetricFilter
import software.constructs.Construct

/**
 * A filter that extracts information from CloudWatch Logs and emits to CloudWatch Metrics.
 *
 * Example:
 *
 * ```
 * MetricFilter.Builder.create(this, "MetricFilter")
 * .logGroup(logGroup)
 * .metricNamespace("MyApp")
 * .metricName("Latency")
 * .filterPattern(FilterPattern.exists("$.latency"))
 * .metricValue("$.latency")
 * .build();
 * ```
 */
@CdkDslMarker
public class MetricFilterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: MetricFilter.Builder = MetricFilter.Builder.create(scope, id)

  /**
   * The value to emit if the pattern does not match a particular event.
   *
   * Default: No metric emitted.
   *
   * @param defaultValue The value to emit if the pattern does not match a particular event. 
   */
  public fun defaultValue(defaultValue: Number) {
    cdkBuilder.defaultValue(defaultValue)
  }

  /**
   * The fields to use as dimensions for the metric.
   *
   * One metric filter can include as many as three dimensions.
   *
   * Default: - No dimensions attached to metrics.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-dimensions)
   * @param dimensions The fields to use as dimensions for the metric. 
   */
  public fun dimensions(dimensions: Map<String, String>) {
    cdkBuilder.dimensions(dimensions)
  }

  /**
   * The name of the metric filter.
   *
   * Default: - Cloudformation generated name.
   *
   * @param filterName The name of the metric filter. 
   */
  public fun filterName(filterName: String) {
    cdkBuilder.filterName(filterName)
  }

  /**
   * Pattern to search for log events.
   *
   * @param filterPattern Pattern to search for log events. 
   */
  public fun filterPattern(filterPattern: IFilterPattern) {
    cdkBuilder.filterPattern(filterPattern)
  }

  /**
   * The log group to create the filter on.
   *
   * @param logGroup The log group to create the filter on. 
   */
  public fun logGroup(logGroup: ILogGroup) {
    cdkBuilder.logGroup(logGroup)
  }

  /**
   * The name of the metric to emit.
   *
   * @param metricName The name of the metric to emit. 
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * The namespace of the metric to emit.
   *
   * @param metricNamespace The namespace of the metric to emit. 
   */
  public fun metricNamespace(metricNamespace: String) {
    cdkBuilder.metricNamespace(metricNamespace)
  }

  /**
   * The value to emit for the metric.
   *
   * Can either be a literal number (typically "1"), or the name of a field in the structure
   * to take the value from the matched event. If you are using a field value, the field
   * value must have been matched using the pattern.
   *
   * If you want to specify a field from a matched JSON structure, use '$.fieldName',
   * and make sure the field is in the pattern (if only as '$.fieldName = *').
   *
   * If you want to specify a field from a matched space-delimited structure,
   * use '$fieldName'.
   *
   * Default: "1"
   *
   * @param metricValue The value to emit for the metric. 
   */
  public fun metricValue(metricValue: String) {
    cdkBuilder.metricValue(metricValue)
  }

  /**
   * The unit to assign to the metric.
   *
   * Default: - No unit attached to metrics.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-unit)
   * @param unit The unit to assign to the metric. 
   */
  public fun unit(unit: Unit) {
    cdkBuilder.unit(unit)
  }

  public fun build(): MetricFilter = cdkBuilder.build()
}
