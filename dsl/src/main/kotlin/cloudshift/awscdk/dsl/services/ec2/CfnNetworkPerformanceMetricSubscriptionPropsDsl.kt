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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscriptionProps
import kotlin.String

@CdkDslMarker
public class CfnNetworkPerformanceMetricSubscriptionPropsDsl {
    private val cdkBuilder: CfnNetworkPerformanceMetricSubscriptionProps.Builder =
        CfnNetworkPerformanceMetricSubscriptionProps.builder()

    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    public fun metric(metric: String) {
        cdkBuilder.metric(metric)
    }

    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    public fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
    }

    public fun build(): CfnNetworkPerformanceMetricSubscriptionProps = cdkBuilder.build()
}
