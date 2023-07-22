@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorMetricPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.MetricProperty.Builder =
      CfnAnomalyDetector.MetricProperty.builder()

  /**
   * @param aggregationFunction The function with which the metric is calculated. 
   */
  public fun aggregationFunction(aggregationFunction: String) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  /**
   * @param metricName The name of the metric. 
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * @param namespace The namespace for the metric.
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun build(): CfnAnomalyDetector.MetricProperty = cdkBuilder.build()
}
