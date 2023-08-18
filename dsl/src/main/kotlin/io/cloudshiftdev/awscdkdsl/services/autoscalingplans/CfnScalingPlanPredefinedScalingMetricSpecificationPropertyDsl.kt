@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.autoscalingplans

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

/**
 * `PredefinedScalingMetricSpecification` is a subproperty of
 * [TargetTrackingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html)
 * that specifies a customized scaling metric for a target tracking configuration to use with AWS
 * Auto Scaling ( Auto Scaling Plans ).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscalingplans.*;
 * PredefinedScalingMetricSpecificationProperty predefinedScalingMetricSpecificationProperty =
 * PredefinedScalingMetricSpecificationProperty.builder()
 * .predefinedScalingMetricType("predefinedScalingMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html)
 */
@CdkDslMarker
public class CfnScalingPlanPredefinedScalingMetricSpecificationPropertyDsl {
    private val cdkBuilder: CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.Builder =
        CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.builder()

    /**
     * @param predefinedScalingMetricType The metric type. The `ALBRequestCountPerTarget` metric
     *   type applies only to Auto Scaling groups, Spot Fleet requests, and ECS services.
     */
    public fun predefinedScalingMetricType(predefinedScalingMetricType: String) {
        cdkBuilder.predefinedScalingMetricType(predefinedScalingMetricType)
    }

    /**
     * @param resourceLabel Identifies the resource associated with the metric type. You can't
     *   specify a resource label unless the metric type is `ALBRequestCountPerTarget` and there is
     *   a target group for an Application Load Balancer attached to the Auto Scaling group, Spot
     *   Fleet request, or ECS service.
     *
     * You create the resource label by appending the final portion of the load balancer ARN and the
     * final portion of the target group ARN into a single value, separated by a forward slash (/).
     * The format is
     * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>,
     * where:
     * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
     * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target group
     *   ARN.
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

    public fun build(): CfnScalingPlan.PredefinedScalingMetricSpecificationProperty =
        cdkBuilder.build()
}
