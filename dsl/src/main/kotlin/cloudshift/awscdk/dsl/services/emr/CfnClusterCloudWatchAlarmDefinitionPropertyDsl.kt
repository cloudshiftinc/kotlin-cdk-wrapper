@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

@CdkDslMarker
public class CfnClusterCloudWatchAlarmDefinitionPropertyDsl {
  private val cdkBuilder: CfnCluster.CloudWatchAlarmDefinitionProperty.Builder =
      CfnCluster.CloudWatchAlarmDefinitionProperty.builder()

  private val _dimensions: MutableList<Any> = mutableListOf()

  public fun comparisonOperator(comparisonOperator: String) {
    cdkBuilder.comparisonOperator(comparisonOperator)
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

  public fun evaluationPeriods(evaluationPeriods: Number) {
    cdkBuilder.evaluationPeriods(evaluationPeriods)
  }

  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
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

  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun build(): CfnCluster.CloudWatchAlarmDefinitionProperty {
    if(_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
    return cdkBuilder.build()
  }
}
