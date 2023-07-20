@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable
import kotlin.Number

@CdkDslMarker
public class CfnGlobalTableCapacityAutoScalingSettingsPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.CapacityAutoScalingSettingsProperty.Builder =
        CfnGlobalTable.CapacityAutoScalingSettingsProperty.builder()

    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    public fun seedCapacity(seedCapacity: Number) {
        cdkBuilder.seedCapacity(seedCapacity)
    }

    public fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable) {
        cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration)
    }

    public fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty) {
        cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration)
    }

    public fun build(): CfnGlobalTable.CapacityAutoScalingSettingsProperty = cdkBuilder.build()
}
