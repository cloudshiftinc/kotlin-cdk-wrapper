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
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions
import kotlin.Number
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class BaseListenerLookupOptionsDsl {
    private val cdkBuilder: BaseListenerLookupOptions.Builder = BaseListenerLookupOptions.builder()

    public fun listenerPort(listenerPort: Number) {
        cdkBuilder.listenerPort(listenerPort)
    }

    public fun loadBalancerArn(loadBalancerArn: String) {
        cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    public fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
        cdkBuilder.loadBalancerTags(loadBalancerTags)
    }

    public fun build(): BaseListenerLookupOptions = cdkBuilder.build()
}
