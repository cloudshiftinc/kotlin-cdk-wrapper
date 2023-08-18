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

package io.cloudshiftdev.awscdkdsl.services.applicationautoscaling

import io.cloudshiftdev.awscdkdsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.ScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.StepScalingAction
import software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy

/**
 * An embedded object that contains attributes and attribute values that are used to suspend and
 * resume automatic scaling.
 */
public inline fun CfnScalableTarget.setSuspendedState(
    block: CfnScalableTargetSuspendedStatePropertyDsl.() -> Unit = {}
) {
    val builder = CfnScalableTargetSuspendedStatePropertyDsl()
    builder.apply(block)
    return setSuspendedState(builder.build())
}

/** A step scaling policy. */
public inline fun CfnScalingPolicy.setStepScalingPolicyConfiguration(
    block: CfnScalingPolicyStepScalingPolicyConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnScalingPolicyStepScalingPolicyConfigurationPropertyDsl()
    builder.apply(block)
    return setStepScalingPolicyConfiguration(builder.build())
}

/** A target tracking scaling policy. */
public inline fun CfnScalingPolicy.setTargetTrackingScalingPolicyConfiguration(
    block: CfnScalingPolicyTargetTrackingScalingPolicyConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnScalingPolicyTargetTrackingScalingPolicyConfigurationPropertyDsl()
    builder.apply(block)
    return setTargetTrackingScalingPolicyConfiguration(builder.build())
}

/**
 * Add a policy statement to the role's policy.
 *
 * @param statement
 */
public inline fun ScalableTarget.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToRolePolicy(builder.build())
}

/**
 * Scale out or in, in response to a metric.
 *
 * @param id
 * @param props
 */
public inline fun ScalableTarget.scaleOnMetric(
    id: String,
    block: BasicStepScalingPolicyPropsDsl.() -> Unit = {}
): StepScalingPolicy {
    val builder = BasicStepScalingPolicyPropsDsl()
    builder.apply(block)
    return scaleOnMetric(id, builder.build())
}

/**
 * Scale out or in based on time.
 *
 * @param id
 * @param action
 */
public inline fun ScalableTarget.scaleOnSchedule(
    id: String,
    block: ScalingScheduleDsl.() -> Unit = {}
) {
    val builder = ScalingScheduleDsl()
    builder.apply(block)
    return scaleOnSchedule(id, builder.build())
}

/**
 * Scale out or in in order to keep a metric around a target value.
 *
 * @param id
 * @param props
 */
public inline fun ScalableTarget.scaleToTrackMetric(
    id: String,
    block: BasicTargetTrackingScalingPolicyPropsDsl.() -> Unit = {}
): TargetTrackingScalingPolicy {
    val builder = BasicTargetTrackingScalingPolicyPropsDsl()
    builder.apply(block)
    return scaleToTrackMetric(id, builder.build())
}

/**
 * Add an adjusment interval to the ScalingAction.
 *
 * @param adjustment
 */
public inline fun StepScalingAction.addAdjustment(block: AdjustmentTierDsl.() -> Unit = {}) {
    val builder = AdjustmentTierDsl()
    builder.apply(block)
    return addAdjustment(builder.build())
}
