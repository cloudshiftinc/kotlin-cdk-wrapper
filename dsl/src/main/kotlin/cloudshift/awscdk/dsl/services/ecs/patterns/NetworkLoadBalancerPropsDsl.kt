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

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps
import software.amazon.awscdk.services.route53.IHostedZone
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class NetworkLoadBalancerPropsDsl {
    private val cdkBuilder: NetworkLoadBalancerProps.Builder = NetworkLoadBalancerProps.builder()

    private val _listeners: MutableList<NetworkListenerProps> = mutableListOf()

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun domainZone(domainZone: IHostedZone) {
        cdkBuilder.domainZone(domainZone)
    }

    public fun listeners(listeners: NetworkListenerPropsDsl.() -> Unit) {
        _listeners.add(NetworkListenerPropsDsl().apply(listeners).build())
    }

    public fun listeners(listeners: Collection<NetworkListenerProps>) {
        _listeners.addAll(listeners)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun publicLoadBalancer(publicLoadBalancer: Boolean) {
        cdkBuilder.publicLoadBalancer(publicLoadBalancer)
    }

    public fun build(): NetworkLoadBalancerProps {
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        return cdkBuilder.build()
    }
}
