@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@CdkDslMarker
public class CfnAutoScalingGroupMetricsCollectionPropertyDsl {
  private val cdkBuilder: CfnAutoScalingGroup.MetricsCollectionProperty.Builder =
      CfnAutoScalingGroup.MetricsCollectionProperty.builder()

  private val _metrics: MutableList<String> = mutableListOf()

  /**
   * @param granularity The frequency at which Amazon EC2 Auto Scaling sends aggregated data to
   * CloudWatch. 
   * The only valid value is `1Minute` .
   */
  public fun granularity(granularity: String) {
    cdkBuilder.granularity(granularity)
  }

  /**
   * @param metrics Identifies the metrics to enable.
   * You can specify one or more of the following metrics:
   *
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
   * For more information, see [Auto Scaling group
   * metrics](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-cloudwatch-monitoring.html#as-group-metrics)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   */
  public fun metrics(vararg metrics: String) {
    _metrics.addAll(listOf(*metrics))
  }

  /**
   * @param metrics Identifies the metrics to enable.
   * You can specify one or more of the following metrics:
   *
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
   * For more information, see [Auto Scaling group
   * metrics](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-cloudwatch-monitoring.html#as-group-metrics)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   */
  public fun metrics(metrics: Collection<String>) {
    _metrics.addAll(metrics)
  }

  public fun build(): CfnAutoScalingGroup.MetricsCollectionProperty {
    if(_metrics.isNotEmpty()) cdkBuilder.metrics(_metrics)
    return cdkBuilder.build()
  }
}
