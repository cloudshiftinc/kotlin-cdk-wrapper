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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

/**
 * `PredictiveScalingConfiguration` is a property of the
 * [AWS::AutoScaling::ScalingPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html)
 * resource that specifies a predictive scaling policy for Amazon EC2 Auto Scaling.
 *
 * For more information, see
 * [Predictive scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-predictive-scaling.html)
 * in the *Amazon EC2 Auto Scaling User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * PredictiveScalingConfigurationProperty predictiveScalingConfigurationProperty =
 * PredictiveScalingConfigurationProperty.builder()
 * .metricSpecifications(List.of(PredictiveScalingMetricSpecificationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .customizedCapacityMetricSpecification(PredictiveScalingCustomizedCapacityMetricProperty.builder()
 * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .expression("expression")
 * .label("label")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .build())
 * .customizedLoadMetricSpecification(PredictiveScalingCustomizedLoadMetricProperty.builder()
 * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .expression("expression")
 * .label("label")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .build())
 * .customizedScalingMetricSpecification(PredictiveScalingCustomizedScalingMetricProperty.builder()
 * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .expression("expression")
 * .label("label")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .build())
 * .predefinedLoadMetricSpecification(PredictiveScalingPredefinedLoadMetricProperty.builder()
 * .predefinedMetricType("predefinedMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .predefinedMetricPairSpecification(PredictiveScalingPredefinedMetricPairProperty.builder()
 * .predefinedMetricType("predefinedMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .predefinedScalingMetricSpecification(PredictiveScalingPredefinedScalingMetricProperty.builder()
 * .predefinedMetricType("predefinedMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .build()))
 * // the properties below are optional
 * .maxCapacityBreachBehavior("maxCapacityBreachBehavior")
 * .maxCapacityBuffer(123)
 * .mode("mode")
 * .schedulingBufferTime(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingconfiguration.html)
 */
@CdkDslMarker
public class CfnScalingPolicyPredictiveScalingConfigurationPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.PredictiveScalingConfigurationProperty.Builder =
        CfnScalingPolicy.PredictiveScalingConfigurationProperty.builder()

    private val _metricSpecifications: MutableList<Any> = mutableListOf()

    /**
     * @param maxCapacityBreachBehavior Defines the behavior that should be applied if the forecast
     *   capacity approaches or exceeds the maximum capacity of the Auto Scaling group. Defaults to
     *   `HonorMaxCapacity` if not specified.
     *
     * The following are possible values:
     * * `HonorMaxCapacity` - Amazon EC2 Auto Scaling cannot scale out capacity higher than the
     *   maximum capacity. The maximum capacity is enforced as a hard limit.
     * * `IncreaseMaxCapacity` - Amazon EC2 Auto Scaling can scale out capacity higher than the
     *   maximum capacity when the forecast capacity is close to or exceeds the maximum capacity.
     *   The upper limit is determined by the forecasted capacity and the value for
     *   `MaxCapacityBuffer` .
     */
    public fun maxCapacityBreachBehavior(maxCapacityBreachBehavior: String) {
        cdkBuilder.maxCapacityBreachBehavior(maxCapacityBreachBehavior)
    }

    /**
     * @param maxCapacityBuffer The size of the capacity buffer to use when the forecast capacity is
     *   close to or exceeds the maximum capacity. The value is specified as a percentage relative
     *   to the forecast capacity. For example, if the buffer is 10, this means a 10 percent buffer,
     *   such that if the forecast capacity is 50, and the maximum capacity is 40, then the
     *   effective maximum capacity is 55.
     *
     * If set to 0, Amazon EC2 Auto Scaling may scale capacity higher than the maximum capacity to
     * equal but not exceed forecast capacity.
     *
     * Required if the `MaxCapacityBreachBehavior` property is set to `IncreaseMaxCapacity` , and
     * cannot be used otherwise.
     */
    public fun maxCapacityBuffer(maxCapacityBuffer: Number) {
        cdkBuilder.maxCapacityBuffer(maxCapacityBuffer)
    }

    /**
     * @param metricSpecifications This structure includes the metrics and target utilization to use
     *   for predictive scaling. This is an array, but we currently only support a single metric
     *   specification. That is, you can specify a target value and a single metric pair, or a
     *   target value and one scaling metric and one load metric.
     */
    public fun metricSpecifications(vararg metricSpecifications: Any) {
        _metricSpecifications.addAll(listOf(*metricSpecifications))
    }

    /**
     * @param metricSpecifications This structure includes the metrics and target utilization to use
     *   for predictive scaling. This is an array, but we currently only support a single metric
     *   specification. That is, you can specify a target value and a single metric pair, or a
     *   target value and one scaling metric and one load metric.
     */
    public fun metricSpecifications(metricSpecifications: Collection<Any>) {
        _metricSpecifications.addAll(metricSpecifications)
    }

    /**
     * @param metricSpecifications This structure includes the metrics and target utilization to use
     *   for predictive scaling. This is an array, but we currently only support a single metric
     *   specification. That is, you can specify a target value and a single metric pair, or a
     *   target value and one scaling metric and one load metric.
     */
    public fun metricSpecifications(metricSpecifications: IResolvable) {
        cdkBuilder.metricSpecifications(metricSpecifications)
    }

    /** @param mode The predictive scaling mode. Defaults to `ForecastOnly` if not specified. */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    /**
     * @param schedulingBufferTime The amount of time, in seconds, by which the instance launch time
     *   can be advanced. For example, the forecast says to add capacity at 10:00 AM, and you choose
     *   to pre-launch instances by 5 minutes. In that case, the instances will be launched at 9:55
     *   AM. The intention is to give resources time to be provisioned. It can take a few minutes to
     *   launch an EC2 instance. The actual amount of time required depends on several factors, such
     *   as the size of the instance and whether there are startup scripts to complete.
     *
     * The value must be less than the forecast interval duration of 3600 seconds (60 minutes).
     * Defaults to 300 seconds if not specified.
     */
    public fun schedulingBufferTime(schedulingBufferTime: Number) {
        cdkBuilder.schedulingBufferTime(schedulingBufferTime)
    }

    public fun build(): CfnScalingPolicy.PredictiveScalingConfigurationProperty {
        if (_metricSpecifications.isNotEmpty())
            cdkBuilder.metricSpecifications(_metricSpecifications)
        return cdkBuilder.build()
    }
}
