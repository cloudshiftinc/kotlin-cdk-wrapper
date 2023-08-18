@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.cloudwatch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAlarmProps

/**
 * Properties for defining a `CfnAlarm`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * CfnAlarmProps cfnAlarmProps = CfnAlarmProps.builder()
 * .comparisonOperator("comparisonOperator")
 * .evaluationPeriods(123)
 * // the properties below are optional
 * .actionsEnabled(false)
 * .alarmActions(List.of("alarmActions"))
 * .alarmDescription("alarmDescription")
 * .alarmName("alarmName")
 * .datapointsToAlarm(123)
 * .dimensions(List.of(DimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .evaluateLowSampleCountPercentile("evaluateLowSampleCountPercentile")
 * .extendedStatistic("extendedStatistic")
 * .insufficientDataActions(List.of("insufficientDataActions"))
 * .metricName("metricName")
 * .metrics(List.of(MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .accountId("accountId")
 * .expression("expression")
 * .label("label")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .metricName("metricName")
 * .namespace("namespace")
 * .build())
 * .period(123)
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .period(123)
 * .returnData(false)
 * .build()))
 * .namespace("namespace")
 * .okActions(List.of("okActions"))
 * .period(123)
 * .statistic("statistic")
 * .threshold(123)
 * .thresholdMetricId("thresholdMetricId")
 * .treatMissingData("treatMissingData")
 * .unit("unit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html)
 */
@CdkDslMarker
public class CfnAlarmPropsDsl {
    private val cdkBuilder: CfnAlarmProps.Builder = CfnAlarmProps.builder()

    private val _alarmActions: MutableList<String> = mutableListOf()

    private val _dimensions: MutableList<Any> = mutableListOf()

    private val _insufficientDataActions: MutableList<String> = mutableListOf()

    private val _metrics: MutableList<Any> = mutableListOf()

    private val _okActions: MutableList<String> = mutableListOf()

    /**
     * @param actionsEnabled Indicates whether actions should be executed during any changes to the
     *   alarm state. The default is TRUE.
     */
    public fun actionsEnabled(actionsEnabled: Boolean) {
        cdkBuilder.actionsEnabled(actionsEnabled)
    }

    /**
     * @param actionsEnabled Indicates whether actions should be executed during any changes to the
     *   alarm state. The default is TRUE.
     */
    public fun actionsEnabled(actionsEnabled: IResolvable) {
        cdkBuilder.actionsEnabled(actionsEnabled)
    }

    /**
     * @param alarmActions The list of actions to execute when this alarm transitions into an ALARM
     *   state from any other state. Specify each action as an Amazon Resource Name (ARN). For more
     *   information about creating alarms and the actions that you can specify, see
     *   [PutMetricAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutMetricAlarm.html)
     *   in the *Amazon CloudWatch API Reference* .
     */
    public fun alarmActions(vararg alarmActions: String) {
        _alarmActions.addAll(listOf(*alarmActions))
    }

    /**
     * @param alarmActions The list of actions to execute when this alarm transitions into an ALARM
     *   state from any other state. Specify each action as an Amazon Resource Name (ARN). For more
     *   information about creating alarms and the actions that you can specify, see
     *   [PutMetricAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutMetricAlarm.html)
     *   in the *Amazon CloudWatch API Reference* .
     */
    public fun alarmActions(alarmActions: Collection<String>) {
        _alarmActions.addAll(alarmActions)
    }

    /** @param alarmDescription The description of the alarm. */
    public fun alarmDescription(alarmDescription: String) {
        cdkBuilder.alarmDescription(alarmDescription)
    }

    /**
     * @param alarmName The name of the alarm. If you don't specify a name, AWS CloudFormation
     *   generates a unique physical ID and uses that ID for the alarm name.
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the
     * resource, specify a new name.
     */
    public fun alarmName(alarmName: String) {
        cdkBuilder.alarmName(alarmName)
    }

    /**
     * @param comparisonOperator The arithmetic operation to use when comparing the specified
     *   statistic and threshold. The specified statistic value is used as the first operand.
     *
     * You can specify the following values: `GreaterThanThreshold` ,
     * `GreaterThanOrEqualToThreshold` , `LessThanThreshold` , or `LessThanOrEqualToThreshold` .
     */
    public fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
    }

    /**
     * @param datapointsToAlarm The number of datapoints that must be breaching to trigger the
     *   alarm. This is used only if you are setting an "M out of N" alarm. In that case, this value
     *   is the M, and the value that you set for `EvaluationPeriods` is the N value. For more
     *   information, see
     *   [Evaluating an Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation)
     *   in the *Amazon CloudWatch User Guide* .
     *
     * If you omit this parameter, CloudWatch uses the same value here that you set for
     * `EvaluationPeriods` , and the alarm goes to alarm state if that many consecutive periods are
     * breaching.
     */
    public fun datapointsToAlarm(datapointsToAlarm: Number) {
        cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    /**
     * @param dimensions The dimensions for the metric associated with the alarm. For an alarm based
     *   on a math expression, you can't specify `Dimensions` . Instead, you use `Metrics` .
     */
    public fun dimensions(vararg dimensions: Any) {
        _dimensions.addAll(listOf(*dimensions))
    }

    /**
     * @param dimensions The dimensions for the metric associated with the alarm. For an alarm based
     *   on a math expression, you can't specify `Dimensions` . Instead, you use `Metrics` .
     */
    public fun dimensions(dimensions: Collection<Any>) {
        _dimensions.addAll(dimensions)
    }

    /**
     * @param dimensions The dimensions for the metric associated with the alarm. For an alarm based
     *   on a math expression, you can't specify `Dimensions` . Instead, you use `Metrics` .
     */
    public fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions)
    }

    /**
     * @param evaluateLowSampleCountPercentile Used only for alarms based on percentiles. If
     *   `ignore` , the alarm state does not change during periods with too few data points to be
     *   statistically significant. If `evaluate` or this parameter is not used, the alarm is always
     *   evaluated and possibly changes state no matter how many data points are available.
     */
    public fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String) {
        cdkBuilder.evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile)
    }

    /**
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     *   threshold. If you are setting an alarm that requires that a number of consecutive data
     *   points be breaching to trigger the alarm, this value specifies that number. If you are
     *   setting an "M out of N" alarm, this value is the N, and `DatapointsToAlarm` is the M.
     *
     * For more information, see
     * [Evaluating an Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation)
     * in the *Amazon CloudWatch User Guide* .
     */
    public fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    /**
     * @param extendedStatistic The percentile statistic for the metric associated with the alarm.
     *   Specify a value between p0.0 and p100. For an alarm based on a metric, you must specify
     *   either `Statistic` or `ExtendedStatistic` but not both.
     *
     * For an alarm based on a math expression, you can't specify `ExtendedStatistic` . Instead, you
     * use `Metrics` .
     */
    public fun extendedStatistic(extendedStatistic: String) {
        cdkBuilder.extendedStatistic(extendedStatistic)
    }

    /**
     * @param insufficientDataActions The actions to execute when this alarm transitions to the
     *   `INSUFFICIENT_DATA` state from any other state. Each action is specified as an Amazon
     *   Resource Name (ARN).
     */
    public fun insufficientDataActions(vararg insufficientDataActions: String) {
        _insufficientDataActions.addAll(listOf(*insufficientDataActions))
    }

    /**
     * @param insufficientDataActions The actions to execute when this alarm transitions to the
     *   `INSUFFICIENT_DATA` state from any other state. Each action is specified as an Amazon
     *   Resource Name (ARN).
     */
    public fun insufficientDataActions(insufficientDataActions: Collection<String>) {
        _insufficientDataActions.addAll(insufficientDataActions)
    }

    /**
     * @param metricName The name of the metric associated with the alarm. This is required for an
     *   alarm based on a metric. For an alarm based on a math expression, you use `Metrics` instead
     *   and you can't specify `MetricName` .
     */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /**
     * @param metrics An array that enables you to create an alarm based on the result of a metric
     *   math expression. Each item in the array either retrieves a metric or performs a math
     *   expression.
     *
     * If you specify the `Metrics` parameter, you cannot specify `MetricName` , `Dimensions` ,
     * `Period` , `Namespace` , `Statistic` , `ExtendedStatistic` , or `Unit` .
     */
    public fun metrics(vararg metrics: Any) {
        _metrics.addAll(listOf(*metrics))
    }

    /**
     * @param metrics An array that enables you to create an alarm based on the result of a metric
     *   math expression. Each item in the array either retrieves a metric or performs a math
     *   expression.
     *
     * If you specify the `Metrics` parameter, you cannot specify `MetricName` , `Dimensions` ,
     * `Period` , `Namespace` , `Statistic` , `ExtendedStatistic` , or `Unit` .
     */
    public fun metrics(metrics: Collection<Any>) {
        _metrics.addAll(metrics)
    }

    /**
     * @param metrics An array that enables you to create an alarm based on the result of a metric
     *   math expression. Each item in the array either retrieves a metric or performs a math
     *   expression.
     *
     * If you specify the `Metrics` parameter, you cannot specify `MetricName` , `Dimensions` ,
     * `Period` , `Namespace` , `Statistic` , `ExtendedStatistic` , or `Unit` .
     */
    public fun metrics(metrics: IResolvable) {
        cdkBuilder.metrics(metrics)
    }

    /**
     * @param namespace The namespace of the metric associated with the alarm. This is required for
     *   an alarm based on a metric. For an alarm based on a math expression, you can't specify
     *   `Namespace` and you use `Metrics` instead.
     *
     * For a list of namespaces for metrics from AWS services, see
     * [AWS Services That Publish CloudWatch Metrics.](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
     */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    /**
     * @param okActions The actions to execute when this alarm transitions to the `OK` state from
     *   any other state. Each action is specified as an Amazon Resource Name (ARN).
     */
    public fun okActions(vararg okActions: String) {
        _okActions.addAll(listOf(*okActions))
    }

    /**
     * @param okActions The actions to execute when this alarm transitions to the `OK` state from
     *   any other state. Each action is specified as an Amazon Resource Name (ARN).
     */
    public fun okActions(okActions: Collection<String>) {
        _okActions.addAll(okActions)
    }

    /**
     * @param period The period, in seconds, over which the statistic is applied. This is required
     *   for an alarm based on a metric. Valid values are 10, 30, 60, and any multiple of 60.
     *
     * For an alarm based on a math expression, you can't specify `Period` , and instead you use the
     * `Metrics` parameter.
     *
     * *Minimum:* 10
     */
    public fun period(period: Number) {
        cdkBuilder.period(period)
    }

    /**
     * @param statistic The statistic for the metric associated with the alarm, other than
     *   percentile. For percentile statistics, use `ExtendedStatistic` . For an alarm based on a
     *   metric, you must specify either `Statistic` or `ExtendedStatistic` but not both.
     *
     * For an alarm based on a math expression, you can't specify `Statistic` . Instead, you use
     * `Metrics` .
     */
    public fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
    }

    /** @param threshold The value to compare with the specified statistic. */
    public fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
    }

    /**
     * @param thresholdMetricId In an alarm based on an anomaly detection model, this is the ID of
     *   the `ANOMALY_DETECTION_BAND` function used as the threshold for the alarm.
     */
    public fun thresholdMetricId(thresholdMetricId: String) {
        cdkBuilder.thresholdMetricId(thresholdMetricId)
    }

    /**
     * @param treatMissingData Sets how this alarm is to handle missing data points. Valid values
     *   are `breaching` , `notBreaching` , `ignore` , and `missing` . For more information, see
     *   [Configuring How CloudWatch Alarms Treat Missing Data](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarms-and-missing-data)
     *   in the *Amazon CloudWatch User Guide* .
     *
     * If you omit this parameter, the default behavior of `missing` is used.
     */
    public fun treatMissingData(treatMissingData: String) {
        cdkBuilder.treatMissingData(treatMissingData)
    }

    /**
     * @param unit The unit of the metric associated with the alarm. Specify this only if you are
     *   creating an alarm based on a single metric. Do not specify this if you are specifying a
     *   `Metrics` array.
     *
     * You can specify the following values: Seconds, Microseconds, Milliseconds, Bytes, Kilobytes,
     * Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent,
     * Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second,
     * Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, or None.
     */
    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun build(): CfnAlarmProps {
        if (_alarmActions.isNotEmpty()) cdkBuilder.alarmActions(_alarmActions)
        if (_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
        if (_insufficientDataActions.isNotEmpty())
            cdkBuilder.insufficientDataActions(_insufficientDataActions)
        if (_metrics.isNotEmpty()) cdkBuilder.metrics(_metrics)
        if (_okActions.isNotEmpty()) cdkBuilder.okActions(_okActions)
        return cdkBuilder.build()
    }
}
