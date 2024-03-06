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
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cassandra.CfnTable

/**
 * The optional auto scaling settings for a table with provisioned throughput capacity.
 *
 * To turn on auto scaling for a table in `throughputMode:PROVISIONED` , you must specify the
 * following parameters.
 *
 * Configure the minimum and maximum capacity units. The auto scaling policy ensures that capacity
 * never goes below the minimum or above the maximum range.
 * * `minimumUnits` : The minimum level of throughput the table should always be ready to support.
 *   The value must be between 1 and the max throughput per second quota for your account (40,000 by
 *   default).
 * * `maximumUnits` : The maximum level of throughput the table should always be ready to support.
 *   The value must be between 1 and the max throughput per second quota for your account (40,000 by
 *   default).
 * * `scalingPolicy` : Amazon Keyspaces supports the `target tracking` scaling policy. The auto
 *   scaling target is a percentage of the provisioned capacity of the table.
 *
 * For more information, see
 * [Managing throughput capacity automatically with Amazon Keyspaces auto scaling](https://docs.aws.amazon.com/keyspaces/latest/devguide/autoscaling.html)
 * in the *Amazon Keyspaces Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cassandra.*;
 * AutoScalingSettingProperty autoScalingSettingProperty = AutoScalingSettingProperty.builder()
 * .autoScalingDisabled(false)
 * .maximumUnits(123)
 * .minimumUnits(123)
 * .scalingPolicy(ScalingPolicyProperty.builder()
 * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .disableScaleIn(false)
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-autoscalingsetting.html)
 */
@CdkDslMarker
public class CfnTableAutoScalingSettingPropertyDsl {
    private val cdkBuilder: CfnTable.AutoScalingSettingProperty.Builder =
        CfnTable.AutoScalingSettingProperty.builder()

    /**
     * @param autoScalingDisabled This optional parameter enables auto scaling for the table if set
     *   to `false` .
     */
    public fun autoScalingDisabled(autoScalingDisabled: Boolean) {
        cdkBuilder.autoScalingDisabled(autoScalingDisabled)
    }

    /**
     * @param autoScalingDisabled This optional parameter enables auto scaling for the table if set
     *   to `false` .
     */
    public fun autoScalingDisabled(autoScalingDisabled: IResolvable) {
        cdkBuilder.autoScalingDisabled(autoScalingDisabled)
    }

    /**
     * @param maximumUnits Manage costs by specifying the maximum amount of throughput to provision.
     *   The value must be between 1 and the max throughput per second quota for your account
     *   (40,000 by default).
     */
    public fun maximumUnits(maximumUnits: Number) {
        cdkBuilder.maximumUnits(maximumUnits)
    }

    /**
     * @param minimumUnits The minimum level of throughput the table should always be ready to
     *   support. The value must be between 1 and the max throughput per second quota for your
     *   account (40,000 by default).
     */
    public fun minimumUnits(minimumUnits: Number) {
        cdkBuilder.minimumUnits(minimumUnits)
    }

    /**
     * @param scalingPolicy Amazon Keyspaces supports the `target tracking` auto scaling policy.
     *   With this policy, Amazon Keyspaces auto scaling ensures that the table's ratio of consumed
     *   to provisioned capacity stays at or near the target value that you specify. You define the
     *   target value as a percentage between 20 and 90.
     */
    public fun scalingPolicy(scalingPolicy: IResolvable) {
        cdkBuilder.scalingPolicy(scalingPolicy)
    }

    /**
     * @param scalingPolicy Amazon Keyspaces supports the `target tracking` auto scaling policy.
     *   With this policy, Amazon Keyspaces auto scaling ensures that the table's ratio of consumed
     *   to provisioned capacity stays at or near the target value that you specify. You define the
     *   target value as a percentage between 20 and 90.
     */
    public fun scalingPolicy(scalingPolicy: CfnTable.ScalingPolicyProperty) {
        cdkBuilder.scalingPolicy(scalingPolicy)
    }

    public fun build(): CfnTable.AutoScalingSettingProperty = cdkBuilder.build()
}
