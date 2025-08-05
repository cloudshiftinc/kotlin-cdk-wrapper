@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for Anomaly Detection Alarms.
 *
 * Example:
 *
 * ```
 * // Create a metric
 * Metric metric = Metric.Builder.create()
 * .namespace("AWS/EC2")
 * .metricName("CPUUtilization")
 * .statistic("Average")
 * .period(Duration.minutes(5))
 * .build();
 * // Create an anomaly detection alarm
 * AnomalyDetectionAlarm alarm = AnomalyDetectionAlarm.Builder.create(this, "AnomalyAlarm")
 * .metric(metric)
 * .evaluationPeriods(1)
 * // Number of standard deviations for the band (default: 2)
 * .stdDevs(2)
 * // Alarm outside on either side of the band, or just below or above it (default: outside)
 * .comparisonOperator(ComparisonOperator.LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD)
 * .alarmDescription("Alarm when metric is outside the expected band")
 * .build();
 * ```
 */
public interface AnomalyDetectionAlarmProps {
  /**
   * Whether the actions for this alarm are enabled.
   *
   * Default: true
   */
  public fun actionsEnabled(): Boolean? = unwrap(this).getActionsEnabled()

  /**
   * Description for the alarm.
   *
   * Default: No description
   */
  public fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

  /**
   * Name of the alarm.
   *
   * Default: Automatically generated name
   */
  public fun alarmName(): String? = unwrap(this).getAlarmName()

  /**
   * Comparison operator to use to check if metric is breaching.
   *
   * Must be one of the anomaly detection operators:
   *
   * * LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD
   * * GREATER_THAN_UPPER_THRESHOLD
   * * LESS_THAN_LOWER_THRESHOLD
   *
   * Default: LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD
   */
  public fun comparisonOperator(): ComparisonOperator? =
      unwrap(this).getComparisonOperator()?.let(ComparisonOperator::wrap)

  /**
   * The number of datapoints that must be breaching to trigger the alarm.
   *
   * This is used only if you are setting an "M
   * out of N" alarm. In that case, this value is the M. For more information, see Evaluating an
   * Alarm in the Amazon
   * CloudWatch User Guide.
   *
   * Default: ``evaluationPeriods``
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation)
   */
  public fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

  /**
   * Specifies whether to evaluate the data and potentially change the alarm state if there are too
   * few data points to be statistically significant.
   *
   * Used only for alarms that are based on percentiles.
   *
   * Default: - Not configured.
   */
  public fun evaluateLowSampleCountPercentile(): String? =
      unwrap(this).getEvaluateLowSampleCountPercentile()

  /**
   * The number of periods over which data is compared to the specified threshold.
   */
  public fun evaluationPeriods(): Number

  /**
   * The metric to add the alarm on.
   *
   * Metric objects can be obtained from most resources, or you can construct
   * custom Metric objects by instantiating one.
   */
  public fun metric(): IMetric

  /**
   * (deprecated) The period over which the specified statistic is applied.
   *
   * Cannot be used with `MathExpression` objects.
   *
   * Default: - The period from the metric
   *
   * @deprecated Use `metric.with({ period: ... })` to encode the period into the Metric object
   */
  @Deprecated(message = "deprecated in CDK")
  public fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

  /**
   * (deprecated) What function to use for aggregating.
   *
   * Can be one of the following:
   *
   * * "Minimum" | "min"
   * * "Maximum" | "max"
   * * "Average" | "avg"
   * * "Sum" | "sum"
   * * "SampleCount | "n"
   * * "pNN.NN"
   *
   * Cannot be used with `MathExpression` objects.
   *
   * Default: - The statistic from the metric
   *
   * @deprecated Use `metric.with({ statistic: ... })` to encode the period into the Metric object
   */
  @Deprecated(message = "deprecated in CDK")
  public fun statistic(): String? = unwrap(this).getStatistic()

  /**
   * The number of standard deviations to use for the anomaly detection band.
   *
   * The higher the value, the wider the band.
   *
   * * Must be greater than 0. A value of 0 or negative values would not make sense in the context
   * of calculating standard deviations.
   * * There is no strict maximum value defined, as standard deviations can theoretically extend
   * infinitely. However, in practice, values beyond 5 or 6 standard deviations are rarely used, as
   * they would result in an extremely wide anomaly detection band, potentially missing significant
   * anomalies.
   *
   * Default: 2
   */
  public fun stdDevs(): Number? = unwrap(this).getStdDevs()

  /**
   * Sets how this alarm is to handle missing data points.
   *
   * Default: TreatMissingData.Missing
   */
  public fun treatMissingData(): TreatMissingData? =
      unwrap(this).getTreatMissingData()?.let(TreatMissingData::wrap)

  /**
   * A builder for [AnomalyDetectionAlarmProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionsEnabled Whether the actions for this alarm are enabled.
     */
    public fun actionsEnabled(actionsEnabled: Boolean)

    /**
     * @param alarmDescription Description for the alarm.
     */
    public fun alarmDescription(alarmDescription: String)

    /**
     * @param alarmName Name of the alarm.
     */
    public fun alarmName(alarmName: String)

    /**
     * @param comparisonOperator Comparison operator to use to check if metric is breaching.
     * Must be one of the anomaly detection operators:
     *
     * * LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD
     * * GREATER_THAN_UPPER_THRESHOLD
     * * LESS_THAN_LOWER_THRESHOLD
     */
    public fun comparisonOperator(comparisonOperator: ComparisonOperator)

    /**
     * @param datapointsToAlarm The number of datapoints that must be breaching to trigger the
     * alarm.
     * This is used only if you are setting an "M
     * out of N" alarm. In that case, this value is the M. For more information, see Evaluating an
     * Alarm in the Amazon
     * CloudWatch User Guide.
     */
    public fun datapointsToAlarm(datapointsToAlarm: Number)

    /**
     * @param evaluateLowSampleCountPercentile Specifies whether to evaluate the data and
     * potentially change the alarm state if there are too few data points to be statistically
     * significant.
     * Used only for alarms that are based on percentiles.
     */
    public fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String)

    /**
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     * threshold. 
     */
    public fun evaluationPeriods(evaluationPeriods: Number)

    /**
     * @param metric The metric to add the alarm on. 
     * Metric objects can be obtained from most resources, or you can construct
     * custom Metric objects by instantiating one.
     */
    public fun metric(metric: IMetric)

    /**
     * @param period The period over which the specified statistic is applied.
     * Cannot be used with `MathExpression` objects.
     * @deprecated Use `metric.with({ period: ... })` to encode the period into the Metric object
     */
    @Deprecated(message = "deprecated in CDK")
    public fun period(period: Duration)

    /**
     * @param statistic What function to use for aggregating.
     * Can be one of the following:
     *
     * * "Minimum" | "min"
     * * "Maximum" | "max"
     * * "Average" | "avg"
     * * "Sum" | "sum"
     * * "SampleCount | "n"
     * * "pNN.NN"
     *
     * Cannot be used with `MathExpression` objects.
     * @deprecated Use `metric.with({ statistic: ... })` to encode the period into the Metric object
     */
    @Deprecated(message = "deprecated in CDK")
    public fun statistic(statistic: String)

    /**
     * @param stdDevs The number of standard deviations to use for the anomaly detection band.
     * The higher the value, the wider the band.
     *
     * * Must be greater than 0. A value of 0 or negative values would not make sense in the context
     * of calculating standard deviations.
     * * There is no strict maximum value defined, as standard deviations can theoretically extend
     * infinitely. However, in practice, values beyond 5 or 6 standard deviations are rarely used, as
     * they would result in an extremely wide anomaly detection band, potentially missing significant
     * anomalies.
     */
    public fun stdDevs(stdDevs: Number)

    /**
     * @param treatMissingData Sets how this alarm is to handle missing data points.
     */
    public fun treatMissingData(treatMissingData: TreatMissingData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarmProps.Builder =
        software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarmProps.builder()

    /**
     * @param actionsEnabled Whether the actions for this alarm are enabled.
     */
    override fun actionsEnabled(actionsEnabled: Boolean) {
      cdkBuilder.actionsEnabled(actionsEnabled)
    }

    /**
     * @param alarmDescription Description for the alarm.
     */
    override fun alarmDescription(alarmDescription: String) {
      cdkBuilder.alarmDescription(alarmDescription)
    }

    /**
     * @param alarmName Name of the alarm.
     */
    override fun alarmName(alarmName: String) {
      cdkBuilder.alarmName(alarmName)
    }

    /**
     * @param comparisonOperator Comparison operator to use to check if metric is breaching.
     * Must be one of the anomaly detection operators:
     *
     * * LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD
     * * GREATER_THAN_UPPER_THRESHOLD
     * * LESS_THAN_LOWER_THRESHOLD
     */
    override fun comparisonOperator(comparisonOperator: ComparisonOperator) {
      cdkBuilder.comparisonOperator(comparisonOperator.let(ComparisonOperator.Companion::unwrap))
    }

    /**
     * @param datapointsToAlarm The number of datapoints that must be breaching to trigger the
     * alarm.
     * This is used only if you are setting an "M
     * out of N" alarm. In that case, this value is the M. For more information, see Evaluating an
     * Alarm in the Amazon
     * CloudWatch User Guide.
     */
    override fun datapointsToAlarm(datapointsToAlarm: Number) {
      cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    /**
     * @param evaluateLowSampleCountPercentile Specifies whether to evaluate the data and
     * potentially change the alarm state if there are too few data points to be statistically
     * significant.
     * Used only for alarms that are based on percentiles.
     */
    override fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String) {
      cdkBuilder.evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile)
    }

    /**
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     * threshold. 
     */
    override fun evaluationPeriods(evaluationPeriods: Number) {
      cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    /**
     * @param metric The metric to add the alarm on. 
     * Metric objects can be obtained from most resources, or you can construct
     * custom Metric objects by instantiating one.
     */
    override fun metric(metric: IMetric) {
      cdkBuilder.metric(metric.let(IMetric.Companion::unwrap))
    }

    /**
     * @param period The period over which the specified statistic is applied.
     * Cannot be used with `MathExpression` objects.
     * @deprecated Use `metric.with({ period: ... })` to encode the period into the Metric object
     */
    @Deprecated(message = "deprecated in CDK")
    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration.Companion::unwrap))
    }

    /**
     * @param statistic What function to use for aggregating.
     * Can be one of the following:
     *
     * * "Minimum" | "min"
     * * "Maximum" | "max"
     * * "Average" | "avg"
     * * "Sum" | "sum"
     * * "SampleCount | "n"
     * * "pNN.NN"
     *
     * Cannot be used with `MathExpression` objects.
     * @deprecated Use `metric.with({ statistic: ... })` to encode the period into the Metric object
     */
    @Deprecated(message = "deprecated in CDK")
    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    /**
     * @param stdDevs The number of standard deviations to use for the anomaly detection band.
     * The higher the value, the wider the band.
     *
     * * Must be greater than 0. A value of 0 or negative values would not make sense in the context
     * of calculating standard deviations.
     * * There is no strict maximum value defined, as standard deviations can theoretically extend
     * infinitely. However, in practice, values beyond 5 or 6 standard deviations are rarely used, as
     * they would result in an extremely wide anomaly detection band, potentially missing significant
     * anomalies.
     */
    override fun stdDevs(stdDevs: Number) {
      cdkBuilder.stdDevs(stdDevs)
    }

    /**
     * @param treatMissingData Sets how this alarm is to handle missing data points.
     */
    override fun treatMissingData(treatMissingData: TreatMissingData) {
      cdkBuilder.treatMissingData(treatMissingData.let(TreatMissingData.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarmProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarmProps,
  ) : CdkObject(cdkObject),
      AnomalyDetectionAlarmProps {
    /**
     * Whether the actions for this alarm are enabled.
     *
     * Default: true
     */
    override fun actionsEnabled(): Boolean? = unwrap(this).getActionsEnabled()

    /**
     * Description for the alarm.
     *
     * Default: No description
     */
    override fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

    /**
     * Name of the alarm.
     *
     * Default: Automatically generated name
     */
    override fun alarmName(): String? = unwrap(this).getAlarmName()

    /**
     * Comparison operator to use to check if metric is breaching.
     *
     * Must be one of the anomaly detection operators:
     *
     * * LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD
     * * GREATER_THAN_UPPER_THRESHOLD
     * * LESS_THAN_LOWER_THRESHOLD
     *
     * Default: LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD
     */
    override fun comparisonOperator(): ComparisonOperator? =
        unwrap(this).getComparisonOperator()?.let(ComparisonOperator::wrap)

    /**
     * The number of datapoints that must be breaching to trigger the alarm.
     *
     * This is used only if you are setting an "M
     * out of N" alarm. In that case, this value is the M. For more information, see Evaluating an
     * Alarm in the Amazon
     * CloudWatch User Guide.
     *
     * Default: ``evaluationPeriods``
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation)
     */
    override fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

    /**
     * Specifies whether to evaluate the data and potentially change the alarm state if there are
     * too few data points to be statistically significant.
     *
     * Used only for alarms that are based on percentiles.
     *
     * Default: - Not configured.
     */
    override fun evaluateLowSampleCountPercentile(): String? =
        unwrap(this).getEvaluateLowSampleCountPercentile()

    /**
     * The number of periods over which data is compared to the specified threshold.
     */
    override fun evaluationPeriods(): Number = unwrap(this).getEvaluationPeriods()

    /**
     * The metric to add the alarm on.
     *
     * Metric objects can be obtained from most resources, or you can construct
     * custom Metric objects by instantiating one.
     */
    override fun metric(): IMetric = unwrap(this).getMetric().let(IMetric::wrap)

    /**
     * (deprecated) The period over which the specified statistic is applied.
     *
     * Cannot be used with `MathExpression` objects.
     *
     * Default: - The period from the metric
     *
     * @deprecated Use `metric.with({ period: ... })` to encode the period into the Metric object
     */
    @Deprecated(message = "deprecated in CDK")
    override fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

    /**
     * (deprecated) What function to use for aggregating.
     *
     * Can be one of the following:
     *
     * * "Minimum" | "min"
     * * "Maximum" | "max"
     * * "Average" | "avg"
     * * "Sum" | "sum"
     * * "SampleCount | "n"
     * * "pNN.NN"
     *
     * Cannot be used with `MathExpression` objects.
     *
     * Default: - The statistic from the metric
     *
     * @deprecated Use `metric.with({ statistic: ... })` to encode the period into the Metric object
     */
    @Deprecated(message = "deprecated in CDK")
    override fun statistic(): String? = unwrap(this).getStatistic()

    /**
     * The number of standard deviations to use for the anomaly detection band.
     *
     * The higher the value, the wider the band.
     *
     * * Must be greater than 0. A value of 0 or negative values would not make sense in the context
     * of calculating standard deviations.
     * * There is no strict maximum value defined, as standard deviations can theoretically extend
     * infinitely. However, in practice, values beyond 5 or 6 standard deviations are rarely used, as
     * they would result in an extremely wide anomaly detection band, potentially missing significant
     * anomalies.
     *
     * Default: 2
     */
    override fun stdDevs(): Number? = unwrap(this).getStdDevs()

    /**
     * Sets how this alarm is to handle missing data points.
     *
     * Default: TreatMissingData.Missing
     */
    override fun treatMissingData(): TreatMissingData? =
        unwrap(this).getTreatMissingData()?.let(TreatMissingData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AnomalyDetectionAlarmProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarmProps):
        AnomalyDetectionAlarmProps = CdkObjectWrappers.wrap(cdkObject) as?
        AnomalyDetectionAlarmProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AnomalyDetectionAlarmProps):
        software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarmProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarmProps
  }
}
