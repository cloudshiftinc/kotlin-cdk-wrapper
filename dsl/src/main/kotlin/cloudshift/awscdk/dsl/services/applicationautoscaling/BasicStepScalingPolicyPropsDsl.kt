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

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.applicationautoscaling.AdjustmentType
import software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps
import software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType
import software.amazon.awscdk.services.applicationautoscaling.ScalingInterval
import software.amazon.awscdk.services.cloudwatch.IMetric

/**
 * Example:
 * ```
 * ScalableAttribute capacity;
 * Metric cpuUtilization;
 * capacity.scaleOnMetric("ScaleToCPU", BasicStepScalingPolicyProps.builder()
 * .metric(cpuUtilization)
 * .scalingSteps(List.of(ScalingInterval.builder().upper(10).change(-1).build(),
 * ScalingInterval.builder().lower(50).change(+1).build(),
 * ScalingInterval.builder().lower(70).change(+3).build()))
 * // Change this to AdjustmentType.PercentChangeInCapacity to interpret the
 * // 'change' numbers before as percentages instead of capacity counts.
 * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
 * .build());
 * ```
 */
@CdkDslMarker
public class BasicStepScalingPolicyPropsDsl {
    private val cdkBuilder: BasicStepScalingPolicyProps.Builder =
        BasicStepScalingPolicyProps.builder()

    private val _scalingSteps: MutableList<ScalingInterval> = mutableListOf()

    /** @param adjustmentType How the adjustment numbers inside 'intervals' are interpreted. */
    public fun adjustmentType(adjustmentType: AdjustmentType) {
        cdkBuilder.adjustmentType(adjustmentType)
    }

    /**
     * @param cooldown Grace period after scaling activity. Subsequent scale outs during the
     *   cooldown period are squashed so that only the biggest scale out happens.
     *
     * Subsequent scale ins during the cooldown period are ignored.
     */
    public fun cooldown(cooldown: Duration) {
        cdkBuilder.cooldown(cooldown)
    }

    /**
     * @param datapointsToAlarm The number of data points out of the evaluation periods that must be
     *   breaching to trigger a scaling action. Creates an "M out of N" alarm, where this property
     *   is the M and the value set for `evaluationPeriods` is the N value.
     *
     * Only has meaning if `evaluationPeriods != 1`.
     */
    public fun datapointsToAlarm(datapointsToAlarm: Number) {
        cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    /**
     * @param evaluationPeriods How many evaluation periods of the metric to wait before triggering
     *   a scaling action. Raising this value can be used to smooth out the metric, at the expense
     *   of slower response times.
     *
     * If `datapointsToAlarm` is not set, then all data points in the evaluation period must meet
     * the criteria to trigger a scaling action.
     */
    public fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    /** @param metric Metric to scale on. */
    public fun metric(metric: IMetric) {
        cdkBuilder.metric(metric)
    }

    /**
     * @param metricAggregationType Aggregation to apply to all data points over the evaluation
     *   periods. Only has meaning if `evaluationPeriods != 1`.
     */
    public fun metricAggregationType(metricAggregationType: MetricAggregationType) {
        cdkBuilder.metricAggregationType(metricAggregationType)
    }

    /**
     * @param minAdjustmentMagnitude Minimum absolute number to adjust capacity with as result of
     *   percentage scaling. Only when using AdjustmentType = PercentChangeInCapacity, this number
     *   controls the minimum absolute effect size.
     */
    public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
        cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
    }

    /**
     * @param scalingSteps The intervals for scaling. Maps a range of metric values to a particular
     *   scaling behavior.
     */
    public fun scalingSteps(scalingSteps: ScalingIntervalDsl.() -> Unit) {
        _scalingSteps.add(ScalingIntervalDsl().apply(scalingSteps).build())
    }

    /**
     * @param scalingSteps The intervals for scaling. Maps a range of metric values to a particular
     *   scaling behavior.
     */
    public fun scalingSteps(scalingSteps: Collection<ScalingInterval>) {
        _scalingSteps.addAll(scalingSteps)
    }

    public fun build(): BasicStepScalingPolicyProps {
        if (_scalingSteps.isNotEmpty()) cdkBuilder.scalingSteps(_scalingSteps)
        return cdkBuilder.build()
    }
}
