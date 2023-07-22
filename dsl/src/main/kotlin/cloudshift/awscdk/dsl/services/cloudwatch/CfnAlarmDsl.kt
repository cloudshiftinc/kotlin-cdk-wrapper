@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAlarm
import software.constructs.Construct

@CdkDslMarker
public class CfnAlarmDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAlarm.Builder = CfnAlarm.Builder.create(scope, id)

  private val _alarmActions: MutableList<String> = mutableListOf()

  private val _dimensions: MutableList<Any> = mutableListOf()

  private val _insufficientDataActions: MutableList<String> = mutableListOf()

  private val _metrics: MutableList<Any> = mutableListOf()

  private val _okActions: MutableList<String> = mutableListOf()

  /**
   * Indicates whether actions should be executed during any changes to the alarm state.
   *
   * The default is TRUE.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-actionsenabled)
   * @param actionsEnabled Indicates whether actions should be executed during any changes to the
   * alarm state. 
   */
  public fun actionsEnabled(actionsEnabled: Boolean) {
    cdkBuilder.actionsEnabled(actionsEnabled)
  }

  /**
   * Indicates whether actions should be executed during any changes to the alarm state.
   *
   * The default is TRUE.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-actionsenabled)
   * @param actionsEnabled Indicates whether actions should be executed during any changes to the
   * alarm state. 
   */
  public fun actionsEnabled(actionsEnabled: IResolvable) {
    cdkBuilder.actionsEnabled(actionsEnabled)
  }

  /**
   * The list of actions to execute when this alarm transitions into an ALARM state from any other
   * state.
   *
   * Specify each action as an Amazon Resource Name (ARN). For more information about creating
   * alarms and the actions that you can specify, see
   * [PutMetricAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutMetricAlarm.html)
   * in the *Amazon CloudWatch API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-alarmactions)
   * @param alarmActions The list of actions to execute when this alarm transitions into an ALARM
   * state from any other state. 
   */
  public fun alarmActions(vararg alarmActions: String) {
    _alarmActions.addAll(listOf(*alarmActions))
  }

  /**
   * The list of actions to execute when this alarm transitions into an ALARM state from any other
   * state.
   *
   * Specify each action as an Amazon Resource Name (ARN). For more information about creating
   * alarms and the actions that you can specify, see
   * [PutMetricAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutMetricAlarm.html)
   * in the *Amazon CloudWatch API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-alarmactions)
   * @param alarmActions The list of actions to execute when this alarm transitions into an ALARM
   * state from any other state. 
   */
  public fun alarmActions(alarmActions: Collection<String>) {
    _alarmActions.addAll(alarmActions)
  }

  /**
   * The description of the alarm.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-alarmdescription)
   * @param alarmDescription The description of the alarm. 
   */
  public fun alarmDescription(alarmDescription: String) {
    cdkBuilder.alarmDescription(alarmDescription)
  }

  /**
   * The name of the alarm.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the alarm name.
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-alarmname)
   * @param alarmName The name of the alarm. 
   */
  public fun alarmName(alarmName: String) {
    cdkBuilder.alarmName(alarmName)
  }

  /**
   * The arithmetic operation to use when comparing the specified statistic and threshold.
   *
   * The specified statistic value is used as the first operand.
   *
   * You can specify the following values: `GreaterThanThreshold` , `GreaterThanOrEqualToThreshold`
   * , `LessThanThreshold` , or `LessThanOrEqualToThreshold` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-comparisonoperator)
   * @param comparisonOperator The arithmetic operation to use when comparing the specified
   * statistic and threshold. 
   */
  public fun comparisonOperator(comparisonOperator: String) {
    cdkBuilder.comparisonOperator(comparisonOperator)
  }

  /**
   * The number of datapoints that must be breaching to trigger the alarm.
   *
   * This is used only if you are setting an "M out of N" alarm. In that case, this value is the M,
   * and the value that you set for `EvaluationPeriods` is the N value. For more information, see
   * [Evaluating an
   * Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation)
   * in the *Amazon CloudWatch User Guide* .
   *
   * If you omit this parameter, CloudWatch uses the same value here that you set for
   * `EvaluationPeriods` , and the alarm goes to alarm state if that many consecutive periods are
   * breaching.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-datapointstoalarm)
   * @param datapointsToAlarm The number of datapoints that must be breaching to trigger the alarm. 
   */
  public fun datapointsToAlarm(datapointsToAlarm: Number) {
    cdkBuilder.datapointsToAlarm(datapointsToAlarm)
  }

  /**
   * The dimensions for the metric associated with the alarm.
   *
   * For an alarm based on a math expression, you can't specify `Dimensions` . Instead, you use
   * `Metrics` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-dimensions)
   * @param dimensions The dimensions for the metric associated with the alarm. 
   */
  public fun dimensions(vararg dimensions: Any) {
    _dimensions.addAll(listOf(*dimensions))
  }

  /**
   * The dimensions for the metric associated with the alarm.
   *
   * For an alarm based on a math expression, you can't specify `Dimensions` . Instead, you use
   * `Metrics` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-dimensions)
   * @param dimensions The dimensions for the metric associated with the alarm. 
   */
  public fun dimensions(dimensions: Collection<Any>) {
    _dimensions.addAll(dimensions)
  }

  /**
   * The dimensions for the metric associated with the alarm.
   *
   * For an alarm based on a math expression, you can't specify `Dimensions` . Instead, you use
   * `Metrics` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-dimensions)
   * @param dimensions The dimensions for the metric associated with the alarm. 
   */
  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  /**
   * Used only for alarms based on percentiles.
   *
   * If `ignore` , the alarm state does not change during periods with too few data points to be
   * statistically significant. If `evaluate` or this parameter is not used, the alarm is always
   * evaluated and possibly changes state no matter how many data points are available.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-evaluatelowsamplecountpercentile)
   * @param evaluateLowSampleCountPercentile Used only for alarms based on percentiles. 
   */
  public fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String) {
    cdkBuilder.evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile)
  }

  /**
   * The number of periods over which data is compared to the specified threshold.
   *
   * If you are setting an alarm that requires that a number of consecutive data points be breaching
   * to trigger the alarm, this value specifies that number. If you are setting an "M out of N" alarm,
   * this value is the N, and `DatapointsToAlarm` is the M.
   *
   * For more information, see [Evaluating an
   * Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation)
   * in the *Amazon CloudWatch User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-evaluationperiods)
   * @param evaluationPeriods The number of periods over which data is compared to the specified
   * threshold. 
   */
  public fun evaluationPeriods(evaluationPeriods: Number) {
    cdkBuilder.evaluationPeriods(evaluationPeriods)
  }

  /**
   * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0
   * and p100.
   *
   * For an alarm based on a metric, you must specify either `Statistic` or `ExtendedStatistic` but
   * not both.
   *
   * For an alarm based on a math expression, you can't specify `ExtendedStatistic` . Instead, you
   * use `Metrics` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-extendedstatistic)
   * @param extendedStatistic The percentile statistic for the metric associated with the alarm.
   * Specify a value between p0.0 and p100. 
   */
  public fun extendedStatistic(extendedStatistic: String) {
    cdkBuilder.extendedStatistic(extendedStatistic)
  }

  /**
   * The actions to execute when this alarm transitions to the `INSUFFICIENT_DATA` state from any
   * other state.
   *
   * Each action is specified as an Amazon Resource Name (ARN).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-insufficientdataactions)
   * @param insufficientDataActions The actions to execute when this alarm transitions to the
   * `INSUFFICIENT_DATA` state from any other state. 
   */
  public fun insufficientDataActions(vararg insufficientDataActions: String) {
    _insufficientDataActions.addAll(listOf(*insufficientDataActions))
  }

  /**
   * The actions to execute when this alarm transitions to the `INSUFFICIENT_DATA` state from any
   * other state.
   *
   * Each action is specified as an Amazon Resource Name (ARN).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-insufficientdataactions)
   * @param insufficientDataActions The actions to execute when this alarm transitions to the
   * `INSUFFICIENT_DATA` state from any other state. 
   */
  public fun insufficientDataActions(insufficientDataActions: Collection<String>) {
    _insufficientDataActions.addAll(insufficientDataActions)
  }

  /**
   * The name of the metric associated with the alarm.
   *
   * This is required for an alarm based on a metric. For an alarm based on a math expression, you
   * use `Metrics` instead and you can't specify `MetricName` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-metricname)
   * @param metricName The name of the metric associated with the alarm. 
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * An array that enables you to create an alarm based on the result of a metric math expression.
   *
   * Each item in the array either retrieves a metric or performs a math expression.
   *
   * If you specify the `Metrics` parameter, you cannot specify `MetricName` , `Dimensions` ,
   * `Period` , `Namespace` , `Statistic` , `ExtendedStatistic` , or `Unit` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-metrics)
   * @param metrics An array that enables you to create an alarm based on the result of a metric
   * math expression. 
   */
  public fun metrics(vararg metrics: Any) {
    _metrics.addAll(listOf(*metrics))
  }

  /**
   * An array that enables you to create an alarm based on the result of a metric math expression.
   *
   * Each item in the array either retrieves a metric or performs a math expression.
   *
   * If you specify the `Metrics` parameter, you cannot specify `MetricName` , `Dimensions` ,
   * `Period` , `Namespace` , `Statistic` , `ExtendedStatistic` , or `Unit` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-metrics)
   * @param metrics An array that enables you to create an alarm based on the result of a metric
   * math expression. 
   */
  public fun metrics(metrics: Collection<Any>) {
    _metrics.addAll(metrics)
  }

  /**
   * An array that enables you to create an alarm based on the result of a metric math expression.
   *
   * Each item in the array either retrieves a metric or performs a math expression.
   *
   * If you specify the `Metrics` parameter, you cannot specify `MetricName` , `Dimensions` ,
   * `Period` , `Namespace` , `Statistic` , `ExtendedStatistic` , or `Unit` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-metrics)
   * @param metrics An array that enables you to create an alarm based on the result of a metric
   * math expression. 
   */
  public fun metrics(metrics: IResolvable) {
    cdkBuilder.metrics(metrics)
  }

  /**
   * The namespace of the metric associated with the alarm.
   *
   * This is required for an alarm based on a metric. For an alarm based on a math expression, you
   * can't specify `Namespace` and you use `Metrics` instead.
   *
   * For a list of namespaces for metrics from AWS services, see [AWS Services That Publish
   * CloudWatch
   * Metrics.](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-namespace)
   * @param namespace The namespace of the metric associated with the alarm. 
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  /**
   * The actions to execute when this alarm transitions to the `OK` state from any other state.
   *
   * Each action is specified as an Amazon Resource Name (ARN).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-okactions)
   * @param okActions The actions to execute when this alarm transitions to the `OK` state from any
   * other state. 
   */
  public fun okActions(vararg okActions: String) {
    _okActions.addAll(listOf(*okActions))
  }

  /**
   * The actions to execute when this alarm transitions to the `OK` state from any other state.
   *
   * Each action is specified as an Amazon Resource Name (ARN).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-okactions)
   * @param okActions The actions to execute when this alarm transitions to the `OK` state from any
   * other state. 
   */
  public fun okActions(okActions: Collection<String>) {
    _okActions.addAll(okActions)
  }

  /**
   * The period, in seconds, over which the statistic is applied.
   *
   * This is required for an alarm based on a metric. Valid values are 10, 30, 60, and any multiple
   * of 60.
   *
   * For an alarm based on a math expression, you can't specify `Period` , and instead you use the
   * `Metrics` parameter.
   *
   * *Minimum:* 10
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-period)
   * @param period The period, in seconds, over which the statistic is applied. 
   */
  public fun period(period: Number) {
    cdkBuilder.period(period)
  }

  /**
   * The statistic for the metric associated with the alarm, other than percentile. For percentile
   * statistics, use `ExtendedStatistic` .
   *
   * For an alarm based on a metric, you must specify either `Statistic` or `ExtendedStatistic` but
   * not both.
   *
   * For an alarm based on a math expression, you can't specify `Statistic` . Instead, you use
   * `Metrics` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-statistic)
   * @param statistic The statistic for the metric associated with the alarm, other than percentile.
   * For percentile statistics, use `ExtendedStatistic` . 
   */
  public fun statistic(statistic: String) {
    cdkBuilder.statistic(statistic)
  }

  /**
   * The value to compare with the specified statistic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-threshold)
   * @param threshold The value to compare with the specified statistic. 
   */
  public fun threshold(threshold: Number) {
    cdkBuilder.threshold(threshold)
  }

  /**
   * In an alarm based on an anomaly detection model, this is the ID of the `ANOMALY_DETECTION_BAND`
   * function used as the threshold for the alarm.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-thresholdmetricid)
   * @param thresholdMetricId In an alarm based on an anomaly detection model, this is the ID of the
   * `ANOMALY_DETECTION_BAND` function used as the threshold for the alarm. 
   */
  public fun thresholdMetricId(thresholdMetricId: String) {
    cdkBuilder.thresholdMetricId(thresholdMetricId)
  }

  /**
   * Sets how this alarm is to handle missing data points.
   *
   * Valid values are `breaching` , `notBreaching` , `ignore` , and `missing` . For more
   * information, see [Configuring How CloudWatch Alarms Treat Missing
   * Data](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarms-and-missing-data)
   * in the *Amazon CloudWatch User Guide* .
   *
   * If you omit this parameter, the default behavior of `missing` is used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-treatmissingdata)
   * @param treatMissingData Sets how this alarm is to handle missing data points. 
   */
  public fun treatMissingData(treatMissingData: String) {
    cdkBuilder.treatMissingData(treatMissingData)
  }

  /**
   * The unit of the metric associated with the alarm.
   *
   * Specify this only if you are creating an alarm based on a single metric. Do not specify this if
   * you are specifying a `Metrics` array.
   *
   * You can specify the following values: Seconds, Microseconds, Milliseconds, Bytes, Kilobytes,
   * Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count,
   * Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
   * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, or None.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-unit)
   * @param unit The unit of the metric associated with the alarm. 
   */
  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun build(): CfnAlarm {
    if(_alarmActions.isNotEmpty()) cdkBuilder.alarmActions(_alarmActions)
    if(_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
    if(_insufficientDataActions.isNotEmpty())
        cdkBuilder.insufficientDataActions(_insufficientDataActions)
    if(_metrics.isNotEmpty()) cdkBuilder.metrics(_metrics)
    if(_okActions.isNotEmpty()) cdkBuilder.okActions(_okActions)
    return cdkBuilder.build()
  }
}
