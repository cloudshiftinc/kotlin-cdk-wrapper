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

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnScalingPolicyStepScalingPolicyConfigurationPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder =
        CfnScalingPolicy.StepScalingPolicyConfigurationProperty.builder()

    private val _stepAdjustments: MutableList<Any> = mutableListOf()

    public fun adjustmentType(adjustmentType: String) {
        cdkBuilder.adjustmentType(adjustmentType)
    }

    public fun cooldown(cooldown: Number) {
        cdkBuilder.cooldown(cooldown)
    }

    public fun metricAggregationType(metricAggregationType: String) {
        cdkBuilder.metricAggregationType(metricAggregationType)
    }

    public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
        cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
    }

    public fun stepAdjustments(vararg stepAdjustments: Any) {
        _stepAdjustments.addAll(listOf(*stepAdjustments))
    }

    public fun stepAdjustments(stepAdjustments: Collection<Any>) {
        _stepAdjustments.addAll(stepAdjustments)
    }

    public fun stepAdjustments(stepAdjustments: IResolvable) {
        cdkBuilder.stepAdjustments(stepAdjustments)
    }

    public fun build(): CfnScalingPolicy.StepScalingPolicyConfigurationProperty {
        if (_stepAdjustments.isNotEmpty()) cdkBuilder.stepAdjustments(_stepAdjustments)
        return cdkBuilder.build()
    }
}
