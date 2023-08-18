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
 * Allows you to specify the read capacity settings for a replica table or a replica global
 * secondary index when the `BillingMode` is set to `PROVISIONED` .
 *
 * You must specify a value for either `ReadCapacityUnits` or `ReadCapacityAutoScalingSettings` ,
 * but not both. You can switch between fixed capacity and auto scaling.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * ReadProvisionedThroughputSettingsProperty readProvisionedThroughputSettingsProperty =
 * ReadProvisionedThroughputSettingsProperty.builder()
 * .readCapacityAutoScalingSettings(CapacityAutoScalingSettingsProperty.builder()
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
 * .build())
 * .readCapacityUnits(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-readprovisionedthroughputsettings.html)
 */
@CdkDslMarker
public class CfnGlobalTableReadProvisionedThroughputSettingsPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.ReadProvisionedThroughputSettingsProperty.Builder =
        CfnGlobalTable.ReadProvisionedThroughputSettingsProperty.builder()

    /**
     * @param readCapacityAutoScalingSettings Specifies auto scaling settings for the replica table
     *   or global secondary index.
     */
    public fun readCapacityAutoScalingSettings(readCapacityAutoScalingSettings: IResolvable) {
        cdkBuilder.readCapacityAutoScalingSettings(readCapacityAutoScalingSettings)
    }

    /**
     * @param readCapacityAutoScalingSettings Specifies auto scaling settings for the replica table
     *   or global secondary index.
     */
    public fun readCapacityAutoScalingSettings(
        readCapacityAutoScalingSettings: CfnGlobalTable.CapacityAutoScalingSettingsProperty
    ) {
        cdkBuilder.readCapacityAutoScalingSettings(readCapacityAutoScalingSettings)
    }

    /**
     * @param readCapacityUnits Specifies a fixed read capacity for the replica table or global
     *   secondary index.
     */
    public fun readCapacityUnits(readCapacityUnits: Number) {
        cdkBuilder.readCapacityUnits(readCapacityUnits)
    }

    public fun build(): CfnGlobalTable.ReadProvisionedThroughputSettingsProperty =
        cdkBuilder.build()
}
