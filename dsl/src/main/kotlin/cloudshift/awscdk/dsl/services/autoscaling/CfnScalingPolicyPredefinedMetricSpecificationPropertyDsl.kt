@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@CdkDslMarker
public class CfnScalingPolicyPredefinedMetricSpecificationPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder =
      CfnScalingPolicy.PredefinedMetricSpecificationProperty.builder()

  /**
   * @param predefinedMetricType The metric type. The following predefined metrics are available:. 
   * * `ASGAverageCPUUtilization` - Average CPU utilization of the Auto Scaling group.
   * * `ASGAverageNetworkIn` - Average number of bytes received on all network interfaces by the
   * Auto Scaling group.
   * * `ASGAverageNetworkOut` - Average number of bytes sent out on all network interfaces by the
   * Auto Scaling group.
   * * `ALBRequestCountPerTarget` - Average Application Load Balancer request count per target for
   * your Auto Scaling group.
   */
  public fun predefinedMetricType(predefinedMetricType: String) {
    cdkBuilder.predefinedMetricType(predefinedMetricType)
  }

  /**
   * @param resourceLabel A label that uniquely identifies a specific Application Load Balancer
   * target group from which to determine the average request count served by your Auto Scaling group.
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

  public fun build(): CfnScalingPolicy.PredefinedMetricSpecificationProperty = cdkBuilder.build()
}
