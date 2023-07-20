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
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis
import kotlin.Number

@CdkDslMarker
public class CfnNetworkInsightsAnalysisAnalysisLoadBalancerListenerPropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty.Builder =
        CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty.builder()

    public fun instancePort(instancePort: Number) {
        cdkBuilder.instancePort(instancePort)
    }

    public fun loadBalancerPort(loadBalancerPort: Number) {
        cdkBuilder.loadBalancerPort(loadBalancerPort)
    }

    public fun build(): CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty =
        cdkBuilder.build()
}
