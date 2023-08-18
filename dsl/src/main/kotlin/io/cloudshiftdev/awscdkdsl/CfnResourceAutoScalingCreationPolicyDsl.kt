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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy

/**
 * For an Auto Scaling group replacement update, specifies how many instances must signal success
 * for the update to succeed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnResourceAutoScalingCreationPolicy cfnResourceAutoScalingCreationPolicy =
 * CfnResourceAutoScalingCreationPolicy.builder()
 * .minSuccessfulInstancesPercent(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnResourceAutoScalingCreationPolicyDsl {
    private val cdkBuilder: CfnResourceAutoScalingCreationPolicy.Builder =
        CfnResourceAutoScalingCreationPolicy.builder()

    /**
     * @param minSuccessfulInstancesPercent Specifies the percentage of instances in an Auto Scaling
     *   replacement update that must signal success for the update to succeed. You can specify a
     *   value from 0 to 100. AWS CloudFormation rounds to the nearest tenth of a percent. For
     *   example, if you update five instances with a minimum successful percentage of 50, three
     *   instances must signal success. If an instance doesn't send a signal within the time
     *   specified by the Timeout property, AWS CloudFormation assumes that the instance wasn't
     *   created.
     */
    public fun minSuccessfulInstancesPercent(minSuccessfulInstancesPercent: Number) {
        cdkBuilder.minSuccessfulInstancesPercent(minSuccessfulInstancesPercent)
    }

    public fun build(): CfnResourceAutoScalingCreationPolicy = cdkBuilder.build()
}
