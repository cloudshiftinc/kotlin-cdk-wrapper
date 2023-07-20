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

import software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier
import software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps
import software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps
import software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps
import software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps
import software.amazon.awscdk.services.applicationautoscaling.CronOptions
import software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps
import software.amazon.awscdk.services.applicationautoscaling.ScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps
import software.amazon.awscdk.services.applicationautoscaling.ScalingInterval
import software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule
import software.amazon.awscdk.services.applicationautoscaling.StepScalingAction
import software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps
import software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps
import software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object applicationautoscaling {
    public inline fun adjustmentTier(block: AdjustmentTierDsl.() -> Unit = {}): AdjustmentTier {
        val builder = AdjustmentTierDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun baseScalableAttributeProps(
        block: BaseScalableAttributePropsDsl.() -> Unit =
            {},
    ): BaseScalableAttributeProps {
        val builder = BaseScalableAttributePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun baseTargetTrackingProps(block: BaseTargetTrackingPropsDsl.() -> Unit = {}): BaseTargetTrackingProps {
        val builder = BaseTargetTrackingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun basicStepScalingPolicyProps(
        block: BasicStepScalingPolicyPropsDsl.() -> Unit =
            {},
    ): BasicStepScalingPolicyProps {
        val builder = BasicStepScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun basicTargetTrackingScalingPolicyProps(
        block: BasicTargetTrackingScalingPolicyPropsDsl.() -> Unit =
            {},
    ): BasicTargetTrackingScalingPolicyProps {
        val builder = BasicTargetTrackingScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalableTarget(
        scope: Construct,
        id: String,
        block: CfnScalableTargetDsl.() -> Unit = {},
    ): CfnScalableTarget {
        val builder = CfnScalableTargetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalableTargetProps(block: CfnScalableTargetPropsDsl.() -> Unit = {}): CfnScalableTargetProps {
        val builder = CfnScalableTargetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalableTargetScalableTargetActionProperty(
        block: CfnScalableTargetScalableTargetActionPropertyDsl.() -> Unit =
            {},
    ): CfnScalableTarget.ScalableTargetActionProperty {
        val builder = CfnScalableTargetScalableTargetActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalableTargetScheduledActionProperty(
        block: CfnScalableTargetScheduledActionPropertyDsl.() -> Unit =
            {},
    ): CfnScalableTarget.ScheduledActionProperty {
        val builder = CfnScalableTargetScheduledActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalableTargetSuspendedStateProperty(
        block: CfnScalableTargetSuspendedStatePropertyDsl.() -> Unit =
            {},
    ): CfnScalableTarget.SuspendedStateProperty {
        val builder = CfnScalableTargetSuspendedStatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicy(
        scope: Construct,
        id: String,
        block: CfnScalingPolicyDsl.() -> Unit = {},
    ): CfnScalingPolicy {
        val builder = CfnScalingPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyCustomizedMetricSpecificationProperty(
        block: CfnScalingPolicyCustomizedMetricSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.CustomizedMetricSpecificationProperty {
        val builder = CfnScalingPolicyCustomizedMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyMetricDimensionProperty(
        block: CfnScalingPolicyMetricDimensionPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.MetricDimensionProperty {
        val builder = CfnScalingPolicyMetricDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyPredefinedMetricSpecificationProperty(
        block: CfnScalingPolicyPredefinedMetricSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.PredefinedMetricSpecificationProperty {
        val builder = CfnScalingPolicyPredefinedMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyProps(block: CfnScalingPolicyPropsDsl.() -> Unit = {}): CfnScalingPolicyProps {
        val builder = CfnScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyStepAdjustmentProperty(
        block: CfnScalingPolicyStepAdjustmentPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.StepAdjustmentProperty {
        val builder = CfnScalingPolicyStepAdjustmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyStepScalingPolicyConfigurationProperty(
        block: CfnScalingPolicyStepScalingPolicyConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.StepScalingPolicyConfigurationProperty {
        val builder = CfnScalingPolicyStepScalingPolicyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyTargetTrackingScalingPolicyConfigurationProperty(
        block: CfnScalingPolicyTargetTrackingScalingPolicyConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty {
        val builder = CfnScalingPolicyTargetTrackingScalingPolicyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cronOptions(block: CronOptionsDsl.() -> Unit = {}): CronOptions {
        val builder = CronOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun enableScalingProps(block: EnableScalingPropsDsl.() -> Unit = {}): EnableScalingProps {
        val builder = EnableScalingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun scalableTarget(
        scope: Construct,
        id: String,
        block: ScalableTargetDsl.() -> Unit = {},
    ): ScalableTarget {
        val builder = ScalableTargetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun scalableTargetProps(block: ScalableTargetPropsDsl.() -> Unit = {}): ScalableTargetProps {
        val builder = ScalableTargetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun scalingInterval(block: ScalingIntervalDsl.() -> Unit = {}): ScalingInterval {
        val builder = ScalingIntervalDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun scalingSchedule(block: ScalingScheduleDsl.() -> Unit = {}): ScalingSchedule {
        val builder = ScalingScheduleDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun stepScalingAction(
        scope: Construct,
        id: String,
        block: StepScalingActionDsl.() -> Unit = {},
    ): StepScalingAction {
        val builder = StepScalingActionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun stepScalingActionProps(block: StepScalingActionPropsDsl.() -> Unit = {}): StepScalingActionProps {
        val builder = StepScalingActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun stepScalingPolicy(
        scope: Construct,
        id: String,
        block: StepScalingPolicyDsl.() -> Unit = {},
    ): StepScalingPolicy {
        val builder = StepScalingPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun stepScalingPolicyProps(block: StepScalingPolicyPropsDsl.() -> Unit = {}): StepScalingPolicyProps {
        val builder = StepScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun targetTrackingScalingPolicy(
        scope: Construct,
        id: String,
        block: TargetTrackingScalingPolicyDsl.() -> Unit = {},
    ): TargetTrackingScalingPolicy {
        val builder = TargetTrackingScalingPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun targetTrackingScalingPolicyProps(
        block: TargetTrackingScalingPolicyPropsDsl.() -> Unit =
            {},
    ): TargetTrackingScalingPolicyProps {
        val builder = TargetTrackingScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
