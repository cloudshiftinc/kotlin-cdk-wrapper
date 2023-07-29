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

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAlarm

/**
 * This structure defines the metric to be returned, along with the statistics, period, and units.
 *
 * `MetricStat` is a property of the
 * [MetricDataQuery](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * MetricStatProperty metricStatProperty = MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .metricName("metricName")
 * .namespace("namespace")
 * .build())
 * .period(123)
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricstat.html)
 */
@CdkDslMarker
public class CfnAlarmMetricStatPropertyDsl {
    private val cdkBuilder: CfnAlarm.MetricStatProperty.Builder =
        CfnAlarm.MetricStatProperty.builder()

    /** @param metric The metric to return, including the metric name, namespace, and dimensions. */
    public fun metric(metric: IResolvable) {
        cdkBuilder.metric(metric)
    }

    /** @param metric The metric to return, including the metric name, namespace, and dimensions. */
    public fun metric(metric: CfnAlarm.MetricProperty) {
        cdkBuilder.metric(metric)
    }

    /**
     * @param period The granularity, in seconds, of the returned data points. For metrics with
     *   regular resolution, a period can be as short as one minute (60 seconds) and must be a
     *   multiple of 60. For high-resolution metrics that are collected at intervals of less than
     *   one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60. High-resolution
     *   metrics are those metrics stored by a `PutMetricData` call that includes a
     *   `StorageResolution` of 1 second.
     *
     * If the `StartTime` parameter specifies a time stamp that is greater than 3 hours ago, you
     * must specify the period as follows or no data points in that time range is returned:
     * * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     * * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     * * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     */
    public fun period(period: Number) {
        cdkBuilder.period(period)
    }

    /**
     * @param stat The statistic to return. It can include any CloudWatch statistic or extended
     *   statistic. For a list of valid values, see the table in
     *   [Statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic)
     *   in the *Amazon CloudWatch User Guide* .
     */
    public fun stat(stat: String) {
        cdkBuilder.stat(stat)
    }

    /**
     * @param unit The unit to use for the returned data points. Valid values are: Seconds,
     *   Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits,
     *   Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     *   Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second,
     *   Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, or None.
     */
    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun build(): CfnAlarm.MetricStatProperty = cdkBuilder.build()
}
