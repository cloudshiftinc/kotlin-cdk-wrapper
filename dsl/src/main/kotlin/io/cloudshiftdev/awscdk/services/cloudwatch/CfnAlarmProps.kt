package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAlarmProps {
  /**
   * Indicates whether actions should be executed during any changes to the alarm state.
   *
   * The default is TRUE.
   *
   * Default: - true
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-actionsenabled)
   */
  public fun actionsEnabled(): Any? = unwrap(this).getActionsEnabled()

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
   */
  public fun alarmActions(): List<String> = unwrap(this).getAlarmActions() ?: emptyList()

  /**
   * The description of the alarm.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-alarmdescription)
   */
  public fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

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
   */
  public fun alarmName(): String? = unwrap(this).getAlarmName()

  /**
   * The arithmetic operation to use when comparing the specified statistic and threshold.
   *
   * The specified statistic value is used as the first operand.
   *
   * You can specify the following values: `GreaterThanThreshold` , `GreaterThanOrEqualToThreshold`
   * , `LessThanThreshold` , or `LessThanOrEqualToThreshold` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-comparisonoperator)
   */
  public fun comparisonOperator(): String

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
   */
  public fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

  /**
   * The dimensions for the metric associated with the alarm.
   *
   * For an alarm based on a math expression, you can't specify `Dimensions` . Instead, you use
   * `Metrics` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-dimensions)
   */
  public fun dimensions(): Any? = unwrap(this).getDimensions()

  /**
   * Used only for alarms based on percentiles.
   *
   * If `ignore` , the alarm state does not change during periods with too few data points to be
   * statistically significant. If `evaluate` or this parameter is not used, the alarm is always
   * evaluated and possibly changes state no matter how many data points are available.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-evaluatelowsamplecountpercentile)
   */
  public fun evaluateLowSampleCountPercentile(): String? =
      unwrap(this).getEvaluateLowSampleCountPercentile()

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
   */
  public fun evaluationPeriods(): Number

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
   */
  public fun extendedStatistic(): String? = unwrap(this).getExtendedStatistic()

  /**
   * The actions to execute when this alarm transitions to the `INSUFFICIENT_DATA` state from any
   * other state.
   *
   * Each action is specified as an Amazon Resource Name (ARN).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-insufficientdataactions)
   */
  public fun insufficientDataActions(): List<String> = unwrap(this).getInsufficientDataActions() ?:
      emptyList()

  /**
   * The name of the metric associated with the alarm.
   *
   * This is required for an alarm based on a metric. For an alarm based on a math expression, you
   * use `Metrics` instead and you can't specify `MetricName` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-metricname)
   */
  public fun metricName(): String? = unwrap(this).getMetricName()

  /**
   * An array that enables you to create an alarm based on the result of a metric math expression.
   *
   * Each item in the array either retrieves a metric or performs a math expression.
   *
   * If you specify the `Metrics` parameter, you cannot specify `MetricName` , `Dimensions` ,
   * `Period` , `Namespace` , `Statistic` , `ExtendedStatistic` , or `Unit` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-metrics)
   */
  public fun metrics(): Any? = unwrap(this).getMetrics()

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
   */
  public fun namespace(): String? = unwrap(this).getNamespace()

  /**
   * The actions to execute when this alarm transitions to the `OK` state from any other state.
   *
   * Each action is specified as an Amazon Resource Name (ARN).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-okactions)
   */
  public fun okActions(): List<String> = unwrap(this).getOkActions() ?: emptyList()

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
   */
  public fun period(): Number? = unwrap(this).getPeriod()

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
   */
  public fun statistic(): String? = unwrap(this).getStatistic()

  /**
   * The value to compare with the specified statistic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-threshold)
   */
  public fun threshold(): Number? = unwrap(this).getThreshold()

  /**
   * In an alarm based on an anomaly detection model, this is the ID of the `ANOMALY_DETECTION_BAND`
   * function used as the threshold for the alarm.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-thresholdmetricid)
   */
  public fun thresholdMetricId(): String? = unwrap(this).getThresholdMetricId()

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
   */
  public fun treatMissingData(): String? = unwrap(this).getTreatMissingData()

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
   */
  public fun unit(): String? = unwrap(this).getUnit()

  /**
   * A builder for [CfnAlarmProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionsEnabled Indicates whether actions should be executed during any changes to the
     * alarm state.
     * The default is TRUE.
     */
    public fun actionsEnabled(actionsEnabled: Boolean)

    /**
     * @param actionsEnabled Indicates whether actions should be executed during any changes to the
     * alarm state.
     * The default is TRUE.
     */
    public fun actionsEnabled(actionsEnabled: IResolvable)

    /**
     * @param alarmActions The list of actions to execute when this alarm transitions into an ALARM
     * state from any other state.
     * Specify each action as an Amazon Resource Name (ARN). For more information about creating
     * alarms and the actions that you can specify, see
     * [PutMetricAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutMetricAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    public fun alarmActions(alarmActions: List<String>)

    /**
     * @param alarmActions The list of actions to execute when this alarm transitions into an ALARM
     * state from any other state.
     * Specify each action as an Amazon Resource Name (ARN). For more information about creating
     * alarms and the actions that you can specify, see
     * [PutMetricAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutMetricAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    public fun alarmActions(vararg alarmActions: String)

    /**
     * @param alarmDescription The description of the alarm.
     */
    public fun alarmDescription(alarmDescription: String)

    /**
     * @param alarmName The name of the alarm.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the alarm name.
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    public fun alarmName(alarmName: String)

    /**
     * @param comparisonOperator The arithmetic operation to use when comparing the specified
     * statistic and threshold. 
     * The specified statistic value is used as the first operand.
     *
     * You can specify the following values: `GreaterThanThreshold` ,
     * `GreaterThanOrEqualToThreshold` , `LessThanThreshold` , or `LessThanOrEqualToThreshold` .
     */
    public fun comparisonOperator(comparisonOperator: String)

    /**
     * @param datapointsToAlarm The number of datapoints that must be breaching to trigger the
     * alarm.
     * This is used only if you are setting an "M out of N" alarm. In that case, this value is the
     * M, and the value that you set for `EvaluationPeriods` is the N value. For more information, see
     * [Evaluating an
     * Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation)
     * in the *Amazon CloudWatch User Guide* .
     *
     * If you omit this parameter, CloudWatch uses the same value here that you set for
     * `EvaluationPeriods` , and the alarm goes to alarm state if that many consecutive periods are
     * breaching.
     */
    public fun datapointsToAlarm(datapointsToAlarm: Number)

    /**
     * @param dimensions The dimensions for the metric associated with the alarm.
     * For an alarm based on a math expression, you can't specify `Dimensions` . Instead, you use
     * `Metrics` .
     */
    public fun dimensions(dimensions: IResolvable)

    /**
     * @param dimensions The dimensions for the metric associated with the alarm.
     * For an alarm based on a math expression, you can't specify `Dimensions` . Instead, you use
     * `Metrics` .
     */
    public fun dimensions(dimensions: List<Any>)

    /**
     * @param dimensions The dimensions for the metric associated with the alarm.
     * For an alarm based on a math expression, you can't specify `Dimensions` . Instead, you use
     * `Metrics` .
     */
    public fun dimensions(vararg dimensions: Any)

    /**
     * @param evaluateLowSampleCountPercentile Used only for alarms based on percentiles.
     * If `ignore` , the alarm state does not change during periods with too few data points to be
     * statistically significant. If `evaluate` or this parameter is not used, the alarm is always
     * evaluated and possibly changes state no matter how many data points are available.
     */
    public fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String)

    /**
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     * threshold. 
     * If you are setting an alarm that requires that a number of consecutive data points be
     * breaching to trigger the alarm, this value specifies that number. If you are setting an "M out
     * of N" alarm, this value is the N, and `DatapointsToAlarm` is the M.
     *
     * For more information, see [Evaluating an
     * Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation)
     * in the *Amazon CloudWatch User Guide* .
     */
    public fun evaluationPeriods(evaluationPeriods: Number)

    /**
     * @param extendedStatistic The percentile statistic for the metric associated with the alarm.
     * Specify a value between p0.0 and p100.
     * For an alarm based on a metric, you must specify either `Statistic` or `ExtendedStatistic`
     * but not both.
     *
     * For an alarm based on a math expression, you can't specify `ExtendedStatistic` . Instead, you
     * use `Metrics` .
     */
    public fun extendedStatistic(extendedStatistic: String)

    /**
     * @param insufficientDataActions The actions to execute when this alarm transitions to the
     * `INSUFFICIENT_DATA` state from any other state.
     * Each action is specified as an Amazon Resource Name (ARN).
     */
    public fun insufficientDataActions(insufficientDataActions: List<String>)

    /**
     * @param insufficientDataActions The actions to execute when this alarm transitions to the
     * `INSUFFICIENT_DATA` state from any other state.
     * Each action is specified as an Amazon Resource Name (ARN).
     */
    public fun insufficientDataActions(vararg insufficientDataActions: String)

    /**
     * @param metricName The name of the metric associated with the alarm.
     * This is required for an alarm based on a metric. For an alarm based on a math expression, you
     * use `Metrics` instead and you can't specify `MetricName` .
     */
    public fun metricName(metricName: String)

    /**
     * @param metrics An array that enables you to create an alarm based on the result of a metric
     * math expression.
     * Each item in the array either retrieves a metric or performs a math expression.
     *
     * If you specify the `Metrics` parameter, you cannot specify `MetricName` , `Dimensions` ,
     * `Period` , `Namespace` , `Statistic` , `ExtendedStatistic` , or `Unit` .
     */
    public fun metrics(metrics: IResolvable)

    /**
     * @param metrics An array that enables you to create an alarm based on the result of a metric
     * math expression.
     * Each item in the array either retrieves a metric or performs a math expression.
     *
     * If you specify the `Metrics` parameter, you cannot specify `MetricName` , `Dimensions` ,
     * `Period` , `Namespace` , `Statistic` , `ExtendedStatistic` , or `Unit` .
     */
    public fun metrics(metrics: List<Any>)

    /**
     * @param metrics An array that enables you to create an alarm based on the result of a metric
     * math expression.
     * Each item in the array either retrieves a metric or performs a math expression.
     *
     * If you specify the `Metrics` parameter, you cannot specify `MetricName` , `Dimensions` ,
     * `Period` , `Namespace` , `Statistic` , `ExtendedStatistic` , or `Unit` .
     */
    public fun metrics(vararg metrics: Any)

    /**
     * @param namespace The namespace of the metric associated with the alarm.
     * This is required for an alarm based on a metric. For an alarm based on a math expression, you
     * can't specify `Namespace` and you use `Metrics` instead.
     *
     * For a list of namespaces for metrics from AWS services, see [AWS Services That Publish
     * CloudWatch
     * Metrics.](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
     */
    public fun namespace(namespace: String)

    /**
     * @param okActions The actions to execute when this alarm transitions to the `OK` state from
     * any other state.
     * Each action is specified as an Amazon Resource Name (ARN).
     */
    public fun okActions(okActions: List<String>)

    /**
     * @param okActions The actions to execute when this alarm transitions to the `OK` state from
     * any other state.
     * Each action is specified as an Amazon Resource Name (ARN).
     */
    public fun okActions(vararg okActions: String)

    /**
     * @param period The period, in seconds, over which the statistic is applied.
     * This is required for an alarm based on a metric. Valid values are 10, 30, 60, and any
     * multiple of 60.
     *
     * For an alarm based on a math expression, you can't specify `Period` , and instead you use the
     * `Metrics` parameter.
     *
     * *Minimum:* 10
     */
    public fun period(period: Number)

    /**
     * @param statistic The statistic for the metric associated with the alarm, other than
     * percentile. For percentile statistics, use `ExtendedStatistic` .
     * For an alarm based on a metric, you must specify either `Statistic` or `ExtendedStatistic`
     * but not both.
     *
     * For an alarm based on a math expression, you can't specify `Statistic` . Instead, you use
     * `Metrics` .
     */
    public fun statistic(statistic: String)

    /**
     * @param threshold The value to compare with the specified statistic.
     */
    public fun threshold(threshold: Number)

    /**
     * @param thresholdMetricId In an alarm based on an anomaly detection model, this is the ID of
     * the `ANOMALY_DETECTION_BAND` function used as the threshold for the alarm.
     */
    public fun thresholdMetricId(thresholdMetricId: String)

    /**
     * @param treatMissingData Sets how this alarm is to handle missing data points.
     * Valid values are `breaching` , `notBreaching` , `ignore` , and `missing` . For more
     * information, see [Configuring How CloudWatch Alarms Treat Missing
     * Data](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarms-and-missing-data)
     * in the *Amazon CloudWatch User Guide* .
     *
     * If you omit this parameter, the default behavior of `missing` is used.
     */
    public fun treatMissingData(treatMissingData: String)

    /**
     * @param unit The unit of the metric associated with the alarm.
     * Specify this only if you are creating an alarm based on a single metric. Do not specify this
     * if you are specifying a `Metrics` array.
     *
     * You can specify the following values: Seconds, Microseconds, Milliseconds, Bytes, Kilobytes,
     * Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count,
     * Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second,
     * Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second,
     * or None.
     */
    public fun unit(unit: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.builder()

    /**
     * @param actionsEnabled Indicates whether actions should be executed during any changes to the
     * alarm state.
     * The default is TRUE.
     */
    override fun actionsEnabled(actionsEnabled: Boolean) {
      cdkBuilder.actionsEnabled(actionsEnabled)
    }

    /**
     * @param actionsEnabled Indicates whether actions should be executed during any changes to the
     * alarm state.
     * The default is TRUE.
     */
    override fun actionsEnabled(actionsEnabled: IResolvable) {
      cdkBuilder.actionsEnabled(actionsEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param alarmActions The list of actions to execute when this alarm transitions into an ALARM
     * state from any other state.
     * Specify each action as an Amazon Resource Name (ARN). For more information about creating
     * alarms and the actions that you can specify, see
     * [PutMetricAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutMetricAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    override fun alarmActions(alarmActions: List<String>) {
      cdkBuilder.alarmActions(alarmActions)
    }

    /**
     * @param alarmActions The list of actions to execute when this alarm transitions into an ALARM
     * state from any other state.
     * Specify each action as an Amazon Resource Name (ARN). For more information about creating
     * alarms and the actions that you can specify, see
     * [PutMetricAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutMetricAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    override fun alarmActions(vararg alarmActions: String): Unit =
        alarmActions(alarmActions.toList())

    /**
     * @param alarmDescription The description of the alarm.
     */
    override fun alarmDescription(alarmDescription: String) {
      cdkBuilder.alarmDescription(alarmDescription)
    }

    /**
     * @param alarmName The name of the alarm.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the alarm name.
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    override fun alarmName(alarmName: String) {
      cdkBuilder.alarmName(alarmName)
    }

    /**
     * @param comparisonOperator The arithmetic operation to use when comparing the specified
     * statistic and threshold. 
     * The specified statistic value is used as the first operand.
     *
     * You can specify the following values: `GreaterThanThreshold` ,
     * `GreaterThanOrEqualToThreshold` , `LessThanThreshold` , or `LessThanOrEqualToThreshold` .
     */
    override fun comparisonOperator(comparisonOperator: String) {
      cdkBuilder.comparisonOperator(comparisonOperator)
    }

    /**
     * @param datapointsToAlarm The number of datapoints that must be breaching to trigger the
     * alarm.
     * This is used only if you are setting an "M out of N" alarm. In that case, this value is the
     * M, and the value that you set for `EvaluationPeriods` is the N value. For more information, see
     * [Evaluating an
     * Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation)
     * in the *Amazon CloudWatch User Guide* .
     *
     * If you omit this parameter, CloudWatch uses the same value here that you set for
     * `EvaluationPeriods` , and the alarm goes to alarm state if that many consecutive periods are
     * breaching.
     */
    override fun datapointsToAlarm(datapointsToAlarm: Number) {
      cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    /**
     * @param dimensions The dimensions for the metric associated with the alarm.
     * For an alarm based on a math expression, you can't specify `Dimensions` . Instead, you use
     * `Metrics` .
     */
    override fun dimensions(dimensions: IResolvable) {
      cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
    }

    /**
     * @param dimensions The dimensions for the metric associated with the alarm.
     * For an alarm based on a math expression, you can't specify `Dimensions` . Instead, you use
     * `Metrics` .
     */
    override fun dimensions(dimensions: List<Any>) {
      cdkBuilder.dimensions(dimensions)
    }

    /**
     * @param dimensions The dimensions for the metric associated with the alarm.
     * For an alarm based on a math expression, you can't specify `Dimensions` . Instead, you use
     * `Metrics` .
     */
    override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

    /**
     * @param evaluateLowSampleCountPercentile Used only for alarms based on percentiles.
     * If `ignore` , the alarm state does not change during periods with too few data points to be
     * statistically significant. If `evaluate` or this parameter is not used, the alarm is always
     * evaluated and possibly changes state no matter how many data points are available.
     */
    override fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String) {
      cdkBuilder.evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile)
    }

    /**
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     * threshold. 
     * If you are setting an alarm that requires that a number of consecutive data points be
     * breaching to trigger the alarm, this value specifies that number. If you are setting an "M out
     * of N" alarm, this value is the N, and `DatapointsToAlarm` is the M.
     *
     * For more information, see [Evaluating an
     * Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation)
     * in the *Amazon CloudWatch User Guide* .
     */
    override fun evaluationPeriods(evaluationPeriods: Number) {
      cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    /**
     * @param extendedStatistic The percentile statistic for the metric associated with the alarm.
     * Specify a value between p0.0 and p100.
     * For an alarm based on a metric, you must specify either `Statistic` or `ExtendedStatistic`
     * but not both.
     *
     * For an alarm based on a math expression, you can't specify `ExtendedStatistic` . Instead, you
     * use `Metrics` .
     */
    override fun extendedStatistic(extendedStatistic: String) {
      cdkBuilder.extendedStatistic(extendedStatistic)
    }

    /**
     * @param insufficientDataActions The actions to execute when this alarm transitions to the
     * `INSUFFICIENT_DATA` state from any other state.
     * Each action is specified as an Amazon Resource Name (ARN).
     */
    override fun insufficientDataActions(insufficientDataActions: List<String>) {
      cdkBuilder.insufficientDataActions(insufficientDataActions)
    }

    /**
     * @param insufficientDataActions The actions to execute when this alarm transitions to the
     * `INSUFFICIENT_DATA` state from any other state.
     * Each action is specified as an Amazon Resource Name (ARN).
     */
    override fun insufficientDataActions(vararg insufficientDataActions: String): Unit =
        insufficientDataActions(insufficientDataActions.toList())

    /**
     * @param metricName The name of the metric associated with the alarm.
     * This is required for an alarm based on a metric. For an alarm based on a math expression, you
     * use `Metrics` instead and you can't specify `MetricName` .
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * @param metrics An array that enables you to create an alarm based on the result of a metric
     * math expression.
     * Each item in the array either retrieves a metric or performs a math expression.
     *
     * If you specify the `Metrics` parameter, you cannot specify `MetricName` , `Dimensions` ,
     * `Period` , `Namespace` , `Statistic` , `ExtendedStatistic` , or `Unit` .
     */
    override fun metrics(metrics: IResolvable) {
      cdkBuilder.metrics(metrics.let(IResolvable::unwrap))
    }

    /**
     * @param metrics An array that enables you to create an alarm based on the result of a metric
     * math expression.
     * Each item in the array either retrieves a metric or performs a math expression.
     *
     * If you specify the `Metrics` parameter, you cannot specify `MetricName` , `Dimensions` ,
     * `Period` , `Namespace` , `Statistic` , `ExtendedStatistic` , or `Unit` .
     */
    override fun metrics(metrics: List<Any>) {
      cdkBuilder.metrics(metrics)
    }

    /**
     * @param metrics An array that enables you to create an alarm based on the result of a metric
     * math expression.
     * Each item in the array either retrieves a metric or performs a math expression.
     *
     * If you specify the `Metrics` parameter, you cannot specify `MetricName` , `Dimensions` ,
     * `Period` , `Namespace` , `Statistic` , `ExtendedStatistic` , or `Unit` .
     */
    override fun metrics(vararg metrics: Any): Unit = metrics(metrics.toList())

    /**
     * @param namespace The namespace of the metric associated with the alarm.
     * This is required for an alarm based on a metric. For an alarm based on a math expression, you
     * can't specify `Namespace` and you use `Metrics` instead.
     *
     * For a list of namespaces for metrics from AWS services, see [AWS Services That Publish
     * CloudWatch
     * Metrics.](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * @param okActions The actions to execute when this alarm transitions to the `OK` state from
     * any other state.
     * Each action is specified as an Amazon Resource Name (ARN).
     */
    override fun okActions(okActions: List<String>) {
      cdkBuilder.okActions(okActions)
    }

    /**
     * @param okActions The actions to execute when this alarm transitions to the `OK` state from
     * any other state.
     * Each action is specified as an Amazon Resource Name (ARN).
     */
    override fun okActions(vararg okActions: String): Unit = okActions(okActions.toList())

    /**
     * @param period The period, in seconds, over which the statistic is applied.
     * This is required for an alarm based on a metric. Valid values are 10, 30, 60, and any
     * multiple of 60.
     *
     * For an alarm based on a math expression, you can't specify `Period` , and instead you use the
     * `Metrics` parameter.
     *
     * *Minimum:* 10
     */
    override fun period(period: Number) {
      cdkBuilder.period(period)
    }

    /**
     * @param statistic The statistic for the metric associated with the alarm, other than
     * percentile. For percentile statistics, use `ExtendedStatistic` .
     * For an alarm based on a metric, you must specify either `Statistic` or `ExtendedStatistic`
     * but not both.
     *
     * For an alarm based on a math expression, you can't specify `Statistic` . Instead, you use
     * `Metrics` .
     */
    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    /**
     * @param threshold The value to compare with the specified statistic.
     */
    override fun threshold(threshold: Number) {
      cdkBuilder.threshold(threshold)
    }

    /**
     * @param thresholdMetricId In an alarm based on an anomaly detection model, this is the ID of
     * the `ANOMALY_DETECTION_BAND` function used as the threshold for the alarm.
     */
    override fun thresholdMetricId(thresholdMetricId: String) {
      cdkBuilder.thresholdMetricId(thresholdMetricId)
    }

    /**
     * @param treatMissingData Sets how this alarm is to handle missing data points.
     * Valid values are `breaching` , `notBreaching` , `ignore` , and `missing` . For more
     * information, see [Configuring How CloudWatch Alarms Treat Missing
     * Data](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarms-and-missing-data)
     * in the *Amazon CloudWatch User Guide* .
     *
     * If you omit this parameter, the default behavior of `missing` is used.
     */
    override fun treatMissingData(treatMissingData: String) {
      cdkBuilder.treatMissingData(treatMissingData)
    }

    /**
     * @param unit The unit of the metric associated with the alarm.
     * Specify this only if you are creating an alarm based on a single metric. Do not specify this
     * if you are specifying a `Metrics` array.
     *
     * You can specify the following values: Seconds, Microseconds, Milliseconds, Bytes, Kilobytes,
     * Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count,
     * Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second,
     * Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second,
     * or None.
     */
    override fun unit(unit: String) {
      cdkBuilder.unit(unit)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnAlarmProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarmProps,
  ) : CdkObject(cdkObject), CfnAlarmProps {
    /**
     * Indicates whether actions should be executed during any changes to the alarm state.
     *
     * The default is TRUE.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-actionsenabled)
     */
    override fun actionsEnabled(): Any? = unwrap(this).getActionsEnabled()

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
     */
    override fun alarmActions(): List<String> = unwrap(this).getAlarmActions() ?: emptyList()

    /**
     * The description of the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-alarmdescription)
     */
    override fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

    /**
     * The name of the alarm.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the alarm name.
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-alarmname)
     */
    override fun alarmName(): String? = unwrap(this).getAlarmName()

    /**
     * The arithmetic operation to use when comparing the specified statistic and threshold.
     *
     * The specified statistic value is used as the first operand.
     *
     * You can specify the following values: `GreaterThanThreshold` ,
     * `GreaterThanOrEqualToThreshold` , `LessThanThreshold` , or `LessThanOrEqualToThreshold` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-comparisonoperator)
     */
    override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

    /**
     * The number of datapoints that must be breaching to trigger the alarm.
     *
     * This is used only if you are setting an "M out of N" alarm. In that case, this value is the
     * M, and the value that you set for `EvaluationPeriods` is the N value. For more information, see
     * [Evaluating an
     * Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation)
     * in the *Amazon CloudWatch User Guide* .
     *
     * If you omit this parameter, CloudWatch uses the same value here that you set for
     * `EvaluationPeriods` , and the alarm goes to alarm state if that many consecutive periods are
     * breaching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-datapointstoalarm)
     */
    override fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

    /**
     * The dimensions for the metric associated with the alarm.
     *
     * For an alarm based on a math expression, you can't specify `Dimensions` . Instead, you use
     * `Metrics` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-dimensions)
     */
    override fun dimensions(): Any? = unwrap(this).getDimensions()

    /**
     * Used only for alarms based on percentiles.
     *
     * If `ignore` , the alarm state does not change during periods with too few data points to be
     * statistically significant. If `evaluate` or this parameter is not used, the alarm is always
     * evaluated and possibly changes state no matter how many data points are available.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-evaluatelowsamplecountpercentile)
     */
    override fun evaluateLowSampleCountPercentile(): String? =
        unwrap(this).getEvaluateLowSampleCountPercentile()

    /**
     * The number of periods over which data is compared to the specified threshold.
     *
     * If you are setting an alarm that requires that a number of consecutive data points be
     * breaching to trigger the alarm, this value specifies that number. If you are setting an "M out
     * of N" alarm, this value is the N, and `DatapointsToAlarm` is the M.
     *
     * For more information, see [Evaluating an
     * Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation)
     * in the *Amazon CloudWatch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-evaluationperiods)
     */
    override fun evaluationPeriods(): Number = unwrap(this).getEvaluationPeriods()

    /**
     * The percentile statistic for the metric associated with the alarm. Specify a value between
     * p0.0 and p100.
     *
     * For an alarm based on a metric, you must specify either `Statistic` or `ExtendedStatistic`
     * but not both.
     *
     * For an alarm based on a math expression, you can't specify `ExtendedStatistic` . Instead, you
     * use `Metrics` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-extendedstatistic)
     */
    override fun extendedStatistic(): String? = unwrap(this).getExtendedStatistic()

    /**
     * The actions to execute when this alarm transitions to the `INSUFFICIENT_DATA` state from any
     * other state.
     *
     * Each action is specified as an Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-insufficientdataactions)
     */
    override fun insufficientDataActions(): List<String> = unwrap(this).getInsufficientDataActions()
        ?: emptyList()

    /**
     * The name of the metric associated with the alarm.
     *
     * This is required for an alarm based on a metric. For an alarm based on a math expression, you
     * use `Metrics` instead and you can't specify `MetricName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-metricname)
     */
    override fun metricName(): String? = unwrap(this).getMetricName()

    /**
     * An array that enables you to create an alarm based on the result of a metric math expression.
     *
     * Each item in the array either retrieves a metric or performs a math expression.
     *
     * If you specify the `Metrics` parameter, you cannot specify `MetricName` , `Dimensions` ,
     * `Period` , `Namespace` , `Statistic` , `ExtendedStatistic` , or `Unit` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-metrics)
     */
    override fun metrics(): Any? = unwrap(this).getMetrics()

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
     */
    override fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * The actions to execute when this alarm transitions to the `OK` state from any other state.
     *
     * Each action is specified as an Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-okactions)
     */
    override fun okActions(): List<String> = unwrap(this).getOkActions() ?: emptyList()

    /**
     * The period, in seconds, over which the statistic is applied.
     *
     * This is required for an alarm based on a metric. Valid values are 10, 30, 60, and any
     * multiple of 60.
     *
     * For an alarm based on a math expression, you can't specify `Period` , and instead you use the
     * `Metrics` parameter.
     *
     * *Minimum:* 10
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-period)
     */
    override fun period(): Number? = unwrap(this).getPeriod()

    /**
     * The statistic for the metric associated with the alarm, other than percentile. For percentile
     * statistics, use `ExtendedStatistic` .
     *
     * For an alarm based on a metric, you must specify either `Statistic` or `ExtendedStatistic`
     * but not both.
     *
     * For an alarm based on a math expression, you can't specify `Statistic` . Instead, you use
     * `Metrics` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-statistic)
     */
    override fun statistic(): String? = unwrap(this).getStatistic()

    /**
     * The value to compare with the specified statistic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-threshold)
     */
    override fun threshold(): Number? = unwrap(this).getThreshold()

    /**
     * In an alarm based on an anomaly detection model, this is the ID of the
     * `ANOMALY_DETECTION_BAND` function used as the threshold for the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-thresholdmetricid)
     */
    override fun thresholdMetricId(): String? = unwrap(this).getThresholdMetricId()

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
     */
    override fun treatMissingData(): String? = unwrap(this).getTreatMissingData()

    /**
     * The unit of the metric associated with the alarm.
     *
     * Specify this only if you are creating an alarm based on a single metric. Do not specify this
     * if you are specifying a `Metrics` array.
     *
     * You can specify the following values: Seconds, Microseconds, Milliseconds, Bytes, Kilobytes,
     * Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count,
     * Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second,
     * Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second,
     * or None.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-unit)
     */
    override fun unit(): String? = unwrap(this).getUnit()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAlarmProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarmProps):
        CfnAlarmProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAlarmProps):
        software.amazon.awscdk.services.cloudwatch.CfnAlarmProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudwatch.CfnAlarmProps
  }
}
