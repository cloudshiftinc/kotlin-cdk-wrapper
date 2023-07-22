@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscription
import software.constructs.Construct

/**
 * Describes Infrastructure Performance subscriptions.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnNetworkPerformanceMetricSubscription cfnNetworkPerformanceMetricSubscription =
 * CfnNetworkPerformanceMetricSubscription.Builder.create(this,
 * "MyCfnNetworkPerformanceMetricSubscription")
 * .destination("destination")
 * .metric("metric")
 * .source("source")
 * .statistic("statistic")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html)
 */
@CdkDslMarker
public class CfnNetworkPerformanceMetricSubscriptionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNetworkPerformanceMetricSubscription.Builder =
      CfnNetworkPerformanceMetricSubscription.Builder.create(scope, id)

  /**
   * The Region or Availability Zone that's the target for the subscription.
   *
   * For example, `eu-west-1` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-destination)
   * @param destination The Region or Availability Zone that's the target for the subscription. 
   */
  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  /**
   * The metric used for the subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-metric)
   * @param metric The metric used for the subscription. 
   */
  public fun metric(metric: String) {
    cdkBuilder.metric(metric)
  }

  /**
   * The Region or Availability Zone that's the source for the subscription.
   *
   * For example, `us-east-1` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-source)
   * @param source The Region or Availability Zone that's the source for the subscription. 
   */
  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  /**
   * The statistic used for the subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-statistic)
   * @param statistic The statistic used for the subscription. 
   */
  public fun statistic(statistic: String) {
    cdkBuilder.statistic(statistic)
  }

  public fun build(): CfnNetworkPerformanceMetricSubscription = cdkBuilder.build()
}
