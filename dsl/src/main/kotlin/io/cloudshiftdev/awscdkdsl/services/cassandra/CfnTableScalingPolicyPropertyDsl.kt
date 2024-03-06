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

package io.cloudshiftdev.awscdkdsl.services.cassandra

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cassandra.CfnTable

/**
 * Amazon Keyspaces supports the `target tracking` auto scaling policy.
 *
 * With this policy, Amazon Keyspaces auto scaling ensures that the table's ratio of consumed to
 * provisioned capacity stays at or near the target value that you specify. You define the target
 * value as a percentage between 20 and 90.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cassandra.*;
 * ScalingPolicyProperty scalingPolicyProperty = ScalingPolicyProperty.builder()
 * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .disableScaleIn(false)
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-scalingpolicy.html)
 */
@CdkDslMarker
public class CfnTableScalingPolicyPropertyDsl {
    private val cdkBuilder: CfnTable.ScalingPolicyProperty.Builder =
        CfnTable.ScalingPolicyProperty.builder()

    /**
     * @param targetTrackingScalingPolicyConfiguration The auto scaling policy that scales a table
     *   based on the ratio of consumed to provisioned capacity.
     */
    public fun targetTrackingScalingPolicyConfiguration(
        targetTrackingScalingPolicyConfiguration: IResolvable
    ) {
        cdkBuilder.targetTrackingScalingPolicyConfiguration(
            targetTrackingScalingPolicyConfiguration
        )
    }

    /**
     * @param targetTrackingScalingPolicyConfiguration The auto scaling policy that scales a table
     *   based on the ratio of consumed to provisioned capacity.
     */
    public fun targetTrackingScalingPolicyConfiguration(
        targetTrackingScalingPolicyConfiguration:
            CfnTable.TargetTrackingScalingPolicyConfigurationProperty
    ) {
        cdkBuilder.targetTrackingScalingPolicyConfiguration(
            targetTrackingScalingPolicyConfiguration
        )
    }

    public fun build(): CfnTable.ScalingPolicyProperty = cdkBuilder.build()
}
