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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnWebACLVisibilityConfigPropertyDsl {
    private val cdkBuilder: CfnWebACL.VisibilityConfigProperty.Builder =
        CfnWebACL.VisibilityConfigProperty.builder()

    public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean) {
        cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
    }

    public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable) {
        cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
    }

    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    public fun sampledRequestsEnabled(sampledRequestsEnabled: Boolean) {
        cdkBuilder.sampledRequestsEnabled(sampledRequestsEnabled)
    }

    public fun sampledRequestsEnabled(sampledRequestsEnabled: IResolvable) {
        cdkBuilder.sampledRequestsEnabled(sampledRequestsEnabled)
    }

    public fun build(): CfnWebACL.VisibilityConfigProperty = cdkBuilder.build()
}
