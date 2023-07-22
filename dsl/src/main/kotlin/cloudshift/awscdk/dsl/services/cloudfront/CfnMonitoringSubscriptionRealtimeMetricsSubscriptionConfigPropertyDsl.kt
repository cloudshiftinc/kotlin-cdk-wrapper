@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription

/**
 * A subscription configuration for additional CloudWatch metrics.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * RealtimeMetricsSubscriptionConfigProperty realtimeMetricsSubscriptionConfigProperty =
 * RealtimeMetricsSubscriptionConfigProperty.builder()
 * .realtimeMetricsSubscriptionStatus("realtimeMetricsSubscriptionStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-monitoringsubscription-realtimemetricssubscriptionconfig.html)
 */
@CdkDslMarker
public class CfnMonitoringSubscriptionRealtimeMetricsSubscriptionConfigPropertyDsl {
  private val cdkBuilder:
      CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty.Builder =
      CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty.builder()

  /**
   * @param realtimeMetricsSubscriptionStatus A flag that indicates whether additional CloudWatch
   * metrics are enabled for a given CloudFront distribution. 
   */
  public fun realtimeMetricsSubscriptionStatus(realtimeMetricsSubscriptionStatus: String) {
    cdkBuilder.realtimeMetricsSubscriptionStatus(realtimeMetricsSubscriptionStatus)
  }

  public fun build(): CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty =
      cdkBuilder.build()
}
