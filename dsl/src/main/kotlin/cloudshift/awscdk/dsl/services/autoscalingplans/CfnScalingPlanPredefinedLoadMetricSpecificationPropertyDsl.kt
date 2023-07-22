@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscalingplans

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

/**
 * `PredefinedLoadMetricSpecification` is a subproperty of
 * [ScalingInstruction](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html)
 * that specifies a predefined load metric for predictive scaling to use with AWS Auto Scaling ( Auto
 * Scaling Plans ).
 *
 * After creating your scaling plan, you can use the AWS Auto Scaling console to visualize forecasts
 * for the specified metric. For more information, see [View Scaling Information for a
 * Resource](https://docs.aws.amazon.com/autoscaling/plans/userguide/gs-create-scaling-plan.html#gs-view-resource)
 * in the *AWS Auto Scaling User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscalingplans.*;
 * PredefinedLoadMetricSpecificationProperty predefinedLoadMetricSpecificationProperty =
 * PredefinedLoadMetricSpecificationProperty.builder()
 * .predefinedLoadMetricType("predefinedLoadMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html)
 */
@CdkDslMarker
public class CfnScalingPlanPredefinedLoadMetricSpecificationPropertyDsl {
  private val cdkBuilder: CfnScalingPlan.PredefinedLoadMetricSpecificationProperty.Builder =
      CfnScalingPlan.PredefinedLoadMetricSpecificationProperty.builder()

  /**
   * @param predefinedLoadMetricType The metric type. 
   */
  public fun predefinedLoadMetricType(predefinedLoadMetricType: String) {
    cdkBuilder.predefinedLoadMetricType(predefinedLoadMetricType)
  }

  /**
   * @param resourceLabel Identifies the resource associated with the metric type.
   * You can't specify a resource label unless the metric type is `ALBTargetGroupRequestCount` and
   * there is a target group for an Application Load Balancer attached to the Auto Scaling group.
   *
   * You create the resource label by appending the final portion of the load balancer ARN and the
   * final portion of the target group ARN into a single value, separated by a forward slash (/). The
   * format is
   * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>,
   * where:
   *
   * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
   * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target group
   * ARN.
   *
   * This is an example:
   * app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d.
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

  public fun build(): CfnScalingPlan.PredefinedLoadMetricSpecificationProperty = cdkBuilder.build()
}
