@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for Alarms.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * Alias alias;
 * // or add alarms to an existing group
 * Alias blueGreenAlias;
 * Alarm alarm = Alarm.Builder.create(this, "Errors")
 * .comparisonOperator(ComparisonOperator.GREATER_THAN_THRESHOLD)
 * .threshold(1)
 * .evaluationPeriods(1)
 * .metric(alias.metricErrors())
 * .build();
 * LambdaDeploymentGroup deploymentGroup = LambdaDeploymentGroup.Builder.create(this,
 * "BlueGreenDeployment")
 * .alias(alias)
 * .deploymentConfig(LambdaDeploymentConfig.LINEAR_10PERCENT_EVERY_1MINUTE)
 * .alarms(List.of(alarm))
 * .build();
 * deploymentGroup.addAlarm(Alarm.Builder.create(this, "BlueGreenErrors")
 * .comparisonOperator(ComparisonOperator.GREATER_THAN_THRESHOLD)
 * .threshold(1)
 * .evaluationPeriods(1)
 * .metric(blueGreenAlias.metricErrors())
 * .build());
 * ```
 */
public interface AlarmProps : CreateAlarmOptions {
  /**
   * The metric to add the alarm on.
   *
   * Metric objects can be obtained from most resources, or you can construct
   * custom Metric objects by instantiating one.
   */
  public fun metric(): IMetric

  /**
   * A builder for [AlarmProps]
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
     * @param comparisonOperator Comparison to use to check if metric is breaching.
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
     * @param threshold The value against which the specified statistic is compared. 
     */
    public fun threshold(threshold: Number)

    /**
     * @param treatMissingData Sets how this alarm is to handle missing data points.
     */
    public fun treatMissingData(treatMissingData: TreatMissingData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder =
        software.amazon.awscdk.services.cloudwatch.AlarmProps.builder()

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
     * @param comparisonOperator Comparison to use to check if metric is breaching.
     */
    override fun comparisonOperator(comparisonOperator: ComparisonOperator) {
      cdkBuilder.comparisonOperator(comparisonOperator.let(ComparisonOperator::unwrap))
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
      cdkBuilder.metric(metric.let(IMetric::unwrap))
    }

    /**
     * @param threshold The value against which the specified statistic is compared. 
     */
    override fun threshold(threshold: Number) {
      cdkBuilder.threshold(threshold)
    }

    /**
     * @param treatMissingData Sets how this alarm is to handle missing data points.
     */
    override fun treatMissingData(treatMissingData: TreatMissingData) {
      cdkBuilder.treatMissingData(treatMissingData.let(TreatMissingData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.AlarmProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmProps,
  ) : CdkObject(cdkObject), AlarmProps {
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
     * Comparison to use to check if metric is breaching.
     *
     * Default: GreaterThanOrEqualToThreshold
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
     * The value against which the specified statistic is compared.
     */
    override fun threshold(): Number = unwrap(this).getThreshold()

    /**
     * Sets how this alarm is to handle missing data points.
     *
     * Default: TreatMissingData.Missing
     */
    override fun treatMissingData(): TreatMissingData? =
        unwrap(this).getTreatMissingData()?.let(TreatMissingData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AlarmProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmProps): AlarmProps
        = CdkObjectWrappers.wrap(cdkObject) as AlarmProps

    internal fun unwrap(wrapped: AlarmProps): software.amazon.awscdk.services.cloudwatch.AlarmProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.AlarmProps
  }
}
