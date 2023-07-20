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

package cloudshift.awscdk.dsl.services.globalaccelerator.endpoints

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint
import kotlin.Number

@CdkDslMarker
public class NetworkLoadBalancerEndpointDsl(
    loadBalancer: INetworkLoadBalancer,
) {
    private val cdkBuilder: NetworkLoadBalancerEndpoint.Builder =
        NetworkLoadBalancerEndpoint.Builder.create(loadBalancer)

    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): NetworkLoadBalancerEndpoint = cdkBuilder.build()
}
