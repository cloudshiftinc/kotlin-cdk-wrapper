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
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * A scale-in or scale-out rule that defines scaling activity, including the CloudWatch metric alarm
 * that triggers activity, how EC2 instances are added or removed, and the periodicity of
 * adjustments.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * ScalingRuleProperty scalingRuleProperty = ScalingRuleProperty.builder()
 * .action(ScalingActionProperty.builder()
 * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
 * .scalingAdjustment(123)
 * // the properties below are optional
 * .adjustmentType(EmrCreateCluster.getScalingAdjustmentType().CHANGE_IN_CAPACITY)
 * .coolDown(123)
 * .build())
 * // the properties below are optional
 * .market(EmrCreateCluster.getInstanceMarket().ON_DEMAND)
 * .build())
 * .name("name")
 * .trigger(ScalingTriggerProperty.builder()
 * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
 * .comparisonOperator(EmrCreateCluster.getCloudWatchAlarmComparisonOperator().GREATER_THAN_OR_EQUAL)
 * .metricName("metricName")
 * .period(Duration.minutes(30))
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .evaluationPeriods(123)
 * .namespace("namespace")
 * .statistic(EmrCreateCluster.getCloudWatchAlarmStatistic().SAMPLE_COUNT)
 * .threshold(123)
 * .unit(EmrCreateCluster.getCloudWatchAlarmUnit().NONE)
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ScalingRule.html)
 */
@CdkDslMarker
public class EmrCreateClusterScalingRulePropertyDsl {
    private val cdkBuilder: EmrCreateCluster.ScalingRuleProperty.Builder =
        EmrCreateCluster.ScalingRuleProperty.builder()

    /** @param action The conditions that trigger an automatic scaling activity. */
    public fun action(action: EmrCreateClusterScalingActionPropertyDsl.() -> Unit = {}) {
        val builder = EmrCreateClusterScalingActionPropertyDsl()
        builder.apply(action)
        cdkBuilder.action(builder.build())
    }

    /** @param action The conditions that trigger an automatic scaling activity. */
    public fun action(action: EmrCreateCluster.ScalingActionProperty) {
        cdkBuilder.action(action)
    }

    /** @param description A friendly, more verbose description of the automatic scaling rule. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param name The name used to identify an automatic scaling rule. Rule names must be unique
     *   within a scaling policy.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param trigger The CloudWatch alarm definition that determines when automatic scaling
     *   activity is triggered.
     */
    public fun trigger(trigger: EmrCreateClusterScalingTriggerPropertyDsl.() -> Unit = {}) {
        val builder = EmrCreateClusterScalingTriggerPropertyDsl()
        builder.apply(trigger)
        cdkBuilder.trigger(builder.build())
    }

    /**
     * @param trigger The CloudWatch alarm definition that determines when automatic scaling
     *   activity is triggered.
     */
    public fun trigger(trigger: EmrCreateCluster.ScalingTriggerProperty) {
        cdkBuilder.trigger(trigger)
    }

    public fun build(): EmrCreateCluster.ScalingRuleProperty = cdkBuilder.build()
}
