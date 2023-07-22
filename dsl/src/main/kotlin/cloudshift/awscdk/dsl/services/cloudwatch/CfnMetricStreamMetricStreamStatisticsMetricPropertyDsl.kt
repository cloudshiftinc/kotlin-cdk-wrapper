@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream

/**
 * A structure that specifies the metric name and namespace for one metric that is going to have
 * additional statistics included in the stream.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * MetricStreamStatisticsMetricProperty metricStreamStatisticsMetricProperty =
 * MetricStreamStatisticsMetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamstatisticsmetric.html)
 */
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
