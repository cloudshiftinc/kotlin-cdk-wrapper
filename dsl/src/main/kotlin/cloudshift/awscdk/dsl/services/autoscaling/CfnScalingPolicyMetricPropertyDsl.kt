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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

/**
 * Represents a specific metric.
 *
 * `Metric` is a property of the
 * [AWS::AutoScaling::ScalingPolicy MetricStat](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricstat.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * MetricProperty metricProperty = MetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metric.html)
 */
@CdkDslMarker
public class CfnScalingPolicyMetricPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.MetricProperty.Builder =
        CfnScalingPolicy.MetricProperty.builder()

    private val _dimensions: MutableList<Any> = mutableListOf()

    /**
     * @param dimensions The dimensions for the metric. For the list of available dimensions, see
     *   the AWS documentation available from the table in
     *   [AWS services that publish CloudWatch metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
     *   in the *Amazon CloudWatch User Guide* .
     *
     * Conditional: If you published your metric with dimensions, you must specify the same
     * dimensions in your scaling policy.
     */
    public fun dimensions(vararg dimensions: Any) {
        _dimensions.addAll(listOf(*dimensions))
    }

    /**
     * @param dimensions The dimensions for the metric. For the list of available dimensions, see
     *   the AWS documentation available from the table in
     *   [AWS services that publish CloudWatch metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
     *   in the *Amazon CloudWatch User Guide* .
     *
     * Conditional: If you published your metric with dimensions, you must specify the same
     * dimensions in your scaling policy.
     */
    public fun dimensions(dimensions: Collection<Any>) {
        _dimensions.addAll(dimensions)
    }

    /**
     * @param dimensions The dimensions for the metric. For the list of available dimensions, see
     *   the AWS documentation available from the table in
     *   [AWS services that publish CloudWatch metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
     *   in the *Amazon CloudWatch User Guide* .
     *
     * Conditional: If you published your metric with dimensions, you must specify the same
     * dimensions in your scaling policy.
     */
    public fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions)
    }

    /** @param metricName The name of the metric. */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /**
     * @param namespace The namespace of the metric. For more information, see the table in
     *   [AWS services that publish CloudWatch metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
     *   in the *Amazon CloudWatch User Guide* .
     */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun build(): CfnScalingPolicy.MetricProperty {
        if (_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
        return cdkBuilder.build()
    }
}
