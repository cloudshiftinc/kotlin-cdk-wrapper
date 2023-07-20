@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.MetricProps
import software.amazon.awscdk.services.cloudwatch.Unit

@CdkDslMarker
public class MetricPropsDsl {
  private val cdkBuilder: MetricProps.Builder = MetricProps.builder()

  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun dimensionsMap(dimensionsMap: Map<String, String>) {
    cdkBuilder.dimensionsMap(dimensionsMap)
  }

  public fun label(label: String) {
    cdkBuilder.label(label)
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

  public fun unit(unit: Unit) {
    cdkBuilder.unit(unit)
  }

  public fun build(): MetricProps = cdkBuilder.build()
}
