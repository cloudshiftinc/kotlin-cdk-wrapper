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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnSecurityProfile
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnSecurityProfileBehaviorCriteriaPropertyDsl {
    private val cdkBuilder: CfnSecurityProfile.BehaviorCriteriaProperty.Builder =
        CfnSecurityProfile.BehaviorCriteriaProperty.builder()

    public fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
    }

    public fun consecutiveDatapointsToAlarm(consecutiveDatapointsToAlarm: Number) {
        cdkBuilder.consecutiveDatapointsToAlarm(consecutiveDatapointsToAlarm)
    }

    public fun consecutiveDatapointsToClear(consecutiveDatapointsToClear: Number) {
        cdkBuilder.consecutiveDatapointsToClear(consecutiveDatapointsToClear)
    }

    public fun durationSeconds(durationSeconds: Number) {
        cdkBuilder.durationSeconds(durationSeconds)
    }

    public fun mlDetectionConfig(mlDetectionConfig: IResolvable) {
        cdkBuilder.mlDetectionConfig(mlDetectionConfig)
    }

    public fun mlDetectionConfig(mlDetectionConfig: CfnSecurityProfile.MachineLearningDetectionConfigProperty) {
        cdkBuilder.mlDetectionConfig(mlDetectionConfig)
    }

    public fun statisticalThreshold(statisticalThreshold: IResolvable) {
        cdkBuilder.statisticalThreshold(statisticalThreshold)
    }

    public fun statisticalThreshold(statisticalThreshold: CfnSecurityProfile.StatisticalThresholdProperty) {
        cdkBuilder.statisticalThreshold(statisticalThreshold)
    }

    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    public fun `value`(`value`: CfnSecurityProfile.MetricValueProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnSecurityProfile.BehaviorCriteriaProperty = cdkBuilder.build()
}
