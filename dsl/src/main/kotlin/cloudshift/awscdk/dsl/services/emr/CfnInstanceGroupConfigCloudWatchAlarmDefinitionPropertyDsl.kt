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
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

/**
 * `CloudWatchAlarmDefinition` is a subproperty of the `ScalingTrigger` property, which determines
 * when to trigger an automatic scaling activity.
 *
 * Scaling activity begins when you satisfy the defined alarm conditions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * CloudWatchAlarmDefinitionProperty cloudWatchAlarmDefinitionProperty =
 * CloudWatchAlarmDefinitionProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html)
 */
@CdkDslMarker
public class CfnInstanceGroupConfigCloudWatchAlarmDefinitionPropertyDsl {
    private val cdkBuilder: CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder =
        CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.builder()

    private val _dimensions: MutableList<Any> = mutableListOf()

    /**
     * @param comparisonOperator Determines how the metric specified by `MetricName` is compared to
     *   the value specified by `Threshold` .
     */
    public fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
    }

    /** @param dimensions A CloudWatch metric dimension. */
    public fun dimensions(vararg dimensions: Any) {
        _dimensions.addAll(listOf(*dimensions))
    }

    /** @param dimensions A CloudWatch metric dimension. */
    public fun dimensions(dimensions: Collection<Any>) {
        _dimensions.addAll(dimensions)
    }

    /** @param dimensions A CloudWatch metric dimension. */
    public fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions)
    }

    /**
     * @param evaluationPeriods The number of periods, in five-minute increments, during which the
     *   alarm condition must exist before the alarm triggers automatic scaling activity. The
     *   default value is `1` .
     */
    public fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    /**
     * @param metricName The name of the CloudWatch metric that is watched to determine an alarm
     *   condition.
     */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /**
     * @param namespace The namespace for the CloudWatch metric. The default is
     *   `AWS/ElasticMapReduce` .
     */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    /**
     * @param period The period, in seconds, over which the statistic is applied. CloudWatch metrics
     *   for Amazon EMR are emitted every five minutes (300 seconds), so if you specify a CloudWatch
     *   metric, specify `300` .
     */
    public fun period(period: Number) {
        cdkBuilder.period(period)
    }

    /**
     * @param statistic The statistic to apply to the metric associated with the alarm. The default
     *   is `AVERAGE` .
     */
    public fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
    }

    /** @param threshold The value against which the specified statistic is compared. */
    public fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
    }

    /**
     * @param unit The unit of measure associated with the CloudWatch metric being watched. The
     *   value specified for `Unit` must correspond to the units specified in the CloudWatch metric.
     */
    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun build(): CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty {
        if (_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
        return cdkBuilder.build()
    }
}
