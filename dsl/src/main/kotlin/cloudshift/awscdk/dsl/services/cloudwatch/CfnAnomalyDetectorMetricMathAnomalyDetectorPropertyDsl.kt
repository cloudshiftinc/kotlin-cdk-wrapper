@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

/**
 * Indicates the CloudWatch math expression that provides the time series the anomaly detector uses
 * as input.
 *
 * The designated math expression must return a single time series.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * MetricMathAnomalyDetectorProperty metricMathAnomalyDetectorProperty =
 * MetricMathAnomalyDetectorProperty.builder()
 * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .accountId("accountId")
 * .expression("expression")
 * .label("label")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * // the properties below are optional
 * .dimensions(List.of(DimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .period(123)
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .period(123)
 * .returnData(false)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricmathanomalydetector.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorMetricMathAnomalyDetectorPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.MetricMathAnomalyDetectorProperty.Builder =
      CfnAnomalyDetector.MetricMathAnomalyDetectorProperty.builder()

  private val _metricDataQueries: MutableList<Any> = mutableListOf()

  /**
   * @param metricDataQueries An array of metric data query structures that enables you to create an
   * anomaly detector based on the result of a metric math expression.
   * Each item in `MetricDataQueries` gets a metric or performs a math expression. One item in
   * `MetricDataQueries` is the expression that provides the time series that the anomaly detector uses
   * as input. Designate the expression by setting `ReturnData` to `true` for this object in the array.
   * For all other expressions and metrics, set `ReturnData` to `false` . The designated expression
   * must return a single time series.
   */
  public fun metricDataQueries(vararg metricDataQueries: Any) {
    _metricDataQueries.addAll(listOf(*metricDataQueries))
  }

  /**
   * @param metricDataQueries An array of metric data query structures that enables you to create an
   * anomaly detector based on the result of a metric math expression.
   * Each item in `MetricDataQueries` gets a metric or performs a math expression. One item in
   * `MetricDataQueries` is the expression that provides the time series that the anomaly detector uses
   * as input. Designate the expression by setting `ReturnData` to `true` for this object in the array.
   * For all other expressions and metrics, set `ReturnData` to `false` . The designated expression
   * must return a single time series.
   */
  public fun metricDataQueries(metricDataQueries: Collection<Any>) {
    _metricDataQueries.addAll(metricDataQueries)
  }

  /**
   * @param metricDataQueries An array of metric data query structures that enables you to create an
   * anomaly detector based on the result of a metric math expression.
   * Each item in `MetricDataQueries` gets a metric or performs a math expression. One item in
   * `MetricDataQueries` is the expression that provides the time series that the anomaly detector uses
   * as input. Designate the expression by setting `ReturnData` to `true` for this object in the array.
   * For all other expressions and metrics, set `ReturnData` to `false` . The designated expression
   * must return a single time series.
   */
  public fun metricDataQueries(metricDataQueries: IResolvable) {
    cdkBuilder.metricDataQueries(metricDataQueries)
  }

  public fun build(): CfnAnomalyDetector.MetricMathAnomalyDetectorProperty {
    if(_metricDataQueries.isNotEmpty()) cdkBuilder.metricDataQueries(_metricDataQueries)
    return cdkBuilder.build()
  }
}
