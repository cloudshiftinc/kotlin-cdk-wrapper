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
 * `BaselineEbsBandwidthMbpsRequest` is a property of the `InstanceRequirements` property of the
 * [AWS::AutoScaling::AutoScalingGroup LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
 * property type that describes the minimum and maximum baseline bandwidth performance for an
 * instance type, in Mbps.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * BaselineEbsBandwidthMbpsRequestProperty baselineEbsBandwidthMbpsRequestProperty =
 * BaselineEbsBandwidthMbpsRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-baselineebsbandwidthmbpsrequest.html)
 */
@CdkDslMarker
public class CfnAutoScalingGroupBaselineEbsBandwidthMbpsRequestPropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty.Builder =
        CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty.builder()

    /** @param max The maximum value in Mbps. */
    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    /** @param min The minimum value in Mbps. */
    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty =
        cdkBuilder.build()
}
