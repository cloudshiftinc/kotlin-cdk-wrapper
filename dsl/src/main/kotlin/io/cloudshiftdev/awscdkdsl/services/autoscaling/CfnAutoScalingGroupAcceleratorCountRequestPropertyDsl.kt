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
 * `AcceleratorCountRequest` is a property of the `InstanceRequirements` property of the
 * [AWS::AutoScaling::AutoScalingGroup LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
 * property type that describes the minimum and maximum number of accelerators for an instance type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * AcceleratorCountRequestProperty acceleratorCountRequestProperty =
 * AcceleratorCountRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-acceleratorcountrequest.html)
 */
@CdkDslMarker
public class CfnAutoScalingGroupAcceleratorCountRequestPropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.AcceleratorCountRequestProperty.Builder =
        CfnAutoScalingGroup.AcceleratorCountRequestProperty.builder()

    /** @param max The maximum value. */
    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    /** @param min The minimum value. */
    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnAutoScalingGroup.AcceleratorCountRequestProperty = cdkBuilder.build()
}
