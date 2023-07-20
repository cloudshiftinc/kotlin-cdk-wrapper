@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription

@CdkDslMarker
public class CfnMonitoringSubscriptionRealtimeMetricsSubscriptionConfigPropertyDsl {
  private val cdkBuilder:
      CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty.Builder =
      CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty.builder()

  public fun realtimeMetricsSubscriptionStatus(realtimeMetricsSubscriptionStatus: String) {
    cdkBuilder.realtimeMetricsSubscriptionStatus(realtimeMetricsSubscriptionStatus)
  }

  public fun build(): CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty =
      cdkBuilder.build()
}
