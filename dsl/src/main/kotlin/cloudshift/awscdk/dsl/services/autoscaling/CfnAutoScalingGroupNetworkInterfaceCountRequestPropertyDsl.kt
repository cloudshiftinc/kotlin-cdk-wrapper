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
 * `NetworkInterfaceCountRequest` is a property of the `InstanceRequirements` property of the
 * [AWS::AutoScaling::AutoScalingGroup LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
 * property type that describes the minimum and maximum number of network interfaces for an instance
 * type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * NetworkInterfaceCountRequestProperty networkInterfaceCountRequestProperty =
 * NetworkInterfaceCountRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-networkinterfacecountrequest.html)
 */
@CdkDslMarker
public class CfnAutoScalingGroupNetworkInterfaceCountRequestPropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty.Builder =
        CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty.builder()

    /** @param max The maximum number of network interfaces. */
    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    /** @param min The minimum number of network interfaces. */
    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty =
        cdkBuilder.build()
}
