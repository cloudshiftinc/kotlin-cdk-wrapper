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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

/**
 * `InstanceMaintenancePolicy` is a property of the
 * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html)
 * resource.
 *
 * For more information, see
 * [Instance maintenance policies](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
 * in the *Amazon EC2 Auto Scaling User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * InstanceMaintenancePolicyProperty instanceMaintenancePolicyProperty =
 * InstanceMaintenancePolicyProperty.builder()
 * .maxHealthyPercentage(123)
 * .minHealthyPercentage(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancemaintenancepolicy.html)
 */
@CdkDslMarker
public class CfnAutoScalingGroupInstanceMaintenancePolicyPropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.InstanceMaintenancePolicyProperty.Builder =
        CfnAutoScalingGroup.InstanceMaintenancePolicyProperty.builder()

    /**
     * @param maxHealthyPercentage Specifies the upper threshold as a percentage of the desired
     *   capacity of the Auto Scaling group. It represents the maximum percentage of the group that
     *   can be in service and healthy, or pending, to support your workload when replacing
     *   instances. Value range is 100 to 200. To clear a previously set value, specify a value of
     *   `-1` .
     *
     * Both `MinHealthyPercentage` and `MaxHealthyPercentage` must be specified, and the difference
     * between them cannot be greater than 100. A large range increases the number of instances that
     * can be replaced at the same time.
     */
    public fun maxHealthyPercentage(maxHealthyPercentage: Number) {
        cdkBuilder.maxHealthyPercentage(maxHealthyPercentage)
    }

    /**
     * @param minHealthyPercentage Specifies the lower threshold as a percentage of the desired
     *   capacity of the Auto Scaling group. It represents the minimum percentage of the group to
     *   keep in service, healthy, and ready to use to support your workload when replacing
     *   instances. Value range is 0 to 100. To clear a previously set value, specify a value of
     *   `-1` .
     */
    public fun minHealthyPercentage(minHealthyPercentage: Number) {
        cdkBuilder.minHealthyPercentage(minHealthyPercentage)
    }

    public fun build(): CfnAutoScalingGroup.InstanceMaintenancePolicyProperty = cdkBuilder.build()
}
