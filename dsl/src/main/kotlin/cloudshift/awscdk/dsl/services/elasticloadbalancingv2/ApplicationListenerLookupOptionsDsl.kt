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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import kotlin.Number
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class ApplicationListenerLookupOptionsDsl {
    private val cdkBuilder: ApplicationListenerLookupOptions.Builder =
        ApplicationListenerLookupOptions.builder()

    public fun listenerArn(listenerArn: String) {
        cdkBuilder.listenerArn(listenerArn)
    }

    public fun listenerPort(listenerPort: Number) {
        cdkBuilder.listenerPort(listenerPort)
    }

    public fun listenerProtocol(listenerProtocol: ApplicationProtocol) {
        cdkBuilder.listenerProtocol(listenerProtocol)
    }

    public fun loadBalancerArn(loadBalancerArn: String) {
        cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    public fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
        cdkBuilder.loadBalancerTags(loadBalancerTags)
    }

    public fun build(): ApplicationListenerLookupOptions = cdkBuilder.build()
}
