@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

/**
 * Contains customized metric specification information for a target tracking scaling policy for
 * Amazon EC2 Auto Scaling.
 *
 * To create your customized metric specification:
 *
 * * Add values for each required property from CloudWatch. You can use an existing metric, or a new
 * metric that you create. To use your own metric, you must first publish the metric to CloudWatch. For
 * more information, see [Publish Custom
 * Metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html) in
 * the *Amazon CloudWatch User Guide* .
 * * Choose a metric that changes proportionally with capacity. The value of the metric should
 * increase or decrease in inverse proportion to the number of capacity units. That is, the value of
 * the metric should decrease when capacity increases.
 *
 * For more information about CloudWatch, see [Amazon CloudWatch
 * Concepts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html) .
 *
 * `CustomizedMetricSpecification` is a property of the [AWS::AutoScaling::ScalingPolicy
 * TargetTrackingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html)
 * property type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * CustomizedMetricSpecificationProperty customizedMetricSpecificationProperty =
 * CustomizedMetricSpecificationProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * .statistic("statistic")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .unit("unit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html)
 */
@CdkDslMarker
public class CfnScalingPolicyCustomizedMetricSpecificationPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder =
      CfnScalingPolicy.CustomizedMetricSpecificationProperty.builder()

  private val _dimensions: MutableList<Any> = mutableListOf()

  /**
   * @param dimensions The dimensions of the metric.
   * Conditional: If you published your metric with dimensions, you must specify the same dimensions
   * in your scaling policy.
   */
  public fun dimensions(vararg dimensions: Any) {
    _dimensions.addAll(listOf(*dimensions))
  }

  /**
   * @param dimensions The dimensions of the metric.
   * Conditional: If you published your metric with dimensions, you must specify the same dimensions
   * in your scaling policy.
   */
  public fun dimensions(dimensions: Collection<Any>) {
    _dimensions.addAll(dimensions)
  }

  /**
   * @param dimensions The dimensions of the metric.
   * Conditional: If you published your metric with dimensions, you must specify the same dimensions
   * in your scaling policy.
   */
  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  /**
   * @param metricName The name of the metric. 
   * To get the exact metric name, namespace, and dimensions, inspect the
   * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html) object
   * that is returned by a call to
   * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
   * .
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

  /**
   * @param statistic The statistic of the metric. 
   */
  public fun statistic(statistic: String) {
    cdkBuilder.statistic(statistic)
  }

  /**
   * @param unit The unit of the metric.
   * For a complete list of the units that CloudWatch supports, see the
   * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
   * data type in the *Amazon CloudWatch API Reference* .
   */
  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun build(): CfnScalingPolicy.CustomizedMetricSpecificationProperty {
    if(_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
    return cdkBuilder.build()
  }
}
