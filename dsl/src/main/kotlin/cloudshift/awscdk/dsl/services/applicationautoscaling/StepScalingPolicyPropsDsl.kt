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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.applicationautoscaling.AdjustmentType
import software.amazon.awscdk.services.applicationautoscaling.IScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType
import software.amazon.awscdk.services.applicationautoscaling.ScalingInterval
import software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps
import software.amazon.awscdk.services.cloudwatch.IMetric
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class StepScalingPolicyPropsDsl {
    private val cdkBuilder: StepScalingPolicyProps.Builder = StepScalingPolicyProps.builder()

    private val _scalingSteps: MutableList<ScalingInterval> = mutableListOf()

    public fun adjustmentType(adjustmentType: AdjustmentType) {
        cdkBuilder.adjustmentType(adjustmentType)
    }

    public fun cooldown(cooldown: Duration) {
        cdkBuilder.cooldown(cooldown)
    }

    public fun datapointsToAlarm(datapointsToAlarm: Number) {
        cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    public fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    public fun metric(metric: IMetric) {
        cdkBuilder.metric(metric)
    }

    public fun metricAggregationType(metricAggregationType: MetricAggregationType) {
        cdkBuilder.metricAggregationType(metricAggregationType)
    }

    public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
        cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
    }

    public fun scalingSteps(scalingSteps: ScalingIntervalDsl.() -> Unit) {
        _scalingSteps.add(ScalingIntervalDsl().apply(scalingSteps).build())
    }

    public fun scalingSteps(scalingSteps: Collection<ScalingInterval>) {
        _scalingSteps.addAll(scalingSteps)
    }

    public fun scalingTarget(scalingTarget: IScalableTarget) {
        cdkBuilder.scalingTarget(scalingTarget)
    }

    public fun build(): StepScalingPolicyProps {
        if (_scalingSteps.isNotEmpty()) cdkBuilder.scalingSteps(_scalingSteps)
        return cdkBuilder.build()
    }
}
