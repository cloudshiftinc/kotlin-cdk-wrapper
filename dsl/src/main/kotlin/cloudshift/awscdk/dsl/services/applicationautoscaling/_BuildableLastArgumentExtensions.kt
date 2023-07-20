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

import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.ScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.StepScalingAction
import software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy
import kotlin.String
import kotlin.Unit

public inline fun ScalableTarget.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToRolePolicy(builder.build())
}

public inline fun ScalableTarget.scaleOnMetric(
    id: String,
    block: BasicStepScalingPolicyPropsDsl.() -> Unit = {},
): StepScalingPolicy {
    val builder = BasicStepScalingPolicyPropsDsl()
    builder.apply(block)
    return scaleOnMetric(id, builder.build())
}

public inline fun ScalableTarget.scaleOnSchedule(
    id: String,
    block: ScalingScheduleDsl.() -> Unit =
        {},
) {
    val builder = ScalingScheduleDsl()
    builder.apply(block)
    return scaleOnSchedule(id, builder.build())
}

public inline fun ScalableTarget.scaleToTrackMetric(
    id: String,
    block: BasicTargetTrackingScalingPolicyPropsDsl.() -> Unit = {},
): TargetTrackingScalingPolicy {
    val builder = BasicTargetTrackingScalingPolicyPropsDsl()
    builder.apply(block)
    return scaleToTrackMetric(id, builder.build())
}

public inline fun CfnScalingPolicy.setStepScalingPolicyConfiguration(
    block: CfnScalingPolicyStepScalingPolicyConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnScalingPolicyStepScalingPolicyConfigurationPropertyDsl()
    builder.apply(block)
    return setStepScalingPolicyConfiguration(builder.build())
}

public inline fun CfnScalingPolicy.setTargetTrackingScalingPolicyConfiguration(
    block: CfnScalingPolicyTargetTrackingScalingPolicyConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnScalingPolicyTargetTrackingScalingPolicyConfigurationPropertyDsl()
    builder.apply(block)
    return setTargetTrackingScalingPolicyConfiguration(builder.build())
}

public inline fun StepScalingAction.addAdjustment(block: AdjustmentTierDsl.() -> Unit = {}) {
    val builder = AdjustmentTierDsl()
    builder.apply(block)
    return addAdjustment(builder.build())
}

public inline fun CfnScalableTarget.setSuspendedState(
    block: CfnScalableTargetSuspendedStatePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnScalableTargetSuspendedStatePropertyDsl()
    builder.apply(block)
    return setSuspendedState(builder.build())
}
