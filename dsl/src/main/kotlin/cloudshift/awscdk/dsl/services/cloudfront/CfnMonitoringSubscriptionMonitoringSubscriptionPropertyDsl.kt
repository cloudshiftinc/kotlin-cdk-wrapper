@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription

/**
 * A monitoring subscription.
 *
 * This structure contains information about whether additional CloudWatch metrics are enabled for a
 * given CloudFront distribution.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * MonitoringSubscriptionProperty monitoringSubscriptionProperty =
 * MonitoringSubscriptionProperty.builder()
 * .realtimeMetricsSubscriptionConfig(RealtimeMetricsSubscriptionConfigProperty.builder()
 * .realtimeMetricsSubscriptionStatus("realtimeMetricsSubscriptionStatus")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-monitoringsubscription-monitoringsubscription.html)
 */
@CdkDslMarker
public class CfnMonitoringSubscriptionMonitoringSubscriptionPropertyDsl {
  private val cdkBuilder: CfnMonitoringSubscription.MonitoringSubscriptionProperty.Builder =
      CfnMonitoringSubscription.MonitoringSubscriptionProperty.builder()

  /**
   * @param realtimeMetricsSubscriptionConfig A subscription configuration for additional CloudWatch
   * metrics.
   */
  public fun realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig: IResolvable) {
    cdkBuilder.realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig)
  }

  /**
   * @param realtimeMetricsSubscriptionConfig A subscription configuration for additional CloudWatch
   * metrics.
   */
  public
      fun realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig: CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty) {
    cdkBuilder.realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig)
  }

  public fun build(): CfnMonitoringSubscription.MonitoringSubscriptionProperty = cdkBuilder.build()
}
