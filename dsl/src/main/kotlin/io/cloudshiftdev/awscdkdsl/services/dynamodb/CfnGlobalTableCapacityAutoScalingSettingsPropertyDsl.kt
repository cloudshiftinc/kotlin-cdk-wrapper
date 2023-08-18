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

package io.cloudshiftdev.awscdkdsl.services.dynamodb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

/**
 * Configures a scalable target and an autoscaling policy for a table or global secondary index's
 * read or write capacity.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * CapacityAutoScalingSettingsProperty capacityAutoScalingSettingsProperty =
 * CapacityAutoScalingSettingsProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .disableScaleIn(false)
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build())
 * // the properties below are optional
 * .seedCapacity(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-capacityautoscalingsettings.html)
 */
@CdkDslMarker
public class CfnGlobalTableCapacityAutoScalingSettingsPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.CapacityAutoScalingSettingsProperty.Builder =
        CfnGlobalTable.CapacityAutoScalingSettingsProperty.builder()

    /** @param maxCapacity The maximum provisioned capacity units for the global table. */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /** @param minCapacity The minimum provisioned capacity units for the global table. */
    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * @param seedCapacity When switching billing mode from `PAY_PER_REQUEST` to `PROVISIONED` ,
     *   DynamoDB requires you to specify read and write capacity unit values for the table and for
     *   each global secondary index. These values will be applied to all replicas. The table will
     *   use these provisioned values until CloudFormation creates the autoscaling policies you
     *   configured in your template. CloudFormation cannot determine what capacity the table and
     *   its global secondary indexes will require in this time period, since they are
     *   application-dependent.
     *
     * If you want to switch a table's billing mode from `PAY_PER_REQUEST` to `PROVISIONED` , you
     * must specify a value for this property for each autoscaled resource. If you specify different
     * values for the same resource in different regions, CloudFormation will use the highest value
     * found in either the `SeedCapacity` or `ReadCapacityUnits` properties. For example, if your
     * global secondary index `myGSI` has a `SeedCapacity` of 10 in us-east-1 and a fixed
     * `ReadCapacityUnits` of 20 in eu-west-1, CloudFormation will initially set the read capacity
     * for `myGSI` to 20. Note that if you disable `ScaleIn` for `myGSI` in us-east-1, its read
     * capacity units might not be set back to 10.
     *
     * You must also specify a value for `SeedCapacity` when you plan to switch a table's billing
     * mode from `PROVISIONED` to `PAY_PER_REQUEST` , because CloudFormation might need to roll back
     * the operation (reverting the billing mode to `PROVISIONED` ) and this cannot succeed without
     * specifying a value for `SeedCapacity` .
     */
    public fun seedCapacity(seedCapacity: Number) {
        cdkBuilder.seedCapacity(seedCapacity)
    }

    /** @param targetTrackingScalingPolicyConfiguration Defines a target tracking scaling policy. */
    public fun targetTrackingScalingPolicyConfiguration(
        targetTrackingScalingPolicyConfiguration: IResolvable
    ) {
        cdkBuilder.targetTrackingScalingPolicyConfiguration(
            targetTrackingScalingPolicyConfiguration
        )
    }

    /** @param targetTrackingScalingPolicyConfiguration Defines a target tracking scaling policy. */
    public fun targetTrackingScalingPolicyConfiguration(
        targetTrackingScalingPolicyConfiguration:
            CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty
    ) {
        cdkBuilder.targetTrackingScalingPolicyConfiguration(
            targetTrackingScalingPolicyConfiguration
        )
    }

    public fun build(): CfnGlobalTable.CapacityAutoScalingSettingsProperty = cdkBuilder.build()
}
