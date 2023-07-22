@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.applicationautoscaling.AdjustmentType
import software.amazon.awscdk.services.applicationautoscaling.IScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType
import software.amazon.awscdk.services.applicationautoscaling.ScalingInterval
import software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.constructs.Construct

/**
 * Define a scaling strategy which scales depending on absolute values of some metric.
 *
 * You can specify the scaling behavior for various values of the metric.
 *
 * Implemented using one or more CloudWatch alarms and Step Scaling Policies.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.applicationautoscaling.*;
 * import software.amazon.awscdk.services.cloudwatch.*;
 * Metric metric;
 * ScalableTarget scalableTarget;
 * StepScalingPolicy stepScalingPolicy = StepScalingPolicy.Builder.create(this,
 * "MyStepScalingPolicy")
 * .metric(metric)
 * .scalingSteps(List.of(ScalingInterval.builder()
 * .change(123)
 * // the properties below are optional
 * .lower(123)
 * .upper(123)
 * .build()))
 * .scalingTarget(scalableTarget)
 * // the properties below are optional
 * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
 * .cooldown(Duration.minutes(30))
 * .datapointsToAlarm(123)
 * .evaluationPeriods(123)
 * .metricAggregationType(MetricAggregationType.AVERAGE)
 * .minAdjustmentMagnitude(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class StepScalingPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: StepScalingPolicy.Builder = StepScalingPolicy.Builder.create(scope, id)

  private val _scalingSteps: MutableList<ScalingInterval> = mutableListOf()

  /**
   * How the adjustment numbers inside 'intervals' are interpreted.
   *
   * Default: ChangeInCapacity
   *
   * @param adjustmentType How the adjustment numbers inside 'intervals' are interpreted. 
   */
  public fun adjustmentType(adjustmentType: AdjustmentType) {
    cdkBuilder.adjustmentType(adjustmentType)
  }

  /**
   * Grace period after scaling activity.
   *
   * Subsequent scale outs during the cooldown period are squashed so that only
   * the biggest scale out happens.
   *
   * Subsequent scale ins during the cooldown period are ignored.
   *
   * Default: No cooldown period
   *
   * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepScalingPolicyConfiguration.html)
   * @param cooldown Grace period after scaling activity. 
   */
  public fun cooldown(cooldown: Duration) {
    cdkBuilder.cooldown(cooldown)
  }

  /**
   * The number of data points out of the evaluation periods that must be breaching to trigger a
   * scaling action.
   *
   * Creates an "M out of N" alarm, where this property is the M and the value set for
   * `evaluationPeriods` is the N value.
   *
   * Only has meaning if `evaluationPeriods != 1`.
   *
   * Default: `evaluationPeriods`
   *
   * @param datapointsToAlarm The number of data points out of the evaluation periods that must be
   * breaching to trigger a scaling action. 
   */
  public fun datapointsToAlarm(datapointsToAlarm: Number) {
    cdkBuilder.datapointsToAlarm(datapointsToAlarm)
  }

  /**
   * How many evaluation periods of the metric to wait before triggering a scaling action.
   *
   * Raising this value can be used to smooth out the metric, at the expense
   * of slower response times.
   *
   * If `datapointsToAlarm` is not set, then all data points in the evaluation period
   * must meet the criteria to trigger a scaling action.
   *
   * Default: 1
   *
   * @param evaluationPeriods How many evaluation periods of the metric to wait before triggering a
   * scaling action. 
   */
  public fun evaluationPeriods(evaluationPeriods: Number) {
    cdkBuilder.evaluationPeriods(evaluationPeriods)
  }

  /**
   * Metric to scale on.
   *
   * @param metric Metric to scale on. 
   */
  public fun metric(metric: IMetric) {
    cdkBuilder.metric(metric)
  }

  /**
   * Aggregation to apply to all data points over the evaluation periods.
   *
   * Only has meaning if `evaluationPeriods != 1`.
   *
   * Default: - The statistic from the metric if applicable (MIN, MAX, AVERAGE), otherwise AVERAGE.
   *
   * @param metricAggregationType Aggregation to apply to all data points over the evaluation
   * periods. 
   */
  public fun metricAggregationType(metricAggregationType: MetricAggregationType) {
    cdkBuilder.metricAggregationType(metricAggregationType)
  }

  /**
   * Minimum absolute number to adjust capacity with as result of percentage scaling.
   *
   * Only when using AdjustmentType = PercentChangeInCapacity, this number controls
   * the minimum absolute effect size.
   *
   * Default: No minimum scaling effect
   *
   * @param minAdjustmentMagnitude Minimum absolute number to adjust capacity with as result of
   * percentage scaling. 
   */
  public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
    cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
  }

  /**
   * The intervals for scaling.
   *
   * Maps a range of metric values to a particular scaling behavior.
   *
   * @param scalingSteps The intervals for scaling. 
   */
  public fun scalingSteps(scalingSteps: ScalingIntervalDsl.() -> Unit) {
    _scalingSteps.add(ScalingIntervalDsl().apply(scalingSteps).build())
  }

  /**
   * The intervals for scaling.
   *
   * Maps a range of metric values to a particular scaling behavior.
   *
   * @param scalingSteps The intervals for scaling. 
   */
  public fun scalingSteps(scalingSteps: Collection<ScalingInterval>) {
    _scalingSteps.addAll(scalingSteps)
  }

  /**
   * The scaling target.
   *
   * @param scalingTarget The scaling target. 
   */
  public fun scalingTarget(scalingTarget: IScalableTarget) {
    cdkBuilder.scalingTarget(scalingTarget)
  }

  public fun build(): StepScalingPolicy {
    if(_scalingSteps.isNotEmpty()) cdkBuilder.scalingSteps(_scalingSteps)
    return cdkBuilder.build()
  }
}
