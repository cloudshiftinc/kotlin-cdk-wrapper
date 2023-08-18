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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * The type of adjustment the automatic scaling activity makes when triggered, and the periodicity
 * of the adjustment.
 *
 * And an automatic scaling configuration, which describes how the policy adds or removes instances,
 * the cooldown period, and the number of EC2 instances that will be added each time the CloudWatch
 * metric alarm condition is satisfied.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * ScalingActionProperty scalingActionProperty = ScalingActionProperty.builder()
 * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
 * .scalingAdjustment(123)
 * // the properties below are optional
 * .adjustmentType(EmrCreateCluster.getScalingAdjustmentType().CHANGE_IN_CAPACITY)
 * .coolDown(123)
 * .build())
 * // the properties below are optional
 * .market(EmrCreateCluster.getInstanceMarket().ON_DEMAND)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ScalingAction.html)
 */
@CdkDslMarker
public class EmrCreateClusterScalingActionPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.ScalingActionProperty.Builder =
        EmrCreateCluster.ScalingActionProperty.builder()

    /**
     * @param market Not available for instance groups. Instance groups use the market type
     *   specified for the group.
     */
    public fun market(market: EmrCreateCluster.InstanceMarket) {
        cdkBuilder.market(market)
    }

    /**
     * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling activity
     *   makes when triggered, and the periodicity of the adjustment.
     */
    public fun simpleScalingPolicyConfiguration(
        simpleScalingPolicyConfiguration:
            EmrCreateClusterSimpleScalingPolicyConfigurationPropertyDsl.() -> Unit =
            {}
    ) {
        val builder = EmrCreateClusterSimpleScalingPolicyConfigurationPropertyDsl()
        builder.apply(simpleScalingPolicyConfiguration)
        cdkBuilder.simpleScalingPolicyConfiguration(builder.build())
    }

    /**
     * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling activity
     *   makes when triggered, and the periodicity of the adjustment.
     */
    public fun simpleScalingPolicyConfiguration(
        simpleScalingPolicyConfiguration: EmrCreateCluster.SimpleScalingPolicyConfigurationProperty
    ) {
        cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration)
    }

    public fun build(): EmrCreateCluster.ScalingActionProperty = cdkBuilder.build()
}
