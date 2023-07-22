@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@CdkDslMarker
public class CfnScalingPolicyMetricStatPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.MetricStatProperty.Builder =
      CfnScalingPolicy.MetricStatProperty.builder()

  /**
   * @param metric The CloudWatch metric to return, including the metric name, namespace, and
   * dimensions. 
   * To get the exact metric name, namespace, and dimensions, inspect the
   * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html) object
   * that is returned by a call to
   * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
   * .
   */
  public fun metric(metric: IResolvable) {
    cdkBuilder.metric(metric)
  }

  /**
   * @param metric The CloudWatch metric to return, including the metric name, namespace, and
   * dimensions. 
   * To get the exact metric name, namespace, and dimensions, inspect the
   * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html) object
   * that is returned by a call to
   * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
   * .
   */
  public fun metric(metric: CfnScalingPolicy.MetricProperty) {
    cdkBuilder.metric(metric)
  }

  /**
   * @param stat The statistic to return. 
   * It can include any CloudWatch statistic or extended statistic. For a list of valid values, see
   * the table in
   * [Statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic)
   * in the *Amazon CloudWatch User Guide* .
   *
   * The most commonly used metrics for predictive scaling are `Average` and `Sum` .
   */
  public fun stat(stat: String) {
    cdkBuilder.stat(stat)
  }

  /**
   * @param unit The unit to use for the returned data points.
   * For a complete list of the units that CloudWatch supports, see the
   * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
   * data type in the *Amazon CloudWatch API Reference* .
   */
  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun build(): CfnScalingPolicy.MetricStatProperty = cdkBuilder.build()
}
