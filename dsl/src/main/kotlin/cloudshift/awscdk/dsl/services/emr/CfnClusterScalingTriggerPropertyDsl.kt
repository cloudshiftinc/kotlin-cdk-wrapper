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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

/**
 * `ScalingTrigger` is a subproperty of the `ScalingRule` property type.
 *
 * `ScalingTrigger` determines the conditions that trigger an automatic scaling activity.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * ScalingTriggerProperty scalingTriggerProperty = ScalingTriggerProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingtrigger.html)
 */
@CdkDslMarker
public class CfnClusterScalingTriggerPropertyDsl {
    private val cdkBuilder: CfnCluster.ScalingTriggerProperty.Builder =
        CfnCluster.ScalingTriggerProperty.builder()

    /**
     * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. When the
     *   defined alarm conditions are met along with other trigger parameters, scaling activity
     *   begins.
     */
    public fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: IResolvable) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition)
    }

    /**
     * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. When the
     *   defined alarm conditions are met along with other trigger parameters, scaling activity
     *   begins.
     */
    public fun cloudWatchAlarmDefinition(
        cloudWatchAlarmDefinition: CfnCluster.CloudWatchAlarmDefinitionProperty
    ) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition)
    }

    public fun build(): CfnCluster.ScalingTriggerProperty = cdkBuilder.build()
}
