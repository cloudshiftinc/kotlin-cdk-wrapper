@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription

@CdkDslMarker
public class CfnMonitoringSubscriptionMonitoringSubscriptionPropertyDsl {
    private val cdkBuilder: CfnMonitoringSubscription.MonitoringSubscriptionProperty.Builder =
        CfnMonitoringSubscription.MonitoringSubscriptionProperty.builder()

    public fun realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig: IResolvable) {
        cdkBuilder.realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig)
    }

    public fun realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig: CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty) {
        cdkBuilder.realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig)
    }

    public fun build(): CfnMonitoringSubscription.MonitoringSubscriptionProperty = cdkBuilder.build()
}
