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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR
 * cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * AutoScalingPolicyProperty autoScalingPolicyProperty = AutoScalingPolicyProperty.builder()
 * .constraints(ScalingConstraintsProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .build())
 * .rules(List.of(ScalingRuleProperty.builder()
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
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_AutoScalingPolicy.html)
 */
@CdkDslMarker
public class EmrCreateClusterAutoScalingPolicyPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.AutoScalingPolicyProperty.Builder =
        EmrCreateCluster.AutoScalingPolicyProperty.builder()

    private val _rules: MutableList<EmrCreateCluster.ScalingRuleProperty> = mutableListOf()

    /**
     * @param constraints The upper and lower EC2 instance limits for an automatic scaling policy.
     *   Automatic scaling activity will not cause an instance group to grow above or below these
     *   limits.
     */
    public fun constraints(
        constraints: EmrCreateClusterScalingConstraintsPropertyDsl.() -> Unit = {}
    ) {
        val builder = EmrCreateClusterScalingConstraintsPropertyDsl()
        builder.apply(constraints)
        cdkBuilder.constraints(builder.build())
    }

    /**
     * @param constraints The upper and lower EC2 instance limits for an automatic scaling policy.
     *   Automatic scaling activity will not cause an instance group to grow above or below these
     *   limits.
     */
    public fun constraints(constraints: EmrCreateCluster.ScalingConstraintsProperty) {
        cdkBuilder.constraints(constraints)
    }

    /** @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. */
    public fun rules(rules: EmrCreateClusterScalingRulePropertyDsl.() -> Unit) {
        _rules.add(EmrCreateClusterScalingRulePropertyDsl().apply(rules).build())
    }

    /** @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. */
    public fun rules(rules: Collection<EmrCreateCluster.ScalingRuleProperty>) {
        _rules.addAll(rules)
    }

    public fun build(): EmrCreateCluster.AutoScalingPolicyProperty {
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        return cdkBuilder.build()
    }
}
