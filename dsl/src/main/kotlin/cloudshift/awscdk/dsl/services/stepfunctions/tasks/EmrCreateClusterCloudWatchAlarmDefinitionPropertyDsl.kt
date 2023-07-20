@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterCloudWatchAlarmDefinitionPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.CloudWatchAlarmDefinitionProperty.Builder =
      EmrCreateCluster.CloudWatchAlarmDefinitionProperty.builder()

  private val _dimensions: MutableList<EmrCreateCluster.MetricDimensionProperty> = mutableListOf()

  public
      fun comparisonOperator(comparisonOperator: EmrCreateCluster.CloudWatchAlarmComparisonOperator) {
    cdkBuilder.comparisonOperator(comparisonOperator)
  }

  public fun dimensions(dimensions: EmrCreateClusterMetricDimensionPropertyDsl.() -> Unit) {
    _dimensions.add(EmrCreateClusterMetricDimensionPropertyDsl().apply(dimensions).build())
  }

  public fun dimensions(dimensions: Collection<EmrCreateCluster.MetricDimensionProperty>) {
    _dimensions.addAll(dimensions)
  }

  public fun evaluationPeriods(evaluationPeriods: Number) {
    cdkBuilder.evaluationPeriods(evaluationPeriods)
  }

  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun period(period: Duration) {
    cdkBuilder.period(period)
  }

  public fun statistic(statistic: EmrCreateCluster.CloudWatchAlarmStatistic) {
    cdkBuilder.statistic(statistic)
  }

  public fun threshold(threshold: Number) {
    cdkBuilder.threshold(threshold)
  }

  public fun unit(unit: EmrCreateCluster.CloudWatchAlarmUnit) {
    cdkBuilder.unit(unit)
  }

  public fun build(): EmrCreateCluster.CloudWatchAlarmDefinitionProperty {
    if(_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
    return cdkBuilder.build()
  }
}
