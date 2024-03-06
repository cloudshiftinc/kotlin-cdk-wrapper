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

package io.cloudshiftdev.awscdkdsl.services.applicationautoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

/**
 * This structure defines the CloudWatch metric to return, along with the statistic, period, and
 * unit.
 *
 * `TargetTrackingMetricStat` is a property of the
 * [AWS::ApplicationAutoScaling::ScalingPolicy TargetTrackingMetricDataQuery](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery.html)
 * property type.
 *
 * For more information about the CloudWatch terminology below, see
 * [Amazon CloudWatch concepts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html)
 * in the *Amazon CloudWatch User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationautoscaling.*;
 * TargetTrackingMetricStatProperty targetTrackingMetricStatProperty =
 * TargetTrackingMetricStatProperty.builder()
 * .metric(TargetTrackingMetricProperty.builder()
 * .dimensions(List.of(TargetTrackingMetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .metricName("metricName")
 * .namespace("namespace")
 * .build())
 * .stat("stat")
 * .unit("unit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricstat.html)
 */
@CdkDslMarker
public class CfnScalingPolicyTargetTrackingMetricStatPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.TargetTrackingMetricStatProperty.Builder =
        CfnScalingPolicy.TargetTrackingMetricStatProperty.builder()

    /**
     * @param metric The CloudWatch metric to return, including the metric name, namespace, and
     *   dimensions. To get the exact metric name, namespace, and dimensions, inspect the
     *   [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
     *   object that is returned by a call to
     *   [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
     *   .
     */
    public fun metric(metric: IResolvable) {
        cdkBuilder.metric(metric)
    }

    /**
     * @param metric The CloudWatch metric to return, including the metric name, namespace, and
     *   dimensions. To get the exact metric name, namespace, and dimensions, inspect the
     *   [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
     *   object that is returned by a call to
     *   [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
     *   .
     */
    public fun metric(metric: CfnScalingPolicy.TargetTrackingMetricProperty) {
        cdkBuilder.metric(metric)
    }

    /**
     * @param stat The statistic to return. It can include any CloudWatch statistic or extended
     *   statistic. For a list of valid values, see the table in
     *   [Statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic)
     *   in the *Amazon CloudWatch User Guide* .
     *
     * The most commonly used metric for scaling is `Average` .
     */
    public fun stat(stat: String) {
        cdkBuilder.stat(stat)
    }

    /**
     * @param unit The unit to use for the returned data points. For a complete list of the units
     *   that CloudWatch supports, see the
     *   [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
     *   data type in the *Amazon CloudWatch API Reference* .
     */
    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun build(): CfnScalingPolicy.TargetTrackingMetricStatProperty = cdkBuilder.build()
}
