@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.logs.CfnMetricFilter

/**
 * `MetricTransformation` is a property of the `AWS::Logs::MetricFilter` resource that describes how
 * to transform log streams into a CloudWatch metric.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * MetricTransformationProperty metricTransformationProperty =
 * MetricTransformationProperty.builder()
 * .metricName("metricName")
 * .metricNamespace("metricNamespace")
 * .metricValue("metricValue")
 * // the properties below are optional
 * .defaultValue(123)
 * .dimensions(List.of(DimensionProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .unit("unit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html)
 */
@CdkDslMarker
public class CfnMetricFilterMetricTransformationPropertyDsl {
  private val cdkBuilder: CfnMetricFilter.MetricTransformationProperty.Builder =
      CfnMetricFilter.MetricTransformationProperty.builder()

  private val _dimensions: MutableList<Any> = mutableListOf()

  /**
   * @param defaultValue (Optional) The value to emit when a filter pattern does not match a log
   * event.
   * This value can be null.
   */
  public fun defaultValue(defaultValue: Number) {
    cdkBuilder.defaultValue(defaultValue)
  }

  /**
   * @param dimensions The fields to use as dimensions for the metric. One metric filter can include
   * as many as three dimensions.
   *
   * Metrics extracted from log events are charged as custom metrics. To prevent unexpected high
   * charges, do not specify high-cardinality fields such as `IPAddress` or `requestID` as dimensions.
   * Each different value found for a dimension is treated as a separate metric and accrues charges as
   * a separate custom metric.
   *
   * CloudWatch Logs disables a metric filter if it generates 1000 different name/value pairs for
   * your specified dimensions within a certain amount of time. This helps to prevent accidental high
   * charges.
   *
   * You can also set up a billing alarm to alert you if your charges are higher than expected. For
   * more information, see [Creating a Billing Alarm to Monitor Your Estimated AWS
   * Charges](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html)
   * .
   */
  public fun dimensions(vararg dimensions: Any) {
    _dimensions.addAll(listOf(*dimensions))
  }

  /**
   * @param dimensions The fields to use as dimensions for the metric. One metric filter can include
   * as many as three dimensions.
   *
   * Metrics extracted from log events are charged as custom metrics. To prevent unexpected high
   * charges, do not specify high-cardinality fields such as `IPAddress` or `requestID` as dimensions.
   * Each different value found for a dimension is treated as a separate metric and accrues charges as
   * a separate custom metric.
   *
   * CloudWatch Logs disables a metric filter if it generates 1000 different name/value pairs for
   * your specified dimensions within a certain amount of time. This helps to prevent accidental high
   * charges.
   *
   * You can also set up a billing alarm to alert you if your charges are higher than expected. For
   * more information, see [Creating a Billing Alarm to Monitor Your Estimated AWS
   * Charges](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html)
   * .
   */
  public fun dimensions(dimensions: Collection<Any>) {
    _dimensions.addAll(dimensions)
  }

  /**
   * @param dimensions The fields to use as dimensions for the metric. One metric filter can include
   * as many as three dimensions.
   *
   * Metrics extracted from log events are charged as custom metrics. To prevent unexpected high
   * charges, do not specify high-cardinality fields such as `IPAddress` or `requestID` as dimensions.
   * Each different value found for a dimension is treated as a separate metric and accrues charges as
   * a separate custom metric.
   *
   * CloudWatch Logs disables a metric filter if it generates 1000 different name/value pairs for
   * your specified dimensions within a certain amount of time. This helps to prevent accidental high
   * charges.
   *
   * You can also set up a billing alarm to alert you if your charges are higher than expected. For
   * more information, see [Creating a Billing Alarm to Monitor Your Estimated AWS
   * Charges](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html)
   * .
   */
  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  /**
   * @param metricName The name of the CloudWatch metric. 
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * @param metricNamespace A custom namespace to contain your metric in CloudWatch. 
   * Use namespaces to group together metrics that are similar. For more information, see
   * [Namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Namespace)
   * .
   */
  public fun metricNamespace(metricNamespace: String) {
    cdkBuilder.metricNamespace(metricNamespace)
  }

  /**
   * @param metricValue The value that is published to the CloudWatch metric. 
   * For example, if you're counting the occurrences of a particular term like `Error` , specify 1
   * for the metric value. If you're counting the number of bytes transferred, reference the value that
   * is in the log event by using $. followed by the name of the field that you specified in the filter
   * pattern, such as `$.size` .
   */
  public fun metricValue(metricValue: String) {
    cdkBuilder.metricValue(metricValue)
  }

  /**
   * @param unit The unit to assign to the metric.
   * If you omit this, the unit is set as `None` .
   */
  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun build(): CfnMetricFilter.MetricTransformationProperty {
    if(_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
    return cdkBuilder.build()
  }
}
