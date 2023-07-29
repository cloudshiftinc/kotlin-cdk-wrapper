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
 * `MemoryGiBPerVCpuRequest` is a property of the `InstanceRequirements` property of the
 * [AWS::AutoScaling::AutoScalingGroup LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
 * property type that describes the minimum and maximum amount of memory per vCPU for an instance
 * type, in GiB.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * MemoryGiBPerVCpuRequestProperty memoryGiBPerVCpuRequestProperty =
 * MemoryGiBPerVCpuRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-memorygibpervcpurequest.html)
 */
@CdkDslMarker
public class CfnAutoScalingGroupMemoryGiBPerVCpuRequestPropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty.Builder =
        CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty.builder()

    /** @param max The memory maximum in GiB. */
    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    /** @param min The memory minimum in GiB. */
    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty = cdkBuilder.build()
}
