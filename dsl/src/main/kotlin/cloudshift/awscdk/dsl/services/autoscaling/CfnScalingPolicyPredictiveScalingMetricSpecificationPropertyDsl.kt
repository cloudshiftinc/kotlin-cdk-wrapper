@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

/**
 * A structure that specifies a metric specification for the `MetricSpecifications` property of the
 * [AWS::AutoScaling::ScalingPolicy
 * PredictiveScalingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingconfiguration.html)
 * property type.
 *
 * You must specify either a metric pair, or a load metric and a scaling metric individually.
 * Specifying a metric pair instead of individual metrics provides a simpler way to configure metrics
 * for a scaling policy. You choose the metric pair, and the policy automatically knows the correct sum
 * and average statistics to use for the load metric and the scaling metric.
 *
 * Example
 *
 * * You create a predictive scaling policy and specify `ALBRequestCount` as the value for the
 * metric pair and `1000.0` as the target value. For this type of metric, you must provide the metric
 * dimension for the corresponding target group, so you also provide a resource label for the
 * Application Load Balancer target group that is attached to your Auto Scaling group.
 * * The number of requests the target group receives per minute provides the load metric, and the
 * request count averaged between the members of the target group provides the scaling metric. In
 * CloudWatch, this refers to the `RequestCount` and `RequestCountPerTarget` metrics, respectively.
 * * For optimal use of predictive scaling, you adhere to the best practice of using a dynamic
 * scaling policy to automatically scale between the minimum capacity and maximum capacity in response
 * to real-time changes in resource utilization.
 * * Amazon EC2 Auto Scaling consumes data points for the load metric over the last 14 days and
 * creates an hourly load forecast for predictive scaling. (A minimum of 24 hours of data is required.)
 * * After creating the load forecast, Amazon EC2 Auto Scaling determines when to reduce or increase
 * the capacity of your Auto Scaling group in each hour of the forecast period so that the average
 * number of requests received by each instance is as close to 1000 requests per minute as possible at
 * all times.
 *
 * For information about using custom metrics with predictive scaling, see [Advanced predictive
 * scaling policy configurations using custom
 * metrics](https://docs.aws.amazon.com/autoscaling/ec2/userguide/predictive-scaling-customized-metric-specification.html)
 * in the *Amazon EC2 Auto Scaling User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * PredictiveScalingMetricSpecificationProperty predictiveScalingMetricSpecificationProperty =
 * PredictiveScalingMetricSpecificationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .customizedCapacityMetricSpecification(PredictiveScalingCustomizedCapacityMetricProperty.builder()
 * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .expression("expression")
 * .label("label")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .build())
 * .customizedLoadMetricSpecification(PredictiveScalingCustomizedLoadMetricProperty.builder()
 * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .expression("expression")
 * .label("label")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .build())
 * .customizedScalingMetricSpecification(PredictiveScalingCustomizedScalingMetricProperty.builder()
 * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .expression("expression")
 * .label("label")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .build())
 * .predefinedLoadMetricSpecification(PredictiveScalingPredefinedLoadMetricProperty.builder()
 * .predefinedMetricType("predefinedMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .predefinedMetricPairSpecification(PredictiveScalingPredefinedMetricPairProperty.builder()
 * .predefinedMetricType("predefinedMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .predefinedScalingMetricSpecification(PredictiveScalingPredefinedScalingMetricProperty.builder()
 * .predefinedMetricType("predefinedMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html)
 */
@CdkDslMarker
public class CfnScalingPolicyPredictiveScalingMetricSpecificationPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.Builder =
      CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.builder()

  /**
   * @param customizedCapacityMetricSpecification The customized capacity metric specification.
   */
  public
      fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: IResolvable) {
    cdkBuilder.customizedCapacityMetricSpecification(customizedCapacityMetricSpecification)
  }

  /**
   * @param customizedCapacityMetricSpecification The customized capacity metric specification.
   */
  public
      fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty) {
    cdkBuilder.customizedCapacityMetricSpecification(customizedCapacityMetricSpecification)
  }

  /**
   * @param customizedLoadMetricSpecification The customized load metric specification.
   */
  public fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: IResolvable) {
    cdkBuilder.customizedLoadMetricSpecification(customizedLoadMetricSpecification)
  }

  /**
   * @param customizedLoadMetricSpecification The customized load metric specification.
   */
  public
      fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty) {
    cdkBuilder.customizedLoadMetricSpecification(customizedLoadMetricSpecification)
  }

  /**
   * @param customizedScalingMetricSpecification The customized scaling metric specification.
   */
  public
      fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: IResolvable) {
    cdkBuilder.customizedScalingMetricSpecification(customizedScalingMetricSpecification)
  }

  /**
   * @param customizedScalingMetricSpecification The customized scaling metric specification.
   */
  public
      fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty) {
    cdkBuilder.customizedScalingMetricSpecification(customizedScalingMetricSpecification)
  }

  /**
   * @param predefinedLoadMetricSpecification The predefined load metric specification.
   */
  public fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: IResolvable) {
    cdkBuilder.predefinedLoadMetricSpecification(predefinedLoadMetricSpecification)
  }

  /**
   * @param predefinedLoadMetricSpecification The predefined load metric specification.
   */
  public
      fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty) {
    cdkBuilder.predefinedLoadMetricSpecification(predefinedLoadMetricSpecification)
  }

  /**
   * @param predefinedMetricPairSpecification The predefined metric pair specification from which
   * Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to use.
   */
  public fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: IResolvable) {
    cdkBuilder.predefinedMetricPairSpecification(predefinedMetricPairSpecification)
  }

  /**
   * @param predefinedMetricPairSpecification The predefined metric pair specification from which
   * Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to use.
   */
  public
      fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty) {
    cdkBuilder.predefinedMetricPairSpecification(predefinedMetricPairSpecification)
  }

  /**
   * @param predefinedScalingMetricSpecification The predefined scaling metric specification.
   */
  public
      fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: IResolvable) {
    cdkBuilder.predefinedScalingMetricSpecification(predefinedScalingMetricSpecification)
  }

  /**
   * @param predefinedScalingMetricSpecification The predefined scaling metric specification.
   */
  public
      fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty) {
    cdkBuilder.predefinedScalingMetricSpecification(predefinedScalingMetricSpecification)
  }

  /**
   * @param targetValue Specifies the target utilization. 
   *
   * Some metrics are based on a count instead of a percentage, such as the request count for an
   * Application Load Balancer or the number of messages in an SQS queue. If the scaling policy
   * specifies one of these metrics, specify the target utilization as the optimal average request or
   * message count per instance during any one-minute interval.
   */
  public fun targetValue(targetValue: Number) {
    cdkBuilder.targetValue(targetValue)
  }

  public fun build(): CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty =
      cdkBuilder.build()
}
