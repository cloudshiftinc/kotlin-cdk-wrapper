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
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnMonitoringSubscriptionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMonitoringSubscription.Builder =
        CfnMonitoringSubscription.Builder.create(scope, id)

    public fun distributionId(distributionId: String) {
        cdkBuilder.distributionId(distributionId)
    }

    public fun monitoringSubscription(monitoringSubscription: IResolvable) {
        cdkBuilder.monitoringSubscription(monitoringSubscription)
    }

    public fun monitoringSubscription(monitoringSubscription: CfnMonitoringSubscription.MonitoringSubscriptionProperty) {
        cdkBuilder.monitoringSubscription(monitoringSubscription)
    }

    public fun build(): CfnMonitoringSubscription = cdkBuilder.build()
}
