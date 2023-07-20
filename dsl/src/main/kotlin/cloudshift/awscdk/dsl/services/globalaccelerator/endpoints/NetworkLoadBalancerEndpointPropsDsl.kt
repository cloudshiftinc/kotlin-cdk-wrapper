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
import software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps
import kotlin.Number

@CdkDslMarker
public class NetworkLoadBalancerEndpointPropsDsl {
    private val cdkBuilder: NetworkLoadBalancerEndpointProps.Builder =
        NetworkLoadBalancerEndpointProps.builder()

    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): NetworkLoadBalancerEndpointProps = cdkBuilder.build()
}
