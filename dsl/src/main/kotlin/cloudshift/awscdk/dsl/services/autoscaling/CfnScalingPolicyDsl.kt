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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnScalingPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnScalingPolicy.Builder = CfnScalingPolicy.Builder.create(scope, id)

    private val _stepAdjustments: MutableList<Any> = mutableListOf()

    public fun adjustmentType(adjustmentType: String) {
        cdkBuilder.adjustmentType(adjustmentType)
    }

    public fun autoScalingGroupName(autoScalingGroupName: String) {
        cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    public fun cooldown(cooldown: String) {
        cdkBuilder.cooldown(cooldown)
    }

    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number) {
        cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
    }

    public fun metricAggregationType(metricAggregationType: String) {
        cdkBuilder.metricAggregationType(metricAggregationType)
    }

    public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
        cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
    }

    public fun policyType(policyType: String) {
        cdkBuilder.policyType(policyType)
    }

    public fun predictiveScalingConfiguration(predictiveScalingConfiguration: IResolvable) {
        cdkBuilder.predictiveScalingConfiguration(predictiveScalingConfiguration)
    }

    public fun predictiveScalingConfiguration(predictiveScalingConfiguration: CfnScalingPolicy.PredictiveScalingConfigurationProperty) {
        cdkBuilder.predictiveScalingConfiguration(predictiveScalingConfiguration)
    }

    public fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
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

    public fun targetTrackingConfiguration(targetTrackingConfiguration: IResolvable) {
        cdkBuilder.targetTrackingConfiguration(targetTrackingConfiguration)
    }

    public fun targetTrackingConfiguration(targetTrackingConfiguration: CfnScalingPolicy.TargetTrackingConfigurationProperty) {
        cdkBuilder.targetTrackingConfiguration(targetTrackingConfiguration)
    }

    public fun build(): CfnScalingPolicy {
        if (_stepAdjustments.isNotEmpty()) cdkBuilder.stepAdjustments(_stepAdjustments)
        return cdkBuilder.build()
    }
}
