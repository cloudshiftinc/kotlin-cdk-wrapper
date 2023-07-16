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

  public fun actionsEnabled(actionsEnabled: Boolean) {
    cdkBuilder.actionsEnabled(actionsEnabled)
  }

  public fun actionsEnabled(actionsEnabled: IResolvable) {
    cdkBuilder.actionsEnabled(actionsEnabled)
  }

  public fun alarmActions(vararg alarmActions: String) {
    _alarmActions.addAll(listOf(*alarmActions))
  }

  public fun alarmActions(alarmActions: Collection<String>) {
    _alarmActions.addAll(alarmActions)
  }

  public fun alarmDescription(alarmDescription: String) {
    cdkBuilder.alarmDescription(alarmDescription)
  }

  public fun alarmName(alarmName: String) {
    cdkBuilder.alarmName(alarmName)
  }

  public fun comparisonOperator(comparisonOperator: String) {
    cdkBuilder.comparisonOperator(comparisonOperator)
  }

  public fun datapointsToAlarm(datapointsToAlarm: Number) {
    cdkBuilder.datapointsToAlarm(datapointsToAlarm)
  }

  public fun dimensions(vararg dimensions: Any) {
    _dimensions.addAll(listOf(*dimensions))
  }

  public fun dimensions(dimensions: Collection<Any>) {
    _dimensions.addAll(dimensions)
  }

  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  public fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String) {
    cdkBuilder.evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile)
  }

  public fun evaluationPeriods(evaluationPeriods: Number) {
    cdkBuilder.evaluationPeriods(evaluationPeriods)
  }

  public fun extendedStatistic(extendedStatistic: String) {
    cdkBuilder.extendedStatistic(extendedStatistic)
  }

  public fun insufficientDataActions(vararg insufficientDataActions: String) {
    _insufficientDataActions.addAll(listOf(*insufficientDataActions))
  }

  public fun insufficientDataActions(insufficientDataActions: Collection<String>) {
    _insufficientDataActions.addAll(insufficientDataActions)
  }

  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  public fun metrics(vararg metrics: Any) {
    _metrics.addAll(listOf(*metrics))
  }

  public fun metrics(metrics: Collection<Any>) {
    _metrics.addAll(metrics)
  }

  public fun metrics(metrics: IResolvable) {
    cdkBuilder.metrics(metrics)
  }

  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun okActions(vararg okActions: String) {
    _okActions.addAll(listOf(*okActions))
  }

  public fun okActions(okActions: Collection<String>) {
    _okActions.addAll(okActions)
  }

  public fun period(period: Number) {
    cdkBuilder.period(period)
  }

  public fun statistic(statistic: String) {
    cdkBuilder.statistic(statistic)
  }

  public fun threshold(threshold: Number) {
    cdkBuilder.threshold(threshold)
  }

  public fun thresholdMetricId(thresholdMetricId: String) {
    cdkBuilder.thresholdMetricId(thresholdMetricId)
  }

  public fun treatMissingData(treatMissingData: String) {
    cdkBuilder.treatMissingData(treatMissingData)
  }

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
