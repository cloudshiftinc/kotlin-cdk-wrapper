@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An alarm on a CloudWatch metric.
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
public open class Alarm(
  cdkObject: software.amazon.awscdk.services.cloudwatch.Alarm,
) : AlarmBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AlarmProps,
  ) :
      this(software.amazon.awscdk.services.cloudwatch.Alarm(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(AlarmProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AlarmProps.Builder.() -> Unit,
  ) : this(scope, id, AlarmProps(props)
  )

  /**
   * Trigger this action if the alarm fires.
   *
   * Typically SnsAcion or AutoScalingAction.
   *
   * @param actions 
   */
  public override fun addAlarmAction(vararg actions: IAlarmAction) {
    unwrap(this).addAlarmAction(*actions.map(IAlarmAction::unwrap).toTypedArray())
  }

  /**
   * ARN of this alarm.
   */
  public override fun alarmArn(): String = unwrap(this).getAlarmArn()

  /**
   * Name of this alarm.
   */
  public override fun alarmName(): String = unwrap(this).getAlarmName()

  /**
   * The metric object this alarm was based on.
   */
  public open fun metric(): IMetric = unwrap(this).getMetric().let(IMetric::wrap)

  /**
   * Turn this alarm into a horizontal annotation.
   *
   * This is useful if you want to represent an Alarm in a non-AlarmWidget.
   * An `AlarmWidget` can directly show an alarm, but it can only show a
   * single alarm and no other metrics. Instead, you can convert the alarm to
   * a HorizontalAnnotation and add it as an annotation to another graph.
   *
   * This might be useful if:
   *
   * * You want to show multiple alarms inside a single graph, for example if
   * you have both a "small margin/long period" alarm as well as a
   * "large margin/short period" alarm.
   * * You want to show an Alarm line in a graph with multiple metrics in it.
   */
  public open fun toAnnotation(): HorizontalAnnotation =
      unwrap(this).toAnnotation().let(HorizontalAnnotation::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.Alarm].
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
     * Comparison to use to check if metric is breaching.
     *
     * Default: GreaterThanOrEqualToThreshold
     *
     * @param comparisonOperator Comparison to use to check if metric is breaching. 
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
     * The value against which the specified statistic is compared.
     *
     * @param threshold The value against which the specified statistic is compared. 
     */
    public fun threshold(threshold: Number)

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
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.Alarm.Builder =
        software.amazon.awscdk.services.cloudwatch.Alarm.Builder.create(scope, id)

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
     * Comparison to use to check if metric is breaching.
     *
     * Default: GreaterThanOrEqualToThreshold
     *
     * @param comparisonOperator Comparison to use to check if metric is breaching. 
     */
    override fun comparisonOperator(comparisonOperator: ComparisonOperator) {
      cdkBuilder.comparisonOperator(comparisonOperator.let(ComparisonOperator::unwrap))
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
      cdkBuilder.metric(metric.let(IMetric::unwrap))
    }

    /**
     * The value against which the specified statistic is compared.
     *
     * @param threshold The value against which the specified statistic is compared. 
     */
    override fun threshold(threshold: Number) {
      cdkBuilder.threshold(threshold)
    }

    /**
     * Sets how this alarm is to handle missing data points.
     *
     * Default: TreatMissingData.Missing
     *
     * @param treatMissingData Sets how this alarm is to handle missing data points. 
     */
    override fun treatMissingData(treatMissingData: TreatMissingData) {
      cdkBuilder.treatMissingData(treatMissingData.let(TreatMissingData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.Alarm = cdkBuilder.build()
  }

  public companion object {
    public fun fromAlarmArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      alarmArn: String,
    ): IAlarm =
        software.amazon.awscdk.services.cloudwatch.Alarm.fromAlarmArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, alarmArn).let(IAlarm::wrap)

    public fun fromAlarmName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      alarmName: String,
    ): IAlarm =
        software.amazon.awscdk.services.cloudwatch.Alarm.fromAlarmName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, alarmName).let(IAlarm::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Alarm {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Alarm(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Alarm): Alarm =
        Alarm(cdkObject)

    internal fun unwrap(wrapped: Alarm): software.amazon.awscdk.services.cloudwatch.Alarm =
        wrapped.cdkObject as software.amazon.awscdk.services.cloudwatch.Alarm
  }
}
