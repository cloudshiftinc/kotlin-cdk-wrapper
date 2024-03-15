@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAlarmProps {
  public fun actionsEnabled(): Any? = unwrap(this).getActionsEnabled()

  public fun alarmActions(): List<String> = unwrap(this).getAlarmActions() ?: emptyList()

  public fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

  public fun alarmName(): String? = unwrap(this).getAlarmName()

  public fun comparisonOperator(): String

  public fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

  public fun dimensions(): Any? = unwrap(this).getDimensions()

  public fun evaluateLowSampleCountPercentile(): String? =
      unwrap(this).getEvaluateLowSampleCountPercentile()

  public fun evaluationPeriods(): Number

  public fun extendedStatistic(): String? = unwrap(this).getExtendedStatistic()

  public fun insufficientDataActions(): List<String> = unwrap(this).getInsufficientDataActions() ?:
      emptyList()

  public fun metricName(): String? = unwrap(this).getMetricName()

  public fun metrics(): Any? = unwrap(this).getMetrics()

  public fun namespace(): String? = unwrap(this).getNamespace()

  public fun okActions(): List<String> = unwrap(this).getOkActions() ?: emptyList()

  public fun period(): Number? = unwrap(this).getPeriod()

  public fun statistic(): String? = unwrap(this).getStatistic()

  public fun threshold(): Number? = unwrap(this).getThreshold()

  public fun thresholdMetricId(): String? = unwrap(this).getThresholdMetricId()

  public fun treatMissingData(): String? = unwrap(this).getTreatMissingData()

  public fun unit(): String? = unwrap(this).getUnit()

  @CdkDslMarker
  public interface Builder {
    public fun actionsEnabled(actionsEnabled: Boolean)

    public fun actionsEnabled(actionsEnabled: IResolvable)

    public fun alarmActions(alarmActions: List<String>)

    public fun alarmActions(vararg alarmActions: String)

    public fun alarmDescription(alarmDescription: String)

    public fun alarmName(alarmName: String)

    public fun comparisonOperator(comparisonOperator: String)

    public fun datapointsToAlarm(datapointsToAlarm: Number)

    public fun dimensions(dimensions: IResolvable)

    public fun dimensions(dimensions: List<Any>)

    public fun dimensions(vararg dimensions: Any)

    public fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String)

    public fun evaluationPeriods(evaluationPeriods: Number)

    public fun extendedStatistic(extendedStatistic: String)

    public fun insufficientDataActions(insufficientDataActions: List<String>)

    public fun insufficientDataActions(vararg insufficientDataActions: String)

    public fun metricName(metricName: String)

    public fun metrics(metrics: IResolvable)

    public fun metrics(metrics: List<Any>)

    public fun metrics(vararg metrics: Any)

    public fun namespace(namespace: String)

    public fun okActions(okActions: List<String>)

    public fun okActions(vararg okActions: String)

    public fun period(period: Number)

    public fun statistic(statistic: String)

    public fun threshold(threshold: Number)

    public fun thresholdMetricId(thresholdMetricId: String)

    public fun treatMissingData(treatMissingData: String)

    public fun unit(unit: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.builder()

    override fun actionsEnabled(actionsEnabled: Boolean) {
      cdkBuilder.actionsEnabled(actionsEnabled)
    }

    override fun actionsEnabled(actionsEnabled: IResolvable) {
      cdkBuilder.actionsEnabled(actionsEnabled.let(IResolvable::unwrap))
    }

    override fun alarmActions(alarmActions: List<String>) {
      cdkBuilder.alarmActions(alarmActions)
    }

    override fun alarmActions(vararg alarmActions: String): Unit =
        alarmActions(alarmActions.toList())

    override fun alarmDescription(alarmDescription: String) {
      cdkBuilder.alarmDescription(alarmDescription)
    }

    override fun alarmName(alarmName: String) {
      cdkBuilder.alarmName(alarmName)
    }

    override fun comparisonOperator(comparisonOperator: String) {
      cdkBuilder.comparisonOperator(comparisonOperator)
    }

    override fun datapointsToAlarm(datapointsToAlarm: Number) {
      cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    override fun dimensions(dimensions: IResolvable) {
      cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
    }

    override fun dimensions(dimensions: List<Any>) {
      cdkBuilder.dimensions(dimensions)
    }

    override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

    override fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String) {
      cdkBuilder.evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile)
    }

    override fun evaluationPeriods(evaluationPeriods: Number) {
      cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    override fun extendedStatistic(extendedStatistic: String) {
      cdkBuilder.extendedStatistic(extendedStatistic)
    }

    override fun insufficientDataActions(insufficientDataActions: List<String>) {
      cdkBuilder.insufficientDataActions(insufficientDataActions)
    }

    override fun insufficientDataActions(vararg insufficientDataActions: String): Unit =
        insufficientDataActions(insufficientDataActions.toList())

    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    override fun metrics(metrics: IResolvable) {
      cdkBuilder.metrics(metrics.let(IResolvable::unwrap))
    }

    override fun metrics(metrics: List<Any>) {
      cdkBuilder.metrics(metrics)
    }

    override fun metrics(vararg metrics: Any): Unit = metrics(metrics.toList())

    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    override fun okActions(okActions: List<String>) {
      cdkBuilder.okActions(okActions)
    }

    override fun okActions(vararg okActions: String): Unit = okActions(okActions.toList())

    override fun period(period: Number) {
      cdkBuilder.period(period)
    }

    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    override fun threshold(threshold: Number) {
      cdkBuilder.threshold(threshold)
    }

    override fun thresholdMetricId(thresholdMetricId: String) {
      cdkBuilder.thresholdMetricId(thresholdMetricId)
    }

    override fun treatMissingData(treatMissingData: String) {
      cdkBuilder.treatMissingData(treatMissingData)
    }

    override fun unit(unit: String) {
      cdkBuilder.unit(unit)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnAlarmProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarmProps,
  ) : CdkObject(cdkObject), CfnAlarmProps {
    override fun actionsEnabled(): Any? = unwrap(this).getActionsEnabled()

    override fun alarmActions(): List<String> = unwrap(this).getAlarmActions() ?: emptyList()

    override fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

    override fun alarmName(): String? = unwrap(this).getAlarmName()

    override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

    override fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

    override fun dimensions(): Any? = unwrap(this).getDimensions()

    override fun evaluateLowSampleCountPercentile(): String? =
        unwrap(this).getEvaluateLowSampleCountPercentile()

    override fun evaluationPeriods(): Number = unwrap(this).getEvaluationPeriods()

    override fun extendedStatistic(): String? = unwrap(this).getExtendedStatistic()

    override fun insufficientDataActions(): List<String> = unwrap(this).getInsufficientDataActions()
        ?: emptyList()

    override fun metricName(): String? = unwrap(this).getMetricName()

    override fun metrics(): Any? = unwrap(this).getMetrics()

    override fun namespace(): String? = unwrap(this).getNamespace()

    override fun okActions(): List<String> = unwrap(this).getOkActions() ?: emptyList()

    override fun period(): Number? = unwrap(this).getPeriod()

    override fun statistic(): String? = unwrap(this).getStatistic()

    override fun threshold(): Number? = unwrap(this).getThreshold()

    override fun thresholdMetricId(): String? = unwrap(this).getThresholdMetricId()

    override fun treatMissingData(): String? = unwrap(this).getTreatMissingData()

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
