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

package io.cloudshiftdev.awscdkdsl.services.emr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

/**
 * `ScalingRule` is a subproperty of the `AutoScalingPolicy` property type.
 *
 * `ScalingRule` defines the scale-in or scale-out rules for scaling activity, including the
 * CloudWatch metric alarm that triggers activity, how EC2 instances are added or removed, and the
 * periodicity of adjustments. The automatic scaling policy for an instance group can comprise one
 * or more automatic scaling rules.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * ScalingRuleProperty scalingRuleProperty = ScalingRuleProperty.builder()
 * .action(ScalingActionProperty.builder()
 * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
 * .scalingAdjustment(123)
 * // the properties below are optional
 * .adjustmentType("adjustmentType")
 * .coolDown(123)
 * .build())
 * // the properties below are optional
 * .market("market")
 * .build())
 * .name("name")
 * .trigger(ScalingTriggerProperty.builder()
 * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .metricName("metricName")
 * .period(123)
 * .threshold(123)
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .evaluationPeriods(123)
 * .namespace("namespace")
 * .statistic("statistic")
 * .unit("unit")
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingrule.html)
 */
@CdkDslMarker
public class CfnClusterScalingRulePropertyDsl {
    private val cdkBuilder: CfnCluster.ScalingRuleProperty.Builder =
        CfnCluster.ScalingRuleProperty.builder()

    /** @param action The conditions that trigger an automatic scaling activity. */
    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    /** @param action The conditions that trigger an automatic scaling activity. */
    public fun action(action: CfnCluster.ScalingActionProperty) {
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
    public fun trigger(trigger: IResolvable) {
        cdkBuilder.trigger(trigger)
    }

    /**
     * @param trigger The CloudWatch alarm definition that determines when automatic scaling
     *   activity is triggered.
     */
    public fun trigger(trigger: CfnCluster.ScalingTriggerProperty) {
        cdkBuilder.trigger(trigger)
    }

    public fun build(): CfnCluster.ScalingRuleProperty = cdkBuilder.build()
}
