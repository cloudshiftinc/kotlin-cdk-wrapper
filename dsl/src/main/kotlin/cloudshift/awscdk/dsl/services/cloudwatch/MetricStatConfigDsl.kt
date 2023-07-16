@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.Dimension
import software.amazon.awscdk.services.cloudwatch.MetricStatConfig
import kotlin.Unit as KotlinUnit
import software.amazon.awscdk.services.cloudwatch.Unit as CloudwatchUnit

@CdkDslMarker
public class MetricStatConfigDsl {
  private val cdkBuilder: MetricStatConfig.Builder = MetricStatConfig.builder()

  private val _dimensions: MutableList<Dimension> = mutableListOf()

  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  public fun dimensions(dimensions: DimensionDsl.() -> KotlinUnit) {
    _dimensions.add(DimensionDsl().apply(dimensions).build())
  }

  public fun dimensions(dimensions: Collection<Dimension>) {
    _dimensions.addAll(dimensions)
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

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun statistic(statistic: String) {
    cdkBuilder.statistic(statistic)
  }

  public fun unitFilter(unitFilter: CloudwatchUnit) {
    cdkBuilder.unitFilter(unitFilter)
  }

  public fun build(): MetricStatConfig {
    if(_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
    return cdkBuilder.build()
  }
}
