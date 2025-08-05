@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * CloudWatch Alarm that uses anomaly detection to trigger alarms.
 *
 * This alarm type is specifically designed for use with anomaly detection operators
 * like LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD.
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
public open class AnomalyDetectionAlarm(
  cdkObject: software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarm,
) : Alarm(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AnomalyDetectionAlarmProps,
  ) :
      this(software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarm(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AnomalyDetectionAlarmProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AnomalyDetectionAlarmProps.Builder.() -> Unit,
  ) : this(scope, id, AnomalyDetectionAlarmProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.AnomalyDetectionAlarm].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether the actions for this alarm are enabled.
     *
     * Default: true
     *
     * @param actionsEnabled Whether the actions for this alarm are enabled. 
     */
    public fun actionsEnabled(actionsEnabled: Boolean)

    /**
     * Description for the alarm.
     *
     * Default: No description
     *
     * @param alarmDescription Description for the alarm. 
     */
    public fun alarmDescription(alarmDescription: String)

    /**
     * Name of the alarm.
     *
     * Default: Automatically generated name
     *
     * @param alarmName Name of the alarm. 
     */
    public fun alarmName(alarmName: String)

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
     *
     * @param comparisonOperator Comparison operator to use to check if metric is breaching. 
     */
    public fun comparisonOperator(comparisonOperator: ComparisonOperator)

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
     * @param datapointsToAlarm The number of datapoints that must be breaching to trigger the
     * alarm. 
     */
    public fun datapointsToAlarm(datapointsToAlarm: Number)

    /**
     * Specifies whether to evaluate the data and potentially change the alarm state if there are
     * too few data points to be statistically significant.
     *
     * Used only for alarms that are based on percentiles.
     *
     * Default: - Not configured.
     *
     * @param evaluateLowSampleCountPercentile Specifies whether to evaluate the data and
     * potentially change the alarm state if there are too few data points to be statistically
     * significant. 
     */
    public fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String)

    /**
     * The number of periods over which data is compared to the specified threshold.
     *
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     * threshold. 
     */
    public fun evaluationPeriods(evaluationPeriods: Number)

    /**
     * The metric to add the alarm on.
     *
     * Metric objects can be obtained from most resources, or you can construct
     * custom Metric objects by instantiating one.
     *
     * @param metric The metric to add the alarm on. 
     */
    public fun metric(metric: IMetric)

    /**
     * (deprecated) The period over which the specified statistic is applied.
     *
     * Cannot be used with `MathExpression` objects.
     *
     * Default: - The period from the metric
     *
     * @deprecated Use `metric.with({ period: ... })` to encode the period into the Metric object
     * @param period The period over which the specified statistic is applied. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun period(period: Duration)

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
     * @param statistic What function to use for aggregating. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun statistic(statistic: String)

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
     *
     * @param stdDevs The number of standard deviations to use for the anomaly detection band. 
     */
    public fun stdDevs(stdDevs: Number)

    /**
     * Sets how this alarm is to handle missing data points.
     *
     * Default: TreatMissingData.Missing
     *
     * @param treatMissingData Sets how this alarm is to handle missing data points. 
     */
    public fun treatMissingData(treatMissingData: TreatMissingData)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarm.Builder
        = software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarm.Builder.create(scope, id)

    /**
     * Whether the actions for this alarm are enabled.
     *
     * Default: true
     *
     * @param actionsEnabled Whether the actions for this alarm are enabled. 
     */
    override fun actionsEnabled(actionsEnabled: Boolean) {
      cdkBuilder.actionsEnabled(actionsEnabled)
    }

    /**
     * Description for the alarm.
     *
     * Default: No description
     *
     * @param alarmDescription Description for the alarm. 
     */
    override fun alarmDescription(alarmDescription: String) {
      cdkBuilder.alarmDescription(alarmDescription)
    }

    /**
     * Name of the alarm.
     *
     * Default: Automatically generated name
     *
     * @param alarmName Name of the alarm. 
     */
    override fun alarmName(alarmName: String) {
      cdkBuilder.alarmName(alarmName)
    }

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
     *
     * @param comparisonOperator Comparison operator to use to check if metric is breaching. 
     */
    override fun comparisonOperator(comparisonOperator: ComparisonOperator) {
      cdkBuilder.comparisonOperator(comparisonOperator.let(ComparisonOperator.Companion::unwrap))
    }

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
     * @param datapointsToAlarm The number of datapoints that must be breaching to trigger the
     * alarm. 
     */
    override fun datapointsToAlarm(datapointsToAlarm: Number) {
      cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    /**
     * Specifies whether to evaluate the data and potentially change the alarm state if there are
     * too few data points to be statistically significant.
     *
     * Used only for alarms that are based on percentiles.
     *
     * Default: - Not configured.
     *
     * @param evaluateLowSampleCountPercentile Specifies whether to evaluate the data and
     * potentially change the alarm state if there are too few data points to be statistically
     * significant. 
     */
    override fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String) {
      cdkBuilder.evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile)
    }

    /**
     * The number of periods over which data is compared to the specified threshold.
     *
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     * threshold. 
     */
    override fun evaluationPeriods(evaluationPeriods: Number) {
      cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    /**
     * The metric to add the alarm on.
     *
     * Metric objects can be obtained from most resources, or you can construct
     * custom Metric objects by instantiating one.
     *
     * @param metric The metric to add the alarm on. 
     */
    override fun metric(metric: IMetric) {
      cdkBuilder.metric(metric.let(IMetric.Companion::unwrap))
    }

    /**
     * (deprecated) The period over which the specified statistic is applied.
     *
     * Cannot be used with `MathExpression` objects.
     *
     * Default: - The period from the metric
     *
     * @deprecated Use `metric.with({ period: ... })` to encode the period into the Metric object
     * @param period The period over which the specified statistic is applied. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration.Companion::unwrap))
    }

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
     * @param statistic What function to use for aggregating. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

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
     *
     * @param stdDevs The number of standard deviations to use for the anomaly detection band. 
     */
    override fun stdDevs(stdDevs: Number) {
      cdkBuilder.stdDevs(stdDevs)
    }

    /**
     * Sets how this alarm is to handle missing data points.
     *
     * Default: TreatMissingData.Missing
     *
     * @param treatMissingData Sets how this alarm is to handle missing data points. 
     */
    override fun treatMissingData(treatMissingData: TreatMissingData) {
      cdkBuilder.treatMissingData(treatMissingData.let(TreatMissingData.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarm =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarm.PROPERTY_INJECTION_ID

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AnomalyDetectionAlarm {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AnomalyDetectionAlarm(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarm):
        AnomalyDetectionAlarm = AnomalyDetectionAlarm(cdkObject)

    internal fun unwrap(wrapped: AnomalyDetectionAlarm):
        software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarm = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarm
  }
}
