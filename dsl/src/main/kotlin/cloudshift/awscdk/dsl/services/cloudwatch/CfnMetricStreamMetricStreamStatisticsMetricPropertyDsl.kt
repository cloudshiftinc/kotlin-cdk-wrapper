@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream

@CdkDslMarker
public class CfnMetricStreamMetricStreamStatisticsMetricPropertyDsl {
  private val cdkBuilder: CfnMetricStream.MetricStreamStatisticsMetricProperty.Builder =
      CfnMetricStream.MetricStreamStatisticsMetricProperty.builder()

  /**
   * @param metricName The name of the metric. 
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * @param namespace The namespace of the metric. 
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun build(): CfnMetricStream.MetricStreamStatisticsMetricProperty = cdkBuilder.build()
}
