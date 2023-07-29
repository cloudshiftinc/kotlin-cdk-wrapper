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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

/**
 * `AcceleratorTotalMemoryMiBRequest` is a property of the `InstanceRequirements` property of the
 * [AWS::AutoScaling::AutoScalingGroup LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
 * property type that describes the minimum and maximum total memory size for the accelerators for
 * an instance type, in MiB.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * AcceleratorTotalMemoryMiBRequestProperty acceleratorTotalMemoryMiBRequestProperty =
 * AcceleratorTotalMemoryMiBRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-acceleratortotalmemorymibrequest.html)
 */
@CdkDslMarker
public class CfnAutoScalingGroupAcceleratorTotalMemoryMiBRequestPropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty.Builder =
        CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty.builder()

    /** @param max The memory maximum in MiB. */
    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    /** @param min The memory minimum in MiB. */
    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty =
        cdkBuilder.build()
}
