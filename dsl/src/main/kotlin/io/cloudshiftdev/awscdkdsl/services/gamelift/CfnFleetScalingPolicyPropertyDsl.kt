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

package io.cloudshiftdev.awscdkdsl.services.gamelift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnFleet

/**
 * Rule that controls how a fleet is scaled.
 *
 * Scaling policies are uniquely identified by the combination of name and fleet ID.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * ScalingPolicyProperty scalingPolicyProperty = ScalingPolicyProperty.builder()
 * .metricName("metricName")
 * .name("name")
 * // the properties below are optional
 * .comparisonOperator("comparisonOperator")
 * .evaluationPeriods(123)
 * .location("location")
 * .policyType("policyType")
 * .scalingAdjustment(123)
 * .scalingAdjustmentType("scalingAdjustmentType")
 * .status("status")
 * .targetConfiguration(TargetConfigurationProperty.builder()
 * .targetValue(123)
 * .build())
 * .threshold(123)
 * .updateStatus("updateStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html)
 */
@CdkDslMarker
public class CfnFleetScalingPolicyPropertyDsl {
    private val cdkBuilder: CfnFleet.ScalingPolicyProperty.Builder =
        CfnFleet.ScalingPolicyProperty.builder()

    /**
     * @param comparisonOperator Comparison operator to use when measuring a metric against the
     *   threshold value.
     */
    public fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
    }

    /**
     * @param evaluationPeriods Length of time (in minutes) the metric must be at or beyond the
     *   threshold before a scaling event is triggered.
     */
    public fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    /** @param location The fleet location. */
    public fun location(location: String) {
        cdkBuilder.location(location)
    }

    /**
     * @param metricName Name of the Amazon GameLift-defined metric that is used to trigger a
     *   scaling adjustment. For detailed descriptions of fleet metrics, see
     *   [Monitor Amazon GameLift with Amazon CloudWatch](https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html)
     *   .
     * * *ActivatingGameSessions* -- Game sessions in the process of being created.
     * * *ActiveGameSessions* -- Game sessions that are currently running.
     * * *ActiveInstances* -- Fleet instances that are currently running at least one game session.
     * * *AvailableGameSessions* -- Additional game sessions that fleet could host simultaneously,
     *   given current capacity.
     * * *AvailablePlayerSessions* -- Empty player slots in currently active game sessions. This
     *   includes game sessions that are not currently accepting players. Reserved player slots are
     *   not included.
     * * *CurrentPlayerSessions* -- Player slots in active game sessions that are being used by a
     *   player or are reserved for a player.
     * * *IdleInstances* -- Active instances that are currently hosting zero game sessions.
     * * *PercentAvailableGameSessions* -- Unused percentage of the total number of game sessions
     *   that a fleet could host simultaneously, given current capacity. Use this metric for a
     *   target-based scaling policy.
     * * *PercentIdleInstances* -- Percentage of the total number of active instances that are
     *   hosting zero game sessions.
     * * *QueueDepth* -- Pending game session placement requests, in any queue, where the current
     *   fleet is the top-priority destination.
     * * *WaitTime* -- Current wait time for pending game session placement requests, in any queue,
     *   where the current fleet is the top-priority destination.
     */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /**
     * @param name A descriptive label that is associated with a fleet's scaling policy. Policy
     *   names do not need to be unique.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param policyType The type of scaling policy to create. For a target-based policy, set the
     *   parameter *MetricName* to 'PercentAvailableGameSessions' and specify a
     *   *TargetConfiguration* . For a rule-based policy set the following parameters: *MetricName*
     *   , *ComparisonOperator* , *Threshold* , *EvaluationPeriods* , *ScalingAdjustmentType* , and
     *   *ScalingAdjustment* .
     */
    public fun policyType(policyType: String) {
        cdkBuilder.policyType(policyType)
    }

    /**
     * @param scalingAdjustment Amount of adjustment to make, based on the scaling adjustment type.
     */
    public fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
    }

    /**
     * @param scalingAdjustmentType The type of adjustment to make to a fleet's instance count.
     * * *ChangeInCapacity* -- add (or subtract) the scaling adjustment value from the current
     *   instance count. Positive values scale up while negative values scale down.
     * * *ExactCapacity* -- set the instance count to the scaling adjustment value.
     * * *PercentChangeInCapacity* -- increase or reduce the current instance count by the scaling
     *   adjustment, read as a percentage. Positive values scale up while negative values scale
     *   down.
     */
    public fun scalingAdjustmentType(scalingAdjustmentType: String) {
        cdkBuilder.scalingAdjustmentType(scalingAdjustmentType)
    }

    /**
     * @param status Current status of the scaling policy. The scaling policy can be in force only
     *   when in an `ACTIVE` status. Scaling policies can be suspended for individual fleets. If the
     *   policy is suspended for a fleet, the policy status does not change.
     * * *ACTIVE* -- The scaling policy can be used for auto-scaling a fleet.
     * * *UPDATE_REQUESTED* -- A request to update the scaling policy has been received.
     * * *UPDATING* -- A change is being made to the scaling policy.
     * * *DELETE_REQUESTED* -- A request to delete the scaling policy has been received.
     * * *DELETING* -- The scaling policy is being deleted.
     * * *DELETED* -- The scaling policy has been deleted.
     * * *ERROR* -- An error occurred in creating the policy. It should be removed and recreated.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * @param targetConfiguration An object that contains settings for a target-based scaling
     *   policy.
     */
    public fun targetConfiguration(targetConfiguration: IResolvable) {
        cdkBuilder.targetConfiguration(targetConfiguration)
    }

    /**
     * @param targetConfiguration An object that contains settings for a target-based scaling
     *   policy.
     */
    public fun targetConfiguration(targetConfiguration: CfnFleet.TargetConfigurationProperty) {
        cdkBuilder.targetConfiguration(targetConfiguration)
    }

    /** @param threshold Metric value used to trigger a scaling event. */
    public fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
    }

    /**
     * @param updateStatus The current status of the fleet's scaling policies in a requested fleet
     *   location. The status `PENDING_UPDATE` indicates that an update was requested for the fleet
     *   but has not yet been completed for the location.
     */
    public fun updateStatus(updateStatus: String) {
        cdkBuilder.updateStatus(updateStatus)
    }

    public fun build(): CfnFleet.ScalingPolicyProperty = cdkBuilder.build()
}
