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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

/**
 * `MetricsCollection` is a property of the
 * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html)
 * resource that describes the group metrics that an Amazon EC2 Auto Scaling group sends to Amazon
 * CloudWatch. These metrics describe the group rather than any of its instances.
 *
 * For more information, see
 * [Monitor CloudWatch metrics for your Auto Scaling groups and instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-monitoring.html)
 * in the *Amazon EC2 Auto Scaling User Guide* . You can find a sample template snippet in the
 * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#aws-properties-as-group--examples)
 * section of the `AWS::AutoScaling::AutoScalingGroup` resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * MetricsCollectionProperty metricsCollectionProperty = MetricsCollectionProperty.builder()
 * .granularity("granularity")
 * // the properties below are optional
 * .metrics(List.of("metrics"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-metricscollection.html)
 */
@CdkDslMarker
public class CfnAutoScalingGroupMetricsCollectionPropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.MetricsCollectionProperty.Builder =
        CfnAutoScalingGroup.MetricsCollectionProperty.builder()

    private val _metrics: MutableList<String> = mutableListOf()

    /**
     * @param granularity The frequency at which Amazon EC2 Auto Scaling sends aggregated data to
     *   CloudWatch. The only valid value is `1Minute` .
     */
    public fun granularity(granularity: String) {
        cdkBuilder.granularity(granularity)
    }

    /**
     * @param metrics Identifies the metrics to enable. You can specify one or more of the following
     *   metrics:
     * * `GroupMinSize`
     * * `GroupMaxSize`
     * * `GroupDesiredCapacity`
     * * `GroupInServiceInstances`
     * * `GroupPendingInstances`
     * * `GroupStandbyInstances`
     * * `GroupTerminatingInstances`
     * * `GroupTotalInstances`
     * * `GroupInServiceCapacity`
     * * `GroupPendingCapacity`
     * * `GroupStandbyCapacity`
     * * `GroupTerminatingCapacity`
     * * `GroupTotalCapacity`
     * * `WarmPoolDesiredCapacity`
     * * `WarmPoolWarmedCapacity`
     * * `WarmPoolPendingCapacity`
     * * `WarmPoolTerminatingCapacity`
     * * `WarmPoolTotalCapacity`
     * * `GroupAndWarmPoolDesiredCapacity`
     * * `GroupAndWarmPoolTotalCapacity`
     *
     * If you specify `Granularity` and don't specify any metrics, all metrics are enabled.
     *
     * For more information, see
     * [Auto Scaling group metrics](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-cloudwatch-monitoring.html#as-group-metrics)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun metrics(vararg metrics: String) {
        _metrics.addAll(listOf(*metrics))
    }

    /**
     * @param metrics Identifies the metrics to enable. You can specify one or more of the following
     *   metrics:
     * * `GroupMinSize`
     * * `GroupMaxSize`
     * * `GroupDesiredCapacity`
     * * `GroupInServiceInstances`
     * * `GroupPendingInstances`
     * * `GroupStandbyInstances`
     * * `GroupTerminatingInstances`
     * * `GroupTotalInstances`
     * * `GroupInServiceCapacity`
     * * `GroupPendingCapacity`
     * * `GroupStandbyCapacity`
     * * `GroupTerminatingCapacity`
     * * `GroupTotalCapacity`
     * * `WarmPoolDesiredCapacity`
     * * `WarmPoolWarmedCapacity`
     * * `WarmPoolPendingCapacity`
     * * `WarmPoolTerminatingCapacity`
     * * `WarmPoolTotalCapacity`
     * * `GroupAndWarmPoolDesiredCapacity`
     * * `GroupAndWarmPoolTotalCapacity`
     *
     * If you specify `Granularity` and don't specify any metrics, all metrics are enabled.
     *
     * For more information, see
     * [Auto Scaling group metrics](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-cloudwatch-monitoring.html#as-group-metrics)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun metrics(metrics: Collection<String>) {
        _metrics.addAll(metrics)
    }

    public fun build(): CfnAutoScalingGroup.MetricsCollectionProperty {
        if (_metrics.isNotEmpty()) cdkBuilder.metrics(_metrics)
        return cdkBuilder.build()
    }
}
