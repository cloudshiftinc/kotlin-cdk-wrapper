@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscalingplans

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

/**
 * `CustomizedScalingMetricSpecification` is a subproperty of
 * [TargetTrackingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html)
 * that specifies a customized scaling metric for a target tracking configuration to use with AWS Auto
 * Scaling ( Auto Scaling Plans ).
 *
 * To create your customized scaling metric specification:
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
 * For information about terminology, available metrics, or how to publish new metrics, see [Amazon
 * CloudWatch
 * Concepts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html)
 * in the *Amazon CloudWatch User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscalingplans.*;
 * CustomizedScalingMetricSpecificationProperty customizedScalingMetricSpecificationProperty =
 * CustomizedScalingMetricSpecificationProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html)
 */
@CdkDslMarker
public class CfnScalingPlanCustomizedScalingMetricSpecificationPropertyDsl {
  private val cdkBuilder: CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder =
      CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.builder()

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
   * [Metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html) object
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

  public fun build(): CfnScalingPlan.CustomizedScalingMetricSpecificationProperty {
    if(_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
    return cdkBuilder.build()
  }
}
