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

package cloudshift.awscdk.dsl.services.autoscalingplans

import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object autoscalingplans {
    public inline fun cfnScalingPlan(
        scope: Construct,
        id: String,
        block: CfnScalingPlanDsl.() -> Unit = {},
    ): CfnScalingPlan {
        val builder = CfnScalingPlanDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPlanApplicationSourceProperty(
        block: CfnScalingPlanApplicationSourcePropertyDsl.() -> Unit =
            {},
    ): CfnScalingPlan.ApplicationSourceProperty {
        val builder = CfnScalingPlanApplicationSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPlanCustomizedLoadMetricSpecificationProperty(
        block: CfnScalingPlanCustomizedLoadMetricSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPlan.CustomizedLoadMetricSpecificationProperty {
        val builder = CfnScalingPlanCustomizedLoadMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPlanCustomizedScalingMetricSpecificationProperty(
        block: CfnScalingPlanCustomizedScalingMetricSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPlan.CustomizedScalingMetricSpecificationProperty {
        val builder = CfnScalingPlanCustomizedScalingMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPlanMetricDimensionProperty(
        block: CfnScalingPlanMetricDimensionPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPlan.MetricDimensionProperty {
        val builder = CfnScalingPlanMetricDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPlanPredefinedLoadMetricSpecificationProperty(
        block: CfnScalingPlanPredefinedLoadMetricSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPlan.PredefinedLoadMetricSpecificationProperty {
        val builder = CfnScalingPlanPredefinedLoadMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPlanPredefinedScalingMetricSpecificationProperty(
        block: CfnScalingPlanPredefinedScalingMetricSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPlan.PredefinedScalingMetricSpecificationProperty {
        val builder = CfnScalingPlanPredefinedScalingMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPlanProps(block: CfnScalingPlanPropsDsl.() -> Unit = {}): CfnScalingPlanProps {
        val builder = CfnScalingPlanPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPlanScalingInstructionProperty(
        block: CfnScalingPlanScalingInstructionPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPlan.ScalingInstructionProperty {
        val builder = CfnScalingPlanScalingInstructionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPlanTagFilterProperty(
        block: CfnScalingPlanTagFilterPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPlan.TagFilterProperty {
        val builder = CfnScalingPlanTagFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPlanTargetTrackingConfigurationProperty(
        block: CfnScalingPlanTargetTrackingConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPlan.TargetTrackingConfigurationProperty {
        val builder = CfnScalingPlanTargetTrackingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
