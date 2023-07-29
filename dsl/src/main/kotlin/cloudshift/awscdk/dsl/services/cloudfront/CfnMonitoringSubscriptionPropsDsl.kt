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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscriptionProps

/**
 * Properties for defining a `CfnMonitoringSubscription`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnMonitoringSubscriptionProps cfnMonitoringSubscriptionProps =
 * CfnMonitoringSubscriptionProps.builder()
 * .distributionId("distributionId")
 * .monitoringSubscription(MonitoringSubscriptionProperty.builder()
 * .realtimeMetricsSubscriptionConfig(RealtimeMetricsSubscriptionConfigProperty.builder()
 * .realtimeMetricsSubscriptionStatus("realtimeMetricsSubscriptionStatus")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html)
 */
@CdkDslMarker
public class CfnMonitoringSubscriptionPropsDsl {
    private val cdkBuilder: CfnMonitoringSubscriptionProps.Builder =
        CfnMonitoringSubscriptionProps.builder()

    /** @param distributionId The ID of the distribution that you are enabling metrics for. */
    public fun distributionId(distributionId: String) {
        cdkBuilder.distributionId(distributionId)
    }

    /**
     * @param monitoringSubscription A subscription configuration for additional CloudWatch metrics.
     */
    public fun monitoringSubscription(monitoringSubscription: IResolvable) {
        cdkBuilder.monitoringSubscription(monitoringSubscription)
    }

    /**
     * @param monitoringSubscription A subscription configuration for additional CloudWatch metrics.
     */
    public fun monitoringSubscription(
        monitoringSubscription: CfnMonitoringSubscription.MonitoringSubscriptionProperty
    ) {
        cdkBuilder.monitoringSubscription(monitoringSubscription)
    }

    public fun build(): CfnMonitoringSubscriptionProps = cdkBuilder.build()
}
