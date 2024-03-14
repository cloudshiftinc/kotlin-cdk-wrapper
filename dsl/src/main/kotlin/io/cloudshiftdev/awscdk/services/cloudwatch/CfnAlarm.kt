package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAlarm internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarm,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Indicates whether actions should be executed during any changes to the alarm state.
   */
  public open fun actionsEnabled(): Any? = unwrap(this).getActionsEnabled()

  /**
   * Indicates whether actions should be executed during any changes to the alarm state.
   */
  public open fun actionsEnabled(`value`: Boolean) {
    unwrap(this).setActionsEnabled(`value`)
  }

  /**
   * Indicates whether actions should be executed during any changes to the alarm state.
   */
  public open fun actionsEnabled(`value`: IResolvable) {
    unwrap(this).setActionsEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * The list of actions to execute when this alarm transitions into an ALARM state from any other
   * state.
   */
  public open fun alarmActions(): List<String> = unwrap(this).getAlarmActions() ?: emptyList()

  /**
   * The list of actions to execute when this alarm transitions into an ALARM state from any other
   * state.
   */
  public open fun alarmActions(`value`: List<String>) {
    unwrap(this).setAlarmActions(`value`)
  }

  /**
   * The list of actions to execute when this alarm transitions into an ALARM state from any other
   * state.
   */
  public open fun alarmActions(vararg `value`: String): Unit = alarmActions(`value`.toList())

  /**
   * The description of the alarm.
   */
  public open fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

  /**
   * The description of the alarm.
   */
  public open fun alarmDescription(`value`: String) {
    unwrap(this).setAlarmDescription(`value`)
  }

  /**
   * The name of the alarm.
   */
  public open fun alarmName(): String? = unwrap(this).getAlarmName()

  /**
   * The name of the alarm.
   */
  public open fun alarmName(`value`: String) {
    unwrap(this).setAlarmName(`value`)
  }

  /**
   * The ARN of the CloudWatch alarm, such as
   * `arn:aws:cloudwatch:us-west-2:123456789012:alarm:myCloudWatchAlarm-CPUAlarm-UXMMZK36R55Z` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The arithmetic operation to use when comparing the specified statistic and threshold.
   */
  public open fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

  /**
   * The arithmetic operation to use when comparing the specified statistic and threshold.
   */
  public open fun comparisonOperator(`value`: String) {
    unwrap(this).setComparisonOperator(`value`)
  }

  /**
   * The number of datapoints that must be breaching to trigger the alarm.
   */
  public open fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

  /**
   * The number of datapoints that must be breaching to trigger the alarm.
   */
  public open fun datapointsToAlarm(`value`: Number) {
    unwrap(this).setDatapointsToAlarm(`value`)
  }

  /**
   * The dimensions for the metric associated with the alarm.
   */
  public open fun dimensions(): Any? = unwrap(this).getDimensions()

  /**
   * The dimensions for the metric associated with the alarm.
   */
  public open fun dimensions(`value`: IResolvable) {
    unwrap(this).setDimensions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The dimensions for the metric associated with the alarm.
   */
  public open fun dimensions(__idx_ac66f0: List<Any>) {
    unwrap(this).setDimensions(__idx_ac66f0)
  }

  /**
   * The dimensions for the metric associated with the alarm.
   */
  public open fun dimensions(vararg __idx_ac66f0: Any): Unit = dimensions(__idx_ac66f0.toList())

  /**
   * Used only for alarms based on percentiles.
   */
  public open fun evaluateLowSampleCountPercentile(): String? =
      unwrap(this).getEvaluateLowSampleCountPercentile()

  /**
   * Used only for alarms based on percentiles.
   */
  public open fun evaluateLowSampleCountPercentile(`value`: String) {
    unwrap(this).setEvaluateLowSampleCountPercentile(`value`)
  }

  /**
   * The number of periods over which data is compared to the specified threshold.
   */
  public open fun evaluationPeriods(): Number = unwrap(this).getEvaluationPeriods()

  /**
   * The number of periods over which data is compared to the specified threshold.
   */
  public open fun evaluationPeriods(`value`: Number) {
    unwrap(this).setEvaluationPeriods(`value`)
  }

  /**
   * The percentile statistic for the metric associated with the alarm.
   *
   * Specify a value between p0.0 and p100.
   */
  public open fun extendedStatistic(): String? = unwrap(this).getExtendedStatistic()

  /**
   * The percentile statistic for the metric associated with the alarm.
   *
   * Specify a value between p0.0 and p100.
   */
  public open fun extendedStatistic(`value`: String) {
    unwrap(this).setExtendedStatistic(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The actions to execute when this alarm transitions to the `INSUFFICIENT_DATA` state from any
   * other state.
   */
  public open fun insufficientDataActions(): List<String> =
      unwrap(this).getInsufficientDataActions() ?: emptyList()

  /**
   * The actions to execute when this alarm transitions to the `INSUFFICIENT_DATA` state from any
   * other state.
   */
  public open fun insufficientDataActions(`value`: List<String>) {
    unwrap(this).setInsufficientDataActions(`value`)
  }

  /**
   * The actions to execute when this alarm transitions to the `INSUFFICIENT_DATA` state from any
   * other state.
   */
  public open fun insufficientDataActions(vararg `value`: String): Unit =
      insufficientDataActions(`value`.toList())

  /**
   * The name of the metric associated with the alarm.
   */
  public open fun metricName(): String? = unwrap(this).getMetricName()

  /**
   * The name of the metric associated with the alarm.
   */
  public open fun metricName(`value`: String) {
    unwrap(this).setMetricName(`value`)
  }

  /**
   * An array that enables you to create an alarm based on the result of a metric math expression.
   */
  public open fun metrics(): Any? = unwrap(this).getMetrics()

  /**
   * An array that enables you to create an alarm based on the result of a metric math expression.
   */
  public open fun metrics(`value`: IResolvable) {
    unwrap(this).setMetrics(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array that enables you to create an alarm based on the result of a metric math expression.
   */
  public open fun metrics(__idx_ac66f0: List<Any>) {
    unwrap(this).setMetrics(__idx_ac66f0)
  }

  /**
   * An array that enables you to create an alarm based on the result of a metric math expression.
   */
  public open fun metrics(vararg __idx_ac66f0: Any): Unit = metrics(__idx_ac66f0.toList())

  /**
   * The namespace of the metric associated with the alarm.
   */
  public open fun namespace(): String? = unwrap(this).getNamespace()

  /**
   * The namespace of the metric associated with the alarm.
   */
  public open fun namespace(`value`: String) {
    unwrap(this).setNamespace(`value`)
  }

  /**
   * The actions to execute when this alarm transitions to the `OK` state from any other state.
   */
  public open fun okActions(): List<String> = unwrap(this).getOkActions() ?: emptyList()

  /**
   * The actions to execute when this alarm transitions to the `OK` state from any other state.
   */
  public open fun okActions(`value`: List<String>) {
    unwrap(this).setOkActions(`value`)
  }

  /**
   * The actions to execute when this alarm transitions to the `OK` state from any other state.
   */
  public open fun okActions(vararg `value`: String): Unit = okActions(`value`.toList())

  /**
   * The period, in seconds, over which the statistic is applied.
   */
  public open fun period(): Number? = unwrap(this).getPeriod()

  /**
   * The period, in seconds, over which the statistic is applied.
   */
  public open fun period(`value`: Number) {
    unwrap(this).setPeriod(`value`)
  }

  /**
   * The statistic for the metric associated with the alarm, other than percentile.
   *
   * For percentile statistics, use `ExtendedStatistic` .
   */
  public open fun statistic(): String? = unwrap(this).getStatistic()

  /**
   * The statistic for the metric associated with the alarm, other than percentile.
   *
   * For percentile statistics, use `ExtendedStatistic` .
   */
  public open fun statistic(`value`: String) {
    unwrap(this).setStatistic(`value`)
  }

  /**
   * The value to compare with the specified statistic.
   */
  public open fun threshold(): Number? = unwrap(this).getThreshold()

  /**
   * The value to compare with the specified statistic.
   */
  public open fun threshold(`value`: Number) {
    unwrap(this).setThreshold(`value`)
  }

  /**
   * In an alarm based on an anomaly detection model, this is the ID of the `ANOMALY_DETECTION_BAND`
   * function used as the threshold for the alarm.
   */
  public open fun thresholdMetricId(): String? = unwrap(this).getThresholdMetricId()

  /**
   * In an alarm based on an anomaly detection model, this is the ID of the `ANOMALY_DETECTION_BAND`
   * function used as the threshold for the alarm.
   */
  public open fun thresholdMetricId(`value`: String) {
    unwrap(this).setThresholdMetricId(`value`)
  }

  /**
   * Sets how this alarm is to handle missing data points.
   */
  public open fun treatMissingData(): String? = unwrap(this).getTreatMissingData()

  /**
   * Sets how this alarm is to handle missing data points.
   */
  public open fun treatMissingData(`value`: String) {
    unwrap(this).setTreatMissingData(`value`)
  }

  /**
   * The unit of the metric associated with the alarm.
   */
  public open fun unit(): String? = unwrap(this).getUnit()

  /**
   * The unit of the metric associated with the alarm.
   */
  public open fun unit(`value`: String) {
    unwrap(this).setUnit(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.CfnAlarm].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether actions should be executed during any changes to the alarm state.
     *
     * The default is TRUE.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-actionsenabled)
     * @param actionsEnabled Indicates whether actions should be executed during any changes to the
     * alarm state. 
     */
    public fun actionsEnabled(actionsEnabled: Boolean)

    /**
     * Indicates whether actions should be executed during any changes to the alarm state.
     *
     * The default is TRUE.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-actionsenabled)
     * @param actionsEnabled Indicates whether actions should be executed during any changes to the
     * alarm state. 
     */
    public fun actionsEnabled(actionsEnabled: IResolvable)

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
    public fun alarmActions(alarmActions: List<String>)

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
    public fun alarmActions(vararg alarmActions: String)

    /**
     * The description of the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-alarmdescription)
     * @param alarmDescription The description of the alarm. 
     */
    public fun alarmDescription(alarmDescription: String)

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
     * @param alarmName The name of the alarm. 
     */
    public fun alarmName(alarmName: String)

    /**
     * The arithmetic operation to use when comparing the specified statistic and threshold.
     *
     * The specified statistic value is used as the first operand.
     *
     * You can specify the following values: `GreaterThanThreshold` ,
     * `GreaterThanOrEqualToThreshold` , `LessThanThreshold` , or `LessThanOrEqualToThreshold` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-comparisonoperator)
     * @param comparisonOperator The arithmetic operation to use when comparing the specified
     * statistic and threshold. 
     */
    public fun comparisonOperator(comparisonOperator: String)

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
     * @param datapointsToAlarm The number of datapoints that must be breaching to trigger the
     * alarm. 
     */
    public fun datapointsToAlarm(datapointsToAlarm: Number)

    /**
     * The dimensions for the metric associated with the alarm.
     *
     * For an alarm based on a math expression, you can't specify `Dimensions` . Instead, you use
     * `Metrics` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-dimensions)
     * @param dimensions The dimensions for the metric associated with the alarm. 
     */
    public fun dimensions(dimensions: IResolvable)

    /**
     * The dimensions for the metric associated with the alarm.
     *
     * For an alarm based on a math expression, you can't specify `Dimensions` . Instead, you use
     * `Metrics` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-dimensions)
     * @param dimensions The dimensions for the metric associated with the alarm. 
     */
    public fun dimensions(dimensions: List<Any>)

    /**
     * The dimensions for the metric associated with the alarm.
     *
     * For an alarm based on a math expression, you can't specify `Dimensions` . Instead, you use
     * `Metrics` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-dimensions)
     * @param dimensions The dimensions for the metric associated with the alarm. 
     */
    public fun dimensions(vararg dimensions: Any)

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
    public fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String)

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
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     * threshold. 
     */
    public fun evaluationPeriods(evaluationPeriods: Number)

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
     * @param extendedStatistic The percentile statistic for the metric associated with the alarm.
     * Specify a value between p0.0 and p100. 
     */
    public fun extendedStatistic(extendedStatistic: String)

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
    public fun insufficientDataActions(insufficientDataActions: List<String>)

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
    public fun insufficientDataActions(vararg insufficientDataActions: String)

    /**
     * The name of the metric associated with the alarm.
     *
     * This is required for an alarm based on a metric. For an alarm based on a math expression, you
     * use `Metrics` instead and you can't specify `MetricName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-metricname)
     * @param metricName The name of the metric associated with the alarm. 
     */
    public fun metricName(metricName: String)

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
    public fun metrics(metrics: IResolvable)

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
    public fun metrics(metrics: List<Any>)

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
    public fun metrics(vararg metrics: Any)

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
    public fun namespace(namespace: String)

    /**
     * The actions to execute when this alarm transitions to the `OK` state from any other state.
     *
     * Each action is specified as an Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-okactions)
     * @param okActions The actions to execute when this alarm transitions to the `OK` state from
     * any other state. 
     */
    public fun okActions(okActions: List<String>)

    /**
     * The actions to execute when this alarm transitions to the `OK` state from any other state.
     *
     * Each action is specified as an Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-okactions)
     * @param okActions The actions to execute when this alarm transitions to the `OK` state from
     * any other state. 
     */
    public fun okActions(vararg okActions: String)

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
     * @param period The period, in seconds, over which the statistic is applied. 
     */
    public fun period(period: Number)

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
     * @param statistic The statistic for the metric associated with the alarm, other than
     * percentile. For percentile statistics, use `ExtendedStatistic` . 
     */
    public fun statistic(statistic: String)

    /**
     * The value to compare with the specified statistic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-threshold)
     * @param threshold The value to compare with the specified statistic. 
     */
    public fun threshold(threshold: Number)

    /**
     * In an alarm based on an anomaly detection model, this is the ID of the
     * `ANOMALY_DETECTION_BAND` function used as the threshold for the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-thresholdmetricid)
     * @param thresholdMetricId In an alarm based on an anomaly detection model, this is the ID of
     * the `ANOMALY_DETECTION_BAND` function used as the threshold for the alarm. 
     */
    public fun thresholdMetricId(thresholdMetricId: String)

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
    public fun treatMissingData(treatMissingData: String)

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
     * @param unit The unit of the metric associated with the alarm. 
     */
    public fun unit(unit: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnAlarm.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnAlarm.Builder.create(scope, id)

    /**
     * Indicates whether actions should be executed during any changes to the alarm state.
     *
     * The default is TRUE.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-actionsenabled)
     * @param actionsEnabled Indicates whether actions should be executed during any changes to the
     * alarm state. 
     */
    override fun actionsEnabled(actionsEnabled: Boolean) {
      cdkBuilder.actionsEnabled(actionsEnabled)
    }

    /**
     * Indicates whether actions should be executed during any changes to the alarm state.
     *
     * The default is TRUE.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-actionsenabled)
     * @param actionsEnabled Indicates whether actions should be executed during any changes to the
     * alarm state. 
     */
    override fun actionsEnabled(actionsEnabled: IResolvable) {
      cdkBuilder.actionsEnabled(actionsEnabled.let(IResolvable::unwrap))
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
    override fun alarmActions(alarmActions: List<String>) {
      cdkBuilder.alarmActions(alarmActions)
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
    override fun alarmActions(vararg alarmActions: String): Unit =
        alarmActions(alarmActions.toList())

    /**
     * The description of the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-alarmdescription)
     * @param alarmDescription The description of the alarm. 
     */
    override fun alarmDescription(alarmDescription: String) {
      cdkBuilder.alarmDescription(alarmDescription)
    }

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
     * @param alarmName The name of the alarm. 
     */
    override fun alarmName(alarmName: String) {
      cdkBuilder.alarmName(alarmName)
    }

    /**
     * The arithmetic operation to use when comparing the specified statistic and threshold.
     *
     * The specified statistic value is used as the first operand.
     *
     * You can specify the following values: `GreaterThanThreshold` ,
     * `GreaterThanOrEqualToThreshold` , `LessThanThreshold` , or `LessThanOrEqualToThreshold` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-comparisonoperator)
     * @param comparisonOperator The arithmetic operation to use when comparing the specified
     * statistic and threshold. 
     */
    override fun comparisonOperator(comparisonOperator: String) {
      cdkBuilder.comparisonOperator(comparisonOperator)
    }

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
     * @param datapointsToAlarm The number of datapoints that must be breaching to trigger the
     * alarm. 
     */
    override fun datapointsToAlarm(datapointsToAlarm: Number) {
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
    override fun dimensions(dimensions: IResolvable) {
      cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
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
    override fun dimensions(dimensions: List<Any>) {
      cdkBuilder.dimensions(dimensions)
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
    override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

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
    override fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String) {
      cdkBuilder.evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile)
    }

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
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     * threshold. 
     */
    override fun evaluationPeriods(evaluationPeriods: Number) {
      cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

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
     * @param extendedStatistic The percentile statistic for the metric associated with the alarm.
     * Specify a value between p0.0 and p100. 
     */
    override fun extendedStatistic(extendedStatistic: String) {
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
    override fun insufficientDataActions(insufficientDataActions: List<String>) {
      cdkBuilder.insufficientDataActions(insufficientDataActions)
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
    override fun insufficientDataActions(vararg insufficientDataActions: String): Unit =
        insufficientDataActions(insufficientDataActions.toList())

    /**
     * The name of the metric associated with the alarm.
     *
     * This is required for an alarm based on a metric. For an alarm based on a math expression, you
     * use `Metrics` instead and you can't specify `MetricName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-metricname)
     * @param metricName The name of the metric associated with the alarm. 
     */
    override fun metricName(metricName: String) {
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
    override fun metrics(metrics: IResolvable) {
      cdkBuilder.metrics(metrics.let(IResolvable::unwrap))
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
    override fun metrics(metrics: List<Any>) {
      cdkBuilder.metrics(metrics)
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
    override fun metrics(vararg metrics: Any): Unit = metrics(metrics.toList())

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
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * The actions to execute when this alarm transitions to the `OK` state from any other state.
     *
     * Each action is specified as an Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-okactions)
     * @param okActions The actions to execute when this alarm transitions to the `OK` state from
     * any other state. 
     */
    override fun okActions(okActions: List<String>) {
      cdkBuilder.okActions(okActions)
    }

    /**
     * The actions to execute when this alarm transitions to the `OK` state from any other state.
     *
     * Each action is specified as an Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-okactions)
     * @param okActions The actions to execute when this alarm transitions to the `OK` state from
     * any other state. 
     */
    override fun okActions(vararg okActions: String): Unit = okActions(okActions.toList())

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
     * @param period The period, in seconds, over which the statistic is applied. 
     */
    override fun period(period: Number) {
      cdkBuilder.period(period)
    }

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
     * @param statistic The statistic for the metric associated with the alarm, other than
     * percentile. For percentile statistics, use `ExtendedStatistic` . 
     */
    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    /**
     * The value to compare with the specified statistic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-threshold)
     * @param threshold The value to compare with the specified statistic. 
     */
    override fun threshold(threshold: Number) {
      cdkBuilder.threshold(threshold)
    }

    /**
     * In an alarm based on an anomaly detection model, this is the ID of the
     * `ANOMALY_DETECTION_BAND` function used as the threshold for the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html#cfn-cloudwatch-alarm-thresholdmetricid)
     * @param thresholdMetricId In an alarm based on an anomaly detection model, this is the ID of
     * the `ANOMALY_DETECTION_BAND` function used as the threshold for the alarm. 
     */
    override fun thresholdMetricId(thresholdMetricId: String) {
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
    override fun treatMissingData(treatMissingData: String) {
      cdkBuilder.treatMissingData(treatMissingData)
    }

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
     * @param unit The unit of the metric associated with the alarm. 
     */
    override fun unit(unit: String) {
      cdkBuilder.unit(unit)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnAlarm = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAlarm {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAlarm(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarm): CfnAlarm =
        CfnAlarm(cdkObject)

    internal fun unwrap(wrapped: CfnAlarm): software.amazon.awscdk.services.cloudwatch.CfnAlarm =
        wrapped.cdkObject
  }

  public interface MetricDataQueryProperty {
    /**
     * The ID of the account where the metrics are located, if this is a cross-account alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-accountid)
     */
    public fun accountId(): String? = unwrap(this).getAccountId()

    /**
     * The math expression to be performed on the returned data, if this object is performing a math
     * expression.
     *
     * This expression can use the `Id` of the other metrics to refer to those metrics, and can also
     * use the `Id` of other expressions to use the result of those expressions. For more information
     * about metric math expressions, see [Metric Math Syntax and
     * Functions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax)
     * in the *Amazon CloudWatch User Guide* .
     *
     * Within each MetricDataQuery object, you must specify either `Expression` or `MetricStat` but
     * not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-expression)
     */
    public fun expression(): String? = unwrap(this).getExpression()

    /**
     * A short name used to tie this object to the results in the response.
     *
     * This name must be unique within a single call to `GetMetricData` . If you are performing math
     * expressions on this set of data, this name represents that data and can serve as a variable in
     * the mathematical expression. The valid characters are letters, numbers, and underscore. The
     * first character must be a lowercase letter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-id)
     */
    public fun id(): String

    /**
     * A human-readable label for this metric or expression.
     *
     * This is especially useful if this is an expression, so that you know what the value
     * represents. If the metric or expression is shown in a CloudWatch dashboard widget, the label is
     * shown. If `Label` is omitted, CloudWatch generates a default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-label)
     */
    public fun label(): String? = unwrap(this).getLabel()

    /**
     * The metric to be returned, along with statistics, period, and units.
     *
     * Use this parameter only if this object is retrieving a metric and not performing a math
     * expression on returned data.
     *
     * Within one MetricDataQuery object, you must specify either `Expression` or `MetricStat` but
     * not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-metricstat)
     */
    public fun metricStat(): Any? = unwrap(this).getMetricStat()

    /**
     * The granularity, in seconds, of the returned data points.
     *
     * For metrics with regular resolution, a period can be as short as one minute (60 seconds) and
     * must be a multiple of 60. For high-resolution metrics that are collected at intervals of less
     * than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60. High-resolution
     * metrics are those metrics stored by a `PutMetricData` operation that includes a
     * `StorageResolution of 1 second` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-period)
     */
    public fun period(): Number? = unwrap(this).getPeriod()

    /**
     * This option indicates whether to return the timestamps and raw data values of this metric.
     *
     * When you create an alarm based on a metric math expression, specify `True` for this value for
     * only the one math expression that the alarm is based on. You must specify `False` for
     * `ReturnData` for all the other metrics and expressions used in the alarm.
     *
     * This field is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-returndata)
     */
    public fun returnData(): Any? = unwrap(this).getReturnData()

    /**
     * A builder for [MetricDataQueryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accountId The ID of the account where the metrics are located, if this is a
       * cross-account alarm.
       */
      public fun accountId(accountId: String)

      /**
       * @param expression The math expression to be performed on the returned data, if this object
       * is performing a math expression.
       * This expression can use the `Id` of the other metrics to refer to those metrics, and can
       * also use the `Id` of other expressions to use the result of those expressions. For more
       * information about metric math expressions, see [Metric Math Syntax and
       * Functions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Within each MetricDataQuery object, you must specify either `Expression` or `MetricStat`
       * but not both.
       */
      public fun expression(expression: String)

      /**
       * @param id A short name used to tie this object to the results in the response. 
       * This name must be unique within a single call to `GetMetricData` . If you are performing
       * math expressions on this set of data, this name represents that data and can serve as a
       * variable in the mathematical expression. The valid characters are letters, numbers, and
       * underscore. The first character must be a lowercase letter.
       */
      public fun id(id: String)

      /**
       * @param label A human-readable label for this metric or expression.
       * This is especially useful if this is an expression, so that you know what the value
       * represents. If the metric or expression is shown in a CloudWatch dashboard widget, the label
       * is shown. If `Label` is omitted, CloudWatch generates a default.
       */
      public fun label(label: String)

      /**
       * @param metricStat The metric to be returned, along with statistics, period, and units.
       * Use this parameter only if this object is retrieving a metric and not performing a math
       * expression on returned data.
       *
       * Within one MetricDataQuery object, you must specify either `Expression` or `MetricStat` but
       * not both.
       */
      public fun metricStat(metricStat: IResolvable)

      /**
       * @param metricStat The metric to be returned, along with statistics, period, and units.
       * Use this parameter only if this object is retrieving a metric and not performing a math
       * expression on returned data.
       *
       * Within one MetricDataQuery object, you must specify either `Expression` or `MetricStat` but
       * not both.
       */
      public fun metricStat(metricStat: MetricStatProperty)

      /**
       * @param metricStat The metric to be returned, along with statistics, period, and units.
       * Use this parameter only if this object is retrieving a metric and not performing a math
       * expression on returned data.
       *
       * Within one MetricDataQuery object, you must specify either `Expression` or `MetricStat` but
       * not both.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35ff4c30a5382088d4e276f1dbe5523064d9a89a90d32bbdf22fed7a8efb9743")
      public fun metricStat(metricStat: MetricStatProperty.Builder.() -> Unit)

      /**
       * @param period The granularity, in seconds, of the returned data points.
       * For metrics with regular resolution, a period can be as short as one minute (60 seconds)
       * and must be a multiple of 60. For high-resolution metrics that are collected at intervals of
       * less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60.
       * High-resolution metrics are those metrics stored by a `PutMetricData` operation that includes
       * a `StorageResolution of 1 second` .
       */
      public fun period(period: Number)

      /**
       * @param returnData This option indicates whether to return the timestamps and raw data
       * values of this metric.
       * When you create an alarm based on a metric math expression, specify `True` for this value
       * for only the one math expression that the alarm is based on. You must specify `False` for
       * `ReturnData` for all the other metrics and expressions used in the alarm.
       *
       * This field is required.
       */
      public fun returnData(returnData: Boolean)

      /**
       * @param returnData This option indicates whether to return the timestamps and raw data
       * values of this metric.
       * When you create an alarm based on a metric math expression, specify `True` for this value
       * for only the one math expression that the alarm is based on. You must specify `False` for
       * `ReturnData` for all the other metrics and expressions used in the alarm.
       *
       * This field is required.
       */
      public fun returnData(returnData: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.Builder =
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.builder()

      /**
       * @param accountId The ID of the account where the metrics are located, if this is a
       * cross-account alarm.
       */
      override fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
      }

      /**
       * @param expression The math expression to be performed on the returned data, if this object
       * is performing a math expression.
       * This expression can use the `Id` of the other metrics to refer to those metrics, and can
       * also use the `Id` of other expressions to use the result of those expressions. For more
       * information about metric math expressions, see [Metric Math Syntax and
       * Functions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Within each MetricDataQuery object, you must specify either `Expression` or `MetricStat`
       * but not both.
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param id A short name used to tie this object to the results in the response. 
       * This name must be unique within a single call to `GetMetricData` . If you are performing
       * math expressions on this set of data, this name represents that data and can serve as a
       * variable in the mathematical expression. The valid characters are letters, numbers, and
       * underscore. The first character must be a lowercase letter.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param label A human-readable label for this metric or expression.
       * This is especially useful if this is an expression, so that you know what the value
       * represents. If the metric or expression is shown in a CloudWatch dashboard widget, the label
       * is shown. If `Label` is omitted, CloudWatch generates a default.
       */
      override fun label(label: String) {
        cdkBuilder.label(label)
      }

      /**
       * @param metricStat The metric to be returned, along with statistics, period, and units.
       * Use this parameter only if this object is retrieving a metric and not performing a math
       * expression on returned data.
       *
       * Within one MetricDataQuery object, you must specify either `Expression` or `MetricStat` but
       * not both.
       */
      override fun metricStat(metricStat: IResolvable) {
        cdkBuilder.metricStat(metricStat.let(IResolvable::unwrap))
      }

      /**
       * @param metricStat The metric to be returned, along with statistics, period, and units.
       * Use this parameter only if this object is retrieving a metric and not performing a math
       * expression on returned data.
       *
       * Within one MetricDataQuery object, you must specify either `Expression` or `MetricStat` but
       * not both.
       */
      override fun metricStat(metricStat: MetricStatProperty) {
        cdkBuilder.metricStat(metricStat.let(MetricStatProperty::unwrap))
      }

      /**
       * @param metricStat The metric to be returned, along with statistics, period, and units.
       * Use this parameter only if this object is retrieving a metric and not performing a math
       * expression on returned data.
       *
       * Within one MetricDataQuery object, you must specify either `Expression` or `MetricStat` but
       * not both.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35ff4c30a5382088d4e276f1dbe5523064d9a89a90d32bbdf22fed7a8efb9743")
      override fun metricStat(metricStat: MetricStatProperty.Builder.() -> Unit): Unit =
          metricStat(MetricStatProperty(metricStat))

      /**
       * @param period The granularity, in seconds, of the returned data points.
       * For metrics with regular resolution, a period can be as short as one minute (60 seconds)
       * and must be a multiple of 60. For high-resolution metrics that are collected at intervals of
       * less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60.
       * High-resolution metrics are those metrics stored by a `PutMetricData` operation that includes
       * a `StorageResolution of 1 second` .
       */
      override fun period(period: Number) {
        cdkBuilder.period(period)
      }

      /**
       * @param returnData This option indicates whether to return the timestamps and raw data
       * values of this metric.
       * When you create an alarm based on a metric math expression, specify `True` for this value
       * for only the one math expression that the alarm is based on. You must specify `False` for
       * `ReturnData` for all the other metrics and expressions used in the alarm.
       *
       * This field is required.
       */
      override fun returnData(returnData: Boolean) {
        cdkBuilder.returnData(returnData)
      }

      /**
       * @param returnData This option indicates whether to return the timestamps and raw data
       * values of this metric.
       * When you create an alarm based on a metric math expression, specify `True` for this value
       * for only the one math expression that the alarm is based on. You must specify `False` for
       * `ReturnData` for all the other metrics and expressions used in the alarm.
       *
       * This field is required.
       */
      override fun returnData(returnData: IResolvable) {
        cdkBuilder.returnData(returnData.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty,
    ) : CdkObject(cdkObject), MetricDataQueryProperty {
      /**
       * The ID of the account where the metrics are located, if this is a cross-account alarm.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-accountid)
       */
      override fun accountId(): String? = unwrap(this).getAccountId()

      /**
       * The math expression to be performed on the returned data, if this object is performing a
       * math expression.
       *
       * This expression can use the `Id` of the other metrics to refer to those metrics, and can
       * also use the `Id` of other expressions to use the result of those expressions. For more
       * information about metric math expressions, see [Metric Math Syntax and
       * Functions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Within each MetricDataQuery object, you must specify either `Expression` or `MetricStat`
       * but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-expression)
       */
      override fun expression(): String? = unwrap(this).getExpression()

      /**
       * A short name used to tie this object to the results in the response.
       *
       * This name must be unique within a single call to `GetMetricData` . If you are performing
       * math expressions on this set of data, this name represents that data and can serve as a
       * variable in the mathematical expression. The valid characters are letters, numbers, and
       * underscore. The first character must be a lowercase letter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * A human-readable label for this metric or expression.
       *
       * This is especially useful if this is an expression, so that you know what the value
       * represents. If the metric or expression is shown in a CloudWatch dashboard widget, the label
       * is shown. If `Label` is omitted, CloudWatch generates a default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-label)
       */
      override fun label(): String? = unwrap(this).getLabel()

      /**
       * The metric to be returned, along with statistics, period, and units.
       *
       * Use this parameter only if this object is retrieving a metric and not performing a math
       * expression on returned data.
       *
       * Within one MetricDataQuery object, you must specify either `Expression` or `MetricStat` but
       * not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-metricstat)
       */
      override fun metricStat(): Any? = unwrap(this).getMetricStat()

      /**
       * The granularity, in seconds, of the returned data points.
       *
       * For metrics with regular resolution, a period can be as short as one minute (60 seconds)
       * and must be a multiple of 60. For high-resolution metrics that are collected at intervals of
       * less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60.
       * High-resolution metrics are those metrics stored by a `PutMetricData` operation that includes
       * a `StorageResolution of 1 second` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-period)
       */
      override fun period(): Number? = unwrap(this).getPeriod()

      /**
       * This option indicates whether to return the timestamps and raw data values of this metric.
       *
       * When you create an alarm based on a metric math expression, specify `True` for this value
       * for only the one math expression that the alarm is based on. You must specify `False` for
       * `ReturnData` for all the other metrics and expressions used in the alarm.
       *
       * This field is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-returndata)
       */
      override fun returnData(): Any? = unwrap(this).getReturnData()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDataQueryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty):
          MetricDataQueryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDataQueryProperty):
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty
    }
  }

  public interface DimensionProperty {
    /**
     * The name of the dimension, from 1–255 characters in length.
     *
     * This dimension name must have been included when the metric was published.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-dimension.html#cfn-cloudwatch-alarm-dimension-name)
     */
    public fun name(): String

    /**
     * The value for the dimension, from 1–255 characters in length.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-dimension.html#cfn-cloudwatch-alarm-dimension-value)
     */
    public fun `value`(): String

    /**
     * A builder for [DimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the dimension, from 1–255 characters in length. 
       * This dimension name must have been included when the metric was published.
       */
      public fun name(name: String)

      /**
       * @param value The value for the dimension, from 1–255 characters in length. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty.Builder =
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty.builder()

      /**
       * @param name The name of the dimension, from 1–255 characters in length. 
       * This dimension name must have been included when the metric was published.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value for the dimension, from 1–255 characters in length. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty,
    ) : CdkObject(cdkObject), DimensionProperty {
      /**
       * The name of the dimension, from 1–255 characters in length.
       *
       * This dimension name must have been included when the metric was published.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-dimension.html#cfn-cloudwatch-alarm-dimension-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The value for the dimension, from 1–255 characters in length.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-dimension.html#cfn-cloudwatch-alarm-dimension-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty):
          DimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DimensionProperty):
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty
    }
  }

  public interface MetricStatProperty {
    /**
     * The metric to return, including the metric name, namespace, and dimensions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricstat.html#cfn-cloudwatch-alarm-metricstat-metric)
     */
    public fun metric(): Any

    /**
     * The granularity, in seconds, of the returned data points.
     *
     * For metrics with regular resolution, a period can be as short as one minute (60 seconds) and
     * must be a multiple of 60. For high-resolution metrics that are collected at intervals of less
     * than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60. High-resolution
     * metrics are those metrics stored by a `PutMetricData` call that includes a `StorageResolution`
     * of 1 second.
     *
     * If the `StartTime` parameter specifies a time stamp that is greater than 3 hours ago, you
     * must specify the period as follows or no data points in that time range is returned:
     *
     * * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     * * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     * * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricstat.html#cfn-cloudwatch-alarm-metricstat-period)
     */
    public fun period(): Number

    /**
     * The statistic to return.
     *
     * It can include any CloudWatch statistic or extended statistic. For a list of valid values,
     * see the table in
     * [Statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic)
     * in the *Amazon CloudWatch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricstat.html#cfn-cloudwatch-alarm-metricstat-stat)
     */
    public fun stat(): String

    /**
     * The unit to use for the returned data points.
     *
     * Valid values are: Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes,
     * Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count,
     * Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second,
     * Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second,
     * or None.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricstat.html#cfn-cloudwatch-alarm-metricstat-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * A builder for [MetricStatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metric The metric to return, including the metric name, namespace, and dimensions. 
       */
      public fun metric(metric: IResolvable)

      /**
       * @param metric The metric to return, including the metric name, namespace, and dimensions. 
       */
      public fun metric(metric: MetricProperty)

      /**
       * @param metric The metric to return, including the metric name, namespace, and dimensions. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fc27b440a87875b0db87fe50953a4e80fe02929afedc911ebb790e48307db7e")
      public fun metric(metric: MetricProperty.Builder.() -> Unit)

      /**
       * @param period The granularity, in seconds, of the returned data points. 
       * For metrics with regular resolution, a period can be as short as one minute (60 seconds)
       * and must be a multiple of 60. For high-resolution metrics that are collected at intervals of
       * less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60.
       * High-resolution metrics are those metrics stored by a `PutMetricData` call that includes a
       * `StorageResolution` of 1 second.
       *
       * If the `StartTime` parameter specifies a time stamp that is greater than 3 hours ago, you
       * must specify the period as follows or no data points in that time range is returned:
       *
       * * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
       * * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
       * * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
       */
      public fun period(period: Number)

      /**
       * @param stat The statistic to return. 
       * It can include any CloudWatch statistic or extended statistic. For a list of valid values,
       * see the table in
       * [Statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic)
       * in the *Amazon CloudWatch User Guide* .
       */
      public fun stat(stat: String)

      /**
       * @param unit The unit to use for the returned data points.
       * Valid values are: Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes,
       * Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count,
       * Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second,
       * Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second,
       * or None.
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty.Builder =
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty.builder()

      /**
       * @param metric The metric to return, including the metric name, namespace, and dimensions. 
       */
      override fun metric(metric: IResolvable) {
        cdkBuilder.metric(metric.let(IResolvable::unwrap))
      }

      /**
       * @param metric The metric to return, including the metric name, namespace, and dimensions. 
       */
      override fun metric(metric: MetricProperty) {
        cdkBuilder.metric(metric.let(MetricProperty::unwrap))
      }

      /**
       * @param metric The metric to return, including the metric name, namespace, and dimensions. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fc27b440a87875b0db87fe50953a4e80fe02929afedc911ebb790e48307db7e")
      override fun metric(metric: MetricProperty.Builder.() -> Unit): Unit =
          metric(MetricProperty(metric))

      /**
       * @param period The granularity, in seconds, of the returned data points. 
       * For metrics with regular resolution, a period can be as short as one minute (60 seconds)
       * and must be a multiple of 60. For high-resolution metrics that are collected at intervals of
       * less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60.
       * High-resolution metrics are those metrics stored by a `PutMetricData` call that includes a
       * `StorageResolution` of 1 second.
       *
       * If the `StartTime` parameter specifies a time stamp that is greater than 3 hours ago, you
       * must specify the period as follows or no data points in that time range is returned:
       *
       * * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
       * * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
       * * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
       */
      override fun period(period: Number) {
        cdkBuilder.period(period)
      }

      /**
       * @param stat The statistic to return. 
       * It can include any CloudWatch statistic or extended statistic. For a list of valid values,
       * see the table in
       * [Statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic)
       * in the *Amazon CloudWatch User Guide* .
       */
      override fun stat(stat: String) {
        cdkBuilder.stat(stat)
      }

      /**
       * @param unit The unit to use for the returned data points.
       * Valid values are: Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes,
       * Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count,
       * Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second,
       * Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second,
       * or None.
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build(): software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty,
    ) : CdkObject(cdkObject), MetricStatProperty {
      /**
       * The metric to return, including the metric name, namespace, and dimensions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricstat.html#cfn-cloudwatch-alarm-metricstat-metric)
       */
      override fun metric(): Any = unwrap(this).getMetric()

      /**
       * The granularity, in seconds, of the returned data points.
       *
       * For metrics with regular resolution, a period can be as short as one minute (60 seconds)
       * and must be a multiple of 60. For high-resolution metrics that are collected at intervals of
       * less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60.
       * High-resolution metrics are those metrics stored by a `PutMetricData` call that includes a
       * `StorageResolution` of 1 second.
       *
       * If the `StartTime` parameter specifies a time stamp that is greater than 3 hours ago, you
       * must specify the period as follows or no data points in that time range is returned:
       *
       * * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
       * * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
       * * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricstat.html#cfn-cloudwatch-alarm-metricstat-period)
       */
      override fun period(): Number = unwrap(this).getPeriod()

      /**
       * The statistic to return.
       *
       * It can include any CloudWatch statistic or extended statistic. For a list of valid values,
       * see the table in
       * [Statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic)
       * in the *Amazon CloudWatch User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricstat.html#cfn-cloudwatch-alarm-metricstat-stat)
       */
      override fun stat(): String = unwrap(this).getStat()

      /**
       * The unit to use for the returned data points.
       *
       * Valid values are: Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes,
       * Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count,
       * Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second,
       * Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second,
       * or None.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricstat.html#cfn-cloudwatch-alarm-metricstat-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricStatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty):
          MetricStatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricStatProperty):
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty
    }
  }

  public interface MetricProperty {
    /**
     * The metric dimensions that you want to be used for the metric that the alarm will watch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metric.html#cfn-cloudwatch-alarm-metric-dimensions)
     */
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    /**
     * The name of the metric that you want the alarm to watch.
     *
     * This is a required field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metric.html#cfn-cloudwatch-alarm-metric-metricname)
     */
    public fun metricName(): String? = unwrap(this).getMetricName()

    /**
     * The namespace of the metric that the alarm will watch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metric.html#cfn-cloudwatch-alarm-metric-namespace)
     */
    public fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * A builder for [MetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensions The metric dimensions that you want to be used for the metric that the
       * alarm will watch.
       */
      public fun dimensions(dimensions: IResolvable)

      /**
       * @param dimensions The metric dimensions that you want to be used for the metric that the
       * alarm will watch.
       */
      public fun dimensions(dimensions: List<Any>)

      /**
       * @param dimensions The metric dimensions that you want to be used for the metric that the
       * alarm will watch.
       */
      public fun dimensions(vararg dimensions: Any)

      /**
       * @param metricName The name of the metric that you want the alarm to watch.
       * This is a required field.
       */
      public fun metricName(metricName: String)

      /**
       * @param namespace The namespace of the metric that the alarm will watch.
       */
      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty.Builder =
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty.builder()

      /**
       * @param dimensions The metric dimensions that you want to be used for the metric that the
       * alarm will watch.
       */
      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      /**
       * @param dimensions The metric dimensions that you want to be used for the metric that the
       * alarm will watch.
       */
      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      /**
       * @param dimensions The metric dimensions that you want to be used for the metric that the
       * alarm will watch.
       */
      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      /**
       * @param metricName The name of the metric that you want the alarm to watch.
       * This is a required field.
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param namespace The namespace of the metric that the alarm will watch.
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build(): software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty,
    ) : CdkObject(cdkObject), MetricProperty {
      /**
       * The metric dimensions that you want to be used for the metric that the alarm will watch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metric.html#cfn-cloudwatch-alarm-metric-dimensions)
       */
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      /**
       * The name of the metric that you want the alarm to watch.
       *
       * This is a required field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metric.html#cfn-cloudwatch-alarm-metric-metricname)
       */
      override fun metricName(): String? = unwrap(this).getMetricName()

      /**
       * The namespace of the metric that the alarm will watch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metric.html#cfn-cloudwatch-alarm-metric-namespace)
       */
      override fun namespace(): String? = unwrap(this).getNamespace()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty):
          MetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricProperty):
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty
    }
  }
}
