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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnNetworkInsightsAnalysisAnalysisLoadBalancerTargetPropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty.Builder =
        CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty.builder()

    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun instance(instance: IResolvable) {
        cdkBuilder.instance(instance)
    }

    public fun instance(instance: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.instance(instance)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty =
        cdkBuilder.build()
}
