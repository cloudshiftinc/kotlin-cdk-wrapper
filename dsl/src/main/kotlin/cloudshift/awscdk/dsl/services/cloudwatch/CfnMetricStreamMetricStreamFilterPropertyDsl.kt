@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream

@CdkDslMarker
public class CfnMetricStreamMetricStreamFilterPropertyDsl {
  private val cdkBuilder: CfnMetricStream.MetricStreamFilterProperty.Builder =
      CfnMetricStream.MetricStreamFilterProperty.builder()

  private val _metricNames: MutableList<String> = mutableListOf()

  public fun metricNames(vararg metricNames: String) {
    _metricNames.addAll(listOf(*metricNames))
  }

  public fun metricNames(metricNames: Collection<String>) {
    _metricNames.addAll(metricNames)
  }

  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun build(): CfnMetricStream.MetricStreamFilterProperty {
    if(_metricNames.isNotEmpty()) cdkBuilder.metricNames(_metricNames)
    return cdkBuilder.build()
  }
}
