@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@CdkDslMarker
public class CfnScalingPolicyPredictiveScalingPredefinedMetricPairPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty.Builder =
      CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty.builder()

  /**
   * @param predefinedMetricType Indicates which metrics to use. 
   * There are two different types of metrics for each metric type: one is a load metric and one is
   * a scaling metric. For example, if the metric type is `ASGCPUUtilization` , the Auto Scaling
   * group's total CPU metric is used as the load metric, and the average CPU metric is used for the
   * scaling metric.
   */
  public fun predefinedMetricType(predefinedMetricType: String) {
    cdkBuilder.predefinedMetricType(predefinedMetricType)
  }

  /**
   * @param resourceLabel A label that uniquely identifies a specific Application Load Balancer
   * target group from which to determine the total and average request count served by your Auto
   * Scaling group.
   * You can't specify a resource label unless the target group is attached to the Auto Scaling
   * group.
   *
   * You create the resource label by appending the final portion of the load balancer ARN and the
   * final portion of the target group ARN into a single value, separated by a forward slash (/). The
   * format of the resource label is:
   *
   * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
   *
   * Where:
   *
   * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
   * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target group
   * ARN.
   *
   * To find the ARN for an Application Load Balancer, use the
   * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
   * API operation. To find the ARN for the target group, use the
   * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
   * API operation.
   */
  public fun resourceLabel(resourceLabel: String) {
    cdkBuilder.resourceLabel(resourceLabel)
  }

  public fun build(): CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty =
      cdkBuilder.build()
}
