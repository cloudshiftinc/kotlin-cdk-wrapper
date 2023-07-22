@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.MetricProps
import software.amazon.awscdk.services.cloudwatch.Unit

/**
 * Properties for a metric.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.cloudwatch.*;
 * Metric metric = Metric.Builder.create()
 * .namespace("MyNamespace")
 * .metricName("MyMetric")
 * .dimensions(Map.of("MyDimension", "MyDimensionValue"))
 * .build();
 * Alarm alarm = Alarm.Builder.create(this, "MyAlarm")
 * .metric(metric)
 * .threshold(100)
 * .evaluationPeriods(3)
 * .datapointsToAlarm(2)
 * .build();
 * TopicRule topicRule = TopicRule.Builder.create(this, "TopicRule")
 * .sql(IotSql.fromStringAsVer20160323("SELECT topic(2) as device_id FROM 'device/+/data'"))
 * .actions(List.of(
 * CloudWatchSetAlarmStateAction.Builder.create(alarm)
 * .reason("AWS Iot Rule action is triggered")
 * .alarmStateToSet(AlarmState.ALARM)
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class MetricPropsDsl {
  private val cdkBuilder: MetricProps.Builder = MetricProps.builder()

  /**
   * @param account Account which this metric comes from.
   */
  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  /**
   * @param color The hex color code, prefixed with '#' (e.g. '#00ff00'), to use when this metric is
   * rendered on a graph. The `Color` class has a set of standard colors that can be used here.
   */
  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  /**
   * @param dimensionsMap Dimensions of the metric.
   */
  public fun dimensionsMap(dimensionsMap: Map<String, String>) {
    cdkBuilder.dimensionsMap(dimensionsMap)
  }

  /**
   * @param label Label for this metric when added to a Graph in a Dashboard.
   * You can use [dynamic
   * labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
   * to show summary information about the entire displayed time series
   * in the legend. For example, if you use:
   *
   * ```
   * [max: ${MAX}] MyMetric
   * ```
   *
   * As the metric label, the maximum value in the visible range will
   * be shown next to the time series name in the graph's legend.
   */
  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  /**
   * @param metricName Name of the metric. 
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * @param namespace Namespace of the metric. 
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  /**
   * @param period The period over which the specified statistic is applied.
   */
  public fun period(period: Duration) {
    cdkBuilder.period(period)
  }

  /**
   * @param region Region which this metric comes from.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param statistic What function to use for aggregating.
   * Use the `aws_cloudwatch.Stats` helper class to construct valid input strings.
   *
   * Can be one of the following:
   *
   * * "Minimum" | "min"
   * * "Maximum" | "max"
   * * "Average" | "avg"
   * * "Sum" | "sum"
   * * "SampleCount | "n"
   * * "pNN.NN"
   * * "tmNN.NN" | "tm(NN.NN%:NN.NN%)"
   * * "iqm"
   * * "wmNN.NN" | "wm(NN.NN%:NN.NN%)"
   * * "tcNN.NN" | "tc(NN.NN%:NN.NN%)"
   * * "tsNN.NN" | "ts(NN.NN%:NN.NN%)"
   */
  public fun statistic(statistic: String) {
    cdkBuilder.statistic(statistic)
  }

  /**
   * @param unit Unit used to filter the metric stream.
   * Only refer to datums emitted to the metric stream with the given unit and
   * ignore all others. Only useful when datums are being emitted to the same
   * metric stream under different units.
   *
   * The default is to use all matric datums in the stream, regardless of unit,
   * which is recommended in nearly all cases.
   *
   * CloudWatch does not honor this property for graphs.
   */
  public fun unit(unit: Unit) {
    cdkBuilder.unit(unit)
  }

  public fun build(): MetricProps = cdkBuilder.build()
}
