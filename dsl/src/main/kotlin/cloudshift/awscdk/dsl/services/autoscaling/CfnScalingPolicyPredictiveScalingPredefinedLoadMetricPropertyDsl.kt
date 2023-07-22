@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

/**
 * Contains load metric information for the `PredefinedLoadMetricSpecification` property of the
 * [AWS::AutoScaling::ScalingPolicy
 * PredictiveScalingMetricSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html)
 * property type.
 *
 *
 * Does not apply to policies that use a *metric pair* for the metric specification.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * PredictiveScalingPredefinedLoadMetricProperty predictiveScalingPredefinedLoadMetricProperty =
 * PredictiveScalingPredefinedLoadMetricProperty.builder()
 * .predefinedMetricType("predefinedMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingpredefinedloadmetric.html)
 */
@CdkDslMarker
public class CfnScalingPolicyPredictiveScalingPredefinedLoadMetricPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty.Builder =
      CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty.builder()

  /**
   * @param predefinedMetricType The metric type. 
   */
  public fun predefinedMetricType(predefinedMetricType: String) {
    cdkBuilder.predefinedMetricType(predefinedMetricType)
  }

  /**
   * @param resourceLabel A label that uniquely identifies a specific Application Load Balancer
   * target group from which to determine the request count served by your Auto Scaling group.
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

  public fun build(): CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty =
      cdkBuilder.build()
}
